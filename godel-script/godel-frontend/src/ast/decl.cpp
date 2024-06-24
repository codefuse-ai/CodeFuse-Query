#include "godel-frontend/src/ast/decl.h"
#include "godel-frontend/src/ast/ast_visitor.h"

namespace godel {

void decl::accept(ast_visitor* visitor) {
    visitor->visit_decl(this);
}

void annotation::accept(ast_visitor* visitor) {
    visitor->visit_annotation(this);
}

void type_def::accept(ast_visitor* visitor) {
    visitor->visit_type_def(this);
}

database_table::~database_table() {
    delete name;
    delete type_name;
    delete as_name;
}

void database_table::accept(ast_visitor* visitor) {
    visitor->visit_database_table(this);
}

database_decl::~database_decl() {
    delete name;
    for(auto i : tables) {
        delete i;
    }
}

void database_decl::accept(ast_visitor* visitor) {
    visitor->visit_database_decl(this);
}

schema_field::~schema_field() {
    delete anno;
    delete name;
    delete type_name;
}

void schema_field::accept(ast_visitor* visitor) {
    visitor->visit_schema_field(this);
}

schema_decl::~schema_decl() {
    delete name;
    delete parent_name;
    for(auto i : pairs) {
        delete i;
    }
}

void schema_decl::accept(ast_visitor* visitor) {
    visitor->visit_schema_decl(this);
}

function_decl::~function_decl() {
    for(auto i : annotations) {
        delete i;
    }
    delete name;
    for(auto i : param) {
        delete i;
    }
    delete return_type;
    delete block;
}

void function_decl::accept(ast_visitor* visitor) {
    visitor->visit_function_decl(this);
}

enum_decl::~enum_decl() {
    delete name;
    for(auto i : member) {
        delete i;
    }
}

void enum_decl::accept(ast_visitor* visitor) {
    visitor->visit_enum_decl(this);
}

var_decl::~var_decl() {
    delete name;
    delete type_name;
    delete init_value;
}

void var_decl::accept(ast_visitor* visitor) {
    visitor->visit_var_decl(this);
}

impl_block::~impl_block() {
    delete impl_schema_name;
    for(auto i : method) {
        delete i;
    }
}

void impl_block::accept(ast_visitor* visitor) {
    visitor->visit_impl_block(this);
}

query_column::~query_column() {
    delete column_name;
    delete column_value;
}

void query_column::accept(ast_visitor* visitor) {
    visitor->visit_query_column(this);
}

query_decl::~query_decl() {
    delete query_name;
    for(auto i : from_list) {
        delete i;
    }
    delete where_condition;
    for(auto i : select_list) {
        delete i;
    }
}

void query_decl::accept(ast_visitor* visitor) {
    visitor->visit_query_decl(this);
}

} // end namespace godel