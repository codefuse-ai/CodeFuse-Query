#include "godel-frontend/src/sema/ungrounded_checker.h"

namespace godel {

bool return_ungrounded_checker::visit_in_block_expr(in_block_expr* node) {
    err->err(node->get_location(),
        "require return statement, but get expression.",
        "return value is ungrounded."
    );
    return true;
}

bool return_ungrounded_checker::visit_let_stmt(let_stmt* node) {
    if (node->has_statement()) {
        node->get_code_block()->accept(this);
    } else {
        err->err(node->get_location(),
            "require return statement in this statement.",
            "return value is ungrounded."
        );
    }
    return true;
}

bool return_ungrounded_checker::visit_if_stmt(if_stmt* node) {
    if (node->has_statement()) {
        node->get_code_block()->accept(this);
    } else {
        err->err(node->get_location(),
            "require return statement in this statement.",
            "return value is ungrounded."
        );
    }
    return true;
}

bool return_ungrounded_checker::visit_for_stmt(for_stmt* node) {
    if (node->has_statement()) {
        node->get_code_block()->accept(this);
    } else {
        err->err(node->get_location(),
            "require return statement in this statement.",
            "return value is ungrounded."
        );
    }
    return true;
}

bool return_ungrounded_checker::visit_match_stmt(match_stmt* node) {
    if (node->get_match_pair_list().empty()) {
        err->err(node->get_location(),
            "require at least one match pair in this statement.",
            "return value is ungrounded."
        );
    }
    for(auto i : node->get_match_pair_list()) {
        i->accept(this);
    }
    return true;
}

bool return_ungrounded_checker::visit_block_stmt(block_stmt* node) {
    if (node->get_statement().empty()) {
        err->err(node->get_location(),
            "require return statement in this block.",
            "return value is ungrounded."
        );
    }
    for(auto i : node->get_statement()) {
        switch(i->get_ast_class()) {
            case ast_class::ac_ret_stmt:
            case ast_class::ac_fact_stmt: break;
            case ast_class::ac_let_stmt:
            case ast_class::ac_for_stmt:
            case ast_class::ac_cond_stmt:
            case ast_class::ac_match_stmt:
            case ast_class::ac_in_block_expr: i->accept(this); break;
            default:
                err->err(i->get_location(),
                    "require return statement in this statement.",
                    "return value is ungrounded."
                );
        }
    }
    return true;
}

bool return_ungrounded_checker::visit_function_decl(function_decl* func) {
    // do not check function without return value or not implemented
    if (!func->has_return_value() || !func->implemented()) {
        return true;
    }

    // do not check predicate
    if (func->get_return_type()->get_resolve().type==symbol::boolean()) {
        return true;
    }

    // do return statement counting
    func->get_code_block()->accept(this);
    return true;
}

bool undetermined_checker::match_undetermined_call(call_root* node) {
    // undetermined call in souffle is in fact an ungrounded error
    // if variables assigned by undetermined call is not bound,
    // it will cause ungrounded error.
    // undetermined call in godel script is like:
    //
    // int::__undetermined_all__()
    // string::__undetermined_all__()
    //

    // call head should be identifier `int` or `string`, without function call.
    auto head = node->get_call_head();
    if (head->has_func_call() || head->is_initializer()) {
        return false;
    }
    auto first = head->get_first_expression();
    // check call head is in fact an identifier
    if (first->get_ast_class()!=ast_class::ac_identifier) {
        return false;
    }
    // identifier must be `int` or `string`
    const auto& name = reinterpret_cast<identifier*>(first)->get_name();
    if (name!="int" && name!="string") {
        return false;
    }

    if (node->get_call_chain().empty()) {
        return false;
    }

    // first call expression should be get path
    auto first_call = node->get_call_chain()[0];
    if (first_call->get_call_type()!=call_expr::type::get_path) {
        return false;
    }
    auto field = first_call->get_field_name();
    // `__undetermined_all__` is a special function.
    if (field->get_name()!="__undetermined_all__") {
        return false;
    }
    if (!first_call->has_func_call()) {
        return false;
    }

    return true;
}

bool undetermined_checker::visit_call_root(call_root* node) {
    if (match_undetermined_call(node)) {
        if (node->get_call_chain().size()>1) {
            err->err(node->get_location(),
                "ungrounded value cannot be used in call chain."
            );
        } else if (!in_for_initialization_level) {
            err->warn(node->get_location(),
                "undetermined value used outside for-initialization.",
                "will cause ungrounded error."
            );
        }
    }

    node->get_call_head()->accept(this);
    for(auto i : node->get_call_chain()) {
        i->accept(this);
    }
    return true;
}

bool undetermined_checker::visit_for_stmt(for_stmt* node) {
    ++in_for_initialization_level;
    for(auto i : node->get_symbols()) {
        i->accept(this);
    }
    --in_for_initialization_level;

    if (node->has_statement()) {
        node->get_code_block()->accept(this);
    }
    return true;
}

bool neg_expr_ungrounded_checker::visit_call_expr(call_expr* node) {
    if (in_logical_negative_expression_level) {
        if (node->is_aggregator_find()) {
            err->err(node->get_field_name()->get_location(),
                "T0*.find(T1) is not allowed in logical negative expression.",
                "inline function will cause ungrounded error."
            );
        }
        if (node->is_generic_to()) {
            err->err(node->get_field_name()->get_location(),
                "T0.to<T1>() is not allowed in logical negative expression.",
                "inline function will cause ungrounded error."
            );
        }
        if (node->is_key_eq_method()) {
            err->err(node->get_location(),
                "key_eq is not allowed in logical negative expression.",
                "will cause ungrounded error. consider \"key_neq\""
            );
        }
        if (node->is_key_not_eq_method()) {
            err->err(node->get_location(),
                "key_neq is not allowed in logical negative expression.",
                "will cause ungrounded error. consider \"key_eq\""
            );
        }
        if (node->is_initializer()) {
            err->err(node->get_location(),
                "object construction is not allowed in logical negative expression.",
                "will cause ungrounded error."
            );
        }
        if (node->has_func_call() &&
            node->get_func_call()->get_resolve().type!=symbol::boolean()) {
            err->warn(node->get_location(),
                "non-boolean return value in logical negative expression.",
                "will produce temporary variables, causing ungrounded error."
            );
        }
    }
    node->get_field_name()->accept(this);
    if (node->is_generic()) {
        node->get_generic_type()->accept(this);
    }
    if (node->has_func_call()) {
        node->get_func_call()->accept(this);
    }
    if (node->is_initializer()) {
        node->get_initializer()->accept(this);
    }
    return true;
}

bool neg_expr_ungrounded_checker::visit_initializer(initializer* node) {
    if (in_logical_negative_expression_level) {
        err->err(node->get_location(),
            "object construction is not allowed in logical negative expression.",
            "will cause ungrounded error."
        );
    }
    for(auto i : node->get_field_pairs()) {
        i->accept(this);
    }
    return true;
}

bool neg_expr_ungrounded_checker::visit_unary_operator(unary_operator* node) {
    if (node->get_operator_type()==unary_operator::type::logical_negation) {
        in_logical_negative_expression_level++;
    }
    node->get_child()->accept(this);
    if (node->get_operator_type()==unary_operator::type::logical_negation) {
        in_logical_negative_expression_level--;
    }
    return true;
}

bool neg_expr_ungrounded_checker::visit_binary_operator(binary_operator* node) {
    if (in_logical_negative_expression_level && !in_binary_operator_level) {
        err->warn(node->get_location(),
            "binary expression used in logical negative expression.",
            "will produce temporary variables, causing ungrounded error."
        );
    }
    ++in_binary_operator_level;
    node->get_left()->accept(this);
    node->get_right()->accept(this);
    --in_binary_operator_level;
    return true;
}

void ungrounded_parameter_checker::report_unused_parameter(const report::span& stmt_loc) {
    // do not check inline function & check if need to check constraint for self
    bool flag_is_self_typecheck_free = false;
    for(auto i : func_node->get_annotations()) {
        if (i->get_annotation()=="@inline") {
            return;
        }
        if (i->get_annotation()=="@self_typecheck_free") {
            flag_is_self_typecheck_free = true;
        }
    }

    // unused schema/database parameter will be marked as unused, warning
    std::string unused_params = "";
    // unused basic type parameter will be marked as ungrounded, error
    std::string ungrounded_params = "";
    // flag mark self parameter is ungrounded
    bool flag_self_ungrounded = false;

    // start checking
    for(const auto& i : func->ordered_parameter_list) {
        // if variable is not a parameter or already used, do not report
        if (!record.count(i) || record.at(i)) {
            continue;
        }

        const auto& type = func->parameter_list.at(i);
        const auto index = ctx->global.get_index(type.full_path_name_without_set());

        // unused database parameter is marked as ungrounded
        if (index != global_symbol_table::npos &&
            ctx->global.get_kind(index)==symbol_kind::database) {
            ungrounded_params += ungrounded_params.length()? ", ":"";
            ungrounded_params += i;
            continue;
        }

        // unused int/float/string and "self" parameter is marked as ungrounded
        // set of int/float/string are not considered as ungrounded
        if (is_native_type(type) && !record_is_set_flag.at(i)) {
            ungrounded_params += ungrounded_params.length()? ", ":"";
            ungrounded_params += i;
        } else if (i!="self") {
            unused_params += unused_params.length()? ", ":"";
            unused_params += i;
        } else {
            flag_self_ungrounded = true;
        }
    }

    // unused warning report
    if (unused_params.length()) {
        err->warn(stmt_loc,
            "unused parameter \"" + unused_params + "\" in this branch."
        );
    }

    // ungrounded error report
    if (ungrounded_params.length()) {
        err->err(stmt_loc,
            "ungrounded parameter \"" + ungrounded_params + "\" in this branch."
        );
    }

    // in typecheck free mode, we need to check self parameter is grounded
    if (flag_self_ungrounded) {
        self_is_grounded = false;
    }
    if (flag_self_ungrounded && flag_is_self_typecheck_free) {
        err->err(stmt_loc,
            "ungrounded \"self\" in this branch.",
            "constraint \"self\" to avoid ungrounded error."
        );
    }
}

bool ungrounded_parameter_checker::visit_identifier(identifier* node) {
    if (in_logical_negative_expression_level!=0) {
        return true;
    }
    const auto& name = node->get_name();
    if (record.count(name) && !used_variable.back().count(name)) {
        // if this table's size is not zero
        // this means in progress of analysing logical `or` expression
        if (logical_or_variable_used.size()) {
            logical_or_variable_used.back().insert(name);
            return true;
        }
        record.at(name)++;
        used_variable.back().insert(name);
    }
    return true;
}

bool ungrounded_parameter_checker::check_directly_call_identifier(expr* node) {
    if (node->get_ast_class() != ast_class::ac_call_root) {
        return false;
    }

    auto real = static_cast<call_root*>(node);
    if (real->get_call_head()->has_func_call() ||
        real->get_call_head()->is_initializer()) {
        return false;
    }
    if (real->get_call_head()->get_first_expression()->get_ast_class()
            != ast_class::ac_identifier) {
        return false;
    }
    if (!real->get_call_chain().empty()) {
        return false;
    }

    return true;
}

bool ungrounded_parameter_checker::check_non_binding_binary_operator(binary_operator* node) {
    // binary expressions like:
    //   a - 1, a + 1, a * 1, a / 1
    // are used as condition,
    // variables directly called in the expression will not be marked as grounded

    // both lhs and rhs are not directly called identifier,
    // this is definitely not a binding binary operator,
    // and we do not need to ignore checkings on both sides
    if (!check_directly_call_identifier(node->get_left()) &&
        !check_directly_call_identifier(node->get_right())) {
        return false;
    }

    return node->get_operator_type() == binary_operator::type::add ||
           node->get_operator_type() == binary_operator::type::sub ||
           node->get_operator_type() == binary_operator::type::mult ||
           node->get_operator_type() == binary_operator::type::div;
}

bool ungrounded_parameter_checker::visit_call_expr(call_expr* node) {
    // do not visit field name and generic type here
    // because they include identifier nodes, which may
    // be incorrectly marked as grounded if the identifier name
    // conflicts with parameter name
    if (node->has_func_call()) {
        node->get_func_call()->accept(this);
    }
    if (node->is_initializer()) {
        node->get_initializer()->accept(this);
    }
    return true;
}

bool ungrounded_parameter_checker::visit_unary_operator(unary_operator* node) {
    bool is_logical_negative = (
        node->get_operator_type()==unary_operator::type::logical_negation
    );
    if (is_logical_negative) {
        in_logical_negative_expression_level++;
    }
    node->get_child()->accept(this);
    if (is_logical_negative) {
        in_logical_negative_expression_level--;
    }
    return true;
}

bool ungrounded_parameter_checker::visit_binary_operator(binary_operator* node) {
    // not in logical or expression, just visit and exit
    if (!logical_or_variable_used.size()) {
        // e.g. `a + 1`, we do not check `a`
        // e.g. `a + f(a)`, we do not check `a` but we check `f(a)`
        if (check_non_binding_binary_operator(node)) {
            if (!check_directly_call_identifier(node->get_left())) {
                node->get_left()->accept(this);
            }
            if (!check_directly_call_identifier(node->get_right())) {
                node->get_right()->accept(this);
            }
            return true;
        }
        node->get_left()->accept(this);
        node->get_right()->accept(this);
        return true;
    }

    if (node->get_operator_type() != binary_operator::type::logical_or) {
        // e.g. `a + 1`, we do not check `a`
        // e.g. `a + f(a)`, we do not check `a` but we check `f(a)`
        if (check_non_binding_binary_operator(node)) {
            if (!check_directly_call_identifier(node->get_left())) {
                node->get_left()->accept(this);
            }
            if (!check_directly_call_identifier(node->get_right())) {
                node->get_right()->accept(this);
            }
            return true;
        }
        node->get_left()->accept(this);
        node->get_right()->accept(this);
        return true;
    }

    // create table to store used variables' name
    logical_or_variable_used.push_back({});
    node->get_left()->accept(this);
    logical_or_variable_used.push_back({});
    node->get_right()->accept(this);

    // merge two tables, then we return to do the recursive merge
    auto& mid = logical_or_variable_used[logical_or_variable_used.size()-3];
    const auto& left = logical_or_variable_used[logical_or_variable_used.size()-2];
    const auto& right = logical_or_variable_used[logical_or_variable_used.size()-1];

    // do merge
    for(const auto& i : left) {
        if (right.count(i)) {
            mid.insert(i);
        }
    }

    // pop left and right table
    logical_or_variable_used.pop_back();
    logical_or_variable_used.pop_back();
    return true;
}

bool ungrounded_parameter_checker::visit_for_stmt(for_stmt* node) {
    new_used_variable_mark_scope();
    for(auto i : node->get_symbols()) {
        i->accept(this);
    }
    if (node->has_statement()) {
        node->get_code_block()->accept(this);
    } else {
        report_unused_parameter(node->get_location());
    }
    pop_used_variable_mark_scope();
    return true;
}

bool ungrounded_parameter_checker::visit_let_stmt(let_stmt* node) {
    new_used_variable_mark_scope();
    for(auto i : node->get_symbols()) {
        i->accept(this);
    }
    if (node->has_statement()) {
        node->get_code_block()->accept(this);
    } else {
        report_unused_parameter(node->get_location());
    }
    pop_used_variable_mark_scope();
    return true;
}

bool ungrounded_parameter_checker::visit_if_stmt(if_stmt* node) {
    new_used_variable_mark_scope();
    if (node->has_condition()) {
        // store used variable in table, then update record after visiting node
        logical_or_variable_used.push_back({});

        // visit node
        node->get_condition()->accept(this);

        // update record and use mark
        for(const auto& i : logical_or_variable_used.back()) {
            if (record.count(i) && !used_variable.back().count(i)) {
                record.at(i)++;
                used_variable.back().insert(i);
            }
        }

        // pop table
        logical_or_variable_used.pop_back();
    }
    if (node->has_statement()) {
        node->get_code_block()->accept(this);
    } else {
        report_unused_parameter(node->get_location());
    }
    pop_used_variable_mark_scope();
    return true;
}

bool ungrounded_parameter_checker::visit_match_stmt(match_stmt* node) {
    new_used_variable_mark_scope();
    node->get_match_condition()->accept(this);
    for(auto i : node->get_match_pair_list()) {
        i->accept(this);
    }
    pop_used_variable_mark_scope();
    return true;
}

bool ungrounded_parameter_checker::check_directly_return_self(ret_stmt* node) {
    const auto value = node->get_return_value();
    if (value->get_ast_class()!=ast_class::ac_call_root) {
        return false;
    }
    // just call `self`
    const auto call = reinterpret_cast<call_root*>(value);
    const auto head = call->get_call_head();
    if (head->get_first_expression()->get_ast_class()!=ast_class::ac_identifier) {
        return false;
    }
    const auto first = head->get_first_expression();
    if (reinterpret_cast<identifier*>(first)->get_name()!="self") {
        return false;
    }
    if (call->get_call_chain().size()) {
        return false;
    }
    return true;
}

bool ungrounded_parameter_checker::visit_ret_stmt(ret_stmt* node) {
    new_used_variable_mark_scope();
    if (!check_directly_return_self(node)) {
        // store used variable in table, then update record after visiting node
        logical_or_variable_used.push_back({});

        // visit node
        node->get_return_value()->accept(this);

        // update record and use mark
        for(const auto& i : logical_or_variable_used.back()) {
            if (record.count(i) && !used_variable.back().count(i)) {
                record.at(i)++;
                used_variable.back().insert(i);
            }
        }

        // pop table
        logical_or_variable_used.pop_back();
    }
    report_unused_parameter(node->get_location());
    pop_used_variable_mark_scope();
    return true;
}

bool ungrounded_parameter_checker::visit_in_block_expr(in_block_expr* node) {
    new_used_variable_mark_scope();
    node->get_expr()->accept(this);
    report_unused_parameter(node->get_location());
    pop_used_variable_mark_scope();
    return true;
}

bool ungrounded_parameter_checker::visit_block_stmt(block_stmt* node) {
    // if having no statement in it, check unused parameter directly
    if (!node->get_statement().size()) {
        report_unused_parameter(node->get_location());
        return true;
    }
    for(auto i : node->get_statement()) {
        i->accept(this);
    }
    return true;
}

bool ungrounded_parameter_checker::visit_call_head(call_head* node) {
    node->get_first_expression()->accept(this);
    if (node->has_func_call()) {
        node->get_func_call()->accept(this);
    }
    if (node->is_initializer()) {
        node->get_initializer()->accept(this);
    }
    return true;
}

bool ungrounded_parameter_checker::is_schema_get_primary_key(call_root* node) {
    if (node->get_call_head()->get_first_expression()->get_ast_class()!=ast_class::ac_identifier) {
        return false;
    }

    const auto& head_type = node->get_call_head()->get_resolve();
    // head type should not be global symbol or data-set type
    if (head_type.is_global || head_type.type.is_set) {
        return false;
    }

    // schema get primary key pattern may be:
    // 1. schema.primary_key
    // 2. schema.primary_key.other_calls()
    // so size should be >= 1
    if (node->get_call_chain().size()<1) {
        return false;
    }
    const auto name = head_type.type.full_path_name_without_set();
    const auto index = ctx->global.get_index(name);
    if (index==global_symbol_table::npos) {
        return false;
    }
    if (ctx->global.get_kind(index)!=symbol_kind::schema) {
        return false;
    }
    const auto& sc = ctx->global.get_schema(index);
    if (node->get_call_chain()[0]->get_call_type()!=call_expr::type::get_field ||
        node->get_call_chain()[0]->has_func_call()) {
        return false;
    }
    const auto key = node->get_call_chain()[0]->get_field_name()->get_name();
    // check if the field is primary key
    return sc.fields.count(key) && sc.fields.at(key).primary;
}

bool ungrounded_parameter_checker::visit_call_root(call_root* node) {
    if (is_schema_get_primary_key(node)) {
        return true;
    }
    for(auto i : node->get_call_chain()) {
        // if souffle aggregator is used in the call chain,
        // all variables used in this call is not grounded
        if (i->is_aggregator() && !i->is_aggregator_find()) {
            return true;
        }
    }
    node->get_call_head()->accept(this);
    for(auto i : node->get_call_chain()) {
        i->accept(this);
    }
    return true;
}

void ungrounded_parameter_checker::check(function_decl* node, function* funct) {
    record = {};
    used_variable = {{}};
    func_node = node;
    func = funct;
    in_logical_negative_expression_level = 0;

    // not implemented function, pass
    if (!node || !node->implemented()) {
        return;
    }

    // generate record table, all variables in it will be detected
    for(const auto i : node->get_parameter_list()) {
        record_is_set_flag.insert({
            i->get_var_name()->get_name(),
            i->has_declared_type()? i->get_type()->is_set():false
        });
        record.insert({i->get_var_name()->get_name(), 0});
    }

    // visit function code block
    self_is_grounded = true;
    node->get_code_block()->accept(this);

    // if `self` is grounded, do not do typecheck on this parameter...
    if (self_is_grounded &&
        funct->ordered_parameter_list.size() &&
        funct->ordered_parameter_list[0]=="self") {
        node->set_can_disable_self_check(true);
    }
}

}