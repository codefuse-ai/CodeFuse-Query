#pragma once

#include "godel-frontend/src/ir/pass.h"

#include <vector>

namespace godel {

class flatten_nested_block: public pass {
private:
    std::vector<lir::block*> blk;

private:
    void visit_boolean(lir::boolean* node) override {
        blk.back()->add_new_content(new lir::boolean(*node));
    }
    void visit_store(lir::store* node) override {
        blk.back()->add_new_content(new lir::store(*node));
    }
    void visit_call(lir::call* node) override {
        blk.back()->add_new_content(new lir::call(*node));
    }
    void visit_constructor(lir::constructor* node) override {
        blk.back()->add_new_content(new lir::constructor(*node));
    }
    void visit_record(lir::record* node) override {
        blk.back()->add_new_content(new lir::record(*node));
    }
    void visit_unary(lir::unary* node) override {
        blk.back()->add_new_content(new lir::unary(*node));
    }
    void visit_binary(lir::binary* node) override {
        blk.back()->add_new_content(new lir::binary(*node));
    }
    void visit_compare(lir::compare* node) override {
        blk.back()->add_new_content(new lir::compare(*node));
    }
    void visit_block(lir::block*) override;
    void visit_fact(lir::fact* node) override {
        blk.back()->add_new_content(new lir::fact(*node));
    }
    void visit_not_operand(lir::not_operand*) override;
    void visit_and_operand(lir::and_operand*) override;
    void visit_or_operand(lir::or_operand*) override;
    void visit_aggregator(lir::aggregator*) override;

private:
    void flatten_block();
    void flatten_and_operand(lir::and_operand*);

private:
    void copy(souffle_rule_impl*);

public:
    flatten_nested_block(ir_context& c):
        pass(pass_kind::ps_flatten_nested_block, c) {}
    const char* get_name() const override {
        return "[Transform] Flatten Nested Block";
    }
    bool run() override;
};

}