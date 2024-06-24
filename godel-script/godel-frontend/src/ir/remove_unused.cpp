#include "godel-frontend/src/ir/remove_unused.h"

namespace godel {

void call_graph_generator::check_inst(lir::inst* stmt,
                                      std::queue<lir::block*>& bfs,
                                      used_dict& dict) const {
    switch(stmt->get_kind()) {
        case lir::inst_kind::inst_call:
            dict.insert(replace_colon(
                reinterpret_cast<lir::call*>(stmt)->get_function_name()
            ));
            break;
        case lir::inst_kind::inst_ctor:
            dict.insert(replace_colon(
                "schema_" +
                reinterpret_cast<lir::constructor*>(stmt)->get_schema_name()
            ));
            break;
        case lir::inst_kind::inst_block:
            bfs.push(reinterpret_cast<lir::block*>(stmt));
            break;
        case lir::inst_kind::inst_not:
            bfs.push(reinterpret_cast<lir::not_operand*>(stmt)->get_body());
            break;
        case lir::inst_kind::inst_and:
            bfs.push(reinterpret_cast<lir::and_operand*>(stmt)->get_left_block());
            bfs.push(reinterpret_cast<lir::and_operand*>(stmt)->get_right_block());
            break;
        case lir::inst_kind::inst_or:
            bfs.push(reinterpret_cast<lir::or_operand*>(stmt)->get_left_block());
            bfs.push(reinterpret_cast<lir::or_operand*>(stmt)->get_right_block());
            break;
        case lir::inst_kind::inst_aggr:
            bfs.push(reinterpret_cast<lir::aggregator*>(stmt)->get_body());
        default: break;
    }
}

void call_graph_generator::scan_call(souffle_rule_impl* impl,
                                     used_dict& dict) const {
    // recursively search used rules
    // but we use bfs queue to avoid stack overflow
    // so visitor(dfs) is not needed here
    std::queue<lir::block*> bfs;
    bfs.push(impl->get_block());
    while(!bfs.empty()) {
        auto block = bfs.front();
        bfs.pop();
        for(auto stmt : block->get_content()) {
            check_inst(stmt, bfs, dict);
        }
    }
}

void call_graph_generator::initialize_call_graph_root(const std::vector<std::string>& output,
                                                      call_graph& cg) const {
    for(const auto& i : output) {
        const auto name = replace_colon(i);
        if (!cg.count(name)) {
            cg.insert({name, {}});
        }
    }
}

void call_graph_generator::initialize_call_graph_root(
    const std::vector<souffle_annotated_file_output>& output,
    call_graph& cg) const {
    for(const auto& i : output) {
        const auto name = replace_colon(i.rule_name);
        if (!cg.count(name)) {
            cg.insert({name, {}});
        }
    }
}

void call_graph_generator::initialize_call_graph(const std::vector<souffle_rule_impl*>& impls,
                                                 call_graph& cg) const {
    for(auto i : impls) {
        const auto name = replace_colon(i->get_func_name());
        if (!cg.count(name)) {
            cg.insert({name, {}});
        }
        // construct the call graph and mark all used rules
        scan_call(i, cg.at(name));
    }
}

const used_dict& call_graph_generator::apply(const ir_context& ctx) {
    // create call graph data structure
    call_graph cg;

    // construct call graph by scanning the IR
    initialize_call_graph_root(ctx.souffle_output, cg);
    initialize_call_graph_root(ctx.annotated_output, cg);
    initialize_call_graph(ctx.rule_impls, cg);
    initialize_call_graph(ctx.database_get_table, cg);
    initialize_call_graph(ctx.schema_get_field, cg);
    initialize_call_graph(ctx.schema_data_constraint_impls, cg);

    // use bfs to find all used rules
    std::queue<std::string> bfs;
    // clear used set
    used.clear();
    // data constraint for database, this must be used
    used.insert("all_data_DBIndex");
    // start from souffle output, the root of call graph
    for(const auto& i : ctx.souffle_output) {
        bfs.push(replace_colon(i));
        used.insert(replace_colon(i));
    }
    for(const auto& i : ctx.annotated_output) {
        bfs.push(replace_colon(i.rule_name));
        used.insert(replace_colon(i.rule_name));
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

void unused_remove_pass::remove_unused_schema_data_constraint_decl(const used_dict& used_rule) {
    std::vector<souffle_schema> used;
    for(const auto& i : ctx->schema_data_constraint_decls) {
        if (used_rule.count("schema_" + replace_colon(i.name))) {
            used.push_back(i);
        }
    }
    ctx->schema_data_constraint_decls = used;
}

void unused_remove_pass::remove_unused_schema_data_constraint_impl(const used_dict& used_rule) {
    std::vector<souffle_rule_impl*> used;
    for(auto i : ctx->schema_data_constraint_impls) {
        if (used_rule.count(replace_colon(i->get_func_name()))) {
            used.push_back(i);
        } else {
            delete i;
        }
    }
    ctx->schema_data_constraint_impls = used;
}

void unused_remove_pass::remove_unused_schema_get_field(const used_dict& used_rule) {
    std::vector<souffle_rule_impl*> used;
    for(auto i : ctx->schema_get_field) {
        if (used_rule.count(replace_colon(i->get_func_name()))) {
            used.push_back(i);
        } else {
            delete i;
        }
    }
    ctx->schema_get_field = used;
}

void unused_remove_pass::remove_unused_rule_decl(const used_dict& used_rule) {
    std::vector<souffle_rule_decl*> used;
    for(auto i : ctx->rule_decls) {
        if (used_rule.count(replace_colon(i->get_rule_raw_name()))) {
            used.push_back(i);
        } else {
            delete i;
        }
    }
    ctx->rule_decls = used;
}

void unused_remove_pass::remove_unused_rule_impl(const used_dict& used_rule) {
    std::vector<souffle_rule_impl*> used;
    for(auto i : ctx->rule_impls) {
        if (used_rule.count(replace_colon(i->get_func_name()))) {
            used.push_back(i);
        } else {
            delete i;
        }
    }
    ctx->rule_impls = used;
}

void unused_remove_pass::remove_unused_input_decl(const used_dict& used_rule) {
    std::vector<souffle_input_decl> used;
    for(const auto& i : ctx->input_decls) {
        if (used_rule.count(i.get_decl_name())) {
            used.push_back(i);
        }
    }
    ctx->input_decls = used;
}

void unused_remove_pass::remove_unused_input_impl(const used_dict& used_rule) {
    std::vector<souffle_input_impl> used;
    for(const auto& i : ctx->input_impls) {
        if (used_rule.count(i.get_decl_name())) {
            used.push_back(i);
        }
    }
    ctx->input_impls = used;
}

void unused_remove_pass::remove_unused_annotated_input(const used_dict& used_rule) {
    std::vector<souffle_annotated_file_input> used;
    for(const auto& i : ctx->annotated_input) {
        if (used_rule.count(i.rule_name)) {
            used.push_back(i);
        }
    }
    ctx->annotated_input = used;
}

void unused_remove_pass::remove_unused_database_get_table(const used_dict& used_rule) {
    std::vector<souffle_rule_impl*> used;
    for(auto i : ctx->database_get_table) {
        if (used_rule.count(replace_colon(i->get_func_name()))) {
            used.push_back(i);
        } else {
            delete i;
        }
    }
    ctx->database_get_table = used;
}

bool unused_remove_pass::run() {
    call_graph_generator cgg;
    const auto& used_rule = cgg.apply(*ctx);
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
    std::unordered_set<std::string> used_type = {"int", "string"};
    for(const auto& i : ctx->schema_data_constraint_decls) {
        for(const auto& field : i.fields) {
            used_type.insert(replace_colon(field.second));
        }
    }
    for(const auto& i : ctx->input_decls) {
        for(const auto& field : i.fields) {
            used_type.insert(replace_colon(field.second));
        }
    }
    for(auto i : ctx->rule_decls) {
        for(const auto& param : i->get_params()) {
            used_type.insert(replace_colon(param.second));
        }
        used_type.insert(replace_colon(i->get_return_type()));
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