find_package(SQLite3 REQUIRED)

include_directories(ThirdParty)

set(CMAKE_CXX_FLAGS "${CMAKE_CXX_FLAGS} -Wall")
set(CMAKE_CXX_STANDARD 17)

add_definitions(-DTEST_FILES_DIR=${PROJECT_SOURCE_DIR}/Tests/Samples)

add_executable(unit_tests
        ../AST/CorefASTVisitor.cpp
        ../AST/CorefOptionsParser.cpp
        ../AST/SymbolNameGenerator.cpp
        ../AST/ASTUtil.cpp
        ../Coref/CorefUri.cpp
        ../Coref/SignatureGenerator.cpp
        ../Coref/Utils/Hash.cpp
        ../Model/Models.hpp
        ../Storage/StorageFacade.cpp
        Common.cpp
        IfStmtTest.cpp
        TypeTest.cpp
        ClassTest.cpp
        SymbolNameTest.cpp
        )

target_link_libraries(unit_tests PRIVATE LLVM clang-cpp ${SQLite3_LIBRARY})

if(APPLE)
    set(UNIT_TEST_COMMAND unit_tests -o TEST-catch2_junit_report.xml -r junit)
else()
    set(UNIT_TEST_COMMAND unit_tests -o TEST-catch2_junit_report.xml -r junit "[cxx]")
endif()

add_test(NAME "All_in_one_unit_test"
        COMMAND ${UNIT_TEST_COMMAND}
        WORKING_DIRECTORY ${CMAKE_CURRENT_BINARY_DIR})
