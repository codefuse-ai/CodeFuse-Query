package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SqlAlterTableAlterIndexDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_table_alter_index")
    public static final SqlAlterTableAlterIndex sqlAlterTableAlterIndex = new SqlAlterTableAlterIndex();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_table_alter_index.oid")
    public static final SqlColumn<Long> oid = sqlAlterTableAlterIndex.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_table_alter_index.algorithm")
    public static final SqlColumn<String> algorithm = sqlAlterTableAlterIndex.algorithm;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_table_alter_index.comment_oid")
    public static final SqlColumn<Long> commentOid = sqlAlterTableAlterIndex.commentOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_table_alter_index.db_partition_by_oid")
    public static final SqlColumn<Long> dbPartitionByOid = sqlAlterTableAlterIndex.dbPartitionByOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_table_alter_index.distance_measure")
    public static final SqlColumn<String> distanceMeasure = sqlAlterTableAlterIndex.distanceMeasure;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_table_alter_index.index_definition_oid")
    public static final SqlColumn<Long> indexDefinitionOid = sqlAlterTableAlterIndex.indexDefinitionOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_table_alter_index.is_global")
    public static final SqlColumn<Integer> isGlobal = sqlAlterTableAlterIndex.isGlobal;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_table_alter_index.is_hash_map_type")
    public static final SqlColumn<Integer> isHashMapType = sqlAlterTableAlterIndex.isHashMapType;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_table_alter_index.is_key")
    public static final SqlColumn<Integer> isKey = sqlAlterTableAlterIndex.isKey;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_table_alter_index.is_unique")
    public static final SqlColumn<Integer> isUnique = sqlAlterTableAlterIndex.isUnique;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_table_alter_index.key_block_size_oid")
    public static final SqlColumn<Long> keyBlockSizeOid = sqlAlterTableAlterIndex.keyBlockSizeOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_table_alter_index.name_oid")
    public static final SqlColumn<Long> nameOid = sqlAlterTableAlterIndex.nameOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_table_alter_index.parser_name")
    public static final SqlColumn<String> parserName = sqlAlterTableAlterIndex.parserName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_table_alter_index.table_partition_by_oid")
    public static final SqlColumn<Long> tablePartitionByOid = sqlAlterTableAlterIndex.tablePartitionByOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_table_alter_index.table_partitions_oid")
    public static final SqlColumn<Long> tablePartitionsOid = sqlAlterTableAlterIndex.tablePartitionsOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_table_alter_index.type")
    public static final SqlColumn<String> type = sqlAlterTableAlterIndex.type;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_table_alter_index.using")
    public static final SqlColumn<String> using = sqlAlterTableAlterIndex.using;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_table_alter_index")
    public static final class SqlAlterTableAlterIndex extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<String> algorithm = column("`algorithm`", JDBCType.VARCHAR);

        public final SqlColumn<Long> commentOid = column("`comment_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> dbPartitionByOid = column("`db_partition_by_oid`", JDBCType.BIGINT);

        public final SqlColumn<String> distanceMeasure = column("`distance_measure`", JDBCType.VARCHAR);

        public final SqlColumn<Long> indexDefinitionOid = column("`index_definition_oid`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isGlobal = column("`is_global`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isHashMapType = column("`is_hash_map_type`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isKey = column("`is_key`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isUnique = column("`is_unique`", JDBCType.BIGINT);

        public final SqlColumn<Long> keyBlockSizeOid = column("`key_block_size_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> nameOid = column("`name_oid`", JDBCType.BIGINT);

        public final SqlColumn<String> parserName = column("`parser_name`", JDBCType.VARCHAR);

        public final SqlColumn<Long> tablePartitionByOid = column("`table_partition_by_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> tablePartitionsOid = column("`table_partitions_oid`", JDBCType.BIGINT);

        public final SqlColumn<String> type = column("`type`", JDBCType.VARCHAR);

        public final SqlColumn<String> using = column("`using`", JDBCType.VARCHAR);

        public SqlAlterTableAlterIndex() {
            super("sql_alter_table_alter_index");
        }
    }
}