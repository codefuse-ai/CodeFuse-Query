package core

import (
	"alipay.com/code_insight/coref-go-extractor/src/orm"
	"crypto/md5"
	"encoding/hex"
	"fmt"
	"go/types"
	"io"
	"log"
	"os"
	"path/filepath"
	"runtime"
	"strconv"
	"strings"
	"time"

	"alipay.com/code_insight/coref-go-extractor/src/config"
	"alipay.com/code_insight/coref-go-extractor/src/util"
	//_ "go.uber.org/automaxprocs"
	"golang.org/x/tools/go/packages"
)

var typeParamParent = make(map[*types.TypeParam]types.Object)

func init() {
	var maxGoRoutines int
	envVars := []string{"EXTRACTOR_GO_MAX_GOROUTINES", "MAX_GOROUTINES"}

	// Try to get a valid max goroutines value from environment variables.
	found := false
	for _, envVar := range envVars {
		if value, ok := os.LookupEnv(envVar); ok {
			var err error
			maxGoRoutines, err = strconv.Atoi(value)
			if err == nil {
				found = true
				break
			} else {
				log.Printf("Warning: Environment variable %s has invalid value %s, defaulting based on MaxParallelism.", envVar, value)
			}
		}
	}

	// If no valid environment variable was found, use the default value.
	if !found {
		maxGoRoutines = util.MaxParallelism()
	}

	// Set GOMAXPROCS to the determined value
	runtime.GOMAXPROCS(maxGoRoutines)
	log.Printf("Max goroutines set to %d", maxGoRoutines)
}

// ExtractWithFlags extracts the packages specified by the given patterns and build flags.
// It prepares the package loading configuration, loads the packages, handles any errors,
// and initiates the extraction process. This function also manages the logic to disable
// Go modules if necessary and logs the progress throughout the extraction process.
func ExtractWithFlags(buildFlags []string, patterns []string, c *config.Config) error {
	startTime := time.Now()
	extraction := NewExtraction(buildFlags, patterns, c)
	defer extraction.Close()
	log.Println("GO111MODULE=" + os.Getenv("GO111MODULE"))

	modFlags := filterModFlags(buildFlags)
	loadMode := determineLoadMode(c.ParseRule)
	cfg := &packages.Config{
		Mode:       loadMode,
		BuildFlags: buildFlags,
		Tests:      c.ParseRule.NeedTests,
	}

	log.Printf("Extraction Settings:\n- Extraction: %s\n- Load Mode: %s\n- Go Build Flags: %s\n",
		extraction.toString(),
		cfg.Mode.String(),
		strings.Join(cfg.BuildFlags, " "),
	)
	log.Println("Running packages.Load.")
	pkgs, err := packages.Load(cfg, patterns...)
	if err != nil {
		n := packages.PrintErrors(pkgs)
		log.Printf("packages.Load() error:%v\n, the number of errors printed: %v\n", err, n)
		if err := retryWithoutModules(cfg, patterns); err != nil {
			return err
		}
	}

	log.Printf("Done running packages.Load(%v).\n", time.Since(startTime))
	if len(pkgs) == 0 {
		log.Println("No packages found.")
		return nil
	}

	extraction.extractUniverseScope()
	log.Printf("Done extracting universe scope(%v).\n", time.Since(startTime))

	if c.ParseRule.NeedModFile || c.ParseRule.NeedScope {
		extraction.extractExtraInfo(pkgs, modFlags, startTime)
	}

	extractPackages(pkgs, extraction)
	log.Printf("Done extracting packages(%v).\n", time.Since(startTime))

	// Wait for file extraction finish
	extraction.WaitGroup.Wait()
	extraction.StatProfile.StoreTable(&orm.CompilationFinished{
		Oid:            extraction.Label.ID,
		CpuSeconds:     0.0,
		ElapsedSeconds: time.Now().Sub(startTime).Seconds(),
	})

	return nil
}

// filterModFlags filters out the build flags that are related to Go module behavior.
func filterModFlags(buildFlags []string) []string {
	var modFlags []string
	for _, flag := range buildFlags {
		if strings.HasPrefix(flag, "-mod=") {
			modFlags = append(modFlags, flag)
		}
	}
	return modFlags
}

// determineLoadMode calculates the loading mode for package data based on the parsing rules.
// The load mode defines what information should be included during package loading, such as
// file names, types, syntax trees, and more.
func determineLoadMode(parseRule *config.ParseConfig) packages.LoadMode {
	loadMode := packages.NeedName | packages.NeedFiles |
		packages.NeedTypes | packages.NeedDeps | packages.NeedImports |
		packages.NeedTypesInfo | packages.NeedSyntax
	if parseRule.NeedCompile {
		loadMode |= packages.NeedCompiledGoFiles
	}
	return loadMode
}

// retryWithoutModules attempts to reload the packages without Go module support if an error occurs
// during the initial load with modules enabled. This is a fallback mechanism for compatibility with
// codebases not yet using Go modules.
func retryWithoutModules(cfg *packages.Config, patterns []string) error {
	log.Println("Go module mode enabled, trying with disabled...")
	if err := os.Setenv("GO111MODULE", "off"); err != nil {
		return err
	}
	_, err := packages.Load(cfg, patterns...)
	return err
}

// extractPackages iterates over the loaded packages and passes them to the extraction process.
// It skips packages that are marked to be ignored and logs the extraction progress for each package.
func extractPackages(pkgs []*packages.Package, extraction *Extraction) {
	for _, pkg := range pkgs {
		if isIgnorePath(pkg.PkgPath) {
			log.Printf("Ignore folder: %s", pkg.PkgPath)
			extraction.StatProfile.StoreTable(&orm.UnExtracted{
				Oid:  getPkgLableID(pkg).ID,
				Type: orm.TypeFolder,
				Name: trimRootSuffix(extraction.StatProfile, pkg.PkgPath),
			})
			continue
		}
		log.Printf("Extracting package %s ...", pkg.PkgPath)
		// fill the table if scope is no extracted
		if !extraction.Config.ParseRule.NeedScope {
			extraction.StatProfile.StoreTable(&orm.Pkg{
				Oid:   getPkgLableID(pkg).ID,
				Path:  trimRootSuffix(extraction.StatProfile, pkg.PkgPath),
				Name:  pkg.Name,
				Scope: 0,
			})
		}
		extraction.extractPackage(pkg)
		log.Printf("Done extracting package %s", pkg.PkgPath)
	}
}

// extractExtraInfo extracts module .go files or scope info based on the provided configuration settings.
func (ex *Extraction) extractExtraInfo(pkgs []*packages.Package, modFlags []string, startTime time.Time) {
	pkgRoots, pkgDirs := ex.getPkgDirs(pkgs, modFlags)
	wantedRoots := ex.getWantedRoots(pkgs, pkgRoots, pkgDirs)

	ex.processPackages(pkgs, startTime)
	ex.extractModFiles(pkgs, wantedRoots, pkgDirs, pkgRoots)
}

// getPkgDirs returns maps of package path to package root and source code directories.
func (ex *Extraction) getPkgDirs(pkgs []*packages.Package, modFlags []string) (map[string]string, map[string]string) {
	pkgRoots := make(map[string]string)
	pkgDirs := make(map[string]string)

	for _, pkg := range pkgs {
		if isIgnorePath(pkg.PkgPath) {
			continue
		}

		if _, ok := pkgRoots[pkg.PkgPath]; !ok {
			pkgRoots[pkg.PkgPath], pkgDirs[pkg.PkgPath] = ex.resolvePackageDirs(pkg.PkgPath, modFlags)
		}
	}

	return pkgRoots, pkgDirs
}

// resolvePackageDirs determines the module and package directories for a given package path.
func (ex *Extraction) resolvePackageDirs(pkgPath string, modFlags []string) (string, string) {
	mdir := util.GetModDir(pkgPath, modFlags...)
	pdir := util.GetPkgDir(pkgPath, modFlags...)

	// Fall back to package directory if the module directory can't be determined.
	if mdir == "" {
		mdir = pdir
	}

	return mdir, pdir
}

// getWantedRoots identifies the root directories of packages to be extracted.
func (ex *Extraction) getWantedRoots(pkgs []*packages.Package, pkgRoots, pkgDirs map[string]string) map[string]bool {
	wantedRoots := make(map[string]bool)

	for _, pkg := range pkgs {
		if isIgnorePath(pkg.PkgPath) {
			continue
		}

		wantedRoots[pkgRoots[pkg.PkgPath]] = true
		wantedRoots[pkgDirs[pkg.PkgPath]] = true
	}

	return wantedRoots
}

// processPackages processes packages to extract package scopes and handle package errors.
func (ex *Extraction) processPackages(pkgs []*packages.Package, startTime time.Time) {
	for _, pkg := range pkgs {
		if isIgnorePath(pkg.PkgPath) {
			continue
		}

		log.Printf("Processing package %s.", pkg.PkgPath)
		ex.processSinglePackage(pkg, startTime)
	}
}

// processSinglePackage processes a single package for scope extraction and error handling.
func (ex *Extraction) processSinglePackage(pkg *packages.Package, startTime time.Time) {
	log.Printf("Extracting types for package %s.", pkg.PkgPath)

	p, err := NewProfile(pkg.PkgPath, pkg, ex.Db, &ex.IDManager, ex.SrcRootDir)
	if err != nil {
		log.Fatal(err)
	}

	lbl := getPkgLableID(pkg)
	if ex.Config.ParseRule.NeedScope {
		scope := extractPackageScope(p, pkg)
		extractObjectTypes(p)

		p.StoreTable(&orm.Pkg{
			Oid:   lbl.ID,
			Path:  trimRootSuffix(p, pkg.PkgPath),
			Name:  pkg.Name,
			Scope: scope.ID,
		})
	}

	// extract package load errors
	if len(pkg.Errors) != 0 {
		log.Printf("Warning: encountered errors extracting package `%s`:", pkg.PkgPath)
		for i, err := range pkg.Errors {
			log.Printf("  %s", err.Error())
			ex.extractError(p, err, lbl, i)
		}
	}
	log.Printf("Done extracting types for package %s(%v).", pkg.PkgPath, time.Now().Sub(startTime))
}

// extractModFiles extracts the "go.mod" files from wanted package roots.
func (ex *Extraction) extractModFiles(pkgs []*packages.Package, wantedRoots map[string]bool, pkgDirs, pkgRoots map[string]string) {
	for _, pkg := range pkgs {
		if isIgnorePath(pkg.PkgPath) {
			continue
		}

		for root := range wantedRoots {
			relDir, err := filepath.Rel(root, pkgDirs[pkg.PkgPath])
			if err != nil || isIgnorePath(relDir) {
				continue
			}

			if modPath := filepath.Join(pkgRoots[pkg.PkgPath], "go.mod"); util.FileExists(modPath) {
				ex.extractSingleModFile(modPath)
			}

			// We only need to process each root once.
			break
		}
	}
}

// extractSingleModFile extracts information from a single "go.mod" file.
func (ex *Extraction) extractSingleModFile(modPath string) {
	log.Printf("Extracting %s", modPath)
	start := time.Now()

	if err := ex.extractGoMod(modPath); err != nil {
		log.Printf("Failed to extract go.mod: %s", err)
	}

	duration := time.Since(start)
	log.Printf("Done extracting %s (%dms)", modPath, duration.Milliseconds())
}

// MarkFileAsSeen marks a file as processed in the Extraction object by adding it to FileInfo.
func (ex *Extraction) MarkFileAsSeen(file string) {
	// Create the map if it's nil.
	if ex.FileInfo == nil {
		ex.FileInfo = make(map[string]*FileInfo)
	}
	// Add the file to the map with a placeholder.
	ex.FileInfo[file] = &FileInfo{}
}

// SeenFile checks if a file has been processed.
func (ex *Extraction) SeenFile(file string) bool {
	_, seen := ex.FileInfo[file]
	return seen
}

func (ex *Extraction) GetFileInfo(path string) *FileInfo {
	if fileInfo, ok := ex.FileInfo[path]; ok {
		return fileInfo
	}

	ex.FileInfo[path] = &FileInfo{ex.NextFileID, 0}
	ex.NextFileID += 1

	return ex.FileInfo[path]
}

// GetFileIdx For parsing order
func (ex *Extraction) GetFileIdx(path string) int {
	return ex.GetFileInfo(path).Index
}

// GetNextErr For recording order of parsed error files
func (ex *Extraction) GetNextErr(path string) int {
	finfo := ex.GetFileInfo(path)
	res := finfo.NextErr
	finfo.NextErr += 1
	return res
}

// Close finalizes the extraction process, commits the database transaction, and logs database info.
func (ex *Extraction) Close() {
	if ex.Db != nil {
		if err := orm.CommitTransaction(ex.Db); err != nil {
			log.Println(err)
		}
		fi, err := os.Stat(getDbFile(ex.Config))
		if err != nil {
			util.PrintTracebackAfterDetectedBadEntrance(1, err)
		}
		log.Printf("Successfully created database %v, size:%v \n", getDbFile(ex.Config), util.ByteCountSI(fi.Size()))
	}
}

func getDbFile(c *config.Config) string {
	return filepath.Join(util.GetFileFullPath(c.Store.DBPath), c.Store.DBName)
}

// NewExtraction creates the extraction process, initializes the database connection,
// and records pre-extraction metadata such as configuration parameters.
func NewExtraction(buildFlags []string, patterns []string, c *config.Config) *Extraction {
	lblKey, err := generateLabelKey(buildFlags, patterns)
	if err != nil {
		log.Printf("Failed to generate label key: %v\n", err)
		return nil
	}

	dbfile := getDbFile(c)
	if err := removeExistingDBFile(dbfile); err != nil {
		log.Printf("Failed to remove existing database file: %v\n", err)
		return nil
	}

	wd, err := os.Getwd()
	if err != nil {
		log.Fatalf("Unable to determine current directory: %v\n", err)
		return nil
	}

	db, err := orm.SetupDatabaseAndMigrate(dbfile)
	if err != nil {
		log.Fatalf("Error setting up the database: %v\n", err)
		return nil
	}

	// sets up the initial profile for the extraction process.
	profile, err := NewProfile(c.Store.DBPath, nil, db, &IDGenerator{NextID: 10000}, wd)
	if err != nil {
		util.PrintTracebackAfterDetectedBadEntrance(1, err)
		return nil
	}

	recordCompilationMetadata(profile, lblKey, c, buildFlags, patterns)
	recordRuntimeInfo(profile, lblKey)

	return &Extraction{
		Label:       Label{util.GetIDFromDigest(lblKey, "Lblkey")},
		StatProfile: profile,
		NextFileID:  0, // Start from zero
		IDManager:   IDGenerator{NextID: profile.IDGenerator.NextID},
		FileInfo:    make(map[string]*FileInfo),
		SeenGoMods:  make(map[string]bool),
		Db:          profile.DB,
		Config:      c,
		SrcRootDir:  wd,
	}
}

// generateLabelKey creates a unique key for identification based on the provided build flags and patterns.
func generateLabelKey(buildFlags []string, patterns []string) (string, error) {
	hash := md5.New()
	data := []string{"go"}
	data = append(data, buildFlags...)
	data = append(data, "--")
	data = append(data, patterns...)

	for _, item := range data {
		if _, err := io.WriteString(hash, " "+item); err != nil {
			return "", err
		}
	}

	sum := hash.Sum(nil)
	return fmt.Sprintf("#%s;compilation", hex.EncodeToString(sum)), nil
}

// removeExistingDBFile removes an existing database file if it exists.
func removeExistingDBFile(dbfile string) error {
	if util.FileExists(dbfile) {
		if err := os.Remove(dbfile); err != nil {
			return err
		}
	}
	return nil
}

// recordCompilationMetadata stores metadata related to the compilation environment.
func recordCompilationMetadata(profile *Profile, lblKey string, c *config.Config, buildFlags []string, patterns []string) {
	// Retrieve the extractor path once and handle the error immediately.
	extractorPath, err := util.GetExtractorPath()
	if err != nil {
		log.Fatalf("Unable to get extractor path: %s\n", err)
	}

	// Construct a slice of all arguments to be stored, including the extractor path, build flags,
	// a separator ("--"), and the extraction context info.
	args := append([]string{extractorPath}, buildFlags...)
	args = append(args, "--") // Separator to distinguish between flags and patterns.
	args = append(args, c.ToString())
	args = append(args, patterns...)

	// Store each argument into the profile, incrementing the index for each argument.
	for i, arg := range args {
		compilationArg := orm.CompilationArgs{
			Oid: util.GetIDFromDigest(lblKey, fmt.Sprintf("CompilationArgs#%d", i)),
			Num: i,
			Arg: arg,
		}
		profile.StoreTable(compilationArg)
	}
}

// recordRuntimeInfo stores runtime information for the current extraction process.
func recordRuntimeInfo(profile *Profile, lblKey string) {
	runtimeInfoOID := util.GetIDFromDigest(lblKey, "RuntimeInfo")
	profile.StoreTable(&orm.RuntimeInfo{
		Oid:           runtimeInfoOID,
		BuildVersion:  runtime.Version(),
		ExtractorInfo: fmt.Sprintf("%v@%v by %v Created Time:%v", config.ExtractorVersion, config.ReleaseDate, config.Author, time.Now().Format("200601021504")),
		GoOs:          runtime.GOOS,
		GoArch:        runtime.GOARCH,
	})
}

func (ex *Extraction) toString() string {
	if ex != nil {
		return fmt.Sprintf("srcRootDir: %s Config: %s", ex.SrcRootDir, ex.Config.ToString())
	}
	return ""
}
