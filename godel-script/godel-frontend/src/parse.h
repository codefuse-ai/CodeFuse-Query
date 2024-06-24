#pragma once

#include "lexer.h"
#include "godel-frontend/src/error/error.h"
#include "ast/ast_node.h"
#include "ast/ast_root.h"
#include "ast/decl.h"
#include "ast/stmt.h"
#include "ast/expr.h"

#include <sstream>
#include <cstring>
#include <unordered_map>
#include <unordered_set>

namespace godel {

using report::error;

class parse {
private:
    uint32_t ptr;
    error& err;
    const token* toks;
    ast_root* root;

    const std::unordered_map<tok, std::string> err_info = {
        {tok::tok_err,      "<error>"       },
        {tok::tok_use,      "\"use\""       },
        {tok::tok_pub,      "\"pub\""       },
        {tok::tok_schema,   "\"schema\""    },
        {tok::tok_extends,  "\"extends\""   },
        {tok::tok_database, "\"database\""  },
        {tok::tok_fn,       "\"fn\""        },
        {tok::tok_enum,     "\"enum\""      },
        {tok::tok_impl,     "\"impl\""      },
        {tok::tok_for,      "\"for\""       },
        {tok::tok_let,      "\"let\""       },
        {tok::tok_if,       "\"if\""        },
        {tok::tok_else,     "\"else\""      },
        {tok::tok_true,     "\"true\""      },
        {tok::tok_false,    "\"false\""     },
        {tok::tok_match,    "\"match\""     },
        {tok::tok_yield,    "\"yield\""     },
        {tok::tok_ret,      "\"return\""    },
        {tok::tok_query,    "\"query\""     },
        {tok::tok_from,     "\"from\""      },
        {tok::tok_where,    "\"where\""     },
        {tok::tok_select,   "\"select\""    },
        {tok::tok_id,       "identifier"    },
        {tok::tok_num,      "\"number\""    },
        {tok::tok_str,      "\"string\""    },
        {tok::tok_anno,     "\"annotation\""},
        {tok::tok_in,       "\"in\""        },
        {tok::tok_as,       "\"as\""        },
        {tok::tok_lcurve,   "\"(\""         },
        {tok::tok_rcurve,   "\")\""         },
        {tok::tok_lbrkt,    "\"[\""         },
        {tok::tok_rbrkt,    "\"]\""         },
        {tok::tok_lbrace,   "\"{\""         },
        {tok::tok_rbrace,   "\"}\""         },
        {tok::tok_semi,     "\";\""         },
        {tok::tok_comma,    "\",\""         },
        {tok::tok_colon,    "\":\""         },
        {tok::tok_plink,    "\"::\""        },
        {tok::tok_and,      "\"&&\""        },
        {tok::tok_or,       "\"||\""        },
        {tok::tok_not,      "\"!\""         },
        {tok::tok_equal,    "\"=\""         },
        {tok::tok_add,      "\"+\""         },
        {tok::tok_sub,      "\"-\""         },
        {tok::tok_mult,     "\"*\""         },
        {tok::tok_div,      "\"/\""         },
        {tok::tok_grt,      "\">\""         },
        {tok::tok_geq,      "\">=\""        },
        {tok::tok_less,     "\"<\""         },
        {tok::tok_leq,      "\"<=\""        },
        {tok::tok_neq,      "\"!=\""        },
        {tok::tok_dot,      "\".\""         },
        {tok::tok_ellipsis, "\"..\""        },
        {tok::tok_arrow,    "\"->\""        },
        {tok::tok_marrow,   "\"=>\""        },
        {tok::tok_eof,      "<eof>"         }
    };

private:
    void next();
    void match(tok, const std::string&, std::unordered_set<tok>);
    void panic_mode(std::unordered_set<tok>);
    void update_location(ast_node*);

    bool lookahead(tok) const;
    bool lookahead_elsif() const;
    bool lookahead_generic() const;

    ast_null* null();
    identifier* id();
    number_literal* num();
    string_literal* str();
    type_def* type();
    annotation* annot();

    multi_use_stmt* multi_use();
    void gen_enum_members(enum_decl*);
    void gen_schema_members(schema_decl*);
    schema_field* gen_schema_field();
    void database_tables(database_decl*);
    database_table* gen_database_table();
    std::vector<function_decl*> func_list();
    std::vector<var_decl*> parameter_list();
    var_decl* parameter();
    block_stmt* block();

    stmt* statement();
    let_stmt* gen_let_stmt();
    var_decl* let_def();
    cond_stmt* gen_cond_stmt();
    for_stmt* gen_for_stmt();
    var_decl* for_def();
    match_stmt* gen_match_stmt();
    fact_stmt* gen_fact_stmt();
    ret_stmt* gen_ret_stmt();
    var_decl* def();

    if_stmt* gen_if_stmt();
    if_stmt* gen_elsif_stmt();
    if_stmt* gen_else_stmt();
    void match_pairs(match_stmt*);
    match_pair* gen_match_pair();
    fact_data* gen_fact_data();

    binary_operator* or_expr();
    binary_operator* and_expr();
    expr* curved_expr();
    unary_operator* neg_expr();
    unary_operator* not_expr();
    binary_operator* cmp_expr();
    binary_operator* additive_expr();
    binary_operator* multiple_expr();

    call_root* symcall();
    call_head* symhead();
    call_expr* symfield();
    call_expr* sympath();
    initializer* gen_initializer();
    initializer_pair* gen_initializer_pair();
    spread_expr* gen_spread_expr();
    func_call* funcall();
    void gen_arglist(func_call*);
    expr* literal();
    var_decl* query_from_list();
    query_column* query_single_column();

    function_decl* function();
    enum_decl* enums();
    schema_decl* schema();
    use_stmt* use();
    impl_block* implement();
    database_decl* database();
    query_decl* query();

public:
    parse(error& err_module):
        ptr(0), err(err_module), toks(nullptr),
        root(new ast_root({0, 0, 0, 0, ""})) {}
    ~parse() { delete root; }
    auto result() { return root; }

public:
    [[nodiscard]] const error& analyse(const std::vector<token>&);
};

}