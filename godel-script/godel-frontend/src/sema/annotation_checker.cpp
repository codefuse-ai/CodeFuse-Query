#include "godel-frontend/src/sema/annotation_checker.h"

namespace godel {

void input_annotation_checker::check(report::error& err, const annot& annotation) {
    if (annotation.property_map.empty()) {
        err.err(annotation.location,
            "properties \"format\" and \"file\" are needed.",
            "expected format: @input(format=\"<format>\", file=\"<filename>\")"
        );
        return;
    }

    if (!annotation.property_map.count("format")) {
        err.err(annotation.location,
            "property \"format\" is needed.",
            "expected format: @input(format=\"<format>\", file=\"<filename>\")"
        );
        return;
    }
    if (!annotation.property_map.count("file")) {
        err.err(annotation.location,
            "property \"file\" is needed.",
            "expected format: @input(format=\"<format>\", file=\"<filename>\")"
        );
        return;
    }

    const auto& format = annotation.property_map.at("format");
    if (!supported_formats.count(format)) {
        err.err(annotation.location,
            "format " + format + " is not supported.",
            "support \"json\", \"sqlite\", \"csv\"."
        );
    }

    for(const auto& i : annotation.property_map) {
        if (i.first != "format" && i.first != "file") {
            err.err(annotation.location,
                "unknown property \"" + i.first + "\".",
                "only support \"format\" and \"file\"."
            );
            return;
        }
    }
}

void output_annotation_checker::check(report::error& err, const annot& annotation) {
    // correct annotation `@output`
    if (annotation.property.empty() && annotation.property_map.empty()) {
        return;
    }

    if (annotation.property.length()) {
        err.warn(annotation.location,
            "property string is not needed here.",
            "ignored."
        );
    }

    if (annotation.property_map.empty()) {
        return;
    }

    if (!annotation.property_map.count("format")) {
        err.err(annotation.location,
            "property \"format\" is needed.",
            "expected format: @output(format=\"<format>\", [file=\"<filename>\"])"
        );
        return;
    }

    const auto& format = annotation.property_map.at("format");
    if (!supported_formats.count(format)) {
        err.err(annotation.location,
            "format " + format + " is not supported.",
            "support \"stdout\", \"json\", \"sqlite\", \"csv\"."
        );
        return;
    }

    if (format == "\"stdout\"" && annotation.property_map.count("file")) {
        err.err(annotation.location,
            "property \"file\" is not needed for \"stdout\"."
        );
        return;
    }

    if (format != "\"stdout\"" && !annotation.property_map.count("file")) {
        err.err(annotation.location,
            "property \"file\" is needed for non-stdout format.",
            "expected format: @output(format=\"<format>\", file=\"<filename>\")"
        );
        return;
    }

    for(const auto& i : annotation.property_map) {
        if (i.first != "format" && i.first != "file") {
            err.err(annotation.location,
                "unknown property \"" + i.first + "\".",
                "only support \"format\" and \"file\"."
            );
            return;
        }
    }
}

annotation_checker* annotation_checker::instance() {
    static annotation_checker checker;
    return &checker;
}

bool annotation_checker::is_valid_schema_field_annotation(const std::string& annotation) const {
    return schema_field_annotation.count(annotation);
}

bool annotation_checker::is_valid_function_annotation(const std::string& annotation) const {
    return function_annotation.count(annotation) ||
           is_input_annotation(annotation) ||
           is_output_annotation(annotation);
}

bool annotation_checker::is_deprecated_annotation(const std::string& annotation) const {
    return deprecated_annotation.count(annotation);
}

bool annotation_checker::is_deprecated_no_warning(const std::string& annotation) const {
    return deprecated_no_warning.count(annotation);
}

bool annotation_checker::need_property_string(const std::string& annotation) const {
    if (function_annotation.count(annotation)) {
        return function_annotation.at(annotation)==annot_kind::single_property;
    }
    if (schema_field_annotation.count(annotation)) {
        return schema_field_annotation.at(annotation)==annot_kind::single_property;
    }
    return false;
}

bool annotation_checker::need_property_map(const std::string& annotation) const {
    if (function_annotation.count(annotation)) {
        return function_annotation.at(annotation)==annot_kind::property_map;
    }
    if (schema_field_annotation.count(annotation)) {
        return schema_field_annotation.at(annotation)==annot_kind::property_map;
    }
    return false;
}

}