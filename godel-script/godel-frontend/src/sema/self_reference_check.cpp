#include "godel-frontend/src/sema/self_reference_check.h"

namespace godel {

void self_extend_checker::clear_all_mark() {
    for (auto& sc : *schema_table) {
        sc.second.self_ref_checked = false;
    }
}

void self_extend_checker::self_extend_check_core(
    const std::string& name,
    const span& extend_id_location,
    std::queue<std::pair<std::string, std::string>>& bfs) {
    
    auto [self, path] = bfs.front();
    bfs.pop();
    const auto& ext = schema_table->at(self);

    // no need to check schema without parent
    if (!ext.has_parent()) {
        return;
    }

    const auto ref_path = path + " -> " + ext.extends;
    if (ext.extends == name) {
        err->err(extend_id_location, "\"" + name + "\" self extends.", ref_path);
        return;
    }

    // no need to check self extend from import schema
    if (!schema_table->count(ext.extends)) {
        return;
    }

    if (!schema_table->at(ext.extends).self_ref_checked) {
        bfs.push({ext.extends, ref_path});
        schema_table->at(ext.extends).self_ref_checked = true;
    }
}

void self_extend_checker::check() {
    // do not need to check extend schema from other file namespace
    // because godel does not allow a file to reference self
    // and imported schema must not extend a schema from the file which imports itself

    // check if schema extends itself, using bfs
    std::queue<std::pair<std::string, std::string>> bfs;

    for(auto& sc : *schema_table) {
        clear_all_mark();
        // mark root
        const auto& name = sc.first;
        sc.second.self_ref_checked = true;

        // if does not extend anything, skip check
        if (!sc.second.has_parent()) {
            continue;
        }
        bfs.push({name, name});

        // bfs search
        while(!bfs.empty()) {
            self_extend_check_core(name, sc.second.location, bfs);
        }
    }
}

void self_reference_checker::clear_all_mark() {
    for (auto& sc : *schema_table) {
        sc.second.self_ref_checked = false;
    }
}

void self_reference_checker::self_reference_check_core(
    const std::string& name,
    std::queue<std::pair<std::string, std::string>>& bfs) {
    
    auto [self, path] = bfs.front();
    bfs.pop();

    for(const auto& i : schema_table->at(self).fields) {
        const auto& field_name = i.first;
        const auto& type_name = i.second.full_path_name();
        const auto ref_path = path + "." + field_name + " -> " + type_name;
        // check self-referenced
        if (type_name == name) {
            err->err(i.second.location,
                "\"" + field_name + "\" self references \"" + type_name + "\".",
                ref_path
            );
        }

        // no need to check imported schema, file could not be self-referenced
        if (!schema_table->count(type_name)) {
            continue;
        }

        // mark self_ref_checked flag, avoid recursive check
        if (!schema_table->at(type_name).self_ref_checked) {
            bfs.push({type_name, ref_path});
            schema_table->at(type_name).self_ref_checked = true;
        }
    }
}

void self_reference_checker::check() {
    // check if schema has references of itself, using bfs
    std::queue<std::pair<std::string, std::string>> bfs;

    for(auto& sc : *schema_table) {
        clear_all_mark();
        // mark root
        const auto& name = sc.first;
        sc.second.self_ref_checked = true;
        bfs.push({name, name});

        // bfs search
        while(!bfs.empty()) {
            self_reference_check_core(name, bfs);
        }
    }
}

}