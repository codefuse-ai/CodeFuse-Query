package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SqlAlterTableStatementDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_table_statement")
    public static final SqlAlterTableStatement sqlAlterTableStatement = new SqlAlterTableStatement();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_table_statement.oid")
    public static final SqlColumn<Long> oid = sqlAlterTableStatement.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_table_statement.buckets")
    public static final SqlColumn<Integer> buckets = sqlAlterTableStatement.buckets;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_table_statement.is_if_exists")
    public static final SqlColumn<Integer> isIfExists = sqlAlterTableStatement.isIfExists;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_table_statement.is_ignore")
    public static final SqlColumn<Integer> isIgnore = sqlAlterTableStatement.isIgnore;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_table_statement.is_invalidate_global_indexes")
    public static final SqlColumn<Integer> isInvalidateGlobalIndexes = sqlAlterTableStatement.isInvalidateGlobalIndexes;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_table_statement.is_merge_small_files")
    public static final SqlColumn<Integer> isMergeSmallFiles = sqlAlterTableStatement.isMergeSmallFiles;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_table_statement.is_not_clustered")
    public static final SqlColumn<Integer> isNotClustered = sqlAlterTableStatement.isNotClustered;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_table_statement.is_offline")
    public static final SqlColumn<Integer> isOffline = sqlAlterTableStatement.isOffline;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_table_statement.is_online")
    public static final SqlColumn<Integer> isOnline = sqlAlterTableStatement.isOnline;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_table_statement.is_range")
    public static final SqlColumn<Integer> isRange = sqlAlterTableStatement.isRange;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_table_statement.is_remove_patiting")
    public static final SqlColumn<Integer> isRemovePatiting = sqlAlterTableStatement.isRemovePatiting;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_table_statement.is_update_global_indexes")
    public static final SqlColumn<Integer> isUpdateGlobalIndexes = sqlAlterTableStatement.isUpdateGlobalIndexes;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_table_statement.is_upgrade_patiting")
    public static final SqlColumn<Integer> isUpgradePatiting = sqlAlterTableStatement.isUpgradePatiting;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_table_statement.name_oid")
    public static final SqlColumn<Long> nameOid = sqlAlterTableStatement.nameOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_table_statement.partition_oid")
    public static final SqlColumn<Long> partitionOid = sqlAlterTableStatement.partitionOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_table_statement.schema")
    public static final SqlColumn<String> schema = sqlAlterTableStatement.schema;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_table_statement.shards")
    public static final SqlColumn<Integer> shards = sqlAlterTableStatement.shards;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_table_statement.table_name")
    public static final SqlColumn<String> tableName = sqlAlterTableStatement.tableName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_table_statement.table_source_oid")
    public static final SqlColumn<Long> tableSourceOid = sqlAlterTableStatement.tableSourceOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_table_statement")
    public static final class SqlAlterTableStatement extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Integer> buckets = column("`buckets`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isIfExists = column("`is_if_exists`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isIgnore = column("`is_ignore`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isInvalidateGlobalIndexes = column("`is_invalidate_global_indexes`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isMergeSmallFiles = column("`is_merge_small_files`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isNotClustered = column("`is_not_clustered`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isOffline = column("`is_offline`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isOnline = column("`is_online`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isRange = column("`is_range`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isRemovePatiting = column("`is_remove_patiting`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isUpdateGlobalIndexes = column("`is_update_global_indexes`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isUpgradePatiting = column("`is_upgrade_patiting`", JDBCType.BIGINT);

        public final SqlColumn<Long> nameOid = column("`name_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> partitionOid = column("`partition_oid`", JDBCType.BIGINT);

        public final SqlColumn<String> schema = column("`schema`", JDBCType.VARCHAR);

        public final SqlColumn<Integer> shards = column("`shards`", JDBCType.BIGINT);

        public final SqlColumn<String> tableName = column("`table_name`", JDBCType.VARCHAR);

        public final SqlColumn<Long> tableSourceOid = column("`table_source_oid`", JDBCType.BIGINT);

        public SqlAlterTableStatement() {
            super("sql_alter_table_statement");
        }
    }
}