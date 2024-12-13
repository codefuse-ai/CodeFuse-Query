#include "godel-frontend/src/engine.h"
#include "godel-frontend/src/error/error.h"
#include "godel-frontend/src/util/util.h"
#include "godel-frontend/src/package/package.h"
#include "godel-frontend/src/ast/ast_dumper.h"
#include "godel-frontend/src/ast/template_extractor.h"

#include "godel-frontend/src/ir/ir_gen.h"

#include <iostream>
#include <cstring>
#include <fstream>
#include <sstream>
#include <unordered_map>
#include <chrono>
#include <filesystem>

namespace godel {

std::string engine::dump_json_token() const {
    std::string res = "[";
    for (const auto& i : lexical_analyser.result()) {
        if (i.type==tok::tok_id) {
            res += i.to_json() + ",";
        }
    }
    if (res.back()==',') {
        res.pop_back();
    }
    res += "]";
    return res;
}

std::string engine::dump_json_comment() const {
    std::string res = "[";
    for (const auto& i : lexical_analyser.extract_comments()) {
        res += i.to_json() + ",";
    }
    if (res.back()==',') {
        res.pop_back();
    }
    res += "]";
    return res;
}

std::string engine::dump_json_basic() const {
    std::string res = "\"basic\":[";
    for(const auto& i : global().get_basics()) {
        res += i.second.to_json() + ",";
    }
    if (res.back()==',') {
        res.pop_back();
    }
    res += "]";
    return res;
}

std::string engine::dump_json_enum() const {
    std::string res = "\"enum\":[";
    for(const auto& i : name_space()) {
        if (i.second!=symbol_kind::enumerate) {
            continue;
        }
        res += global().get_enum(mapper().at(i.first)).to_json() + ",";
    }
    if (res.back()==',') {
        res.pop_back();
    }
    res += "]";
    return res;
}

std::string engine::dump_json_schema() const {
    std::string res = "\"schema\":[";
    for(const auto& i : name_space()) {
        if (i.second!=symbol_kind::schema) {
            continue;
        }
        res += global().get_schema(mapper().at(i.first)).to_json() + ",";
    }
    if (res.back()==',') {
        res.pop_back();
    }
    res += "]";
    return res;
}

std::string engine::dump_json_database() const {
    std::string res = "\"database\":[";
    for(const auto& i : name_space()) {
        if (i.second!=symbol_kind::database) {
            continue;
        }
        res += global().get_database(mapper().at(i.first)).to_json() + ",";
    }
    if (res.back()==',') {
        res.pop_back();
    }
    res += "]";
    return res;
}

std::string engine::dump_json_trait() const {
    // FIXME: this is deprecated
    // but delete this will cause error in language server
    return "\"trait\":[]";
}

std::string engine::dump_json_fn() const {
    std::string res = "\"function\":[";
    for(const auto& i : name_space()) {
        if (i.second!=symbol_kind::function) {
            continue;
        }
        res += global().get_func(mapper().at(i.first)).to_json() + ",";
    }
    for(const auto& i : global().get_native()) {
        res += i.second.to_json() + ",";
    }
    for(const auto& i : global().get_aggregator()) {
        res += i.second.to_json() + ",";
    }
    if (res.back()==',') {
        res.pop_back();
    }
    res += "]";
    return res;
}

std::string engine::dump_json_query() const {
    std::string res = "\"query\":[";
    for(const auto& i : name_space()) {
        if (i.second!=symbol_kind::query) {
            continue;
        }
        res += global().get_query(mapper().at(i.first)).to_json() + ",";
    }
    if (res.back()==',') {
        res.pop_back();
    }
    res += "]";
    return res;
}

std::string engine::dump_json_package() const {
    std::string res = "\"package\":[";
    for(const auto& i : global().get_packages()) {
        res += "\"" + i.first + "\",";
    }
    if (res.back()==',') {
        res.pop_back();
    }
    res += "]";
    return res;
}

std::string engine::dump_json_local() const {
    std::string res = "[";
    for(const auto& record : global().get_locals()) {
        // avoid local symbols that are not in this file
        if (record.location.file != this_file_name) {
            continue;
        }
        // we do not need to output this local variable
        if (record.name=="self") {
            continue;
        }
        res += "{\"name\":\"" + record.name + "\",";
        res += "\"location\":" + record.location.to_json() + ",";
        res += "\"type\":" + record.type.to_json() + "},";
    }
    for(const auto& record : global().get_reserved_id()) {
        res += "{\"name\":\"" + record.first + "\",";
        res += "\"location\":" + record.second.location.to_json() + ",";
        res += "\"type\":" + record.second.to_json() + "},";
    }
    if (res.back() == ',') {
        res.pop_back();
    }
    return res + "]";
}

std::string engine::dump_json_infer() const {
    std::string res = "[";
    for(const auto& record : global().get_infers()) {
        // avoid unnecessary infers that are not in this file
        if (record.location.file != this_file_name) {
            continue;
        }
        res += "{\"location\":" + record.location.to_json() + ",";
        res += "\"type\":" + record.type.to_json() + "},";
    }
    if (res.back() == ',') {
        res.pop_back();
    }
    return res + "]";
}

std::string engine::dump_json_used_files() const {
    std::string res = "[";

    std::vector<std::string> used_files;
    used_files.resize(span::get_location_file_mapper().size());
    for(const auto& i : span::get_location_file_mapper()) {
        used_files[i.second] = i.first;
    }

    for(const auto& i : used_files) {
        res += "\"" + i + "\"";
        if (i!=used_files.back()) {
            res += ",";
        }
    }

    return res + "]";
}

void engine::dump_json_only_schema_without_loc(std::ostream& out) const {
    out << "{\"semantic\":{\"schema\":[";
    std::string res = "";
    for(const auto& i : name_space()) {
        if (i.second!=symbol_kind::schema) {
            continue;
        }
        res += global().get_schema(mapper().at(i.first)).to_json(false);
        res += ",";
    }
    if (res.back()==',') {
        res.pop_back();
    }
    out << res;
    out << "]}}";
}

void engine::dump_json(std::ostream& out) const {
    out << "{";

    out << "\"semantic\":{";
    out << dump_json_basic() << ",";
    out << dump_json_enum() << ",";
    out << dump_json_database() << ",";
    out << dump_json_schema() << ",";

    // FIXME: this is deprecated, but cannot be moved now
    // if moved, language server will fail
    out << dump_json_trait() << ",";

    out << dump_json_fn() << ",";
    out << dump_json_query() << ",";
    out << dump_json_package() << "},";

    out << "\"tokens\":";
    out << dump_json_token() << ",";
    out << "\"comments\":";
    out << dump_json_comment() << ",";
    out << "\"locals\":";
    out << dump_json_local() << ",";
    out << "\"infers\":";
    out << dump_json_infer() << ",";
    out << "\"files\":";
    out << dump_json_used_files();

    out << "}";
}

void engine::dump_used_modules() const {
    const auto instance = godel_module::instance();
    for(const auto& i : instance->get_all_module_status()) {
        if (i.second!=godel_module::module_status::analysed) {
            continue;
        }
        std::cout << i.first << " ";
        std::cout << instance->find_file_by_module_path(i.first) << "\n";
    }
}

bool engine::language_server_dump(const configure& config) {
    if (!config.count(option::cli_dump_lsp)) {
        return false;
    }
    if (config.count(option::cli_dump_lsp_file_indexed)) {
        span::set_flag_lsp_dump_use_file_index(true);
    }
    if (config.count(option::cli_dump_lsp_only_schema)) {
        dump_json_only_schema_without_loc(std::cout);
    } else {
        dump_json(std::cout);
    }
    error::json_output_stderr();
    return true;
}

void engine::scan_package_root(const std::string& package_path, bool verbose) {
    util::time_stamp duration;
    duration.stamp();
    godel_module::instance()->set_compiled_file_path(this_file_name);
    if (godel_module::instance()->scanpkg(package_path).get_error()) {
        error::json_output_stderr();
        flag_execution_terminated = true;
        return;
    }

    // in verbose mode, dump
    if (!verbose) {
        return;
    }
    auto scan_time = duration.duration();
    std::clog << util::format_time(scan_time) << " package scan\n";
    godel_module::instance()->dump();
    godel_module::instance()->dump_module_tree();
    return;
}

void engine::do_lexical_analysis(const configure& config) {
    util::time_stamp duration;
    duration.stamp();
    if (lexical_analyser.scan(this_file_name).get_error()) {
        language_server_dump(config);
        flag_execution_terminated = true;
        return;
    }
    prof.lexical_analysis_time = duration.duration();
}

void engine::do_syntax_analysis(const configure& config) {
    util::time_stamp duration;
    duration.stamp();
    if (syntax_parser.analyse(lexical_analyser.result()).get_error()) {
        language_server_dump(config);
        flag_execution_terminated = true;
        return;
    }
    prof.syntax_parse_time = duration.duration();
}

void engine::do_semantic_analysis(const configure& config) {
    util::time_stamp duration;
    duration.stamp();
    if (semantic_analyser.analyse(config, syntax_parser.result()).get_error()) {
        language_server_dump(config);
        flag_execution_terminated = true;
        return;
    }
    prof.semantic_analysis_time = duration.duration();
}

void engine::ast_structure_dump() {
    auto dumper = ast_dumper(std::cout);
    syntax_parser.result()->accept(&dumper);
}

void engine::template_extract() {
    auto dumper = template_extractor();
    std::cout << dumper.to_string(syntax_parser.result());
    return;
}

void engine::run_souffle_from_file(const configure& config) {
    const auto& path = config.at(option::cli_input_path);
    if (!std::filesystem::exists(path)) {
        err.fatal("file <" + path + "> does not exist.");
    } else if (!std::filesystem::is_regular_file(path)) {
        err.fatal("file <" + path + "> is not regular file.");
    }
    std::ifstream in(path, std::ios::binary);
    std::stringstream ss;
    ss << in.rdbuf();
    const auto souffle_content = ss.str();
    run_souffle(souffle_content, config);
}

void engine::run_souffle_from_generated(const configure& config) {
    const auto souffle_content = ir_gen::get_mutable_context().str_output(config);
    run_souffle(souffle_content, config);
}

void engine::run_souffle(const std::string& souffle_content,
                         const configure& config) {
    // extra arguments to be passed to souffle
    std::vector<const char*> argv = {};

    // disable souffle slow transformers, some works of these transformers
    // have been done by godel semantic analysis and IR analysis passes
    // so we can skip them
    if (!config.count(option::cli_souffle_slow_transformers)) {
        argv.push_back(
            "--disable-transformers="
            "SubsumptionQualifierTransformer,"
            "SemanticChecker,"
            "MinimiseProgramTransformer"
        );
    }

    // enable souffle profiling, souffle will run slower in this mode
    // and generate a prof file named "souffle.prof.log",
    // and then we can analyze it to find the performance bottlenecks
    if (config.count(option::cli_enable_souffle_profiling)) {
        argv.push_back("--profile=souffle.prof.log");
        argv.push_back("--profile-frequency");
    }

    // null terminator
    argv.push_back(nullptr);

    // souffle fact path
    const auto fact_path = config.count(option::cli_fact_path)?
        config.at(option::cli_fact_path).c_str():"";

    // execute souffle and get exitcode
    const auto exitcode = souffle_engine::souffle_entry(
        config.at(option::cli_executable_path).c_str(),
                                 // program path
        "<input>",               // query file name, set it as "<input>"
        souffle_content.c_str(), // souffle program content
        fact_path,               // fact(database) search path
        "",                      // library search path
        "",                      // library name
        0,                       // enable warning
        config.count(option::cli_verbose),
                                 // verbose info
        argv.data()              // extra arguments
    );

    // if exits with non-zero value, exit with the same value
    if (exitcode) {
        std::exit(exitcode);
    }

    // merge json files generated by souffle
    const auto& ictx = ir_gen::get_context();
    const auto& vec = ictx.souffle_output;
    // merge json files if multiple output files are generated
    if (vec.size()>1 && ictx.json_output_path.size()) {
        const auto temp = std::filesystem::temp_directory_path();
        std::ofstream out(ictx.json_output_path);
        out << "{";
        for(const auto& i : vec) {
            // get temp file path
            const auto tmpfile = temp / ("godel_script_" + i + ".json");
            if (config.count(option::cli_verbose)) {
                std::clog << "Merge json output [";
                std::clog << ictx.souffle_output_real_name.at(i) << "] into ";
                std::clog << ictx.json_output_path << "\n";
                std::clog << "  - Temporary file path: " << tmpfile << "\n";
            }

            std::ifstream in(tmpfile);
            std::stringstream ss;
            ss << in.rdbuf();
            out << "\"" << ictx.souffle_output_real_name.at(i) << "\":";
            out << ss.str();

            // delete temp file
            std::filesystem::remove(tmpfile);
            if (i!=vec.back()) {
                out << ",";
            }
        }
        out << "}";
    }
}

const error& engine::run(const configure& config) {
    util::time_stamp total_time_duration;
    total_time_duration.stamp();

    this_file_name = config.at(option::cli_input_path);
    if (!this_file_name.length()) {
        return err;
    }

    if (config.count(option::cli_directly_run_souffle)) {
        run_souffle_from_file(config);
        return err;
    }

    if (config.count(option::cli_dump_lsp)) {
        report::error::set_json_out();
    }

    if (config.count(option::cli_package_path)) {
        scan_package_root(
            config.at(option::cli_package_path),
            config.count(option::cli_verbose)
        );
        if (flag_execution_terminated) {
            return err;
        }
    }

    // error module load file here
    err.load(this_file_name);

    // do lexical analysis
    do_lexical_analysis(config);
    if (flag_execution_terminated) {
        return err;
    }
    if (config.count(option::cli_lexer_dump_token)) {
        lexical_analyser.dump();
    }
    if (config.count(option::cli_lexer_dump_comment)) {
        lexical_analyser.dump_comments();
    }

    // do syntax analysis
    do_syntax_analysis(config);
    if (flag_execution_terminated) {
        return err;
    }
    if (config.count(option::cli_dump_ast)) {
        ast_structure_dump();
    }
    if (config.count(option::cli_extract_template)) {
        template_extract();
        return err;
    }
    if (config.count(option::cli_extract_location)) {
        location_extractor().output(
            syntax_parser.result(),
            config.at(option::cli_extract_location)
        );
        return err;
    }

    // do semantic analysis (also do souffle code generation)
    do_semantic_analysis(config);
    if (flag_execution_terminated) {
        return err;
    }
    if (config.count(option::cli_dump_semantic)) {
        semantic_analyser.dump_detail_semantic_info();
    }
    // dump ast, but this time the ast has resolved type info
    if (config.count(option::cli_dump_resolve)) {
        ast_structure_dump();
    }
    if (config.count(option::cli_dump_global)) {
        semantic_analyser.get_context().global.dump();
    }
    if (config.count(option::cli_dump_local)) {
        semantic_analyser.dump_local_variables();
    }

    // transfer analysed result to language server in json format
    // and return immediately to avoid changing output file
    if (language_server_dump(config)) {
        return err;
    }

    // record total compile time
    prof.total_time = total_time_duration.duration();

    // if only semantic analysis is required, return
    // also used when analysing a module
    if (config.count(option::cli_semantic_only)) {
        return err;
    }

    // dump profiling info
    if (config.count(option::cli_verbose)) {
        prof.dump(this_file_name);
    }

    // dump used modules
    if (config.count(option::cli_used_module)) {
        dump_used_modules();
    }

    // dump generated souffle code to file
    if (config.count(option::cli_dump_souffle_file)) {
        ir_gen::get_mutable_context().file_output(
            config.at(option::cli_dump_souffle_file),
            config
        );
    }

    // dump generated souffle code to console(stdout)
    if (config.count(option::cli_souffle_debug_dump)) {
        const auto souffle_content = ir_gen::get_mutable_context().str_output(config);
        std::cout << souffle_content << "\n";
    }

    // directly run souffle program
    if (config.count(option::cli_run_souffle)) {
        run_souffle_from_generated(config);
    }
    return err;
}

}