#include "error.h"
#include "godel-frontend/src/util/util.h"

#include <iostream>
#include <fstream>
#include <cstring>
#include <sstream>
#include <filesystem>

namespace report {

namespace fs = std::filesystem;
using util::reset;
using util::red;
using util::yellow;
using util::white;
using util::cyan;

std::string span::to_json() const {
    std::string res = "[";

    // replace all '\' with '\\', for JSON string
    auto tmp = file;
    size_t pos = 0;
    while((pos = tmp.find_first_of("\\", pos))!=std::string::npos) {
        tmp.replace(pos, 1, "\\\\");
        pos += 2;
    }

    // insert used file into the mapper, and give index to it
    if (!location_file_mapper.count(tmp)) {
        location_file_mapper[tmp] = location_file_mapper.size();
    }

    if (flag_lsp_dump_use_file_index) {
        res += std::to_string(location_file_mapper.at(tmp)) + ",";
    } else {
        res += "\"" + tmp + "\",";
    }
    res += std::to_string(start_line) + ",";
    res += std::to_string(start_column) + ",";
    res += std::to_string(end_line) + ",";
    res += std::to_string(end_column) + "]";
    return res;
}

void error::load(const std::string& path) {
    if (filename==path) {
        return;
    } else if (!fs::exists(path)) {
        fatal("file <" + path + "> does not exist.");
    } else if (!fs::is_regular_file(path)) {
        fatal("file <" + path + "> is not a regular file.");
    }
    filename = path;
    src.clear();
    std::ifstream in(path, std::ios::binary);
    std::string line;
    while (!in.eof()) {
        std::getline(in, line);
        src.push_back(line);
    }
}

void error::err(const std::string& info) {
    ++count;
    if (json_output) {
        lsp_errors.push_back({info, "", {0, 0, 0, 0, ""}});
        return;
    }
    std::cerr << red << "Error: " << white << info << reset << "\n\n";
}

void error::warn(const std::string& info) const {
    if (json_output) {
        lsp_warnings.push_back({info, "", {0, 0, 0, 0, ""}});
        return;
    }
    std::clog << yellow << "Warning: " << white << info << reset << "\n\n";
}

void error::fatal(const std::string& info) {
    err(info);
    json_output_stderr();
    std::exit(-1);
}

void error::json_output_stderr() {
    if (!json_output) {
        return;
    }
    std::cerr << "{\"error\":[";
    for(size_t i = 0; i<lsp_errors.size(); ++i) {
        std::cerr << lsp_errors[i].to_json();
        if (i!=lsp_errors.size()-1) {
            std::cerr << ",";
        }
    }
    std::cerr << "],\"warning\":[";
    for(size_t i =0; i<lsp_warnings.size(); ++i) {
        std::cerr << lsp_warnings[i].to_json();
        if (i!=lsp_warnings.size()-1) {
            std::cerr << ",";
        }
    }
    std::cerr << "]}";
}

void error::report_head_info(const std::string& info,
                             bool is_error) const {
    auto& out = is_error? std::cerr:std::clog;
    auto& color = is_error? red:yellow;
    auto head = is_error? "Error: " : "Warning: ";
    out << color << head << white << info << std::endl;
}

void error::report_location(std::ostream& out,
                            uint32_t line,
                            uint32_t column) const {
    out << cyan << "  --> " << reset;
    out << filename << ":" << line << ":" << column+1 << std::endl;
}

void error::report_context(const span& loc,
                           bool is_error,
                           const std::string& tips) {
    auto start_line = loc.start_line;
    auto start_column = loc.start_column;
    auto end_line = loc.end_line;
    auto end_column = loc.end_column;
    const auto& file = loc.file;
    load(file);

    auto& out = is_error? std::cerr:std::clog;
    auto& color = is_error? red:yellow;

    const char* underscore[] = {"^", "^^^^"};
    std::string indent = util::indentation(end_line);

    report_location(out, start_line, start_column);

    // report single line error info
    if (start_line == end_line) {
        out << cyan << indent << " | " << reset << std::endl;
        out << util::rightpad(std::to_string(start_line), indent.size());
        out << cyan << " | " << reset << src[start_line-1] << std::endl;
        out << cyan << indent << " | " << reset;

        for (size_t i = 0; i < start_column; ++i) {
            out << char(" \t"[src[start_line-1][i]=='\t']);
        }
        for (size_t i = start_column; i < end_column; ++i) {
            out << color << underscore[src[start_line-1][i]=='\t'];
        }
        if (start_column == end_column) {
            out << color << "^";
        }

        // give error info and tips
        out << reset << std::endl;
        if (tips.length()) {
            out << cyan << indent << " +- ";
            out << white << "note: " << reset << tips << std::endl;
        }
        return;
    }

    // invalid location, return directly
    if (!start_line ||
        !end_line ||
        end_line < start_line ||
        start_line > src.size()) {
        return;
    }
    // report multiple lines error info
    // draw start line info
    out << cyan << indent << " | " << reset << std::endl;
    out << util::rightpad(std::to_string(start_line), indent.size());
    out << cyan << " | " << reset << src[start_line-1] << std::endl;
    if (start_column > src[start_line-1].size()) {
        start_column = src[start_line-1].size();
    }
    out << cyan << indent << " | " << reset;
    for (size_t i = 0; i < start_column; ++i) {
        out << char(" \t"[src[start_line-1][i]=='\t']);
    }
    if (start_column == src[start_line-1].size()) {
        out << color << "^";
    } else {
        for (size_t i = start_column; i < src[start_line-1].size(); ++i) {
            out << color << underscore[src[start_line-1][i]=='\t'];
        }
    }
    out << reset << std::endl;

    // print ... if having multiple lines between the start and the end line
    if (end_line != start_line + 1) {
        out << cyan << indent << " | " << reset << "..." << std::endl;
    }

    // draw end line info
    out << util::rightpad(std::to_string(end_line),indent.size());
    out << cyan << " | " << reset << src[end_line-1] << std::endl;
    if (end_column > src[end_line-1].size()) {
        end_column = src[end_line-1].size();
    }
    out << cyan << indent << " | " << reset;
    for (size_t i = 0; i < end_column; ++i) {
        out << color << underscore[src[end_line-1][i]=='\t'];
    }

    // give error info and tips
    out << reset << std::endl;
    if (tips.length()) {
        out << cyan << indent << " +- ";
        out << white << "note: " << reset << tips << std::endl;
    }
}

void error::warn_report_ignored_DO_schema(const std::vector<std::pair<std::string, span>>& vec) {
    if (json_output) {
        return;
    }
    auto info = std::to_string(vec.size());
    info += " \"__all__\" methods of DO schemas are ignored:";
    report_head_info(info, false);
    size_t ignored_count = 0;
    for(const auto& i : vec) {
        ++ignored_count;
        if (ignored_count > 4) {
            break;
        }
        report_context(i.second, false, "");
    }
    if (vec.size() > 4) {
        std::clog << cyan << "  --> " << reset << "...(" << vec.size()-4 << ")\n";
    }
    std::clog << std::endl;
}

void error::err(const span& loc, const std::string& info, const std::string& tips) {
    ++count;
    if (json_output) {
        lsp_errors.push_back({info, tips, loc});
        return;
    }
    report_head_info(info, true);
    report_context(loc, true, tips);
    std::cerr << std::endl;
}

void error::warn(const span& loc, const std::string& info, const std::string& tips) {
    if (json_output) {
        lsp_warnings.push_back({info, tips, loc});
        return;
    }
    report_head_info(info, false);
    report_context(loc, false, tips);
    std::clog << std::endl;
}

void error::fatal(const span& loc, const std::string& info, const std::string& tips) {
    err(loc, info, tips);
    json_output_stderr();
    std::exit(-1);
}

}