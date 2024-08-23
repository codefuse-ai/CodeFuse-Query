package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SqlNumericLiteralExprDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_numeric_literal_expr")
    public static final SqlNumericLiteralExpr sqlNumericLiteralExpr = new SqlNumericLiteralExpr();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_numeric_literal_expr.oid")
    public static final SqlColumn<Long> oid = sqlNumericLiteralExpr.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_numeric_literal_expr")
    public static final class SqlNumericLiteralExpr extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public SqlNumericLiteralExpr() {
            super("sql_numeric_literal_expr");
        }
    }
}