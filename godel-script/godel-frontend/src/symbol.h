#pragma once

#include "godel-frontend/src/error/error.h"
#include "godel-frontend/src/util/util.h"
#include "godel-frontend/src/package/package.h"

#include <iostream>
#include <cstring>
#include <sstream>
#include <unordered_map>
#include <unordered_set>

namespace godel {

using report::span;

enum class symbol_kind: uint8_t {
    null,
    basic,
    enumerate,
    schema,
    database,
    function,
    query,
    package
};

// stores annotation for function declarations
struct annot {
    std::string annotation_name = "";
    std::string property = "";
    std::unordered_map<std::string, std::string> property_map = {};
    span location = span::null();

public:
    annot() = default;
    annot(const annot&) = default;
    annot(annot&&) = default;

public:
    annot& operator=(const annot&) = default;
    bool operator==(const annot& other) const {
        return this->annotation_name == other.annotation_name &&
               this->property == other.property;
    }
};

struct symbol {
public:
    // symbol's type name, in simple way (not full path)
    std::string type_name;

    // symbol's type definition location
    span type_loc;

    // the location of variable that is this symbol type
    span location = span::null();

public:
    // set type mark
    bool is_set = false;

    // used when as schema field
    bool primary = false;

public:
    bool is_err() const { return type_name == "<error>"; }
    bool is_null() const { return type_name == "<null>"; }
    bool is_any() const { return type_name == "<any>"; }
    bool is_all_data() const { return type_name == "<__all_data__>"; }

    bool operator==(const symbol& another) const {
        return type_name == another.type_name &&
               type_loc.file == another.type_loc.file;
    }

    bool operator!=(const symbol& another) const {
        return type_name != another.type_name ||
               type_loc.file != another.type_loc.file;
    }

public:
    friend std::ostream& operator<<(std::ostream& out, const symbol& sym) {
        out << sym.full_path_name();
        return out;
    }

    std::string to_json(bool with_location = true) const {
        auto res = "{\"name\":\"" + type_name +
                   "\",\"is_set\":\"" + (is_set? "true":"false") + "\"";
        if (with_location) {
            res += ",\"type_loc\":" + type_loc.to_json();
        }
        res += "}";
        return res;
    }

    // get full path name of the symbol
    std::string full_path_name() const {
        auto res = package::godel_module::instance()->find_module_by_file(type_loc.file);
        res += (res.length()? "::":"") + type_name;
        return is_set? "*" + res:res;
    }

    // get full path name of the symbol without set mark
    std::string full_path_name_without_set() const {
        auto res = package::godel_module::instance()->find_module_by_file(type_loc.file);
        res += (res.length()? "::":"") + type_name;
        return res;
    }

public:
    static const symbol null() {
        return {
            .type_name = "<null>",
            .type_loc = span::null(),
            .location = span::null()
        };
    }

    static const symbol any() {
        return {
            .type_name = "<any>",
            .type_loc = span::null(),
            .location = span::null()
        };
    }

    static const symbol all_data() {
        return {
            .type_name = "<__all_data__>",
            .type_loc = span::null(),
            .location = span::null()
        };
    }

    static const symbol error() {
        return {
            .type_name = "<error>",
            .type_loc = span::null(),
            .location = span::null()
        };
    }

    static const symbol boolean() {
         return {
            .type_name = "bool",
            .type_loc = span::null(),
            .location = span::null()
        };
    }

    static const symbol i64() {
        return {
            .type_name = "int",
            .type_loc = span::null(),
            .location = span::null()
        };
    }

    static const symbol f64() {
        return {
            .type_name = "float",
            .type_loc = span::null(),
            .location = span::null()
        };
    }

    static const symbol str() {
        return {
            .type_name = "string",
            .type_loc = span::null(),
            .location = span::null()
        };
    }
};

struct infer {
    bool is_global;
    symbol type;

    static const infer null() {
        return {
            .is_global = false,
            .type = symbol::null()
        };
    }

    static const infer any() {
        return {
            .is_global = false,
            .type = symbol::any()
        };
    }

    static const infer all_data() {
        return {
            .is_global = false,
            .type = symbol::all_data()
        };
    }

    static const infer error() {
        return {
            .is_global = false,
            .type = symbol::error()
        };
    }

    static const infer boolean() {
        return {
            .is_global = false,
            .type = symbol::boolean()
        };
    }

    static const infer i64() {
        return {
            .is_global = false,
            .type = symbol::i64()
        };
    }

    static const infer f64() {
        return {
            .is_global = false,
            .type = symbol::f64()
        };
    }

    static const infer str() {
        return {
            .is_global = false,
            .type = symbol::str()
        };
    }
};

struct function {
    // basic info
    std::string name;
    span location;

    // annotations
    std::vector<annot> annotations;

    // parameter info
    std::unordered_map<std::string, symbol> parameter_list;
    std::vector<std::string> ordered_parameter_list;
    
    // return type
    symbol return_type;

    // for aggregator to check input set type
    std::vector<symbol> aggregator_set_type;

    // mark it is implemented
    bool implemented = false;
    // mark it is inherited method
    bool inherit = false;
    // mark it is native method
    bool builtin = false;
    // default private
    bool public_access_authority = false;
    // for generic function
    bool has_generic = false;
    // check if this function is declared in global scope
    bool is_global = false;

public:
    function() = default;
    function(const function&) = default;
    function(function&&) = default;
    function& operator=(const function&) = default;
    function& operator=(function&&) = default;

public:
    // generate native function with public access authority
    static function build_native(
        const std::string&,
        std::initializer_list<std::pair<std::string, symbol>>,
        symbol,
        bool
    );

public:
    bool has_annotation_name(const std::string& str) const {
        for(const auto& i : annotations) {
            if (i.annotation_name == str) {
                return true;
            }
        }
        return false;
    }

    bool has_annotation(const std::string& str,
                        const std::string& property = "") const {
        for(const auto& i : annotations) {
            if (i.annotation_name == str && i.property == property) {
                return true;
            }
        }
        return false;
    }

    bool has_annotation(const annot& anno) const {
        for(const auto& i : annotations) {
            if (anno==i) {
                return true;
            }
        }
        return false;
    }

public:
    friend std::ostream& operator<<(std::ostream& out, const function& func) {
        if (func.public_access_authority) {
            out << "pub ";
        }
        out << "fn " << func.name << "(";
        for(const auto& i : func.ordered_parameter_list) {
            out << i << ": " << func.parameter_list.at(i);
            out << (i==func.ordered_parameter_list.back()? "":", ");
        }
        out << ")";
        if (!func.return_type.is_null()) {
            out << " -> " << func.return_type;
        }
        out << (func.implemented? " {}":";");
        return out;
    }

    std::string to_json(bool with_location = true) const;
};

struct basic {
    std::string name;
    std::unordered_map<std::string, function> natives;

public:
    basic() = default;
    basic(const basic&) = default;
    basic(basic&&) = default;
    basic& operator=(const basic&) = default;
    basic& operator=(basic&&) = default;

public:
    friend std::ostream& operator<<(std::ostream& out, const basic& bs) {
        out << "basic " << bs.name;
        if (!bs.natives.size()) {
            out<<" {}\n";
            return out;
        }
        out<<" {\n";
        for(auto& i : bs.natives) {
            out << "  " << i.second << std::endl;
        }
        out<<"}";
        return out;
    }

    std::string to_json() const;
    std::string fuzzy_search(const std::string&) const;
};

struct enumerate {
    std::string name;
    span location;
    std::unordered_map<std::string, size_t> pairs;

    enumerate() = default ;
    enumerate(const enumerate&) = default;
    enumerate(enumerate&&) = default;
    enumerate& operator=(const enumerate&) = default;
    enumerate& operator=(enumerate&&) = default;

public:
    friend std::ostream& operator<<(std::ostream& out, const enumerate& en) {
        out << "enum " << en.name << " ";
        if (!en.pairs.size()) {
            out << "{}";
            return out;
        }
        std::vector<std::string> ordered_enumerate_member;
        ordered_enumerate_member.resize(en.pairs.size());
        for(const auto& i : en.pairs) {
            ordered_enumerate_member[i.second] = i.first;
        }
        out << "{\n";
        for(size_t i = 0; i < ordered_enumerate_member.size(); ++i) {
            out << "  " << ordered_enumerate_member[i] << ": " << i << std::endl;
        }
        out << "}";
        return out;
    }

    std::string to_json() const;
    std::string fuzzy_search(const std::string&) const;
};

struct schema {
    // schema name
    std::string name;
    // stores definition location
    span location;
    // schema's parent name, full path name
    std::string extends = "";
    // schema's parent pointer
    schema* parent = nullptr;
    // schema's child pointers
    std::vector<schema*> child;

    std::vector<std::string> ordered_fields;
    std::unordered_map<std::string, symbol> fields;
    std::unordered_map<std::string, function> methods;
    std::unordered_map<std::string, function> natives;

    bool self_ref_checked = false;
    bool referenced_by_database_table = false;
    std::string referenced_database_name = "";

public:
    schema() = default;
    schema(const schema&) = default;
    schema(schema&&) = default;
    schema& operator=(const schema&) = default;
    schema& operator=(schema&&) = default;

public:
    bool has_parent() const { return parent; }

    friend std::ostream& operator<<(std::ostream& out, const schema& sc) {
        out << "schema " << sc.name;
        if (sc.has_parent()) {
            out << " extends " << sc.extends;
        }
        if (!sc.fields.size() && !sc.methods.size()) {
            out << " {}";
            return out;
        }
        out << " {\n";
        for(const auto& i : sc.ordered_fields) {
            const auto& type = sc.fields.at(i);
            out << "  " << (type.primary? "@primary ":"");
            out << i << ": " << type << ";\n";
        }
        for(const auto& i : sc.methods) {
            out << "  " << i.second;
            out << (i.second.inherit? " inherit":"") << "\n";
        }
        out << "}";
        return out;
    }

    std::string to_json(bool with_location = true) const;
    std::string fuzzy_search(const std::string&) const;

    bool has_primary_key() const  {
        for(const auto& i : fields) {
            if (i.second.primary) {
                return true;
            }
        }
        return false;
    }

    const std::string& get_primary_key() const {
        static std::string null_result = "";
        for(const auto& i : fields) {
            if (i.second.primary) {
                return i.first;
            }
        }
        return null_result;
    }

    const symbol& get_primary_key_type() const {
        static const auto not_found = symbol::error();

        for(const auto& i : fields) {
            if (i.second.primary) {
                return i.second;
            }
        }

        return not_found;
    }
};

struct database {
    std::string name;
    span location;
    // database tables
    std::unordered_map<std::string, symbol> tables;
    // real table names
    std::unordered_map<std::string, std::string> real_name;
    // static method load
    function load;

public:
    database() = default;
    database(const database&) = default;
    database(database&&) = default;
    database& operator=(const database&) = default;
    database& operator=(database&&) = default;

public:
    friend std::ostream& operator<<(std::ostream& out, const database& db) {
        out << "database " << db.name << " ";
        if (!db.tables.size()) {
            out << "{}";
            return out;
        }
        out << "{\n";
        for(const auto& i : db.tables) {
            out << "  " << i.first << ": " << i.second << "\n";
        }
        out << "  " << db.load << "\n";
        out << "}";
        return out;
    }

    std::string to_json() const;
    std::string fuzzy_search(const std::string&) const;
};

struct query {
    std::string name;
    span location;

    std::unordered_map<std::string, symbol> input_list;
    std::vector<std::string> ordered_input_list;
    std::vector<bool> ordered_input_init_is_set;

    std::unordered_map<std::string, symbol> output_list;
    std::vector<std::string> ordered_output_list;

public:
    friend std::ostream& operator<<(std::ostream& out, const query& qr) {
        out << "query " << qr.name << "from {\n";
        for(const auto& i : qr.input_list) {
            out << "  " << i.first << ": " << i.second << "\n";
        }
        out << "} select {\n";
        for(const auto& i : qr.output_list) {
            out << "  " << i.first << ": " << i.second << "\n";
        }
        out << "}";
        return out;
    }

    std::string to_json() const {
        std::string res = "{\"name\":\"" + name + "\",";
        res += "\"from\":[";
        for(const auto& i : input_list) {
            res += "{\"name\":\"" + i.first + "\",\"type\":" + i.second.to_json() + "},";
        }
        if (res.back()==',') {
            res.pop_back();
        }
        res += "],\"select\":[";
        for(const auto& i : output_list) {
            res += "{\"name\":\"" + i.first + "\",\"type\":" + i.second.to_json() + "},";
        }
        if (res.back()==',') {
            res.pop_back();
        }
        res += "]}";
        return res;
    }
};

struct package_info {
    std::string name;
    std::string domain_name;
    std::unordered_map<std::string, package_info*> child;
};

// namespace for single file
struct domain {
    // mapper for short name -> symbol type
    std::unordered_map<std::string, symbol_kind> type_mapper;

    std::unordered_map<std::string, enumerate> enums;
    std::unordered_map<std::string, schema> schemas;
    std::unordered_map<std::string, database> databases;
    std::unordered_map<std::string, function> functions;
    std::unordered_map<std::string, query> queries;

    // get symbol type by short name
    symbol_kind get_kind_by_short_name(const std::string&) const;
    // fuzzy search symbol
    std::string fuzzy_search(const std::string&) const;
};

// total global symbol table, stores absolute module path
class global_symbol_table {
public:
    // if failed to get symbol's unique id, will return this value
    static const size_t npos = SIZE_MAX;

    struct infer_info {
        report::span location;
        symbol type;
    };

    struct local_info {
        std::string name;
        report::span location;
        symbol type;
    };

    struct global_info {
        std::string short_name;
        std::string full_name;
        std::string located_file;
        symbol_kind kind;
    };

private:
    // namespace mapper: filename -> namespace
    std::unordered_map<std::string, domain> name_space;
    // godel basic type
    std::unordered_map<std::string, basic> basics;
    // native functions
    std::unordered_map<std::string, function> native;
    // native functions used on *T
    std::unordered_map<std::string, function> aggregator;
    // reserved native identifier
    std::unordered_map<std::string, symbol> reserved_identifier;
    // packages
    std::unordered_map<std::string, package_info> packages;
    // symbol -> u64 mapper
    std::unordered_map<std::string, uint64_t> symbol_mapper;
    // all global symbols info
    std::vector<global_info> global_symbols;
    // local variable name dict, for codegen to avoid redefinition
    std::unordered_set<std::string> local_var_name_dict;
    // all local variables info
    std::vector<local_info> locals;
    // store all infer result
    std::vector<infer_info> infers;

private:
    const std::string& get_file(uint64_t index) const {
        static std::string null_file_name = "";
        return index >= global_symbols.size()?
            null_file_name:
            global_symbols[index].located_file;
    }
    const std::string& get_short_name(uint64_t index) const {
        static std::string null_symbol_name = "";
        return index >= global_symbols.size()?
            null_symbol_name:
            global_symbols[index].short_name;
    }
    void check_file_not_found(const std::string& file) const {
        if (name_space.count(file)) {
            return;
        }
        if (file.empty()) {
            std::cerr << "Crashed: empty file path.\n";
        } else {
            std::cerr << "Crashed: cannot find file <" << file << ">.\n";
        }
        std::exit(-1);
    }
    void report_symbol_not_found(const std::string& name, const std::string& file) const {
        std::cerr << "Crashed: cannot find \"" << name << "\" in ";
        std::cerr << " <" << file << ">.\n";
        std::exit(-1);
    }

public:
    const std::string& get_full_name(uint64_t index) const {
        static std::string null_symbol_name = "";
        return index >= global_symbols.size()?
            null_symbol_name:
            global_symbols[index].full_name;
    }
    symbol_kind get_kind(uint64_t index) const {
        return index >= global_symbols.size()?
            symbol_kind::null:global_symbols[index].kind;
    }
    void add_local_variable(
        const std::string& name,
        const span& location,
        const symbol& local_type) {
        local_var_name_dict.insert(name);
        locals.push_back({name, location, local_type});
    }
    void add_infer(const span& location, const symbol& infer_type) {
        infers.push_back({location, infer_type});
    }

public:
    void regist(const std::string&, const std::string&, symbol_kind);
    bool create_new_domain(const std::string&);

    // get type index by full name
    uint64_t get_index(const std::string&) const;

    bool exist(const std::string&) const;
    const span& get_location(uint64_t) const;

public:
    enumerate& get_enum(uint64_t);
    database& get_database(uint64_t);
    schema& get_schema(uint64_t);
    function& get_func(uint64_t);
    query& get_query(uint64_t);

    // get domain(namespace) by file name
    const auto& get_all_namespace() const { return name_space; }
    domain& get_domain(const std::string&);

    const auto& get_basics() const {return basics;}
    const auto& get_native() const {return native;}
    const auto& get_aggregator() const {return aggregator;}
    const auto& get_reserved_id() const {return reserved_identifier;}
    const auto& get_packages() const {return packages;}
    const auto& get_local_var_name_dict() const {return local_var_name_dict;}
    const auto& get_locals() const {return locals;}
    const auto& get_infers() const {return infers;}

    const enumerate& get_enum(uint64_t) const;
    const database& get_database(uint64_t) const;
    const schema& get_schema(uint64_t) const;
    const function& get_func(uint64_t) const;
    const query& get_query(uint64_t) const;
    const domain& get_domain(const std::string&) const;

    void dump() const;

private:
    void init_int_method();
    void init_float_method();
    void init_bool_method();
    void init_string_method();

public:
    void init_basics();

    // init native functions and reserved identifiers
    void init_natives();

    // init package info from godel module instance
    void init_packages();

};

}