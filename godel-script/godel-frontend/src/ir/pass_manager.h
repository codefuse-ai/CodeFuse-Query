#pragma once

#include "godel-frontend/src/ir/pass.h"
#include "godel-frontend/src/cli.h"
#include "godel-frontend/src/error/error.h"

namespace godel {

class pass_manager {
private:
    report::error err;
    std::vector<pass*> ordered_pass_list;

public:
    pass_manager() = default;
    pass_manager(pass_manager&&) = delete;
    ~pass_manager();
    void run(ir_context&, const cli::configure&);
};

}