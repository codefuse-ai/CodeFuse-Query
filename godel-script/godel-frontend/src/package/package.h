#pragma once

#include "godel-frontend/src/error/error.h"
#include "module_tree.h"

#include <cstring>
#include <sstream>
#include <unordered_map>
#include <filesystem>
#include <vector>

namespace package {

namespace fs = std::filesystem;

struct conflict_path_info {
    fs::path file_path;
    std::string module_full_name;
    std::string conflict_module_full_name;
};

class godel_module {
public:
    enum class module_status {
        unused,
        analysing,
        analysed
    };

private:
    bool scanned = false;
    report::error err;

    // path of compiled file, this is not included in the module
    std::string compiled_file_path;

    // format path map to real file path
    std::unordered_map<std::string, std::string> modules;

    // real file path to format path
    std::unordered_map<std::string, std::string> convert_table;

    // mark one file is analysed before, to avoid loop-reference
    std::unordered_map<std::string, module_status> analysed;

    // collect conflict path in this vector for error report
    std::vector<fs::path> error_path;
    std::vector<fs::path> invalid_path;
    std::vector<conflict_path_info> conflict_path;

    // store the module path tree
    module_tree tree;

private:
    std::string mod_path_gen(const std::string&) const;
    std::vector<fs::path> pathvec(const fs::path&) const;
    void insert(const std::vector<fs::path>&, const fs::path&);
    void ignored_path_report() const;

    // check if module path is sub path
    bool check_path_is_sub_path(const fs::path&, const std::string&);
    // check if module path including reserved words
    bool check_path_has_reserve_word(const std::string&) const;
    // check if module path including invalid characters
    bool check_path_has_invalid_character(const std::string&) const;

public:
    // singleton
    static godel_module* instance() {
        static godel_module package_manager;
        return &package_manager;
    }

    [[nodiscard]] const report::error& scanpkg(const std::string&);

    // dump package mapping
    void dump() const;

    // dump module structure in tree mode
    void dump_module_tree();

    // module path -> file path
    const std::string& find_file_by_module_path(const std::string&) const;

    // file path -> module path
    const std::string& find_module_by_file(const std::string&) const;

public:
    void mark_analysing(const std::string&);
    void mark_analysed(const std::string&);
    void set_compiled_file_path(const std::string& path) {
        compiled_file_path = path;
    }
    module_status get_status(const std::string& path) const {
        return analysed.count(path)? analysed.at(path):module_status::unused;
    }
    const auto& get_tree() const { return tree; }
    const auto& get_all_module_status() const { return analysed; }
};

}