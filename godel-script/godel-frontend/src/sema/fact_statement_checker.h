#pragma once

#include "godel-frontend/src/error/error.h"
#include "godel-frontend/src/ast/ast_visitor.h"
#include "godel-frontend/src/sema/context.h"

namespace godel {

class fact_statement_checker: public ast_visitor {
private:
    report::error* err;
    bool on_top_local_scope_flag;
    bool has_fact_statement;

private:
    bool visit_fact_stmt(fact_stmt*) override;

public:
    fact_statement_checker(report::error* err_ptr):
        err(err_ptr), on_top_local_scope_flag(true),
        has_fact_statement(false) {}
    void check(const function&, block_stmt*);
};

}