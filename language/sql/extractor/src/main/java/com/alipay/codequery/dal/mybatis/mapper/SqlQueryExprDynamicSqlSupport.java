package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SqlQueryExprDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_query_expr")
    public static final SqlQueryExpr sqlQueryExpr = new SqlQueryExpr();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_query_expr.oid")
    public static final SqlColumn<Long> oid = sqlQueryExpr.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_query_expr.sub_query_oid")
    public static final SqlColumn<Long> subQueryOid = sqlQueryExpr.subQueryOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_query_expr")
    public static final class SqlQueryExpr extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> subQueryOid = column("`sub_query_oid`", JDBCType.BIGINT);

        public SqlQueryExpr() {
            super("sql_query_expr");
        }
    }
}