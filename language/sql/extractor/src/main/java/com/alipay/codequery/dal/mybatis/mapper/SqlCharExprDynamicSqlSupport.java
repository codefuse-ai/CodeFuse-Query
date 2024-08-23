package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SqlCharExprDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_char_expr")
    public static final SqlCharExpr sqlCharExpr = new SqlCharExpr();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_char_expr.oid")
    public static final SqlColumn<Long> oid = sqlCharExpr.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_char_expr.value")
    public static final SqlColumn<String> value = sqlCharExpr.value;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_char_expr")
    public static final class SqlCharExpr extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<String> value = column("`value`", JDBCType.VARCHAR);

        public SqlCharExpr() {
            super("sql_char_expr");
        }
    }
}