package core

import (
	"alipay.com/code_insight/coref-go-extractor/src/config"
	"alipay.com/code_insight/coref-go-extractor/src/orm"
	"go/ast"
	"go/types"
	"golang.org/x/tools/go/packages"
	"gorm.io/gorm"
	"log"
	"os"
	"sync"
)

// IDGenerator provides a thread-safe mechanism for generating unique IDs.
type IDGenerator struct {
	sync.Mutex // Embedding the mutex for simplicity, provides Lock and Unlock methods.
	NextID     int64
}

// FileInfo holds metadata about a specific file.
type FileInfo struct {
	Index   int // Index of the file.
	NextErr int // Next error code for the file.
}

// Extraction manages the state and configuration for the extraction process.
type Extraction struct {
	sync.Mutex              // Protects concurrent access to the fields.
	Label       Label       // Initial label point.
	StatProfile *Profile    // Profile for database stats.
	IDManager   IDGenerator // Local ID generator.
	WaitGroup   sync.WaitGroup

	NextFileID int                  // Index of the next parsed file.
	FileInfo   map[string]*FileInfo // Information about each file.
	SeenGoMods map[string]bool      // Tracks whether a go.mod file has been resolved.

	Db         *gorm.DB       // Database connection.
	Config     *config.Config // Configuration settings.
	SrcRootDir string         // Root directory of source files.
}

// Profile represents the profiling data for a specific file.
type Profile struct {
	SrcRoot         string
	Labeler         *Labeler
	DB              *gorm.DB
	File            *os.File
	Path            string
	IDGenerator     *IDGenerator
	Package         *packages.Package
	TypesOverride   map[ast.Expr]types.Type
	ObjectsOverride map[types.Object]types.Object
}

// NewProfile creates a new Profile instance for capturing profiling data.
func NewProfile(path string, pkg *packages.Package, db *gorm.DB, idGen *IDGenerator, srcRoot string) (*Profile, error) {
	profile := &Profile{
		SrcRoot:         srcRoot,
		DB:              db,
		Path:            path,
		IDGenerator:     idGen,
		Package:         pkg,
		TypesOverride:   make(map[ast.Expr]types.Type),
		ObjectsOverride: make(map[types.Object]types.Object),
	}
	profile.Labeler = newLabeler(profile)
	return profile, nil
}

// StoreTable add one record to the Gorm
func (p *Profile) StoreTable(value interface{}) {
	if err := orm.WriteRecord(p.DB, value); err != nil {
		log.Fatalf("[Extraction Stop] DB write encounter err:%v", err)
	}
}
