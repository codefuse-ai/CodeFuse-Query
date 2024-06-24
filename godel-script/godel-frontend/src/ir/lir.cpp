#include "godel-frontend/src/ir/lir.h"

#include <cassert>
#include <ostream>
#include <iostream>

namespace godel {

std::string replace_colon(const std::string& input) {
    auto result = input;
    auto colon_pos = result.find(':');
    while(colon_pos!=std::string::npos) {
        result.replace(colon_pos, 1, "_");
        colon_pos = result.find(':', colon_pos+1);
    }
    return result;
}

namespace lir {

std::ostream& operator<<(std::ostream& os, const inst_value_t& ivt) {
    os << ivt.content;
    return os;
}

void inst_visitor::visit_block(block* i) {
    for(auto s : i->get_content()) {
        s->accept(this);
    }
}

void inst_visitor::visit_not_operand(not_operand* i) {
    i->get_body()->accept(this);
}

void inst_visitor::visit_or_operand(or_operand* i) {
    i->get_left_block()->accept(this);
    i->get_right_block()->accept(this);
}

void inst_visitor::visit_and_operand(and_operand* i) {
    i->get_left_block()->accept(this);
    i->get_right_block()->accept(this);
}

void inst_visitor::visit_aggregator(aggregator* i) {
    i->get_body()->accept(this);
}

void boolean::dump(std::ostream& os, const std::string& indent) const {
    os << indent << (flag? "1 = 1":"1 = 0");
}

void store::dump(std::ostream& os, const std::string& indent) const {
    os << indent << destination << " = " << source;
}

void call::generate_key_cmp(std::ostream& os) const {
    if (function_name=="key_eq") {
        os << arguments[0] << " = " << arguments[1];
    } else {
        os << arguments[0] << " != " << arguments[1];
    }
}

void call::generate_schema_to_set(std::ostream& os) const {
    os << destination << " = " << arguments[0];
}

void call::generate_database_load(std::ostream& os) const {
    os << destination << " = " << arguments[0];
}

void call::generate_int_basic_method(std::ostream& os) const {
    switch(int_basic_methods.at(function_name)) {
        case int_method_kind::int_add:
            os << destination << " = " << arguments[0] << " + " << arguments[1];
            break;
        case int_method_kind::int_sub:
            os << destination << " = " << arguments[0] << " - " << arguments[1];
            break;
        case int_method_kind::int_div:
            os << destination << " = " << arguments[0] << " / " << arguments[1];
            break;
        case int_method_kind::int_mul:
            os << destination << " = " << arguments[0] << " * " << arguments[1];
            break;
        case int_method_kind::int_rem:
            os << destination << " = " << arguments[0] << " % " << arguments[1];
            break;
        case int_method_kind::int_pow:
            os << destination << " = " << arguments[0] << " ^ " << arguments[1];
            break;
        case int_method_kind::int_bitand:
            os << destination << " = " << arguments[0] << " band " << arguments[1];
            break;
        case int_method_kind::int_bitor:
            os << destination << " = " << arguments[0] << " bor " << arguments[1];
            break;
        case int_method_kind::int_bitxor:
            os << destination << " = " << arguments[0] << " bxor " << arguments[1];
            break;
        case int_method_kind::int_bitnot:
            os << destination << " = bnot " << arguments[0]; break;
        case int_method_kind::int_neg:
            os << destination << " = - " << arguments[0]; break;
        case int_method_kind::int_eq:
            os << arguments[1] << " = " << arguments[0]; break;
        case int_method_kind::int_ne:
            os << arguments[1] << " != " << arguments[0]; break;
        case int_method_kind::int_lt:
            os << arguments[1] << " < " << arguments[0]; break;
        case int_method_kind::int_le:
            os << arguments[1] << " <= " << arguments[0]; break;
        case int_method_kind::int_gt:
            os << arguments[1] << " > " << arguments[0]; break;
        case int_method_kind::int_ge:
            os << arguments[1] << " >= " << arguments[0]; break;
        case int_method_kind::int_to_string:
            os << destination << " = to_string(" << arguments[0] << ")"; break;
        case int_method_kind::int_to_set:
            os << destination << " = " << arguments[0]; break;
    }
}

void call::generate_string_basic_method(std::ostream& os) const {
    switch(string_basic_methods.at(function_name)) {
        case string_method_kind::string_substr:
            os << destination << " = substr(";
            os << arguments[0] << ", " << arguments[1] << ", " << arguments[2] << ")";
            break;
        case string_method_kind::string_get_regex_match_result:
            os << destination << " = @godel_lang_builtin_string_getMatchResult(";
            os << arguments[0] << ", " << arguments[1] << ", " << arguments[2] << ")";
            break;
        case string_method_kind::string_matches:
            os << "match(";
            os << arguments[1] << ", " << arguments[0] << ")";
            break;
        case string_method_kind::string_contains:
            os << "contains(";
            os << arguments[1] << ", " << arguments[0] << ")";
            break;
        case string_method_kind::string_add:
            os << destination << " = cat(";
            os << arguments[0] << ", " << arguments[1] << ")";
            break;
        case string_method_kind::string_len:
            os << destination << " = strlen(" << arguments[0] << ")"; break;
        case string_method_kind::string_to_int:
            os << destination << " = to_number(" << arguments[0] << ")"; break;
        case string_method_kind::string_eq:
            os << arguments[1] << " = " << arguments[0]; break;
        case string_method_kind::string_ne:
            os << arguments[1] << " != " << arguments[0]; break;
        case string_method_kind::string_to_set:
            os << destination << " = " << arguments[0]; break;
        case string_method_kind::string_to_upper:
            os << destination << " = @godel_lang_builtin_string_to_upper(";
            os << arguments[0] << ")";
            break;
        case string_method_kind::string_to_lower:
            os << destination << " = @godel_lang_builtin_string_to_lower(";
            os << arguments[0] << ")";
            break;
        case string_method_kind::string_replace_all:
            os << destination << " = @godel_lang_builtin_string_replace_all(";
            os << arguments[0] << ", " << arguments[1] << ", " << arguments[2] << ")";
            break;
        case string_method_kind::string_replace_once:
            os << destination << " = @godel_lang_builtin_string_replace_once(";
            os << arguments[0] << ", " << arguments[1] << ", ";
            os << arguments[2] << ", " << arguments[3] << ")";
            break;
    }
}

void call::generate_basic_method(std::ostream& os) const {
    if (int_basic_methods.count(function_name)) {
        generate_int_basic_method(os);
        return;
    }
    if (string_basic_methods.count(function_name)) {
        generate_string_basic_method(os);
        return;
    }

    std::cerr << "unimplemented basic method: " << function_name;
    std::cerr << ", please report a bug to us.\n";
    assert(false && "unimplemented");
}

void call::generate_basic_static(std::ostream& os) const {
    // record undetermined variable, use singleton in souffle
    static size_t undetermined_all_counter = 0;

    if (function_name=="int::range") {
        os << destination << " = range(";
        os << arguments[0] << ", " << arguments[1] << ")";
        return;
    }
    if (function_name=="int::__undetermined_all__" ||
        function_name=="string::__undetermined_all__") {
        os << destination << " = __undetermined_all__";
        os << undetermined_all_counter;
        undetermined_all_counter++;
        return;
    }

    std::cerr << "unimplemented basic static: " << function_name;
    std::cerr << ", please report a bug to us.\n";
    assert(false && "unimplemented");
}

void call::generate_find(std::ostream& os) const {
    // only `*T.find` is generated here, others are handled in lir::aggregator
    //
    // class_instance_set.find(class_or_interface_instance) ->
    //
    // souffle: (
    //    destination = class_instance_set,
    //    class_instance_set = class_or_interface_instance
    // )
    //
    if (function_name=="find") {
        os << "(" << destination << " = " << arguments[0] << ", ";
        os << arguments[0] << " = " << arguments[1] << ")";
        return;
    }

    std::cerr << "unimplemented find method: " << function_name;
    std::cerr << ", please report a bug to us.\n";
    assert(false && "unimplemented");
}

void call::dump(std::ostream& os, const std::string& indent) const {
    os << indent;
    switch(type) {
        case kind::database_load: generate_database_load(os); return;
        case kind::find: generate_find(os); return;
        case kind::key_cmp: generate_key_cmp(os); return;
        case kind::to_set: generate_schema_to_set(os); return;
        case kind::basic_method: generate_basic_method(os); return;
        case kind::basic_static: generate_basic_static(os); return;
        default: break;
    }

    // normal function and method call
    os << replace_colon(function_name) << "(";
    if (destination.content.size()) {
        os << destination << (arguments.size()? ", ":"");
    }
    size_t s = arguments.size();
    size_t c = 0;
    for(const auto& i : arguments) {
        os << i;
        c++;
        if (c!=s) {
            os << ", ";
        }
    }
    os << ")";
}

void constructor::dump(std::ostream& os, const std::string& indent) const {
    os << indent << "schema_" << replace_colon(schema_name);
    os << "(" << destination << ", _" << (fields_value.size()? ", ":"");

    size_t s = fields_value.size();
    size_t c = 0;
    for(const auto& i : fields_value) {
        os << i;
        c++;
        if (c!=s) {
            os << ", ";
        }
    }
    os << ")";
}

void record::dump(std::ostream& os, const std::string& indent) const {
    os << indent << destination << " = " << "[";

    size_t s = fields_value.size();
    size_t c = 0;
    for(const auto& i : fields_value) {
        os << i;
        c++;
        if (c!=s) {
            os << ", ";
        }
    }
    os << "]";
}

void unary::dump(std::ostream& os, const std::string& indent) const {
    os << indent << destination << " = ";
    switch(operand) {
        case kind::op_neg: os << "-"; break;
        default: assert(false && "unreachable"); break;
    }
    os << " " << source ;
}

void binary::dump(std::ostream& os, const std::string& indent) const {
    os << indent<< destination << " = ";
    os << left << " ";
    switch(operator_kind) {
        case kind::op_add: os << "+"; break;
        case kind::op_sub: os << "-"; break;
        case kind::op_mul: os << "*"; break;
        case kind::op_div: os << "/"; break;
        default: assert(false && "unreachable"); break;
    }
    os << " " << right;
}

void compare::dump(std::ostream& os, const std::string& indent) const {
    os << indent << left << " ";
    switch(operator_kind) {
        case kind::op_eq: os << "="; break;
        case kind::op_neq: os << "!="; break;
        case kind::op_gt: os << ">"; break;
        case kind::op_ge: os << ">="; break;
        case kind::op_lt: os << "<"; break;
        case kind::op_le: os << "<="; break;
        default: assert(false && "unreachable"); break;
    }
    os << " " << right;
}

void block::dump(std::ostream& os, const std::string& indent) const {
    if (content.empty()) {
        os << indent << "(1 = 1)";
        return;
    }
    // only one statement in the block, dump without curves
    if (content.size()==1) {
        content[0]->dump(os, indent);
        return;
    }
    // multiple statements
    os << indent << "(\n";
    for(auto i : content) {
        i->dump(os, indent + "  ");
        if (i!=content.back()) {
            os << (flag_use_semi? ";":",");
        }
        os << "\n";
    }
    os << indent << ")";
}

void fact::dump(std::ostream& os, const std::string& indent) const {
    os << indent << "(";
    size_t s = literals.size();
    size_t c = 0;
    for(const auto& i : literals) {
        os << i.first << " = " << i.second;
        c++;
        if (c!=s) {
            os << ", ";
        }
    }
    os << ")";
}

void not_operand::dump(std::ostream& os, const std::string& indent) const {
    // only one statement in the block
    if (body->get_content().size()==1) {
        os << indent << "!(";
        body->get_content()[0]->dump(os, "");
        os << ")";
        return;
    }
    // multiple statements
    os << indent << "!(\n";
    for(auto i : body->get_content()) {
        i->dump(os, indent + "  ");
        if (i!=body->get_content().back()) {
            os << ",\n";
        } else {
            os << "\n";
        }
    }
    os << indent << ")";
}

void and_operand::dump(std::ostream& os, const std::string& indent) const {
    os << indent << "(\n";
    left->dump(os, indent + "  ");
    os << ",\n"; // `,` means `and`
    right->dump(os, indent + "  ");
    os << "\n" << indent << ")";
}

void or_operand::dump(std::ostream& os, const std::string& indent) const {
    os << indent << "(\n";
    left->dump(os, indent + "  ");
    os << ";\n"; // `;` means `or`
    right->dump(os, indent + "  ");
    os << "\n" << indent << ")";
}

void aggregator::dump(std::ostream& os, const std::string& indent) const {
    os << indent;
    os << destination << " = ";
    if (aggregate_name=="len") {
        os << "count ";
    } else {
        os << aggregate_name << " ";
    }
    if (source.content.length()) {
        os << source;
    }
    os << ": {\n";
    body->dump(os, indent + "  ");
    os << "\n" << indent << "}";
}

}
}