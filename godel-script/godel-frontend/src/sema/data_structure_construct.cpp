#include "godel-frontend/src/sema/data_structure_construct.h"
#include "godel-frontend/src/sema/annotation_checker.h"
#include "godel-frontend/src/symbol.h"

namespace godel {

bool data_structure_construct::visit_enum_decl(enum_decl* node) {
    const auto name_node = node->get_name();
    const auto& name = name_node->get_name();

    // check if this symbol exists and is an enumeration
    if (ctx->find_global(name) &&
        ctx->find_global_kind(name)!=symbol_kind::enumerate) {
        err->err(name_node->get_location(), "\"" + name + "\" exists.");
        return false;
    }

    // get enum structure
    auto& enum_struct = ctx->global.get_enum(ctx->mapper.at(name));

    // make enum index and check redefinition
    for(auto child : node->get_member()) {
        const auto& member_name = child->get_name();
        if (enum_struct.pairs.count(member_name)) {
            err->err(child->get_location(),
                "redefinition of enum \"" + member_name + "\"."
            );
            continue;
        }
        auto index = enum_struct.pairs.size();
        enum_struct.pairs.insert({member_name, index});
    }
    return true;
}

bool data_structure_construct::visit_schema_decl(schema_decl* node) {
    const auto schema_name_node = node->get_name();
    const auto& name = schema_name_node->get_name();

    // check if this schema exists
    if (ctx->find_global(name) &&
        ctx->find_global_kind(name)!=symbol_kind::schema) {
        err->err(schema_name_node->get_location(), "\"" + name + "\" exists.");
        return false;
    }

    // get schema structure
    auto& schema_structure = ctx->global.get_schema(ctx->mapper.at(name));

    // load parent schema info
    if (node->has_parent()) {
        schema_load_parent(node->get_parent_name(), schema_structure);
    }

    // load field and do type existence check
    for(auto child: node->get_fields()) {
        schema_load_field(child, schema_structure);
    }

    if (schema_structure.extends.empty() && schema_structure.fields.empty()) {
        err->warn(node->get_location(),
            "better define at least one field."
        );
    }

    // load schema native methods
    schema_load_native_method(schema_structure);
    return true;
}

bool data_structure_construct::visit_database_decl(database_decl* node) {
    const auto name_node = node->get_name();
    const auto& name = name_node->get_name();

    // check if database exists
    if (ctx->find_global(name) &&
        ctx->find_global_kind(name)!=symbol_kind::database) {
        err->err(name_node->get_location(), "\"" + name + "\" exists.");
        return false;
    }

    // get database structure
    auto& database_structure = ctx->global.get_database(ctx->mapper.at(name));

    // initialize load method
    database_load_native_method(database_structure);

    // check tables
    for(auto child : node->get_tables()) {
        database_load_table(child, database_structure);
    }
    return true;
}

void data_structure_construct::schema_load_parent(
    type_def* node, schema& schema_structure) {
    schema_structure.extends = node->get_full_name();

    // check if the name conflicts with other symbols
    if (!node->is_full_path()) {
        ctx->report_conflict_symbol(
            *err, node->get_location(), node->get_short_name()
        );
    }

    if (!node->is_full_path() &&
        ctx->find_global_kind(node->get_short_name())!=symbol_kind::schema) {
        err->err(node->get_location(),
            "\"" + schema_structure.extends +
            "\" does not exist or is not schema."
        );
        return;
    }

    if (node->is_full_path()) {
        if (!ctx->check_full_path_type_imported(*err, node)) {
            return;
        }
        const auto full_path_name = node->get_full_name();
        const auto index = ctx->global.get_index(full_path_name);
        schema_structure.parent = &ctx->global.get_schema(index);
    } else {
        schema_structure.parent = &ctx->global.get_schema(
            ctx->mapper.at(schema_structure.extends)
        );
    }
    schema_structure.parent->child.push_back(&schema_structure);
}

void data_structure_construct::check_field_annot(annotation* node) {
    // only @primary is accepted here
    const auto& annot_name = node->get_annotation();

    // schema field must have annotation node after parsing (i forget why)
    // if none annotation is given, the name is empty
    if (!annot_name.length()) {
        return;
    }

    const auto checker = annotation_checker::instance();
    // should be valid annotation for schema field, now only @primary is supported
    if (!checker->is_valid_schema_field_annotation(annot_name)) {
        err->warn(node->get_location(),
            "invalid annotation \"" + annot_name + "\".",
            "maybe use \"@primary\" ?"
        );
        return;
    }

    if (!checker->need_property_string(annot_name) &&
        node->get_property_string().length()) {
        err->warn(node->get_location(),
            "property string is not needed here.",
            "ignored."
        );
    }
    if (!checker->need_property_map(annot_name) &&
        node->get_ordered_properties().size()) {
        err->warn(node->get_location(),
            "property map is not needed here.",
            "ignored."
        );
    }
}

void data_structure_construct::schema_load_field(schema_field* field,
                                                 schema& schema_structure) {
    auto anno_node = field->get_annotation();
    auto name_node = field->get_identifier();
    auto type_node = field->get_field_type();

    // check annotation for schema field
    check_field_annot(anno_node);

    // field with data set type is not allowed
    if (type_node->is_set()) {
        err->err(type_node->get_location(),
            "data set type is not allowed in schema.",
            "you mean \"" + type_node->get_full_name() + "\" ?"
        );
    }

    symbol schema_field = {
        .type_name = type_node->get_short_name(),
        .type_loc = ctx->find_global_location(type_node->get_short_name()),
        .location = name_node->get_location(),
        .primary = (anno_node->get_annotation()=="@primary")
    };

    if (type_node->is_full_path()) {
        if (!ctx->check_full_path_type_imported(*err, type_node)) {
            return;
        }
        const auto& full_path_name = type_node->get_full_name();
        const auto index = ctx->global.get_index(full_path_name);
        schema_field.type_loc = ctx->global.get_location(index);
    } else {
        ctx->report_conflict_symbol(
            *err, schema_field.location, schema_field.type_name
        );
    }

    // type existence and validation check
    if (!ctx->is_data_type(schema_field.type_name)) {
        err->err(type_node->get_location(),
            "\"" + type_node->get_full_name() +
            "\" is undefined or not a data type."
        );
    }

    if (schema_field==symbol::boolean()) {
        err->err(type_node->get_location(), "\"bool\" field is not allowed.");
    }

    if (schema_field.primary && schema_field!=symbol::i64()) {
        err->warn(type_node->get_location(),
            "better use \"int\" type as primary key."
        );
    }

    const auto& field_name = name_node->get_name();
    if (schema_structure.fields.count(field_name)) {
        err->err(name_node->get_location(),
            "redefinition of field \"" + field_name + "\"."
        );
        return;
    }
    schema_structure.ordered_fields.push_back(field_name);
    schema_structure.fields[field_name] = schema_field;
}

void data_structure_construct::schema_load_native_method(schema& schema_structure) {
    const symbol self_type = {
        .type_name = schema_structure.name,
        .type_loc = schema_structure.location,
        .is_set = false
    };
    const symbol self_type_set = {
        .type_name = schema_structure.name,
        .type_loc = schema_structure.location,
        .is_set = true
    };

    // set type convert method `T::to_set()`
    schema_structure.natives["to_set"] = function::build_native(
        "to_set", {{"self", self_type}}, self_type_set, false
    );

    // compare method `T::key_eq(D)` `T::key_neq(D)`
    // only useful when T has a primary key
    schema_structure.natives["key_eq"] = function::build_native(
        "key_eq",
        {{"self", self_type}, {"object", symbol::any()}},
        symbol::boolean(),
        false
    );
    schema_structure.natives["key_neq"] = function::build_native(
        "key_neq",
        {{"self", self_type}, {"object", symbol::any()}},
        symbol::boolean(),
        false
    );

    // generic method `T::to<D>()`
    schema_structure.natives["to"] = function::build_native(
        "to", {{"self", self_type}}, symbol::any(), false
    );
    schema_structure.natives.at("to").has_generic = true;

    // generic method `T::is<D>()`
    schema_structure.natives["is"] = function::build_native(
        "is", {{"self", self_type}}, symbol::boolean(), false
    );
    schema_structure.natives.at("is").has_generic = true;
}

void data_structure_construct::database_load_table(database_table* table,
                                                   database& database_structure) {
    const auto name_node = table->get_name();
    const auto type_node = table->get_type();

    if (!type_node->is_set()) {
        err->err(type_node->get_location(),
            "only data set is allowed in database.",
            "you mean \"*" + type_node->get_full_name() + "\" ?"
        );
        return;
    }

    // load table info
    symbol database_table = {
        .type_name = type_node->get_short_name(),
        .type_loc = ctx->find_global_location(type_node->get_short_name()),
        .location = name_node->get_location(),
        .is_set = true
    };

    if (type_node->is_full_path()) {
        if (!ctx->check_full_path_type_imported(*err, type_node)) {
            return;
        }
        const auto& full_path_name = type_node->get_full_name();
        const auto index = ctx->global.get_index(full_path_name);
        database_table.type_loc = ctx->global.get_location(index);
    } else {
        ctx->report_conflict_symbol(
            *err, database_table.location, database_table.type_name
        );
    }

    // type existence check
    if (!ctx->is_data_type(database_table.type_name)) {
        err->err(type_node->get_location(),
            "\"" + type_node->get_full_name() +
            "\" is undefined or not a data type."
        );
        return;
    }

    if (ctx->find_global_kind(database_table.type_name)!=symbol_kind::schema) {
        err->err(type_node->get_location(),
            "\"" + database_table.full_path_name() + "\" is not schema."
        );
        return;
    }

    // set schema is referenced by database
    auto& domain = ctx->global.get_domain(ctx->this_file_name);
    if (database_table.type_loc.file==ctx->this_file_name &&
        domain.schemas.count(database_table.type_name)) {
        auto& sc = domain.schemas.at(database_table.type_name);
        sc.referenced_by_database_table = true;
        sc.referenced_database_name = database_structure.name;
        if (sc.has_parent()) {
            err->err(type_node->get_location(),
                "child schema cannot be used as DO schema.",
                "consider using base schema."
            );
        }
    }

    const auto& table_name = name_node->get_name();
    if (database_structure.tables.count(table_name)) {
        err->err(name_node->get_location(),
            "redefinition of database \"" + table_name + "\"."
        );
    } else {
        database_structure.tables[table_name] = database_table;
        if (table->has_real_name()) {
            const auto& real = table->get_real_name()->get_literal();
            database_structure.real_name[table_name] = real.substr(1, real.size()-2);
        }
    }
}

void data_structure_construct::database_load_native_method(database& database_structure) {
    symbol self_type = {
        .type_name = database_structure.name,
        .type_loc = database_structure.location,
        .location = span::null(),
        .is_set = false
    };
    database_structure.load = function::build_native(
        "load", {{"path", symbol::str()}}, self_type, false
    );
}

}