#pragma once

#include "godel-frontend/src/cli.h"
#include "godel-frontend/src/ir/ir_context.h"
#include "godel-frontend/src/ir/lir.h"
#include "godel-frontend/src/ast/ast_visitor.h"
#include "godel-frontend/src/sema/context.h"
#include "godel-frontend/src/symbol.h"
#include "godel-frontend/src/package/package.h"
#include "godel-frontend/src/error/error.h"

#include <cstring>
#include <sstream>

namespace godel {

using package::godel_module;

class ir_gen: public ast_visitor {
private:
    report::error& err;
    bool flag_enable_for_optimization = false;
    bool flag_enable_let_optimization = false;
    bool flag_enable_self_constraint_optimization = false;
    bool flag_ignore_do_schema_data_constraint = true;

private:
    inline static ir_context irc;
    souffle_rule_impl* current_rule = nullptr;
    std::vector<lir::block*> blocks;
    const context* ctx;

    bool in_data_constraint = false;
    std::string impl_schema_name = "";

private:
    void report_compiler_bug(ast_node* node, const std::string& msg) {
        err.err(node->get_location(),
            "internal compiler error: " + msg,
            "this is a compiler bug, please report it to us."
        );
    }

private:
    void emit_type_alias_for_database();
    void emit_type_alias_for_schema_with_primary_key(const schema&);
    void emit_type_alias_for_schema_without_primary_key(const schema&);
    void emit_type_alias_for_schema();
    void emit_type_alias_for_enum();

private:
    void emit_used_database_input_decl(const std::string&,
                                       const std::string&,
                                       const std::string&,
                                       const schema&);
    void emit_used_database_get_table_impl(const std::string&,
                                           const std::string&,
                                           const std::string&,
                                           const std::string&,
                                           const std::string&,
                                           const schema&);
    void emit_schema_data_constraint_impl(const std::string&,
                                          const std::string&,
                                          const std::string&,
                                          const std::string&,
                                          const schema&);
    void emit_used_database(const std::string&, const std::string&);
    void emit_database_get_table_decl();
    void emit_schema_decl();
    void emit_schema_method_decl(const function&, const std::string&);
    void emit_schema_inherit_method(const schema&,
                                    const function&,
                                    const std::string&);
    void emit_schema_type_check();
    void emit_schema_type_check_decl(const symbol&);
    void emit_schema_type_check_impl(const symbol&, const schema&);
    void emit_schema_get_field();
    void emit_DO_schema_default_constructor();
    void emit_func_decl();
    std::string full_name(identifier* node) const {
        return symbol({
            .type_name = node->get_name(),
            .type_loc = node->get_location()
        }).full_path_name();
    }

private:
    bool visit_use_stmt(use_stmt*) override { return true; }
    bool visit_database_decl(database_decl*) override { return true; }
    bool visit_schema_decl(schema_decl*) override { return true; }

private:
    enum class path_kind {
        null = 0,   // mark this infer is null
        database,   // global symbol: database
        enumerate,  // global symbol: enumeration
        schema,     // global symbol: schema
        basic,      // global symbol: basic type
        module_path // global symbol: module
    };
    struct infer_data {
        path_kind kind = path_kind::null;
        std::string content = "";
        bool is_null() const { return kind==path_kind::null; }
    };
    // record infer result of get path
    infer_data path_infer_result;

    // methods for generating symbol path
    void generate_basic_symbol(identifier*);
    void generate_database_symbol(identifier*);
    void generate_schema_symbol(identifier*);
    void generate_enum_symbol(identifier*);
    void generate_function_symbol(identifier*);
    void generate_package_symbol(identifier*);
    // used in call_head when type is identifier*
    void generate_symbol_call(identifier*);

    void get_path_from_basic(call_expr*);
    void get_path_from_database(call_expr*);
    void get_path_from_schema(call_expr*);
    void get_path_from_enum(call_expr*);
    void get_path_from_package(call_expr*);
    void get_path_from_infer(call_expr*);

private:
    // record infer result of get field
    infer field_infer_result = infer::null();

    void get_field_from_database(call_expr*);
    void get_field_from_schema(call_expr*);
    void get_field_from_basic(call_expr*);
    void get_field_from_infer(call_expr*);

private:
    enum class data_kind {
        null = 0,
        literal,     // integer literal
        variable,    // generated or declared variable
    };
    struct value_data {
        data_kind kind;
        std::string content;
        infer resolve;

        lir::inst_value_t to_inst_value() const;
    };
    std::vector<value_data> value_stack;
    void report_empty_value_stack(ast_node* node) {
        err.err(node->get_location(),
            "internal compiler error: value stack is empty.",
            "this is a compiler bug, please report it to us."
        );
    }

private:
    enum class func_kind {
        null = 0,
        function,      // function (static call)
        method,        // schema method (method call)
        database_load, // database loader static method (static call)
        find,          // aggregator find (method call)
        key_cmp,       // key_eq & key_neq method (method call)
        to_set,        // to_set method (method call)
        basic_method,  // basic method (method call)
        basic_static,  // basic static method (static call)
        schema_is,     // schema is method (method call)
        schema_to      // schema to method (method call)
    };
    struct func_data {
        func_kind kind;
        std::string content;
        infer resolve = infer::null();
        // used in is/to method
        std::string generic_type = "";
    };
    std::vector<func_data> func_stack;
    void report_empty_func_stack(ast_node* node) {
        err.err(node->get_location(),
            "internal compiler error: function stack is empty.",
            "this is a compiler bug, please report it to us."
        );
    }

private:
    size_t ssa_temp_id = 0;
    std::string generate_temp_variable() {
        return "ssa_temp_" + std::to_string(ssa_temp_id++);
    }

private:
    void generate_single_output(call_root*);
    void generate_output(block_stmt*);
    bool is_stdout_output_annotation(annotation*);
    void generate_annotated_output(annotation*, function_decl*);
    void generate_annotated_input(annotation*, function_decl*);

private:
    void generate_function_call(func_call*, lir::call*);
    void generate_method_call(func_call*, lir::call*);

private:
    std::unordered_set<std::string> ignored_DO_schema;
    void report_ignored_DO_schema_data_constraint();
    void report_no_output_predicate();

private:
    bool visit_number_literal(number_literal*) override;
    bool visit_string_literal(string_literal*) override;
    bool visit_unary_operator(unary_operator*) override;
    bool visit_binary_operator(binary_operator*) override;
    bool visit_boolean_literal(boolean_literal*) override;
    bool visit_impl_block(impl_block*) override;

    bool has_self_typecheck_free_annotation(function_decl*);
    void add_self_type_check();
    void add_parameter_type_check(function_decl*);
    bool check_need_parameter_type_check(function_decl*);
    void not_data_constraint_func_decl(const std::string&, function_decl*);
    void data_constraint_func_decl(const std::string&, function_decl*);
    bool visit_function_decl(function_decl*) override;
    bool visit_query_decl(query_decl*) override;
    bool visit_block_stmt(block_stmt*) override;

    lir::call* typecheck_defined_variable(const infer&, const std::string&);
    void generate_definition(const std::vector<var_decl*>&,
                             std::vector<lir::call*>&,
                             bool);
    bool visit_for_stmt(for_stmt*) override;
    // adjust order of generated IR, to change the join order, make it running faster
    // for statement often uses a large set, so this optimization is useful in most cases
    void optimized_for_stmt_gen(for_stmt*);
    void unoptimized_for_stmt_gen(for_stmt*);
    bool visit_let_stmt(let_stmt*) override;
    // adjust order of generated IR, to change the join order, make it running faster
    // let statement often uses single value or a small set
    // so this optimization is not very useful, or even harmful
    void optimized_let_stmt_gen(let_stmt*);
    void unoptimized_let_stmt_gen(let_stmt*);

    bool visit_cond_stmt(cond_stmt*) override;
    bool visit_if_stmt(if_stmt*) override;
    bool visit_ret_stmt(ret_stmt*) override;
    bool visit_fact_data(fact_data*) override;
    bool visit_fact_stmt(fact_stmt*) override;
    bool visit_match_pair(match_pair*) override;
    bool visit_match_stmt(match_stmt*) override;
    bool visit_in_block_expr(in_block_expr*) override;
    bool visit_call_head(call_head*) override;
    bool visit_call_expr(call_expr*) override;
    bool visit_call_root(call_root*) override;
    void generate_aggregator(const std::vector<call_expr*>&,
                             call_head*,
                             call_expr*);
    // handle all default aggregators except `*T.find`
    void handle_aggregator_call_root(call_root*);
    bool visit_func_call(func_call*) override;

public:
    void generate_field_pair(initializer_pair*,
                             std::unordered_map<std::string, value_data>&);
    void generate_spread_expr(spread_expr*,
                              std::unordered_map<std::string, value_data>&);
    bool visit_initializer(initializer*) override;

public:
    ir_gen(const context* c, report::error& e): err(e), ctx(c) {}
    static auto& get_mutable_context() { return irc; }
    static const auto& get_context() { return irc; }
    void generate(const cli::configure&, ast_root*);
};

}