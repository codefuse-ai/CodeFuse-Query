#pragma once

#include "godel-frontend/src/ir/lir.h"
#include "godel-frontend/src/ir/ir_context.h"
#include "godel-frontend/src/ir/pass.h"

#include <cstring>
#include <sstream>
#include <vector>
#include <queue>
#include <unordered_set>

namespace godel {

typedef std::unordered_set<std::string> used_dict;
typedef std::unordered_map<std::string, used_dict> call_graph;

class call_graph_generator {
private:
    used_dict used;

private:
    void check_inst(lir::inst*, std::queue<lir::block*>&, used_dict&) const;
    void scan_call(souffle_rule_impl*, used_dict&) const;
    void initialize_call_graph_root(const std::vector<std::string>&,
                                    call_graph&) const;
    void initialize_call_graph_root(const std::vector<souffle_annotated_file_output>&,
                                    call_graph&) const;
    void initialize_call_graph(const std::vector<souffle_rule_impl*>&,
                               call_graph&) const;

public:
    const used_dict& apply(const ir_context&);
};

class unused_remove_pass: public pass {
private:
    void remove_unused_schema_data_constraint_decl(const used_dict&);
    void remove_unused_schema_data_constraint_impl(const used_dict&);
    void remove_unused_schema_get_field(const used_dict&);
    void remove_unused_rule_decl(const used_dict&);
    void remove_unused_rule_impl(const used_dict&);
    void remove_unused_input_decl(const used_dict&);
    void remove_unused_input_impl(const used_dict&);
    void remove_unused_annotated_input(const used_dict&);
    void remove_unused_database_get_table(const used_dict&);

public:
    unused_remove_pass(ir_context& c): pass(pass_kind::ps_remove_unused, c) {}
    const char* get_name() const override {
        return "[Transform] Remove Unused Rule";
    }
    bool run() override;
};

class unused_type_alias_remove_pass: public pass {
public:
    unused_type_alias_remove_pass(ir_context& c):
        pass(pass_kind::ps_remove_unused_type, c) {}
    const char* get_name() const override {
        return "[Transform] Remove Unused Type Alias";
    }
    bool run() override;
};

}