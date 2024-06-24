#include "godel-frontend/src/ir/flatten_block.h"

namespace godel {

void flatten_nested_block::visit_block(lir::block* node) {
    if (node->get_use_comma()) {
        blk.back()->set_use_comma();
    }
    if (node->get_use_semicolon()) {
        blk.back()->set_use_semicolon();
    }

    for(auto i : node->get_content()) {
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

    flatten_block();
}

void flatten_nested_block::visit_not_operand(lir::not_operand* node) {
    auto new_not = new lir::not_operand(node->get_location());
    auto new_blk = new lir::block(node->get_body()->get_location());
    new_not->set_body(new_blk);
    blk.back()->add_new_content(new_not);

    blk.push_back(new_blk);
    node->get_body()->accept(this);
    blk.pop_back();
}

void flatten_nested_block::visit_and_operand(lir::and_operand* node) {
    // do lowering if the two operands are blocks using `,` as the separator
    // and we flatten them into a single block, replacing this and_operand node
    if (node->get_left_block()->get_use_comma() &&
        node->get_right_block()->get_use_comma()) {
        flatten_and_operand(node);
        return;
    }

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

void flatten_nested_block::visit_or_operand(lir::or_operand* node) {
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

void flatten_nested_block::visit_aggregator(lir::aggregator* node) {
    auto new_aggr = new lir::aggregator(*node);
    auto new_blk = new lir::block(node->get_body()->get_location());
    new_aggr->set_body(new_blk);
    blk.back()->add_new_content(new_aggr);

    blk.push_back(new_blk);
    node->get_body()->accept(this);
    blk.pop_back();
}

void flatten_nested_block::flatten_block() {
    if (blk.back()->get_content().size()==1 &&
        blk.back()->get_content().front()->get_kind()==lir::inst_kind::inst_block) {
        auto nested = reinterpret_cast<lir::block*>(blk.back()->get_content().front());
        blk.back()->get_mutable_content() = nested->get_content();
        if (nested->get_use_comma()) {
            blk.back()->set_use_comma();
        }
        if (nested->get_use_semicolon()) {
            blk.back()->set_use_semicolon();
        }
        
        nested->get_mutable_content().clear();
        delete nested;
    }
    if (!blk.back()->get_use_comma()) {
        return;
    }

    std::vector<lir::inst*> flat_content;
    for(auto i : blk.back()->get_content()) {
        if (i->get_kind()!=lir::inst_kind::inst_block) {
            flat_content.push_back(i);
            continue;
        }

        // merge block which uses the same separator
        auto tmp = reinterpret_cast<lir::block*>(i);
        if (!tmp->get_use_comma()) {
            flat_content.push_back(i);
            continue;
        }
        for(auto j : tmp->get_content()) {
            flat_content.push_back(j);
        }

        // clear content to avoid double free
        tmp->get_mutable_content().clear();
        delete tmp;
    }

    // replace content
    blk.back()->get_mutable_content() = flat_content;
}

void flatten_nested_block::flatten_and_operand(lir::and_operand* node) {
    // and operand is translated as:
    //
    // (left, left), (right, right)
    //
    // if left and right block all use `,` as the separator, then we can
    // flatten it into a single block
    //
    // (left, left), (right, right) => (left, left, right, right)
    //
    auto new_and = new lir::block(node->get_location());
    blk.back()->add_new_content(new_and);

    blk.push_back(new_and);
    node->get_left_block()->accept(this);
    node->get_right_block()->accept(this);
    blk.pop_back();
}

void flatten_nested_block::copy(souffle_rule_impl* impl) {
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

bool flatten_nested_block::run() {
    for(auto impl : ctx->rule_impls) {
        copy(impl);
    }
    for(auto impl : ctx->database_get_table) {
        copy(impl);
    }
    for(auto impl : ctx->schema_get_field) {
        copy(impl);
    }
    for(auto impl : ctx->schema_data_constraint_impls) {
        copy(impl);
    }
    return true;
}

}