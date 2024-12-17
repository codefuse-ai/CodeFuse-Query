#pragma once

#include "godel-frontend/src/ir/lir.h"
#include "godel-frontend/src/ir/ir_context.h"
#include "godel-frontend/src/ir/pass.h"
#include "godel-frontend/src/ir/call_graph.h"

#include <cstring>
#include <sstream>
#include <vector>

namespace godel {

class unused_remove_pass: public pass {
private:
    class used_finder {
    private:
        callee_dict used;

    public:
        const callee_dict& apply(const ir_context&);
    };

private:
    void remove_unused_schema_data_constraint_decl(const callee_dict&);
    void remove_unused_schema_data_constraint_impl(const callee_dict&);
    void remove_unused_schema_get_field(const callee_dict&);
    void remove_unused_rule_decl(const callee_dict&);
    void remove_unused_rule_impl(const callee_dict&);
    void remove_unused_input_decl(const callee_dict&);
    void remove_unused_input_impl(const callee_dict&);
    void remove_unused_annotated_input(const callee_dict&);
    void remove_unused_database_get_table(const callee_dict&);

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