#pragma once

#include "godel-frontend/src/error/error.h"
#include "godel-frontend/src/ast/ast_node.h"

#include <cstdint>
#include <cstring>
#include <sstream>
#include <vector>
#include <unordered_map>

namespace godel {

using report::span;

// expr class
class expr: public ast_node {
public:
    expr(const expr&) = delete;
    expr& operator=(const expr&) = delete;

public:
    expr(ast_class ast_class, const span &location):
        ast_node(ast_class, location) {}
    virtual ~expr() override = default;

    void accept(ast_visitor* visitor) override;
}; // end class expr


// expr class ast_null
class ast_null: public expr {
public:
    ast_null(const ast_null&) = delete;
    ast_null& operator=(const ast_null&) = delete;
    ~ast_null() override = default;

    ast_null(const span &location): expr(ast_class::ac_null, location) {}
    void accept(ast_visitor* visitor) override;
}; // end class ast_null


// expr class integer_literal
class number_literal: public expr {
public:
    number_literal(const number_literal&) = delete;
    number_literal& operator=(const number_literal&) = delete;

private:
    bool is_integer_flag;
    int64_t int_literal;
    float float_literal;

public:
    number_literal(const span &location, int64_t l):
        expr(ast_class::ac_number_literal, location),
        is_integer_flag(true), int_literal(l) {}
    number_literal(const span &location, float l):
        expr(ast_class::ac_number_literal, location),
        is_integer_flag(false), float_literal(l) {}
    ~number_literal() override = default;

    int64_t get_integer() const { return int_literal; }
    float get_float() const { return float_literal; }
    bool is_integer() const { return is_integer_flag; }
    
    void accept(ast_visitor* visitor) override;
}; // end class integer_literal


// expr class string_literal
class string_literal: public expr {
public:
    string_literal(const string_literal&) = delete;
    string_literal& operator=(const string_literal&) = delete;

private:
    std::string literal;
    // mark this literal is a input database
    std::string input_database_full_path;

public:
    string_literal(const span& location, const std::string& s):
        expr(ast_class::ac_string_literal, location),
        literal(s), input_database_full_path("") {}
    ~string_literal() override = default;

    void set_input_database(const std::string& full_path) {
        input_database_full_path = full_path;
    }
    bool is_input_database_path() const { return !input_database_full_path.empty(); }
    const std::string& get_literal() const { return literal; }
    const std::string& get_database_full_path() const { return input_database_full_path; }

    void accept(ast_visitor* visitor) override;
}; // end class string_literal

// expr class boolean_literal
class boolean_literal: public expr {
public:
    boolean_literal(const boolean_literal&) = delete;
    boolean_literal& operator=(const boolean_literal&) = delete;

private:
    bool flag;

public:
    boolean_literal(const span& location, bool _flag):
        expr(ast_class::ac_boolean_literal, location), flag(_flag) {}
    ~boolean_literal() override = default;

    bool get_flag() const { return flag; }
    void accept(ast_visitor* visitor) override;
}; // end class boolean_literal

// expr class identifier
class identifier: public expr {
public:
    identifier(const identifier&) = delete;
    identifier& operator=(const identifier&) = delete;

private:
    std::string name;

public:
    identifier(const span& location, const std::string& n):
        expr(ast_class::ac_identifier, location), name(n) {}
    ~identifier() override = default;

    const std::string& get_name() const { return name; }

    void accept(ast_visitor* visitor) override;
}; // end class identifier


// expr class unary_operator
class unary_operator: public expr {
public:
    enum class type {
        logical_negation,   // unary operator !
        arithmetic_negation // unary operator -
    };
    unary_operator(const unary_operator&) = delete;
    unary_operator& operator=(const unary_operator&) = delete;

private:
    type operator_type;
    expr* child;

public:
    unary_operator(const span& location):
        expr(ast_class::ac_unary_operator, location),
        child(nullptr) {}
    ~unary_operator() override;
    void set_operator(type t) { operator_type = t; }
    void set_child(expr* node) { child = node; }

    type get_operator_type() { return operator_type; }
    expr* get_child() { return child; }

    void accept(ast_visitor* visitor) override;
}; // end class unary_operator


// expr class binary_operator
class binary_operator: public expr {
public:
    enum class type {
        logical_or,          // binary operator ||
        logical_and,         // binary operator &&
        compare_equal,       // binary operator =
        compare_not_equal,   // binary operator !=
        compare_less,        // binary operator <
        compare_less_equal,  // binary operator <=
        compare_great,       // binary operator >
        compare_great_equal, // binary operator >=
        in,                  // binary operator in
        add,                 // binary operator +
        sub,                 // binary operator -
        mult,                // binary operator *
        div                  // binary operator /
    };
    binary_operator(const binary_operator&) = delete;
    binary_operator& operator=(const binary_operator&) = delete;

private:
    type operator_type;
    expr* left;
    expr* right;

public:
    binary_operator(const span& location):
        expr(ast_class::ac_binary_operator, location),
        left(nullptr), right(nullptr) {}
    ~binary_operator() override;
    void set_operator(type t) { operator_type = t; }
    void set_left(expr* node) { left = node; }
    void set_right(expr* node) { right = node; }

    type get_operator_type() const { return operator_type; }
    expr* get_left() { return left; }
    expr* get_right() { return right; }

    void accept(ast_visitor* visitor) override;
}; // end class binary_operator


// expr class func_call
class func_call: public expr {
public:
    func_call(const func_call&) = delete;
    func_call& operator=(const func_call&) = delete;

private:
    std::vector<expr*> args;

public:
    func_call(const span& location):
        expr(ast_class::ac_func_call, location) {}
    ~func_call() override;
    void add_argument(expr* node) { args.push_back(node); }

    auto& get_arguments() { return args; }

    void accept(ast_visitor* visitor) override;
}; // end class func_call


// expr class initializer_pair
class initializer_pair: public expr {
public:
    initializer_pair(const initializer_pair&) = delete;
    initializer_pair& operator=(const initializer_pair&) = delete;

private:
    identifier* field_name;
    expr* field_value;

public:
    initializer_pair(const span& location):
        expr(ast_class::ac_initializer_pair, location),
        field_name(nullptr), field_value(nullptr) {}
    ~initializer_pair() override;
    void set_field_name(identifier* node) { field_name = node; }
    void set_field_value(expr* node) { field_value = node; }

    identifier* get_field_name() { return field_name; }
    expr* get_field_value() { return field_value; }

    void accept(ast_visitor* visitor) override;
}; // end class initializer_pair

// expr class spread_expr
class spread_expr: public expr {
public:
    spread_expr(const spread_expr&) = delete;
    spread_expr& operator=(const spread_expr&) = delete;

private:
    expr* child;

public:
    spread_expr(const span& location, expr* node):
        expr(ast_class::ac_spread_expr, location),
        child(node) {}
    ~spread_expr() override;

    auto get_child() { return child; }

    void accept(ast_visitor* visitor) override;
}; // end class spread_expr


// expr class initializer
class initializer: public expr {
public:
    initializer(const initializer&) = delete;
    initializer& operator=(const initializer&) = delete;

private:
    std::vector<initializer_pair*> pairs;
    std::vector<spread_expr*> spread_exprs;

public:
    initializer(const span& location):
        expr(ast_class::ac_initializer, location) {}
    ~initializer() override;
    void add_field_pair(initializer_pair* node) { pairs.push_back(node); }
    void add_spread_expr(spread_expr* node) { spread_exprs.push_back(node); }

    auto& get_field_pairs() { return pairs; }
    auto& get_spread_exprs() { return spread_exprs; }

    void accept(ast_visitor* visitor) override;
}; // end class initializer


// expr class call_head
class call_head: public expr {
public:
    call_head(const call_head&) = delete;
    call_head& operator=(const call_head&) = delete;

private:
    expr* first;
    func_call* call;
    initializer* ini;

private:
    // mark schema(xxx) is schema::__all__(xxx)
    bool flag_is_schema_loader;

private:
    void check_call_and_init() {
        if (!call || !ini) {
            return;
        }
        fatal_error("call_head: func_call and initializer both exist.");
    }

public:
    call_head(const span& location):
        expr(ast_class::ac_call_head, location),
        first(nullptr), call(nullptr), ini(nullptr),
        flag_is_schema_loader(false) {}
    ~call_head() override;
    void set_first_expression(expr* node) { first = node; }
    void set_func_call(func_call* node) { call = node; check_call_and_init(); }
    void set_initializer(initializer* node) { ini = node; check_call_and_init(); }
    void set_is_schema_loader() { flag_is_schema_loader = true; }

public:
    expr* get_first_expression() { return first; }
    bool has_func_call() const { return call!=nullptr; }
    func_call* get_func_call() { return call; }
    bool is_initializer() const { return ini!=nullptr; }
    initializer* get_initializer() { return ini; }
    bool is_schema_loader() const { return flag_is_schema_loader; }

public:
    void accept(ast_visitor* visitor) override;
};


// expr class call_expr
class call_expr: public expr {
public:
    enum class type {
        get_field,
        get_path
    };
    call_expr(const call_expr&) = delete;
    call_expr& operator=(const call_expr&) = delete;

public:
    struct aggregator_find_info {
        std::string set_name;
        std::string set_key;
        std::string schema_key;
    };

private:
    type node_call_type;
    identifier* name; // specify field or path name
    func_call* call;  // call function
    initializer* ini; // construct structure
    type_def* generic_type; // generic type `.field<T>()` `::field<T>()`

    // mark schema(xxx) is schema::__all__(xxx)
    bool schema_loader;

    // mark aggregator find
    bool flag_is_aggregator_find;

    // mark this is aggregator
    bool flag_is_aggregator;

    // mark .to_set()
    bool to_set_method;
    std::string to_set_type_full_name;

    // mark .key_eq()
    bool key_eq_method;
    // mark .key_neq()
    bool key_not_eq_method;
    std::string left_primary_key;
    std::string right_primary_key;

    // mark .to()
    bool generic_to_method;
    // mark .is()
    bool generic_is_method;
    std::string source_full_name;
    std::string generic_full_name;

private:
    void check_call_and_init() {
        if (!call || !ini) {
            return;
        }
        fatal_error("call_expr: func_call and initializer both exist.");
    }

public:
    call_expr(const span& location):
        expr(ast_class::ac_call_expr, location),
        name(nullptr), call(nullptr), ini(nullptr),
        generic_type(nullptr), schema_loader(false),
        flag_is_aggregator_find(false), flag_is_aggregator(false),
        to_set_method(false), key_eq_method(false), key_not_eq_method(false),
        generic_to_method(false), generic_is_method(false) {}
    ~call_expr() override;
    void set_call_type(type t) { node_call_type = t; }
    void set_field_name(identifier* node) { name = node; }
    void set_func_call(func_call* node) { call = node; check_call_and_init(); }
    void set_initializer(initializer* node) { ini = node; check_call_and_init(); }
    void set_generic_type(type_def* node) { generic_type = node; }
    void set_schema_loader() { schema_loader = true; }
    void set_aggregator_find() { flag_is_aggregator_find = true; }
    void set_is_aggregator() { flag_is_aggregator = true; }
    void set_to_set_method(const std::string& full_name) {
        to_set_method = true;
        to_set_type_full_name = full_name;
    }
    void set_key_eq_method(const std::string& left_key_name,
                           const std::string& right_key_name) {
        key_eq_method = true;
        left_primary_key = left_key_name;
        right_primary_key = right_key_name;
    }
    void set_key_not_eq_method(const std::string& left_key_name,
                               const std::string& right_key_name) {
        key_not_eq_method = true;
        left_primary_key = left_key_name;
        right_primary_key = right_key_name;
    }
    void set_generic_to() { generic_to_method = true; }
    void set_generic_is() { generic_is_method = true; }
    void set_generic_input_full_name(const std::string& full_name) { source_full_name = full_name; }
    void set_generic_output_full_name(const std::string& full_name) { generic_full_name = full_name; }

    type get_call_type() const { return node_call_type; }
    identifier* get_field_name() { return name; }
    bool has_func_call() const { return call!=nullptr; }
    func_call* get_func_call() { return call; }
    bool is_initializer() const { return ini!=nullptr; }
    initializer* get_initializer() { return ini; }
    bool is_generic() const { return generic_type!=nullptr; }
    type_def* get_generic_type() { return generic_type; }

    bool is_schema_loader() const { return schema_loader; }

    bool is_aggregator_find() const { return flag_is_aggregator_find; }
    bool is_aggregator() const { return flag_is_aggregator; }

    bool is_to_set_method() const { return to_set_method; }
    const auto& get_to_set_schema_name() const { return to_set_type_full_name; }

    bool is_key_eq_method() const { return key_eq_method; }
    bool is_key_not_eq_method() const { return key_not_eq_method; }
    const auto& get_left_key_name() const { return left_primary_key; }
    const auto& get_right_key_name() const { return right_primary_key; }
    void accept(ast_visitor* visitor) override;

    bool is_generic_to() const { return generic_to_method; }
    bool is_generic_is() const { return generic_is_method; }
    const auto& get_generic_input_full_name() const { return source_full_name; }
    const auto& get_generic_output_full_name() const { return generic_full_name; }
}; // end class call_expr


// expr class call_root
class call_root: public expr {
public:
    call_root(const call_root&) = delete;
    call_root& operator=(const call_root&) = delete;

private:
    call_head* head;
    std::vector<call_expr*> call_chain;

public:
    call_root(const span& location):
        expr(ast_class::ac_call_root, location),
        head(nullptr) {}
    ~call_root() override;
    void set_call_head(call_head* node) { head = node; }
    void add_call_chain(call_expr* node) { call_chain.push_back(node); }

    call_head* get_call_head() { return head; }
    auto& get_call_chain() { return call_chain; }

    void accept(ast_visitor* visitor) override;
}; // end class call_root

} // end namespace godel
