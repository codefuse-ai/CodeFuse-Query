#include "godel-frontend/src/sema/symbol_import.h"
#include "godel-frontend/src/package/package.h"
#include "godel-frontend/src/engine.h"

namespace godel {

using package::godel_module;

void symbol_import::add_conflict_symbol(const std::string& module_path,
                                        const std::string& name) {
    // get type location which already exists
    const auto& exist_type_loc = ctx->find_global_location(name);
    // get type location which will be conflicted
    const auto index = ctx->global.get_index(module_path + "::" + name);
    const auto& conflict_type_loc = ctx->global.get_location(index);

    // if location is the same, do not load this symbol
    if (exist_type_loc.file == conflict_type_loc.file) {
        return;
    }

    if (!ctx->confliction.count(name)) {
        ctx->confliction.insert({name, {}});
    }

    bool has_exist_type = false, has_conflict_type = false;
    auto& vec = ctx->confliction.at(name);
    for(const auto& exist_symbol : vec) {
        if (exist_symbol.type_loc.file == exist_type_loc.file) {
            has_exist_type = true;
        }
        if (exist_symbol.type_loc.file == conflict_type_loc.file) {
            has_conflict_type = true;
        }
    }

    if (!has_exist_type) {
        vec.push_back({.type_name = name, .type_loc = exist_type_loc});
    }
    if (!has_conflict_type) {
        vec.push_back({.type_name = name, .type_loc = conflict_type_loc});
    }
}

configure symbol_import::inherit_config(const std::string& filename) {
    configure new_config = {
        {option::cli_input_path, filename},
        {option::cli_semantic_only, ""} // only needs semantic analysis
    };

    // load the module's config
    static const std::vector<option> need_copy = {
        // executable path, for souffle arguments
        option::cli_executable_path,
        // semantic check options
        option::cli_semantic_no_else,
        option::cli_semantic_pub_check,
        // verbose info dump
        option::cli_verbose,
        // souffle codegen and optimization options
        option::cli_enable_for_opt,
        option::cli_enable_let_opt,
        option::cli_enable_self_constraint_opt,
        option::cli_disable_do_schema_opt,
        // souffle file dump/execute options
        option::cli_dump_souffle_file,
        option::cli_souffle_debug_dump,
        option::cli_run_souffle,
        // souffle redirect output
        option::cli_souffle_json_output,
        option::cli_souffle_csv_output,
        option::cli_souffle_sqlite_output
    };

    // copy all needed options from current config
    for(const auto opt : need_copy) {
        if (compile_config->count(opt)) {
            new_config.insert({opt, compile_config->at(opt)});
        }
    }

    return new_config;
}

void symbol_import::analyse_import_module(const std::string& module_path,
                                          const std::string& filename,
                                          const span& import_location) {
    // mark module as analysing
    godel_module::instance()->mark_analysing(module_path);

    // create engine and inherited config
    auto eng = std::unique_ptr<engine>(new engine);
    const auto new_config = inherit_config(filename);

    // if error occurred when analyzing, program exists directly
    eng->set_import_location(import_location);
    if (eng->run(new_config).get_error()) {
        err->err(import_location,
            "error occurred when analysing module <" + module_path + ">.",
            "module analysis terminated."
        );
        return;
    }

    // mark module as analysed
    godel_module::instance()->mark_analysed(module_path);

    // output profiling result when "verbose" option is chosen
    if (compile_config->count(option::cli_verbose)) {
        eng->get_profiling_data().dump("module:" + module_path);
    }
}

void symbol_import::check_use_stmt(use_stmt* node) {
    // generate format module path
    auto module_path = std::string("");
    for(auto path_node : node->get_path()) {
        module_path += path_node->get_name();
        if (path_node!=node->get_path().back()) {
            module_path += "::";
        }
    }

    if (!module_path.length()) {
        err->warn(node->get_location(),
            "invalid import path",
            "maybe need \"::*\"?"
        );
        return;
    }

    // convert format module path to real file path
    auto filename = godel_module::instance()->find_file_by_module_path(module_path);
    if (!filename.length()) {
        err->err(node->get_location(),
            "cannot find module <" + module_path + ">.",
            "use command \"--package-path {library directory}\"."
        );
        return;
    }

    // check if this module is analysed before
    if (godel_module::instance()->get_status(module_path)==
        godel_module::module_status::analysing) {
        err->err(node->get_location(),
            "module <" + module_path + "> is not totally analysed.",
            "maybe have self-reference."
        );
        return;
    }

    // scan module if not analysed
    if (godel_module::instance()->get_status(module_path)==
        godel_module::module_status::unused) {
        analyse_import_module(module_path, filename, node->get_location());
        // error occurred, terminate analysis
        if (err->get_error()) {
            return;
        }
    }

    // module namespace
    const auto& space = ctx->global.get_domain(filename);
    if (space.functions.count("main")) {
        err->err(node->get_location(), "library cannot have main function.");
    }
    if (node->is_use_all()) {
        import_all_symbol(space, module_path);
    } else {
        import_explicit_symbol(node->get_multi_use(), space, module_path);
    }
}

void symbol_import::import_all_symbol(const domain& space,
                                      const std::string& module_path) {
    // import all symbol recorded in type_mapper to this scope
    for (const auto& i : space.type_mapper) {
        const auto& simple_path = i.first;
        const auto full_path = module_path + "::" + simple_path;
        const auto index = ctx->global.get_index(full_path);
        ctx->imported_full_path_symbol_mapper.insert({full_path, index});
        // symbol already exists. add it to conflict list. do not load.
        if (ctx->this_name_space.count(simple_path)) {
            add_conflict_symbol(module_path, simple_path);
            continue;
        }
        // symbol not exists. add it to this scope.
        ctx->this_name_space.insert(i);
        ctx->mapper.insert({simple_path, index});
    }
}

void symbol_import::import_explicit_symbol(multi_use_stmt* node,
                                           const domain& space,
                                           const std::string& module_path) {
    // check if explicit symbols exist
    std::vector<std::string> import_symbol_list;
    for(const auto symbol_node : node->get_import_symbol()) {
        const auto& simple_path = symbol_node->get_name();
        const auto full_path_name = module_path + "::" + simple_path;
        if (ctx->global.exist(full_path_name)) {
            import_symbol_list.push_back(simple_path);
            continue;
        }
        err->err(symbol_node->get_location(),
            "\"" + full_path_name + "\" does not exist.",
            "maybe you mean \"" + module_path + "::" +
            space.fuzzy_search(simple_path) + "\"?"
        );
    }

    // import explicit symbol to this scope
    for (const auto& simple_path : import_symbol_list) {
        const auto full_path_name = module_path + "::" + simple_path;
        const auto index = ctx->global.get_index(full_path_name);
        ctx->imported_full_path_symbol_mapper.insert({full_path_name, index});
        // symbol already exists. add it to conflict list. do not load.
        if (ctx->this_name_space.count(simple_path)) {
            add_conflict_symbol(module_path, simple_path);
            continue;
        }
        // symbol not exists. add it to this scope.
        ctx->this_name_space.insert({
            simple_path,
            space.get_kind_by_short_name(simple_path)
        });
        ctx->mapper.insert({simple_path, index});
    }
}

bool symbol_import::visit_use_stmt(use_stmt* node) {
    check_use_stmt(node);
    return true;
}

void symbol_import::scan(const configure* config, ast_root* root) {
    compile_config = config;
    for(auto child : root->get_use_statements()) {
        child->accept(this);
    }
}

}