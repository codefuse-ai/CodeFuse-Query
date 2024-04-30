package util

import (
	"os"
	"path/filepath"
	"testing"

	"github.com/stretchr/testify/assert"
	"github.com/stretchr/testify/require"
)

var golden = []struct {
	filename string
	algo     string
	hash     string
}{
	{"./util.go", "md5", "6d3b7c7dbbe07422f6cc9163dcc11d33"},
	{"./util.go", "sha256", "d3b66349ffb04e1276cb059df8a514025ce900e8d25980c2453b468d151c3fef"},
}

func TestGetFileDigest(t *testing.T) {
	for _, g := range golden {
		t.Run(g.algo, func(t *testing.T) {
			hash, err := GetFileDigest(g.filename, g.algo)
			require.NoError(t, err, "GetFileDigest should not return an error")
			assert.Equal(t, g.hash, hash, "GetFileDigest should return the correct hash")
		})
	}
}

func TestGetFileFullPath(t *testing.T) {
	curDir, err := os.Getwd()
	assert.NoError(t, err, "os.Getwd should not return an error")

	parentDir, err := filepath.Abs(filepath.Join(curDir, ".."))
	assert.NoError(t, err, "filepath.Abs should not return an error")

	testFilePath := filepath.Join(curDir, "util.go")

	testCases := []struct {
		path     string
		fullpath string
	}{
		{".", curDir},
		{"..", parentDir},
		{"util.go", testFilePath},
		{"../../src/util", curDir},
	}

	for _, tc := range testCases {
		t.Run(tc.path, func(t *testing.T) {
			realPath := GetFileFullPath(tc.path)
			assert.Equal(t, tc.fullpath, realPath, "GetFileFullPath should return the correct full path")
		})
	}
}

func TestGetIDFromDigest(t *testing.T) {
	testCases := []struct {
		content string
		digest  int64
	}{
		{"test", 829678970432003591},
		// The following test case has been adjusted to use a platform-neutral path.
		{"# /path/to/temporary/file", 5363033782971372267},
	}

	for _, tc := range testCases {
		t.Run(tc.content, func(t *testing.T) {
			realVal := GetIDFromDigest(tc.content, "")
			assert.Equal(t, tc.digest, realVal, "GetIDFromDigest should return the correct digest")
		})
	}
}
