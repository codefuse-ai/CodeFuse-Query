package main

import (
	"fmt"
	"io/ioutil"
	"log"
	"os"
	"os/exec"
	"path/filepath"
	"regexp"
	"runtime"
	"runtime/pprof"
	"strings"
	"text/template"

	"alipay.com/code_insight/coref-go-extractor/src/core"
	"alipay.com/code_insight/coref-go-extractor/src/util"
	"golang.org/x/mod/semver"
)

// parseExtractorRunningParams parses the command-line arguments and sets up the extraction configuration.
func parseExtractorRunningParams(args []string) *extractionConf {
	if len(args) < 2 {
		usage()
		os.Exit(2)
	}

	configArgs := strings.Split(strings.Join(args[1:], " "), " ")
	srcPath, err := filepath.Abs(configArgs[len(configArgs)-1])
	if err != nil {
		log.Fatalf("Unable to resolve the absolute path: %s", err)
	}
	if _, err := os.Stat(srcPath); os.IsNotExist(err) {
		log.Fatalf("Source path does not exist: %s", srcPath)
	}

	extractionConfig := &extractionConf{
		extractor: args[0],
		srcRoot:   srcPath,
	}

	for i := 0; i < len(configArgs)-1 && strings.HasPrefix(configArgs[i], "-"); i++ {
		arg := configArgs[i]
		switch arg {
		case "-h", "--help":
			usage()
			os.Exit(0)
		case "-exconfig", "-ex":
			handleExtractionArg(configArgs, &i, extractionConfig)
		case "-o", "-output", "-dbpath":
			handleOutputArg(configArgs, &i, extractionConfig)
		default:
			handleBuildArg(arg, extractionConfig)
		}
	}

	return extractionConfig
}

func handleExtractionArg(args []string, index *int, config *extractionConf) {
	nextIndex := *index + 1
	if nextIndex < len(args) {
		extractionArg := args[nextIndex]
		switch extractionArg {
		case "resolvedependency", "needdependencytypes", "needdependency":
			config.shouldInstallDependency = true
		case "needscopes":
			config.extractArgs = append(config.extractArgs, "NeedScope")
		case "noneedtests":
			config.extractArgs = append(config.extractArgs, "NoNeedTests")
		case "needmodfile", "needmodfiles":
			config.extractArgs = append(config.extractArgs, "NeedModFile")
		case "needcompiledgofiles":
			config.extractArgs = append(config.extractArgs, "NeedCompile")
		}
		*index = nextIndex
	}
}

func handleOutputArg(args []string, index *int, config *extractionConf) {
	nextIndex := *index + 1
	if nextIndex < len(args) {
		path := args[nextIndex]
		dir, file := filepath.Split(path)
		if _, err := os.Stat(dir); os.IsNotExist(err) {
			if err := os.MkdirAll(dir, os.ModePerm); err != nil {
				log.Fatalf("Unable to create directory '%s': %s", dir, err)
			}
		}
		config.dbPath = dir
		config.dbName = file
		*index = nextIndex
	}
}

func handleBuildArg(arg string, config *extractionConf) {
	// args start with '-', all would be treated as buildFlag for the GO complier,
	// Maybe one of ["-p", "-asmflags", "-buildmode", "-compiler", "-gccgoflags", "-gcflags", "-installsuffix",
	//			"-ldflags", "-mod", "-modfile", "-pkgdir", "-tags", "-toolexec", "-overlay"]
	// etc.
	if strings.HasPrefix(arg, "-") {
		config.buildArgs = append(config.buildArgs, arg)
	}
}

func runGoExtraction(cfg *extractionConf) {
	config := setExtractorBasicConfig(cfg)

	// Set up CPU profiling if enabled
	cpuProfileCleanup := setupCPUProfiling()
	defer cpuProfileCleanup()

	log.Printf("Build flags: '%s'; Patterns: '%s'\n", strings.Join(cfg.buildArgs, " "), "./...")
	if err := core.ExtractWithFlags(cfg.buildArgs, []string{"./..."}, config); err != nil {
		log.Fatalf("Error running go tooling: %s", err)
	}

	// Set up memory profiling if enabled
	memProfileCleanup := setupMemProfiling()
	defer memProfileCleanup()
}

func setupCPUProfiling() func() {
	cpuprofile := os.Getenv("EXTRACTOR_GO_CPU_PROFILE")
	if cpuprofile == "" {
		return func() {}
	}
	f, err := os.Create(cpuprofile)
	if err != nil {
		log.Fatalf("Failed to create CPU profile: %v", err)
	}
	if err := pprof.StartCPUProfile(f); err != nil {
		f.Close()
		log.Fatalf("Failed to start CPU profile: %v", err)
	}
	return func() {
		pprof.StopCPUProfile()
		if err := f.Close(); err != nil {
			log.Printf("Failed to close CPU profile file: %v", err)
		}
	}
}

func setupMemProfiling() func() {
	memprofile := os.Getenv("EXTRACTOR_GO_MEM_PROFILE")
	if memprofile == "" {
		return func() {}
	}
	f, err := os.Create(memprofile)
	if err != nil {
		log.Fatalf("Failed to create memory profile: %v", err)
	}
	runtime.GC() // Collect garbage to get up-to-date statistics
	if err := pprof.WriteHeapProfile(f); err != nil {
		f.Close()
		log.Fatalf("Failed to write memory profile: %v", err)
	}
	return func() {
		if err := f.Close(); err != nil {
			log.Printf("Failed to close memory profile file: %v", err)
		}
	}
}

// addVersionToMod add a go version directive, e.g. `go 1.14` to a `go.mod` file.
func addVersionToMod(goMod []byte, version string) bool {
	cmd := exec.Command("go", "mod", "edit", "-go="+version)
	return util.RunCmd(cmd) != nil
}

var goVersion = ""

// Returns the current Go version as returned by 'go version', e.g. go1.14.4
func getEnvGoVersion() string {
	if goVersion == "" {
		gover, err := exec.Command("go", "version").CombinedOutput()
		if err != nil {
			log.Fatalf("Unable to run the go command, is it installed?\nError: %s", err.Error())
		}
		goVersion = strings.Fields(string(gover))[2]
	}
	return goVersion
}

// Returns the current Go version in semver format, e.g. v1.14.4
func getEnvGoSemVer() string {
	goVersion := getEnvGoVersion()
	if !strings.HasPrefix(goVersion, "go") {
		log.Fatalf("Expected 'go version' output of the form 'go1.2.3'; got '%s'", goVersion)
	}
	return "v" + goVersion[2:]
}

// checkVendor tests to see whether a vendor directory is inconsistent according to the go frontend
func checkVendor() bool {
	vendorCheckCmd := exec.Command("go", "list", "-mod=vendor", "./...")
	outp, err := vendorCheckCmd.CombinedOutput()
	if err != nil {
		badVendorRe := regexp.MustCompile(`(?m)^go: inconsistent vendoring in .*:$`)
		return !badVendorRe.Match(outp)
	}

	return true
}

func getDependencyListWithGoGet(repoList []string, mod DependencyInstallerMode, backDir string) error {
	if err := setGoModulesEnv(mod); err != nil {
		return fmt.Errorf("setting GO111MODULE environment variable: %v", err)
	}

	if err := installDependencies("./..."); err != nil {
		return fmt.Errorf("installing dependencies: %v", err)
	}

	if len(repoList) > 0 {
		if err := processRepoList(repoList, backDir); err != nil {
			return fmt.Errorf("processing repository list: %v", err)
		}
	}

	return nil
}

func setGoModulesEnv(mod DependencyInstallerMode) error {
	envValue := "off"
	if mod == GoGetWithModules {
		envValue = "on"
	}
	return os.Setenv("GO111MODULE", envValue)
}

func installDependencies(pattern string) error {
	cmd := exec.Command("go", "get", "-v", "-x", pattern)
	log.Printf("Installing dependencies using `go get -v -x %s`.", pattern)
	return util.RunCmd(cmd)
}

func processRepoList(repoList []string, backDir string) error {
	scratch, err := os.MkdirTemp(backDir, "scratch")
	if err != nil {
		return fmt.Errorf("creating temporary directory: %v", err)
	}
	defer os.RemoveAll(scratch)

	fileContent := generateFileContent(repoList)
	filePath := filepath.Join(scratch, "main.go")
	if err := os.WriteFile(filePath, []byte(fileContent), 0644); err != nil {
		return fmt.Errorf("writing main.go file: %v", err)
	}

	if err := runGoModCommands(scratch); err != nil {
		return fmt.Errorf("running Go mod commands: %v", err)
	}

	return moveSourceFilesToGoPath(scratch, backDir)
}

func generateFileContent(repoList []string) string {
	tpl := `package main

import (
{{- range .}}
	_ "{{.}}"
{{- end}}
)

func main() {
	// Intentionally left empty.
}
`
	t := template.Must(template.New("file").Parse(tpl))
	var builder strings.Builder
	if err := t.Execute(&builder, repoList); err != nil {
		log.Fatalf("executing template: %v", err)
	}
	return builder.String()
}

func runGoModCommands(dir string) error {
	if err := os.Chdir(dir); err != nil {
		return fmt.Errorf("changing to temporary directory: %v", err)
	}
	log.Printf("Initializing new Go module and downloading dependencies.")

	if output, err := exec.Command("go", "mod", "init", "fake").CombinedOutput(); err != nil {
		return fmt.Errorf("initializing go mod: %s: %v", output, err)
	}
	if output, err := exec.Command("go", "mod", "tidy").CombinedOutput(); err != nil {
		return fmt.Errorf("tidying go mod: %s: %v", output, err)
	}
	return installDependencies("./...")
}

func moveSourceFilesToGoPath(scratch, backDir string) error {
	goPath := os.Getenv("GOPATH")
	if goPath == "" {
		return nil
	}
	srcPath := filepath.Join(goPath, "pkg", "mod")
	destPath := filepath.Join(goPath, "src")

	if err := util.DirExistsAndClean(destPath); err != nil {
		return fmt.Errorf("preparing destination directory: %v", err)
	}
	if err := os.Rename(srcPath, destPath); err != nil {
		return fmt.Errorf("moving source files: %v", err)
	}
	return os.Chdir(backDir)
}

func handleDependencyInstallation(currentDir string) {
	depMode := determineDependencyMode()
	modMode := getModuleMode(depMode)

	if modMode == ModVendor && !fixVendorIssues() {
		modMode = ModMod
	}

	updateGoModAndGoSumIfNeeded(depMode)

	if modMode == ModVendor && checkVendor() {
		log.Printf("Skipping dependency installation because a Go vendor directory was found.")
		return
	}

	repoList := getRepoList()
	if err := getDependencyListWithGoGet(repoList, depMode, currentDir); err != nil {
		log.Printf("Failed to run getDepedencyListWithGoMod: %s\n", err)
	}
}

func determineDependencyMode() DependencyInstallerMode {
	if util.FileExists("go.mod") {
		log.Println("Found go.mod, enabling go modules")
		return GoGetWithModules
	}
	return GoGetNoModules
}

func getModuleMode(depMode DependencyInstallerMode) GetMode {
	if depMode != GoGetWithModules {
		return ModUnset
	}
	if util.FileExists("vendor/modules.txt") {
		return ModVendor
	}
	if util.DirExists("vendor") {
		return ModMod
	}
	return ModUnset
}

func fixVendorIssues() bool {
	const explicitVersion = "1.13"
	goModPath := "go.mod"
	vendorModulesTxt := "vendor/modules.txt"

	if !util.FileExists(goModPath) || !util.FileExists(vendorModulesTxt) {
		return false
	}

	goModContent, err := ioutil.ReadFile(goModPath)
	if err != nil {
		log.Println("Failed to read go.mod to check for missing Go version")
		return false
	}

	versionRe := regexp.MustCompile(`(?m)^go[ \t\r]+[0-9]+\.[0-9]+$`)
	if versionRe.Match(goModContent) {
		return true
	}

	modulesTxtContent, err := ioutil.ReadFile(vendorModulesTxt)
	if err != nil {
		log.Println("Failed to read vendor/modules.txt to check for mismatched Go version")
		return false
	}

	explicitRe := regexp.MustCompile(`(?m)^## explicit$`)
	if explicitRe.Match(modulesTxtContent) {
		return true
	}

	log.Println("Adding a version directive to the go.mod file as the modules.txt does not have explicit annotations")
	return addVersionToMod(goModContent, explicitVersion)
}

func updateGoModAndGoSumIfNeeded(depMode DependencyInstallerMode) {
	if depMode != GoGetWithModules || semver.Compare(getEnvGoSemVer(), "v1.16") < 0 {
		return
	}

	beforeGoModFileInfo, err := os.Stat("go.mod")
	if err != nil {
		log.Println("Failed to stat go.mod before running `go mod tidy -e`")
		return
	}

	if err := runGoModTidyE(); err != nil {
		log.Println("Failed to run `go mod tidy -e`")
		return
	}

	checkForFileUpdates("go.mod", beforeGoModFileInfo)
	checkForFileUpdates("go.sum", nil)
}

func runGoModTidyE() error {
	return util.RunCmd(exec.Command("go", "mod", "tidy", "-e"))
}

func checkForFileUpdates(filename string, beforeFileInfo os.FileInfo) {
	afterFileInfo, err := os.Stat(filename)
	if err != nil || (beforeFileInfo != nil && !afterFileInfo.ModTime().After(beforeFileInfo.ModTime())) {
		return
	}
	log.Printf("We have run `go mod tidy -e` and it altered %s. You may wish to check these changes into version control.", filename)
}

func getRepoList() []string {
	repoURL := os.Getenv("SPARROW_REPO_URL")
	if repoURL == "" {
		return nil
	}
	return []string{repoURL}
}
