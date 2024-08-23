package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SqlBetweenExprDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_between_expr")
    public static final SqlBetweenExpr sqlBetweenExpr = new SqlBetweenExpr();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_between_expr.oid")
    public static final SqlColumn<Long> oid = sqlBetweenExpr.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_between_expr.begin_expr_oid")
    public static final SqlColumn<Long> beginExprOid = sqlBetweenExpr.beginExprOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_between_expr.end_expr_oid")
    public static final SqlColumn<Long> endExprOid = sqlBetweenExpr.endExprOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_between_expr.is_not")
    public static final SqlColumn<Integer> isNot = sqlBetweenExpr.isNot;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_between_expr.test_expr_oid")
    public static final SqlColumn<Long> testExprOid = sqlBetweenExpr.testExprOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_between_expr")
    public static final class SqlBetweenExpr extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> beginExprOid = column("`begin_expr_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> endExprOid = column("`end_expr_oid`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isNot = column("`is_not`", JDBCType.BIGINT);

        public final SqlColumn<Long> testExprOid = column("`test_expr_oid`", JDBCType.BIGINT);

        public SqlBetweenExpr() {
            super("sql_between_expr");
        }
    }
}