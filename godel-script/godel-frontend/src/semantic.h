#pragma once

#include "godel-frontend/src/ast/ast_node.h"
#include "godel-frontend/src/ast/ast_root.h"
#include "godel-frontend/src/ast/decl.h"
#include "godel-frontend/src/ast/stmt.h"
#include "godel-frontend/src/ast/expr.h"

#include "godel-frontend/src/sema/context.h"
#include "godel-frontend/src/sema/self_reference_check.h"
#include "godel-frontend/src/sema/global_symbol_loader.h"
#include "godel-frontend/src/sema/symbol_import.h"
#include "godel-frontend/src/sema/data_structure_construct.h"
#include "godel-frontend/src/sema/inherit_schema.h"
#include "godel-frontend/src/sema/function_declaration.h"
#include "godel-frontend/src/sema/fact_statement_checker.h"
#include "godel-frontend/src/sema/ungrounded_checker.h"
#include "godel-frontend/src/ir/ir_context.h"
#include "godel-frontend/src/ir/ir_gen.h"
#include "godel-frontend/src/error/error.h"
#include "godel-frontend/src/package/package.h"
#include "godel-frontend/src/symbol.h"
#include "godel-frontend/src/cli.h"

#include <iostream>
#include <fstream>
#include <cstdint>
#include <cstring>
#include <sstream>
#include <unordered_map>
#include <unordered_set>

namespace godel {

using package::godel_module;
using report::error;
using report::span;
using cli::option;
using cli::configure;

class semantic {
private:
    // error report module
    error& err;

    // semantic context
    context ctx;

    // store local symbol
    std::unordered_map<std::string, symbol> local_scope;

    // used to store the schema which we are checking the method implemention
    // then "Self::" in the function block will be filled by "{impl_schema}::"
    std::string impl_schema_name;

    // flag to mark if statement check is in main function
    // used to check if output is used in correct place
    bool in_main_function = false;

    // switch of public access authority checker
    bool flag_check_access_authority = false;

    // switch of condition statements having else branch checker
    bool flag_check_no_else_branch = false;

private:
    // generate output used functions and methods
    void generate_output_used_function_name();
    void generate_constructor_for_DO_schema();
    void report_redefined_variable(const span&, const std::string&);
    void error_method_not_public(const span&, const std::string&, const symbol&);
    void warn_method_not_public(const span&, const std::string&, const symbol&);
    void report_method_private_access(const span&, const std::string&, const symbol&);
    void error_function_not_public(const span&, const std::string&, const std::string&);
    void warn_function_not_public(const span&, const std::string&, const std::string&);
    void report_static_private_access(const span&, const function&, const std::string&);

private:
    void for_stmt_check(for_stmt*, const function&);
    symbol for_definition(var_decl*);
    void let_stmt_check(let_stmt*, const function&);
    symbol let_definition(var_decl*);
    void if_stmt_check(if_stmt*, const function&);
    void embedded_code_block(block_stmt*, const function&);
    void cond_stmt_check(cond_stmt*, const function&);
    void match_stmt_check(match_stmt*, const function&);
    void fact_stmt_check(fact_stmt*, const function&);
    void ret_stmt_check(ret_stmt*, const function&);
    void in_block_expr_stmt(in_block_expr*);
    void statement_in_main_function_check(stmt*);
    void statement_check(stmt*, const function&);

    infer expression(expr*);
    infer or_expr(binary_operator*);
    infer and_expr(binary_operator*);
    infer in_expr(binary_operator*);
    infer mult_expr(binary_operator*);
    infer add_expr(binary_operator*);
    infer unary_neg_expr(unary_operator*);
    infer binary_expr(binary_operator*);
    infer not_expr(unary_operator*);
    infer cmp_expr(binary_operator*);

    infer call(call_root*);
    infer check_first(call_head*);
    infer check_local(call_head*);
    infer check_reserved_id(call_head*);
    infer check_global(call_head*);
    infer check_global_basic(call_head*);
    infer check_global_enum(call_head*);
    infer check_global_database(call_head*);
    infer check_global_schema(call_head*);
    infer check_global_function_call(call_head*);
    infer check_global_package(call_head*);

    // check special call "output" in main function
    infer check_output_function_call(call_head*);

    infer check_field(const infer&, call_expr*);
    infer check_field_in_schema(const symbol&, call_expr*);
    infer check_key_eq_method_in_schema(const symbol&, const function&, call_expr*);
    infer check_generic_type(call_expr*);
    bool check_duck_type_schema(const symbol&, const symbol&, const span&);
    infer check_aggregator(const symbol&, const function&, call_expr*);
    infer check_aggregator_find(const symbol&, call_expr*);
    infer check_field_in_database(const symbol&, call_expr*);
    infer check_field_in_basic(const symbol&, call_expr*);

    infer check_path(const infer&, call_expr*);
    infer check_path_in_enum(const symbol&, call_expr*);
    infer check_path_in_schema(const symbol&, call_expr*);
    infer check_path_in_database(const symbol&, call_expr*);
    infer check_path_in_basic(const symbol&, call_expr*);
    infer check_path_in_package(const symbol&, call_expr*);

    bool check_single_argument(expr*, const symbol&);
    std::string generate_func_param_info(const function&) const;
    bool check_argument_list(const function&, func_call*);
    infer check_loader_call(const symbol&, const function&, func_call*);
    infer check_method_call(const symbol&, const function&, call_expr*);
    infer check_static_or_full_path_call(const function&, call_expr*, const std::string&);
    infer check_global_call(const function&, call_head*);
    infer check_initializer(const symbol&, initializer*);
    void check_initializer_pair(const symbol&,
                                initializer_pair*,
                                const schema&,
                                std::unordered_map<std::string, bool>&);
    void check_spread_expr(const symbol&,
                           spread_expr*,
                           const schema&,
                           std::unordered_map<std::string, bool>&);
    infer check_loader(call_head*);
    infer check_schema_loader(const symbol&, call_expr*);

    void code_block_check(function&, block_stmt*);
    void global_function_check(function_decl*);
    void impl_block_check(impl_block*);
    void query_check(query_decl*);
    void all_function_block_check(ast_root*);

public:
    semantic(error& reporter): err(reporter) {}
    void dump_detail_semantic_info() const;
    void dump_local_variables() const;
    const auto& get_context() const { return ctx; }
    [[nodiscard]] const error& analyse(const configure&, ast_root*);
};

}