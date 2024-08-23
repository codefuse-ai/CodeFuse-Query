package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SqlDecimalExprDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_decimal_expr")
    public static final SqlDecimalExpr sqlDecimalExpr = new SqlDecimalExpr();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_decimal_expr.oid")
    public static final SqlColumn<Long> oid = sqlDecimalExpr.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_decimal_expr.literal")
    public static final SqlColumn<String> literal = sqlDecimalExpr.literal;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_decimal_expr.number")
    public static final SqlColumn<String> number = sqlDecimalExpr.number;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_decimal_expr.value")
    public static final SqlColumn<String> value = sqlDecimalExpr.value;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_decimal_expr")
    public static final class SqlDecimalExpr extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<String> literal = column("`literal`", JDBCType.VARCHAR);

        public final SqlColumn<String> number = column("`number`", JDBCType.VARCHAR);

        public final SqlColumn<String> value = column("`value`", JDBCType.VARCHAR);

        public SqlDecimalExpr() {
            super("sql_decimal_expr");
        }
    }
}