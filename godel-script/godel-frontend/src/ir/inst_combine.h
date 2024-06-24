#pragma once

#include "godel-frontend/src/ir/lir.h"
#include "godel-frontend/src/ir/ir_context.h"
#include "godel-frontend/src/ir/pass.h"

#include <unordered_map>
#include <unordered_set>

namespace godel {

class inst_combine_pass: public pass {
public:
    typedef std::unordered_map<std::string,
        std::unordered_map<std::string, lir::inst*>> ref_graph;

private:
    ref_graph variable_reference_graph;

private:
    void visit_store(lir::store*) override;
    void visit_compare(lir::compare*) override;

private:
    void scan(souffle_rule_impl*);

public:
    inst_combine_pass(ir_context& c): pass(pass_kind::ps_inst_combine, c) {}
    const char* get_name() const override {
        return "[Transform] Instruction Combine";
    }
    bool run() override;
};

// replace optimized temporary variable and mark some instructions as `eliminated`
class combine_worker: public lir::inst_visitor {
private:
    const inst_combine_pass::ref_graph& vg;

public:
    // used to check if a variable is temporary ssa variable
    // and only referenced by one other variable(not ssa)
    bool is_single_ref_ssa_temp(const std::string& n) {
        return n.find("ssa_temp")==0 && vg.count(n) && vg.at(n).size() == 1;
    }
    const auto& get_single_ref(const std::string& n) const {
        return *vg.at(n).begin();
    }

private:
    void visit_call(lir::call*) override;
    void visit_constructor(lir::constructor*) override;
    void visit_record(lir::record*) override;
    void visit_unary(lir::unary*) override;
    void visit_binary(lir::binary*) override;

public:
    combine_worker(const inst_combine_pass::ref_graph& g): vg(g) {}
    void mark(souffle_rule_impl*);
};

// copy all the instructions, delete the `eliminated` instructions
// and flatten nested blocks/and operands
class inst_elimination_worker: public lir::inst_visitor {
private:
    std::vector<lir::block*> blk;

private:
    void visit_boolean(lir::boolean* node) override {
        // 1 = 1 is always true, there's no need to copy it
        if (node->get_flag()) {
            return;
        }
        blk.back()->add_new_content(new lir::boolean(*node));
    }
    void visit_store(lir::store* node) override {
        blk.back()->add_new_content(new lir::store(*node));
    }
    void visit_call(lir::call* node) override {
        // undetermined ungrounded temp variables not needed after combine pass
        if (node->get_function_name() == "int::__undetermined_all__" ||
            node->get_function_name() == "string::__undetermined_all__") {
            return;
        }
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

public:
    void copy(souffle_rule_impl*);
};

}