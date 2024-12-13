
#include "semantic.h"
#include "engine.h"
#include "godel-frontend/src/util/util.h"

#include <iostream>
#include <queue>
#include <cstring>
#include <sstream>
#include <unordered_map>

namespace godel {

void semantic::generate_output_used_function_name() {
    ctx.output_used_functions = {};
    // load self functions
    for(const auto& i : ctx.global.get_domain(ctx.this_file_name).functions) {
        ctx.output_used_functions.insert({i.first, i.second.return_type});
    }

    // load self methods in schemas
    for(const auto& i : ctx.global.get_domain(ctx.this_file_name).schemas) {
        for(const auto& j : i.second.methods) {
            ctx.output_used_functions.insert(
                {i.first + "::" + j.first, j.second.return_type}
            );
        }
    }

    // load functions and methods from imported symbols
    for(const auto& i : ctx.imported_full_path_symbol_mapper) {
        if (ctx.global.get_kind(i.second)==symbol_kind::function) {
            const auto& return_type = ctx.global.get_func(i.second).return_type;
            ctx.output_used_functions.insert({i.first, return_type});
            // also allow short path
            auto pos = i.first.find_last_of(":");
            if (pos!=std::string::npos) {
                ctx.output_used_functions.insert({i.first.substr(pos+1), return_type});
            }
        } else if (ctx.global.get_kind(i.second)==symbol_kind::schema) {
            auto pos = i.first.find_last_of(":");
            for(const auto& j : ctx.global.get_schema(i.second).methods) {
                ctx.output_used_functions.insert(
                    {i.first + "::" + j.first, j.second.return_type}
                );
                if (pos==std::string::npos) {
                    continue;
                }
                // also allow short path
                ctx.output_used_functions.insert(
                    {i.first.substr(pos+1) + "::" + j.first, j.second.return_type}
                );
            }
        }
    }

    // generate path from imported symbol, for not full path function/method call
    for(const auto& i : ctx.this_name_space) {
        if (i.second==symbol_kind::schema) {
            auto index = ctx.mapper.at(i.first);
            for(const auto& j : ctx.global.get_schema(index).methods) {
                ctx.output_used_functions.insert(
                    {i.first + "::" + j.first, j.second.return_type}
                );
            }
        }
    }
}

void semantic::generate_constructor_for_DO_schema() {
    // DO schemas have default constructors, with one parameter `db`
    // which is the database object to be used by this schema
    // and this default constructor will be marked as `unimplemented`
    // example:
    //
    // pub fn __all__(db: Database) -> *Self;
    //        ^^^^^^^ constructor name
    // pub fn __all__(db: Database) -> *Self;
    //                ^^^^^^^^^^^^ database parameter
    // pub fn __all__(db: Database) -> *Self;
    //                                      ^ this means unimplemented
    //

    auto& domain = ctx.global.get_domain(ctx.this_file_name);
    for(auto& sc : domain.schemas) {
        if (!sc.second.referenced_by_database_table) {
            continue;
        }

        // if __all__ already exists, skip it.
        // but will report warning in souffle codegen pass
        if (sc.second.methods.count("__all__")) {
            continue;
        }

        function constructor;
        constructor.name = "__all__";
        constructor.location = sc.second.location;
        constructor.public_access_authority = true;
        constructor.implemented = false;
        constructor.is_global = false;

        const auto& db = domain.databases.at(sc.second.referenced_database_name);
        symbol parameter = {
            .type_name = db.name,
            .type_loc = db.location
        };

        constructor.parameter_list.insert({"db", parameter});
        constructor.ordered_parameter_list.push_back("db");
        constructor.return_type = symbol {
            .type_name = sc.second.name,
            .type_loc = sc.second.location,
            .location = span::null(),
            .is_set = true
        };

        sc.second.methods.insert({"__all__", constructor});
    }
}

void semantic::report_redefined_variable(const span& loc, const std::string& name) {
    if (ctx.this_name_space.count(name)) {
        err.err(loc,
            "redefinition of variable \"" + name + "\".",
            "conflicts with global symbol \"" + name + "\"."
        );
        return;
    }
    if (ctx.global.get_native().count(name)) {
        err.err(loc,
            "redefinition of variable \"" + name + "\".",
            "conflicts with native function \"" + name + "\"."
        );
        return;
    }
    if (local_scope.count(name)) {
        err.err(loc,
            "redefinition of variable \"" + name + "\".",
            "conflicts with local variable \"" + name + "\", " +
            "check parameter and previous definition."
        );
        err.warn(local_scope.at(name).location, "previous definition here.");
        return;
    }
}

void semantic::error_method_not_public(const span& call_location,
                                       const std::string& method_name,
                                       const symbol& belonged_type) {
    err.err(call_location,
        "\"" + belonged_type.full_path_name() + "::" + method_name +
        "\" is a private method.",
        "consider adding \"pub\" before the declaration."
    );
}

void semantic::warn_method_not_public(const span& call_location,
                                      const std::string& method_name,
                                      const symbol& belonged_type) {
    err.warn(call_location,
        "\"" + belonged_type.full_path_name() + "::" + method_name +
        "\" is a private method.",
        "will be error in future version."
    );
}

void semantic::report_method_private_access(const span& call_location,
                                            const std::string& method_name,
                                            const symbol& belonged_type) {
    const auto& schema_domain = ctx.global.get_domain(belonged_type.type_loc.file);
    const auto& schema_table = schema_domain.schemas;
    if (!schema_table.count(belonged_type.type_name)) {
        // unreachable
        return;
    }

    const auto& schema_structure = schema_table.at(belonged_type.type_name);
    // in global function scope
    if (!impl_schema_name.length()) {
        if (!flag_check_access_authority) {
            warn_method_not_public(call_location, method_name, belonged_type);
            return;
        }
        error_method_not_public(call_location, method_name, belonged_type);
        return;
    }
    // in impl function scope but is not called in the same schema
    if (!schema_table.count(impl_schema_name) ||
        schema_table.at(impl_schema_name).location!=schema_structure.location) {
        if (!flag_check_access_authority) {
            warn_method_not_public(call_location, method_name, belonged_type);
            return;
        }
        error_method_not_public(call_location, method_name, belonged_type);
        return;
    }
}

void semantic::error_function_not_public(const span& call_location,
                                         const std::string& function_name,
                                         const std::string& type_full_path) {
    err.err(call_location,
        "\"" + type_full_path + (type_full_path.length()? "::":"") +
        function_name + "\" is a private method.",
        "consider adding \"pub\" before the declaration."
    );
}

void semantic::warn_function_not_public(const span& call_location,
                                        const std::string& function_name,
                                        const std::string& type_full_path) {
    err.warn(call_location,
        "\"" + type_full_path + (type_full_path.length()? "::":"") +
        function_name + "\" is a private method.",
        "will be error in future version."
    );
}

void semantic::report_static_private_access(const span& call_location,
                                            const function& func,
                                            const std::string& type_full_path) {
    // global function call
    if (func.is_global) {
        if (!flag_check_access_authority) {
            warn_function_not_public(call_location, func.name, type_full_path);
            return;
        }
        error_function_not_public(call_location, func.name, type_full_path);
        return;
    }

    // schema static method call
    const auto index = ctx.global.get_index(type_full_path);
    if (index==global_symbol_table::npos ||
        ctx.global.get_kind(index)!=symbol_kind::schema) {
        return;
    }
    const auto& schema_structure = ctx.global.get_schema(index);
    if (impl_schema_name!=schema_structure.name ||
        schema_structure.location.file!=ctx.this_file_name) {
        if (!flag_check_access_authority) {
            warn_function_not_public(call_location, func.name, type_full_path);
            return;
        }
        error_function_not_public(call_location, func.name, type_full_path);
        return;
    }
}

void semantic::for_stmt_check(for_stmt* node, const function& func) {
    std::vector<std::string> variable_list;
    for (auto child : node->get_symbols()) {
        const auto& variable_name = child->get_var_name()->get_name();
        const auto variable_type = for_definition(child);
        // error occurred, skip
        if (variable_type.is_err()) {
            continue;
        }
        // register local variable name
        variable_list.push_back(variable_name);
        // register local variable type
        local_scope.insert({variable_name, variable_type});
    }

    if (node->has_statement()) {
        embedded_code_block(node->get_code_block(), func);
    }

    // delete local variable
    for (const auto& name : variable_list) {
        local_scope.erase(name);
    }
}

symbol semantic::for_definition(var_decl* node) {
    const auto init_node = node->get_init_value();
    const auto name_node = node->get_var_name();
    const auto& name = name_node->get_name();

    // get initializing type
    const auto infer_result = expression(init_node);
    const auto& type = infer_result.type;
    node->set_resolve(infer_result);
    name_node->set_resolve(infer_result);

    symbol variable_type = {
        .type_name = "",
        .type_loc = span::null(),
        .location = name_node->get_location(),
        .is_set = false
    };

    if (type.is_err()) {
        err.err(name_node->get_location(),
            "get error when analysing initial value."
        );
        return symbol::error();
    }

    if (!type.is_set) {
        err.err(init_node->get_location(),
            "must initialize with data set but get \"" +
            type.full_path_name() + "\"."
        );
        return symbol::error();
    }

    // get symbol type
    if (!node->has_declared_type()) {
        // infer variable's type automatically
        variable_type.is_set = false;
        variable_type.type_name = type.type_name;
        variable_type.type_loc = type.type_loc;
    } else {
        const auto type_node = node->get_type();
        // the type is defined by user
        variable_type.is_set = type_node->is_set();
        variable_type.type_name = type_node->get_short_name();
        variable_type.type_loc = ctx.find_global_location(variable_type.type_name);
        // check full path type
        if (type_node->is_full_path()) {
            if (!ctx.check_full_path_type_imported(err, type_node)) {
                return symbol::error();
            }
            const auto& full_path_name = type_node->get_full_name();
            const auto index = ctx.global.get_index(full_path_name);
            variable_type.type_loc = ctx.global.get_location(index);
        } else {
            ctx.report_conflict_symbol(
                err,
                type_node->get_location(),
                variable_type.type_name
            );
        }
    }

    // check if infer gets type name, not instance
    if (infer_result.is_global) {
        err.err(init_node->get_location(),
            "must use \"" + type.full_path_name() +
            "\" instance to initialize."
        );
        return symbol::error();
    } else if (infer_result.type.is_all_data()) {
        err.err(init_node->get_location(),
            "cannot use <__all_data__> type to initialize variables."
        );
        return symbol::error();
    }

    // check identifier's type matches the expression type
    if (variable_type!=type || variable_type.is_set) {
        err.err(variable_type.location,
            "initialized with \"" + type.full_path_name_without_set() +
            "\" but is defined as \"" + variable_type.full_path_name() + "\"."
        );
        return symbol::error();
    }

    // bool is a special type, cannot be used as variable
    if (variable_type==symbol::boolean()) {
        err.err(variable_type.location,
            "variable's type should not be \"bool\"."
        );
        return symbol::error();
    }

    // check redefinition
    if (ctx.invalid_variable_name.count(name)) {
        err.err(variable_type.location,
            "variables cannot use this name.",
            "this name is reserved to avoid confliction in generated codes."
        );
        return symbol::error();
    }
    if (ctx.global.get_basics().count(name)) {
        err.err(variable_type.location, "cannot define basic type name.");
        return symbol::error();
    }
    if (ctx.global.get_reserved_id().count(name)) {
        err.err(variable_type.location, "cannot define reserved symbol name.");
        return symbol::error();
    }
    if (ctx.this_name_space.count(name) ||
        ctx.global.get_native().count(name) ||
        local_scope.count(name)) {
        report_redefined_variable(variable_type.location, name);
        return symbol::error();
    }

    if (ctx.global.get_packages().count(name)) {
        const auto& info = ctx.global.get_packages().at(name);
        err.err(variable_type.location,
            "symbol \"" + name +
            "\" conflicts with module name \"" + info.name + "\"."
        );
        return symbol::error();
    }

    ctx.global.add_local_variable(name, name_node->get_location(), variable_type);
    return variable_type;
}

void semantic::let_stmt_check(let_stmt* node, const function& func) {
    std::vector<std::string> variable_list;
    for (auto child: node->get_symbols()) {
        const auto& variable_name = child->get_var_name()->get_name();
        const auto variable_type = let_definition(child);
        // error occurred, stop
        if (variable_type.is_err()) {
            continue;
        }
        // register local variable name
        variable_list.push_back(variable_name);
        // register local variable type
        local_scope.insert({variable_name, variable_type});
    }

    if (node->has_statement()) {
        embedded_code_block(node->get_code_block(), func);
    }

    // delete local variable
    for (const auto& name : variable_list) {
        local_scope.erase(name);
    }
}

symbol semantic::let_definition(var_decl* node) {
    const auto init_node = node->get_init_value();
    const auto name_node = node->get_var_name();
    const auto& name = name_node->get_name();

    // get initializing type
    const auto infer_result = expression(init_node);
    const auto& type = infer_result.type;
    node->set_resolve(infer_result);
    name_node->set_resolve(infer_result);

    symbol variable_type = {
        .type_name = "",
        .type_loc = span::null(),
        .location = name_node->get_location(),
        .is_set = false
    };

    if (type.is_err()) {
        err.err(name_node->get_location(),
            "get error when analysing initial value."
        );
        return symbol::error();
    }

    // get symbol type
    if (!node->has_declared_type()) {
        // the variable's type should be inferred automatically
        variable_type.is_set = type.is_set;
        variable_type.type_name = type.type_name;
        variable_type.type_loc = type.type_loc;
    } else {
        const auto type_node = node->get_type();
        // the type is defined by user
        variable_type.is_set = type_node->is_set();
        variable_type.type_name = type_node->get_short_name();
        variable_type.type_loc = ctx.find_global_location(variable_type.type_name);
        // check full path type
        if (type_node->is_full_path()) {
            if (!ctx.check_full_path_type_imported(err, type_node)) {
                return symbol::error();
            }
            const auto& full_path_name = type_node->get_full_name();
            const auto index = ctx.global.get_index(full_path_name);
            variable_type.type_loc = ctx.global.get_location(index);
        } else {
            ctx.report_conflict_symbol(
                err,
                type_node->get_location(),
                variable_type.type_name
            );
        }
    }

    // check if infer gets type name, not instance
    if (infer_result.is_global) {
        err.err(init_node->get_location(),
            "must use \"" + type.full_path_name() +
            "\" instance to initialize."
        );
        return symbol::error();
    } else if (infer_result.type.is_all_data()) {
        err.err(init_node->get_location(),
            "cannot use <__all_data__> type to initialize variables."
        );
        return symbol::error();
    }

    // check if having the same type
    if (variable_type!=type || variable_type.is_set!=type.is_set) {
        err.err(variable_type.location,
            "initialized with \"" + type.full_path_name() +
            "\" but is defined as \"" + variable_type.full_path_name() + "\"."
        );
        return symbol::error();
    }

    // bool is a special type, cannot be used as variable
    if (variable_type==symbol::boolean()) {
        err.err(variable_type.location,
            "variable's type should not be \"bool\"."
        );
        return symbol::error();
    }

    // check redefinition
    if (ctx.invalid_variable_name.count(name)) {
        err.err(variable_type.location,
            "variables cannot use this name.",
            "this name is reserved to avoid confliction in generated codes."
        );
        return symbol::error();
    }
    if (ctx.global.get_basics().count(name)) {
        err.err(variable_type.location, "cannot define basic type name.");
        return symbol::error();
    }
    if (ctx.global.get_reserved_id().count(name)) {
        err.err(variable_type.location, "cannot define reserved symbol name.");
        return symbol::error();
    }
    if (ctx.this_name_space.count(name) ||
        ctx.global.get_native().count(name) ||
        local_scope.count(name)) {
        report_redefined_variable(variable_type.location, name);
        return symbol::error();
    }

    if (ctx.global.get_packages().count(name)) {
        const auto& info = ctx.global.get_packages().at(name);
        err.err(variable_type.location,
            "symbol \"" + name +
            "\" conflicts with module name \"" + info.name + "\"."
        );
        return symbol::error();
    }

    ctx.global.add_local_variable(name, name_node->get_location(), variable_type);
    return variable_type;
}

void semantic::if_stmt_check(if_stmt* node, const function& func) {
    if (node->has_condition()) {
        const auto type = expression(node->get_condition()).type;
        if (type!=symbol::boolean() && !type.is_err()) {
            err.err(node->get_condition()->get_location(),
                "condition type must be \"bool\"."
            );
        }
    }

    if (node->has_statement()) {
        embedded_code_block(node->get_code_block(), func);
    }
}

void semantic::embedded_code_block(block_stmt* node, const function& func) {
    for(auto i : node->get_statement()) {
        if (i->get_ast_class()!=ast_class::ac_fact_stmt) {
            statement_check(i, func);
        }
    }
}

void semantic::cond_stmt_check(cond_stmt* node, const function& func) {
    if_stmt_check(node->get_if_stmt(), func);

    // check if having else branches when switch is on
    if (node->get_elsif_stmt().size() || node->has_else_stmt()) {
        err.err(node->get_location(),
            "else branches are not allowed.",
            "may cause fatal ungrounded error."
        );
        return;
    }

    for(auto child : node->get_elsif_stmt()) {
        if_stmt_check(child, func);
    }
    if (node->has_else_stmt()) {
        if_stmt_check(node->get_else_stmt(), func);
    }
}

void semantic::match_stmt_check(match_stmt* node, const function& func) {
    const auto type = expression(node->get_match_condition()).type;
    if (type!=symbol::i64() && type!=symbol::f64() && type!=symbol::str()) {
        err.err(node->get_match_condition()->get_location(),
            "only \"int\", \"float\", \"string\" is available, but get \"" +
            type.full_path_name() + "\"."
        );
        return;
    }

    for(auto pairs : node->get_match_pair_list()) {
        auto literal = pairs->get_literal();
        if (literal->get_ast_class()!=ast_class::ac_string_literal &&
            literal->get_ast_class()!=ast_class::ac_number_literal) {
            err.err(literal->get_location(),
                "only number or string literal is available."
            );
        } else if ((type==symbol::i64() || type==symbol::f64()) &&
            literal->get_ast_class()!=ast_class::ac_number_literal) {
            err.err(literal->get_location(), "expected number literal.");
        } else if (type==symbol::str() &&
            literal->get_ast_class()!=ast_class::ac_string_literal) {
            err.err(literal->get_location(), "expected string literal.");
        }
        if (pairs->get_statement()->get_ast_class()==ast_class::ac_fact_stmt) {
            continue;
        }
        statement_check(pairs->get_statement(), func);
    }
}

void semantic::fact_stmt_check(fact_stmt* node, const function& func) {
    // check function parameter format is correct
    bool error_in_type_list = false;
    std::vector<symbol> type_list;
    for (const auto& parameter : func.ordered_parameter_list) {
        const auto& type = func.parameter_list.at(parameter);
        if (type!=symbol::i64() && type!=symbol::str()) {
            err.err(type.location,
                "this is fact statement function,"
                " only integer or string is allowed."
            );
            error_in_type_list = true;
        }
        type_list.push_back(type);
    }
    if (error_in_type_list) {
        return;
    }

    // check fact data
    for (auto child : node->get_facts()) {
        if (child->get_literals().size()!=type_list.size()) {
            err.err(child->get_location(),
                "expect " + std::to_string(type_list.size()) + " literal(s)."
            );
            return;
        }
        for (size_t i = 0; i < child->get_literals().size(); ++i) {
            auto column = child->get_literals()[i];
            if (column->get_ast_class()==ast_class::ac_number_literal) {
                column->set_resolve(
                    ((number_literal*)column)->is_integer()? infer::i64():infer::f64()
                );
            } else if (column->get_ast_class()==ast_class::ac_string_literal) {
                column->set_resolve(infer::str());
            }
            if (column->get_ast_class()==ast_class::ac_number_literal &&
                type_list[i] != symbol::i64()) {
                err.err(column->get_location(), "expect string literal here.");
            } else if (column->get_ast_class()==ast_class::ac_string_literal &&
                type_list[i] != symbol::str()) {
                err.err(column->get_location(), "expect number literal here.");
            }
        }
    }
}

void semantic::ret_stmt_check(ret_stmt* node, const function& func) {
    const auto return_value_node = node->get_return_value();
    const auto infer_result = expression(return_value_node);

    const auto& infer_type = infer_result.type;
    const auto& return_type = func.return_type;

    node->set_resolve(infer_result);

    if (infer_result.is_global) {
        err.err(return_value_node->get_location(),
            "should return \"" +
            return_type.full_path_name() +
            "\" instance."
        );
        return;
    }

    // only compare type name here
    if (infer_type!=return_type) {
        err.err(return_value_node->get_location(),
            "should return \"" + return_type.full_path_name() +
            "\" but get \"" + infer_type.full_path_name() + "\"."
        );
        return;
    }

    if (infer_type.is_set && !return_type.is_set) {
        err.err(return_value_node->get_location(),
            "return single value but get value set."
        );
        return;
    }

    // set return value could use both return and yield
    if (infer_type.is_set && return_type.is_set) {
        return;
    }

    if (return_type.is_set && !node->is_yield()) {
        err.err(node->get_location(), "should use \"yield\" here.");
    } else if (!return_type.is_set && node->is_yield()) {
        err.err(node->get_location(), "should use \"return\" here.");
    }
}

void semantic::in_block_expr_stmt(in_block_expr* node) {
    node->set_resolve(expression(node->get_expr()));
    if (node->get_resolve().is_global) {
        err.err(
            node->get_location(),
            "global symbol is not allowed to be a single statement.",
            "require a call expression after this symbol."
        );
    }
}

void semantic::statement_in_main_function_check(stmt* node) {
    if (!in_main_function) {
        return;
    }
    if (node->get_ast_class()!=ast_class::ac_in_block_expr) {
        err.err(node->get_location(),
            "this statement is not allowed in main function.",
            "only output call is allowed."
        );
        return;
    }
    auto expr_node = reinterpret_cast<in_block_expr*>(node)->get_expr();
    if (expr_node->get_ast_class()!=ast_class::ac_call_root) {
        err.err(expr_node->get_location(),
            "only output call is allowed in main function."
        );
        return;
    }
    auto call_head = reinterpret_cast<call_root*>(expr_node)->get_call_head();
    auto first_call = call_head->get_first_expression();
    if (first_call->get_ast_class()!=ast_class::ac_identifier) {
        err.err(first_call->get_location(),
            "only output call is allowed in main function."
        );
        return;
    }
    auto id_node = reinterpret_cast<identifier*>(first_call);
    if (id_node->get_name()!="output") {
        err.err(id_node->get_location(),
            "only output call is allowed in main function."
        );
        return;
    }
}

void semantic::statement_check(stmt* node, const function& func) {
    statement_in_main_function_check(node);
    switch(node->get_ast_class()) {
        case ast_class::ac_for_stmt: for_stmt_check((for_stmt*)node, func); break;
        case ast_class::ac_let_stmt: let_stmt_check((let_stmt*)node, func); break;
        case ast_class::ac_cond_stmt: cond_stmt_check((cond_stmt*)node, func); break;
        case ast_class::ac_match_stmt: match_stmt_check((match_stmt*)node, func); break;
        case ast_class::ac_fact_stmt: fact_stmt_check((fact_stmt*)node, func); break;
        case ast_class::ac_ret_stmt: ret_stmt_check((ret_stmt*)node, func); break;
        case ast_class::ac_in_block_expr: in_block_expr_stmt((in_block_expr*)node); break;
        default: err.err(node->get_location(), "unexpected statement."); break;
    }
}

infer semantic::expression(expr* node) {
    switch(node->get_ast_class()) {
        case ast_class::ac_number_literal:
            if (((number_literal*)node)->is_integer()) {
                node->set_resolve(infer::i64());
                return infer::i64();
            } else {
                node->set_resolve(infer::f64());
                return infer::f64();
            }
        case ast_class::ac_string_literal:
            node->set_resolve(infer::str());
            return infer::str();
        case ast_class::ac_boolean_literal:
            node->set_resolve(infer::boolean());
            return infer::boolean();
        case ast_class::ac_binary_operator:
            return binary_expr((binary_operator*)node);
        case ast_class::ac_unary_operator:
            switch(((unary_operator*)node)->get_operator_type()) {
                case unary_operator::type::arithmetic_negation:
                    return unary_neg_expr((unary_operator*)node);
                case unary_operator::type::logical_negation:
                    return not_expr((unary_operator*)node);
            } break;
        case ast_class::ac_call_root: return call((call_root*)node);
        default:
            err.err(node->get_location(), "unexpected expression.");
            break;
    }
    return infer::error();
}

infer semantic::or_expr(binary_operator* node) {
    const auto left_type = expression(node->get_left()).type;
    const auto right_type = expression(node->get_right()).type;

    if (!left_type.is_err() && left_type!=symbol::boolean()) {
        err.err(node->get_left()->get_location(),
            "expression has type \"" + left_type.full_path_name() +
            "\", which is not \"bool\"."
        );
    }

    if (!right_type.is_err() && right_type!=symbol::boolean()) {
        err.err(node->get_right()->get_location(),
            "expression has type \"" + right_type.full_path_name() +
            "\", which is not \"bool\"."
        );
    }

    node->set_resolve(infer::boolean());
    return infer::boolean();
}

infer semantic::and_expr(binary_operator* node) {
    const auto left_type = expression(node->get_left()).type;
    const auto right_type = expression(node->get_right()).type;

    if (!left_type.is_err() && left_type!=symbol::boolean()) {
        err.err(node->get_left()->get_location(),
            "expression has type \"" + left_type.full_path_name() +
            "\", which is not \"bool\"."
        );
    }

    if (!right_type.is_err() && right_type!=symbol::boolean()) {
        err.err(node->get_right()->get_location(),
            "expression has type \"" + right_type.full_path_name() +
            "\", which is not \"bool\"."
        );
    }

    node->set_resolve(infer::boolean());
    return infer::boolean();
}

infer semantic::in_expr(binary_operator* node) {
    const auto left_infer = expression(node->get_left());
    const auto right_infer = expression(node->get_right());
    const auto& left_type = left_infer.type;
    const auto& right_type = right_infer.type;
    node->set_resolve(infer::boolean());
    if (left_type.is_err() || right_type.is_err()) {
        return infer::boolean();
    }
    if (left_infer.is_global) {
        err.err(node->get_left()->get_location(),
            "must use an instance of \"" +
            left_infer.type.full_path_name() + "\"."
        );
        return infer::boolean();
    }
    if (right_infer.is_global) {
        err.err(node->get_right()->get_location(),
            "must use an instance of \"" +
            right_infer.type.full_path_name() + "\"."
        );
        return infer::boolean();
    }

    // left hand side value should not be value set
    if (left_type.is_set) {
        err.err(node->get_left()->get_location(),
            "expect single value but get set \"" +
            left_type.full_path_name() + "\"."
        );
        return infer::boolean();
    }

    // right hand side value must be value set
    if (!right_type.is_set) {
        err.err(node->get_right()->get_location(),
            "expect \"*" + left_type.full_path_name() +
            "\", but get single value \"" + right_type.full_path_name() +
            "\"."
        );
        return infer::boolean();
    }

    // type should be the same
    if (left_type!=right_type) {
        err.err(node->get_right()->get_location(),
            "expect \"*" + left_type.full_path_name() +
            "\", but get \"" + right_type.full_path_name() +
            "\"."
        );
        return infer::boolean();
    }
    return infer::boolean();
}

infer semantic::mult_expr(binary_operator* node) {
    const auto left_type = expression(node->get_left()).type;
    const auto right_type = expression(node->get_right()).type;
    if (left_type.is_err() || right_type.is_err()) {
        return infer::error();
    }
    const auto operator_type = std::string(
        node->get_operator_type()==binary_operator::type::mult? "*":"/"
    );
    if (left_type.is_set) {
        err.err(node->get_left()->get_location(),
            "operator " + operator_type +
            " cannot be used on set type \"" +
            left_type.full_path_name() + "\"."
        );
        return infer::error();
    }
    if (right_type.is_set) {
        err.err(node->get_right()->get_location(),
            "operator " + operator_type +
            " cannot be used on set type \"" +
            right_type.full_path_name() + "\"."
        );
        return infer::error();
    }
    if ((left_type==symbol::i64() || left_type==symbol::f64()) &&
        (left_type==right_type)) {
        auto infer_result = (left_type==symbol::f64() || right_type==symbol::f64())?
               infer::f64():infer::i64();
        node->set_resolve(infer_result);
        return infer_result;
    }
    err.err(node->get_location(),
        std::string("operator") + operator_type +
        " cannot be used on type \"" + left_type.full_path_name() +
        "\" and \"" + right_type.full_path_name() + "\"."
    );
    return infer::error();
}

infer semantic::add_expr(binary_operator* node) {
    const auto left_type = expression(node->get_left()).type;
    const auto right_type = expression(node->get_right()).type;
    if (left_type.is_err() || right_type.is_err()) {
        return infer::error();
    }
    const auto operator_type = std::string(
        node->get_operator_type()==binary_operator::type::add? "+":"-"
    );
    if (left_type.is_set) {
        err.err(node->get_left()->get_location(),
            "operator " + operator_type +
            " cannot be used on set type \"" +
            left_type.full_path_name() + "\"."
        );
        return infer::error();
    }
    if (right_type.is_set) {
        err.err(node->get_right()->get_location(),
            "operator " + operator_type +
            " cannot be used on set type \"" +
            right_type.full_path_name() + "\"."
        );
        return infer::error();
    }
    if ((left_type==symbol::i64() || left_type==symbol::f64()) && (left_type==right_type)) {
        auto infer_result = (left_type==symbol::f64() || right_type==symbol::f64())?
               infer::f64():infer::i64();
        node->set_resolve(infer_result);
        return infer_result;
    } else if (left_type==symbol::str() && right_type==symbol::str() &&
        node->get_operator_type()==binary_operator::type::add) {
        node->set_resolve(infer::str());
        return infer::str();
    }
    err.err(node->get_location(),
        "operator" + operator_type +
        " cannot be used on type \"" + left_type.full_path_name() +
        "\" and \"" + right_type.full_path_name() + "\"."
    );
    return infer::error();
}

infer semantic::unary_neg_expr(unary_operator* node) {
    const auto infer_result = expression(node->get_child());
    const auto type = infer_result.type;
    if (type.is_err()) {
        return infer::error();
    }
    if (type.is_set) {
        err.err(node->get_location(),
            "negative operator cannot be used on set type \"" +
            type.full_path_name() + "\"."
        );
        return infer::error();
    }
    if (type!=symbol::i64() && type!=symbol::f64()) {
        err.err(node->get_location(),
            "negative operator cannot be used on type \"" +
            type.full_path_name() + "\"."
        );
        return infer::error();
    }
    node->set_resolve(infer_result);
    return infer_result;
}

infer semantic::binary_expr(binary_operator* node) {
    switch(node->get_operator_type()) {
        case binary_operator::type::logical_or: return or_expr(node);
        case binary_operator::type::logical_and: return and_expr(node);
        case binary_operator::type::compare_equal:
        case binary_operator::type::compare_great:
        case binary_operator::type::compare_great_equal:
        case binary_operator::type::compare_less:
        case binary_operator::type::compare_less_equal:
        case binary_operator::type::compare_not_equal: return cmp_expr(node);
        case binary_operator::type::add:
        case binary_operator::type::sub: return add_expr(node);
        case binary_operator::type::mult:
        case binary_operator::type::div: return mult_expr(node);
        case binary_operator::type::in: return in_expr(node);
    }
    return infer::error();
}

infer semantic::not_expr(unary_operator* node) {
    const auto type = expression(node->get_child()).type;
    node->set_resolve(infer::boolean());
    if (type.is_err()) {
        return infer::boolean();
    }
    if (type!=symbol::boolean() || type.is_set) {
        err.err(node->get_location(),
            "operator \"!\" cannot be used on \"" +
            type.full_path_name() + "\"."
        );
        return infer::boolean();
    }
    return infer::boolean();
}

infer semantic::cmp_expr(binary_operator* node) {
    const auto left_infer = expression(node->get_left());
    const auto right_infer = expression(node->get_right());
    const auto& left_type = left_infer.type;
    const auto& right_type = right_infer.type;
    node->set_resolve(infer::boolean());
    if (left_type.is_err() || right_type.is_err()) {
        return infer::boolean();
    }

    // must compare instance
    if (left_infer.is_global) {
        err.err(node->get_left()->get_location(),
            "must compare \"" + left_type.full_path_name() + "\" instance."
        );
        return infer::boolean();
    }
    if (right_infer.is_global) {
        err.err(node->get_right()->get_location(),
            "must compare \"" + right_type.full_path_name() + "\" instance."
        );
        return infer::boolean();
    }

    // cannot compare data set
    if (left_type.is_set || right_type.is_set) {
        err.err(node->get_left()->get_location(),
            "cannot compare \"" + left_type.full_path_name() +
            "\" with \"" + right_type.full_path_name() + "\".",
            "use \"in\" if trying to check single value is in a set."
        );
        return infer::boolean();
    }

    // types should be the same
    if (left_type!=right_type) {
        err.err(node->get_location(),
            "cannot do comparison between \"" + left_type.full_path_name() +
            "\" and \"" + right_type.full_path_name() + "\".",
            "only same type can be compared."
        );
        return infer::boolean();
    }

    // check number and string normal type comparison
    if ((left_type==symbol::i64() || left_type==symbol::f64())) {
        return infer::boolean();
    } else if (left_type==symbol::str() && left_type==right_type) {
        if (node->get_operator_type()!=binary_operator::type::compare_equal &&
            node->get_operator_type()!=binary_operator::type::compare_not_equal) {
            err.err(node->get_location(),
                "\"string\" has only \"eq\" and \"ne\" method.",
                "only \"=\" and \"!=\" are allowed."
            );
        }
        return infer::boolean();
    }

    // check other types
    if (node->get_operator_type()!=binary_operator::type::compare_equal &&
        node->get_operator_type()!=binary_operator::type::compare_not_equal) {
        err.err(node->get_location(),
            "cannot do comparison between \"" + left_type.full_path_name() +
            "\" and \"" + right_type.full_path_name() + "\".",
            "only \"int\", \"float\" type is allowed to use \">\", \">=\", \"<\", \"<=\"."
        );
        return infer::boolean();
    }

    // check string comparison
    if (left_type==symbol::str() && right_type==symbol::str() &&
        node->get_operator_type()!=binary_operator::type::compare_equal &&
        node->get_operator_type()!=binary_operator::type::compare_not_equal) {
        err.err(node->get_location(), "\"string\" has only \"eq\" and \"ne\" method.");
        return infer::boolean();
    }
    return infer::boolean();
}

infer semantic::call(call_root* node) {
    // check call head, for example:
    // 114.add(514).sub(1919810)
    // ^^^ this is the call head
    auto infer_result = check_first(node->get_call_head());
    node->get_call_head()->set_resolve(infer_result);

    // check call path tail
    for(auto child : node->get_call_chain()) {
        // get error type, stop
        if (infer_result.type.is_err()) {
            return infer_result;
        }
        // analyze .(symget) ::(sympath)
        switch(child->get_call_type()) {
            case call_expr::type::get_field:
                infer_result = check_field(infer_result, child); break;
            case call_expr::type::get_path:
                infer_result = check_path(infer_result, child); break;
        }
        child->set_resolve(infer_result);
    }

    ctx.global.add_infer(node->get_location(), infer_result.type);
    if (ctx.global.get_packages().count(infer_result.type.type_name)) {
        err.err(node->get_location(),
            "cannot call module \"" + infer_result.type.type_name + "\"."
        );
    }
    node->set_resolve(infer_result);
    return infer_result;
}

infer semantic::check_first(call_head* node) {
    // bool stores if the result value is a global type, not an object of this type
    auto first_expression = node->get_first_expression();
    if (first_expression->get_ast_class()!=ast_class::ac_identifier) {
        return expression(first_expression);
    }

    // get name
    const auto& name = reinterpret_cast<identifier*>(first_expression)->get_name();

    // special output function check
    if (name=="output") {
        return check_output_function_call(node);
    }

    // find if in local scope, local scope symbols have higher priority
    if (local_scope.count(name)) {
        return check_local(node);
    }

    // find if it is a global symbol or reserved identifier
    if (ctx.find_global(name)) {
        return check_global(node);
    } else if (ctx.global.get_reserved_id().count(name)) {
        return check_reserved_id(node);
    }

    // if is "Self", then replace it with implemented schema's name
    if (impl_schema_name.length() && name=="Self") {
        // statement like `Self {field_0 : ___, field_1 : ___}`
        if (node->is_initializer()) {
            return check_initializer({
                .type_name = impl_schema_name,
                .type_loc = ctx.find_global_location(impl_schema_name)},
                node->get_initializer()
            );
        }
        // statement like `Self(__)`, this is schema loader
        if (node->has_func_call()) {
            return check_loader(node);
        }

        // nothing is called, generate global Self infer
        const infer infer_result = {true, {
            impl_schema_name,
            ctx.find_global_location(impl_schema_name),
            span::null(),
            false
        }};
        first_expression->set_resolve(infer_result);
        return infer_result;
    }

    // get "Self" but it is not in impl statement, so error occurred
    if (!impl_schema_name.length() && name=="Self") {
        err.err(first_expression->get_location(),
            "cannot find a schema to bind."
        );
        return infer::error();
    }

    // undefined symbol
    err.err(first_expression->get_location(),
        "undefined symbol \"" + name + "\"."
    );
    return infer::error();
}

infer semantic::check_local(call_head* node) {
    auto first = node->get_first_expression();
    const auto& name = reinterpret_cast<identifier*>(first)->get_name();
    if (node->has_func_call()) {
        err.err(node->get_location(),
            "\"" + name + "\" is not a function."
        );
    }
    
    const infer infer_result = {false, local_scope.at(name)};
    first->set_resolve(infer_result);
    node->set_resolve(infer_result);
    return infer_result;
}

infer semantic::check_reserved_id(call_head* node) {
    auto first = node->get_first_expression();
    const auto& name = reinterpret_cast<identifier*>(first)->get_name();
    if (node->has_func_call()) {
        err.err(node->get_location(),
            "\"" + name + "\" is not a function."
        );
    }
    
    const infer infer_result = {false, ctx.global.get_reserved_id().at(name)};
    first->set_resolve(infer_result);
    node->set_resolve(infer_result);
    return infer_result;
}

infer semantic::check_global(call_head* node) {
    // get type name
    const auto first = node->get_first_expression();
    const auto& name = reinterpret_cast<identifier*>(first)->get_name();

    // check ambiguous symbol
    ctx.report_conflict_symbol(err, node->get_location(), name);

    switch(ctx.find_global_kind(name)) {
        case symbol_kind::basic: return check_global_basic(node);
        case symbol_kind::enumerate: return check_global_enum(node);
        case symbol_kind::database: return check_global_database(node);
        case symbol_kind::function: return check_global_function_call(node);
        case symbol_kind::schema: return check_global_schema(node);
        case symbol_kind::query:
            err.err(node->get_location(), "\"" + name + "\" is not a function.");
            break;
        case symbol_kind::package: return check_global_package(node);
        default: break;
    }

    return infer::error();
}

infer semantic::check_global_basic(call_head* node) {
    // get type name
    const auto first = node->get_first_expression();
    const auto& name = ((identifier*)first)->get_name();

    if (node->is_initializer()) {
        err.err(node->get_initializer()->get_location(),
            "cannot use initializer to initialize a basic instance."
        );
    }
    if (node->has_func_call()) {
        err.err(node->get_func_call()->get_location(),
            "\"" + name + "\" is not a function."
        );
    }
    const infer infer_result = {true, {
        .type_name = name,
        .type_loc = span::null(),
        .location = span::null(),
        .is_set = false
    }};
    first->set_resolve(infer_result);
    node->set_resolve(infer_result);
    return infer_result;
}

infer semantic::check_global_enum(call_head* node) {
    // get type name
    const auto first = node->get_first_expression();
    const auto& name = ((identifier*)first)->get_name();

    if (node->is_initializer()) {
        err.err(node->get_initializer()->get_location(),
            "cannot use initializer to initialize an enum instance."
        );
    }
    if (node->has_func_call()) {
        err.err(node->get_func_call()->get_location(),
            "\"" + name + "\" is not a function."
        );
    }
    const infer infer_result = {true, {
        .type_name = name,
        .type_loc = ctx.find_global_location(name),
        .location = span::null(),
        .is_set = false
    }};
    first->set_resolve(infer_result);
    node->set_resolve(infer_result);
    return infer_result;
}

infer semantic::check_global_database(call_head* node) {
    // get type name
    const auto first = node->get_first_expression();
    const auto& name = ((identifier*)first)->get_name();

    if (node->is_initializer()) {
        err.err(node->get_initializer()->get_location(),
            "cannot use initializer to initialize a database instance."
        );
    }
    if (node->has_func_call()) {
        err.err(node->get_func_call()->get_location(),
            "\"" + name + "\" is not a function."
        );
    }
    const infer infer_result = {true, {
        .type_name = name,
        .type_loc = ctx.find_global_location(name),
        .location = span::null(),
        .is_set = false
    }};
    first->set_resolve(infer_result);
    node->set_resolve(infer_result);
    return infer_result;
}

infer semantic::check_global_schema(call_head* node) {
    // get type name
    const auto first = node->get_first_expression();
    const auto& name = ((identifier*)first)->get_name();

    // schema {field: expression, ...}
    if (node->is_initializer()) {
        symbol schema_sym = {
            .type_name = name,
            .type_loc = ctx.find_global_location(name)
        };
        const auto infer_result = check_initializer(schema_sym, node->get_initializer());
        node->set_resolve(infer_result);
        first->set_resolve(infer_result);
        return infer_result;
    }

    // schema(db) -> schema::__all__(db)
    if (node->has_func_call()) {
        return check_loader(node);
    }

    const infer infer_result = {true, {
        .type_name = name,
        .type_loc = ctx.find_global_location(name),
        .location = span::null(),
        .is_set = false
    }};
    first->set_resolve(infer_result);
    node->set_resolve(infer_result);
    return infer_result;
}

infer semantic::check_global_function_call(call_head* node) {
    // get type name
    const auto first = node->get_first_expression();
    const auto& name = ((identifier*)first)->get_name();

    // has no function call argument list, error
    if (node->is_initializer()) {
        err.err(node->get_initializer()->get_location(),
            "cannot use initializer to initialize a function symbol."
        );
    }
    if (!node->has_func_call()) {
        err.err(first->get_location(), "function should be called here.");
        return infer::error();
    }

    const auto& func = ctx.global.get_native().count(name)?
        ctx.global.get_native().at(name):
        ctx.global.get_func(ctx.mapper.at(name));
    const auto infer_result = check_global_call(func, node);
    node->set_resolve(infer_result);
    first->set_resolve(infer_result);
    return infer_result;
}

infer semantic::check_global_package(call_head* node) {
    // get type name
    const auto first = node->get_first_expression();
    const auto& name = reinterpret_cast<identifier*>(first)->get_name();

    if (node->is_initializer()) {
        err.err(node->get_initializer()->get_location(),
            "cannot use initializer to initialize a module."
        );
    }
    if (node->has_func_call()) {
        err.err(node->get_func_call()->get_location(),
            "\"" + name + "\" is not a function."
        );
    }
    const infer infer_result = {true, {
        .type_name = name,
        .type_loc = span::null(),
        .location = span::null(),
        .is_set = false
    }};
    first->set_resolve(infer_result);
    node->set_resolve(infer_result);
    return infer_result;
}

infer semantic::check_output_function_call(call_head* node) {
    // output must be called in main function
    if (!in_main_function) {
        err.err(node->get_location(), "output must be called in main function.");
        return infer::error();
    }

    const auto first = node->get_first_expression();
    // output is a native function
    const auto& output_type = ctx.global.get_native().at("output").return_type;
    const infer infer_result = {false, output_type};
    node->set_resolve(infer_result);

    // must be function call
    if (!node->has_func_call()) {
        err.err(first->get_location(), "\"output\" should be called here.");
        return infer_result;
    }

    // must have only 1 argument
    auto output_func_call = node->get_func_call();
    const auto& output_args = output_func_call->get_arguments();
    if (output_args.size()<1) {
        err.err(output_func_call->get_location(), "output needs 1 argument.");
        return infer_result;
    } else if (output_args.size()>1) {
        err.err(output_func_call->get_location(), "output needs only 1 argument.");
        return infer_result;
    }

    // must call this predicate function
    auto predicate_call = output_args[0];
    if (predicate_call->get_ast_class()!=ast_class::ac_call_root) {
        err.err(predicate_call->get_location(), "need a function call.");
        return infer_result;
    }

    // check predicate_call first expression is identifier
    auto prd_call_head = ((call_root*)predicate_call)->get_call_head();
    auto prd_name_node = prd_call_head->get_first_expression();
    if (prd_name_node->get_ast_class()!=ast_class::ac_identifier) {
        err.err(predicate_call->get_location(),
            "only function call is allowed here."
        );
        return infer_result;
    }
    
    // check function/method exists
    const auto& prd_call_chain = ((call_root*)predicate_call)->get_call_chain();
    // generate called function/method name
    auto prd_name = ((identifier*)prd_name_node)->get_name();
    for(auto i : prd_call_chain) {
        prd_name += "::" + i->get_field_name()->get_name();
        // call function at the middle of the call chain is not allowed
        if ((i->has_func_call() || i->is_initializer()) && i!=prd_call_chain.back()) {
            err.err(i->get_location(),
                "invalid output function argument.",
                "change to \"" + prd_name + "\"."
            );
            return infer_result;
        }
    }

    if (!ctx.output_used_functions.count(prd_name)) {
        err.err(predicate_call->get_location(),
            "\"" + prd_name + "\" is undefined or not a outputable function."
        );
        return infer_result;
    }

    if ((prd_call_chain.size() && !prd_call_chain.back()->has_func_call()) ||
        (!prd_call_chain.size() && !prd_call_head->has_func_call())) {
        err.err(predicate_call->get_location(),
            "need \"()\" after this.",
            "change to \"" + prd_name + "()\"."
        );
        return infer_result;
    }
    auto prd_call_arg = prd_call_chain.size()?
        prd_call_chain.back()->get_func_call():
        prd_call_head->get_func_call();
    const auto& args = prd_call_arg->get_arguments();
    if (args.size()) {
        err.warn(prd_call_arg->get_location(),
            "argument(s) are ignored.",
            "change to \"" + prd_name + "()\"."
        );
    }

    // check return type, should be bool
    const auto& return_symbol = ctx.output_used_functions.at(prd_name);
    if (return_symbol.is_null()) {
        err.err(predicate_call->get_location(),
            "output function without return value."
        );
        return infer_result;
    }

    return infer_result;
}

infer semantic::check_field(const infer& prev, call_expr* node) {
    const auto field_node = node->get_field_name();
    const auto& field_name = field_node->get_name();
    const auto& prev_type = prev.type;
    if (prev.is_global) {
        err.err(field_node->get_location(),
            "cannot get field from \"" + prev_type.full_path_name() + "\".",
            "maybe use \"::\"?"
        );
        return infer::error();
    }

    // cannot find a field from a data set
    if (prev_type.is_set && !ctx.global.get_aggregator().count(field_name)) {
        err.err(field_node->get_location(),
            "cannot get field \"" + field_name + "\" from \"" +
            prev_type.full_path_name() + "\".",
            "this is a set type, only aggregator call is allowed here."
        );
        return infer::error();
    }

    // if input type is set and method is aggregator, check aggregator call
    if (prev_type.is_set && ctx.global.get_aggregator().count(field_name)) {
        return check_aggregator(
            prev_type,
            ctx.global.get_aggregator().at(field_name),
            node
        );
    }

    // if file path is null, then get null type directly
    auto prev_type_kind = prev_type.type_loc.file.length()?
        ctx.global.get_domain(prev_type.type_loc.file)
                  .get_kind_by_short_name(prev_type.type_name):
        symbol_kind::null;

    // if not found, check if it is basic type
    if (prev_type_kind==symbol_kind::null &&
        ctx.global.get_basics().count(prev_type.type_name)) {
        prev_type_kind = symbol_kind::basic;
    }

    if (prev_type_kind==symbol_kind::schema) {
        return check_field_in_schema(prev_type, node);
    } else if (prev_type_kind==symbol_kind::database) {
        return check_field_in_database(prev_type, node);
    } else if (prev_type_kind==symbol_kind::basic) {
        return check_field_in_basic(prev_type, node);
    }

    err.err(field_node->get_location(),
        "\"" + prev_type.full_path_name() +
        "\" does not have field or method."
    );
    return infer::error();
}

infer semantic::check_aggregator(const symbol& input_set_type,
                                 const function& method,
                                 call_expr* node) {
    const auto field_node = node->get_field_name();
    // check called
    if (!node->has_func_call()) {
        err.err(field_node->get_location(),
            "aggregator\"" + method.name + "\" should be called here."
        );
        return infer::error();
    }
    node->set_is_aggregator();

    // special aggregator find, in fact this is a syntactic sugar
    if (method.name=="find") {
        return check_aggregator_find(input_set_type, node);
    }

    // check if input set type is accepted by this aggregator
    bool accept_input_type = (method.aggregator_set_type.size() == 0);
    for(const auto& i : method.aggregator_set_type) {
        if (input_set_type==i) {
            accept_input_type = true;
            break;
        }
    }

    if (!accept_input_type) {
        err.err(node->get_location(),
            "\"" + input_set_type.full_path_name() +
            "\" is not accepted by aggregator \"" +
            method.name + "\"."
        );
        return infer::error();
    }

    // check arguments
    check_argument_list(method, node->get_func_call());

    const infer infer_result = {false, method.return_type};
    node->set_resolve(infer_result);
    node->get_func_call()->set_resolve(infer_result);
    field_node->set_resolve(infer_result);
    return infer_result;
}

infer semantic::check_aggregator_find(const symbol& input_set, call_expr* node) {
    // check argument list
    auto arguments_node = node->get_func_call();
    if (arguments_node->get_arguments().size()!=1) {
        err.err(arguments_node->get_location(), "need a schema value as argument.");
        return infer::error();
    }

    // calculate the argument infer
    auto argument = arguments_node->get_arguments()[0];
    auto argument_infer = expression(argument);
    if (argument_infer.is_global) {
        err.err(argument->get_location(),
            "argument must be an instance of \"" +
            argument_infer.type.full_path_name() + "\"."
        );
        return infer::error();
    }

    // check argument type
    const auto& argument_type = argument_infer.type;
    if (argument_type.is_set) {
        err.err(argument->get_location(), "argument should not be a set.");
        return infer::error();
    }

    // check argument type is schema
    const auto argument_full_path_name = argument_type.full_path_name();
    const auto argument_type_index = ctx.global.get_index(argument_full_path_name);
    if (argument_type_index == global_symbol_table::npos) {
        err.err(argument->get_location(),
            "undefined symbol \"" + argument_full_path_name + "\"."
        );
        return infer::error();
    }
    if (ctx.global.get_kind(argument_type_index) != symbol_kind::schema) {
        err.err(argument->get_location(),
            "argument should be a schema but \"" +
            argument_full_path_name + "\" is not a schema."
        );
        return infer::error();
    }
    if (!ctx.global.get_schema(argument_type_index).has_primary_key() ||
        ctx.global.get_schema(argument_type_index).get_primary_key_type()!=symbol::i64()) {
        err.err(argument->get_location(),
            "\"" + argument_full_path_name +
            "\" does not have \"int\" type primary key."
        );
        return infer::error();
    }
    // check input set type has primary key
    const auto input_set_name = input_set.full_path_name_without_set();
    const auto input_set_index = ctx.global.get_index(input_set_name);
    if (input_set_index == global_symbol_table::npos) {
        err.err(node->get_location(),
            "undefined symbol \"" + input_set_name + "\"."
        );
        return infer::error();
    }
    if (ctx.global.get_kind(input_set_index) != symbol_kind::schema) {
        err.err(node->get_location(),
            "\"find\" accept schema type but \"" +
            input_set_name + "\" is not schema type."
        );
        return infer::error();
    }
    if (!ctx.global.get_schema(input_set_index).has_primary_key() ||
        ctx.global.get_schema(input_set_index).get_primary_key_type()!=symbol::i64()) {
        err.err(node->get_location(),
            "\"" + input_set_name + "\" does not have \"int\" type primary key."
        );
        return infer::error();
    }

    // mark node is aggregator find
    node->set_aggregator_find();

    // generate return infer
    auto result = input_set;
    result.is_set = false;
    const infer infer_result = {false, result};
    node->set_resolve(infer_result);
    arguments_node->set_resolve(infer_result);
    return infer_result;
}

infer semantic::check_field_in_schema(const symbol& type, call_expr* node) {
    const auto& schema_domain = ctx.global.get_domain(type.type_loc.file);
    const auto& schema_structure = schema_domain.schemas.at(type.type_name);
    const auto field_node = node->get_field_name();
    const auto& field_name = field_node->get_name();

    // find normal field, return
    if (schema_structure.fields.count(field_name)) {
        if (node->has_func_call()) {
            err.err(node->get_location(),
                "\"" + type.full_path_name() + "::" + field_name + "\"" +
                "is not a function."
            );
        }
        return {false, schema_structure.fields.at(field_name)};
    }

    // cannot find field or method, error
    if (!schema_structure.methods.count(field_name) &&
        !schema_structure.natives.count(field_name)) {
        err.err(field_node->get_location(),
            "cannot find field or method \"" + field_name +
            "\" in schema \"" + type.full_path_name() + "\".",
            "maybe \"" + schema_structure.fuzzy_search(field_name) + "\"?"
        );
        return infer::error();
    }

    // to_set method, convert T to *T
    if (!schema_structure.methods.count(field_name) &&
        schema_structure.natives.count(field_name) &&
        field_name == "to_set") {
        node->set_to_set_method(type.full_path_name());
    }

    // key_eq, key_neq, check primary key is the same
    if (!schema_structure.methods.count(field_name) &&
        schema_structure.natives.count(field_name) &&
        (field_name == "key_eq" || field_name == "key_neq")) {
        return check_key_eq_method_in_schema(
            type, schema_structure.natives.at(field_name), node
        );
    }

    // check function call
    const auto& method = schema_structure.methods.count(field_name)
                            ? schema_structure.methods.at(field_name)
                            : schema_structure.natives.at(field_name);
    const auto infer_result = check_method_call(type, method, node);

    // generic method: fill any type return value with exact type infer
    if (!schema_structure.methods.count(field_name) &&
        schema_structure.natives.count(field_name) &&
        node->is_generic()) {
        const auto generic_infer = check_generic_type(node);
        const auto& generic_type = generic_infer.type;
        if (generic_type.is_err()) {
            return infer::error();
        }
        node->set_generic_input_full_name(type.full_path_name());

        // reinterpret cast method to, is methods
        if (field_name == "to") {
            node->set_generic_to();
        } else if (field_name == "is") {
            node->set_generic_is();
        }

        node->set_generic_output_full_name(generic_type.full_path_name());
        check_duck_type_schema(type, generic_type, node->get_location());
        if (infer_result.type.is_any() && field_name == "to") {
            node->set_resolve(generic_infer);
            return generic_infer;
        }
    }

    node->set_resolve(infer_result);
    return infer_result;
}

infer semantic::check_key_eq_method_in_schema(const symbol& type,
                                              const function& method,
                                              call_expr* node) {
    const auto infer_result = check_method_call(type, method, node);
    if (infer_result.type.is_err()) {
        return infer::error();
    }
    const auto argument_node = node->get_func_call()->get_arguments()[0];
    const auto argument_infer = expression(argument_node);
    const auto& argument_type = argument_infer.type;
    if (argument_type.is_err()) {
        return infer::error();
    }
    if (argument_type.is_set) {
        err.err(argument_node->get_location(),
            "expect single value but get \"" +
            argument_type.full_path_name() + "\"."
        );
        return infer::error();
    }
    const auto index = ctx.global.get_index(argument_type.full_path_name());
    if (index==global_symbol_table::npos) {
        err.err(argument_node->get_location(),
            "undefined argument type \"" + argument_type.full_path_name() + "\"."
        );
        return infer::error();
    }
    if (ctx.global.get_kind(index)!=symbol_kind::schema) {
        err.err(argument_node->get_location(),
            "argument type \"" + argument_type.full_path_name() +
            "\" is not a schema."
        );
        return infer::error();
    }
    const auto& argument_schema = ctx.global.get_schema(index);
    if (!argument_schema.has_primary_key() ||
        argument_schema.get_primary_key_type()!=symbol::i64()) {
        err.err(argument_node->get_location(),
            "\"" + argument_type.full_path_name() +
            "\" does not have a int type primary key."
        );
        return infer::error();
    }

    const auto type_index = ctx.global.get_index(type.full_path_name());
    const auto& type_schema = ctx.global.get_schema(type_index);
    if (!type_schema.has_primary_key() ||
        type_schema.get_primary_key_type()!=symbol::i64()) {
        err.err(node->get_location(),
            "\"" + type.full_path_name() +
            "\" does not have a int type primary key."
        );
        return infer::error();
    }
    if (node->get_field_name()->get_name() == "key_eq") {
        node->set_key_eq_method(
            type_schema.get_primary_key(),
            argument_schema.get_primary_key()
        );
    } else {
        node->set_key_not_eq_method(
            type_schema.get_primary_key(),
            argument_schema.get_primary_key()
        );
    }
    node->set_resolve(infer_result);
    return infer_result;
}

infer semantic::check_generic_type(call_expr* node) {
    const auto type_node = node->get_generic_type();
    const auto field_node = node->get_field_name();
    const auto& short_name = type_node->get_short_name();

    if (type_node->is_set()) {
        err.err(type_node->get_location(),
            "\"" + field_node->get_name() +
            "\" method does not have set generic type.",
            "consider deleting \"*\"."
        );
        return infer::error();
    }
    if (type_node->is_full_path()) {
        const auto full_path_name = type_node->get_full_name();
        const auto index = ctx.global.get_index(full_path_name);
        if (!ctx.check_full_path_type_imported(err, type_node)) {
            return infer::error();
        }
        if (ctx.global.get_kind(index)!=symbol_kind::schema) {
            err.err(type_node->get_location(),
                "\"" + full_path_name + "\" is not a schema."
            );
            return infer::error();
        }
        const symbol generic_type = {
            .type_name = short_name,
            .type_loc = ctx.global.get_location(index),
            .is_set = false
        };
        return {false, generic_type};
    }

    // not full path name
    if (!ctx.find_global(short_name)) {
        err.err(type_node->get_location(),
            "undefined symbol \"" + short_name + "\"."
        );
        return infer::error();
    }
    ctx.report_conflict_symbol(err, type_node->get_location(), short_name);
    const auto index = ctx.mapper.at(short_name);
    const symbol generic_type = {
        .type_name = short_name,
        .type_loc = ctx.global.get_location(index),
        .is_set = false
    };
    if (ctx.global.get_kind(index)!=symbol_kind::schema) {
        err.err(type_node->get_location(),
            "\"" + generic_type.full_path_name() + "\" is not a schema."
        );
        return infer::error();
    }
    return {false, generic_type};
}

bool semantic::check_duck_type_schema(const symbol& left,
                                      const symbol& right,
                                      const span& location) {
    const auto left_index = ctx.global.get_index(left.full_path_name());
    const auto right_index = ctx.global.get_index(right.full_path_name());
    const auto& left_schema = ctx.global.get_schema(left_index);
    const auto& right_schema = ctx.global.get_schema(right_index);
    for(const auto& field : right_schema.fields) {
        if (!left_schema.fields.count(field.first)) {
            err.err(location,
                "\"" + left.full_path_name() +
                "\" does not have field named \"" + field.first + "\".",
                "duck type check failed."
            );
            return false;
        }
        const auto& left_field = left_schema.fields.at(field.first);
        if (field.second.primary!=left_field.primary) {
            err.err(location,
                "field \"" + field.first + "\" in \"" +
                left.full_path_name() + "\" should " +
                (field.second.primary? "be":"not be") + " primary key.",
                "duck type check failed."
            );
            return false;
        }
        if (field.second!=left_field) {
            err.err(location,
                "field \"" + field.first + "\" in \"" + left.full_path_name() +
                "\" has different type, expect \"" + field.second.full_path_name() +
                "\" but get \"" + left_field.full_path_name() + "\".",
                "duck type check failed."
            );
            return false;
        }
    }
    return true;
}

infer semantic::check_field_in_database(const symbol& type, call_expr* node) {
    // database does not need function check
    const auto& database_domain = ctx.global.get_domain(type.type_loc.file);
    const auto& database_structure = database_domain.databases.at(type.type_name);
    if (node->has_func_call()) {
        err.err(node->get_field_name()->get_location(),
            "database has no methods.",
            "maybe use \"::\"?"
        );
        return infer::error();
    }

    // has field
    const auto& field = node->get_field_name()->get_name();
    if (database_structure.tables.count(field)) {
        return {false, database_structure.tables.at(field)};
    }

    // fuzzy search table name
    err.err(node->get_field_name()->get_location(),
        "undefined table \"" + field +
        "\" in \"" + database_structure.name + "\".",
        "maybe \"" + database_structure.fuzzy_search(field) + "\"?"
    );
    return infer::error();
}

infer semantic::check_field_in_basic(const symbol& type, call_expr* node) {
    const auto& basic_structure = ctx.global.get_basics().at(type.type_name);
    const auto field_node = node->get_field_name();
    const auto& field = field_node->get_name();
    if (!basic_structure.natives.count(field)) {
        err.err(field_node->get_location(),
            "cannot find method \"" + field +
            "\" in \"" + type.full_path_name() + "\"."
        );
        return infer::error();
    }
    // record to_set method on the node
    if ((type == symbol::i64() || type == symbol::str()) && field == "to_set") {
        node->set_to_set_method(type.full_path_name());
    }
    return check_method_call(type, basic_structure.natives.at(field), node);
}

infer semantic::check_path(const infer& prev, call_expr* node) {
    auto [is_global, type] = prev;
    const auto path_node = node->get_field_name();

    if (!is_global) {
        err.err(path_node->get_location(),
            "cannot get path from instance.",
            "maybe use \".\"?"
        );
        return infer::error();
    }

    switch(ctx.find_global_kind(type.type_name)) {
        case symbol_kind::enumerate: return check_path_in_enum(type, node);
        case symbol_kind::schema: return check_path_in_schema(type, node);
        case symbol_kind::database: return check_path_in_database(type, node);
        case symbol_kind::basic: return check_path_in_basic(type, node);
        case symbol_kind::package: return check_path_in_package(type, node);
        case symbol_kind::function:
            err.err(path_node->get_location(), "cannot get path from function.");
            return infer::error();
        default: break;
    }

    err.err(path_node->get_location(),
        "cannot get path from unknown type \"" +
        type.full_path_name() + "\"."
    );
    return infer::error();
}

infer semantic::check_path_in_enum(const symbol& type, call_expr* node) {
    const auto path_node = node->get_field_name();
    const auto& path = path_node->get_name();
    if (node->is_initializer()) {
        err.err(node->get_initializer()->get_location(),
            "enum cannot be initialized."
        );
    }
    if (node->has_func_call()) {
        err.err(node->get_location(), "enum has no static method.");
        return infer::error();
    }
    const auto& enum_domain = ctx.global.get_domain(type.type_loc.file);
    const auto& enum_structure = enum_domain.enums.at(type.type_name);
    if (enum_structure.pairs.count(path)) {
        return {false, type};
    }
    // not found
    err.err(path_node->get_location(),
        "\"" + type.full_path_name() +
        "\" does not have \"" + path + "\".",
        "maybe \"" + enum_structure.fuzzy_search(path) + "\"?"
    );
    return infer::error();
}

infer semantic::check_path_in_schema(const symbol& type, call_expr* node) {
    const auto path_node = node->get_field_name();
    const auto& path = path_node->get_name();
    const auto& schema_domain = ctx.global.get_domain(type.type_loc.file);
    const auto& schema_structure = schema_domain.schemas.at(type.type_name);
    if (schema_structure.fields.count(path)) {
        err.err(path_node->get_location(),
            "should get \"" + path + "\" from \"" +
            type.full_path_name() + "\" instance."
        );
        return infer::error();
    }
    if (!schema_structure.methods.count(path)) {
        err.err(path_node->get_location(),
            "no such static method \"" + path + "\" in \"" +
            type.full_path_name() + "\"."
        );
        return infer::error();
    }

    const auto& method = schema_structure.methods.at(path);
    if (method.ordered_parameter_list.size() &&
        method.ordered_parameter_list[0]=="self") {
        err.err(path_node->get_location(),
            "\"" + path + "\" is not static method.",
            "delete parameter \"self\"."
        );
        err.warn(method.parameter_list.at("self").location,
            "delete \"self\" here."
        );
        return infer::error();
    }

    // check called
    if (node->is_initializer()) {
        err.err(node->get_initializer()->get_location(),
            "cannot use initializer on method."
        );
        return infer::error();
    }
    if (!node->has_func_call()) {
        err.err(path_node->get_location(), "function should be called here.");
        return infer::error();
    }

    return check_static_or_full_path_call(
        method, node, type.full_path_name()
    );
}

infer semantic::check_path_in_database(const symbol& type, call_expr* node) {
    const auto path_node = node->get_field_name();
    const auto& path = path_node->get_name();

    if (path!="load") {
        err.err(path_node->get_location(),
            "database only has static method \"load\"."
        );
        return infer::error();
    }
    if (path=="load" && !node->has_func_call()) {
        err.err(path_node->get_location(), "need to be called.");
        return infer::error();
    }

    const auto& database_domain = ctx.global.get_domain(type.type_loc.file);
    const auto& database_structure = database_domain.databases.at(type.type_name);
    const auto infer_result = check_static_or_full_path_call(
        database_structure.load, node, type.full_path_name()
    );

    if (infer_result.type.is_err()) {
        return infer_result;
    }

    auto first_argument = node->get_func_call()->get_arguments()[0];
    if (first_argument->get_ast_class()!=ast_class::ac_call_root) {
        err.err(first_argument->get_location(), "expect string literal.");
        return infer_result;
    }

    if (((call_root*)first_argument)->get_call_chain().size()) {
        err.err(first_argument->get_location(), "expect string literal.");
        return infer_result;
    }

    auto argument_call_head = ((call_root*)first_argument)->get_call_head();
    if (argument_call_head->get_first_expression()->get_ast_class()!=
        ast_class::ac_string_literal) {
        err.err(first_argument->get_location(), "expect string literal.");
        return infer_result;
    }

    // store input database type info on tree node
    reinterpret_cast<string_literal*>(
        argument_call_head->get_first_expression()
    )->set_input_database(type.full_path_name());
    node->set_resolve(infer_result);
    return infer_result;
}

infer semantic::check_path_in_basic(const symbol& type, call_expr* node) {
    const auto path_node = node->get_field_name();
    const auto& path = path_node->get_name();
    const auto& basic_structure = ctx.global.get_basics().at(type.type_name);
    // cannot find path, error
    if (!basic_structure.natives.count(path)) {
        err.err(path_node->get_location(),
            "no such method \"" + path +
            "\" in \"" + type.full_path_name() + "\"."
        );
        return infer::error();
    }

    // check function call
    const auto& method = basic_structure.natives.at(path);
    if (method.ordered_parameter_list.size() &&
        method.ordered_parameter_list[0]=="self") {
        err.err(path_node->get_location(), "this is not a static method.");
        return infer::error();
    }

    // check called
    if (!node->has_func_call()) {
        err.err(path_node->get_location(), "function should be called here.");
        return infer::error();
    }
    return check_static_or_full_path_call(
        method, node, type.full_path_name()
    );
}

infer semantic::check_path_in_package(const symbol& type, call_expr* node) {
    const auto path_node = node->get_field_name();
    const auto& path = path_node->get_name();

    // check if this path is prefix of a module path
    const auto full_path_name = type.type_name + "::" + path;
    if (ctx.global.get_packages().count(full_path_name)) {
        // this is a module, do not call
        if (node->has_func_call() ) {
            err.err(node->get_location(),
                "cannot call module \"" + full_path_name + "\".",
                "\"" + full_path_name + "\" is not a function."
            );
            return infer::error();
        }
        // this is a module, do not use initializer
        if (node->is_initializer()) {
            err.err(node->get_location(),
                "cannot initialize module \"" + full_path_name + "\".",
                "\"" + full_path_name + "\" is not a schema."
            );
            return infer::error();
        }
        // generate new module infer, new type name is the full path name
        // it is a hack way of implementing module, need refactoring later
        const symbol new_module_type = {
            .type_name = full_path_name,
            .type_loc = span::null()
        };
        node->set_resolve({true, new_module_type});
        return {true, new_module_type};
    }

    // check full path symbol
    const auto index = ctx.global.get_index(full_path_name);
    if (index==global_symbol_table::npos) {
        err.err(path_node->get_location(),
            "cannot get path \"" + path + "\" from \"" +
            type.full_path_name() + "\"."
        );
        return infer::error();
    }

    if (!ctx.imported_full_path_symbol_mapper.count(full_path_name)) {
        err.err(path_node->get_location(),
            "\"" + full_path_name + "\" is not imported."
        );
        return infer::error();
    }
    
    symbol full_path_symbol = {
        .type_name = path,
        .type_loc = ctx.global.get_location(index)
    };
    const auto full_path_kind = ctx.global.get_kind(index);

    // check function in another module, full path name
    if (full_path_kind==symbol_kind::function) {
        if (!node->has_func_call()) {
            err.err(node->get_location(), "should call this function.");
            return infer::error();
        }
        return check_static_or_full_path_call(
            ctx.global.get_func(index), node, type.type_name
        );
    }

    // check schema loader or initializer in another module, full path name
    if (full_path_kind==symbol_kind::schema) {
        if (node->has_func_call()) {
            node->set_schema_loader();
            return check_schema_loader(full_path_symbol, node);
        } else if (node->is_initializer()) {
            return check_initializer(full_path_symbol, node->get_initializer());
        }
    }

    // return global symbol
    const infer infer_result = {true, full_path_symbol};
    node->set_resolve(infer_result);
    return infer_result;
}

bool semantic::check_single_argument(expr* argument, const symbol& param) {
    const auto expr_infer = expression(argument);

    // do not check <__all_data__> type, this type accepts all other types
    if (expr_infer.type.is_all_data()) {
        return true;
    }

    // global symbol is not allowed
    if (expr_infer.is_global) {
        err.err(argument->get_location(),
            "argument must be an instance of \"" +
            expr_infer.type.full_path_name() + "\"."
        );
        return false;
    }

    // check type, <any> type parameter can accept all input type
    if (param.is_any() && !expr_infer.type.is_err()) {
        return true;
    }

    // check type set match
    if (param.is_set!=expr_infer.type.is_set) {
        err.err(argument->get_location(),
            "expected \"" + param.full_path_name() +
            "\" but get \"" + expr_infer.type.full_path_name() + "\"."
        );
        return false;
    }

    // allow child schema instance as the argument of parent schema parameter
    const auto pn = param.full_path_name_without_set();
    const auto en = expr_infer.type.full_path_name_without_set();
    const auto pi = ctx.global.get_index(pn);
    const auto ei = ctx.global.get_index(en);
    if (ctx.global.get_kind(pi)==symbol_kind::schema &&
        ctx.global.get_kind(ei)==symbol_kind::schema) {
        // means they are the same schema, return true directly
        if (pi == ei) {
            return true;
        }

        const auto& es = ctx.global.get_schema(ei);

        // should meet these conditions below:
        // 1. argument should be child schema instance
        // 2. argument schema must have primary key
        // 3. argument schema's parent should be the same as parameter
        if (es.has_parent() && es.has_primary_key()) {
            auto parent = es.parent;
            while(parent!=nullptr) {
                if (parent->name == param.type_name &&
                    parent->location == param.type_loc) {
                    return true;
                }
                parent = parent->parent;
            }
        }
    }

    // check type match
    if (param!=expr_infer.type) {
        err.err(argument->get_location(),
            "expected \"" + param.full_path_name() +
            "\" but get \"" + expr_infer.type.full_path_name() + "\"."
        );
        return false;
    }
    return true;
}

std::string semantic::generate_func_param_info(const function& func) const {
    auto result = func.name + "(";
    for(const auto& p : func.ordered_parameter_list) {
        result += p + ": ";
        result += func.parameter_list.at(p).full_path_name();
        if (p!=func.ordered_parameter_list.back()) {
            result += ", ";
        }
    }
    result += ")";
    return result;
}

bool semantic::check_argument_list(const function& func, func_call* node) {
    const auto& argument_list = node->get_arguments();
    const auto& ordered_parameters = func.ordered_parameter_list;
    const auto& parameter_list = func.parameter_list;
    bool flag_is_method = ordered_parameters.size() &&
                          ordered_parameters[0]=="self";

    // check argument size
    if (flag_is_method && argument_list.size()!=ordered_parameters.size()-1) {
        err.err(node->get_location(),
            "expected " + std::to_string(ordered_parameters.size()-1) + " " +
            "arguments but get " + std::to_string(argument_list.size()) + ".",
            generate_func_param_info(func)
        );
        return false;
    }
    if (!flag_is_method && argument_list.size()!=ordered_parameters.size()) {
        err.err(node->get_location(),
            "expected " + std::to_string(ordered_parameters.size()) + " " +
            "arguments but get " + std::to_string(argument_list.size()) + ".",
            generate_func_param_info(func)
        );
        return false;
    }
    // check arguments' types
    for(size_t i = 0; i<argument_list.size(); ++i) {
        const auto argument = argument_list[i];
        // method's first parameter is "self"
        // so method parameter index begins from 1 (do not check "self")
        const auto& param_name = ordered_parameters[i + (flag_is_method? 1:0)];
        const auto& param_type = parameter_list.at(param_name);
        if (!check_single_argument(argument, param_type)) {
            return false;
        }
    }
    return true;
}

infer semantic::check_loader_call(const symbol& type,
                                  const function& method,
                                  func_call* node) {
    if (method.has_generic) {
        err.err(node->get_location(), "\"__all__\" should not be generic method");
        return infer::error();
    }
    // detect __all__ is a static method
    if (method.ordered_parameter_list.size() &&
        method.ordered_parameter_list[0]=="self") {
        err.err(node->get_location(),
            "\"__all__\" is not static method.",
            "delete parameter \"self\"."
        );
        err.warn(method.parameter_list.at("self").location,
            "delete \"self\" here."
        );
        return infer::error();
    }
    // detect __all__ is public method
    if (!method.public_access_authority) {
        report_static_private_access(
            node->get_location(),
            method,
            type.full_path_name()
        );
    }

    // check arguments
    check_argument_list(method, node);

    const infer infer_result = {false, method.return_type};
    node->set_resolve(infer_result);
    return infer_result;
}

infer semantic::check_method_call(const symbol& structure_type,
                                  const function& method,
                                  call_expr* node) {
    const auto field_node = node->get_field_name();
    const auto& field_name = field_node->get_name();
    // check self parameter
    if (!method.ordered_parameter_list.size() ||
        method.ordered_parameter_list[0]!="self") {
        err.err(field_node->get_location(),
            "this is a static function.",
            "use " + structure_type.full_path_name() + "::" + field_name + "."
        );
        return infer::error();
    }
    // check access authority
    if (!method.public_access_authority) {
        report_method_private_access(
            field_node->get_location(),
            field_name,
            structure_type
        );
    }
    // check called
    if (!node->has_func_call()) {
        err.err(node->get_field_name()->get_location(),
            "method should be called here."
        );
        return infer::error();
    }

    // check generic method
    if (method.has_generic!=node->is_generic()) {
        err.err(node->get_location(),
            node->is_generic()
                ? "this is not a generic method."
                : "this is a generic method."
        );
        return infer::error();
    }

    // check arguments
    const infer infer_result = {false, method.return_type};
    node->get_func_call()->set_resolve(infer_result);
    check_argument_list(method, node->get_func_call());

    node->set_resolve(infer_result);
    return infer_result;
}

infer semantic::check_static_or_full_path_call(const function& func,
                                               call_expr* node,
                                               const std::string& type_path_name) {
    if (func.has_generic!=node->is_generic()) {
        err.err(node->get_location(),
            node->is_generic()
                ? "this is not a generic method."
                : "this is a generic method."
        );
        return infer::error();
    }

    // check access authority
    if (!func.public_access_authority) {
        report_static_private_access(
            node->get_field_name()->get_location(),
            func,
            type_path_name
        );
    }

    // check arguments
    check_argument_list(func, node->get_func_call());

    const infer infer_result = {false, func.return_type};
    node->set_resolve(infer_result);
    node->get_func_call()->set_resolve(infer_result);
    return infer_result;
}

infer semantic::check_global_call(const function& global_func, call_head* node) {
    if (global_func.has_generic) {
        err.err(node->get_location(), "this is not a generic method.");
        return infer::error();
    }

    // check access authority
    if (!global_func.public_access_authority &&
        global_func.location.file!=ctx.this_file_name) {
        const auto& module_name = godel_module::instance()->find_module_by_file(
            global_func.location.file
        );
        report_static_private_access(
            node->get_location(),
            global_func,
            module_name
        );
    }

    // check arguments
    check_argument_list(global_func, node->get_func_call());

    const infer infer_result = {false, global_func.return_type};
    node->set_resolve(infer_result);
    node->get_func_call()->set_resolve(infer_result);
    return infer_result;
}

infer semantic::check_initializer(const symbol& type, initializer* node) {
    const auto& schema_domain = ctx.global.get_domain(type.type_loc.file);
    const auto& schema_structure = schema_domain.schemas.at(type.type_name);

    // construct field set
    std::unordered_map<std::string, bool> check_set;
    for(auto& field : schema_structure.fields) {
        check_set.insert({field.first, false});
    }

    // check initialized pair
    for(auto child : node->get_field_pairs()) {
        check_initializer_pair(type, child, schema_structure, check_set);
    }

    // check spread expr
    for(auto child : node->get_spread_exprs()) {
        check_spread_expr(type, child, schema_structure, check_set);
    }

    // check uninitialized fields
    std::string uninit = "";
    for (const auto& field : check_set) {
        if (!field.second) {
            uninit += field.first + ", ";
        }
    }
    if (uninit.length()) {
        uninit = uninit.substr(0, uninit.length()-2);
        err.err(node->get_location(), "field \"" + uninit + "\" not initialized.");
    }

    // initializer must return an object, not global symbol
    const infer infer_result = {false, {
        .type_name = schema_structure.name,
        .type_loc = schema_structure.location,
        .location = span::null(),
        .is_set = false
    }};
    node->set_resolve(infer_result);
    return infer_result;
}

void semantic::check_initializer_pair(const symbol& type,
                                      initializer_pair* node,
                                      const schema& schema_structure,
                                      std::unordered_map<std::string, bool>& check_set) {
    const auto field_node = node->get_field_name();
    const auto& field = field_node->get_name();

    // check field existence
    if (!schema_structure.fields.count(field)) {
        err.err(field_node->get_location(),
            "\"" + type.full_path_name() +
            "\" does not have field \"" + field + "\".",
            "maybe you mean \"" + schema_structure.fuzzy_search(field) +
            "\"?"
        );
        return;
    }

    // mark as initialized
    if (check_set.at(field)) {
        err.err(field_node->get_location(),
            "field \"" + field + "\" already initialized."
        );
        return;
    }
    check_set.at(field) = true;

    // type check
    const auto value_node = node->get_field_value();
    const auto infer_result = expression(value_node);
    const auto& infer_type = infer_result.type;
    const auto& field_type = schema_structure.fields.at(field);
    node->set_resolve(infer_result);
    node->get_field_name()->set_resolve(infer_result);

    if (infer_result.is_global) {
        err.err(value_node->get_location(),
            "must use an instance of \"" +
            infer_result.type.full_path_name() + "\"."
        );
        return;
    }
    if (infer_type.is_set) {
        err.err(value_node->get_location(),
            "data set cannot be used to initialize field."
        );
        return;
    }
    if (infer_type!=field_type) {
        err.err(value_node->get_location(),
            "get \"" + infer_type.full_path_name() +
            "\" but need \"" + field_type.full_path_name() + "\"."
        );
        return;
    }
}

void semantic::check_spread_expr(const symbol& type,
                                 spread_expr* node,
                                 const schema& schema_structure,
                                 std::unordered_map<std::string, bool>& check_set) {
    const auto infer_result = expression(node->get_child());
    node->set_resolve(infer_result);
    if (infer_result.type.is_err()) {
        return;
    }
    if (infer_result.type.is_all_data()) {
        err.err(node->get_child()->get_location(),
            "cannot use all data to initialize schema."
        );
        return;
    }

    const auto infer_full_name = infer_result.type.full_path_name_without_set();
    const auto index = ctx.global.get_index(infer_full_name);
    if (index==global_symbol_table::npos ||
        ctx.global.get_kind(index)!=symbol_kind::schema) {
        err.err(node->get_child()->get_location(),
            "\"" + infer_full_name + "\" is not a schema."
        );
        return;
    }

    if (infer_result.type.is_set) {
        err.err(node->get_child()->get_location(),
            "cannot use set to spread-initialize schema field."
        );
        return;
    }

    const auto& infer_schema = ctx.global.get_schema(index);
    for(const auto& isc_field : infer_schema.ordered_fields) {
        if (!schema_structure.fields.count(isc_field)) {
            err.err(node->get_child()->get_location(),
                "field \"" + isc_field + "\" not found in schema \"" +
                type.full_path_name() + "\"."
            );
            break;
        }
        if (schema_structure.fields.at(isc_field)!=infer_schema.fields.at(isc_field)) {
            err.err(node->get_child()->get_location(),
                "field \"" + isc_field + "\" has different type in schema \"" +
                type.full_path_name() + "\" and \"" + infer_full_name + "\"."
            );
            break;
        }

        if (!check_set.count(isc_field)) {
            continue;
        }
        if (check_set.at(isc_field)) {
            err.err(node->get_child()->get_location(),
                "field \"" + isc_field + "\" already initialized."
            );
            break;
        }
        check_set.at(isc_field) = true;
    }
}

infer semantic::check_loader(call_head* node) {
    // set this node is schema loader
    // then we do Schema(database) -> Schema::__all__(database) ast lowering
    node->set_is_schema_loader();

    // if is "Self", check if is in impl schema
    // if not, just check the name
    const auto name_node = ((identifier*)node->get_first_expression());
    const auto& name = name_node->get_name()=="Self" && impl_schema_name.length()?
        impl_schema_name : name_node->get_name();

    if (!ctx.this_name_space.count(name)) {
        err.err(name_node->get_location(), "undefined symbol \"" + name + "\".");
        return infer::error();
    }

    if (ctx.this_name_space.at(name)!=symbol_kind::schema) {
        err.err(name_node->get_location(), "\"" + name + "\" is not a schema.");
        return infer::error();
    }

    const auto& schema_structure = ctx.global.get_schema(ctx.mapper.at(name));
    if (!schema_structure.methods.count("__all__")) {
        err.err(node->get_location(),
            "schema \"" + name + "\" doesn't have static method \"__all__\"."
        );
        return infer::error();
    }

    const auto& method = schema_structure.methods.at("__all__");
    const symbol schema_type = {
        .type_name = schema_structure.name,
        .type_loc = schema_structure.location,
        .is_set = false
    };

    auto infer_result = check_loader_call(schema_type, method, node->get_func_call());
    name_node->set_resolve(infer_result);
    node->set_resolve(infer_result);
    return infer_result;
}

infer semantic::check_schema_loader(const symbol& type, call_expr* node) {
    const auto& schema_domain = ctx.global.get_domain(type.type_loc.file);
    const auto& schema_structure = schema_domain.schemas.at(type.type_name);

    if (!schema_structure.methods.count("__all__")) {
        err.err(node->get_location(),
            "schema \"" + type.full_path_name() +
            "\" doesn't have static method \"__all__\"."
        );
        return infer::error();
    }

    // check __all__ is a static method
    const auto& method = schema_structure.methods.at("__all__");
    auto infer_result = check_loader_call(type, method, node->get_func_call());
    node->set_resolve(infer_result);
    return infer_result;
}

void semantic::code_block_check(function& func, block_stmt* code_block) {
    if (!code_block->get_statement().size()) {
        return;
    }

    fact_statement_checker(&err).check(func, code_block);

    for(auto child : code_block->get_statement()) {
        // get a copy of local scope
        local_scope = func.parameter_list;
        statement_check(child, func);
    }
}

void semantic::global_function_check(function_decl* node) {
    const auto& name = node->get_name()->get_name();
    if (ctx.find_global(name) && ctx.find_global_kind(name)!=symbol_kind::function) {
        return;
    }

    auto& func = ctx.global.get_func(ctx.mapper.at(name));
    in_main_function = (func.name == "main");
    code_block_check(func, node->get_code_block());
    in_main_function = false;
    ungrounded_parameter_checker(&err, &ctx).check(node, &func);
}

void semantic::impl_block_check(impl_block* node) {
    impl_schema_name = node->get_impl_schema_name()->get_name();

    // check implemented methods
    auto& sc = ctx.global.get_schema(ctx.mapper.at(impl_schema_name));
    auto& funcs = node->get_functions();
    for(auto child: funcs) {
        const auto& func_name = child->get_name()->get_name();
        auto& func = sc.methods.at(func_name);
        code_block_check(func, child->get_code_block());
        ungrounded_parameter_checker(&err, &ctx).check(child, &func);
    }

    // clear schema name
    impl_schema_name = "";
}

void semantic::query_check(query_decl* node) {
    const auto& query_name = node->get_name()->get_name();
    auto& query = ctx.global.get_query(ctx.mapper.at(query_name));

    local_scope = {};
    for(auto i : node->get_from_list()) {
        const auto name_node = i->get_var_name();
        if (!i->has_init_value()) {
            err.err(i->get_location(), "should have initial value.");
            continue;
        }

        const auto initial_infer = expression(i->get_init_value());
        if (initial_infer.is_global) {
            err.err(i->get_init_value()->get_location(),
                "global symbol is not initial value."
            );
            continue;
        }
        if (initial_infer.type==symbol::boolean()) {
            err.err(i->get_location(),
                "variable should not be initialized with type \"bool\"."
            );
            continue;
        }

        symbol from_variable_type = {
            .type_name = initial_infer.type.type_name,
            .type_loc = initial_infer.type.type_loc,
            .location = name_node->get_location(),
            .is_set = false
        };

        if (initial_infer.type!=from_variable_type) {
            err.err(i->get_init_value()->get_location(),
                "expected \"" + from_variable_type.full_path_name() +
                "\" but get \"" + initial_infer.type.full_path_name() +
                "\"."
            );
            continue;
        }

        // avoid redefinition
        const auto& name = name_node->get_name();
        if (local_scope.count(name) || ctx.find_global(name)) {
            err.err(name_node->get_location(), "symbol already exists.");
            continue;
        }

        if (ctx.invalid_variable_name.count(name)) {
            err.err(name_node->get_location(),
                "variables cannot use this name.",
                "this name is reserved to avoid confliction in generated codes."
            );
            continue;
        }

        local_scope.insert({name, from_variable_type});
        ctx.global.add_local_variable(name, name_node->get_location(), initial_infer.type);
        query.input_list.insert({name, from_variable_type});
        query.ordered_input_list.push_back(name);
        query.ordered_input_init_is_set.push_back(initial_infer.type.is_set);
    }
    if (err.get_error()) {
        return;
    }

    if (node->has_condition()) {
        const auto condition_infer = expression(node->get_where_condition());
        const auto& condition_type = condition_infer.type;
        if (condition_infer.is_global ||
            condition_type.is_set ||
            condition_type!=symbol::boolean()) {
            err.err(node->get_where_condition()->get_location(),
                "should get \"bool\" but get \"" +
                condition_infer.type.full_path_name() + "\"."
            );
        }
    }

    query.output_list = {};
    query.ordered_output_list = {};
    for(auto i : node->get_select_list()) {
        const auto output_infer = expression(i->get_column_value());
        if (output_infer.type.is_set) {
            err.err(i->get_column_value()->get_location(),
                "cannot output set in one line/column."
            );
        }
        if (!ctx.find_global(output_infer.type.type_name)) {
            err.err(i->get_column_value()->get_location(),
                "value type \"" + output_infer.type.full_path_name() +
                "\" is not imported."
            );
        }
        std::string column_name = "column_" + std::to_string((uint64_t)i);
        while(ctx.find_global(column_name) ||
            local_scope.count(column_name) ||
            query.output_list.count(column_name)) {
            column_name += "a";
        }
        if (i->has_column_name()) {
            column_name = i->get_column_name()->get_name();
        }
        if (ctx.find_global(column_name) ||
            local_scope.count(column_name) ||
            query.output_list.count(column_name)) {
            err.err(i->get_column_name()->get_location(),
                "column name \"" + column_name + "\" exists."
            );
        }
        if (ctx.invalid_variable_name.count(column_name)) {
            err.err(i->get_column_name()->get_location(),
                "variables cannot use this name.",
                "this name is reserved to avoid confliction in generated codes."
            );
        }
        query.output_list.insert({column_name, output_infer.type});
        query.ordered_output_list.push_back(column_name);
    }
    local_scope = {};
}

void semantic::all_function_block_check(ast_root* root) {
    // generate all the full path functions and methods for check of output
    generate_output_used_function_name();

    // check function implemention
    for(auto child: root->get_declarations()) {
        switch (child->get_ast_class()) {
            case ast_class::ac_function_decl: global_function_check((function_decl*)child); break;
            case ast_class::ac_impl_block: impl_block_check((impl_block*)child); break;
            case ast_class::ac_query_decl: query_check((query_decl*)child); break;
            default: break;
        }
    }
}

void semantic::dump_detail_semantic_info() const {
    for(const auto& i : ctx.global.get_packages()) {
        std::cout << "use " << i.first << std::endl;
    }
    for(const auto& i : ctx.global.get_basics()) {
        std::cout << i.second << std::endl;
    }
    const auto& godel_domain = ctx.global.get_domain(ctx.this_file_name);
    for(const auto& i : godel_domain.enums) {
        std::cout << i.second << std::endl;
    }
    for(const auto& i : godel_domain.schemas) {
        std::cout << i.second << std::endl;
    }
    for(const auto& i : godel_domain.databases) {
        std::cout << i.second << std::endl;
    }
    for(const auto& i : godel_domain.queries) {
        std::cout << i.second << std::endl;
    }
    for(const auto& i : ctx.global.get_native()) {
        std::cout << i.second << std::endl;
    }
    for(const auto& i : godel_domain.functions) {
        std::cout << i.second << std::endl;
    }
}

void semantic::dump_local_variables() const {
    auto file = std::string("");
    for(const auto& record : ctx.global.get_locals()) {
        const auto& name = record.name;
        const auto& location = record.location;
        const auto& type = record.type;
        if (file!=location.file) {
            file = location.file;
            std::cout << "\n" << file << ":\n";
        }
        std::cout << "    " << name << ": ";
        std::cout << type.full_path_name() << "  ";
        std::cout << location.file << ":" << location.start_line << ":";
        std::cout << location.start_column+1 << "\n";
    }
}

[[nodiscard]]
const error& semantic::analyse(const configure& config, ast_root* root) {

    // stage 1: initialize
    impl_schema_name = "";
    flag_check_access_authority = config.count(option::cli_semantic_pub_check);
    ctx.this_file_name = root->get_file();

    // stage 2:
    // 1. and check import lib and import symbols
    // 2. load global enum, schema, database, query, function symbol
    symbol_import(&err, &ctx).scan(&config, root);
    if (err.get_error()) {
        return err;
    }
    global_symbol_loader(&err, &ctx).scan(root);
    if (err.get_error()) {
        return err;
    }

    // stage 3: generate structures of enum, schema, database
    data_structure_construct(&err, &ctx).check(root);
    if (err.get_error()) {
        return err;
    }

    // stage 4:
    // 1. self extend check
    // 2. inherit field in schema and check if schema has multiple primary keys
    // 3. check self reference, called behind schema and database check
    self_extend_checker(&err, &ctx).check();
    if (err.get_error()) {
        return err;
    }
    schema_field_inherit_worker(&err, &ctx).inherit_field();
    if (err.get_error()) {
        return err;
    }
    self_reference_checker(&err, &ctx).check();
    if (err.get_error()) {
        return err;
    }

    // stage 5:
    // 1. check funcdecl and function parameter format
    // 2. check impl and add functions to schema
    // do not check function block at this stage
    function_declaration(&err, &ctx).check(root);
    if (err.get_error()) {
        return err;
    }
    impl_function_declaration(&err, &ctx).check(root);
    if (err.get_error()) {
        return err;
    }

    // stage 6: inherit methods in schema
    schema_method_inherit_worker(&err, &ctx).inherit_method();
    generate_constructor_for_DO_schema();

    // stage 7: all function implemention block check
    all_function_block_check(root);
    return_ungrounded_checker(&err).check(root);
    undetermined_checker(&err).check(root);
    neg_expr_ungrounded_checker(&err).check(root);
    if (err.get_error()) {
        return err;
    }

    // IR codegen starts here
    if (config.count(option::cli_dump_souffle_file) ||
        config.count(option::cli_souffle_debug_dump) ||
        config.count(option::cli_run_souffle)) {
        ir_gen(&ctx, err).generate(config, root);
    }
    return err;
}

}