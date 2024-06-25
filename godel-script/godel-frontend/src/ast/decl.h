#pragma once

#include "godel-frontend/src/ast/ast_node.h"
#include "godel-frontend/src/ast/expr.h"
#include "godel-frontend/src/ast/stmt.h"

#include <cstdint>
#include <cstring>
#include <sstream>
#include <vector>

namespace godel {

// decl class
class decl: public ast_node {
public:
    decl(const decl&) = delete;
    decl& operator=(const decl&) = delete;

public:
    decl(ast_class ast_class, const span &location):
        ast_node(ast_class, location) {}
    virtual ~decl() override = default;
    void accept(ast_visitor* visitor) override;
}; // end class decl


// decl class annotation
class annotation: public decl {
public:
    annotation(const annotation&) = delete;
    annotation& operator=(const annotation&) = delete;

private:
    /* the name/content of annotation */
    std::string annotation_content;

    /* be aware that if writing @annot("") */
    /* the string literal here is not "" but "\"\"" */
    /* so it is still not empty */
    std::string property_string;

    /* map of properties, for example @annot(a = "xxx", b = "xxx") */
    std::vector<std::pair<std::string, std::string>> ordered_properties;

public:
    annotation(const span& location, const std::string& content):
        decl(ast_class::ac_annotation, location),
        annotation_content(content),
        property_string(""),
        ordered_properties({}) {}
    ~annotation() override = default;
    void set_property_string(const std::string& s) { property_string = s; }
    void add_property(const std::string& key, const std::string& value) {
        ordered_properties.push_back({key, value});
    }

    const auto& get_annotation() const { return annotation_content; }
    const auto& get_property_string() const { return property_string; }
    const auto& get_ordered_properties() const { return ordered_properties; }

    void accept(ast_visitor* visitor) override;
}; // end class annotation


// decl class type_def
class type_def: public decl {
public:
    type_def(const type_def&) = delete;
    type_def& operator=(const type_def&) = delete;

private:
    bool flag_is_set;
    std::vector<std::string> name_path;

public:
    type_def(const span& location):
        decl(ast_class::ac_type_def, location),
        flag_is_set(false), name_path({}) {}
    type_def(const span& location, const std::string& name):
        decl(ast_class::ac_type_def, location),
        flag_is_set(false), name_path({name}) {}
    ~type_def() override = default;

    void set_dataset_flag(bool f) { flag_is_set = f; }
    bool is_set() const { return flag_is_set; }
    bool is_full_path() const { return name_path.size() > 1; }
    void add_path(const std::string& path) { name_path.push_back(path); }

    std::string get_full_name() const {
        std::string type_name = "";
        for(const auto& i : name_path) {
            type_name += i + "::";
        }
        if (type_name.length()) {
            type_name = type_name.substr(0, type_name.length() - 2);
        }
        return type_name;
    }

    const std::string& get_short_name() const {
        return name_path.back();
    }

    std::string get_path() const {
        if (!name_path.size()) {
            return "";
        }
        std::string path = "";
        for(size_t i = 0; i < name_path.size() - 1; i++) {
            path += name_path[i] + "::";
        }
        if (path.length()) {
            path = path.substr(0, path.length() - 2);
        }
        return path;
    }

    void accept(ast_visitor* visitor) override;
}; // end class type_def


// decl class database_table
class database_table: public decl {
public:
    database_table(const database_table&) = delete;
    database_table& operator=(const database_table&) = delete;

private:
    identifier* name;
    type_def* type_name;
    string_literal* as_name;

public:
    database_table(const span& location):
        decl(ast_class::ac_database_table, location),
        name(nullptr), type_name(nullptr), as_name(nullptr) {}
    ~database_table() override;
    void set_name(identifier* node) { name = node; }
    void set_type(type_def* node) { type_name = node; }
    void set_real_name(string_literal* node) { as_name = node; }

    identifier* get_name() { return name; }
    type_def* get_type() { return type_name; }
    bool has_real_name() const { return as_name!=nullptr; }
    string_literal* get_real_name() { return as_name; }

    void accept(ast_visitor* visitor) override;
}; // end class database_table


// decl class database_decl
class database_decl: public decl {
public:
    database_decl(const database_decl&) = delete;
    database_decl& operator=(const database_decl&) = delete;

private:
    identifier* name;
    std::vector<database_table*> tables;

public:
    database_decl(const span& location):
        decl(ast_class::ac_database_decl, location),
        name(nullptr) {}
    ~database_decl() override;
    void set_name(identifier* node) { name = node; }
    void add_table(database_table* node) { tables.push_back(node); }

    identifier* get_name() { return name; }
    auto& get_tables() { return tables; }

    void accept(ast_visitor* visitor) override;
}; // end class database_decl


// decl class schema_field
class schema_field: public decl {
public:
    schema_field(const schema_field&) = delete;
    schema_field& operator=(const schema_field&) = delete;

private:
    annotation* anno;
    identifier* name;
    type_def* type_name;

public:
    schema_field(const span& location):
        decl(ast_class::ac_schema_field, location),
        anno(nullptr), name(nullptr), type_name(nullptr) {}
    ~schema_field() override;
    void set_annotation(annotation* node) { anno = node; }
    void set_identifier(identifier* node) { name = node; }
    void set_field_type(type_def* node) { type_name = node; }

    annotation* get_annotation() { return anno; }
    identifier* get_identifier() { return name; }
    type_def* get_field_type() { return type_name; }

    void accept(ast_visitor* visitor) override;
}; // end class schema_field


// decl class schema_decl
class schema_decl: public decl {
public:
    schema_decl(const schema_decl&) = delete;
    schema_decl& operator=(const schema_decl&) = delete;

private:
    identifier* name;
    type_def* parent_name;
    std::vector<schema_field*> pairs;

public:
    schema_decl(const span& location):
        decl(ast_class::ac_schema_decl, location),
        name(nullptr), parent_name(nullptr) {}
    ~schema_decl() override;
    void set_name(identifier* node) { name = node; }
    void set_parent_name(type_def* node) { parent_name = node; }
    void add_field(schema_field* node) { pairs.push_back(node); }

    identifier* get_name() { return name; }
    bool has_parent() const { return parent_name!=nullptr; }
    type_def* get_parent_name() { return parent_name; }
    auto& get_fields() { return pairs; }

    void accept(ast_visitor* visitor) override;
}; // end class schema_decl


// decl class function_decl
class function_decl: public decl {
public:
    function_decl(const function_decl&) = delete;
    function_decl& operator=(const function_decl&) = delete;

private:
    std::vector<annotation*> annotations;
    identifier* name;
    std::vector<var_decl*> param;
    type_def* return_type;
    block_stmt* block;
    bool is_public_flag;

    // maybe used in ungrounded check pass and codegen, for optimization
    bool can_disable_self_check;

public:
    function_decl(const span& location):
        decl(ast_class::ac_function_decl, location),
        name(nullptr), return_type(nullptr),
        block(nullptr), is_public_flag(false),
        can_disable_self_check(false) {}
    ~function_decl() override;
    void add_annotation(annotation* node) { annotations.push_back(node); }
    void set_name(identifier* node) { name = node; }
    void add_parameter(var_decl* node) { param.push_back(node); }
    void set_return_type(type_def* node) { return_type = node;}
    void set_code_block(block_stmt* node) { block = node; }
    void set_public() { is_public_flag = true; }
    void set_can_disable_self_check(bool flag) { can_disable_self_check = flag; }

    auto& get_annotations() { return annotations; }
    identifier* get_name() { return name; }
    auto& get_parameter_list() { return param; }
    bool has_return_value() const { return return_type!=nullptr; }
    type_def* get_return_type() { return return_type; }
    block_stmt* get_code_block() { return block; }
    bool implemented() const { return block!=nullptr; }
    bool is_public() const { return is_public_flag; }
    bool can_disable_self_check_flag() const { return can_disable_self_check; }

    void accept(ast_visitor* visitor) override;
}; // end class function_decl


// decl class enum_decl
class enum_decl: public decl {
public:
    enum_decl(const enum_decl&) = delete;
    enum_decl& operator=(const enum_decl&) = delete;

private:
    identifier* name;
    std::vector<identifier*> member;

public:
    enum_decl(const span& location):
        decl(ast_class::ac_enum_decl, location),
        name(nullptr) {}
    ~enum_decl() override;
    void set_name(identifier* node) { name = node; }
    void add_member(identifier* node) { member.push_back(node); }

    identifier* get_name() { return name; }
    auto& get_member() { return member; }

    void accept(ast_visitor* visitor) override;
}; // end class enum_decl


// decl class var_decl
class var_decl: public decl {
public:
    var_decl(const var_decl&) = delete;
    var_decl& operator=(const var_decl&) = delete;

private:
    identifier* name;
    type_def* type_name;
    expr* init_value;

public:
    var_decl(const span& location):
        decl(ast_class::ac_var_decl, location),
        name(nullptr), type_name(nullptr), init_value(nullptr) {}
    ~var_decl() override;
    void set_var_name(identifier* node) { name = node; }
    void set_type(type_def* node) { type_name = node; }
    void set_init_value(expr* node) { init_value = node; }

    bool has_declared_type() const { return type_name!=nullptr; }
    bool has_init_value() const { return init_value!=nullptr; }
    identifier* get_var_name() { return name; }
    type_def* get_type() { return type_name; }
    expr* get_init_value() { return init_value; }

    void accept(ast_visitor* visitor) override;
}; // end class var_decl


// decl class impl_block
class impl_block: public decl {
public:
    impl_block(const impl_block&) = delete;
    impl_block& operator=(const impl_block&) = delete;

private:
    identifier* impl_schema_name;
    std::vector<function_decl*> method;

public:
    impl_block(const span& location):
        decl(ast_class::ac_impl_block, location),
        impl_schema_name(nullptr) {}
    ~impl_block() override;
    void set_impl_schema_name(identifier* node) { impl_schema_name = node; }
    void add_function(function_decl* node) { method.push_back(node); }

    identifier* get_impl_schema_name() { return impl_schema_name; }
    auto& get_functions() { return method; }

    void accept(ast_visitor* visitor) override;
}; // end class impl_block

// decl class query_column
class query_column: public decl {
public:
    query_column(const query_column&) = delete;
    query_column& operator=(const query_column&) = delete;

private:
    identifier* column_name;
    expr* column_value;

public:
    query_column(const span& location):
        decl(ast_class::ac_query_column, location),
        column_name(nullptr), column_value(nullptr) {}
    ~query_column() override;
    void set_column_name(identifier* node) { column_name = node; }
    void set_column_value(expr* node) { column_value = node; }

    bool has_column_name() const { return column_name != nullptr; }
    identifier* get_column_name() { return column_name; }
    expr* get_column_value() { return column_value; }

    void accept(ast_visitor* visitor) override;
}; // end class query_column

// decl class query_decl
class query_decl: public decl {
public:
    query_decl(const query_decl&) = delete;
    query_decl& operator=(const query_decl&) = delete;

private:
    identifier* query_name;
    std::vector<var_decl*> from_list;
    expr* where_condition;
    std::vector<query_column*> select_list;

public:
    query_decl(const span& location):
        decl(ast_class::ac_query_decl, location),
        query_name(nullptr),
        where_condition(nullptr) {}
    ~query_decl() override;
    void set_name(identifier* node) { query_name = node; }
    void add_var_decl(var_decl* node) { from_list.push_back(node); }
    void set_condition(expr* node) { where_condition = node; }
    void add_output_column(query_column* node) { select_list.push_back(node); }

    bool has_condition() const { return where_condition != nullptr; }
    identifier* get_name() { return query_name; }
    auto& get_from_list() { return from_list; }
    expr* get_where_condition() { return where_condition; }
    auto& get_select_list() { return select_list; }

    void accept(ast_visitor* visitor) override;
}; // end class query_decl

} // end namespace godel