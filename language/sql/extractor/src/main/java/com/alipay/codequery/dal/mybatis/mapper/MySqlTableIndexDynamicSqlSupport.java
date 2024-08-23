package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class MySqlTableIndexDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_table_index")
    public static final MySqlTableIndex mySqlTableIndex = new MySqlTableIndex();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_table_index.oid")
    public static final SqlColumn<Long> oid = mySqlTableIndex.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_table_index.algorithm")
    public static final SqlColumn<String> algorithm = mySqlTableIndex.algorithm;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_table_index.analyzer_name_oid")
    public static final SqlColumn<Long> analyzerNameOid = mySqlTableIndex.analyzerNameOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_table_index.comment_oid")
    public static final SqlColumn<Long> commentOid = mySqlTableIndex.commentOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_table_index.db_partition_by_oid")
    public static final SqlColumn<Long> dbPartitionByOid = mySqlTableIndex.dbPartitionByOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_table_index.distance_measure")
    public static final SqlColumn<String> distanceMeasure = mySqlTableIndex.distanceMeasure;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_table_index.index_analyzer_name_oid")
    public static final SqlColumn<Long> indexAnalyzerNameOid = mySqlTableIndex.indexAnalyzerNameOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_table_index.index_definition_oid")
    public static final SqlColumn<Long> indexDefinitionOid = mySqlTableIndex.indexDefinitionOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_table_index.index_type")
    public static final SqlColumn<String> indexType = mySqlTableIndex.indexType;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_table_index.is_global")
    public static final SqlColumn<Integer> isGlobal = mySqlTableIndex.isGlobal;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_table_index.is_local")
    public static final SqlColumn<Integer> isLocal = mySqlTableIndex.isLocal;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_table_index.name_oid")
    public static final SqlColumn<Long> nameOid = mySqlTableIndex.nameOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_table_index.query_analyzer_name_oid")
    public static final SqlColumn<Long> queryAnalyzerNameOid = mySqlTableIndex.queryAnalyzerNameOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_table_index.table_partition_by_oid")
    public static final SqlColumn<Long> tablePartitionByOid = mySqlTableIndex.tablePartitionByOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_table_index.table_partitions_oid")
    public static final SqlColumn<Long> tablePartitionsOid = mySqlTableIndex.tablePartitionsOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_table_index.with_dic_name_oid")
    public static final SqlColumn<Long> withDicNameOid = mySqlTableIndex.withDicNameOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_table_index")
    public static final class MySqlTableIndex extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<String> algorithm = column("`algorithm`", JDBCType.VARCHAR);

        public final SqlColumn<Long> analyzerNameOid = column("`analyzer_name_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> commentOid = column("`comment_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> dbPartitionByOid = column("`db_partition_by_oid`", JDBCType.BIGINT);

        public final SqlColumn<String> distanceMeasure = column("`distance_measure`", JDBCType.VARCHAR);

        public final SqlColumn<Long> indexAnalyzerNameOid = column("`index_analyzer_name_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> indexDefinitionOid = column("`index_definition_oid`", JDBCType.BIGINT);

        public final SqlColumn<String> indexType = column("`index_type`", JDBCType.VARCHAR);

        public final SqlColumn<Integer> isGlobal = column("`is_global`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isLocal = column("`is_local`", JDBCType.BIGINT);

        public final SqlColumn<Long> nameOid = column("`name_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> queryAnalyzerNameOid = column("`query_analyzer_name_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> tablePartitionByOid = column("`table_partition_by_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> tablePartitionsOid = column("`table_partitions_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> withDicNameOid = column("`with_dic_name_oid`", JDBCType.BIGINT);

        public MySqlTableIndex() {
            super("my_sql_table_index");
        }
    }
}