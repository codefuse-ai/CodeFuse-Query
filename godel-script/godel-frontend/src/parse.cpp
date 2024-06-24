#include "parse.h"
#include "godel-frontend/src/error/error.h"
#include "godel-frontend/src/util/util.h"

#include "ast/ast_root.h"
#include "ast/decl.h"
#include "ast/stmt.h"
#include "ast/expr.h"

#include <unordered_set>

namespace godel {

void parse::next() {
    if(toks[ptr].type==tok::tok_eof) {
        return;
    }
    ++ptr;
}

void parse::match(tok token_type,
                  const std::string& process = "",
                  std::unordered_set<tok> panic = {}) {
    auto head = process.length()? "in " + process + ": ":"";
    // match eof with expected '}'
    if (toks[ptr].type==tok::tok_eof && token_type==tok::tok_rbrace) {
        err.err(toks[ptr].location,
            head + "expected \"}\" here but get <eof>.",
            "check redundant \"{\" before."
        );
        return;
    }
    // match eof
    if (toks[ptr].type==tok::tok_eof) {
        err.err(toks[ptr].location,
            head + "expected " + err_info.at(token_type) +
            " here but get <eof>.",
            "check syntax error before."
        );
        return;
    }
    // fail to match, use panic mode to do error recovery
    if (toks[ptr].type!=token_type) {
        err.err(toks[ptr].location,
            head + "expected " + err_info.at(token_type) + " here."
        );
        panic_mode(panic);
        return;
    }
    next();
}

void parse::panic_mode(std::unordered_set<tok> panic) {
    // make sure it skips at least one token
    next();
    while (!panic.count(toks[ptr].type) && toks[ptr].type!=tok::tok_eof) {
        next();
    }
}

void parse::update_location(ast_node* node) {
    if (!ptr) {
        return;
    }
    node->update_location(toks[ptr-1].location);
}

bool parse::lookahead(tok t) const {
    return toks[ptr].type==t;
}

bool parse::lookahead_elsif() const {
    return toks[ptr].type==tok::tok_else && toks[ptr+1].type==tok::tok_if;
}

bool parse::lookahead_generic() const {
    // check <
    if (toks[ptr].type!=tok::tok_less) {
        return false;
    }

    // check type def
    auto index = ptr+1;
    // type def may begin with "*", check it, though it is wrong
    if (toks[index].type==tok::tok_mult) {
        index++;
    }

    bool should_be_identifier = true;
    while(toks[index].type!=tok::tok_grt && toks[index].type!=tok::tok_eof) {
        if (should_be_identifier && toks[index].type!=tok::tok_id) {
            return false;
        }
        if (!should_be_identifier && toks[index].type!=tok::tok_plink) {
            return false;
        }
        should_be_identifier = !should_be_identifier;
        index++;
    }

    if (toks[index].type!=tok::tok_grt) {
        return false;
    }
    return true;
}

ast_null* parse::null() {
    return new ast_null(toks[ptr].location);
}

identifier* parse::id() {
    identifier* node = new identifier(toks[ptr].location, toks[ptr].content);
    match(tok::tok_id);
    return node;
}

number_literal* parse::num() {
    number_literal* node = nullptr;
    if (toks[ptr].content.find('.')!=std::string::npos) {
        node = new number_literal(toks[ptr].location, util::to_float(toks[ptr].content));
    } else {
        node = new number_literal(toks[ptr].location, util::to_int64(toks[ptr].content));
    }
    match(tok::tok_num);
    return node;
}

string_literal* parse::str() {
    string_literal* node = new string_literal(toks[ptr].location, toks[ptr].content);
    match(tok::tok_str);
    return node;
}

type_def* parse::type() {
    type_def* node = new type_def(toks[ptr].location);
    node->set_dataset_flag(lookahead(tok::tok_mult));

    // mark a set type
    if (lookahead(tok::tok_mult)) {
        match(tok::tok_mult); // *
    }

    node->add_path(toks[ptr].content);
    match(tok::tok_id, "variable type definition");

    // mark full path symbol
    while(lookahead(tok::tok_plink)) {
        match(tok::tok_plink);
        node->add_path(toks[ptr].content);
        match(tok::tok_id, "variable type definition");
    }
    update_location(node);
    return node;
}

annotation* parse::annot() {
    if (!lookahead(tok::tok_anno)) {
        return new annotation(toks[ptr].location, "");
    }
    annotation* node = new annotation(toks[ptr].location, toks[ptr].content);
    match(tok::tok_anno);
    if (!lookahead(tok::tok_lcurve)) {
        update_location(node);
        return node;
    }

    match(tok::tok_lcurve);

    if (lookahead(tok::tok_str)) {
        // property string set here must has length > 2
        // because string literal is quoted by ""
        node->set_property_string(toks[ptr].content);
        match(tok::tok_str, "annotation property string");
    } else {
        while (lookahead(tok::tok_id)) {
            const auto name = toks[ptr].content;
            match(tok::tok_id, "annotation properties");
            match(tok::tok_equal);
            const auto value = toks[ptr].content;
            match(tok::tok_str, "annotation properties");

            node->add_property(name, value);

            if (lookahead(tok::tok_comma)) {
                match(tok::tok_comma);
            } else if (lookahead(tok::tok_id)) {
                err.err(toks[ptr-1].location, "expected \",\" here.");
            }
        }
    }

    match(tok::tok_rcurve, "annotation properties");
    update_location(node);
    return node;
}

multi_use_stmt* parse::multi_use() {
    multi_use_stmt* node = new multi_use_stmt(toks[ptr].location);
    match(tok::tok_lbrace);
    while (lookahead(tok::tok_id)) {
        node->add_import_symbol(id());
        if (lookahead(tok::tok_comma)) {
            match(tok::tok_comma);
        } else if (lookahead(tok::tok_id)) {
            err.err(toks[ptr-1].location, "expected \",\" here.");
        }
    }
    match(tok::tok_rbrace, "multiple use statement", {
        tok::tok_use, tok::tok_schema,
        tok::tok_enum, tok::tok_fn,
        tok::tok_database, tok::tok_impl
    });
    update_location(node);
    return node;
}

void parse::gen_enum_members(enum_decl* node) {
    while (lookahead(tok::tok_id)) {
        node->add_member(id());
        if (lookahead(tok::tok_comma)) {
            match(tok::tok_comma);
        } else if (lookahead(tok::tok_id)) {
            err.err(toks[ptr-1].location, "expected \",\" here.");
        }
    }
    if (node->get_member().size()) {
        update_location(node);
    }
    return;
}

void parse::gen_schema_members(schema_decl* node) {
    while (lookahead(tok::tok_id) || lookahead(tok::tok_anno)) {
        node->add_field(gen_schema_field());
        if (lookahead(tok::tok_comma)) {
            match(tok::tok_comma);
        } else if (lookahead(tok::tok_id) || lookahead(tok::tok_anno)) {
            err.err(toks[ptr-1].location, "expected \",\" here.");
        }
    }
    if (node->get_fields().size()) {
        update_location(node);
    }
    return;
}

schema_field* parse::gen_schema_field() {
    schema_field* node= new schema_field(toks[ptr].location);
    node->set_annotation(annot());
    node->set_identifier(id());
    match(tok::tok_colon, "schema field");
    node->set_field_type(type());
    update_location(node);
    return node;
}

void parse::database_tables(database_decl* node) {
    while (lookahead(tok::tok_id)) {
        node->add_table(gen_database_table());
        if (lookahead(tok::tok_comma)) {
            match(tok::tok_comma);
        } else if (lookahead(tok::tok_id)) {
            err.err(toks[ptr-1].location, "expected \",\" here.");
        }
    }
    if (node->get_tables().size()) {
        update_location(node);
    }
    return;
}

database_table* parse::gen_database_table() {
    database_table* node = new database_table(toks[ptr].location);
    node->set_name(id());
    match(tok::tok_colon);
    node->set_type(type());
    if (lookahead(tok::tok_as)) {
        match(tok::tok_as);
        if (!lookahead(tok::tok_str)) {
            err.err(toks[ptr-1].location, "operator \"as\" needs string literal.");
            return node;
        }
        node->set_real_name(str());
    }
    update_location(node);
    return node;
}

std::vector<function_decl*> parse::func_list() {
    std::vector<function_decl*> res;
    while (lookahead(tok::tok_fn) ||
        lookahead(tok::tok_anno) ||
        lookahead(tok::tok_pub)) {
        res.push_back(function());
        if (lookahead(tok::tok_eof)) {
            break;
        }
    }
    return res;
}

std::vector<var_decl*> parse::parameter_list() {
    std::vector<var_decl*> res;
    while (lookahead(tok::tok_id)) {
        res.push_back(parameter());
        if (lookahead(tok::tok_comma)) {
            match(tok::tok_comma);
        } else if (lookahead(tok::tok_id)) {
            err.err(toks[ptr-1].location, "expected \",\" here.");
        }
    }
    return res;
}

var_decl* parse::parameter() {
    var_decl* node = new var_decl(toks[ptr].location);
    node->set_var_name(id());
    if (lookahead(tok::tok_colon)) {
        match(tok::tok_colon);
        node->set_type(type());
    }
    update_location(node);
    return node;
}

block_stmt* parse::block() {
    block_stmt* node = new block_stmt(toks[ptr].location);
    while(!lookahead(tok::tok_rbrace)) {
        node->add_statement(statement());
        if (lookahead(tok::tok_semi)) {
            next();
        }
        if (lookahead(tok::tok_eof)) {
            break;
        }
    }
    update_location(node);
    return node;
}

stmt* parse::statement() {
    switch (toks[ptr].type) {
        case tok::tok_let: return gen_let_stmt();
        case tok::tok_if: return gen_cond_stmt();
        case tok::tok_for: return gen_for_stmt();
        case tok::tok_match: return gen_match_stmt();
        case tok::tok_lbrkt: return gen_fact_stmt();
        case tok::tok_ret: return gen_ret_stmt();
        case tok::tok_yield: return gen_ret_stmt();
        default: {
            const auto& loc = toks[ptr].location;
            auto ex = or_expr();
            auto res = new in_block_expr(loc, ex);
            update_location(res);
            return res;
        }
    }
    // unreachable
    err.err(toks[ptr].location,
        "invalid token " + err_info.at(toks[ptr].type) + "."
    );
    panic_mode({
        tok::tok_let, tok::tok_if, tok::tok_match,
        tok::tok_ret, tok::tok_yield
    });
    return (stmt*)null();
}

let_stmt* parse::gen_let_stmt() {
    let_stmt* node = new let_stmt(toks[ptr].location);

    match(tok::tok_let);
    match(tok::tok_lcurve);
    node->add_symbol(let_def());
    while(lookahead(tok::tok_comma)) {
        match(tok::tok_comma);
        node->add_symbol(let_def());
    }
    match(tok::tok_rcurve);
    match(tok::tok_lbrace);
    if (!lookahead(tok::tok_rbrace)) {
        node->set_code_block(block());
    }
    match(tok::tok_rbrace);
    update_location(node);
    return node;
}

var_decl* parse::let_def() {
    var_decl* node = def();
    if (lookahead(tok::tok_in)) {
        err.err(toks[ptr].location,
            "in let definition: \"in\" is not allowed here.",
            "maybe use \"=\"?");
        match(tok::tok_in);
    } else if (lookahead(tok::tok_equal)) {
        match(tok::tok_equal);
    } else {
        err.err(toks[ptr].location,
            "in let definition: \"" + toks[ptr].content +
            "\" is not allowed here.",
            "maybe use \"=\"?"
        );
        match(toks[ptr].type);
    }
    node->set_init_value(or_expr());
    update_location(node);
    return node;
}

cond_stmt* parse::gen_cond_stmt() {
    cond_stmt* node = new cond_stmt(toks[ptr].location);

    node->set_if_stmt(gen_if_stmt());
    while (lookahead_elsif()) {
        node->add_elsif_stmt(gen_elsif_stmt());
        if (lookahead(tok::tok_eof)) {
            break;
        }
    }
    if (lookahead(tok::tok_else)) {
        node->set_else_stmt(gen_else_stmt());
    }
    update_location(node);
    return node;
}

for_stmt* parse::gen_for_stmt() {
    for_stmt* node = new for_stmt(toks[ptr].location);

    match(tok::tok_for);
    match(tok::tok_lcurve, "for statement");
    node->add_symbol(for_def());
    while(lookahead(tok::tok_comma)) {
        match(tok::tok_comma);
        node->add_symbol(for_def());
    }
    match(tok::tok_rcurve, "for statement");
    match(tok::tok_lbrace, "for statement");
    if (!lookahead(tok::tok_rbrace)) {
        node->set_code_block(block());
    }
    match(tok::tok_rbrace, "for statement");
    update_location(node);
    return node;
}

var_decl* parse::for_def() {
    var_decl* node = def();
    if (lookahead(tok::tok_equal)) {
        err.err(toks[ptr].location,
            "in for definition: \"=\" is not allowed here.",
            "maybe use \"in\"?"
        );
        match(tok::tok_equal);
    } else if (lookahead(tok::tok_in)) {
        match(tok::tok_in);
    } else {
        err.err(toks[ptr].location,
            "in for definition: \"" + toks[ptr].content +
            "\" is not allowed here.",
            "maybe use \"in\"?"
        );
        match(toks[ptr].type);
    }
    node->set_init_value(or_expr());
    update_location(node);
    return node;
}

match_stmt* parse::gen_match_stmt() {
    match_stmt* node = new match_stmt(toks[ptr].location);

    match(tok::tok_match, "match statement");
    match(tok::tok_lcurve, "match statement");
    node->set_match_condition(or_expr());
    match(tok::tok_rcurve, "match statement");
    match(tok::tok_lbrace, "match statement");
    match_pairs(node);
    match(tok::tok_rbrace, "match statement");
    update_location(node);
    return node;
}

fact_stmt* parse::gen_fact_stmt() {
    fact_stmt* node = new fact_stmt(toks[ptr].location);

    match(tok::tok_lbrkt, "fact statement");
    while(lookahead(tok::tok_lbrace)) {
        node->add_fact(gen_fact_data());
        if (lookahead(tok::tok_comma)) {
            match(tok::tok_comma);
        } else if (lookahead(tok::tok_lbrace)) {
            err.err(toks[ptr-1].location, "expected \",\" here.");
        }
    }
    match(tok::tok_rbrkt, "fact statement");
    update_location(node);
    return node;
}

ret_stmt* parse::gen_ret_stmt() {
    ret_stmt* node = new ret_stmt(toks[ptr].location);

    if (lookahead(tok::tok_ret)) {
        match(tok::tok_ret);
    } else {
        match(tok::tok_yield);
        node->set_is_yield();
    }
    node->set_return_value(or_expr());
    update_location(node);
    return node;
}

var_decl* parse::def() {
    var_decl* node = new var_decl(toks[ptr].location);

    node->set_var_name(id());
    if (lookahead(tok::tok_colon)) {
        match(tok::tok_colon);
        node->set_type(type());
    }
    update_location(node);
    return node;
}

if_stmt* parse::gen_if_stmt() {
    if_stmt* node = new if_stmt(toks[ptr].location, if_stmt::type::cond_if);

    match(tok::tok_if, "if statement");
    match(tok::tok_lcurve, "if statement");
    node->set_condition(or_expr());
    match(tok::tok_rcurve, "if statement");
    match(tok::tok_lbrace, "if statement");
    if (!lookahead(tok::tok_rbrace)) {
        node->set_code_block(block());
    }
    match(tok::tok_rbrace, "if statement");
    update_location(node);
    return node;
}

if_stmt* parse::gen_elsif_stmt() {
    if_stmt* node = new if_stmt(toks[ptr].location, if_stmt::type::cond_elsif);

    match(tok::tok_else, "else if statement");
    match(tok::tok_if, "else if statement");
    match(tok::tok_lcurve, "else if statement");
    node->set_condition(or_expr());
    match(tok::tok_rcurve, "else if statement");
    match(tok::tok_lbrace, "else if statement");
    if (!lookahead(tok::tok_rbrace)) {
        node->set_code_block(block());
    }
    match(tok::tok_rbrace, "else if statement");
    update_location(node);
    return node;
}

if_stmt* parse::gen_else_stmt() {
    if_stmt* node = new if_stmt(toks[ptr].location, if_stmt::type::cond_else);

    match(tok::tok_else, "else statement");
    match(tok::tok_lbrace, "else statement");
    if (!lookahead(tok::tok_rbrace)) {
        node->set_code_block(block());
    }
    match(tok::tok_rbrace, "else statement");
    update_location(node);
    return node;
}

void parse::match_pairs(match_stmt* node) {
    while (lookahead(tok::tok_num) || lookahead(tok::tok_str)) {
        node->add_match_pair(gen_match_pair());
        if (lookahead(tok::tok_comma)) {
            match(tok::tok_comma);
        } else if (lookahead(tok::tok_num) || lookahead(tok::tok_str)) {
            err.err(toks[ptr-1].location, "expected \",\" here.");
        }
    }
    if (node->get_match_pair_list().size()) {
        update_location(node);
    }
}

match_pair* parse::gen_match_pair() {
    match_pair* node = new match_pair(toks[ptr].location);

    node->set_literal(literal());
    match(tok::tok_marrow, "match pair", {
        tok::tok_id, tok::tok_num,
        tok::tok_str, tok::tok_sub,
        tok::tok_lcurve, tok::tok_not
    });
    node->set_statement(statement());
    update_location(node);
    return node;
}

fact_data* parse::gen_fact_data() {
    fact_data* node = new fact_data(toks[ptr].location);

    match(tok::tok_lbrace, "fact data");
    while(lookahead(tok::tok_num) || lookahead(tok::tok_str)) {
        node->add_literal(lookahead(tok::tok_num)? (expr*)num():(expr*)str());
        if (lookahead(tok::tok_comma)) {
            match(tok::tok_comma);
        } else if (lookahead(tok::tok_num) || lookahead(tok::tok_str)) {
            err.err(toks[ptr-1].location, "expected \",\" here.");
        }
    }
    match(tok::tok_rbrace, "fact data");
    update_location(node);
    return node;
}

binary_operator* parse::or_expr() {
    binary_operator* node = and_expr();
    if (!lookahead(tok::tok_or)) {
        return node;
    }
    while (lookahead(tok::tok_or)) {
        binary_operator* tmp = new binary_operator(toks[ptr].location);
        tmp->set_operator(binary_operator::type::logical_or);
        match(tok::tok_or);
        tmp->update_location(node->get_location());
        tmp->set_left(node);
        tmp->set_right(and_expr());
        node = tmp;
        if (lookahead(tok::tok_eof)) {
            break;
        }
    }
    update_location(node);
    return node;
}

binary_operator* parse::and_expr() {
    binary_operator* node = nullptr;

    if (lookahead(tok::tok_not)) {
        node = (binary_operator*)not_expr();
    } else {
        node = cmp_expr();
    }
    if (!lookahead(tok::tok_and)) {
        return node;
    }
    while (lookahead(tok::tok_and)) {
        binary_operator* tmp = new binary_operator(toks[ptr].location);
        tmp->set_operator(binary_operator::type::logical_and);
        tmp->update_location(node->get_location());
        tmp->set_left(node);
        match(tok::tok_and);
        if (lookahead(tok::tok_not)) {
            tmp->set_right(not_expr());
        } else {
            tmp->set_right(cmp_expr());
        }
        node = tmp;
        if (lookahead(tok::tok_eof)) {
            break;
        }
    }
    update_location(node);
    return node;
}

expr* parse::curved_expr() {
    match(tok::tok_lcurve, "curve quoted expression");
    expr* node = or_expr();
    match(tok::tok_rcurve, "curve quoted expression");
    update_location(node);
    return node;
}

unary_operator* parse::neg_expr() {
    unary_operator* node = new unary_operator(toks[ptr].location);
    node->set_operator(unary_operator::type::arithmetic_negation);

    match(tok::tok_sub);
    if (lookahead(tok::tok_id) || lookahead(tok::tok_num) ||
        lookahead(tok::tok_str) || lookahead(tok::tok_lcurve)) {
        node->set_child(symcall());
    } else if (lookahead(tok::tok_sub)) {
        node->set_child(neg_expr());
    } else {
        err.err(toks[ptr].location, "expected expressions here.");
        panic_mode({
            tok::tok_mult, tok::tok_div,
            tok::tok_add, tok::tok_sub,
            tok::tok_rcurve
        });
    }
    update_location(node);
    return node;
}

unary_operator* parse::not_expr() {
    unary_operator* node = new unary_operator(toks[ptr].location);
    node->set_operator(unary_operator::type::logical_negation);

    match(tok::tok_not);
    node->set_child(cmp_expr());
    update_location(node);
    return node;
}

binary_operator* parse::cmp_expr() {
    binary_operator* node = additive_expr();
    while (lookahead(tok::tok_equal) ||
        lookahead(tok::tok_neq)   ||
        lookahead(tok::tok_less)  ||
        lookahead(tok::tok_leq)   ||
        lookahead(tok::tok_grt)   ||
        lookahead(tok::tok_geq)   ||
        lookahead(tok::tok_in)
    ) {
        binary_operator* tmp = new binary_operator(toks[ptr].location);
        switch (toks[ptr].type) {
            case tok::tok_equal:
                tmp->set_operator(binary_operator::type::compare_equal);
                break;
            case tok::tok_neq:
                tmp->set_operator(binary_operator::type::compare_not_equal);
                break;
            case tok::tok_less:
                tmp->set_operator(binary_operator::type::compare_less);
                break;
            case tok::tok_leq:
                tmp->set_operator(binary_operator::type::compare_less_equal);
                break;
            case tok::tok_grt:
                tmp->set_operator(binary_operator::type::compare_great);
                break;
            case tok::tok_geq:
                tmp->set_operator(binary_operator::type::compare_great_equal);
                break;
            case tok::tok_in:
                tmp->set_operator(binary_operator::type::in);
                break;
            default: break;
        }
        tmp->update_location(node->get_location());
        tmp->set_left(node);
        match(toks[ptr].type);
        tmp->set_right(additive_expr());
        node = tmp;
    }
    update_location(node);
    return node;
}

binary_operator* parse::additive_expr() {
    binary_operator* node = multiple_expr();
    while (lookahead(tok::tok_add) || lookahead(tok::tok_sub)) {
        binary_operator* tmp = new binary_operator(toks[ptr].location);
        if (lookahead(tok::tok_add)) {
            tmp->set_operator(binary_operator::type::add);
        } else {
            tmp->set_operator(binary_operator::type::sub);
        }
        match(toks[ptr].type);
        tmp->update_location(node->get_location());
        tmp->set_left(node);
        tmp->set_right(multiple_expr());
        node = tmp;
        if (lookahead(tok::tok_eof)) {
            break;
        }
    }
    update_location(node);
    return node;
}

binary_operator* parse::multiple_expr() {
    binary_operator* node = new binary_operator(toks[ptr].location);

    if (lookahead(tok::tok_id) || lookahead(tok::tok_num) ||
        lookahead(tok::tok_true) || lookahead(tok::tok_false) ||
        lookahead(tok::tok_str) || lookahead(tok::tok_lcurve)) {
        node = (binary_operator*)symcall();
    } else if (lookahead(tok::tok_sub)) {
        node = (binary_operator*)neg_expr();
    } else {
        err.err(toks[ptr].location, "expected expression here.");
        panic_mode({tok::tok_id, tok::tok_num, tok::tok_str, tok::tok_sub});
        return node;
    }
    while (lookahead(tok::tok_mult) || lookahead(tok::tok_div)) {
        binary_operator* tmp = new binary_operator(toks[ptr].location);
        if (lookahead(tok::tok_mult)) {
            tmp->set_operator(binary_operator::type::mult);
        } else {
            tmp->set_operator(binary_operator::type::div);
        }
        match(toks[ptr].type);
        tmp->update_location(node->get_location());
        tmp->set_left(node);
        if (lookahead(tok::tok_id) || lookahead(tok::tok_num) ||
            lookahead(tok::tok_str) || lookahead(tok::tok_lcurve)) {
            tmp->set_right(symcall());
        } else if (lookahead(tok::tok_sub)) {
            tmp->set_right(neg_expr());
        }
        node = tmp;
        if (lookahead(tok::tok_eof)) {
            break;
        }
    }
    update_location(node);
    return node;
}

call_root* parse::symcall() {
    call_root* node = new call_root(toks[ptr].location);

    node->set_call_head(symhead());
    while (lookahead(tok::tok_dot) || lookahead(tok::tok_plink)) {
        if (lookahead(tok::tok_dot)) {
            node->add_call_chain(symfield());
        } else if (lookahead(tok::tok_plink)) {
            node->add_call_chain(sympath());
        }

        if (lookahead(tok::tok_eof)) {
            break;
        }
    }
    update_location(node);
    return node;
}

call_head* parse::symhead() {
    call_head* node = new call_head(toks[ptr].location);

    if (lookahead(tok::tok_num) || lookahead(tok::tok_str) ||
        lookahead(tok::tok_true) || lookahead(tok::tok_false)) {
        node->set_first_expression(literal());
        return node;
    } else if (lookahead(tok::tok_lcurve)) {
        node->set_first_expression(curved_expr());
        return node;
    } else {
        node->set_first_expression(id());
    }

    if (lookahead(tok::tok_lcurve)) {
        node->set_func_call(funcall());
    } else if (lookahead(tok::tok_lbrace)) {
        // initializer must have this format:
        // schema_name {identifier : value}
        node->set_initializer(gen_initializer());
    }
    update_location(node);
    return node;
}

call_expr* parse::symfield() {
    call_expr* node = new call_expr(toks[ptr].location);
    node->set_call_type(call_expr::type::get_field);

    match(tok::tok_dot);
    node->set_field_name(id());
    if (lookahead_generic()) {
        match(tok::tok_less);
        node->set_generic_type(type());
        match(tok::tok_grt, "get field");
    }
    if (lookahead(tok::tok_lcurve)) {
        node->set_func_call(funcall());
    }
    update_location(node);
    return node;
}

call_expr* parse::sympath() {
    call_expr* node = new call_expr(toks[ptr].location);
    node->set_call_type(call_expr::type::get_path);

    match(tok::tok_plink);
    node->set_field_name(id());
    if (lookahead_generic()) {
        match(tok::tok_less);
        node->set_generic_type(type());
        match(tok::tok_grt, "get path");
    }
    if (lookahead(tok::tok_lcurve)) {
        node->set_func_call(funcall());
    } else if (lookahead(tok::tok_lbrace)) {
        node->set_initializer(gen_initializer());
    }
    update_location(node);
    return node;
}

initializer* parse::gen_initializer() {
    initializer* node = new initializer(toks[ptr].location);

    match(tok::tok_lbrace, "initializer");
    while (lookahead(tok::tok_id) || lookahead(tok::tok_ellipsis)) {
        if (lookahead(tok::tok_id)) {
            node->add_field_pair(gen_initializer_pair());
        } else {
            node->add_spread_expr(gen_spread_expr());
        }
        if (lookahead(tok::tok_comma)) {
            match(tok::tok_comma);
        } else if (lookahead(tok::tok_id) || lookahead(tok::tok_ellipsis)) {
            err.err(toks[ptr-1].location, "expected \",\" here.");
        }
    }
    match(tok::tok_rbrace, "initializer");
    update_location(node);
    return node;
}

initializer_pair* parse::gen_initializer_pair() {
    initializer_pair* node = new initializer_pair(toks[ptr].location);

    node->set_field_name(id());
    match(tok::tok_colon, "initializer pair");
    node->set_field_value(or_expr());
    update_location(node);
    return node;
}

spread_expr* parse::gen_spread_expr() {
    const auto& ellipsis_location = toks[ptr].location;
    match(tok::tok_ellipsis);
    auto node = new spread_expr(ellipsis_location, or_expr());
    update_location(node);
    return node;
}

func_call* parse::funcall() {
    func_call* node = new func_call(toks[ptr].location);
    match(tok::tok_lcurve, "function call");
    gen_arglist(node);
    match(tok::tok_rcurve, "function call", {tok::tok_rcurve});
    update_location(node);
    return node;
}

void parse::gen_arglist(func_call* node) {
    if (lookahead(tok::tok_rcurve)) {
        return;
    }
    node->add_argument(or_expr());
    // follow set of '('
    std::unordered_set<tok> panics = {
        tok::tok_id, tok::tok_num, tok::tok_str,
        tok::tok_lcurve, tok::tok_sub
    };
    // check if lack comma between arguments
    bool skip_comma = (!lookahead(tok::tok_comma) && panics.count(toks[ptr].type));
    while (lookahead(tok::tok_comma) || skip_comma) {
        if (lookahead(tok::tok_eof)) {
            break;
        }
        if (skip_comma) {
            err.err(toks[ptr-1].location, "expected \",\" here.");
            panic_mode(panics);
        } else {
            match(tok::tok_comma, "argument list", panics);
        }
        node->add_argument(or_expr());
        skip_comma = (!lookahead(tok::tok_comma) && panics.count(toks[ptr].type));
    }
    update_location(node);
}

expr* parse::literal() {
    ast_null* node = null();
    if (lookahead(tok::tok_num)) {
        return num();
    } else if (lookahead(tok::tok_str)) {
        return str();
    } else if (lookahead(tok::tok_true) || lookahead(tok::tok_false)) {
        auto res = new boolean_literal(toks[ptr].location, toks[ptr].content=="true");
        match(toks[ptr].type);
        return res;
    } else if (lookahead(tok::tok_eof)) {
        return node;
    }
    err.err(toks[ptr].location, "expected literals or calculations here.");
    panic_mode({tok::tok_marrow, tok::tok_mult, tok::tok_div});
    return node;
}

var_decl* parse::query_from_list() {
    var_decl* node = new var_decl(toks[ptr].location);
    node->set_var_name(id());
    if (lookahead(tok::tok_in)) {
        match(tok::tok_in);
        node->set_init_value(or_expr());
    }
    update_location(node);
    return node;
}

query_column* parse::query_single_column() {
    query_column* node = new query_column(toks[ptr].location);
    node->set_column_value(or_expr());
    if (lookahead(tok::tok_as)) {
        match(tok::tok_as);
        node->set_column_name(id());
    }
    return node;
}

function_decl* parse::function() {
    function_decl* node = new function_decl(toks[ptr].location);

    // get annotations
    while(lookahead(tok::tok_anno)) {
        node->add_annotation(annot());
    }

    if (lookahead(tok::tok_pub)) {
        node->set_public();
        match(tok::tok_pub);
    }

    match(tok::tok_fn, "function declaration");
    node->set_name(id());
    match(tok::tok_lcurve, "function declaration");
    for(auto i : parameter_list()) {
        node->add_parameter(i);
    }
    match(tok::tok_rcurve, "function declaration");
    if (lookahead(tok::tok_arrow)) {
        match(tok::tok_arrow);
        node->set_return_type(type());
    }
    if (lookahead(tok::tok_semi)) {
        match(tok::tok_semi);
        update_location(node);
        return node;
    }
    if (!lookahead(tok::tok_lbrace)) {
        update_location(node);
        return node;
    }
    match(tok::tok_lbrace, "function declaration");
    node->set_code_block(block());
    match(tok::tok_rbrace, "function declaration");
    update_location(node);
    return node;
}

enum_decl* parse::enums() {
    enum_decl* node = new enum_decl(toks[ptr].location);

    match(tok::tok_enum, "enum declaration");
    node->set_name(id());
    match(tok::tok_lbrace, "enum declaration");
    gen_enum_members(node);
    match(tok::tok_rbrace, "enum declaration");
    update_location(node);
    return node;
}

schema_decl* parse::schema() {
    schema_decl* node = new schema_decl(toks[ptr].location);

    match(tok::tok_schema, "schema declaration");
    node->set_name(id());
    if (lookahead(tok::tok_extends)) {
        match(tok::tok_extends);
        node->set_parent_name(type());
    }
    match(tok::tok_lbrace, "schema declaration");
    gen_schema_members(node);
    match(tok::tok_rbrace, "schema declaration");
    update_location(node);
    return node;
}

use_stmt* parse::use() {
    use_stmt* node = new use_stmt(toks[ptr].location);

    match(tok::tok_use);
    node->add_path(id());
    while (lookahead(tok::tok_plink)) {
        match(tok::tok_plink);
        if (lookahead(tok::tok_id)) {
            node->add_path(id());
        } else if (lookahead(tok::tok_mult)) {
            match(tok::tok_mult);
            node->set_use_all();
            break;
        } else if (lookahead(tok::tok_lbrace)) {
            node->set_multi_use(multi_use());
            break;
        } else {
            err.err(toks[ptr].location, "expected identifier or \"*\" here");
            break;
        }
    }

    // if the last one is single identifier, merge it to a multi_use_stmt
    if (!node->is_use_all() && !node->get_multi_use()) {
        identifier* back = node->get_path().back();
        node->get_path().pop_back();
        multi_use_stmt* tmp = new multi_use_stmt(toks[ptr].location);
        tmp->add_import_symbol(back);
        node->set_multi_use(tmp);
    }

    update_location(node);
    return node;
}

impl_block* parse::implement() {
    impl_block* node = new impl_block(toks[ptr].location);

    match(tok::tok_impl, "impl block");
    node->set_impl_schema_name(id());
    match(tok::tok_lbrace, "impl block");
    for(auto i : func_list()) {
        node->add_function(i);
    }
    match(tok::tok_rbrace, "impl block");
    update_location(node);
    return node;
}

database_decl* parse::database() {
    database_decl* node = new database_decl(toks[ptr].location);
    match(tok::tok_database, "database declaration");
    node->set_name(id());
    match(tok::tok_lbrace, "database declaration");
    database_tables(node);
    match(tok::tok_rbrace, "database declaration");
    update_location(node);
    return node;
}

query_decl* parse::query() {
    query_decl* node = new query_decl(toks[ptr].location);
    match(tok::tok_query, "query declaration");
    node->set_name(id());
    match(tok::tok_from, "query declaration");
    node->add_var_decl(query_from_list());
    while(lookahead(tok::tok_comma)) {
        match(tok::tok_comma);
        node->add_var_decl(query_from_list());
    }
    if (lookahead(tok::tok_where)) {
        match(tok::tok_where);
        node->set_condition(or_expr());
    }
    match(tok::tok_select, "query declaration");
    node->add_output_column(query_single_column());
    while (lookahead(tok::tok_comma)) {
        match(tok::tok_comma);
        node->add_output_column(query_single_column());
    }
    update_location(node);
    return node;
}

[[nodiscard]]
const error& parse::analyse(const std::vector<token>& tokens) {
    ptr = 0;
    toks = tokens.data();
    root->set_start_line(toks[ptr].location.start_line);
    root->set_start_column(toks[ptr].location.start_column);
    root->set_end_line(toks[ptr].location.end_line);
    root->set_end_column(toks[ptr].location.end_column);
    root->set_file(toks[ptr].location.file);

    while(lookahead(tok::tok_use)) {
        root->add_use_statement(use());
    }

    while(!lookahead(tok::tok_eof)) {
        switch (toks[ptr].type) {
            case tok::tok_anno:
            case tok::tok_pub:
            case tok::tok_fn: root->add_declaration(function()); break;
            case tok::tok_enum: root->add_declaration(enums()); break;
            case tok::tok_schema: root->add_declaration(schema()); break;
            case tok::tok_impl: root->add_declaration(implement()); break;
            case tok::tok_database: root->add_declaration(database()); break;
            case tok::tok_query: root->add_declaration(query()); break;
            case tok::tok_use:
                err.err(toks[ptr].location, "cannot import module here.");
                panic_mode({
                    tok::tok_fn, tok::tok_enum, tok::tok_schema,
                    tok::tok_use, tok::tok_impl, tok::tok_database,
                    tok::tok_query
                });
                break;
            default:
                err.err(toks[ptr].location,
                    "invalid token " + err_info.at(toks[ptr].type) + "."
                );
                panic_mode({
                    tok::tok_fn, tok::tok_enum, tok::tok_schema,
                    tok::tok_use, tok::tok_impl,
                    tok::tok_database, tok::tok_query
                });
                break;
        }
    }
    return err;
}

}