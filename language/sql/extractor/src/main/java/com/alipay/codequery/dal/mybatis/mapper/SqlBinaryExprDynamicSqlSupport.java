package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SqlBinaryExprDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_binary_expr")
    public static final SqlBinaryExpr sqlBinaryExpr = new SqlBinaryExpr();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_binary_expr.oid")
    public static final SqlColumn<Long> oid = sqlBinaryExpr.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_binary_expr.text")
    public static final SqlColumn<String> text = sqlBinaryExpr.text;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_binary_expr.value")
    public static final SqlColumn<String> value = sqlBinaryExpr.value;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_binary_expr")
    public static final class SqlBinaryExpr extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<String> text = column("`text`", JDBCType.VARCHAR);

        public final SqlColumn<String> value = column("`value`", JDBCType.VARCHAR);

        public SqlBinaryExpr() {
            super("sql_binary_expr");
        }
    }
}