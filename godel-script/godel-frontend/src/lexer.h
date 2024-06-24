#pragma once

#include "godel-frontend/src/error/error.h"

#include <cstdint>
#include <vector>
#include <cstring>
#include <sstream>
#include <unordered_map>

namespace godel {

using report::error;
using report::span;

enum class tok {
    tok_err = 0,  // empty token
    tok_comment,  // comment token
    tok_use,      // keyword use
    tok_pub,      // keyword pub
    tok_schema,   // keyword schema
    tok_extends,  // keyword extends
    tok_database, // keyword database
    tok_fn,       // keyword fn
    tok_enum,     // keyword enum
    tok_impl,     // keyword impl
    tok_for,      // keyword for
    tok_let,      // keyword let
    tok_if,       // keyword if
    tok_else,     // keyword else
    tok_true,     // keyword true
    tok_false,    // keyword false
    tok_match,    // keyword match
    tok_yield,    // keyword yield
    tok_ret,      // keyword return
    tok_query,    // keyword query
    tok_from,     // keyword from
    tok_where,    // keyword where
    tok_select,   // keyword select
    tok_id,       // identifier
    tok_num,      // number literal
    tok_str,      // string literal
    tok_anno,     // annotation like @annotation_example
    tok_in,       // operator in
    tok_as,       // operator as
    tok_lcurve,   // (
    tok_rcurve,   // )
    tok_lbrkt,    // [
    tok_rbrkt,    // ]
    tok_lbrace,   // {
    tok_rbrace,   // }
    tok_semi,     // ;
    tok_comma,    // ,
    tok_colon,    // :
    tok_plink,    // :: path link
    tok_and,      // &&
    tok_or,       // ||
    tok_not,      // !
    tok_equal,    // =
    tok_add,      // +
    tok_sub,      // -
    tok_mult,     // *
    tok_div,      // /
    tok_grt,      // >
    tok_geq,      // >=
    tok_less,     // <
    tok_leq,      // <=
    tok_neq,      // !=
    tok_dot,      // .
    tok_ellipsis, // .. ellipsis
    tok_arrow,    // -> used to declare return value type
    tok_marrow,   // => used in match statement
    tok_eof       // end of file token
};

struct token {
    span location;
    tok type;
    std::string content;

    token(uint32_t sline, uint32_t scol, uint32_t eline, uint32_t ecol,
          tok ttype, const std::string& str, const std::string& file):
          location(sline, scol, eline, ecol, file),
          type(ttype), content(str) {}
    std::string to_json() const {
        if (type==tok::tok_comment) {
            std::string raw = "";
            for(const char c: content) {
                if (c=='\\') {
                    raw += "\\\\";
                } else if (c=='\"') {
                    raw += "\\\"";
                } else if (c=='\n') {
                    raw += "\\n";
                } else if (c=='\r') {
                    raw += "\\r";
                } else if (c=='\t') {
                    raw += "\\t";
                } else {
                    raw += c;
                }
            }
            return "{\"content\":\"" + raw + "\"," +
                   "\"location\":" + location.to_json() + "}";
        }
        return "{\"content\":\"" + content + "\"," +
               "\"location\":" + location.to_json() + "}";
    }
};

class lexer {
private:
    error& err;
    uint32_t ptr;
    uint32_t line;
    uint32_t column;
    std::string source;
    std::string filename;
    std::vector<token> toks;
    std::vector<token> comments;
    // mapper for string -> tok kind
    const std::unordered_map<std::string, tok> type_mapper = {
        {"use",      tok::tok_use      },
        {"pub",      tok::tok_pub      },
        {"schema",   tok::tok_schema   },
        {"extends",  tok::tok_extends  },
        {"database", tok::tok_database },
        {"fn",       tok::tok_fn       },
        {"enum",     tok::tok_enum     },
        {"impl",     tok::tok_impl     },
        {"for",      tok::tok_for      },
        {"let",      tok::tok_let      },
        {"if",       tok::tok_if       },
        {"else",     tok::tok_else     },
        {"true",     tok::tok_true     },
        {"false",    tok::tok_false    },
        {"match",    tok::tok_match    },
        {"yield",    tok::tok_yield    },
        {"return",   tok::tok_ret      },
        {"query",    tok::tok_query    },
        {"from",     tok::tok_from     },
        {"where",    tok::tok_where    },
        {"select",   tok::tok_select   },
        {"in",       tok::tok_in       },
        {"as",       tok::tok_as       },
        {"(",        tok::tok_lcurve   },
        {")",        tok::tok_rcurve   },
        {"[",        tok::tok_lbrkt    },
        {"]",        tok::tok_rbrkt    },
        {"{",        tok::tok_lbrace   },
        {"}",        tok::tok_rbrace   },
        {",",        tok::tok_comma    },
        {";",        tok::tok_semi     },
        {":",        tok::tok_colon    },
        {"::",       tok::tok_plink    },
        {"&&",       tok::tok_and      },
        {"||",       tok::tok_or       },
        {"!",        tok::tok_not      },
        {"=",        tok::tok_equal    },
        {"+",        tok::tok_add      },
        {"-",        tok::tok_sub      },
        {"*",        tok::tok_mult     },
        {"/",        tok::tok_div      },
        {">",        tok::tok_grt      },
        {">=",       tok::tok_geq      },
        {"<",        tok::tok_less     },
        {"<=",       tok::tok_leq      },
        {"!=",       tok::tok_neq      },
        {".",        tok::tok_dot      },
        {"..",       tok::tok_ellipsis },
        {"->",       tok::tok_arrow    },
        {"=>",       tok::tok_marrow   }
    };

    void open(const std::string&);

    bool should_skip(char)const;
    bool is_identifier_head(char) const;
    bool is_identifier(char) const;
    bool is_number_head(char) const;
    bool is_dec_number(char) const;
    bool is_oct_number(char) const;
    bool is_hex_number(char) const;
    bool is_string_head(char) const;
    bool is_single_opr(char) const;
    bool is_dot(char) const;
    bool is_cmp_opr_head(char) const;
    bool is_logic_opr(char) const; // && ||
    bool is_annotation(char) const; // @identifier
    bool is_colon(char) const; // : ::
    bool is_note() const; // //note 
    bool is_multi_line_note() const; // /*note*/
    bool is_opr_or_arrow(char) const; // - -> = =>

    void skip();
    token identifier();
    token annotation();
    token num_gen();
    token str_gen();
    token single_operator();
    token dot_operator();
    token logic_operator();
    token multi_char_operator();
    token colons();
    token opr_or_arrow();
    void notes();
    void multi_line_notes();
    void invalid_character();

public:
    lexer(error& err_module): err(err_module), ptr(0), line(0), column(0) {}
    [[nodiscard]] const error& scan(const std::string&);
    const auto& result() const { return toks; }
    const auto& extract_comments() const { return comments; }
    void dump() const;
    void dump_comments() const;
};

}