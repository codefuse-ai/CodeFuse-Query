#include "godel-frontend/src/sema/fact_statement_checker.h"

namespace godel {

bool fact_statement_checker::visit_fact_stmt(fact_stmt* node) {
    has_fact_statement = true;
    if (!on_top_local_scope_flag) {
        err->err(node->get_location(),
            "fact statement cannot be contained in another statement."
        );
        return false;
    }
    return true;
}

void fact_statement_checker::check(const function& func, block_stmt* function_block) {
    has_fact_statement = false;
    for(auto child : function_block->get_statement()) {
        if (child->get_ast_class()==ast_class::ac_fact_stmt) {
            has_fact_statement = true;
        }
    }
    if (has_fact_statement && function_block->get_statement().size()>1) {
        err->err(function_block->get_location(),
            "code block should have only one fact statement."
        );
        return;
    }

    // check embedded statements
    on_top_local_scope_flag = false;
    for(auto child : function_block->get_statement()) {
        if (child->get_ast_class()!=ast_class::ac_fact_stmt) {
            child->accept(this);
        }
    }
    on_top_local_scope_flag = true;

    // no fact statement exists, return
    if (!has_fact_statement) {
        return;
    }

    // check parameters
    if (!func.parameter_list.size()) {
        err->err(function_block->get_location(),
            "code block has fact statement, function should have parameter."
        );
        return;
    }

    // check return type
    if (func.return_type==symbol::null()) {
        err->err(func.return_type.location, "must have bool return value.");
        return;
    }

    // check return type
    if (func.return_type!=symbol::boolean() || func.return_type.is_set) {
        err->err(func.return_type.location, "return type must be bool.");
        return;
    }
}

}