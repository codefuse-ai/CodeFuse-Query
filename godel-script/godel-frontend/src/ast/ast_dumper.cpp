#include "godel-frontend/src/ast/ast_dumper.h"

#include <sstream>

namespace godel {

std::string ast_dumper::format_pointer(ast_node* node) {
    std::stringstream ss;
    ss << light_yellow << node << reset;
    return ss.str();
}

std::string ast_dumper::format_resolve(ast_node* node) {
    if (node->get_resolve().type.is_err()) {
        return "";
    }
    std::stringstream ss;
    ss << light_green << " <\"";
    ss << "resolve: " << node->get_resolve().type.full_path_name();
    ss << "\">" << reset;
    return ss.str();
}

std::string ast_dumper::format_location(const span& location) {
    std::stringstream ss;
    ss << light_grey << " <" << location.file << ":"
        << location.start_line << ":"
        << location.start_column + 1 << ">"
        << reset << "\n";
    return ss.str();
}

std::string ast_dumper::format_string(const std::string& str) {
    std::stringstream ss;
    ss << light_green << str << reset;
    return ss.str();
}

std::string ast_dumper::format_identifier(const std::string& str) {
    std::stringstream ss;
    ss << light_cyan << str << reset;
    return ss.str();
}

std::string ast_dumper::format_annotation(const std::string& str) {
    std::stringstream ss;
    ss << light_red << str << reset;
    return ss.str();
}

std::string ast_dumper::format_number(const int64_t num) {
    std::stringstream ss;
    ss << light_red << num << reset;
    return ss.str();
}

std::string ast_dumper::format_number(const float num) {
    std::stringstream ss;
    ss << light_red << num << reset;
    return ss.str();
}

std::string ast_dumper::format_decl(const std::string& str) {
    std::stringstream ss;
    ss << cyan << str << reset;
    return ss.str();
}

std::string ast_dumper::format_expr(const std::string& str) {
    std::stringstream ss;
    ss << green << str << reset;
    return ss.str();
}

std::string ast_dumper::format_stmt(const std::string& str) {
    std::stringstream ss;
    ss << purple << str << reset;
    return ss.str();
}

std::string ast_dumper::format_operator(const std::string& str) {
    std::stringstream ss;
    ss << red << str << reset;
    return ss.str();
}

std::string ast_dumper::format_lambda(const std::string& str) {
    std::stringstream ss;
    ss << purple << str << reset;
    return ss.str();
}

bool ast_dumper::visit_ast_root(ast_root* node) {
    indent.dump();
    os << format_stmt("AbstractSyntaxTreeRoot ") << format_pointer(node);
    os << format_resolve(node) << format_location(node->get_location());
    indent.push();
    for(auto i : node->get_use_statements()) {
        if (i == node->get_use_statements().back() &&
            !node->get_declarations().size()) {
            indent.set_last();
        }
        i->accept(this);
    }
    for(auto i : node->get_declarations()) {
        if (i == node->get_declarations().back()) {
            indent.set_last();
        }
        i->accept(this);
    }
    indent.pop();
    return true;
}

bool ast_dumper::visit_ast_null(ast_null* node) {
    indent.dump();
    os << "Null " << format_pointer(node);
    os << format_resolve(node) << format_location(node->get_location());
    return true;
}

bool ast_dumper::visit_number_literal(number_literal* node) {
    indent.dump();
    os << format_expr("NumberLiteral ") << format_pointer(node) << " ";
    if (node->is_integer()) {
        os << format_number(node->get_integer());
    } else {
        os << format_number(node->get_float());
    }
    os << format_resolve(node) << format_location(node->get_location());
    return true;
}

bool ast_dumper::visit_string_literal(string_literal* node) {
    indent.dump();
    os << format_expr("StringLiteral ") << format_pointer(node);
    os << " " << format_string(node->get_literal());
    os << format_resolve(node) << format_location(node->get_location());
    return true;
}

bool ast_dumper::visit_boolean_literal(boolean_literal* node) {
    indent.dump();
    os << format_expr("BooleanLiteral ") << format_pointer(node);
    os << " " << format_identifier(node->get_flag()? "true":"false");
    os << format_resolve(node) << format_location(node->get_location());
    return true;
}

bool ast_dumper::visit_identifier(identifier* node) {
    indent.dump();
    os << format_expr("Identifier ") << format_pointer(node);
    os << " " << format_identifier(node->get_name());
    os << format_resolve(node) << format_location(node->get_location());
    return true;
}

bool ast_dumper::visit_unary_operator(unary_operator* node) {
    indent.dump();
    os << format_operator("UnaryOperator ");
    switch(node->get_operator_type()) {
        case unary_operator::type::arithmetic_negation:
            os << format_operator("-"); break;
        case unary_operator::type::logical_negation:
            os << format_operator("!"); break;
    }
    os << " " << format_pointer(node);
    os << format_resolve(node) << format_location(node->get_location());
    indent.push();
    indent.set_last();
    node->get_child()->accept(this);
    indent.pop();
    return true;
}

bool ast_dumper::visit_binary_operator(binary_operator* node) {
    indent.dump();
    os << format_operator("BinaryOperator ");
    switch(node->get_operator_type()) {
        case binary_operator::type::compare_equal:
            os << format_operator("="); break;
        case binary_operator::type::compare_great:
            os << format_operator(">"); break;
        case binary_operator::type::compare_great_equal:
            os << format_operator(">="); break;
        case binary_operator::type::compare_less:
            os << format_operator("<"); break;
        case binary_operator::type::compare_less_equal:
            os << format_operator("<="); break;
        case binary_operator::type::compare_not_equal:
            os << format_operator("!="); break;
        case binary_operator::type::logical_and:
            os << format_operator("&&"); break;
        case binary_operator::type::logical_or:
            os << format_operator("||"); break;
        case binary_operator::type::add:
            os << format_operator("+"); break;
        case binary_operator::type::sub:
            os << format_operator("-"); break;
        case binary_operator::type::mult:
            os << format_operator("*"); break;
        case binary_operator::type::div:
            os << format_operator("/"); break;
        case binary_operator::type::in:
            os << format_operator("in"); break;
    }
    os << " " << format_pointer(node);
    os << format_resolve(node) << format_location(node->get_location());
    indent.push();
    node->get_left()->accept(this);
    indent.set_last();
    node->get_right()->accept(this);
    indent.pop();
    return true;
}

bool ast_dumper::visit_func_call(func_call* node) {
    indent.dump();
    os << format_expr("FunctionCall ") << format_pointer(node);
    os << format_resolve(node) << format_location(node->get_location());
    indent.push();
    for(auto i : node->get_arguments()) {
        if (i == node->get_arguments().back()) {
            indent.set_last();
        }
        i->accept(this);
    }
    indent.pop();
    return true;
}

bool ast_dumper::visit_initializer_pair(initializer_pair* node) {
    indent.dump();
    os << format_expr("InitializerPair ") << format_pointer(node) << " ";
    os << format_identifier(node->get_field_name()->get_name());
    os << format_resolve(node) << format_location(node->get_location());
    indent.push();
    indent.set_last();
    node->get_field_value()->accept(this);
    indent.pop();
    return true;
}

bool ast_dumper::visit_spread_expr(spread_expr* node) {
    indent.dump();
    os << format_expr("SpreadExpr ") << format_pointer(node);
    os << format_resolve(node) << format_location(node->get_location());
    indent.push();
    indent.set_last();
    node->get_child()->accept(this);
    indent.pop();
    return true;
}

bool ast_dumper::visit_initializer(initializer* node) {
    indent.dump();
    os << format_expr("Initializer ") << format_pointer(node);
    os << format_resolve(node) << format_location(node->get_location());
    indent.push();
    for(auto i : node->get_field_pairs()) {
        if (i == node->get_field_pairs().back() &&
            node->get_spread_exprs().empty()) {
            indent.set_last();
        }
        i->accept(this);
    }
    for(auto i : node->get_spread_exprs()) {
        if (i == node->get_spread_exprs().back()) {
            indent.set_last();
        }
        i->accept(this);
    }
    indent.pop();
    return true;
}

bool ast_dumper::visit_call_head(call_head* node) {
    indent.dump();
    os << format_expr("CallHead ") << format_pointer(node);
    os << format_resolve(node) << format_location(node->get_location());
    indent.push();
    if (!node->has_func_call() && !node->is_initializer()) {
        indent.set_last();
    }
    node->get_first_expression()->accept(this);
    if (!node->is_initializer()) {
        indent.set_last();
    }
    if (node->has_func_call()) {
        node->get_func_call()->accept(this);
    }
    if (node->is_initializer()) {
        indent.set_last();
        node->get_initializer()->accept(this);
    }
    indent.pop();
    return true;
}

bool ast_dumper::visit_call_expr(call_expr* node) {
    indent.dump();
    switch(node->get_call_type()) {
        case call_expr::type::get_field: os << format_expr("GetField "); break;
        case call_expr::type::get_path: os << format_expr("GetPath "); break;
    }
    os << format_pointer(node);
    os << " " << format_identifier(node->get_field_name()->get_name());
    os << format_resolve(node) << format_location(node->get_location());
    indent.push();
    if (node->is_generic()) {
        if (!node->has_func_call() && !node->is_initializer()) {
            indent.set_last();
        }
        node->get_generic_type()->accept(this);
    }
    if (node->has_func_call()) {
        indent.set_last();
        node->get_func_call()->accept(this);
    }
    if (node->is_initializer()) {
        indent.set_last();
        node->get_initializer()->accept(this);
    }
    indent.pop();
    return true;
}

bool ast_dumper::visit_call_root(call_root* node) {
    indent.dump();
    os << format_expr("CallRoot ") << format_pointer(node);
    os << format_resolve(node) << format_location(node->get_location());
    indent.push();
    if (!node->get_call_chain().size()) {
        indent.set_last();
    }
    node->get_call_head()->accept(this);
    for(auto i : node->get_call_chain()) {
        if (i == node->get_call_chain().back()) {
            indent.set_last();
        }
        i->accept(this);
    }
    indent.pop();
    return true;
}

bool ast_dumper::visit_block_stmt(block_stmt* node) {
    indent.dump();
    os << format_stmt("CodeBlock ") << format_pointer(node);
    os << format_resolve(node) << format_location(node->get_location());
    indent.push();
    for(auto i : node->get_statement()) {
        if (i == node->get_statement().back()) {
            indent.set_last();
        }
        i->accept(this);
    }
    indent.pop();
    return true;
}

bool ast_dumper::visit_multi_use_stmt(multi_use_stmt* node) {
    indent.dump();
    os << format_stmt("MultipleUseStmt ") << format_pointer(node);
    os << format_resolve(node) << format_location(node->get_location());
    indent.push();
    for(auto i : node->get_import_symbol()) {
        if (i == node->get_import_symbol().back()) {
            indent.set_last();
        }
        i->accept(this);
    }
    indent.pop();
    return true;
}

bool ast_dumper::visit_use_stmt(use_stmt* node) {
    indent.dump();
    os << format_stmt("UseStmt ") << format_pointer(node);
    os << format_resolve(node) << format_location(node->get_location());
    indent.push();
    for(auto i : node->get_path()) {
        i->accept(this);
    }
    if (node->is_use_all()) {
        indent.set_last();
        indent.dump();
        os << format_stmt("ImportAllSymbols ") << format_pointer(node);
        os << format_resolve(node) << format_location(node->get_location());
    } else {
        indent.set_last();
        node->get_multi_use()->accept(this);
    }
    indent.pop();
    return true;
}

bool ast_dumper::visit_let_stmt(let_stmt* node) {
    indent.dump();
    os << format_stmt("LetStmt ") << format_pointer(node);
    os << format_resolve(node) << format_location(node->get_location());
    indent.push();
    for(auto i : node->get_symbols()) {
        if (i == node->get_symbols().back() && !node->has_statement()) {
            indent.set_last();
        }
        i->accept(this);
    }
    if (node->has_statement()) {
        indent.set_last();
        node->get_code_block()->accept(this);
    }
    indent.pop();
    return true;
}

bool ast_dumper::visit_if_stmt(if_stmt* node) {
    indent.dump();
    switch(node->get_cond_type()) {
        case if_stmt::type::cond_if:
            os << format_stmt("IfStmt"); break;
        case if_stmt::type::cond_elsif:
            os << format_stmt("ElseIfStmt"); break;
        case if_stmt::type::cond_else:
            os << format_stmt("ElseStmt"); break;
    }
    os << " " << format_pointer(node) << format_location(node->get_location());
    indent.push();
    if (!node->has_statement()) {
        indent.set_last();
    }
    if (node->has_condition()) {
        node->get_condition()->accept(this);
    }
    if (node->has_statement()) {
        indent.set_last();
        node->get_code_block()->accept(this);
    }
    indent.pop();
    return true;
}

bool ast_dumper::visit_cond_stmt(cond_stmt* node) {
    indent.dump();
    os << format_stmt("ConditionStmt ") << format_pointer(node);
    os << format_resolve(node) << format_location(node->get_location());
    indent.push();
    if (!node->get_elsif_stmt().size() && !node->has_else_stmt()) {
        indent.set_last();
    }
    node->get_if_stmt()->accept(this);
    for(auto i : node->get_elsif_stmt()) {
        if (i == node->get_elsif_stmt().back() && !node->has_else_stmt()) {
            indent.set_last();
        }
        i->accept(this);
    }
    if (node->has_else_stmt()) {
        indent.set_last();
        node->get_else_stmt()->accept(this);
    }
    indent.pop();
    return true;
}

bool ast_dumper::visit_for_stmt(for_stmt* node) {
    indent.dump();
    os << format_stmt("ForStmt ") << format_pointer(node);
    os << format_resolve(node) << format_location(node->get_location());
    indent.push();
    for(auto i : node->get_symbols()) {
        if (i == node->get_symbols().back() && !node->has_statement()) {
            indent.set_last();
        }
        i->accept(this);
    }
    if (node->has_statement()) {
        indent.set_last();
        node->get_code_block()->accept(this);
    }
    indent.pop();
    return true;
}

bool ast_dumper::visit_match_pair(match_pair* node) {
    indent.dump();
    os << format_stmt("MatchPair ") << format_pointer(node);
    os << format_resolve(node) << format_location(node->get_location());
    indent.push();
    node->get_literal()->accept(this);
    indent.set_last();
    node->get_statement()->accept(this);
    indent.pop();
    return true;
}

bool ast_dumper::visit_match_stmt(match_stmt* node) {
    indent.dump();
    os << format_stmt("MatchStmt ") << format_pointer(node);
    os << format_resolve(node) << format_location(node->get_location());
    indent.push();
    if (!node->get_match_pair_list().size()) {
        indent.set_last();
    }
    node->get_match_condition()->accept(this);
    for(auto i : node->get_match_pair_list()) {
        if (i == node->get_match_pair_list().back()) {
            indent.set_last();
        }
        i->accept(this);
    }
    indent.pop();
    return true;
}

bool ast_dumper::visit_ret_stmt(ret_stmt* node) {
    indent.dump();
    os << format_stmt("ReturnStmt ") << format_pointer(node) << " ";
    os << format_identifier(node->is_yield()? "yield":"return");
    os << format_resolve(node) << format_location(node->get_location());
    indent.push();
    indent.set_last();
    node->get_return_value()->accept(this);
    indent.pop();
    return true;
}

bool ast_dumper::visit_fact_data(fact_data* node) {
    indent.dump();
    os << format_stmt("FactData ") << format_pointer(node);
    os << format_resolve(node) << format_location(node->get_location());
    indent.push();
    for(auto i : node->get_literals()) {
        if (i == node->get_literals().back()) {
            indent.set_last();
        }
        i->accept(this);
    }
    indent.pop();
    return true;
}

bool ast_dumper::visit_fact_stmt(fact_stmt* node) {
    indent.dump();
    os << format_stmt("FactStmt ") << format_pointer(node);
    os << format_resolve(node) << format_location(node->get_location());
    indent.push();
    for(auto i : node->get_facts()) {
        if (i == node->get_facts().back()) {
            indent.set_last();
        }
        i->accept(this);
    }
    indent.pop();
    return true;
}

bool ast_dumper::visit_in_block_expr(in_block_expr* node) {
    indent.dump();
    os << format_stmt("InBlockExpr ") << format_pointer(node);
    os << format_resolve(node) << format_location(node->get_location());
    indent.push();
    indent.set_last();
    node->get_expr()->accept(this);
    indent.pop();
    return true;
}

bool ast_dumper::visit_annotation(annotation* node) {
    indent.dump();
    os << format_decl("Annotation ") << format_pointer(node) << " ";
    if (node->get_annotation().length()) {
        os << format_annotation(node->get_annotation());
    } else {
        os << format_annotation("<empty>");
    }
    if (node->get_ordered_properties().size()) {
        os << format_annotation("(" );
        for(const auto& i : node->get_ordered_properties()) {
            os << format_identifier(i.first);
            os << format_annotation("=");
            os << format_string(i.second);
            if (i != node->get_ordered_properties().back()) {
                os << format_annotation(", ");
            }
        }
        os << format_annotation(")");
    }
    if (node->get_property_string().length()) {
        os << format_annotation("(" );
        os << format_string(node->get_property_string());
        os << format_annotation(")");
    }
    os << format_resolve(node) << format_location(node->get_location());
    return true;
}

bool ast_dumper::visit_type_def(type_def* node) {
    indent.dump();
    os << format_decl("TypeDef ") << format_pointer(node) << " ";
    os << format_string((node->is_set()? "\"*":"\"") + node->get_full_name() + "\"");
    os << format_resolve(node) << format_location(node->get_location());
    return true;
}

bool ast_dumper::visit_database_table(database_table* node) {
    indent.dump();
    os << format_decl("DatabaseTable ") << format_pointer(node) << " ";
    os << format_identifier(node->get_name()->get_name());
    os << " " << format_string(
        (node->get_type()->is_set()? "\"*":"\"") +
        node->get_type()->get_full_name() + "\"");
    if (node->has_real_name()) {
        os << " " << format_annotation(node->get_real_name()->get_literal());
    }
    os << format_resolve(node) << format_location(node->get_location());
    return true;
}

bool ast_dumper::visit_database_decl(database_decl* node) {
    indent.dump();
    os << format_decl("DatabaseDecl ") << format_pointer(node) << " ";
    os << format_identifier(node->get_name()->get_name());
    os << format_resolve(node) << format_location(node->get_location());
    indent.push();
    for(auto i : node->get_tables()) {
        if (i == node->get_tables().back()) {
            indent.set_last();
        }
        i->accept(this);
    }
    indent.pop();
    return true;
}

bool ast_dumper::visit_schema_field(schema_field* node) {
    indent.dump();
    os << format_decl("Field ") << format_pointer(node) << " ";
    os << format_identifier(node->get_identifier()->get_name());
    os << " " << format_string(
        (node->get_field_type()->is_set()? "\"*":"\"") +
        node->get_field_type()->get_full_name() + "\"");
    if (node->get_annotation()->get_annotation().length()) {
        os << format_annotation(
            " \"" + node->get_annotation()->get_annotation() + "\"");
    } else {
        os << format_annotation(" \"<annotation: empty>\"");
    }
    os << format_resolve(node) << format_location(node->get_location());
    return true;
}

bool ast_dumper::visit_schema_decl(schema_decl* node) {
    indent.dump();
    os << format_decl("SchemaDecl ") << format_pointer(node) << " ";
    os << format_identifier(node->get_name()->get_name());
    os << format_resolve(node) << format_location(node->get_location());
    indent.push();
    if (!node->get_fields().size()) {
        indent.set_last();
    }
    if (node->has_parent()) {
        node->get_parent_name()->accept(this);
    }
    for(auto i : node->get_fields()) {
        if (i == node->get_fields().back()) {
            indent.set_last();
        }
        i->accept(this);
    }
    indent.pop();
    return true;
}

bool ast_dumper::visit_function_decl(function_decl* node) {
    indent.dump();
    os << format_decl("FunctionDecl ") << format_pointer(node) << " ";
    if (node->is_public()) {
        os << format_annotation("public ");
    }
    os << format_identifier(node->get_name()->get_name());
    os << format_resolve(node) << format_location(node->get_location());
    indent.push();
    for(auto i : node->get_annotations()) {
        i->accept(this);
    }
    if (!node->has_return_value() && !node->implemented()) {
        indent.set_last();
    }
    indent.dump();
    os << format_expr("Parameter ") << format_pointer(node);
    os << format_resolve(node) << format_location(node->get_location());
    indent.push();
    for(auto i : node->get_parameter_list()) {
        if (i == node->get_parameter_list().back()) {
            indent.set_last();
        }
        i->accept(this);
    }
    indent.pop();
    if (!node->implemented()) {
        indent.set_last();
    }
    if (node->has_return_value()) {
        node->get_return_type()->accept(this);
    }
    if (node->implemented()) {
        indent.set_last();
        node->get_code_block()->accept(this);
    }
    indent.pop();
    return true;
}

bool ast_dumper::visit_enum_decl(enum_decl* node) {
    indent.dump();
    os << format_decl("EnumDecl ") << format_pointer(node) << " ";
    os << format_identifier(node->get_name()->get_name());
    os << format_resolve(node) << format_location(node->get_location());
    indent.push();
    for(auto i : node->get_member()) {
        if (i == node->get_member().back()) {
            indent.set_last();
        }
        i->accept(this);
    }
    indent.pop();
    return true;
}

bool ast_dumper::visit_var_decl(var_decl* node) {
    indent.dump();
    os << format_decl("VariableDecl ") << format_pointer(node);
    os << " " << format_identifier(node->get_var_name()->get_name());
    if (node->has_declared_type()) {
        const auto type_node = node->get_type();
        os << " " << format_string(
            (type_node->is_set()? "\"*":"\"") +
            type_node->get_full_name() + "\""
        );
    }
    os << format_resolve(node) << format_location(node->get_location());

    indent.push();
    if (node->has_init_value()) {
        indent.set_last();
        node->get_init_value()->accept(this);
    }
    indent.pop();
    return true;
}

bool ast_dumper::visit_impl_block(impl_block* node) {
    indent.dump();
    os << format_decl("Implement ") << format_pointer(node) << " ";
    os << format_identifier(node->get_impl_schema_name()->get_name());
    os << format_resolve(node) << format_location(node->get_location());
    indent.push();
    if (!node->get_functions().size()) {
        indent.set_last();
    }

    for(auto i : node->get_functions()) {
        if (i == node->get_functions().back()) {
            indent.set_last();
        }
        i->accept(this);
    }
    indent.pop();
    return true;
}

bool ast_dumper::visit_query_column(query_column* node) {
    indent.dump();
    os << format_decl("QueryColumn ") << format_pointer(node);
    if (node->has_column_name()) {
        os << " " << format_identifier(node->get_column_name()->get_name());
    }
    os << format_resolve(node) << format_location(node->get_location());
    indent.push();
    indent.set_last();
    node->get_column_value()->accept(this);
    indent.pop();
    return true;
}

void ast_dumper::dump_query_from_list(query_decl* node) {
    indent.dump();
    os << format_decl("QueryFromList ") << format_pointer(node);
    os << format_resolve(node) << format_location(node->get_location());
    indent.push();
    for(auto i : node->get_from_list()) {
        if (i == node->get_from_list().back()) {
            indent.set_last();
        }
        i->accept(this);
    }
    indent.pop();
}

void ast_dumper::dump_query_select_list(query_decl* node) {
    indent.dump();
    os << format_decl("QuerySelectList ") << format_pointer(node);
    os << format_resolve(node) << format_location(node->get_location());
    indent.push();
    for(auto i : node->get_select_list()) {
        if (i == node->get_select_list().back()) {
            indent.set_last();
        }
        i->accept(this);
    }
    indent.pop();
}

bool ast_dumper::visit_query_decl(query_decl* node) {
    indent.dump();
    os << format_decl("QueryDecl ") << format_pointer(node);
    os << " " << format_identifier(node->get_name()->get_name());
    os << format_resolve(node) << format_location(node->get_location());
    indent.push();
    dump_query_from_list(node);
    if (node->has_condition()) {
        node->get_where_condition()->accept(this);
    }
    indent.set_last();
    dump_query_select_list(node);
    indent.pop();
    return true;
}

} // end namespace godel