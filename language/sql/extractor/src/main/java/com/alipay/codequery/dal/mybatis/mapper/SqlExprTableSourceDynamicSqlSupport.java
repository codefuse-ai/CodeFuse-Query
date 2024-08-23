package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SqlExprTableSourceDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_expr_table_source")
    public static final SqlExprTableSource sqlExprTableSource = new SqlExprTableSource();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_expr_table_source.oid")
    public static final SqlColumn<Long> oid = sqlExprTableSource.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_expr_table_source.catalog")
    public static final SqlColumn<String> catalog = sqlExprTableSource.catalog;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_expr_table_source.expr_oid")
    public static final SqlColumn<Long> exprOid = sqlExprTableSource.exprOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_expr_table_source.name_oid")
    public static final SqlColumn<Long> nameOid = sqlExprTableSource.nameOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_expr_table_source.partition_size")
    public static final SqlColumn<Integer> partitionSize = sqlExprTableSource.partitionSize;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_expr_table_source.sampling_oid")
    public static final SqlColumn<Long> samplingOid = sqlExprTableSource.samplingOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_expr_table_source.schema")
    public static final SqlColumn<String> schema = sqlExprTableSource.schema;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_expr_table_source.schema_object")
    public static final SqlColumn<String> schemaObject = sqlExprTableSource.schemaObject;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_expr_table_source.table_name")
    public static final SqlColumn<String> tableName = sqlExprTableSource.tableName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_expr_table_source")
    public static final class SqlExprTableSource extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<String> catalog = column("`catalog`", JDBCType.VARCHAR);

        public final SqlColumn<Long> exprOid = column("`expr_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> nameOid = column("`name_oid`", JDBCType.BIGINT);

        public final SqlColumn<Integer> partitionSize = column("`partition_size`", JDBCType.BIGINT);

        public final SqlColumn<Long> samplingOid = column("`sampling_oid`", JDBCType.BIGINT);

        public final SqlColumn<String> schema = column("`schema`", JDBCType.VARCHAR);

        public final SqlColumn<String> schemaObject = column("`schema_object`", JDBCType.VARCHAR);

        public final SqlColumn<String> tableName = column("`table_name`", JDBCType.VARCHAR);

        public SqlExprTableSource() {
            super("sql_expr_table_source");
        }
    }
}