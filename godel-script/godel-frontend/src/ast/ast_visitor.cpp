#include "godel-frontend/src/ast/ast_visitor.h"
#include <assert.h>

namespace godel {

bool ast_visitor::visit(ast_node* node) {
    assert(node != nullptr);
    node->accept(this);
    return true;
}

bool ast_visitor::visit_ast_root(ast_root* node) {
    for(auto i : node->get_use_statements()) {
        i->accept(this);
    }
    for(auto i : node->get_declarations()) {
        i->accept(this);
    }
    return true;
}

bool ast_visitor::visit_ast_null([[maybe_unused]] ast_null* node) {
    return true;
}

bool ast_visitor::visit_expr(expr* node) {
    node->accept(this);
    return true;
}

bool ast_visitor::visit_number_literal([[maybe_unused]] number_literal* node) {
    return true;
}

bool ast_visitor::visit_string_literal([[maybe_unused]] string_literal* node) {
    return true;
}

bool ast_visitor::visit_boolean_literal([[maybe_unused]] boolean_literal* node) {
    return true;
}

bool ast_visitor::visit_identifier([[maybe_unused]] identifier* node) {
    return true;
}

bool ast_visitor::visit_unary_operator(unary_operator* node) {
    node->get_child()->accept(this);
    return true;
}

bool ast_visitor::visit_binary_operator(binary_operator* node) {
    node->get_left()->accept(this);
    node->get_right()->accept(this);
    return true;
}

bool ast_visitor::visit_func_call(func_call* node) {
    for(auto i : node->get_arguments()) {
        i->accept(this);
    }
    return true;
}

bool ast_visitor::visit_initializer_pair(initializer_pair* node) {
    node->get_field_name()->accept(this);
    node->get_field_value()->accept(this);
    return true;
}

bool ast_visitor::visit_initializer(initializer* node) {
    for(auto i : node->get_field_pairs()) {
        i->accept(this);
    }
    for(auto i : node->get_spread_exprs()) {
        i->accept(this);
    }
    return true;
}

bool ast_visitor::visit_spread_expr(spread_expr* node) {
    node->get_child()->accept(this);
    return true;
}

bool ast_visitor::visit_call_head(call_head* node) {
    node->get_first_expression()->accept(this);
    if (node->has_func_call()) {
        node->get_func_call()->accept(this);
    }
    if (node->is_initializer()) {
        node->get_initializer()->accept(this);
    }
    return true;
}

bool ast_visitor::visit_call_expr(call_expr* node) {
    node->get_field_name()->accept(this);
    if (node->is_generic()) {
        node->get_generic_type()->accept(this);
    }
    if (node->has_func_call()) {
        node->get_func_call()->accept(this);
    }
    if (node->is_initializer()) {
        node->get_initializer()->accept(this);
    }
    return true;
}

bool ast_visitor::visit_call_root(call_root* node) {
    node->get_call_head()->accept(this);
    for(auto i : node->get_call_chain()) {
        i->accept(this);
    }
    return true;
}

bool ast_visitor::visit_stmt(stmt* node) {
    node->accept(this);
    return true;
}

bool ast_visitor::visit_block_stmt(block_stmt* node) {
    for(auto i : node->get_statement()) {
        i->accept(this);
    }
    return true;
}

bool ast_visitor::visit_multi_use_stmt(multi_use_stmt* node) {
    for(auto i : node->get_import_symbol()) {
        i->accept(this);
    }
    return true;
}

bool ast_visitor::visit_use_stmt(use_stmt* node) {
    for(auto i : node->get_path()) {
        i->accept(this);
    }
    if (!node->is_use_all()) {
        node->get_multi_use()->accept(this);
    }
    return true;
}

bool ast_visitor::visit_let_stmt(let_stmt* node) {
    for(auto i : node->get_symbols()) {
        i->accept(this);
    }
    if (node->has_statement()) {
        node->get_code_block()->accept(this);
    }
    return true;
}

bool ast_visitor::visit_if_stmt(if_stmt* node) {
    if (node->has_condition()) {
        node->get_condition()->accept(this);
    }
    if (node->has_statement()) {
        node->get_code_block()->accept(this);
    }
    return true;
}

bool ast_visitor::visit_cond_stmt(cond_stmt* node) {
    node->get_if_stmt()->accept(this);
    for(auto i : node->get_elsif_stmt()) {
        i->accept(this);
    }
    if (node->has_else_stmt()) {
        node->get_else_stmt()->accept(this);
    }
    return true;
}

bool ast_visitor::visit_for_stmt(for_stmt* node) {
    for(auto i : node->get_symbols()) {
        i->accept(this);
    }
    if (node->has_statement()) {
        node->get_code_block()->accept(this);
    }
    return true;
}

bool ast_visitor::visit_match_pair(match_pair* node) {
    node->get_literal()->accept(this);
    node->get_statement()->accept(this);
    return true;
}

bool ast_visitor::visit_match_stmt(match_stmt* node) {
    node->get_match_condition()->accept(this);
    for(auto i : node->get_match_pair_list()) {
        i->accept(this);
    }
    return true;
}

bool ast_visitor::visit_ret_stmt(ret_stmt* node) {
    node->get_return_value()->accept(this);
    return true;
}

bool ast_visitor::visit_fact_data(fact_data* node) {
    for(auto i : node->get_literals()) {
        i->accept(this);
    }
    return true;
}

bool ast_visitor::visit_fact_stmt(fact_stmt* node) {
    for(auto i : node->get_facts()) {
        i->accept(this);
    }
    return true;
}

bool ast_visitor::visit_in_block_expr(in_block_expr* node) {
    node->get_expr()->accept(this);
    return true;
}

bool ast_visitor::visit_decl(decl* node) {
    node->accept(this);
    return true;
}

bool ast_visitor::visit_annotation([[maybe_unused]] annotation* node) {
    return true;
}

bool ast_visitor::visit_type_def([[maybe_unused]] type_def* node) {
    return true;
}

bool ast_visitor::visit_database_table(database_table* node) {
    node->get_name()->accept(this);
    node->get_type()->accept(this);
    if (node->has_real_name()) {
        node->get_real_name()->accept(this);
    }
    return true;
}

bool ast_visitor::visit_database_decl(database_decl* node) {
    node->get_name()->accept(this);
    for(auto i : node->get_tables()) {
        i->accept(this);
    }
    return true;
}

bool ast_visitor::visit_schema_field(schema_field* node) {
    node->get_annotation()->accept(this);
    node->get_identifier()->accept(this);
    node->get_field_type()->accept(this);
    return true;
}

bool ast_visitor::visit_schema_decl(schema_decl* node) {
    node->get_name()->accept(this);
    if (node->has_parent()) {
        node->get_parent_name()->accept(this);
    }
    for(auto i : node->get_fields()) {
        i->accept(this);
    }
    return true;
}

bool ast_visitor::visit_function_decl(function_decl* node) {
    for(auto i : node->get_annotations()) {
        i->accept(this);
    }
    node->get_name()->accept(this);
    for(auto i : node->get_parameter_list()) {
        i->accept(this);
    }
    if (node->has_return_value()) {
        node->get_return_type()->accept(this);
    }
    if (node->implemented()) {
        node->get_code_block()->accept(this);
    }
    return true;
}

bool ast_visitor::visit_enum_decl(enum_decl* node) {
    node->get_name()->accept(this);
    for(auto i : node->get_member()) {
        i->accept(this);
    }
    return true;
}

bool ast_visitor::visit_var_decl(var_decl* node) {
    node->get_var_name()->accept(this);
    if (node->has_declared_type()) {
        node->get_type()->accept(this);
    }
    if (node->has_init_value()) {
        node->get_init_value()->accept(this);
    }
    return true;
}

bool ast_visitor::visit_impl_block(impl_block* node) {
    node->get_impl_schema_name()->accept(this);
    for(auto i : node->get_functions()) {
        i->accept(this);
    }
    return true;
}

bool ast_visitor::visit_query_column(query_column* node) {
    if (node->has_column_name()) {
        node->get_column_name()->accept(this);
    }
    node->get_column_value()->accept(this);
    return true;
}

bool ast_visitor::visit_query_decl(query_decl* node) {
    for(auto i : node->get_from_list()) {
        i->accept(this);
    }
    if (node->has_condition()) {
        node->get_where_condition()->accept(this);
    }
    for(auto i : node->get_select_list()) {
        i->accept(this);
    }
    return true;
}

} // end namespace godel
