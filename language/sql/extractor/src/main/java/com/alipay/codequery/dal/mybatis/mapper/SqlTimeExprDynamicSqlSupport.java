package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SqlTimeExprDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_time_expr")
    public static final SqlTimeExpr sqlTimeExpr = new SqlTimeExpr();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_time_expr.oid")
    public static final SqlColumn<Long> oid = sqlTimeExpr.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_time_expr.literal_oid")
    public static final SqlColumn<Long> literalOid = sqlTimeExpr.literalOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_time_expr.value")
    public static final SqlColumn<String> value = sqlTimeExpr.value;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_time_expr")
    public static final class SqlTimeExpr extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> literalOid = column("`literal_oid`", JDBCType.BIGINT);

        public final SqlColumn<String> value = column("`value`", JDBCType.VARCHAR);

        public SqlTimeExpr() {
            super("sql_time_expr");
        }
    }
}