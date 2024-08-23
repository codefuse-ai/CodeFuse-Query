package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SqlNullExprDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_null_expr")
    public static final SqlNullExpr sqlNullExpr = new SqlNullExpr();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_null_expr.oid")
    public static final SqlColumn<Long> oid = sqlNullExpr.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_null_expr.value")
    public static final SqlColumn<String> value = sqlNullExpr.value;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_null_expr")
    public static final class SqlNullExpr extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<String> value = column("`value`", JDBCType.VARCHAR);

        public SqlNullExpr() {
            super("sql_null_expr");
        }
    }
}