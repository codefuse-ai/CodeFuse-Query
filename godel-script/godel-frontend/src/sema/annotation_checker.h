#pragma once

#include "godel-frontend/src/symbol.h"

#include <cstring>
#include <sstream>
#include <unordered_map>
#include <unordered_set>

namespace godel {

enum class annot_kind {
    none_property,   // do not need property string
    single_property, // need single property string
    property_map     // need map of properties
};

class input_annotation_checker {
private:
    inline static const std::unordered_set<std::string> supported_formats = {
        "\"json\"", "\"sqlite\"", "\"csv\""
    };

public:
    static void check(report::error&, const annot&);
};

class output_annotation_checker {
private:
    inline static const std::unordered_set<std::string>  supported_formats = {
        "\"stdout\"", "\"json\"", "\"sqlite\"", "\"csv\""
    };

public:
    static void check(report::error&, const annot&);
};

class annotation_checker {
private:
    // valid annotations used on schema fields
    // second marks if property string is needed
    const std::unordered_map<std::string, annot_kind> schema_field_annotation = {
        {"@primary", annot_kind::none_property}
    };

    // valid annotations used on functions
    // second marks if property string is needed
    const std::unordered_map<std::string, annot_kind> function_annotation = {
        {"@data_constraint", annot_kind::none_property},
        {"@self_typecheck_free", annot_kind::none_property},
        {"@inline", annot_kind::none_property},
        {"@cache", annot_kind::none_property}
    };

    // deprecated annotations
    const std::unordered_set<std::string> deprecated_annotation = {};

    // deprecated annotation, but do not report warning or error
    const std::unordered_set<std::string> deprecated_no_warning = {
        "@data_constraint"
    };

public:
    bool is_input_annotation(const std::string& annotation) const {
        return annotation == "@input";
    }
    bool is_output_annotation(const std::string& annotation) const {
        return annotation == "@output";
    }

public:
    // singleton
    static annotation_checker* instance();
    bool is_valid_schema_field_annotation(const std::string&) const;
    bool is_valid_function_annotation(const std::string&) const;
    bool is_deprecated_annotation(const std::string&) const;
    bool is_deprecated_no_warning(const std::string&) const;
    bool need_property_string(const std::string&) const;
    bool need_property_map(const std::string&) const;
};

}