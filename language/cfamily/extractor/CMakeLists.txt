cmake_minimum_required(VERSION 3.5)
project(coref-cfamily-src-extractor)

# Including custom cmake rules
include(Cmake/cxx-dev-tools.cmake)

# Search LLVM
find_package(LLVM 13 REQUIRED CONFIG
        HINTS "${LLVM_INSTALL_PREFIX}/lib/cmake/llvm")
find_package(Clang REQUIRED CONFIG
        HINTS "${LLVM_INSTALL_PREFIX}/lib/cmake/clang")

# Project
file(GLOB_RECURSE PROJECT_SOURCE_FILES
        RELATIVE "${PROJECT_SOURCE_DIR}" "Coref/Utils/*.cpp"
        RELATIVE "${PROJECT_SOURCE_DIR}" "Coref/*.cpp"
        RELATIVE "${PROJECT_SOURCE_DIR}" "AST/*.cpp"
)

include_directories(${LLVM_INCLUDE_DIRS})
include_directories(${CMAKE_HOME_DIRECTORY})
include_directories(ThirdParty)

find_package(SQLite3 REQUIRED)

set(CMAKE_CXX_FLAGS "${CMAKE_CXX_FLAGS} -Wall")
set(CMAKE_CXX_STANDARD 17)

add_subdirectory(Storage)

find_package(Python3 REQUIRED)
add_custom_command(
    OUTPUT
        ${CMAKE_CURRENT_SOURCE_DIR}/Storage/Storage.hpp
        ${CMAKE_CURRENT_SOURCE_DIR}/Model/Models.hpp
    COMMAND
        "${Python3_EXECUTABLE}" -m pip install -r ${CMAKE_CURRENT_SOURCE_DIR}/Tools/requirements.txt &&
        "${Python3_EXECUTABLE}" ${CMAKE_CURRENT_SOURCE_DIR}/Tools/generate_headers.py
    DEPENDS
        ${CMAKE_CURRENT_SOURCE_DIR}/coref_er_diagram.puml
        ${CMAKE_CURRENT_SOURCE_DIR}/Tools/generate_headers.py
        ${CMAKE_CURRENT_SOURCE_DIR}/Storage/Storage.hpp.j2
        ${CMAKE_CURRENT_SOURCE_DIR}/Model/Models.hpp.j2
    COMMENT "Generating files from jinja template for C++ model headers"
)

add_custom_target(
    generate_header ALL
    DEPENDS
        ${CMAKE_CURRENT_SOURCE_DIR}/Storage/Storage.hpp
        ${CMAKE_CURRENT_SOURCE_DIR}/Model/Models.hpp
)

# Tests
option(BUILD_TESTS "Build unit tests program" OFF)
if(BUILD_TESTS)
    enable_testing()
    add_subdirectory(Tests)
endif(BUILD_TESTS)

# Set Clang header files dir based on the llvm library dir
set(CLANG_HEADERS_DIR "${LLVM_LIBRARY_DIR}/clang/${LLVM_VERSION}/include")
# Output the executable to bin directory so it can search header files in ../lib/clang
set(CMAKE_RUNTIME_OUTPUT_DIRECTORY ${CMAKE_BINARY_DIR}/bin)
# Copy Clang header files dir based on the binary of this tool
file(COPY ${CLANG_HEADERS_DIR} DESTINATION ${CMAKE_BINARY_DIR}/lib/clang/${LLVM_VERSION})

add_executable(coref-cfamily-src-extractor ${PROJECT_SOURCE_FILES} main.cpp)
target_link_libraries(coref-cfamily-src-extractor Storage LLVM clang-cpp ${SQLite3_LIBRARY})

# Copy Clang resource dir to install directory
install(DIRECTORY ${CLANG_HEADERS_DIR} DESTINATION lib/clang/${LLVM_VERSION})

install(TARGETS coref-cfamily-src-extractor
        LIBRARY DESTINATION lib  # 动态库安装路径
        ARCHIVE DESTINATION lib  # 静态库安装路径
        RUNTIME DESTINATION bin  # 可执行文件安装路径
        PUBLIC_HEADER DESTINATION include  # 头文件安装路径
        )
