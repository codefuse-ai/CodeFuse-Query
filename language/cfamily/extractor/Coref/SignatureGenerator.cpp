

#include "SignatureGenerator.hpp"
#include <clang/AST/ASTContext.h>
#include <clang/AST/Decl.h>
#include <clang/AST/Stmt.h>
#include <clang/AST/TypeLoc.h>
#include <clang/Basic/SourceLocation.h>
#include <clang/Basic/SourceManager.h>

using namespace coref;

std::string SignatureGenerator::generate(const clang::Stmt *stmt,
                                         const clang::ASTContext &context) {
    return generateLocationSignature(context.getSourceManager(), stmt->getSourceRange());
}

std::string SignatureGenerator::generate(const clang::Decl *decl) {
    return generateLocationSignature(decl->getASTContext().getSourceManager(),
                                     decl->getSourceRange());
}

std::string SignatureGenerator::generate(const clang::Type *type,
                                         const clang::ASTContext &context) {
    auto qualType = type->getCanonicalTypeInternal();
    return SignatureGenerator::generate(&qualType, context);
}

std::string SignatureGenerator::generate(const clang::QualType *qualType,
                                         const clang::ASTContext &context) {
    return qualType->getAsString(context.getPrintingPolicy());
}

std::string SignatureGenerator::generate(const clang::TypeLoc &typeLoc,
                                         const clang::ASTContext &context) {
    return generateLocationSignature(context.getSourceManager(), typeLoc.getSourceRange());
}

std::string SignatureGenerator::generateLocationSignature(const clang::SourceManager &sourceManager,
                                                          const clang::SourceRange &sourceRange) {
    // Clang prints location with its own logics, just reuse them
    // returned string example: </test.cpp:13:3, line:14:27>
    // TODO Maybe generate our own signature instead
    return sourceRange.printToString(sourceManager);
}
