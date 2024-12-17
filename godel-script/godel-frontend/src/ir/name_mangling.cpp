#include "godel-frontend/src/ir/name_mangling.h"

#include <iostream>
#include <vector>
#include <unordered_set>
#include <unordered_map>
#include <cassert>

namespace godel {

bool starts_with(const std::string& str, const std::string& prefix) {
    return str.compare(0, prefix.size(), prefix) == 0;
}

std::string field_mangle(const std::string& name) {
    // by field name mangling, we try to avoid variable name conflictions
    // for example: here's a schema `schema test {a: int}`
    //
    // impl test {
    //     pub fn __all__() -> *test {
    //         for(a in int::range(0, 10)) { yield test{a: a}; }
    //     }
    // }
    //
    // if we do not do the name mangling, then will generate this:
    //
    // schema_test(result, [-1, -1], a) :- (
    //     a = a,
    //     ^ this is the field of test: `test.a`
    //         ^ this is the variable `a`
    //     result = [a],
    //     a = range(0, 10)
    // ).
    //
    // and this will cause `ungrounded error` or `empty result`.
    // but if we do the name mangling, then it will be like this:
    //
    // schema_test(result, [-1, -1], fld?a) :- (
    //     fld?a = a,
    //     ^^^^^^^^^^ this is the field of test: `test.a`
    //             ^ this is the variable `a`
    //     result = [fld?a],
    //     a = range(0, 10)
    // ).
    //
    // souffle identifier can use `?`, so we use it here.
    // souffle identifier ll: [\?a-zA-Z]|[_\?a-zA-Z][_\?a-zA-Z0-9]+
    return "fld?" + name;
}

std::string mangle(const std::string& name) {
    static std::unordered_map<std::string, std::string> cache = {};
    if (cache.count(name)) {
        return cache.at(name);
    }

    std::vector<std::string> vec = {};
    size_t last = 0;
    size_t pos = name.find("::", 0);
    while(pos!=std::string::npos) {
        if (pos>last) {
            vec.push_back(name.substr(last, pos-last));
        }
        last = pos + 2;
        pos = name.find("::", last);
    }
    if (last!=name.length()) {
        vec.push_back(name.substr(last));
    }

    auto tmp = std::string("");
    for(const auto& i : vec) {
        tmp += std::to_string(i.length()) + i;
    }
    cache.insert({name, tmp});
    return tmp;
}

std::string type_mangle(const std::string& name) {
    static std::unordered_map<std::string, std::string> cache = {
        {"number", "number"},
        {"int", "int"},
        {"string", "string"},
        {"symbol", "symbol"},
        {"float", "float"},
        {"bool", "bool"},
        {"DBIndex", "DBIndex"}
    };
    if (cache.count(name)) {
        return cache.at(name);
    }

    const auto res = "T_" + mangle(name);
    cache.insert({name, res});
    return res;
}

std::string rule_mangle(const std::string& name) {
    static std::unordered_map<std::string, std::string> cache = {
        {"all_data_DBIndex", "all_data_DBIndex"}
    };
    if (cache.count(name)) {
        return cache.at(name);
    }

    auto temp = std::string("");
    auto prefix = std::string("");
    if (starts_with(name, "rule_")) {
        // rule_xxx -> R_xxx
        temp = name.substr(5);
        prefix = "R_";
    } else if (starts_with(name, "schema_")) {
        // schema_xxx -> S_xxx
        temp = name.substr(7);
        prefix = "S_";
    } else if (starts_with(name, "input_")) {
        // input_xxx -> I_xxx
        temp = name.substr(6);
        prefix = "I_";
    } else if (starts_with(name, "get_field_")) {
        // get_field_xxx -> GF_xxx
        temp = name.substr(10);
        prefix = "GF_";
    } else if (starts_with(name, "get_table_")) {
        // get_table_xxx -> GT_xxx
        temp = name.substr(10);
        prefix = "GT_";
    } else if (starts_with(name, "typecheck_")) {
        // typecheck_xxx -> TC_xxx
        temp = name.substr(11);
        prefix = "TC_";
    } else {
        // std::cerr << "unknown rule name: " << name << std::endl;
        assert(false && "unknown rule name");
    }

    const auto res = prefix + mangle(temp);
    cache.insert({name, res});
    return res;
}

}