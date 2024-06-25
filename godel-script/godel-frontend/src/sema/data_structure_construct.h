#pragma once

#include "godel-frontend/src/error/error.h"
#include "godel-frontend/src/sema/context.h"
#include "godel-frontend/src/ast/ast_visitor.h"

namespace godel {

class data_structure_construct: public ast_visitor {
private:
    report::error* err;
    context* ctx;

private:
    bool visit_enum_decl(enum_decl*) override;
    bool visit_schema_decl(schema_decl*) override;
    bool visit_database_decl(database_decl*) override;
    // check schema parent
    void schema_load_parent(type_def*, schema&);
    // check schema field
    void check_field_annot(annotation*);
    void schema_load_field(schema_field*, schema&);
    // load native schema method
    void schema_load_native_method(schema&);
    // check database table
    void database_load_table(database_table*, database&);
    // load native database method
    void database_load_native_method(database&);

public:
    data_structure_construct(report::error* err_ptr, context* ctx_ptr):
    	err(err_ptr), ctx(ctx_ptr) {}

    void check(ast_root* root) {
        root->accept(this);
    }
};

}