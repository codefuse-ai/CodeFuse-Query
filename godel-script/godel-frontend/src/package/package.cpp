#include "package.h"
#include "godel-frontend/src/error/error.h"
#include "godel-frontend/src/util/util.h"

#include <cstring>
#include <sstream>
#include <filesystem>
#include <vector>
#include <iostream>
#include <algorithm>
#include <unordered_set>

namespace package {

namespace fs = std::filesystem;

using report::error;
using util::red;
using util::white;
using util::reset;

/**
 * @brief generate format module path from file name,
 * for example coref.java.gdl will be convert to: coref::java
 * @param filename
*/
std::string godel_module::mod_path_gen(const std::string& filename) const {
    std::string res = "";
    size_t last = 0, pos = filename.find(".", 0);
    while(pos!=std::string::npos) {
        res += filename.substr(last, pos - last) + "::";
        last = pos + 1;
        pos = filename.find(".", last);
    }
    if (last!=filename.length()) {
        res += filename.substr(last, pos - last);
    }
    return res;
}

/**
 * @brief split path by '/' or '\\'
 * @param p
*/
std::vector<fs::path> godel_module::pathvec(const fs::path& p) const {
    std::vector<fs::path> res;
    for (const auto& i : fs::canonical(p)) {
        res.push_back(i);
    }
    return res;
}

/**
 * @brief insert a format module path into package table
 * @param pack package root directory path
 * @param fp file canonical path
 */
void godel_module::insert(const std::vector<fs::path>& pack,
                          const fs::path& file_path) {
    auto file_path_vec = pathvec(file_path);
    std::string mod_path = "";

    // use i = pack.size() to skip path root before
    for(size_t i = pack.size(); i<file_path_vec.size() - 1; ++i) {
        auto segment = file_path_vec[i].string();

        // directory with "." or "-" is not allowed
        if (segment.find(".")!=std::string::npos ||
            segment.find("-")!=std::string::npos) {
            error_path.push_back(file_path);
            return;
        }
        // path with number as the first char is not allowed
        if (std::isdigit(segment[0])) {
            error_path.push_back(file_path);
            return;
        }
        mod_path += segment + "::";
    }

    // check the last part of the file path
    auto last_seg = file_path_vec.back().stem().string();
    if (last_seg.find("-")!=std::string::npos) {
        error_path.push_back(file_path);
        return;
    }
    if (std::isdigit(last_seg[0])) {
        error_path.push_back(file_path);
        return;
    }
    // check each first character behind '.'
    auto pos = last_seg.find(".");
    while(pos!=std::string::npos) {
        if (pos+1<last_seg.size() && std::isdigit(last_seg[pos+1])) {
            error_path.push_back(file_path);
            return;
        }
        pos = last_seg.find(".", pos+1);
    }

    // pass check, add to the tail of mod_path
    mod_path += mod_path_gen(last_seg);

    // check package path confliction
    if (modules.count(mod_path)) {
        err.warn(
            "package <" + mod_path + "> conflicts:\n  --> " +
            modules.at(mod_path) + "\n  --> " + file_path.string()
        );
        return;
    }

    if (check_path_has_reserve_word(mod_path) ||
        check_path_has_invalid_character(mod_path)) {
        invalid_path.push_back(file_path);
        return;
    }

    if (check_path_is_sub_path(file_path, mod_path)) {
        return;
    }

    // store module path, module name as the key, and value is the file path
    modules[mod_path] = file_path;
    convert_table[file_path] = mod_path;
    analysed[mod_path] = module_status::unused;
}

void godel_module::ignored_path_report() const {
    if (error_path.size()) {
        std::string info = "ignore package path ";
        info += "including \".\", \"-\" or numbers:";
        for(auto& i : error_path) {
            info += "\n  - " + i.string();
        }
        err.warn(info);
    }

    if (invalid_path.size()) {
        std::string info = "ignore package path ";
        info += "including reserved words or invalid characters:";
        for(auto& i : invalid_path) {
            info += "\n  - " + i.string();
        }
        err.warn(info);
    }

    if (conflict_path.size()) {
        std::string info = "ignore package path ";
        info += "including other path inside or is the sub path:";
        for(const auto& i : conflict_path) {
            info += "\n  - " + i.file_path.string();
            info += " => [" + i.module_full_name + "]";
            info += " X [" + i.conflict_module_full_name + "]";
        }
        err.warn(info);
    }
}

bool godel_module::check_path_is_sub_path(const fs::path& file_path,
                                          const std::string& module_full_name) {
    for(const auto& p : modules) {
        if (p.first==module_full_name) {
            continue;
        }
        // sub-path check, not just simple prefix check, for example:
        // coref::java is not the sub-path of coref::javascript
        // ```````````                        ```````````^^^^^^ not just prefix
        // coref::java is the sub-path of coref::java::script
        // ```````````                    ```````````^^
        // path is separated by "::", so simple prefix check is not enough.
        if (p.first.find(module_full_name)==0 &&
            p.first.length()>module_full_name.length() &&
            p.first[module_full_name.length()]==':') {
            conflict_path.push_back({
                .file_path = file_path,
                .module_full_name = module_full_name,
                .conflict_module_full_name = p.first
            });
            return true;
        }
        if (module_full_name.find(p.first)==0 &&
            module_full_name.length()>p.first.length() &&
            module_full_name[p.first.length()]==':') {
            conflict_path.push_back({
                .file_path = file_path,
                .module_full_name = module_full_name,
                .conflict_module_full_name = p.first
            });
            return true;
        }
    }
    return false;
}

bool godel_module::check_path_has_reserve_word(const std::string& path) const {
    const std::unordered_set<std::string> reserved = {
        "int", "bool", "string", "float", "true", "false", "use",
        "Self", "self", "enum", "schema", "extends", "database",
        "impl", "fn", "for", "let", "as", "query", "from", "where", "select",
        "if", "else", "match", "return", "in", "yield"
    };
    size_t last = 0, pos = path.find("::", 0);
    std::string tmp = "";
    while(pos!=std::string::npos) {
        tmp = path.substr(last, pos - last);
        last = pos + 2;
        pos = path.find("::", last);
        if (reserved.count(tmp)) {
            return true;
        }
    }
    if (last!=path.length()) {
        tmp = path.substr(last, pos - last);
        if (reserved.count(tmp)) {
            return true;
        }
    }
    return false;
}

bool godel_module::check_path_has_invalid_character(const std::string& path) const {
    const auto invalid_char = "[](){}!~`'\"?-+=*&^%$#@!|\\;:,.<>/";
    size_t last = 0, pos = path.find("::", 0);
    std::string tmp = "";
    while(pos!=std::string::npos) {
        tmp = path.substr(last, pos - last);
        last = pos + 2;
        pos = path.find("::", last);
        if (tmp.find_first_of(invalid_char)!=std::string::npos) {
            return true;
        }
    }
    if (last!=path.length()) {
        tmp = path.substr(last, pos - last);
        if (tmp.find_first_of(invalid_char)!=std::string::npos) {
            return true;
        }
    }
    return false;
}

[[nodiscard]] const error& godel_module::scanpkg(const std::string& directory) {
    if (scanned) {
        return err;
    }

    scanned = true;
    error_path.clear();
    invalid_path.clear();
    conflict_path.clear();

    if (!fs::exists(directory)) {
        err.err("package root <" + directory + "> does not exist.");
        return err;
    }
    if (!fs::is_directory(directory)) {
        err.err("package root <" + directory + "> is not a directory.");
        return err;
    }

    auto package_root = pathvec(directory);
    auto canonical_package_root = fs::canonical(directory);
    std::vector<fs::path> maybe_used_lib_file;
    for(const auto& entry : fs::recursive_directory_iterator(canonical_package_root)) {
        if (fs::is_directory(entry) || entry.path().extension()!=".gdl") {
            continue;
        }
        maybe_used_lib_file.push_back(entry.path());
    }
    std::sort(
        maybe_used_lib_file.begin(),
        maybe_used_lib_file.end(),
        [](const fs::path& lhs, const fs::path& rhs) {
            if (lhs.string().length()==rhs.string().length()) {
                return lhs.string() < rhs.string();
            }
            return lhs.string().length() < rhs.string().length();
        }
    );
    for(const auto& i : maybe_used_lib_file) {
        insert(package_root, i);
    }

    // generate module tree structure
    for(const auto& i : modules) {
        tree.insert(i.first);
    }
    return err;
}

void godel_module::dump() const {
    ignored_path_report();

    std::vector<std::string> ordered_module_paths;
    size_t maxlen = 0;
    for(const auto& i : modules) {
        ordered_module_paths.push_back(i.first);
        maxlen = i.first.length()>maxlen? i.first.length():maxlen;
    }
    maxlen = maxlen>16? 16:maxlen;
    std::sort(
        ordered_module_paths.begin(),
        ordered_module_paths.end(),
        [](const std::string& lhs, const std::string& rhs) {
            if (lhs.length() == rhs.length()) {
                return lhs < rhs;
            }
            return lhs.length() < rhs.length();
        }
    );

    if (ordered_module_paths.empty()) {
        return;
    }
    std::clog << "\nmodules:\n";
    for(const auto& i : ordered_module_paths) {
        std::clog << "  " << util::rightpad(i, maxlen);
        std::clog << " => " << modules.at(i) << "\n";
    }
    std::clog << "\n";
}

void godel_module::dump_module_tree() {
    if (tree.empty()) {
        return;
    }

    std::clog << "module tree structure:\n";
    tree.dump();
    std::clog << "\n";
}

const std::string& godel_module::find_file_by_module_path(const std::string& mod_name) const {
    if (modules.count(mod_name)) {
        return modules.at(mod_name);
    }
    static const std::string null_return_string = "";
    return null_return_string;
}

const std::string& godel_module::find_module_by_file(const std::string& file_path) const {
    static const std::string null_return_string = "";
    // sometimes the compiled file is in the package directory
    // but we could not recognize it as a module, so the module path should be empty
    if (file_path == compiled_file_path) {
        return null_return_string;
    }
    if (convert_table.count(file_path)) {
        return convert_table.at(file_path);
    }
    return null_return_string;
}

void godel_module::mark_analysing(const std::string& path) {
    if (analysed.count(path)) {
        analysed.at(path) = module_status::analysing;
    }
}

void godel_module::mark_analysed(const std::string& path) {
    if (analysed.count(path)) {
        analysed.at(path) = module_status::analysed;
    }
}

}