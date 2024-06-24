#include "godel-frontend/src/error/error.h"
#include "godel-frontend/src/util/util.h"
#include "godel-frontend/src/cli.h"
#include "godel-frontend/src/engine.h"

#include <iostream>

int main(int argc, const char* argv[]) {
    if (argc == 1) {
        std::clog << godel::cli::welcome;
        return 0;
    }

    const auto config = godel::cli::process_args({argv, argv + argc});
    const auto error_count = godel::engine().run(config).get_error();
    return error_count? -1:0;
}