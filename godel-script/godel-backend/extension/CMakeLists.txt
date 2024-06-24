project(souffle_ext)

set(CMAKE_CXX_STANDARD 17)

include_directories(../souffle/src/include)

add_compile_definitions(RAM_DOMAIN_SIZE=64)

add_library(souffle_ext SHARED library.cpp)
