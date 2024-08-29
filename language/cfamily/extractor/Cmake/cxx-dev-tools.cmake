# Additional targets to perform clang-format/clang-tidy
# Get all project files
file(GLOB_RECURSE
        ALL_CXX_SOURCE_FILES
        *.[chi]pp *.[chi]xx *.cc *.hh *.ii *.[CHI]
        )

list(FILTER ALL_CXX_SOURCE_FILES EXCLUDE REGEX ".*/ThirdParty/.*")
list(FILTER ALL_CXX_SOURCE_FILES EXCLUDE REGEX ".*/Tests/Samples/.*")
list(FILTER ALL_CXX_SOURCE_FILES EXCLUDE REGEX ".*/SymbolNameGenerator.cpp")
list(FILTER ALL_CXX_SOURCE_FILES EXCLUDE REGEX ".*/SymbolNameGenerator.hpp")

# Adding clang-format target if executable is found
find_program(CLANG_FORMAT "clang-format")
if (CLANG_FORMAT)
    add_custom_target(
            clang-format-code
            COMMAND clang-format
            -i
            -style=file
            ${ALL_CXX_SOURCE_FILES}
    )
endif ()

set(CMAKE_EXPORT_COMPILE_COMMANDS ON)
# Adding clang-tidy target if executable is found
find_program(CLANG_TIDY "clang-tidy")
if (CLANG_TIDY)
    add_custom_target(
            clang-tidy-code
            COMMAND clang-tidy
            ${ALL_CXX_SOURCE_FILES}
            --format-style=file
            -p ${CMAKE_BINARY_DIR}/compile_commands.json
            --fix
            ${INCLUDE_DIRECTORIES}
    )
endif ()