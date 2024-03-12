package util

import (
	"crypto/md5"
	"crypto/sha256"
	"encoding/hex"
	"fmt"
	"hash"
	"hash/fnv"
	"io"
	"log"
	"os"
	"os/exec"
	"path/filepath"
	"runtime"
	"strings"
)

var extractorPath string

// Getenv retrieves the value of the environment variable named by the key.
// If that variable is not present, it iterates over the given aliases until
// it finds one that is. If none are present, the empty string is returned.
func Getenv(key string, aliases ...string) string {
	val := os.Getenv(key)
	if val != "" {
		return val
	}
	for _, alias := range aliases {
		val = os.Getenv(alias)
		if val != "" {
			return val
		}
	}
	return ""
}

// runGoList is a helper function for running go list with format `format` and flags `flags` on
// package `pkgpath`.
func runGoList(format string, pkgpath string, flags ...string) (string, error) {
	return runGoListWithEnv(format, pkgpath, nil, flags...)
}

func runGoListWithEnv(format string, pkgpath string, additionalEnv []string, flags ...string) (string, error) {
	args := append([]string{"list", "-e", "-f", format}, flags...)
	args = append(args, pkgpath)
	cmd := exec.Command("go", args...)
	cmd.Env = append(os.Environ(), additionalEnv...)
	out, err := cmd.CombinedOutput()
	if err != nil {
		log.Printf("Warning: go list command failed with error: %s\nOutput:\n%s\n", err.Error(), out)
		return "", err
	}
	return strings.TrimSpace(string(out)), nil
}

// GetModDir gets the absolute directory of the module containing the package with path `pkgpath`.
// It passes the `go list` the flags specified by `flags`.
func GetModDir(pkgpath string, flags ...string) string {
	modDir, err := runGoListWithEnv("{{.Module.Dir}}", pkgpath, []string{"GO111MODULE=on"}, flags...)
	if err != nil {
		return ""
	}
	absModDir, err := filepath.Abs(modDir)
	if err != nil {
		log.Printf("Warning: unable to make %s absolute: %s", modDir, err.Error())
		return ""
	}
	return absModDir
}

// GetPkgDir gets the absolute directory containing the package with path `pkgpath`.
// It passes the `go list` command the flags specified by `flags`.
func GetPkgDir(pkgpath string, flags ...string) string {
	pkgDir, err := runGoList("{{.Dir}}", pkgpath, flags...)
	if err != nil {
		return ""
	}
	absPkgDir, err := filepath.Abs(pkgDir)
	if err != nil {
		log.Printf("Warning: unable to make %s absolute: %s", pkgDir, err.Error())
		return ""
	}
	return absPkgDir
}

// FileExists tests whether the file at `filename` exists and is not a directory.
func FileExists(filename string) bool {
	info, err := os.Stat(filename)
	if err != nil {
		if !os.IsNotExist(err) {
			log.Printf("Unable to stat %s: %s\n", filename, err.Error())
		}
		return false
	}
	return !info.IsDir()
}

// DirExists tests whether `filename` exists and is a directory.
func DirExists(filename string) bool {
	info, err := os.Stat(filename)
	if err != nil {
		if !os.IsNotExist(err) {
			log.Printf("Unable to stat %s: %s\n", filename, err.Error())
		}
		return false
	}
	return info.IsDir()
}

// RunCmd runs a command and logs any errors without stopping the execution.
func RunCmd(cmd *exec.Cmd) error {
	cmd.Stdout = os.Stdout
	cmd.Stderr = os.Stderr
	if err := cmd.Start(); err != nil {
		return err
	}
	if err := cmd.Wait(); err != nil {
		return err
	}
	return nil
}

// getOsToolsSubdir determines the subdirectory name based on the OS.
func getOsToolsSubdir() (string, error) {
	platform := Getenv("PLATFORM")
	if platform != "" {
		return platform, nil
	}
	switch runtime.GOOS {
	case "darwin":
		return "osx64", nil
	case "linux":
		return "linux64", nil
	default:
		return "", fmt.Errorf("unsupported OS: %s", runtime.GOOS)
	}
}

// getExtractorDir computes the directory for the extractor.
func getExtractorDir() (string, error) {
	extractorRoot := Getenv("EXTRACTOR_GO_ROOT")
	if extractorRoot == "" {
		log.Println("Falling back to guess the root based on this executable's path.")
		mypath, err := os.Executable()
		if err != nil {
			return "", fmt.Errorf("EXTRACTOR_GO_ROOT not set, and could not determine path of this executable: %v", err)
		}
		return filepath.Dir(mypath), nil
	}

	osSubdir, err := getOsToolsSubdir()
	if err != nil {
		return "", err
	}
	return filepath.Join(extractorRoot, "tools", osSubdir), nil
}

// GetExtractorPath retrieves the path to the go-extractor.
func GetExtractorPath() (string, error) {
	if extractorPath != "" {
		return extractorPath, nil
	}
	dir, err := getExtractorDir()
	if err != nil {
		return "", err
	}
	extractorPath = filepath.Join(dir, "go-extractor")
	return extractorPath, nil
}

// EscapeTrapSpecialChars replaces special characters with their HTML entities.
func EscapeTrapSpecialChars(s string) string {
	specialChars := map[string]string{
		"&":  "&amp;",
		"{":  "&lbrace;",
		"}":  "&rbrace;",
		"\"": "&quot;",
		"@":  "&commat;",
		"#":  "&num;",
	}
	for old, new := range specialChars {
		s = strings.ReplaceAll(s, old, new)
	}
	return s
}

// RemoveContents removes all the contents in the specified directory.
func RemoveContents(dir string) error {
	d, err := os.Open(dir)
	if err != nil {
		return err
	}
	defer d.Close()

	names, err := d.Readdirnames(-1)
	if err != nil {
		return err
	}
	for _, name := range names {
		err := os.RemoveAll(filepath.Join(dir, name))
		if err != nil {
			return err
		}
	}
	return nil
}

// PrintTracebackAfterDetectedBadEntrance prints the caller after detecting a bad entrance.
// args should be passed with [error, [shouldExit]]
// where 'error' is the error msg and shouldExit is a boolean value indicating if the program should exit.
func PrintTracebackAfterDetectedBadEntrance(skip int, args ...interface{}) {
	var msg string
	var shouldStop bool

	for i, arg := range args {
		switch v := arg.(type) {
		case error:
			if i == 0 {
				msg = v.Error()
			}
		case bool:
			if i == 1 {
				shouldStop = v
			}
		default:
			msg = fmt.Sprintf("%v %v", msg, arg)
		}
	}

	pc, fn, line, ok := runtime.Caller(skip + 1)
	var printMsg string
	if ok {
		printMsg = fmt.Sprintf("[BadEntrance] in %s[%s:%d] %v",
			runtime.FuncForPC(pc).Name(), fn, line, msg)
	} else {
		printMsg = fmt.Sprintf("[BadEntrance] %v", msg)
	}

	if shouldStop {
		log.Fatalf(printMsg)
	} else {
		log.Printf(printMsg)
	}
}

// ByteCountSI converts a size in bytes to a human-readable string in SI (decimal) format.
func ByteCountSI(b int64) string {
	const unit = 1000
	if b < unit {
		return fmt.Sprintf("%d B", b)
	}
	div, exp := int64(unit), 0
	for n := b / unit; n >= unit; n /= unit {
		div *= unit
		exp++
	}
	return fmt.Sprintf("%.1f %cB", float64(b)/float64(div), "kMGTPE"[exp])
}

// ReadFile reads the content of a file by path as input parameter and returns the content or an error.
func ReadFile(path string) ([]byte, error) {
	file, err := os.Open(path)
	if err != nil {
		return nil, err
	}
	defer file.Close()

	fileInfo, err := file.Stat()
	if err != nil {
		return nil, err
	}
	fileSize := fileInfo.Size()
	buffer := make([]byte, fileSize)

	_, err = file.Read(buffer)
	if err != nil {
		return nil, err
	}
	return buffer, nil
}

// GetFileDigest calculates the hash digest of a file using the specified algorithm.
// Supported algorithms are "md5" and "sha256".
// It returns a hex-encoded hash string and any error encountered.
func GetFileDigest(file, algo string) (string, error) {
	f, err := os.Open(file)
	if err != nil {
		return "", fmt.Errorf("failed to open file: %v", err)
	}
	defer func() {
		if cerr := f.Close(); cerr != nil {
			log.Printf("Failed to close file: %v\n", cerr)
		}
	}()

	var m hash.Hash
	switch algo {
	case "md5":
		m = md5.New()
	case "sha256":
		m = sha256.New()
	default:
		return "", fmt.Errorf("unsupported hash algorithm: %s", algo)
	}

	if _, err := io.Copy(m, f); err != nil {
		PrintTracebackAfterDetectedBadEntrance(1, err)
	}

	return hex.EncodeToString(m.Sum(nil)), nil
}

// GetIDFromDigest Generate an int64 ID with hash for a given string
func GetIDFromDigest(str, surfix string) int64 {
	h := fnv.New64a()
	format := fmt.Sprintf("coref://go?digest=%s#%s", str, surfix)
	_, err := h.Write([]byte(format))
	if err != nil {
		return 0
	}
	return int64(h.Sum64())
}

// GetFileFullPath Wrapper to return an absolute representation of path.
func GetFileFullPath(f string) string {
	abs, err := filepath.Abs(f)
	if err == nil {
		return abs
	}
	return ""
}

func MaxParallelism() int {
	maxProcs := runtime.GOMAXPROCS(0)
	numCPU := runtime.NumCPU()
	if maxProcs > numCPU {
		return numCPU
	}
	return maxProcs
}

// DirExistsAndClean checks if a directory exists and cleans its contents if it does.
func DirExistsAndClean(dirPath string) error {
	// Check if the directory exists
	if _, err := os.Stat(dirPath); os.IsNotExist(err) {
		// Directory does not exist, nothing to clean
		return nil
	} else if err != nil {
		// An error other than "not exist" occurred
		return err
	}

	// Directory exists, read all of its contents
	files, err := os.ReadDir(dirPath)
	if err != nil {
		return err
	}

	// Loop through and delete each file
	for _, file := range files {
		// Generate the full path for the file or directory
		fullPath := filepath.Join(dirPath, file.Name())

		// Remove the file or directory
		if err := os.RemoveAll(fullPath); err != nil {
			return err
		}
	}

	return nil
}
