

#ifndef COREF_CFAMILY_SRC_EXTRACTOR_COMMON_HPP
#define COREF_CFAMILY_SRC_EXTRACTOR_COMMON_HPP

#include "Model/Models.hpp"
#include "Storage/StorageFacade.hpp"
#include "ThirdParty/catch2/catch.hpp"
#include <string>

// clang-format off
#define STR1(R) #R
#define STR2(R) STR1(R)
#define VNAME(value) value
#define ABS(FILE) STR2(VNAME(TEST_FILES_DIR)/FILE)

#define IF_STMT_SAMPLE_FILE         ABS(IfStmtSample.cpp)
#define IF_ELSE_STMT_SAMPLE_FILE    ABS(IfElseStmtSample.cpp)
#define TYPE_SAMPLE_FILE            ABS(TypeSample.cpp)
#define CLASS_SAMPLE_FILE           ABS(ClassSample.cpp)
#define CLASS_SAMPLE_2_FILE         ABS(ClassSample2.cpp)
#define OBJC_CLASS_SAMPLE_FILE      ABS(ObjCClassSample.m)
#define OBJC_CLASS_DEPEND_SAMPLE1   ABS(ObjCClassDependencySample1.m)
// clang-format on

bool readCppfile(const char *file, std::string &content);

void setup();
void runClangTool(const char *cppFile, bool isObjc = false);

#endif // COREF_CFAMILY_SRC_EXTRACTOR_COMMON_HPP
