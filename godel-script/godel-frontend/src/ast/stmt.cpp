#include "godel-frontend/src/ast/stmt.h"
#include "godel-frontend/src/ast/ast_visitor.h"

namespace godel {

void stmt::accept(ast_visitor* visitor) {
    visitor->visit_stmt(this);
}

block_stmt::~block_stmt() {
    for(auto i : statements) {
        delete i;
    }
}

void block_stmt::accept(ast_visitor* visitor) {
    visitor->visit_block_stmt(this);
}

multi_use_stmt::~multi_use_stmt() {
    for(auto i : symbols) {
        delete i;
    }
}

void multi_use_stmt::accept(ast_visitor* visitor) {
    visitor->visit_multi_use_stmt(this);
}

use_stmt::~use_stmt() {
    for(auto i : path) {
        delete i;
    }
    delete multi_use;
}

void use_stmt::accept(ast_visitor* visitor) {
    visitor->visit_use_stmt(this);
}

let_stmt::~let_stmt() {
    for(auto i : symbol) {
        delete i;
    }
    delete block;
}

void let_stmt::accept(ast_visitor* visitor) {
    visitor->visit_let_stmt(this);
}

if_stmt::~if_stmt() {
    delete condition;
    delete block;
}

void if_stmt::accept(ast_visitor* visitor) {
    visitor->visit_if_stmt(this);
}

cond_stmt::~cond_stmt() {
    delete if_statement;
    for(auto i : elsif_statement) {
        delete i;
    }
    delete else_statement;
}

void cond_stmt::accept(ast_visitor* visitor) {
    visitor->visit_cond_stmt(this);
}

for_stmt::~for_stmt() {
    for(auto i : symbol) {
        delete i;
    }
    delete block;
}

void for_stmt::accept(ast_visitor* visitor) {
    visitor->visit_for_stmt(this);
}

match_pair::~match_pair() {
    delete literal;
    delete statement;
}

void match_pair::accept(ast_visitor* visitor) {
    visitor->visit_match_pair(this);
}

match_stmt::~match_stmt() {
    delete condition;
    for(auto i : match_context) {
        delete i;
    }
}

void match_stmt::accept(ast_visitor* visitor) {
    visitor->visit_match_stmt(this);
}

ret_stmt::~ret_stmt() {
    delete return_value;
}

void ret_stmt::accept(ast_visitor* visitor) {
    visitor->visit_ret_stmt(this);
}

fact_data::~fact_data() {
    for(auto i : literals) {
        delete i;
    }
}

void fact_data::accept(ast_visitor* visitor) {
    visitor->visit_fact_data(this);
}

fact_stmt::~fact_stmt() {
    for(auto i : data) {
        delete i;
    }
}

void fact_stmt::accept(ast_visitor* visitor) {
    visitor->visit_fact_stmt(this);
}

in_block_expr::~in_block_expr() {
    delete expression;
}

void in_block_expr::accept(ast_visitor* visitor) {
    visitor->visit_in_block_expr(this);
}

} // end namespace godel