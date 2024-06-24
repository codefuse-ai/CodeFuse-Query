#pragma once

#include "godel-frontend/src/error/error.h"
#include "godel-frontend/src/ir/ir_context.h"

#include <cstring>
#include <sstream>
#include <unordered_map>

namespace godel {

enum class pass_kind {
    ps_remove_unused,
    ps_remove_unused_type,
    ps_inst_combine,
    ps_flatten_nested_block,
    ps_aggregator_inline_remark
};

// there are three types of passes:
//
// - Analysis: analyse and report possible errors
// - Transform: perform optimizations or rewrite IR
// - Utility: provide extra functionality
//
class pass: public lir::inst_visitor {
protected:
    pass_kind kind;
    report::error err;
    ir_context* ctx;

public:
    pass(pass_kind k, ir_context& c): kind(k), ctx(&c) {}
    virtual ~pass() = default;

public:
    auto get_kind() const { return kind; }
    virtual const char* get_name() const = 0;
    virtual bool run() = 0;
};

}