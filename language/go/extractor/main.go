package main

import (
	"log"

	"alipay.com/code_insight/coref-go-extractor/src/config"
	"alipay.com/code_insight/coref-go-extractor/src/core"
)

// Go-extractor-core is the core program for executing extraction in a given package root.
// The root is assumed to have a go.mod file in its path.
func main() {
	config := createConfig()

	if err := core.ExtractWithFlags(nil, []string{"./..."}, config); err != nil {
		log.Fatalf("Error running go tooling: %s\n", err.Error())
	}
}

// createConfig returns a configuration for the go-extractor-core.
func createConfig() *config.Config {
	return &config.Config{
		Store: createOrmDesc(),
		ParseRule: &config.ParseConfig{
			NeedTests:   true,
			NeedScope:   false,
			NeedModFile: false,
			NeedCompile: false,
		},
	}
}

// createOrmDesc returns a new OrmDesc with configured database settings.
func createOrmDesc() *config.OrmDesc {
	return &config.OrmDesc{
		DBDialect: "sqlite3",
		DBName:    "coref_go_src.db",
		DBPath:    ".",
	}
}
