#include "godel-frontend/src/ir/ir_context.h"
#include "godel-frontend/src/ir/pass_manager.h"
#include "godel-frontend/src/ir/remove_unused.h"
#include "godel-frontend/src/ir/inst_combine.h"

#include <iostream>
#include <fstream>
#include <filesystem>
#include <cassert>

#include <sqlite3.h>

namespace godel {

void souffle_functor::dump(std::ostream& out) const {
    out << ".functor " << name;
    out << "(" << params << "): " << return_type << "\n";
}

void souffle_type_alias::dump(std::ostream& out) const {
    out << ".type " << alias << " = " << real << "\n";
}

void souffle_schema::dump(std::ostream& out) const {
    out << ".decl schema_" << replace_colon(name) << "(";
    out << "result: " << replace_colon(name) << ", db_id: DBIndex";
    if (fields.size()) {
        out << ", ";
    }
    for(const auto& i : fields) {
        out << i.first << ": " << replace_colon(i.second);
        if (i!=fields.back()) {
            out << ", ";
        }
    }
    out << ")\n";
}

void souffle_input_decl::dump(std::ostream& os) const {
    os << ".decl " << decl_name << "(";
    for(const auto& i : fields) {
        os << i.first << ": " << replace_colon(i.second);
        if (i!=fields.back()) {
            os << ", ";
        }
    }
    os << ")\n";
}

void souffle_input_impl::dump(std::ostream& os) const {
    os << ".input " << decl_name;
    os << "(IO=\"sqlite\", dbname=" << input_db_path << ", name=\"";
    os << table_name << "\")\n";
}

void souffle_rule_decl::dump(std::ostream& out) const {
    out << ".decl " << replace_colon(name) << "(";
    if (return_type.length() && return_type!="bool") {
        out << "result: " << replace_colon(return_type);
        if (params.size()) {
            out << ", ";
        }
    }
    for(const auto& i : params) {
        out << i.first << ": " << replace_colon(i.second);
        if (i!=params.back()) {
            out << ", ";
        }
    }
    out << ")";
    if (flag_is_inline_rule) {
        out << " inline";
    }
    out << "\n";
}

void souffle_rule_impl::dump(std::ostream& out) const {
    out << replace_colon(func_name) << "(";
    if (!params.empty()) {
        auto it = params.begin();
        out << *it++;
        while(it != params.end()) {
            out << ", " << *it++;
        }
    }

    // empty rule block should be treated as a fact: xx(x, x).
    // else dump the body of the rule: xx(x, x) :- ...
    if (block.get_content().empty()) {
        out << ").\n";
    } else {
        out << ") :- ";
        block.dump(out, "");
        out << ".\n";
    }
}

ir_context::ir_context() {
    generate_functors();
    generate_type_alias();
    generate_all_data_database();
    db_path = {};
}

ir_context::~ir_context() {
    for(auto i : rule_decls) {
        delete i;
    }
    for(auto i : rule_impls) {
        delete i;
    }
    for(auto i : database_get_table) {
        delete i;
    }
    for(auto i : schema_get_field) {
        delete i;
    }
    for(auto i : schema_data_constraint_impls) {
        delete i;
    }
}

void ir_context::dump_souffle_functors(std::ostream& out) const {
    for(const auto& i : functors) {
        i.dump(out);
    }
    if (functors.size()) {
        out << "\n";
    }
}

void ir_context::dump_type_alias(std::ostream& out) const {
    for(const auto& i : type_alias) {
        i.dump(out);
    }
    if (type_alias.size()) {
        out << "\n";
    }
}

void ir_context::dump_schema_data_constraint_decls(std::ostream& out) const {
    for(const auto& i : schema_data_constraint_decls) {
        i.dump(out);
    }
    if (schema_data_constraint_decls.size()) {
        out << "\n";
    }
}

void ir_context::dump_rule_decls(std::ostream& out) const {
    for(auto i : rule_decls) {
        i->dump(out);
    }
    if (rule_decls.size()) {
        out << "\n";
    }
}

void ir_context::dump_input_decls(std::ostream& out) const {
    for(const auto& i : input_decls) {
        i.dump(out);
    }
    if (input_decls.size()) {
        out << "\n";
    }
}

bool ir_context::cache_input_impl(std::ostream& out, const std::string& fn) const {
    const auto tempfile = cache_directory / "cache.db";
    if (!enable_souffle_cache || !std::filesystem::exists(tempfile)) {
        return false;
    }
    if (check_cache_table_exists(fn)) {
        out << ".input " << fn;
        out << "(IO=\"sqlite-cache\", dbname=\"" << tempfile.string() << "\", ";
        out << "name=\"_" << fn << "\")\n";
        return true;
    }
    return false;
}

void ir_context::dump_rule_impls(std::ostream& out,
                                 const std::unordered_set<std::string>& cache_decl) const {
    for(auto i : rule_impls) {
        const auto name = replace_colon(i->get_func_name());
        // cache input
        if (cache_decl.count(name) && cache_input_impl(out, name)) {
            continue;
        }
        i->dump(out);
    }
    if (rule_impls.size()) {
        out << "\n";
    }
}

void ir_context::dump_database_get_table(std::ostream& out) const {
    for(auto i : database_get_table) {
        i->dump(out);
    }
    if (database_get_table.size()) {
        out << "\n";
    }
}

void ir_context::dump_database_data_constraint(std::ostream& out) const {
    for(const auto& i : database_all_data) {
        out << "all_data_DBIndex(" << i << ").\n";
    }
    if (database_all_data.size()) {
        out << "\n";
    }
}

void ir_context::dump_schema_data_constraint_impls(std::ostream& out) const {
    for(auto i : schema_data_constraint_impls) {
        i->dump(out);
    }
    if (schema_data_constraint_impls.size()) {
        out << "\n";
    }
}

void ir_context::dump_schema_get_field(std::ostream& out) const {
    for(auto i : schema_get_field) {
        i->dump(out);
    }
    if (schema_get_field.size()) {
        out << "\n";
    }
}

void ir_context::dump_input_impls(std::ostream& out) const {
    for(const auto& i : input_impls) {
        i.dump(out);
    }
    if (input_impls.size()) {
        out << "\n";
    }
}

void ir_context::dump_souffle_annotated_input(std::ostream& out) const {
    if (annotated_input.empty()) {
        return;
    }
    for(const auto& i : annotated_input) {
        out << ".input " << replace_colon(i.rule_name);
        if (i.format=="\"json\"") {
            out << "(IO=\"jsonfile\", filename=";
            out << i.file_path << ", format=\"object\")";
        } else if (i.format=="\"csv\"") {
            out << "(IO=\"file\", filename=";
            out << i.file_path << ", format=\"object\", rfc4180=true)";
        } else if (i.format=="\"sqlite\"") {
            out << "(IO=\"sqlite\", filename=";
            out << i.file_path << ", format=\"object\")";
        }
        out << "\n";
    }
    out << "\n";
}

void ir_context::dump_souffle_multi_json_output(std::ostream& out) const {
    const auto temp = std::filesystem::temp_directory_path();
    if (temp.string().empty()) {
        assert(false && "cannot find temp directory or path is empty");
    }
    // dump output rules
    for(const auto& i : souffle_output) {
        const auto temp_file = temp / ("godel_script_" + i + ".json");
        out << ".output " << replace_colon(i);
        out << "(IO=\"jsonfile\", filename=\"";
        out << temp_file.string() << "\", format=\"object\")" << "\n";
    }
    if (souffle_output.size()) {
        out << "\n";
    }
}

void ir_context::dump_souffle_output(std::ostream& out) const {
    if (souffle_output.empty()) {
        return;
    }
    // multi output for json
    if (souffle_output.size()>1 && json_output_path.size()) {
        dump_souffle_multi_json_output(out);
        return;
    }
    // generate io format
    auto io_format = std::string("(IO=\"stdout\")");
    if (json_output_path.size()) {
        io_format = "(IO=\"jsonfile\", filename=\"" +
                    json_output_path +
                    "\", format=\"object\")";
    }
    if (csv_output_path.size()) {
        io_format = "(IO=\"file\", filename=\"" +
                    csv_output_path +
                    "\", format=\"object\", rfc4180=true)";
    }
    if (sqlite_output_path.size()) {
        io_format = "(IO=\"sqlite\", filename=\"" +
                    sqlite_output_path +
                    "\", format=\"object\")";
    }
    // dump output rules
    for(const auto& i : souffle_output) {
        out << ".output " << replace_colon(i) << io_format << "\n";
    }
    if (souffle_output.size()) {
        out << "\n";
    }
}

void ir_context::dump_souffle_annotated_output(std::ostream& out) const {
    if (annotated_output.empty()) {
        return;
    }
    for(const auto& i : annotated_output) {
        out << ".output " << replace_colon(i.rule_name);
        if (i.format=="\"json\"") {
            out << "(IO=\"jsonfile\", filename=";
            out << i.file_path << ", format=\"object\")";
        } else if (i.format=="\"csv\"") {
            out << "(IO=\"file\", filename=";
            out << i.file_path << ", format=\"object\", rfc4180=true)";
        } else if (i.format=="\"sqlite\"") {
            out << "(IO=\"sqlite\", filename=";
            out << i.file_path << ", format=\"object\")";
        }
        out << "\n";
    }
    out << "\n";
}

void ir_context::dump(std::ostream& out, const cli::configure& conf) {
    // only run the passes once
    if (!flag_ir_pass_already_executed) {
        pass_manager().run(*this, conf);
        flag_ir_pass_already_executed = true;
    }

    // inline rules cannot be used as IO
    std::unordered_set<std::string> inline_decl;
    std::unordered_set<std::string> cache_decl;
    for(auto i : rule_decls) {
        if (i->is_inline()) {
            inline_decl.insert(replace_colon(i->get_rule_raw_name()));
        }
        if (i->need_cache()) {
            cache_decl.insert(replace_colon(i->get_rule_raw_name()));
        }
    }

    if (conf.count(cli::option::cli_enable_souffle_cache)) {
        enable_souffle_cache = true;
    }
    if (conf.count(cli::option::cli_clean_souffle_cache)) {
        check_cache_directory_and_clean();
    }

    // dump maybe-used souffle functors
    dump_souffle_functors(out);
    // dump godel -> souffle type alias
    dump_type_alias(out);

    // dump data constraints' declarations for schema
    dump_schema_data_constraint_decls(out);
    // dump rule declarations
    dump_rule_decls(out);
    // dump input declaration
    dump_input_decls(out);

    // dump rule implementation
    dump_rule_impls(out, cache_decl);
    // dump database get table
    dump_database_get_table(out);
    // dump database all data
    dump_database_data_constraint(out);
    // dump schema data constraint
    dump_schema_data_constraint_impls(out);
    // dump schema get field
    dump_schema_get_field(out);
    // dump souffle fact input
    dump_input_impls(out);
    dump_souffle_annotated_input(out);
    // dump souffle output
    dump_souffle_output(out);
    dump_souffle_annotated_output(out);

    if (enable_souffle_cache) {
        dump_cache_output(out, inline_decl, cache_decl);
    }
}

bool ir_context::check_cache_table_exists(const std::string& rule) const {
    check_cache_directory_and_create();
    const auto tempfile = cache_directory / "cache.db";
    if (!std::filesystem::exists(tempfile)) {
        return false;
    }

    sqlite3* db = nullptr;
    if (sqlite3_open(tempfile.string().c_str(), &db) != SQLITE_OK) {
        return false;
    }

    auto cmd = std::string("SELECT name FROM sqlite_master WHERE type='table'");
    cmd += " AND name='_" + rule + "';";

    sqlite3_stmt* stmt = nullptr;
    const char* tail = nullptr;
    auto rc = sqlite3_prepare_v2(db, cmd.c_str(), -1, &stmt, &tail);
    if (rc != SQLITE_OK) {
        sqlite3_finalize(stmt);
        sqlite3_close(db);
        return false;
    }

    if (sqlite3_step(stmt)==SQLITE_ROW) {
        sqlite3_finalize(stmt);
        sqlite3_close(db);
        return true;
    }

    sqlite3_finalize(stmt);
    sqlite3_close(db);
    return false;
}

void ir_context::dump_cache_output(std::ostream& out,
                                   const std::unordered_set<std::string>& inline_decl,
                                   const std::unordered_set<std::string>& cache_decl) const {
    check_cache_directory_and_create();
    for(const auto& i : cache_decl) {
        if (inline_decl.count(i) || // should not be inline rule
            check_cache_table_exists(i)) { // should not exist in cache
            continue;
        }
        out << ".output " << i << "(IO=\"sqlite\", filename=\"";
        out << (cache_directory / "cache.db").string();
        out << "\")\n";
    }
}

void ir_context::file_output(const std::string& output,
                             const cli::configure& conf) {
    std::ofstream out(output);
    dump(out, conf);
}

std::string ir_context::str_output(const cli::configure& conf) {
    std::stringstream ss;
    dump(ss, conf);
    return ss.str();
}

void ir_context::generate_functors() {
    functors.push_back({
        "get_field_by_index",
        "self: number, total: number, index: number",
        "number stateful"
    });
    functors.push_back({
        "godel_lang_builtin_string_getMatchResult",
        "self: symbol, pattern: symbol, index: number",
        "symbol"
    });
    functors.push_back({
        "godel_lang_builtin_string_to_upper",
        "self: symbol",
        "symbol"
    });
    functors.push_back({
        "godel_lang_builtin_string_to_lower",
        "self: symbol",
        "symbol"
    });
    functors.push_back({
        "godel_lang_builtin_string_replace_once",
        "self: symbol, pattern: symbol, replacement: symbol, index: number",
        "symbol"
    });
    functors.push_back({
        "godel_lang_builtin_string_replace_all",
        "self: symbol, pattern: symbol, replacement: symbol",
        "symbol"
    });
}

void ir_context::generate_type_alias() {
    type_alias.push_back({
        "DBIndex",
        "[type_id: number, load_path: number]",
        {"number", "number"}
    });
    type_alias.push_back({"int", "number", {}});
    type_alias.push_back({"string", "symbol", {}});
}

void ir_context::generate_all_data_database() {
    auto all_data_database = new souffle_rule_decl("all_data_DBIndex");
    all_data_database->add_param("db_id", "DBIndex");
    rule_decls.push_back(all_data_database);

    // default database index is [-1, -1]
    database_all_data.insert("[-1, -1]");
}

}