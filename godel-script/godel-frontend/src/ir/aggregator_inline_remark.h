#pragma once

#include "godel-frontend/src/ir/pass.h"

#include <sstream>
#include <string>
#include <unordered_set>

namespace godel {

class aggregator_inline_remark: public pass {
private:
    std::unordered_set<std::string> inline_rules;
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