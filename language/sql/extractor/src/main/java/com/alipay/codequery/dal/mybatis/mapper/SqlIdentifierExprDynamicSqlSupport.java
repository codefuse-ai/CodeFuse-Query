package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SqlIdentifierExprDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_identifier_expr")
    public static final SqlIdentifierExpr sqlIdentifierExpr = new SqlIdentifierExpr();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_identifier_expr.oid")
    public static final SqlColumn<Long> oid = sqlIdentifierExpr.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_identifier_expr.lower_name")
    public static final SqlColumn<String> lowerName = sqlIdentifierExpr.lowerName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_identifier_expr.name")
    public static final SqlColumn<String> name = sqlIdentifierExpr.name;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_identifier_expr.resolved_column_object")
    public static final SqlColumn<String> resolvedColumnObject = sqlIdentifierExpr.resolvedColumnObject;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_identifier_expr.resolved_column_oid")
    public static final SqlColumn<Long> resolvedColumnOid = sqlIdentifierExpr.resolvedColumnOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_identifier_expr.resolved_declare_item_oid")
    public static final SqlColumn<Long> resolvedDeclareItemOid = sqlIdentifierExpr.resolvedDeclareItemOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_identifier_expr.resolved_owner_object")
    public static final SqlColumn<String> resolvedOwnerObject = sqlIdentifierExpr.resolvedOwnerObject;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_identifier_expr.resolved_parameter_oid")
    public static final SqlColumn<Long> resolvedParameterOid = sqlIdentifierExpr.resolvedParameterOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_identifier_expr.resolved_select_item_oid")
    public static final SqlColumn<Long> resolvedSelectItemOid = sqlIdentifierExpr.resolvedSelectItemOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_identifier_expr.resolved_table_source_oid")
    public static final SqlColumn<Long> resolvedTableSourceOid = sqlIdentifierExpr.resolvedTableSourceOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_identifier_expr.simple_name")
    public static final SqlColumn<String> simpleName = sqlIdentifierExpr.simpleName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_identifier_expr")
    public static final class SqlIdentifierExpr extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<String> lowerName = column("`lower_name`", JDBCType.VARCHAR);

        public final SqlColumn<String> name = column("`name`", JDBCType.VARCHAR);

        public final SqlColumn<String> resolvedColumnObject = column("`resolved_column_object`", JDBCType.VARCHAR);

        public final SqlColumn<Long> resolvedColumnOid = column("`resolved_column_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> resolvedDeclareItemOid = column("`resolved_declare_item_oid`", JDBCType.BIGINT);

        public final SqlColumn<String> resolvedOwnerObject = column("`resolved_owner_object`", JDBCType.VARCHAR);

        public final SqlColumn<Long> resolvedParameterOid = column("`resolved_parameter_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> resolvedSelectItemOid = column("`resolved_select_item_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> resolvedTableSourceOid = column("`resolved_table_source_oid`", JDBCType.BIGINT);

        public final SqlColumn<String> simpleName = column("`simple_name`", JDBCType.VARCHAR);

        public SqlIdentifierExpr() {
            super("sql_identifier_expr");
        }
    }
}