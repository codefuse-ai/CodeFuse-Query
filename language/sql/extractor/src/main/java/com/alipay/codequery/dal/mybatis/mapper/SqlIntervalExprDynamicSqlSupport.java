package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SqlIntervalExprDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_interval_expr")
    public static final SqlIntervalExpr sqlIntervalExpr = new SqlIntervalExpr();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_interval_expr.oid")
    public static final SqlColumn<Long> oid = sqlIntervalExpr.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_interval_expr.unit")
    public static final SqlColumn<String> unit = sqlIntervalExpr.unit;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_interval_expr.value_oid")
    public static final SqlColumn<Long> valueOid = sqlIntervalExpr.valueOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_interval_expr")
    public static final class SqlIntervalExpr extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<String> unit = column("`unit`", JDBCType.VARCHAR);

        public final SqlColumn<Long> valueOid = column("`value_oid`", JDBCType.BIGINT);

        public SqlIntervalExpr() {
            super("sql_interval_expr");
        }
    }
}