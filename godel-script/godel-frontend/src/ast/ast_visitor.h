#pragma once

#include "godel-frontend/src/ast/ast_node.h"
#include "godel-frontend/src/ast/decl.h"
#include "godel-frontend/src/ast/expr.h"
#include "godel-frontend/src/ast/stmt.h"
#include "godel-frontend/src/ast/ast_root.h"

namespace godel {

class ast_visitor {
public:
    ast_visitor(ast_visitor const &) = delete;
    ast_visitor& operator=(ast_visitor const &) = delete;

public:
    ast_visitor() {}
    virtual ~ast_visitor() {}

    bool visit(ast_node*);

    virtual bool visit_ast_root(ast_root*);
    virtual bool visit_ast_null(ast_null*);

    virtual bool visit_expr(expr*);
    virtual bool visit_number_literal(number_literal*);
    virtual bool visit_string_literal(string_literal*);
    virtual bool visit_boolean_literal(boolean_literal*);
    virtual bool visit_identifier(identifier*);
    virtual bool visit_unary_operator(unary_operator*);
    virtual bool visit_binary_operator(binary_operator*);
    virtual bool visit_func_call(func_call*);
    virtual bool visit_initializer_pair(initializer_pair*);
    virtual bool visit_spread_expr(spread_expr*);
    virtual bool visit_initializer(initializer*);
    virtual bool visit_call_head(call_head*);
    virtual bool visit_call_expr(call_expr*);
    virtual bool visit_call_root(call_root*);

    virtual bool visit_stmt(stmt*);
    virtual bool visit_block_stmt(block_stmt*);
    virtual bool visit_multi_use_stmt(multi_use_stmt*);
    virtual bool visit_use_stmt(use_stmt*);
    virtual bool visit_let_stmt(let_stmt*);
    virtual bool visit_if_stmt(if_stmt*);
    virtual bool visit_cond_stmt(cond_stmt*);
    virtual bool visit_for_stmt(for_stmt*);
    virtual bool visit_match_pair(match_pair*);
    virtual bool visit_match_stmt(match_stmt*);
    virtual bool visit_ret_stmt(ret_stmt*);
    virtual bool visit_fact_data(fact_data*);
    virtual bool visit_fact_stmt(fact_stmt*);
    virtual bool visit_in_block_expr(in_block_expr*);

    virtual bool visit_decl(decl*);
    virtual bool visit_annotation(annotation*);
    virtual bool visit_type_def(type_def*);
    virtual bool visit_database_table(database_table*);
    virtual bool visit_database_decl(database_decl*);
    virtual bool visit_schema_field(schema_field*);
    virtual bool visit_schema_decl(schema_decl*);
    virtual bool visit_function_decl(function_decl*);
    virtual bool visit_enum_decl(enum_decl*);
    virtual bool visit_var_decl(var_decl*);
    virtual bool visit_impl_block(impl_block*);
    virtual bool visit_query_column(query_column*);
    virtual bool visit_query_decl(query_decl*);
}; // end class ast_visitor

} // end namespace
