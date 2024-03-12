package main

import (
	"alipay.com/code_insight/coref-go-extractor/src/config"
	"fmt"
	"log"
	"os"
	"time"

	"alipay.com/code_insight/coref-go-extractor/src/util"
)

func usage() {
	fmt.Fprintf(os.Stderr,
		`%s is a wrapper script that installs dependencies and calls the extractor.
In resource-constrained environments, the environment variable SPARROW_EXTRACTOR_GO_MAX_GOROUTINES
(or its legacy alias MAX_GOROUTINES) can be used to limit the number of parallel goroutines
started by the extractor, which reduces CPU and memory requirements. The default value for this
variable is CPU Nums.
The extractor for go tests files<*_test.go | *.test> is extracted by default.
If you don't need extract go tests files, please add extraction flag with ' -ex noneedtests';
however, types' info of target dependencies is not extracted by default, if you want do extraction for
that, use flag with '-ex needdependency', see the demo below.
`, os.Args[0])
	fmt.Fprintf(os.Stderr, "Usage:\n\n  %s [<flag for extraction>...] [<buildflag For go>...] [--] <fileRoot>\n", os.Args[0])
	fmt.Fprintf(os.Stderr, "  Example#1: %s -o ./out/coref_go_src.db  $src_root \n", os.Args[0])
	fmt.Fprintf(os.Stderr, "  Example#2: %s -o ./out/coref_go_src.db -ex noneedtests -ex needscope -mod=mod $src_root \n", os.Args[0])
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

	// os.Args
	cfg := parseExtractorRunningParams([]string{"./extractor_cli", "-o", "./out/coref_go_src.db", "-ex", "needmodfile", "-ex", "noneedtests", "."})
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
