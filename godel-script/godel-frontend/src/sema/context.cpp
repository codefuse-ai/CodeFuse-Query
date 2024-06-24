#include "godel-frontend/src/sema/context.h"

namespace godel {

bool context::find_global(const std::string& short_name) const {
    return this_name_space.count(short_name)!=0 ||
           global.get_native().count(short_name)!=0 ||
           global.get_basics().count(short_name)!=0 ||
           global.get_packages().count(short_name)!=0;
}

symbol_kind context::find_global_kind(const std::string& short_name) const {
    if (this_name_space.count(short_name)) {
        return this_name_space.at(short_name);
    }
    if (global.get_basics().count(short_name)) {
        return symbol_kind::basic;
    }
    if (global.get_native().count(short_name)) {
        return symbol_kind::function;
    }
    if (global.get_packages().count(short_name)) {
        return symbol_kind::package;
    }
    return symbol_kind::null;
}

span context::find_global_location(const std::string& short_name) const {
    return mapper.count(short_name)
        ? global.get_location(mapper.at(short_name))
        : span::null();
}

bool context::is_data_type(const std::string& short_name) const {
    // check basic type
    if (global.get_basics().count(short_name)) {
        return true;
    }

    // check if undefined
    if (!this_name_space.count(short_name)) {
        return false;
    }

    // check if is enum, schema or db type
    const auto type = this_name_space.at(short_name);
    return type==symbol_kind::enumerate ||
           type==symbol_kind::schema ||
           type==symbol_kind::database;
}

bool context::check_full_path_type_imported(report::error& err,
                                            const type_def* node) const {
    const auto& full_path_name = node->get_full_name();
    const auto index = global.get_index(full_path_name);
    if (index==global_symbol_table::npos) {
        err.err(node->get_location(),
            "undefined symbol \"" + full_path_name + "\"."
        );
        return false;
    }
    if (!imported_full_path_symbol_mapper.count(full_path_name)) {
        err.err(node->get_location(),
            "\"" + full_path_name + "\" is not imported."
        );
        return false;
    }
    return true;
}

void context::report_conflict_symbol(report::error& err,
                                     const span& location,
                                     const std::string& symbol_name) {
    if (!confliction.count(symbol_name)) {
        return;
    }

    // generate conflict symbols
    const auto& vec = confliction.at(symbol_name);
    auto info = std::string("");
    for(const auto& sym : vec) {
        info += sym.full_path_name() + ", ";
    }
    if (info.length()) {
        info = info.substr(0, info.length() - 2);
    }

    err.err(location,
        "\"" + symbol_name +
        "\" is ambiguous, with multiple symbols \"" +
        info + "\".",
        "consider using explicit import."
    );

    for(const auto& sym : vec) {
        err.warn(sym.type_loc, sym.full_path_name() + " is defined here.");
    }
}

}