
#ifndef COREF_CFAMILY_SRC_EXTRACTOR_COREFASTFRONTENDACTION_HPP
#define COREF_CFAMILY_SRC_EXTRACTOR_COREFASTFRONTENDACTION_HPP

#include "../Coref/CorefUri.hpp"
#include "CorefASTConsumer.hpp"
#include <clang/Tooling/Tooling.h>
#include <filesystem>

namespace coref {

class CorefASTFrontendAction : public clang::ASTFrontendAction {
  private:
    std::string _corpus;
    std::vector<std::string>& _blacklistDir;

  public:
    /// Constructor of CorefASTFrontendAction Class
    /// \param corpusName
    explicit CorefASTFrontendAction(const std::string &corpusName, std::vector<std::string>& blacklistDir)
        : clang::ASTFrontendAction(), _corpus(corpusName), _blacklistDir(blacklistDir) {}

  protected:
    /// An override of CreateASTConsumer
    /// \param ci
    /// \param input_file
    /// \return
    std::unique_ptr<clang::ASTConsumer> CreateASTConsumer(clang::CompilerInstance &ci,
                                                          llvm::StringRef inputFile) override {
        // TODO fill in corpus info
        auto absoluteInputFile = std::filesystem::absolute(inputFile.str());
        auto corefUri = CorefUri(_corpus, absoluteInputFile.string());
        llvm::outs() << "Consuming file: " << absoluteInputFile.string()
                     << " of corpus: " << _corpus << "\n";
        return std::unique_ptr<clang::ASTConsumer>(new coref::CorefASTConsumer(corefUri, _blacklistDir));
    }
};

struct CorefFrontendActionFactory : public clang::tooling::FrontendActionFactory {
    /// Constructor of CorefFrontendActionFactory Class
    /// \param corpusName
    explicit CorefFrontendActionFactory(const std::string &corpusName, std::vector<std::string>& blacklistDir)
        : clang::tooling::FrontendActionFactory(), _corpusName(corpusName), _blacklistDir(blacklistDir) {}

    /// a Factory method to create clang::FrontendAction
    /// \return
    std::unique_ptr<clang::FrontendAction> create() override {
        auto *action =
            dynamic_cast<clang::FrontendAction *>(new CorefASTFrontendAction(_corpusName, _blacklistDir));
        return std::unique_ptr<clang::FrontendAction>(action);
    }

  private:
    std::string _corpusName;
    std::vector<std::string>& _blacklistDir;
};

} // namespace coref

#endif // COREF_CFAMILY_SRC_EXTRACTOR_COREFASTFRONTENDACTION_HPP
