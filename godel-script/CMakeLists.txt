cmake_minimum_required(VERSION 3.1)

project("GodelScript" VERSION 0.1 DESCRIPTION "GodelScript compiler")

set(CMAKE_C_FLAGS_DEBUG "${CMAKE_C_FLAGS_DEBUG} -O0")
set(CMAKE_CXX_FLAGS_DEBUG "${CMAKE_CXX_FLAGS_DEBUG} -O0")

set(CMAKE_CXX_STANDARD 17)
set(CMAKE_CXX_STANDARD_REQUIRED True)

if(UNIX AND NOT APPLE)
    set(LINUX TRUE)
endif()

set(GODEL_FRONTEND_HDR_FILES
        godel-frontend/src/cli.h
        godel-frontend/src/engine.h
        godel-frontend/src/lexer.h
        godel-frontend/src/parse.h
        godel-frontend/src/semantic.h
        godel-frontend/src/symbol.h
        godel-frontend/src/ir/aggregator_inline_remark.h
        godel-frontend/src/ir/call_graph.h
        godel-frontend/src/ir/flatten_block.h
        godel-frontend/src/ir/ir_gen.h
        godel-frontend/src/ir/ir_context.h
        godel-frontend/src/ir/lir.h
        godel-frontend/src/ir/inst_combine.h
        godel-frontend/src/ir/name_mangling.h
        godel-frontend/src/ir/pass.h
        godel-frontend/src/ir/pass_manager.h
        godel-frontend/src/ir/remove_unused.h
        godel-frontend/src/ir/reorder.h
        godel-frontend/src/error/error.h
        godel-frontend/src/ast/ast_node.h
        godel-frontend/src/ast/ast_root.h
        godel-frontend/src/ast/ast_visitor.h
        godel-frontend/src/ast/decl.h
        godel-frontend/src/ast/expr.h
        godel-frontend/src/ast/stmt.h
        godel-frontend/src/ast/ast_dumper.h
        godel-frontend/src/ast/template_extractor.h
        godel-frontend/src/sema/ungrounded_checker.h
        godel-frontend/src/sema/fact_statement_checker.h
        godel-frontend/src/sema/self_reference_check.h
        godel-frontend/src/sema/context.h
        godel-frontend/src/sema/global_symbol_loader.h
        godel-frontend/src/sema/symbol_import.h
        godel-frontend/src/sema/data_structure_construct.h
        godel-frontend/src/sema/inherit_schema.h
        godel-frontend/src/sema/function_declaration.h
        godel-frontend/src/sema/annotation_checker.h
        godel-frontend/src/util/util.h
        godel-frontend/src/package/package.h
        godel-frontend/src/package/module_tree.h)

set(GODEL_FRONTEND_SRC_FILES
        godel-frontend/src/cli.cpp
        godel-frontend/src/engine.cpp
        godel-frontend/src/lexer.cpp
        godel-frontend/src/parse.cpp
        godel-frontend/src/semantic.cpp
        godel-frontend/src/symbol.cpp
        godel-frontend/src/ir/aggregator_inline_remark.cpp
        godel-frontend/src/ir/call_graph.cpp
        godel-frontend/src/ir/flatten_block.cpp
        godel-frontend/src/ir/ir_gen.cpp
        godel-frontend/src/ir/ir_context.cpp
        godel-frontend/src/ir/lir.cpp
        godel-frontend/src/ir/inst_combine.cpp
        godel-frontend/src/ir/name_mangling.cpp
        godel-frontend/src/ir/pass.cpp
        godel-frontend/src/ir/pass_manager.cpp
        godel-frontend/src/ir/remove_unused.cpp
        godel-frontend/src/ir/reorder.cpp
        godel-frontend/src/error/error.cpp
        godel-frontend/src/ast/ast_visitor.cpp
        godel-frontend/src/ast/ast_root.cpp
        godel-frontend/src/ast/decl.cpp
        godel-frontend/src/ast/expr.cpp
        godel-frontend/src/ast/stmt.cpp
        godel-frontend/src/ast/ast_dumper.cpp
        godel-frontend/src/ast/template_extractor.cpp
        godel-frontend/src/sema/ungrounded_checker.cpp
        godel-frontend/src/sema/fact_statement_checker.cpp
        godel-frontend/src/sema/self_reference_check.cpp
        godel-frontend/src/sema/context.cpp
        godel-frontend/src/sema/global_symbol_loader.cpp
        godel-frontend/src/sema/symbol_import.cpp
        godel-frontend/src/sema/data_structure_construct.cpp
        godel-frontend/src/sema/inherit_schema.cpp
        godel-frontend/src/sema/function_declaration.cpp
        godel-frontend/src/sema/annotation_checker.cpp
        godel-frontend/src/util/util.cpp
        godel-frontend/src/package/package.cpp
        godel-frontend/src/package/module_tree.cpp)

execute_process(COMMAND mkdir -p install)
set(ENV{CC} cc)
set(ENV{CXX} c++)
# build bison
set(BISON_PKG bison-3.8.2)
execute_process(COMMAND tar -xf ${CMAKE_CURRENT_SOURCE_DIR}/godel-backend/tools/${BISON_PKG}.tar)
execute_process(COMMAND ./configure --prefix=${CMAKE_BINARY_DIR}/install WORKING_DIRECTORY ${CMAKE_BINARY_DIR}/${BISON_PKG})
execute_process(COMMAND make -j install WORKING_DIRECTORY ${CMAKE_BINARY_DIR}/${BISON_PKG})

# build flex
set(FLEX_PKG flex-2.6.4)
execute_process(COMMAND tar -xf ${CMAKE_CURRENT_SOURCE_DIR}/godel-backend/tools/${FLEX_PKG}.tar)
execute_process(COMMAND ./configure --prefix=${CMAKE_BINARY_DIR}/install WORKING_DIRECTORY ${CMAKE_BINARY_DIR}/${FLEX_PKG})
execute_process(COMMAND make -j install WORKING_DIRECTORY ${CMAKE_BINARY_DIR}/${FLEX_PKG})

# set variables for souffle target
set(FLEX_EXECUTABLE ${CMAKE_BINARY_DIR}/install/bin/flex)
set(BISON_EXECUTABLE ${CMAKE_BINARY_DIR}/install/bin/bison)

set(SOUFFLE_DOMAIN_64BIT ON)
set(SOUFFLE_USE_CURSES OFF)
set(SOUFFLE_ENABLE_TESTING OFF)

add_subdirectory(godel-backend/souffle)
add_subdirectory(godel-backend/extension)

add_library(godel-frontend STATIC
        ${GODEL_FRONTEND_SRC_FILES})

target_link_libraries(godel-frontend PUBLIC
        libsouffle souffle_ext)

target_include_directories(godel-frontend PUBLIC
        ${PROJECT_SOURCE_DIR})

# add binary target godel
add_executable(godel godel-frontend/src/main.cpp)
# avoid easylogging to generate myeasylog.log automatically
add_definitions(-DELPP_NO_DEFAULT_LOG_FILE)
# link static library
target_link_libraries(godel
        PRIVATE godel-frontend)
# link dynamic library
target_link_libraries(godel PUBLIC
        libsouffle-shared souffle_ext)

# add testing rule
enable_testing()
add_test(NAME godel-test
        COMMAND godel -p ${PROJECT_SOURCE_DIR}/godel-frontend/test/pkgtest ${PROJECT_SOURCE_DIR}/godel-frontend/test/pkgtest/a.gdl)
add_test(NAME gs_new-test
        COMMAND godel ${PROJECT_SOURCE_DIR}/godel-frontend/test/semantic/gs_new.gdl)
add_test(NAME fact-stmt-test
        COMMAND godel ${PROJECT_SOURCE_DIR}/godel-frontend/test/semantic/fact.gdl)
