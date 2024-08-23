package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SqlExistsExprDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_exists_expr")
    public static final SqlExistsExpr sqlExistsExpr = new SqlExistsExpr();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_exists_expr.oid")
    public static final SqlColumn<Long> oid = sqlExistsExpr.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_exists_expr.is_not")
    public static final SqlColumn<Integer> isNot = sqlExistsExpr.isNot;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_exists_expr.sub_query_oid")
    public static final SqlColumn<Long> subQueryOid = sqlExistsExpr.subQueryOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_exists_expr")
    public static final class SqlExistsExpr extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isNot = column("`is_not`", JDBCType.BIGINT);

        public final SqlColumn<Long> subQueryOid = column("`sub_query_oid`", JDBCType.BIGINT);

        public SqlExistsExpr() {
            super("sql_exists_expr");
        }
    }
}