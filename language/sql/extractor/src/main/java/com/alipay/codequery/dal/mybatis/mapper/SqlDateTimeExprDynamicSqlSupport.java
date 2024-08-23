package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SqlDateTimeExprDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_date_time_expr")
    public static final SqlDateTimeExpr sqlDateTimeExpr = new SqlDateTimeExpr();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_date_time_expr.oid")
    public static final SqlColumn<Long> oid = sqlDateTimeExpr.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_date_time_expr.literal_oid")
    public static final SqlColumn<Long> literalOid = sqlDateTimeExpr.literalOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_date_time_expr.value")
    public static final SqlColumn<String> value = sqlDateTimeExpr.value;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_date_time_expr")
    public static final class SqlDateTimeExpr extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> literalOid = column("`literal_oid`", JDBCType.BIGINT);

        public final SqlColumn<String> value = column("`value`", JDBCType.VARCHAR);

        public SqlDateTimeExpr() {
            super("sql_date_time_expr");
        }
    }
}