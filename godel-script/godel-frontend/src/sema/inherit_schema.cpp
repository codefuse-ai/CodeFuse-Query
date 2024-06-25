#include "godel-frontend/src/sema/inherit_schema.h"

#include <queue>

namespace godel {

void schema_field_inherit_worker::check_multiple_primary_keys() {
    for(const auto& sc : ctx->global.get_domain(ctx->this_file_name).schemas) {
        auto primary_field = std::string("");
        auto cnt = 0;
        for(const auto& field : sc.second.fields) {
            cnt += field.second.primary? 1:0;
            primary_field += field.second.primary? field.first + ", ":"";
        }
        if (cnt>1) {
            primary_field = primary_field.substr(0, primary_field.length() - 2);
            err->err(sc.second.location,
                "schema has multiple primary keys: \"" +
                primary_field + "\"."
            );
        }
    }
}

void schema_field_inherit_worker::inherit_single_schema_field(schema* child) {
    for(const auto& field : child->parent->fields) {
        const auto& field_name = field.first;
        if (child->fields.count(field_name)) {
            err->err(child->fields.at(field_name).location,
                "parent field \"" + field_name + "\" overrides."
            );
        }
        child->fields.insert(field);
    }

    // insert parent's fields in front of child's fields
    auto ordered_field_copy = child->ordered_fields;
    child->ordered_fields = child->parent->ordered_fields;
    for(const auto& field : ordered_field_copy) {
        child->ordered_fields.push_back(field);
    }
}

void schema_field_inherit_worker::inherit_field() {
    auto& schemas = ctx->global.get_domain(ctx->this_file_name).schemas;
    std::queue<schema*> bfs;

    // first push root set into the queue
    for(auto& sc : schemas) {
        // add schemas whose parent has no parents
        if (sc.second.has_parent() && !sc.second.parent->has_parent()) {
            bfs.push(&sc.second);
        }
        // add schemas whose parent is not in the same file
        else if (sc.second.has_parent() && sc.second.parent->location.file!=ctx->this_file_name) {
            bfs.push(&sc.second);
        }
    }

    while(!bfs.empty()) {
        auto child = bfs.front();
        bfs.pop();

        // inherit field from parent
        inherit_single_schema_field(child);

        // inherit field to childs
        for(auto ptr : child->child) {
            bfs.push(ptr);
        }
    }

    // check if schema has primary keys
    check_multiple_primary_keys();
}

void schema_method_inherit_worker::check_schema_without_data_constraint() {
    for(const auto& sc : ctx->global.get_domain(ctx->this_file_name).schemas) {
        // do not need to check database table schema
        if (sc.second.referenced_by_database_table) {
            continue;
        }

        // check schema has data constraint method or not
        if (!sc.second.methods.count("__all__")) {
            err->warn(sc.second.location,
                "data constraint not found in this schema.",
                "use in database, or implement \"__all__\" method."
            );
        }
    }
}

void schema_method_inherit_worker::inherit_single_schema_method(schema* child) {
    for(const auto& method : child->parent->methods) {
        // child has this method, means the method is override, skip
        if (child->methods.count(method.first)) {
            continue;
        }

        // __all__(...) must be written by yourself
        // so do not inherit it
        if (method.first == "__all__") {
            continue;
        }

        // copy method into child's methods
        child->methods.insert(method);

        // set method inherit mark to true
        auto& func = child->methods.at(method.first);
        func.inherit = true;

        // update method parameter 'self' type info
        if (func.parameter_list.count("self")) {
            auto& self = func.parameter_list.at("self");
            self.type_name = child->name;
            self.type_loc = ctx->find_global_location(child->name);
        }
    }
}

void schema_method_inherit_worker::inherit_method() {
    auto& schemas = ctx->global.get_domain(ctx->this_file_name).schemas;
    std::queue<schema*> bfs;

    // first push root set into the queue
    for(auto& sc : schemas) {
        // add schemas whose parent has no parents
        if (sc.second.has_parent() && !sc.second.parent->has_parent()) {
            bfs.push(&sc.second);
        }
        // add schemas whose parent is not in the same file
        else if (sc.second.has_parent() &&
            sc.second.parent->location.file!=ctx->this_file_name) {
            bfs.push(&sc.second);
        }
    }

    while(!bfs.empty()) {
        auto child = bfs.front();
        bfs.pop();

        // inherit method from parent
        inherit_single_schema_method(child);

        // inherit childs
        for(auto ptr : child->child) {
            bfs.push(ptr);
        }
    }

    // check schema with no data_constraint
    check_schema_without_data_constraint();
}

}
