package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SqlInSubQueryExprDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_in_sub_query_expr")
    public static final SqlInSubQueryExpr sqlInSubQueryExpr = new SqlInSubQueryExpr();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_in_sub_query_expr.oid")
    public static final SqlColumn<Long> oid = sqlInSubQueryExpr.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_in_sub_query_expr.expr_oid")
    public static final SqlColumn<Long> exprOid = sqlInSubQueryExpr.exprOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_in_sub_query_expr.hint_oid")
    public static final SqlColumn<Long> hintOid = sqlInSubQueryExpr.hintOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_in_sub_query_expr.is_global")
    public static final SqlColumn<Integer> isGlobal = sqlInSubQueryExpr.isGlobal;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_in_sub_query_expr.is_not")
    public static final SqlColumn<Integer> isNot = sqlInSubQueryExpr.isNot;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_in_sub_query_expr.sub_query_oid")
    public static final SqlColumn<Long> subQueryOid = sqlInSubQueryExpr.subQueryOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_in_sub_query_expr")
    public static final class SqlInSubQueryExpr extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> exprOid = column("`expr_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> hintOid = column("`hint_oid`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isGlobal = column("`is_global`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isNot = column("`is_not`", JDBCType.BIGINT);

        public final SqlColumn<Long> subQueryOid = column("`sub_query_oid`", JDBCType.BIGINT);

        public SqlInSubQueryExpr() {
            super("sql_in_sub_query_expr");
        }
    }
}