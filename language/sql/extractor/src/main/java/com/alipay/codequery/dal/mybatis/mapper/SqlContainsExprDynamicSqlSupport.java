package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SqlContainsExprDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_contains_expr")
    public static final SqlContainsExpr sqlContainsExpr = new SqlContainsExpr();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_contains_expr.oid")
    public static final SqlColumn<Long> oid = sqlContainsExpr.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_contains_expr.expr_oid")
    public static final SqlColumn<Long> exprOid = sqlContainsExpr.exprOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_contains_expr.is_not")
    public static final SqlColumn<Integer> isNot = sqlContainsExpr.isNot;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_contains_expr")
    public static final class SqlContainsExpr extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> exprOid = column("`expr_oid`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isNot = column("`is_not`", JDBCType.BIGINT);

        public SqlContainsExpr() {
            super("sql_contains_expr");
        }
    }
}