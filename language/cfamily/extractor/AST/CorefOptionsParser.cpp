

#include "CorefOptionsParser.hpp"

using namespace clang::tooling;
using namespace llvm;

llvm::Error CorefOptionsParser::init(int &argc, const char **argv, cl::OptionCategory &category) {

    static llvm::cl::opt<std::string> compileCmdOption(
        "compile-commands", llvm::cl::desc("Path to the compile_commands.json file"),
        llvm::cl::cat(category));
    static llvm::cl::alias shortCompileCmdOption("p", llvm::cl::desc("Alias for compile"),
                                                 llvm::cl::aliasopt(compileCmdOption));

    static llvm::cl::opt<std::string> sqliteDbDirOption(
        "output-db-path", llvm::cl::Required, llvm::cl::desc("The directory of sqlite DB"),
        llvm::cl::cat(category));
    static llvm::cl::alias shortSqliteDbDirOption("o",
                                                  llvm::cl::desc("Alias for output-db-directory"),
                                                  llvm::cl::aliasopt(sqliteDbDirOption));

    static llvm::cl::opt<std::string> corpusOption(
        "corpus", llvm::cl::desc("Specify the corpus of the codebase"), llvm::cl::cat(category));
    static llvm::cl::alias shortCorpusOption("c", llvm::cl::desc("Alias for corpus"),
                                             llvm::cl::aliasopt(corpusOption));

    static llvm::cl::list<std::string> blacklistDirOption(
        "blacklist-dir", llvm::cl::desc("The directories not to be extracted"),
        llvm::cl::cat(category));

    static llvm::cl::list<std::string> argsAfter(
        "extra-arg", llvm::cl::desc("Additional argument to append to the compiler command line"),
        llvm::cl::cat(category));

    static llvm::cl::list<std::string> argsBefore(
        "extra-arg-before",
        llvm::cl::desc("Additional argument to prepend to the compiler command line"),
        llvm::cl::cat(category));

    cl::ResetAllOptionOccurrences();

    cl::HideUnrelatedOptions(category);

    std::string errorMessage;
    _compilations = FixedCompilationDatabase::loadFromCommandLine(argc, argv, errorMessage);
    if (!errorMessage.empty())
        errorMessage.append("\n");
    llvm::raw_string_ostream os(errorMessage);
    // Stop initializing if command-line option parsing failed.
    if (!cl::ParseCommandLineOptions(argc, argv, "", &os)) {
        os.flush();
        return llvm::make_error<llvm::StringError>("[CommonOptionsParser]: " + errorMessage,
                                                   llvm::inconvertibleErrorCode());
    }

    cl::PrintOptionValues();

    if (!sqliteDbDirOption.empty()) {
        _sqliteDbDir = sqliteDbDirOption;
    }

    if (!corpusOption.empty()) {
        _corpusName = corpusOption;
    } else {
        _corpusName = "not specified";
    }

    if (!blacklistDirOption.empty()) {
        _blacklistDir = blacklistDirOption;
    }

    if (!_compilations && !compileCmdOption.empty()) {
        // CompileCmdOption can be specified as directory
        // if it is specified as json file and is not named as
        // 'compile_commands.json', copy one for it.
        if (!llvm::sys::fs::is_directory(compileCmdOption)) {
            auto filename = llvm::sys::path::filename(compileCmdOption);
            if (!filename.equals("compile_commands.json")) {
                SmallString<256> tmpFile = StringRef(compileCmdOption);
                sys::path::remove_filename(tmpFile);
                sys::path::append(tmpFile, "compile_commands.json");
                llvm::outs() << "compile_commands.json generated. located in "
                             << std::string(tmpFile) << "\n";
                llvm::sys::fs::copy_file(compileCmdOption, tmpFile);
            }
        }
        _compilations =
            CompilationDatabase::autoDetectFromDirectory(compileCmdOption, errorMessage);
        if (!_compilations) {
            llvm::errs() << "Error while trying to load a compilation database:\n"
                         << errorMessage << "Running without flags.\n";
            _compilations.reset(new FixedCompilationDatabase(".", std::vector<std::string>()));
        }
    }

    auto adjustingCompilations =
        std::make_unique<ArgumentsAdjustingCompilations>(std::move(_compilations));
    _adjuster = getInsertArgumentAdjuster(argsBefore, ArgumentInsertPosition::BEGIN);
    _adjuster = combineAdjusters(std::move(_adjuster),
                                 getInsertArgumentAdjuster(argsAfter, ArgumentInsertPosition::END));
    adjustingCompilations->appendArgumentsAdjuster(_adjuster);
    _compilations = std::move(adjustingCompilations);
    return llvm::Error::success();
}

llvm::Expected<CorefOptionsParser> CorefOptionsParser::create(int &argc, const char **argv,
                                                              llvm::cl::OptionCategory &category) {
    CorefOptionsParser parser;
    llvm::Error err = parser.init(argc, argv, category);
    if (err)
        return std::move(err);
    return std::move(parser);
}
