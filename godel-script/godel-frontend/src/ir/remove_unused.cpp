#include "godel-frontend/src/ir/remove_unused.h"
#include "godel-frontend/src/ir/name_mangling.h"

namespace godel {

const callee_dict& unused_remove_pass::used_finder::apply(const ir_context& ctx) {
    // create call graph data structure
    call_graph_generator cgg;
    const auto& cg = cgg.apply(ctx);

    // use bfs to find all used rules
    std::queue<std::string> bfs;
    // clear used set
    used.clear();
    // data constraint for database, this must be used
    used.insert("all_data_DBIndex");
    // start from souffle output, the root of call graph
    for(const auto& i : ctx.souffle_output) {
        const auto mangled_name = rule_mangle(i);
        bfs.push(mangled_name);
        used.insert(mangled_name);
    }
    for(const auto& i : ctx.annotated_output) {
        const auto mangled_name = i.get_mangled_name();
        bfs.push(mangled_name);
        used.insert(mangled_name);
    }

    // use bfs to find all used rules
    while(!bfs.empty()) {
        const auto curr = bfs.front();
        bfs.pop();
        // rule name not found, check next rule impl in queue
        if (!cg.count(curr)) {
            continue;
        }
        // add all used rules into the queue
        for(const auto& i : cg.at(curr)) {
            // do not push used rule into the queue, to avoid infinite loop
            if (used.count(i)) {
                continue;
            }
            bfs.push(i);
            used.insert(i);
        }
    }

    // return the result
    return used;
}

void unused_remove_pass::remove_unused_schema_data_constraint_decl(
    const callee_dict& used_rule) {
    std::vector<souffle_schema> used;
    for(const auto& i : ctx->schema_data_constraint_decls) {
        if (used_rule.count(i.get_mangled_name())) {
            used.push_back(i);
        }
    }
    ctx->schema_data_constraint_decls = used;
}

void unused_remove_pass::remove_unused_schema_data_constraint_impl(
    const callee_dict& used_rule) {
    std::vector<souffle_rule_impl*> used;
    for(auto i : ctx->schema_data_constraint_impls) {
        if (used_rule.count(i->get_mangled_name())) {
            used.push_back(i);
        } else {
            delete i;
        }
    }
    ctx->schema_data_constraint_impls = used;
}

void unused_remove_pass::remove_unused_schema_get_field(
    const callee_dict& used_rule) {
    std::vector<souffle_rule_impl*> used;
    for(auto i : ctx->schema_get_field) {
        if (used_rule.count(i->get_mangled_name())) {
            used.push_back(i);
        } else {
            delete i;
        }
    }
    ctx->schema_get_field = used;
}

void unused_remove_pass::remove_unused_rule_decl(
    const callee_dict& used_rule) {
    std::vector<souffle_rule_decl*> used;
    for(auto i : ctx->rule_decls) {
        if (used_rule.count(i->get_mangled_name())) {
            used.push_back(i);
        } else {
            delete i;
        }
    }
    ctx->rule_decls = used;
}

void unused_remove_pass::remove_unused_rule_impl(const callee_dict& used_rule) {
    std::vector<souffle_rule_impl*> used;
    for(auto i : ctx->rule_impls) {
        if (used_rule.count(i->get_mangled_name())) {
            used.push_back(i);
        } else {
            delete i;
        }
    }
    ctx->rule_impls = used;
}

void unused_remove_pass::remove_unused_input_decl(const callee_dict& used_rule) {
    std::vector<souffle_input_decl> used;
    for(const auto& i : ctx->input_decls) {
        if (used_rule.count(i.get_mangled_name())) {
            used.push_back(i);
        }
    }
    ctx->input_decls = used;
}

void unused_remove_pass::remove_unused_input_impl(const callee_dict& used_rule) {
    std::vector<souffle_input_impl> used;
    for(const auto& i : ctx->input_impls) {
        if (used_rule.count(i.get_mangled_name())) {
            used.push_back(i);
        }
    }
    ctx->input_impls = used;
}

void unused_remove_pass::remove_unused_annotated_input(
    const callee_dict& used_rule) {
    std::vector<souffle_annotated_file_input> used;
    for(const auto& i : ctx->annotated_input) {
        if (used_rule.count(i.get_mangled_name())) {
            used.push_back(i);
        }
    }
    ctx->annotated_input = used;
}

void unused_remove_pass::remove_unused_database_get_table(
    const callee_dict& used_rule) {
    std::vector<souffle_rule_impl*> used;
    for(auto i : ctx->database_get_table) {
        if (used_rule.count(i->get_mangled_name())) {
            used.push_back(i);
        } else {
            delete i;
        }
    }
    ctx->database_get_table = used;
}

bool unused_remove_pass::run() {
    used_finder uf;
    const auto& used_rule = uf.apply(*ctx);
    remove_unused_schema_data_constraint_decl(used_rule);
    remove_unused_schema_data_constraint_impl(used_rule);
    remove_unused_schema_get_field(used_rule);
    remove_unused_rule_decl(used_rule);
    remove_unused_rule_impl(used_rule);
    remove_unused_input_decl(used_rule);
    remove_unused_input_impl(used_rule);
    remove_unused_annotated_input(used_rule);
    remove_unused_database_get_table(used_rule);
    return true;
}

bool unused_type_alias_remove_pass::run() {
    std::unordered_set<std::string> used_type = {"int", "string", "float"};
    for(const auto& i : ctx->schema_data_constraint_decls) {
        for(const auto& field : i.fields) {
            used_type.insert(type_mangle(field.second));
        }
    }
    for(const auto& i : ctx->input_decls) {
        for(const auto& field : i.fields) {
            used_type.insert(type_mangle(field.second));
        }
    }
    for(auto i : ctx->rule_decls) {
        for(const auto& param : i->get_params()) {
            used_type.insert(type_mangle(param.second));
        }
        used_type.insert(type_mangle(i->get_return_type()));
    }
    // add their real type into the used type too
    for(const auto& i : ctx->type_alias) {
        if (used_type.count(i.alias)) {
            if (i.structure_type_list.size()) {
                for(const auto& j : i.structure_type_list) {
                    used_type.insert(j);
                }
            } else {
                used_type.insert(i.real);
            }
        }
    }

    std::vector<souffle_type_alias> used_type_alias;
    for(const auto& i : ctx->type_alias) {
        if (used_type.count(i.alias)) {
            used_type_alias.push_back(i);
        }
    }
    ctx->type_alias = used_type_alias;
    return true;
}

}