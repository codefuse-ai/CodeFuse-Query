package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SqlTimestampExprDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_timestamp_expr")
    public static final SqlTimestampExpr sqlTimestampExpr = new SqlTimestampExpr();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_timestamp_expr.oid")
    public static final SqlColumn<Long> oid = sqlTimestampExpr.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_timestamp_expr.is_with_time_zone")
    public static final SqlColumn<Integer> isWithTimeZone = sqlTimestampExpr.isWithTimeZone;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_timestamp_expr.literal")
    public static final SqlColumn<String> literal = sqlTimestampExpr.literal;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_timestamp_expr.time_zone")
    public static final SqlColumn<String> timeZone = sqlTimestampExpr.timeZone;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_timestamp_expr.value")
    public static final SqlColumn<String> value = sqlTimestampExpr.value;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_timestamp_expr")
    public static final class SqlTimestampExpr extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isWithTimeZone = column("`is_with_time_zone`", JDBCType.BIGINT);

        public final SqlColumn<String> literal = column("`literal`", JDBCType.VARCHAR);

        public final SqlColumn<String> timeZone = column("`time_zone`", JDBCType.VARCHAR);

        public final SqlColumn<String> value = column("`value`", JDBCType.VARCHAR);

        public SqlTimestampExpr() {
            super("sql_timestamp_expr");
        }
    }
}