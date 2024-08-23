package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SqlDoubleExprDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_double_expr")
    public static final SqlDoubleExpr sqlDoubleExpr = new SqlDoubleExpr();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_double_expr.oid")
    public static final SqlColumn<Long> oid = sqlDoubleExpr.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_double_expr.number")
    public static final SqlColumn<String> number = sqlDoubleExpr.number;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_double_expr.value")
    public static final SqlColumn<String> value = sqlDoubleExpr.value;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_double_expr")
    public static final class SqlDoubleExpr extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<String> number = column("`number`", JDBCType.VARCHAR);

        public final SqlColumn<String> value = column("`value`", JDBCType.VARCHAR);

        public SqlDoubleExpr() {
            super("sql_double_expr");
        }
    }
}