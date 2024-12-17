#pragma once

#include "godel-frontend/src/error/error.h"
#include "godel-frontend/src/package/package.h"
#include "cli.h"
#include "lexer.h"
#include "parse.h"
#include "semantic.h"

#include <unordered_map>
#include <iostream>
#include <sstream>
#include <fstream>
#include <cstring>

namespace godel {

namespace souffle_engine {

// souffle main C API
extern "C" int souffle_main(int argc, char** argv);

// souffle program entry used by godel
// program_path        : program path(aka argv[0]), Soufflé use this path
//                     : to find library and header files
// query_file          : query file path
// query_content       : [default nullptr] query content, if not null,
//                     : souffle does not read the query file
// fact_search_path    : [default nullptr] fact file search path
// library_search_path : [default nullptr] library search path
// library_name        : [default nullptr] library name
// enable_warning      : enable warning, 1 for enabled, 0 for disabled
// verbose             : use verbose info
// extra_args          : [default nullptr] extra arguments, array ends with nullptr
extern "C" int souffle_entry(const char* program_path,
                             const char* query_file,
                             const char* query_content,
                             const char* fact_search_path,
                             const char* library_search_path,
                             const char* library_name,
                             int enable_warning,
                             int verbose,
                             const char* extra_args[]);

}

using report::error;
using report::span;
using package::godel_module;

struct profile_data {
    double lexical_analysis_time = -1;
    double syntax_parse_time = -1;
    double semantic_analysis_time = -1;
    double total_time = -1;

    void dump(const std::string& file_name) const {
        std::clog << util::format_time(total_time);
        std::clog << " analyse <" << file_name << ">\n";
        std::clog << util::format_time(lexical_analysis_time);
        std::clog << " lexical analysis\n";
        std::clog << util::format_time(syntax_parse_time);
        std::clog << " syntax parse\n";
        std::clog << util::format_time(semantic_analysis_time);
        std::clog << " semantic analysis\n\n";
    }
};

class engine {
private:
    error err;
    lexer lexical_analyser;
    parse syntax_parser;
    semantic semantic_analyser;

    // store compiled file name
    std::string this_file_name;

    // data for profiling module compilation
    profile_data prof;

    // location of import statement
    span import_location;

    // flag mark execution terminated
    bool flag_execution_terminated = false;

private:
    std::string dump_json_token() const;
    std::string dump_json_comment() const;
    std::string dump_json_basic() const;
    std::string dump_json_enum() const;
    std::string dump_json_schema() const;
    std::string dump_json_database() const;
    std::string dump_json_trait() const;
    std::string dump_json_fn() const;
    std::string dump_json_query() const;
    std::string dump_json_package() const;
    std::string dump_json_local() const;
    std::string dump_json_infer() const;
    std::string dump_json_used_files() const;
    void dump_json_only_schema_without_loc(std::ostream&) const;
    void dump_json(std::ostream&) const;
    void dump_used_modules() const;
    bool language_server_dump(const configure&);

private:
    void scan_package_root(const std::string&, bool);
    void do_lexical_analysis(const configure&);
    void do_syntax_analysis(const configure&);
    void do_semantic_analysis(const configure&);
    void ast_structure_dump();
    void template_extract();

private:
    // run souffle code from source file
    void run_souffle_from_file(const configure&);
    // run generated souffle code
    void run_souffle_from_generated(const configure&);
    void run_souffle(const std::string&, const configure&);

public:
    const auto& name_space() const { return semantic_analyser.get_context().this_name_space; }
    const auto& mapper() const { return semantic_analyser.get_context().mapper; }
    const auto& global() const { return semantic_analyser.get_context().global; }
    const auto& get_profiling_data() const { return prof; }

public:
    engine(): lexical_analyser(err),
              syntax_parser(err),
              semantic_analyser(err),
              this_file_name(""),
              import_location(span::null()) {}
    void set_import_location(const span& loc) { import_location = loc; }
    const error& run(const configure&);
};

}