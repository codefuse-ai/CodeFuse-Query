package orm

import (
	"errors"
	"fmt"
	"github.com/glebarez/sqlite"
	"gorm.io/gorm"
	"gorm.io/gorm/logger"
	"gorm.io/gorm/schema"
	"log"
	"os"
	"reflect"
	"time"
)

// TablesRegistry is used to register the table list and the entry
// for GORM AutoMigration.
var TablesRegistry = make(map[string]reflect.Type)

// registerType adds a new type to the TablesRegistry using its fully qualified name.
func registerType(typedNil interface{}) {
	t := reflect.TypeOf(typedNil).Elem()
	fullName := t.PkgPath() + "." + t.Name()
	TablesRegistry[fullName] = t
}

// getInstance creates a new instance of the type associated with the given name.
func getInstance(name string) interface{} {
	t, exists := TablesRegistry[name]
	if !exists {
		log.Fatalf("Type %v not found in TablesRegistry", name)
	}
	return reflect.New(t).Interface()
}

// init registers types for all table entities.
func init() {
	// Add all type registrations here using registerType function.
	registerType((*Comment)(nil))
	registerType((*Location)(nil))
	registerType((*HasLocation)(nil))
	registerType((*CommentGroup)(nil))
	registerType((*DocComment)(nil))
	registerType((*TypeOf)(nil))
	registerType((*ArrayLength)(nil))
	registerType((*FieldStruct)(nil))
	registerType((*TypeName)(nil))
	registerType((*TypeObject)(nil))
	registerType((*Def)(nil))
	registerType((*Uses)(nil))
	registerType((*Variadic)(nil))
	registerType((*MethodHost)(nil))
	registerType((*Type)(nil))
	registerType((*NumberOfLine)(nil))
	registerType((*Pkg)(nil))
	registerType((*Expr)(nil))
	registerType((*Literal)(nil))
	registerType((*ConstValue)(nil))
	registerType((*Fields)(nil))
	registerType((*Stmt)(nil))
	registerType((*Decl)(nil))
	registerType((*Spec)(nil))
	registerType((*ElementType)(nil))
	registerType((*Object)(nil))
	registerType((*ObjectScope)(nil))
	registerType((*MethodReceiver)(nil))
	registerType((*KeyType)(nil))
	registerType((*BaseType)(nil))
	registerType((*UnderlyingType)(nil))
	registerType((*ComponentType)(nil))
	registerType((*Scope)(nil))
	registerType((*ScopeNesting)(nil))
	registerType((*ScopeNode)(nil))
	registerType((*ObjectType)(nil))
	registerType((*Typeiadic)(nil))
	registerType((*HasEllipsis)(nil))
	registerType((*ModFile)(nil))
	registerType((*ModRequire)(nil))
	registerType((*ModExpr)(nil))
	registerType((*ModToken)(nil))
	registerType((*DiagnosticFor)(nil))
	registerType((*CompilationFinished)(nil))
	registerType((*Diagnostic)(nil))
	registerType((*Error)(nil))
	registerType((*Compilation)(nil))
	registerType((*CompilationArgs)(nil))
	registerType((*CompilationCompilingFile)(nil))
	registerType((*File)(nil))
	registerType((*Folder)(nil))
	registerType((*ContainerParent)(nil))
	registerType((*RuntimeInfo)(nil))
	registerType((*TypeParamDecls)(nil))
	registerType((*TypeParam)(nil))
	registerType((*UnExtracted)(nil))
	registerType((*FileData)(nil))
}

// SetupDatabaseAndMigrate sets up the database connection and performs schema migration.
func SetupDatabaseAndMigrate(dbPath string) (*gorm.DB, error) {
	db, err := gorm.Open(sqlite.Open(dbPath), &gorm.Config{
		SkipDefaultTransaction: true,
		NamingStrategy: schema.NamingStrategy{
			SingularTable: true,
		},
		Logger: logger.New(log.New(os.Stdout, "\r\n", log.LstdFlags), logger.Config{
			SlowThreshold:             10 * time.Second,
			LogLevel:                  logger.Warn,
			IgnoreRecordNotFoundError: false,
			Colorful:                  true,
		}),
	})
	if err != nil {
		return nil, fmt.Errorf("failed to connect to database: %v", err)
	}

	// Set SQLite pragmas
	if err := db.Exec("PRAGMA synchronous = OFF").Error; err != nil {
		return nil, fmt.Errorf("failed to set PRAGMA synchronous: %v", err)
	}
	if err := db.Exec("PRAGMA journal_mode = MEMORY").Error; err != nil {
		return nil, fmt.Errorf("failed to set PRAGMA journal_mode: %v", err)
	}

	// Perform schema migration
	for k := range TablesRegistry {
		entity := getInstance(k) // Assume getInstance is a function that returns an entity based on a key
		if err := db.AutoMigrate(entity); err != nil {
			return nil, fmt.Errorf("DB AutoMigrate failed for %v: %w", k, err)
		}
	}

	// Begin transaction here
	tx := db.Begin()
	if tx.Error != nil {
		log.Fatalf("Create Db transaction error:%v\n", tx.Error)
	}

	return tx, nil
}

// WriteRecord inserts a new record into the database using GORM's Create.
// If the operation fails, it returns the error.
func WriteRecord(db *gorm.DB, value interface{}) error {
	if db == nil {
		return errors.New("db cannot be nil")
	}
	if value == nil {
		return errors.New("value to insert cannot be nil")
	}

	if err := db.Create(value).Error; err != nil {
		db.Rollback()
		return err
	}
	return nil
}

// CommitTransaction commits the ongoing transaction.
func CommitTransaction(tx *gorm.DB) error {
	if tx == nil {
		return errors.New("transaction cannot be nil")
	}
	return tx.Commit().Error
}
