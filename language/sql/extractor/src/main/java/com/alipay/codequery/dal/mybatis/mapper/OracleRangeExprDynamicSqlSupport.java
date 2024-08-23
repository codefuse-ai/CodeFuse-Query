package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class OracleRangeExprDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_range_expr")
    public static final OracleRangeExpr oracleRangeExpr = new OracleRangeExpr();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_range_expr.oid")
    public static final SqlColumn<Long> oid = oracleRangeExpr.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_range_expr.low_bound_oid")
    public static final SqlColumn<Long> lowBoundOid = oracleRangeExpr.lowBoundOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_range_expr.up_bound_oid")
    public static final SqlColumn<Long> upBoundOid = oracleRangeExpr.upBoundOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_range_expr")
    public static final class OracleRangeExpr extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> lowBoundOid = column("`low_bound_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> upBoundOid = column("`up_bound_oid`", JDBCType.BIGINT);

        public OracleRangeExpr() {
            super("oracle_range_expr");
        }
    }
}