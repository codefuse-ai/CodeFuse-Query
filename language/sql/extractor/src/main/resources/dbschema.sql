-- Automatically Generated From dbschema.sql.j2.
-- Do Not Edit Directly!

DROP TABLE IF EXISTS "antspark_create_table_statement";
CREATE TABLE IF NOT EXISTS "antspark_create_table_statement" (
	"oid"	INTEGER NOT NULL,
	"datasource_oid"	INTEGER NOT NULL,
	"meta_life_cycle_oid"	INTEGER NOT NULL,
	"serde_properties"	TEXT NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "blink_create_table_statement";
CREATE TABLE IF NOT EXISTS "blink_create_table_statement" (
	"oid"	INTEGER NOT NULL,
	"period_for_oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "clickhouse_create_table_statement";
CREATE TABLE IF NOT EXISTS "clickhouse_create_table_statement" (
	"oid"	INTEGER NOT NULL,
	"order_by_oid"	INTEGER NOT NULL,
	"partition_by_oid"	INTEGER NOT NULL,
	"sample_by_oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "cobar_show_status";
CREATE TABLE IF NOT EXISTS "cobar_show_status" (
	"oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "corpus";
CREATE TABLE IF NOT EXISTS "corpus" (
	"oid"	INTEGER NOT NULL,
	"debug_message"	TEXT NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "cycle_clause";
CREATE TABLE IF NOT EXISTS "cycle_clause" (
	"oid"	INTEGER NOT NULL,
	"default_value_oid"	INTEGER NOT NULL,
	"mark_oid"	INTEGER NOT NULL,
	"value_oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "db2_create_table_statement";
CREATE TABLE IF NOT EXISTS "db2_create_table_statement" (
	"oid"	INTEGER NOT NULL,
	"database_oid"	INTEGER NOT NULL,
	"index_in_oid"	INTEGER NOT NULL,
	"is_data_capture_changes"	INTEGER NOT NULL,
	"is_data_capture_none"	INTEGER NOT NULL,
	"validproc_oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "db2_select_query_block";
CREATE TABLE IF NOT EXISTS "db2_select_query_block" (
	"oid"	INTEGER NOT NULL,
	"is_for_read_only"	INTEGER NOT NULL,
	"isolation"	TEXT NOT NULL,
	"optimize_for_oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "db2_statement_impl";
CREATE TABLE IF NOT EXISTS "db2_statement_impl" (
	"oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "db2_values_statement";
CREATE TABLE IF NOT EXISTS "db2_values_statement" (
	"oid"	INTEGER NOT NULL,
	"expr_oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "drds_baseline_statement";
CREATE TABLE IF NOT EXISTS "drds_baseline_statement" (
	"oid"	INTEGER NOT NULL,
	"baseline_ids"	TEXT NOT NULL,
	"operation"	TEXT NOT NULL,
	"select_oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "drds_cancel_ddl_job";
CREATE TABLE IF NOT EXISTS "drds_cancel_ddl_job" (
	"oid"	INTEGER NOT NULL,
	"job_ids"	TEXT NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "drds_change_ddl_job";
CREATE TABLE IF NOT EXISTS "drds_change_ddl_job" (
	"oid"	INTEGER NOT NULL,
	"group_and_table_name_list"	TEXT NOT NULL,
	"is_add"	INTEGER NOT NULL,
	"is_skip"	INTEGER NOT NULL,
	"job_id"	TEXT NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "drds_clear_ddl_job_cache";
CREATE TABLE IF NOT EXISTS "drds_clear_ddl_job_cache" (
	"oid"	INTEGER NOT NULL,
	"is_all_jobs"	INTEGER NOT NULL,
	"job_ids"	TEXT NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "drds_inspect_ddl_job_cache";
CREATE TABLE IF NOT EXISTS "drds_inspect_ddl_job_cache" (
	"oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "drds_recover_ddl_job";
CREATE TABLE IF NOT EXISTS "drds_recover_ddl_job" (
	"oid"	INTEGER NOT NULL,
	"is_all_jobs"	INTEGER NOT NULL,
	"job_ids"	TEXT NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "drds_remove_ddl_job";
CREATE TABLE IF NOT EXISTS "drds_remove_ddl_job" (
	"oid"	INTEGER NOT NULL,
	"is_all_completed"	INTEGER NOT NULL,
	"is_all_pending"	INTEGER NOT NULL,
	"job_ids"	TEXT NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "drds_rollback_ddl_job";
CREATE TABLE IF NOT EXISTS "drds_rollback_ddl_job" (
	"oid"	INTEGER NOT NULL,
	"job_ids"	TEXT NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "drds_show_ddl_jobs";
CREATE TABLE IF NOT EXISTS "drds_show_ddl_jobs" (
	"oid"	INTEGER NOT NULL,
	"is_full"	INTEGER NOT NULL,
	"job_ids"	TEXT NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "drds_show_global_index";
CREATE TABLE IF NOT EXISTS "drds_show_global_index" (
	"oid"	INTEGER NOT NULL,
	"table_name_oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "drds_show_metadata_lock";
CREATE TABLE IF NOT EXISTS "drds_show_metadata_lock" (
	"oid"	INTEGER NOT NULL,
	"schema_name_oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "file";
CREATE TABLE IF NOT EXISTS "file" (
	"oid"	INTEGER NOT NULL,
	"relative_path"	TEXT NOT NULL,
	"extension"	TEXT NOT NULL,
	"name"	TEXT NOT NULL,
	"corpus_oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "hive_create_function_statement";
CREATE TABLE IF NOT EXISTS "hive_create_function_statement" (
	"oid"	INTEGER NOT NULL,
	"class_name_oid"	INTEGER NOT NULL,
	"code"	TEXT NOT NULL,
	"is_declare"	INTEGER NOT NULL,
	"location_oid"	INTEGER NOT NULL,
	"resource_type"	TEXT NOT NULL,
	"symbol_oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "hive_create_table_statement";
CREATE TABLE IF NOT EXISTS "hive_create_table_statement" (
	"oid"	INTEGER NOT NULL,
	"into_buckets_oid"	INTEGER NOT NULL,
	"is_like_query"	INTEGER NOT NULL,
	"meta_life_cycle_oid"	INTEGER NOT NULL,
	"serde_properties"	TEXT NOT NULL,
	"using_oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "hive_input_output_format";
CREATE TABLE IF NOT EXISTS "hive_input_output_format" (
	"oid"	INTEGER NOT NULL,
	"input_oid"	INTEGER NOT NULL,
	"output_oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "hive_insert";
CREATE TABLE IF NOT EXISTS "hive_insert" (
	"oid"	INTEGER NOT NULL,
	"query_oid"	INTEGER NOT NULL,
	"table_source_oid"	INTEGER NOT NULL,
	"values_list"	TEXT NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "hive_insert_statement";
CREATE TABLE IF NOT EXISTS "hive_insert_statement" (
	"oid"	INTEGER NOT NULL,
	"is_if_not_exists"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "hive_load_data_statement";
CREATE TABLE IF NOT EXISTS "hive_load_data_statement" (
	"oid"	INTEGER NOT NULL,
	"format_oid"	INTEGER NOT NULL,
	"inpath_oid"	INTEGER NOT NULL,
	"into_oid"	INTEGER NOT NULL,
	"is_local"	INTEGER NOT NULL,
	"is_overwrite"	INTEGER NOT NULL,
	"row_format_oid"	INTEGER NOT NULL,
	"serde_properties"	TEXT NOT NULL,
	"stored_as_oid"	INTEGER NOT NULL,
	"stored_by_oid"	INTEGER NOT NULL,
	"using_oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "hive_msck_repair_statement";
CREATE TABLE IF NOT EXISTS "hive_msck_repair_statement" (
	"oid"	INTEGER NOT NULL,
	"database_oid"	INTEGER NOT NULL,
	"is_add_partitions"	INTEGER NOT NULL,
	"table_oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "hive_multi_insert_statement";
CREATE TABLE IF NOT EXISTS "hive_multi_insert_statement" (
	"oid"	INTEGER NOT NULL,
	"from_oid"	INTEGER NOT NULL,
	"with_oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "location";
CREATE TABLE IF NOT EXISTS "location" (
	"oid"	INTEGER NOT NULL,
	"file_oid"	INTEGER NOT NULL,
	"start_line_number"	INTEGER NOT NULL,
	"start_column_number"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "model_clause";
CREATE TABLE IF NOT EXISTS "model_clause" (
	"oid"	INTEGER NOT NULL,
	"cell_reference_options"	TEXT NOT NULL,
	"main_model"	TEXT NOT NULL,
	"reference_model_clauses"	TEXT NOT NULL,
	"return_rows_clause"	TEXT NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "my_sql_alter_database_kill_job";
CREATE TABLE IF NOT EXISTS "my_sql_alter_database_kill_job" (
	"oid"	INTEGER NOT NULL,
	"job_id_oid"	INTEGER NOT NULL,
	"job_type_oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "my_sql_alter_database_set_option";
CREATE TABLE IF NOT EXISTS "my_sql_alter_database_set_option" (
	"oid"	INTEGER NOT NULL,
	"on_oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "my_sql_alter_event_statement";
CREATE TABLE IF NOT EXISTS "my_sql_alter_event_statement" (
	"oid"	INTEGER NOT NULL,
	"comment_oid"	INTEGER NOT NULL,
	"definer_oid"	INTEGER NOT NULL,
	"enable"	INTEGER NOT NULL,
	"event_body_oid"	INTEGER NOT NULL,
	"is_disable_on_slave"	INTEGER NOT NULL,
	"is_on_completion_preserve"	INTEGER NOT NULL,
	"name_oid"	INTEGER NOT NULL,
	"rename_to_oid"	INTEGER NOT NULL,
	"schedule_oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "my_sql_alter_log_file_group_statement";
CREATE TABLE IF NOT EXISTS "my_sql_alter_log_file_group_statement" (
	"oid"	INTEGER NOT NULL,
	"add_undo_file_oid"	INTEGER NOT NULL,
	"engine_oid"	INTEGER NOT NULL,
	"initial_size_oid"	INTEGER NOT NULL,
	"is_wait"	INTEGER NOT NULL,
	"name_oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "my_sql_alter_server_statement";
CREATE TABLE IF NOT EXISTS "my_sql_alter_server_statement" (
	"oid"	INTEGER NOT NULL,
	"name_oid"	INTEGER NOT NULL,
	"user_oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "my_sql_alter_table_alter_column";
CREATE TABLE IF NOT EXISTS "my_sql_alter_table_alter_column" (
	"oid"	INTEGER NOT NULL,
	"column_oid"	INTEGER NOT NULL,
	"default_expr_oid"	INTEGER NOT NULL,
	"is_drop_default"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "my_sql_alter_table_alter_full_text_index";
CREATE TABLE IF NOT EXISTS "my_sql_alter_table_alter_full_text_index" (
	"oid"	INTEGER NOT NULL,
	"analyzer_name_oid"	INTEGER NOT NULL,
	"analyzer_type"	TEXT NOT NULL,
	"index_name_oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "my_sql_alter_table_change_column";
CREATE TABLE IF NOT EXISTS "my_sql_alter_table_change_column" (
	"oid"	INTEGER NOT NULL,
	"after_column_oid"	INTEGER NOT NULL,
	"column_name_oid"	INTEGER NOT NULL,
	"first_column_oid"	INTEGER NOT NULL,
	"is_first"	INTEGER NOT NULL,
	"new_column_definition_oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "my_sql_alter_table_discard_tablespace";
CREATE TABLE IF NOT EXISTS "my_sql_alter_table_discard_tablespace" (
	"oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "my_sql_alter_table_force";
CREATE TABLE IF NOT EXISTS "my_sql_alter_table_force" (
	"oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "my_sql_alter_table_import_tablespace";
CREATE TABLE IF NOT EXISTS "my_sql_alter_table_import_tablespace" (
	"oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "my_sql_alter_table_lock";
CREATE TABLE IF NOT EXISTS "my_sql_alter_table_lock" (
	"oid"	INTEGER NOT NULL,
	"lock_type_oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "my_sql_alter_table_modify_column";
CREATE TABLE IF NOT EXISTS "my_sql_alter_table_modify_column" (
	"oid"	INTEGER NOT NULL,
	"after_column_oid"	INTEGER NOT NULL,
	"first_column_oid"	INTEGER NOT NULL,
	"is_first"	INTEGER NOT NULL,
	"new_column_definition_oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "my_sql_alter_table_option";
CREATE TABLE IF NOT EXISTS "my_sql_alter_table_option" (
	"oid"	INTEGER NOT NULL,
	"name"	TEXT NOT NULL,
	"value"	TEXT NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "my_sql_alter_table_order_by";
CREATE TABLE IF NOT EXISTS "my_sql_alter_table_order_by" (
	"oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "my_sql_alter_table_validation";
CREATE TABLE IF NOT EXISTS "my_sql_alter_table_validation" (
	"oid"	INTEGER NOT NULL,
	"is_with_validation"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "my_sql_alter_tablespace_statement";
CREATE TABLE IF NOT EXISTS "my_sql_alter_tablespace_statement" (
	"oid"	INTEGER NOT NULL,
	"add_data_file_oid"	INTEGER NOT NULL,
	"drop_data_file_oid"	INTEGER NOT NULL,
	"engine_oid"	INTEGER NOT NULL,
	"initial_size_oid"	INTEGER NOT NULL,
	"is_wait"	INTEGER NOT NULL,
	"name_oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "my_sql_alter_user_statement";
CREATE TABLE IF NOT EXISTS "my_sql_alter_user_statement" (
	"oid"	INTEGER NOT NULL,
	"alter_users"	TEXT NOT NULL,
	"is_if_exists"	INTEGER NOT NULL,
	"password_option"	TEXT NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "my_sql_analyze_statement";
CREATE TABLE IF NOT EXISTS "my_sql_analyze_statement" (
	"oid"	INTEGER NOT NULL,
	"is_local"	INTEGER NOT NULL,
	"is_no_write_to_binlog"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "my_sql_binlog_statement";
CREATE TABLE IF NOT EXISTS "my_sql_binlog_statement" (
	"oid"	INTEGER NOT NULL,
	"expr_oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "my_sql_case_statement";
CREATE TABLE IF NOT EXISTS "my_sql_case_statement" (
	"oid"	INTEGER NOT NULL,
	"condition_oid"	INTEGER NOT NULL,
	"else_item"	TEXT NOT NULL,
	"when_list"	TEXT NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "my_sql_char_expr";
CREATE TABLE IF NOT EXISTS "my_sql_char_expr" (
	"oid"	INTEGER NOT NULL,
	"charset"	TEXT NOT NULL,
	"collate"	TEXT NOT NULL,
	"type"	TEXT NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "my_sql_check_table_statement";
CREATE TABLE IF NOT EXISTS "my_sql_check_table_statement" (
	"oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "my_sql_checksum_table_statement";
CREATE TABLE IF NOT EXISTS "my_sql_checksum_table_statement" (
	"oid"	INTEGER NOT NULL,
	"is_extended"	INTEGER NOT NULL,
	"is_quick"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "my_sql_clear_plan_cache_statement";
CREATE TABLE IF NOT EXISTS "my_sql_clear_plan_cache_statement" (
	"oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "my_sql_create_add_log_file_group_statement";
CREATE TABLE IF NOT EXISTS "my_sql_create_add_log_file_group_statement" (
	"oid"	INTEGER NOT NULL,
	"add_undo_file_oid"	INTEGER NOT NULL,
	"comment_oid"	INTEGER NOT NULL,
	"engine_oid"	INTEGER NOT NULL,
	"initial_size_oid"	INTEGER NOT NULL,
	"is_wait"	INTEGER NOT NULL,
	"name_oid"	INTEGER NOT NULL,
	"node_group_oid"	INTEGER NOT NULL,
	"redo_buffer_size_oid"	INTEGER NOT NULL,
	"undo_buffer_size_oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "my_sql_create_event_statement";
CREATE TABLE IF NOT EXISTS "my_sql_create_event_statement" (
	"oid"	INTEGER NOT NULL,
	"comment_oid"	INTEGER NOT NULL,
	"definer_oid"	INTEGER NOT NULL,
	"enable"	INTEGER NOT NULL,
	"event_body_oid"	INTEGER NOT NULL,
	"is_disable_on_slave"	INTEGER NOT NULL,
	"is_if_not_exists"	INTEGER NOT NULL,
	"is_on_completion_preserve"	INTEGER NOT NULL,
	"name_oid"	INTEGER NOT NULL,
	"rename_to_oid"	INTEGER NOT NULL,
	"schedule_oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "my_sql_create_external_catalog_statement";
CREATE TABLE IF NOT EXISTS "my_sql_create_external_catalog_statement" (
	"oid"	INTEGER NOT NULL,
	"comment_oid"	INTEGER NOT NULL,
	"is_if_not_exists"	INTEGER NOT NULL,
	"name_oid"	INTEGER NOT NULL,
	"properties"	TEXT NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "my_sql_create_server_statement";
CREATE TABLE IF NOT EXISTS "my_sql_create_server_statement" (
	"oid"	INTEGER NOT NULL,
	"database_oid"	INTEGER NOT NULL,
	"foreign_data_wrapper_oid"	INTEGER NOT NULL,
	"host_oid"	INTEGER NOT NULL,
	"name_oid"	INTEGER NOT NULL,
	"owner_oid"	INTEGER NOT NULL,
	"password_oid"	INTEGER NOT NULL,
	"port_oid"	INTEGER NOT NULL,
	"socket_oid"	INTEGER NOT NULL,
	"user_oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "my_sql_create_table_space_statement";
CREATE TABLE IF NOT EXISTS "my_sql_create_table_space_statement" (
	"oid"	INTEGER NOT NULL,
	"add_data_file_oid"	INTEGER NOT NULL,
	"auto_extent_size_oid"	INTEGER NOT NULL,
	"comment_oid"	INTEGER NOT NULL,
	"engine_oid"	INTEGER NOT NULL,
	"extent_size_oid"	INTEGER NOT NULL,
	"file_block_size_oid"	INTEGER NOT NULL,
	"initial_size_oid"	INTEGER NOT NULL,
	"is_wait"	INTEGER NOT NULL,
	"log_file_group_oid"	INTEGER NOT NULL,
	"max_size_oid"	INTEGER NOT NULL,
	"name_oid"	INTEGER NOT NULL,
	"node_group_oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "my_sql_create_table_statement";
CREATE TABLE IF NOT EXISTS "my_sql_create_table_statement" (
	"oid"	INTEGER NOT NULL,
	"archive_by_oid"	INTEGER NOT NULL,
	"db_partition_by_oid"	INTEGER NOT NULL,
	"db_partitions_oid"	INTEGER NOT NULL,
	"dbpartitions_oid"	INTEGER NOT NULL,
	"distribute_by_type_oid"	INTEGER NOT NULL,
	"engine_oid"	INTEGER NOT NULL,
	"ext_partition_oid"	INTEGER NOT NULL,
	"is_broad_cast"	INTEGER NOT NULL,
	"stored_by_oid"	INTEGER NOT NULL,
	"table_group_oid"	INTEGER NOT NULL,
	"table_partition_by_oid"	INTEGER NOT NULL,
	"table_partitions_oid"	INTEGER NOT NULL,
	"tbpartitions_oid"	INTEGER NOT NULL,
	"with"	TEXT NOT NULL,
	"with_data"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "my_sql_create_user_statement";
CREATE TABLE IF NOT EXISTS "my_sql_create_user_statement" (
	"oid"	INTEGER NOT NULL,
	"is_if_not_exists"	INTEGER NOT NULL,
	"users"	TEXT NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "my_sql_cursor_declare_statement";
CREATE TABLE IF NOT EXISTS "my_sql_cursor_declare_statement" (
	"oid"	INTEGER NOT NULL,
	"cursor_name_oid"	INTEGER NOT NULL,
	"select_oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "my_sql_declare_condition_statement";
CREATE TABLE IF NOT EXISTS "my_sql_declare_condition_statement" (
	"oid"	INTEGER NOT NULL,
	"condition_name"	TEXT NOT NULL,
	"condition_value"	TEXT NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "my_sql_declare_handler_statement";
CREATE TABLE IF NOT EXISTS "my_sql_declare_handler_statement" (
	"oid"	INTEGER NOT NULL,
	"condition_values"	TEXT NOT NULL,
	"handle_type"	TEXT NOT NULL,
	"sp_statement_oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "my_sql_declare_statement";
CREATE TABLE IF NOT EXISTS "my_sql_declare_statement" (
	"oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "my_sql_delete_statement";
CREATE TABLE IF NOT EXISTS "my_sql_delete_statement" (
	"oid"	INTEGER NOT NULL,
	"force_partition_oid"	INTEGER NOT NULL,
	"hints_size"	INTEGER NOT NULL,
	"is_force_all_partitions"	INTEGER NOT NULL,
	"is_fulltext_dictionary"	INTEGER NOT NULL,
	"is_ignore"	INTEGER NOT NULL,
	"is_low_priority"	INTEGER NOT NULL,
	"is_quick"	INTEGER NOT NULL,
	"limit_oid"	INTEGER NOT NULL,
	"order_by_oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "my_sql_disabled_plan_cache_statement";
CREATE TABLE IF NOT EXISTS "my_sql_disabled_plan_cache_statement" (
	"oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "my_sql_event_schedule";
CREATE TABLE IF NOT EXISTS "my_sql_event_schedule" (
	"oid"	INTEGER NOT NULL,
	"at_oid"	INTEGER NOT NULL,
	"ends_oid"	INTEGER NOT NULL,
	"every_oid"	INTEGER NOT NULL,
	"starts_oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "my_sql_execute_for_ads_statement";
CREATE TABLE IF NOT EXISTS "my_sql_execute_for_ads_statement" (
	"oid"	INTEGER NOT NULL,
	"action_oid"	INTEGER NOT NULL,
	"role_oid"	INTEGER NOT NULL,
	"status_oid"	INTEGER NOT NULL,
	"target_id_oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "my_sql_execute_statement";
CREATE TABLE IF NOT EXISTS "my_sql_execute_statement" (
	"oid"	INTEGER NOT NULL,
	"statement_name_oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "my_sql_explain_plan_cache_statement";
CREATE TABLE IF NOT EXISTS "my_sql_explain_plan_cache_statement" (
	"oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "my_sql_explain_statement";
CREATE TABLE IF NOT EXISTS "my_sql_explain_statement" (
	"oid"	INTEGER NOT NULL,
	"column_name_oid"	INTEGER NOT NULL,
	"connection_id_oid"	INTEGER NOT NULL,
	"is_describe"	INTEGER NOT NULL,
	"is_distribute_info"	INTEGER NOT NULL,
	"table_name_oid"	INTEGER NOT NULL,
	"wild_oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "my_sql_expr_impl";
CREATE TABLE IF NOT EXISTS "my_sql_expr_impl" (
	"oid"	INTEGER NOT NULL,
	"hint_oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "my_sql_ext_partition";
CREATE TABLE IF NOT EXISTS "my_sql_ext_partition" (
	"oid"	INTEGER NOT NULL,
	"items"	TEXT NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "my_sql_flashback_statement";
CREATE TABLE IF NOT EXISTS "my_sql_flashback_statement" (
	"oid"	INTEGER NOT NULL,
	"name_oid"	INTEGER NOT NULL,
	"rename_to_oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "my_sql_flush_statement";
CREATE TABLE IF NOT EXISTS "my_sql_flush_statement" (
	"oid"	INTEGER NOT NULL,
	"is_binary_logs"	INTEGER NOT NULL,
	"is_des_key_file"	INTEGER NOT NULL,
	"is_engine_logs"	INTEGER NOT NULL,
	"is_error_logs"	INTEGER NOT NULL,
	"is_for_export"	INTEGER NOT NULL,
	"is_general_logs"	INTEGER NOT NULL,
	"is_hots"	INTEGER NOT NULL,
	"is_local"	INTEGER NOT NULL,
	"is_logs"	INTEGER NOT NULL,
	"is_master"	INTEGER NOT NULL,
	"is_no_write_to_binlog"	INTEGER NOT NULL,
	"is_optimizer_costs"	INTEGER NOT NULL,
	"is_privileges"	INTEGER NOT NULL,
	"is_query_cache"	INTEGER NOT NULL,
	"is_relay_logs"	INTEGER NOT NULL,
	"is_slow_logs"	INTEGER NOT NULL,
	"is_status"	INTEGER NOT NULL,
	"is_table_option"	INTEGER NOT NULL,
	"is_user_resources"	INTEGER NOT NULL,
	"is_with_read_lock"	INTEGER NOT NULL,
	"relay_logs_for_channel_oid"	INTEGER NOT NULL,
	"version_oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "my_sql_force_index_hint";
CREATE TABLE IF NOT EXISTS "my_sql_force_index_hint" (
	"oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "my_sql_help_statement";
CREATE TABLE IF NOT EXISTS "my_sql_help_statement" (
	"oid"	INTEGER NOT NULL,
	"content_oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "my_sql_hint_statement";
CREATE TABLE IF NOT EXISTS "my_sql_hint_statement" (
	"oid"	INTEGER NOT NULL,
	"hint_version"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "my_sql_ignore_index_hint";
CREATE TABLE IF NOT EXISTS "my_sql_ignore_index_hint" (
	"oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "my_sql_index_hint_impl";
CREATE TABLE IF NOT EXISTS "my_sql_index_hint_impl" (
	"oid"	INTEGER NOT NULL,
	"option"	TEXT NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "my_sql_insert_statement";
CREATE TABLE IF NOT EXISTS "my_sql_insert_statement" (
	"oid"	INTEGER NOT NULL,
	"hints_size"	INTEGER NOT NULL,
	"is_delayed"	INTEGER NOT NULL,
	"is_fulltext_dictionary"	INTEGER NOT NULL,
	"is_high_priority"	INTEGER NOT NULL,
	"is_if_not_exists"	INTEGER NOT NULL,
	"is_ignore"	INTEGER NOT NULL,
	"is_low_priority"	INTEGER NOT NULL,
	"is_overwrite"	INTEGER NOT NULL,
	"is_rollback_on_fail"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "my_sql_iterate_statement";
CREATE TABLE IF NOT EXISTS "my_sql_iterate_statement" (
	"oid"	INTEGER NOT NULL,
	"label_name"	TEXT NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "my_sql_json_table_expr";
CREATE TABLE IF NOT EXISTS "my_sql_json_table_expr" (
	"oid"	INTEGER NOT NULL,
	"columns"	TEXT NOT NULL,
	"expr_oid"	INTEGER NOT NULL,
	"path_oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "my_sql_key";
CREATE TABLE IF NOT EXISTS "my_sql_key" (
	"oid"	INTEGER NOT NULL,
	"index_type"	TEXT NOT NULL,
	"is_has_constraint"	INTEGER NOT NULL,
	"key_block_size_oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "my_sql_kill_statement";
CREATE TABLE IF NOT EXISTS "my_sql_kill_statement" (
	"oid"	INTEGER NOT NULL,
	"thread_id_oid"	INTEGER NOT NULL,
	"type"	TEXT NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "my_sql_leave_statement";
CREATE TABLE IF NOT EXISTS "my_sql_leave_statement" (
	"oid"	INTEGER NOT NULL,
	"label_name"	TEXT NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "my_sql_load_data_in_file_statement";
CREATE TABLE IF NOT EXISTS "my_sql_load_data_in_file_statement" (
	"oid"	INTEGER NOT NULL,
	"charset"	TEXT NOT NULL,
	"columns_enclosed_by_oid"	INTEGER NOT NULL,
	"columns_escaped_oid"	INTEGER NOT NULL,
	"columns_terminated_by_oid"	INTEGER NOT NULL,
	"file_name_oid"	INTEGER NOT NULL,
	"ignore_lines_number_oid"	INTEGER NOT NULL,
	"is_columns_enclosed_optionally"	INTEGER NOT NULL,
	"is_concurrent"	INTEGER NOT NULL,
	"is_ignore"	INTEGER NOT NULL,
	"is_local"	INTEGER NOT NULL,
	"is_low_priority"	INTEGER NOT NULL,
	"is_replicate"	INTEGER NOT NULL,
	"lines_starting_by_oid"	INTEGER NOT NULL,
	"lines_terminated_by_oid"	INTEGER NOT NULL,
	"table_name_oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "my_sql_load_xml_statement";
CREATE TABLE IF NOT EXISTS "my_sql_load_xml_statement" (
	"oid"	INTEGER NOT NULL,
	"charset"	TEXT NOT NULL,
	"file_name_oid"	INTEGER NOT NULL,
	"ignore_lines_number_oid"	INTEGER NOT NULL,
	"is_concurrent"	INTEGER NOT NULL,
	"is_ignore"	INTEGER NOT NULL,
	"is_local"	INTEGER NOT NULL,
	"is_low_priority"	INTEGER NOT NULL,
	"is_replicate"	INTEGER NOT NULL,
	"rows_identified_by_oid"	INTEGER NOT NULL,
	"table_name_oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "my_sql_lock_table_statement";
CREATE TABLE IF NOT EXISTS "my_sql_lock_table_statement" (
	"oid"	INTEGER NOT NULL,
	"items"	TEXT NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "my_sql_manage_instance_group_statement";
CREATE TABLE IF NOT EXISTS "my_sql_manage_instance_group_statement" (
	"oid"	INTEGER NOT NULL,
	"group_names_to_string"	TEXT NOT NULL,
	"operation_oid"	INTEGER NOT NULL,
	"replication_oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "my_sql_migrate_statement";
CREATE TABLE IF NOT EXISTS "my_sql_migrate_statement" (
	"oid"	INTEGER NOT NULL,
	"from_ins_id_oid"	INTEGER NOT NULL,
	"from_ins_ip_oid"	INTEGER NOT NULL,
	"from_ins_port_oid"	INTEGER NOT NULL,
	"from_ins_status_oid"	INTEGER NOT NULL,
	"migrate_type_oid"	INTEGER NOT NULL,
	"schema_oid"	INTEGER NOT NULL,
	"shard_names_oid"	INTEGER NOT NULL,
	"to_ins_id_oid"	INTEGER NOT NULL,
	"to_ins_ip_oid"	INTEGER NOT NULL,
	"to_ins_port_oid"	INTEGER NOT NULL,
	"to_ins_status_oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "my_sql_object_impl";
CREATE TABLE IF NOT EXISTS "my_sql_object_impl" (
	"oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "my_sql_optimize_statement";
CREATE TABLE IF NOT EXISTS "my_sql_optimize_statement" (
	"oid"	INTEGER NOT NULL,
	"is_local"	INTEGER NOT NULL,
	"is_no_write_to_binlog"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "my_sql_ordering_expr";
CREATE TABLE IF NOT EXISTS "my_sql_ordering_expr" (
	"oid"	INTEGER NOT NULL,
	"expr_oid"	INTEGER NOT NULL,
	"type"	TEXT NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "my_sql_out_file_expr";
CREATE TABLE IF NOT EXISTS "my_sql_out_file_expr" (
	"oid"	INTEGER NOT NULL,
	"charset"	TEXT NOT NULL,
	"columns_enclosed_by_oid"	INTEGER NOT NULL,
	"columns_escaped_oid"	INTEGER NOT NULL,
	"columns_terminated_by_oid"	INTEGER NOT NULL,
	"file_oid"	INTEGER NOT NULL,
	"ignore_lines_number_oid"	INTEGER NOT NULL,
	"is_columns_enclosed_optionally"	INTEGER NOT NULL,
	"lines_starting_by_oid"	INTEGER NOT NULL,
	"lines_terminated_by_oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "my_sql_partition_by_key";
CREATE TABLE IF NOT EXISTS "my_sql_partition_by_key" (
	"oid"	INTEGER NOT NULL,
	"algorithm"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "my_sql_prepare_statement";
CREATE TABLE IF NOT EXISTS "my_sql_prepare_statement" (
	"oid"	INTEGER NOT NULL,
	"from_oid"	INTEGER NOT NULL,
	"name_oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "my_sql_primary_key";
CREATE TABLE IF NOT EXISTS "my_sql_primary_key" (
	"oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "my_sql_raft_leader_transfer_statement";
CREATE TABLE IF NOT EXISTS "my_sql_raft_leader_transfer_statement" (
	"oid"	INTEGER NOT NULL,
	"from_oid"	INTEGER NOT NULL,
	"shard_oid"	INTEGER NOT NULL,
	"timeout_oid"	INTEGER NOT NULL,
	"to_oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "my_sql_raft_member_change_statement";
CREATE TABLE IF NOT EXISTS "my_sql_raft_member_change_statement" (
	"oid"	INTEGER NOT NULL,
	"host_oid"	INTEGER NOT NULL,
	"is_force"	INTEGER NOT NULL,
	"is_no_leader"	INTEGER NOT NULL,
	"shard_oid"	INTEGER NOT NULL,
	"status_oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "my_sql_rename_sequence_statement";
CREATE TABLE IF NOT EXISTS "my_sql_rename_sequence_statement" (
	"oid"	INTEGER NOT NULL,
	"name_oid"	INTEGER NOT NULL,
	"to_oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "my_sql_rename_table_statement";
CREATE TABLE IF NOT EXISTS "my_sql_rename_table_statement" (
	"oid"	INTEGER NOT NULL,
	"items"	TEXT NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "my_sql_repeat_statement";
CREATE TABLE IF NOT EXISTS "my_sql_repeat_statement" (
	"oid"	INTEGER NOT NULL,
	"condition_oid"	INTEGER NOT NULL,
	"label_name"	TEXT NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "my_sql_reset_statement";
CREATE TABLE IF NOT EXISTS "my_sql_reset_statement" (
	"oid"	INTEGER NOT NULL,
	"options"	TEXT NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "my_sql_select_into_statement";
CREATE TABLE IF NOT EXISTS "my_sql_select_into_statement" (
	"oid"	INTEGER NOT NULL,
	"select_oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "my_sql_select_query_block";
CREATE TABLE IF NOT EXISTS "my_sql_select_query_block" (
	"oid"	INTEGER NOT NULL,
	"cache"	INTEGER NOT NULL,
	"force_partition_oid"	INTEGER NOT NULL,
	"hints_size"	INTEGER NOT NULL,
	"is_big_result"	INTEGER NOT NULL,
	"is_buffer_result"	INTEGER NOT NULL,
	"is_calc_found_rows"	INTEGER NOT NULL,
	"is_hign_priority"	INTEGER NOT NULL,
	"is_lock_in_share_mode"	INTEGER NOT NULL,
	"is_small_result"	INTEGER NOT NULL,
	"is_straight_join"	INTEGER NOT NULL,
	"procedure_name_oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "my_sql_set_transaction_statement";
CREATE TABLE IF NOT EXISTS "my_sql_set_transaction_statement" (
	"oid"	INTEGER NOT NULL,
	"access_model"	TEXT NOT NULL,
	"global"	INTEGER NOT NULL,
	"is_local"	INTEGER NOT NULL,
	"isolation_level"	TEXT NOT NULL,
	"policy_oid"	INTEGER NOT NULL,
	"session"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "my_sql_show_authors_statement";
CREATE TABLE IF NOT EXISTS "my_sql_show_authors_statement" (
	"oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "my_sql_show_bin_log_events_statement";
CREATE TABLE IF NOT EXISTS "my_sql_show_bin_log_events_statement" (
	"oid"	INTEGER NOT NULL,
	"from_oid"	INTEGER NOT NULL,
	"in_oid"	INTEGER NOT NULL,
	"limit_oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "my_sql_show_binary_logs_statement";
CREATE TABLE IF NOT EXISTS "my_sql_show_binary_logs_statement" (
	"oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "my_sql_show_broadcasts_statement";
CREATE TABLE IF NOT EXISTS "my_sql_show_broadcasts_statement" (
	"oid"	INTEGER NOT NULL,
	"limit_oid"	INTEGER NOT NULL,
	"order_by_oid"	INTEGER NOT NULL,
	"where_oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "my_sql_show_character_set_statement";
CREATE TABLE IF NOT EXISTS "my_sql_show_character_set_statement" (
	"oid"	INTEGER NOT NULL,
	"pattern_oid"	INTEGER NOT NULL,
	"where_oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "my_sql_show_cluster_name_statement";
CREATE TABLE IF NOT EXISTS "my_sql_show_cluster_name_statement" (
	"oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "my_sql_show_collation_statement";
CREATE TABLE IF NOT EXISTS "my_sql_show_collation_statement" (
	"oid"	INTEGER NOT NULL,
	"pattern_oid"	INTEGER NOT NULL,
	"where_oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "my_sql_show_config_statement";
CREATE TABLE IF NOT EXISTS "my_sql_show_config_statement" (
	"oid"	INTEGER NOT NULL,
	"name_oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "my_sql_show_contributors_statement";
CREATE TABLE IF NOT EXISTS "my_sql_show_contributors_statement" (
	"oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "my_sql_show_create_database_statement";
CREATE TABLE IF NOT EXISTS "my_sql_show_create_database_statement" (
	"oid"	INTEGER NOT NULL,
	"database_oid"	INTEGER NOT NULL,
	"is_if_not_exists"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "my_sql_show_create_event_statement";
CREATE TABLE IF NOT EXISTS "my_sql_show_create_event_statement" (
	"oid"	INTEGER NOT NULL,
	"event_name_oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "my_sql_show_create_function_statement";
CREATE TABLE IF NOT EXISTS "my_sql_show_create_function_statement" (
	"oid"	INTEGER NOT NULL,
	"name_oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "my_sql_show_create_procedure_statement";
CREATE TABLE IF NOT EXISTS "my_sql_show_create_procedure_statement" (
	"oid"	INTEGER NOT NULL,
	"name_oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "my_sql_show_create_trigger_statement";
CREATE TABLE IF NOT EXISTS "my_sql_show_create_trigger_statement" (
	"oid"	INTEGER NOT NULL,
	"name_oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "my_sql_show_database_status_statement";
CREATE TABLE IF NOT EXISTS "my_sql_show_database_status_statement" (
	"oid"	INTEGER NOT NULL,
	"is_full"	INTEGER NOT NULL,
	"limit_oid"	INTEGER NOT NULL,
	"name_oid"	INTEGER NOT NULL,
	"order_by_oid"	INTEGER NOT NULL,
	"where_oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "my_sql_show_datasources_statement";
CREATE TABLE IF NOT EXISTS "my_sql_show_datasources_statement" (
	"oid"	INTEGER NOT NULL,
	"limit_oid"	INTEGER NOT NULL,
	"order_by_oid"	INTEGER NOT NULL,
	"where_oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "my_sql_show_ddl_status_statement";
CREATE TABLE IF NOT EXISTS "my_sql_show_ddl_status_statement" (
	"oid"	INTEGER NOT NULL,
	"limit_oid"	INTEGER NOT NULL,
	"order_by_oid"	INTEGER NOT NULL,
	"where_oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "my_sql_show_ds_statement";
CREATE TABLE IF NOT EXISTS "my_sql_show_ds_statement" (
	"oid"	INTEGER NOT NULL,
	"limit_oid"	INTEGER NOT NULL,
	"order_by_oid"	INTEGER NOT NULL,
	"where_oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "my_sql_show_engine_statement";
CREATE TABLE IF NOT EXISTS "my_sql_show_engine_statement" (
	"oid"	INTEGER NOT NULL,
	"name_oid"	INTEGER NOT NULL,
	"option"	TEXT NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "my_sql_show_engines_statement";
CREATE TABLE IF NOT EXISTS "my_sql_show_engines_statement" (
	"oid"	INTEGER NOT NULL,
	"is_storage"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "my_sql_show_errors_statement";
CREATE TABLE IF NOT EXISTS "my_sql_show_errors_statement" (
	"oid"	INTEGER NOT NULL,
	"is_count"	INTEGER NOT NULL,
	"limit_oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "my_sql_show_events_statement";
CREATE TABLE IF NOT EXISTS "my_sql_show_events_statement" (
	"oid"	INTEGER NOT NULL,
	"like_oid"	INTEGER NOT NULL,
	"schema_oid"	INTEGER NOT NULL,
	"where_oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "my_sql_show_function_code_statement";
CREATE TABLE IF NOT EXISTS "my_sql_show_function_code_statement" (
	"oid"	INTEGER NOT NULL,
	"name_oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "my_sql_show_function_status_statement";
CREATE TABLE IF NOT EXISTS "my_sql_show_function_status_statement" (
	"oid"	INTEGER NOT NULL,
	"like_oid"	INTEGER NOT NULL,
	"where_oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "my_sql_show_grants_statement";
CREATE TABLE IF NOT EXISTS "my_sql_show_grants_statement" (
	"oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "my_sql_show_help_statement";
CREATE TABLE IF NOT EXISTS "my_sql_show_help_statement" (
	"oid"	INTEGER NOT NULL,
	"limit_oid"	INTEGER NOT NULL,
	"order_by_oid"	INTEGER NOT NULL,
	"where_oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "my_sql_show_hms_meta_statement";
CREATE TABLE IF NOT EXISTS "my_sql_show_hms_meta_statement" (
	"oid"	INTEGER NOT NULL,
	"name_oid"	INTEGER NOT NULL,
	"schema"	TEXT NOT NULL,
	"table_name"	TEXT NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "my_sql_show_job_status_statement";
CREATE TABLE IF NOT EXISTS "my_sql_show_job_status_statement" (
	"oid"	INTEGER NOT NULL,
	"is_sync"	INTEGER NOT NULL,
	"where_oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "my_sql_show_master_logs_statement";
CREATE TABLE IF NOT EXISTS "my_sql_show_master_logs_statement" (
	"oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "my_sql_show_master_status_statement";
CREATE TABLE IF NOT EXISTS "my_sql_show_master_status_statement" (
	"oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "my_sql_show_migrate_task_status_statement";
CREATE TABLE IF NOT EXISTS "my_sql_show_migrate_task_status_statement" (
	"oid"	INTEGER NOT NULL,
	"where_oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "my_sql_show_node_statement";
CREATE TABLE IF NOT EXISTS "my_sql_show_node_statement" (
	"oid"	INTEGER NOT NULL,
	"limit_oid"	INTEGER NOT NULL,
	"order_by_oid"	INTEGER NOT NULL,
	"where_oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "my_sql_show_open_tables_statement";
CREATE TABLE IF NOT EXISTS "my_sql_show_open_tables_statement" (
	"oid"	INTEGER NOT NULL,
	"database_oid"	INTEGER NOT NULL,
	"like_oid"	INTEGER NOT NULL,
	"where_oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "my_sql_show_partitions_statement";
CREATE TABLE IF NOT EXISTS "my_sql_show_partitions_statement" (
	"oid"	INTEGER NOT NULL,
	"name_oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "my_sql_show_physical_processlist_statement";
CREATE TABLE IF NOT EXISTS "my_sql_show_physical_processlist_statement" (
	"oid"	INTEGER NOT NULL,
	"is_full"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "my_sql_show_plan_cache_statement";
CREATE TABLE IF NOT EXISTS "my_sql_show_plan_cache_statement" (
	"oid"	INTEGER NOT NULL,
	"select_oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "my_sql_show_plan_cache_status_statement";
CREATE TABLE IF NOT EXISTS "my_sql_show_plan_cache_status_statement" (
	"oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "my_sql_show_plugins_statement";
CREATE TABLE IF NOT EXISTS "my_sql_show_plugins_statement" (
	"oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "my_sql_show_privileges_statement";
CREATE TABLE IF NOT EXISTS "my_sql_show_privileges_statement" (
	"oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "my_sql_show_procedure_code_statement";
CREATE TABLE IF NOT EXISTS "my_sql_show_procedure_code_statement" (
	"oid"	INTEGER NOT NULL,
	"name_oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "my_sql_show_procedure_status_statement";
CREATE TABLE IF NOT EXISTS "my_sql_show_procedure_status_statement" (
	"oid"	INTEGER NOT NULL,
	"like_oid"	INTEGER NOT NULL,
	"where_oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "my_sql_show_process_list_statement";
CREATE TABLE IF NOT EXISTS "my_sql_show_process_list_statement" (
	"oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "my_sql_show_profile_statement";
CREATE TABLE IF NOT EXISTS "my_sql_show_profile_statement" (
	"oid"	INTEGER NOT NULL,
	"for_query_oid"	INTEGER NOT NULL,
	"limit_oid"	INTEGER NOT NULL,
	"types"	TEXT NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "my_sql_show_profiles_statement";
CREATE TABLE IF NOT EXISTS "my_sql_show_profiles_statement" (
	"oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "my_sql_show_relay_log_events_statement";
CREATE TABLE IF NOT EXISTS "my_sql_show_relay_log_events_statement" (
	"oid"	INTEGER NOT NULL,
	"from_oid"	INTEGER NOT NULL,
	"limit_oid"	INTEGER NOT NULL,
	"log_name_oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "my_sql_show_rule_statement";
CREATE TABLE IF NOT EXISTS "my_sql_show_rule_statement" (
	"oid"	INTEGER NOT NULL,
	"is_full"	INTEGER NOT NULL,
	"is_version"	INTEGER NOT NULL,
	"limit_oid"	INTEGER NOT NULL,
	"name_oid"	INTEGER NOT NULL,
	"order_by_oid"	INTEGER NOT NULL,
	"where_oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "my_sql_show_rule_status_statement";
CREATE TABLE IF NOT EXISTS "my_sql_show_rule_status_statement" (
	"oid"	INTEGER NOT NULL,
	"is_full"	INTEGER NOT NULL,
	"is_lite"	INTEGER NOT NULL,
	"is_version"	INTEGER NOT NULL,
	"limit_oid"	INTEGER NOT NULL,
	"order_by_oid"	INTEGER NOT NULL,
	"where_oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "my_sql_show_sequences_statement";
CREATE TABLE IF NOT EXISTS "my_sql_show_sequences_statement" (
	"oid"	INTEGER NOT NULL,
	"limit_oid"	INTEGER NOT NULL,
	"order_by_oid"	INTEGER NOT NULL,
	"where_oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "my_sql_show_slave_hosts_statement";
CREATE TABLE IF NOT EXISTS "my_sql_show_slave_hosts_statement" (
	"oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "my_sql_show_slave_status_statement";
CREATE TABLE IF NOT EXISTS "my_sql_show_slave_status_statement" (
	"oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "my_sql_show_slow_statement";
CREATE TABLE IF NOT EXISTS "my_sql_show_slow_statement" (
	"oid"	INTEGER NOT NULL,
	"is_full"	INTEGER NOT NULL,
	"is_physical"	INTEGER NOT NULL,
	"limit_oid"	INTEGER NOT NULL,
	"order_by_oid"	INTEGER NOT NULL,
	"where_oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "my_sql_show_status_statement";
CREATE TABLE IF NOT EXISTS "my_sql_show_status_statement" (
	"oid"	INTEGER NOT NULL,
	"is_global"	INTEGER NOT NULL,
	"is_session"	INTEGER NOT NULL,
	"like_oid"	INTEGER NOT NULL,
	"where_oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "my_sql_show_table_status_statement";
CREATE TABLE IF NOT EXISTS "my_sql_show_table_status_statement" (
	"oid"	INTEGER NOT NULL,
	"database_oid"	INTEGER NOT NULL,
	"like_oid"	INTEGER NOT NULL,
	"table_group_oid"	INTEGER NOT NULL,
	"where_oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "my_sql_show_topology_statement";
CREATE TABLE IF NOT EXISTS "my_sql_show_topology_statement" (
	"oid"	INTEGER NOT NULL,
	"is_full"	INTEGER NOT NULL,
	"limit_oid"	INTEGER NOT NULL,
	"name_oid"	INTEGER NOT NULL,
	"order_by_oid"	INTEGER NOT NULL,
	"where_oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "my_sql_show_trace_statement";
CREATE TABLE IF NOT EXISTS "my_sql_show_trace_statement" (
	"oid"	INTEGER NOT NULL,
	"limit_oid"	INTEGER NOT NULL,
	"order_by_oid"	INTEGER NOT NULL,
	"where_oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "my_sql_show_triggers_statement";
CREATE TABLE IF NOT EXISTS "my_sql_show_triggers_statement" (
	"oid"	INTEGER NOT NULL,
	"database_oid"	INTEGER NOT NULL,
	"like_oid"	INTEGER NOT NULL,
	"where_oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "my_sql_show_warnings_statement";
CREATE TABLE IF NOT EXISTS "my_sql_show_warnings_statement" (
	"oid"	INTEGER NOT NULL,
	"is_count"	INTEGER NOT NULL,
	"limit_oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "my_sql_statement_impl";
CREATE TABLE IF NOT EXISTS "my_sql_statement_impl" (
	"oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "my_sql_sub_partition_by_key";
CREATE TABLE IF NOT EXISTS "my_sql_sub_partition_by_key" (
	"oid"	INTEGER NOT NULL,
	"algorithm"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "my_sql_sub_partition_by_list";
CREATE TABLE IF NOT EXISTS "my_sql_sub_partition_by_list" (
	"oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "my_sql_sub_partition_by_value";
CREATE TABLE IF NOT EXISTS "my_sql_sub_partition_by_value" (
	"oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "my_sql_table_index";
CREATE TABLE IF NOT EXISTS "my_sql_table_index" (
	"oid"	INTEGER NOT NULL,
	"algorithm"	TEXT NOT NULL,
	"analyzer_name_oid"	INTEGER NOT NULL,
	"comment_oid"	INTEGER NOT NULL,
	"db_partition_by_oid"	INTEGER NOT NULL,
	"distance_measure"	TEXT NOT NULL,
	"index_analyzer_name_oid"	INTEGER NOT NULL,
	"index_definition_oid"	INTEGER NOT NULL,
	"index_type"	TEXT NOT NULL,
	"is_global"	INTEGER NOT NULL,
	"is_local"	INTEGER NOT NULL,
	"name_oid"	INTEGER NOT NULL,
	"query_analyzer_name_oid"	INTEGER NOT NULL,
	"table_partition_by_oid"	INTEGER NOT NULL,
	"table_partitions_oid"	INTEGER NOT NULL,
	"with_dic_name_oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "my_sql_unique";
CREATE TABLE IF NOT EXISTS "my_sql_unique" (
	"oid"	INTEGER NOT NULL,
	"db_partition_by_oid"	INTEGER NOT NULL,
	"is_global"	INTEGER NOT NULL,
	"is_local"	INTEGER NOT NULL,
	"table_partition_by_oid"	INTEGER NOT NULL,
	"table_partitions_oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "my_sql_unlock_tables_statement";
CREATE TABLE IF NOT EXISTS "my_sql_unlock_tables_statement" (
	"oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "my_sql_update_plan_cache_statement";
CREATE TABLE IF NOT EXISTS "my_sql_update_plan_cache_statement" (
	"oid"	INTEGER NOT NULL,
	"form_select_oid"	INTEGER NOT NULL,
	"to_select_oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "my_sql_update_statement";
CREATE TABLE IF NOT EXISTS "my_sql_update_statement" (
	"oid"	INTEGER NOT NULL,
	"force_partition_oid"	INTEGER NOT NULL,
	"hints_size"	INTEGER NOT NULL,
	"is_commit_on_success"	INTEGER NOT NULL,
	"is_force_all_partitions"	INTEGER NOT NULL,
	"is_ignore"	INTEGER NOT NULL,
	"is_low_priority"	INTEGER NOT NULL,
	"is_query_on_pk"	INTEGER NOT NULL,
	"is_roll_back_on_fail"	INTEGER NOT NULL,
	"limit_oid"	INTEGER NOT NULL,
	"target_affect_row_oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "my_sql_update_table_source";
CREATE TABLE IF NOT EXISTS "my_sql_update_table_source" (
	"oid"	INTEGER NOT NULL,
	"update_oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "my_sql_use_index_hint";
CREATE TABLE IF NOT EXISTS "my_sql_use_index_hint" (
	"oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "my_sql_user_name";
CREATE TABLE IF NOT EXISTS "my_sql_user_name" (
	"oid"	INTEGER NOT NULL,
	"host"	TEXT NOT NULL,
	"identified_by"	TEXT NOT NULL,
	"normalize_user_name"	TEXT NOT NULL,
	"resolved_column_oid"	INTEGER NOT NULL,
	"simple_name"	TEXT NOT NULL,
	"user_name"	TEXT NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "mysql_alter_full_text_statement";
CREATE TABLE IF NOT EXISTS "mysql_alter_full_text_statement" (
	"oid"	INTEGER NOT NULL,
	"item_oid"	INTEGER NOT NULL,
	"name_oid"	INTEGER NOT NULL,
	"type"	TEXT NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "mysql_alter_table_alter_check";
CREATE TABLE IF NOT EXISTS "mysql_alter_table_alter_check" (
	"oid"	INTEGER NOT NULL,
	"enforced"	INTEGER NOT NULL,
	"name_oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "mysql_create_full_text_analyzer_statement";
CREATE TABLE IF NOT EXISTS "mysql_create_full_text_analyzer_statement" (
	"oid"	INTEGER NOT NULL,
	"charfilters"	TEXT NOT NULL,
	"name_oid"	INTEGER NOT NULL,
	"tokenizer"	TEXT NOT NULL,
	"tokenizers"	TEXT NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "mysql_create_full_text_char_filter_statement";
CREATE TABLE IF NOT EXISTS "mysql_create_full_text_char_filter_statement" (
	"oid"	INTEGER NOT NULL,
	"name_oid"	INTEGER NOT NULL,
	"type_name_oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "mysql_create_full_text_dictionary_statement";
CREATE TABLE IF NOT EXISTS "mysql_create_full_text_dictionary_statement" (
	"oid"	INTEGER NOT NULL,
	"column_oid"	INTEGER NOT NULL,
	"comment"	TEXT NOT NULL,
	"name_oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "mysql_create_full_text_token_filter_statement";
CREATE TABLE IF NOT EXISTS "mysql_create_full_text_token_filter_statement" (
	"oid"	INTEGER NOT NULL,
	"name_oid"	INTEGER NOT NULL,
	"type_name_oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "mysql_create_full_text_tokenizer_statement";
CREATE TABLE IF NOT EXISTS "mysql_create_full_text_tokenizer_statement" (
	"oid"	INTEGER NOT NULL,
	"name_oid"	INTEGER NOT NULL,
	"type_name_oid"	INTEGER NOT NULL,
	"user_defined_dict_oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "mysql_deallocate_prepare_statement";
CREATE TABLE IF NOT EXISTS "mysql_deallocate_prepare_statement" (
	"oid"	INTEGER NOT NULL,
	"statement_name_oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "mysql_drop_full_text_statement";
CREATE TABLE IF NOT EXISTS "mysql_drop_full_text_statement" (
	"oid"	INTEGER NOT NULL,
	"name_oid"	INTEGER NOT NULL,
	"type"	TEXT NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "mysql_foreign_key";
CREATE TABLE IF NOT EXISTS "mysql_foreign_key" (
	"oid"	INTEGER NOT NULL,
	"index_name_oid"	INTEGER NOT NULL,
	"is_has_constraint"	INTEGER NOT NULL,
	"on_delete"	TEXT NOT NULL,
	"on_update"	TEXT NOT NULL,
	"reference_match"	TEXT NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "mysql_show_create_full_text_statement";
CREATE TABLE IF NOT EXISTS "mysql_show_create_full_text_statement" (
	"oid"	INTEGER NOT NULL,
	"name_oid"	INTEGER NOT NULL,
	"type"	TEXT NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "mysql_show_db_lock_statement";
CREATE TABLE IF NOT EXISTS "mysql_show_db_lock_statement" (
	"oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "mysql_show_full_text_statement";
CREATE TABLE IF NOT EXISTS "mysql_show_full_text_statement" (
	"oid"	INTEGER NOT NULL,
	"type"	TEXT NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "mysql_show_htc_statement";
CREATE TABLE IF NOT EXISTS "mysql_show_htc_statement" (
	"oid"	INTEGER NOT NULL,
	"is_full"	INTEGER NOT NULL,
	"is_his"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "mysql_show_stc_statement";
CREATE TABLE IF NOT EXISTS "mysql_show_stc_statement" (
	"oid"	INTEGER NOT NULL,
	"is_full"	INTEGER NOT NULL,
	"is_his"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "odps_add_account_provider_statement";
CREATE TABLE IF NOT EXISTS "odps_add_account_provider_statement" (
	"oid"	INTEGER NOT NULL,
	"provider_oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "odps_add_file_statement";
CREATE TABLE IF NOT EXISTS "odps_add_file_statement" (
	"oid"	INTEGER NOT NULL,
	"alias"	TEXT NOT NULL,
	"comment_oid"	INTEGER NOT NULL,
	"file"	TEXT NOT NULL,
	"is_force"	INTEGER NOT NULL,
	"type"	TEXT NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "odps_add_statistic_statement";
CREATE TABLE IF NOT EXISTS "odps_add_statistic_statement" (
	"oid"	INTEGER NOT NULL,
	"statistic_clause_oid"	INTEGER NOT NULL,
	"table_oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "odps_add_table_statement";
CREATE TABLE IF NOT EXISTS "odps_add_table_statement" (
	"oid"	INTEGER NOT NULL,
	"comment_oid"	INTEGER NOT NULL,
	"is_force"	INTEGER NOT NULL,
	"table_oid"	INTEGER NOT NULL,
	"to_package_oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "odps_add_user_statement";
CREATE TABLE IF NOT EXISTS "odps_add_user_statement" (
	"oid"	INTEGER NOT NULL,
	"user_oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "odps_alter_table_set_change_logs";
CREATE TABLE IF NOT EXISTS "odps_alter_table_set_change_logs" (
	"oid"	INTEGER NOT NULL,
	"value_oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "odps_alter_table_set_file_format";
CREATE TABLE IF NOT EXISTS "odps_alter_table_set_file_format" (
	"oid"	INTEGER NOT NULL,
	"value_oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "odps_count_statement";
CREATE TABLE IF NOT EXISTS "odps_count_statement" (
	"oid"	INTEGER NOT NULL,
	"table_oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "odps_create_table_statement";
CREATE TABLE IF NOT EXISTS "odps_create_table_statement" (
	"oid"	INTEGER NOT NULL,
	"lifecycle_oid"	INTEGER NOT NULL,
	"like_oid"	INTEGER NOT NULL,
	"stored_by_oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "odps_declare_variable_statement";
CREATE TABLE IF NOT EXISTS "odps_declare_variable_statement" (
	"oid"	INTEGER NOT NULL,
	"data_type_oid"	INTEGER NOT NULL,
	"init_value_oid"	INTEGER NOT NULL,
	"variant"	TEXT NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "odps_exstore_statement";
CREATE TABLE IF NOT EXISTS "odps_exstore_statement" (
	"oid"	INTEGER NOT NULL,
	"table_oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "odps_grant_stmt";
CREATE TABLE IF NOT EXISTS "odps_grant_stmt" (
	"oid"	INTEGER NOT NULL,
	"expire_oid"	INTEGER NOT NULL,
	"is_label"	INTEGER NOT NULL,
	"is_super"	INTEGER NOT NULL,
	"label_oid"	INTEGER NOT NULL,
	"subject_type"	TEXT NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "odps_install_package_statement";
CREATE TABLE IF NOT EXISTS "odps_install_package_statement" (
	"oid"	INTEGER NOT NULL,
	"package_name_oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "odps_list_stmt";
CREATE TABLE IF NOT EXISTS "odps_list_stmt" (
	"oid"	INTEGER NOT NULL,
	"object_oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "odps_new_expr";
CREATE TABLE IF NOT EXISTS "odps_new_expr" (
	"oid"	INTEGER NOT NULL,
	"is_array"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "odps_object_impl";
CREATE TABLE IF NOT EXISTS "odps_object_impl" (
	"oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "odps_query_alias_statement";
CREATE TABLE IF NOT EXISTS "odps_query_alias_statement" (
	"oid"	INTEGER NOT NULL,
	"is_cache"	INTEGER NOT NULL,
	"statement_oid"	INTEGER NOT NULL,
	"variant"	TEXT NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "odps_read_statement";
CREATE TABLE IF NOT EXISTS "odps_read_statement" (
	"oid"	INTEGER NOT NULL,
	"row_count_oid"	INTEGER NOT NULL,
	"table_oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "odps_remove_statistic_statement";
CREATE TABLE IF NOT EXISTS "odps_remove_statistic_statement" (
	"oid"	INTEGER NOT NULL,
	"statistic_clause_oid"	INTEGER NOT NULL,
	"table_oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "odps_remove_user_statement";
CREATE TABLE IF NOT EXISTS "odps_remove_user_statement" (
	"oid"	INTEGER NOT NULL,
	"user_oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "odps_restore_statement";
CREATE TABLE IF NOT EXISTS "odps_restore_statement" (
	"oid"	INTEGER NOT NULL,
	"alias"	TEXT NOT NULL,
	"table_oid"	INTEGER NOT NULL,
	"to_oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "odps_select_query_block";
CREATE TABLE IF NOT EXISTS "odps_select_query_block" (
	"oid"	INTEGER NOT NULL,
	"z_order_by_oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "odps_set_label_statement";
CREATE TABLE IF NOT EXISTS "odps_set_label_statement" (
	"oid"	INTEGER NOT NULL,
	"label"	TEXT NOT NULL,
	"project_oid"	INTEGER NOT NULL,
	"table_oid"	INTEGER NOT NULL,
	"user_oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "odps_show_changelogs_statement";
CREATE TABLE IF NOT EXISTS "odps_show_changelogs_statement" (
	"oid"	INTEGER NOT NULL,
	"id_oid"	INTEGER NOT NULL,
	"is_tables"	INTEGER NOT NULL,
	"table_oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "odps_show_grants_stmt";
CREATE TABLE IF NOT EXISTS "odps_show_grants_stmt" (
	"oid"	INTEGER NOT NULL,
	"is_label"	INTEGER NOT NULL,
	"object_type_oid"	INTEGER NOT NULL,
	"user_oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "odps_statement_impl";
CREATE TABLE IF NOT EXISTS "odps_statement_impl" (
	"oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "odps_statistic_clause";
CREATE TABLE IF NOT EXISTS "odps_statistic_clause" (
	"oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "odps_transform_expr";
CREATE TABLE IF NOT EXISTS "odps_transform_expr" (
	"oid"	INTEGER NOT NULL,
	"input_row_format_oid"	INTEGER NOT NULL,
	"output_row_format_oid"	INTEGER NOT NULL,
	"using_oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "odps_udtfsql_select_item";
CREATE TABLE IF NOT EXISTS "odps_udtfsql_select_item" (
	"oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "odps_undo_table_statement";
CREATE TABLE IF NOT EXISTS "odps_undo_table_statement" (
	"oid"	INTEGER NOT NULL,
	"table_oid"	INTEGER NOT NULL,
	"to_oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "odps_unload_statement";
CREATE TABLE IF NOT EXISTS "odps_unload_statement" (
	"oid"	INTEGER NOT NULL,
	"from_oid"	INTEGER NOT NULL,
	"location_oid"	INTEGER NOT NULL,
	"row_format_oid"	INTEGER NOT NULL,
	"stored_as_oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "oracle_alter_session_statement";
CREATE TABLE IF NOT EXISTS "oracle_alter_session_statement" (
	"oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "oracle_alter_synonym_statement";
CREATE TABLE IF NOT EXISTS "oracle_alter_synonym_statement" (
	"oid"	INTEGER NOT NULL,
	"enable"	INTEGER NOT NULL,
	"is_compile"	INTEGER NOT NULL,
	"name_oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "oracle_alter_table_drop_partition";
CREATE TABLE IF NOT EXISTS "oracle_alter_table_drop_partition" (
	"oid"	INTEGER NOT NULL,
	"name_oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "oracle_alter_table_item";
CREATE TABLE IF NOT EXISTS "oracle_alter_table_item" (
	"oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "oracle_alter_table_modify";
CREATE TABLE IF NOT EXISTS "oracle_alter_table_modify" (
	"oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "oracle_alter_table_move_tablespace";
CREATE TABLE IF NOT EXISTS "oracle_alter_table_move_tablespace" (
	"oid"	INTEGER NOT NULL,
	"name_oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "oracle_alter_table_split_partition";
CREATE TABLE IF NOT EXISTS "oracle_alter_table_split_partition" (
	"oid"	INTEGER NOT NULL,
	"into"	TEXT NOT NULL,
	"name_oid"	INTEGER NOT NULL,
	"update_indexes"	TEXT NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "oracle_alter_table_truncate_partition";
CREATE TABLE IF NOT EXISTS "oracle_alter_table_truncate_partition" (
	"oid"	INTEGER NOT NULL,
	"name_oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "oracle_alter_tablespace_add_data_file";
CREATE TABLE IF NOT EXISTS "oracle_alter_tablespace_add_data_file" (
	"oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "oracle_alter_tablespace_statement";
CREATE TABLE IF NOT EXISTS "oracle_alter_tablespace_statement" (
	"oid"	INTEGER NOT NULL,
	"item_oid"	INTEGER NOT NULL,
	"name_oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "oracle_alter_trigger_statement";
CREATE TABLE IF NOT EXISTS "oracle_alter_trigger_statement" (
	"oid"	INTEGER NOT NULL,
	"enable"	INTEGER NOT NULL,
	"is_compile"	INTEGER NOT NULL,
	"name_oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "oracle_alter_view_statement";
CREATE TABLE IF NOT EXISTS "oracle_alter_view_statement" (
	"oid"	INTEGER NOT NULL,
	"enable"	INTEGER NOT NULL,
	"is_compile"	INTEGER NOT NULL,
	"name_oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "oracle_analytic";
CREATE TABLE IF NOT EXISTS "oracle_analytic" (
	"oid"	INTEGER NOT NULL,
	"windowing_oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "oracle_analytic_windowing";
CREATE TABLE IF NOT EXISTS "oracle_analytic_windowing" (
	"oid"	INTEGER NOT NULL,
	"expr_oid"	INTEGER NOT NULL,
	"type"	TEXT NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "oracle_argument_expr";
CREATE TABLE IF NOT EXISTS "oracle_argument_expr" (
	"oid"	INTEGER NOT NULL,
	"argument_name"	TEXT NOT NULL,
	"value_oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "oracle_binary_double_expr";
CREATE TABLE IF NOT EXISTS "oracle_binary_double_expr" (
	"oid"	INTEGER NOT NULL,
	"number"	TEXT NOT NULL,
	"value"	TEXT NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "oracle_binary_float_expr";
CREATE TABLE IF NOT EXISTS "oracle_binary_float_expr" (
	"oid"	INTEGER NOT NULL,
	"number"	TEXT NOT NULL,
	"value"	TEXT NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "oracle_check";
CREATE TABLE IF NOT EXISTS "oracle_check" (
	"oid"	INTEGER NOT NULL,
	"deferrable"	INTEGER NOT NULL,
	"exceptions_into_oid"	INTEGER NOT NULL,
	"initially"	TEXT NOT NULL,
	"using_oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "oracle_continue_statement";
CREATE TABLE IF NOT EXISTS "oracle_continue_statement" (
	"oid"	INTEGER NOT NULL,
	"label"	TEXT NOT NULL,
	"when_oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "oracle_create_database_db_link_statement";
CREATE TABLE IF NOT EXISTS "oracle_create_database_db_link_statement" (
	"oid"	INTEGER NOT NULL,
	"authenticated_password"	TEXT NOT NULL,
	"authenticated_user_oid"	INTEGER NOT NULL,
	"is_public"	INTEGER NOT NULL,
	"is_shared"	INTEGER NOT NULL,
	"name_oid"	INTEGER NOT NULL,
	"password"	TEXT NOT NULL,
	"user_oid"	INTEGER NOT NULL,
	"using_oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "oracle_create_index_statement";
CREATE TABLE IF NOT EXISTS "oracle_create_index_statement" (
	"oid"	INTEGER NOT NULL,
	"compress"	INTEGER NOT NULL,
	"compress_level"	INTEGER NOT NULL,
	"enable"	INTEGER NOT NULL,
	"free_lists"	INTEGER NOT NULL,
	"initrans"	INTEGER NOT NULL,
	"is_cluster"	INTEGER NOT NULL,
	"is_compress_for_oltp"	INTEGER NOT NULL,
	"is_compute_statistics"	INTEGER NOT NULL,
	"is_global"	INTEGER NOT NULL,
	"is_index_only_top_level"	INTEGER NOT NULL,
	"is_local"	INTEGER NOT NULL,
	"is_no_parallel"	INTEGER NOT NULL,
	"is_online"	INTEGER NOT NULL,
	"is_reverse"	INTEGER NOT NULL,
	"logging"	INTEGER NOT NULL,
	"maxtrans"	INTEGER NOT NULL,
	"parallel_oid"	INTEGER NOT NULL,
	"pctfree"	INTEGER NOT NULL,
	"pctincrease"	INTEGER NOT NULL,
	"pctthreshold"	INTEGER NOT NULL,
	"pctused"	INTEGER NOT NULL,
	"sort"	INTEGER NOT NULL,
	"storage"	TEXT NOT NULL,
	"tablespace_oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "oracle_create_package_statement";
CREATE TABLE IF NOT EXISTS "oracle_create_package_statement" (
	"oid"	INTEGER NOT NULL,
	"is_body"	INTEGER NOT NULL,
	"is_or_replace"	INTEGER NOT NULL,
	"name_oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "oracle_create_synonym_statement";
CREATE TABLE IF NOT EXISTS "oracle_create_synonym_statement" (
	"oid"	INTEGER NOT NULL,
	"is_or_replace"	INTEGER NOT NULL,
	"is_public"	INTEGER NOT NULL,
	"name_oid"	INTEGER NOT NULL,
	"object_oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "oracle_create_table_statement";
CREATE TABLE IF NOT EXISTS "oracle_create_table_statement" (
	"oid"	INTEGER NOT NULL,
	"cache"	INTEGER NOT NULL,
	"cluster_oid"	INTEGER NOT NULL,
	"compress_level"	INTEGER NOT NULL,
	"deferred_segment_creation"	TEXT NOT NULL,
	"enable_row_movement"	INTEGER NOT NULL,
	"initrans"	INTEGER NOT NULL,
	"is_compress_for_oltp"	INTEGER NOT NULL,
	"is_cursor_specific_segment"	INTEGER NOT NULL,
	"is_in_memory_metadata"	INTEGER NOT NULL,
	"is_monitoring"	INTEGER NOT NULL,
	"is_on_commit_delete_rows"	INTEGER NOT NULL,
	"lob_storage_oid"	INTEGER NOT NULL,
	"maxtrans"	INTEGER NOT NULL,
	"of_oid"	INTEGER NOT NULL,
	"oid_index"	TEXT NOT NULL,
	"organization"	TEXT NOT NULL,
	"parallel"	INTEGER NOT NULL,
	"parallel_value_oid"	INTEGER NOT NULL,
	"pctfree"	INTEGER NOT NULL,
	"pctincrease"	INTEGER NOT NULL,
	"pctused"	INTEGER NOT NULL,
	"storage_oid"	INTEGER NOT NULL,
	"xml_type_column_properties_oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "oracle_create_type_statement";
CREATE TABLE IF NOT EXISTS "oracle_create_type_statement" (
	"oid"	INTEGER NOT NULL,
	"auth_id_oid"	INTEGER NOT NULL,
	"instantiable"	INTEGER NOT NULL,
	"is_body"	INTEGER NOT NULL,
	"is_final"	INTEGER NOT NULL,
	"is_force"	INTEGER NOT NULL,
	"is_object"	INTEGER NOT NULL,
	"is_or_replace"	INTEGER NOT NULL,
	"is_paren"	INTEGER NOT NULL,
	"name_oid"	INTEGER NOT NULL,
	"oid_oid"	INTEGER NOT NULL,
	"table_of_oid"	INTEGER NOT NULL,
	"under_oid"	INTEGER NOT NULL,
	"varray_data_type_oid"	INTEGER NOT NULL,
	"varray_size_limit_oid"	INTEGER NOT NULL,
	"wrapped_source"	TEXT NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "oracle_cursor_expr";
CREATE TABLE IF NOT EXISTS "oracle_cursor_expr" (
	"oid"	INTEGER NOT NULL,
	"query_oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "oracle_data_type_interval_day";
CREATE TABLE IF NOT EXISTS "oracle_data_type_interval_day" (
	"oid"	INTEGER NOT NULL,
	"is_to_second"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "oracle_data_type_interval_year";
CREATE TABLE IF NOT EXISTS "oracle_data_type_interval_year" (
	"oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "oracle_datetime_expr";
CREATE TABLE IF NOT EXISTS "oracle_datetime_expr" (
	"oid"	INTEGER NOT NULL,
	"expr_oid"	INTEGER NOT NULL,
	"time_zone_oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "oracle_delete_statement";
CREATE TABLE IF NOT EXISTS "oracle_delete_statement" (
	"oid"	INTEGER NOT NULL,
	"returning_oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "oracle_drop_db_link_statement";
CREATE TABLE IF NOT EXISTS "oracle_drop_db_link_statement" (
	"oid"	INTEGER NOT NULL,
	"is_public"	INTEGER NOT NULL,
	"name_oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "oracle_exception_statement";
CREATE TABLE IF NOT EXISTS "oracle_exception_statement" (
	"oid"	INTEGER NOT NULL,
	"items"	TEXT NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "oracle_execute_immediate_statement";
CREATE TABLE IF NOT EXISTS "oracle_execute_immediate_statement" (
	"oid"	INTEGER NOT NULL,
	"dynamic_sql_oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "oracle_exit_statement";
CREATE TABLE IF NOT EXISTS "oracle_exit_statement" (
	"oid"	INTEGER NOT NULL,
	"label"	TEXT NOT NULL,
	"when_oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "oracle_explain_statement";
CREATE TABLE IF NOT EXISTS "oracle_explain_statement" (
	"oid"	INTEGER NOT NULL,
	"into_oid"	INTEGER NOT NULL,
	"statement_id_oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "oracle_file_specification";
CREATE TABLE IF NOT EXISTS "oracle_file_specification" (
	"oid"	INTEGER NOT NULL,
	"auto_extend_on_oid"	INTEGER NOT NULL,
	"is_auto_extend_off"	INTEGER NOT NULL,
	"size_oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "oracle_for_statement";
CREATE TABLE IF NOT EXISTS "oracle_for_statement" (
	"oid"	INTEGER NOT NULL,
	"end_label_oid"	INTEGER NOT NULL,
	"is_all"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "oracle_foreign_key";
CREATE TABLE IF NOT EXISTS "oracle_foreign_key" (
	"oid"	INTEGER NOT NULL,
	"deferrable"	INTEGER NOT NULL,
	"exceptions_into_oid"	INTEGER NOT NULL,
	"initially"	TEXT NOT NULL,
	"using_oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "oracle_goto_statement";
CREATE TABLE IF NOT EXISTS "oracle_goto_statement" (
	"oid"	INTEGER NOT NULL,
	"label_oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "oracle_insert_statement";
CREATE TABLE IF NOT EXISTS "oracle_insert_statement" (
	"oid"	INTEGER NOT NULL,
	"error_logging_oid"	INTEGER NOT NULL,
	"returning_oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "oracle_interval_expr";
CREATE TABLE IF NOT EXISTS "oracle_interval_expr" (
	"oid"	INTEGER NOT NULL,
	"factional_seconds_precision"	INTEGER NOT NULL,
	"precision_oid"	INTEGER NOT NULL,
	"to_factional_seconds_precision_oid"	INTEGER NOT NULL,
	"to_type"	TEXT NOT NULL,
	"type"	TEXT NOT NULL,
	"value_oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "oracle_is_of_type_expr";
CREATE TABLE IF NOT EXISTS "oracle_is_of_type_expr" (
	"oid"	INTEGER NOT NULL,
	"expr_oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "oracle_is_set_expr";
CREATE TABLE IF NOT EXISTS "oracle_is_set_expr" (
	"oid"	INTEGER NOT NULL,
	"nested_table_oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "oracle_label_statement";
CREATE TABLE IF NOT EXISTS "oracle_label_statement" (
	"oid"	INTEGER NOT NULL,
	"label_oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "oracle_lob_storage_clause";
CREATE TABLE IF NOT EXISTS "oracle_lob_storage_clause" (
	"oid"	INTEGER NOT NULL,
	"cache"	INTEGER NOT NULL,
	"chunk_oid"	INTEGER NOT NULL,
	"compress"	INTEGER NOT NULL,
	"enable"	INTEGER NOT NULL,
	"is_basic_file"	INTEGER NOT NULL,
	"is_retention"	INTEGER NOT NULL,
	"is_secure_file"	INTEGER NOT NULL,
	"keep_duplicate"	INTEGER NOT NULL,
	"logging"	INTEGER NOT NULL,
	"pctversion_oid"	INTEGER NOT NULL,
	"segement_name_oid"	INTEGER NOT NULL,
	"storage_clause_oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "oracle_lock_table_statement";
CREATE TABLE IF NOT EXISTS "oracle_lock_table_statement" (
	"oid"	INTEGER NOT NULL,
	"is_no_wait"	INTEGER NOT NULL,
	"lock_mode"	TEXT NOT NULL,
	"partition_oid"	INTEGER NOT NULL,
	"table_oid"	INTEGER NOT NULL,
	"wait_oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "oracle_multi_insert_statement";
CREATE TABLE IF NOT EXISTS "oracle_multi_insert_statement" (
	"oid"	INTEGER NOT NULL,
	"entries"	TEXT NOT NULL,
	"option"	TEXT NOT NULL,
	"sub_query_oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "oracle_outer_expr";
CREATE TABLE IF NOT EXISTS "oracle_outer_expr" (
	"oid"	INTEGER NOT NULL,
	"expr_oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "oracle_pipe_row_statement";
CREATE TABLE IF NOT EXISTS "oracle_pipe_row_statement" (
	"oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "oracle_primary_key";
CREATE TABLE IF NOT EXISTS "oracle_primary_key" (
	"oid"	INTEGER NOT NULL,
	"deferrable"	INTEGER NOT NULL,
	"enable"	INTEGER NOT NULL,
	"exceptions_into_oid"	INTEGER NOT NULL,
	"initially"	TEXT NOT NULL,
	"using_oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "oracle_raise_statement";
CREATE TABLE IF NOT EXISTS "oracle_raise_statement" (
	"oid"	INTEGER NOT NULL,
	"exception_oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "oracle_range_expr";
CREATE TABLE IF NOT EXISTS "oracle_range_expr" (
	"oid"	INTEGER NOT NULL,
	"low_bound_oid"	INTEGER NOT NULL,
	"up_bound_oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "oracle_returning_clause";
CREATE TABLE IF NOT EXISTS "oracle_returning_clause" (
	"oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "oracle_run_statement";
CREATE TABLE IF NOT EXISTS "oracle_run_statement" (
	"oid"	INTEGER NOT NULL,
	"expr_oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "oracle_segment_attributes_impl";
CREATE TABLE IF NOT EXISTS "oracle_segment_attributes_impl" (
	"oid"	INTEGER NOT NULL,
	"compress"	INTEGER NOT NULL,
	"compress_level"	INTEGER NOT NULL,
	"free_lists"	INTEGER NOT NULL,
	"initrans"	INTEGER NOT NULL,
	"is_compress_for_oltp"	INTEGER NOT NULL,
	"logging"	INTEGER NOT NULL,
	"maxtrans"	INTEGER NOT NULL,
	"pctfree"	INTEGER NOT NULL,
	"pctincrease"	INTEGER NOT NULL,
	"pctthreshold"	INTEGER NOT NULL,
	"pctused"	INTEGER NOT NULL,
	"storage"	TEXT NOT NULL,
	"tablespace_oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "oracle_select_join";
CREATE TABLE IF NOT EXISTS "oracle_select_join" (
	"oid"	INTEGER NOT NULL,
	"pivot_oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "oracle_select_pivot";
CREATE TABLE IF NOT EXISTS "oracle_select_pivot" (
	"oid"	INTEGER NOT NULL,
	"is_xml"	INTEGER NOT NULL,
	"items"	TEXT NOT NULL,
	"pivot_in"	TEXT NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "oracle_select_pivot_base";
CREATE TABLE IF NOT EXISTS "oracle_select_pivot_base" (
	"oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "oracle_select_query_block";
CREATE TABLE IF NOT EXISTS "oracle_select_query_block" (
	"oid"	INTEGER NOT NULL,
	"is_skip_locked"	INTEGER NOT NULL,
	"model_clause_oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "oracle_select_restriction";
CREATE TABLE IF NOT EXISTS "oracle_select_restriction" (
	"oid"	INTEGER NOT NULL,
	"constraint_oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "oracle_select_subquery_table_source";
CREATE TABLE IF NOT EXISTS "oracle_select_subquery_table_source" (
	"oid"	INTEGER NOT NULL,
	"pivot_oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "oracle_select_table_reference";
CREATE TABLE IF NOT EXISTS "oracle_select_table_reference" (
	"oid"	INTEGER NOT NULL,
	"is_only"	INTEGER NOT NULL,
	"partition_oid"	INTEGER NOT NULL,
	"pivot_oid"	INTEGER NOT NULL,
	"sample_clause_oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "oracle_select_un_pivot";
CREATE TABLE IF NOT EXISTS "oracle_select_un_pivot" (
	"oid"	INTEGER NOT NULL,
	"nulls_include_type"	TEXT NOT NULL,
	"pivot_in"	TEXT NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "oracle_set_transaction_statement";
CREATE TABLE IF NOT EXISTS "oracle_set_transaction_statement" (
	"oid"	INTEGER NOT NULL,
	"is_read_only"	INTEGER NOT NULL,
	"is_write"	INTEGER NOT NULL,
	"name_oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "oracle_sql_object_impl";
CREATE TABLE IF NOT EXISTS "oracle_sql_object_impl" (
	"oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "oracle_statement_impl";
CREATE TABLE IF NOT EXISTS "oracle_statement_impl" (
	"oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "oracle_storage_clause";
CREATE TABLE IF NOT EXISTS "oracle_storage_clause" (
	"oid"	INTEGER NOT NULL,
	"buffer_pool_oid"	INTEGER NOT NULL,
	"cell_flash_cache"	TEXT NOT NULL,
	"flash_cache"	TEXT NOT NULL,
	"free_list_groups_oid"	INTEGER NOT NULL,
	"free_lists_oid"	INTEGER NOT NULL,
	"initial_oid"	INTEGER NOT NULL,
	"max_extents_oid"	INTEGER NOT NULL,
	"max_size_oid"	INTEGER NOT NULL,
	"min_extents_oid"	INTEGER NOT NULL,
	"next_oid"	INTEGER NOT NULL,
	"objno_oid"	INTEGER NOT NULL,
	"pct_increase_oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "oracle_supplemental_id_key";
CREATE TABLE IF NOT EXISTS "oracle_supplemental_id_key" (
	"oid"	INTEGER NOT NULL,
	"is_all"	INTEGER NOT NULL,
	"is_foreign_key"	INTEGER NOT NULL,
	"is_primary_key"	INTEGER NOT NULL,
	"is_unique"	INTEGER NOT NULL,
	"is_unique_index"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "oracle_supplemental_log_grp";
CREATE TABLE IF NOT EXISTS "oracle_supplemental_log_grp" (
	"oid"	INTEGER NOT NULL,
	"group_oid"	INTEGER NOT NULL,
	"is_always"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "oracle_sysdate_expr";
CREATE TABLE IF NOT EXISTS "oracle_sysdate_expr" (
	"oid"	INTEGER NOT NULL,
	"option"	TEXT NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "oracle_treat_expr";
CREATE TABLE IF NOT EXISTS "oracle_treat_expr" (
	"oid"	INTEGER NOT NULL,
	"expr_oid"	INTEGER NOT NULL,
	"is_ref"	INTEGER NOT NULL,
	"type_oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "oracle_unique";
CREATE TABLE IF NOT EXISTS "oracle_unique" (
	"oid"	INTEGER NOT NULL,
	"deferrable"	INTEGER NOT NULL,
	"exceptions_into_oid"	INTEGER NOT NULL,
	"initially"	TEXT NOT NULL,
	"using_oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "oracle_update_statement";
CREATE TABLE IF NOT EXISTS "oracle_update_statement" (
	"oid"	INTEGER NOT NULL,
	"alias"	TEXT NOT NULL,
	"hints_size"	INTEGER NOT NULL,
	"is_only"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "oracle_using_index_clause";
CREATE TABLE IF NOT EXISTS "oracle_using_index_clause" (
	"oid"	INTEGER NOT NULL,
	"enable"	INTEGER NOT NULL,
	"index"	TEXT NOT NULL,
	"is_compute_statistics"	INTEGER NOT NULL,
	"is_reverse"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "oracle_with_subquery_entry";
CREATE TABLE IF NOT EXISTS "oracle_with_subquery_entry" (
	"oid"	INTEGER NOT NULL,
	"cycle_clause_oid"	INTEGER NOT NULL,
	"search_clause_oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "oracle_xml_column_properties";
CREATE TABLE IF NOT EXISTS "oracle_xml_column_properties" (
	"oid"	INTEGER NOT NULL,
	"allow_any_schema"	INTEGER NOT NULL,
	"allow_non_schema"	INTEGER NOT NULL,
	"column_oid"	INTEGER NOT NULL,
	"storage"	TEXT NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "oscar_alter_schema_statement";
CREATE TABLE IF NOT EXISTS "oscar_alter_schema_statement" (
	"oid"	INTEGER NOT NULL,
	"new_name_oid"	INTEGER NOT NULL,
	"new_owner_oid"	INTEGER NOT NULL,
	"schema_name_oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "oscar_connect_to_statement";
CREATE TABLE IF NOT EXISTS "oscar_connect_to_statement" (
	"oid"	INTEGER NOT NULL,
	"target_oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "oscar_create_schema_statement";
CREATE TABLE IF NOT EXISTS "oscar_create_schema_statement" (
	"oid"	INTEGER NOT NULL,
	"is_authorization"	INTEGER NOT NULL,
	"is_if_not_exists"	INTEGER NOT NULL,
	"schema_name_oid"	INTEGER NOT NULL,
	"user_name_oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "oscar_delete_statement";
CREATE TABLE IF NOT EXISTS "oscar_delete_statement" (
	"oid"	INTEGER NOT NULL,
	"alias"	TEXT NOT NULL,
	"is_returning"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "oscar_drop_schema_statement";
CREATE TABLE IF NOT EXISTS "oscar_drop_schema_statement" (
	"oid"	INTEGER NOT NULL,
	"is_cascade"	INTEGER NOT NULL,
	"is_if_exists"	INTEGER NOT NULL,
	"is_restrict"	INTEGER NOT NULL,
	"schema_name_oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "oscar_function_table_source";
CREATE TABLE IF NOT EXISTS "oscar_function_table_source" (
	"oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "oscar_insert_statement";
CREATE TABLE IF NOT EXISTS "oscar_insert_statement" (
	"oid"	INTEGER NOT NULL,
	"is_default_values"	INTEGER NOT NULL,
	"is_on_conflict_do_nothing"	INTEGER NOT NULL,
	"on_conflict_constraint_oid"	INTEGER NOT NULL,
	"on_conflict_update_where_oid"	INTEGER NOT NULL,
	"on_conflict_where_oid"	INTEGER NOT NULL,
	"returning_oid"	INTEGER NOT NULL,
	"values"	TEXT NOT NULL,
	"values_list"	TEXT NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "oscar_object_impl";
CREATE TABLE IF NOT EXISTS "oscar_object_impl" (
	"oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "oscar_select_query_block";
CREATE TABLE IF NOT EXISTS "oscar_select_query_block" (
	"oid"	INTEGER NOT NULL,
	"fetch"	TEXT NOT NULL,
	"for_clause"	TEXT NOT NULL,
	"into_option_local"	TEXT NOT NULL,
	"into_option_temp"	TEXT NOT NULL,
	"top_oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "oscar_select_statement";
CREATE TABLE IF NOT EXISTS "oscar_select_statement" (
	"oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "oscar_show_statement";
CREATE TABLE IF NOT EXISTS "oscar_show_statement" (
	"oid"	INTEGER NOT NULL,
	"expr_oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "oscar_start_transaction_statement";
CREATE TABLE IF NOT EXISTS "oscar_start_transaction_statement" (
	"oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "oscar_top";
CREATE TABLE IF NOT EXISTS "oscar_top" (
	"oid"	INTEGER NOT NULL,
	"expr_oid"	INTEGER NOT NULL,
	"is_percent"	INTEGER NOT NULL,
	"is_with_ties"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "oscar_update_statement";
CREATE TABLE IF NOT EXISTS "oscar_update_statement" (
	"oid"	INTEGER NOT NULL,
	"is_only"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "partition_extension_clause";
CREATE TABLE IF NOT EXISTS "partition_extension_clause" (
	"oid"	INTEGER NOT NULL,
	"is_sub_partition"	INTEGER NOT NULL,
	"partition_oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "pg_alter_schema_statement";
CREATE TABLE IF NOT EXISTS "pg_alter_schema_statement" (
	"oid"	INTEGER NOT NULL,
	"new_name_oid"	INTEGER NOT NULL,
	"new_owner_oid"	INTEGER NOT NULL,
	"schema_name_oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "pg_box_expr";
CREATE TABLE IF NOT EXISTS "pg_box_expr" (
	"oid"	INTEGER NOT NULL,
	"value_oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "pg_cidr_expr";
CREATE TABLE IF NOT EXISTS "pg_cidr_expr" (
	"oid"	INTEGER NOT NULL,
	"value_oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "pg_circle_expr";
CREATE TABLE IF NOT EXISTS "pg_circle_expr" (
	"oid"	INTEGER NOT NULL,
	"value_oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "pg_connect_to_statement";
CREATE TABLE IF NOT EXISTS "pg_connect_to_statement" (
	"oid"	INTEGER NOT NULL,
	"target_oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "pg_create_schema_statement";
CREATE TABLE IF NOT EXISTS "pg_create_schema_statement" (
	"oid"	INTEGER NOT NULL,
	"is_authorization"	INTEGER NOT NULL,
	"is_if_not_exists"	INTEGER NOT NULL,
	"schema_name_oid"	INTEGER NOT NULL,
	"user_name_oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "pg_delete_statement";
CREATE TABLE IF NOT EXISTS "pg_delete_statement" (
	"oid"	INTEGER NOT NULL,
	"alias"	TEXT NOT NULL,
	"is_returning"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "pg_drop_schema_statement";
CREATE TABLE IF NOT EXISTS "pg_drop_schema_statement" (
	"oid"	INTEGER NOT NULL,
	"is_cascade"	INTEGER NOT NULL,
	"is_if_exists"	INTEGER NOT NULL,
	"is_restrict"	INTEGER NOT NULL,
	"schema_name_oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "pg_expr_impl";
CREATE TABLE IF NOT EXISTS "pg_expr_impl" (
	"oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "pg_extract_expr";
CREATE TABLE IF NOT EXISTS "pg_extract_expr" (
	"oid"	INTEGER NOT NULL,
	"field"	TEXT NOT NULL,
	"source_oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "pg_function_table_source";
CREATE TABLE IF NOT EXISTS "pg_function_table_source" (
	"oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "pg_inet_expr";
CREATE TABLE IF NOT EXISTS "pg_inet_expr" (
	"oid"	INTEGER NOT NULL,
	"value_oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "pg_insert_statement";
CREATE TABLE IF NOT EXISTS "pg_insert_statement" (
	"oid"	INTEGER NOT NULL,
	"is_default_values"	INTEGER NOT NULL,
	"is_on_conflict_do_nothing"	INTEGER NOT NULL,
	"on_conflict_constraint_oid"	INTEGER NOT NULL,
	"on_conflict_update_where_oid"	INTEGER NOT NULL,
	"on_conflict_where_oid"	INTEGER NOT NULL,
	"returning_oid"	INTEGER NOT NULL,
	"values"	TEXT NOT NULL,
	"values_list"	TEXT NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "pg_line_segments_expr";
CREATE TABLE IF NOT EXISTS "pg_line_segments_expr" (
	"oid"	INTEGER NOT NULL,
	"value_oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "pg_mac_addr_expr";
CREATE TABLE IF NOT EXISTS "pg_mac_addr_expr" (
	"oid"	INTEGER NOT NULL,
	"value_oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "pg_point_expr";
CREATE TABLE IF NOT EXISTS "pg_point_expr" (
	"oid"	INTEGER NOT NULL,
	"value_oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "pg_polygon_expr";
CREATE TABLE IF NOT EXISTS "pg_polygon_expr" (
	"oid"	INTEGER NOT NULL,
	"value_oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "pg_select_query_block";
CREATE TABLE IF NOT EXISTS "pg_select_query_block" (
	"oid"	INTEGER NOT NULL,
	"fetch"	TEXT NOT NULL,
	"for_clause"	TEXT NOT NULL,
	"into_option"	TEXT NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "pg_select_statement";
CREATE TABLE IF NOT EXISTS "pg_select_statement" (
	"oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "pg_show_statement";
CREATE TABLE IF NOT EXISTS "pg_show_statement" (
	"oid"	INTEGER NOT NULL,
	"expr_oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "pg_start_transaction_statement";
CREATE TABLE IF NOT EXISTS "pg_start_transaction_statement" (
	"oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "pg_type_cast_expr";
CREATE TABLE IF NOT EXISTS "pg_type_cast_expr" (
	"oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "pg_update_statement";
CREATE TABLE IF NOT EXISTS "pg_update_statement" (
	"oid"	INTEGER NOT NULL,
	"is_only"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "pgsql_object_impl";
CREATE TABLE IF NOT EXISTS "pgsql_object_impl" (
	"oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "phoenix_statement_impl";
CREATE TABLE IF NOT EXISTS "phoenix_statement_impl" (
	"oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "sample_clause";
CREATE TABLE IF NOT EXISTS "sample_clause" (
	"oid"	INTEGER NOT NULL,
	"is_block"	INTEGER NOT NULL,
	"seed_value_oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "search_clause";
CREATE TABLE IF NOT EXISTS "search_clause" (
	"oid"	INTEGER NOT NULL,
	"ordering_column_oid"	INTEGER NOT NULL,
	"type"	TEXT NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "sql_adhoc_table_source";
CREATE TABLE IF NOT EXISTS "sql_adhoc_table_source" (
	"oid"	INTEGER NOT NULL,
	"definition_oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "sql_aggregate_expr";
CREATE TABLE IF NOT EXISTS "sql_aggregate_expr" (
	"oid"	INTEGER NOT NULL,
	"filter_oid"	INTEGER NOT NULL,
	"ignore_nulls"	INTEGER NOT NULL,
	"is_distinct"	INTEGER NOT NULL,
	"is_ignore_nulls"	INTEGER NOT NULL,
	"is_within_group"	INTEGER NOT NULL,
	"keep_oid"	INTEGER NOT NULL,
	"option"	TEXT NOT NULL,
	"order_by_oid"	INTEGER NOT NULL,
	"over_oid"	INTEGER NOT NULL,
	"over_ref_oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "sql_all_column_expr";
CREATE TABLE IF NOT EXISTS "sql_all_column_expr" (
	"oid"	INTEGER NOT NULL,
	"resolved_table_source_oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "sql_all_expr";
CREATE TABLE IF NOT EXISTS "sql_all_expr" (
	"oid"	INTEGER NOT NULL,
	"sub_query_oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "sql_alter_character";
CREATE TABLE IF NOT EXISTS "sql_alter_character" (
	"oid"	INTEGER NOT NULL,
	"character_set_oid"	INTEGER NOT NULL,
	"collate_oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "sql_alter_database_statement";
CREATE TABLE IF NOT EXISTS "sql_alter_database_statement" (
	"oid"	INTEGER NOT NULL,
	"character_oid"	INTEGER NOT NULL,
	"is_upgrade_data_directory_name"	INTEGER NOT NULL,
	"item_oid"	INTEGER NOT NULL,
	"name_oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "sql_alter_function_statement";
CREATE TABLE IF NOT EXISTS "sql_alter_function_statement" (
	"oid"	INTEGER NOT NULL,
	"comment_oid"	INTEGER NOT NULL,
	"is_contains_sql"	INTEGER NOT NULL,
	"is_debug"	INTEGER NOT NULL,
	"is_language_sql"	INTEGER NOT NULL,
	"is_reuse_settings"	INTEGER NOT NULL,
	"name_oid"	INTEGER NOT NULL,
	"sql_security_oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "sql_alter_index_statement";
CREATE TABLE IF NOT EXISTS "sql_alter_index_statement" (
	"oid"	INTEGER NOT NULL,
	"db_partition_by_oid"	INTEGER NOT NULL,
	"enable"	INTEGER NOT NULL,
	"is_compile"	INTEGER NOT NULL,
	"is_unusable"	INTEGER NOT NULL,
	"monitoring_usage"	INTEGER NOT NULL,
	"name_oid"	INTEGER NOT NULL,
	"parallel_oid"	INTEGER NOT NULL,
	"rebuild"	TEXT NOT NULL,
	"rename_to_oid"	INTEGER NOT NULL,
	"table_oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "sql_alter_materialized_view_statement";
CREATE TABLE IF NOT EXISTS "sql_alter_materialized_view_statement" (
	"oid"	INTEGER NOT NULL,
	"enable_query_rewrite"	INTEGER NOT NULL,
	"is_rebuild"	INTEGER NOT NULL,
	"is_refresh"	INTEGER NOT NULL,
	"is_refresh_complete"	INTEGER NOT NULL,
	"is_refresh_fast"	INTEGER NOT NULL,
	"is_refresh_force"	INTEGER NOT NULL,
	"is_refresh_next"	INTEGER NOT NULL,
	"is_refresh_on_commit"	INTEGER NOT NULL,
	"is_refresh_on_demand"	INTEGER NOT NULL,
	"is_refresh_on_over_write"	INTEGER NOT NULL,
	"is_refresh_start_with"	INTEGER NOT NULL,
	"name_oid"	INTEGER NOT NULL,
	"next_oid"	INTEGER NOT NULL,
	"start_with_oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "sql_alter_outline_statement";
CREATE TABLE IF NOT EXISTS "sql_alter_outline_statement" (
	"oid"	INTEGER NOT NULL,
	"is_disable"	INTEGER NOT NULL,
	"is_enable"	INTEGER NOT NULL,
	"is_resync"	INTEGER NOT NULL,
	"name_oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "sql_alter_procedure_statement";
CREATE TABLE IF NOT EXISTS "sql_alter_procedure_statement" (
	"oid"	INTEGER NOT NULL,
	"comment_oid"	INTEGER NOT NULL,
	"is_compile"	INTEGER NOT NULL,
	"is_contains_sql"	INTEGER NOT NULL,
	"is_language_sql"	INTEGER NOT NULL,
	"is_reuse_settings"	INTEGER NOT NULL,
	"name_oid"	INTEGER NOT NULL,
	"sql_security_oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "sql_alter_resource_group_statement";
CREATE TABLE IF NOT EXISTS "sql_alter_resource_group_statement" (
	"oid"	INTEGER NOT NULL,
	"enable"	INTEGER NOT NULL,
	"name_oid"	INTEGER NOT NULL,
	"properties"	TEXT NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "sql_alter_sequence_statement";
CREATE TABLE IF NOT EXISTS "sql_alter_sequence_statement" (
	"oid"	INTEGER NOT NULL,
	"cache"	INTEGER NOT NULL,
	"cache_value_oid"	INTEGER NOT NULL,
	"cycle"	INTEGER NOT NULL,
	"increment_by_oid"	INTEGER NOT NULL,
	"is_change_to_group"	INTEGER NOT NULL,
	"is_change_to_simple"	INTEGER NOT NULL,
	"is_change_to_time"	INTEGER NOT NULL,
	"is_no_max_value"	INTEGER NOT NULL,
	"is_no_min_value"	INTEGER NOT NULL,
	"is_restart"	INTEGER NOT NULL,
	"max_value_oid"	INTEGER NOT NULL,
	"min_value_oid"	INTEGER NOT NULL,
	"name_oid"	INTEGER NOT NULL,
	"order"	INTEGER NOT NULL,
	"restart_with_oid"	INTEGER NOT NULL,
	"schema"	TEXT NOT NULL,
	"start_with_oid"	INTEGER NOT NULL,
	"with_cache"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "sql_alter_system_get_config_statement";
CREATE TABLE IF NOT EXISTS "sql_alter_system_get_config_statement" (
	"oid"	INTEGER NOT NULL,
	"name_oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "sql_alter_system_set_config_statement";
CREATE TABLE IF NOT EXISTS "sql_alter_system_set_config_statement" (
	"oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "sql_alter_table_add_clustering_key";
CREATE TABLE IF NOT EXISTS "sql_alter_table_add_clustering_key" (
	"oid"	INTEGER NOT NULL,
	"name_oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "sql_alter_table_add_column";
CREATE TABLE IF NOT EXISTS "sql_alter_table_add_column" (
	"oid"	INTEGER NOT NULL,
	"after_column_oid"	INTEGER NOT NULL,
	"first_column_oid"	INTEGER NOT NULL,
	"is_cascade"	INTEGER NOT NULL,
	"is_first"	INTEGER NOT NULL,
	"is_restrict"	INTEGER NOT NULL,
	"restrict"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "sql_alter_table_add_constraint";
CREATE TABLE IF NOT EXISTS "sql_alter_table_add_constraint" (
	"oid"	INTEGER NOT NULL,
	"constraint_oid"	INTEGER NOT NULL,
	"is_with_no_check"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "sql_alter_table_add_ext_partition";
CREATE TABLE IF NOT EXISTS "sql_alter_table_add_ext_partition" (
	"oid"	INTEGER NOT NULL,
	"ext_partition_oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "sql_alter_table_add_index";
CREATE TABLE IF NOT EXISTS "sql_alter_table_add_index" (
	"oid"	INTEGER NOT NULL,
	"algorithm"	TEXT NOT NULL,
	"comment_oid"	INTEGER NOT NULL,
	"db_partition_by_oid"	INTEGER NOT NULL,
	"distance_measure"	TEXT NOT NULL,
	"index_definition_oid"	INTEGER NOT NULL,
	"is_global"	INTEGER NOT NULL,
	"is_hash_map_type"	INTEGER NOT NULL,
	"is_key"	INTEGER NOT NULL,
	"is_unique"	INTEGER NOT NULL,
	"key_block_size_oid"	INTEGER NOT NULL,
	"name_oid"	INTEGER NOT NULL,
	"parser_name"	TEXT NOT NULL,
	"table_partition_by_oid"	INTEGER NOT NULL,
	"table_partitions_oid"	INTEGER NOT NULL,
	"type"	TEXT NOT NULL,
	"using"	TEXT NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "sql_alter_table_add_partition";
CREATE TABLE IF NOT EXISTS "sql_alter_table_add_partition" (
	"oid"	INTEGER NOT NULL,
	"is_if_not_exists"	INTEGER NOT NULL,
	"location_oid"	INTEGER NOT NULL,
	"partition_count_oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "sql_alter_table_add_supplemental";
CREATE TABLE IF NOT EXISTS "sql_alter_table_add_supplemental" (
	"oid"	INTEGER NOT NULL,
	"element_oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "sql_alter_table_alter_column";
CREATE TABLE IF NOT EXISTS "sql_alter_table_alter_column" (
	"oid"	INTEGER NOT NULL,
	"after_oid"	INTEGER NOT NULL,
	"column_oid"	INTEGER NOT NULL,
	"data_type_oid"	INTEGER NOT NULL,
	"is_drop_default"	INTEGER NOT NULL,
	"is_drop_not_null"	INTEGER NOT NULL,
	"is_first"	INTEGER NOT NULL,
	"is_set_not_null"	INTEGER NOT NULL,
	"origin_column_oid"	INTEGER NOT NULL,
	"set_default_oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "sql_alter_table_alter_index";
CREATE TABLE IF NOT EXISTS "sql_alter_table_alter_index" (
	"oid"	INTEGER NOT NULL,
	"algorithm"	TEXT NOT NULL,
	"comment_oid"	INTEGER NOT NULL,
	"db_partition_by_oid"	INTEGER NOT NULL,
	"distance_measure"	TEXT NOT NULL,
	"index_definition_oid"	INTEGER NOT NULL,
	"is_global"	INTEGER NOT NULL,
	"is_hash_map_type"	INTEGER NOT NULL,
	"is_key"	INTEGER NOT NULL,
	"is_unique"	INTEGER NOT NULL,
	"key_block_size_oid"	INTEGER NOT NULL,
	"name_oid"	INTEGER NOT NULL,
	"parser_name"	TEXT NOT NULL,
	"table_partition_by_oid"	INTEGER NOT NULL,
	"table_partitions_oid"	INTEGER NOT NULL,
	"type"	TEXT NOT NULL,
	"using"	TEXT NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "sql_alter_table_analyze_partition";
CREATE TABLE IF NOT EXISTS "sql_alter_table_analyze_partition" (
	"oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "sql_alter_table_archive_partition";
CREATE TABLE IF NOT EXISTS "sql_alter_table_archive_partition" (
	"oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "sql_alter_table_block_size";
CREATE TABLE IF NOT EXISTS "sql_alter_table_block_size" (
	"oid"	INTEGER NOT NULL,
	"size_oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "sql_alter_table_change_owner";
CREATE TABLE IF NOT EXISTS "sql_alter_table_change_owner" (
	"oid"	INTEGER NOT NULL,
	"owner_oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "sql_alter_table_check_partition";
CREATE TABLE IF NOT EXISTS "sql_alter_table_check_partition" (
	"oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "sql_alter_table_coalesce_partition";
CREATE TABLE IF NOT EXISTS "sql_alter_table_coalesce_partition" (
	"oid"	INTEGER NOT NULL,
	"count_oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "sql_alter_table_compression";
CREATE TABLE IF NOT EXISTS "sql_alter_table_compression" (
	"oid"	INTEGER NOT NULL,
	"name_oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "sql_alter_table_convert_char_set";
CREATE TABLE IF NOT EXISTS "sql_alter_table_convert_char_set" (
	"oid"	INTEGER NOT NULL,
	"charset_oid"	INTEGER NOT NULL,
	"collate_oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "sql_alter_table_delete_by_condition";
CREATE TABLE IF NOT EXISTS "sql_alter_table_delete_by_condition" (
	"oid"	INTEGER NOT NULL,
	"where_oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "sql_alter_table_disable_constraint";
CREATE TABLE IF NOT EXISTS "sql_alter_table_disable_constraint" (
	"oid"	INTEGER NOT NULL,
	"constraint_name_oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "sql_alter_table_disable_keys";
CREATE TABLE IF NOT EXISTS "sql_alter_table_disable_keys" (
	"oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "sql_alter_table_disable_lifecycle";
CREATE TABLE IF NOT EXISTS "sql_alter_table_disable_lifecycle" (
	"oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "sql_alter_table_discard_partition";
CREATE TABLE IF NOT EXISTS "sql_alter_table_discard_partition" (
	"oid"	INTEGER NOT NULL,
	"is_tablespace"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "sql_alter_table_drop_clustering_key";
CREATE TABLE IF NOT EXISTS "sql_alter_table_drop_clustering_key" (
	"oid"	INTEGER NOT NULL,
	"key_name_oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "sql_alter_table_drop_column_item";
CREATE TABLE IF NOT EXISTS "sql_alter_table_drop_column_item" (
	"oid"	INTEGER NOT NULL,
	"is_cascade"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "sql_alter_table_drop_constraint";
CREATE TABLE IF NOT EXISTS "sql_alter_table_drop_constraint" (
	"oid"	INTEGER NOT NULL,
	"constraint_name_oid"	INTEGER NOT NULL,
	"is_cascade"	INTEGER NOT NULL,
	"is_restrict"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "sql_alter_table_drop_ext_partition";
CREATE TABLE IF NOT EXISTS "sql_alter_table_drop_ext_partition" (
	"oid"	INTEGER NOT NULL,
	"ext_partition_oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "sql_alter_table_drop_foreign_key";
CREATE TABLE IF NOT EXISTS "sql_alter_table_drop_foreign_key" (
	"oid"	INTEGER NOT NULL,
	"index_name_oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "sql_alter_table_drop_index";
CREATE TABLE IF NOT EXISTS "sql_alter_table_drop_index" (
	"oid"	INTEGER NOT NULL,
	"index_name_oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "sql_alter_table_drop_key";
CREATE TABLE IF NOT EXISTS "sql_alter_table_drop_key" (
	"oid"	INTEGER NOT NULL,
	"key_name_oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "sql_alter_table_drop_partition";
CREATE TABLE IF NOT EXISTS "sql_alter_table_drop_partition" (
	"oid"	INTEGER NOT NULL,
	"is_if_exists"	INTEGER NOT NULL,
	"is_purge"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "sql_alter_table_drop_primary_key";
CREATE TABLE IF NOT EXISTS "sql_alter_table_drop_primary_key" (
	"oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "sql_alter_table_drop_subpartition";
CREATE TABLE IF NOT EXISTS "sql_alter_table_drop_subpartition" (
	"oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "sql_alter_table_enable_constraint";
CREATE TABLE IF NOT EXISTS "sql_alter_table_enable_constraint" (
	"oid"	INTEGER NOT NULL,
	"constraint_name_oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "sql_alter_table_enable_keys";
CREATE TABLE IF NOT EXISTS "sql_alter_table_enable_keys" (
	"oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "sql_alter_table_enable_lifecycle";
CREATE TABLE IF NOT EXISTS "sql_alter_table_enable_lifecycle" (
	"oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "sql_alter_table_exchange_partition";
CREATE TABLE IF NOT EXISTS "sql_alter_table_exchange_partition" (
	"oid"	INTEGER NOT NULL,
	"table_oid"	INTEGER NOT NULL,
	"validation"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "sql_alter_table_group_statement";
CREATE TABLE IF NOT EXISTS "sql_alter_table_group_statement" (
	"oid"	INTEGER NOT NULL,
	"name_oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "sql_alter_table_import_partition";
CREATE TABLE IF NOT EXISTS "sql_alter_table_import_partition" (
	"oid"	INTEGER NOT NULL,
	"is_tablespace"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "sql_alter_table_merge_partition";
CREATE TABLE IF NOT EXISTS "sql_alter_table_merge_partition" (
	"oid"	INTEGER NOT NULL,
	"is_if_exists"	INTEGER NOT NULL,
	"is_purge"	INTEGER NOT NULL,
	"overwrite_partition_oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "sql_alter_table_modify_clustered_by";
CREATE TABLE IF NOT EXISTS "sql_alter_table_modify_clustered_by" (
	"oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "sql_alter_table_optimize_partition";
CREATE TABLE IF NOT EXISTS "sql_alter_table_optimize_partition" (
	"oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "sql_alter_table_partition";
CREATE TABLE IF NOT EXISTS "sql_alter_table_partition" (
	"oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "sql_alter_table_partition_count";
CREATE TABLE IF NOT EXISTS "sql_alter_table_partition_count" (
	"oid"	INTEGER NOT NULL,
	"count_oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "sql_alter_table_partition_lifecycle";
CREATE TABLE IF NOT EXISTS "sql_alter_table_partition_lifecycle" (
	"oid"	INTEGER NOT NULL,
	"lifecycle_oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "sql_alter_table_partition_set_properties";
CREATE TABLE IF NOT EXISTS "sql_alter_table_partition_set_properties" (
	"oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "sql_alter_table_re_organize_partition";
CREATE TABLE IF NOT EXISTS "sql_alter_table_re_organize_partition" (
	"oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "sql_alter_table_rebuild_partition";
CREATE TABLE IF NOT EXISTS "sql_alter_table_rebuild_partition" (
	"oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "sql_alter_table_recover_partitions";
CREATE TABLE IF NOT EXISTS "sql_alter_table_recover_partitions" (
	"oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "sql_alter_table_rename";
CREATE TABLE IF NOT EXISTS "sql_alter_table_rename" (
	"oid"	INTEGER NOT NULL,
	"to_name_oid"	INTEGER NOT NULL,
	"to_oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "sql_alter_table_rename_column";
CREATE TABLE IF NOT EXISTS "sql_alter_table_rename_column" (
	"oid"	INTEGER NOT NULL,
	"column_oid"	INTEGER NOT NULL,
	"to_oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "sql_alter_table_rename_index";
CREATE TABLE IF NOT EXISTS "sql_alter_table_rename_index" (
	"oid"	INTEGER NOT NULL,
	"name_oid"	INTEGER NOT NULL,
	"to_oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "sql_alter_table_rename_partition";
CREATE TABLE IF NOT EXISTS "sql_alter_table_rename_partition" (
	"oid"	INTEGER NOT NULL,
	"is_if_not_exists"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "sql_alter_table_repair_partition";
CREATE TABLE IF NOT EXISTS "sql_alter_table_repair_partition" (
	"oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "sql_alter_table_replace_column";
CREATE TABLE IF NOT EXISTS "sql_alter_table_replace_column" (
	"oid"	INTEGER NOT NULL,
	"after_column_oid"	INTEGER NOT NULL,
	"first_column_oid"	INTEGER NOT NULL,
	"is_first"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "sql_alter_table_set_comment";
CREATE TABLE IF NOT EXISTS "sql_alter_table_set_comment" (
	"oid"	INTEGER NOT NULL,
	"comment_oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "sql_alter_table_set_lifecycle";
CREATE TABLE IF NOT EXISTS "sql_alter_table_set_lifecycle" (
	"oid"	INTEGER NOT NULL,
	"lifecycle_oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "sql_alter_table_set_location";
CREATE TABLE IF NOT EXISTS "sql_alter_table_set_location" (
	"oid"	INTEGER NOT NULL,
	"location_oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "sql_alter_table_set_option";
CREATE TABLE IF NOT EXISTS "sql_alter_table_set_option" (
	"oid"	INTEGER NOT NULL,
	"on_oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "sql_alter_table_statement";
CREATE TABLE IF NOT EXISTS "sql_alter_table_statement" (
	"oid"	INTEGER NOT NULL,
	"buckets"	INTEGER NOT NULL,
	"is_if_exists"	INTEGER NOT NULL,
	"is_ignore"	INTEGER NOT NULL,
	"is_invalidate_global_indexes"	INTEGER NOT NULL,
	"is_merge_small_files"	INTEGER NOT NULL,
	"is_not_clustered"	INTEGER NOT NULL,
	"is_offline"	INTEGER NOT NULL,
	"is_online"	INTEGER NOT NULL,
	"is_range"	INTEGER NOT NULL,
	"is_remove_patiting"	INTEGER NOT NULL,
	"is_update_global_indexes"	INTEGER NOT NULL,
	"is_upgrade_patiting"	INTEGER NOT NULL,
	"name_oid"	INTEGER NOT NULL,
	"partition_oid"	INTEGER NOT NULL,
	"schema"	TEXT NOT NULL,
	"shards"	INTEGER NOT NULL,
	"table_name"	TEXT NOT NULL,
	"table_source_oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "sql_alter_table_subpartition_available_partition_num";
CREATE TABLE IF NOT EXISTS "sql_alter_table_subpartition_available_partition_num" (
	"oid"	INTEGER NOT NULL,
	"number_oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "sql_alter_table_subpartition_lifecycle";
CREATE TABLE IF NOT EXISTS "sql_alter_table_subpartition_lifecycle" (
	"oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "sql_alter_table_touch";
CREATE TABLE IF NOT EXISTS "sql_alter_table_touch" (
	"oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "sql_alter_table_truncate_partition";
CREATE TABLE IF NOT EXISTS "sql_alter_table_truncate_partition" (
	"oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "sql_alter_table_unarchive_partition";
CREATE TABLE IF NOT EXISTS "sql_alter_table_unarchive_partition" (
	"oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "sql_alter_type_statement";
CREATE TABLE IF NOT EXISTS "sql_alter_type_statement" (
	"oid"	INTEGER NOT NULL,
	"is_body"	INTEGER NOT NULL,
	"is_compile"	INTEGER NOT NULL,
	"is_debug"	INTEGER NOT NULL,
	"is_reuse_settings"	INTEGER NOT NULL,
	"name_oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "sql_alter_view_rename_statement";
CREATE TABLE IF NOT EXISTS "sql_alter_view_rename_statement" (
	"oid"	INTEGER NOT NULL,
	"change_owner_to_oid"	INTEGER NOT NULL,
	"name_oid"	INTEGER NOT NULL,
	"to_oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "sql_alter_view_statement";
CREATE TABLE IF NOT EXISTS "sql_alter_view_statement" (
	"oid"	INTEGER NOT NULL,
	"algorithm"	TEXT NOT NULL,
	"comment_oid"	INTEGER NOT NULL,
	"definer_oid"	INTEGER NOT NULL,
	"is_force"	INTEGER NOT NULL,
	"is_if_not_exists"	INTEGER NOT NULL,
	"is_with_cascaded"	INTEGER NOT NULL,
	"is_with_check_option"	INTEGER NOT NULL,
	"is_with_local"	INTEGER NOT NULL,
	"is_with_read_only"	INTEGER NOT NULL,
	"name_oid"	INTEGER NOT NULL,
	"schema"	TEXT NOT NULL,
	"sql_security"	TEXT NOT NULL,
	"sub_query_oid"	INTEGER NOT NULL,
	"table_source_oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "sql_analyze_table_statement";
CREATE TABLE IF NOT EXISTS "sql_analyze_table_statement" (
	"oid"	INTEGER NOT NULL,
	"adb_schema_oid"	INTEGER NOT NULL,
	"adb_where_oid"	INTEGER NOT NULL,
	"is_cache_metadata"	INTEGER NOT NULL,
	"is_compute_statistics"	INTEGER NOT NULL,
	"is_for_colums"	INTEGER NOT NULL,
	"is_noscan"	INTEGER NOT NULL,
	"partition_oid"	INTEGER NOT NULL,
	"table_oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "sql_ann_index";
CREATE TABLE IF NOT EXISTS "sql_ann_index" (
	"oid"	INTEGER NOT NULL,
	"distance"	TEXT NOT NULL,
	"index_type"	INTEGER NOT NULL,
	"rt_index_type"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "sql_any_expr";
CREATE TABLE IF NOT EXISTS "sql_any_expr" (
	"oid"	INTEGER NOT NULL,
	"sub_query_oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "sql_archive_table_statement";
CREATE TABLE IF NOT EXISTS "sql_archive_table_statement" (
	"oid"	INTEGER NOT NULL,
	"table_oid"	INTEGER NOT NULL,
	"type_oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "sql_argument";
CREATE TABLE IF NOT EXISTS "sql_argument" (
	"oid"	INTEGER NOT NULL,
	"expr_oid"	INTEGER NOT NULL,
	"type"	TEXT NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "sql_array_data_type";
CREATE TABLE IF NOT EXISTS "sql_array_data_type" (
	"oid"	INTEGER NOT NULL,
	"component_type_oid"	INTEGER NOT NULL,
	"is_int"	INTEGER NOT NULL,
	"is_numberic"	INTEGER NOT NULL,
	"is_string"	INTEGER NOT NULL,
	"is_with_local_time_zone"	INTEGER NOT NULL,
	"name"	TEXT NOT NULL,
	"with_time_zone"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "sql_array_expr";
CREATE TABLE IF NOT EXISTS "sql_array_expr" (
	"oid"	INTEGER NOT NULL,
	"expr_oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "sql_assign_item";
CREATE TABLE IF NOT EXISTS "sql_assign_item" (
	"oid"	INTEGER NOT NULL,
	"target_oid"	INTEGER NOT NULL,
	"value_oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "sql_backup_statement";
CREATE TABLE IF NOT EXISTS "sql_backup_statement" (
	"oid"	INTEGER NOT NULL,
	"action_oid"	INTEGER NOT NULL,
	"type_oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "sql_between_expr";
CREATE TABLE IF NOT EXISTS "sql_between_expr" (
	"oid"	INTEGER NOT NULL,
	"begin_expr_oid"	INTEGER NOT NULL,
	"end_expr_oid"	INTEGER NOT NULL,
	"is_not"	INTEGER NOT NULL,
	"test_expr_oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "sql_big_int_expr";
CREATE TABLE IF NOT EXISTS "sql_big_int_expr" (
	"oid"	INTEGER NOT NULL,
	"number"	TEXT NOT NULL,
	"value"	TEXT NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "sql_binary_expr";
CREATE TABLE IF NOT EXISTS "sql_binary_expr" (
	"oid"	INTEGER NOT NULL,
	"text"	TEXT NOT NULL,
	"value"	TEXT NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "sql_binary_op_expr";
CREATE TABLE IF NOT EXISTS "sql_binary_op_expr" (
	"oid"	INTEGER NOT NULL,
	"is_both_name"	INTEGER NOT NULL,
	"is_left_function_and_right_literal"	INTEGER NOT NULL,
	"is_left_literal_and_right_name"	INTEGER NOT NULL,
	"is_left_name_and_right_literal"	INTEGER NOT NULL,
	"is_name_and_literal"	INTEGER NOT NULL,
	"is_parenthesized"	INTEGER NOT NULL,
	"left_oid"	INTEGER NOT NULL,
	"operator"	TEXT NOT NULL,
	"right_oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "sql_binary_op_expr_group";
CREATE TABLE IF NOT EXISTS "sql_binary_op_expr_group" (
	"oid"	INTEGER NOT NULL,
	"operator"	TEXT NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "sql_block_statement";
CREATE TABLE IF NOT EXISTS "sql_block_statement" (
	"oid"	INTEGER NOT NULL,
	"end_label"	TEXT NOT NULL,
	"exception_oid"	INTEGER NOT NULL,
	"is_end_of_commit"	INTEGER NOT NULL,
	"label_name"	TEXT NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "sql_boolean_expr";
CREATE TABLE IF NOT EXISTS "sql_boolean_expr" (
	"oid"	INTEGER NOT NULL,
	"boolean_value"	INTEGER NOT NULL,
	"value"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "sql_build_table_statement";
CREATE TABLE IF NOT EXISTS "sql_build_table_statement" (
	"oid"	INTEGER NOT NULL,
	"is_force"	INTEGER NOT NULL,
	"is_with_split"	INTEGER NOT NULL,
	"table_oid"	INTEGER NOT NULL,
	"version_oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "sql_call_statement";
CREATE TABLE IF NOT EXISTS "sql_call_statement" (
	"oid"	INTEGER NOT NULL,
	"is_brace"	INTEGER NOT NULL,
	"out_parameter_oid"	INTEGER NOT NULL,
	"procedure_name_oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "sql_cancel_job_statement";
CREATE TABLE IF NOT EXISTS "sql_cancel_job_statement" (
	"oid"	INTEGER NOT NULL,
	"is_import"	INTEGER NOT NULL,
	"job_name_oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "sql_case_expr";
CREATE TABLE IF NOT EXISTS "sql_case_expr" (
	"oid"	INTEGER NOT NULL,
	"else_expr_oid"	INTEGER NOT NULL,
	"items"	TEXT NOT NULL,
	"value_expr_oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "sql_case_statement";
CREATE TABLE IF NOT EXISTS "sql_case_statement" (
	"oid"	INTEGER NOT NULL,
	"items"	TEXT NOT NULL,
	"value_expr_oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "sql_cast_expr";
CREATE TABLE IF NOT EXISTS "sql_cast_expr" (
	"oid"	INTEGER NOT NULL,
	"data_type_oid"	INTEGER NOT NULL,
	"expr_oid"	INTEGER NOT NULL,
	"is_try"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "sql_char_expr";
CREATE TABLE IF NOT EXISTS "sql_char_expr" (
	"oid"	INTEGER NOT NULL,
	"value"	TEXT NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "sql_character_data_type";
CREATE TABLE IF NOT EXISTS "sql_character_data_type" (
	"oid"	INTEGER NOT NULL,
	"char_set_name"	TEXT NOT NULL,
	"char_type"	TEXT NOT NULL,
	"collate"	TEXT NOT NULL,
	"is_has_binary"	INTEGER NOT NULL,
	"length"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "sql_check";
CREATE TABLE IF NOT EXISTS "sql_check" (
	"oid"	INTEGER NOT NULL,
	"enforced"	INTEGER NOT NULL,
	"expr_oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "sql_clone_table_statement";
CREATE TABLE IF NOT EXISTS "sql_clone_table_statement" (
	"oid"	INTEGER NOT NULL,
	"from_oid"	INTEGER NOT NULL,
	"is_if_exists_ignore"	INTEGER NOT NULL,
	"is_if_exists_overwrite"	INTEGER NOT NULL,
	"to_name_oid"	INTEGER NOT NULL,
	"to_oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "sql_close_statement";
CREATE TABLE IF NOT EXISTS "sql_close_statement" (
	"oid"	INTEGER NOT NULL,
	"cursor_name_oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "sql_column_check";
CREATE TABLE IF NOT EXISTS "sql_column_check" (
	"oid"	INTEGER NOT NULL,
	"enforced"	INTEGER NOT NULL,
	"expr_oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "sql_column_definition";
CREATE TABLE IF NOT EXISTS "sql_column_definition" (
	"oid"	INTEGER NOT NULL,
	"ann_index_oid"	INTEGER NOT NULL,
	"as_expr_oid"	INTEGER NOT NULL,
	"charset_expr_oid"	INTEGER NOT NULL,
	"collate_expr_oid"	INTEGER NOT NULL,
	"column_name"	TEXT NOT NULL,
	"comment_oid"	INTEGER NOT NULL,
	"compression_oid"	INTEGER NOT NULL,
	"data_type_oid"	INTEGER NOT NULL,
	"default_expr_oid"	INTEGER NOT NULL,
	"delimiter_oid"	INTEGER NOT NULL,
	"delimiter_tokenizer_oid"	INTEGER NOT NULL,
	"enable"	INTEGER NOT NULL,
	"encode_oid"	INTEGER NOT NULL,
	"format_oid"	INTEGER NOT NULL,
	"generated_alaws_as_oid"	INTEGER NOT NULL,
	"identity"	TEXT NOT NULL,
	"is_auto_increment"	INTEGER NOT NULL,
	"is_disable_index"	INTEGER NOT NULL,
	"is_only_primary_key"	INTEGER NOT NULL,
	"is_partition_by"	INTEGER NOT NULL,
	"is_pre_sort"	INTEGER NOT NULL,
	"is_primary_key"	INTEGER NOT NULL,
	"is_stored"	INTEGER NOT NULL,
	"is_virtual"	INTEGER NOT NULL,
	"is_visible"	INTEGER NOT NULL,
	"json_index_attrs_expr_oid"	INTEGER NOT NULL,
	"name_oid"	INTEGER NOT NULL,
	"name_as_string"	TEXT NOT NULL,
	"nlp_tokenizer_oid"	INTEGER NOT NULL,
	"npl_tokenizer_oid"	INTEGER NOT NULL,
	"on_update_oid"	INTEGER NOT NULL,
	"pre_sort_order"	INTEGER NOT NULL,
	"rely"	INTEGER NOT NULL,
	"sequence_type"	TEXT NOT NULL,
	"step_oid"	INTEGER NOT NULL,
	"storage_oid"	INTEGER NOT NULL,
	"unit_count_oid"	INTEGER NOT NULL,
	"unit_index_oid"	INTEGER NOT NULL,
	"validate"	INTEGER NOT NULL,
	"value_type_oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "sql_column_primary_key";
CREATE TABLE IF NOT EXISTS "sql_column_primary_key" (
	"oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "sql_column_reference";
CREATE TABLE IF NOT EXISTS "sql_column_reference" (
	"oid"	INTEGER NOT NULL,
	"on_delete"	TEXT NOT NULL,
	"on_update"	TEXT NOT NULL,
	"reference_match"	TEXT NOT NULL,
	"table_oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "sql_column_unique_key";
CREATE TABLE IF NOT EXISTS "sql_column_unique_key" (
	"oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "sql_comment_hint";
CREATE TABLE IF NOT EXISTS "sql_comment_hint" (
	"oid"	INTEGER NOT NULL,
	"text"	TEXT NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "sql_comment_statement";
CREATE TABLE IF NOT EXISTS "sql_comment_statement" (
	"oid"	INTEGER NOT NULL,
	"comment_oid"	INTEGER NOT NULL,
	"on_oid"	INTEGER NOT NULL,
	"type"	TEXT NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "sql_commit_statement";
CREATE TABLE IF NOT EXISTS "sql_commit_statement" (
	"oid"	INTEGER NOT NULL,
	"chain"	INTEGER NOT NULL,
	"delayed_durability_oid"	INTEGER NOT NULL,
	"immediate"	INTEGER NOT NULL,
	"is_work"	INTEGER NOT NULL,
	"is_write"	INTEGER NOT NULL,
	"release"	INTEGER NOT NULL,
	"transaction_name_oid"	INTEGER NOT NULL,
	"wait"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "sql_constraint_impl";
CREATE TABLE IF NOT EXISTS "sql_constraint_impl" (
	"oid"	INTEGER NOT NULL,
	"comment_oid"	INTEGER NOT NULL,
	"enable"	INTEGER NOT NULL,
	"name_oid"	INTEGER NOT NULL,
	"rely"	INTEGER NOT NULL,
	"validate"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "sql_contains_expr";
CREATE TABLE IF NOT EXISTS "sql_contains_expr" (
	"oid"	INTEGER NOT NULL,
	"expr_oid"	INTEGER NOT NULL,
	"is_not"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "sql_copy_from_statement";
CREATE TABLE IF NOT EXISTS "sql_copy_from_statement" (
	"oid"	INTEGER NOT NULL,
	"access_key_id_oid"	INTEGER NOT NULL,
	"access_key_secret_oid"	INTEGER NOT NULL,
	"from_oid"	INTEGER NOT NULL,
	"table_oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "sql_create_database_statement";
CREATE TABLE IF NOT EXISTS "sql_create_database_statement" (
	"oid"	INTEGER NOT NULL,
	"character_set"	TEXT NOT NULL,
	"collate"	TEXT NOT NULL,
	"comment_oid"	INTEGER NOT NULL,
	"database_name"	TEXT NOT NULL,
	"is_if_not_exists"	INTEGER NOT NULL,
	"is_physical"	INTEGER NOT NULL,
	"location_oid"	INTEGER NOT NULL,
	"name_oid"	INTEGER NOT NULL,
	"options"	TEXT NOT NULL,
	"password_oid"	INTEGER NOT NULL,
	"server"	TEXT NOT NULL,
	"stored_as_oid"	INTEGER NOT NULL,
	"stored_by"	TEXT NOT NULL,
	"stored_in_oid"	INTEGER NOT NULL,
	"user"	TEXT NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "sql_create_function_statement";
CREATE TABLE IF NOT EXISTS "sql_create_function_statement" (
	"oid"	INTEGER NOT NULL,
	"authid_oid"	INTEGER NOT NULL,
	"block_oid"	INTEGER NOT NULL,
	"comment"	TEXT NOT NULL,
	"data_type_oid"	INTEGER NOT NULL,
	"definer_oid"	INTEGER NOT NULL,
	"is_aggregate"	INTEGER NOT NULL,
	"is_create"	INTEGER NOT NULL,
	"is_deterministic"	INTEGER NOT NULL,
	"is_if_not_exists"	INTEGER NOT NULL,
	"is_or_replace"	INTEGER NOT NULL,
	"is_parallel_enable"	INTEGER NOT NULL,
	"is_pipelined"	INTEGER NOT NULL,
	"is_result_cache"	INTEGER NOT NULL,
	"is_temporary"	INTEGER NOT NULL,
	"java_call_spec"	TEXT NOT NULL,
	"language"	TEXT NOT NULL,
	"name_oid"	INTEGER NOT NULL,
	"return_data_type_oid"	INTEGER NOT NULL,
	"schema"	TEXT NOT NULL,
	"using_oid"	INTEGER NOT NULL,
	"wrapped_source"	TEXT NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "sql_create_index_statement";
CREATE TABLE IF NOT EXISTS "sql_create_index_statement" (
	"oid"	INTEGER NOT NULL,
	"comment_oid"	INTEGER NOT NULL,
	"db_partition_by_oid"	INTEGER NOT NULL,
	"in_oid"	INTEGER NOT NULL,
	"index_definition_oid"	INTEGER NOT NULL,
	"is_concurrently"	INTEGER NOT NULL,
	"is_defered_rebuild"	INTEGER NOT NULL,
	"is_global"	INTEGER NOT NULL,
	"is_if_not_exists"	INTEGER NOT NULL,
	"is_local"	INTEGER NOT NULL,
	"is_storing"	INTEGER NOT NULL,
	"name_oid"	INTEGER NOT NULL,
	"row_format_oid"	INTEGER NOT NULL,
	"schema"	TEXT NOT NULL,
	"stored_as_oid"	INTEGER NOT NULL,
	"table_oid"	INTEGER NOT NULL,
	"table_name"	TEXT NOT NULL,
	"table_partition_by_oid"	INTEGER NOT NULL,
	"table_partitions_oid"	INTEGER NOT NULL,
	"tablespace_oid"	INTEGER NOT NULL,
	"type"	TEXT NOT NULL,
	"using"	TEXT NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "sql_create_materialized_view_statement";
CREATE TABLE IF NOT EXISTS "sql_create_materialized_view_statement" (
	"oid"	INTEGER NOT NULL,
	"cache"	INTEGER NOT NULL,
	"comment_oid"	INTEGER NOT NULL,
	"compress"	INTEGER NOT NULL,
	"compress_level"	INTEGER NOT NULL,
	"distributed_by_type_oid"	INTEGER NOT NULL,
	"enable_query_rewrite"	INTEGER NOT NULL,
	"free_lists"	INTEGER NOT NULL,
	"initrans"	INTEGER NOT NULL,
	"is_build_deferred"	INTEGER NOT NULL,
	"is_build_immediate"	INTEGER NOT NULL,
	"is_compress_for_oltp"	INTEGER NOT NULL,
	"is_if_not_exists"	INTEGER NOT NULL,
	"is_refresh"	INTEGER NOT NULL,
	"is_refresh_complete"	INTEGER NOT NULL,
	"is_refresh_fast"	INTEGER NOT NULL,
	"is_refresh_force"	INTEGER NOT NULL,
	"is_refresh_next"	INTEGER NOT NULL,
	"is_refresh_on_commit"	INTEGER NOT NULL,
	"is_refresh_on_demand"	INTEGER NOT NULL,
	"is_refresh_on_over_write"	INTEGER NOT NULL,
	"is_refresh_start_with"	INTEGER NOT NULL,
	"is_with_row_id"	INTEGER NOT NULL,
	"lify_cycle_oid"	INTEGER NOT NULL,
	"logging"	INTEGER NOT NULL,
	"maxtrans"	INTEGER NOT NULL,
	"name_oid"	INTEGER NOT NULL,
	"next_oid"	INTEGER NOT NULL,
	"parallel"	INTEGER NOT NULL,
	"parallel_value"	INTEGER NOT NULL,
	"partition_by_oid"	INTEGER NOT NULL,
	"pctfree"	INTEGER NOT NULL,
	"pctincrease"	INTEGER NOT NULL,
	"pctthreshold"	INTEGER NOT NULL,
	"pctused"	INTEGER NOT NULL,
	"query_oid"	INTEGER NOT NULL,
	"start_with_oid"	INTEGER NOT NULL,
	"storage"	TEXT NOT NULL,
	"tablespace_oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "sql_create_outline_statement";
CREATE TABLE IF NOT EXISTS "sql_create_outline_statement" (
	"oid"	INTEGER NOT NULL,
	"name_oid"	INTEGER NOT NULL,
	"on_oid"	INTEGER NOT NULL,
	"to_oid"	INTEGER NOT NULL,
	"where_oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "sql_create_procedure_statement";
CREATE TABLE IF NOT EXISTS "sql_create_procedure_statement" (
	"oid"	INTEGER NOT NULL,
	"authid_oid"	INTEGER NOT NULL,
	"block_oid"	INTEGER NOT NULL,
	"comment_oid"	INTEGER NOT NULL,
	"definer_oid"	INTEGER NOT NULL,
	"is_contains_sql"	INTEGER NOT NULL,
	"is_create"	INTEGER NOT NULL,
	"is_deterministic"	INTEGER NOT NULL,
	"is_language_sql"	INTEGER NOT NULL,
	"is_modifies_sql_data"	INTEGER NOT NULL,
	"is_no_sql"	INTEGER NOT NULL,
	"is_or_replace"	INTEGER NOT NULL,
	"is_read_sql_data"	INTEGER NOT NULL,
	"java_call_spec"	TEXT NOT NULL,
	"name_oid"	INTEGER NOT NULL,
	"wrapped_source"	TEXT NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "sql_create_resource_group_statement";
CREATE TABLE IF NOT EXISTS "sql_create_resource_group_statement" (
	"oid"	INTEGER NOT NULL,
	"enable"	INTEGER NOT NULL,
	"name_oid"	INTEGER NOT NULL,
	"properties"	TEXT NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "sql_create_role_statement";
CREATE TABLE IF NOT EXISTS "sql_create_role_statement" (
	"oid"	INTEGER NOT NULL,
	"is_if_not_exists"	INTEGER NOT NULL,
	"name_oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "sql_create_sequence_statement";
CREATE TABLE IF NOT EXISTS "sql_create_sequence_statement" (
	"oid"	INTEGER NOT NULL,
	"cache"	INTEGER NOT NULL,
	"cache_value_oid"	INTEGER NOT NULL,
	"cycle"	INTEGER NOT NULL,
	"increment_by_oid"	INTEGER NOT NULL,
	"is_group"	INTEGER NOT NULL,
	"is_no_max_value"	INTEGER NOT NULL,
	"is_no_min_value"	INTEGER NOT NULL,
	"is_simple"	INTEGER NOT NULL,
	"is_time"	INTEGER NOT NULL,
	"max_value_oid"	INTEGER NOT NULL,
	"min_value_oid"	INTEGER NOT NULL,
	"name_oid"	INTEGER NOT NULL,
	"order"	INTEGER NOT NULL,
	"schema"	TEXT NOT NULL,
	"start_with_oid"	INTEGER NOT NULL,
	"step_oid"	INTEGER NOT NULL,
	"unit_count_oid"	INTEGER NOT NULL,
	"unit_index_oid"	INTEGER NOT NULL,
	"with_cache"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "sql_create_table_group_statement";
CREATE TABLE IF NOT EXISTS "sql_create_table_group_statement" (
	"oid"	INTEGER NOT NULL,
	"is_if_not_exists"	INTEGER NOT NULL,
	"name_oid"	INTEGER NOT NULL,
	"partition_num_oid"	INTEGER NOT NULL,
	"schema_name"	TEXT NOT NULL,
	"table_group_name"	TEXT NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "sql_create_table_statement";
CREATE TABLE IF NOT EXISTS "sql_create_table_statement" (
	"oid"	INTEGER NOT NULL,
	"body_before_comments_direct"	TEXT NOT NULL,
	"buckets"	INTEGER NOT NULL,
	"catalog"	TEXT NOT NULL,
	"clustering_type"	TEXT NOT NULL,
	"column_comments"	TEXT NOT NULL,
	"comment_oid"	INTEGER NOT NULL,
	"compress"	INTEGER NOT NULL,
	"engine_oid"	INTEGER NOT NULL,
	"inherits_oid"	INTEGER NOT NULL,
	"is_dimension"	INTEGER NOT NULL,
	"is_external"	INTEGER NOT NULL,
	"is_if_not_exists"	INTEGER NOT NULL,
	"is_ignore"	INTEGER NOT NULL,
	"is_on_commit_preserve_rows"	INTEGER NOT NULL,
	"is_replace"	INTEGER NOT NULL,
	"is_single"	INTEGER NOT NULL,
	"like_oid"	INTEGER NOT NULL,
	"local_partitioning_oid"	INTEGER NOT NULL,
	"location_oid"	INTEGER NOT NULL,
	"logging"	INTEGER NOT NULL,
	"name_oid"	INTEGER NOT NULL,
	"partitioning_oid"	INTEGER NOT NULL,
	"primary_key_names"	TEXT NOT NULL,
	"row_format_oid"	INTEGER NOT NULL,
	"schema"	TEXT NOT NULL,
	"select_oid"	INTEGER NOT NULL,
	"shards"	INTEGER NOT NULL,
	"stored_as_oid"	INTEGER NOT NULL,
	"table_name"	TEXT NOT NULL,
	"table_source_oid"	INTEGER NOT NULL,
	"tablespace_oid"	INTEGER NOT NULL,
	"type"	TEXT NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "sql_create_trigger_statement";
CREATE TABLE IF NOT EXISTS "sql_create_trigger_statement" (
	"oid"	INTEGER NOT NULL,
	"body_oid"	INTEGER NOT NULL,
	"definer_oid"	INTEGER NOT NULL,
	"is_delete"	INTEGER NOT NULL,
	"is_for_each_row"	INTEGER NOT NULL,
	"is_insert"	INTEGER NOT NULL,
	"is_or_replace"	INTEGER NOT NULL,
	"is_update"	INTEGER NOT NULL,
	"name_oid"	INTEGER NOT NULL,
	"on_oid"	INTEGER NOT NULL,
	"trigger_events"	TEXT NOT NULL,
	"trigger_type"	TEXT NOT NULL,
	"when_oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "sql_create_user_statement";
CREATE TABLE IF NOT EXISTS "sql_create_user_statement" (
	"oid"	INTEGER NOT NULL,
	"password_oid"	INTEGER NOT NULL,
	"user_oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "sql_create_view_statement";
CREATE TABLE IF NOT EXISTS "sql_create_view_statement" (
	"oid"	INTEGER NOT NULL,
	"algorithm"	TEXT NOT NULL,
	"comment_oid"	INTEGER NOT NULL,
	"definer_oid"	INTEGER NOT NULL,
	"is_force"	INTEGER NOT NULL,
	"is_if_not_exists"	INTEGER NOT NULL,
	"is_on_cluster"	INTEGER NOT NULL,
	"is_or_replace"	INTEGER NOT NULL,
	"is_with_cascaded"	INTEGER NOT NULL,
	"is_with_check_option"	INTEGER NOT NULL,
	"is_with_local"	INTEGER NOT NULL,
	"is_with_read_only"	INTEGER NOT NULL,
	"name_oid"	INTEGER NOT NULL,
	"returns_data_type_oid"	INTEGER NOT NULL,
	"returns_oid"	INTEGER NOT NULL,
	"schema"	TEXT NOT NULL,
	"script_oid"	INTEGER NOT NULL,
	"sql_security"	TEXT NOT NULL,
	"sub_query_oid"	INTEGER NOT NULL,
	"table_source_oid"	INTEGER NOT NULL,
	"to_oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "sql_current_of_cursor_expr";
CREATE TABLE IF NOT EXISTS "sql_current_of_cursor_expr" (
	"oid"	INTEGER NOT NULL,
	"cursor_name_oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "sql_current_time_expr";
CREATE TABLE IF NOT EXISTS "sql_current_time_expr" (
	"oid"	INTEGER NOT NULL,
	"type"	TEXT NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "sql_current_user_expr";
CREATE TABLE IF NOT EXISTS "sql_current_user_expr" (
	"oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "sql_data_type_impl";
CREATE TABLE IF NOT EXISTS "sql_data_type_impl" (
	"oid"	INTEGER NOT NULL,
	"index_by_oid"	INTEGER NOT NULL,
	"is_int"	INTEGER NOT NULL,
	"is_numberic"	INTEGER NOT NULL,
	"is_string"	INTEGER NOT NULL,
	"is_unsigned"	INTEGER NOT NULL,
	"is_with_local_time_zone"	INTEGER NOT NULL,
	"is_zerofill"	INTEGER NOT NULL,
	"name"	TEXT NOT NULL,
	"with_time_zone"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "sql_data_type_ref_expr";
CREATE TABLE IF NOT EXISTS "sql_data_type_ref_expr" (
	"oid"	INTEGER NOT NULL,
	"data_type_oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "sql_date_expr";
CREATE TABLE IF NOT EXISTS "sql_date_expr" (
	"oid"	INTEGER NOT NULL,
	"date"	TEXT NOT NULL,
	"literal"	TEXT NOT NULL,
	"value"	TEXT NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "sql_date_time_expr";
CREATE TABLE IF NOT EXISTS "sql_date_time_expr" (
	"oid"	INTEGER NOT NULL,
	"literal_oid"	INTEGER NOT NULL,
	"value"	TEXT NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "sql_db_link_expr";
CREATE TABLE IF NOT EXISTS "sql_db_link_expr" (
	"oid"	INTEGER NOT NULL,
	"db_link"	TEXT NOT NULL,
	"expr_oid"	INTEGER NOT NULL,
	"resolved_column_oid"	INTEGER NOT NULL,
	"simple_name"	TEXT NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "sql_decimal_expr";
CREATE TABLE IF NOT EXISTS "sql_decimal_expr" (
	"oid"	INTEGER NOT NULL,
	"literal"	TEXT NOT NULL,
	"number"	TEXT NOT NULL,
	"value"	TEXT NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "sql_declare_item";
CREATE TABLE IF NOT EXISTS "sql_declare_item" (
	"oid"	INTEGER NOT NULL,
	"data_type_oid"	INTEGER NOT NULL,
	"name_oid"	INTEGER NOT NULL,
	"resolved_object"	TEXT NOT NULL,
	"type"	TEXT NOT NULL,
	"value_oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "sql_declare_statement";
CREATE TABLE IF NOT EXISTS "sql_declare_statement" (
	"oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "sql_default";
CREATE TABLE IF NOT EXISTS "sql_default" (
	"oid"	INTEGER NOT NULL,
	"column_oid"	INTEGER NOT NULL,
	"expr_oid"	INTEGER NOT NULL,
	"is_with_values"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "sql_default_expr";
CREATE TABLE IF NOT EXISTS "sql_default_expr" (
	"oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "sql_delete_statement";
CREATE TABLE IF NOT EXISTS "sql_delete_statement" (
	"oid"	INTEGER NOT NULL,
	"alias"	TEXT NOT NULL,
	"expr_table_source_oid"	INTEGER NOT NULL,
	"from_oid"	INTEGER NOT NULL,
	"is_only"	INTEGER NOT NULL,
	"table_name_oid"	INTEGER NOT NULL,
	"table_source_oid"	INTEGER NOT NULL,
	"using_oid"	INTEGER NOT NULL,
	"where_oid"	INTEGER NOT NULL,
	"with_oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "sql_describe_statement";
CREATE TABLE IF NOT EXISTS "sql_describe_statement" (
	"oid"	INTEGER NOT NULL,
	"column_oid"	INTEGER NOT NULL,
	"is_extended"	INTEGER NOT NULL,
	"is_formatted"	INTEGER NOT NULL,
	"object_oid"	INTEGER NOT NULL,
	"object_type"	TEXT NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "sql_double_expr";
CREATE TABLE IF NOT EXISTS "sql_double_expr" (
	"oid"	INTEGER NOT NULL,
	"number"	TEXT NOT NULL,
	"value"	TEXT NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "sql_drop_catalog_statement";
CREATE TABLE IF NOT EXISTS "sql_drop_catalog_statement" (
	"oid"	INTEGER NOT NULL,
	"is_external"	INTEGER NOT NULL,
	"is_if_exists"	INTEGER NOT NULL,
	"name_oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "sql_drop_database_statement";
CREATE TABLE IF NOT EXISTS "sql_drop_database_statement" (
	"oid"	INTEGER NOT NULL,
	"database_oid"	INTEGER NOT NULL,
	"database_name"	TEXT NOT NULL,
	"is_cascade"	INTEGER NOT NULL,
	"is_if_exists"	INTEGER NOT NULL,
	"is_physical"	INTEGER NOT NULL,
	"is_restrict"	INTEGER NOT NULL,
	"name_oid"	INTEGER NOT NULL,
	"restrict"	INTEGER NOT NULL,
	"server"	TEXT NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "sql_drop_event_statement";
CREATE TABLE IF NOT EXISTS "sql_drop_event_statement" (
	"oid"	INTEGER NOT NULL,
	"is_if_exists"	INTEGER NOT NULL,
	"name_oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "sql_drop_function_statement";
CREATE TABLE IF NOT EXISTS "sql_drop_function_statement" (
	"oid"	INTEGER NOT NULL,
	"is_if_exists"	INTEGER NOT NULL,
	"is_temporary"	INTEGER NOT NULL,
	"name_oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "sql_drop_index_statement";
CREATE TABLE IF NOT EXISTS "sql_drop_index_statement" (
	"oid"	INTEGER NOT NULL,
	"algorithm_oid"	INTEGER NOT NULL,
	"index_name_oid"	INTEGER NOT NULL,
	"is_if_exists"	INTEGER NOT NULL,
	"lock_option_oid"	INTEGER NOT NULL,
	"table_name_oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "sql_drop_log_file_group_statement";
CREATE TABLE IF NOT EXISTS "sql_drop_log_file_group_statement" (
	"oid"	INTEGER NOT NULL,
	"engine_oid"	INTEGER NOT NULL,
	"name_oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "sql_drop_materialized_view_statement";
CREATE TABLE IF NOT EXISTS "sql_drop_materialized_view_statement" (
	"oid"	INTEGER NOT NULL,
	"is_if_exists"	INTEGER NOT NULL,
	"name_oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "sql_drop_outline_statement";
CREATE TABLE IF NOT EXISTS "sql_drop_outline_statement" (
	"oid"	INTEGER NOT NULL,
	"is_if_exists"	INTEGER NOT NULL,
	"name_oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "sql_drop_procedure_statement";
CREATE TABLE IF NOT EXISTS "sql_drop_procedure_statement" (
	"oid"	INTEGER NOT NULL,
	"is_if_exists"	INTEGER NOT NULL,
	"name_oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "sql_drop_resource_group_statement";
CREATE TABLE IF NOT EXISTS "sql_drop_resource_group_statement" (
	"oid"	INTEGER NOT NULL,
	"is_if_exists"	INTEGER NOT NULL,
	"name_oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "sql_drop_resource_statement";
CREATE TABLE IF NOT EXISTS "sql_drop_resource_statement" (
	"oid"	INTEGER NOT NULL,
	"is_if_exists"	INTEGER NOT NULL,
	"name_oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "sql_drop_role_statement";
CREATE TABLE IF NOT EXISTS "sql_drop_role_statement" (
	"oid"	INTEGER NOT NULL,
	"is_if_not_exists"	INTEGER NOT NULL,
	"name_oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "sql_drop_sequence_statement";
CREATE TABLE IF NOT EXISTS "sql_drop_sequence_statement" (
	"oid"	INTEGER NOT NULL,
	"is_if_exists"	INTEGER NOT NULL,
	"name_oid"	INTEGER NOT NULL,
	"schema"	TEXT NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "sql_drop_server_statement";
CREATE TABLE IF NOT EXISTS "sql_drop_server_statement" (
	"oid"	INTEGER NOT NULL,
	"is_if_exists"	INTEGER NOT NULL,
	"name_oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "sql_drop_synonym_statement";
CREATE TABLE IF NOT EXISTS "sql_drop_synonym_statement" (
	"oid"	INTEGER NOT NULL,
	"is_force"	INTEGER NOT NULL,
	"is_if_exists"	INTEGER NOT NULL,
	"is_public"	INTEGER NOT NULL,
	"name_oid"	INTEGER NOT NULL,
	"schema"	TEXT NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "sql_drop_table_group_statement";
CREATE TABLE IF NOT EXISTS "sql_drop_table_group_statement" (
	"oid"	INTEGER NOT NULL,
	"is_if_exists"	INTEGER NOT NULL,
	"name_oid"	INTEGER NOT NULL,
	"table_group_name"	TEXT NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "sql_drop_table_space_statement";
CREATE TABLE IF NOT EXISTS "sql_drop_table_space_statement" (
	"oid"	INTEGER NOT NULL,
	"engine_oid"	INTEGER NOT NULL,
	"is_if_exists"	INTEGER NOT NULL,
	"name_oid"	INTEGER NOT NULL,
	"table_space_name"	TEXT NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "sql_drop_table_statement";
CREATE TABLE IF NOT EXISTS "sql_drop_table_statement" (
	"oid"	INTEGER NOT NULL,
	"is_cascade"	INTEGER NOT NULL,
	"is_drop_partition"	INTEGER NOT NULL,
	"is_external"	INTEGER NOT NULL,
	"is_if_exists"	INTEGER NOT NULL,
	"is_purge"	INTEGER NOT NULL,
	"is_restrict"	INTEGER NOT NULL,
	"is_temporary"	INTEGER NOT NULL,
	"where_oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "sql_drop_trigger_statement";
CREATE TABLE IF NOT EXISTS "sql_drop_trigger_statement" (
	"oid"	INTEGER NOT NULL,
	"is_if_exists"	INTEGER NOT NULL,
	"name_oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "sql_drop_type_statement";
CREATE TABLE IF NOT EXISTS "sql_drop_type_statement" (
	"oid"	INTEGER NOT NULL,
	"is_if_exists"	INTEGER NOT NULL,
	"name_oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "sql_drop_user_statement";
CREATE TABLE IF NOT EXISTS "sql_drop_user_statement" (
	"oid"	INTEGER NOT NULL,
	"is_if_exists"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "sql_drop_view_statement";
CREATE TABLE IF NOT EXISTS "sql_drop_view_statement" (
	"oid"	INTEGER NOT NULL,
	"is_cascade"	INTEGER NOT NULL,
	"is_if_exists"	INTEGER NOT NULL,
	"is_restrict"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "sql_dump_statement";
CREATE TABLE IF NOT EXISTS "sql_dump_statement" (
	"oid"	INTEGER NOT NULL,
	"into_oid"	INTEGER NOT NULL,
	"is_overwrite"	INTEGER NOT NULL,
	"select_oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "sql_error_logging_clause";
CREATE TABLE IF NOT EXISTS "sql_error_logging_clause" (
	"oid"	INTEGER NOT NULL,
	"into_oid"	INTEGER NOT NULL,
	"limit_oid"	INTEGER NOT NULL,
	"simple_expression_oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "sql_exists_expr";
CREATE TABLE IF NOT EXISTS "sql_exists_expr" (
	"oid"	INTEGER NOT NULL,
	"is_not"	INTEGER NOT NULL,
	"sub_query_oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "sql_explain_analyze_statement";
CREATE TABLE IF NOT EXISTS "sql_explain_analyze_statement" (
	"oid"	INTEGER NOT NULL,
	"select_oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "sql_explain_statement";
CREATE TABLE IF NOT EXISTS "sql_explain_statement" (
	"oid"	INTEGER NOT NULL,
	"format"	TEXT NOT NULL,
	"is_authorization"	INTEGER NOT NULL,
	"is_dependency"	INTEGER NOT NULL,
	"is_extended"	INTEGER NOT NULL,
	"is_optimizer"	INTEGER NOT NULL,
	"is_parenthesis"	INTEGER NOT NULL,
	"statement_oid"	INTEGER NOT NULL,
	"type"	TEXT NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "sql_export_database_statement";
CREATE TABLE IF NOT EXISTS "sql_export_database_statement" (
	"oid"	INTEGER NOT NULL,
	"db_oid"	INTEGER NOT NULL,
	"is_realtime"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "sql_export_table_statement";
CREATE TABLE IF NOT EXISTS "sql_export_table_statement" (
	"oid"	INTEGER NOT NULL,
	"for_replication_oid"	INTEGER NOT NULL,
	"table_oid"	INTEGER NOT NULL,
	"to_oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "sql_expr_hint";
CREATE TABLE IF NOT EXISTS "sql_expr_hint" (
	"oid"	INTEGER NOT NULL,
	"expr_oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "sql_expr_impl";
CREATE TABLE IF NOT EXISTS "sql_expr_impl" (
	"oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "sql_expr_statement";
CREATE TABLE IF NOT EXISTS "sql_expr_statement" (
	"oid"	INTEGER NOT NULL,
	"expr_oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "sql_expr_table_source";
CREATE TABLE IF NOT EXISTS "sql_expr_table_source" (
	"oid"	INTEGER NOT NULL,
	"catalog"	TEXT NOT NULL,
	"expr_oid"	INTEGER NOT NULL,
	"name_oid"	INTEGER NOT NULL,
	"partition_size"	INTEGER NOT NULL,
	"sampling_oid"	INTEGER NOT NULL,
	"schema"	TEXT NOT NULL,
	"schema_object"	TEXT NOT NULL,
	"table_name"	TEXT NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "sql_external_record_format";
CREATE TABLE IF NOT EXISTS "sql_external_record_format" (
	"oid"	INTEGER NOT NULL,
	"badfile"	INTEGER NOT NULL,
	"collection_items_terminated_by_oid"	INTEGER NOT NULL,
	"delimited_by_oid"	INTEGER NOT NULL,
	"escaped_by_oid"	INTEGER NOT NULL,
	"is_ltrim"	INTEGER NOT NULL,
	"is_missing_field_values_are_null"	INTEGER NOT NULL,
	"is_reject_rows_with_all_null_fields"	INTEGER NOT NULL,
	"lines_terminated_by_oid"	INTEGER NOT NULL,
	"logfile"	INTEGER NOT NULL,
	"map_keys_terminated_by_oid"	INTEGER NOT NULL,
	"null_defined_as_oid"	INTEGER NOT NULL,
	"serde_oid"	INTEGER NOT NULL,
	"terminated_by_oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "sql_extract_expr";
CREATE TABLE IF NOT EXISTS "sql_extract_expr" (
	"oid"	INTEGER NOT NULL,
	"unit"	TEXT NOT NULL,
	"value_oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "sql_fetch_statement";
CREATE TABLE IF NOT EXISTS "sql_fetch_statement" (
	"oid"	INTEGER NOT NULL,
	"cursor_name_oid"	INTEGER NOT NULL,
	"is_bulk_collect"	INTEGER NOT NULL,
	"limit_oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "sql_flashback_expr";
CREATE TABLE IF NOT EXISTS "sql_flashback_expr" (
	"oid"	INTEGER NOT NULL,
	"expr_oid"	INTEGER NOT NULL,
	"type"	TEXT NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "sql_float_expr";
CREATE TABLE IF NOT EXISTS "sql_float_expr" (
	"oid"	INTEGER NOT NULL,
	"number"	TEXT NOT NULL,
	"value"	TEXT NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "sql_for_statement";
CREATE TABLE IF NOT EXISTS "sql_for_statement" (
	"oid"	INTEGER NOT NULL,
	"index_oid"	INTEGER NOT NULL,
	"range_oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "sql_foreign_key_impl";
CREATE TABLE IF NOT EXISTS "sql_foreign_key_impl" (
	"oid"	INTEGER NOT NULL,
	"is_disable_novalidate"	INTEGER NOT NULL,
	"is_on_delete_cascade"	INTEGER NOT NULL,
	"is_on_delete_set_null"	INTEGER NOT NULL,
	"referenced_table_name_oid"	INTEGER NOT NULL,
	"referenced_table_oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "sql_grant_statement";
CREATE TABLE IF NOT EXISTS "sql_grant_statement" (
	"oid"	INTEGER NOT NULL,
	"identified_by_oid"	INTEGER NOT NULL,
	"identified_by_password"	TEXT NOT NULL,
	"is_admin_option"	INTEGER NOT NULL,
	"max_connections_per_hour_oid"	INTEGER NOT NULL,
	"max_queries_per_hour_oid"	INTEGER NOT NULL,
	"max_updates_per_hour_oid"	INTEGER NOT NULL,
	"max_user_connections_oid"	INTEGER NOT NULL,
	"resource_type"	TEXT NOT NULL,
	"with_grant_option"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "sql_grouping_set_expr";
CREATE TABLE IF NOT EXISTS "sql_grouping_set_expr" (
	"oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "sql_hex_expr";
CREATE TABLE IF NOT EXISTS "sql_hex_expr" (
	"oid"	INTEGER NOT NULL,
	"hex"	TEXT NOT NULL,
	"value"	TEXT NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "sql_identifier_expr";
CREATE TABLE IF NOT EXISTS "sql_identifier_expr" (
	"oid"	INTEGER NOT NULL,
	"lower_name"	TEXT NOT NULL,
	"name"	TEXT NOT NULL,
	"resolved_column_object"	TEXT NOT NULL,
	"resolved_column_oid"	INTEGER NOT NULL,
	"resolved_declare_item_oid"	INTEGER NOT NULL,
	"resolved_owner_object"	TEXT NOT NULL,
	"resolved_parameter_oid"	INTEGER NOT NULL,
	"resolved_select_item_oid"	INTEGER NOT NULL,
	"resolved_table_source_oid"	INTEGER NOT NULL,
	"simple_name"	TEXT NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "sql_if_statement";
CREATE TABLE IF NOT EXISTS "sql_if_statement" (
	"oid"	INTEGER NOT NULL,
	"condition_oid"	INTEGER NOT NULL,
	"else_if_list"	TEXT NOT NULL,
	"else_item"	TEXT NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "sql_import_database_statement";
CREATE TABLE IF NOT EXISTS "sql_import_database_statement" (
	"oid"	INTEGER NOT NULL,
	"db_oid"	INTEGER NOT NULL,
	"status_oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "sql_import_table_statement";
CREATE TABLE IF NOT EXISTS "sql_import_table_statement" (
	"oid"	INTEGER NOT NULL,
	"from_oid"	INTEGER NOT NULL,
	"is_extenal"	INTEGER NOT NULL,
	"is_using_build"	INTEGER NOT NULL,
	"location_oid"	INTEGER NOT NULL,
	"table_oid"	INTEGER NOT NULL,
	"version_oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "sql_in_list_expr";
CREATE TABLE IF NOT EXISTS "sql_in_list_expr" (
	"oid"	INTEGER NOT NULL,
	"expr_oid"	INTEGER NOT NULL,
	"hint_oid"	INTEGER NOT NULL,
	"is_not"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "sql_in_sub_query_expr";
CREATE TABLE IF NOT EXISTS "sql_in_sub_query_expr" (
	"oid"	INTEGER NOT NULL,
	"expr_oid"	INTEGER NOT NULL,
	"hint_oid"	INTEGER NOT NULL,
	"is_global"	INTEGER NOT NULL,
	"is_not"	INTEGER NOT NULL,
	"sub_query_oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "sql_index_definition";
CREATE TABLE IF NOT EXISTS "sql_index_definition" (
	"oid"	INTEGER NOT NULL,
	"algorithm"	TEXT NOT NULL,
	"analyzer_name_oid"	INTEGER NOT NULL,
	"db_partition_by_oid"	INTEGER NOT NULL,
	"distance_measure"	TEXT NOT NULL,
	"index_analyzer_name_oid"	INTEGER NOT NULL,
	"is_global"	INTEGER NOT NULL,
	"is_hash_map_type"	INTEGER NOT NULL,
	"is_hash_type"	INTEGER NOT NULL,
	"is_index"	INTEGER NOT NULL,
	"is_key"	INTEGER NOT NULL,
	"is_local"	INTEGER NOT NULL,
	"name_oid"	INTEGER NOT NULL,
	"options_oid"	INTEGER NOT NULL,
	"query_analyzer_name_oid"	INTEGER NOT NULL,
	"symbol_oid"	INTEGER NOT NULL,
	"table_oid"	INTEGER NOT NULL,
	"tb_partition_by_oid"	INTEGER NOT NULL,
	"tb_partitions_oid"	INTEGER NOT NULL,
	"type"	TEXT NOT NULL,
	"with_dic_name_oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "sql_index_options";
CREATE TABLE IF NOT EXISTS "sql_index_options" (
	"oid"	INTEGER NOT NULL,
	"algorithm"	TEXT NOT NULL,
	"comment_oid"	INTEGER NOT NULL,
	"index_type"	TEXT NOT NULL,
	"is_global"	INTEGER NOT NULL,
	"is_invisible"	INTEGER NOT NULL,
	"is_local"	INTEGER NOT NULL,
	"is_visible"	INTEGER NOT NULL,
	"key_block_size_oid"	INTEGER NOT NULL,
	"lock"	TEXT NOT NULL,
	"parser_name"	TEXT NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "sql_insert_into";
CREATE TABLE IF NOT EXISTS "sql_insert_into" (
	"oid"	INTEGER NOT NULL,
	"alias"	TEXT NOT NULL,
	"columns_string"	TEXT NOT NULL,
	"columns_string_hash"	TEXT NOT NULL,
	"hint_oid"	INTEGER NOT NULL,
	"insert_before_comments_direct"	TEXT NOT NULL,
	"is_overwrite"	INTEGER NOT NULL,
	"query_oid"	INTEGER NOT NULL,
	"table_name_oid"	INTEGER NOT NULL,
	"table_source_oid"	INTEGER NOT NULL,
	"values"	TEXT NOT NULL,
	"values_list"	TEXT NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "sql_insert_statement";
CREATE TABLE IF NOT EXISTS "sql_insert_statement" (
	"oid"	INTEGER NOT NULL,
	"is_after_semi"	INTEGER NOT NULL,
	"is_upsert"	INTEGER NOT NULL,
	"with_oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "sql_integer_expr";
CREATE TABLE IF NOT EXISTS "sql_integer_expr" (
	"oid"	INTEGER NOT NULL,
	"number"	TEXT NOT NULL,
	"type"	TEXT NOT NULL,
	"value"	TEXT NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "sql_interval_expr";
CREATE TABLE IF NOT EXISTS "sql_interval_expr" (
	"oid"	INTEGER NOT NULL,
	"unit"	TEXT NOT NULL,
	"value_oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "sql_join_table_source";
CREATE TABLE IF NOT EXISTS "sql_join_table_source" (
	"oid"	INTEGER NOT NULL,
	"condition_oid"	INTEGER NOT NULL,
	"is_asof"	INTEGER NOT NULL,
	"is_global"	INTEGER NOT NULL,
	"is_natural"	INTEGER NOT NULL,
	"join_type"	TEXT NOT NULL,
	"left_oid"	INTEGER NOT NULL,
	"right_oid"	INTEGER NOT NULL,
	"udj"	TEXT NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "sql_keep";
CREATE TABLE IF NOT EXISTS "sql_keep" (
	"oid"	INTEGER NOT NULL,
	"dense_rank"	TEXT NOT NULL,
	"order_by_oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "sql_lateral_view_table_source";
CREATE TABLE IF NOT EXISTS "sql_lateral_view_table_source" (
	"oid"	INTEGER NOT NULL,
	"is_outer"	INTEGER NOT NULL,
	"method_oid"	INTEGER NOT NULL,
	"on_oid"	INTEGER NOT NULL,
	"table_source_oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "sql_limit";
CREATE TABLE IF NOT EXISTS "sql_limit" (
	"oid"	INTEGER NOT NULL,
	"offset_oid"	INTEGER NOT NULL,
	"row_count_oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "sql_list_expr";
CREATE TABLE IF NOT EXISTS "sql_list_expr" (
	"oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "sql_list_resource_group_statement";
CREATE TABLE IF NOT EXISTS "sql_list_resource_group_statement" (
	"oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "sql_loop_statement";
CREATE TABLE IF NOT EXISTS "sql_loop_statement" (
	"oid"	INTEGER NOT NULL,
	"label_name"	TEXT NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "sql_map_data_type";
CREATE TABLE IF NOT EXISTS "sql_map_data_type" (
	"oid"	INTEGER NOT NULL,
	"is_int"	INTEGER NOT NULL,
	"is_numberic"	INTEGER NOT NULL,
	"is_string"	INTEGER NOT NULL,
	"is_with_local_time_zone"	INTEGER NOT NULL,
	"key_type_oid"	INTEGER NOT NULL,
	"name"	TEXT NOT NULL,
	"value_type_oid"	INTEGER NOT NULL,
	"with_time_zone"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "sql_match_against_expr";
CREATE TABLE IF NOT EXISTS "sql_match_against_expr" (
	"oid"	INTEGER NOT NULL,
	"against_oid"	INTEGER NOT NULL,
	"search_modifier"	TEXT NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "sql_merge_statement";
CREATE TABLE IF NOT EXISTS "sql_merge_statement" (
	"oid"	INTEGER NOT NULL,
	"alias"	TEXT NOT NULL,
	"error_logging_clause_oid"	INTEGER NOT NULL,
	"insert_clause"	TEXT NOT NULL,
	"into_oid"	INTEGER NOT NULL,
	"on_oid"	INTEGER NOT NULL,
	"update_clause"	TEXT NOT NULL,
	"using_oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "sql_method_invoke_expr";
CREATE TABLE IF NOT EXISTS "sql_method_invoke_expr" (
	"oid"	INTEGER NOT NULL,
	"for_oid"	INTEGER NOT NULL,
	"from_oid"	INTEGER NOT NULL,
	"method_name"	TEXT NOT NULL,
	"owner_oid"	INTEGER NOT NULL,
	"resolved_return_data_type_oid"	INTEGER NOT NULL,
	"trim_option"	TEXT NOT NULL,
	"using_oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "sql_not_expr";
CREATE TABLE IF NOT EXISTS "sql_not_expr" (
	"oid"	INTEGER NOT NULL,
	"expr_oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "sql_not_null_constraint";
CREATE TABLE IF NOT EXISTS "sql_not_null_constraint" (
	"oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "sql_null_constraint";
CREATE TABLE IF NOT EXISTS "sql_null_constraint" (
	"oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "sql_null_expr";
CREATE TABLE IF NOT EXISTS "sql_null_expr" (
	"oid"	INTEGER NOT NULL,
	"value"	TEXT NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "sql_number_expr";
CREATE TABLE IF NOT EXISTS "sql_number_expr" (
	"oid"	INTEGER NOT NULL,
	"literal"	TEXT NOT NULL,
	"number"	TEXT NOT NULL,
	"value"	TEXT NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "sql_numeric_literal_expr";
CREATE TABLE IF NOT EXISTS "sql_numeric_literal_expr" (
	"oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "sql_object";
CREATE TABLE IF NOT EXISTS "sql_object" (
	"oid"	INTEGER NOT NULL,
	"parent_oid"	INTEGER NOT NULL,
	"location_oid"	INTEGER NOT NULL,
	"node_type"	TEXT NOT NULL,
	"index_in_parent"	INTEGER NOT NULL,
	"after_comments_direct"	TEXT NOT NULL,
	"before_comments_direct"	TEXT NOT NULL,
	"db_type"	TEXT NOT NULL,
	"debug_message"	TEXT NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "sql_open_statement";
CREATE TABLE IF NOT EXISTS "sql_open_statement" (
	"oid"	INTEGER NOT NULL,
	"cursor_name_oid"	INTEGER NOT NULL,
	"for_oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "sql_optimize_statement";
CREATE TABLE IF NOT EXISTS "sql_optimize_statement" (
	"oid"	INTEGER NOT NULL,
	"cluster_oid"	INTEGER NOT NULL,
	"deduplicate_by_oid"	INTEGER NOT NULL,
	"is_deduplicate"	INTEGER NOT NULL,
	"is_final"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "sql_order_by";
CREATE TABLE IF NOT EXISTS "sql_order_by" (
	"oid"	INTEGER NOT NULL,
	"is_siblings"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "sql_over";
CREATE TABLE IF NOT EXISTS "sql_over" (
	"oid"	INTEGER NOT NULL,
	"cluster_by_oid"	INTEGER NOT NULL,
	"distribute_by_oid"	INTEGER NOT NULL,
	"is_exclude_current_row"	INTEGER NOT NULL,
	"is_windowing_between_end_following"	INTEGER NOT NULL,
	"is_windowing_between_end_preceding"	INTEGER NOT NULL,
	"is_windowing_preceding"	INTEGER NOT NULL,
	"of_oid"	INTEGER NOT NULL,
	"order_by_oid"	INTEGER NOT NULL,
	"sort_by_oid"	INTEGER NOT NULL,
	"windowing_between_begin_oid"	INTEGER NOT NULL,
	"windowing_between_begin_bound"	TEXT NOT NULL,
	"windowing_between_end_oid"	INTEGER NOT NULL,
	"windowing_between_end_bound"	TEXT NOT NULL,
	"windowing_type"	TEXT NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "sql_parameter";
CREATE TABLE IF NOT EXISTS "sql_parameter" (
	"oid"	INTEGER NOT NULL,
	"cursor_name_oid"	INTEGER NOT NULL,
	"data_type_oid"	INTEGER NOT NULL,
	"default_value_oid"	INTEGER NOT NULL,
	"is_constant"	INTEGER NOT NULL,
	"is_map"	INTEGER NOT NULL,
	"is_member"	INTEGER NOT NULL,
	"is_no_copy"	INTEGER NOT NULL,
	"is_order"	INTEGER NOT NULL,
	"name_oid"	INTEGER NOT NULL,
	"param_type"	TEXT NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "sql_partition";
CREATE TABLE IF NOT EXISTS "sql_partition" (
	"oid"	INTEGER NOT NULL,
	"comment_oid"	INTEGER NOT NULL,
	"data_directory_oid"	INTEGER NOT NULL,
	"engine_oid"	INTEGER NOT NULL,
	"index_directory_oid"	INTEGER NOT NULL,
	"is_segment_creation_deferred"	INTEGER NOT NULL,
	"is_segment_creation_immediate"	INTEGER NOT NULL,
	"lob_storage"	TEXT NOT NULL,
	"locality_oid"	INTEGER NOT NULL,
	"max_rows_oid"	INTEGER NOT NULL,
	"min_rows_oid"	INTEGER NOT NULL,
	"name_oid"	INTEGER NOT NULL,
	"sub_partitions_count_oid"	INTEGER NOT NULL,
	"values_oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "sql_partition_by";
CREATE TABLE IF NOT EXISTS "sql_partition_by" (
	"oid"	INTEGER NOT NULL,
	"is_linear"	INTEGER NOT NULL,
	"lifecycle_oid"	INTEGER NOT NULL,
	"partitions_count_oid"	INTEGER NOT NULL,
	"sub_partition_by_oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "sql_partition_by_hash";
CREATE TABLE IF NOT EXISTS "sql_partition_by_hash" (
	"oid"	INTEGER NOT NULL,
	"is_key"	INTEGER NOT NULL,
	"is_unique"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "sql_partition_by_list";
CREATE TABLE IF NOT EXISTS "sql_partition_by_list" (
	"oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "sql_partition_by_range";
CREATE TABLE IF NOT EXISTS "sql_partition_by_range" (
	"oid"	INTEGER NOT NULL,
	"expire_after_oid"	INTEGER NOT NULL,
	"interval_oid"	INTEGER NOT NULL,
	"is_columns"	INTEGER NOT NULL,
	"is_disable_schedule"	INTEGER NOT NULL,
	"pivot_date_expr_oid"	INTEGER NOT NULL,
	"pre_allocate_oid"	INTEGER NOT NULL,
	"start_with_oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "sql_partition_by_value";
CREATE TABLE IF NOT EXISTS "sql_partition_by_value" (
	"oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "sql_partition_ref";
CREATE TABLE IF NOT EXISTS "sql_partition_ref" (
	"oid"	INTEGER NOT NULL,
	"items"	TEXT NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "sql_partition_spec";
CREATE TABLE IF NOT EXISTS "sql_partition_spec" (
	"oid"	INTEGER NOT NULL,
	"items"	TEXT NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "sql_partition_value";
CREATE TABLE IF NOT EXISTS "sql_partition_value" (
	"oid"	INTEGER NOT NULL,
	"operator"	TEXT NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "sql_primary_key_impl";
CREATE TABLE IF NOT EXISTS "sql_primary_key_impl" (
	"oid"	INTEGER NOT NULL,
	"is_clustered"	INTEGER NOT NULL,
	"is_disable_novalidate"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "sql_privilege_item";
CREATE TABLE IF NOT EXISTS "sql_privilege_item" (
	"oid"	INTEGER NOT NULL,
	"action_oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "sql_privilege_statement";
CREATE TABLE IF NOT EXISTS "sql_privilege_statement" (
	"oid"	INTEGER NOT NULL,
	"resource"	TEXT NOT NULL,
	"resource_type"	TEXT NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "sql_property_expr";
CREATE TABLE IF NOT EXISTS "sql_property_expr" (
	"oid"	INTEGER NOT NULL,
	"name"	TEXT NOT NULL,
	"owner_oid"	INTEGER NOT NULL,
	"owner_name"	TEXT NOT NULL,
	"resolved_column_oid"	INTEGER NOT NULL,
	"resolved_owner_object"	TEXT NOT NULL,
	"resolved_procudure_oid"	INTEGER NOT NULL,
	"resolved_table_source_oid"	INTEGER NOT NULL,
	"simple_name"	TEXT NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "sql_purge_logs_statement";
CREATE TABLE IF NOT EXISTS "sql_purge_logs_statement" (
	"oid"	INTEGER NOT NULL,
	"before_oid"	INTEGER NOT NULL,
	"is_all"	INTEGER NOT NULL,
	"is_binary"	INTEGER NOT NULL,
	"is_master"	INTEGER NOT NULL,
	"to_oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "sql_purge_recyclebin_statement";
CREATE TABLE IF NOT EXISTS "sql_purge_recyclebin_statement" (
	"oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "sql_purge_table_statement";
CREATE TABLE IF NOT EXISTS "sql_purge_table_statement" (
	"oid"	INTEGER NOT NULL,
	"count"	INTEGER NOT NULL,
	"is_all"	INTEGER NOT NULL,
	"table_oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "sql_purge_temporary_output_statement";
CREATE TABLE IF NOT EXISTS "sql_purge_temporary_output_statement" (
	"oid"	INTEGER NOT NULL,
	"name_oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "sql_query_expr";
CREATE TABLE IF NOT EXISTS "sql_query_expr" (
	"oid"	INTEGER NOT NULL,
	"sub_query_oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "sql_real_expr";
CREATE TABLE IF NOT EXISTS "sql_real_expr" (
	"oid"	INTEGER NOT NULL,
	"number"	TEXT NOT NULL,
	"value"	TEXT NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "sql_record_data_type";
CREATE TABLE IF NOT EXISTS "sql_record_data_type" (
	"oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "sql_refresh_materialized_view_statement";
CREATE TABLE IF NOT EXISTS "sql_refresh_materialized_view_statement" (
	"oid"	INTEGER NOT NULL,
	"name_oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "sql_release_save_point_statement";
CREATE TABLE IF NOT EXISTS "sql_release_save_point_statement" (
	"oid"	INTEGER NOT NULL,
	"name_oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "sql_rename_user_statement";
CREATE TABLE IF NOT EXISTS "sql_rename_user_statement" (
	"oid"	INTEGER NOT NULL,
	"name_oid"	INTEGER NOT NULL,
	"to_oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "sql_replace_statement";
CREATE TABLE IF NOT EXISTS "sql_replace_statement" (
	"oid"	INTEGER NOT NULL,
	"hints_size"	INTEGER NOT NULL,
	"is_delayed"	INTEGER NOT NULL,
	"is_low_priority"	INTEGER NOT NULL,
	"query_oid"	INTEGER NOT NULL,
	"table_name_oid"	INTEGER NOT NULL,
	"table_source_oid"	INTEGER NOT NULL,
	"values_list"	TEXT NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "sql_restore_statement";
CREATE TABLE IF NOT EXISTS "sql_restore_statement" (
	"oid"	INTEGER NOT NULL,
	"type_oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "sql_return_statement";
CREATE TABLE IF NOT EXISTS "sql_return_statement" (
	"oid"	INTEGER NOT NULL,
	"expr_oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "sql_revoke_statement";
CREATE TABLE IF NOT EXISTS "sql_revoke_statement" (
	"oid"	INTEGER NOT NULL,
	"is_grant_option"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "sql_rollback_statement";
CREATE TABLE IF NOT EXISTS "sql_rollback_statement" (
	"oid"	INTEGER NOT NULL,
	"chain"	INTEGER NOT NULL,
	"force_oid"	INTEGER NOT NULL,
	"release"	INTEGER NOT NULL,
	"to_oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "sql_row_data_type";
CREATE TABLE IF NOT EXISTS "sql_row_data_type" (
	"oid"	INTEGER NOT NULL,
	"fields"	TEXT NOT NULL,
	"is_int"	INTEGER NOT NULL,
	"is_numberic"	INTEGER NOT NULL,
	"is_string"	INTEGER NOT NULL,
	"is_with_local_time_zone"	INTEGER NOT NULL,
	"name"	TEXT NOT NULL,
	"with_time_zone"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "sql_save_point_statement";
CREATE TABLE IF NOT EXISTS "sql_save_point_statement" (
	"oid"	INTEGER NOT NULL,
	"name_oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "sql_script_commit_statement";
CREATE TABLE IF NOT EXISTS "sql_script_commit_statement" (
	"oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "sql_select";
CREATE TABLE IF NOT EXISTS "sql_select" (
	"oid"	INTEGER NOT NULL,
	"first_query_block_oid"	INTEGER NOT NULL,
	"for_xml_options"	TEXT NOT NULL,
	"for_xml_options_size"	INTEGER NOT NULL,
	"head_hint_oid"	INTEGER NOT NULL,
	"hints_size"	INTEGER NOT NULL,
	"is_for_browse"	INTEGER NOT NULL,
	"is_simple"	INTEGER NOT NULL,
	"limit_oid"	INTEGER NOT NULL,
	"offset_oid"	INTEGER NOT NULL,
	"order_by_oid"	INTEGER NOT NULL,
	"query_oid"	INTEGER NOT NULL,
	"query_block_oid"	INTEGER NOT NULL,
	"restriction"	TEXT NOT NULL,
	"row_count_oid"	INTEGER NOT NULL,
	"with_sub_query_oid"	INTEGER NOT NULL,
	"xml_path_oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "sql_select_group_by_clause";
CREATE TABLE IF NOT EXISTS "sql_select_group_by_clause" (
	"oid"	INTEGER NOT NULL,
	"having_oid"	INTEGER NOT NULL,
	"hint_oid"	INTEGER NOT NULL,
	"is_distinct"	INTEGER NOT NULL,
	"is_paren"	INTEGER NOT NULL,
	"is_with_cube"	INTEGER NOT NULL,
	"is_with_roll_up"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "sql_select_item";
CREATE TABLE IF NOT EXISTS "sql_select_item" (
	"oid"	INTEGER NOT NULL,
	"alias"	TEXT NOT NULL,
	"alias2"	TEXT NOT NULL,
	"alias_list"	TEXT NOT NULL,
	"expr_oid"	INTEGER NOT NULL,
	"is_connect_by_root"	INTEGER NOT NULL,
	"is_udtf_select_item"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "sql_select_order_by_item";
CREATE TABLE IF NOT EXISTS "sql_select_order_by_item" (
	"oid"	INTEGER NOT NULL,
	"collate"	TEXT NOT NULL,
	"expr_oid"	INTEGER NOT NULL,
	"is_cluster_by"	INTEGER NOT NULL,
	"is_distribute_by"	INTEGER NOT NULL,
	"is_sort_by"	INTEGER NOT NULL,
	"nulls_order_type"	TEXT NOT NULL,
	"resolved_select_item_oid"	INTEGER NOT NULL,
	"type"	TEXT NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "sql_select_query_base";
CREATE TABLE IF NOT EXISTS "sql_select_query_base" (
	"oid"	INTEGER NOT NULL,
	"is_parenthesized"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "sql_select_query_block";
CREATE TABLE IF NOT EXISTS "sql_select_query_block" (
	"oid"	INTEGER NOT NULL,
	"cached_select_list"	TEXT NOT NULL,
	"cached_select_list_hash"	TEXT NOT NULL,
	"connect_by_oid"	INTEGER NOT NULL,
	"distion_option"	INTEGER NOT NULL,
	"first_oid"	INTEGER NOT NULL,
	"for_update_of_size"	INTEGER NOT NULL,
	"from_oid"	INTEGER NOT NULL,
	"group_by_oid"	INTEGER NOT NULL,
	"hints_size"	INTEGER NOT NULL,
	"into_oid"	INTEGER NOT NULL,
	"is_distinct"	INTEGER NOT NULL,
	"is_for_share"	INTEGER NOT NULL,
	"is_for_update"	INTEGER NOT NULL,
	"is_no_cycle"	INTEGER NOT NULL,
	"is_no_wait"	INTEGER NOT NULL,
	"is_prior"	INTEGER NOT NULL,
	"is_skip_locked"	INTEGER NOT NULL,
	"limit_oid"	INTEGER NOT NULL,
	"offset_oid"	INTEGER NOT NULL,
	"order_by_oid"	INTEGER NOT NULL,
	"order_by_siblings_oid"	INTEGER NOT NULL,
	"start_with_oid"	INTEGER NOT NULL,
	"wait_time_oid"	INTEGER NOT NULL,
	"where_oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "sql_select_statement";
CREATE TABLE IF NOT EXISTS "sql_select_statement" (
	"oid"	INTEGER NOT NULL,
	"select_oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "sql_sequence_expr";
CREATE TABLE IF NOT EXISTS "sql_sequence_expr" (
	"oid"	INTEGER NOT NULL,
	"function"	TEXT NOT NULL,
	"sequence_oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "sql_server_exec_statement";
CREATE TABLE IF NOT EXISTS "sql_server_exec_statement" (
	"oid"	INTEGER NOT NULL,
	"module_name_oid"	INTEGER NOT NULL,
	"parameters"	TEXT NOT NULL,
	"return_status_oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "sql_server_insert_statement";
CREATE TABLE IF NOT EXISTS "sql_server_insert_statement" (
	"oid"	INTEGER NOT NULL,
	"is_default_values"	INTEGER NOT NULL,
	"output_oid"	INTEGER NOT NULL,
	"top_oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "sql_server_object_impl";
CREATE TABLE IF NOT EXISTS "sql_server_object_impl" (
	"oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "sql_server_object_reference_expr";
CREATE TABLE IF NOT EXISTS "sql_server_object_reference_expr" (
	"oid"	INTEGER NOT NULL,
	"database"	TEXT NOT NULL,
	"resolved_column_oid"	INTEGER NOT NULL,
	"schema"	TEXT NOT NULL,
	"server"	TEXT NOT NULL,
	"simple_name"	TEXT NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "sql_server_output";
CREATE TABLE IF NOT EXISTS "sql_server_output" (
	"oid"	INTEGER NOT NULL,
	"into_oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "sql_server_rollback_statement";
CREATE TABLE IF NOT EXISTS "sql_server_rollback_statement" (
	"oid"	INTEGER NOT NULL,
	"is_work"	INTEGER NOT NULL,
	"name_oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "sql_server_select_query_block";
CREATE TABLE IF NOT EXISTS "sql_server_select_query_block" (
	"oid"	INTEGER NOT NULL,
	"top_oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "sql_server_set_transaction_isolation_level_statement";
CREATE TABLE IF NOT EXISTS "sql_server_set_transaction_isolation_level_statement" (
	"oid"	INTEGER NOT NULL,
	"level"	TEXT NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "sql_server_statement_impl";
CREATE TABLE IF NOT EXISTS "sql_server_statement_impl" (
	"oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "sql_server_top";
CREATE TABLE IF NOT EXISTS "sql_server_top" (
	"oid"	INTEGER NOT NULL,
	"expr_oid"	INTEGER NOT NULL,
	"is_percent"	INTEGER NOT NULL,
	"is_with_ties"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "sql_server_update_statement";
CREATE TABLE IF NOT EXISTS "sql_server_update_statement" (
	"oid"	INTEGER NOT NULL,
	"output_oid"	INTEGER NOT NULL,
	"top_oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "sql_server_wait_for_statement";
CREATE TABLE IF NOT EXISTS "sql_server_wait_for_statement" (
	"oid"	INTEGER NOT NULL,
	"delay_oid"	INTEGER NOT NULL,
	"statement_oid"	INTEGER NOT NULL,
	"time_oid"	INTEGER NOT NULL,
	"timeout_oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "sql_set_statement";
CREATE TABLE IF NOT EXISTS "sql_set_statement" (
	"oid"	INTEGER NOT NULL,
	"option"	TEXT NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "sql_show_acl_statement";
CREATE TABLE IF NOT EXISTS "sql_show_acl_statement" (
	"oid"	INTEGER NOT NULL,
	"table_oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "sql_show_catalogs_statement";
CREATE TABLE IF NOT EXISTS "sql_show_catalogs_statement" (
	"oid"	INTEGER NOT NULL,
	"like_oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "sql_show_columns_statement";
CREATE TABLE IF NOT EXISTS "sql_show_columns_statement" (
	"oid"	INTEGER NOT NULL,
	"database_oid"	INTEGER NOT NULL,
	"is_full"	INTEGER NOT NULL,
	"like_oid"	INTEGER NOT NULL,
	"table_oid"	INTEGER NOT NULL,
	"where_oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "sql_show_create_materialized_view_statement";
CREATE TABLE IF NOT EXISTS "sql_show_create_materialized_view_statement" (
	"oid"	INTEGER NOT NULL,
	"name_oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "sql_show_create_table_statement";
CREATE TABLE IF NOT EXISTS "sql_show_create_table_statement" (
	"oid"	INTEGER NOT NULL,
	"is_all"	INTEGER NOT NULL,
	"like_mapping_oid"	INTEGER NOT NULL,
	"name_oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "sql_show_create_view_statement";
CREATE TABLE IF NOT EXISTS "sql_show_create_view_statement" (
	"oid"	INTEGER NOT NULL,
	"name_oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "sql_show_databases_statement";
CREATE TABLE IF NOT EXISTS "sql_show_databases_statement" (
	"oid"	INTEGER NOT NULL,
	"database_oid"	INTEGER NOT NULL,
	"is_extra"	INTEGER NOT NULL,
	"is_full"	INTEGER NOT NULL,
	"is_physical"	INTEGER NOT NULL,
	"like_oid"	INTEGER NOT NULL,
	"where_oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "sql_show_errors_statement";
CREATE TABLE IF NOT EXISTS "sql_show_errors_statement" (
	"oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "sql_show_functions_statement";
CREATE TABLE IF NOT EXISTS "sql_show_functions_statement" (
	"oid"	INTEGER NOT NULL,
	"like_oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "sql_show_grants_statement";
CREATE TABLE IF NOT EXISTS "sql_show_grants_statement" (
	"oid"	INTEGER NOT NULL,
	"on_oid"	INTEGER NOT NULL,
	"user_oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "sql_show_history_statement";
CREATE TABLE IF NOT EXISTS "sql_show_history_statement" (
	"oid"	INTEGER NOT NULL,
	"is_tables"	INTEGER NOT NULL,
	"table_oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "sql_show_indexes_statement";
CREATE TABLE IF NOT EXISTS "sql_show_indexes_statement" (
	"oid"	INTEGER NOT NULL,
	"database_oid"	INTEGER NOT NULL,
	"table_oid"	INTEGER NOT NULL,
	"type"	TEXT NOT NULL,
	"where_oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "sql_show_materialized_view_statement";
CREATE TABLE IF NOT EXISTS "sql_show_materialized_view_statement" (
	"oid"	INTEGER NOT NULL,
	"like_oid"	INTEGER NOT NULL,
	"name_oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "sql_show_outlines_statement";
CREATE TABLE IF NOT EXISTS "sql_show_outlines_statement" (
	"oid"	INTEGER NOT NULL,
	"limit_oid"	INTEGER NOT NULL,
	"order_by_oid"	INTEGER NOT NULL,
	"where_oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "sql_show_packages_statement";
CREATE TABLE IF NOT EXISTS "sql_show_packages_statement" (
	"oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "sql_show_partitions_stmt";
CREATE TABLE IF NOT EXISTS "sql_show_partitions_stmt" (
	"oid"	INTEGER NOT NULL,
	"table_source_oid"	INTEGER NOT NULL,
	"where_oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "sql_show_process_list_statement";
CREATE TABLE IF NOT EXISTS "sql_show_process_list_statement" (
	"oid"	INTEGER NOT NULL,
	"is_full"	INTEGER NOT NULL,
	"is_mpp"	INTEGER NOT NULL,
	"limit_oid"	INTEGER NOT NULL,
	"order_by_oid"	INTEGER NOT NULL,
	"where_oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "sql_show_query_task_statement";
CREATE TABLE IF NOT EXISTS "sql_show_query_task_statement" (
	"oid"	INTEGER NOT NULL,
	"for_oid"	INTEGER NOT NULL,
	"is_full"	INTEGER NOT NULL,
	"limit_oid"	INTEGER NOT NULL,
	"order_by_oid"	INTEGER NOT NULL,
	"user_oid"	INTEGER NOT NULL,
	"where_oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "sql_show_recylebin_statement";
CREATE TABLE IF NOT EXISTS "sql_show_recylebin_statement" (
	"oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "sql_show_role_statement";
CREATE TABLE IF NOT EXISTS "sql_show_role_statement" (
	"oid"	INTEGER NOT NULL,
	"grant_oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "sql_show_roles_statement";
CREATE TABLE IF NOT EXISTS "sql_show_roles_statement" (
	"oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "sql_show_session_statement";
CREATE TABLE IF NOT EXISTS "sql_show_session_statement" (
	"oid"	INTEGER NOT NULL,
	"like_oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "sql_show_statistic_list_stmt";
CREATE TABLE IF NOT EXISTS "sql_show_statistic_list_stmt" (
	"oid"	INTEGER NOT NULL,
	"is_full"	INTEGER NOT NULL,
	"table_source_oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "sql_show_statistic_stmt";
CREATE TABLE IF NOT EXISTS "sql_show_statistic_stmt" (
	"oid"	INTEGER NOT NULL,
	"is_full"	INTEGER NOT NULL,
	"table_source_oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "sql_show_table_groups_statement";
CREATE TABLE IF NOT EXISTS "sql_show_table_groups_statement" (
	"oid"	INTEGER NOT NULL,
	"database_oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "sql_show_tables_statement";
CREATE TABLE IF NOT EXISTS "sql_show_tables_statement" (
	"oid"	INTEGER NOT NULL,
	"database_oid"	INTEGER NOT NULL,
	"from_oid"	INTEGER NOT NULL,
	"is_extended"	INTEGER NOT NULL,
	"is_full"	INTEGER NOT NULL,
	"like_oid"	INTEGER NOT NULL,
	"where_oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "sql_show_users_statement";
CREATE TABLE IF NOT EXISTS "sql_show_users_statement" (
	"oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "sql_show_variants_statement";
CREATE TABLE IF NOT EXISTS "sql_show_variants_statement" (
	"oid"	INTEGER NOT NULL,
	"is_global"	INTEGER NOT NULL,
	"is_session"	INTEGER NOT NULL,
	"like_oid"	INTEGER NOT NULL,
	"where_oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "sql_show_views_statement";
CREATE TABLE IF NOT EXISTS "sql_show_views_statement" (
	"oid"	INTEGER NOT NULL,
	"database_oid"	INTEGER NOT NULL,
	"like_oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "sql_size_expr";
CREATE TABLE IF NOT EXISTS "sql_size_expr" (
	"oid"	INTEGER NOT NULL,
	"unit"	TEXT NOT NULL,
	"value_oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "sql_small_int_expr";
CREATE TABLE IF NOT EXISTS "sql_small_int_expr" (
	"oid"	INTEGER NOT NULL,
	"number"	TEXT NOT NULL,
	"value"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "sql_some_expr";
CREATE TABLE IF NOT EXISTS "sql_some_expr" (
	"oid"	INTEGER NOT NULL,
	"sub_query_oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "sql_start_transaction_statement";
CREATE TABLE IF NOT EXISTS "sql_start_transaction_statement" (
	"oid"	INTEGER NOT NULL,
	"is_begin"	INTEGER NOT NULL,
	"is_consistent_snapshot"	INTEGER NOT NULL,
	"is_read_only"	INTEGER NOT NULL,
	"is_work"	INTEGER NOT NULL,
	"isolation_level"	TEXT NOT NULL,
	"name_oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "sql_statement_impl";
CREATE TABLE IF NOT EXISTS "sql_statement_impl" (
	"oid"	INTEGER NOT NULL,
	"is_after_semi"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "sql_struct_data_type";
CREATE TABLE IF NOT EXISTS "sql_struct_data_type" (
	"oid"	INTEGER NOT NULL,
	"fields"	TEXT NOT NULL,
	"is_int"	INTEGER NOT NULL,
	"is_numberic"	INTEGER NOT NULL,
	"is_string"	INTEGER NOT NULL,
	"is_with_local_time_zone"	INTEGER NOT NULL,
	"name"	TEXT NOT NULL,
	"with_time_zone"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "sql_sub_partition";
CREATE TABLE IF NOT EXISTS "sql_sub_partition" (
	"oid"	INTEGER NOT NULL,
	"comment_oid"	INTEGER NOT NULL,
	"data_directory_oid"	INTEGER NOT NULL,
	"engine_oid"	INTEGER NOT NULL,
	"index_directory_oid"	INTEGER NOT NULL,
	"max_rows_oid"	INTEGER NOT NULL,
	"min_rows_oid"	INTEGER NOT NULL,
	"name_oid"	INTEGER NOT NULL,
	"table_space_oid"	INTEGER NOT NULL,
	"values_oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "sql_sub_partition_by";
CREATE TABLE IF NOT EXISTS "sql_sub_partition_by" (
	"oid"	INTEGER NOT NULL,
	"is_linear"	INTEGER NOT NULL,
	"lifecycle_oid"	INTEGER NOT NULL,
	"sub_partitions_count_oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "sql_sub_partition_by_hash";
CREATE TABLE IF NOT EXISTS "sql_sub_partition_by_hash" (
	"oid"	INTEGER NOT NULL,
	"expr_oid"	INTEGER NOT NULL,
	"is_key"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "sql_sub_partition_by_list";
CREATE TABLE IF NOT EXISTS "sql_sub_partition_by_list" (
	"oid"	INTEGER NOT NULL,
	"column_oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "sql_sub_partition_by_range";
CREATE TABLE IF NOT EXISTS "sql_sub_partition_by_range" (
	"oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "sql_submit_job_statement";
CREATE TABLE IF NOT EXISTS "sql_submit_job_statement" (
	"oid"	INTEGER NOT NULL,
	"is_await"	INTEGER NOT NULL,
	"statment_oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "sql_subquery_table_source";
CREATE TABLE IF NOT EXISTS "sql_subquery_table_source" (
	"oid"	INTEGER NOT NULL,
	"select_oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "sql_sync_meta_statement";
CREATE TABLE IF NOT EXISTS "sql_sync_meta_statement" (
	"oid"	INTEGER NOT NULL,
	"from_oid"	INTEGER NOT NULL,
	"ignore"	INTEGER NOT NULL,
	"like_oid"	INTEGER NOT NULL,
	"restrict"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "sql_table_data_type";
CREATE TABLE IF NOT EXISTS "sql_table_data_type" (
	"oid"	INTEGER NOT NULL,
	"is_int"	INTEGER NOT NULL,
	"is_numberic"	INTEGER NOT NULL,
	"is_string"	INTEGER NOT NULL,
	"is_with_local_time_zone"	INTEGER NOT NULL,
	"name"	TEXT NOT NULL,
	"with_time_zone"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "sql_table_like";
CREATE TABLE IF NOT EXISTS "sql_table_like" (
	"oid"	INTEGER NOT NULL,
	"is_exclude_properties"	INTEGER NOT NULL,
	"is_include_properties"	INTEGER NOT NULL,
	"table_oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "sql_table_sampling";
CREATE TABLE IF NOT EXISTS "sql_table_sampling" (
	"oid"	INTEGER NOT NULL,
	"bucket_oid"	INTEGER NOT NULL,
	"byte_length_oid"	INTEGER NOT NULL,
	"is_bernoulli"	INTEGER NOT NULL,
	"is_system"	INTEGER NOT NULL,
	"on_oid"	INTEGER NOT NULL,
	"out_of_oid"	INTEGER NOT NULL,
	"percent_oid"	INTEGER NOT NULL,
	"rows_oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "sql_table_source_impl";
CREATE TABLE IF NOT EXISTS "sql_table_source_impl" (
	"oid"	INTEGER NOT NULL,
	"alias"	TEXT NOT NULL,
	"alias2"	TEXT NOT NULL,
	"flashback_oid"	INTEGER NOT NULL,
	"hints_size"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "sql_text_literal_expr";
CREATE TABLE IF NOT EXISTS "sql_text_literal_expr" (
	"oid"	INTEGER NOT NULL,
	"text"	TEXT NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "sql_time_expr";
CREATE TABLE IF NOT EXISTS "sql_time_expr" (
	"oid"	INTEGER NOT NULL,
	"literal_oid"	INTEGER NOT NULL,
	"value"	TEXT NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "sql_timestamp_expr";
CREATE TABLE IF NOT EXISTS "sql_timestamp_expr" (
	"oid"	INTEGER NOT NULL,
	"is_with_time_zone"	INTEGER NOT NULL,
	"literal"	TEXT NOT NULL,
	"time_zone"	TEXT NOT NULL,
	"value"	TEXT NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "sql_tiny_int_expr";
CREATE TABLE IF NOT EXISTS "sql_tiny_int_expr" (
	"oid"	INTEGER NOT NULL,
	"number"	TEXT NOT NULL,
	"value"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "sql_truncate_statement";
CREATE TABLE IF NOT EXISTS "sql_truncate_statement" (
	"oid"	INTEGER NOT NULL,
	"cascade"	INTEGER NOT NULL,
	"is_continue_identity"	INTEGER NOT NULL,
	"is_drop_storage"	INTEGER NOT NULL,
	"is_if_exists"	INTEGER NOT NULL,
	"is_ignore_delete_triggers"	INTEGER NOT NULL,
	"is_immediate"	INTEGER NOT NULL,
	"is_only"	INTEGER NOT NULL,
	"is_partition_all"	INTEGER NOT NULL,
	"is_purge_snapshot_log"	INTEGER NOT NULL,
	"is_restrict_when_delete_triggers"	INTEGER NOT NULL,
	"is_reuse_storage"	INTEGER NOT NULL,
	"restart_identity"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "sql_unary_expr";
CREATE TABLE IF NOT EXISTS "sql_unary_expr" (
	"oid"	INTEGER NOT NULL,
	"expr_oid"	INTEGER NOT NULL,
	"operator"	TEXT NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "sql_union_data_type";
CREATE TABLE IF NOT EXISTS "sql_union_data_type" (
	"oid"	INTEGER NOT NULL,
	"name"	TEXT NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "sql_union_query";
CREATE TABLE IF NOT EXISTS "sql_union_query" (
	"oid"	INTEGER NOT NULL,
	"first_query_block_oid"	INTEGER NOT NULL,
	"is_empty"	INTEGER NOT NULL,
	"left_oid"	INTEGER NOT NULL,
	"limit_oid"	INTEGER NOT NULL,
	"operator"	TEXT NOT NULL,
	"order_by_oid"	INTEGER NOT NULL,
	"right_oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "sql_union_query_table_source";
CREATE TABLE IF NOT EXISTS "sql_union_query_table_source" (
	"oid"	INTEGER NOT NULL,
	"union_oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "sql_unique";
CREATE TABLE IF NOT EXISTS "sql_unique" (
	"oid"	INTEGER NOT NULL,
	"comment_oid"	INTEGER NOT NULL,
	"index_definition_oid"	INTEGER NOT NULL,
	"name_oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "sql_unnest_table_source";
CREATE TABLE IF NOT EXISTS "sql_unnest_table_source" (
	"oid"	INTEGER NOT NULL,
	"is_ordinality"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "sql_update_set_item";
CREATE TABLE IF NOT EXISTS "sql_update_set_item" (
	"oid"	INTEGER NOT NULL,
	"column_oid"	INTEGER NOT NULL,
	"value_oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "sql_update_statement";
CREATE TABLE IF NOT EXISTS "sql_update_statement" (
	"oid"	INTEGER NOT NULL,
	"from_oid"	INTEGER NOT NULL,
	"order_by_oid"	INTEGER NOT NULL,
	"table_name_oid"	INTEGER NOT NULL,
	"table_source_oid"	INTEGER NOT NULL,
	"where_oid"	INTEGER NOT NULL,
	"with_oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "sql_use_statement";
CREATE TABLE IF NOT EXISTS "sql_use_statement" (
	"oid"	INTEGER NOT NULL,
	"database_oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "sql_values_expr";
CREATE TABLE IF NOT EXISTS "sql_values_expr" (
	"oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "sql_values_query";
CREATE TABLE IF NOT EXISTS "sql_values_query" (
	"oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "sql_values_table_source";
CREATE TABLE IF NOT EXISTS "sql_values_table_source" (
	"oid"	INTEGER NOT NULL,
	"is_parenthesized"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "sql_variant_ref_expr";
CREATE TABLE IF NOT EXISTS "sql_variant_ref_expr" (
	"oid"	INTEGER NOT NULL,
	"index"	INTEGER NOT NULL,
	"is_global"	INTEGER NOT NULL,
	"is_session"	INTEGER NOT NULL,
	"name"	TEXT NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "sql_while_statement";
CREATE TABLE IF NOT EXISTS "sql_while_statement" (
	"oid"	INTEGER NOT NULL,
	"condition_oid"	INTEGER NOT NULL,
	"label_name"	TEXT NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "sql_whoami_statement";
CREATE TABLE IF NOT EXISTS "sql_whoami_statement" (
	"oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "sql_window";
CREATE TABLE IF NOT EXISTS "sql_window" (
	"oid"	INTEGER NOT NULL,
	"name_oid"	INTEGER NOT NULL,
	"over_oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "sql_with_subquery_clause";
CREATE TABLE IF NOT EXISTS "sql_with_subquery_clause" (
	"oid"	INTEGER NOT NULL,
	"entries"	TEXT NOT NULL,
	"recursive"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "sqljson_expr";
CREATE TABLE IF NOT EXISTS "sqljson_expr" (
	"oid"	INTEGER NOT NULL,
	"literal"	TEXT NOT NULL,
	"value"	TEXT NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "sqln_char_expr";
CREATE TABLE IF NOT EXISTS "sqln_char_expr" (
	"oid"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

DROP TABLE IF EXISTS "sqlz_order_by";
CREATE TABLE IF NOT EXISTS "sqlz_order_by" (
	"oid"	INTEGER NOT NULL,
	"is_sibings"	INTEGER NOT NULL,
	PRIMARY KEY("oid")
);

