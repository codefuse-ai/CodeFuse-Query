#pragma once

#include "godel-frontend/src/error/error.h"

#include "godel-frontend/src/ast/ast_node.h"
#include "godel-frontend/src/ast/decl.h"
#include "godel-frontend/src/ast/stmt.h"
#include "godel-frontend/src/ast/expr.h"

#include <vector>
#include <cstring>
#include <sstream>

namespace godel {

using report::span;

// ast root node
class ast_root: public ast_node {
public:
    ast_root(const ast_root&) = delete;
    ast_root& operator=(const ast_root&) = delete;

private:
    std::vector<use_stmt*> use_statements;
    std::vector<decl*> declarations;

public:
    ast_root(const span& location): ast_node(ast_class::ac_root, location) {}
    ~ast_root() override;

    void add_use_statement(use_stmt* p) { use_statements.push_back(p); }
    void add_declaration(decl* p) { declarations.push_back(p); }

    auto& get_use_statements() { return use_statements; }
    auto& get_declarations() { return declarations; }

    void accept(ast_visitor* visitor) override;
};

} // end namespace godel