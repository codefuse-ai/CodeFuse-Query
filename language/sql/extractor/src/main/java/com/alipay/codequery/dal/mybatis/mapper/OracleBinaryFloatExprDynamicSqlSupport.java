package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class OracleBinaryFloatExprDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_binary_float_expr")
    public static final OracleBinaryFloatExpr oracleBinaryFloatExpr = new OracleBinaryFloatExpr();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_binary_float_expr.oid")
    public static final SqlColumn<Long> oid = oracleBinaryFloatExpr.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_binary_float_expr.number")
    public static final SqlColumn<String> number = oracleBinaryFloatExpr.number;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_binary_float_expr.value")
    public static final SqlColumn<String> value = oracleBinaryFloatExpr.value;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_binary_float_expr")
    public static final class OracleBinaryFloatExpr extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<String> number = column("`number`", JDBCType.VARCHAR);

        public final SqlColumn<String> value = column("`value`", JDBCType.VARCHAR);

        public OracleBinaryFloatExpr() {
            super("oracle_binary_float_expr");
        }
    }
}