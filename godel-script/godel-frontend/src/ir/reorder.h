#pragma once

#include "godel-frontend/src/ir/lir.h"
#include "godel-frontend/src/ir/ir_context.h"
#include "godel-frontend/src/ir/pass.h"
#include "godel-frontend/src/ir/call_graph.h"

#include <unordered_map>

namespace godel {
namespace reorder {

// cost type, for rule cost calculation
struct cost {
private:
    static size_t quick_multiply(size_t a, size_t b) {
        size_t res = 0;
        while(b) {
            if (b & 1) {
                size_t tmp = res + a;
                if (tmp < std::max(res, a)) {
                    return SIZE_MAX;
                }
                res = tmp;
            }
            a <<= 1;
            b >>= 1;
        }
        return res;
    }

public:
    size_t num;

    cost(size_t n = 0): num(n) {}

    // * is in fact get sum value
    // if overflow, use the max value to mark as INF
    cost operator*(const cost& other) const {
        return cost { quick_multiply(num, other.num) };
    }

    // + is in fact get max value
    cost operator+(const cost& other) const {
        const size_t res = num + other.num;
        if (res < std::max(num, other.num)) {
            return cost { SIZE_MAX };
        }
        return cost { res };
    }

    cost& operator*=(const cost& other) {
        *this = *this * other;
        return *this;
    }

    cost& operator+=(const cost& other) {
        *this = *this + other;
        return *this;
    }
};

class cost_analysis: public lir::inst_visitor {
// check rule call circle before doing topological sort
private:
    std::unordered_set<std::string> in_circle_rule_set;

    std::unordered_map<std::string, size_t> DFN;
    std::unordered_map<std::string, size_t> LOW;
    std::unordered_map<std::string, bool> in_stack;
    size_t index;
    std::vector<std::string> Stap;
    void tarjan(const std::string&, const call_graph&);
    void solve_circle(const call_graph&);

// do topological sort
private:
    std::vector<std::unordered_set<std::string>> topo_sort_result;

    void topo_delete_leaf(const std::unordered_set<std::string>&, call_graph&);
    void topo_scan(call_graph&);
    void topo_sort(const call_graph&);

// rule cost calculation
private:
    std::unordered_map<std::string, std::vector<souffle_rule_impl*>> mapper;
    std::unordered_map<std::string, cost> rule_cost;
    std::vector<cost> block_cost_frame;

    // need to check variable grounding
    // if rules call with some already grounded variables
    // these variables will do natural join instead of join
    // this will affect the cost calculation
    // so we need to record the variable that has been grounded
    std::unordered_set<std::string> var_grounded;
    std::vector<std::unordered_set<std::string>> var_grounded_frame;
    void push_var_frame() { var_grounded_frame.push_back({}); }
    void add_var_grounded(const std::string& var) {
        if (var_grounded.count(var)) {
            return;
        }
        var_grounded.insert(var);
        var_grounded_frame.back().insert(var);
    }
    void pop_var_frame() {
        for(const auto& i : var_grounded_frame.back()) {
            var_grounded.erase(i);
        }
        var_grounded_frame.pop_back();    
    }

private:
    void visit_store(lir::store*) override;
    void visit_call(lir::call*) override;
    void visit_constructor(lir::constructor*) override;
    void visit_record(lir::record*) override;
    void visit_unary(lir::unary*) override;
    void visit_binary(lir::binary*) override;
    void visit_compare(lir::compare*) override;
    void visit_block(lir::block*) override;
    void visit_fact(lir::fact*) override;
    void visit_not_operand(lir::not_operand*) override;
    void visit_and_operand(lir::and_operand*) override;
    void visit_or_operand(lir::or_operand*) override;
    void visit_aggregator(lir::aggregator*) override;

private:
    ir_context* ctx;

public:
    cost_analysis(ir_context* c): ctx(c) {}
    std::unordered_map<std::string, size_t> run();
};

}

// reorder join order pass, used to optimize execution time
class join_reorder: public pass {
private:
    std::unordered_map<std::string, size_t> cost_map;

private:
    void visit_block(lir::block*) override;

public:
    join_reorder(ir_context& c): pass(pass_kind::ps_join_reorder, c) {}
    const char* get_name() const override {
        return "[Transform] Join Reorder";
    }
    bool run() override;
};

}
