package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class MySqlLoadDataInFileStatementDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_load_data_in_file_statement")
    public static final MySqlLoadDataInFileStatement mySqlLoadDataInFileStatement = new MySqlLoadDataInFileStatement();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_load_data_in_file_statement.oid")
    public static final SqlColumn<Long> oid = mySqlLoadDataInFileStatement.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_load_data_in_file_statement.charset")
    public static final SqlColumn<String> charset = mySqlLoadDataInFileStatement.charset;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_load_data_in_file_statement.columns_enclosed_by_oid")
    public static final SqlColumn<Long> columnsEnclosedByOid = mySqlLoadDataInFileStatement.columnsEnclosedByOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_load_data_in_file_statement.columns_escaped_oid")
    public static final SqlColumn<Long> columnsEscapedOid = mySqlLoadDataInFileStatement.columnsEscapedOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_load_data_in_file_statement.columns_terminated_by_oid")
    public static final SqlColumn<Long> columnsTerminatedByOid = mySqlLoadDataInFileStatement.columnsTerminatedByOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_load_data_in_file_statement.file_name_oid")
    public static final SqlColumn<Long> fileNameOid = mySqlLoadDataInFileStatement.fileNameOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_load_data_in_file_statement.ignore_lines_number_oid")
    public static final SqlColumn<Long> ignoreLinesNumberOid = mySqlLoadDataInFileStatement.ignoreLinesNumberOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_load_data_in_file_statement.is_columns_enclosed_optionally")
    public static final SqlColumn<Integer> isColumnsEnclosedOptionally = mySqlLoadDataInFileStatement.isColumnsEnclosedOptionally;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_load_data_in_file_statement.is_concurrent")
    public static final SqlColumn<Integer> isConcurrent = mySqlLoadDataInFileStatement.isConcurrent;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_load_data_in_file_statement.is_ignore")
    public static final SqlColumn<Integer> isIgnore = mySqlLoadDataInFileStatement.isIgnore;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_load_data_in_file_statement.is_local")
    public static final SqlColumn<Integer> isLocal = mySqlLoadDataInFileStatement.isLocal;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_load_data_in_file_statement.is_low_priority")
    public static final SqlColumn<Integer> isLowPriority = mySqlLoadDataInFileStatement.isLowPriority;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_load_data_in_file_statement.is_replicate")
    public static final SqlColumn<Integer> isReplicate = mySqlLoadDataInFileStatement.isReplicate;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_load_data_in_file_statement.lines_starting_by_oid")
    public static final SqlColumn<Long> linesStartingByOid = mySqlLoadDataInFileStatement.linesStartingByOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_load_data_in_file_statement.lines_terminated_by_oid")
    public static final SqlColumn<Long> linesTerminatedByOid = mySqlLoadDataInFileStatement.linesTerminatedByOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_load_data_in_file_statement.table_name_oid")
    public static final SqlColumn<Long> tableNameOid = mySqlLoadDataInFileStatement.tableNameOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_load_data_in_file_statement")
    public static final class MySqlLoadDataInFileStatement extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<String> charset = column("`charset`", JDBCType.VARCHAR);

        public final SqlColumn<Long> columnsEnclosedByOid = column("`columns_enclosed_by_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> columnsEscapedOid = column("`columns_escaped_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> columnsTerminatedByOid = column("`columns_terminated_by_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> fileNameOid = column("`file_name_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> ignoreLinesNumberOid = column("`ignore_lines_number_oid`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isColumnsEnclosedOptionally = column("`is_columns_enclosed_optionally`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isConcurrent = column("`is_concurrent`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isIgnore = column("`is_ignore`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isLocal = column("`is_local`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isLowPriority = column("`is_low_priority`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isReplicate = column("`is_replicate`", JDBCType.BIGINT);

        public final SqlColumn<Long> linesStartingByOid = column("`lines_starting_by_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> linesTerminatedByOid = column("`lines_terminated_by_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> tableNameOid = column("`table_name_oid`", JDBCType.BIGINT);

        public MySqlLoadDataInFileStatement() {
            super("my_sql_load_data_in_file_statement");
        }
    }
}