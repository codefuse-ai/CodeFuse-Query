#pragma once

#include "godel-frontend/src/ir/pass.h"

#include <sstream>
#include <string>
#include <unordered_map>
#include <unordered_set>

namespace godel {

// Soufflé does not allow inline predicates used in aggregators.
// This pass will add a remark to the predicates to indicate that
// they should not be inlined.
// And after this pass these predicates' inline attribute will be
// set to false.
class aggregator_inline_remark: public pass {
private:
    std::unordered_map<std::string, souffle_rule_decl*> inline_rules;
    std::unordered_set<std::string> need_remark;
    bool in_aggregator = false;

private:
    void visit_call(lir::call*) override;
    void visit_aggregator(lir::aggregator*) override;

public:
    aggregator_inline_remark(ir_context& c):
        pass(pass_kind::ps_aggregator_inline_remark, c) {}
    const char* get_name() const override {
        return "[Transform] Aggregator Inline Remark";
    }
    bool run() override;
};

}