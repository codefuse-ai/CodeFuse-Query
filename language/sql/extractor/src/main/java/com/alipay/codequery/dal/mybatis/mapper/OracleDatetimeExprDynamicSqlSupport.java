package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class OracleDatetimeExprDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_datetime_expr")
    public static final OracleDatetimeExpr oracleDatetimeExpr = new OracleDatetimeExpr();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_datetime_expr.oid")
    public static final SqlColumn<Long> oid = oracleDatetimeExpr.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_datetime_expr.expr_oid")
    public static final SqlColumn<Long> exprOid = oracleDatetimeExpr.exprOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_datetime_expr.time_zone_oid")
    public static final SqlColumn<Long> timeZoneOid = oracleDatetimeExpr.timeZoneOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_datetime_expr")
    public static final class OracleDatetimeExpr extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> exprOid = column("`expr_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> timeZoneOid = column("`time_zone_oid`", JDBCType.BIGINT);

        public OracleDatetimeExpr() {
            super("oracle_datetime_expr");
        }
    }
}