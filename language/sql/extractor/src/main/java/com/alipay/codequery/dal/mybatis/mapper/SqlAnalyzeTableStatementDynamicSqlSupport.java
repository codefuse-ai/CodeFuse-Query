package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SqlAnalyzeTableStatementDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_analyze_table_statement")
    public static final SqlAnalyzeTableStatement sqlAnalyzeTableStatement = new SqlAnalyzeTableStatement();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_analyze_table_statement.oid")
    public static final SqlColumn<Long> oid = sqlAnalyzeTableStatement.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_analyze_table_statement.adb_schema_oid")
    public static final SqlColumn<Long> adbSchemaOid = sqlAnalyzeTableStatement.adbSchemaOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_analyze_table_statement.adb_where_oid")
    public static final SqlColumn<Long> adbWhereOid = sqlAnalyzeTableStatement.adbWhereOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_analyze_table_statement.is_cache_metadata")
    public static final SqlColumn<Integer> isCacheMetadata = sqlAnalyzeTableStatement.isCacheMetadata;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_analyze_table_statement.is_compute_statistics")
    public static final SqlColumn<Integer> isComputeStatistics = sqlAnalyzeTableStatement.isComputeStatistics;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_analyze_table_statement.is_for_colums")
    public static final SqlColumn<Integer> isForColums = sqlAnalyzeTableStatement.isForColums;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_analyze_table_statement.is_noscan")
    public static final SqlColumn<Integer> isNoscan = sqlAnalyzeTableStatement.isNoscan;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_analyze_table_statement.partition_oid")
    public static final SqlColumn<Long> partitionOid = sqlAnalyzeTableStatement.partitionOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_analyze_table_statement.table_oid")
    public static final SqlColumn<Long> tableOid = sqlAnalyzeTableStatement.tableOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_analyze_table_statement")
    public static final class SqlAnalyzeTableStatement extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> adbSchemaOid = column("`adb_schema_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> adbWhereOid = column("`adb_where_oid`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isCacheMetadata = column("`is_cache_metadata`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isComputeStatistics = column("`is_compute_statistics`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isForColums = column("`is_for_colums`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isNoscan = column("`is_noscan`", JDBCType.BIGINT);

        public final SqlColumn<Long> partitionOid = column("`partition_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> tableOid = column("`table_oid`", JDBCType.BIGINT);

        public SqlAnalyzeTableStatement() {
            super("sql_analyze_table_statement");
        }
    }
}