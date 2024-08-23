package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SqlSmallIntExprDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_small_int_expr")
    public static final SqlSmallIntExpr sqlSmallIntExpr = new SqlSmallIntExpr();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_small_int_expr.oid")
    public static final SqlColumn<Long> oid = sqlSmallIntExpr.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_small_int_expr.number")
    public static final SqlColumn<String> number = sqlSmallIntExpr.number;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_small_int_expr.value")
    public static final SqlColumn<Integer> value = sqlSmallIntExpr.value;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_small_int_expr")
    public static final class SqlSmallIntExpr extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<String> number = column("`number`", JDBCType.VARCHAR);

        public final SqlColumn<Integer> value = column("`value`", JDBCType.BIGINT);

        public SqlSmallIntExpr() {
            super("sql_small_int_expr");
        }
    }
}