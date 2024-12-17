#pragma once

#include "godel-frontend/src/error/error.h"
#include "godel-frontend/src/ast/ast_visitor.h"
#include "godel-frontend/src/symbol.h"
#include "godel-frontend/src/sema/context.h"

#include <unordered_map>
#include <unordered_set>
#include <vector>
#include <cstring>
#include <sstream>

namespace godel {

class return_ungrounded_checker: public ast_visitor {
private:
    report::error* err;

private:
    bool visit_in_block_expr(in_block_expr*) override;
    bool visit_let_stmt(let_stmt*) override;
    bool visit_if_stmt(if_stmt*) override;
    bool visit_for_stmt(for_stmt*) override;
    bool visit_match_stmt(match_stmt*) override;
    bool visit_block_stmt(block_stmt*) override;
    bool visit_function_decl(function_decl*) override;

public:
    return_ungrounded_checker(report::error* err_ptr): err(err_ptr) {}
    void check(ast_root* root) {
        root->accept(this);
    }
};

class neg_expr_ungrounded_checker: public ast_visitor {
private:
    report::error* err;
    size_t in_logical_negative_expression_level;
    size_t in_binary_operator_level;

private:
    bool visit_call_expr(call_expr*) override;
    bool visit_initializer(initializer*) override;
    bool visit_unary_operator(unary_operator*) override;
    bool visit_binary_operator(binary_operator*) override;

public:
    neg_expr_ungrounded_checker(report::error* e):
        err(e), in_logical_negative_expression_level(0),
        in_binary_operator_level(0) {}
    void check(ast_root* root) {
        root->accept(this);
    }
};

class undetermined_checker: public ast_visitor {
private:
    report::error* err;
    size_t in_for_initialization_level;

private:
    bool match_undetermined_call(call_root*);

private:
    bool visit_call_root(call_root*) override;
    bool visit_for_stmt(for_stmt*) override;

public:
    undetermined_checker(report::error* e):
        err(e), in_for_initialization_level(0) {}
    void check(ast_root* root) {
        root->accept(this);
    }
};

/*
* Ungrounded checker used on function declaration node
* 1. records if the variable is the parameter of this function
* 2. check if the variable is used in each control flow branch
* 3. check unused variables when reaching [The End] of each control flow branch
*/
class ungrounded_parameter_checker: public ast_visitor {
private:
    report::error* err;
    context* ctx;
    function_decl* func_node;
    function* func;

private:
    // store how many times a parameter is used
    std::unordered_map<std::string, size_t> record;
    // store parameter is a set type or not
    std::unordered_map<std::string, bool> record_is_set_flag;

private:
    // used_mark will mark a variable is used in current statement
    std::vector<std::unordered_set<std::string>> used_variable;

private:
    // in logical or expression, we need to record the used variable
    // of left and right side, because it's possible that the variable
    // is not used in both sides. so we use a vector to record them
    // and then merge them to make sure both sides use the same variable
    std::vector<std::unordered_set<std::string>> logical_or_variable_used;

private:
    // mark if visitor is visiting node inside logical negation expression
    int64_t in_logical_negative_expression_level;
    // mark if parameter "self" is grounded, if false, report error when
    // annotation `self_typecheck_free` is used.
    bool self_is_grounded;

private:
    void new_used_variable_mark_scope() {
        used_variable.push_back({});
    }
    void pop_used_variable_mark_scope() {
        for (const auto& name : used_variable.back()) {
            if (record.count(name)) {
                record.at(name)--;
            }
        }
        used_variable.pop_back();
    }

private:
    bool is_native_type(const godel::symbol& sym) const {
        return sym == symbol::i64() ||
               sym == symbol::f64() ||
               sym == symbol::str();
    }
    void report_unused_parameter(const report::span&);
    bool check_directly_return_self(ret_stmt*);

private:
    bool visit_identifier(identifier*) override;
    bool visit_call_expr(call_expr*) override;
    bool visit_unary_operator(unary_operator*) override;
    bool visit_binary_operator(binary_operator*) override;
    bool visit_for_stmt(for_stmt*) override;
    bool visit_let_stmt(let_stmt*) override;
    bool visit_if_stmt(if_stmt*) override;
    bool visit_match_stmt(match_stmt*) override;
    bool visit_ret_stmt(ret_stmt*) override;
    bool visit_in_block_expr(in_block_expr*) override;
    bool visit_block_stmt(block_stmt*) override;

private:
    bool is_schema_get_primary_key(call_root*);

private:
    bool visit_call_head(call_head*) override;
    bool visit_call_root(call_root*) override;

public:
    ungrounded_parameter_checker(report::error* err_ptr, context* ctx_ptr):
        err(err_ptr), ctx(ctx_ptr), func_node(nullptr), func(nullptr),
        in_logical_negative_expression_level(0) {}
    void check(function_decl*, function*);
};

}