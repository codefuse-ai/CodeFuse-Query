package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SqlCreateIndexStatementDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_create_index_statement")
    public static final SqlCreateIndexStatement sqlCreateIndexStatement = new SqlCreateIndexStatement();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_index_statement.oid")
    public static final SqlColumn<Long> oid = sqlCreateIndexStatement.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_index_statement.comment_oid")
    public static final SqlColumn<Long> commentOid = sqlCreateIndexStatement.commentOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_index_statement.db_partition_by_oid")
    public static final SqlColumn<Long> dbPartitionByOid = sqlCreateIndexStatement.dbPartitionByOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_index_statement.in_oid")
    public static final SqlColumn<Long> inOid = sqlCreateIndexStatement.inOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_index_statement.index_definition_oid")
    public static final SqlColumn<Long> indexDefinitionOid = sqlCreateIndexStatement.indexDefinitionOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_index_statement.is_concurrently")
    public static final SqlColumn<Integer> isConcurrently = sqlCreateIndexStatement.isConcurrently;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_index_statement.is_defered_rebuild")
    public static final SqlColumn<Integer> isDeferedRebuild = sqlCreateIndexStatement.isDeferedRebuild;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_index_statement.is_global")
    public static final SqlColumn<Integer> isGlobal = sqlCreateIndexStatement.isGlobal;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_index_statement.is_if_not_exists")
    public static final SqlColumn<Integer> isIfNotExists = sqlCreateIndexStatement.isIfNotExists;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_index_statement.is_local")
    public static final SqlColumn<Integer> isLocal = sqlCreateIndexStatement.isLocal;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_index_statement.is_storing")
    public static final SqlColumn<Integer> isStoring = sqlCreateIndexStatement.isStoring;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_index_statement.name_oid")
    public static final SqlColumn<Long> nameOid = sqlCreateIndexStatement.nameOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_index_statement.row_format_oid")
    public static final SqlColumn<Long> rowFormatOid = sqlCreateIndexStatement.rowFormatOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_index_statement.schema")
    public static final SqlColumn<String> schema = sqlCreateIndexStatement.schema;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_index_statement.stored_as_oid")
    public static final SqlColumn<Long> storedAsOid = sqlCreateIndexStatement.storedAsOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_index_statement.table_oid")
    public static final SqlColumn<Long> tableOid = sqlCreateIndexStatement.tableOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_index_statement.table_name")
    public static final SqlColumn<String> tableName = sqlCreateIndexStatement.tableName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_index_statement.table_partition_by_oid")
    public static final SqlColumn<Long> tablePartitionByOid = sqlCreateIndexStatement.tablePartitionByOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_index_statement.table_partitions_oid")
    public static final SqlColumn<Long> tablePartitionsOid = sqlCreateIndexStatement.tablePartitionsOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_index_statement.tablespace_oid")
    public static final SqlColumn<Long> tablespaceOid = sqlCreateIndexStatement.tablespaceOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_index_statement.type")
    public static final SqlColumn<String> type = sqlCreateIndexStatement.type;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_index_statement.using")
    public static final SqlColumn<String> using = sqlCreateIndexStatement.using;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_create_index_statement")
    public static final class SqlCreateIndexStatement extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> commentOid = column("`comment_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> dbPartitionByOid = column("`db_partition_by_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> inOid = column("`in_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> indexDefinitionOid = column("`index_definition_oid`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isConcurrently = column("`is_concurrently`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isDeferedRebuild = column("`is_defered_rebuild`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isGlobal = column("`is_global`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isIfNotExists = column("`is_if_not_exists`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isLocal = column("`is_local`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isStoring = column("`is_storing`", JDBCType.BIGINT);

        public final SqlColumn<Long> nameOid = column("`name_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> rowFormatOid = column("`row_format_oid`", JDBCType.BIGINT);

        public final SqlColumn<String> schema = column("`schema`", JDBCType.VARCHAR);

        public final SqlColumn<Long> storedAsOid = column("`stored_as_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> tableOid = column("`table_oid`", JDBCType.BIGINT);

        public final SqlColumn<String> tableName = column("`table_name`", JDBCType.VARCHAR);

        public final SqlColumn<Long> tablePartitionByOid = column("`table_partition_by_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> tablePartitionsOid = column("`table_partitions_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> tablespaceOid = column("`tablespace_oid`", JDBCType.BIGINT);

        public final SqlColumn<String> type = column("`type`", JDBCType.VARCHAR);

        public final SqlColumn<String> using = column("`using`", JDBCType.VARCHAR);

        public SqlCreateIndexStatement() {
            super("sql_create_index_statement");
        }
    }
}