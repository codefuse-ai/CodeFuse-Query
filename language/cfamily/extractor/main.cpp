

#include <chrono>
#include <clang/Tooling/Tooling.h>
#include <filesystem>
#include <vector>

#include "AST/CorefASTFrontendAction.hpp"
#include "AST/CorefOptionsParser.hpp"

auto main(int argc, const char *argv[]) -> int {
    using namespace clang::tooling;

    static llvm::cl::OptionCategory corefOptionCategory("Coref Options");
    static llvm::cl::extrahelp corefOptionHelp(
        R"(This tool extracts AST Nodes' information from a given C family codebase.)");

    auto corefOptionsParser = CorefOptionsParser::create(argc, argv, corefOptionCategory);

    if (!corefOptionsParser) {
        llvm::errs() << corefOptionsParser.takeError();
        // TODO magic number for incorrect options
        return 101;
    }

    llvm::outs() << "Sqlite Db Directory: " << corefOptionsParser->getSqliteDbDir()
                 << ", Corpus: " << corefOptionsParser->getCorpusName() << "\n";

    // By default, the file will be overwritten
    auto sqliteDbFilenamePath = std::filesystem::path(corefOptionsParser->getSqliteDbDir()) /
                                std::filesystem::path("coref_cfamily_src.db");
    if (std::filesystem::exists(sqliteDbFilenamePath)) {
        llvm::dbgs() << "Overwrite existing db file: " << sqliteDbFilenamePath << "\n";
        std::filesystem::remove(sqliteDbFilenamePath);
    }
    std::string sqliteDbFilename = std::filesystem::absolute(sqliteDbFilenamePath).string();
    coref::StorageFacade::initOrm(sqliteDbFilename);

    auto &fcd = corefOptionsParser->getCompilations();
    auto allfiles = fcd.getAllFiles();
    llvm::outs() << "Total " << allfiles.size() << " files ready to compile.\n";

    auto start = std::chrono::steady_clock::now();

    ClangTool tool(fcd, fcd.getAllFiles());
    auto ret = tool.run(new coref::CorefFrontendActionFactory(corefOptionsParser->getCorpusName(), corefOptionsParser->getBlacklistDir()));
    auto end = std::chrono::steady_clock::now();

    llvm::outs() << "Elapsed(ms)="
                 << std::chrono::duration_cast<std::chrono::milliseconds>(end - start).count()
                 << "\n";
    return ret;
}
