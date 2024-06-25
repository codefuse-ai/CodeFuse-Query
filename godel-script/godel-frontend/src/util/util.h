#pragma once

#include <cstring>
#include <sstream>
#include <chrono>
#include <cstdint>

namespace util {

class color_manager {
private:
    bool flag_enable_color = true;

public:
    static color_manager& instance() {
        static color_manager instance;
        return instance;
    }
    void disable() {
        flag_enable_color = false;
    }
    void enable() {
        flag_enable_color = true;
    }
    bool is_enabled() const {
        return flag_enable_color;
    }
};

void enable_color_off_mode();

std::ostream& red(std::ostream&);
std::ostream& green(std::ostream&);
std::ostream& white(std::ostream&);
std::ostream& cyan(std::ostream&);
std::ostream& yellow(std::ostream&);
std::ostream& grey(std::ostream&);
std::ostream& purple(std::ostream&);
std::ostream& reset(std::ostream&);

std::ostream& light_red(std::ostream&);
std::ostream& light_green(std::ostream&);
std::ostream& light_cyan(std::ostream&);
std::ostream& light_yellow(std::ostream&);
std::ostream& light_grey(std::ostream&);
std::ostream& light_purple(std::ostream&);

std::string generate_version_from_time_macro(const char*);

std::string format_time(double);

// convert character to hex (without "0x"), example: A -> "41"
std::string tohex(char);

// convert size_t number to hex mode
std::string tohex(size_t);

std::string rightpad(std::string, size_t);

std::string leftpad(std::string, size_t);

std::string tolower(const std::string&);

// get a number and generate indentation by the length of the string of the number
std::string indentation(uint32_t);

int64_t to_int64(const std::string&);

float to_float(const std::string&);

size_t levenshtein_distance(const std::string&, const std::string&);

// make time stamp and record running duration
class time_stamp {
private:
    std::chrono::high_resolution_clock::time_point start;

public:
    // make a stamp
    void stamp();
    // get second
    double duration() const;
};

}