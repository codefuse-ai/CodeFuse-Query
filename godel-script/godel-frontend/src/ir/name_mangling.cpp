#include "godel-frontend/src/ir/name_mangling.h"

namespace godel {

std::string field_name_mangling(const std::string& name, const symbol& type) {
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
    // schema_test(result, [-1, -1], field_0x6669656c64_a_int) :- (
    //     field_0x6669656c64_a_int = a,
    //     ^^^^^^^^^^^^^^^^^^^^^^^^ this is the field of test: `test.a`
    //                                ^ this is the variable `a`
    //     result = [field_0x6669656c64_a_int],
    //     a = range(0, 10)
    // ).
    //
    return "field_0x6669656c64_" + name + "_" + replace_colon(
        type.full_path_name_without_set()
    );
}

}