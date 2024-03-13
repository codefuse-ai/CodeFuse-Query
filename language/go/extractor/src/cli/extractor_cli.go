package main

import (
	"fmt"
	"log"
	"os"
	"time"

	"alipay.com/code_insight/coref-go-extractor/src/config"

	"alipay.com/code_insight/coref-go-extractor/src/util"
)

func usage() {
	fmt.Fprintf(os.Stderr, `%[1]s is a command-line tool for extracting COREF data from Go source code.
It handles dependency installation and initiates the extraction process.

Resource Management:
  In environments with limited resources, you can control resource utilization by setting the
  SPARROW_EXTRACTOR_GO_MAX_GOROUTINES environment variable (or MAX_GOROUTINES for legacy support).
  This limits the number of concurrently running goroutines to reduce CPU and memory usage.
  By default, it is set to the number of your machine's CPU cores.

Including Test Files:
  The extractor processes Go test files by default (files ending in *_test.go or *.test).
  If you wish to exclude test files from the extraction process, use the flag '-ex noneedtests'.

Including Dependency Types:
  Dependency type information is excluded by default. To include it in the extraction, apply the flag '-ex needdependency'.

Extracting go.mod File:
  To extract the target project's go.mod file (if present), include the '-ex needmod' flag.

Usage:
  %[1]s [<extraction flag(s)>...] [<Go build flag(s)>...] [--] <source code root directory>

Examples:
  %[1]s -o ./out/coref_go_src.db $SRC_ROOT
  %[1]s -o ./out/coref_go_src.db -ex noneedtests -ex needscope -mod=mod $SRC_ROOT
`, os.Args[0])
}

type extractionConf struct {
	extractor               string
	extractArgs             []string
	buildArgs               []string
	dbPath                  string
	dbName                  string
	srcRoot                 string
	shouldInstallDependency bool
}

// DependencyInstallerMode is an enum describing how dependencies should be installed
type DependencyInstallerMode int

const (
	// GoGetNoModules represents dependency installation using `go get` without modules
	GoGetNoModules DependencyInstallerMode = iota
	// GoGetWithModules represents dependency installation using `go get` with modules
	GoGetWithModules
)

type GetMode int

const (
	ModUnset GetMode = iota
	ModGet
	ModMod
	ModVendor
)

func main() {
	startTime := time.Now()

	cfg := parseExtractorRunningParams(os.Args)
	log.Printf("ExtractorRunningParams: %+v\n", cfg)

	currentDir, err := os.Getwd()
	if err != nil {
		log.Fatalf("Failed to get current directory: %s", err)
	}

	// setting up for go env
	util.PrepareRunEnv()

	// should load project from extraction src root
	if err := os.Chdir(cfg.srcRoot); err != nil {
		log.Fatalf("Failed to change directory to the extraction source root: %s", err)
	}

	if cfg.shouldInstallDependency {
		handleDependencyInstallation(currentDir)
	}

	// for compatible with go111
	// see detail @https://maelvls.dev/go111module-everywhere/
	// disable go mod Load by default.
	if err := os.Setenv("GO111MODULE", "off"); err != nil {
		log.Fatalf("Failed to set GO111MODULE environment variable: %s", err)
	}

	log.Printf("Done preparing workspace in %v.\n", time.Since(startTime))
	log.Printf("Running extractor '%s' from directory '%s'.\n", cfg.extractor, cfg.srcRoot)

	runGoExtraction(cfg)
}

func setExtractorBasicConfig(cfg *extractionConf) *config.Config {
	// Initialize the basic configuration with default values
	basicConfig := &config.Config{
		Store: &config.OrmDesc{
			DBDialect: "sqlite3",
			DBName:    "coref_go_src.db",
			DBPath:    ".",
		},
		ParseRule: &config.ParseConfig{
			NeedTests: true, // Default to including tests
		},
	}

	// Update the database path and name if provided in the cfg
	if cfg.dbPath != "" {
		basicConfig.Store.DBPath = cfg.dbPath
	}
	if cfg.dbName != "" {
		basicConfig.Store.DBName = cfg.dbName
	}

	// Update the parse rules based on the extraction arguments
	for _, arg := range cfg.extractArgs {
		switch arg {
		case "NeedScope":
			basicConfig.ParseRule.NeedScope = true
		case "NoNeedTests":
			basicConfig.ParseRule.NeedTests = false
		case "NeedModFile":
			basicConfig.ParseRule.NeedModFile = true
		case "NeedCompile":
			basicConfig.ParseRule.NeedCompile = true
		}
	}

	return basicConfig
}
