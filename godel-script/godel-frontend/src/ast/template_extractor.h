#pragma once

#include "godel-frontend/src/ast/ast_visitor.h"

#include <vector>
#include <cstring>
#include <sstream>

namespace godel {

// extract probable template from godel script
class template_extractor: public ast_visitor {
private:
    std::string result;

private:
    bool check_call_is_literal(call_root*);
    bool check_unary_operator_literal_childs(unary_operator*);
    bool check_binary_operator_literal_childs(binary_operator*);

private:
    bool visit_ast_root(ast_root*) override;
    bool visit_ast_null(ast_null*) override;

    bool visit_number_literal(number_literal*) override;
    bool visit_string_literal(string_literal*) override;
    bool visit_boolean_literal(boolean_literal*) override;
    bool visit_identifier(identifier*) override;
    bool visit_unary_operator(unary_operator*) override;
    bool visit_binary_operator(binary_operator*) override;
    bool visit_func_call(func_call*) override;
    bool visit_initializer_pair(initializer_pair*) override;
    bool visit_spread_expr(spread_expr*) override;
    bool visit_initializer(initializer*) override;
    bool visit_call_head(call_head*) override;
    bool visit_call_expr(call_expr*) override;
    bool visit_call_root(call_root*) override;

    bool visit_block_stmt(block_stmt*) override;
    bool visit_multi_use_stmt(multi_use_stmt*) override;
    bool visit_use_stmt(use_stmt*) override;
    bool visit_let_stmt(let_stmt*) override;
    bool visit_if_stmt(if_stmt*) override;
    bool visit_cond_stmt(cond_stmt*) override;
    bool visit_for_stmt(for_stmt*) override;
    bool visit_match_pair(match_pair*) override;
    bool visit_match_stmt(match_stmt*) override;
    bool visit_ret_stmt(ret_stmt*) override;
    bool visit_fact_stmt(fact_stmt*) override;
    bool visit_in_block_expr(in_block_expr*) override;

    bool visit_annotation(annotation*) override;
    bool visit_type_def(type_def*) override;
    bool visit_database_table(database_table*) override;
    bool visit_database_decl(database_decl*) override;
    bool visit_schema_field(schema_field*) override;
    bool visit_schema_decl(schema_decl*) override;
    bool visit_function_decl(function_decl*) override;
    bool visit_enum_decl(enum_decl*) override;
    bool visit_var_decl(var_decl*) override;
    bool visit_impl_block(impl_block*) override;
    bool visit_query_column(query_column*) override;

    void dump_query_from_list(query_decl*);
    void dump_query_select_list(query_decl*);
    bool visit_query_decl(query_decl*) override;

public:
    const std::string& to_string(ast_root* root) {
        result = "";
        visit_ast_root(root);
        return result;
    }
};

class location_extractor: public ast_visitor {
private:
    std::string schema_name;
    std::vector<impl_block*> impls;
    std::vector<schema_decl*> schemas;
    std::vector<std::pair<std::string, function_decl*>> funcs;

private:
    bool visit_impl_block(impl_block*) override;
    bool visit_schema_decl(schema_decl*) override;
    bool visit_function_decl(function_decl*) override;
    std::string location_dump(const span&);

public:
    void output(ast_root*, const std::string&);
};

}