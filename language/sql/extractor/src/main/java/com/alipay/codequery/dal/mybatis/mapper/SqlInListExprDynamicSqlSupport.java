package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SqlInListExprDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_in_list_expr")
    public static final SqlInListExpr sqlInListExpr = new SqlInListExpr();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_in_list_expr.oid")
    public static final SqlColumn<Long> oid = sqlInListExpr.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_in_list_expr.expr_oid")
    public static final SqlColumn<Long> exprOid = sqlInListExpr.exprOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_in_list_expr.hint_oid")
    public static final SqlColumn<Long> hintOid = sqlInListExpr.hintOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_in_list_expr.is_not")
    public static final SqlColumn<Integer> isNot = sqlInListExpr.isNot;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_in_list_expr")
    public static final class SqlInListExpr extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> exprOid = column("`expr_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> hintOid = column("`hint_oid`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isNot = column("`is_not`", JDBCType.BIGINT);

        public SqlInListExpr() {
            super("sql_in_list_expr");
        }
    }
}