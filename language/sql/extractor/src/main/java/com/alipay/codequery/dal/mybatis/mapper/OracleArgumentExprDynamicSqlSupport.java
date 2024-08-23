package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class OracleArgumentExprDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_argument_expr")
    public static final OracleArgumentExpr oracleArgumentExpr = new OracleArgumentExpr();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_argument_expr.oid")
    public static final SqlColumn<Long> oid = oracleArgumentExpr.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_argument_expr.argument_name")
    public static final SqlColumn<String> argumentName = oracleArgumentExpr.argumentName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_argument_expr.value_oid")
    public static final SqlColumn<Long> valueOid = oracleArgumentExpr.valueOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_argument_expr")
    public static final class OracleArgumentExpr extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<String> argumentName = column("`argument_name`", JDBCType.VARCHAR);

        public final SqlColumn<Long> valueOid = column("`value_oid`", JDBCType.BIGINT);

        public OracleArgumentExpr() {
            super("oracle_argument_expr");
        }
    }
}