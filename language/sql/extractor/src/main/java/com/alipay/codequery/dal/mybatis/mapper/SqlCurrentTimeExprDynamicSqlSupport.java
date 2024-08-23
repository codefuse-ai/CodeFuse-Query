package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SqlCurrentTimeExprDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_current_time_expr")
    public static final SqlCurrentTimeExpr sqlCurrentTimeExpr = new SqlCurrentTimeExpr();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_current_time_expr.oid")
    public static final SqlColumn<Long> oid = sqlCurrentTimeExpr.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_current_time_expr.type")
    public static final SqlColumn<String> type = sqlCurrentTimeExpr.type;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_current_time_expr")
    public static final class SqlCurrentTimeExpr extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<String> type = column("`type`", JDBCType.VARCHAR);

        public SqlCurrentTimeExpr() {
            super("sql_current_time_expr");
        }
    }
}