package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class MySqlOrderingExprDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_ordering_expr")
    public static final MySqlOrderingExpr mySqlOrderingExpr = new MySqlOrderingExpr();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_ordering_expr.oid")
    public static final SqlColumn<Long> oid = mySqlOrderingExpr.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_ordering_expr.expr_oid")
    public static final SqlColumn<Long> exprOid = mySqlOrderingExpr.exprOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_ordering_expr.type")
    public static final SqlColumn<String> type = mySqlOrderingExpr.type;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_ordering_expr")
    public static final class MySqlOrderingExpr extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> exprOid = column("`expr_oid`", JDBCType.BIGINT);

        public final SqlColumn<String> type = column("`type`", JDBCType.VARCHAR);

        public MySqlOrderingExpr() {
            super("my_sql_ordering_expr");
        }
    }
}