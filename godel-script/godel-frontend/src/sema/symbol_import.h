#pragma once

#include "godel-frontend/src/error/error.h"
#include "godel-frontend/src/sema/context.h"
#include "godel-frontend/src/ast/ast_visitor.h"
#include "godel-frontend/src/cli.h"

#include <cstring>
#include <sstream>
#include <vector>
#include <unordered_map>

namespace godel {

using cli::option;
using cli::configure;

// check use statement and import symbols from modules
class symbol_import: public ast_visitor {
private:
    report::error* err;
    context* ctx;
    const configure* compile_config;

private:
    void add_conflict_symbol(const std::string&, const std::string&);
    configure inherit_config(const std::string&);
    void analyse_import_module(const std::string&, const std::string&, const span&);
    void check_use_stmt(use_stmt*);
    void import_all_symbol(const domain&, const std::string&);
    void import_explicit_symbol(multi_use_stmt*, const domain&, const std::string&);
    bool visit_use_stmt(use_stmt*) override;

public:
    symbol_import(report::error* err_ptr, context* ctx_ptr):
    	err(err_ptr), ctx(ctx_ptr), compile_config(nullptr) {}
    void scan(const configure*, ast_root*);
};

}