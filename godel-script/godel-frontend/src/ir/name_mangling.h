#pragma once

#include <cstring>
#include <sstream>

namespace godel {

bool starts_with(const std::string&, const std::string&);

std::string mangle(const std::string&);
std::string field_mangle(const std::string&);
std::string type_mangle(const std::string&);
std::string rule_mangle(const std::string&);

}