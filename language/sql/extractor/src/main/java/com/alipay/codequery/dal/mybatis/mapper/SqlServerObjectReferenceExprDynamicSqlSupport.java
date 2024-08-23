package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SqlServerObjectReferenceExprDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_server_object_reference_expr")
    public static final SqlServerObjectReferenceExpr sqlServerObjectReferenceExpr = new SqlServerObjectReferenceExpr();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_server_object_reference_expr.oid")
    public static final SqlColumn<Long> oid = sqlServerObjectReferenceExpr.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_server_object_reference_expr.database")
    public static final SqlColumn<String> database = sqlServerObjectReferenceExpr.database;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_server_object_reference_expr.resolved_column_oid")
    public static final SqlColumn<Long> resolvedColumnOid = sqlServerObjectReferenceExpr.resolvedColumnOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_server_object_reference_expr.schema")
    public static final SqlColumn<String> schema = sqlServerObjectReferenceExpr.schema;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_server_object_reference_expr.server")
    public static final SqlColumn<String> server = sqlServerObjectReferenceExpr.server;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_server_object_reference_expr.simple_name")
    public static final SqlColumn<String> simpleName = sqlServerObjectReferenceExpr.simpleName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_server_object_reference_expr")
    public static final class SqlServerObjectReferenceExpr extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<String> database = column("`database`", JDBCType.VARCHAR);

        public final SqlColumn<Long> resolvedColumnOid = column("`resolved_column_oid`", JDBCType.BIGINT);

        public final SqlColumn<String> schema = column("`schema`", JDBCType.VARCHAR);

        public final SqlColumn<String> server = column("`server`", JDBCType.VARCHAR);

        public final SqlColumn<String> simpleName = column("`simple_name`", JDBCType.VARCHAR);

        public SqlServerObjectReferenceExpr() {
            super("sql_server_object_reference_expr");
        }
    }
}