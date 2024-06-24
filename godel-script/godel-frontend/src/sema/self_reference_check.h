#pragma once

#include "godel-frontend/src/symbol.h"
#include "godel-frontend/src/sema/context.h"
#include "godel-frontend/src/error/error.h"

#include <cstring>
#include <sstream>
#include <queue>
#include <unordered_map>

namespace godel {

// check schema self extend
// example:
// ```rust
// // A -> C -> B -> A which is self-extends
// schema A extends C {}
// schema B extends A {}
// schema C extends B {}
// ```
class self_extend_checker {
private:
    report::error* err;
    context* ctx;
    std::unordered_map<std::string, schema>* schema_table;

private:
    // set all the schemas' mark to "not checked"
    void clear_all_mark();

    // check self extend and generate extend chain
    void self_extend_check_core(
        const std::string&,
        const span&,
        std::queue<std::pair<std::string, std::string>>&
    );

public:
    self_extend_checker(report::error* err_ptr, context* ctx_ptr):
        err(err_ptr), ctx(ctx_ptr) {
        schema_table = &ctx->global.get_domain(ctx->this_file_name).schemas;
    }

    // do self extend check
    void check();
};

// check schema self-reference
// example:
// ```rust
// // A.member -> B.member -> C.member -> A which is self-referenced
// schema A {member: B}
// schema B {member: C}
// schema C {memebr: A}
// ```
class self_reference_checker {
private:
    report::error* err;
    context* ctx;
    std::unordered_map<std::string, schema>* schema_table;

private:
    // set all the schemas' mark to "not checked"
    void clear_all_mark();

    // check self reference and generate reference chain
    void self_reference_check_core(
        const std::string&,
        std::queue<std::pair<std::string, std::string>>&
    );

public:
    self_reference_checker(report::error* err_ptr, context* ctx_ptr):
        err(err_ptr), ctx(ctx_ptr) {
        schema_table = &ctx->global.get_domain(ctx->this_file_name).schemas;
    }

    // do self reference check
    void check();
};

}