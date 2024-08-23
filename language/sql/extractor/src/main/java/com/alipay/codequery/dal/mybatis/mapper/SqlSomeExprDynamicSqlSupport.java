package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SqlSomeExprDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_some_expr")
    public static final SqlSomeExpr sqlSomeExpr = new SqlSomeExpr();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_some_expr.oid")
    public static final SqlColumn<Long> oid = sqlSomeExpr.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_some_expr.sub_query_oid")
    public static final SqlColumn<Long> subQueryOid = sqlSomeExpr.subQueryOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_some_expr")
    public static final class SqlSomeExpr extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> subQueryOid = column("`sub_query_oid`", JDBCType.BIGINT);

        public SqlSomeExpr() {
            super("sql_some_expr");
        }
    }
}