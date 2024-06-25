#include "godel-frontend/src/util/util.h"
#include "godel-frontend/src/error/error.h"
#include "lexer.h"

#include <fstream>
#include <vector>
#include <filesystem>
#include <unordered_map>

namespace godel {

using report::span;
using report::error;
namespace fs = std::filesystem;

void lexer::open(const std::string& path) {
    if (!fs::exists(path)) {
        err.fatal("file <" + path + "> does not exist.");
    } else if (!fs::is_regular_file(path)) {
        err.fatal("file <" + path + "> is not regular file.");
    }
    filename = path;
    std::ifstream in(path, std::ios::binary);
    std::stringstream ss;
    ss << in.rdbuf();
    source = ss.str();
}

bool lexer::should_skip(char c) const {
    return (c==' ') || (c=='\t') || (c=='\n') || (c=='\r') || (c<=0);
}

bool lexer::is_identifier_head(char c) const {
    return (c=='_') || std::isalpha(c);
}

bool lexer::is_identifier(char c) const {
    return is_identifier_head(c) || std::isdigit(c);
}

bool lexer::is_number_head(char c) const {
    return std::isdigit(c);
}

bool lexer::is_dec_number(char c) const {
    return std::isdigit(c);
}

bool lexer::is_oct_number(char c) const {
    return ('0'<=c && c<='7');
}

bool lexer::is_hex_number(char c) const {
    return std::isxdigit(c);
}

bool lexer::is_string_head(char c) const {
    return c=='\"';
}

bool lexer::is_single_opr(char c) const {
    return c=='(' || c==')' || c=='[' || c==']' || c=='{' || c=='}' ||
           c==',' || c=='+' || c=='*' || c=='/' || c==';';
}

bool lexer::is_dot(char c) const {
    return c=='.';
}

bool lexer::is_cmp_opr_head(char c) const {
    return c=='<' || c=='>' || c=='!';
}

bool lexer::is_logic_opr(char c) const {
    return c=='&' || c=='|';
}

bool lexer::is_annotation(char c) const {
    return c=='@';
}

bool lexer::is_colon(char c) const {
    return c==':';
}

bool lexer::is_note() const {
    return source[ptr]=='/' && ptr+1<source.size() && source[ptr+1]=='/';
}

bool lexer::is_multi_line_note() const {
    return source[ptr]=='/' && ptr+1<source.size() && source[ptr+1]=='*';
}

bool lexer::is_opr_or_arrow(char c) const {
    return c=='-' || c=='=';
}

void lexer::skip() {
    while (ptr<source.size() && should_skip(source[ptr])) {
        ++column;
        if (source[ptr]=='\n') {
            ++line;
            column = 0;
        }
        ++ptr;
    }
}

token lexer::identifier() {
    auto sym = std::string(1, source[ptr]);
    const auto start_line = line;
    const auto start_column = column;
    ++ptr;
    while (ptr<source.size() && is_identifier(source[ptr])) {
        sym += source[ptr];
        ++ptr;
    }
    column += sym.length();
    if (type_mapper.count(sym)) {
        return {start_line, start_column, line, column, type_mapper.at(sym), sym, filename};
    }
    return {start_line, start_column, line, column, tok::tok_id, sym, filename};
}

token lexer::annotation() {
    auto anno = std::string(1, source[ptr]);
    const auto start_line = line;
    const auto start_column = column;
    ++ptr;
    while (ptr<source.size() && is_identifier(source[ptr])) {
        anno += source[ptr];
        ++ptr;
    }
    column += anno.length();
    return {start_line, start_column, line, column, tok::tok_anno, anno, filename};
}

token lexer::num_gen() {
    auto res = std::string(1, source[ptr]);
    const auto start_line = line;
    const auto start_column = column;
    ++column;
    ++ptr;
    if (ptr>=source.size()) {
        return {start_line, start_column, line, column, tok::tok_num, res, filename};
    }

    if (source[ptr]=='x' || source[ptr]=='X') {
        res += source[ptr];
        ++column;
        ++ptr;
        while (ptr<source.size() && is_hex_number(source[ptr])) {
            res += source[ptr];
            ++column;
            ++ptr;
        }
    } else if (res=="0" && is_dec_number(source[ptr])) {
        while (ptr<source.size() && is_dec_number(source[ptr])) {
            res += source[ptr];
            ++column;
            ++ptr;
        }
        if (res[0]=='0' && res.length()>1) {
            err.warn({start_line, start_column, line, column, filename},
                "decimal literal should not begin with `0`."
            );
        }
    }
    // float number beginning with "0"
    else if (res=="0" && source[ptr]=='.') {
        res += source[ptr];
        ++column;
        ++ptr;
        while (ptr<source.size() && is_dec_number(source[ptr])) {
            res += source[ptr];
            ++column;
            ++ptr;
        }
        // not float number
        if (res.back()=='.') {
            --column;
            --ptr;
            res.pop_back();
        }
    }
    // normal decimal, maybe float but does not begin with "0"
    else {
        while (ptr<source.size() && is_dec_number(source[ptr])) {
            res += source[ptr];
            ++column;
            ++ptr;
        }
        if (source[ptr]=='.') {
            res += source[ptr];
            ++column;
            ++ptr;
            while (ptr<source.size() && is_dec_number(source[ptr])) {
                res += source[ptr];
                ++column;
                ++ptr;
            }
        }
        // not float number
        if (res.back()=='.') {
            --column;
            --ptr;
            res.pop_back();
        }
    }
    return {start_line, start_column, line, column, tok::tok_num, res, filename};
}

token lexer::str_gen() {
    auto str = std::string(1, source[ptr]);
    const auto start_line = line;
    const auto start_column = column;
    ++column;
    ++ptr;
    while (ptr<source.size() && source[ptr]!='\"') {
        ++column;
        if (source[ptr]=='\n') {
            ++line;
            column = 0;
        }
        if (source[ptr]=='\\' && ptr+1<source.size()) {
            str += "\\";
            ++column;
            ++ptr;
            if (source[ptr]=='\n') {
                ++line;
                column = 0;
            }
            switch (source[ptr]) {
                case '\\':
                case '\'':
                case '\"':
                case 'n':
                case 't':
                case 'r': str += source[ptr]; break;
                default:
                    err.err({start_line, start_column, line, column, filename},
                        "invalid escape character.",
                        "do you mean \"\\\\\", \"\\\'\", \"\\\"\", \"\\n\", \"\\t\" or \"\\r\" ?"
                    );
                    str += source[ptr];break;
            }
            ++ptr;
            continue;
        }
        str += source[ptr];
        ++ptr;
    }
    str += source[ptr];
    if (ptr+1>=source.size() && str.back()!='\"') {
        err.err({start_line, start_column, line, column, filename},
            "get <eof> when generating strings.", "check if `\"` is in pair."
        );
    }
    ++column;
    ++ptr;
    return {start_line, start_column, line, column, tok::tok_str, str, filename};
}

token lexer::single_operator() {
    auto tmp = std::string(1, source[ptr]);
    const auto start_line = line;
    const auto start_column = column;
    ++column;
    ++ptr;
    return {start_line, start_column, line, column, type_mapper.at(tmp), tmp, filename};
}

token lexer::dot_operator() {
    auto tmp = std::string(1, source[ptr]);
    const auto start_line = line;
    const auto start_column = column;
    if (ptr+1<source.size() && source[ptr+1]=='.') {
        tmp += ".";
    }
    column += tmp.length();
    ptr += tmp.length();
    return {start_line, start_column, line, column, type_mapper.at(tmp), tmp, filename};
}

token lexer::logic_operator() {
    auto tmp = std::string(1, source[ptr]);
    const auto start_line = line;
    const auto start_column = column;
    ++column;
    ++ptr;
    if (ptr<source.size() && source[ptr]==source[ptr-1]) {
        tmp += source[ptr];
        ++column;
        ++ptr;
        return {start_line, start_column, line, column, type_mapper.at(tmp), tmp, filename};
    }
    err.err({start_line, start_column, line, column, filename},
        "invalid operator `" + tmp + "`."
    );
    return {start_line, start_column, line, column, tok::tok_err, tmp, filename};
}

token lexer::multi_char_operator() {
    auto tmp = std::string(1, source[ptr]);
    const auto start_line = line;
    const auto start_column = column;
    ++column;
    if (ptr+1<source.size() && source[ptr+1]=='=') {
        ++ptr;
        tmp += source[ptr];
        ++column;
    }
    ++ptr;
    // need this check because operator "!" is not valid
    if (!type_mapper.count(tmp)) {
        err.err({start_line, start_column, line, column, filename},
            "invalid operator `" + tmp + "`."
        );
    } else {
        return {start_line, start_column, line, column, type_mapper.at(tmp), tmp, filename};
    }
    return {start_line, start_column, line, column, tok::tok_err, tmp, filename};
}

token lexer::colons() {
    auto tmp = std::string(1, source[ptr]);
    const auto start_line = line;
    const auto start_column = column;
    ++column;
    ++ptr;
    if (ptr<source.size() && source[ptr]==':') {
        tmp += source[ptr];
        ++column;
        ++ptr;
    }
    return {start_line, start_column, line, column, type_mapper.at(tmp), tmp, filename};
}

token lexer::opr_or_arrow() {
    auto tmp = std::string(1, source[ptr]);
    const auto start_line = line;
    const auto start_column = column;
    ++column;
    ++ptr;
    if (ptr<source.size() && source[ptr]=='>') {
        tmp += source[ptr];
        ++column;
        ++ptr;
    }
    return {start_line, start_column, line, column, type_mapper.at(tmp), tmp, filename};
}

void lexer::notes() {
    auto comment = std::string("");
    const auto start_line = line;
    const auto start_column = column;
    while (ptr<source.size() && source[ptr]!='\n') {
        comment += source[ptr];
        ++ptr;
    }
    comments.push_back({
        start_line,
        start_column,
        line,
        column,
        tok::tok_comment,
        comment,
        filename
    });
}

void lexer::multi_line_notes() {
    const auto start_line = line;
    const auto start_column = column;
    auto comment = std::string("/*");
    ptr += 2;
    column += 2;

    while (ptr<source.size() &&
        !(source[ptr]=='*' && ptr+1<source.size() && source[ptr+1]=='/')) {
        comment += source[ptr];

        // update line counter if get new line
        if (source[ptr]=='\n') {
            ++line;
            ++ptr;
            column = 0;
        } else {
            ++ptr;
            ++column;
        }
    }

    ptr += 2;
    column += 2;
    comment += "*/";

    comments.push_back({
        start_line,
        start_column,
        line,
        column,
        tok::tok_comment,
        comment,
        filename
    });
}

void lexer::invalid_character() {
    const auto start_line = line;
    const auto start_column = column;
    ++column;
    if (' '<=source[ptr] && source[ptr]<='~') {
        err.err({start_line, start_column, line, column, filename},
            "invalid character `" + std::string(1, source[ptr]) + "`."
        );
    } else {
        err.fatal({start_line, start_column, line, column, filename},
            "invalid character 0x" + util::tohex(source[ptr]) + ".",
            "make sure this is text file."
        );
    }
    ++ptr;
}

[[nodiscard]]
const error& lexer::scan(const std::string& path) {
    ptr = 0;
    line = 1;
    column = 0;
    toks.clear();
    open(path);

    while (ptr<source.size()) {
        skip();
        if(is_note()) { // note must be checked before operator '/'
            notes();
        } else if (is_multi_line_note()) {
            multi_line_notes();
        } else if (is_identifier_head(source[ptr])) {
            toks.push_back(identifier());
        } else if (is_number_head(source[ptr])) {
            toks.push_back(num_gen());
        } else if (is_string_head(source[ptr])) {
            toks.push_back(str_gen());
        } else if (is_single_opr(source[ptr])) {
            toks.push_back(single_operator());
        } else if (is_dot(source[ptr])) {
            toks.push_back(dot_operator());
        } else if (is_cmp_opr_head(source[ptr])) {
            toks.push_back(multi_char_operator());
        } else if (is_logic_opr(source[ptr])) {
            toks.push_back(logic_operator());
        } else if (is_annotation(source[ptr])) {
            toks.push_back(annotation());
        } else if (is_colon(source[ptr])) {
            toks.push_back(colons());
        } else if(is_opr_or_arrow(source[ptr])) {
            toks.push_back(opr_or_arrow());
        } else if (ptr<source.size()) {
            invalid_character();
        }
    }
    if (toks.size()) {
        toks.push_back(toks.back());
        toks.back().type = tok::tok_eof;
        toks.back().content = "<eof>";
    } else {
        toks.push_back({
            line, column, line, column,
            tok::tok_eof, "<eof>", filename
        });
    }
    return err;
}

void lexer::dump() const {
    size_t max_length = 0;
    for(const auto& i : toks) {
        max_length = max_length<i.content.length()? i.content.length():max_length;
    }
    max_length = max_length>32? 32:max_length;
    for(const auto& i : toks) {
        std::cout
        << util::rightpad(i.content, max_length)
        << " (" << i.location.file
        << ":" << i.location.start_line
        << ":" << i.location.start_column + 1
        << " -> " << i.location.file
        << ":" << i.location.end_line
        << ":" << i.location.end_column + 1
        << ")\n";
    }
}

void lexer::dump_comments() const {
    for(const auto& i : comments) {
        std::cout << i.location.file << ":" << i.location.start_line << ":\n";
        std::cout << i.content << "\n";
    }
}

}