#pragma once

#include "godel-frontend/src/error/error.h"
#include "godel-frontend/src/ir/name_mangling.h"

#include <cstring>
#include <sstream>
#include <vector>
#include <unordered_map>

namespace godel {
namespace lir {

enum class inst_value_kind {
    null = 0, // reserved, useless
    literal,  // literal
    variable, // variable
    defltval, // default value, in souffle it is `_`
};

struct inst_value_t {
    inst_value_kind kind;
    std::string content;

    static inst_value_t null() {
        return {inst_value_kind::null, ""};
    }
    static inst_value_t literal(const std::string& s) {
        return {inst_value_kind::literal, s};
    }
    static inst_value_t variable(const std::string& s) {
        return {inst_value_kind::variable, s};
    }
    static inst_value_t default_value() {
        return {inst_value_kind::defltval, "_"};
    }
};

std::ostream& operator<<(std::ostream&, const inst_value_t&);

enum class inst_kind {
                 // +---------+----------+
    inst_bool,   // | boolean | flag     |
                 // +---------+----------+-------+
    inst_store,  // | store   | src      | dst   |
                 // +---------+----------+-------+
    inst_call,   // | call    | [args]   | dst   | (for normal type return value)
                 // +---------+----------+-------+
                 // | call    | [args]   |         (for bool type return value)
                 // +---------+----------+-------+
    inst_ctor,   // | schema  | [fields] | dst   | (for initializer with key)
                 // +---------+----------+-------+
    inst_record, // | record  | [fields] | dst   | (for initializer without key)
                 // +---------+----------+-------+ record is like: [a, b, c]
    inst_unary,  // | unary   | src      | dst   |
                 // +---------+----------+-------+-----+
    inst_binary, // | binary  | left     | right | dst |
                 // +---------+----------+-------+-----+
    inst_cmp,    // | compare | left     | right |
                 // +---------+----------+-------+
    inst_block,  // | block   | [inst*]  |
                 // +---------+----------+
    inst_fact,   // | fact    | [[src]]  |
                 // +---------+----------+
    inst_not,    // | not     | block    |
                 // +---------+----------+-------+
    inst_and,    // | and     | block    | block |
                 // +---------+----------+-------+
    inst_or,     // | or      | block    | block |
                 // +---------+----------+-------+
    inst_aggr,   // | aggr    | block    |         (for aggregator without dst)
                 // +---------+----------+-------+
                 // | aggr    | block    | dst   | (for aggregator with dst)
                 // +---------+----------+-------+
};

class boolean;
class store;
class call;
class constructor;
class record;
class unary;
class binary;
class compare;
class block;
class fact;
class not_operand;
class and_operand;
class or_operand;
class aggregator;

class inst_visitor {
public:
    virtual void visit_boolean(boolean*) {}
    virtual void visit_store(store*) {}
    virtual void visit_call(call*) {}
    virtual void visit_constructor(constructor*) {}
    virtual void visit_record(record*) {}
    virtual void visit_unary(unary*) {}
    virtual void visit_binary(binary*) {}
    virtual void visit_compare(compare*) {}
    virtual void visit_block(block*);
    virtual void visit_fact(fact*) {}
    virtual void visit_not_operand(not_operand*);
    virtual void visit_and_operand(and_operand*);
    virtual void visit_or_operand(or_operand*);
    virtual void visit_aggregator(aggregator*);
};

class inst {
private:
    inst_kind kind;
    report::span location;
    bool flag_eliminated;

public:
    inst(inst_kind k, const report::span& loc):
        kind(k), location(loc), flag_eliminated(false) {}
    virtual ~inst() = default;

    auto get_kind() const { return kind; }
    const auto& get_location() const { return location; }
    virtual void dump(std::ostream&, const std::string&) const {}
    virtual void accept(inst_visitor*) {}

public:
    void set_flag_eliminated(bool flag) { flag_eliminated = flag; }
    auto get_flag_eliminated() const { return flag_eliminated; }
};

class boolean: public inst {
private:
    bool flag;

public:
    boolean(bool f, const report::span& loc):
        inst(inst_kind::inst_bool, loc), flag(f) {}
    boolean(const boolean& b):
        inst(inst_kind::inst_bool, b.get_location()), flag(b.flag) {}
    ~boolean() override = default;
    auto get_flag() const { return flag; }
    void dump(std::ostream&, const std::string&) const override;
    void accept(inst_visitor* v) override {
        v->visit_boolean(this);
    }
};

class store: public inst {
private:
    inst_value_t source;
    inst_value_t target;

public:
    store(const inst_value_t& src,
          const inst_value_t& tgt,
          const report::span& loc):
        inst(inst_kind::inst_store, loc), source(src), target(tgt) {}
    store(const store& s):
        inst(inst_kind::inst_store, s.get_location()),
        source(s.source), target(s.target) {}
    ~store() override = default;
    void dump(std::ostream&, const std::string&) const override;
    void accept(inst_visitor* v) override {
        v->visit_store(this);
    }

    const auto& get_source() const { return source; }
    const auto& get_target() const { return target; }
};

class call: public inst {
public:
    enum class kind {
        null = 0,      // usually used as a placeholder, when generating a call
                       // manually, we don't need to specify the kind of call
        function,      // function (static call)
        method,        // schema method (method call)
        database_load, // database loader static method (static call)
        find,          // (method call) `find` method
        key_cmp,       // key_eq & key_neq method (method call)
        to_set,        // schema to_set method (method call)
        basic_method,  // basic method (method call)
        basic_static,  // basic static method (static call)
    };

public:
    // native method for int type
    enum class int_method_kind {
        int_add,
        int_sub,
        int_div,
        int_mul,
        int_rem,
        int_pow,
        int_bitand,
        int_bitor,
        int_bitxor,
        int_bitnot,
        int_neg,
        int_eq,
        int_ne,
        int_gt,
        int_ge,
        int_lt,
        int_le,
        int_to_string,
        int_to_set
    };
    // mapper for method name -> int method kind
    const std::unordered_map<std::string, int_method_kind> int_basic_methods = {
        {"int::add", int_method_kind::int_add},
        {"int::sub", int_method_kind::int_sub},
        {"int::div", int_method_kind::int_div},
        {"int::mul", int_method_kind::int_mul},
        {"int::rem", int_method_kind::int_rem},
        {"int::pow", int_method_kind::int_pow},
        {"int::bitand", int_method_kind::int_bitand},
        {"int::bitor", int_method_kind::int_bitor},
        {"int::bitxor", int_method_kind::int_bitxor},
        {"int::bitnot", int_method_kind::int_bitnot},
        {"int::neg", int_method_kind::int_neg},
        {"int::eq", int_method_kind::int_eq},
        {"int::ne", int_method_kind::int_ne},
        {"int::gt", int_method_kind::int_gt},
        {"int::ge", int_method_kind::int_ge},
        {"int::lt", int_method_kind::int_lt},
        {"int::le", int_method_kind::int_le},
        {"int::to_string", int_method_kind::int_to_string},
        {"int::to_set", int_method_kind::int_to_set}
    };

    // native method for string type
    enum class string_method_kind {
        string_substr,
        string_get_regex_match_result,
        string_matches,
        string_contains,
        string_add,
        string_len,
        string_to_int,
        string_eq,
        string_ne,
        string_to_set,
        string_to_upper,
        string_to_lower,
        string_replace_all,
        string_replace_once
    };
    // mapper for method name -> string method kind
    const std::unordered_map<std::string, string_method_kind> string_basic_methods = {
        {"string::substr", string_method_kind::string_substr},
        {"string::get_regex_match_result", string_method_kind::string_get_regex_match_result},
        {"string::matches", string_method_kind::string_matches},
        {"string::contains", string_method_kind::string_contains},
        {"string::add", string_method_kind::string_add},
        {"string::len", string_method_kind::string_len},
        {"string::to_int", string_method_kind::string_to_int},
        {"string::eq", string_method_kind::string_eq},
        {"string::ne", string_method_kind::string_ne},
        {"string::to_set", string_method_kind::string_to_set},
        {"string::to_upper", string_method_kind::string_to_upper},
        {"string::to_lower", string_method_kind::string_to_lower},
        {"string::replace_all", string_method_kind::string_replace_all},
        {"string::replace_once", string_method_kind::string_replace_once}
    };

private:
    kind type;
    std::string function_name;
    std::vector<inst_value_t> arguments;
    inst_value_t destination;

private:
    // used in generic is/to method
    std::string generic_type;

private:
    void generate_key_cmp(std::ostream&) const;
    void generate_schema_to_set(std::ostream&) const;
    void generate_database_load(std::ostream&) const;
    void generate_int_basic_method(std::ostream&) const;
    void generate_string_basic_method(std::ostream&) const;
    void generate_basic_method(std::ostream&) const;
    void generate_basic_static(std::ostream&) const;
    // aggregator generation is now only used for `*T.find` method;
    // `len`, `sum`, `min`, `max` is generated by lir::aggregator
    void generate_find(std::ostream&) const;

public:
    call(const std::string& func_name, const report::span& loc):
        inst(inst_kind::inst_call, loc), type(kind::null),
        function_name(func_name),
        destination({inst_value_kind::null, ""}) {}
    call(const call& c):
        inst(inst_kind::inst_call, c.get_location()), type(c.type),
        function_name(c.function_name),
        arguments(c.arguments),
        destination(c.destination),
        generic_type(c.generic_type) {}
    ~call() override = default;
    void dump(std::ostream&, const std::string&) const override;
    void accept(inst_visitor* v) override {
        v->visit_call(this);
    }

public:
    void add_arg(const inst_value_t& arg) { arguments.push_back(arg); }
    void set_return(const inst_value_t& dst) { destination = dst; }
    void set_call_type(kind t) { type = t; }
    void set_generic_type(const std::string& t) { generic_type = t; }
    const auto& get_generic_type() const { return generic_type; }
    const auto& get_function_name() const { return function_name; }
    auto get_func_kind() const { return type; }
    const auto& get_arguments() const { return arguments; }
    const auto& get_return() const { return destination; }
    auto& get_mutable_arguments() { return arguments; }
    auto& get_mutable_result() { return destination; }

public:
    // get mangled function name, may fail in some cases
    // if failed to mangle, return raw function name directly
    auto get_mangled_name() const {
        switch(get_func_kind()) {
            case lir::call::kind::database_load:
            case lir::call::kind::find:
            case lir::call::kind::key_cmp:
            case lir::call::kind::to_set:
            case lir::call::kind::basic_method:
            case lir::call::kind::basic_static: return get_function_name();
            default: break;
        }
        return rule_mangle(get_function_name());
    }
};

class constructor: public inst {
private:
    std::string schema_name;
    std::vector<inst_value_t> fields_value;
    inst_value_t destination;

public:
    constructor(const std::string& name,
                const inst_value_t& dst,
                const report::span& loc):
        inst(inst_kind::inst_ctor, loc),
        schema_name(name), destination(dst) {}
    constructor(const constructor& c):
        inst(inst_kind::inst_ctor, c.get_location()),
        schema_name(c.schema_name),
        fields_value(c.fields_value),
        destination(c.destination) {}
    ~constructor() override = default;
    void dump(std::ostream&, const std::string&) const override;
    void add_field(const inst_value_t& source) {
        fields_value.push_back(source);
    }
    const auto& get_fields() const { return fields_value; }
    const auto& get_result() const { return destination; }
    const auto& get_schema_name() const { return schema_name; }
    void accept(inst_visitor* v) override {
        v->visit_constructor(this);
    }

    auto& get_mutable_fields() { return fields_value; }
    auto& get_mutable_result() { return destination; }

public:
    // get mangled constructor name
    auto get_mangled_name() const {
        return rule_mangle("schema_" + schema_name);
    }
};

// souffle record type, for example:
//   res = [1, "str", -1.0]
// res type is [number, string, float]
//
class record: public inst {
private:
    std::vector<inst_value_t> fields_value;
    inst_value_t destination;

public:
    record(const inst_value_t& dst,
           const report::span& loc):
        inst(inst_kind::inst_record, loc), destination(dst) {}
    record(const record& c):
        inst(inst_kind::inst_record, c.get_location()),
        fields_value(c.fields_value),
        destination(c.destination) {}
    ~record() override = default;

public:
    void dump(std::ostream&, const std::string&) const override;
    void add_field(const inst_value_t& source) {
        fields_value.push_back(source);
    }
    const auto& get_fields() const { return fields_value; }
    const auto& get_result() const { return destination; }
    void accept(inst_visitor* v) override {
        v->visit_record(this);
    }

    auto& get_mutable_fields() { return fields_value; }
    auto& get_mutable_result() { return destination; }
};

class unary: public inst {
public:
    enum class kind {
        op_neg, // -
    };

private:
    kind operand;
    inst_value_t source;
    inst_value_t target;

public:
    unary(const kind op,
          const inst_value_t& src,
          const inst_value_t& tgt,
          const report::span& loc):
        inst(inst_kind::inst_unary, loc), operand(op),
        source(src), target(tgt) {}
    unary(const unary& u):
        inst(inst_kind::inst_unary, u.get_location()), operand(u.operand),
        source(u.source), target(u.target) {}
    ~unary() override = default;

public:
    const auto& get_source() const { return source; }
    const auto& get_target() const { return target; }
    auto& get_mutable_target() { return target; }

public:
    void dump(std::ostream&, const std::string&) const override;
    void accept(inst_visitor* v) override {
        v->visit_unary(this);
    }
};

class binary: public inst {
public:
    enum class kind {
        op_add, // +
        op_sub, // -
        op_mul, // *
        op_div  // /
    };

private:
    inst_value_t left;
    inst_value_t right;
    inst_value_t target;
    kind operator_kind;

public:
    binary(const inst_value_t& l,
           const inst_value_t& r,
           const inst_value_t& tgt,
           const kind op,
           const report::span& loc):
        inst(inst_kind::inst_binary, loc), left(l), right(r),
        target(tgt), operator_kind(op) {}
    binary(const binary& b):
        inst(inst_kind::inst_binary, b.get_location()),
        left(b.left), right(b.right),
        target(b.target), operator_kind(b.operator_kind) {}
    ~binary() override = default;

public:
    void dump(std::ostream&, const std::string&) const override;
    void accept(inst_visitor* v) override {
        v->visit_binary(this);
    }

public:
    auto get_operator() const { return operator_kind; }
    const auto& get_left() const { return left; }
    const auto& get_right() const { return right; }
    const auto& get_target() const { return target; }
    auto& get_mutable_target() { return target; }
};

class compare: public inst {
public:
    enum class kind {
        op_eq,  // =
        op_neq, // !=
        op_gt,  // >
        op_ge,  // >=
        op_lt,  // <
        op_le   // <=
    };

private:
    inst_value_t left;
    inst_value_t right;
    kind operator_kind;

public:
    compare(const inst_value_t& l,
            const inst_value_t& r,
            const kind op,
            const report::span& loc):
        inst(inst_kind::inst_cmp, loc),
        left(l), right(r), operator_kind(op) {}
    compare(const compare& c):
        inst(inst_kind::inst_cmp, c.get_location()),
        left(c.left), right(c.right),
        operator_kind(c.operator_kind) {}
    ~compare() override = default;

public:
    void dump(std::ostream&, const std::string&) const override;
    void accept(inst_visitor* v) override {
        v->visit_compare(this);
    }
    auto get_operator() const { return operator_kind; }
    const auto& get_left() const { return left; }
    const auto& get_right() const { return right; }
};

class block: public inst {
private:
    std::vector<inst*> content;
    // when doing output, if there are more than one instruction,
    // we need to use semicolon to separate them if this switch is true,
    // otherwise use comma instead
    // in souffle:
    // - `;` means `or`
    // - `,` means `and`
    bool flag_use_semi;

public:
    block(const report::span& loc):
        inst(inst_kind::inst_block, loc), flag_use_semi(false) {}
    ~block() override {
        for(auto i : content) {
            delete i;
        }
    }
    void add_new_content(inst* i) { content.push_back(i); }
    void set_use_semicolon() { flag_use_semi = true; }
    void set_use_comma() { flag_use_semi = false; }
    auto get_use_semicolon() const { return flag_use_semi; }
    auto get_use_comma() const { return !flag_use_semi; }
    const auto& get_content() const { return content; }
    auto& get_mutable_content() { return content; }
    void dump(std::ostream&, const std::string&) const override;
    void accept(inst_visitor* v) override {
        v->visit_block(this);
    }
};

class fact: public inst {
private:
    std::vector<std::pair<std::string, inst_value_t>> literals;

public:
    fact(const report::span& loc): inst(inst_kind::inst_fact, loc) {}
    fact(const fact& f):
        inst(inst_kind::inst_fact, f.get_location()), literals(f.literals) {}
    ~fact() override = default;
    void add_pair(const std::string& name, const inst_value_t& literal) {
        literals.push_back({name, literal});
    }

public:
    const auto& get_pairs() const { return literals; }
    void dump(std::ostream&, const std::string&) const override;
    void accept(inst_visitor* v) override {
        v->visit_fact(this);
    }
};

class not_operand: public inst {
private:
    block* body;

public:
    not_operand(const report::span& loc):
        inst(inst_kind::inst_not, loc), body(nullptr) {}
    ~not_operand() override {
        delete body;
    }
    void set_body(block* b) { body = b; }
    auto get_body() { return body; }
    void dump(std::ostream&, const std::string&) const override;
    void accept(inst_visitor* v) override {
        v->visit_not_operand(this);
    }
};

class and_operand: public inst {
private:
    block* left;
    block* right;

public:
    and_operand(const report::span& loc):
        inst(inst_kind::inst_and, loc), left(nullptr), right(nullptr) {}
    ~and_operand() override {
        delete left;
        delete right;
    }
    void set_left(block* b) { left = b; }
    void set_right(block* b) { right = b; }
    auto get_left_block() { return left; }
    auto get_right_block() { return right; }
    void dump(std::ostream&, const std::string&) const override;
    void accept(inst_visitor* v) override {
        v->visit_and_operand(this);
    }
};

class or_operand: public inst {
private:
    block* left;
    block* right;

public:
    or_operand(const report::span& loc):
        inst(inst_kind::inst_or, loc), left(nullptr), right(nullptr) {}
    ~or_operand() override {
        delete left;
        delete right;
    }
    void set_left(block* b) { left = b; }
    void set_right(block* b) { right = b; }
    auto get_left_block() { return left; }
    auto get_right_block() { return right; }
    void dump(std::ostream&, const std::string&) const override;
    void accept(inst_visitor* v) override {
        v->visit_or_operand(this);
    }
};

class aggregator: public inst {
private:
    std::string aggregate_name;
    inst_value_t source;
    inst_value_t destination;
    block* body;

public:
    aggregator(const std::string& agg_name,
               const inst_value_t& src,
               const inst_value_t& dest,
               const report::span& loc):
        inst(inst_kind::inst_aggr, loc),
        aggregate_name(agg_name),
        source(src), destination(dest), body(nullptr) {}
    aggregator(const aggregator& a):
        inst(inst_kind::inst_aggr, a.get_location()),
        aggregate_name(a.aggregate_name),
        source(a.source), destination(a.destination), body(nullptr) {}
    ~aggregator() override {
        delete body;
    }
    void set_body(block* b) { body = b; }
    auto get_body() { return body; }
    void dump(std::ostream&, const std::string&) const override;
    void accept(inst_visitor* v) override {
        v->visit_aggregator(this);
    }

public:
    const auto& get_target() const { return destination; }
    auto& get_mutable_target() { return destination; }
};

}
}