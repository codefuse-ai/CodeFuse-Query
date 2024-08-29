
#define CATCH_CONFIG_MAIN

#include "Common.hpp"

using namespace std;
using namespace coref;

using HierarchyVec = vector<pair<const char *, const char *>>;
using ExpectObjcContainer = vector<pair<const char *, const char *>>;
using ExpectCxxRecordDeclaration = vector<const char *>;

void checkClassHierarchy(HierarchyVec &expected) {
    auto storage = coref::Storage::getInstance().getStorage();
    auto classHierarchy = storage->get_all<coref::ClassHierarchy>();
    REQUIRE(classHierarchy.size() == expected.size());
    int index = 0;
    for (auto &item : classHierarchy) {
        string className = coref::StorageFacade::getDeclNameByOid(item.childOid);
        string parentClassName = coref::StorageFacade::getDeclNameByOid(item.parentOid);
        std::cout << "Class " << className << " inherited from " << parentClassName << std::endl;
        CHECK(className == expected[index].first);
        CHECK(parentClassName == expected[index].second);
        ++index;
    }
}

void checkObjcContainer(ExpectObjcContainer &expectedContainers) {
    auto storage = Storage::getInstance().getStorage();
    for (auto &expectedContainer : expectedContainers) {
        auto containerDecls = storage->get_all<ObjCContainerDeclaration>();
        REQUIRE(containerDecls.size() == expectedContainers.size());
        bool checked = false;
        for (auto &item : containerDecls) {
            string containerName = coref::StorageFacade::getDeclNameByOid(item.oid);
            if (containerName == expectedContainer.first &&
                item.declarationKind == expectedContainer.second) {
                checked = true;
                if (item.declarationKind == "ObjCInterface") {
                    // check interface table
                    auto decl = storage->get_pointer<ObjCInterfaceDeclaration>(item.oid);
                    CHECK(decl != nullptr);
                } else if (item.declarationKind == "ObjCProtocol") {
                    // check protocol table
                    auto decl = storage->get_pointer<ObjCProtocolDeclaration>(item.oid);
                    CHECK(decl != nullptr);
                } else if (item.declarationKind == "ObjCImplementation" ||
                           item.declarationKind == "ObjCCategoryImpl") {
                    // check implementation & category impl table
                    auto decl = storage->get_pointer<ObjCImplementationDeclaration>(item.oid);
                    CHECK(decl != nullptr);
                } else if (item.declarationKind == "ObjCCategory") {
                    // check category table
                    auto decl = storage->get_pointer<ObjCCategoryDeclaration>(item.oid);
                    CHECK(decl != nullptr);
                } else {
                    CHECK(false);
                }
            }
        }
        CHECK(checked);
    }
}

void checkCxxRecordDeclaration(ExpectCxxRecordDeclaration &expectedCxxRecordDeclarations) {
    auto storage = Storage::getInstance().getStorage();
    auto actualDecls = storage->get_all<CxxRecordDeclaration>();
    vector<string> actualDeclNames;
    for (auto &item : actualDecls) {
        string className = coref::StorageFacade::getDeclNameByOid(item.oid);
        actualDeclNames.push_back(className);
    }

    REQUIRE(actualDeclNames.size() == expectedCxxRecordDeclarations.size());
    for (auto &expectedCxxRecordDeclaration : expectedCxxRecordDeclarations) {
        if (find(actualDeclNames.begin(), actualDeclNames.end(), expectedCxxRecordDeclaration) ==
            actualDeclNames.end()) {
            CHECK(false);
        }
    }
    CHECK(true);
}

TEST_CASE("Class check of cxx", "[cxx]") {
    setup();

    SECTION("class hierarchy check") {
        runClangTool(CLASS_SAMPLE_FILE);
        HierarchyVec expected{
            {"Fish", "Animal"}, {"Human", "Animal"}, {"Mermaid", "Fish"}, {"Mermaid", "Human"}};
        checkClassHierarchy(expected);

        ExpectCxxRecordDeclaration expectedCxxRecordDeclaration{
            "ForwardDeclarationClass", "Animal", "Animal", "Fish", "Human", "Mermaid"};
        checkCxxRecordDeclaration(expectedCxxRecordDeclaration);
    }

    SECTION("cxx class dependency check 1") { runClangTool(CLASS_SAMPLE_2_FILE); }
}



TEST_CASE("Class check of oc", "[oc]") {
    setup();

    SECTION("obj class hierarchy check") {
        runClangTool(OBJC_CLASS_SAMPLE_FILE, true);
        HierarchyVec expected{{"Person", "MyProtocol1"},
                              {"Employee", "Person"},
                              {"Employee", "MyProtocol2"},
                              {"Employee", "MyProtocol3"}};
        checkClassHierarchy(expected);

        ExpectObjcContainer expected2{{"MyProtocol1", "ObjCProtocol"},
                                      {"MyProtocol2", "ObjCProtocol"},
                                      {"MyProtocol3", "ObjCProtocol"},
                                      {"Person", "ObjCInterface"},
                                      {"Employee", "ObjCInterface"},
                                      {"Employee", "ObjCImplementation"},
                                      {"Employee", "ObjCImplementation"},
                                      {"Quit", "ObjCCategory"},
                                      {"Quit", "ObjCCategoryImpl"},
                                      {"ForwardDeclarationClass", "ObjCInterface"},
                                      {"ForwardDeclarationProtocol", "ObjCProtocol"},
                                      {"ForwardDeclarationProtocol", "ObjCProtocol"}};
        checkObjcContainer(expected2);
    }

    SECTION("obj class dependency check 1") { runClangTool(OBJC_CLASS_DEPEND_SAMPLE1, true); }
}