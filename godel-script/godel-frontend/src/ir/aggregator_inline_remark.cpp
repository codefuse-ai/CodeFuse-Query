#include "godel-frontend/src/ir/aggregator_inline_remark.h"

namespace godel {

void aggregator_inline_remark::visit_call(lir::call* node) {
    // if this call is not used in aggregator, skip
    if (!in_aggregator) {
        return;
    }

    // no need to remark intrinsics
    switch(node->get_func_kind()) {
        case lir::call::kind::database_load:
        case lir::call::kind::find:
        case lir::call::kind::key_cmp:
        case lir::call::kind::to_set:
        case lir::call::kind::basic_method:
        case lir::call::kind::basic_static: return;
        default: break;
    }

    const auto mangled_rule_name = node->get_mangled_name();
    switch(node->get_func_kind()) {
        case lir::call::kind::function:
        case lir::call::kind::method:
            if (inline_rules.count(mangled_rule_name) &&
                !inline_rules.at(mangled_rule_name)->is_inherited()) {
                err.warn(node->get_location(),
                    "inline function \"" +
                    node->get_function_name() +
                    "\" used in aggregator.",
                    "will generate as non-inline to avoid ungrounded error."
                );
            }
            need_remark.insert(mangled_rule_name);
            break;
        default: break;
    }
}

void aggregator_inline_remark::visit_aggregator(lir::aggregator* node) {
    // this should be unreachable, used to check if codegen works correctly
    if (in_aggregator) {
        err.err(node->get_location(),
            "detect nested aggregator, please check generated code."
        );
        return;
    }

    in_aggregator = true;
    node->get_body()->accept(this);
    in_aggregator = false;
}

bool aggregator_inline_remark::run() {
    // load inline rules from declarations
    for(const auto& decl : ctx->rule_decls) {
        if (decl->is_inline()) {
            inline_rules.insert({ decl->get_mangled_name(), decl });
        }
    }

    // visit all rule impls' block to find matched cases
    for(auto impl : ctx->rule_impls) {
        impl->get_block()->accept(this);
    }
    for(auto impl : ctx->database_get_table) {
        impl->get_block()->accept(this);
    }
    for(auto impl : ctx->schema_get_field) {
        impl->get_block()->accept(this);
    }
    for(auto impl : ctx->schema_data_constraint_impls) {
        impl->get_block()->accept(this);
    }

    // if error is reported during this pass, return false
    if (err.get_error()) {
        return false;
    }

    // remark inline to false
    for(auto& decl : ctx->rule_decls) {
        if (need_remark.count(decl->get_mangled_name())) {
            decl->set_is_inline_rule(false);
        }
    }
    return true;
}

}