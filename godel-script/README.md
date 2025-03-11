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
* GödelScript [Query Example](../example)
* GödelScript [Syntax Definition](./docs/syntax.md)

## Compilation

Structure of this project:

```
.
|-- docs                godel-script documents
|-- godel-backend       godel-script backend
|   |-- extension       godel-script souffle extension
|   |-- souffle         souffle source code
|   +-- tools           souffle build tools
+-- godel-frontend      godel-script frontend
    +-- src             godel-frontend source code
```

### Environment

Need C++ standard at least `-std=c++17`.

On Ubuntu, you are expected to install the following packages before compiling.

```bash
sudo apt install -y git build-essential libffi-dev m4 cmake libsqlite3-dev zlib1g-dev
```

For convenience, we recommend directly using the [Dev Container plugin](https://marketplace.visualstudio.com/items?itemName=ms-vscode-remote.remote-containers) of VSCode. The configuration files are in `godel-script/.devcontainer/`.


### Apply Patch On Soufflé Submodule

GödelScript uses a self-modified soufflé from a much older branch of public soufflé. Use these commands to clone.

```bash
git submodule init
git submodule update --recursive
```

Now we use patch to make sure it could be built successfully. Use these commands to apply patch:

```bash
cd godel-backend/souffle
git am ../0001-init-self-used-souffle-from-public-souffle.patch
```

Use these commands to revert:

```bash
cd godel-backend/souffle
git apply -R ../0001-init-self-used-souffle-from-public-souffle.patch
git reset HEAD~
```

### Build GödelScript

Use command below:

```bash
mkdir build && cd build
cmake .. -DCMAKE_BUILD_TYPE:STRING=Release 
cmake --build .
```

After building, you'll find `build/godel` in the `build` folder.

## Usage

Use this command for help:

> godel -h

### Compile GödelScript to Target Soufflé

> godel -p {godel library directory} {input file} -s {soufflé output file} -O2

We suggest to use `-O2` for stable optimizations.

### Directly Run GödelScript

> godel -p {godel library directory} {input file} -r -O2 -f {database directory}

We suggest to use `-O2` for stable optimizations.

`-r` means directly run soufflé.
