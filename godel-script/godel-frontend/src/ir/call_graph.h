#pragma once

#include "godel-frontend/src/ir/ir_context.h"
#include "godel-frontend/src/ir/lir.h"

#include <cstring>
#include <sstream>
#include <queue>
#include <unordered_set>
#include <unordered_map>

namespace godel {

typedef std::unordered_set<std::string> callee_dict;
typedef std::unordered_map<std::string, callee_dict> call_graph;

class call_graph_generator {
private:
    call_graph cg;

private:
    void scan_ir_call(lir::call*, callee_dict&) const;
    void scan_call(souffle_rule_impl*, callee_dict&) const;
    void initialize_call_graph(const std::vector<souffle_rule_impl*>&,
                               call_graph&) const;

public:
    const call_graph& apply(const ir_context&);
};

}