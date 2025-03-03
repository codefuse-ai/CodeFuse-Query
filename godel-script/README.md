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

You can refer to the following Dockerfile to prepare your development environment.

```Dockerfile
FROM ubuntu:24.04

RUN echo "Types: deb\n\
URIs: http://mirrors.cloud.tencent.com/ubuntu/\n\
Suites: noble noble-updates noble-security\n\
Components: main restricted universe multiverse\n\
Signed-By: /usr/share/keyrings/ubuntu-archive-keyring.gpg" > /etc/apt/sources.list.d/ubuntu.sources

RUN apt update && apt upgrade -y && apt install -y git build-essential m4 cmake ninja-build clang-format clang-tidy clang-tools clang clangd libc++-dev libc++1 libc++abi-dev libc++abi1 libclang-dev libclang1 liblldb-dev libllvm-ocaml-dev libomp-dev libomp5 lld lldb llvm-dev llvm-runtime llvm python3-clang libsqlite3-dev sqlite3 zlib1g-dev
```

For convenience, we recommend directly using the [Dev Container plugin](https://marketplace.visualstudio.com/items?itemName=ms-vscode-remote.remote-containers) of VSCode. Here is `devcontainer.json`.

```json
{
	"name": "godel-script",
	"build": {
		"context": "..",
		"dockerfile": "./Dockerfile"
	},
	"customizations": {
		"vscode": {
			"extensions": [
				"xaver.clang-format",
				"twxs.cmake",
				"ms-vscode.cmake-tools",
				"vadimcn.vscode-lldb",
				"llvm-vs-code-extensions.vscode-clangd"
			],
			"settings": {
				"[cpp]": {
					"editor.defaultFormatter": "xaver.clang-format"
				},
				"editor.formatOnSave": true,
				"editor.formatOnPaste": true,
				"cmake.generator": "Ninja"
			}
		}
	},
	"remoteUser": "root"
}
```


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
cmake .. -DCMAKE_BUILD_TYPE:STRING=Release -DCMAKE_EXPORT_COMPILE_COMMANDS:BOOL=TRUE -DCMAKE_C_COMPILER:FILEPATH=/usr/bin/clang -DCMAKE_CXX_COMPILER:FILEPATH=/usr/bin/clang++ --no-warn-unused-cli -G Ninja
cmake --build . --config Release --target all -j 8
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
