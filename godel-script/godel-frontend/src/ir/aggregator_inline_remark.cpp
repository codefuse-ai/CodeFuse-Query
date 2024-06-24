#include "godel-frontend/src/ir/aggregator_inline_remark.h"

namespace godel {

void aggregator_inline_remark::visit_call(lir::call* node) {
    if (!in_aggregator) {
        return;
    }
    switch(node->get_func_kind()) {
        case lir::call::kind::function:
        case lir::call::kind::method:
            if (inline_rules.count(replace_colon(node->get_function_name()))) {
                err.warn(node->get_location(),
                    "inline function \"" +
                    node->get_function_name() +
                    "\" used in aggregator.",
                    "will generate as a normal function."
                );
            }
            need_remark.insert(replace_colon(node->get_function_name()));
            break;
        default: break;
    }
}

void aggregator_inline_remark::visit_aggregator(lir::aggregator* node) {
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
    for(const auto& decl : ctx->rule_decls) {
        if (decl->is_inline()) {
            inline_rules.insert(replace_colon(decl->get_rule_raw_name()));
        }
    }

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

    if (err.get_error()) {
        return false;
    }

    // remark inline to false
    for(auto& decl : ctx->rule_decls) {
        if (need_remark.count(replace_colon(decl->get_rule_raw_name()))) {
            decl->set_is_inline_rule(false);
        }
    }
    return true;
}

}