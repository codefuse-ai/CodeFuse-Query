package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SqlCreateTableStatementDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_create_table_statement")
    public static final SqlCreateTableStatement sqlCreateTableStatement = new SqlCreateTableStatement();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_table_statement.oid")
    public static final SqlColumn<Long> oid = sqlCreateTableStatement.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_table_statement.body_before_comments_direct")
    public static final SqlColumn<String> bodyBeforeCommentsDirect = sqlCreateTableStatement.bodyBeforeCommentsDirect;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_table_statement.buckets")
    public static final SqlColumn<Integer> buckets = sqlCreateTableStatement.buckets;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_table_statement.catalog")
    public static final SqlColumn<String> catalog = sqlCreateTableStatement.catalog;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_table_statement.clustering_type")
    public static final SqlColumn<String> clusteringType = sqlCreateTableStatement.clusteringType;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_table_statement.column_comments")
    public static final SqlColumn<String> columnComments = sqlCreateTableStatement.columnComments;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_table_statement.comment_oid")
    public static final SqlColumn<Long> commentOid = sqlCreateTableStatement.commentOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_table_statement.compress")
    public static final SqlColumn<Integer> compress = sqlCreateTableStatement.compress;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_table_statement.engine_oid")
    public static final SqlColumn<Long> engineOid = sqlCreateTableStatement.engineOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_table_statement.inherits_oid")
    public static final SqlColumn<Long> inheritsOid = sqlCreateTableStatement.inheritsOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_table_statement.is_dimension")
    public static final SqlColumn<Integer> isDimension = sqlCreateTableStatement.isDimension;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_table_statement.is_external")
    public static final SqlColumn<Integer> isExternal = sqlCreateTableStatement.isExternal;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_table_statement.is_if_not_exists")
    public static final SqlColumn<Integer> isIfNotExists = sqlCreateTableStatement.isIfNotExists;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_table_statement.is_ignore")
    public static final SqlColumn<Integer> isIgnore = sqlCreateTableStatement.isIgnore;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_table_statement.is_on_commit_preserve_rows")
    public static final SqlColumn<Integer> isOnCommitPreserveRows = sqlCreateTableStatement.isOnCommitPreserveRows;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_table_statement.is_replace")
    public static final SqlColumn<Integer> isReplace = sqlCreateTableStatement.isReplace;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_table_statement.is_single")
    public static final SqlColumn<Integer> isSingle = sqlCreateTableStatement.isSingle;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_table_statement.like_oid")
    public static final SqlColumn<Long> likeOid = sqlCreateTableStatement.likeOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_table_statement.local_partitioning_oid")
    public static final SqlColumn<Long> localPartitioningOid = sqlCreateTableStatement.localPartitioningOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_table_statement.location_oid")
    public static final SqlColumn<Long> locationOid = sqlCreateTableStatement.locationOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_table_statement.logging")
    public static final SqlColumn<Integer> logging = sqlCreateTableStatement.logging;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_table_statement.name_oid")
    public static final SqlColumn<Long> nameOid = sqlCreateTableStatement.nameOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_table_statement.partitioning_oid")
    public static final SqlColumn<Long> partitioningOid = sqlCreateTableStatement.partitioningOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_table_statement.primary_key_names")
    public static final SqlColumn<String> primaryKeyNames = sqlCreateTableStatement.primaryKeyNames;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_table_statement.row_format_oid")
    public static final SqlColumn<Long> rowFormatOid = sqlCreateTableStatement.rowFormatOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_table_statement.schema")
    public static final SqlColumn<String> schema = sqlCreateTableStatement.schema;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_table_statement.select_oid")
    public static final SqlColumn<Long> selectOid = sqlCreateTableStatement.selectOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_table_statement.shards")
    public static final SqlColumn<Integer> shards = sqlCreateTableStatement.shards;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_table_statement.stored_as_oid")
    public static final SqlColumn<Long> storedAsOid = sqlCreateTableStatement.storedAsOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_table_statement.table_name")
    public static final SqlColumn<String> tableName = sqlCreateTableStatement.tableName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_table_statement.table_source_oid")
    public static final SqlColumn<Long> tableSourceOid = sqlCreateTableStatement.tableSourceOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_table_statement.tablespace_oid")
    public static final SqlColumn<Long> tablespaceOid = sqlCreateTableStatement.tablespaceOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_table_statement.type")
    public static final SqlColumn<String> type = sqlCreateTableStatement.type;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_create_table_statement")
    public static final class SqlCreateTableStatement extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<String> bodyBeforeCommentsDirect = column("`body_before_comments_direct`", JDBCType.VARCHAR);

        public final SqlColumn<Integer> buckets = column("`buckets`", JDBCType.BIGINT);

        public final SqlColumn<String> catalog = column("`catalog`", JDBCType.VARCHAR);

        public final SqlColumn<String> clusteringType = column("`clustering_type`", JDBCType.VARCHAR);

        public final SqlColumn<String> columnComments = column("`column_comments`", JDBCType.VARCHAR);

        public final SqlColumn<Long> commentOid = column("`comment_oid`", JDBCType.BIGINT);

        public final SqlColumn<Integer> compress = column("`compress`", JDBCType.BIGINT);

        public final SqlColumn<Long> engineOid = column("`engine_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> inheritsOid = column("`inherits_oid`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isDimension = column("`is_dimension`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isExternal = column("`is_external`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isIfNotExists = column("`is_if_not_exists`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isIgnore = column("`is_ignore`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isOnCommitPreserveRows = column("`is_on_commit_preserve_rows`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isReplace = column("`is_replace`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isSingle = column("`is_single`", JDBCType.BIGINT);

        public final SqlColumn<Long> likeOid = column("`like_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> localPartitioningOid = column("`local_partitioning_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> locationOid = column("`location_oid`", JDBCType.BIGINT);

        public final SqlColumn<Integer> logging = column("`logging`", JDBCType.BIGINT);

        public final SqlColumn<Long> nameOid = column("`name_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> partitioningOid = column("`partitioning_oid`", JDBCType.BIGINT);

        public final SqlColumn<String> primaryKeyNames = column("`primary_key_names`", JDBCType.VARCHAR);

        public final SqlColumn<Long> rowFormatOid = column("`row_format_oid`", JDBCType.BIGINT);

        public final SqlColumn<String> schema = column("`schema`", JDBCType.VARCHAR);

        public final SqlColumn<Long> selectOid = column("`select_oid`", JDBCType.BIGINT);

        public final SqlColumn<Integer> shards = column("`shards`", JDBCType.BIGINT);

        public final SqlColumn<Long> storedAsOid = column("`stored_as_oid`", JDBCType.BIGINT);

        public final SqlColumn<String> tableName = column("`table_name`", JDBCType.VARCHAR);

        public final SqlColumn<Long> tableSourceOid = column("`table_source_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> tablespaceOid = column("`tablespace_oid`", JDBCType.BIGINT);

        public final SqlColumn<String> type = column("`type`", JDBCType.VARCHAR);

        public SqlCreateTableStatement() {
            super("sql_create_table_statement");
        }
    }
}