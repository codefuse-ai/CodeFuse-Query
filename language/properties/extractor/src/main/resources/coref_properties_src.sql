BEGIN TRANSACTION;
CREATE TABLE IF NOT EXISTS "folder" (
	"element_oid"	INTEGER,
	"relative_path"	TEXT NOT NULL,
	"name"	TEXT NOT NULL,
	"parent_oid"	INTEGER
);
CREATE TABLE IF NOT EXISTS "location" (
	"element_oid"	INTEGER,
	"file_oid"	INTEGER,
	"start_line_number"	INTEGER,
	"start_column_number"	INTEGER,
	"end_line_number"	INTEGER,
	"end_column_number"	INTEGER
);
CREATE TABLE IF NOT EXISTS "comment" (
	"element_oid"	INTEGER,
	"text"	text NOT NULL,
	"parent_oid"	INTEGER NOT NULL,
	"location_oid"	INTEGER NOT NULL
);
CREATE TABLE IF NOT EXISTS "entry" (
	"element_oid"	INTEGER NOT NULL,
	"key"	TEXT NOT NULL,
	"value"	TEXT NOT NULL,
	"printable_text"	TEXT NOT NULL,
	"location_oid"	INTEGER NOT NULL
);
CREATE TABLE IF NOT EXISTS "number_of_lines" (
	"element_oid"	INTEGER NOT NULL,
	"number_of_lines"	INTEGER NOT NULL,
	"number_of_valid_lines"	INTEGER NOT NULL,
	"number_of_comment_lines"	INTEGER NOT NULL
);
CREATE TABLE IF NOT EXISTS "program" (
	"element_oid"	INTEGER NOT NULL,
	"absolute_path_prefix"	TEXT NOT NULL
);
CREATE TABLE IF NOT EXISTS "variable" (
	"element_oid"	INTEGER NOT NULL,
	"parent_oid"	INTEGER NOT NULL,
	"start_index"	INTEGER NOT NULL,
	"name"	TEXT NOT NULL,
	"printable_text"	TEXT NOT NULL
);
CREATE TABLE IF NOT EXISTS "container_parent" (
	"child_oid"	INTEGER NOT NULL,
	"parent_oid"	INTEGER NOT NULL
);
CREATE TABLE IF NOT EXISTS "file" (
	"element_oid"	INTEGER NOT NULL,
	"relative_path"	TEXT NOT NULL,
	"extension"	TEXT NOT NULL,
	"name"	TEXT NOT NULL
);
CREATE TABLE IF NOT EXISTS "empty_line" (
	"element_oid"	INTEGER NOT NULL,
	"location_oid"	INTEGER NOT NULL,
	"file_oid"	INTEGER NOT NULL,
	PRIMARY KEY("element_oid")
);
COMMIT;
