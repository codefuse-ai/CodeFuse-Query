
#ifndef COREF_CFAMILY_SRC_EXTRACTOR_COREFOPTIONSPARSER_HPP
#define COREF_CFAMILY_SRC_EXTRACTOR_COREFOPTIONSPARSER_HPP

#include <clang/Tooling/ArgumentsAdjusters.h>
#include <clang/Tooling/CommonOptionsParser.h>

namespace clang {
namespace tooling {

class CorefOptionsParser {
  public:
    static llvm::Expected<CorefOptionsParser> create(int &argc, const char **argv,
                                                     llvm::cl::OptionCategory &category);

    /// Returns a reference to the loaded compilations database.
    CompilationDatabase &getCompilations() { return *_compilations; }

    /// Returns a std::string of the path to sqlite db.
    inline std::string getSqliteDbDir() { return _sqliteDbDir; }

    /// Returns corpus name of the codebase.
    inline std::string getCorpusName() { return _corpusName; }

    /// Returns corpus name of the codebase.
    inline std::vector<std::string>& getBlacklistDir() { return _blacklistDir; }

  private:
    CorefOptionsParser() = default;
    llvm::Error init(int &argc, const char **argv, llvm::cl::OptionCategory &category);
    std::unique_ptr<CompilationDatabase> _compilations;
    ArgumentsAdjuster _adjuster;
    std::string _sqliteDbDir;
    std::string _corpusName;
    std::vector<std::string> _blacklistDir{};
};

} // namespace tooling
} // namespace clang

#endif // COREF_CFAMILY_SRC_EXTRACTOR_COREFOPTIONSPARSER_HPP
