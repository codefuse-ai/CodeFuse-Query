package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SqlIntegerExprDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_integer_expr")
    public static final SqlIntegerExpr sqlIntegerExpr = new SqlIntegerExpr();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_integer_expr.oid")
    public static final SqlColumn<Long> oid = sqlIntegerExpr.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_integer_expr.number")
    public static final SqlColumn<String> number = sqlIntegerExpr.number;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_integer_expr.type")
    public static final SqlColumn<String> type = sqlIntegerExpr.type;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_integer_expr.value")
    public static final SqlColumn<String> value = sqlIntegerExpr.value;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_integer_expr")
    public static final class SqlIntegerExpr extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<String> number = column("`number`", JDBCType.VARCHAR);

        public final SqlColumn<String> type = column("`type`", JDBCType.VARCHAR);

        public final SqlColumn<String> value = column("`value`", JDBCType.VARCHAR);

        public SqlIntegerExpr() {
            super("sql_integer_expr");
        }
    }
}