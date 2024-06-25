#pragma once

#include "godel-frontend/src/error/error.h"
#include "godel-frontend/src/symbol.h"

#include <cstdint>
#include <cstring>
#include <sstream>
#include <vector>

namespace godel {

using report::span;

enum class ast_class {
    ac_root, // ast root

    ac_null,             // null/empty node
    ac_number_literal,   // number literal
    ac_string_literal,   // string literal
    ac_boolean_literal,  // boolean literal
    ac_identifier,       // identifier
    ac_unary_operator,   // unary operator
    ac_binary_operator,  // binary operator
    ac_call_expr,        // call chain node expression
    ac_call_head,        // first node if whole call expression
    ac_call_root,        // call expression ast root
    ac_func_call,        // function call
    ac_initializer_pair, // pair of initializer
    ac_spread_expr,      // spread expression, like: `..identifier`
    ac_initializer,      // initializer/constructor

    ac_block_stmt,    // code block
    ac_multi_use,     // multiple(explicit symbol import) use statement
    ac_use_stmt,      // use statement
    ac_let_stmt,      // let statement
    ac_if_stmt,       // if statement
    ac_cond_stmt,     // condition statement
    ac_for_stmt,      // for statement
    ac_match_pair,    // pair of match expression
    ac_match_stmt,    // match statement
    ac_ret_stmt,      // return statement
    ac_fact_data,     // fact data
    ac_fact_stmt,     // fact statement
    ac_in_block_expr, // in block expression

    ac_annotation,     // annotation
    ac_type_def,       // type definition
    ac_database_table, // database table
    ac_database_decl,  // database declaration
    ac_schema_field,   // schema field
    ac_schema_decl,    // schema declaration
    ac_function_decl,  // function declaration
    ac_enum_decl,      // enum declaration
    ac_var_decl,       // variable declaration
    ac_impl_block,     // implementation block
    ac_query_column,   // query column
    ac_query_decl      // query declaration
};

// basic visitor class
class ast_visitor;

// basic ast node class
class ast_node {
public:
    ast_node(const ast_node&) = delete;
    ast_node& operator=(const ast_node&) = delete;

protected:
    ast_class ac;
    span loc;
    infer resolve;

protected:
    // report fatal error in ast structure
    void fatal_error(const std::string& info) {
        std::cerr << "fatal error at file " << loc.file << ":";
        std::cerr << loc.start_line << ":" << loc.start_column << ":\n";
        std::cerr << "  " << info << "\n\n";
        std::exit(-1);
    }

public:
    ast_node(ast_class ast_class, const span& location):
        ac(ast_class), loc(location), resolve(infer::error()) {}
    virtual ~ast_node() = default;

    auto get_ast_class() const { return ac; }
    const auto& get_location() const { return loc; }
    const auto& get_file() const { return loc.file; }
    const auto& get_resolve() const { return resolve; }

    void update_location(const span& l) {
        if (loc.start_line>l.start_line) {
            loc.start_line = l.start_line;
            loc.start_column = l.start_column;
        } else if (loc.start_line==l.start_line &&
            loc.start_column>l.start_column) {
            loc.start_column = l.start_column;
        }
        if (loc.end_line<l.end_line) {
            loc.end_line = l.end_line;
            loc.end_column = l.end_column;
        } else if (loc.end_line==l.end_line &&
            loc.end_column<l.end_column) {
            loc.end_column = l.end_column;
        }
    }

    void set_start_line(uint32_t n) { loc.start_line = n; }
    void set_start_column(uint32_t n) { loc.start_column = n; }
    void set_end_line(uint32_t n) { loc.end_line = n; }
    void set_end_column(uint32_t n) { loc.end_column = n; }
    void set_file(const std::string& f) { loc.file = f; }
    void set_resolve(const infer& rt) { resolve = rt; }

    virtual void accept(ast_visitor* visitor) = 0;
}; // end class ast_node

// decl
class decl;
class annotation;
class type_def;
class database_table;
class database_decl;
class schema_field;
class schema_decl;
class function_decl;
class enum_decl;
class var_decl;
class impl_block;
class query_column;
class query_decl;

// expr
class expr;
class ast_null;
class number_literal;
class string_literal;
class boolean_literal;
class identifier;
class unary_operator;
class binary_operator;
class func_call;
class initializer_pair;
class spread_expr;
class initializer;
class call_head;
class call_expr;
class call_root;

// stmt
class stmt;
class block_stmt;
class multi_use_stmt;
class use_stmt;
class let_stmt;
class if_stmt;
class cond_stmt;
class for_stmt;
class match_pair;
class match_stmt;
class ret_stmt;
class fact_data;
class fact_stmt;
class in_block_expr;

} // end namespace godel