#include "godel-frontend/src/ir/inst_combine.h"

#include <iostream>

namespace godel {

void inst_combine_pass::visit_store(lir::store* s) {
    const auto& src = s->get_source();
    const auto& tgt = s->get_target();

    // record this case:
    //
    // (
    //   ssa_temp_0 = a,
    //   b = ssa_temp_1,
    //   call(ssa_temp_2, ssa_temp_0, ssa_temp_1)
    // )
    //
    // and optimize this case to:
    //
    // (call(ssa_temp_2, a, b))
    //
    if (tgt.kind==lir::inst_value_kind::variable &&
        src.kind==lir::inst_value_kind::variable) {
        variable_reference_graph[tgt.content].insert({src.content, s});
        variable_reference_graph[src.content].insert({tgt.content, s});
    }

    // record this case:
    //
    // (
    //   ssa_temp_0 = 1,
    //   ssa_temp_1 = 2,
    //   call(ssa_temp_2, ssa_temp_0, ssa_temp_1)
    // )
    //
    // and optimize this case to:
    //
    // (call(ssa_temp_2, 1, 2))
    //
    if (tgt.kind==lir::inst_value_kind::variable &&
        src.kind==lir::inst_value_kind::literal) {
        variable_reference_graph[tgt.content].insert({src.content, s});
    }
}

void inst_combine_pass::visit_compare(lir::compare* c) {
    if (c->get_operator()!=lir::compare::kind::op_eq) {
        return;
    }

    const auto& left = c->get_left();
    const auto& right = c->get_right();

    // record this case:
    //
    // (
    //   call(ssa_temp_0, ...),
    //   ssa_temp_0 = a
    // )
    //
    // and optimize this case to:
    //
    // (call(a, ...))
    //
    if (left.kind==lir::inst_value_kind::variable &&
        right.kind==lir::inst_value_kind::variable) {
        variable_reference_graph[left.content].insert({right.content, c});
        variable_reference_graph[right.content].insert({left.content, c});
    }

    // record this case:
    //
    // (
    //   call(ssa_temp_0, ...),
    //   ssa_temp_0 = 1234567890
    // )
    //
    // and optimize this case to:
    //
    // (call(1234567890, ...))
    //
    if (left.kind==lir::inst_value_kind::variable &&
        right.kind==lir::inst_value_kind::literal) {
        variable_reference_graph[left.content].insert({right.content, c});
    }
}

bool inst_combine_pass::run() {
    for (auto impl : ctx->rule_impls) {
        run_on_single_impl(impl);
    }
    for (auto impl : ctx->database_get_table) {
        run_on_single_impl(impl);
    }
    for (auto impl : ctx->schema_get_field) {
        run_on_single_impl(impl);
    }
    for (auto impl : ctx->schema_data_constraint_impls) {
        run_on_single_impl(impl);
    }
    return true;
}

void inst_combine_pass::run_on_single_impl(souffle_rule_impl* b) {
    auto worker = inst_elimination_worker();
    size_t pass_run_count = 0;
    const size_t max_pass_run_count = 16;
    scan(b);
    worker.copy(b);
    ++ pass_run_count;
    while (worker.get_eliminated_count() && pass_run_count < max_pass_run_count) {
        scan(b);
        worker.copy(b);
        ++ pass_run_count;
    }
}

void inst_combine_pass::scan(souffle_rule_impl* b) {
    variable_reference_graph.clear();
    b->get_block()->accept(this);
    if (variable_reference_graph.empty()) {
        return;
    }

    // delete circle in reference graph:
    //
    //   ssa_temp_0 <--> ssa_temp_1
    //
    // we need to delete one of them, only rest one is enough.
    //
    //   ssa_temp_0 ---> ssa_temp_1
    //
    // for example:
    //
    //   get_field_coref__java__File_element_hash_id(ssa_temp_0, f),
    //   rule_coref__java__Location__getFileHashId(ssa_temp_1, self),
    //   ssa_temp_0 = ssa_temp_1
    //
    // this circle will mark ssa_temp_0 and ssa_temp_1,
    // and then we will remove ssa_temp_0 and ssa_temp_1 and change the code to:
    //
    //   get_field_coref__java__File_element_hash_id(ssa_temp_1, f),
    //                                               ^^^^^^^^^|
    //   rule_coref__java__Location__getFileHashId(ssa_temp_0, self)
    //                                             ^^^^^^^^^|
    //
    // 0 and 1 swap their place, and cause unexpected behavior.
    // by removing the circle and reserve only one edge, the result is correct:
    //
    //   get_field_coref__java__File_element_hash_id(ssa_temp_0, f),
    //   rule_coref__java__Location__getFileHashId(ssa_temp_0, self)
    //
    for(const auto& i : variable_reference_graph) {
        const auto& name = i.first;
        // if alias variables' count > 1, even if there's a circle, still skip it.
        if (i.second.size() != 1) {
            continue;
        }
        // alias variable's name
        const auto& to = i.second.begin()->first;
        if (!variable_reference_graph.count(to)) {
            continue;
        }
        // this variable's alias count should be 1
        if (variable_reference_graph.at(to).size() != 1) {
            continue;
        }
        // get `to`'s alias variable's name, this name should be equal to `name`
        const auto& from = variable_reference_graph.at(to).begin()->first;
        // means there's a circle like this:
        //   `to` <--> `from`(aka `name`)
        // after clear(), `to`'s alias count should be 0:
        //   `to` <--- `from`(aka `name`)
        if (from == name && to.find("ssa_temp") == 0 && from.find("ssa_temp") == 0) {
            variable_reference_graph.at(to).clear();
        }
    }

    combine_worker(variable_reference_graph).mark(b);
}

void combine_worker::visit_call(lir::call* node) {
    // change result destination
    if (is_single_ref_ssa_temp(node->get_mutable_result().content)) {
        const auto& ref = get_single_ref(node->get_mutable_result().content);
        node->get_mutable_result().content = ref.first;
        ref.second->set_flag_eliminated(true);
    }
    // change argument list
    for(auto& i : node->get_mutable_arguments()) {
        if (is_single_ref_ssa_temp(i.content)) {
            const auto& ref = get_single_ref(i.content);
            i.content = ref.first;
            ref.second->set_flag_eliminated(true);
        }
    }
}

void combine_worker::visit_constructor(lir::constructor* node) {
    // change result destination
    // temporary variable with `ssa_temp` prefix
    if (is_single_ref_ssa_temp(node->get_mutable_result().content)) {
        const auto& ref = get_single_ref(node->get_mutable_result().content);
        node->get_mutable_result().content = ref.first;
        ref.second->set_flag_eliminated(true);
    }
    // change argument list
    for(auto& i : node->get_mutable_fields()) {
        if (is_single_ref_ssa_temp(i.content)) {
            const auto& ref = get_single_ref(i.content);
            i.content = ref.first;
            ref.second->set_flag_eliminated(true);
        }
    }
}

void combine_worker::visit_record(lir::record* node) {
    // change result destination
    // temporary variable with `ssa_temp` prefix
    if (is_single_ref_ssa_temp(node->get_mutable_result().content)) {
        const auto& ref = get_single_ref(node->get_mutable_result().content);
        node->get_mutable_result().content = ref.first;
        ref.second->set_flag_eliminated(true);
    }
    // change argument list
    for(auto& i : node->get_mutable_fields()) {
        if (is_single_ref_ssa_temp(i.content)) {
            const auto& ref = get_single_ref(i.content);
            i.content = ref.first;
            ref.second->set_flag_eliminated(true);
        }
    }
}

void combine_worker::visit_unary(lir::unary* node) {
    const auto& tgt = node->get_target();
    if (is_single_ref_ssa_temp(tgt.content)) {
        const auto& ref = get_single_ref(tgt.content);
        node->get_mutable_target().content = ref.first;
        ref.second->set_flag_eliminated(true);
    }
}

void combine_worker::visit_binary(lir::binary* node) {
    const auto& tgt = node->get_target();
    if (is_single_ref_ssa_temp(tgt.content)) {
        const auto& ref = get_single_ref(tgt.content);
        node->get_mutable_target().content = ref.first;
        ref.second->set_flag_eliminated(true);
    }
}

void combine_worker::visit_aggregator(lir::aggregator* node) {
    const auto& tgt = node->get_target();
    if (is_single_ref_ssa_temp(tgt.content)) {
        const auto& ref = get_single_ref(tgt.content);
        node->get_mutable_target().content = ref.first;
        ref.second->set_flag_eliminated(true);
    }
}

void combine_worker::mark(souffle_rule_impl* b) {
    b->get_block()->accept(this);
}

void inst_elimination_worker::visit_block(lir::block* node) {
    if (node->get_use_comma()) {
        blk.back()->set_use_comma();
    }
    if (node->get_use_semicolon()) {
        blk.back()->set_use_semicolon();
    }

    for(auto i : node->get_content()) {
        // skip eliminated instruction
        if (i->get_flag_eliminated()) {
            ++ eliminated_count;
            continue;
        }

        if (i->get_kind()!=lir::inst_kind::inst_block) {
            i->accept(this);
            continue;
        }

        auto new_blk = new lir::block(i->get_location());
        blk.back()->add_new_content(new_blk);
        blk.push_back(new_blk);
        i->accept(this);
        blk.pop_back();
    }
}

void inst_elimination_worker::visit_not_operand(lir::not_operand* node) {
    auto new_not = new lir::not_operand(node->get_location());
    auto new_blk = new lir::block(node->get_body()->get_location());
    new_not->set_body(new_blk);
    blk.back()->add_new_content(new_not);

    blk.push_back(new_blk);
    node->get_body()->accept(this);
    blk.pop_back();
}

void inst_elimination_worker::visit_and_operand(lir::and_operand* node) {
    auto new_and = new lir::and_operand(node->get_location());
    auto new_left = new lir::block(node->get_left_block()->get_location());
    auto new_right = new lir::block(node->get_right_block()->get_location());
    new_and->set_left(new_left);
    new_and->set_right(new_right);
    blk.back()->add_new_content(new_and);

    blk.push_back(new_left);
    node->get_left_block()->accept(this);
    blk.pop_back();

    blk.push_back(new_right);
    node->get_right_block()->accept(this);
    blk.pop_back();
}

void inst_elimination_worker::visit_or_operand(lir::or_operand* node) {
    auto new_and = new lir::or_operand(node->get_location());
    auto new_left = new lir::block(node->get_left_block()->get_location());
    auto new_right = new lir::block(node->get_right_block()->get_location());
    new_and->set_left(new_left);
    new_and->set_right(new_right);
    blk.back()->add_new_content(new_and);

    blk.push_back(new_left);
    node->get_left_block()->accept(this);
    blk.pop_back();

    blk.push_back(new_right);
    node->get_right_block()->accept(this);
    blk.pop_back();
}

void inst_elimination_worker::visit_aggregator(lir::aggregator* node) {
    auto new_aggr = new lir::aggregator(*node);
    auto new_blk = new lir::block(node->get_body()->get_location());
    new_aggr->set_body(new_blk);
    blk.back()->add_new_content(new_aggr);

    blk.push_back(new_blk);
    node->get_body()->accept(this);
    blk.pop_back();
}

void inst_elimination_worker::copy(souffle_rule_impl* impl) {
    eliminated_count = 0;
    blk.clear();
    auto impl_blk = new lir::block(impl->get_block()->get_location());

    blk.push_back(impl_blk);
    impl->get_block()->accept(this);
    blk.pop_back();

    if (impl_blk->get_use_comma()) {
        impl->get_block()->set_use_comma();
    }
    if (impl_blk->get_use_semicolon()) {
        impl->get_block()->set_use_semicolon();
    }
    impl->get_block()->get_mutable_content().swap(impl_blk->get_mutable_content());
    delete impl_blk;
}

void replace_find_call::visit_block(lir::block* node) {
    bool has_find_call = false;
    for (auto i : node->get_content()) {
        if (i->get_kind() != lir::inst_kind::inst_call) {
            continue;
        }
        auto call = reinterpret_cast<lir::call*>(i);
        if (call->get_func_kind() == lir::call::kind::find &&
            call->get_function_name() == "find") {
            has_find_call = true;
            break;
        }
    }

    if (has_find_call) {
        std::vector<lir::inst*> new_content;
        for (auto i : node->get_content()) {
            if (i->get_kind() != lir::inst_kind::inst_call) {
                new_content.push_back(i);
                continue;
            }

            auto call = reinterpret_cast<lir::call*>(i);
            if (call->get_func_kind() != lir::call::kind::find ||
                call->get_function_name() != "find") {
                new_content.push_back(i);
                continue;
            }

            auto dst = call->get_return();
            auto arg0 = call->get_arguments()[0];
            auto arg1 = call->get_arguments()[1];
            auto new_block = new lir::block(call->get_location());
            new_block->set_use_comma();
            new_content.push_back(new_block);

            new_block->add_new_content(new lir::store(arg0, dst, call->get_location()));
            new_block->add_new_content(new lir::store(arg1, arg0, call->get_location()));

            delete i;
        }
        node->get_mutable_content().swap(new_content);
    } else {
        for (auto i : node->get_content()) {
            i->accept(this);
        }
    }
}

bool replace_find_call::run() {
    for (auto impl : ctx->rule_impls) {
        impl->get_block()->accept(this);
    }
    for (auto impl : ctx->database_get_table) {
        impl->get_block()->accept(this);
    }
    for (auto impl : ctx->schema_get_field) {
        impl->get_block()->accept(this);
    }
    for (auto impl : ctx->schema_data_constraint_impls) {
        impl->get_block()->accept(this);
    }
    return true;
}

}