#include "godel-frontend/src/sema/global_symbol_loader.h"

namespace godel {

void global_symbol_loader::register_symbol(
    const span& location, const std::string& name, symbol_kind kind) {
    // get namespace
    auto& space = ctx->global.get_domain(ctx->this_file_name);
    // generate module name, if length is zero, this is the main entry file
    auto module_name = package::godel_module::instance()->find_module_by_file(ctx->this_file_name);
    if (module_name.length()) {
        module_name += "::";
    }
    // load to main file's namespace
    const auto full_path_name = module_name + name;

    // load this name to this file's namespace
    ctx->this_name_space.insert({name, kind});
    // register this name and type to the type mapper of this namespace
    space.type_mapper.insert({name, kind});

    // regist in global symbol table
    ctx->global.regist(ctx->this_file_name, full_path_name, kind);
    ctx->mapper.insert({name, ctx->global.get_index(full_path_name)});

    switch(kind) {
        case symbol_kind::enumerate:
            space.enums[name].name = name;
            space.enums[name].location = location;
            break;
        case symbol_kind::database:
            space.databases[name].name = name;
            space.databases[name].location = location;
            break;
        case symbol_kind::function:
            space.functions[name].name = name;
            space.functions[name].location = location;
            break;
        case symbol_kind::schema:
            space.schemas[name].name = name;
            space.schemas[name].location = location;
            break;
        case symbol_kind::query:
            space.queries[name].name = name;
            space.queries[name].location = location;
            break;
        default: break;
    }
}

bool global_symbol_loader::check_name_valid(identifier* name_node) const {
    const auto& name = name_node->get_name();
    // check if this symbol is reserved
    if (name=="Self" || name=="self") {
        err->err(name_node->get_location(), "cannot use reserved name.");
        return false;
    }

    // check if this symbol is in natives
    if (ctx->global.get_native().count(name)) {
        std::stringstream ss;
        ss << ctx->global.get_native().at(name);
        err->err(name_node->get_location(),
            "\"" + name + "\" conflicts with native function \"" +
            ss.str() + "\"",
            "consider another name."
        );
        return false;
    }

    // check if this symbol is reserved
    if (ctx->global.get_reserved_id().count(name)) {
        err->err(name_node->get_location(),
            "this symbol name is reserved.",
            "consider another name."
        );
        return false;
    }

    // check redefinition
    if (ctx->find_global(name)) {
        const auto type = ctx->find_global_kind(name);
        const auto location = ctx->find_global_location(name);
        auto info = (type!=symbol_kind::basic &&
                     type!=symbol_kind::package &&
                     type!=symbol_kind::null)?
                     location.file +
                     ":" + std::to_string(location.start_line) +
                     ":" + std::to_string(location.start_column + 1) : "";
        err->err(name_node->get_location(),
            "redefinition of \"" + name + "\".",
            (info.length()?
                "first defined at " + info + ".":
                (type==symbol_kind::basic?
                    "this is a basic type.":"this is a package."
                )
            )
        );
        return false;
    }
    return true;
}

bool global_symbol_loader::visit_database_decl(database_decl* node) {
    auto name_node = node->get_name();
    const auto& name = name_node->get_name();
    if (check_name_valid(name_node)) {
        register_symbol(name_node->get_location(), name, symbol_kind::database);
    }
    return true;
}

bool global_symbol_loader::visit_schema_decl(schema_decl* node) {
    auto name_node = node->get_name();
    const auto& name = name_node->get_name();
    if (check_name_valid(name_node)) {
        register_symbol(name_node->get_location(), name, symbol_kind::schema);
    }
    return true;
}

bool global_symbol_loader::visit_function_decl(function_decl* node) {
    auto name_node = node->get_name();
    const auto& name = name_node->get_name();
    if (check_name_valid(name_node)) {
        register_symbol(name_node->get_location(), name, symbol_kind::function);
    }
    return true;
}

bool global_symbol_loader::visit_enum_decl(enum_decl* node) {
    auto name_node = node->get_name();
    const auto& name = name_node->get_name();
    if (check_name_valid(name_node)) {
        register_symbol(name_node->get_location(), name, symbol_kind::enumerate);
    }
    return true;
}

bool global_symbol_loader::visit_impl_block([[maybe_unused]] impl_block* node) {
    // avoid scanning function declarations in impl block
    return true;
}

bool global_symbol_loader::visit_query_decl(query_decl* node) {
    auto name_node = node->get_name();
    const auto& name = name_node->get_name();
    if (check_name_valid(name_node)) {
        register_symbol(name_node->get_location(), name, symbol_kind::query);
    }
    return true;
}

void global_symbol_loader::scan(ast_root* root) {
    // create new namespace, if created, return false, so do not load symbol again
    if (!ctx->global.create_new_domain(ctx->this_file_name)) {
        return;
    }
    // scan all declarations
    for(auto i : root->get_declarations()) {
        i->accept(this);
    }
    // check main function, global symbol named "main" must be function
    if (ctx->find_global("main") &&
        ctx->find_global_kind("main")!=symbol_kind::function) {
        err->err(ctx->find_global_location("main"), "main must be a function.");
    }
}

}