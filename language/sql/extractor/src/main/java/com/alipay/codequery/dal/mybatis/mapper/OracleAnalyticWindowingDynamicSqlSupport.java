package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class OracleAnalyticWindowingDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_analytic_windowing")
    public static final OracleAnalyticWindowing oracleAnalyticWindowing = new OracleAnalyticWindowing();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_analytic_windowing.oid")
    public static final SqlColumn<Long> oid = oracleAnalyticWindowing.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_analytic_windowing.expr_oid")
    public static final SqlColumn<Long> exprOid = oracleAnalyticWindowing.exprOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_analytic_windowing.type")
    public static final SqlColumn<String> type = oracleAnalyticWindowing.type;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_analytic_windowing")
    public static final class OracleAnalyticWindowing extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> exprOid = column("`expr_oid`", JDBCType.BIGINT);

        public final SqlColumn<String> type = column("`type`", JDBCType.VARCHAR);

        public OracleAnalyticWindowing() {
            super("oracle_analytic_windowing");
        }
    }
}