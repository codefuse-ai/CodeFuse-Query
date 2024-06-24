#include "godel-frontend/src/ast/template_extractor.h"

#include <fstream>

namespace godel {

bool template_extractor::check_call_is_literal(call_root* node) {
    auto type = node->get_call_head()->get_first_expression()->get_ast_class();
    return type==ast_class::ac_number_literal || type==ast_class::ac_string_literal;
}

bool template_extractor::check_unary_operator_literal_childs(unary_operator* node) {
    if (node->get_child()->get_ast_class()==ast_class::ac_call_root) {
        return check_call_is_literal((call_root*)node->get_child());
    }
    return false;
}

bool template_extractor::check_binary_operator_literal_childs(binary_operator* node) {
    auto left = node->get_left();
    auto right = node->get_right();
    auto left_flag = false, right_flag = false;
    if (left->get_ast_class()==ast_class::ac_binary_operator) {
        left_flag = check_binary_operator_literal_childs((binary_operator*)left);
    } else if (left->get_ast_class()==ast_class::ac_unary_operator) {
        left_flag = check_unary_operator_literal_childs((unary_operator*)left);
    } else if (left->get_ast_class()==ast_class::ac_call_root) {
        left_flag = check_call_is_literal((call_root*)left);
    }
    if (right->get_ast_class()==ast_class::ac_binary_operator) {
        right_flag = check_binary_operator_literal_childs((binary_operator*)right);
    } else if (right->get_ast_class()==ast_class::ac_unary_operator) {
        right_flag = check_unary_operator_literal_childs((unary_operator*)right);
    } else if (right->get_ast_class()==ast_class::ac_call_root) {
        right_flag = check_call_is_literal((call_root*)right);
    }
    return left_flag || right_flag;
}

bool template_extractor::visit_ast_root(ast_root* node) {
    for (auto i : node->get_use_statements()) {
        i->accept(this);
        if (i!=node->get_use_statements().back()) {
            result += " ";
        }
    }
    if (node->get_use_statements().size() && node->get_declarations().size()) {
        result += " ";
    }
    for (auto i : node->get_declarations()) {
        i->accept(this);
        if (i!=node->get_declarations().back()) {
            result += " ";
        }
    }
    return true;
}

bool template_extractor::visit_ast_null([[maybe_unused]] ast_null* node) {
    result += "<null>";
    return true;
}

bool template_extractor::visit_number_literal([[maybe_unused]] number_literal* node) {
    result += "LITERAL";
    return true;
}

bool template_extractor::visit_string_literal([[maybe_unused]] string_literal* node) {
    result += "LITERAL";
    return true;
}

bool template_extractor::visit_boolean_literal(boolean_literal* node) {
    result += node->get_flag()? "true":"false";
    return true;
}

bool template_extractor::visit_identifier(identifier* node) {
    result += node->get_name();
    return true;
}

bool template_extractor::visit_unary_operator(unary_operator* node) {
    switch (node->get_operator_type()) {
        case unary_operator::type::logical_negation: result += "! "; 	break;
        case unary_operator::type::arithmetic_negation: result += "- "; break;
    }
    result += "(";
    node->get_child()->accept(this);
    result += ")";
    return true;
}

bool template_extractor::visit_binary_operator(binary_operator* node) {
    if (check_binary_operator_literal_childs(node)) {
        result += "COMPLETELY_LITERAL_DOMINATED_EXPRESSION";
        return true;
    }
    result += "(";
    node->get_left()->accept(this);
    switch (node->get_operator_type()) {
        case binary_operator::type::logical_or: result += " || "; break;
        case binary_operator::type::logical_and: result += " && "; break;
        case binary_operator::type::compare_equal: result += " = "; break;
        case binary_operator::type::compare_not_equal: result += " != "; break;
        case binary_operator::type::compare_less: result += " < "; break;
        case binary_operator::type::compare_less_equal: result += " <= "; break;
        case binary_operator::type::compare_great: result += " > "; break;
        case binary_operator::type::compare_great_equal: result += " >= "; break;
        case binary_operator::type::in: result += " in "; break;
        case binary_operator::type::add: result += " + "; break;
        case binary_operator::type::sub: result += " - "; break;
        case binary_operator::type::mult: result += " * "; break;
        case binary_operator::type::div: result += " / "; break;
    }
    node->get_right()->accept(this);
    result += ")";
    return true;
}

bool template_extractor::visit_func_call(func_call* node) {
    result += "(";
    for (auto i : node->get_arguments()) {
        i->accept(this);
        if (i!=node->get_arguments().back()) {
            result += ", ";
        }
    }
    result += ")";
    return true;
}

bool template_extractor::visit_initializer_pair(initializer_pair* node) {
    node->get_field_name()->accept(this);
    result += ": ";
    node->get_field_value()->accept(this);
    return true;
}

bool template_extractor::visit_spread_expr(spread_expr* node) {
    result += "..";
    node->get_child()->accept(this);
    return true;
}

bool template_extractor::visit_initializer(initializer* node) {
    result += " {";
    for (auto i : node->get_field_pairs()) {
        i->accept(this);
        if (i!=node->get_field_pairs().back()) {
            result += ", ";
        }
    }
    result += "}";
    return true;
}

bool template_extractor::visit_call_head(call_head* node) {
    node->get_first_expression()->accept(this);
    if (node->has_func_call()) {
        node->get_func_call()->accept(this);
    }
    if (node->is_initializer()) {
        node->get_initializer()->accept(this);
    }
    return true;
}

bool template_extractor::visit_call_expr(call_expr* node) {
    switch (node->get_call_type()) {
        case call_expr::type::get_field: result += "."; break;
        case call_expr::type::get_path: result += "::"; break;
    }
    node->get_field_name()->accept(this);
    if (node->has_func_call()) {
        node->get_func_call()->accept(this);
    }
    if (node->is_initializer()) {
        node->get_initializer()->accept(this);
    }
    return true;
}

bool template_extractor::visit_call_root(call_root* node) {
    node->get_call_head()->accept(this);
    for (auto i : node->get_call_chain()) {
        i->accept(this);
    }
    return true;
}

bool template_extractor::visit_block_stmt(block_stmt* node) {
    result += "{";
    bool check_all_yield = true;
    for (auto i : node->get_statement()) {
        if (i->get_ast_class()!=ast_class::ac_ret_stmt ||
            !static_cast<ret_stmt*>(i)->is_yield()) {
            check_all_yield = false;
        }
    }
    if (check_all_yield) {
        result += "yield @@yieldFields@@}";
        return true;
    }
    for (auto i : node->get_statement()) {
        i->accept(this);
        if (i!=node->get_statement().back()) {
            result += " ";
        }
    }
    result += "}";
    return true;
}

bool template_extractor::visit_multi_use_stmt(multi_use_stmt* node) {
    result += "{";
    for (auto i : node->get_import_symbol()) {
        i->accept(this);
        if (i!=node->get_import_symbol().back()) {
            result += ", ";
        }
    }
    result += "}";
    return true;
}

bool template_extractor::visit_use_stmt(use_stmt* node) {
    result += "use ";
    for (auto i : node->get_path()) {
        i->accept(this);
        result += "::";
    }
    if (node->is_use_all()) {
        result += "*";
    } else {
        node->get_multi_use()->accept(this);
    }
    return true;
}

bool template_extractor::visit_let_stmt(let_stmt* node) {
    result += "let(";
    for (auto i : node->get_symbols()) {
        i->accept(this);
        if (i!=node->get_symbols().back()) {
            result += ", ";
        }
    }
    result += ") ";
    if (node->has_statement()) {
        node->get_code_block()->accept(this);
    } else {
        result += "{}";
    }
    return true;
}

bool template_extractor::visit_if_stmt(if_stmt* node) {
    switch (node->get_cond_type()) {
        case if_stmt::type::cond_if: result += "if"; break;
        case if_stmt::type::cond_elsif: result += "else if"; break;
        case if_stmt::type::cond_else: result += "else"; break;
    }
    if (node->has_condition()) {
        result += " (";
        node->get_condition()->accept(this);
        result += ") ";
    }
    if (node->has_statement()) {
        node->get_code_block()->accept(this);
    } else {
        result += "{}";
    }
    return true;
}

bool template_extractor::visit_cond_stmt(cond_stmt* node) {
    node->get_if_stmt()->accept(this);
    for (auto i : node->get_elsif_stmt()) {
        i->accept(this);
    }
    if (node->has_else_stmt()) {
        node->get_else_stmt()->accept(this);
    }
    return true;
}

bool template_extractor::visit_for_stmt(for_stmt* node) {
    result += "for(";
    for (auto i : node->get_symbols()) {
        i->accept(this);
        if (i!=node->get_symbols().back()) {
            result += ", ";
        }
    }
    result += ") ";
    if (node->has_statement()) {
        node->get_code_block()->accept(this);
    } else {
        result += "{}";
    }
    return true;
}

bool template_extractor::visit_match_pair(match_pair* node) {
    node->get_literal()->accept(this);
    result += " => ";
    node->get_statement()->accept(this);
    return true;
}

bool template_extractor::visit_match_stmt(match_stmt* node) {
    result += "match(";
    node->get_match_condition()->accept(this);
    result += ") {";
    for (auto i : node->get_match_pair_list()) {
        i->accept(this);
        if (i!=node->get_match_pair_list().back()) {
            result += ", ";
        }
    }
    result += "}";
    return true;
}

bool template_extractor::visit_ret_stmt(ret_stmt* node) {
    if (node->is_yield()) {
        result += "yield ";
    } else {
        result += "return ";
    }
    node->get_return_value()->accept(this);
    return true;
}

bool template_extractor::visit_fact_stmt([[maybe_unused]] fact_stmt* node) {
    result += "[COMPLETELY_LITERAL_DOMINATED_EXPRESSION]";
    return true;
}

bool template_extractor::visit_in_block_expr(in_block_expr* node) {
    node->get_expr()->accept(this);
    return true;
}

bool template_extractor::visit_annotation(annotation* node) {
    result += node->get_annotation();
    if (node->get_property_string().length()) {
        result += "(LITERAL)";
    }
    return true;
}

bool template_extractor::visit_type_def(type_def* node) {
    result += (node->is_set()? "*":"") + node->get_full_name();
    return true;
}

bool template_extractor::visit_database_table(database_table* node) {
    node->get_name()->accept(this);
    result += ": ";
    node->get_type()->accept(this);
    if (node->has_real_name()) {
        result += " as ";
        node->get_real_name()->accept(this);
    }
    return true;
}

bool template_extractor::visit_database_decl(database_decl* node) {
    result += "database ";
    node->get_name()->accept(this);
    result += " {";
    for (auto i : node->get_tables()) {
        i->accept(this);
        if (i!=node->get_tables().back()) {
            result += "; ";
        }
    }
    result += "}";
    return true;
}

bool template_extractor::visit_schema_field(schema_field* node) {
    node->get_annotation()->accept(this);
    if (node->get_annotation()->get_annotation().length()) {
        result += " ";
    }
    node->get_identifier()->accept(this);
    result += ": ";
    node->get_field_type()->accept(this);
    return true;
}

bool template_extractor::visit_schema_decl(schema_decl* node) {
    result += "schema ";
    node->get_name()->accept(this);
    if (node->has_parent()) {
        result += " extends ";
        node->get_parent_name()->accept(this);
    }
    result += " {";
    for (auto i : node->get_fields()) {
        i->accept(this);
        if (i!=node->get_fields().back()) {
            result += ", ";
        }
    }
    result += "}";
    return true;
}

bool template_extractor::visit_function_decl(function_decl* node) {
    for (auto i : node->get_annotations()) {
        i->accept(this);
        result += " ";
    }
    result += "fn ";
    node->get_name()->accept(this);
    result += "(";
    for (auto i : node->get_parameter_list()) {
        i->accept(this);
        if (i!=node->get_parameter_list().back()) {
            result += ", ";
        }
    }
    result += ")";
    if (node->has_return_value()) {
        result += " -> ";
        node->get_return_type()->accept(this);
    }
    if (node->implemented()) {
        node->get_code_block()->accept(this);
    } else {
        result += ";";
    }
    return true;
}

bool template_extractor::visit_enum_decl(enum_decl* node) {
    result += "enum ";
    node->get_name()->accept(this);
    result += " {";
    for (auto i : node->get_member()) {
        i->accept(this);
        if (i!=node->get_member().back()) {
            result += ", ";
        }
    }
    result += "}";
    return true;
}

bool template_extractor::visit_var_decl(var_decl* node) {
    node->get_var_name()->accept(this);
    if (node->has_declared_type()) {
        result += ": ";
        node->get_type()->accept(this);
    }
    if (node->has_init_value()) {
        result += " = ";
        node->get_init_value()->accept(this);
    }
    return true;
}

bool template_extractor::visit_impl_block(impl_block* node) {
    result += "impl ";
    node->get_impl_schema_name()->accept(this);
    result += " {";
    for (auto i : node->get_functions()) {
        i->accept(this);
        if (i!=node->get_functions().back()) {
            result += " ";
        }
    }
    result += "}";
    return true;
}

bool template_extractor::visit_query_column(query_column* node) {
    node->get_column_value()->accept(this);
    if (node->has_column_name()) {
        result += " as ";
        node->get_column_name()->accept(this);
    }
    return true;
}

void template_extractor::dump_query_from_list(query_decl* node) {
    result += "from ";
    for (auto i : node->get_from_list()) {
        i->accept(this);
        if (i!=node->get_from_list().back()) {
            result += ", ";
        }
    }
}

void template_extractor::dump_query_select_list(query_decl* node) {
    result += "select ";
    for (auto i : node->get_select_list()) {
        i->accept(this);
        if (i!=node->get_select_list().back()) {
            result += ", ";
        }
    }
}

bool template_extractor::visit_query_decl(query_decl* node) {
    result += "query ";
    node->get_name()->accept(this);
    result += " ";
    dump_query_from_list(node);
    if (node->has_condition()) {
        result += " where ";
        node->get_where_condition()->accept(this);
    }
    result += " ";
    dump_query_select_list(node);
    return true;
}

bool location_extractor::visit_impl_block(impl_block* node) {
    impls.push_back(node);
    schema_name = node->get_impl_schema_name()->get_name();
    node->get_impl_schema_name()->accept(this);
    for(auto i : node->get_functions()) {
        i->accept(this);
    }
    schema_name = "";
    return true;
}

bool location_extractor::visit_schema_decl(schema_decl* node) {
    schemas.push_back(node);
    node->get_name()->accept(this);
    if (node->has_parent()) {
        node->get_parent_name()->accept(this);
    }
    for(auto i : node->get_fields()) {
        i->accept(this);
    }
    return true;
}

bool location_extractor::visit_function_decl(function_decl* node) {
    funcs.push_back({schema_name, node});
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

std::string location_extractor::location_dump(const span& loc) {
    std::string res = "{\"filename\":\"" + loc.file + "\",";
    res += "\"begin_line\":" + std::to_string(loc.start_line) + ",";
    res += "\"begin_column\":" + std::to_string(loc.start_column) + ",";
    res += "\"end_line\":" + std::to_string(loc.end_line) + ",";
    res += "\"end_column\":" + std::to_string(loc.end_column) + "}";
    return res;
}

void location_extractor::output(ast_root* root, const std::string& file) {
    schema_name = "";
    impls = {};
    funcs = {};
    root->accept(this);

    std::string res = "{";
    res += "\"impl\": [";
    for(auto i : impls) {
        res += "{";
        res += "\"name\":\"" + i->get_impl_schema_name()->get_name() + "\",";
        res += "\"location\":" + location_dump(i->get_location());
        res += "},";
    }
    if (res.back()==',') {
        res.pop_back();
    }
    res += "],";
    res += "\"schema\": [";
    for(auto i : schemas) {
        res += "{";
        res += "\"name\":\"" + i->get_name()->get_name() + "\",";
        res += "\"location\":" + location_dump(i->get_location());
        res += "},";
    }
    if (res.back()==',') {
        res.pop_back();
    }
    res += "],";
    res += "\"funcs\": [";
    for(auto i : funcs) {
        res += "{";
        res += "\"name\":\"" + i.second->get_name()->get_name() + "\",";
        res += "\"schema\":\"" + i.first + "\",";
        res += "\"location\":" + location_dump(i.second->get_location());
        res += "},";
    }
    if (res.back()==',') {
        res.pop_back();
    }
    res += "]}";

    std::ofstream(file) << res;
}

}