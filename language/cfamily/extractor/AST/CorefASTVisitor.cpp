

#include "CorefASTVisitor.hpp"
#include "ASTUtil.hpp"
#include "Coref/Utils/Switcher.h"
#include "SymbolNameGenerator.hpp"
#include "clang/AST/ParentMapContext.h"
#include <llvm/Support/FormatVariadic.h>

using namespace coref;

CorefASTVisitor::CorefASTVisitor(const clang::ASTContext &context, const CorefUri &corefUri,
                                 CorefOid programOid,
                                 std::unordered_map<CorefOid, File> &newVisitFileMap)
    : _context(context), _corefUri(corefUri), _programOid(programOid),
      _newVisitFileMap(newVisitFileMap) {}

const clang::ASTContext &CorefASTVisitor::getContext() const { return _context; }

template <typename NodeT> CorefOid CorefASTVisitor::getParentOid(const NodeT &node) {
    clang::DynTypedNodeList parentNode =
        const_cast<clang::ASTContext &>(getContext()).getParents(node);

    CorefOid parentOid = -1;
    if (parentNode.size() > 0) {
        if (const auto *parentStmt =
                clang::dyn_cast_or_null<clang::Stmt>(parentNode[0].get<clang::Stmt>())) {
            parentOid = getOid(parentStmt);
        } else if (const auto *parentDecl =
                       clang::dyn_cast_or_null<clang::Decl>(parentNode[0].get<clang::Decl>())) {
            parentOid = getOid(parentDecl);
        } else if (const auto *parentTypeloc = clang::dyn_cast_or_null<clang::TypeLoc>(
                       parentNode[0].get<clang::TypeLoc>())) {
            parentOid = getOid(*parentTypeloc);
        } else {
            llvm::errs() << "unknown parent node!\n";
        }
    }
    return parentOid;
}

CorefOid CorefASTVisitor::getOid(const clang::Stmt *stmt) const {
    if (stmt == nullptr) {
        return -1L;
    }
    std::string signature = SignatureGenerator::generate(stmt, getContext());
    return CorefUri::generateOId(_corefUri.getCorpus(), signature);
}

CorefOid CorefASTVisitor::getOid(const clang::Decl *decl) const {
    if (decl == nullptr) {
        return -1L;
    }
    std::string signature = SignatureGenerator::generate(decl);
    return CorefUri::generateOId(_corefUri.getCorpus(), signature);
}

CorefOid CorefASTVisitor::getOid(const clang::Type *type) const {
    if (type == nullptr) {
        return -1L;
    }
    std::string signature = SignatureGenerator::generate(type, getContext());
    return CorefUri::generateOId(_corefUri.getCorpus(), signature);
}

CorefOid CorefASTVisitor::getOid(const clang::QualType *qualType) const {
    if (qualType == nullptr) {
        return -1L;
    }
    return getOid(qualType->getTypePtrOrNull());
}

CorefOid CorefASTVisitor::getOid(const clang::TypeLoc &typeLoc) const {
    std::string signature = SignatureGenerator::generate(typeLoc, getContext());
    return CorefUri::generateOId(_corefUri.getCorpus(), signature);
}

std::string CorefASTVisitor::astToString(const clang::Stmt *stmt) const {
    std::string outputStr;
    llvm::raw_string_ostream outputStream(outputStr);
    stmt->printPretty(outputStream, nullptr, getContext().getPrintingPolicy(), 0);
    return outputStr;
}

std::string CorefASTVisitor::astToString(const clang::Decl *decl) const {
    std::string outputStr;
    llvm::raw_string_ostream outputStream(outputStr);
    decl->print(outputStream, 0);
    return outputStr;
}

std::string CorefASTVisitor::astToString(const clang::Type *type) const {
    return SignatureGenerator::generate(type, getContext());
}

std::string CorefASTVisitor::astToString(const clang::QualType *qualType) const {
    return SignatureGenerator::generate(qualType, getContext());
}

Location CorefASTVisitor::getLocation(const clang::SourceRange &sourceRange) const {
    int startLineNumber =
        getContext().getSourceManager().getPresumedLineNumber(sourceRange.getBegin());
    int startColumnNumber =
        getContext().getSourceManager().getPresumedColumnNumber(sourceRange.getBegin());

    int endLineNumber = getContext().getSourceManager().getPresumedLineNumber(sourceRange.getEnd());
    int endColumnNumber =
        getContext().getSourceManager().getPresumedColumnNumber(sourceRange.getEnd());

    std::string signature =
        SignatureGenerator::generateLocationSignature(_context.getSourceManager(), sourceRange);

    // TODO location oid is the same as the node's oid for now, should improve it
    auto oid = CorefUri::generateOId(_corefUri.getCorpus(), signature);

    return Location{oid,           _fileOid,       startLineNumber, startColumnNumber,
                    endLineNumber, endColumnNumber};
}

CorefOid CorefASTVisitor::getLocationOid(const CorefOid nodeOid,
                                         const clang::SourceRange sourceRange) {
    if (_locationMap.find(nodeOid) != _locationMap.end())
        return _locationMap[nodeOid];
    auto loc = getLocation(sourceRange);
    coref::StorageFacade::insertClassObj(loc);
    _locationMap[nodeOid] = loc.oid;
    return loc.oid;
}

/// Visit Statement Nodes
/// the parent node of a stmt could be stmt or decl.
/// _parentMap is used to record order index.
/// \param stmt
/// \return
bool CorefASTVisitor::VisitStmt(const clang::Stmt *stmt) {
    const auto stmtOid = getOid(stmt);
    auto parentOid = getParentOid(*stmt);
    int indexOrder = 0;
    if (parentOid > 0) {
        if (_parentMap.count(parentOid) > 0) {
            indexOrder = _parentMap[parentOid];
            indexOrder++;
            _parentMap[parentOid] = indexOrder;
        } else {
            _parentMap.insert({parentOid, indexOrder});
        }
    }

    coref::StorageFacade::insertClassObj(Statement{stmtOid, parentOid, indexOrder,
                                                   getLocationOid(stmtOid, stmt->getSourceRange()),
                                                   stmt->getStmtClassName(), astToString(stmt)});
    return true;
}

/// Declaration Statement - local variable decl
/// \param stmt
/// \return
bool CorefASTVisitor::VisitDeclStmt(const clang::DeclStmt *stmt) {
    coref::StorageFacade::insertClassObj(DeclarationStatement{getOid(stmt)});
    return true;
}

bool CorefASTVisitor::VisitIfStmt(const clang::IfStmt *stmt) {
    IfStatement stmtModel{getOid(stmt), getOid(stmt->getCond()), getOid(stmt->getThen())};
    if (stmt->getElse() != nullptr) {
        ElseStatementInIf elseStmtModel{getOid(stmt->getElse()), getOid(stmt)};
        coref::StorageFacade::insertClassObj(std::move(elseStmtModel));
    }
    coref::StorageFacade::insertClassObj(std::move(stmtModel));
    return true;
}

bool CorefASTVisitor::VisitSwitchStmt(const clang::SwitchStmt *stmt) {
    coref::SwitchStatement stmtModel{getOid(stmt), getOid(stmt->getCond()),
                                     getOid(stmt->getSwitchCaseList())};

    // Cases are not stored in order, sort them first.
    // (In fact they seem to be stored in reverse order, don't rely on this)
    std::vector<const clang::SwitchCase *> cases;
    for (const clang::SwitchCase *_case = stmt->getSwitchCaseList(); _case;
         _case = _case->getNextSwitchCase())
        cases.push_back(_case);

    const clang::SwitchCase *nextCase;
    for (auto reverseIt = cases.rbegin(); reverseIt != cases.rend(); ++reverseIt) {
        nextCase = reverseIt + 1 == cases.rend() ? nullptr : *(reverseIt + 1);
        coref::SwitchCase switchCaseModel{getOid(*reverseIt), getOid((*reverseIt)->getSubStmt()),
                                          getOid(nextCase),
                                          llvm::isa<clang::DefaultStmt>(*reverseIt)};
        coref::StorageFacade::insertClassObj(std::move(switchCaseModel));
    }

    coref::StorageFacade::insertClassObj(std::move(stmtModel));
    return true;
}

bool CorefASTVisitor::VisitWhileStmt(const clang::WhileStmt *stmt) {
    coref::WhileStatement stmtModel{getOid(stmt), getOid(stmt->getCond()), getOid(stmt->getBody())};

    coref::StorageFacade::insertClassObj(std::move(stmtModel));
    return true;
}

bool CorefASTVisitor::VisitDoStmt(const clang::DoStmt *stmt) {
    coref::DoStatement stmtModel{getOid(stmt), getOid(stmt->getCond()), getOid(stmt->getBody())};

    coref::StorageFacade::insertClassObj(std::move(stmtModel));
    return true;
}

bool CorefASTVisitor::VisitForStmt(const clang::ForStmt *stmt) {
    coref::ForStatement stmtModel{getOid(stmt), getOid(stmt->getInit()), getOid(stmt->getBody()),
                                  getOid(stmt->getCond()), getOid(stmt->getInc())};

    coref::StorageFacade::insertClassObj(std::move(stmtModel));
    return true;
}

bool CorefASTVisitor::VisitObjCForCollectionStmt(const clang::ObjCForCollectionStmt *stmt) {
    coref::ObjCForCollectionStatement stmtModel{getOid(stmt), getOid(stmt->getElement()),
                                                getOid(stmt->getCollection()),
                                                getOid(stmt->getBody())};
    coref::StorageFacade::insertClassObj(std::move(stmtModel));
    return true;
}

bool CorefASTVisitor::VisitCXXForRangeStmt(const clang::CXXForRangeStmt *stmt) {
    coref::CxxForRangeStatement stmtModel{getOid(stmt), getOid(stmt->getBody()),
                                          getOid(stmt->getLoopVariable()),
                                          getOid(stmt->getRangeInit())};

    coref::StorageFacade::insertClassObj(std::move(stmtModel));
    return true;
}

bool CorefASTVisitor::VisitValueStmt(const clang::ValueStmt *stmt) {
    coref::ValueStatement stmtModel{getOid(stmt)};

    coref::StorageFacade::insertClassObj(std::move(stmtModel));
    return true;
}

bool CorefASTVisitor::VisitExpr(const clang::Expr *stmt) {
    coref::Expression stmtModel{getOid(stmt)};

    coref::StorageFacade::insertClassObj(std::move(stmtModel));
    return true;
}

bool CorefASTVisitor::VisitObjCPropertyRefExpr(const clang::ObjCPropertyRefExpr *stmt) {
    if (stmt->isExplicitProperty()) {
        traverseDeclIfNotVisited((clang::Decl *)stmt->getExplicitProperty());
        coref::ObjCPropertyRefExpression refExpr{getOid(stmt), stmt->isMessagingGetter(),
                                                 getOid(stmt->getExplicitProperty())};
        coref::StorageFacade::insertClassObj(std::move(refExpr));
    }
    return true;
}

bool CorefASTVisitor::VisitObjCIvarRefExpr(const clang::ObjCIvarRefExpr *stmt) {
    traverseDeclIfNotVisited((clang::Decl *)stmt->getDecl());
    coref::ObjCInstanceVariableRefExpression refExpr{getOid(stmt), getOid(stmt->getDecl())};
    coref::StorageFacade::insertClassObj(std::move(refExpr));
    return true;
}

bool CorefASTVisitor::VisitObjCStringLiteral(const clang::ObjCStringLiteral *stmt) {
    coref::ObjCStringLiteral stmtModel{getOid(stmt)};

    coref::StorageFacade::insertClassObj(std::move(stmtModel));
    return true;
}

bool CorefASTVisitor::VisitConditionalOperator(const clang::ConditionalOperator *stmt) {
    coref::ConditionalOperatorExpression stmtModel{
        getOid(stmt), getOid(stmt->getCond()), getOid(stmt->getTrueExpr()),
        getOid(stmt->getFalseExpr()),
        false // todo: tbd
    };

    coref::StorageFacade::insertClassObj(std::move(stmtModel));
    return true;
}

bool CorefASTVisitor::getDeclName(std::string *result, clang::NamedDecl *decl) {
    sbrella::c7::NameGenerator gen(decl, *result);
    gen.Visit(decl);
    return not gen.hasError();
}

bool CorefASTVisitor::VisitDecl(const clang::Decl *decl) {
    const auto declOid = getOid(decl);
    auto parentOid = getParentOid(*decl);
    int indexOrder = 0;
    if (parentOid > 0) {
        if (_parentMap.count(parentOid) > 0) {
            indexOrder = _parentMap[parentOid];
            indexOrder++;
            _parentMap[parentOid] = indexOrder;
        } else {
            _parentMap.insert({parentOid, indexOrder});
        }
    }
    coref::StorageFacade::insertClassObj(
        Declaration{declOid, parentOid, indexOrder, getLocationOid(declOid, decl->getSourceRange()),
                    decl->getDeclKindName(), astToString(decl)});
    return true;
}

bool CorefASTVisitor::VisitVarDecl(const clang::VarDecl *decl) {
    VariableDeclaration declModel{getOid(decl)};

    coref::StorageFacade::insertClassObj(std::move(declModel));
    return true;
}

bool CorefASTVisitor::VisitNamedDecl(const clang::NamedDecl *decl) {
    NamedDeclaration declModel{getOid(decl), decl->getQualifiedNameAsString()};

    coref::StorageFacade::insertClassObj(std::move(declModel));

    std::string symbolName;
    if (getDeclName(&symbolName, const_cast<clang::NamedDecl *>(decl))) {
        SymbolTable symbolTable{
            getOid(decl),
            symbolName,
        };
        coref::StorageFacade::insertClassObj(std::move(symbolTable));
    }
    return true;
}

bool CorefASTVisitor::VisitObjCContainerDecl(const clang::ObjCContainerDecl *decl) {
    ObjCContainerDeclaration declModel{getOid(decl), decl->clang::Decl::getDeclKindName(),
                                       // todo: declarationContextOid ?
                                       -1L};

    coref::StorageFacade::insertClassObj(std::move(declModel));
    return true;
}

bool CorefASTVisitor::VisitObjCCategoryDecl(const clang::ObjCCategoryDecl *decl) {
    auto categoryDeclOid = getOid(decl);
    auto categoryName =
        llvm::formatv("{0}({1})", decl->getClassInterface()->getName(), decl->getName()).str();

    traverseDeclIfNotVisited((clang::Decl *)decl->getClassInterface());
    ObjCCategoryDeclaration declModel{
        categoryDeclOid, getOid(decl->getClassInterface()), decl->IsClassExtension(),
        categoryName // category display name.
    };
    coref::StorageFacade::insertClassObj(std::move(declModel));

    // like an interface, it has own protocols.
    for (auto &protocolDecl : decl->protocols()) {
        traverseDeclIfNotVisited((clang::Decl *)protocolDecl);
        auto protocolOid = getOid(protocolDecl);
        coref::StorageFacade::insertClassObj(ObjCCategoryProtocolBinding{
            categoryDeclOid,
            protocolOid,
        });
        coref::StorageFacade::insertClassObj(ClassHierarchy{categoryDeclOid, protocolOid});
    }
    return true;
}

/// Visit ObjCInterfaceDecl nodes
/// 1. a new entry to ObjCInterfaceDeclaration table
/// 2. if this interface has super interface, add hierarchy information to
/// ClassHierarchy table
/// 3. if this interface supports any protocol, add hierarchy information to
/// ClassHierarchy table
///    and add interface&protocol binding to ObjCInterfaceProtocolBinding table.
/// \param decl
/// \return
bool CorefASTVisitor::VisitObjCInterfaceDecl(const clang::ObjCInterfaceDecl *decl) {
    auto interfaceOid = getOid(decl);
    auto *superDecl = decl->getSuperClass();
    auto superInterfaceOid = getOid(superDecl);

    traverseDeclIfNotVisited((clang::Decl *)superDecl);
    coref::StorageFacade::insertClassObj(ObjCInterfaceDeclaration{
        interfaceOid, superInterfaceOid, decl->isThisDeclarationADefinition()});
    if (superDecl != nullptr) {
        coref::StorageFacade::insertClassObj(ClassHierarchy{interfaceOid, superInterfaceOid});
    }

    // handling interface and corresponding protocols' bindings.
    for (auto &protocolDecl : decl->protocols()) {
        traverseDeclIfNotVisited((clang::Decl *)protocolDecl);
        auto protocolOid = getOid(protocolDecl);
        coref::StorageFacade::insertClassObj(ObjCInterfaceProtocolBinding{
            interfaceOid,
            protocolOid,
        });
        coref::StorageFacade::insertClassObj(ClassHierarchy{interfaceOid, protocolOid});
    }
    return true;
}

bool CorefASTVisitor::VisitObjCProtocolDecl(const clang::ObjCProtocolDecl *decl) {
    ObjCProtocolDeclaration declModel{getOid(decl), decl->isThisDeclarationADefinition()};

    coref::StorageFacade::insertClassObj(std::move(declModel));
    return true;
}

bool CorefASTVisitor::VisitObjCMessageExpr(const clang::ObjCMessageExpr *stmt) {
    std::string receiverKind;

    switch (stmt->getReceiverKind()) {
    case clang::ObjCMessageExpr::Instance:
        receiverKind = "instance";
        break;
    case clang::ObjCMessageExpr::Class:
        receiverKind = "class";
        break;
    case clang::ObjCMessageExpr::SuperClass:
        receiverKind = "super_class";
        break;
    case clang::ObjCMessageExpr::SuperInstance:
        receiverKind = "super_instance";
        break;
    }

    auto receiverType = stmt->getReceiverType();

    traverseDeclIfNotVisited((clang::Decl *)stmt->getReceiverInterface());
    traverseDeclIfNotVisited((clang::Decl *)stmt->getMethodDecl());

    auto stmtOid = getOid(stmt);
    coref::ObjCMessageExpression stmtModel{stmtOid, receiverKind, getOid(&receiverType),
                                           getOid(stmt->getReceiverInterface()),
                                           getOid(stmt->getMethodDecl())};

    for (const auto *arg : stmt->arguments()) {
        coref::ObjCMessageExpressionArguments argExpr{getOid(arg), stmtOid};
        coref::StorageFacade::insertClassObj(std::move(argExpr));
    }

    coref::StorageFacade::insertClassObj(std::move(stmtModel));
    return true;
}

bool CorefASTVisitor::VisitObjCMethodDecl(const clang::ObjCMethodDecl *decl) {
    const auto *const containerDecl = clang::dyn_cast_or_null<clang::Decl>(decl->getDeclContext());
    auto returnType = decl->getReturnType();
    coref::StorageFacade::insertClassObj(
        ObjCMethodDeclaration{getOid(decl), getOid(containerDecl), getOid(&returnType),
                              decl->isThisDeclarationADefinition()});

    for (auto *parmVarDecl : decl->parameters()) {
        auto qualType = parmVarDecl->getType();
        coref::StorageFacade::insertClassObj(
            ParamVariableDeclaration{getOid(parmVarDecl), getOid(decl), getOid(&qualType)});
    }

    generateCallableEnclosingStatement(decl->getBody(), getOid(decl));
    return true;
}

bool CorefASTVisitor::VisitBlockDecl(const clang::BlockDecl *decl) {
    coref::StorageFacade::insertClassObj(BlockDeclaration{getOid(decl)});

    for (auto *parmVarDecl : decl->parameters()) {
        auto qualType = parmVarDecl->getType();
        coref::StorageFacade::insertClassObj(
            ParamVariableDeclaration{getOid(parmVarDecl), getOid(decl), getOid(&qualType)});
    }

    generateCallableEnclosingStatement(decl->getBody(), getOid(decl));
    return true;
}

bool CorefASTVisitor::VisitBlockExpr(const clang::BlockExpr *expr) {
    coref::StorageFacade::insertClassObj(
        BlockExpression{getOid(expr), getOid(expr->getBlockDecl())});

    return true;
}

bool CorefASTVisitor::VisitObjCPropertyDecl(const clang::ObjCPropertyDecl *decl) {
    std::string propertyControl;
    switch (decl->getPropertyImplementation()) {
    case clang::ObjCPropertyDecl::PropertyControl::None:
        propertyControl = "none";
        break;
    case clang::ObjCPropertyDecl::PropertyControl::Required:
        propertyControl = "required";
        break;
    case clang::ObjCPropertyDecl::PropertyControl::Optional:
        propertyControl = "optional";
        break;
    }

    std::string setterKind;
    switch (decl->getSetterKind()) {
    case clang::ObjCPropertyDecl::SetterKind::Assign:
        setterKind = "assign";
        break;
    case clang::ObjCPropertyDecl::SetterKind::Retain:
        setterKind = "retain";
        break;
    case clang::ObjCPropertyDecl::SetterKind::Copy:
        setterKind = "copy";
        break;
    case clang::ObjCPropertyDecl::SetterKind::Weak:
        setterKind = "weak";
        break;
    }
    const auto *const containerDecl = clang::dyn_cast_or_null<clang::Decl>(decl->getDeclContext());
    auto qualType = decl->getType();
    ObjCPropertyDeclaration declModel{getOid(decl), getOid(&qualType), getOid(containerDecl),
                                      propertyControl, setterKind};

    coref::StorageFacade::insertClassObj(std::move(declModel));
    return true;
}

bool CorefASTVisitor::VisitObjCImplDecl(const clang::ObjCImplDecl *decl) {
    auto kind = decl->getKind();
    if (kind != clang::Decl::Kind::ObjCImplementation &&
        kind != clang::Decl::Kind::ObjCCategoryImpl) {
        llvm::errs() << "unknown ObjCImplDecl type :" << kind << "\n";
        return true;
    }
    bool isCategory = (kind == clang::Decl::Kind::ObjCCategoryImpl);
    coref::StorageFacade::insertClassObj(ObjCImplementationDeclaration{getOid(decl), isCategory});
    return true;
}

bool CorefASTVisitor::VisitRecordDecl(const clang::RecordDecl *decl) {
    coref::StorageFacade::insertClassObj(RecordDeclaration{
        getOid(decl),
    });

    // Extracting info of CXXRecordDecl
    if (const auto *cxxRecordDecl = clang::dyn_cast_or_null<clang::CXXRecordDecl>(decl)) {
        coref::StorageFacade::insertClassObj(CxxRecordDeclaration{getOid(cxxRecordDecl)});
        // Forward declaration doesn't have base class
        if (decl->isThisDeclarationADefinition()) {
            // Extracting info of bases classes of a CXXRecordDecl
            for (const auto &base : cxxRecordDecl->bases()) {
                if (auto *baseCxxRecordDecl = base.getType()->getAsCXXRecordDecl()) {
                    traverseDeclIfNotVisited((clang::Decl *)baseCxxRecordDecl);
                    coref::StorageFacade::insertClassObj(
                        ClassHierarchy{getOid(decl), getOid(baseCxxRecordDecl)});
                }
            }
        }
    }

    return true;
}

bool CorefASTVisitor::VisitCallExpr(const clang::CallExpr *expr) {
    traverseDeclIfNotVisited((clang::Decl *)expr->getCalleeDecl());
    coref::StorageFacade::insertClassObj(
        CallExpression{getOid(expr), getOid(expr->getCalleeDecl())});

    for (const auto *arg : expr->arguments()) {
        coref::StorageFacade::insertClassObj(CallExpressionArguments{getOid(arg), getOid(expr)});
    }
    return true;
}

bool CorefASTVisitor::VisitCXXMemberCallExpr(const clang::CXXMemberCallExpr *expr) {
    auto type = expr->getObjectType();
    traverseDeclIfNotVisited((clang::Decl *)expr->getRecordDecl());
    traverseDeclIfNotVisited((clang::Decl *)expr->getMethodDecl());
    coref::StorageFacade::insertClassObj(CxxMemberCallExpression{
        getOid(expr), getOid(&type), getOid(expr->getMethodDecl()), getOid(expr->getRecordDecl())});
    return true;
}

bool CorefASTVisitor::VisitCXXMethodDecl(const clang::CXXMethodDecl *decl) {
    coref::StorageFacade::insertClassObj(
        CxxMethodDeclaration{getOid(decl), getOid(decl->getParent())});
    return true;
}

bool CorefASTVisitor::VisitDeclaratorDecl(const clang::DeclaratorDecl *decl) {
    coref::StorageFacade::insertClassObj(DeclaratorDeclaration{getOid(decl)});
    return true;
}

bool CorefASTVisitor::VisitFieldDecl(const clang::FieldDecl *decl) {
    // Exclude those nodes that are ObjCPropertyDecl
    if (const clang::RecordDecl *recordDecl = decl->getParent()) {
        auto fieldType = decl->getType();
        coref::StorageFacade::insertClassObj(FieldDeclaration{
            getOid(decl->getCanonicalDecl()), getOid(&fieldType), getOid(recordDecl)});
    }

    return true;
}

bool CorefASTVisitor::VisitObjCIvarDecl(const clang::ObjCIvarDecl *decl) {
    traverseDeclIfNotVisited((clang::Decl *)decl->getContainingInterface());
    coref::ObjCInstanceVariableDeclaration iVarDeclaration{getOid(decl),
                                                           getOid(decl->getContainingInterface())};
    coref::StorageFacade::insertClassObj(std::move(iVarDeclaration));
    return true;
}

bool CorefASTVisitor::VisitFunctionDecl(const clang::FunctionDecl *decl) {
    auto returnType = decl->getReturnType();
    coref::StorageFacade::insertClassObj(FunctionDeclaration{getOid(decl), getOid(&returnType),
                                                             decl->isThisDeclarationADefinition()});

    for (auto *parmVarDecl : decl->parameters()) {
        auto qualType = parmVarDecl->getType();
        coref::StorageFacade::insertClassObj(
            ParamVariableDeclaration{getOid(parmVarDecl), getOid(decl), getOid(&qualType)});
    }

    generateCallableEnclosingStatement(decl->getBody(), getOid(decl));
    return true;
}

bool CorefASTVisitor::VisitValueDecl(const clang::ValueDecl *decl) {
    coref::StorageFacade::insertClassObj(ValueDeclaration{getOid(decl)});
    return true;
}

bool CorefASTVisitor::VisitObjCObjectType(const clang::ObjCObjectType *type) {
    ObjCObjectType typeModel{getOid(type), getOid(type->getInterface())};

    coref::StorageFacade::insertClassObj(std::move(typeModel));
    return true;
}

bool CorefASTVisitor::VisitType(const clang::Type *type) {
    if (type->isAnyPointerType()) {
        auto pointee = type->getPointeeType();
        PointerType model{getOid(type), getOid(&pointee)};
        coref::StorageFacade::insertClassObj(std::move(model));
    }

    Type typeModel{getOid(type), type->getTypeClassName(), astToString(type)};

    coref::StorageFacade::insertClassObj(std::move(typeModel));
    return true;
}

bool CorefASTVisitor::VisitTagType(const clang::TagType *type) {
    TagType typeModel{getOid(type), getOid(type->getDecl())};

    coref::StorageFacade::insertClassObj(std::move(typeModel));
    return true;
}

bool CorefASTVisitor::VisitTypeLoc(const clang::TypeLoc typeLoc) {
    // todo : impl
    return true;
}

bool CorefASTVisitor::VisitTypeDecl(const clang::TypeDecl *decl) {
    const auto qualType = getContext().getTypeDeclType(decl);

    TypeDeclaration declModel{getOid(decl), getOid(&qualType), astToString(decl)};

    coref::StorageFacade::insertClassObj(std::move(declModel));
    return true;
}

bool CorefASTVisitor::VisitTagDecl(const clang::TagDecl *decl) {
    std::string tagKind;
    switch (decl->getTagKind()) {
    case clang::TagTypeKind::TTK_Class:
        tagKind = "class";
        break;
    case clang::TagTypeKind::TTK_Enum:
        tagKind = "enum";
        break;
    case clang::TagTypeKind::TTK_Interface:
        tagKind = "interface";
        break;
    case clang::TagTypeKind::TTK_Struct:
        tagKind = "struct";
        break;
    case clang::TagTypeKind::TTK_Union:
        tagKind = "union";
        break;
    }

    TagDeclaration declModel{
        getOid(decl),
        tagKind,
        decl->isThisDeclarationADefinition(),
    };

    coref::StorageFacade::insertClassObj(std::move(declModel));
    return true;
}

void CorefASTVisitor::generateCallableEnclosingStatement(const clang::Stmt *stmt,
                                                         CorefOid callableOid) {
    if (stmt != nullptr) {
        for (const auto *child : stmt->children()) {
            if (const auto *s = clang::dyn_cast_or_null<clang::Stmt>(child)) {
                coref::StorageFacade::insertClassObj(
                    CallableEnclosingStatement{getOid(s), callableOid});
            }
            generateCallableEnclosingStatement(child, callableOid);
        }
    }
}

/**
 * Traverse Declarations that have not been visited yet.
 * These declarations mostly were defined in header files that have been filtered out by
 * customer. As they were referred by other nodes, e.g. "ObjcMessageExpr", "CxxCallExpression",
 * we manually trigger a visit for the node to get the symbol information.
 *
 * @param decl
 */
void CorefASTVisitor::traverseDeclIfNotVisited(clang::Decl *decl) {
    auto &sourceMngr = _context.getSourceManager();
    if (decl == nullptr || !decl->getLocation().isValid() ||
        sourceMngr.isInSystemHeader(decl->getLocation()) ||
        sourceMngr.isInSystemMacro(decl->getLocation()) ||
        coref::StorageFacade::checkDeclOidExist(getOid(decl))) {
        return;
    }

    llvm::StringRef absolutePath = sourceMngr.getFilename(decl->getLocation());
    if (absolutePath.empty()) {
        return;
    }
    llvm::StringRef relativePath;
    getRootRelativePath(absolutePath, relativePath);

    auto fileOid = CorefUri::generateFileOId(_corefUri.getCorpus(), std::string(relativePath));
    if (_newVisitFileMap.find(fileOid) == _newVisitFileMap.end()) {
        File file{fileOid, std::string(relativePath),
                  std::string(sys::path::extension(relativePath)),
                  std::string(sys::path::filename(relativePath)), _programOid};
        _newVisitFileMap.insert({fileOid, std::move(file)});
    }
    sbrella::c7::Switcher<CorefOid> sw(_fileOid, fileOid);
    TraverseDecl(decl);
}
