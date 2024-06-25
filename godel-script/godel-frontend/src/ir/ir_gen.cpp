#include "godel-frontend/src/ir/ir_gen.h"
#include "godel-frontend/src/ir/name_mangling.h"
#include "godel-frontend/src/ir/inst_combine.h"

namespace godel {

lir::inst_value_t ir_gen::value_data::to_inst_value() const {
    switch(kind) {
        case data_kind::literal: return lir::inst_value_t::literal(content);
        case data_kind::variable: return lir::inst_value_t::variable(content);
        default: break;
    }

    // unreachable
    return lir::inst_value_t::null();
}

void ir_gen::emit_type_alias_for_database() {
    const auto& glb = context::global;
    const auto& ns = glb.get_all_namespace().at(ctx->this_file_name);
    for(const auto& sc : ns.databases) {
        // generate symbol to get the full path name of the database
        // for example:
        //
        // coref::java::JavaDB => coref__java__JavaDB
        //
        const auto sym = symbol {
            .type_name = sc.second.name,
            .type_loc = sc.second.location
        };
        const auto name = replace_colon(sym.full_path_name());

        // insert type alias into the context
        // for example:
        //
        // coref::java::JavaDB
        //   =>
        // .type coref__java__JavaDB = DBIndex
        //
        irc.type_alias.push_back(souffle_type_alias {
            .alias = name,
            .real = "DBIndex",
            .structure_type_list = {}
        });
    }
}

void ir_gen::emit_type_alias_for_schema_with_primary_key(const schema& sc) {
    // generate full path name of the schema
    const auto sym = symbol({
        .type_name = sc.name,
        .type_loc = sc.location
    });

    // get full path name of the schema's primary key, this is the real type
    const auto& real_type = sc.get_primary_key_type();

    // insert type alias into the context
    // for example:
    //
    // schema Example { @primary id: int, name: string}
    //   =>
    // .type Example = int
    //
    irc.type_alias.push_back(souffle_type_alias {
        .alias = replace_colon(sym.full_path_name()),
        .real = replace_colon(real_type.full_path_name_without_set()),
        .structure_type_list = {}
    });
}

void ir_gen::emit_type_alias_for_schema_without_primary_key(const schema& sc) {
    // generate full path name of the schema
    const auto sym = symbol {
        .type_name = sc.name,
        .type_loc = sc.location
    };

    // generate alias real type
    std::vector<std::string> structure_type_list;
    auto real = std::string("[");
    for(const auto& i : sc.ordered_fields) {
        real += i + ": ";
        const auto& type = sc.fields.at(i);
        const auto name = replace_colon(type.full_path_name_without_set());
        real += name + ", ";
        structure_type_list.push_back(name);
    }
    if (real.back()==' ') {
        real = real.substr(0, real.length()-2);
    }
    real += "]";

    // insert type alias into the context
    // for example:
    //
    // schema Example { id: int, name: string}
    //   =>
    // .type Example = [id: int, name: string]
    //
    irc.type_alias.push_back(souffle_type_alias {
        .alias = replace_colon(sym.full_path_name()),
        .real = real,
        .structure_type_list = structure_type_list
    });
}

void ir_gen::emit_type_alias_for_schema() {
    const auto& glb = context::global;
    const auto& ns = glb.get_all_namespace().at(ctx->this_file_name);
    for(const auto& sc : ns.schemas) {
        if (sc.second.has_primary_key()) {
            emit_type_alias_for_schema_with_primary_key(sc.second);
        } else {
            emit_type_alias_for_schema_without_primary_key(sc.second);
        }
    }
}

void ir_gen::emit_type_alias_for_enum() {
    const auto& glb = context::global;
    const auto& ns = glb.get_all_namespace().at(ctx->this_file_name);
    for(const auto& e : ns.enums) {
        const auto sym = symbol {
            .type_name = e.second.name,
            .type_loc = e.second.location
        };
        irc.type_alias.push_back(souffle_type_alias {
            .alias = replace_colon(sym.full_path_name()),
            .real = "int",
            .structure_type_list = {}
        });
    }
}

void ir_gen::emit_used_database_input_decl(const std::string& db_type_name,
                                           const std::string& db_path,
                                           const std::string& table_type,
                                           const schema& sc) {
    irc.input_decls.push_back(souffle_input_decl(
        db_type_name,
        table_type,
        irc.db_path.at(db_path)
    ));
    auto& input_decl = irc.input_decls.back();
    for(const auto& field : sc.ordered_fields) {
        const auto& type = sc.fields.at(field);
        input_decl.fields.push_back({field, type.full_path_name_without_set()});
    }
}

void ir_gen::emit_used_database_get_table_impl(const std::string& db_type_name,
                                               const std::string& db_path,
                                               const std::string& db_id,
                                               const std::string& table_name,
                                               const std::string& table_type,
                                               const schema& sc) {
    // generate implementation of get table rule
    auto get_table_impl = new souffle_rule_impl(
        "get_table_" + db_type_name + "_" + table_name,
        report::span::null()
    );
    get_table_impl->add_param("result");
    get_table_impl->add_param(db_id);
    get_table_impl->get_block()->set_use_comma();

    // generate input call
    auto input_rule_name = "input_" + db_type_name + "_";
    input_rule_name += table_type + "_";
    input_rule_name += std::to_string(irc.db_path.at(db_path));
    auto input_call = new lir::call(input_rule_name, report::span::null());

    // generate arguments of input call
    if (sc.has_primary_key()) {
        // only need primary key
        for(const auto& f : sc.ordered_fields) {
            input_call->add_arg(sc.fields.at(f).primary?
                lir::inst_value_t::variable("result"):
                lir::inst_value_t::default_value()
            );
        }
    } else {
        for(const auto& f : sc.ordered_fields) {
            input_call->add_arg(lir::inst_value_t::variable(f));
        }
    }

    // if schema does not have a primary key, generate schema literal
    if (!sc.has_primary_key()) {
        // generate schema literal from input data
        auto literal = std::string("[");
        for(const auto& f : sc.ordered_fields) {
            literal += f;
            if (f!=sc.ordered_fields.back()) {
                literal += ", ";
            }
        }
        literal += "]";

        // generate result = [ f1, f2, ...]
        get_table_impl->get_block()->add_new_content(new lir::store(
            lir::inst_value_t::literal(literal),
            lir::inst_value_t::variable("result"),
            report::span::null()
        ));
    }

    get_table_impl->get_block()->add_new_content(input_call);
    irc.database_get_table.push_back(get_table_impl);
}

void ir_gen::emit_schema_data_constraint_impl(const std::string& db_type_name,
                                              const std::string& db_path,
                                              const std::string& db_id,
                                              const std::string& table_type,
                                              const schema& sc) {
    auto input_to_schema = new souffle_rule_impl(
        "schema_" + table_type,
        report::span::null()
    );

    // load parameter
    if (sc.has_primary_key()) {
        // schema with primary key, just set the result = primary key
        input_to_schema->add_param(sc.get_primary_key());
    } else {
        // schema without primary key, need to generate result = [...]
        input_to_schema->add_param("result");
    }

    // database index
    input_to_schema->add_param(db_id);
    // schema field
    for(const auto& field : sc.ordered_fields) {
        input_to_schema->add_param(field);
    }

    // load result, generate result = [...]
    if (!sc.has_primary_key()) {
        auto literal = std::string("[");
        for(const auto& f : sc.ordered_fields) {
            literal += f;
            if (f!=sc.ordered_fields.back()) {
                literal += ", ";
            }
        }
        literal += "]";
        input_to_schema->get_block()->add_new_content(new lir::store(
            lir::inst_value_t::literal(literal),
            lir::inst_value_t::variable("result"),
            report::span::null()
        ));
    }

    // load fact data input call
    auto input_call = new lir::call(
        "input_" + db_type_name + "_" + table_type + "_" +
        std::to_string(irc.db_path.at(db_path)),
        report::span::null()
    );
    input_to_schema->get_block()->add_new_content(input_call);
    input_to_schema->get_block()->set_use_comma();
    for(const auto& field : sc.ordered_fields) {
        input_call->add_arg(lir::inst_value_t::variable(field));
    }

    irc.schema_data_constraint_impls.push_back(input_to_schema);
}

void ir_gen::emit_used_database(const std::string& db_type_name,
                                const std::string& db_file_path) {
    // update db index and load time counter
    if (!irc.db_index.count(db_type_name)) {
        irc.db_index.insert({db_type_name, irc.db_index.size()});
    }
    if (!irc.db_path.count(db_file_path)) {
        irc.db_path.insert({db_file_path, irc.db_path.size()});
    }

    // get load time counter and generate db id
    const auto path_id = irc.db_path.at(db_file_path);
    const auto db_id = "[" + std::to_string(irc.db_index.at(db_type_name)) +
                       ", " + std::to_string(path_id) + "]";
    // check if this db_id exists in all_data
    if (irc.database_all_data.count(db_id)) {
        return;
    }
    irc.database_all_data.insert(db_id);

    // add input table into input impl
    const auto index = ctx->global.get_index(db_type_name);
    const auto& db = ctx->global.get_database(index);
    for(const auto& table : db.tables) {
        const auto& name = table.first;
        const auto& type = table.second.full_path_name_without_set();

        // generate input impl
        if (db.real_name.count(name)) {
            const auto& real = db.real_name.at(name);
            irc.input_impls.push_back(
                souffle_input_impl(db_type_name, real, type, path_id, db_file_path)
            );
        } else {
            irc.input_impls.push_back(
                souffle_input_impl(db_type_name, name, type, path_id, db_file_path)
            );
        }

        auto sc_index = ctx->global.get_index(type);
        const auto& sc = ctx->global.get_schema(sc_index);
        emit_used_database_input_decl(db_type_name, db_file_path, type, sc);

        // get table rule impl
        emit_used_database_get_table_impl(db_type_name, db_file_path, db_id, name, type, sc);

        // input data load to schema data constraint
        emit_schema_data_constraint_impl(db_type_name, db_file_path, db_id, type, sc);
    }
}

void ir_gen::emit_database_get_table_decl() {
    const auto& glb = context::global;
    const auto& ns = glb.get_all_namespace().at(ctx->this_file_name);
    for(auto& db : ns.databases) {
        const auto sym = symbol({
            .type_name = db.second.name,
            .type_loc = db.second.location
        });

        for(auto& table : db.second.tables) {
            auto new_decl = new souffle_rule_decl(
                "get_table_" + sym.full_path_name_without_set() +
                "_" + table.first
            );

            // generate this:
            //
            // .decl get_table_database_table(return: table_type, db_id: DBIndex)
            //
            new_decl->set_return_type(table.second.full_path_name_without_set());
            new_decl->add_param("db_id", "DBIndex");
            irc.rule_decls.push_back(new_decl);
        }
    }
}

void ir_gen::emit_schema_decl() {
    const auto& glb = context::global;
    const auto& ns = glb.get_all_namespace().at(ctx->this_file_name);
    // load schema structure and methods
    for(auto& sc : ns.schemas) {
        const auto sym = symbol({
            .type_name = sc.second.name,
            .type_loc = sc.second.location
        });

        std::vector<std::pair<std::string, std::string>> fields;
        // schema data constraint decl
        irc.schema_data_constraint_decls.push_back(souffle_schema {
            .name = sym.full_path_name(),
            .fields = fields
        });

        // generate name:type pair in order
        for(const auto& field_name : sc.second.ordered_fields) {
            const auto& field_type = sc.second.fields.at(field_name);
            irc.schema_data_constraint_decls.back().fields.push_back({
                field_name,
                field_type.full_path_name_without_set()
            });
        }

        // load schema methods
        for(const auto& method : sc.second.methods) {
            auto name = "rule_" + sym.full_path_name() + "::" + method.first;
            emit_schema_method_decl(method.second, name);
            emit_schema_inherit_method(sc.second, method.second, name);
        }
    }
}

void ir_gen::emit_schema_method_decl(const function& method,
                                     const std::string& self_rule_name) {
    auto method_decl = new souffle_rule_decl(self_rule_name);
    irc.rule_decls.push_back(method_decl);

    const auto& ret_type = method.return_type;

    // set return type of the method, this determines
    // whether it is a rule or a predicate:
    // rule: return type is not void, for example: name(result, ...)
    // predicate: with no return type, for example: name(...)
    method_decl->set_return_type(ret_type.full_path_name_without_set());

    // inherit method and method with inline annotation
    // should all be declared as `inline`, for optimization purpose
    method_decl->set_is_inline_rule(
        method.has_annotation("@inline") ||
        method.inherit
    );

    // load parameters of the method
    for(const auto& arg_name : method.ordered_parameter_list) {
        const auto& arg_type = method.parameter_list.at(arg_name);
        method_decl->add_param(arg_name, arg_type.full_path_name_without_set());
    }
}

void ir_gen::emit_schema_inherit_method(const schema& sc,
                                        const function& method,
                                        const std::string& self_rule_name) {
    // do not emit if is not inherited
    if (!method.inherit) {
        return;
    }

    const auto parent_type = symbol({
        .type_name = sc.parent->name,
        .type_loc = sc.parent->location
    });

    auto impl = new souffle_rule_impl(self_rule_name, report::span::null());
    auto call = new lir::call(
        "rule_" + parent_type.full_path_name() + "::" + method.name,
        report::span::null()
    );
    impl->get_block()->add_new_content(call);

    if (method.return_type!=symbol::null() &&
        method.return_type!=symbol::boolean()) {
        impl->add_param("result");
        call->add_arg(lir::inst_value_t::variable("result"));
    }
    for(auto& arg : method.ordered_parameter_list) {
        impl->add_param(arg);
        call->add_arg(lir::inst_value_t::variable(arg));
    }
    irc.rule_impls.push_back(impl);
}

void ir_gen::emit_schema_type_check() {
    const auto& glb = context::global;
    const auto& ns = glb.get_all_namespace().at(ctx->this_file_name);
    for(const auto& sc : ns.schemas) {
        const auto sym = symbol({
            .type_name = sc.second.name,
            .type_loc = sc.second.location
        });

        // typecheck
        emit_schema_type_check_decl(sym);

        // typecheck impl
        emit_schema_type_check_impl(sym, sc.second);
    }
}

void ir_gen::emit_schema_type_check_decl(const symbol& sym) {
    auto typecheck_decl = new souffle_rule_decl("typecheck_" + sym.full_path_name());
    irc.rule_decls.push_back(typecheck_decl);
    typecheck_decl->add_param("self", sym.full_path_name());
    typecheck_decl->set_is_inline_rule(true);
}

void ir_gen::emit_schema_type_check_impl(const symbol& sym, const schema& sc) {
    // generate typecheck impl
    auto typecheck_impl = new souffle_rule_impl(
        "typecheck_" + sym.full_path_name(),
        report::span::null()
    );
    typecheck_impl->add_param("self");

    // generate inner data constraint call
    auto data_constraint_call = new lir::call(
        "schema_" + sym.full_path_name(),
        report::span::null()
    );
    data_constraint_call->add_arg(lir::inst_value_t::variable("self"));
    data_constraint_call->add_arg(lir::inst_value_t::default_value());
    for(size_t i = 0; i<sc.ordered_fields.size(); ++i) {
        data_constraint_call->add_arg(lir::inst_value_t::default_value());
    }

    // insert data constraint call into typecheck impl block
    typecheck_impl->get_block()->add_new_content(data_constraint_call);

    // insert typecheck impl into IR context
    irc.rule_impls.push_back(typecheck_impl);
}

void ir_gen::emit_schema_get_field() {
    const auto& glb = context::global;
    const auto& ns = glb.get_all_namespace().at(ctx->this_file_name);

    for(const auto& sc : ns.schemas) {
        const auto sym = symbol {
            .type_name = sc.second.name,
            .type_loc = sc.second.location
        };

        for(const auto& field : sc.second.ordered_fields) {
            auto name = "get_field_" + sym.full_path_name() + "_" + field;
            auto rule = new souffle_rule_decl(name);
            rule->set_return_type(
                sc.second.fields.at(field).full_path_name_without_set()
            );

            // must be inline, it's a necessary optimization
            rule->set_is_inline_rule(true);
            rule->add_param("self", sym.full_path_name());
            irc.rule_decls.push_back(rule);

            // implementation of get field method
            auto rule_impl = new souffle_rule_impl(name, report::span::null());
            rule_impl->add_param("result");
            rule_impl->add_param("self");

            // necessary optimization, if the field is primary key,
            // we can directly store self in result to avoid extra join
            if (sc.second.fields.at(field).primary) {
                auto assign = new lir::store(
                    lir::inst_value_t::variable("self"),
                    lir::inst_value_t::variable("result"),
                    report::span::null()
                );
                rule_impl->get_block()->add_new_content(assign);
            } else {
                // if the field is not a primary key, then generate this:
                //
                // get_field_name(result, self) :-
                //     schema_name(self, _, ..., result, ...).
                //
                auto call = new lir::call(
                    "schema_" + sym.full_path_name(),
                    report::span::null()
                );
                call->add_arg(lir::inst_value_t::variable("self"));
                call->add_arg(lir::inst_value_t::default_value());
                for(const auto& f : sc.second.ordered_fields) {
                    call->add_arg(f==field?
                        lir::inst_value_t::variable("result"):
                        lir::inst_value_t::default_value()
                    );
                }
                rule_impl->get_block()->add_new_content(call);
            }

            // insert the rule implementation into IR context
            irc.schema_get_field.push_back(rule_impl);
        }
    }
}

void ir_gen::emit_DO_schema_default_constructor() {
    const auto& glb = context::global;
    const auto& ns = glb.get_all_namespace().at(ctx->this_file_name);
    for(auto& sc : ns.schemas) {
        if (!sc.second.methods.count("__all__")) {
            continue;
        }
        if (sc.second.methods.at("__all__").implemented) {
            continue;
        }

        const auto sym = symbol({
            .type_name = sc.second.name,
            .type_loc = sc.second.location
        });

        // generate this method as a rule implementation:
        // rule_name(result, ...) :- schema_name(result, db, ...).
        const auto function_name = replace_colon(sym.full_path_name() + "::__all__");
        auto func_impl = new souffle_rule_impl(
            "rule_" + function_name,
            report::span::null()
        );
        func_impl->add_param("result");
        func_impl->add_param("db");
        irc.rule_impls.push_back(func_impl);

        auto call = new lir::call(
            "schema_" + replace_colon(sym.full_path_name()),
            report::span::null()
        );
        func_impl->get_block()->add_new_content(call);
        call->add_arg(lir::inst_value_t::variable("result"));
        call->add_arg(lir::inst_value_t::variable("db"));
        for(size_t i = 0; i<sc.second.ordered_fields.size(); ++i) {
            call->add_arg(lir::inst_value_t::default_value());
        }
    }
}

void ir_gen::emit_func_decl() {
    const auto& ns_name = godel_module::instance()->find_module_by_file(ctx->this_file_name);
    const auto& ns = context::global.get_all_namespace().at(ctx->this_file_name);
    for(const auto& fn : ns.functions) {
        if (fn.first=="main") {
            continue;
        }
        auto rule = new souffle_rule_decl(
            "rule_" + (ns_name.length()? ns_name + "::":"") + fn.first
        );

        if (!fn.second.return_type.is_null()) {
            rule->set_return_type(fn.second.return_type.full_path_name_without_set());
        }
        rule->set_is_inline_rule(fn.second.has_annotation("@inline"));
        rule->set_need_cache(fn.second.has_annotation("@cache"));
        for(const auto& arg : fn.second.ordered_parameter_list) {
            const auto& arg_type = fn.second.parameter_list.at(arg);
            rule->add_param(arg, arg_type.full_path_name_without_set());
        }
        irc.rule_decls.push_back(rule);
    }
}

void ir_gen::generate_basic_symbol(identifier* node) {
    path_infer_result = {path_kind::basic, node->get_name()};
}

void ir_gen::generate_database_symbol(identifier* node) {
    const auto sym = symbol({
        .type_name = node->get_name(),
        .type_loc = ctx->find_global_location(node->get_name())
    });
    path_infer_result = {path_kind::database, sym.full_path_name_without_set()};
}

void ir_gen::generate_schema_symbol(identifier* node) {
    const auto sym = symbol({
        .type_name = node->get_name(),
        .type_loc = ctx->find_global_location(node->get_name())
    });
    path_infer_result = {path_kind::schema, sym.full_path_name_without_set()};
}

void ir_gen::generate_enum_symbol(identifier* node) {
    const auto sym = symbol({
        .type_name = node->get_name(),
        .type_loc = ctx->find_global_location(node->get_name())
    });
    path_infer_result = {path_kind::enumerate, sym.full_path_name_without_set()};
}

void ir_gen::generate_function_symbol(identifier* node) {
    const auto loc = ctx->find_global_location(node->get_name());
    // native function is not allowed to be used in souffle codegen
    if (loc.is_null()) {
        report_compiler_bug(node,
            "\"" + node->get_name() + "\" is a native function."
        );
        return;
    }

    const auto sym = symbol({
        .type_name = node->get_name(),
        .type_loc = loc
    });
    func_stack.push_back({
        func_kind::function,
        "rule_" + sym.full_path_name_without_set(),
        node->get_resolve()
    });
}

void ir_gen::generate_package_symbol(identifier* node) {
    path_infer_result = {path_kind::module_path, node->get_name()};
}

void ir_gen::generate_symbol_call(identifier* node) {
    if (node->get_name()=="Self") {
        path_infer_result = {
            path_kind::schema,
            node->get_resolve().type.full_path_name_without_set()
        };
        return;
    }

    switch(ctx->find_global_kind(node->get_name())) {
        case symbol_kind::basic: generate_basic_symbol(node); break;
        case symbol_kind::database: generate_database_symbol(node); break;
        case symbol_kind::enumerate: generate_enum_symbol(node); break;
        case symbol_kind::function: generate_function_symbol(node); break;
        case symbol_kind::package: generate_package_symbol(node); break;
        case symbol_kind::query:
            report_compiler_bug(node, "query call is not allowed in codegen.");
            break;
        case symbol_kind::schema: generate_schema_symbol(node); break;
        default:
            // not found, means this is not a global symbol
            if (node->get_name()=="__all_data__") {
                value_stack.push_back({
                    data_kind::variable,
                    "_",
                    node->get_resolve()
                });
            } else {
                value_stack.push_back({
                    data_kind::variable,
                    node->get_name(),
                    node->get_resolve()
                });
            }
            break;
    }
}

void ir_gen::get_path_from_basic(call_expr* node) {
    func_stack.push_back({
        func_kind::basic_static,
        path_infer_result.content + "::" + node->get_field_name()->get_name()
    });
    path_infer_result.kind = path_kind::null;
}

void ir_gen::get_path_from_database(call_expr* node) {
    if (node->get_field_name()->get_name()=="load") {
        func_stack.push_back({
            func_kind::database_load,
            path_infer_result.content + "::load",
            node->get_resolve()
        });
        path_infer_result.kind = path_kind::null;
        return;
    }
    report_compiler_bug(node, "unreachable.");
}

void ir_gen::get_path_from_schema(call_expr* node) {
    func_stack.push_back({
        func_kind::function,
        "rule_" + path_infer_result.content + "::" + node->get_field_name()->get_name(),
        node->get_resolve()
    });
    path_infer_result.kind = path_kind::null;
}

void ir_gen::get_path_from_enum(call_expr* node) {
    const auto name = node->get_resolve().type.full_path_name_without_set();
    const auto index = ctx->global.get_index(name);
    const auto& en = ctx->global.get_enum(index);
    value_stack.push_back({
        data_kind::literal,
        std::to_string(en.pairs.at(node->get_field_name()->get_name())),
        node->get_resolve()
    });
    path_infer_result.kind = path_kind::null;
}

void ir_gen::get_path_from_package(call_expr* node) {
    auto path = path_infer_result.content + "::" + node->get_field_name()->get_name();
    auto index = ctx->global.get_index(path);
    switch(ctx->global.get_kind(index)) {
        case symbol_kind::package:
            path_infer_result = {path_kind::module_path, path}; break;
        case symbol_kind::database:
            path_infer_result = {path_kind::database, path}; break;
        case symbol_kind::enumerate:
            path_infer_result = {path_kind::enumerate, path}; break;
        case symbol_kind::schema:
            path_infer_result = {path_kind::schema, path}; break;
        case symbol_kind::function:
            func_stack.push_back({
                func_kind::function,
                "rule_" + path,
                node->get_resolve()
            });
            break;
        default:
            report_compiler_bug(node, "get unknown symbol from package.");
            break;
    }
}

void ir_gen::get_path_from_infer(call_expr* node) {
    if (path_infer_result.is_null()) {
        report_compiler_bug(node, "path infer is null.");
        return;
    }
    switch(path_infer_result.kind) {
        case path_kind::null: break;
        case path_kind::database: get_path_from_database(node); break;
        case path_kind::enumerate: get_path_from_enum(node); break;
        case path_kind::schema: get_path_from_schema(node); break;
        case path_kind::basic: get_path_from_basic(node); break;
        case path_kind::module_path: get_path_from_package(node); break;
    }
}

void ir_gen::get_field_from_database(call_expr* node) {
    const auto name = field_infer_result.type.full_path_name_without_set();
    auto lir_call = new lir::call(
        "get_table_" + name + "_" + node->get_field_name()->get_name(),
        node->get_location()
    );
    lir_call->set_call_type(lir::call::kind::method);
    if (value_stack.empty()) {
        report_empty_value_stack(node->get_field_name());
    }
    lir_call->add_arg(value_stack.back().to_inst_value());
    value_stack.pop_back();

    const auto temp_var = generate_temp_variable();
    lir_call->set_return(lir::inst_value_t::variable(temp_var));
    value_stack.push_back({data_kind::variable, temp_var, node->get_resolve()});

    blocks.back()->add_new_content(lir_call);
}

void ir_gen::get_field_from_schema(call_expr* node) {
    const auto name = field_infer_result.type.full_path_name_without_set();
    const auto index = ctx->global.get_index(name);
    const auto& sch = ctx->global.get_schema(index);
    if (sch.fields.count(node->get_field_name()->get_name())) {
        auto lir_call = new lir::call(
            "get_field_" + name + "_" + node->get_field_name()->get_name(),
            node->get_location()
        );
        lir_call->set_call_type(lir::call::kind::method);
        if (value_stack.empty()) {
            report_empty_value_stack(node->get_field_name());
        }
        lir_call->add_arg(value_stack.back().to_inst_value());
        value_stack.pop_back();

        const auto temp_var = generate_temp_variable();
        lir_call->set_return(lir::inst_value_t::variable(temp_var));
        value_stack.push_back({data_kind::variable, temp_var, node->get_resolve()});
        blocks.back()->add_new_content(lir_call);
        return;
    }
    if (sch.methods.count(node->get_field_name()->get_name())) {
        func_stack.push_back({
            func_kind::method,
            "rule_" + name + "::" + node->get_field_name()->get_name(),
            node->get_resolve()
        });
        return;
    }
    if (node->get_field_name()->get_name()=="key_eq" ||
        node->get_field_name()->get_name()=="key_neq") {
        func_stack.push_back({
            func_kind::key_cmp,
            node->get_field_name()->get_name(),
            node->get_resolve()
        });
        return;
    }
    if (node->get_field_name()->get_name()=="to_set") {
        func_stack.push_back({
            func_kind::to_set,
            node->get_field_name()->get_name(),
            node->get_resolve()
        });
        return;
    }
    if (node->is_generic_is()) {
        func_stack.push_back({
            func_kind::schema_is,
            "is",
            node->get_resolve()
        });
        func_stack.back().generic_type = node->get_generic_output_full_name();
        return;
    }
    if (node->is_generic_to()) {
        func_stack.push_back({
            func_kind::schema_to,
            "to",
            node->get_resolve()
        });
        func_stack.back().generic_type = node->get_generic_output_full_name();
        return;
    }
    report_compiler_bug(node, "unreachable.");
}

void ir_gen::get_field_from_basic(call_expr* node) {
    const auto tn = field_infer_result.type.full_path_name_without_set();

    // bool native methods is not supported now
    if (field_infer_result.type==symbol::boolean()) {
        err.err(node->get_location(),
            "generation for bool method is not supported yet."
        );
    }

    // generate real name of native methods, for example:
    //
    // "1".add("2")
    // =>
    // string::add("1", "2")
    func_stack.push_back({
        func_kind::basic_method,
        tn + "::" + node->get_field_name()->get_name()
    });
}

void ir_gen::get_field_from_infer(call_expr* node) {
    if (field_infer_result.type.is_null()) {
        report_compiler_bug(node, "field infer is empty.");
        return;
    }
    if (field_infer_result.type.is_set) {
        if (node->get_field_name()->get_name()!="find") {
            report_compiler_bug(node,
                "expected \"find\" but get \"" +
                node->get_field_name()->get_name() + "\"."
            );
        }
        func_stack.push_back({
            func_kind::find,
            node->get_field_name()->get_name()
        });
        return;
    }
    const auto name = field_infer_result.type.full_path_name_without_set();
    const auto index = ctx->global.get_index(name);
    switch(ctx->global.get_kind(index)) {
        case symbol_kind::basic: get_field_from_basic(node); break;
        case symbol_kind::database: get_field_from_database(node); break;
        case symbol_kind::schema: get_field_from_schema(node); break;
        default: report_compiler_bug(node, "unreachable."); break;
    }
}

void ir_gen::generate_single_output(call_root* node) {
    auto id = reinterpret_cast<identifier*>(node->get_call_head()->get_first_expression());
    const auto& first_id = id->get_name();
    auto name = first_id;
    for(auto i : node->get_call_chain()) {
        name += "::" + i->get_field_name()->get_name();
    }

    // if it's a global function
    if (name.find(":")==std::string::npos && ctx->find_global(name)) {
        const auto sym = symbol {
            .type_name = name,
            .type_loc = ctx->find_global_location(name)
        };
        const auto func_name = sym.full_path_name();
        irc.souffle_output.push_back("rule_" + func_name);
        irc.souffle_output_real_name.insert({
            "rule_" + func_name,
            func_name
        });
        return;
    }

    // if it's a module path or schema
    if (name.find(":")!=std::string::npos) {
        if (ctx->find_global_kind(first_id)==symbol_kind::package) {
            irc.souffle_output.push_back("rule_" + name);
            irc.souffle_output_real_name.insert({"rule_" + name, name});
        } else if (ctx->find_global_kind(first_id)==symbol_kind::schema) {
            const auto sym = symbol {
                .type_name = first_id,
                .type_loc = ctx->find_global_location(first_id)
            };
            auto func_name = sym.full_path_name();
            for(auto i : node->get_call_chain()) {
                func_name += "::" + i->get_field_name()->get_name();
            }
            irc.souffle_output.push_back("rule_" + func_name);
            irc.souffle_output_real_name.insert({
                "rule_" + func_name,
                func_name
            });
        } else {
            // unreachable
            err.err(node->get_location(),
                "cannot get output from \"" + name + "\".",
                "failed to find the type of \"" + first_id + "\"."
            );
        }
    }
}

void ir_gen::generate_output(block_stmt* node) {
    if (!node) {
        return;
    }
    for(auto i : node->get_statement()) {
        auto tmp = reinterpret_cast<in_block_expr*>(i);
        auto call = reinterpret_cast<call_root*>(tmp->get_expr());
        auto args = call->get_call_head()->get_func_call();
        generate_single_output(reinterpret_cast<call_root*>(args->get_arguments()[0]));
    }
}

bool ir_gen::is_stdout_output_annotation(annotation* anno) {
    const auto& props = anno->get_ordered_properties();
    if (props.empty()) {
        return true;
    }
    if (props.size()==1 &&
        props[0].first=="format" &&
        props[0].second=="\"stdout\"") {
        return true;
    }
    return false;
}

void ir_gen::generate_annotated_output(annotation* anno, function_decl* node) {
    auto name = node->get_name()->get_name();
    if (impl_schema_name.length()) {
        name = impl_schema_name + "::" + name;
    } else {
        const auto& ns = godel_module::instance()
                                     ->find_module_by_file(ctx->this_file_name);
        name = (ns.length()? ns + "::":"") + name;
    }

    if (is_stdout_output_annotation(anno)) {
        irc.souffle_output.push_back("rule_" + name);
        irc.souffle_output_real_name.insert({
            "rule_" + name,
            name
        });
    } else {
        auto format = std::string("");
        auto file_path = std::string("");
        for(const auto& i : anno->get_ordered_properties()) {
            if (i.first=="format") {
                format = i.second;
            } else if (i.first=="file") {
                file_path = i.second;
            }
        }
        irc.annotated_output.push_back({
            .format = format,
            .file_path = file_path,
            .rule_name = "rule_" + name
        });
    }
}

void ir_gen::generate_annotated_input(annotation* anno, function_decl* node) {
    auto name = node->get_name()->get_name();
    // annotated input must be used on global function
    if (impl_schema_name.length()) {
        report_compiler_bug(anno, "unreachable.");
    } else {
        const auto& ns = godel_module::instance()
                                     ->find_module_by_file(ctx->this_file_name);
        name = (ns.length()? ns + "::":"") + name;
    }

    auto format = std::string("");
    auto file_path = std::string("");
    for(const auto& i : anno->get_ordered_properties()) {
        if (i.first=="format") {
            format = i.second;
        } else if (i.first=="file") {
            file_path = i.second;
        }
    }
    irc.annotated_input.push_back({
        .format = format,
        .file_path = file_path,
        .rule_name = "rule_" + name
    });
}

void ir_gen::generate_function_call(func_call* node, lir::call* c) {
    std::vector<value_data> args;
    for(size_t i = 0; i<node->get_arguments().size(); ++i) {
        if (value_stack.empty()) {
            report_empty_value_stack(node);
            break;
        }
        args.push_back(value_stack.back());
        value_stack.pop_back();
    }
    for(auto i = args.rbegin(); i!=args.rend(); ++i) {
        c->add_arg(i->to_inst_value());
    }
}

void ir_gen::generate_method_call(func_call* node, lir::call* c) {
    std::vector<value_data> args;
    for(size_t i = 0; i<node->get_arguments().size()+1; ++i) {
        if (value_stack.empty()) {
            report_empty_value_stack(node);
            break;
        }
        args.push_back(value_stack.back());
        value_stack.pop_back();
    }
    for(auto i = args.rbegin(); i!=args.rend(); ++i) {
        c->add_arg(i->to_inst_value());
    }
}

void ir_gen::report_ignored_DO_schema_data_constraint() {
    if (ignored_DO_schema.empty()) {
        return;
    }
    err.warn_report_ignored_DO_schema(ignored_DO_schema);
}

bool ir_gen::visit_number_literal(number_literal* node) {
    value_stack.push_back({
        data_kind::literal,
        node->is_integer()? std::to_string(node->get_integer()):
                            std::to_string(node->get_float()),
        node->get_resolve()
    });
    return true;
}

bool ir_gen::visit_string_literal(string_literal* node) {
    if (node->is_input_database_path()) {
        const auto& db_type_name = node->get_database_full_path();
        emit_used_database(db_type_name, node->get_literal());
        auto db_object = std::string("[");
        db_object += std::to_string(irc.db_index.at(db_type_name));
        db_object += ", ";
        db_object += std::to_string(irc.db_path.at(node->get_literal()));
        db_object += "]";

        // load database index instead of string literal
        // so the stack should be:
        // +----------+----------+
        // |  value   |   func   |
        // +----------+----------+
        // |  [0, 0]  | db::load |
        // +----------+----------+
        value_stack.push_back({
            data_kind::literal,
            db_object,
            node->get_resolve()
        });
        return true;
    }
    value_stack.push_back({
        data_kind::literal,
        node->get_literal(),
        node->get_resolve()
    });
    return true;
}

bool ir_gen::visit_boolean_literal(boolean_literal* node) {
    blocks.back()->add_new_content(
        new lir::boolean(node->get_flag(), node->get_location())
    );
    return true;
}

bool ir_gen::visit_unary_operator(unary_operator* node) {
    switch(node->get_operator_type()) {
        case unary_operator::type::arithmetic_negation: {
                node->get_child()->accept(this);
                if (value_stack.empty()) {
                    report_empty_value_stack(node);
                } else {
                    auto top = value_stack.back();
                    value_stack.pop_back();
                    auto temp = generate_temp_variable();
                    blocks.back()->add_new_content(new lir::unary(
                        lir::unary::kind::op_neg,
                        top.to_inst_value(),
                        lir::inst_value_t::variable(temp),
                        node->get_child()->get_location()
                    ));
                    value_stack.push_back({
                        data_kind::variable,
                        temp,
                        node->get_resolve()
                    });
                }
            }
            break;
        case unary_operator::type::logical_negation: {
                auto new_not = new lir::not_operand(node->get_location());
                blocks.back()->add_new_content(new_not);
                auto new_blk = new lir::block(node->get_child()->get_location());
                new_not->set_body(new_blk);
                blocks.push_back(new_blk);
                node->get_child()->accept(this);
                blocks.pop_back();
            }
            break;
    }
    return true;
}

bool ir_gen::visit_binary_operator(binary_operator* node) {
    if (node->get_operator_type()==binary_operator::type::logical_and) {
        auto new_and = new lir::and_operand(node->get_location());
        auto new_left_blk = new lir::block(node->get_left()->get_location());
        auto new_right_blk = new lir::block(node->get_right()->get_location());
        new_and->set_left(new_left_blk);
        new_and->set_right(new_right_blk);
        blocks.back()->add_new_content(new_and);

        blocks.push_back(new_left_blk);
        node->get_left()->accept(this);
        blocks.pop_back();

        blocks.push_back(new_right_blk);
        node->get_right()->accept(this);
        blocks.pop_back();
        return true;
    }

    if (node->get_operator_type()==binary_operator::type::logical_or) {
        auto new_or = new lir::or_operand(node->get_location());
        auto new_left_blk = new lir::block(node->get_left()->get_location());
        auto new_right_blk = new lir::block(node->get_right()->get_location());
        new_or->set_left(new_left_blk);
        new_or->set_right(new_right_blk);
        blocks.back()->add_new_content(new_or);

        blocks.push_back(new_left_blk);
        node->get_left()->accept(this);
        blocks.pop_back();

        blocks.push_back(new_right_blk);
        node->get_right()->accept(this);
        blocks.pop_back();
        return true;
    }

    node->get_left()->accept(this);
    node->get_right()->accept(this);

    const auto temp_var = generate_temp_variable();
    if (value_stack.empty()) {
        report_empty_value_stack(node);
    }
    const auto r = value_stack.back();
    value_stack.pop_back();
    if (value_stack.empty()) {
        report_empty_value_stack(node);
    }
    const auto l = value_stack.back();
    value_stack.pop_back();

    switch(node->get_operator_type()) {
        case binary_operator::type::add:
            if (l.resolve.type==symbol::str() && r.resolve.type==symbol::str()) {
                auto cat_call = new lir::call("string::add", node->get_location());
                cat_call->set_call_type(lir::call::kind::basic_method);
                cat_call->set_return(lir::inst_value_t::variable(temp_var));
                cat_call->add_arg(l.to_inst_value());
                cat_call->add_arg(r.to_inst_value());
                blocks.back()->add_new_content(cat_call);
            } else {
                blocks.back()->add_new_content(new lir::binary(
                    l.to_inst_value(),
                    r.to_inst_value(),
                    lir::inst_value_t::variable(temp_var),
                    lir::binary::kind::op_add,
                    node->get_location()
                ));
            }
            value_stack.push_back({data_kind::variable, temp_var, node->get_resolve()});
            break;
        case binary_operator::type::compare_equal:
        case binary_operator::type::in:
            blocks.back()->add_new_content(new lir::compare(
                l.to_inst_value(),
                r.to_inst_value(),
                lir::compare::kind::op_eq,
                node->get_location()
            ));
            break;
        case binary_operator::type::compare_great:
            blocks.back()->add_new_content(new lir::compare(
                l.to_inst_value(),
                r.to_inst_value(),
                lir::compare::kind::op_gt,
                node->get_location()
            ));
            break;
        case binary_operator::type::compare_great_equal:
            blocks.back()->add_new_content(new lir::compare(
                l.to_inst_value(),
                r.to_inst_value(),
                lir::compare::kind::op_ge,
                node->get_location()
            ));
            break;
        case binary_operator::type::compare_less:
            blocks.back()->add_new_content(new lir::compare(
                l.to_inst_value(),
                r.to_inst_value(),
                lir::compare::kind::op_lt,
                node->get_location()
            ));
            break;
        case binary_operator::type::compare_less_equal:
            blocks.back()->add_new_content(new lir::compare(
                l.to_inst_value(),
                r.to_inst_value(),
                lir::compare::kind::op_le,
                node->get_location()
            ));
            break;
        case binary_operator::type::compare_not_equal:
            blocks.back()->add_new_content(new lir::compare(
                l.to_inst_value(),
                r.to_inst_value(),
                lir::compare::kind::op_neq,
                node->get_location()
            ));
            break;
        case binary_operator::type::div:
            blocks.back()->add_new_content(new lir::binary(
                l.to_inst_value(), 
                r.to_inst_value(),
                lir::inst_value_t::variable(temp_var),
                lir::binary::kind::op_div,
                node->get_location()
            ));
            value_stack.push_back({data_kind::variable, temp_var, node->get_resolve()});
            break;
        case binary_operator::type::mult:
            blocks.back()->add_new_content(new lir::binary(
                l.to_inst_value(),
                r.to_inst_value(),
                lir::inst_value_t::variable(temp_var),
                lir::binary::kind::op_mul,
                node->get_location()
            ));
            value_stack.push_back({data_kind::variable, temp_var, node->get_resolve()});
            break;
        case binary_operator::type::sub:
            blocks.back()->add_new_content(new lir::binary(
                l.to_inst_value(),
                r.to_inst_value(),
                lir::inst_value_t::variable(temp_var),
                lir::binary::kind::op_sub,
                node->get_location()
            ));
            value_stack.push_back({data_kind::variable, temp_var, node->get_resolve()});
            break;
        default: break;
    }
    return true;
}

bool ir_gen::visit_impl_block(impl_block* node) {
    impl_schema_name = full_name(node->get_impl_schema_name());
    for(auto i : node->get_functions()) {
        i->accept(this);
    }
    impl_schema_name = "";
    return true;
}

bool ir_gen::has_self_typecheck_free_annotation(function_decl* node) {
    for(auto i : node->get_annotations()) {
        if (i->get_annotation()=="@self_typecheck_free") {
            return true;
        }
    }
    return false;
}

void ir_gen::add_self_type_check() {
    // note this line to enable self type check generation
    auto typecheck = new lir::call(
        "typecheck_" + impl_schema_name,
        report::span::null()
    );

    blocks.back()->add_new_content(typecheck);
    typecheck->add_arg(lir::inst_value_t::variable("self"));
}

void ir_gen::add_parameter_type_check(function_decl* node) {
    for(auto i : node->get_parameter_list()) {
        const auto& type = i->get_resolve().type;
        if (type==symbol::null()) {
            continue;
        }

        const auto index = ctx->global.get_index(type.full_path_name_without_set());
        if (index==global_symbol_table::npos) {
            continue;
        }

        if (ctx->global.get_kind(index)!=symbol_kind::schema) {
            continue;
        }
        auto typecheck = new lir::call(
            "typecheck_" + type.full_path_name_without_set(),
            i->get_location()
        );
        typecheck->add_arg({
            lir::inst_value_kind::variable,
            i->get_var_name()->get_name()
        });

        blocks.back()->add_new_content(typecheck);
    }
}

bool ir_gen::check_need_parameter_type_check(function_decl* node) {
    for(auto i : node->get_parameter_list()) {
        const auto& type = i->get_resolve().type;
        if (type==symbol::null()) {
            continue;
        }
        const auto index = ctx->global.get_index(type.full_path_name_without_set());
        if (index==global_symbol_table::npos) {
            continue;
        }
        if (ctx->global.get_kind(index)==symbol_kind::schema) {
            return true;
        }
    }
    return false;
}

void ir_gen::not_data_constraint_func_decl(const std::string& function_name,
                                           function_decl* node) {
    // generate rule implementation
    current_rule = new souffle_rule_impl(
        "rule_" + function_name,
        node->get_location()
    );
    if (node->has_return_value() &&
        node->get_return_type()->get_full_name()!="bool") {
        current_rule->add_param("result");
    }
    for(auto i : node->get_parameter_list()) {
        current_rule->add_param(i->get_var_name()->get_name());
    }
    irc.rule_impls.push_back(current_rule);

    // push a new block
    blocks.push_back(current_rule->get_block());
    // self type check flag
    bool need_self_typecheck =
        node->get_parameter_list().size() &&
        node->get_parameter_list().front()->get_var_name()->get_name()=="self" &&
        (
            !flag_enable_self_constraint_optimization ||
            (
                !has_self_typecheck_free_annotation(node) &&
                !node->can_disable_self_check_flag()
            )
        );
    // parameter type check flag
    bool need_parameter_typecheck = check_need_parameter_type_check(node);
    // if need type check, generate a new block to wrap the code block up
    if (need_self_typecheck || need_parameter_typecheck) {
        //
        // warp block (
        //   a; b; c
        // ),
        // typecheck d,
        // typecheck e,
        // typecheck f
        //
        auto warp_block = new lir::block(node->get_location());
        warp_block->set_use_semicolon(); // this is the inside block
        blocks.back()->set_use_comma();
        blocks.back()->add_new_content(warp_block);
        blocks.push_back(warp_block);
    }
    // generate code block
    if (node->get_code_block()) {
        ssa_temp_id = 0;
        for(auto i : node->get_code_block()->get_statement()) {
            i->accept(this);
        }
    }
    // generate type check
    if (need_self_typecheck || need_parameter_typecheck) {
        blocks.pop_back();
        if (need_self_typecheck) add_self_type_check();
        if (need_parameter_typecheck) add_parameter_type_check(node);
    }
    // pop code block
    blocks.pop_back();
}

void ir_gen::data_constraint_func_decl(const std::string& function_name,
                                       function_decl* node) {
    // generate data constraint for schema
    const auto sc_index = ctx->global.get_index(impl_schema_name);
    const auto& sc = ctx->global.get_schema(sc_index);

    // get name of database type parameter
    std::string database_param_name = "";
    for(auto i : node->get_parameter_list()) {
        const auto type = i->get_resolve().type.full_path_name_without_set();
        const auto index = ctx->global.get_index(type);
        const auto kind = ctx->global.get_kind(index);
        if (kind==symbol_kind::database) {
            database_param_name = i->get_var_name()->get_name();
            break;
        }
    }

    if (sc.referenced_by_database_table &&
        flag_ignore_do_schema_data_constraint) {
        // DO schema's __all__ does not need to be generated to data constraint
        ignored_DO_schema.push_back({
            impl_schema_name,
            node->get_name()->get_location()
        });
    } else {
        current_rule = new souffle_rule_impl(
            "schema_" + impl_schema_name,
            node->get_location()
        );
        current_rule->add_param("result");
        // add database name into parameter
        current_rule->add_param(
            database_param_name.empty()?
            "[-1, -1]":
            database_param_name
        );
        // add field name into parameter, doing mangling
        for(const auto& f : sc.ordered_fields) {
            const auto type = sc.fields.at(f);
            const auto name_mangled_field = field_name_mangling(f, type);
            current_rule->add_param(name_mangled_field);
        }
        irc.rule_impls.push_back(current_rule);

        // generate data constraint impl
        blocks.push_back(current_rule->get_block());
        // parameter typecheck
        bool need_self_typecheck =
            node->get_parameter_list().size() &&
            node->get_parameter_list().front()->get_var_name()->get_name()=="self";
        if (need_self_typecheck) {
            auto new_block = new lir::block(node->get_location());
            new_block->set_use_semicolon();
            blocks.back()->set_use_comma();
            blocks.back()->add_new_content(new_block);
            blocks.push_back(new_block);
        }
        if (node->get_code_block()) {
            ssa_temp_id = 0;
            for(auto i : node->get_code_block()->get_statement()) {
                i->accept(this);
            }
        }
        if (need_self_typecheck) {
            blocks.pop_back();
            add_self_type_check();
        }
        blocks.pop_back();
    }

    // generate this method as a rule implementation:
    // rule_name(result, ...) :- schema_name(result, db, ...).
    auto fn_impl = new souffle_rule_impl(
        "rule_" + function_name,
        node->get_location()
    );
    fn_impl->add_param("result");
    for(auto i : node->get_parameter_list()) {
        fn_impl->add_param(i->get_var_name()->get_name());
    }
    auto call = new lir::call("schema_" + impl_schema_name, node->get_location());
    fn_impl->get_block()->add_new_content(call);
    call->add_arg(lir::inst_value_t::variable("result"));
    call->add_arg(database_param_name.empty()?
        lir::inst_value_t::default_value():
        lir::inst_value_t::variable(database_param_name)
    );
    for(size_t i = 0; i<sc.ordered_fields.size(); ++i) {
        call->add_arg(lir::inst_value_t::default_value());
    }
    irc.rule_impls.push_back(fn_impl);
}

bool ir_gen::visit_function_decl(function_decl* node) {
    // check name if the function is in impl block of a schema
    // if name is "__all__", then it is a data constraint
    if (impl_schema_name.length() && node->get_name()->get_name()=="__all__") {
        in_data_constraint = true;
    }

    for(auto i : node->get_annotations()) {
        if (i->get_annotation()=="@output") {
            generate_annotated_output(i, node);
        }
        if (i->get_annotation()=="@input") {
            generate_annotated_input(i, node);
        }
    }

    // generate function name
    auto name = node->get_name()->get_name();
    if (name=="main" && impl_schema_name.empty()) {
        generate_output(node->get_code_block());
        return true;
    }
    if (impl_schema_name.length()) {
        name = impl_schema_name + "::" + name;
    } else {
        const auto& ns = godel_module::instance()
                                     ->find_module_by_file(ctx->this_file_name);
        name = (ns.length()? ns + "::":"") + name;
    }

    if (!in_data_constraint) {
        not_data_constraint_func_decl(name, node);
    } else {
        data_constraint_func_decl(name, node);
    }

    in_data_constraint = false;
    return true;
}

bool ir_gen::visit_query_decl(query_decl* node) {
    // generate full path name of the query
    const auto sym = symbol({
        .type_name = node->get_name()->get_name(),
        .type_loc = node->get_location()
    });
    const auto name = sym.full_path_name();
    const auto index = ctx->global.get_index(name);
    const auto& query_self = ctx->global.get_query(index);

    // generate query declaration rule
    auto query_decl = new souffle_rule_decl("rule_" + name);
    for(const auto& i : query_self.ordered_output_list) {
        query_decl->add_param(i,
            query_self.output_list.at(i).full_path_name_without_set()
        );
    }
    irc.rule_decls.push_back(query_decl);
    irc.souffle_output.push_back("rule_" + name);
    irc.souffle_output_real_name.insert({
        "rule_" + name,
        name
    });

    // generate query implementation rule
    auto query_impl = new souffle_rule_impl(
        "rule_" + name,
        node->get_location()
    );
    for(const auto& i : query_self.ordered_output_list) {
        query_impl->add_param(i);
    }
    query_impl->get_block()->set_use_comma();
    blocks.push_back(query_impl->get_block());
    // generate from list(let-eq) behind all statements
    for(auto i : node->get_from_list()) {
        if (i->get_init_value()->get_resolve().type.is_set) {
            continue;
        }
        i->get_init_value()->accept(this);
        if (value_stack.empty()) {
            report_empty_value_stack(i->get_init_value());
        }
        blocks.back()->add_new_content(new lir::store(
            value_stack.back().to_inst_value(),
            lir::inst_value_t::variable(i->get_var_name()->get_name()),
            i->get_location()
        ));
        value_stack.pop_back();
    }
    // generate condition
    if (node->has_condition()) {
        node->get_where_condition()->accept(this);
    }
    // generate select list
    for(size_t i = 0; i<node->get_select_list().size(); ++i) {
        node->get_select_list()[i]->get_column_value()->accept(this);
        if (value_stack.empty()) {
            report_empty_value_stack(node->get_select_list()[i]);
        }
        blocks.back()->add_new_content(new lir::store(
            value_stack.back().to_inst_value(),
            lir::inst_value_t::variable(query_self.ordered_output_list[i]),
            node->get_select_list()[i]->get_location()
        ));
        value_stack.pop_back();
    }
    // generate from list(for-in) behind all statements
    for(auto i : node->get_from_list()) {
        if (!i->get_init_value()->get_resolve().type.is_set) {
            continue;
        }
        i->get_init_value()->accept(this);
        if (value_stack.empty()) {
            report_empty_value_stack(i->get_init_value());
        }
        blocks.back()->add_new_content(new lir::store(
            value_stack.back().to_inst_value(),
            lir::inst_value_t::variable(i->get_var_name()->get_name()),
            i->get_location()
        ));
        value_stack.pop_back();
    }
    blocks.pop_back();
    irc.rule_impls.push_back(query_impl);
    return true;
}

bool ir_gen::visit_block_stmt(block_stmt* node) {
    if (node->get_statement().size()>1) {
        auto new_test_blk = new lir::block(node->get_location());
        new_test_blk->set_use_semicolon();
        blocks.back()->add_new_content(new_test_blk);
        blocks.push_back(new_test_blk);
    }
    for(auto i : node->get_statement()) {
        i->accept(this);
    }
    if (node->get_statement().size()>1) {
        blocks.pop_back();
    }
    return true;
}

lir::call* ir_gen::typecheck_defined_variable(const infer& infer_result,
                                              const std::string& value) {
    const auto name = infer_result.type.full_path_name_without_set();
    const auto index = ctx->global.get_index(name);
    if (ctx->global.get_kind(index)!=symbol_kind::schema) {
        return nullptr;
    }
    // generate typecheck for schema type variable
    auto typecheck = new lir::call("typecheck_" + name, report::span::null());
    typecheck->add_arg(lir::inst_value_t::variable(value));
    return typecheck;
}

void ir_gen::generate_definition(const std::vector<var_decl*>& var,
                                 std::vector<lir::call*>& vec,
                                 bool is_for_loop) {
    for(auto i : var) {
        i->get_init_value()->accept(this);
        // check value stack, should not be empty
        if (value_stack.empty()) {
            // unreachable
            report_compiler_bug(i,
                "internal error: for/let statement should have a value on stack"
            );
            continue;
        }
        // get value
        const auto top = value_stack.back();
        value_stack.pop_back();
        // varibale name
        const auto& dst = i->get_var_name()->get_name();
        // type check variable if defined in let statement
        if (!is_for_loop) {
            vec.push_back(typecheck_defined_variable(
                i->get_init_value()->get_resolve(),
                dst
            ));
        }
        // store value to variable
        blocks.back()->add_new_content(new lir::store(
            top.to_inst_value(),
            lir::inst_value_t::variable(dst),
            i->get_location()
        ));
    }
}

bool ir_gen::visit_for_stmt(for_stmt* node) {
    auto new_test_blk = new lir::block(node->get_location());
    blocks.back()->add_new_content(new_test_blk);
    blocks.push_back(new_test_blk);
    if (flag_enable_for_optimization) {
        optimized_for_stmt_gen(node);
    } else {
        unoptimized_for_stmt_gen(node);
    }
    blocks.pop_back();
    return true;
}

void ir_gen::optimized_for_stmt_gen(for_stmt* node) {
    if (node->get_code_block()) {
        node->get_code_block()->accept(this);
    }
    // place initialization after the block to avoid join
    // in most cases it works but some special cases it does not work
    std::vector<lir::call*> vec;
    generate_definition(node->get_symbols(), vec, true);
    for(auto i : vec) {
        if (i) {
            blocks.back()->add_new_content(i);
        }
    }
}

void ir_gen::unoptimized_for_stmt_gen(for_stmt* node) {
    std::vector<lir::call*> vec;
    generate_definition(node->get_symbols(), vec, true);
    if (node->get_code_block()) {
        node->get_code_block()->accept(this);
    }
    for(auto i : vec) {
        if (i) {
            blocks.back()->add_new_content(i);
        }
    }
}

bool ir_gen::visit_let_stmt(let_stmt* node) {
    auto new_test_blk = new lir::block(node->get_location());
    blocks.back()->add_new_content(new_test_blk);
    blocks.push_back(new_test_blk);
    if (flag_enable_let_optimization) {
        optimized_let_stmt_gen(node);
    } else {
        unoptimized_let_stmt_gen(node);
    }
    blocks.pop_back();
    return true;
}

void ir_gen::optimized_let_stmt_gen(let_stmt* node) {
    if (node->get_code_block()) {
        node->get_code_block()->accept(this);
    }
    // place initialization after the block to avoid join
    // in most cases it works but some special cases it does not work
    std::vector<lir::call*> vec;
    generate_definition(node->get_symbols(), vec, false);
    for(auto i : vec) {
        if (i) {
            blocks.back()->add_new_content(i);
        }
    }
}

void ir_gen::unoptimized_let_stmt_gen(let_stmt* node) {
    std::vector<lir::call*> vec;
    generate_definition(node->get_symbols(), vec, false);
    if (node->get_code_block()) {
        node->get_code_block()->accept(this);
    }
    for(auto i : vec) {
        if (i) {
            blocks.back()->add_new_content(i);
        }
    }
}

bool ir_gen::visit_cond_stmt(cond_stmt* node) {
    node->get_if_stmt()->accept(this);
    if (node->get_elsif_stmt().size() || node->has_else_stmt()) {
        err.err(node->get_location(),
            "elsif or else clause is not allowed to be translated to souffle.",
            "please use if clause instead."
        );
        return false;
    }
    return true;
}

bool ir_gen::visit_if_stmt(if_stmt* node) {
    auto new_test_blk = new lir::block(node->get_location());
    blocks.back()->add_new_content(new_test_blk);
    blocks.push_back(new_test_blk);
    if (node->get_condition()) {
        node->get_condition()->accept(this);
    }
    if (node->get_code_block()) {
        node->get_code_block()->accept(this);
    }
    blocks.pop_back();
    return true;
}

bool ir_gen::visit_ret_stmt(ret_stmt* node) {
    auto new_blk = new lir::block(node->get_location());
    blocks.back()->add_new_content(new_blk);
    blocks.push_back(new_blk);

    node->get_return_value()->accept(this);

    // do not generate anything if the resolved return type is boolean
    if (node->get_return_value()->get_resolve().type==symbol::boolean()) {
        blocks.pop_back();
        return true;
    }

    // by default, the return value will be stored into `result` variable
    if (value_stack.size()) {
        blocks.back()->add_new_content(new lir::store(
            value_stack.back().to_inst_value(),
            lir::inst_value_t::variable("result"),
            node->get_return_value()->get_location()
        ));
        value_stack.pop_back();
    }
    blocks.pop_back();
    return true;
}

bool ir_gen::visit_fact_data(fact_data* node) {
    auto new_fact = new lir::fact(node->get_location());
    blocks.back()->add_new_content(new_fact);

    const auto& params = current_rule->get_params();
    size_t c = 0;
    for(auto i : node->get_literals()) {
        i->accept(this);

        // value stack should not be empty
        if (value_stack.empty()) {
            report_empty_value_stack(node);
            break;
        }

        // size of literal list should match with rule's parameter
        if (c>=params.size()) {
            report_compiler_bug(node,
                "fatal error occurred when generating fact data."
            );
            break;
        }

        // inst_value_t here should be inst_value_t::variable
        new_fact->add_pair(params[c], value_stack.back().to_inst_value());
        value_stack.pop_back();
        c++;
    }
    return true;
}

bool ir_gen::visit_fact_stmt(fact_stmt* node) {
    auto new_blk = new lir::block(node->get_location());
    new_blk->set_use_semicolon();
    blocks.back()->add_new_content(new_blk);
    blocks.push_back(new_blk);
    for(auto i : node->get_facts()) {
        i->accept(this);
    }
    blocks.pop_back();
    return true;
}

bool ir_gen::visit_match_pair(match_pair* node) {
    auto new_block = new lir::block(node->get_location());
    blocks.back()->add_new_content(new_block);
    blocks.push_back(new_block);

    const auto stack_top = value_stack.back();
    node->get_literal()->accept(this);
    blocks.back()->add_new_content(new lir::store(
        value_stack.back().to_inst_value(),
        stack_top.to_inst_value(),
        node->get_literal()->get_location()
    ));

    // pop stack_top
    value_stack.pop_back();
    node->get_statement()->accept(this);

    blocks.pop_back();
    return true;
}

bool ir_gen::visit_match_stmt(match_stmt* node) {
    auto new_match_uplevel_block = new lir::block(node->get_location());
    blocks.back()->add_new_content(new_match_uplevel_block);
    blocks.push_back(new_match_uplevel_block);
    node->get_match_condition()->accept(this);

    // generate match block
    auto new_match_block = new lir::block(node->get_location());
    new_match_block->set_use_semicolon();
    blocks.back()->add_new_content(new_match_block);
    blocks.push_back(new_match_block);
    for(auto i : node->get_match_pair_list()) {
        i->accept(this);
    }
    // pop match block
    blocks.pop_back();
    // pop match uplevel block
    blocks.pop_back();
    return true;
}

bool ir_gen::visit_in_block_expr(in_block_expr* node) {
    // should be unreachable
    // will be reported in semantic analysis: ungrounded check
    // but we add this report here to avoid unexpected error
    // because we will change ungrounded check pass from ast-check to lir-check
    // in future versions
    report_compiler_bug(node, "return value is not grounded.");

    auto new_blk = new lir::block(node->get_location());
    blocks.back()->add_new_content(new_blk);
    blocks.push_back(new_blk);
    node->get_expr()->accept(this);
    blocks.pop_back();
    return true;
}

bool ir_gen::visit_call_head(call_head* node) {
    if (node->get_first_expression()->get_ast_class()==ast_class::ac_identifier) {
        auto fe = node->get_first_expression();
        auto id = reinterpret_cast<identifier*>(fe);
        generate_symbol_call(id);
    } else {
        node->get_first_expression()->accept(this);
    }
    if (node->has_func_call()) {
        if (path_infer_result.kind==path_kind::schema) {
            func_stack.push_back({
                func_kind::function,
                "rule_" + path_infer_result.content + "::__all__",
                node->get_resolve()
            });
        }
        node->get_func_call()->accept(this);
    }
    if (node->is_initializer()) {
        node->get_initializer()->accept(this);
    }
    field_infer_result = node->get_resolve();
    return true;
}

bool ir_gen::visit_call_expr(call_expr* node) {
    switch (node->get_call_type()) {
        case call_expr::type::get_field: get_field_from_infer(node); break;
        case call_expr::type::get_path: get_path_from_infer(node); break;
    }
    if (node->is_generic()) {
        node->get_generic_type()->accept(this);
    }
    if (node->has_func_call()) {
        if (path_infer_result.kind==path_kind::schema) {
            func_stack.push_back({
                func_kind::function,
                "rule_" + path_infer_result.content + "::__all__",
                node->get_resolve()
            });
        }
        node->get_func_call()->accept(this);
    }
    if (node->is_initializer()) {
        node->get_initializer()->accept(this);
    }
    field_infer_result = node->get_resolve();
    return true;
}

bool ir_gen::visit_call_root(call_root* node) {
    path_infer_result = {path_kind::null, ""};
    field_infer_result = infer::null();

    // if the call chain has aggregator, we need to handle it specially
    bool flag_call_chain_has_aggregator = false;
    for(auto i : node->get_call_chain()) {
        if (i->is_aggregator() && !i->is_aggregator_find()) {
            flag_call_chain_has_aggregator = true;
            break;
        }
    }
    if (flag_call_chain_has_aggregator) {
        handle_aggregator_call_root(node);
        return true;
    }

    node->get_call_head()->accept(this);
    for(auto i : node->get_call_chain()) {
        if (i->get_call_type()==call_expr::type::get_field) {
            path_infer_result = {path_kind::null, ""};
        }
        i->accept(this);
    }
    return true;
}

void ir_gen::generate_aggregator(const std::vector<call_expr*>& chain,
                                 call_head* head,
                                 call_expr* aggregator_node) {
    std::vector<call_expr*> subchain;
    call_expr* mark_node = nullptr;
    // find the last aggregator in the call chain
    for(auto i = chain.rbegin(); i!=chain.rend(); ++i) {
        if ((*i)->is_aggregator() && !(*i)->is_aggregator_find()) {
            mark_node = *i;
            break;
        }
    }
    // if there is no aggregator, doing generation
    if (!mark_node) {
        auto new_block = new lir::block(head->get_location());
        blocks.push_back(new_block);
        head->accept(this);
        for(auto i : chain) {
            if (i->get_call_type()==call_expr::type::get_field) {
                path_infer_result = {path_kind::null, ""};
            }
            i->accept(this);
        }
        blocks.pop_back();

        auto temp_var = generate_temp_variable();
        const auto& name = aggregator_node->get_field_name()->get_name();
        auto new_aggr_call = new lir::aggregator(
            name,
            name!="len"? value_stack.back().to_inst_value():lir::inst_value_t::null(),
            lir::inst_value_t::variable(temp_var),
            aggregator_node->get_location()
        );
        // aggregator has a return value, pop it from the stack
        value_stack.pop_back();
        value_stack.push_back({
            data_kind::variable,
            temp_var,
            aggregator_node->get_resolve()
        });
        new_aggr_call->set_body(new_block);
        blocks.back()->add_new_content(new_aggr_call);
        field_infer_result = aggregator_node->get_resolve();
        return;
    }
    // otherwise, generate the call chain
    for(auto i : chain) {
        if (i==mark_node) {
            break;
        }
        subchain.push_back(i);
    }
    // and generate the sub chain's aggregator
    generate_aggregator(subchain, head, mark_node);

    // then generate the outer aggregator
    auto new_block = new lir::block(aggregator_node->get_location());
    blocks.push_back(new_block);
    bool reached_mark_node = false;
    for(auto i : chain) {
        if (i->get_call_type()==call_expr::type::get_field) {
            path_infer_result = {path_kind::null, ""};
        }
        if (reached_mark_node) {
            i->accept(this);
        }
        if (i==mark_node) {
            reached_mark_node = true;
        }
    }
    blocks.pop_back();

    auto temp_var = generate_temp_variable();
    const auto& name = aggregator_node->get_field_name()->get_name();
    auto new_aggr_call = new lir::aggregator(
        name,
        name!="len"? value_stack.back().to_inst_value():lir::inst_value_t::null(),
        lir::inst_value_t::variable(temp_var),
        aggregator_node->get_location()
    );
    // aggregator has a return value, pop it from the stack
    value_stack.pop_back();
    value_stack.push_back({
        data_kind::variable,
        temp_var,
        aggregator_node->get_resolve()
    });
    new_aggr_call->set_body(new_block);
    blocks.back()->add_new_content(new_aggr_call);
    field_infer_result = aggregator_node->get_resolve();
}

void ir_gen::handle_aggregator_call_root(call_root* node) {
    std::vector<call_expr*> chain;
    call_expr* mark_node = nullptr;
    // find the last aggregator in the call chain
    for(auto i = node->get_call_chain().rbegin(); i!=node->get_call_chain().rend(); ++i) {
        if ((*i)->is_aggregator()) {
            mark_node = *i;
            break;
        }
    }
    // if there is no aggregator, just return
    if (!mark_node) {
        return;
    }
    // this condition is unreachable, but we add it anyway for safety
    if (mark_node->is_aggregator_find()) {
        report_compiler_bug(mark_node,
            "recognized aggregator find as souffle aggregator."
        );
        return;
    }
    // otherwise, generate the call chain
    for(auto i : node->get_call_chain()) {
        if (i==mark_node) {
            break;
        }
        chain.push_back(i);
    }
    // and generate the aggregator
    generate_aggregator(chain, node->get_call_head(), mark_node);

    // generate remained call chain
    bool reach_mark_node = false;
    for(auto i : node->get_call_chain()) {
        if (i==mark_node) {
            reach_mark_node = true;
            continue;
        }
        if (!reach_mark_node) {
            continue;
        }
        i->accept(this);
    }
}

bool ir_gen::visit_func_call(func_call* node) {
    for(auto i : node->get_arguments()) {
        i->accept(this);
    }
    if (func_stack.empty()) {
        report_empty_func_stack(node);
        return true;
    }

    // do lowering for `S.to<D>()`, for example:
    //
    // src.to<Dst>()
    //  =>
    // (typecheck_Dst(src), ssa_temp_0 = src)
    //
    if (func_stack.back().kind==func_kind::schema_to) {
        auto schema_to_block = new lir::block(node->get_location());
        auto typecheck_call = new lir::call(
            "typecheck_" + replace_colon(func_stack.back().generic_type),
            node->get_location()
        );
        const auto source = value_stack.back();
        value_stack.pop_back();

        typecheck_call->set_call_type(lir::call::kind::function);
        typecheck_call->add_arg(source.to_inst_value());

        schema_to_block->add_new_content(typecheck_call);
        blocks.back()->add_new_content(schema_to_block);
        func_stack.pop_back();

        const auto temp_var = generate_temp_variable();
        value_stack.push_back({data_kind::variable, temp_var, node->get_resolve()});
        schema_to_block->add_new_content(new lir::store(
            source.to_inst_value(),
            lir::inst_value_t::variable(temp_var),
            node->get_location()
        ));
        return true;
    }

    // do lowering for `S.is<D>()`, for example:
    //
    // src.is<Dst>()
    //  =>
    // typecheck_Dst(src)
    //
    if (func_stack.back().kind==func_kind::schema_is) {
        auto typecheck_call = new lir::call(
            "typecheck_" + replace_colon(func_stack.back().generic_type),
            node->get_location()
        );
        const auto source = value_stack.back();
        value_stack.pop_back();

        typecheck_call->set_call_type(lir::call::kind::function);
        typecheck_call->add_arg(source.to_inst_value());
        blocks.back()->add_new_content(typecheck_call);
        return true;
    }

    auto call = new lir::call(func_stack.back().content, node->get_location());
    switch(func_stack.back().kind) {
        case func_kind::function: call->set_call_type(lir::call::kind::function); break;
        case func_kind::database_load: call->set_call_type(lir::call::kind::database_load); break;
        case func_kind::basic_static: call->set_call_type(lir::call::kind::basic_static); break;
        case func_kind::method: call->set_call_type(lir::call::kind::method); break;
        case func_kind::find: call->set_call_type(lir::call::kind::find); break;
        case func_kind::key_cmp: call->set_call_type(lir::call::kind::key_cmp); break;
        case func_kind::to_set: call->set_call_type(lir::call::kind::to_set); break;
        case func_kind::basic_method: call->set_call_type(lir::call::kind::basic_method); break;
        default: report_compiler_bug(node, "unknown function kind."); break;
    }
    // generate arguments(from value stack) of the call
    switch(func_stack.back().kind) {
        case func_kind::function:
        case func_kind::database_load:
        case func_kind::basic_static: generate_function_call(node, call); break;
        case func_kind::method:
        case func_kind::find:
        case func_kind::key_cmp:
        case func_kind::to_set:
        case func_kind::basic_method: generate_method_call(node, call); break;
        default: report_compiler_bug(node, "unknown function kind."); break;
    }
    func_stack.pop_back();

    if (node->get_resolve().type!=symbol::boolean()) {
        const auto temp_var = generate_temp_variable();
        call->set_return(lir::inst_value_t::variable(temp_var));
        value_stack.push_back({data_kind::variable, temp_var, node->get_resolve()});
    }
    blocks.back()->add_new_content(call);
    return true;
}

void ir_gen::generate_field_pair(
    initializer_pair* node,
    std::unordered_map<std::string, value_data>& fields) {

    node->get_field_value()->accept(this);
    fields.insert({node->get_field_name()->get_name(), value_stack.back()});
    value_stack.pop_back();
}

void ir_gen::generate_spread_expr(
    spread_expr* node,
    std::unordered_map<std::string, value_data>& fields) {

    node->get_child()->accept(this);

    const auto& infer_result = node->get_resolve();
    const auto full_name = infer_result.type.full_path_name_without_set();
    const auto index = ctx->global.get_index(full_name);
    const auto& infer_schema = ctx->global.get_schema(index);

    for(const auto& field : infer_schema.ordered_fields) {
        const auto name = "get_field_" + full_name + "_" + field;

        // generate call
        auto call = new lir::call(name, node->get_location());
        call->set_call_type(lir::call::kind::method);
        call->add_arg(value_stack.back().to_inst_value());

        // generate call result
        const auto result = generate_temp_variable();
        call->set_return(lir::inst_value_t::variable(result));
        blocks.back()->add_new_content(call);

        fields.insert({
            field,
            value_data {
                data_kind::variable,
                result,
                infer {false, infer_schema.fields.at(field)}
            }
        });
    }

    value_stack.pop_back();
}

bool ir_gen::visit_initializer(initializer* node) {
    std::unordered_map<std::string, value_data> fields;
    for(auto i : node->get_field_pairs()) {
        generate_field_pair(i, fields);
    }
    for(auto i : node->get_spread_exprs()) {
        generate_spread_expr(i, fields);
    }

    // get schema
    const auto index = ctx->global.get_index(
        node->get_resolve().type.full_path_name_without_set()
    );
    const auto& sc = ctx->global.get_schema(index);

    // check this initializer is initializing itself,
    // otherwise this initializer will not be used as a data constraint
    bool self_initializer = node->get_resolve()
                                .type
                                .full_path_name_without_set()==impl_schema_name;
    if (!in_data_constraint || !self_initializer) {
        // generate result temp variavle
        const auto temp_var = generate_temp_variable();
        value_stack.push_back({
            data_kind::variable,
            temp_var,
            node->get_resolve()
        });
        auto ctor = new lir::constructor(
            node->get_resolve().type.full_path_name_without_set(),
            lir::inst_value_t::variable(temp_var),
            node->get_location()
        );
        for(const auto& i : sc.ordered_fields) {
            ctor->add_field(fields.at(i).to_inst_value());
        }
        blocks.back()->add_new_content(ctor);
    } else {
        // generate construct code in data constraint block
        for(const auto& f : sc.ordered_fields) {
            const auto name_mangled_field = field_name_mangling(f, sc.fields.at(f));
            blocks.back()->add_new_content(new lir::store(
                fields.at(f).to_inst_value(),
                lir::inst_value_t::variable(name_mangled_field),
                node->get_location()
            ));
        }
        // generate result variable
        if (sc.has_primary_key()) {
            const auto& key = sc.get_primary_key();
            const auto name_mangled_field = field_name_mangling(key, sc.fields.at(key));
            blocks.back()->add_new_content(new lir::store(
                lir::inst_value_t::variable(name_mangled_field),
                lir::inst_value_t::variable("result"),
                node->get_location()
            ));
        } else {
            auto record = new lir::record(
                lir::inst_value_t::variable("result"),
                node->get_location()
            );
            blocks.back()->add_new_content(record);
            for(const auto& f : sc.ordered_fields) {
                record->add_field(fields.at(f).to_inst_value());
            }
        }
    }
    return true;
}

void ir_gen::generate(const cli::configure& config, ast_root* root) {
    // for/let optimization switch
    flag_enable_for_optimization = config.count(cli::option::cli_enable_for_opt);
    flag_enable_let_optimization = config.count(cli::option::cli_enable_let_opt);
    // self constraint switch
    flag_enable_self_constraint_optimization = config.count(cli::option::cli_enable_self_constraint_opt);
    if (config.count(cli::option::cli_disable_do_schema_opt)) {
        flag_ignore_do_schema_data_constraint = false;
    }

    // souffle result output format
    if (config.count(cli::option::cli_souffle_json_output)) {
        irc.json_output_path = config.at(cli::option::cli_souffle_json_output);
    }
    if (config.count(cli::option::cli_souffle_csv_output)) {
        irc.csv_output_path = config.at(cli::option::cli_souffle_csv_output);
    }
    if (config.count(cli::option::cli_souffle_sqlite_output)) {
        irc.sqlite_output_path = config.at(cli::option::cli_souffle_sqlite_output);
    }
    // count chosen output format
    size_t output_kind_count = config.count(cli::option::cli_souffle_json_output) +
                               config.count(cli::option::cli_souffle_csv_output) +
                               config.count(cli::option::cli_souffle_sqlite_output);
    // only one output format is allowed now
    if (output_kind_count>1) {
        auto output_kind = std::string("too many souffle output kind specified:");
        if (config.count(cli::option::cli_souffle_json_output)) {
            output_kind += " json";
        }
        if (config.count(cli::option::cli_souffle_csv_output)) {
            output_kind += " csv";
        }
        if (config.count(cli::option::cli_souffle_sqlite_output)) {
            output_kind += " sqlite";
        }
        output_kind += ".";
        err.err(output_kind);
    }

    // generate type alias, declarations
    // and automatically generated rules (not written by user)
    emit_type_alias_for_database();
    emit_type_alias_for_enum();
    emit_type_alias_for_schema();
    emit_database_get_table_decl();
    emit_schema_decl();
    emit_schema_type_check();
    emit_schema_get_field();
    emit_DO_schema_default_constructor();
    emit_func_decl();

    // generate rule implementation (written by user)
    ignored_DO_schema.clear();
    root->accept(this);

    report_ignored_DO_schema_data_constraint();
}

}