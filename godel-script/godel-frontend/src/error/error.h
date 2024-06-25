#pragma once

#include <cstdint>
#include <iostream>
#include <sstream>
#include <cstring>
#include <vector>
#include <unordered_map>

namespace report {

struct span {
    uint32_t start_line;
    uint32_t start_column;
    uint32_t end_line;
    uint32_t end_column;
    std::string file;

    span() = default;
    span(uint32_t sl,
         uint32_t sc,
         uint32_t el,
         uint32_t ec,
         const std::string& f):
         start_line(sl), start_column(sc),
         end_line(el), end_column(ec),
         file(f) {}
    std::string to_json() const;

    friend std::ostream& operator<<(std::ostream& out, span& loc) {
        out << loc.file << ":" << loc.start_line << ":" << loc.start_column;
        out << " " << loc.end_line << ":" << loc.end_column;
        return out;
    }

    bool operator==(const span& other) const {
        return (start_line == other.start_line &&
                start_column == other.start_column &&
                end_line == other.end_line &&
                end_column == other.end_column &&
                file == other.file);
    }

    bool operator!=(const span& other) const {
        return (start_line != other.start_line ||
                start_column != other.start_column ||
                end_line != other.end_line ||
                end_column != other.end_column ||
                file != other.file);
    }

    bool is_null() const {
        return file.length() == 0;
    }
    static const span& null() {
        static const span result = span(0, 0, 0, 0, "");
        return result;
    }

private:
    static inline std::unordered_map<std::string, int> location_file_mapper;
    static inline bool flag_lsp_dump_use_file_index = false;

public:
    static void set_flag_lsp_dump_use_file_index(bool v) {
        flag_lsp_dump_use_file_index = v;
    }
    static const auto& get_location_file_mapper() {
        return location_file_mapper;
    }
};

struct lsp_error_info {
    std::string info;
    std::string tips;
    span location;

    static std::string to_raw(const std::string& src) {
        if (src.empty()) {
            return "";
        }
        std::string res = src;
        std::string::size_type pos = 0;
        while((pos = res.find_first_of("\\", pos))!=std::string::npos) {
            res.replace(pos, 1, "\\\\");
            pos += 2;
        }
        pos = 0;
        while((pos = res.find_first_of("\"", pos))!=std::string::npos) {
            res.replace(pos, 1, "\\\"");
            pos += 2;
        }
        return res;
    }

    std::string to_json() const {
        std::string res = "{\"info\":\"" + to_raw(info) + "\",";
        res += "\"tips\":\"" + to_raw(tips) + "\",";
        res += "\"location\":" + location.to_json() + "}";
        return res;
    }
};

class error {
private:
    int64_t count = 0;
    std::string filename = "";
    std::vector<std::string> src;

private:
    // for language server error report, use json format output
    static inline bool json_output = false;
    // record generated errors
    static inline std::vector<lsp_error_info> lsp_errors = {};
    // record generated warnings
    static inline std::vector<lsp_error_info> lsp_warnings = {};

private:
    // print the report head info, format: {"Error: "/"Warning: "}{info}
    void report_head_info(const std::string&, bool) const;
    // print the report location, format: {filename}:{line}:{column}
    void report_location(std::ostream&, uint32_t, uint32_t) const;
    // print the context of given location
    void report_context(const span&, bool, const std::string&);

public:
    void warn_report_ignored_DO_schema(const std::vector<std::pair<std::string, span>>&);

public:
    void load(const std::string&);
    void err(const std::string&);
    void warn(const std::string&) const;
    void fatal(const std::string&);
    void err(const span&, const std::string&, const std::string& tips = "");
    void warn(const span&, const std::string&, const std::string& tips = "");
    void fatal(const span&, const std::string&, const std::string& tips = "");

public:
    auto get_error() const { return count; }
    static void set_json_out() { json_output = true; }
    static void json_output_stderr();
};

}