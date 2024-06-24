# GödelScript

## Content

* 简介 | [Introduction](#introduction)
* 文档 | [Documents](#documents)
* 编译 | [Compilation](#compilation)
* 用法 | [Usage](#usage)

## Introduction

GödelScript is designed for creating code analysis libraries and programs,
and compiling them to soufflé more easily. With it's Object-Oriented features,
it has great maintainability and readability.

```rust
@output
pub fn hello() -> string {
    return "Hello World!"
}
```

## Documents

* GödelScript Language Reference
    * GödelScript [Program](./docs/language-reference/program.md)
    * GödelScript [Type](./docs/language-reference/type.md)
    * GödelScript [Schema](./docs/language-reference/schemas.md)
    * GödelScript [Database](./docs/language-reference/databases.md)
    * GödelScript [Enum](./docs/language-reference/enums.md)
    * GödelScript [Impl](./docs/language-reference/impl.md)
    * GödelScript [Function](./docs/language-reference/functions.md)
    * GödelScript [Import](./docs/language-reference/import.md)
    * GödelScript [Query](./docs/language-reference/queries.md)
    * GödelScript [Statement](./docs/language-reference/functions.md#statement)
    * GödelScript [Expression](./docs/language-reference/functions.md#expression)
* GödelScript [Query Example](./example)
* GödelScript [Syntax Definition](./docs/syntax.md)

## Compilation

Structure of this project:

```
.
|-- dockerFile
|-- docs                    godel-script documents
|-- godel-backend           godel-script backend
|   |-- extension           godel-script souffle extension
|   |-- souffle             souffle source code
|   +-- tools               souffle build tools
+-- godel-frontend          godel-script frontend
    +-- src                 godel-frontend source code
```

Need C++ standard at least `-std=c++17`.

### Build Godel Script

Use command below:

```bash
mkdir build
cd build
cmake ..
make -j
```

After building, you'll find `build/godel` in the `build` folder.

## Usage

Use this command for help:

> ./build/godel -h

### Compile Target Soufflé

> ./build/godel -p {godel library directory} {input file} -s {soufflé output file} -Of

`-Of` is an optimization for join order, we suggest to switch it on.

### Directly Run Soufflé

> ./build/godel -p {godel library directory} {input file} -r -Of -f {database directory}

`-Of` is an optimization for join order, we suggest to switch it on.

`-r` means directly run soufflé.

`-v` could be used for getting verbose info.
