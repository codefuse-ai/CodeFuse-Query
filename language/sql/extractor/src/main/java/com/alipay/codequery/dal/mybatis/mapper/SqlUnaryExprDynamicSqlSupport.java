package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SqlUnaryExprDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_unary_expr")
    public static final SqlUnaryExpr sqlUnaryExpr = new SqlUnaryExpr();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_unary_expr.oid")
    public static final SqlColumn<Long> oid = sqlUnaryExpr.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_unary_expr.expr_oid")
    public static final SqlColumn<Long> exprOid = sqlUnaryExpr.exprOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_unary_expr.operator")
    public static final SqlColumn<String> operator = sqlUnaryExpr.operator;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_unary_expr")
    public static final class SqlUnaryExpr extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> exprOid = column("`expr_oid`", JDBCType.BIGINT);

        public final SqlColumn<String> operator = column("`operator`", JDBCType.VARCHAR);

        public SqlUnaryExpr() {
            super("sql_unary_expr");
        }
    }
}