#include "godel-frontend/src/sema/function_declaration.h"
#include "godel-frontend/src/sema/annotation_checker.h"

namespace godel {

void function_generator::check_cache_annotation_confliction(const function& func,
                                                            function_decl* node) {
    if (!func.has_annotation("@cache")) {
        return;
    }
    const auto& front_loc = node->get_annotations().front()->get_location();
    const auto& back_loc = node->get_annotations().back()->get_location();
    const auto merged_loc = span(
        front_loc.start_line,
        front_loc.start_column,
        back_loc.end_line,
        back_loc.end_column,
        front_loc.file
    );
    if (func.has_annotation("@inline")) {
        err->err(merged_loc,
            "cannot use \"@inline\" and \"@cache\" together.",
            "inlined function cannot be cached."
        );
    }
    if (func.name=="__all__") {
        err->err(merged_loc,
            "\"__all__\" cannot use \"@cache\".",
            "data constraint function cannot be cached."
        );
    }
    if (func.is_global && func.name == "main") {
        err->warn(merged_loc,
            "\"@cache\" on main function will be ignored."
        );
    }
}

void function_generator::check_output_annotations(function& func, function_decl* node) {
    if (!func.has_annotation_name("@output")) {
        return;
    }

    // check annotation confliction
    if (func.has_annotation("@inline")) {
        err->err(node->get_location(),
            "cannot use \"@inline\" and \"@output\" together.",
            "inlined function cannot be output."
        );
        return;
    }

    // string literal is quoted by \"
    const std::unordered_set<std::string> allowed_formats = {
        "\"stdout\"", "\"json\"", "\"sqlite\"", "\"csv\""
    };
    for(const auto& i : func.annotations) {
        if (i.annotation_name=="@output") {
            output_annotation_checker::check(*err, i);
        }
    }
}

void function_generator::check_input_annotations(function& func, function_decl* node) {
    if (!func.has_annotation_name("@input")) {
        return;
    }

    if (flag_in_impl) {
        err->err(node->get_location(),
            "cannot use \"@input\" in implementation block.",
            "only support \"@input\" on global function."
        );
        return;
    }

    // check annotation confliction
    if (func.has_annotation("@inline")) {
        err->err(node->get_location(),
            "cannot use \"@inline\" and \"@input\" together.",
            "inlined function cannot be input."
        );
        return;
    }

    for(const auto& i : func.annotations) {
        if (i.annotation_name=="@input") {
            input_annotation_checker::check(*err, i);
        }
    }
}

void function_generator::check_single_annotation(annotation* node) {
    const auto checker = annotation_checker::instance();
    const auto& name = node->get_annotation();

    // check annotation validity
    if (!checker->is_valid_function_annotation(name)) {
        err->warn(node->get_location(),
            "invalid annotation for function.",
            "ignored."
        );
        return;
    } else if (checker->is_deprecated_annotation(name)) {
        err->warn(node->get_location(),
            "deprecated annotation for function.",
            "ignored."
        );
        return;
    } else if (checker->is_deprecated_no_warning(name)) {
        return;
    }

    if (checker->is_input_annotation(name) ||
        checker->is_output_annotation(name)) {
        return;
    }

    // check need property string
    if (checker->need_property_string(name) &&
        node->get_property_string().empty()) {
        err->err(node->get_location(), "need property string.");
        return;
    }

    if (!checker->need_property_string(name) &&
        node->get_property_string().length()) {
        err->warn(node->get_location(),
            "property string is not needed here.",
            "ignored."
        );
    }
    if (!checker->need_property_map(name) &&
        node->get_ordered_properties().size()) {
        err->warn(node->get_location(),
            "property map is not needed here.",
            "ignored."
        );
    }
}

void function_generator::check_annotations(function& func, function_decl* node) {
    for(auto i : node->get_annotations()) {
        check_single_annotation(i);
    }

    check_input_annotations(func, node);
    check_output_annotations(func, node);
    check_cache_annotation_confliction(func, node);
}

void function_generator::load_annotation(function& func, function_decl* node) {
    func.annotations.clear();
    for(auto i : node->get_annotations()) {
        annot tmp_anno;
        tmp_anno.annotation_name = i->get_annotation();
        tmp_anno.property = i->get_property_string();
        for(const auto& j : i->get_ordered_properties()) {
            tmp_anno.property_map.insert({j.first, j.second});
        }
        tmp_anno.location = i->get_location();
        func.annotations.push_back(tmp_anno);
    }
}

function function_generator::generate(function_decl* node,
                                      bool in_impl,
                                      const std::string& self_type) {
    flag_in_impl = in_impl;
    self_type_name = self_type;
    const auto name_node = node->get_name();

    function func;
    func.name = name_node->get_name();
    func.location = name_node->get_location();
    func.public_access_authority = node->is_public();
    // check if function declaration is implemented
    func.implemented = node->implemented();
    // check if function is global function
    func.is_global = !in_impl;

    // load and check annotation
    load_annotation(func, node);
    check_annotations(func, node);

    // load and check return type
    load_return_type_and_check(func, node);

    // load parameter list
    load_parameters(func, node);

    return func;
}

symbol function_generator::generate_return_type(type_def* node) {
    symbol ret = {
        .type_name = node->get_short_name(),
        .type_loc = span::null(),
        .location = node->get_location(),
        .is_set = node->is_set()
    };

    // fill Self with real type
    if (ret.type_name=="Self" && self_type_name.length()) {
        ret.type_name = self_type_name;
    } else if (ret.type_name=="Self" && !self_type_name.length()) {
        err->err(node->get_location(),
            "cannot bind \"Self\" with an exist type."
        );
    }

    // check type or Self type exists
    if (ret.type_name!="Self" && !ctx->find_global(ret.type_name)) {
        err->err(node->get_location(),
            "undefined symbol \"" + ret.full_path_name() + "\"."
        );
    }

    // check return symbol
    const auto ret_sym_kind = ctx->find_global_kind(ret.type_name);
    if (ret_sym_kind==symbol_kind::function || ret_sym_kind==symbol_kind::query) {
        err->err(node->get_location(), "cannot return function or query.");
    }

    // update location with the real symbol place
    ret.type_loc = ctx->find_global_location(ret.type_name);
    if (node->is_full_path()) {
        if (!ctx->check_full_path_type_imported(*err, node)) {
            return ret;
        }
        const auto full_path_name = node->get_full_name();
        const auto index = ctx->global.get_index(full_path_name);
        ret.type_loc = ctx->global.get_location(index);
    } else {
        ctx->report_conflict_symbol(*err, ret.location, ret.type_name);
    }
    return ret;
}

void function_generator::load_return_type_and_check(function& func,
                                                    function_decl* node) {
    const auto name_node = node->get_name();
    // only main function could have no return value
    // other functions must have return value
    if (!node->has_return_value() && name_node->get_name()!="main") {
        err->err(name_node->get_location(),
            "need return value type.",
            "only \"main\" does not need return value."
        );
    }
    // impl functions must not have name "main"
    if (flag_in_impl && name_node->get_name()=="main") {
        err->err(name_node->get_location(),
            "cannot use \"main\" as the method name."
        );
    }

    // load return value type, null must be used only for main function
    if (node->has_return_value()) {
        func.return_type = generate_return_type(node->get_return_type());
    } else {
        func.return_type = symbol::null();
    }
}

symbol function_generator::generate_parameter(var_decl* child,
                                              uint32_t position,
                                              const function& func) {
    const auto var_node = child->get_var_name();
    const auto type_node = child->get_type();
    const auto& param_name = var_node->get_name();

    if (!flag_in_impl && param_name=="self") {
        err->err(var_node->get_location(),
            "global function cannot use parameter \"self\"."
        );
        return symbol::error();
    }

    // check if parameter "self" is the first one, if is, the position should be 0
    if (param_name=="self" && position) {
        err->err(var_node->get_location(),
            "\"self\" should be the first parameter.",
            "move \"self\" to the first place."
        );
    }
    if (param_name=="self" && child->has_declared_type()) {
        err->err(type_node->get_location(),
            "\"self\" does not need type declaration."
        );
    }

    if (func.parameter_list.count(param_name)) {
        err->err(var_node->get_location(),
            "redefinition of\"" + param_name + "\"."
        );
    } else if (ctx->find_global(param_name)) {
        err->warn(var_node->get_location(),
            "\"" + param_name + "\" shadows a global symbol."
        );
    } else if (invalid_parameter_name.count(param_name)) {
        err->err(var_node->get_location(),
            "variables cannot use this name.",
            "this name is reserved to avoid confliction in generated codes."
        );
    }

    // parameter type, if is "self", load type later
    symbol param = {
        .type_name = (child->has_declared_type()? type_node->get_short_name():""),
        .type_loc = span::null(),
        .location = var_node->get_location(),
        .is_set = (child->has_declared_type() && type_node->is_set()),
    };
    if (!param.type_name.length()) {
        param.type_loc = var_node->get_location();
    } else {
        param.type_loc = ctx->find_global_location(param.type_name);
    }

    if (param==symbol::boolean()) {
        err->err(type_node->get_location(), "\"bool\" parameter is not allowed.");
    }

    // parameter type check
    if (child->has_declared_type() && type_node->is_full_path()) {
        if (!ctx->check_full_path_type_imported(*err, type_node)) {
            return param;
        }
        const auto& full_path_name = type_node->get_full_name();
        const auto index = ctx->global.get_index(full_path_name);
        param.type_loc = ctx->global.get_location(index);
    } else {
        ctx->report_conflict_symbol(*err, param.location, param.type_name);
    }

    if (param.type_name.length() && !ctx->is_data_type(param.type_name)) {
        err->err(type_node->get_location(),
            "\"" + param.full_path_name() +
            "\" is undefined or not a data type."
        );
    }
    if (!param.type_name.length() &&
        (!flag_in_impl || param_name!="self")) {
        err->err(var_node->get_location(),
            "parameter \"" + param_name + "\" requires a type."
        );
    }

    child->set_resolve({
        .is_global = false,
        .type = param
    });
    return param;
}

void function_generator::load_parameters(function& func, function_decl* node) {
    // used to check if parameter "self" occurs first
    uint32_t cnt = 0;
    for(auto child: node->get_parameter_list()) {
        const auto var_node = child->get_var_name();
        const auto& param_name = var_node->get_name();

        auto param = generate_parameter(child, cnt, func);
        ++cnt;
        // insert new parameter
        func.parameter_list.insert({param_name, param});
        // record parameters order
        func.ordered_parameter_list.push_back(param_name);
        if (param_name!="self") {
            ctx->global.add_local_variable(param_name, var_node->get_location(), param);
        }
    }
}

bool function_declaration::visit_function_decl(function_decl* node) {
    const auto name_node = node->get_name();
    const auto& name = name_node->get_name();

    // check function existence
    if (ctx->find_global(name) && ctx->find_global_kind(name)!=symbol_kind::function) {
        err->err(name_node->get_location(), "\"" + name + "\" exists.");
        return false;
    }

    // check if implemented
    if (!node->implemented()) {
        err->err(node->get_location(), "global function must be implemented.");
        return false;
    }

    // generate global function semantic info
    ctx->global.get_func(ctx->mapper.at(name)) = generator.generate(node, false);
    return true;
}

bool function_declaration::visit_impl_block([[maybe_unused]] impl_block* node) {
    // avoid scanning function implements in impl block
    return true;
}

void function_declaration::check(ast_root* root) {
    for(auto i : root->get_declarations()) {
        i->accept(this);
    }
}

bool impl_function_declaration::visit_impl_block(impl_block* node) {
    check_impl_schema(node);
    return true;
}

void impl_function_declaration::check_impl_schema(impl_block* node) {
    const auto name_node = node->get_impl_schema_name();
    const auto& name = name_node->get_name();

    // check if this schema exists
    if (!ctx->this_name_space.count(name) ||
        ctx->this_name_space.at(name)!=symbol_kind::schema) {
        err->err(name_node->get_location(), "schema \"" + name + "\" does not exist.");
        return;
    }

    auto& sc = ctx->global.get_schema(ctx->mapper.at(name));

    // should implement schema in where it is defined
    if (sc.location.file!=node->get_file()) {
        err->err(name_node->get_location(), "must implement in " + sc.location.file + " .");
        return;
    }

    // add new function as schema's method
    for(auto child: node->get_functions()) {
        auto func = generator.generate(child, true, name);
        // update self type
        if (func.parameter_list.count("self")) {
            auto& self = func.parameter_list.at("self");
            self.type_name = name;
            self.type_loc = ctx->find_global_location(name);
            ctx->global.add_local_variable("self", self.location, self);
        }

        // check name shadowing
        const auto func_name_node = child->get_name();
        const auto& func_name = func_name_node->get_name();

        // data constraint annotation is deprecated
        if (func_name!="__all__" && func.has_annotation("@data_constraint")) {
            err->err(func_name_node->get_location(),
                "invalid data constraint.",
                "must use \"__all__\"."
            );
        }

        if (sc.fields.count(func_name)) {
            err->err(func_name_node->get_location(),
                "method \"" + func_name + "\" repeats with field."
            );
            continue;
        }
        if (sc.methods.count(func_name)) {
            err->err(func_name_node->get_location(),
                "redeclaration of \"" + func_name + "\"."
            );
            continue;
        }

        // check function implemention
        if (!func.implemented) {
            err->err(func_name_node->get_location(),
                "this function is not implemented."
            );
        }
        if (func_name=="__all__" && func.return_type.type_name!=name) {
            const auto loc = ctx->find_global_location(name);
            const auto this_schema = symbol({
                .type_name = name,
                .type_loc = loc,
                .is_set = true
            });
            if (child->get_return_type()) {
                err->err(child->get_return_type()->get_location(),
                    "return type of data constraint \"" + func_name +
                    "\" should be \"" + this_schema.full_path_name() +
                    "\", but get \"" + func.return_type.full_path_name() + "\"."
                );
            } else {
                err->err(child->get_location(),
                    "data constraint \"" + func_name +
                    "\" should have return value."
                );
            }
        }

        // this is direct implemention
        // so do not need to check parameter format
        sc.methods[func_name] = func;
    }
}

void impl_function_declaration::check(ast_root* root) {
    for(auto i : root->get_declarations()) {
        i->accept(this);
    }
}

}