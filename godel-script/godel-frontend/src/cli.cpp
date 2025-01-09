#include "godel-frontend/src/error/error.h"
#include "godel-frontend/src/util/util.h"
#include "cli.h"

#include <algorithm>

namespace godel {
namespace cli {

std::ostream& welcome(std::ostream& out) {
    using util::green;
    using util::reset;

    out
    << green << "\n"
    << " _____ /_\\_/_\\ _____  _____  ____\n" 
    << "/   __\\/  _  \\|  _  \\/   __\\/  _/\n"
    << "|  |_ ||  |  ||  |  ||   __||  |---\n"
    << "\\_____/\\_____/|_____/\\_____/\\_____/\n"
    << "    _____  _____  _____  ___  _____  ____ \n"
    << "   /  ___>/     \\/  _  \\/___\\/  _  \\/    \\\n"
    << "   |___  ||  |--||  _  <|   ||   __/\\-  -/\n"
    << "   <_____/\\_____/\\__|\\_/\\___/\\__/    |__| \n"
    << reset << "\n"
    << green << "GodelScript " << util::generate_version_from_time_macro(__DATE__)
    << reset << " (" << __DATE__ << " " << __TIME__ << ")\n\n"
    << "Input " << green << "-h" << reset << " to get help.\n\n";
    return out;
}

std::ostream& version(std::ostream& out) {
    out << "GodelScript " << util::generate_version_from_time_macro(__DATE__);
    out << " (" << __DATE__ << " " << __TIME__ << ")\n";
    return out;
}

std::ostream& help(std::ostream& out) {
    using util::reset;
    using util::green;

    out
    << reset << "\nUsage: ./godel "
    << green << "[options] <input>\n\n"
    << reset << "Compile options:\n"
    << green << "  -###                              "
    << reset << "Print detailed compilation commands (not run).\n"
    << green << "  -s,   --souffle <path>            "
    << reset << "Output generated souffle to file.\n"
    << green << "  -r,   --run-souffle               "
    << reset << "Run compiled godel script program.\n"
    << green << "  -p,   --package-path <path>       "
    << reset << "Give godelscript package root path.\n"
    << green << "  -f,   --fact                      "
    << reset << "Specify souffle fact data path.\n"
    << green << "  -e,   --extract-template          "
    << reset << "Extract probable script template.\n"
    << green << "  -l,   --location-extract <path>   "
    << reset << "Extract function and method location into json.\n";
    out
    << reset << "\nInformation dump options:\n"
    << green << "  -h,   --help                      "
    << reset << "Show help message.\n"
    << green << "  -v,   --verbose                   "
    << reset << "Show verbose message.\n"
    << green << "  -V,   --version                   "
    << reset << "Show version info.\n"
    << green << "  -u,   --used-module               "
    << reset << "Show used modules.\n"
    << green << "  -d,   --dump                      "
    << reset << "Show abstract syntax tree.\n"
    << green << "        --color-off                 "
    << reset << "Show abstract syntax tree without color.\n"
    << green << "        --dump-sema                 "
    << reset << "Show semantic analysis result.\n"
    << green << "        --dump-resolve              "
    << reset << "Show resolved abstract syntax tree.\n"
    << green << "        --dump-global               "
    << reset << "Show global symbol.\n"
    << green << "        --dump-local                "
    << reset << "Show local symbol.\n";
    out
    << reset << "\nLanguage server options:\n"
    << green << "        --dump-lsp                  "
    << reset << "Show semantic result in json format.\n"
    << green << "        --lsp-dump-use-indexed-file "
    << reset << "Use file index instead of string.\n"
    << green << "        --lsp-dump-only-schema      "
    << reset << "Only dump schema without location.\n";
    out
    << reset << "\nLexical analysis dump options:\n"
    << green << "        --lexer-dump-token          "
    << reset << "Dump analysed tokens.\n"
    << green << "        --lexer-dump-comment        "
    << reset << "Dump collected comments.\n";
    out
    << reset << "\nSemantic checker options:\n"
    << green << "        --semantic-only             "
    << reset << "Only do semantic analysis and exit.\n"
    << green << "        --semantic-pub-check        "
    << reset << "Enable semantic public access authority checker.\n";
    out
    << reset << "\nSouffle code generation options:\n"
    << green << "  -O1                               "
    << reset << "Enable souffle code generator optimizer, level 1.\n"
    << green << "  -O2                               "
    << reset << "Enable souffle code generator optimizer, level 2.\n"
    << green << "  -O3                               "
    << reset << "Enable souffle code generator optimizer, level 3.\n"
    << green << "  -Of,  --opt-for                   "
    << reset << "Enable souffle code generator for statement optimizer.\n"
    << green << "  -Ol,  --opt-let                   "
    << reset << "Enable souffle code generator let statement optimizer(not suggested).\n"
    << green << "  -Osc, --opt-self-constraint       "
    << reset << "Enable self data constraint optimizer in souffle code generator.\n"
    << green << "  -Ojr, --opt-join-reorder          "
    << reset << "Enable join reorder optimizer(experimental).\n"
    << green << "        --disable-inst-combine      "
    << reset << "Disable instruction combine pass.\n"
    << green << "        --disable-remove-unused     "
    << reset << "Disable unused method deletion pass.\n"
    << green << "        --disable-do-schema-opt     "
    << reset << "Disable DO Schema data constraint __all__ method optimization.\n"
    << green << "        --souffle-debug             "
    << reset << "Dump generated souffle code by stdout.\n";
    out
    << reset << "\nSouffle execution options:\n"
    << green << "        --souffle-slow-transformers "
    << reset << "Enable Souffle slow transformers.\n"
    << green << "        --enable-souffle-profiling  "
    << reset << "Enable Souffle profiling log, output to <souffle.prof.log>.\n"
    << green << "        --enable-souffle-cache      "
    << reset << "Enable Souffle cache (experimental).\n"
    << green << "        --clean-souffle-cache       "
    << reset << "Clean Souffle cache (experimental).\n"
    << green << "        --output-json   <path>      "
    << reset << "Redirect stdout souffle execution result into json.\n"
    << green << "        --output-csv    <path>      "
    << reset << "Redirect stdout souffle execution result into csv.\n"
    << green << "        --output-sqlite <path>      "
    << reset << "Redirect stdout souffle execution result into sqlite.\n"
    << green << "  -Drs, --directly-run-souffle      "
    << reset << "Directly run input souffle source.\n";

    out << "\n";
    return out;
}

void report_invalid_argument(const std::string& arg) {
    struct distance_info {
        size_t distance;
        std::string content;
    };
    std::vector<distance_info> possible_choise;
    for(const auto& i : settings) {
        auto distance = util::levenshtein_distance(i.first, arg);
        possible_choise.push_back({distance, i.first});
    }
    for(const auto& i : options) {
        auto distance = util::levenshtein_distance(i.first, arg);
        possible_choise.push_back({distance, i.first});
    }

    std::sort(
        possible_choise.begin(),
        possible_choise.end(),
        [](const distance_info& left, const distance_info& right) {
            return left.distance < right.distance;
        }
    );
    auto info = "invalid argument <" + arg + ">, possible arguments: ";
    size_t count = 0;
    for(const auto& i : possible_choise) {
        info += "<" + i.content + ">";
        ++count;
        if (count>2) {
            info += ".";
            break;
        } else {
            info += ", ";
        }
    }
    report::error().fatal(info);
}

void dump_configure(const configure& conf) {
    if (conf.empty()) {
        return;
    }

    std::unordered_map<option, std::string> mapper = {
        {option::cli_executable_path, "executable"},
        {option::cli_input_path, "input-script"}
    };

    for(const auto& i : settings) {
        if (mapper.count(i.second.command_type) &&
            mapper.at(i.second.command_type).length()>i.first.length()) {
            continue;
        }
        mapper[i.second.command_type] = i.first;
    }
    for(const auto& i : options) {
        if (mapper.count(i.second) &&
            mapper.at(i.second).length()>i.first.length()) {
            continue;
        }
        mapper[i.second] = i.first;
    }

    std::clog << conf.at(option::cli_executable_path) << " ";
    std::clog << conf.at(option::cli_input_path);
    for(const auto& i : mapper) {
        if (i.first == option::cli_executable_path ||
            i.first == option::cli_input_path) {
            continue;
        }
        if (!conf.count(i.first)) {
            continue;
        }
        std::clog << " " << i.second;
        if (conf.at(i.first).length()) {
            std::clog << " " << conf.at(i.first);
        }
    }
    std::clog << "\n\n";
}

configure process_args(const std::vector<std::string>& vec) {
    configure config = {
        // load executable path here
        { option::cli_executable_path, vec[0] }
    };

    report::error err;
    for(size_t i = 1; i<vec.size(); ++i) {
        const auto& arg = vec[i];
        if (options.count(arg)) {
            config[options.at(arg)] = "";
        } else if (multi_options.count(arg)) {
            for(auto o : multi_options.at(arg)) {
                config[o] = "";
            }
        } else if (settings.count(arg)) {
            ++i;
            if (i>=vec.size() || vec[i][0]=='-') {
                err.fatal(
                    "expected " + settings.at(arg).error_info +
                    " after <" + arg + ">."
                );
            }
            config[settings.at(arg).command_type] = vec[i];
        } else if (arg[0]!='-' && !config.count(option::cli_input_path)) {
            config[option::cli_input_path] = arg;
        } else {
            report_invalid_argument(arg);
        }
    }

    // enable global color off mode
    if (config.count(option::cli_color_off)) {
        util::enable_color_off_mode();
    }

    if (config.count(option::cli_help)) {
        std::clog << help;
        std::exit(0);
    }

    if (config.count(option::cli_version)) {
        std::clog << version;
        std::exit(0);
    }

    if (!config.count(option::cli_input_path)) {
        err.fatal("input file is required.");
    }

    if (config.count(option::cli_show_real_cmd_args)) {
        dump_configure(config);
        std::exit(0);
    }

    return config;
}

}
}