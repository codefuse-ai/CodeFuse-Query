# Go COREF Data Extractor

This project is a source code implementation of a [COREF](https://github.com/codefuse-ai/CodeFuse-Query?tab=readme-ov-file#code-data-model-coref) data extractor written in Go. It is designed to extract COREF data from A Go project.

## Usage

There are two main ways to use this extractor:

### Method 1: Direct Execution

You can directly run the extractor on the current project by executing:

```shell
go run main.go
``` 

This will extract the COREF data from the current project.

### Method 2: CLI

Alternatively, you can use the command-line interface (CLI) to extract coreference data. To do so, run the following command:

```shell
go run src/cli/extractor_cli.go src/cli/helper.go -o ./out/coref_go_src.db -ex needmodfile .
```

This will extract the COREF data along with the project's go.mod file and store the extracted data into the `out/coref_go_src.db` file.


## Requirements

This project requires Go 1.18 or higher. Please ensure you have the correct version installed before compiling or running the extractor.


## Installation

```shell
# Clone the repository
git clone https://github.com/codefuse-ai/CodeFuse-Query.git

# Navigate to the Go extractor project directory
cd language/go/extractor

# Build the project
go build -o coref-go-extractor src/cli/extractor_cli.go src/cli/helper.go

```

You can then run the built executable directly:

```shell
./coref-go-extractor -o ./coref_go_src.db  .
```

For more detail about the Go extractor, please run 

```shell
./coref-go-extractor -h
```

## Contributing

If you would like to contribute to the development of this extractor, please feel free to make a pull request or open an issue to discuss proposed changes.