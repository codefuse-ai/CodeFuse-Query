#include "godel-frontend/src/ir/reorder.h"
#include "godel-frontend/src/ir/call_graph.h"

#include <algorithm>

namespace godel {
namespace reorder {

void cost_analysis::tarjan(const std::string& node, const call_graph& cg) {
    // init visit time stamp
    DFN[node] = LOW[node] = ++index;

    // push stack
    in_stack[node] = true;
    Stap.push_back(node);

    // search next node
    for(const auto& succ : cg.at(node)) {
        if (!cg.count(succ)) {
            continue;
        }
        if (!DFN.at(succ)) {
            tarjan(succ, cg);
            LOW[node] = std::min(LOW[node], LOW[succ]);
        } else if (in_stack[succ]) {
            LOW[node] = std::min(LOW[node], DFN[succ]);
        }
    }
    if (DFN[node]==LOW[node]) {
        std::vector<std::string> res = {};

        // get result from stack
        auto top = std::string("");
        while(top!=node) {
            top = Stap.back();
            Stap.pop_back();
            in_stack[top] = false;
            res.push_back(top);
        }

        // get self-circle
        if (res.size()==1 && cg.at(node).count(node)) {
            in_circle_rule_set.insert(node);
        }
        // get strongly connected components
        if (res.size()>1) {
            for(const auto& i : res) {
                in_circle_rule_set.insert(i);
            }
        }
    }
}

void cost_analysis::solve_circle(const call_graph& cg) {
    Stap = {};
    index = 0;
    for(const auto& i : cg) {
        DFN[i.first] = 0;
        LOW[i.first] = 0;
        in_stack[i.first] = false;
    }
    for(const auto& i : cg) {
        if (!DFN.at(i.first)) {
            tarjan(i.first, cg);
        }
    }
}

void cost_analysis::topo_delete_leaf(
    const std::unordered_set<std::string>& set, call_graph& cg) {
    // delete scanned nodes
    for(const auto& i : set) {
        cg.erase(i);
    }
    // and delete references of these nodes
    for(auto& i : cg) {
        for(const auto& j : set) {
            if (i.second.count(j)) {
                i.second.erase(j);
            }
        }
    }
}

void cost_analysis::topo_scan(call_graph& copy) {
    topo_sort_result.push_back({});
    for(const auto& i : copy) {
        // reference list is empty
        if (i.second.empty()) {
            topo_sort_result.back().insert(i.first);
        }
        // in circle, self-circle also included
        if (i.second.size()) {
            bool flag_all_ref_in_circle = true;
            for(const auto& j : i.second) {
                if (!in_circle_rule_set.count(j)) {
                    flag_all_ref_in_circle = false;
                    break;
                }
            }
            if (flag_all_ref_in_circle) {
                topo_sort_result.back().insert(i.first);
            }
        }
    }
    // delete reference
    topo_delete_leaf(topo_sort_result.back(), copy);
}

void cost_analysis::topo_sort(const call_graph& cg) {
    // detect self-circle and circle using tarjan algorithm.
    solve_circle(cg);

    // init leaf node
    topo_sort_result = {{}};
    // leaf node include all kinds of input rules
    for(const auto& i : ctx->annotated_input) {
        topo_sort_result.back().insert(i.get_mangled_name());
    }
    for(const auto& i : ctx->input_impls) {
        topo_sort_result.back().insert(i.get_mangled_name());
    }
    // all_data_DBIndex is generated automatically, so we add it here
    topo_sort_result.back().insert("all_data_DBIndex");

    // do a copy of call graph
    auto copy = cg;

    // delete native functions like: key_eq, key_neq
    // otherwise topological sort will loop forever
    // because these native functions will never be found in the call graph
    for(auto& i : copy) {
        std::unordered_set<std::string> need_delete;
        for(auto& j : i.second) {
            if (!mapper.count(j) && j!="all_data_DBIndex") {
                need_delete.insert(j);
            }
        }
        for(const auto& j : need_delete) {
            i.second.erase(j);
        }
    }

    // delete initialized leaves
    topo_delete_leaf(topo_sort_result.back(), copy);

    while(copy.size()) {
        topo_scan(copy);
        if (topo_sort_result.back().empty()) {
            // should be unreachable, but it may encounter an error
            // if logic is changed in future changes
            // so we add this branch for defence
            break;
        }
    }
}

void cost_analysis::visit_store(lir::store* node) {
    auto res = 0;
    if (node->get_source().kind==lir::inst_value_kind::variable) {
        res += var_grounded.count(node->get_source().content)? 0:1;
        // source of store is not always grounded
    }
    if (node->get_target().kind==lir::inst_value_kind::variable) {
        res += var_grounded.count(node->get_target().content)? 0:1;
        // target is grounded if source is grounded
        if (var_grounded.count(node->get_source().content)) {
            add_var_grounded(node->get_target().content);
        }
    }
    block_cost_frame.back() *= res;
}

void cost_analysis::visit_call(lir::call* node) {
    // do not analyse intrinsic functions
    switch(node->get_func_kind()) {
        case lir::call::kind::database_load:
        case lir::call::kind::find:
        case lir::call::kind::key_cmp:
        case lir::call::kind::to_set:
        case lir::call::kind::basic_method:
        case lir::call::kind::basic_static: return;
        default: break;
    }

    const auto name = node->get_mangled_name();
    if (rule_cost.count(name)) {
        block_cost_frame.back() *= rule_cost.at(name);
    }

    // check if argument is grounded
    auto res = 0;
    for(const auto& i : node->get_arguments()) {
        if (i.kind!=lir::inst_value_kind::variable) {
            continue;
        }
        res += var_grounded.count(i.content)? 0:1;
        add_var_grounded(i.content);
    }
    block_cost_frame.back() *= res;

    // rules in circle have more cost
    if (in_circle_rule_set.count(name)) {
        block_cost_frame.back() *= 2;
    }
}

void cost_analysis::visit_constructor(lir::constructor* node) {
    const auto name = node->get_mangled_name();
    if (rule_cost.count(name)) {
        block_cost_frame.back() *= rule_cost.at(name);
    }

    // check if argument is grounded
    auto res = 0;
    for(const auto& i : node->get_fields()) {
        if (i.kind!=lir::inst_value_kind::variable) {
            continue;
        }
        res += var_grounded.count(i.content)? 0:1;
        add_var_grounded(i.content);
    }
    block_cost_frame.back() *= res;

    // rules in circle have more cost
    if (in_circle_rule_set.count(name)) {
        block_cost_frame.back() *= 2;
    }
}

void cost_analysis::visit_record(lir::record* node) {
    // check if argument is grounded
    // if fact variables used in record must be grounded
    auto res = 0;
    for(const auto& i : node->get_fields()) {
        if (i.kind!=lir::inst_value_kind::variable) {
            continue;
        }
        res += var_grounded.count(i.content)? 0:1;
        // variable used in record is a variable-call
        // so we do not add it to var_grounded
    }

    add_var_grounded(node->get_result().content);
    block_cost_frame.back() *= res;
}

void cost_analysis::visit_unary(lir::unary* node) {
    auto res = 0;
    if (node->get_source().kind==lir::inst_value_kind::variable) {
        res += var_grounded.count(node->get_source().content)? 0:1;
    }
    if (node->get_target().kind==lir::inst_value_kind::variable) {
        res += var_grounded.count(node->get_target().content)? 0:1;
        add_var_grounded(node->get_target().content);
    }
    block_cost_frame.back() *= res;
}

void cost_analysis::visit_binary(lir::binary* node) {
    auto res = 0;
    if (node->get_left().kind==lir::inst_value_kind::variable) {
        res += var_grounded.count(node->get_left().content)? 0:1;
    }
    if (node->get_right().kind==lir::inst_value_kind::variable) {
        res += var_grounded.count(node->get_right().content)? 0:1;
    }
    if (node->get_target().kind==lir::inst_value_kind::variable) {
        res += var_grounded.count(node->get_target().content)? 0:1;
        add_var_grounded(node->get_target().content);
    }
    block_cost_frame.back() *= res;
}

void cost_analysis::visit_compare(lir::compare* node) {
    auto res = 0;
    if (node->get_left().kind==lir::inst_value_kind::variable) {
        res += var_grounded.count(node->get_left().content)? 0:1;
        add_var_grounded(node->get_left().content);
    }
    if (node->get_right().kind==lir::inst_value_kind::variable) {
        res += var_grounded.count(node->get_right().content)? 0:1;
    }
    block_cost_frame.back() *= res;
}

void cost_analysis::visit_block(lir::block* node) {
    push_var_frame();

    for(auto i : node->get_content()) {
        block_cost_frame.push_back(1);
        i->accept(this);

        // use `,` means `and`, otherwise means `or`
        // use cost::operator* if in `and` block
        // use cost::operator+ if in `or` block
        auto res = block_cost_frame.back();
        block_cost_frame.pop_back();
        if (node->get_use_comma()) {
            block_cost_frame.back() *= res;
        } else {
            block_cost_frame.back() += res;
        }
    }

    pop_var_frame();
}

void cost_analysis::visit_fact(lir::fact* node) {
    block_cost_frame.back() += node->get_pairs().size();
}

void cost_analysis::visit_not_operand(lir::not_operand* node) {
    // push new cost frame
    block_cost_frame.push_back(1);
    // push new var frame
    push_var_frame();

    node->get_body()->accept(this);

    // get cost frame result
    const auto res = block_cost_frame.back();
    block_cost_frame.pop_back();
    // pop var frame
    pop_var_frame();

    block_cost_frame.back() *= res;
}

void cost_analysis::visit_and_operand(lir::and_operand* node) {
    // push new cost frame
    block_cost_frame.push_back(1);
    // push new var frame
    push_var_frame();

    node->get_left_block()->accept(this);

    // get cost frame result
    const auto res_left = block_cost_frame.back();
    block_cost_frame.pop_back();
    // pop var frame
    pop_var_frame();

    // push new cost frame
    block_cost_frame.push_back(1);
    // push new var frame
    push_var_frame();

    node->get_right_block()->accept(this);

    // get cost frame result
    const auto res_right = block_cost_frame.back();
    block_cost_frame.pop_back();
    // pop var frame
    pop_var_frame();

    block_cost_frame.back() *= res_left * res_right;
}

void cost_analysis::visit_or_operand(lir::or_operand* node) {
    // push new cost frame
    block_cost_frame.push_back(1);
    // push new var frame
    push_var_frame();

    node->get_left_block()->accept(this);

    // get cost frame result
    const auto res_left = block_cost_frame.back();
    block_cost_frame.pop_back();
    // pop var frame
    pop_var_frame();

    // push new cost frame
    block_cost_frame.push_back(1);
    // push new var frame
    push_var_frame();

    node->get_right_block()->accept(this);

    // get cost frame result
    const auto res_right = block_cost_frame.back();
    block_cost_frame.pop_back();
    // pop var frame
    pop_var_frame();

    block_cost_frame.back() *= res_left + res_right;
}

void cost_analysis::visit_aggregator(lir::aggregator* node) {
    // push new var frame
    push_var_frame();

    node->get_body()->accept(this);

    // pop var frame
    pop_var_frame();

    block_cost_frame.back() *= 1;
}

std::unordered_map<std::string, size_t> cost_analysis::run() {
    // init rule name -> impl* mapper
    mapper.clear();
    for(auto i : ctx->rule_impls) {
        mapper[i->get_mangled_name()].push_back(i);
    }
    for(auto i : ctx->database_get_table) {
        mapper[i->get_mangled_name()].push_back(i);
    }
    for(auto i : ctx->schema_get_field) {
        mapper[i->get_mangled_name()].push_back(i);
    }
    for(auto i : ctx->schema_data_constraint_impls) {
        mapper[i->get_mangled_name()].push_back(i);
    }

    // toposort
    call_graph_generator cgg;
    const auto& cg = cgg.apply(*ctx);
    topo_sort(cg);

    // calculate cost
    rule_cost = {};
    for(const auto& level : topo_sort_result) {
        for(const auto& i : level) {
            // input rules & database constraints' cost should be initialized
            if (!mapper.count(i) && !rule_cost.count(i)) {
                rule_cost[i] = (i=="all_data_DBIndex"? 1:100);
            }
            if (mapper.count(i) && !rule_cost.count(i)) {
                rule_cost[i] = 0;
                for(const auto& j : mapper.at(i)) {
                    // push new cost frame
                    block_cost_frame.push_back(1);

                    // do calculation
                    j->get_block()->accept(this);

                    // get cost result
                    rule_cost[i] += block_cost_frame.back();
                    block_cost_frame.pop_back();
                }
            }
        }
    }

    std::unordered_map<std::string, size_t> cost_map;
    for(const auto& i : rule_cost) {
        cost_map.insert({i.first, i.second.num});
    }

    return cost_map;
}

}

void join_reorder::visit_block(lir::block* node) {
    // use semicolon means this is `or statement`, so we don't need to reorder
    if (node->get_use_semicolon()) {
        for(auto i : node->get_content()) {
            i->accept(this);
        }
        return;
    }

    // temp is used to store the insts which don't need to be reordered
    std::vector<lir::inst*> temp;
    // store the rules or constructors which need to be reordered
    std::vector<std::pair<std::string, lir::inst*>> need_reorder_inst;

    // find rules or constructors which need to be reordered
    // and push them to need_reorder_inst
    for(auto i : node->get_content()) {
        if (i->get_kind()==lir::inst_kind::inst_call) {
            auto call = reinterpret_cast<lir::call*>(i);
            const auto name = call->get_mangled_name();
            if (cost_map.count(name) && cost_map.at(name)>3000) {
                need_reorder_inst.push_back({name, i});
            } else if (name.find("__all__")!=std::string::npos) {
                need_reorder_inst.push_back({name, i});
            } else {
                temp.push_back(i);
            }
        } else if (i->get_kind()==lir::inst_kind::inst_ctor) {
            auto ctor = reinterpret_cast<lir::constructor*>(i);
            const auto name = ctor->get_mangled_name();
            if (cost_map.count(name) && cost_map.at(name)>3000) {
                need_reorder_inst.push_back({name, i});
            } else if (name.find("__all__")!=std::string::npos) {
                need_reorder_inst.push_back({name, i});
            } else {
                temp.push_back(i);
            }
        } else {
            temp.push_back(i);
        }
        i->accept(this);
    }

    // TODO: algorithem should be rewritten later
    // sort with costs, but this is not a good way of reordering
    // because rules's cost is not only based on the cost of the rule
    // but also based on the natural joins
    // if the natural joins are not reordered, the cost of the rules
    // will be higher than before.
    std::sort(need_reorder_inst.begin(), need_reorder_inst.end(),
        [&](const auto& a, const auto& b) {
            return cost_map.at(a.first) < cost_map.at(b.first);
        }
    );

    node->get_mutable_content().clear();
    for(auto i : temp) {
        node->add_new_content(i);
    }
    for(auto& i : need_reorder_inst) {
        node->add_new_content(i.second);
    }
}

bool join_reorder::run() {
    cost_map = reorder::cost_analysis(ctx).run();
    // for(const auto& i : cost_map) {
    //     if (i.second < 3000) {
    //         continue;
    //     }
    //     std::cout << i.first << " " << i.second << "\n";
    // }
    for(auto i : ctx->rule_impls) {
        i->get_block()->accept(this);
    }
    for(auto i : ctx->database_get_table) {
        i->get_block()->accept(this);
    }
    for(auto i : ctx->schema_get_field) {
        i->get_block()->accept(this);
    }
    for(auto i : ctx->schema_data_constraint_impls) {
        i->get_block()->accept(this);
    }
    return true;
}

}
