package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SqlNumberExprDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_number_expr")
    public static final SqlNumberExpr sqlNumberExpr = new SqlNumberExpr();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_number_expr.oid")
    public static final SqlColumn<Long> oid = sqlNumberExpr.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_number_expr.literal")
    public static final SqlColumn<String> literal = sqlNumberExpr.literal;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_number_expr.number")
    public static final SqlColumn<String> number = sqlNumberExpr.number;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_number_expr.value")
    public static final SqlColumn<String> value = sqlNumberExpr.value;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_number_expr")
    public static final class SqlNumberExpr extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<String> literal = column("`literal`", JDBCType.VARCHAR);

        public final SqlColumn<String> number = column("`number`", JDBCType.VARCHAR);

        public final SqlColumn<String> value = column("`value`", JDBCType.VARCHAR);

        public SqlNumberExpr() {
            super("sql_number_expr");
        }
    }
}