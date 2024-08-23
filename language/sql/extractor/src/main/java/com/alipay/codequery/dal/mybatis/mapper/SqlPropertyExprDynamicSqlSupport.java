package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SqlPropertyExprDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_property_expr")
    public static final SqlPropertyExpr sqlPropertyExpr = new SqlPropertyExpr();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_property_expr.oid")
    public static final SqlColumn<Long> oid = sqlPropertyExpr.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_property_expr.name")
    public static final SqlColumn<String> name = sqlPropertyExpr.name;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_property_expr.owner_oid")
    public static final SqlColumn<Long> ownerOid = sqlPropertyExpr.ownerOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_property_expr.owner_name")
    public static final SqlColumn<String> ownerName = sqlPropertyExpr.ownerName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_property_expr.resolved_column_oid")
    public static final SqlColumn<Long> resolvedColumnOid = sqlPropertyExpr.resolvedColumnOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_property_expr.resolved_owner_object")
    public static final SqlColumn<String> resolvedOwnerObject = sqlPropertyExpr.resolvedOwnerObject;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_property_expr.resolved_procudure_oid")
    public static final SqlColumn<Long> resolvedProcudureOid = sqlPropertyExpr.resolvedProcudureOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_property_expr.resolved_table_source_oid")
    public static final SqlColumn<Long> resolvedTableSourceOid = sqlPropertyExpr.resolvedTableSourceOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_property_expr.simple_name")
    public static final SqlColumn<String> simpleName = sqlPropertyExpr.simpleName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_property_expr")
    public static final class SqlPropertyExpr extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<String> name = column("`name`", JDBCType.VARCHAR);

        public final SqlColumn<Long> ownerOid = column("`owner_oid`", JDBCType.BIGINT);

        public final SqlColumn<String> ownerName = column("`owner_name`", JDBCType.VARCHAR);

        public final SqlColumn<Long> resolvedColumnOid = column("`resolved_column_oid`", JDBCType.BIGINT);

        public final SqlColumn<String> resolvedOwnerObject = column("`resolved_owner_object`", JDBCType.VARCHAR);

        public final SqlColumn<Long> resolvedProcudureOid = column("`resolved_procudure_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> resolvedTableSourceOid = column("`resolved_table_source_oid`", JDBCType.BIGINT);

        public final SqlColumn<String> simpleName = column("`simple_name`", JDBCType.VARCHAR);

        public SqlPropertyExpr() {
            super("sql_property_expr");
        }
    }
}