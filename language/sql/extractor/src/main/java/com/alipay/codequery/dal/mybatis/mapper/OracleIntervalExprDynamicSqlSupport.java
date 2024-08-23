package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class OracleIntervalExprDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_interval_expr")
    public static final OracleIntervalExpr oracleIntervalExpr = new OracleIntervalExpr();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_interval_expr.oid")
    public static final SqlColumn<Long> oid = oracleIntervalExpr.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_interval_expr.factional_seconds_precision")
    public static final SqlColumn<Integer> factionalSecondsPrecision = oracleIntervalExpr.factionalSecondsPrecision;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_interval_expr.precision_oid")
    public static final SqlColumn<Long> precisionOid = oracleIntervalExpr.precisionOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_interval_expr.to_factional_seconds_precision_oid")
    public static final SqlColumn<Long> toFactionalSecondsPrecisionOid = oracleIntervalExpr.toFactionalSecondsPrecisionOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_interval_expr.to_type")
    public static final SqlColumn<String> toType = oracleIntervalExpr.toType;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_interval_expr.type")
    public static final SqlColumn<String> type = oracleIntervalExpr.type;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_interval_expr.value_oid")
    public static final SqlColumn<Long> valueOid = oracleIntervalExpr.valueOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_interval_expr")
    public static final class OracleIntervalExpr extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Integer> factionalSecondsPrecision = column("`factional_seconds_precision`", JDBCType.BIGINT);

        public final SqlColumn<Long> precisionOid = column("`precision_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> toFactionalSecondsPrecisionOid = column("`to_factional_seconds_precision_oid`", JDBCType.BIGINT);

        public final SqlColumn<String> toType = column("`to_type`", JDBCType.VARCHAR);

        public final SqlColumn<String> type = column("`type`", JDBCType.VARCHAR);

        public final SqlColumn<Long> valueOid = column("`value_oid`", JDBCType.BIGINT);

        public OracleIntervalExpr() {
            super("oracle_interval_expr");
        }
    }
}