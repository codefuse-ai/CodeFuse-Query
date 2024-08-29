
#ifndef COREF_CFAMILY_SRC_EXTRACTOR_COREFASTVISITOR_HPP
#define COREF_CFAMILY_SRC_EXTRACTOR_COREFASTVISITOR_HPP

#include "Coref/CorefUri.hpp"
#include "Coref/SignatureGenerator.hpp"
#include "Storage/StorageFacade.hpp"
#include <clang/AST/DeclCXX.h>
#include <clang/AST/Expr.h>
#include <clang/AST/RecursiveASTVisitor.h>
#include <clang/Tooling/Tooling.h>
#include <iostream>
#include <string>
#include <unordered_map>
#include <utility>

namespace coref {

class CorefASTVisitor : public clang::RecursiveASTVisitor<CorefASTVisitor> {
    friend class clang::RecursiveASTVisitor<CorefASTVisitor>;

  private:
    const clang::ASTContext &_context;
    CorefUri _corefUri;

    /// Store an AST node's OID and its location OID
    /// The key represents the node's OID, the value represents its location OID
    std::unordered_map<CorefOid, CorefOid> _locationMap;

    /// <CorefOid(parent Node Oid), CorefOid(Cur Order Index)>
    std::unordered_map<CorefOid, CorefOid> _parentMap;
    /// Store current program Oid
    CorefOid _programOid;
    /// Store current file Oid
    CorefOid _fileOid{0};
    /// Store new visited file info while traversing AST nodes.
    std::unordered_map<CorefOid, File> &_newVisitFileMap;

    /// Generate the corresponding relationship between a statement and its
    /// caller callable a callable could be function decl, method decl and block
    /// decl. \param stmt: \param callableOid
    void generateCallableEnclosingStatement(const clang::Stmt *stmt, CorefOid callableOid);

  public:
    CorefASTVisitor(const clang::ASTContext &context, const CorefUri &corefUri, CorefOid programOid,
                    std::unordered_map<CorefOid, File> &newVisitFileMap);

    /// Get clang::ASTContext Object
    /// \return
    [[nodiscard]] const clang::ASTContext &getContext() const;

    /// Get the parent Oid of the given node
    /// \tparam NodeT: The type of the given AST node
    /// \param node: The given AST node
    /// \return: The parent Oid
    template <typename NodeT> CorefOid getParentOid(const NodeT &node);

    /// Get the Oid of the given stmt node
    /// \param stmt
    /// \return Oid
    CorefOid getOid(const clang::Stmt *stmt) const;

    /// Get the Oid of the given decl node
    /// \param decl
    /// \return Oid
    CorefOid getOid(const clang::Decl *decl) const;

    /// Get the Oid of the given type node
    /// \param type
    /// \return Oid
    CorefOid getOid(const clang::Type *type) const;

    /// Get the Oid of the given qualtype node
    /// \param decl
    /// \return Oid
    CorefOid getOid(const clang::QualType *qualType) const;

    /// Get Oid of TypeLoc
    /// \param typeLoc
    /// \return
    CorefOid getOid(const clang::TypeLoc &typeLoc) const;

    /// Get the source code snippet corresponding to the stmt node
    /// \param stmt
    /// \return
    std::string astToString(const clang::Stmt *stmt) const;

    /// Get the source code snippet corresponding to the decl node
    /// \param stmt
    /// \return
    std::string astToString(const clang::Decl *decl) const;

    /// Get the source code snippet corresponding to the type node
    /// \param type
    /// \return
    std::string astToString(const clang::Type *type) const;

    /// Get the source code snippet corresponding to the qualtype node
    /// \param stmt
    /// \return
    std::string astToString(const clang::QualType *qualType) const;

    /// Get location by the sourceRange
    /// \param sourceRange
    /// \return
    Location getLocation(const clang::SourceRange &sourceRange) const;

    /// Get the Location Oid.
    /// It looks up _locationMap with nodeOid for the Location Oid first,
    /// If not found, it calls getLocation to generate a new Location and return
    /// its oid. \param nodeOid \param sourceRange \return Oid
    CorefOid getLocationOid(const CorefOid nodeOid, const clang::SourceRange sourceRange);

    /// Get location by the sourceRange
    /// \tparam T: Node type
    /// \param node: AST node
    /// \return
    template <typename T> Location getLocation(const T *node) {
        return getLocation(node->getSourceRange());
    }

    /// Set file Oid of the file being extracted
    /// \param oid
    inline void setExtractFileOid(CorefOid oid) { _fileOid = oid; }

    bool VisitStmt(const clang::Stmt *stmt);

    bool VisitDeclStmt(const clang::DeclStmt *stmt);

    bool VisitIfStmt(const clang::IfStmt *stmt);

    bool VisitSwitchStmt(const clang::SwitchStmt *stmt);

    bool VisitWhileStmt(const clang::WhileStmt *stmt);

    bool VisitDoStmt(const clang::DoStmt *stmt);

    bool VisitForStmt(const clang::ForStmt *stmt);

    bool VisitObjCForCollectionStmt(const clang::ObjCForCollectionStmt *stmt);

    bool VisitObjCCategoryDecl(const clang::ObjCCategoryDecl *decl);

    bool VisitCXXForRangeStmt(const clang::CXXForRangeStmt *stmt);

    bool VisitValueStmt(const clang::ValueStmt *stmt);

    bool VisitExpr(const clang::Expr *stmt);

    bool VisitObjCPropertyRefExpr(const clang::ObjCPropertyRefExpr *stmt);

    bool VisitObjCIvarRefExpr(const clang::ObjCIvarRefExpr *stmt);

    bool VisitObjCStringLiteral(const clang::ObjCStringLiteral *stmt);

    bool VisitConditionalOperator(const clang::ConditionalOperator *stmt);

    bool VisitObjCMessageExpr(const clang::ObjCMessageExpr *stmt);

    bool VisitDecl(const clang::Decl *decl);

    // Not modeling this for now becasue except OMPDeclareMapperDecl,
    // all declaration context are also inherited from Decl
    // bool VisitDeclContext(const clang::DeclContext *declContext);

    bool VisitVarDecl(const clang::VarDecl *decl);

    bool VisitNamedDecl(const clang::NamedDecl *decl);

    bool VisitObjCContainerDecl(const clang::ObjCContainerDecl *decl);

    bool VisitObjCInterfaceDecl(const clang::ObjCInterfaceDecl *decl);

    bool VisitObjCProtocolDecl(const clang::ObjCProtocolDecl *decl);

    bool VisitObjCMethodDecl(const clang::ObjCMethodDecl *decl);

    bool VisitBlockDecl(const clang::BlockDecl *decl);

    bool VisitBlockExpr(const clang::BlockExpr *expr);

    bool VisitObjCPropertyDecl(const clang::ObjCPropertyDecl *decl);

    bool VisitObjCImplDecl(const clang::ObjCImplDecl *d);

    bool VisitRecordDecl(const clang::RecordDecl *decl);

    bool VisitCallExpr(const clang::CallExpr *expr);

    bool VisitCXXMemberCallExpr(const clang::CXXMemberCallExpr *expr);

    bool VisitCXXMethodDecl(const clang::CXXMethodDecl *decl);

    bool VisitDeclaratorDecl(const clang::DeclaratorDecl *decl);

    bool VisitFieldDecl(const clang::FieldDecl *decl);

    bool VisitObjCIvarDecl(const clang::ObjCIvarDecl *decl);

    bool VisitFunctionDecl(const clang::FunctionDecl *decl);

    bool VisitValueDecl(const clang::ValueDecl *decl);

    bool VisitObjCObjectType(const clang::ObjCObjectType *type);

    bool VisitType(const clang::Type *type);

    bool VisitTagType(const clang::TagType *type);

    bool VisitTypeLoc(const clang::TypeLoc typeLoc);

    bool VisitTypeDecl(const clang::TypeDecl *decl);

    bool VisitTagDecl(const clang::TagDecl *decl);

    bool getDeclName(std::string *result, clang::NamedDecl *decl);

    void traverseDeclIfNotVisited(clang::Decl *decl);
};

} // namespace coref

#endif // COREF_CFAMILY_SRC_EXTRACTOR_COREFASTVISITOR_HPP
