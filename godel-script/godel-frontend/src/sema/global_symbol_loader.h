#pragma once

#include "godel-frontend/src/error/error.h"
#include "godel-frontend/src/ast/ast_visitor.h"
#include "godel-frontend/src/sema/context.h"
#include "godel-frontend/src/package/package.h"

#include <cstring>
#include <sstream>

namespace godel {

// visit all global declarations and register symbols in the semantic context
class global_symbol_loader: public ast_visitor {
private:
    report::error* err;
    context* ctx;

private:
    void register_symbol(const span&, const std::string&, symbol_kind);
    bool check_name_valid(identifier*) const;
    bool visit_database_decl(database_decl*) override;
    bool visit_schema_decl(schema_decl*) override;
    bool visit_function_decl(function_decl*) override;
    bool visit_enum_decl(enum_decl*) override;
    bool visit_impl_block(impl_block*) override;
    bool visit_query_decl(query_decl*) override;

public:
    global_symbol_loader(report::error* err_ptr, context* ctx_ptr):
    	err(err_ptr), ctx(ctx_ptr) {}
    void scan(ast_root*);
};

}