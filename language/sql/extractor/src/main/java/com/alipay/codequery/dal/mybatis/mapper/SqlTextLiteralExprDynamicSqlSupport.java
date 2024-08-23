package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SqlTextLiteralExprDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_text_literal_expr")
    public static final SqlTextLiteralExpr sqlTextLiteralExpr = new SqlTextLiteralExpr();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_text_literal_expr.oid")
    public static final SqlColumn<Long> oid = sqlTextLiteralExpr.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_text_literal_expr.text")
    public static final SqlColumn<String> text = sqlTextLiteralExpr.text;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_text_literal_expr")
    public static final class SqlTextLiteralExpr extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<String> text = column("`text`", JDBCType.VARCHAR);

        public SqlTextLiteralExpr() {
            super("sql_text_literal_expr");
        }
    }
}