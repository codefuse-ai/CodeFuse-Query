#pragma once

#include "godel-frontend/src/error/error.h"
#include "godel-frontend/src/symbol.h"
#include "godel-frontend/src/ast/ast_node.h"
#include "godel-frontend/src/ast/decl.h"

#include <cstring>
#include <sstream>
#include <unordered_map>
#include <unordered_set>
#include <vector>
#include <cstdint>

namespace godel {

struct context {
    // total global symbol table
    static inline global_symbol_table global = {};

    // store this file name
    std::string this_file_name;

    // store imported symbol (full path like: coref::java::Class) and unique index
    std::unordered_map<std::string, uint64_t> imported_full_path_symbol_mapper;

    // store global symbol(including imported) and their unique index, not full path
    std::unordered_map<std::string, uint64_t> mapper;

    // store global symbol used in this scope(including imported) and their type, not full path
    std::unordered_map<std::string, symbol_kind> this_name_space;

    // store all the global functions' & methods' full path
    std::unordered_map<std::string, symbol> output_used_functions;

    // store conflict symbol
    std::unordered_map<std::string, std::vector<symbol>> confliction;

    // store variable names that should not be used
    const std::unordered_set<std::string> invalid_variable_name = {
        "Self", "self", "count", "sum", "output",
        "input", "max", "min"
    };

public:
    // constructor
    context():
        this_file_name(""), imported_full_path_symbol_mapper({}),
        mapper({}), this_name_space({}), output_used_functions({}) {
        global.init_basics();
        global.init_natives();
        global.init_packages();
    }
    // find if global symbol exists by short name
    bool find_global(const std::string&) const;
    // find global symbol's type by short name, if not found, return symbol_kind::null
    symbol_kind find_global_kind(const std::string&) const;
    // find global symbol's location by short name, if not found, return null location
    span find_global_location(const std::string&) const;
    // find if a symbol (short name) has type except function
    bool is_data_type(const std::string&) const;
    // find if a full path symbol is imported
    bool check_full_path_type_imported(report::error&, const type_def*) const;
    // report symbol(short name) has multiple full path import symbol choices
    void report_conflict_symbol(report::error&, const span&, const std::string&);
};

}