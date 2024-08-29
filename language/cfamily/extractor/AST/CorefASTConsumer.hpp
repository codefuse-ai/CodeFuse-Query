
#ifndef COREF_CFAMILY_SRC_EXTRACTOR_COREFASTCONSUMER_HPP
#define COREF_CFAMILY_SRC_EXTRACTOR_COREFASTCONSUMER_HPP

#include "ASTUtil.hpp"
#include "CorefASTVisitor.hpp"
#include <clang/Tooling/Tooling.h>
#include <llvm/Support/Regex.h>

using namespace llvm;

namespace coref {

class CorefASTConsumer : public clang::ASTConsumer {
  private:
    const CorefUri _corefUri;
    std::set<clang::FileID> _visitedFileIds;
    std::unique_ptr<llvm::Regex> _blacklistDirFilter;

    inline bool isInBlackListDir(StringRef absolutePath) {
        return _blacklistDirFilter && _blacklistDirFilter->match(absolutePath);
    }

  protected:
    /// An override HandleTranslationUnit
    /// This method is called when the ASTs for entire translation unit have
    /// been parsed. \param astContext
    void HandleTranslationUnit(clang::ASTContext &astContext) final {
        coref::StorageFacade::transaction([&]() mutable {
            // insert entry for Program table, entry could be existed already.
            auto programOid = CorefUri::generateCorpusOId(_corefUri.getCorpus());
            coref::StorageFacade::insertClassObj(Program{programOid, _corefUri.getCorpus()});

            std::unordered_map<CorefOid, File> newVisitFileMap{};
            coref::CorefASTVisitor visitor(astContext, _corefUri, programOid, newVisitFileMap);

            auto decls = astContext.getTranslationUnitDecl()->decls();
            auto &sourceMngr = astContext.getSourceManager();
            for (auto &decl : decls) {
                auto curFileId = sourceMngr.getFileID(decl->getLocation());

                if (_visitedFileIds.find(curFileId) != _visitedFileIds.end()) {
                    // skip visited files
                    continue;
                }

                // skip AST nodes having invalid source location
                if (!decl->getLocation().isValid()) {
                    continue;
                }

                // todo: need to verify the accuracy of function
                // "isInSystemHeader" & "isInSystemMacro"
                if (sourceMngr.isInSystemHeader(decl->getLocation()) ||
                    sourceMngr.isInSystemMacro(decl->getLocation())) {
                    // skip AST nodes in system headers
                    _visitedFileIds.insert(curFileId);
                    continue;
                }

                StringRef absolutePath = sourceMngr.getFilename(decl->getLocation());
                if (absolutePath.empty())
                    continue;
                if (isInBlackListDir(absolutePath)) {
                    _visitedFileIds.insert(curFileId);
                    continue;
                }

                StringRef relativePath;
                getRootRelativePath(absolutePath, relativePath);
                // note: relativePath would be an absolute path when handling a
                // framework file.

                auto fileOid =
                    CorefUri::generateFileOId(_corefUri.getCorpus(), std::string(relativePath));
                if (coref::StorageFacade::checkFileObjExist(programOid, fileOid)) {
                    // skip file that have been added in Sqlite DB
                    _visitedFileIds.insert(curFileId);
                    continue;
                }

                if (newVisitFileMap.find(fileOid) == newVisitFileMap.end()) {
                    File file{fileOid, std::string(relativePath),
                              std::string(sys::path::extension(relativePath)),
                              std::string(sys::path::filename(relativePath)), programOid};
                    newVisitFileMap.insert({fileOid, std::move(file)});
                }
                visitor.setExtractFileOid(fileOid);
                visitor.TraverseDecl(decl);
            }

            // traverse the newFileStruct and update the File table
            for (auto &[fileOid, f] : newVisitFileMap) {
                coref::StorageFacade::insertClassObj(std::move(f));
            }

            return true;
        });
    }

  public:
    CorefASTConsumer(const CorefUri &corefUri, std::vector<std::string> &blacklistDir)
        : _corefUri(corefUri) {
        std::stringstream regexStr;
        bool first = true;
        for (auto dir : blacklistDir) {
            if (first) {
                regexStr << "(" << dir << ")";
                first = false;
            } else {
                regexStr << "|(" << dir << ")";
            }
        }
        _blacklistDirFilter = std::make_unique<llvm::Regex>(regexStr.str());
        _blacklistDirFilter->isValid();
    };
};
} // namespace coref

#endif // COREF_CFAMILY_SRC_EXTRACTOR_COREFASTCONSUMER_HPP
