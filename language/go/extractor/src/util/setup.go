package util

import (
	"fmt"
	"log"
	"os"
	"os/exec"
	"path/filepath"
	"runtime"
	"strings"
)

// checkTargetGoInstallInformation checks if the target Go installation is valid and compares its version.
func checkTargetGoInstallInformation(installDir, version string) (string, error) {
	libDir := filepath.Join(installDir, "go", "src")
	targetGoExe := filepath.Join(installDir, "go", "bin", "go")

	for _, dir := range []string{installDir, libDir, targetGoExe} {
		if _, err := os.Stat(dir); os.IsNotExist(err) {
			return "", fmt.Errorf("invalid go package: %v", dir)
		}
	}

	output, err := exec.Command(targetGoExe, "version").CombinedOutput()
	if err != nil {
		return "", fmt.Errorf("unable to run go version: %v", err)
	}
	installVersion := strings.Fields(string(output))[2]

	if installVersion < version {
		if err := RemoveContents(installDir); err != nil {
			return installVersion, fmt.Errorf("unable to remove old version: %v", err)
		}
	}
	return installVersion, nil
}

// configGoEnv sets up the Go environment variables.
func configGoEnv(goRoot string) error {
	envVars := map[string]string{
		"GOROOT":    goRoot,
		"GOPATH":    filepath.Join(goRoot, "project"),
		"PATH":      filepath.Join(goRoot, "bin") + string(os.PathListSeparator) + os.Getenv("PATH"),
		"GOPROXY":   "https://goproxy.cn,direct",
		"GOPRIVATE": "*.alipay.com,*.alipay-inc.com",
	}

	for key, value := range envVars {
		if err := os.Setenv(key, value); err != nil {
			return fmt.Errorf("unable to set %s: %v", key, err)
		}
	}

	return nil
}

// installDesiredGoEnv installs the desired Go version and sets up the environment.
func installDesiredGoEnv(location, version string) (string, error) {
	exe, err := os.Executable()
	if err != nil {
		return "", fmt.Errorf("unable to get executable path: %v", err)
	}
	path := filepath.Dir(exe)

	log.Printf("extracting go sdk")
	script := fmt.Sprintf(`
		set -e
		mkdir -p %q
		rm -rf %q/* 
		tar -C %q -xzf %q/gosdk.tar.gz 
	`, location, location, location, path)
	cmd := exec.Command("/bin/bash", "-c", script)
	cmd.Stdout = os.Stdout
	cmd.Stderr = os.Stderr

	if err := cmd.Run(); err != nil {
		return "", fmt.Errorf("install script failed: %v", err)
	}
	log.Printf("done extracting go sdk")

	goRoot := filepath.Join(location, "go")
	if err := configGoEnv(goRoot); err != nil {
		return "", fmt.Errorf("unable to configure Go environment: %v", err)
	}

	versioning, err := exec.Command(filepath.Join(goRoot, "bin", "go"), "version").CombinedOutput()
	if err != nil {
		return "", fmt.Errorf("unable to run go command: %s", err)
	}
	installedVersion := strings.Fields(string(versioning))[2]
	if installedVersion < version {
		return "", fmt.Errorf("go version must be >= %s, got %s", version, installedVersion)
	}
	return installedVersion, nil
}

// settingUpGoEnv checks the Go installation and sets up the environment.
func settingUpGoEnv(version string) {
	goInstallDir := filepath.Join(os.Getenv("HOME"), "sparrowgoextractor")
	goVersion, err := checkTargetGoInstallInformation(goInstallDir, version)
	if err != nil {
		goVersion, err = installDesiredGoEnv(goInstallDir, version)
		if err != nil {
			log.Fatal(err)
		}
	} else {
		err = configGoEnv(filepath.Join(goInstallDir, "go"))
		if err != nil {
			log.Fatal(err)
		}
	}
	log.Printf("using Go sdk %v-%v-%v", goVersion, runtime.GOOS, runtime.GOARCH)
}

// PrepareRunEnv sets up the Go environment with the minimum required Go version.
func PrepareRunEnv() {
	const minGoVersion = "go1.11"
	settingUpGoEnv(minGoVersion)
}
