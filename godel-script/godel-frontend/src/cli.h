#pragma once

#include <cstring>
#include <sstream>
#include <vector>
#include <unordered_map>

namespace godel {
namespace cli {

enum class option {
    cli_executable_path,   // executable path of godel
    cli_input_path,        // input(to be analysed) file path
    cli_package_path,      // library directory path
    cli_fact_path,         // fact data path(directory)
    cli_extract_template,  // extract template
    cli_extract_location,  // extract location
    cli_run_souffle,       // generate souffle and run
    cli_dump_souffle_file, // generate souffle and dump

    /* information dump */
    cli_help,          // get help
    cli_verbose,       // verbose output information
    cli_version,       // get version
    cli_used_module,   // get used modules
    cli_dump_ast,      // abstract syntax tree dump
    cli_color_off,     // switch ast dump color mode off
    cli_dump_semantic, // get godel frontend dump
    cli_dump_resolve,  // show resolved ast
    cli_dump_global,   // get global symbol information
    cli_dump_local,    // get local variables' information

    /* language server */
    cli_dump_lsp,              // get godel frontend json dump
    cli_dump_lsp_file_indexed, // use indexed file name in json dump
    cli_dump_lsp_only_schema,  // only dump schema

    /* lexer */
    cli_lexer_dump_token,   // dump tokens
    cli_lexer_dump_comment, // dump comments

    /* semantic analysis */
    cli_semantic_only,      // only do semantic analysis and exit
    cli_semantic_pub_check, // switch pub-access check on

    /* optimization */
    cli_enable_for_opt,             // switch for optimization on
    cli_enable_let_opt,             // switch let optimization on
    cli_enable_ir_merge,            // switch ir merge on
    cli_enable_self_constraint_opt, // switch self constraint optimization on
    cli_enable_join_reorder,        // switch join reorder optimization on
    cli_disable_remove_unused,      // switch unused method deletion off
    cli_disable_do_schema_opt,      // switch do schema optimization off
    cli_souffle_debug_dump,         // switch souffle debug mode on
    cli_souffle_slow_transformers,  // switch souffle slow transformers on
    cli_enable_souffle_profiling,   // switch souffle profiling on

    /* souffle cache */
    cli_enable_souffle_cache, // switch souffle cache on
    cli_clean_souffle_cache,  // switch clean souffle cache on

    /* souffle output redirection */
    cli_souffle_json_output,        // switch souffle json output on
    cli_souffle_csv_output,         // switch souffle csv output on
    cli_souffle_sqlite_output,      // switch souffle sqlite output on

    /* directly run souffle */
    cli_directly_run_souffle, // run souffle directly

    /* special debug info */
    cli_show_real_cmd_args
};

struct info_setting {
    option command_type;
    std::string error_info;
};

const std::unordered_map<std::string, info_setting> settings = {
    {"--package-path", {option::cli_package_path, "package root path"}},
    {"-p",             {option::cli_package_path, "package root path"}},
    {"--location-extract", {option::cli_extract_location, "location file output path"}},
    {"-l",                 {option::cli_extract_location, "location file output path"}},
    {"--souffle", {option::cli_dump_souffle_file, "souffle dump output path"}},
    {"-s",        {option::cli_dump_souffle_file, "souffle dump output path"}},
    {"--fact", {option::cli_fact_path, "souffle fact path"}},
    {"-f",     {option::cli_fact_path, "souffle fact path"}},
    {"--output-json", {option::cli_souffle_json_output, "souffle json output path"}},
    {"--output-csv", {option::cli_souffle_csv_output, "souffle csv output path"}},
    {"--output-sqlite", {option::cli_souffle_sqlite_output, "souffle sqlite output path"}}
};

const std::unordered_map<std::string, option> options = {
    {"--help", option::cli_help},
    {"-h",     option::cli_help},
    {"--verbose", option::cli_verbose},
    {"-v",        option::cli_verbose},
    {"--version", option::cli_version},
    {"-V",        option::cli_version},
    {"--run", option::cli_run_souffle},
    {"-r",    option::cli_run_souffle},
    {"--used-module", option::cli_used_module},
    {"-u",            option::cli_used_module},
    {"--dump", option::cli_dump_ast},
    {"-d",     option::cli_dump_ast},
    {"--extract-template", option::cli_extract_template},
    {"-e",                 option::cli_extract_template},
    {"--dump-sema", option::cli_dump_semantic},
    {"--dump-resolve", option::cli_dump_resolve},
    {"--dump-global", option::cli_dump_global},
    {"--dump-local", option::cli_dump_local},
    {"--dump-lsp", option::cli_dump_lsp},
    {"--lsp-dump-use-indexed-file", option::cli_dump_lsp_file_indexed},
    {"--lsp-dump-only-schema", option::cli_dump_lsp_only_schema},
    {"--color-off", option::cli_color_off},
    {"--lexer-dump-token", option::cli_lexer_dump_token},
    {"--lexer-dump-comment", option::cli_lexer_dump_comment},
    {"--semantic-only", option::cli_semantic_only},
    {"--semantic-pub-check", option::cli_semantic_pub_check},
    {"--opt-for", option::cli_enable_for_opt},
    {"-Of", option::cli_enable_for_opt},
    {"--opt-let", option::cli_enable_let_opt},
    {"-Ol", option::cli_enable_let_opt},
    {"--opt-ir-merge", option::cli_enable_ir_merge},
    {"-Oim", option::cli_enable_ir_merge},
    {"--opt-self-constraint", option::cli_enable_self_constraint_opt},
    {"-Osc", option::cli_enable_self_constraint_opt},
    {"--opt-join-reorder", option::cli_enable_join_reorder},
    {"-Ojr", option::cli_enable_join_reorder},
    {"--disable-remove-unused", option::cli_disable_remove_unused},
    {"--disable-do-schema-opt", option::cli_disable_do_schema_opt},
    {"--souffle-debug", option::cli_souffle_debug_dump},
    {"--souffle-slow-transformers", option::cli_souffle_slow_transformers},
    {"--enable-souffle-profiling", option::cli_enable_souffle_profiling},
    {"--enable-souffle-cache", option::cli_enable_souffle_cache},
    {"--clean-souffle-cache", option::cli_clean_souffle_cache},
    {"-Drs", option::cli_directly_run_souffle},
    {"--directly-run-souffle", option::cli_directly_run_souffle},
    {"-###", option::cli_show_real_cmd_args}
};

const std::unordered_map<std::string, std::vector<option>> multi_options = {
    {"-O1", {option::cli_enable_for_opt}},
    {"-O2", {option::cli_enable_for_opt,
             option::cli_enable_self_constraint_opt,
             option::cli_enable_ir_merge}},
    {"-O3", {option::cli_enable_for_opt,
             option::cli_enable_self_constraint_opt,
             option::cli_enable_ir_merge,
             option::cli_enable_join_reorder}}
};

typedef std::unordered_map<option, std::string> configure;

std::ostream& welcome(std::ostream&);
std::ostream& version(std::ostream&);
std::ostream& help(std::ostream&);
void report_invalid_argument(const std::string&);
void dump_configure(const configure&);
configure process_args(const std::vector<std::string>&);

}
}
