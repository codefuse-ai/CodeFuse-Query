# Introduction
`coref-cfamily-src-extractor` converts source code from C/C++/Objective-C projects into COREF standardized data for further analysis by codefuse-query.

# Development Environment Requirements
Please refer to `dev.Dockerfile`, or directly use this image as your development environment.

# Build
```shell
mkdir build
cd build
cmake .. -DCMAKE_BUILD_TYPE=Release -DCMAKE_C_COMPILER="clang" -DCMAKE_CXX_COMPILER="clang++"
make -j4
```

# Unit Testing
```shell
mkdir build
cd build
cmake .. -DCMAKE_BUILD_TYPE=Release -DCMAKE_C_COMPILER="clang" -DCMAKE_CXX_COMPILER="clang++" -DBUILD_TESTS=ON
make unit_tests
make test
```

# Third-Party Libraries
- sqlite_orm Commit: 115c6f64a340eac5bc5509bf884a7f350c9e6aa8

# Usage
```shell
$ coref-cfamily-src-extractor --help
USAGE: coref-cfamily-src-extractor [options]
OPTIONS:
COREF Options:
  --compile-commands=<string> - Path to the compile_commands.json file
  --extra-arg=<string>        - Additional argument to append to the compiler command line
  --extra-arg-before=<string> - Additional argument to prepend to the compiler command line
  --output-db-path=<string>   - The output path to the sqlite DB file
Generic Options:
  --help                      - Display available options (--help-hidden for more)
  --help-list                 - Display list of available options (--help-list-hidden for more)
  --version                   - Display the version of this program
This tool extracts AST Nodes' information from a given C family codebase.
```

# Extraction from compile_commands.json File
To analyze the compilation units in a project, coref-cfamily-src-extractor needs to know how to compile these units (the compilation commands for those units). It looks for a compilation database in the directory, which is the compile_commands.json file that contains the compilation commands for all compilation units in the project.

For example:
```shell
coref-cfamily-src-extractor -p compile_commands.json -o /path/to/corefdb
```