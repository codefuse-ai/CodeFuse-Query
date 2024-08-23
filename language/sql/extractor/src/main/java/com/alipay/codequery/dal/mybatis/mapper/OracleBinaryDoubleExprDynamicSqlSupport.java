package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class OracleBinaryDoubleExprDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_binary_double_expr")
    public static final OracleBinaryDoubleExpr oracleBinaryDoubleExpr = new OracleBinaryDoubleExpr();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_binary_double_expr.oid")
    public static final SqlColumn<Long> oid = oracleBinaryDoubleExpr.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_binary_double_expr.number")
    public static final SqlColumn<String> number = oracleBinaryDoubleExpr.number;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_binary_double_expr.value")
    public static final SqlColumn<String> value = oracleBinaryDoubleExpr.value;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_binary_double_expr")
    public static final class OracleBinaryDoubleExpr extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<String> number = column("`number`", JDBCType.VARCHAR);

        public final SqlColumn<String> value = column("`value`", JDBCType.VARCHAR);

        public OracleBinaryDoubleExpr() {
            super("oracle_binary_double_expr");
        }
    }
}