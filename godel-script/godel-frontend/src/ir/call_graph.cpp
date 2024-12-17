#include "godel-frontend/src/ir/call_graph.h"

namespace godel {

void call_graph_generator::scan_ir_call(lir::call* node, callee_dict& dict) const {
    switch(node->get_func_kind()) {
        case lir::call::kind::database_load:
        case lir::call::kind::find:
        case lir::call::kind::key_cmp:
        case lir::call::kind::to_set:
        case lir::call::kind::basic_method:
        case lir::call::kind::basic_static: return;
        default: break;
    }

    // only need user-defined rules
    dict.insert(node->get_mangled_name());
    return;
}

void call_graph_generator::scan_call(souffle_rule_impl* impl,
                                     callee_dict& dict) const {
    // recursively search used rules
    // but we use bfs queue to avoid stack overflow
    // so visitor(dfs) is not needed here
    std::queue<lir::block*> bfs;
    bfs.push(impl->get_block());

    while(!bfs.empty()) {
        auto block = bfs.front();
        bfs.pop();
        for(auto stmt : block->get_content()) {
            switch(stmt->get_kind()) {
                case lir::inst_kind::inst_call:
                    scan_ir_call((lir::call*)stmt, dict);
                    break;
                case lir::inst_kind::inst_ctor:
                    dict.insert(((lir::constructor*)stmt)->get_mangled_name());
                    break;
                case lir::inst_kind::inst_block:
                    bfs.push((lir::block*)stmt);
                    break;
                case lir::inst_kind::inst_not:
                    bfs.push(((lir::not_operand*)stmt)->get_body());
                    break;
                case lir::inst_kind::inst_and:
                    bfs.push(((lir::and_operand*)stmt)->get_left_block());
                    bfs.push(((lir::and_operand*)stmt)->get_right_block());
                    break;
                case lir::inst_kind::inst_or:
                    bfs.push(((lir::or_operand*)stmt)->get_left_block());
                    bfs.push(((lir::or_operand*)stmt)->get_right_block());
                    break;
                case lir::inst_kind::inst_aggr:
                    bfs.push(((lir::aggregator*)stmt)->get_body());
                default: break;
            }
        }
    }
}

void call_graph_generator::initialize_call_graph(
    const std::vector<souffle_rule_impl*>& impls, call_graph& cg) const {
    for(auto i : impls) {
        const auto name = i->get_mangled_name();
        if (!cg.count(name)) {
            cg.insert({name, {}});
        }
        // construct the call graph and mark all used rules
        scan_call(i, cg.at(name));
    }
}

const call_graph& call_graph_generator::apply(const ir_context& ctx) {
    cg.clear();

    // initialize call graph root
    for(const auto& i : ctx.souffle_output) {
        const auto name = rule_mangle(i);
        if (!cg.count(name)) {
            cg.insert({name, {}});
        }
    }
    for(const auto& i : ctx.annotated_output) {
        const auto name = i.get_mangled_name();
        if (!cg.count(name)) {
            cg.insert({name, {}});
        }
    }

    // construct call graph by scanning the IR
    initialize_call_graph(ctx.rule_impls, cg);
    initialize_call_graph(ctx.database_get_table, cg);
    initialize_call_graph(ctx.schema_get_field, cg);
    initialize_call_graph(ctx.schema_data_constraint_impls, cg);

    return cg;
}

}