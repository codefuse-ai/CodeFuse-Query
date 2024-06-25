#include "godel-frontend/src/ir/pass_manager.h"
#include "godel-frontend/src/ir/inst_combine.h"
#include "godel-frontend/src/ir/remove_unused.h"
#include "godel-frontend/src/ir/flatten_block.h"
#include "godel-frontend/src/ir/aggregator_inline_remark.h"

namespace godel {

pass_manager::~pass_manager() {
    for(auto p : ordered_pass_list) {
        delete p;
    }
}

void pass_manager::run(ir_context& ctx, const cli::configure& conf) {
    // load all needed passes by running order
    // because transform pass may change the IR
    // and the next pass may use the changed IR
    //
    // [analyse] -> [transform] -> [transform] -> [analyse] -> [transform]
    //
    // so be aware of the order of passes
    ordered_pass_list = {};
    if (!conf.count(cli::option::cli_disable_remove_unused)) {
        ordered_pass_list.push_back(new unused_remove_pass(ctx));
        ordered_pass_list.push_back(new unused_type_alias_remove_pass(ctx));
    }
    if (conf.count(cli::option::cli_enable_ir_merge)) {
        ordered_pass_list.push_back(new inst_combine_pass(ctx));
    }
    ordered_pass_list.push_back(new flatten_nested_block(ctx));
    ordered_pass_list.push_back(new aggregator_inline_remark(ctx));

    bool verbose_info = conf.count(cli::option::cli_verbose);

    // must run in order, stop on first failure
    for(auto p : ordered_pass_list) {
        // print info
        if (verbose_info) {
            std::clog << "IR Pass Running: ";
            std::clog << p->get_name() << "\n";
        }

        // run pass
        if (!p->run()) {
            err.err("failed to run pass: " + std::string(p->get_name()));
            break;
        }
    }

    if (verbose_info) {
        std::clog << "\n";
    }
}

}