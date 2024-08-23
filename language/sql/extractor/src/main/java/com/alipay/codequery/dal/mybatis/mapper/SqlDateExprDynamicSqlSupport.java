package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SqlDateExprDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_date_expr")
    public static final SqlDateExpr sqlDateExpr = new SqlDateExpr();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_date_expr.oid")
    public static final SqlColumn<Long> oid = sqlDateExpr.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_date_expr.date")
    public static final SqlColumn<String> date = sqlDateExpr.date;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_date_expr.literal")
    public static final SqlColumn<String> literal = sqlDateExpr.literal;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_date_expr.value")
    public static final SqlColumn<String> value = sqlDateExpr.value;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_date_expr")
    public static final class SqlDateExpr extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<String> date = column("`date`", JDBCType.VARCHAR);

        public final SqlColumn<String> literal = column("`literal`", JDBCType.VARCHAR);

        public final SqlColumn<String> value = column("`value`", JDBCType.VARCHAR);

        public SqlDateExpr() {
            super("sql_date_expr");
        }
    }
}