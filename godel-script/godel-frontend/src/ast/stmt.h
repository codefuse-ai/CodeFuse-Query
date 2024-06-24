#pragma once

#include "godel-frontend/src/ast/ast_node.h"
#include "godel-frontend/src/ast/expr.h"

#include <cstdint>
#include <cstring>
#include <sstream>
#include <cassert>
#include <vector>

namespace godel {

// stmt class
class stmt: public ast_node {
public:
    stmt(const stmt&) = delete;
    stmt& operator=(const stmt&) = delete;

public:
    stmt(ast_class ast_class, const span &location):
        ast_node(ast_class, location) {}
    virtual ~stmt() override = default;
    void accept(ast_visitor* visitor) override;
}; // end class stmt


// stmt class block_stmt
class block_stmt: public stmt {
public:
    block_stmt(const block_stmt&) = delete;
    block_stmt& operator=(const block_stmt&) = delete;

private:
    std::vector<stmt*> statements;

public:
    block_stmt(const span& location):
        stmt(ast_class::ac_block_stmt, location) {}
    ~block_stmt() override;
    void add_statement(stmt* node) { statements.push_back(node); }

    auto& get_statement() { return statements; }

    void accept(ast_visitor* visitor) override;
}; // end class block_stmt


// stmt class multi_use_stmt
class multi_use_stmt: public stmt {
public:
    multi_use_stmt(const multi_use_stmt&) = delete;
    multi_use_stmt& operator=(const multi_use_stmt&) = delete;

private:
    std::vector<identifier*> symbols;

public:
    multi_use_stmt(const span& location):
        stmt(ast_class::ac_multi_use, location) {}
    ~multi_use_stmt() override;
    void add_import_symbol(identifier* node) { symbols.push_back(node); }

    auto& get_import_symbol() { return symbols; }

    void accept(ast_visitor* visitor) override;
}; // end class multi_use_stmt


// stmt class use_stmt
class use_stmt: public stmt {
public:
    use_stmt(const use_stmt&) = delete;
    use_stmt& operator=(const use_stmt&) = delete;

private:
    std::vector<identifier*> path;
    bool use_all;
    multi_use_stmt* multi_use;

public:
    use_stmt(const span& location):
        stmt(ast_class::ac_use_stmt, location),
        use_all(false), multi_use(nullptr) {}
    ~use_stmt() override;
    void add_path(identifier* node) { path.push_back(node); }
    void set_use_all() { use_all = true; }
    void set_multi_use(multi_use_stmt* node) { multi_use = node; }

    auto& get_path() { return path; }
    bool is_use_all() const { return use_all; }
    multi_use_stmt* get_multi_use() { return multi_use; }

    void accept(ast_visitor* visitor) override;
}; // end class use_stmt


// stmt class let_stmt
class let_stmt: public stmt {
public:
    let_stmt(const let_stmt&) = delete;
    let_stmt& operator=(const let_stmt&) = delete;

private:
    std::vector<var_decl*> symbol;
    block_stmt* block;

public:
    let_stmt(const span& location):
        stmt(ast_class::ac_let_stmt, location),
        block(nullptr) {}
    ~let_stmt() override;
    void add_symbol(var_decl* node) { symbol.push_back(node); }
    void set_code_block(block_stmt* node) { block = node; }

    auto& get_symbols() { return symbol; }
    bool has_statement() const { return block!=nullptr; }
    block_stmt* get_code_block() { return block; }

    void accept(ast_visitor* visitor) override;
}; // end class let_stmt


// stmt class if_stmt
class if_stmt: public stmt {
public:
    enum class type {
        cond_if,
        cond_elsif,
        cond_else
    };

public:
    if_stmt(const if_stmt&) = delete;
    if_stmt& operator=(const if_stmt&) = delete;

private:
    type ctype;
    expr* condition;
    block_stmt* block;

public:
    if_stmt(const span& location, type cond_type):
        stmt(ast_class::ac_if_stmt, location),
        ctype(cond_type), condition(nullptr), block(nullptr) {}
    ~if_stmt() override;
    void set_condition(expr* node) { condition = node; }
    void set_code_block(block_stmt* node) { block = node; }

    type get_cond_type() const { return ctype; }
    bool has_condition() const { return condition!=nullptr; }
    expr* get_condition() { return condition; }
    bool has_statement() const { return block!=nullptr; }
    block_stmt* get_code_block() { return block; }

    void accept(ast_visitor* visitor) override;
}; // end class if_stmt


// stmt class cond_stmt
class cond_stmt: public stmt {
public:
    cond_stmt(const cond_stmt&) = delete;
    cond_stmt& operator=(const cond_stmt&) = delete;

private:
    if_stmt* if_statement;
    std::vector<if_stmt*> elsif_statement;
    if_stmt* else_statement;

public:
    cond_stmt(const span& location):
        stmt(ast_class::ac_cond_stmt, location),
        if_statement(nullptr), else_statement(nullptr) {}
    ~cond_stmt() override;
    void set_if_stmt(if_stmt* node) { if_statement = node; }
    void add_elsif_stmt(if_stmt* node) { elsif_statement.push_back(node); }
    void set_else_stmt(if_stmt* node) { else_statement = node; }

    if_stmt* get_if_stmt() { return if_statement; }
    auto& get_elsif_stmt() { return elsif_statement; }
    bool has_else_stmt() const { return else_statement!=nullptr; }
    if_stmt* get_else_stmt() { return else_statement; }

    void accept(ast_visitor* visitor) override;
}; // end class condition_stmt


// stmt class for_stmt
class for_stmt: public stmt {
public:
    for_stmt(const for_stmt&) = delete;
    for_stmt& operator=(const for_stmt&) = delete;

private:
    std::vector<var_decl*> symbol;
    block_stmt* block;

public:
    for_stmt(const span& location):
        stmt(ast_class::ac_for_stmt, location),
        block(nullptr) {}
    ~for_stmt() override;
    void add_symbol(var_decl* node) { symbol.push_back(node); }
    void set_code_block(block_stmt* node) { block = node; }

    auto& get_symbols() { return symbol; }
    bool has_statement() const { return block!=nullptr; }
    block_stmt* get_code_block() { return block; }

    void accept(ast_visitor* visitor) override;
}; // end class for_stmt


// stmt class match_pair
class match_pair: public stmt {
public:
    match_pair(const match_pair&) = delete;
    match_pair& operator=(const match_pair&) = delete;

private:
    expr* literal;
    stmt* statement;

public:
    match_pair(const span& location):
        stmt(ast_class::ac_match_pair, location),
        literal(nullptr), statement(nullptr) {}
    ~match_pair() override;
    void set_literal(expr* node) { literal = node; }
    void set_statement(stmt* node) { statement = node; }

    expr* get_literal() { return literal; }
    stmt* get_statement() { return statement; }

    void accept(ast_visitor* visitor) override;
}; // end class match_pair


// stmt class match_stmt
class match_stmt: public stmt {
public:
    match_stmt(const match_stmt&) = delete;
    match_stmt& operator=(const match_stmt&) = delete;

private:
    expr* condition;
    std::vector<match_pair*> match_context;

public:
    match_stmt(const span& location):
        stmt(ast_class::ac_match_stmt, location),
        condition(nullptr) {}
    ~match_stmt() override;
    void set_match_condition(expr* node) { condition = node; }
    void add_match_pair(match_pair* node) { match_context.push_back(node); }

    expr* get_match_condition() { return condition; }
    auto& get_match_pair_list() { return match_context; }

    void accept(ast_visitor* visitor) override;
}; // end class match_stmt


// stmt class ret_stmt
class ret_stmt: public stmt {
public:
    ret_stmt(const ret_stmt&) = delete;
    ret_stmt& operator=(const ret_stmt&) = delete;

private:
    bool flag_is_yield;
    expr* return_value;

public:
    ret_stmt(const span& location):
        stmt(ast_class::ac_ret_stmt, location),
        flag_is_yield(false), return_value(nullptr) {}
    ~ret_stmt() override;
    void set_is_yield() { flag_is_yield = true; }
    void set_return_value(expr* node) { return_value = node; }

    bool is_yield() const { return flag_is_yield; }
    expr* get_return_value() { return return_value; }

    void accept(ast_visitor* visitor) override;
}; // end class ret_stmt


// stmt class fact_data
class fact_data: public stmt {
public:
    fact_data(const fact_data&) = delete;
    fact_data& operator=(const fact_data&) = delete;

private:
    std::vector<expr*> literals;

public:
    fact_data(const span& location): stmt(ast_class::ac_fact_data, location) {}
    ~fact_data() override;
    void add_literal(expr* node) { literals.push_back(node); }

    auto& get_literals() { return literals; }

    void accept(ast_visitor* visitor) override;
}; // end class fact_data


// stmt class fact_stmt
class fact_stmt: public stmt {
public:
    fact_stmt(const fact_stmt&) = delete;
    fact_stmt& operator=(const fact_stmt&) = delete;

private:
    std::vector<fact_data*> data;

public:
    fact_stmt(const span& location): stmt(ast_class::ac_fact_stmt, location) {}
    ~fact_stmt() override;
    void add_fact(fact_data* node) { data.push_back(node); }

    auto& get_facts() { return data; }

    void accept(ast_visitor* visitor) override;
}; // end class fact_stmt

// stmt class in_block_expr
class in_block_expr: public stmt {
public:
    in_block_expr(const in_block_expr&) = delete;
    in_block_expr& operator=(const in_block_expr&) = delete;

private:
    expr* expression;

public:
    in_block_expr(const span& location, expr* wraped_expr):
        stmt(ast_class::ac_in_block_expr, location),
        expression(wraped_expr) {
        assert(wraped_expr != nullptr);
    }
    ~in_block_expr() override;
    expr* get_expr() { return expression; }

    void accept(ast_visitor* visitor) override;
};

} // end namespace godel