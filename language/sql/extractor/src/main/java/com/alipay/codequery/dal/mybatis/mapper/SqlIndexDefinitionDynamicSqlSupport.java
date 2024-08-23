package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SqlIndexDefinitionDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_index_definition")
    public static final SqlIndexDefinition sqlIndexDefinition = new SqlIndexDefinition();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_index_definition.oid")
    public static final SqlColumn<Long> oid = sqlIndexDefinition.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_index_definition.algorithm")
    public static final SqlColumn<String> algorithm = sqlIndexDefinition.algorithm;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_index_definition.analyzer_name_oid")
    public static final SqlColumn<Long> analyzerNameOid = sqlIndexDefinition.analyzerNameOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_index_definition.db_partition_by_oid")
    public static final SqlColumn<Long> dbPartitionByOid = sqlIndexDefinition.dbPartitionByOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_index_definition.distance_measure")
    public static final SqlColumn<String> distanceMeasure = sqlIndexDefinition.distanceMeasure;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_index_definition.index_analyzer_name_oid")
    public static final SqlColumn<Long> indexAnalyzerNameOid = sqlIndexDefinition.indexAnalyzerNameOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_index_definition.is_global")
    public static final SqlColumn<Integer> isGlobal = sqlIndexDefinition.isGlobal;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_index_definition.is_hash_map_type")
    public static final SqlColumn<Integer> isHashMapType = sqlIndexDefinition.isHashMapType;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_index_definition.is_hash_type")
    public static final SqlColumn<Integer> isHashType = sqlIndexDefinition.isHashType;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_index_definition.is_index")
    public static final SqlColumn<Integer> isIndex = sqlIndexDefinition.isIndex;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_index_definition.is_key")
    public static final SqlColumn<Integer> isKey = sqlIndexDefinition.isKey;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_index_definition.is_local")
    public static final SqlColumn<Integer> isLocal = sqlIndexDefinition.isLocal;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_index_definition.name_oid")
    public static final SqlColumn<Long> nameOid = sqlIndexDefinition.nameOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_index_definition.options_oid")
    public static final SqlColumn<Long> optionsOid = sqlIndexDefinition.optionsOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_index_definition.query_analyzer_name_oid")
    public static final SqlColumn<Long> queryAnalyzerNameOid = sqlIndexDefinition.queryAnalyzerNameOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_index_definition.symbol_oid")
    public static final SqlColumn<Long> symbolOid = sqlIndexDefinition.symbolOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_index_definition.table_oid")
    public static final SqlColumn<Long> tableOid = sqlIndexDefinition.tableOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_index_definition.tb_partition_by_oid")
    public static final SqlColumn<Long> tbPartitionByOid = sqlIndexDefinition.tbPartitionByOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_index_definition.tb_partitions_oid")
    public static final SqlColumn<Long> tbPartitionsOid = sqlIndexDefinition.tbPartitionsOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_index_definition.type")
    public static final SqlColumn<String> type = sqlIndexDefinition.type;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_index_definition.with_dic_name_oid")
    public static final SqlColumn<Long> withDicNameOid = sqlIndexDefinition.withDicNameOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_index_definition")
    public static final class SqlIndexDefinition extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<String> algorithm = column("`algorithm`", JDBCType.VARCHAR);

        public final SqlColumn<Long> analyzerNameOid = column("`analyzer_name_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> dbPartitionByOid = column("`db_partition_by_oid`", JDBCType.BIGINT);

        public final SqlColumn<String> distanceMeasure = column("`distance_measure`", JDBCType.VARCHAR);

        public final SqlColumn<Long> indexAnalyzerNameOid = column("`index_analyzer_name_oid`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isGlobal = column("`is_global`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isHashMapType = column("`is_hash_map_type`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isHashType = column("`is_hash_type`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isIndex = column("`is_index`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isKey = column("`is_key`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isLocal = column("`is_local`", JDBCType.BIGINT);

        public final SqlColumn<Long> nameOid = column("`name_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> optionsOid = column("`options_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> queryAnalyzerNameOid = column("`query_analyzer_name_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> symbolOid = column("`symbol_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> tableOid = column("`table_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> tbPartitionByOid = column("`tb_partition_by_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> tbPartitionsOid = column("`tb_partitions_oid`", JDBCType.BIGINT);

        public final SqlColumn<String> type = column("`type`", JDBCType.VARCHAR);

        public final SqlColumn<Long> withDicNameOid = column("`with_dic_name_oid`", JDBCType.BIGINT);

        public SqlIndexDefinition() {
            super("sql_index_definition");
        }
    }
}