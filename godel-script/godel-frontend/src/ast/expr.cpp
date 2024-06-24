#include "godel-frontend/src/ast/expr.h"
#include "godel-frontend/src/ast/ast_visitor.h"

#include <cassert>

namespace godel {

void expr::accept(ast_visitor* visitor) {
    visitor->visit_expr(this);
}

void ast_null::accept(ast_visitor* visitor) {
    visitor->visit_ast_null(this);
}

void number_literal::accept(ast_visitor* visitor) {
    visitor->visit_number_literal(this);
}

void string_literal::accept(ast_visitor* visitor) {
    visitor->visit_string_literal(this);
}

void boolean_literal::accept(ast_visitor* visitor) {
    visitor->visit_boolean_literal(this);
}

void identifier::accept(ast_visitor* visitor) {
    visitor->visit_identifier(this);
}

unary_operator::~unary_operator() {
    delete child;
}

void unary_operator::accept(ast_visitor* visitor) {
    visitor->visit_unary_operator(this);
}

binary_operator::~binary_operator() {
    delete left;
    delete right;
}

void binary_operator::accept(ast_visitor* visitor) {
    visitor->visit_binary_operator(this);
}

func_call::~func_call() {
    for(auto i : args) {
        delete i;
    }
}

void func_call::accept(ast_visitor* visitor) {
    visitor->visit_func_call(this);
}

initializer_pair::~initializer_pair() {
    delete field_name;
    delete field_value;
}

void initializer_pair::accept(ast_visitor* visitor) {
    visitor->visit_initializer_pair(this);
}

spread_expr::~spread_expr() {
    delete child;
}

void spread_expr::accept(ast_visitor* visitor) {
    visitor->visit_spread_expr(this);
}

initializer::~initializer() {
    for(auto i : pairs) {
        delete i;
    }
    for(auto i : spread_exprs) {
        delete i;
    }
}

void initializer::accept(ast_visitor* visitor) {
    visitor->visit_initializer(this);
}

call_head::~call_head() {
    delete first;
    delete call;
    delete ini;
}

void call_head::accept(ast_visitor* visitor) {
    visitor->visit_call_head(this);
}

call_expr::~call_expr() {
    delete name;
    delete call;
    delete ini;
}

void call_expr::accept(ast_visitor* visitor) {
    visitor->visit_call_expr(this);
}

call_root::~call_root() {
    delete head;
    for(auto i : call_chain) {
        delete i;
    }
}

void call_root::accept(ast_visitor* visitor) {
    visitor->visit_call_root(this);
}

}
