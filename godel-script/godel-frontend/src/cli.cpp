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
    << green << "  -s,   --souffle <path>            "
    << reset << "Output generated souffle to file.\n"
    << green << "  -r,   --run-souffle               "
    << reset << "Run compiled godel script program directly.\n"
    << green << "  -p,   --package-path <path>       "
    << reset << "Give godelscript package root path.\n"
    << green << "  -f,   --fact                      "
    << reset << "Specify souffle fact data path.\n"
    << green << "  -e,   --extract-template          "
    << reset << "Extract probable script template.\n"
    << green << "  -l,   --location-extract <path>   "
    << reset << "Extract all functions and methods location into json.\n";
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
    << reset << "Use file index instead of string.\n";
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
    << reset << "Enable semantic public access authority checker.\n"
    << green << "        --semantic-no-else          "
    << reset << "Enable semantic no else branch checker.\n";
    out
    << reset << "\nSouffle code generation options:\n"
    << green << "  -Of,  --opt-for                   "
    << reset << "Enable souffle code generator for statement optimizer.\n"
    << green << "  -Ol,  --opt-let                   "
    << reset << "Enable souffle code generator let statement optimizer(not suggested).\n"
    << green << "  -Oim, --opt-ir-merge              "
    << reset << "Enable souffle inst combine pass (Experimental).\n"
    << green << "  -Osc, --opt-self-constraint       "
    << reset << "Enable self data constraint optimizer in souffle code generator.\n"
    << green << "        --disable-remove-unused     "
    << reset << "Disable unused method deletion pass.\n"
    << green << "        --disable-do-schema-opt     "
    << reset << "Disable DO Schema data constraint __all__ method optimization.\n"
    << green << "        --souffle-debug             "
    << reset << "Dump generated souffle code by stdout.\n"
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
    << reset << "Redirect stdout souffle execution result into sqlite.\n";

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

configure process_args(const std::vector<std::string>& vec) {
    configure config = {
        {option::cli_executable_path, vec[0]} // load executable path here
    };

    report::error err;
    for(size_t i = 1; i<vec.size(); ++i) {
        const auto& arg = vec[i];
        if (options.count(arg)) {
            config[options.at(arg)] = "";
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

    return config;
}

}
}