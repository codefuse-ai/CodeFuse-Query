#pragma once

#include "godel-frontend/src/error/error.h"
#include "godel-frontend/src/ast/ast_visitor.h"
#include "godel-frontend/src/sema/context.h"
#include "godel-frontend/src/symbol.h"

#include <unordered_set>
#include <cstring>
#include <sstream>

namespace godel {

class function_generator {
private:
    report::error* err;
    context* ctx;

private:
    // not the same as ctx.invalid_variable_name, this allows `self`
    const std::unordered_set<std::string> invalid_parameter_name = {
        "Self", "count", "sum", "output",
        "input", "max", "min", "result"
    };
    bool flag_in_impl = false;
    std::string self_type_name = "";

private:
    void check_cache_annotation_confliction(const function&, function_decl*);
    void check_output_annotations(function&, function_decl*);
    void check_input_annotations(function&, function_decl*);
    void check_single_annotation(annotation*);
    void check_annotations(function&, function_decl*);
    void load_annotation(function&, function_decl*);

private:
    symbol generate_return_type(type_def*);
    void load_return_type_and_check(function&, function_decl*);
    symbol generate_parameter(var_decl*, uint32_t, const function&);
    void load_parameters(function&, function_decl*);

public:
    function_generator(report::error* err_ptr, context* ctx_ptr):
        err(err_ptr), ctx(ctx_ptr) {}
    function generate(function_decl*, bool, const std::string& self_type = "");
};

class function_declaration: public ast_visitor {
private:
    report::error* err;
    context* ctx;
    function_generator generator;

private:
    bool visit_function_decl(function_decl*) override;
    bool visit_impl_block(impl_block*) override;

public:
    function_declaration(report::error* err_ptr, context* ctx_ptr):
        err(err_ptr), ctx(ctx_ptr), generator(err_ptr, ctx_ptr) {}
    void check(ast_root*);
};

class impl_function_declaration: public ast_visitor {
private:
    report::error* err;
    context* ctx;
    function_generator generator;

private:
    bool visit_impl_block(impl_block*) override;
    void check_impl_schema(impl_block*);

public:
    impl_function_declaration(report::error* err_ptr, context* ctx_ptr):
        err(err_ptr), ctx(ctx_ptr), generator(err_ptr, ctx_ptr) {}
    void check(ast_root*);
};

}