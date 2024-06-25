#include "godel-frontend/src/symbol.h"
#include "godel-frontend/src/package/package.h"

#include <cstring>
#include <sstream>
#include <queue>
#include <iomanip>

namespace godel {

function function::build_native(const std::string& name,
                                std::initializer_list<std::pair<std::string, symbol>> parameters,
                                symbol return_type,
                                bool is_global) {

    function native_function;
    native_function.name = name;
    native_function.return_type = return_type;
    native_function.location = span::null();
    native_function.builtin = true;
    native_function.implemented = false;
    native_function.public_access_authority = true;
    native_function.is_global = is_global;

    for(auto& i : parameters) {
        native_function.parameter_list.insert(i);
        native_function.ordered_parameter_list.push_back(i.first);
    }
    return native_function;
}

std::string function::to_json() const {
    std::string res = "{\"name\":\"" + name;
    res += has_generic? "<T>\",":"\",";
    res += "\"location\":" + location.to_json() + ",";
    res += "\"return\":" + return_type.to_json() + ",";
    res += "\"is_public\":";
    res += public_access_authority? "\"true\",":"\"false\",";
    res += "\"is_inherited\":";
    res += inherit? "\"true\",":"\"false\",";
    res += "\"parameter\":[";
    for(const auto& i : ordered_parameter_list) {
        res += "{\"name\":\"" + i + "\",\"type\":";
        res += parameter_list.at(i).to_json() + "},";
    }
    if (res.back()==',') {
        res.pop_back();
    }
    res += "]}";
    return res;
}

std::string basic::to_json() const {
    std::string res = "{\"name\":\"" + name + "\",";
    res += "\"methods\":[";
    for(const auto& i : natives) {
        res += i.second.to_json() + ",";
    }
    if (res.back()==',') {
        res.pop_back();
    }
    res += "]}";
    return res;
}

std::string basic::fuzzy_search(const std::string& id) const {
    size_t min_levenshtein_distance = SIZE_MAX;
    std::string fuzzy_search_name = "";
    for(const auto& i : natives) {
        size_t tmp = util::levenshtein_distance(id, i.first);
        if (tmp < min_levenshtein_distance) {
            fuzzy_search_name = i.first;
            min_levenshtein_distance = tmp;
        }
    }
    return fuzzy_search_name;
}

std::string enumerate::to_json() const {
    std::string res = "{\"name\":\"" + name + "\",";
    res += "\"location\":" + location.to_json() + ",";
    res += "\"member\":[";
    std::vector<std::string> ordered_enumerate_member;
    ordered_enumerate_member.resize(pairs.size());
    for(const auto& i : pairs) {
        ordered_enumerate_member[i.second] = i.first;
    }
    for(const auto& i : ordered_enumerate_member) {
        res += "\"" + i + "\",";
    }
    if (res.back()==',') {
        res.pop_back();
    }
    res += "]}";
    return res;
}

std::string enumerate::fuzzy_search(const std::string& id) const {
    size_t min_levenshtein_distance = SIZE_MAX;
    std::string fuzzy_search_name = "";
    for(const auto& i : pairs) {
        size_t tmp = util::levenshtein_distance(id, i.first);
        if (tmp < min_levenshtein_distance) {
            fuzzy_search_name = i.first;
            min_levenshtein_distance = tmp;
        }
    }
    return fuzzy_search_name;
}

std::string schema::to_json() const {
    std::string res = "{\"name\":\"" + name + "\",";
    res += "\"location\":" + location.to_json() + ",";
    res += "\"parent\": \"" + std::string(parent? parent->name:"") + "\",";
    res += "\"fields\":[";
    for(const auto& i : ordered_fields) {
        const auto& type = fields.at(i);
        res += "{\"name\":\"" + i + "\",\"type\":" + type.to_json();
        res += ",\"primary\":";
        res += type.primary? "\"true\"":"\"false\"";
        res += ",\"is_inherited\":";
        if (parent) {
            res += parent->fields.count(i)? "\"true\"":"\"false\"";
        } else {
            res += "\"false\"";
        }
        res += "},";
    }
    if (res.back()==',') {
        res.pop_back();
    }
    res += "],\"methods\":[";
    for(const auto& i : methods) {
        res += i.second.to_json() + ",";
    }
    for(const auto& i : natives) {
        res += i.second.to_json() + ",";
    }
    if (res.back()==',') {
        res.pop_back();
    }
    res += "]}";
    return res;
}

std::string schema::fuzzy_search(const std::string& id) const {
    size_t min_levenshtein_distance = SIZE_MAX;
    std::string fuzzy_search_name = "";
    for(const auto& i : fields) {
        size_t tmp = util::levenshtein_distance(id, i.first);
        if (tmp < min_levenshtein_distance) {
            fuzzy_search_name = i.first;
            min_levenshtein_distance = tmp;
        }
    }
    for(const auto& i : methods) {
        size_t tmp = util::levenshtein_distance(id, i.first);
        if (tmp < min_levenshtein_distance) {
            fuzzy_search_name = i.first;
            min_levenshtein_distance = tmp;
        }
    }
    for(const auto& i : natives) {
        size_t tmp = util::levenshtein_distance(id, i.first);
        if (tmp < min_levenshtein_distance) {
            fuzzy_search_name = i.first;
            min_levenshtein_distance = tmp;
        }
    }
    return fuzzy_search_name;
}

std::string database::to_json() const {
    std::string res = "{\"name\":\"" + name + "\",";
    res += "\"location\":" + location.to_json() + ",";
    res += "\"table\":[";
    for(const auto& i : tables) {
        res += "{\"name\":\"" + i.first + "\",";
        res += "\"type\":" + i.second.to_json() + "},";
    }
    if (res.back()==',') {
        res.pop_back();
    }
    res += "],\"methods\":[";
    res += load.to_json() + "]}";
    return res;
}

std::string database::fuzzy_search(const std::string& id) const {
    size_t min_levenshtein_distance = SIZE_MAX;
    std::string fuzzy_search_name = "";
    for(const auto& table : tables) {
        size_t tmp = util::levenshtein_distance(id, table.first);
        if (tmp < min_levenshtein_distance) {
            fuzzy_search_name = table.first;
            min_levenshtein_distance = tmp;
        }
    }
    return fuzzy_search_name;
}

symbol_kind domain::get_kind_by_short_name(const std::string& name) const {
    if (type_mapper.count(name)) {
        return type_mapper.at(name);
    }
    return symbol_kind::null;
}

std::string domain::fuzzy_search(const std::string& id) const {
    size_t min_levenshtein_distance = SIZE_MAX;
    std::string fuzzy_search_name = "";
    for(const auto& i : type_mapper) {
        size_t tmp = util::levenshtein_distance(id, i.first);
        if (tmp < min_levenshtein_distance) {
            fuzzy_search_name = i.first;
            min_levenshtein_distance = tmp;
        }
    }
    return fuzzy_search_name;
}

void global_symbol_table::regist(
    const std::string& file,
    const std::string& full_type_name,
    symbol_kind type) {
    // full type name example: coref::java::Class
    // check if this type name exists
    if (symbol_mapper.count(full_type_name)) {
        return;
    }

    // generate unique id for each new symbol
    size_t unique_index = symbol_mapper.size();
    if (unique_index==global_symbol_table::npos) {
        return; // no more symbols can be registered
    }

    const auto pos = full_type_name.find_last_of(":");
    const auto short_name = (pos==std::string::npos?
        full_type_name:
        full_type_name.substr(pos+1)
    );

    // insert symbol and unique id into the mapper for query: string -> uid
    symbol_mapper.insert({full_type_name, unique_index});

    // add to the symbol table for query: uid -> symbol info
    global_symbols.push_back({short_name, full_type_name, file, type});
}

bool global_symbol_table::create_new_domain(const std::string& file) {
    if (!name_space.count(file)) {
        name_space.insert({file, {}});
        return true;
    }
    return false;
}

uint64_t global_symbol_table::get_index(const std::string& full_path_name) const {
    if (symbol_mapper.count(full_path_name)) {
        return symbol_mapper.at(full_path_name);
    }
    return global_symbol_table::npos;
}

bool global_symbol_table::exist(const std::string& full_path_name) const {
    return symbol_mapper.count(full_path_name);
}

const span& global_symbol_table::get_location(uint64_t index) const {
    if (index >= global_symbols.size()) {
        return span::null();
    }

    const auto& file = global_symbols[index].located_file;
    // some types do not have location file, like package, basics, native, etc.
    if (!file.length()) {
        return span::null();
    }
    const auto& short_name = get_short_name(index);
    if (basics.count(short_name) || native.count(short_name)) {
        return span::null();
    }
    // search namespace
    const auto& this_domain = name_space.at(file);
    switch(global_symbols[index].kind) {
        case symbol_kind::database:
            return this_domain.databases.at(short_name).location;
        case symbol_kind::enumerate:
            return this_domain.enums.at(short_name).location;
        case symbol_kind::function:
            return this_domain.functions.at(short_name).location;
        case symbol_kind::schema:
            return this_domain.schemas.at(short_name).location;
        case symbol_kind::query:
            return this_domain.queries.at(short_name).location;
        default: return span::null();
    }
    // unreachable
    return span::null();
}

enumerate& global_symbol_table::get_enum(uint64_t index) {
    const auto& file = get_file(index);
    check_file_not_found(file);
    const auto& short_name = get_short_name(index);
    if (!name_space.at(file).enums.count(short_name)) {
        report_symbol_not_found(short_name, file);
    }
    return name_space.at(file).enums.at(short_name);
}

database& global_symbol_table::get_database(uint64_t index) {
    const auto& file = get_file(index);
    check_file_not_found(file);
    const auto& short_name = get_short_name(index);
    if (!name_space.at(file).databases.count(short_name)) {
        report_symbol_not_found(short_name, file);
    }
    return name_space.at(file).databases.at(short_name);
}

schema& global_symbol_table::get_schema(uint64_t index) {
    const auto& file = get_file(index);
    check_file_not_found(file);
    const auto& short_name = get_short_name(index);
    if (!name_space.at(file).schemas.count(short_name)) {
        report_symbol_not_found(short_name, file);
    }
    return name_space.at(file).schemas.at(short_name);
}

function& global_symbol_table::get_func(uint64_t index) {
    const auto& file = get_file(index);
    check_file_not_found(file);
    const auto& short_name = get_short_name(index);
    if (!name_space.at(file).functions.count(short_name)) {
        report_symbol_not_found(short_name, file);
    }
    return name_space.at(file).functions.at(short_name);
}

query& global_symbol_table::get_query(uint64_t index) {
    const auto& file = get_file(index);
    check_file_not_found(file);
    const auto& short_name = get_short_name(index);
    if (!name_space.at(file).queries.count(short_name)) {
        report_symbol_not_found(short_name, file);
    }
    return name_space.at(file).queries.at(short_name);
}

domain& global_symbol_table::get_domain(const std::string& file) {
    if (!name_space.count(file)) {
        std::cerr << "Crashed: cannot find namespace of file <" << file << ">.\n";
        std::exit(-1);
    }
    return name_space.at(file);
}

const enumerate& global_symbol_table::get_enum(uint64_t index) const {
    const auto& file = get_file(index);
    check_file_not_found(file);
    const auto& short_name = get_short_name(index);
    if (!name_space.at(file).enums.count(short_name)) {
        report_symbol_not_found(short_name, file);
    }
    return name_space.at(file).enums.at(short_name);
}

const database& global_symbol_table::get_database(uint64_t index) const {
    const auto& file = get_file(index);
    check_file_not_found(file);
    const auto& short_name = get_short_name(index);
    if (!name_space.at(file).databases.count(short_name)) {
        report_symbol_not_found(short_name, file);
    }
    return name_space.at(file).databases.at(short_name);
}

const schema& global_symbol_table::get_schema(uint64_t index) const {
    const auto& file = get_file(index);
    check_file_not_found(file);
    const auto& short_name = get_short_name(index);
    if (!name_space.at(file).schemas.count(short_name)) {
        report_symbol_not_found(short_name, file);
    }
    return name_space.at(file).schemas.at(short_name);
}

const function& global_symbol_table::get_func(uint64_t index) const {
    const auto& file = get_file(index);
    check_file_not_found(file);
    const auto& short_name = get_short_name(index);
    if (!name_space.at(file).functions.count(short_name)) {
        report_symbol_not_found(short_name, file);
    }
    return name_space.at(file).functions.at(short_name);
}

const query& global_symbol_table::get_query(uint64_t index) const {
    const auto& file = get_file(index);
    check_file_not_found(file);
    const auto& short_name = get_short_name(index);
    if (!name_space.at(file).queries.count(short_name)) {
        report_symbol_not_found(short_name, file);
    }
    return name_space.at(file).queries.at(short_name);
}

const domain& global_symbol_table::get_domain(const std::string& file) const {
    if (!name_space.count(file)) {
        std::cerr << "Crashed: cannot find namespace in such file <" << file << ">.\n";
        std::exit(-1);
    }
    return name_space.at(file);
}

void global_symbol_table::dump() const {
    size_t width = std::to_string(global_symbols.size()).length();
    for (size_t i = 0; i<global_symbols.size(); ++i) {
        std::cout << std::setw(width) << i << " ";
        switch(global_symbols[i].kind) {
            case symbol_kind::basic:     std::cout << "basic    "; break;
            case symbol_kind::database:  std::cout << "database "; break;
            case symbol_kind::enumerate: std::cout << "enum     "; break;
            case symbol_kind::function:  std::cout << "function "; break;
            case symbol_kind::null:      std::cout << "null     "; break;
            case symbol_kind::package:   std::cout << "package  "; break;
            case symbol_kind::query:     std::cout << "query    "; break;
            case symbol_kind::schema:    std::cout << "schema   "; break;
        }
        std::cout << global_symbols[i].full_name << "\n";
    }
}

void global_symbol_table::init_basics() {
    // avoid initializing repeatedly
    if (basics.size()) {
        return;
    }

    // init basic type and add them into global basic symbol table
    basics = {
        {"int", {}},
        {"float", {}},
        {"bool", {}},
        {"string", {}}
    };
    for(auto& i : basics) {
        i.second.name = i.first;
        regist("", i.first, symbol_kind::basic);
    }

    init_int_method();
    init_float_method();
    init_bool_method();
    init_string_method();
}

void global_symbol_table::init_natives() {
    // do not need to initialize native functions multiple times
    if (native.size()) {
        return;
    }

    // regist global native function "output"
    regist("", "output", symbol_kind::function);
    native["output"] = function::build_native(
        "output", {{"out", symbol::boolean()}}, symbol::null(), true
    );
    
    // add reserved identifier
    reserved_identifier.insert({"__all_data__", symbol::all_data()});

    // load godel aggregator
    aggregator["len"] = function::build_native("len", {}, symbol::i64(), false);
    aggregator["max"] = function::build_native("max", {}, symbol::i64(), false);
    aggregator["min"] = function::build_native("min", {}, symbol::i64(), false);
    aggregator["sum"] = function::build_native("sum", {}, symbol::i64(), false);
    aggregator["find"] = function::build_native(
        "find", {{"value", symbol::any()}}, symbol::any(), false
    );

    // add accept type set to aggregator
    aggregator.at("max").aggregator_set_type = {symbol::i64()};
    aggregator.at("min").aggregator_set_type = {symbol::i64()};
    aggregator.at("sum").aggregator_set_type = {symbol::i64()};
    aggregator.at("find").aggregator_set_type = {symbol::any()};
}

void global_symbol_table::init_int_method() {
    const symbol int_set = {
        .type_name = "int",
        .type_loc = span::null(),
        .location = span::null(),
        .is_set = true
    };
    auto& basic_int = basics.at("int");

    basic_int.natives["neg"] = function::build_native(
        "neg", {{"self", symbol::i64()}}, symbol::i64(), false
    );
    basic_int.natives["bitnot"] = function::build_native(
        "bitnot", {{"self", symbol::i64()}}, symbol::i64(), false
    );
    basic_int.natives["to_string"] = function::build_native(
        "to_string", {{"self", symbol::i64()}}, symbol::str(), false
    );
    basic_int.natives["range"] = function::build_native(
        "range", {{"begin", symbol::i64()}, {"end", symbol::i64()}}, int_set, false
    );
    basic_int.natives["__undetermined_all__"] = function::build_native(
        "__undetermined_all__", {}, int_set, false
    );
    basic_int.natives["to_set"] = function::build_native(
        "to_set", {{"self", symbol::i64()}}, int_set, false
    );
    
    for(auto& i : {"add", "sub", "mul", "div"}) {
        basic_int.natives[i] = function::build_native(
            i, {{"self", symbol::i64()}, {"num", symbol::i64()}}, symbol::i64(), false
        );
    }
    for(auto& i : {"eq", "ne", "gt", "ge", "lt", "le"}) {
        basic_int.natives[i] = function::build_native(
            i,
            {{"self", symbol::i64()}, {"num", symbol::i64()}},
            symbol::boolean(),
            false
        );
    }

    for(auto& i : {"pow", "rem", "bitand", "bitor", "bitxor"}) {
        basic_int.natives[i] = function::build_native(
            i, {{"self", symbol::i64()}, {"num", symbol::i64()}}, symbol::i64(), false
        );
    }
}

void global_symbol_table::init_float_method() {
    auto& basic_float = basics.at("float");
    basic_float.natives["neg"] = function::build_native(
        "neg", {{"self", symbol::f64()}}, symbol::f64(), false
    );

    for(auto& i : {"add", "sub", "mul", "div"}) {
        basic_float.natives[i] = function::build_native(
            i,
            {{"self", symbol::f64()}, {"num", symbol::f64()}},
            symbol::f64(),
            false
        );
    }
    for(auto& i : {"eq", "ne", "gt", "ge", "lt", "le"}) {
        basic_float.natives[i] = function::build_native(
            i,
            {{"self", symbol::f64()}, {"num", symbol::f64()}},
            symbol::boolean(),
            false
        );
    }

    for(auto& i : {"pow", "rem"}) {
        basic_float.natives[i] = function::build_native(
            i,
            {{"self", symbol::f64()}, {"num", symbol::f64()}},
            symbol::f64(),
            false
        );
    }
}

void global_symbol_table::init_bool_method() {
    auto& basic_bool = basics.at("bool");
    basic_bool.natives["not"] = function::build_native(
        "not", {{"self", symbol::boolean()}}, symbol::boolean(), false
    );
    for(auto& i : {"and", "or", "eq", "ne"}) {
        basic_bool.natives[i] = function::build_native(
            i,
            {{"self", symbol::boolean()}, {"flag", symbol::boolean()}},
            symbol::boolean(),
            false
        );
    }
}

void global_symbol_table::init_string_method() {
    const symbol string_set = {
        .type_name = "string",
        .type_loc = span::null(),
        .location = span::null(),
        .is_set = true
    };
    auto& basic_string = basics.at("string");
    basic_string.natives["add"] = function::build_native(
        "add",
        {{"self", symbol::str()}, {"str", symbol::str()}},
        symbol::str(),
        false
    ) ;
    for(auto& i : {"eq", "ne", "contains", "matches"}) {
        basic_string.natives[i] = function::build_native(
            i,
            {{"self", symbol::str()}, {"str", symbol::str()}},
            symbol::boolean(),
            false
        );
    }
    basic_string.natives["len"] = function::build_native(
        "len", {{"self", symbol::str()}}, symbol::i64(), false
    );
    basic_string.natives["substr"] = function::build_native(
        "substr",
        {{"self", symbol::str()}, {"begin", symbol::i64()}, {"length", symbol::i64()}},
        symbol::str(),
        false
    );
    basic_string.natives["to_int"] = function::build_native(
        "to_int", {{"self", symbol::str()}}, symbol::i64(), false
    );
    basic_string.natives["get_regex_match_result"] = function::build_native(
        "get_regex_match_result",
        {{"self", symbol::str()}, {"str", symbol::str()}, {"num", symbol::i64()}},
        symbol::str(),
        false
    );
    basic_string.natives["to_upper"] = function::build_native(
        "to_upper", {{"self", symbol::str()}}, symbol::str(), false
    );
    basic_string.natives["to_lower"] = function::build_native(
        "to_lower", {{"self", symbol::str()}}, symbol::str(), false
    );
    basic_string.natives["replace_all"] = function::build_native(
        "replace_all",
        {{"self", symbol::str()}, {"pattern", symbol::str()}, {"replacement", symbol::str()}},
        symbol::str(),
        false
    );
    basic_string.natives["replace_once"] = function::build_native(
        "replace_once",
        {{"self", symbol::str()}, {"pattern", symbol::str()}, {"replacement", symbol::str()}, {"index", symbol::i64()}},
        symbol::str(),
        false
    );
    basic_string.natives["__undetermined_all__"] = function::build_native(
        "__undetermined_all__", {}, string_set, false
    );
    basic_string.natives["to_set"] = function::build_native(
        "to_set", {{"self", symbol::str()}}, string_set, false
    );
}

void global_symbol_table::init_packages() {
    // no need to load packages multiple times
    if (packages.size()) {
        return;
    }

    auto package_manager = package::godel_module::instance();
    // package_info pointers stored here, for child node loading
    std::queue<package_info*> package_info_queue;
    // module_tree_node pointers stored here, for generating package structure
    std::queue<package::module_tree_node*> tree_node;
    // generate root packages
    for(const auto& i : package_manager->get_tree().get_root()) {
        // insert full path, with package_info
        packages.insert({i.first, {
            .name = i.first,
            .domain_name = package_manager->find_file_by_module_path(i.first),
            .child = {}
        }});
        tree_node.push(i.second);
        package_info_queue.push(&packages.at(i.first));
    }

    // generate child packages / sub packages
    while(!tree_node.empty()) {
        auto node = tree_node.front();
        auto parent = package_info_queue.front();
        tree_node.pop();
        package_info_queue.pop();
        for(const auto& i : node->next) {
            // insert full path, with package_info
            packages.insert({i.second->full_path, {
                .name = i.second->full_path,
                .domain_name = package_manager->find_file_by_module_path(i.second->full_path),
                .child = {}
            }});

            // insert child package_info
            auto child = &packages.at(i.second->full_path);
            tree_node.push(i.second);
            package_info_queue.push(child);
            // insert child package_info to parent, short name only
            parent->child.insert({i.second->node_name, child});
        }
    }
    for(const auto& i : packages) {
        regist("", i.first, symbol_kind::package);
    }
}

}