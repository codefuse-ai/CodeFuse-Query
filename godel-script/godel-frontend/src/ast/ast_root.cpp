#include "godel-frontend/src/ast/ast_root.h"
#include "godel-frontend/src/ast/ast_visitor.h"

#include <vector>
#include <cstring>
#include <sstream>
#include <iostream>

namespace godel {

ast_root::~ast_root() {
    for(auto i : use_statements) {
        delete i;
    }
    for(auto i : declarations) {
        delete i;
    }
}

void ast_root::accept(ast_visitor* visitor) {
    visitor->visit_ast_root(this);
}

} // end namespace godel