package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SqlAlterTableAddIndexDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_table_add_index")
    public static final SqlAlterTableAddIndex sqlAlterTableAddIndex = new SqlAlterTableAddIndex();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_table_add_index.oid")
    public static final SqlColumn<Long> oid = sqlAlterTableAddIndex.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_table_add_index.algorithm")
    public static final SqlColumn<String> algorithm = sqlAlterTableAddIndex.algorithm;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_table_add_index.comment_oid")
    public static final SqlColumn<Long> commentOid = sqlAlterTableAddIndex.commentOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_table_add_index.db_partition_by_oid")
    public static final SqlColumn<Long> dbPartitionByOid = sqlAlterTableAddIndex.dbPartitionByOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_table_add_index.distance_measure")
    public static final SqlColumn<String> distanceMeasure = sqlAlterTableAddIndex.distanceMeasure;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_table_add_index.index_definition_oid")
    public static final SqlColumn<Long> indexDefinitionOid = sqlAlterTableAddIndex.indexDefinitionOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_table_add_index.is_global")
    public static final SqlColumn<Integer> isGlobal = sqlAlterTableAddIndex.isGlobal;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_table_add_index.is_hash_map_type")
    public static final SqlColumn<Integer> isHashMapType = sqlAlterTableAddIndex.isHashMapType;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_table_add_index.is_key")
    public static final SqlColumn<Integer> isKey = sqlAlterTableAddIndex.isKey;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_table_add_index.is_unique")
    public static final SqlColumn<Integer> isUnique = sqlAlterTableAddIndex.isUnique;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_table_add_index.key_block_size_oid")
    public static final SqlColumn<Long> keyBlockSizeOid = sqlAlterTableAddIndex.keyBlockSizeOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_table_add_index.name_oid")
    public static final SqlColumn<Long> nameOid = sqlAlterTableAddIndex.nameOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_table_add_index.parser_name")
    public static final SqlColumn<String> parserName = sqlAlterTableAddIndex.parserName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_table_add_index.table_partition_by_oid")
    public static final SqlColumn<Long> tablePartitionByOid = sqlAlterTableAddIndex.tablePartitionByOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_table_add_index.table_partitions_oid")
    public static final SqlColumn<Long> tablePartitionsOid = sqlAlterTableAddIndex.tablePartitionsOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_table_add_index.type")
    public static final SqlColumn<String> type = sqlAlterTableAddIndex.type;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_table_add_index.using")
    public static final SqlColumn<String> using = sqlAlterTableAddIndex.using;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_table_add_index")
    public static final class SqlAlterTableAddIndex extends SqlTable {
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

        public SqlAlterTableAddIndex() {
            super("sql_alter_table_add_index");
        }
    }
}