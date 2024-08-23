package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SqlHexExprDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_hex_expr")
    public static final SqlHexExpr sqlHexExpr = new SqlHexExpr();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_hex_expr.oid")
    public static final SqlColumn<Long> oid = sqlHexExpr.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_hex_expr.hex")
    public static final SqlColumn<String> hex = sqlHexExpr.hex;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_hex_expr.value")
    public static final SqlColumn<String> value = sqlHexExpr.value;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_hex_expr")
    public static final class SqlHexExpr extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<String> hex = column("`hex`", JDBCType.VARCHAR);

        public final SqlColumn<String> value = column("`value`", JDBCType.VARCHAR);

        public SqlHexExpr() {
            super("sql_hex_expr");
        }
    }
}