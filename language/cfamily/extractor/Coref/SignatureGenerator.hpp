
#ifndef COREF_CFAMILY_SRC_EXTRACTOR_SIGNATUREGENERATOR_HPP
#define COREF_CFAMILY_SRC_EXTRACTOR_SIGNATUREGENERATOR_HPP

#include "Coref/CorefDef.hpp"

namespace clang {
class Stmt;
class ASTContext;
class Decl;
class QualType;
class SourceManager;
class SourceRange;
class Type;
class TypeLoc;
} // namespace clang

namespace coref {
class SignatureGenerator {
  public:
    static std::string generate(const clang::Stmt *stmt, const clang::ASTContext &context);

    static std::string generate(const clang::Decl *decl);

    static std::string generate(const clang::Type *type, const clang::ASTContext &context);

    static std::string generate(const clang::QualType *qualType, const clang::ASTContext &context);

    static std::string generate(const clang::TypeLoc &typeLoc, const clang::ASTContext &context);

    static std::string generateLocationSignature(const clang::SourceManager &sourceManager,
                                                 const clang::SourceRange &sourceRange);
};

} // namespace coref

#endif // COREF_CFAMILY_SRC_EXTRACTOR_SIGNATUREGENERATOR_HPP
