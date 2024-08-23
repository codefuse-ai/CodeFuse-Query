package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class OracleTreatExprDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_treat_expr")
    public static final OracleTreatExpr oracleTreatExpr = new OracleTreatExpr();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_treat_expr.oid")
    public static final SqlColumn<Long> oid = oracleTreatExpr.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_treat_expr.expr_oid")
    public static final SqlColumn<Long> exprOid = oracleTreatExpr.exprOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_treat_expr.is_ref")
    public static final SqlColumn<Integer> isRef = oracleTreatExpr.isRef;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_treat_expr.type_oid")
    public static final SqlColumn<Long> typeOid = oracleTreatExpr.typeOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_treat_expr")
    public static final class OracleTreatExpr extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> exprOid = column("`expr_oid`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isRef = column("`is_ref`", JDBCType.BIGINT);

        public final SqlColumn<Long> typeOid = column("`type_oid`", JDBCType.BIGINT);

        public OracleTreatExpr() {
            super("oracle_treat_expr");
        }
    }
}