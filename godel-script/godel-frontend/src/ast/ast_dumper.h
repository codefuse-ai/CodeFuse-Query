#pragma once

#include "godel-frontend/src/ast/ast_visitor.h"
#include "godel-frontend/src/error/error.h"
#include "godel-frontend/src/util/util.h"

#include <iostream>
#include <vector>
#include <cstring>
#include <sstream>

namespace godel {

using report::span;
using util::reset;
using util::light_yellow;
using util::light_green;
using util::light_grey;
using util::light_cyan;
using util::light_red;
using util::cyan;
using util::green;
using util::purple;
using util::red;

class indentation {
private:
    std::ostream &os;
    std::vector<std::string> indent;
    std::vector<bool> last;

public:
    indentation(std::ostream& out): os(out) {}
    void dump() {
        if (indent.size() && last.size()) {
            indent.back() = last.back() ? "+-" : "|-";
        }
        for(const auto& i : indent) {
            os << i;
        }
        if (indent.size() && last.size()) {
            indent.back() = last.back() ? "  " : "| ";
        }
    }
    
    void push() {
        indent.push_back("| ");
        last.push_back(false);
    }

    void pop() {
        indent.pop_back();
        last.pop_back();
    }

    void set_last() {
        last.back() = true;
    }
};

class ast_dumper: public ast_visitor {
private:
    std::ostream &os;
    indentation indent;

private:
    std::string format_pointer(ast_node*);
    std::string format_resolve(ast_node*);
    std::string format_location(const span&);
    std::string format_string(const std::string&);
    std::string format_identifier(const std::string&);
    std::string format_annotation(const std::string&);
    std::string format_number(const int64_t);
    std::string format_number(const float);
    std::string format_decl(const std::string&);
    std::string format_expr(const std::string&);
    std::string format_stmt(const std::string&);
    std::string format_operator(const std::string&);
    std::string format_lambda(const std::string&);

public:
    ast_dumper(std::ostream &out): os(out), indent(out) {}

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
    bool visit_fact_data(fact_data*) override;
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

public:
    void dump_query_from_list(query_decl*);
    void dump_query_select_list(query_decl*);
    bool visit_query_decl(query_decl*) override;
};

} // end namespace godel