# 介绍
`coref-cfamily-src-extractor` 将 C/C++/Objective-C 项目的源码转化为COREF标准化数据，用于codefuse-query的进一步分析。

# 开发环境要求
请参考 `dev.Dockerfile`，或直接使用该镜像作为开发环境

# 构建
```shell
mkdir build
cd build
cmake .. -DCMAKE_BUILD_TYPE=Release -DCMAKE_C_COMPILER="clang" -DCMAKE_CXX_COMPILER="clang++"
make -j4
```

# 单元测试
```shell
mkdir build
cd build
cmake .. -DCMAKE_BUILD_TYPE=Release -DCMAKE_C_COMPILER="clang" -DCMAKE_CXX_COMPILER="clang++" -DBUILD_TESTS=ON
make unit_tests
make test
```

# 第三方库
- [sqlite_orm](https://github.com/fnc12/sqlite_orm)
  - Commit: 115c6f64a340eac5bc5509bf884a7f350c9e6aa8

# 使用方法
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

## 从compile_commands.json文件中抽取
分析项目中的编译单元，`coref-cfamily-src-extractor`首先要知道如何编译单元(该编译单元的编译命令)，它从目录下查找compilation database，
这个database就是compile_commands.json文件，里面包含该项目中所有的编译单元的编译命令。

比如：
```shell
coref-cfamily-src-extractor -p compile_commands.json -o /path/to/corefdb
```
