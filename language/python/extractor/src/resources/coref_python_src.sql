BEGIN TRANSACTION;
CREATE TABLE IF NOT EXISTS "metainfo" (
	"oid"	INTEGER,
	"kind"	TEXT,
	"value"	TEXT,
	"program_oid"	INTEGER
);
CREATE TABLE IF NOT EXISTS "location" (
	"element_oid"	INTEGER NOT NULL,
	"file_oid"	INTEGER NOT NULL,
	"start_line_number"	INTEGER NOT NULL,
	"start_column_number"	INTEGER NOT NULL,
	"end_line_number"	INTEGER NOT NULL,
	"end_column_number"	INTEGER NOT NULL,
	PRIMARY KEY("element_oid")
);
CREATE TABLE IF NOT EXISTS "folder" (
	"element_oid"	INTEGER NOT NULL,
	"qualified_name"	TEXT NOT NULL,
	"name"	TEXT NOT NULL,
	"parent_oid"	INTEGER NOT NULL,
	PRIMARY KEY("element_oid")
);
CREATE TABLE IF NOT EXISTS "augmented_assignment_statement" (
	"element_oid"	INTEGER NOT NULL,
	"op_code"	TEXT NOT NULL,
	"target_expr_oid"	INTEGER NOT NULL,
	"value_expr_oid"	INTEGER NOT NULL,
	PRIMARY KEY("element_oid")
);
CREATE TABLE IF NOT EXISTS "await_expression" (
	"element_oid"	INTEGER NOT NULL,
	"expr_value_oid"	INTEGER NOT NULL,
	PRIMARY KEY("element_oid")
);
CREATE TABLE IF NOT EXISTS "callable_binding" (
	"caller_oid"	INTEGER NOT NULL,
	"callee_oid"	INTEGER NOT NULL,
	PRIMARY KEY("caller_oid")
);
CREATE TABLE IF NOT EXISTS "cmpop" (
	"element_oid"	INTEGER NOT NULL,
	"value"	INTEGER NOT NULL,
	"location_oid"	INTEGER NOT NULL,
	"parent_oid"	INTEGER NOT NULL,
	PRIMARY KEY("element_oid")
);
CREATE TABLE IF NOT EXISTS "comment" (
	"element_oid"	INTEGER NOT NULL,
	"text"	text NOT NULL,
	"parent_oid"	INTEGER NOT NULL,
	"location_oid"	INTEGER NOT NULL,
	PRIMARY KEY("element_oid")
);
CREATE TABLE IF NOT EXISTS "container_parent" (
	"child_oid"	INTEGER NOT NULL,
	"parent_oid"	INTEGER NOT NULL,
	PRIMARY KEY("child_oid")
);
CREATE TABLE IF NOT EXISTS "yield_from_expression" (
	"element_oid"	INTEGER NOT NULL,
	"value"	INTEGER NOT NULL,
	PRIMARY KEY("element_oid")
);
CREATE TABLE IF NOT EXISTS "variable" (
	"element_oid"	INTEGER NOT NULL,
	"parent_oid"	INTEGER NOT NULL,
	"location_oid"	INTEGER NOT NULL,
	"printable_text"	TEXT NOT NULL,
	"name"	TEXT NOT NULL,
	PRIMARY KEY("element_oid")
);
CREATE TABLE IF NOT EXISTS "unary_op" (
	"element_oid"	INTEGER NOT NULL,
	"type"	TEXT NOT NULL,
	"location_oid"	INTEGER NOT NULL,
	"parent_oid"	INTEGER NOT NULL,
	PRIMARY KEY("element_oid")
);
CREATE TABLE IF NOT EXISTS "continue_statement" (
	"element_oid"	INTEGER NOT NULL,
	PRIMARY KEY("element_oid")
);
CREATE TABLE IF NOT EXISTS "file_md5_sum" (
	"file_oid"	INTEGER NOT NULL,
	"value"	TEXT NOT NULL,
	PRIMARY KEY("file_oid")
);
CREATE TABLE IF NOT EXISTS "file_sha256_sum" (
	"file_oid"	INTEGER NOT NULL,
	"value"	TEXT NOT NULL,
	PRIMARY KEY("file_oid")
);
CREATE TABLE IF NOT EXISTS "global_statement" (
	"element_oid"	INTEGER NOT NULL,
	"names"	TEXT NOT NULL,
	PRIMARY KEY("element_oid")
);
CREATE TABLE IF NOT EXISTS "mod" (
	"element_oid"	INTEGER NOT NULL,
	"type"	TEXT NOT NULL,
	"location_oid"	INTEGER NOT NULL,
	PRIMARY KEY("element_oid")
);
CREATE TABLE IF NOT EXISTS "named_expression" (
	"element_oid"	INTEGER NOT NULL,
	"target_oid"	INTEGER NOT NULL,
	"value_oid"	INTEGER NOT NULL,
	PRIMARY KEY("element_oid")
);
CREATE TABLE IF NOT EXISTS "non_local_statement" (
	"element_oid"	INTEGER NOT NULL,
	"names"	INTEGER NOT NULL,
	PRIMARY KEY("element_oid")
);
CREATE TABLE IF NOT EXISTS "number_of_lines" (
	"element_oid"	INTEGER NOT NULL,
	"number_of_total_lines"	INTEGER,
	"number_of_valid_lines"	INTEGER,
	"number_of_comment_lines"	INTEGER,
	PRIMARY KEY("element_oid")
);
CREATE TABLE IF NOT EXISTS "operator" (
	"element_oid"	INTEGER NOT NULL,
	"location_oid"	INTEGER,
	"parent_oid"	INTEGER,
	"printable_text"	TEXT,
	PRIMARY KEY("element_oid")
);
CREATE TABLE IF NOT EXISTS "parent" (
	"parent_oid"	INTEGER NOT NULL,
	"parent_type"	TEXT NOT NULL,
	PRIMARY KEY("parent_oid")
);
CREATE TABLE IF NOT EXISTS "pass_statement" (
	"element_oid"	INTEGER NOT NULL,
	PRIMARY KEY("element_oid")
);
CREATE TABLE IF NOT EXISTS "program" (
	"program_oid"	INTEGER NOT NULL,
	"absolute_prefix_path"	TEXT NOT NULL,
	PRIMARY KEY("program_oid")
);
CREATE TABLE IF NOT EXISTS "reference_relation" (
	"reference_element_oid"	INTEGER NOT NULL,
	"definition_element_oid"	INTEGER NOT NULL,
	PRIMARY KEY("reference_element_oid")
);
CREATE TABLE IF NOT EXISTS "token" (
	"element_oid"	INTEGER NOT NULL,
	"value"	TEXT NOT NULL,
	"location_oid"	INTEGER,
	"parent_oid"	INTEGER,
	PRIMARY KEY("element_oid")
);
CREATE TABLE IF NOT EXISTS "docstring_comment" (
	"element_oid"	INTEGER NOT NULL,
	"text"	TEXT NOT NULL,
	"documented_element_oid"	INTEGER NOT NULL,
	PRIMARY KEY("element_oid")
);
CREATE TABLE IF NOT EXISTS "arguments" (
	"element_oid"	INTEGER NOT NULL,
	"parent_oid"	INTEGER NOT NULL,
	"printable_text"	TEXT NOT NULL,
	PRIMARY KEY("element_oid")
);
CREATE TABLE IF NOT EXISTS "expr_context" (
	"element_oid"	INTEGER NOT NULL,
	"parent_oid"	INTEGER NOT NULL,
	"printable_text"	TEXT NOT NULL,
	PRIMARY KEY("element_oid")
);
CREATE TABLE IF NOT EXISTS "with_item" (
	"element_oid"	INTEGER NOT NULL,
	"printable_text"	TEXT NOT NULL,
	"element_index"	INTEGER NOT NULL,
	"parent_oid"	INTEGER NOT NULL,
	PRIMARY KEY("element_oid")
);
CREATE TABLE IF NOT EXISTS "except_handler" (
	"element_oid"	INTEGER NOT NULL,
	"element_index"	INTEGER NOT NULL,
	"parent_oid"	INTEGER NOT NULL,
	"location_oid"	INTEGER NOT NULL,
	"printable_text"	TEXT NOT NULL,
	PRIMARY KEY("element_oid")
);
CREATE TABLE IF NOT EXISTS "alias" (
	"element_oid"	INTEGER NOT NULL,
	"name"	TEXT NOT NULL,
	"asname"	TEXT NOT NULL,
	"element_index"	INTEGER NOT NULL,
	"parent_oid"	INTEGER NOT NULL,
	"location_oid"	INTEGER NOT NULL,
	"printable_text"	TEXT NOT NULL,
	PRIMARY KEY("element_oid")
);
CREATE TABLE IF NOT EXISTS "arg" (
	"element_oid"	INTEGER NOT NULL,
	"annotation"	INTEGER NOT NULL,
	"element_index"	INTEGER NOT NULL,
	"parent_oid"	INTEGER NOT NULL,
	"location_oid"	INTEGER NOT NULL,
	"printable_text"	TEXT NOT NULL,
	PRIMARY KEY("element_oid")
);
CREATE TABLE IF NOT EXISTS "slice" (
	"element_oid"	INTEGER NOT NULL,
	"element_index"	INTEGER NOT NULL,
	"parent_oid"	INTEGER NOT NULL,
	"location_oid"	INTEGER NOT NULL,
	"printable_text"	TEXT NOT NULL,
	"has_step"	INTEGER NOT NULL,
	PRIMARY KEY("element_oid")
);
CREATE TABLE IF NOT EXISTS "match_case" (
	"element_oid"	INTEGER NOT NULL,
	"pattern_oid"	INTEGER NOT NULL,
	"element_index"	INTEGER NOT NULL,
	"parent_oid"	INTEGER NOT NULL,
	"location_oid"	INTEGER NOT NULL,
	"printable_text"	TEXT NOT NULL,
	"is_default"	INTEGER NOT NULL,
	PRIMARY KEY("element_oid")
);
CREATE TABLE IF NOT EXISTS "element" (
	"oid"	INTEGER NOT NULL,
	"value"	TEXT NOT NULL,
	"type"	TEXT NOT NULL,
	"parent_oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);
CREATE TABLE IF NOT EXISTS "statement" (
	"element_oid"	INTEGER NOT NULL,
	"type"	TEXT NOT NULL,
	"element_index"	INTEGER NOT NULL,
	"parent_oid"	INTEGER NOT NULL,
	"location_oid"	INTEGER NOT NULL,
	"printable_text"	TEXT NOT NULL,
	PRIMARY KEY("element_oid")
);
CREATE TABLE IF NOT EXISTS "return_statement" (
	"element_oid"	INTEGER NOT NULL,
	"is_return_empty"	INTEGER NOT NULL,
	PRIMARY KEY("element_oid")
);
CREATE TABLE IF NOT EXISTS "while_statement" (
	"element_oid"	INTEGER NOT NULL,
	PRIMARY KEY("element_oid")
);
CREATE TABLE IF NOT EXISTS "try_statement" (
	"element_oid"	INTEGER NOT NULL,
	PRIMARY KEY("element_oid")
);
CREATE TABLE IF NOT EXISTS "match_statement" (
	"element_oid"	INTEGER NOT NULL,
	"subject_oid"	INTEGER NOT NULL,
	PRIMARY KEY("element_oid")
);
CREATE TABLE IF NOT EXISTS "import_statement" (
	"element_oid"	INTEGER NOT NULL,
	PRIMARY KEY("element_oid")
);
CREATE TABLE IF NOT EXISTS "import_from_statement" (
	"element_oid"	INTEGER NOT NULL,
	"module"	text NOT NULL,
	"level"	INTEGER NOT NULL,
	PRIMARY KEY("element_oid")
);
CREATE TABLE IF NOT EXISTS "if_statement" (
	"element_oid"	INTEGER NOT NULL,
	PRIMARY KEY("element_oid")
);
CREATE TABLE IF NOT EXISTS "function_def_statement" (
	"element_oid"	INTEGER NOT NULL,
	"name"	TEXT NOT NULL,
	PRIMARY KEY("element_oid")
);
CREATE TABLE IF NOT EXISTS "for_statement" (
	"element_oid"	INTEGER NOT NULL,
	PRIMARY KEY("element_oid")
);
CREATE TABLE IF NOT EXISTS "class_def_statement" (
	"element_oid"	INTEGER NOT NULL,
	"name"	TEXT NOT NULL,
	PRIMARY KEY("element_oid")
);
CREATE TABLE IF NOT EXISTS "break_statement" (
	"element_oid"	INTEGER NOT NULL,
	PRIMARY KEY("element_oid")
);
CREATE TABLE IF NOT EXISTS "expression" (
	"element_oid"	INTEGER NOT NULL,
	"type"	TEXT NOT NULL,
	"element_index"	INTEGER NOT NULL,
	"parent_oid"	INTEGER NOT NULL,
	"location_oid"	INTEGER NOT NULL,
	"printable_text"	TEXT NOT NULL,
	PRIMARY KEY("element_oid")
);
CREATE TABLE IF NOT EXISTS "name_expression" (
	"element_oid"	INTEGER NOT NULL,
	"ctx_type"	TEXT NOT NULL,
	PRIMARY KEY("element_oid")
);
CREATE TABLE IF NOT EXISTS "bin_op_expression" (
	"element_oid"	INTEGER NOT NULL,
	"left_expr_oid"	INTEGER NOT NULL,
	"opcode"	INTEGER NOT NULL,
	"right_expr_oid"	INTEGER NOT NULL,
	PRIMARY KEY("element_oid")
);
CREATE TABLE IF NOT EXISTS "call_expression" (
	"element_oid"	INTEGER NOT NULL,
	"expr_func_oid"	INTEGER NOT NULL,
	PRIMARY KEY("element_oid")
);
CREATE TABLE IF NOT EXISTS "constant" (
	"element_oid"	INTEGER NOT NULL,
	"value"	TEXT NOT NULL,
	PRIMARY KEY("element_oid")
);
CREATE TABLE IF NOT EXISTS "if_expression" (
	"element_oid"	INTEGER NOT NULL,
	PRIMARY KEY("element_oid")
);
CREATE TABLE IF NOT EXISTS "attribute_expression" (
	"element_oid"	INTEGER NOT NULL,
	"value_oid"	INTEGER NOT NULL,
	"ctx_type"	TEXT NOT NULL,
	PRIMARY KEY("element_oid")
);
CREATE TABLE IF NOT EXISTS "expression_statement" (
	"element_oid"	INTEGER NOT NULL,
	"value_oid"	INTEGER NOT NULL,
	PRIMARY KEY("element_oid")
);
CREATE TABLE IF NOT EXISTS "formatted_value_expression" (
	"element_oid"	INTEGER NOT NULL,
	"value_oid"	INTEGER NOT NULL,
	PRIMARY KEY("element_oid")
);
CREATE TABLE IF NOT EXISTS "compare_expression" (
	"element_oid"	INTEGER NOT NULL,
	"left_expr_oid"	INTEGER NOT NULL,
	PRIMARY KEY("element_oid")
);
CREATE TABLE IF NOT EXISTS "subscript_expression" (
	"element_oid"	INTEGER NOT NULL,
	"value_oid"	INTEGER NOT NULL,
	"slice_oid"	INTEGER NOT NULL,
	"ctx"	TEXT NOT NULL,
	PRIMARY KEY("element_oid")
);
CREATE TABLE IF NOT EXISTS "dict_expression" (
	"element_oid"	INTEGER NOT NULL,
	"size"	INTEGER NOT NULL,
	PRIMARY KEY("element_oid")
);
CREATE TABLE IF NOT EXISTS "comprehension" (
	"element_oid"	INTEGER NOT NULL,
	"target_expr_oid"	INTEGER NOT NULL,
	"iter_expr_oid"	INTEGER NOT NULL,
	"element_index"	INTEGER NOT NULL,
	"parent_oid"	INTEGER NOT NULL,
	"printable_text"	TEXT NOT NULL,
	PRIMARY KEY("element_oid")
);
CREATE TABLE IF NOT EXISTS "dict_comp_expression" (
	"element_oid"	INTEGER NOT NULL,
	"comprehension_size"	INTEGER NOT NULL,
	PRIMARY KEY("element_oid")
);
CREATE TABLE IF NOT EXISTS "generator_expression" (
	"element_oid"	INTEGER NOT NULL,
	"elt_oid"	INTEGER NOT NULL,
	PRIMARY KEY("element_oid")
);
CREATE TABLE IF NOT EXISTS "joined_str_expression" (
	"element_oid"	INTEGER NOT NULL,
	"size"	INTEGER NOT NULL,
	PRIMARY KEY("element_oid")
);
CREATE TABLE IF NOT EXISTS "lambda_expression" (
	"element_oid"	INTEGER NOT NULL,
	PRIMARY KEY("element_oid")
);
CREATE TABLE IF NOT EXISTS "list_expression" (
	"element_oid"	INTEGER NOT NULL,
	"elt_size"	INTEGER NOT NULL,
	"ctx"	TEXT NOT NULL,
	PRIMARY KEY("element_oid")
);
CREATE TABLE IF NOT EXISTS "list_comp_expression" (
	"element_oid"	INTEGER NOT NULL,
	"elt_oid"	INTEGER NOT NULL,
	"generator_size"	INTEGER NOT NULL,
	PRIMARY KEY("element_oid")
);
CREATE TABLE IF NOT EXISTS "set_expression" (
	"element_oid"	INTEGER NOT NULL,
	"elt_size"	INTEGER NOT NULL,
	PRIMARY KEY("element_oid")
);
CREATE TABLE IF NOT EXISTS "set_comp_expression" (
	"element_oid"	INTEGER NOT NULL,
	"elt_oid"	INTEGER NOT NULL,
	"generator_size"	INTEGER NOT NULL,
	PRIMARY KEY("element_oid")
);
CREATE TABLE IF NOT EXISTS "starred_expression" (
	"element_oid"	INTEGER NOT NULL,
	"ctx"	TEXT NOT NULL,
	PRIMARY KEY("element_oid")
);
CREATE TABLE IF NOT EXISTS "tuple_expression" (
	"element_oid"	INTEGER NOT NULL,
	"elt_size"	INTEGER NOT NULL,
	"ctx"	TEXT NOT NULL,
	PRIMARY KEY("element_oid")
);
CREATE TABLE IF NOT EXISTS "unary_op_expression" (
	"element_oid"	INTEGER NOT NULL,
	"op_code"	TEXT NOT NULL,
	"operand_oid"	INTEGER NOT NULL,
	PRIMARY KEY("element_oid")
);
CREATE TABLE IF NOT EXISTS "assignment_statement" (
	"element_oid"	INTEGER NOT NULL,
	"value_oid"	INTEGER NOT NULL,
	"targets_size"	INTEGER NOT NULL,
	PRIMARY KEY("element_oid")
);
CREATE TABLE IF NOT EXISTS "assert_statement" (
	"element_oid"	INTEGER NOT NULL,
	"assert_condition_oid"	INTEGER NOT NULL,
	PRIMARY KEY("element_oid")
);
CREATE TABLE IF NOT EXISTS "with_statement" (
	"element_oid"	INTEGER NOT NULL,
	PRIMARY KEY("element_oid")
);
CREATE TABLE IF NOT EXISTS "delete_statement" (
	"element_oid"	INTEGER NOT NULL,
	"targets_size"	INTEGER NOT NULL,
	PRIMARY KEY("element_oid")
);
CREATE TABLE IF NOT EXISTS "raise_statement" (
	"element_oid"	INTEGER NOT NULL,
	PRIMARY KEY("element_oid")
);
CREATE TABLE IF NOT EXISTS "async_function_def_statement" (
	"element_oid"	INTEGER NOT NULL,
	"name"	TEXT NOT NULL,
	PRIMARY KEY("element_oid")
);
CREATE TABLE IF NOT EXISTS "async_with_statement" (
	"element_oid"	INTEGER NOT NULL,
	PRIMARY KEY("element_oid")
);
CREATE TABLE IF NOT EXISTS "async_for_statement" (
	"element_oid"	INTEGER NOT NULL,
	PRIMARY KEY("element_oid")
);
CREATE TABLE IF NOT EXISTS "annotation_assignment_statement" (
	"element_oid"	INTEGER NOT NULL,
	"annotation_oid"	INTEGER NOT NULL,
	"target_oid"	INTEGER NOT NULL,
	"is_simple"	INTEGER NOT NULL,
	PRIMARY KEY("element_oid")
);
CREATE TABLE IF NOT EXISTS "yield_expression" (
	"element_oid"	INTEGER NOT NULL,
	PRIMARY KEY("element_oid")
);
CREATE TABLE IF NOT EXISTS "file" (
	"element_oid"	INTEGER NOT NULL,
	"relative_path"	TEXT NOT NULL,
	"extension"	TEXT NOT NULL,
	"name"	TEXT NOT NULL,
	"number_of_lines_oid"	INTEGER NOT NULL,
	PRIMARY KEY("element_oid")
);
CREATE TABLE IF NOT EXISTS "decorated_relation" (
	"decorator_oid"	INTEGER NOT NULL,
	"decorated_element_oid"	INTEGER NOT NULL,
	PRIMARY KEY("decorator_oid")
);
CREATE TABLE IF NOT EXISTS "decorator" (
	"element_oid"	INTEGER NOT NULL,
	"type"	TEXT NOT NULL,
	"printable_text"	TEXT NOT NULL,
	PRIMARY KEY("element_oid")
);
CREATE TABLE IF NOT EXISTS "class_hierarchy" (
	"base_oid"	INTEGER NOT NULL,
	"class_oid"	INTEGER NOT NULL,
	PRIMARY KEY("base_oid")
);
CREATE TABLE IF NOT EXISTS "module" (
	"element_oid"	INTEGER NOT NULL,
	"name"	TEXT NOT NULL,
	"file_oid"	INTEGER NOT NULL,
	"location_oid"	INTEGER NOT NULL,
	PRIMARY KEY("element_oid")
);
CREATE TABLE IF NOT EXISTS "scope_enclosing_expression" (
	"expression_oid"	INTEGER NOT NULL,
	"scope_oid"	INTEGER NOT NULL,
	PRIMARY KEY("expression_oid")
);
CREATE TABLE IF NOT EXISTS "scope_enclosing_statement" (
	"statement_oid"	INTEGER NOT NULL,
	"scope_oid"	INTEGER NOT NULL,
	PRIMARY KEY("statement_oid")
);
CREATE TABLE IF NOT EXISTS "keyword" (
	"element_oid"	INTEGER NOT NULL,
	"arg_value"	TEXT NOT NULL,
	"value_oid"	INTEGER NOT NULL,
	"element_index"	INTEGER NOT NULL,
	"parent_oid"	INTEGER NOT NULL,
	"location_oid"	INTEGER NOT NULL,
	"printable_text"	TEXT NOT NULL,
	PRIMARY KEY("element_oid")
);
CREATE TABLE IF NOT EXISTS "boolean_op_expression" (
	"element_oid"	INTEGER NOT NULL,
	"type"	TEXT NOT NULL,
	"size"	INTEGER NOT NULL,
	PRIMARY KEY("element_oid")
);
CREATE TABLE IF NOT EXISTS "parse_error_file" (
	"element_oid"	INTEGER NOT NULL,
	"relative_path"	TEXT NOT NULL,
	"error_message"	TEXT NOT NULL,
	"error_text"	TEXT NOT NULL,
	PRIMARY KEY("element_oid")
);
CREATE TABLE IF NOT EXISTS "modified_2to3_file" (
	"element_oid"	INTEGER NOT NULL,
	"relative_path"	TEXT NOT NULL,
	PRIMARY KEY("element_oid")
);
COMMIT;
