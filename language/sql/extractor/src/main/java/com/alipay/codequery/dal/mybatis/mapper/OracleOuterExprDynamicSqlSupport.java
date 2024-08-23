package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class OracleOuterExprDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_outer_expr")
    public static final OracleOuterExpr oracleOuterExpr = new OracleOuterExpr();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_outer_expr.oid")
    public static final SqlColumn<Long> oid = oracleOuterExpr.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_outer_expr.expr_oid")
    public static final SqlColumn<Long> exprOid = oracleOuterExpr.exprOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_outer_expr")
    public static final class OracleOuterExpr extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> exprOid = column("`expr_oid`", JDBCType.BIGINT);

        public OracleOuterExpr() {
            super("oracle_outer_expr");
        }
    }
}