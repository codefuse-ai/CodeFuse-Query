package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class OracleAnalyticDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_analytic")
    public static final OracleAnalytic oracleAnalytic = new OracleAnalytic();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_analytic.oid")
    public static final SqlColumn<Long> oid = oracleAnalytic.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_analytic.windowing_oid")
    public static final SqlColumn<Long> windowingOid = oracleAnalytic.windowingOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_analytic")
    public static final class OracleAnalytic extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> windowingOid = column("`windowing_oid`", JDBCType.BIGINT);

        public OracleAnalytic() {
            super("oracle_analytic");
        }
    }
}