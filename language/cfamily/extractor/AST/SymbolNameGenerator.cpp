// Based on https://code.alipay.com/codeinsight_thirdparty/index7
// Copyright (C), 2016-present, Sourcebrella, Inc Ltd - All rights reserved.
// Unauthorized copying, using, modifying of this file, via any medium is
// strictly prohibited.
// Proprietary and confidential.
//
// Author: Kai Luo<luokai@sbrella.com>
// File Description:
// Creation Date: 2018-05-30
// Modification History: Created.
// clang-format off
#include "SymbolNameGenerator.hpp"
#include "Coref/Utils/Switcher.h"

#include "clang/AST/ASTContext.h"
#include "clang/AST/DeclVisitor.h"
#include "clang/Basic/FileManager.h"
#include "clang/Basic/SourceManager.h"
#include "llvm/Support/raw_ostream.h"
#include "llvm/Support/Path.h"

#include "ThirdParty/digestpp/digestpp.hpp"

#include <string>
#include <unordered_map>
#include <fstream>

namespace sbrella {
namespace c7 {

class NameGeneratorImpl : public clang::DeclVisitor<NameGeneratorImpl> {
public:
    std::string symbol_name;

    NameGeneratorImpl(clang::NamedDecl *originalDecl, std::string &output);

    bool HasError() const { return has_error_; }

    void VisitDeclContext(clang::DeclContext *context);

    void VisitNamespaceDecl(clang::NamespaceDecl *decl);

    void VisitClassTemplateSpecializationDecl(clang::ClassTemplateSpecializationDecl *decl);

    void VisitTagDecl(clang::TagDecl *decl);

    void VisitVarDecl(clang::VarDecl *decl);

    void VisitFunctionDecl(clang::FunctionDecl *decl);

    void VisitNamedDecl(clang::NamedDecl *decl);

    void VisitFunctionTemplateDecl(clang::FunctionTemplateDecl *decl);

    void VisitTemplateTypeParmDecl(clang::TemplateTypeParmDecl *decl);
    void VisitNonTypeTemplateParmDecl(clang::NonTypeTemplateParmDecl *decl);
    void VisitTemplateTemplateParmDecl(clang::TemplateTemplateParmDecl *decl);

    // Objective-C
    void VisitObjCContainerDecl(clang::ObjCContainerDecl *decl);
    void VisitObjCMethodDecl(clang::ObjCMethodDecl *decl);

    static std::string GetFileHashId(const std::string &s);

private:
    void outputSeparator();
    void outputFunctionIdentifier(clang::DeclarationName name);
    void _pVisitFunction_base(clang::FunctionDecl *decl, clang::FunctionTemplateDecl *ftdecl = nullptr);
    void _pGenTemplateDeclSymbol(clang::TemplateDecl *decl, const clang::PrintingPolicy &policy, bool with_space_suffix = true);
    template <typename _tTemplateParameterDecl>
    void _pGenTemplateParameterDecl(_tTemplateParameterDecl *decl);

    void _pGenTemplateArgumentName(const clang::TemplateArgument &arg, const clang::PrintingPolicy &policy);
    void _pGenTemplateNameName(const clang::TemplateName &tn, const clang::PrintingPolicy &policy);
    void _pGenTemplateDeclNameForTemplateName(clang::TemplateDecl *td, const clang::PrintingPolicy &policy);
    void _pGenQualTypeName(const clang::QualType &qt, const clang::PrintingPolicy &policy);

    void _pGenFileLocationPrefix(const clang::Decl *decl);
    void _pGenPrefixWithSymbolName(const char *typeprefix = nullptr);
    void _pGenPrefixWithSymbolName(const clang::NamedDecl *decl);

    static std::string _pGetUnnamedDeclName(clang::NamedDecl *nd);

private:
    clang::NamedDecl *original_decl_;
    llvm::raw_string_ostream out_stream_;
    bool has_error_ = false;
    bool ignore_context_prefix_ = false;
    bool need_separator_ = false;
    bool need_file_prefix_ = false;
    bool need_offset_prefix_ = false;
    bool in_decl_context_ = false;
    bool gen_template_parameter_name_ = true;
    bool has_generated_filelocation_prefix = false;
    static std::unordered_map<std::string, std::string> m_FileHashMap;
};

NameGeneratorImpl::NameGeneratorImpl(clang::NamedDecl *originalDecl, std::string &output)
    : original_decl_(originalDecl), out_stream_(output) {}

void NameGeneratorImpl::outputSeparator() {
    if (!need_separator_)
        return;
    out_stream_ << "::";
    need_separator_ = false;
}

void NameGeneratorImpl::_pGenFileLocationPrefix(const clang::Decl *decl) {
    // The symbol has internal linkage, so prepend a filename to the symbol
    // name to help disambiguate it from symbols in other files with the same
    // name.  It's common to define something with internal linkage in a header
    // file that's shared between many translation units in a program (e.g.
    // static functions, constant variables), so use the name of the file
    // containing the declaration rather than the name of the translation unit.
    // Use just the basename to keep the symbol name short.
    if (has_generated_filelocation_prefix || !(need_file_prefix_ || need_offset_prefix_))
        return;

    const clang::Decl *define_decl = nullptr;
    if (clang::isa<clang::FunctionDecl>(decl)) {
        auto *fd = clang::dyn_cast<clang::FunctionDecl>(decl);
        if (fd->getStorageClass() == clang::SC_Static) {
            const clang::FunctionDecl *define;
            if (fd->hasBody(define)) {
                define_decl = define;
            }
        }
    }
    else if (clang::isa<clang::VarDecl>(decl)) {
        auto *vd = clang::dyn_cast<clang::VarDecl>(decl);
        if (vd->getStorageClass() == clang::SC_Static) {
            const clang::VarDecl *define = vd->getActingDefinition();
            if (define) {
                define_decl = define;
            }
        }
    }
    if (define_decl)
        decl = define_decl;
    else if (const clang::Decl *canonicalDecl = decl->getCanonicalDecl())
        decl = canonicalDecl;
    clang::SourceManager &sourceManager = decl->getASTContext().getSourceManager();
    clang::SourceLocation sloc = sourceManager.getSpellingLoc(decl->getLocation());
    if (sloc.isValid()) {
        clang::FileID fileID = sourceManager.getFileID(sloc);
        if (!fileID.isInvalid()) {
            if (auto fileEntry = sourceManager.getFileEntryForID(fileID)) {
                std::string filename = llvm::sys::path::filename(fileEntry->getName()).str();
                out_stream_ << filename;
                out_stream_ << '@' << GetFileHashId(fileEntry->getName().str());
                if (need_offset_prefix_)
                    out_stream_ << '@' << sourceManager.getFileOffset(sloc);
                out_stream_ << '/';
            }
        }
    }

    has_generated_filelocation_prefix = true;
}

void NameGeneratorImpl::_pGenPrefixWithSymbolName(const clang::NamedDecl *decl) {
    const char *typeprefix = nullptr;
    if (decl) {
        if (auto tdecl = llvm::dyn_cast_or_null<clang::TagDecl>(decl)) {
            if (tdecl->isClass())
                typeprefix = "class";
            else if (tdecl->isStruct())
                typeprefix = "struct";
            else if (tdecl->isEnum())
                typeprefix = "enum";
            else if (tdecl->isUnion())
                typeprefix = "union";
        }
        else if (llvm::isa<clang::TypedefDecl>(decl))
            typeprefix = "typedef";
        else if (llvm::isa<clang::TypeAliasDecl>(decl))
            typeprefix = "typealias";
        else if (llvm::isa<clang::ObjCPropertyDecl>(decl))
            typeprefix = "property";
        else if (llvm::isa<clang::FieldDecl>(decl))
            typeprefix = "field";
        else if (llvm::isa<clang::EnumConstantDecl>(decl))
            typeprefix = "enumfield";
        else if (llvm::isa<clang::ClassTemplateDecl>(decl))
            typeprefix = "class";
        else if (llvm::isa<clang::TypeAliasTemplateDecl>(decl))
            typeprefix = "typealias";
        else if (llvm::isa<clang::LabelDecl>(decl))
            typeprefix = "label";
        else if (llvm::isa<clang::NamespaceAliasDecl>(decl))
            typeprefix = "namespacealias";
        else if (llvm::isa<clang::UnresolvedUsingValueDecl>(decl))
            typeprefix = nullptr;
        else if (llvm::isa<clang::UnresolvedUsingTypenameDecl>(decl))
            typeprefix = nullptr;
        else if (auto containerDecl = llvm::dyn_cast_or_null<clang::ObjCContainerDecl>(decl)) {
            if (containerDecl->getDeclKind() == clang::Decl::ObjCProtocol)
                typeprefix = "obj_c_protocol";
            else
                typeprefix = "obj_c_class";
        }
//    else
//      std::cerr << decl->getDeclKindName() << " " << symbol_name << " "
//      << decl->getSourceRange().getBegin().printToString(decl->getASTContext().getSourceManager()) << std::endl;
    }
    _pGenPrefixWithSymbolName(typeprefix);
}

void NameGeneratorImpl::_pGenPrefixWithSymbolName(const char *typeprefix) {
    if (typeprefix) {
        out_stream_ << '$' << typeprefix << '$';
    }
    out_stream_ << symbol_name;
}

void NameGeneratorImpl::VisitDeclContext(clang::DeclContext *context) {
    if (ignore_context_prefix_)
        return;

    if (auto decl = llvm::dyn_cast_or_null<clang::NamedDecl>(context)) {
        if (auto funcDecl = llvm::dyn_cast_or_null<clang::FunctionDecl>(decl)) {
            if (funcDecl->isThisDeclarationADefinition()) {
                // For declarations inside a function body, prefix both a
                // filename and a file offset.
                need_offset_prefix_ = true;
            }
        }
        Switcher<bool> sw1(in_decl_context_, true);
        Visit(decl);
        return;
    }

    _pGenFileLocationPrefix(original_decl_);
}

void NameGeneratorImpl::VisitNamespaceDecl(clang::NamespaceDecl *decl) {
    if (decl->isAnonymousNamespace()) {
        need_file_prefix_ = true;
    }
    VisitDeclContext(decl->getDeclContext());
    outputSeparator();
    need_separator_ = true;

    clang::IdentifierInfo *II = decl->getIdentifier();
    if (II)  // Simple name.
        symbol_name = II->getName();
    else
        symbol_name = "<anon>";

    _pGenPrefixWithSymbolName("namespace");
}

void NameGeneratorImpl::VisitClassTemplateSpecializationDecl(clang::ClassTemplateSpecializationDecl *decl) {
    VisitTagDecl(decl);

    // Only add template arguments for explicit specializations, not for
    // instantiations.  This loop will skip over implicit instantiations of
    // partial specializations.  (e.g. It will turn
    // std::vector<bool, std::allocator<bool>> into
    // std::vector<bool, type-parameter-0-0>).
    while (decl->getSpecializationKind() != clang::TSK_ExplicitSpecialization) {
        if (auto partialSpec = decl->getInstantiatedFrom().dyn_cast<clang::ClassTemplatePartialSpecializationDecl *>()) {
            decl = partialSpec;
        }
        else {
            return;
        }
    }

    out_stream_ << '<';
    const clang::TemplateArgumentList &args = decl->getTemplateArgs();
    for (unsigned i = 0, iEnd = args.size(); i != iEnd; ++i) {
        if (i != 0)
            out_stream_ << ", ";
        _pGenTemplateArgumentName(args[i], decl->getASTContext().getPrintingPolicy());
    }
    out_stream_ << '>';
}

void NameGeneratorImpl::VisitTagDecl(clang::TagDecl *decl) {
//  // Leave the enum name out of the symbol names of the enumerators.
//  if (in_decl_context_ && decl->isEnum())
//    return;

    // For "typedef struct { ... } S", refer to the struct using S.
    clang::NamedDecl *namedDecl = decl;
    clang::TypedefNameDecl *anonDecl = decl->getTypedefNameForAnonDecl();
    if (anonDecl != nullptr)
        namedDecl = anonDecl;
    clang::IdentifierInfo *identifier = namedDecl->getIdentifier();

    if (!identifier) {
        need_file_prefix_ = true;
    }
    VisitDeclContext(decl->getDeclContext());

    outputSeparator();

    if (identifier) {
        symbol_name = identifier->getName();
    } else {
        symbol_name = _pGetUnnamedDeclName(decl);
    }
    _pGenPrefixWithSymbolName(namedDecl);
    need_separator_ = true;
}

void NameGeneratorImpl::VisitVarDecl(clang::VarDecl *decl) {
//  if (!decl->isExternC() && !decl->hasExternalStorage())
    if (!decl->hasExternalFormalLinkage())
        need_file_prefix_ = true;
    VisitDeclContext(decl->getDeclContext());

    outputSeparator();
    clang::IdentifierInfo *identifier = decl->getIdentifier();
    if (identifier) { // Simple name.
        symbol_name = identifier->getName();
    }
    else {
        symbol_name = _pGetUnnamedDeclName(decl);
    }
    _pGenPrefixWithSymbolName("var");
    need_separator_ = true;
}

// Write the name of the function to the output.  Do not write any qualifiers
// or template parameters/arguments (i.e. no colons and no brackets).
void NameGeneratorImpl::outputFunctionIdentifier(clang::DeclarationName name) {
    // DeclarationName::printName includes template parameters for the
    // constructors and destructors of template classes.  Omit these by digging
    // into the name for the InjectedClassName type.
    clang::DeclarationName::NameKind nameKind = name.getNameKind();
    if (nameKind == clang::DeclarationName::CXXConstructorName ||
        nameKind == clang::DeclarationName::CXXDestructorName) {
        const clang::Type *nameType = name.getCXXNameType().getTypePtr();
        assert(nameType != nullptr);
        const clang::InjectedClassNameType *injectedNameType =
                nameType->getAs<clang::InjectedClassNameType>();
        if (injectedNameType != nullptr) {
            if (nameKind == clang::DeclarationName::CXXDestructorName)
                out_stream_ << '~';
            out_stream_ << injectedNameType->getDecl()->getName();
            symbol_name = '~' +  injectedNameType->getDecl()->getName().str();
            return;
        }
    }
    symbol_name = name.getAsString();
    _pGenPrefixWithSymbolName("func");
}

void NameGeneratorImpl::_pVisitFunction_base(clang::FunctionDecl *decl, clang::FunctionTemplateDecl *ftdecl) {
    clang::PrintingPolicy policy = decl->getASTContext().getPrintingPolicy();
    policy.SuppressTagKeyword = true;
    bool isExternC = false;

    // When a function is only marked extern "C" in a header file but not in
    // the source file, there are two declarations, where only one
    // declaration's isExternC is true.  Use the isExternC flag on the
    // canonical declaration for consistency.
    if (clang::FunctionDecl *canonical = decl->getCanonicalDecl())
        isExternC = canonical->isExternC();

    // TODO: Review correctness for C code.
//  if (!isExternC && !decl->isInExternCContext() && !decl->isInExternCXXContext())
    if (!decl->hasExternalFormalLinkage())
        need_file_prefix_ = true;

    VisitDeclContext(decl->getDeclContext());
    outputSeparator();
    _pGenTemplateDeclSymbol(ftdecl, policy, true);
    outputFunctionIdentifier(decl->getDeclName());

    // Print the template arguments for template functions (not for
    // non-template methods of template classes), and for explicit
    // specializations only -- not for an instantiations of a template pattern.
    if (const clang::TemplateArgumentList *templateArgs =
            decl->getTemplateSpecializationArgs()) {
        out_stream_ << '<';
        for (unsigned int i = 0; i < templateArgs->size(); ++i) {
            if (i != 0)
                out_stream_ << ", ";
            templateArgs->get(i).print(policy, out_stream_, true);
        }
        out_stream_ << '>';
    }

    // For extern "C++" function declarations, include the parameter types in
    // the name.
    if (decl->getASTContext().getLangOpts().CPlusPlus && !isExternC) {
        out_stream_ << '(';
        bool firstParm = true;
        for (auto it = decl->param_begin(), itEnd = decl->param_end(); it != itEnd;
             ++it) {
            clang::ParmVarDecl *parm = *it;
            if (!firstParm)
                out_stream_ << ", ";
            clang::QualType parmType = parm->getType();
            parmType = parmType->getCanonicalTypeUnqualified();
            // NOTE: In one template tree, different level have different TemplateParameter depth.
            //  Code:
            //    template <typename T1> class A {
            //      template <typename T2> class B {
            //        void func(T1 a, T2 b);
            //      };
            //    };
            // gen:  A::B::func(TP(0,0), TP(1,0))
            _pGenQualTypeName(parmType, policy);
            firstParm = false;
        }
        if (decl->isVariadic()) {
            if (decl->param_size() > 0)
                out_stream_ << ", ";
            out_stream_ << "...";
        }
        out_stream_ << ')';

        // C++ method type qualifiers.
        if (auto method = llvm::dyn_cast<clang::CXXMethodDecl>(decl)) {
            auto quals = method->getMethodQualifiers();
            if (quals.hasConst())
                out_stream_ << " const";
            if (quals.hasRestrict())
                out_stream_ << " restrict";
            if (quals.hasVolatile())
                out_stream_ << " volatile";
        }
    }
    else {
       out_stream_ << "(*)";
    }
    need_separator_ = true;
}

void NameGeneratorImpl::_pGenTemplateDeclSymbol(clang::TemplateDecl *decl, const clang::PrintingPolicy &policy, bool with_space_suffix) {
    // Example: template <typename, class, int, template <typename> class, typename...>
    if (decl && decl->getTemplateParameters()) {
        llvm::ArrayRef<clang::NamedDecl*> parameters = decl->getTemplateParameters()->asArray();
        out_stream_ << "template <";
        for (unsigned int i = 0; i < parameters.size(); ++i) {
            if (i != 0)
                out_stream_ << ", ";
            const auto &parameter = parameters.data()[i];
            if (llvm::isa<clang::NonTypeTemplateParmDecl>(parameter)) {
                const auto &pdecl = *llvm::dyn_cast<clang::NonTypeTemplateParmDecl>(parameter);
                pdecl.getType().print(out_stream_, policy);
                if (pdecl.isParameterPack()) {
                    out_stream_ << "...";
                }
            }
            else if (llvm::isa<clang::TemplateTypeParmDecl>(parameter)) {
                const auto &pdecl = *llvm::dyn_cast<clang::TemplateTypeParmDecl>(parameter);
                out_stream_ << (pdecl.wasDeclaredWithTypename() ? "typename" : "class");
                if (pdecl.isParameterPack()) {
                    out_stream_ << "...";
                }
            }
            else if (llvm::isa<clang::TemplateTemplateParmDecl>(parameter)) {
                _pGenTemplateDeclSymbol(llvm::dyn_cast<clang::TemplateDecl>(parameter), policy, false);
            }
        }
        out_stream_ << ">";
        if (with_space_suffix)
            out_stream_ << " ";
    }
}

static llvm::PointerUnion<clang::FunctionDecl*, clang::FunctionTemplateDecl*> getFunctionTemplateDecl(clang::FunctionDecl *decl) {
    if (decl->getDescribedFunctionTemplate()) {  //  TODO: handle more
        return decl->getDescribedFunctionTemplate();
    }
    else if (decl->getTemplateInstantiationPattern()) {
        return getFunctionTemplateDecl(decl->getTemplateInstantiationPattern());
    }
    else {
        return decl;
    }
}

static llvm::PointerUnion<clang::CXXRecordDecl*, clang::ClassTemplateDecl*, clang::ClassTemplatePartialSpecializationDecl*>
getClassTemplateDecl(clang::CXXRecordDecl *decl) {
    if (decl->getDescribedClassTemplate()) {  //  TODO: handle more
        return decl->getDescribedClassTemplate();
    }
    else if (decl->getTemplateInstantiationPattern()) {
        return getClassTemplateDecl(decl->getTemplateInstantiationPattern());
    }
    else if (llvm::isa<clang::ClassTemplatePartialSpecializationDecl>(decl)) {
        return llvm::dyn_cast<clang::ClassTemplatePartialSpecializationDecl>(decl);
    }
    else {
        return decl;
    }
}

static void* getPointer(const clang::TemplateParameter &tp) {
    if (tp.is<clang::TemplateTypeParmDecl*>()) {
        return tp.get<clang::TemplateTypeParmDecl*>();
    }
    else if (tp.is<clang::NonTypeTemplateParmDecl*>()) {
        return tp.get<clang::NonTypeTemplateParmDecl*>();
    }
    else if (tp.is<clang::TemplateTemplateParmDecl*>()) {
        return tp.get<clang::TemplateTemplateParmDecl*>();
    }
    return nullptr;
}

struct TemplateParameterDepthIndex {
    unsigned int Depth;
    unsigned int Index;
};

static TemplateParameterDepthIndex getDepthIndex(const clang::TemplateParameter &tp) {
    if (tp.is<clang::TemplateTypeParmDecl*>()) {
        auto p = tp.get<clang::TemplateTypeParmDecl*>();
        return { .Depth = p->getDepth(), .Index = p->getIndex() };
    }
    else if (tp.is<clang::NonTypeTemplateParmDecl*>()) {
        auto p = tp.get<clang::NonTypeTemplateParmDecl*>();
        return { .Depth = p->getDepth(), .Index = p->getIndex() };
    }
    else if (tp.is<clang::TemplateTemplateParmDecl*>()) {
        auto p = tp.get<clang::TemplateTemplateParmDecl*>();
        return { .Depth = p->getDepth(), .Index = p->getIndex() };
    }
    return { .Depth = unsigned(-1), .Index = unsigned(-1) };
}

static clang::TemplateParameter getTemplateParameter(clang::NamedDecl *decl) {
    if (llvm::isa<clang::TemplateTypeParmDecl>(decl)) {
        return llvm::dyn_cast<clang::TemplateTypeParmDecl>(decl);
    }
    else if (llvm::isa<clang::NonTypeTemplateParmDecl>(decl)) {
        return llvm::dyn_cast<clang::NonTypeTemplateParmDecl>(decl);
    }
    else if (llvm::isa<clang::TemplateTemplateParmDecl>(decl)) {
        return llvm::dyn_cast<clang::TemplateTemplateParmDecl>(decl);
    }
    clang::TemplateParameter tp;
    return tp;
}

void NameGeneratorImpl::VisitFunctionDecl(clang::FunctionDecl *decl) {
    auto fdecl = getFunctionTemplateDecl(decl);
    if (fdecl.is<clang::FunctionDecl*>()) {
        _pVisitFunction_base(fdecl.get<clang::FunctionDecl*>());
    }
    else {
        VisitFunctionTemplateDecl(fdecl.get<clang::FunctionTemplateDecl*>());
    }
}

void NameGeneratorImpl::VisitFunctionTemplateDecl(clang::FunctionTemplateDecl *decl) {
    _pVisitFunction_base(decl->getTemplatedDecl(), decl);
}

// GetTemplateParameterDeclName

static std::string GetTemplateParameterDeclName(const TemplateParameterDepthIndex &depth_index) {
    // TemplateParameter name: "TP(depth,index)"
    //   NOTE: Change TP(x,y) to type-parameter-x-y, if there is TP(x,y) in comments, it is it.
    return "type-parameter-" + std::to_string(depth_index.Depth) + "-" + std::to_string(depth_index.Index) + "";
}

static std::string GetTemplateParameterDeclName(const clang::TemplateParameter &tp) {
    TemplateParameterDepthIndex depth_index = getDepthIndex(tp);
    return GetTemplateParameterDeclName(depth_index);
}

// GetTemplateParameterLevelPath

static bool findTemplateParameterLevelListBase(void *ptr, std::list<clang::TemplateParameter> &result, clang::TemplateParameterList *list) {
    if (!list)
        return false;
    for (unsigned int i = 0; i != list->size(); ++i) {
        clang::NamedDecl *nd = list->getParam(i);
        clang::TemplateParameter td = getTemplateParameter(nd);
        if (td.isNull())
            continue;
        result.push_back(td);
        if (nd == ptr)
            return true;
        if (td.is<clang::TemplateTemplateParmDecl*>()) {
            if (findTemplateParameterLevelListBase(ptr, result, td.get<clang::TemplateTemplateParmDecl *>()->getTemplateParameters()))
                return true;
        }
        result.pop_back();
    }
    return false;
}

static std::list<clang::TemplateParameter> findTemplateParameterLevelList(const clang::TemplateParameter &tp, clang::TemplateParameterList *list) {
    // Search one template parameters list to find a TemplateParameter, return the path of level.
    std::list<clang::TemplateParameter> result;
    findTemplateParameterLevelListBase(getPointer(tp), result, list);
    return result;
}

static std::list<clang::TemplateParameter> findTemplateParameterLevelList(const clang::TemplateParameter &tp, clang::TemplateDecl *context) {
    // Search one template parameters list to find a TemplateParameter, return the path of level.
    return findTemplateParameterLevelList(tp, context->getTemplateParameters());
}

template <typename _tTemplateParameterDecl, typename _tDeclWithDecls>
static std::pair<clang::TemplateDecl*, std::list<clang::TemplateParameter>>
searchDeclInDeclRange(_tTemplateParameterDecl *decl, const _tDeclWithDecls *decl_find_root) {
    // Search one decls list to find 'decl', return the path of level.
    // DeclRange: the sub nodes (decls) of one decl.
    const clang::DeclContext::decl_range &range = decl_find_root->decls();
    for (auto d : range) {
        // TypeAliasTemplateDecl
        if (llvm::isa<clang::TypeAliasTemplateDecl>(d)) {
            auto result = findTemplateParameterLevelList(decl, llvm::dyn_cast<clang::TypeAliasTemplateDecl>(d));
            if (!result.empty()) {
                return std::make_pair(llvm::dyn_cast<clang::TypeAliasTemplateDecl>(d), std::move(result));
            }
        }
        else if (llvm::isa<clang::VarTemplateDecl>(d)) {
            auto result = findTemplateParameterLevelList(decl, llvm::dyn_cast<clang::VarTemplateDecl>(d));
            if (!result.empty()) {
                return std::make_pair(llvm::dyn_cast<clang::VarTemplateDecl>(d), std::move(result));
            }
        }
            // NOTE:  VarTemplateDecl in namespace 's context is not namespace at clang 3.6.
        else if (llvm::isa<clang::NamespaceDecl>(d)) {
            auto result = searchDeclInDeclRange(decl, llvm::dyn_cast<clang::NamespaceDecl>(d));
            if (result.first) {
                return result;
            }
        }
            // NOTE:  VarTemplateDecl in cxxrecord 's context is not cxxrecord at clang 3.6.
        else if (llvm::isa<clang::CXXRecordDecl>(d)) {
            auto result = searchDeclInDeclRange(decl, llvm::dyn_cast<clang::CXXRecordDecl>(d));
            if (result.first) {
                return result;
            }
        }
    }
    return std::make_pair(nullptr, std::list<clang::TemplateParameter>());
}

template <typename _tTemplateParameterDecl>
static std::pair<clang::NamedDecl*, std::list<clang::TemplateParameter>> GetTemplateParameterLevelPath(_tTemplateParameterDecl *decl) {
    // Get Template Parameter Level Path
    // Example:
    //    template <template <typename T> class S> class C
    // Return:
    //    result.first  : The root decl of the path, the decl 'C'.
    //    result.second : The path, '{ C::TP(0,0), C::TP(0,0)::TP(1,0) }'.
    clang::DeclContext *declc = decl->getDeclContext();
    if (llvm::isa<clang::TranslationUnitDecl>(declc)) {
        auto tud = llvm::dyn_cast<clang::TranslationUnitDecl>(declc);
        auto result = searchDeclInDeclRange(decl, tud);
        if (result.first)
            return result;
    }
    else if (llvm::isa<clang::NamespaceDecl>(declc)) {
        auto tud = llvm::dyn_cast<clang::NamespaceDecl>(declc);
        auto result = searchDeclInDeclRange(decl, tud);
        if (result.first)
            return result;
    }
    else if (llvm::isa<clang::FunctionDecl>(declc)) {
        auto fd = llvm::dyn_cast<clang::FunctionDecl>(declc);
        llvm::PointerUnion<clang::FunctionDecl*, clang::FunctionTemplateDecl*> ftdp = getFunctionTemplateDecl(fd);
        if (ftdp.is<clang::FunctionTemplateDecl*>()) {
            auto ftd = ftdp.get<clang::FunctionTemplateDecl*>();
            auto result = findTemplateParameterLevelList(decl, ftd);
            if (!result.empty())
                return std::make_pair(ftd, std::move(result));
        }
        // If not found
        auto result = searchDeclInDeclRange(decl, fd);
        if (result.first)
            return result;
    }
    else if (llvm::isa<clang::CXXRecordDecl>(declc)) {
        auto crd = llvm::dyn_cast<clang::CXXRecordDecl>(declc);
        llvm::PointerUnion<clang::CXXRecordDecl*, clang::ClassTemplateDecl*, clang::ClassTemplatePartialSpecializationDecl*>
                ctdp = getClassTemplateDecl(crd);
        if (ctdp.is<clang::ClassTemplateDecl*>()) {
            auto ctd = ctdp.get<clang::ClassTemplateDecl*>();
            auto result = findTemplateParameterLevelList(decl, ctd);
            if (!result.empty())
                return std::make_pair(ctd, std::move(result));
        }
        else if (ctdp.is<clang::ClassTemplatePartialSpecializationDecl*>()){
            auto ctsd = ctdp.get<clang::ClassTemplatePartialSpecializationDecl*>();
            auto result = findTemplateParameterLevelList(decl, ctsd->getTemplateParameters());
            if (!result.empty())
                return std::make_pair(ctsd, std::move(result));
        }
        // If not found
        auto result = searchDeclInDeclRange(decl, crd);
        if (result.first)
            return result;
    }
    return std::make_pair(nullptr, std::list<clang::TemplateParameter>());
}

template <typename _tTemplateParameterDecl>
void NameGeneratorImpl::_pGenTemplateParameterDecl(_tTemplateParameterDecl *decl) {
    VisitDeclContext(decl->getDeclContext());
    outputSeparator();
    if (!decl->getName().empty()) {
        symbol_name = decl->getName();
    }
    else {
        symbol_name = _pGetUnnamedDeclName(decl);
    }
    // Get Prefix
    clang::NamedDecl* td;
    std::list<clang::TemplateParameter> list;
    std::tie(td, list) = GetTemplateParameterLevelPath(decl);
    // If there is template parameter level path
    if (td) {
        if (llvm::isa<clang::TypeAliasTemplateDecl>(td)) {
            td->printName(out_stream_);
            out_stream_ << "::";
        }
        else if (llvm::isa<clang::VarTemplateDecl>(td)) {
            Switcher<std::string> sw(symbol_name);
            Switcher<bool> sw2(need_separator_, false);
            Visit(td);
            out_stream_ << "::";
        }
        bool output_separator = false;
        for (const auto &p : list) {
            if (output_separator)
                out_stream_ << "::";
            if (gen_template_parameter_name_) {
                clang::IdentifierInfo *identifier = nullptr;
                clang::NamedDecl *pd = nullptr;
                if (p.is<clang::TemplateTypeParmDecl*>()) {
                    pd = p.get<clang::TemplateTypeParmDecl*>();
                    identifier = pd->getIdentifier();
                }
                else if (p.is<clang::TemplateTemplateParmDecl*>()) {
                    pd = p.get<clang::TemplateTemplateParmDecl*>();
                    identifier = pd->getIdentifier();
                }
                else if (p.is<clang::NonTypeTemplateParmDecl*>()) {
                    pd = p.get<clang::NonTypeTemplateParmDecl*>();
                    identifier = pd->getIdentifier();
                }
                if (identifier) {
                    out_stream_ << identifier->getName();
                }
                else {
                    out_stream_ << _pGetUnnamedDeclName(pd);
                }
            }
            else {
                out_stream_ << GetTemplateParameterDeclName(p);
            }
            output_separator = true;
        }
    }
    else {
        _pGenPrefixWithSymbolName();
    }
}

void NameGeneratorImpl::VisitTemplateTypeParmDecl(clang::TemplateTypeParmDecl *decl) {
    _pGenTemplateParameterDecl(decl);
}
void NameGeneratorImpl::VisitNonTypeTemplateParmDecl(clang::NonTypeTemplateParmDecl *decl) {
    _pGenTemplateParameterDecl(decl);
}
void NameGeneratorImpl::VisitTemplateTemplateParmDecl(clang::TemplateTemplateParmDecl *decl) {
    _pGenTemplateParameterDecl(decl);
}

void NameGeneratorImpl::VisitObjCContainerDecl(clang::ObjCContainerDecl *decl) {
    clang::NamedDecl *namedDecl = decl;
    clang::IdentifierInfo *identifier = namedDecl->getIdentifier();

    if (!identifier) {
        need_file_prefix_ = true;
    }
    VisitDeclContext(decl->getDeclContext());

    outputSeparator();

    if (identifier) {
        symbol_name = identifier->getName();
    } else {
        symbol_name = _pGetUnnamedDeclName(decl);
    }
    _pGenPrefixWithSymbolName(namedDecl);
    need_separator_ = true;
}

void NameGeneratorImpl::VisitObjCMethodDecl(clang::ObjCMethodDecl *decl) {
    clang::PrintingPolicy policy = decl->getASTContext().getPrintingPolicy();
    policy.SuppressTagKeyword = true;
    bool isExternC = false;

    // When a function is only marked extern "C" in a header file but not in
    // the source file, there are two declarations, where only one
    // declaration's isExternC is true.  Use the isExternC flag on the
    // canonical declaration for consistency.
    if (clang::ObjCMethodDecl *canonical = decl->getCanonicalDecl())
        isExternC = canonical->isExternCContext();

    if (!decl->hasExternalFormalLinkage())
        need_file_prefix_ = true;

    VisitDeclContext(decl->getDeclContext());
    outputSeparator();
    outputFunctionIdentifier(decl->getDeclName());

    // For extern "C++" function declarations, include the parameter types in
    // the name.
    if (decl->getASTContext().getLangOpts().ObjC && !isExternC) {
        out_stream_ << '(';
        bool firstParm = true;
        for (auto it = decl->param_begin(), itEnd = decl->param_end(); it != itEnd;
             ++it) {
            clang::ParmVarDecl *parm = *it;
            if (!firstParm)
                out_stream_ << ", ";
            clang::QualType parmType = parm->getType();
            parmType = parmType->getCanonicalTypeUnqualified();
            _pGenQualTypeName(parmType, policy);
            firstParm = false;
        }
        if (decl->isVariadic()) {
            if (decl->param_size() > 0)
                out_stream_ << ", ";
            out_stream_ << "...";
        }
        out_stream_ << ')';
    }
    else {
        out_stream_ << "(*)";
    }
    need_separator_ = true;
}

void NameGeneratorImpl::_pGenQualTypeName(const clang::QualType &qt, const clang::PrintingPolicy &policy) {
    // * gen QualType
    // TemplateTypeParmType
    //   <typename T> : T : TP(0,0)
    if (llvm::isa<clang::TemplateTypeParmType>(qt)) {
        auto t = llvm::cast<clang::TemplateTypeParmType>(qt);
        out_stream_ << GetTemplateParameterDeclName({ .Depth = t->getDepth(), .Index = t->getIndex() });
    }
        // TemplateSpecializationType
        //   <typename T> : A<T> : A<TP(0,0))>
        //   <template <typename> class S> : S<int> : TP(0,0)<int>
        //   <template <typename> class S, typename T> : S<T> : TP(0,0)<TP(0,1)>
    else if (llvm::isa<clang::TemplateSpecializationType>(qt)) {
        auto t = llvm::cast<clang::TemplateSpecializationType>(qt);
        _pGenTemplateNameName(t->getTemplateName(), policy);
        out_stream_ << "<";
        for (unsigned int i = 0; i < t->getNumArgs(); i++) {
            if (i != 0)
                out_stream_ << ", ";
            _pGenTemplateArgumentName(t->getArg(i), policy);
        }
        out_stream_ << ">";
    }
    else {
        out_stream_ << qt.getAsString(policy);
    }
}

void NameGeneratorImpl::_pGenTemplateDeclNameForTemplateName(clang::TemplateDecl *td, const clang::PrintingPolicy &policy) {
    if (td) {
        // TemplateTemplateParmDecl
        //   <template <typename T> class S> : S : TP(0,0)
        if (llvm::isa<clang::TemplateTemplateParmDecl>(td)) {
            out_stream_ << GetTemplateParameterDeclName(llvm::cast<clang::TemplateTemplateParmDecl>(td));
        }
        // TemplateDecl
        //   template <typename T> class C : C : C
        else if (llvm::isa<clang::TemplateDecl>(td)) {
            Switcher<std::string> sw(symbol_name);
            Switcher<bool> sw2(need_separator_, false);
            Switcher<bool> sw3(gen_template_parameter_name_, false);
            Visit(td);
        }
    }
}

void NameGeneratorImpl::_pGenTemplateNameName(const clang::TemplateName &tn, const clang::PrintingPolicy &policy) {
    switch (tn.getKind()) {
        case clang::TemplateName::Template:
        case clang::TemplateName::QualifiedTemplate:
            // Template or QualifiedTemplate (QualifiedTemplate is like: A::C)
            //   template <typanem T> class C; : C : C
            //   <template <typename> class S> : S : TP(0,0)
            _pGenTemplateDeclNameForTemplateName(tn.getAsTemplateDecl(), policy);
            break;
            // TODO: More cases to deal with.
//  case clang::TemplateName::OverloadedTemplate:
//    break;
//  case clang::TemplateName::DependentTemplate:
//    break;
//  case clang::TemplateName::SubstTemplateTemplateParm:
//    break;
//  case clang::TemplateName::SubstTemplateTemplateParmPack:
//    break;
        default:
            tn.print(out_stream_, policy);
    }
}

void NameGeneratorImpl::_pGenTemplateArgumentName(const clang::TemplateArgument &arg, const clang::PrintingPolicy &policy) {
    // * gen TemplateArgument
    switch (arg.getKind()) {
        case clang::TemplateArgument::ArgKind::Type:
            // QualType
            _pGenQualTypeName(arg.getAsType(), policy);
            break;
        case clang::TemplateArgument::ArgKind::Template:
            // Template
            //   template <typanem T> class C; : C : C
            //   <template <typename> class S> : S : TP(0,0)
            _pGenTemplateNameName(arg.getAsTemplate(), policy);
            break;
        case clang::TemplateArgument::ArgKind::Expression:
            // Expression
            //   <int N> : N : TP(0,0)
            //   NOTE: 'non-type template argument depends on a template parameter of the partial specialization' is error.
            if (arg.getAsExpr()->getStmtClass() == clang::Stmt::StmtClass::DeclRefExprClass) {
                auto drexpr = llvm::dyn_cast<clang::DeclRefExpr>(arg.getAsExpr());
                if (drexpr->getDecl()) {
                    Switcher<std::string> sw(symbol_name);
                    Switcher<bool> sw2(need_separator_, false);
                    Switcher<bool> sw3(ignore_context_prefix_, true);
                    Switcher<bool> sw4(gen_template_parameter_name_, false);
                    Visit(drexpr->getDecl());
                }
            }
            else {
                arg.print(policy, out_stream_, true);
            }
            break;
            // TODO: More cases to deal with.
//  case clang::TemplateArgument::ArgKind::TemplateExpansion:
//    break;
//  case clang::TemplateArgument::ArgKind::Pack:
//    break;
        default:
            arg.print(policy, out_stream_, true);
            break;
    }
}

std::string NameGeneratorImpl::_pGetUnnamedDeclName(clang::NamedDecl *nd) {
    return "<unnamed@" + std::to_string(nd->getASTContext().getSourceManager().getFileOffset(nd->getLocation())) + ">";
}

std::unordered_map<std::string, std::string> NameGeneratorImpl::m_FileHashMap;
std::string NameGeneratorImpl::GetFileHashId(const std::string &s) {
    auto _value = m_FileHashMap.find(s);
    if (_value != m_FileHashMap.end())
        return _value->second;

    std::ifstream file(s, std::ios::in | std::ios::binary);
    auto hash_value = digestpp::md5().absorb(file).hexdigest();
    m_FileHashMap[s] = hash_value;
    return hash_value;
}

// Handle the remaining kinds of named decls that weren't handled above.
void NameGeneratorImpl::VisitNamedDecl(clang::NamedDecl *decl) {
    VisitDeclContext(decl->getDeclContext());
    outputSeparator();
    clang::IdentifierInfo *identifier = decl->getIdentifier();
    if (identifier) {
        symbol_name = "";
        llvm::raw_string_ostream raw_str(symbol_name);
        decl->printName(raw_str);
    }
    else {
        symbol_name = _pGetUnnamedDeclName(decl);
    }
    _pGenPrefixWithSymbolName(decl);
    need_separator_ = true;
}

//---------------------------------------
// * NameGenerator
//---------------------------------------

NameGenerator::NameGenerator(clang::NamedDecl *originalDecl, std::string &output)
        : _impl(new NameGeneratorImpl(originalDecl, output)) {}

NameGenerator::~NameGenerator() = default;

void NameGenerator::Visit(clang::NamedDecl *decl) const {
    _impl->Visit(decl);
}

bool NameGenerator::hasError() const {
    return _impl->HasError();
}

const std::string& NameGenerator::getSymbolName() const {
    return _impl->symbol_name;
}

} // namespace c7
} // namespace sbrella
// clang-format on
