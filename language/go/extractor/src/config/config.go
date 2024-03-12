package config

import (
	"encoding/json"
)

var (
	ExtractorVersion = "v0.0.8"
	ReleaseDate      = "2022-07-17"
	Author           = "CodeInsight@AntGroup"
)

type OrmDesc struct {
	DBDialect string `json:"db_dialect"` // Database Dialect, such as `sqlite3`
	DBName    string `json:"db_name"`    // Database Name
	DBPath    string `json:"db_path"`    // Database path for storing on disk
}

type ParseConfig struct {
	NeedCompile bool `json:"need_compile"` // Parse compiled Go files
	NeedScope   bool `json:"need_scope"`   // Parse Scope
	NeedTests   bool `json:"need_tests"`   // Parse including Go test files, enabled by default
	NeedModFile bool `json:"need_modfile"` // Parse mod.go file
}

type Config struct {
	Store     *OrmDesc     `json:"store"`      // Database Description struct
	ParseRule *ParseConfig `json:"parse_rule"` // Parsing rules
}

func (c *Config) ToString() string {
	jsonStr, err := json.Marshal(c)
	if err != nil {
		return err.Error()
	}
	return string(jsonStr)
}
