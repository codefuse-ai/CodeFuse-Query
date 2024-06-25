#pragma once

#include "godel-frontend/src/error/error.h"
#include "godel-frontend/src/sema/context.h"

namespace godel {

class schema_field_inherit_worker {
private:
    report::error* err;
    context* ctx;

private:
    void check_multiple_primary_keys();
    void inherit_single_schema_field(schema*);

public:
    schema_field_inherit_worker(report::error* err_ptr, context* ctx_ptr):
        err(err_ptr), ctx(ctx_ptr) {}
    void inherit_field();
};

class schema_method_inherit_worker {
private:
    report::error* err;
    context* ctx;

private:
    void check_schema_without_data_constraint();
    void inherit_single_schema_method(schema*);

public:
    schema_method_inherit_worker(report::error* err_ptr, context* ctx_ptr):
        err(err_ptr), ctx(ctx_ptr) {}
    void inherit_method();
};

}