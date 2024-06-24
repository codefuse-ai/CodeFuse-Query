BEGIN TRANSACTION;

CREATE TABLE IF NOT EXISTS "annotated_relation" (
	"annotation_hash_id"	INTEGER,
	"annotated_item_hash_id"	INTEGER
);
CREATE TABLE IF NOT EXISTS "annotation_can_resolved" (
	"element_hash_id"	INTEGER,
	"name"	TEXT NOT NULL,
	"annotation_declaration_hash_id"	INTEGER NOT NULL,
	"location_hash_id"	INTEGER NOT NULL,
	"debug_message"	TEXT,
	"parent_hash_id"	INTEGER
);
CREATE TABLE IF NOT EXISTS "annotation_access_argument_with_name" (
	"element_hash_id"	INTEGER,
	"annotation_access_hash_id"	INTEGER NOT NULL,
	"type_hash_id"	INTEGER NOT NULL,
	"argument_value_hash_id"	INTEGER NOT NULL,
	"location_hash_id"	INTEGER NOT NULL,
	"index_order"	INTEGER NOT NULL,
	"debug_message"	TEXT
);
CREATE TABLE IF NOT EXISTS "anonymous_class" (
	"element_hash_id"	INTEGER,
	"base_class_reference_hash_id"	INTEGER,
	"base_class_type_hash_id"	INTEGER NOT NULL,
	"location_hash_id"	INTEGER,
	"parent_hash_id"	INTEGER
);
CREATE TABLE IF NOT EXISTS "boolean_literal" (
	"element_hash_id"	INTEGER,
	"value"	TEXT NOT NULL
);
CREATE TABLE IF NOT EXISTS "callable_binding" (
	"caller_hash_id"	INTEGER NOT NULL,
	"callee_hash_id"	INTEGER NOT NULL
);
CREATE TABLE IF NOT EXISTS "callable_enclosing_expression" (
	"expression_hash_id"	INTEGER NOT NULL,
	"callable_hash_id"	INTEGER NOT NULL
);
CREATE TABLE IF NOT EXISTS "callable_enclosing_statement" (
	"statement_hash_id"	INTEGER NOT NULL,
	"callable_hash_id"	INTEGER NOT NULL
);
CREATE TABLE IF NOT EXISTS "character_literal" (
	"element_hash_id"	INTEGER,
	"value"	TEXT NOT NULL
);
CREATE TABLE IF NOT EXISTS "class" (
	"element_hash_id"	INTEGER,
	"qualified_name"	TEXT,
	"identifier_hash_id"	INTEGER NOT NULL,
	"location_hash_id"	INTEGER,
	"parent_hash_id"	INTEGER
);
CREATE TABLE IF NOT EXISTS "class_hierarchy" (
	"child_hash_id"	INTEGER,
	"parent_hash_id"	INTEGER
);
CREATE TABLE IF NOT EXISTS "class_implement_list" (
	"element_hash_id"	INTEGER,
	"implemented_element_hash_id"	INTEGER
);
CREATE TABLE IF NOT EXISTS "class_initializer" (
	"element_hash_id"	INTEGER,
	"debug_message"	TEXT,
	"parent_hash_id"	INTEGER,
	"location_hash_id"	INTEGER
);
CREATE TABLE IF NOT EXISTS "code_block" (
	"element_hash_id"	INTEGER,
	"number_of_statement"	INTEGER NOT NULL,
	"parent_hash_id"	INTEGER NOT NULL,
	"is_empty"	INTEGER NOT NULL,
	"location_hash_id"	INTEGER NOT NULL,
	"debug_message"	TEXT
);
CREATE TABLE IF NOT EXISTS "comment" (
	"element_hash_id"	INTEGER,
	"text"	text NOT NULL,
	"parent_hash_id"	INTEGER NOT NULL,
	"location_hash_id"	INTEGER NOT NULL,
	"comment_type"	TEXT NOT NULL
);
CREATE TABLE IF NOT EXISTS "container_parent" (
	"child_hash_id"	INTEGER NOT NULL,
	"parent_hash_id"	INTEGER NOT NULL
);
CREATE TABLE IF NOT EXISTS "cupackage" (
	"file_hash_id"	INTEGER NOT NULL,
	"package_hash_id"	INTEGER NOT NULL
);
CREATE TABLE IF NOT EXISTS "double_literal" (
	"element_hash_id"	INTEGER,
	"value"	TEXT NOT NULL
);
CREATE TABLE IF NOT EXISTS "empty_statement" (
	"element_hash_id"	INTEGER
);
CREATE TABLE IF NOT EXISTS "enum_constant" (
	"element_hash_id"	INTEGER,
	"name"	TEXT,
	"parent_hash_id"	INTEGER,
	"location_hash_id"	INTEGER,
	"debug_message"	TEXT
);
CREATE TABLE IF NOT EXISTS "exception" (
	"element_hash_id"	INTEGER,
	"type_hash_id"	INTEGER,
	"callable_hash_id"	INTEGER,
	"name"	text
);
CREATE TABLE IF NOT EXISTS "expression" (
	"element_hash_id"	INTEGER,
	"name"	TEXT NOT NULL,
	"parent_hash_id"	INTEGER NOT NULL,
	"index_order"	INTEGER NOT NULL,
	"location_hash_id"	INTEGER NOT NULL,
	"debug_message"	TEXT
);
CREATE TABLE IF NOT EXISTS "expression_list" (
	"element_hash_id"	INTEGER,
	"parent_hash_id"	INTEGER,
	"location_hash_id"	INTEGER,
	"debug_message" TEXT,
    "size"  INTEGER
);
CREATE TABLE IF NOT EXISTS "expression_list_expression_relation" (
     "expression_list_hash_id"	INTEGER,
     "expression_hash_id"	INTEGER,
     "position" INTEGER
);
CREATE TABLE IF NOT EXISTS "file" (
	"element_hash_id"	INTEGER,
	"qualified_name"	TEXT NOT NULL,
	"extension"	TEXT NOT NULL,
	"name"	TEXT NOT NULL,
	"number_of_lines_hash_id"	INTEGER
);
CREATE TABLE IF NOT EXISTS "file_md5_sum" (
	"file_hash_id"	INTEGER,
	"value"	TEXT
);
CREATE TABLE IF NOT EXISTS "file_sha256_sum" (
	"file_hash_id"	INTEGER,
	"value"	TEXT
);
CREATE TABLE IF NOT EXISTS "floating_point_literal" (
	"element_hash_id"	INTEGER,
	"value"	TEXT NOT NULL
);
CREATE TABLE IF NOT EXISTS "folder" (
	"element_hash_id"	INTEGER,
	"qualified_name"	TEXT NOT NULL,
	"name"	TEXT NOT NULL,
	"parent_hash_id"	INTEGER
);
CREATE TABLE IF NOT EXISTS "identifier" (
	"element_hash_id"	INTEGER,
	"location_hash_id"	INTEGER,
	"name"	TEXT,
	"parent_hash_id"	INTEGER
);
CREATE TABLE IF NOT EXISTS "import" (
	"element_hash_id"	INTEGER,
	"reference_hash_id"	INTEGER NOT NULL,
	"name"	TEXT NOT NULL,
	"parent_hash_id"	INTEGER,
	"location_hash_id"	INTEGER,
	"is_foreign_import"	INTEGER
);
CREATE TABLE IF NOT EXISTS "import_static_reference_element" (
	"element_hash_id"	INTEGER,
	"debug_message"	TEXT,
	"parent_hash_id"	INTEGER,
	"location_hash_id"	INTEGER
);
CREATE TABLE IF NOT EXISTS "integer_literal" (
	"element_hash_id"	INTEGER,
	"value"	TEXT NOT NULL
);
CREATE TABLE IF NOT EXISTS "interface" (
	"element_hash_id"	INTEGER,
	"qualified_name"	TEXT,
	"identifier_hash_id"	INTEGER NOT NULL,
	"location_hash_id"	INTEGER,
	"parent_hash_id"	INTEGER
);
CREATE TABLE IF NOT EXISTS "javadoc_comment" (
	"element_hash_id"	INTEGER,
	"documentable_hash_id"	INTEGER NOT NULL,
	"text"	text NOT NULL,
	"location_hash_id"	INTEGER NOT NULL,
	"parent_hash_id"	INTEGER
);
CREATE TABLE IF NOT EXISTS "javadoc_tag" (
	"element_hash_id"	INTEGER,
	"name"	TEXT NOT NULL,
	"value"	TEXT,
	"containing_comment_hash_id"	INTEGER NOT NULL,
	"index_order"	INTEGER NOT NULL,
	"location_hash_id"	INTEGER NOT NULL
);
CREATE TABLE IF NOT EXISTS "local_class" (
	"element_hash_id"	INTEGER,
	"name"	TEXT NOT NULL,
	"debug_message"	TEXT,
	"location_hash_id"	INTEGER,
	"parent_hash_id"	INTEGER
);
CREATE TABLE IF NOT EXISTS "location" (
	"element_hash_id"	INTEGER,
	"file_hash_id"	INTEGER,
	"start_line_number"	INTEGER,
	"start_column_number"	INTEGER,
	"end_line_number"	INTEGER,
	"end_column_number"	INTEGER
);
CREATE TABLE IF NOT EXISTS "metainfo" (
	"oid"	INTEGER,
	"kind"	TEXT,
	"value"	TEXT,
	"program_hash_id"	INTEGER
);
CREATE TABLE IF NOT EXISTS "modifier" (
	"element_hash_id"	INTEGER,
	"name"	TEXT,
	"parent_hash_id"	INTEGER,
	"location_hash_id"	INTEGER
);
CREATE TABLE IF NOT EXISTS "modifier_list" (
	"element_hash_id"	INTEGER,
	"parent_hash_id"	INTEGER,
	"location_hash_id"	INTEGER
);
CREATE TABLE IF NOT EXISTS "module" (
	"element_hash_id"	INTEGER,
	"name"	TEXT NOT NULL
);
CREATE TABLE IF NOT EXISTS "name_string" (
	"parent_hash_id"	INTEGER NOT NULL,
	"name_element_hash_id"	INTEGER NOT NULL,
	"value_element_hash_id"	INTEGER NOT NULL
);
CREATE TABLE IF NOT EXISTS "null_literal" (
	"element_hash_id"	INTEGER,
	"value"	TEXT NOT NULL
);
CREATE TABLE IF NOT EXISTS "number_of_lines" (
	"element_hash_id"	INTEGER,
	"number_of_total_lines"	INTEGER,
	"number_of_valid_lines"	INTEGER,
	"number_of_comment_lines"	INTEGER
);
CREATE TABLE IF NOT EXISTS "package_statement" (
	"element_hash_id"	INTEGER,
	"qualified_name"	TEXT NOT NULL,
	"location_hash_id"	INTEGER,
	"package_hash_id"	INTEGER,
	"parent_hash_id"	INTEGER
);
CREATE TABLE IF NOT EXISTS "parent" (
	"parent_hash_id"	INTEGER,
	"parent_type"	TEXT
);
CREATE TABLE IF NOT EXISTS "polyadic_expression" (
	"element_hash_id"	INTEGER,
	"size"	INTEGER NOT NULL,
	"opcode"	TEXT
);
CREATE TABLE IF NOT EXISTS "primitive" (
	"oid"	INTEGER,
	"name"	TEXT
);
CREATE TABLE IF NOT EXISTS "program" (
	"program_hash_id"	INTEGER NOT NULL,
	"absolute_prefix_path"	TEXT
);
CREATE TABLE IF NOT EXISTS "reference_element" (
	"element_hash_id"	INTEGER,
	"debug_message"	TEXT,
	"parent_hash_id"	INTEGER,
	"location_hash_id"	INTEGER
);
CREATE TABLE IF NOT EXISTS "reference_list" (
	"element_hash_id"	INTEGER NOT NULL,
	"location_hash_id"	INTEGER NOT NULL,
	"parent_hash_id"	INTEGER,
	"debug_message"	TEXT,
	"role"	TEXT
);
CREATE TABLE IF NOT EXISTS "reference_parameter_list" (
	"type_element_hash_id"	INTEGER,
	"list_hash_id"	INTEGER,
	"index_order"	INTEGER,
	"parent_hash_id"	INTEGER,
	"debug_message"	TEXT,
	"location_hash_id"	INTEGER
);
CREATE TABLE IF NOT EXISTS "reference_type" (
	"oid"	INTEGER,
	"name"	TEXT,
	"qualified_name"	TEXT
);
CREATE TABLE IF NOT EXISTS "resource_list" (
	"element_hash_id"	INTEGER,
	"debug_message"	TEXT,
	"parent_hash_id"	INTEGER,
	"location_hash_id"	INTEGER
);
CREATE TABLE IF NOT EXISTS "statement" (
	"element_hash_id"	INTEGER,
	"parent_hash_id"	INTEGER NOT NULL,
	"index_order"	INTEGER NOT NULL,
	"location_hash_id"	INTEGER NOT NULL,
	"debug_message"	TEXT,
	"type"	TEXT
);
CREATE TABLE IF NOT EXISTS "statement_enclosing_expression" (
	"expression_hash_id"	INTEGER NOT NULL,
	"statement_hash_id"	INTEGER NOT NULL
);
CREATE TABLE IF NOT EXISTS "string_literal" (
	"element_hash_id"	INTEGER,
	"value"	TEXT NOT NULL
);
CREATE TABLE IF NOT EXISTS "token" (
	"element_hash_id"	INTEGER NOT NULL,
	"value"	TEXT,
	"location_hash_id"	INTEGER,
	"parent_hash_id"	INTEGER
);
CREATE TABLE IF NOT EXISTS "type_parameter" (
	"element_hash_id"	INTEGER,
	"debug_message"	TEXT,
	"owner_hash_id"	INTEGER,
	"index_order"	INTEGER,
	"extends_list_hash_id"	INTEGER,
	"parent_hash_id"	INTEGER,
	"location_hash_id"	INTEGER
);
CREATE TABLE IF NOT EXISTS "annotation_can_not_resolved" (
	"element_hash_id"	INTEGER NOT NULL,
	"name"	TEXT NOT NULL,
	"location_hash_id"	INTEGER NOT NULL,
	"debug_message"	TEXT NOT NULL,
	"parent_hash_id"	INTEGER NOT NULL,
	PRIMARY KEY("element_hash_id")
);
CREATE TABLE IF NOT EXISTS "method" (
	"element_hash_id"	INTEGER NOT NULL,
	"name"	TEXT NOT NULL,
	"signature"	TEXT NOT NULL,
	"type_hash_id"	INTEGER NOT NULL,
	"parent_hash_id"	INTEGER NOT NULL,
	"location_hash_id"	INTEGER NOT NULL,
    "definition_body"	TEXT NOT NULL,
	PRIMARY KEY("element_hash_id")
);
CREATE TABLE IF NOT EXISTS "this_expression_with_qualifier" (
	"element_hash_id"	INTEGER,
	"qualifier_hash_id"	INTEGER
);
CREATE TABLE IF NOT EXISTS "this_access_expression" (
	"element_hash_id"	INTEGER
);
CREATE TABLE IF NOT EXISTS "super_expression" (
	"element_hash_id"	INTEGER NOT NULL
);
CREATE TABLE IF NOT EXISTS "super_expression_with_qualifier" (
	"element_hash_id"	INTEGER NOT NULL,
	"qualifier_hash_id"	INTEGER NOT NULL
);
CREATE TABLE IF NOT EXISTS "annotation_declaration_parameter" (
	"element_hash_id"	INTEGER,
	"annotation_declaration_hash_id"	INTEGER NOT NULL,
	"type_hash_id"	INTEGER NOT NULL,
	"parameter_value_hash_id"	INTEGER NOT NULL,
	"location_hash_id"	INTEGER NOT NULL,
	"debug_message"	TEXT
);
CREATE TABLE IF NOT EXISTS "annotation_declaration_parameter_default_value" (
	"element_hash_id"	INTEGER NOT NULL,
	"default_value"	TEXT
);
CREATE TABLE IF NOT EXISTS "method_reference_expression" (
	"element_hash_id"	INTEGER NOT NULL,
	"is_constructor"	INTEGER NOT NULL,
	PRIMARY KEY("element_hash_id")
);
CREATE TABLE IF NOT EXISTS "instanceof_expression" (
	"element_hash_id"	INTEGER,
	"operand_hash_id"	INTEGER,
	"check_type_hash_id"	INTEGER NOT NULL,
	"pattern_hash_id"	INTEGER
);
CREATE TABLE IF NOT EXISTS "while_statement" (
	"element_hash_id"	INTEGER,
	"condition_hash_id"	INTEGER NOT NULL,
	"body_declaration_hash_id"	INTEGER NOT NULL
);
CREATE TABLE IF NOT EXISTS "do_while_statement" (
	"element_hash_id"	INTEGER,
	"keyword"	TEXT,
	"condition_hash_id"	INTEGER NOT NULL,
	"body_declaration_hash_id"	INTEGER NOT NULL
);
CREATE TABLE IF NOT EXISTS "block_statement" (
	"element_hash_id"	INTEGER,
	"code_block_hash_id"	INTEGER NOT NULL
);
CREATE TABLE IF NOT EXISTS "super_access_expression" (
	"element_hash_id"	INTEGER
);
CREATE TABLE IF NOT EXISTS "super_constructor_invocation" (
	"element_hash_id"	INTEGER
);
CREATE TABLE IF NOT EXISTS "method_access_expression_with_type" (
	"element_hash_id"	INTEGER,
	"type_hash_id"	INTEGER NOT NULL,
	"referen_method_hash_id"	INTEGER NOT NULL,
    "argument_list_hash_id" INTEGER
);
CREATE TABLE IF NOT EXISTS "method_access_expression_without_type" (
	"element_hash_id"	INTEGER,
	"referen_method_hash_id"	INTEGER NOT NULL,
	"argument_list_hash_id" INTEGER
);
CREATE TABLE IF NOT EXISTS "conditional_expression" (
	"element_hash_id"	INTEGER,
	"condition_expression_hash_id"	INTEGER NOT NULL,
	"then_part_hash_id"	INTEGER NOT NULL,
	"else_part_hash_id"	INTEGER NOT NULL
);
CREATE TABLE IF NOT EXISTS "continue_statement" (
	"element_hash_id"	INTEGER,
	"continued_statement_hash_id"	INTEGER NOT NULL
);
CREATE TABLE IF NOT EXISTS "array_initializer_expression" (
	"element_hash_id"	INTEGER,
	"type_hash_id"	INTEGER NOT NULL
);
CREATE TABLE IF NOT EXISTS "break_statement" (
	"element_hash_id"	INTEGER,
	"exited_statement_hash_id"	INTEGER NOT NULL
);
CREATE TABLE IF NOT EXISTS "array_creation_expression" (
	"element_hash_id"	INTEGER,
	"number_of_array_dimension"	INTEGER NOT NULL,
	"type_hash_id"	INTEGER NOT NULL
);
CREATE TABLE IF NOT EXISTS "new_expression" (
	"element_hash_id"	INTEGER,
	"reference_hash_id"	INTEGER NOT NULL,
	"type_hash_id"	INTEGER NOT NULL
);
CREATE TABLE IF NOT EXISTS "constructor_invocation" (
	"element_hash_id"	INTEGER,
	"class_reference_hash_id"	INTEGER
);
CREATE TABLE IF NOT EXISTS "declaration_element" (
	"element_hash_id"	INTEGER,
	"index_order"	INTEGER,
	"declaration_statement_hash_id"	INTEGER
);
CREATE TABLE IF NOT EXISTS "expression_statement" (
	"element_hash_id"	INTEGER,
	"expression_hash_id"	INTEGER NOT NULL
);
CREATE TABLE IF NOT EXISTS "type_cast_expression" (
	"element_hash_id"	INTEGER,
	"cast_expression_hash_id"	INTEGER
);
CREATE TABLE IF NOT EXISTS "switch_statement" (
	"element_hash_id"	INTEGER,
	"discriminant_hash_id"	INTEGER NOT NULL,
	"body_declaration_hash_id"	INTEGER NOT NULL
);
CREATE TABLE IF NOT EXISTS "switch_label_statement" (
	"element_hash_id"	INTEGER,
	"case_value_hash_id"	INTEGER NOT NULL,
	"enclosing_switch_block_hash_id"	INTEGER NOT NULL,
	"next_switch_case_hash_id"	INTEGER NOT NULL
);
CREATE TABLE IF NOT EXISTS "type_literal" (
	"element_hash_id"	INTEGER,
	"type_element_hash_id"	INTEGER,
	"type_hash_id"	INTEGER
);
CREATE TABLE IF NOT EXISTS "synchronized_statement" (
	"element_hash_id"	INTEGER,
	"lock_expression_hash_id"	INTEGER NOT NULL,
	"body_declaration_hash_id"	INTEGER NOT NULL
);
CREATE TABLE IF NOT EXISTS "catch_section" (
	"element_hash_id"	INTEGER,
	"debug_message"	TEXT NOT NULL,
	"parameter_hash_id"	INTEGER NOT NULL,
	"type_hash_id"	INTEGER NOT NULL,
	"location_hash_id"	INTEGER NOT NULL,
	"try_statement_hash_id"	INTEGER
);
CREATE TABLE IF NOT EXISTS "throw_statement" (
	"element_hash_id"	INTEGER,
	"exception_hash_id"	INTEGER NOT NULL,
	"block_hash_id"	INTEGER NOT NULL
);
CREATE TABLE IF NOT EXISTS "labeled_statement" (
	"element_hash_id"	INTEGER,
	"labeled_hash_identifier_hash_id"	INTEGER NOT NULL,
	"statement_hash_id"	INTEGER NOT NULL
);
CREATE TABLE IF NOT EXISTS "lambda_expression" (
	"element_hash_id"	INTEGER,
	"parameter_list_hash_id"	INTEGER NOT NULL,
	"body_hash_id"	INTEGER NOT NULL,
	"is_void_compatible"	INTEGER,
	"is_value_compatible"	INTEGER
);
CREATE TABLE IF NOT EXISTS "assert_statement" (
	"element_hash_id"	INTEGER,
	"assert_condition_hash_id"	INTEGER NOT NULL,
	"assert_description_hash_id"	INTEGER
);
CREATE TABLE IF NOT EXISTS "return_statement" (
	"element_hash_id"	INTEGER,
	"return_expression_hash_id"	INTEGER NOT NULL
);
CREATE TABLE IF NOT EXISTS "yield_statement" (
	"element_hash_id"	INTEGER,
	"expression_hash_id"	INTEGER NOT NULL,
	"enclosing_expression_hash_id"	INTEGER NOT NULL
);
CREATE TABLE IF NOT EXISTS "unary_expression" (
	"element_hash_id"	INTEGER,
	"operand_hash_id"	INTEGER NOT NULL,
	"opcode"	TEXT NOT NULL,
	"is_postfix"	INTEGER
);
CREATE TABLE IF NOT EXISTS "array_access_expression" (
	"element_hash_id"	INTEGER,
	"index_expression_hash_id"	INTEGER NOT NULL,
	"array_expression_hash_id"	INTEGER NOT NULL
);
CREATE TABLE IF NOT EXISTS "for_statement" (
	"element_hash_id"	INTEGER,
	"initialization_hash_id"	INTEGER,
	"condition_hash_id"	INTEGER NOT NULL,
	"update_hash_id"	INTEGER NOT NULL,
	"body_hash_id"	INTEGER NOT NULL
);
CREATE TABLE IF NOT EXISTS "foreach_statement" (
	"element_hash_id"	INTEGER,
	"iterated_value_hash_id"	INTEGER NOT NULL,
	"iteration_parameter_hash_id"	INTEGER NOT NULL,
	"body_hash_id"	INTEGER NOT NULL
);
CREATE TABLE IF NOT EXISTS "assignment_expression" (
	"element_hash_id"	INTEGER,
	"lhs_hash_id"	INTEGER NOT NULL,
	"rhs_hash_id"	INTEGER NOT NULL,
	"opcode"	TEXT
);
CREATE TABLE IF NOT EXISTS "binary_expression" (
	"element_hash_id"	INTEGER,
	"lhs_hash_id"	INTEGER NOT NULL,
	"rhs_hash_id"	INTEGER NOT NULL,
	"opcode"	TEXT
);
CREATE TABLE IF NOT EXISTS "if_statement_with_else" (
	"element_hash_id"	INTEGER,
	"condition_hash_id"	INTEGER NOT NULL,
	"consequent_hash_id"	INTEGER NOT NULL,
	"alternate_hash_id"	INTEGER NOT NULL
);
CREATE TABLE IF NOT EXISTS "reference_expression" (
	"element_hash_id"	INTEGER
);
CREATE TABLE IF NOT EXISTS "annotation_access_argument_without_name" (
	"element_hash_id"	INTEGER,
	"annotation_access_hash_id"	INTEGER NOT NULL,
	"argument_value_hash_id"	INTEGER NOT NULL,
	"location_hash_id"	INTEGER NOT NULL,
	"index_order"	INTEGER NOT NULL,
	"debug_message"	TEXT
);
CREATE TABLE IF NOT EXISTS "constructor" (
	"element_hash_id"	INTEGER,
	"name"	TEXT NOT NULL,
	"signature"	TEXT NOT NULL,
	"parent_hash_id"	INTEGER NOT NULL,
    "location_hash_id"	INTEGER NOT NULL,
	"definition_body"	TEXT NOT NULL
);
CREATE TABLE IF NOT EXISTS "if_statement_without_else" (
	"element_hash_id"	INTEGER,
	"condition_hash_id"	INTEGER NOT NULL,
	"consequent_hash_id"	INTEGER NOT NULL
);
CREATE TABLE IF NOT EXISTS "import_static_statement" (
	"element_hash_id"	INTEGER,
	"reference_hash_id"	INTEGER NOT NULL,
	"name"	TEXT NOT NULL,
	"parent_hash_id"	INTEGER,
	"location_hash_id"	INTEGER
);
CREATE TABLE IF NOT EXISTS "type_element" (
	"element_hash_id"	INTEGER,
	"reference_type_hash_id"	INTEGER,
	"debug_message"	text,
	"parent_hash_id"	INTEGER,
	"location_hash_id"	INTEGER
);
CREATE TABLE IF NOT EXISTS "try_statement_without_finally" (
	"element_hash_id"	INTEGER,
	"try_block_hash_id"	INTEGER NOT NULL
);
CREATE TABLE IF NOT EXISTS "empty_reference_parameter_list" (
	"list_hash_id"	INTEGER,
	"parent_hash_id"	INTEGER,
	"debug_message"	TEXT,
	"location_hash_id"	INTEGER
);
CREATE TABLE IF NOT EXISTS "long_literal" (
	"element_hash_id"	INTEGER,
	"value"	TEXT
);
CREATE TABLE IF NOT EXISTS "annotation_declaration" (
	"element_hash_id"	INTEGER NOT NULL,
	"qualified_name"	TEXT NOT NULL
);
CREATE TABLE IF NOT EXISTS "array" (
	"element_hash_id"	INTEGER NOT NULL,
	"name"	TEXT NOT NULL
);
CREATE TABLE IF NOT EXISTS "field" (
	"element_hash_id"	INTEGER,
	"name"	TEXT NOT NULL,
	"parent_hash_id"	INTEGER NOT NULL,
	"debug_message"	TEXT NOT NULL,
	"location_hash_id"	INTEGER NOT NULL
);
CREATE TABLE IF NOT EXISTS "local_variable" (
	"element_hash_id"	INTEGER,
	"parent_hash_id"	INTEGER NOT NULL,
	"location_hash_id"	INTEGER NOT NULL,
	"debug_message"	TEXT,
	"name"	TEXT
);
CREATE TABLE IF NOT EXISTS "parameter" (
	"element_hash_id"	INTEGER,
	"name"	TEXT NOT NULL,
	"index_order"	INTEGER NOT NULL,
	"parent_hash_id"	INTEGER NOT NULL,
	"location_hash_id"	INTEGER,
	"debug_message"	TEXT,
	"type_hash_id"	INTEGER
);
CREATE TABLE IF NOT EXISTS "try_statement_with_finally" (
	"element_hash_id"	INTEGER,
	"try_block_hash_id"	INTEGER,
	"finally_block_hash_id"	INTEGER
);
CREATE TABLE IF NOT EXISTS "reference_relation" (
	"reference_element_hash_id"	INTEGER,
	"definition_element_hash_id"	INTEGER
);
CREATE TABLE IF NOT EXISTS "annotation_array_initializer" (
	"element_hash_id"	INTEGER,
	"debug_message"	TEXT NOT NULL,
	"parent_hash_id"	INTEGER NOT NULL,
	"location_hash_id"	INTEGER NOT NULL
);
CREATE TABLE IF NOT EXISTS "element" (
	"element_hash_id"	INTEGER NOT NULL,
	"type"	TEXT,
	"parent_id"	INTEGER,
	"parent_type"	TEXT,
	PRIMARY KEY("element_hash_id")
);
CREATE TABLE IF NOT EXISTS "javadoc_data_token" (
	"element_hash_id"	INTEGER,
	"value"	TEXT,
	"parent_hash_id"	INTEGER NOT NULL,
	"index_order"	INTEGER NOT NULL,
	"location_hash_id"	INTEGER NOT NULL
);
CREATE TABLE IF NOT EXISTS "javadoc_tag_value" (
	"element_hash_id"	INTEGER,
	"value"	TEXT,
	"parent_hash_id"	INTEGER NOT NULL,
	"location_hash_id"	INTEGER NOT NULL
);
CREATE TABLE IF NOT EXISTS "np_method" (
	"element_hash_id"	INTEGER NOT NULL,
	"name"	TEXT NOT NULL,
	"signature"	TEXT NOT NULL,
	"type_hash_id"	INTEGER NOT NULL,
	"parent_hash_id"	INTEGER NOT NULL,
	PRIMARY KEY("element_hash_id")
);
CREATE TABLE IF NOT EXISTS "np_class" (
	"element_hash_id"	INTEGER NOT NULL,
	"name"  TEXT NOT NULL,
	"qualified_name"	TEXT NOT NULL,
	"parent_hash_id"	INTEGER NOT NULL
);
CREATE TABLE IF NOT EXISTS "np_interface" (
	"element_hash_id"	INTEGER NOT NULL,
	"name"  TEXT NOT NULL,
	"qualified_name"	TEXT NOT NULL,
	"parent_hash_id"	INTEGER NOT NULL
);
CREATE TABLE IF NOT EXISTS "np_file" (
	"element_hash_id"	INTEGER,
	"qualified_name"	TEXT NOT NULL,
	"name"	TEXT NOT NULL,
	"project_hash_id"	INTEGER NOT NULL
);
CREATE TABLE IF NOT EXISTS "np_project" (
	"element_hash_id"	INTEGER,
    "extension"	TEXT NOT NULL,
	"name"	TEXT NOT NULL
);

INSERT INTO "primitive" VALUES (1,'byte');
INSERT INTO "primitive" VALUES (2,'char');
INSERT INTO "primitive" VALUES (3,'double');
INSERT INTO "primitive" VALUES (4,'float');
INSERT INTO "primitive" VALUES (5,'int');
INSERT INTO "primitive" VALUES (6,'long');
INSERT INTO "primitive" VALUES (7,'short');
INSERT INTO "primitive" VALUES (8,'boolean');
INSERT INTO "primitive" VALUES (9,'void');
INSERT INTO "primitive" VALUES (10,'null');

COMMIT;
