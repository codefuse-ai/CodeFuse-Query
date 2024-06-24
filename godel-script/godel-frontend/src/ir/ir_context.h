#pragma once

#include "godel-frontend/src/ir/lir.h"
#include "godel-frontend/src/sema/context.h"
#include "godel-frontend/src/cli.h"

#include <iostream>
#include <fstream>
#include <vector>
#include <cstdint>
#include <cstring>
#include <sstream>
#include <unordered_set>
#include <unordered_map>

namespace godel {

struct souffle_functor {
    std::string name;
    std::string params;
    std::string return_type;

    void dump(std::ostream&) const;
};

struct souffle_type_alias {
    std::string alias;
    std::string real;

    std::vector<std::string> structure_type_list;

    void dump(std::ostream&) const;
};

struct souffle_schema {
    std::string name;
    std::vector<std::pair<std::string, std::string>> fields;

    void dump(std::ostream&) const;
};

// declaration of database input
struct souffle_input_decl {
    std::string database_name;
    std::string table_type;
    uint64_t load_times;
    std::vector<std::pair<std::string, std::string>> fields;

private:
    std::string decl_name;

public:
    souffle_input_decl(const std::string& dbn,
                       const std::string& tt,
                       uint64_t lt):
        database_name(dbn), table_type(tt), load_times(lt) {
        decl_name = "input_" + replace_colon(database_name) + "_" + 
                    replace_colon(table_type) + "_" +
                    std::to_string(load_times);
    }
    void dump(std::ostream&) const;
    const auto& get_decl_name() const { return decl_name; }
};

// implementation of database input
struct souffle_input_impl {
    std::string name;
    std::string table_name;
    std::string table_type;
    uint64_t path_id;
    std::string input_db_path;

private:
    std::string decl_name;

public:
    souffle_input_impl(const std::string& n,
                       const std::string& tn,
                       const std::string& tt,
                       uint64_t pid,
                       const std::string& idb):
        name(n), table_name(tn), table_type(tt),
        path_id(pid), input_db_path(idb) {
        decl_name = "input_" + replace_colon(name) + "_" + 
                    replace_colon(table_type) + "_" +
                    std::to_string(path_id);
    }
    void dump(std::ostream&) const;
    const auto& get_decl_name() const { return decl_name; }
};

class souffle_rule_decl {
private:
    std::string name;
    std::string return_type;
    std::vector<std::pair<std::string, std::string>> params;

private:
    bool flag_is_inline_rule;
    bool flag_need_cache;

public:
    souffle_rule_decl(const std::string& n):
        name(n), return_type(""),
        flag_is_inline_rule(false),
        flag_need_cache(false) {}
    void dump(std::ostream&) const;

public:
    void set_return_type(const std::string& t) { return_type = t; }
    void set_is_inline_rule(bool flag) { flag_is_inline_rule = flag; }
    void set_need_cache(bool flag) { flag_need_cache = flag; }
    void add_param(const std::string& pn, const std::string& pt) {
        params.push_back({pn, pt});
    }

public:
    const auto& get_rule_raw_name() const { return name; }
    const auto& get_params() const { return params; }
    const auto& get_return_type() const { return return_type; }
    auto is_inline() const { return flag_is_inline_rule; }
    auto need_cache() const { return flag_need_cache;}
};

class souffle_rule_impl {
private:
    std::string func_name;
    std::vector<std::string> params;
    lir::block block;

public:
    souffle_rule_impl(const std::string& c, const report::span& loc):
        func_name(c), block(loc) {
        block.set_use_semicolon();
    }
    void add_param(const std::string& p) {
        params.push_back(p);
    }
    auto get_block() { return &block; }
    const auto& get_params() const { return params; }
    const auto& get_func_name() const { return func_name; }

    void dump(std::ostream&) const;
};

struct souffle_annotated_file_output {
    std::string format;
    std::string file_path;
    std::string rule_name;
};

// alias to annotated_file_output
using souffle_annotated_file_input = souffle_annotated_file_output;

struct ir_context {
    std::vector<souffle_functor> functors;
    std::vector<souffle_type_alias> type_alias;

    // souffle stdout output, can be redirected to file output
    std::vector<std::string> souffle_output;
    // mapper stores real name of mangled output rule,
    // used for merging output files into one file
    std::unordered_map<std::string, std::string> souffle_output_real_name;

    std::vector<souffle_annotated_file_output> annotated_output;
    std::vector<souffle_annotated_file_input> annotated_input;

    std::vector<souffle_schema> schema_data_constraint_decls;
    std::vector<souffle_input_decl> input_decls;
    std::vector<souffle_input_impl> input_impls;

    // record all database index in this vector
    std::unordered_set<std::string> database_all_data;

    // declarations for rules
    std::vector<souffle_rule_decl*> rule_decls;

    // implementations for rules
    std::vector<souffle_rule_impl*> rule_impls;
    std::vector<souffle_rule_impl*> database_get_table;
    std::vector<souffle_rule_impl*> schema_get_field;
    std::vector<souffle_rule_impl*> schema_data_constraint_impls;

    // database index and path index
    std::unordered_map<std::string, uint64_t> db_index;
    std::unordered_map<std::string, uint64_t> db_path;

    // for stdout redirect output
    std::string json_output_path = "";
    std::string csv_output_path = "";
    std::string sqlite_output_path = "";

private:
    bool flag_ir_pass_already_executed = false;

private:
    void generate_functors();
    void generate_type_alias();
    void generate_all_data_database();

private:
    void dump_souffle_functors(std::ostream&) const;
    void dump_type_alias(std::ostream&) const;
    void dump_schema_data_constraint_decls(std::ostream&) const;
    void dump_rule_decls(std::ostream&) const;
    void dump_input_decls(std::ostream&) const;
    bool cache_input_impl(std::ostream&, const std::string&) const;
    void dump_rule_impls(std::ostream&,
                         const std::unordered_set<std::string>&) const;
    void dump_database_get_table(std::ostream&) const;
    void dump_database_data_constraint(std::ostream&) const;
    void dump_schema_data_constraint_impls(std::ostream&) const;
    void dump_schema_get_field(std::ostream&) const;
    void dump_input_impls(std::ostream&) const;
    void dump_souffle_annotated_input(std::ostream&) const;
    void dump_souffle_multi_json_output(std::ostream&) const;
    void dump_souffle_output(std::ostream&) const;
    void dump_souffle_annotated_output(std::ostream&) const;
    void dump(std::ostream&, const cli::configure&);

private:
    static inline bool enable_souffle_cache = false;
    const std::filesystem::path cache_directory = std::filesystem::current_path() / "godel-script-cache";
    void check_cache_directory_and_create() const {
        if (std::filesystem::exists(cache_directory)) {
            return;
        }
        std::filesystem::create_directory(cache_directory);
    }
    void check_cache_directory_and_clean() const {
        if (!std::filesystem::exists(cache_directory)) {
            return;
        }
        std::filesystem::remove(cache_directory / "cache.db");
    }
    bool check_cache_table_exists(const std::string&) const;
    void dump_cache_output(std::ostream&,
                           const std::unordered_set<std::string>&,
                           const std::unordered_set<std::string>&) const;

public:
    ir_context();
    ~ir_context();
    void file_output(const std::string&, const cli::configure&);
    std::string str_output(const cli::configure&);
};

}