#include "util.h"

#include <iomanip>
#include <cstring>
#include <sstream>
#include <chrono>
#include <vector>
#include <algorithm>

namespace util {

void enable_color_off_mode() {
    if (color_manager::instance().is_enabled()) {
        color_manager::instance().disable();
    }
}

// ANSI escape sequence red
// cannot use on terminal that does not support ANSI escape sequence
std::ostream& red(std::ostream& out) {
    if (!color_manager::instance().is_enabled()) {
        return out;
    }
    out << "\033[91;1m";
    return out;
}

// ANSI escape sequence green
// cannot use on terminal that does not support ANSI escape sequence
std::ostream& green(std::ostream& out) {
    if (!color_manager::instance().is_enabled()) {
        return out;
    }
    out << "\033[92;1m";
    return out;
}

// ANSI escape sequence white
// cannot use on terminal that does not support ANSI escape sequence
std::ostream& white(std::ostream& out) {
    if (!color_manager::instance().is_enabled()) {
        return out;
    }
    out << "\033[0m\033[1m";
    return out;
}

// ANSI escape sequence cyan
// cannot use on terminal that does not support ANSI escape sequence
std::ostream& cyan(std::ostream& out) {
    if (!color_manager::instance().is_enabled()) {
        return out;
    }
    out << "\033[96;1m";
    return out;
}

// ANSI escape sequence yellow
// cannot use on terminal that does not support ANSI escape sequence
std::ostream& yellow(std::ostream& out) {
    if (!color_manager::instance().is_enabled()) {
        return out;
    }
    out << "\033[93;1m";
    return out;
}

// ANSI escape sequence grey
// cannot use on terminal that does not support ANSI escape sequence
std::ostream& grey(std::ostream& out) {
    if (!color_manager::instance().is_enabled()) {
        return out;
    }
    out << "\033[37;1m";
    return out;
}

// ANSI escape sequence purple
// cannot use on terminal that does not support ANSI escape sequence
std::ostream& purple(std::ostream& out) {
    if (!color_manager::instance().is_enabled()) {
        return out;
    }
    out << "\033[95;1m";
    return out;
}

// ANSI escape sequence reset
// cannot use on terminal that does not support ANSI escape sequence
std::ostream& reset(std::ostream& out) {
    if (!color_manager::instance().is_enabled()) {
        return out;
    }
    out << "\033[0m";
    return out;
}

// ANSI escape sequence light red
// cannot use on terminal that does not support ANSI escape sequence
std::ostream& light_red(std::ostream& out) {
    if (!color_manager::instance().is_enabled()) {
        return out;
    }
    out << "\033[91m";
    return out;
}

// ANSI escape sequence light green
// cannot use on terminal that does not support ANSI escape sequence
std::ostream& light_green(std::ostream& out) {
    if (!color_manager::instance().is_enabled()) {
        return out;
    }
    out << "\033[92m";
    return out;
}

// ANSI escape sequence light cyan
// cannot use on terminal that does not support ANSI escape sequence
std::ostream& light_cyan(std::ostream& out) {
    if (!color_manager::instance().is_enabled()) {
        return out;
    }
    out << "\033[96m";
    return out;
}

// ANSI escape sequence light yellow
// cannot use on terminal that does not support ANSI escape sequence
std::ostream& light_yellow(std::ostream& out) {
    if (!color_manager::instance().is_enabled()) {
        return out;
    }
    out << "\033[93m";
    return out;
}

// ANSI escape sequence light grey
// cannot use on terminal that does not support ANSI escape sequence
std::ostream& light_grey(std::ostream& out) {
    if (!color_manager::instance().is_enabled()) {
        return out;
    }
    out << "\033[37m";
    return out;
}

// ANSI escape sequence light purple
// cannot use on terminal that does not support ANSI escape sequence
std::ostream& light_purple(std::ostream& out) {
    if (!color_manager::instance().is_enabled()) {
        return out;
    }
    out << "\033[95m";
    return out;
}

std::string generate_version_from_time_macro(const char* date) {
    const char major[] = "1";
    const char minor[] = "1";
    const char* months[] = {
        "Jan", "Feb", "Mar", "Apr", "May", "Jun",
        "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"
    };
    const char* months_num[] = {
        "01", "02", "03", "04", "05", "06",
        "07", "08", "09", "10", "11", "12"
    };
    auto version = std::string("");
    version += major;
    version += ".";
    version += minor;
    version += ".";
    version += date[7];
    version += date[8];
    version += date[9];
    version += date[10];
    auto macro_month = std::string("");
    macro_month += date[0];
    macro_month += date[1];
    macro_month += date[2];
    for(uint32_t i = 0; i<12; ++i) {
        if (macro_month == months[i]) {
            version += months_num[i];
            break;
        }
    }
    version += date[4]>='0'? date[4]: '0';
    version += date[5];
    return version;
}

std::string format_time(double sec) {
    std::stringstream ss;
    if (color_manager::instance().is_enabled()) {
        ss << (sec>0.5? "[\033[31;1m!\033[0m]":"[\033[32;1m-\033[0m]");
        ss << "[" << (sec>0.5? "\033[31;1m":"\033[32;1m");
        ss << std::setw(8) << sec*1000 << " ms\033[0m]";
    } else {
        ss << (sec>0.5? "[!]":"[-]");
        ss << "[" << std::setw(8) << sec*1000 << " ms]";
    }
    return ss.str();
}

std::string tohex(char c) {
    std::string tmp = "";
    tmp += "0123456789abcdef"[(c & 0xf0) >> 4];
    tmp += "0123456789abcdef"[c & 0x0f];
    return tmp;
}

std::string tohex(size_t num) {
    std::stringstream ss;
    ss << std::hex << num << std::dec;
    return ss.str();
}

std::string rightpad(std::string s, size_t len) {
    while (s.length()<len) {
        s += " ";
    }
    return s;
}

std::string leftpad(std::string s, size_t len) {
    while (s.length()<len) {
        s = s + " ";
    }
    return s;
}

std::string tolower(const std::string& s) {
    std::string res = s;
    std::transform(res.begin(), res.end(), res.begin(), ::tolower);
    return res;
}

std::string indentation(uint32_t num) {
    std::string res = "";
    res.resize(std::to_string(num).length(), ' ');
    return res;
}

int64_t to_int64(const std::string& s) {
    int64_t res = 0;
    // hex number
    if (s.find('x')!=std::string::npos || s.find('X')!=std::string::npos) {
        for (auto c : s.substr(2)) {
            int64_t tmp = std::isdigit(c)? c - '0': std::tolower(c) - 'a' + 10;
            res = res * 16 + tmp; 
        }
        return res;
    }
    // dec number
    for (auto c : s) {
        res = res * 10 + (c - '0');
    }
    return res;
}

float to_float(const std::string& s) {
    float res = 0;
    uint64_t index = 0;
    while (s[index] != '.') {
        res = res * 10 + (s[index] - '0');
        index ++;
    }
    index ++;
    float tmp = 0.1;
    while (index < s.length()) {
        res += tmp * (s[index] - '0');
        tmp *= 0.1;
        index ++;
    }
    return res;
}

size_t levenshtein_distance(const std::string& left, const std::string& right) {
    std::vector<size_t> v0;
    std::vector<size_t> v1;

    size_t left_len = left.length();
    size_t right_len = right.length();
    v0.resize(right_len);
    v1.resize(right_len);

    for(size_t i = 0; i < right_len; i++) {
        v0[i] = i;
    }
    for(size_t i = 1; i < left_len; i++) {
        v1[0] = i;
        for(size_t j = 1; j < right_len; j++) {
            size_t deletion = v0[j] + 1;
            size_t insertion = v1[j - 1] + 1;
            size_t substitution = v0[j - 1] + ((left[i]==right[j])? 0 : 1);
            v1[j] = std::min({deletion, insertion, substitution});
        }
        v0 = v1;
    }

    return v0.back();
}

void time_stamp::stamp() {
    start = std::chrono::high_resolution_clock::now();
}

double time_stamp::duration() const {
    auto end = std::chrono::high_resolution_clock::now();
    return std::chrono::duration<double>(end - start).count();
}

}