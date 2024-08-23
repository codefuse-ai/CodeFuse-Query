package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class OracleIsOfTypeExprDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_is_of_type_expr")
    public static final OracleIsOfTypeExpr oracleIsOfTypeExpr = new OracleIsOfTypeExpr();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_is_of_type_expr.oid")
    public static final SqlColumn<Long> oid = oracleIsOfTypeExpr.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_is_of_type_expr.expr_oid")
    public static final SqlColumn<Long> exprOid = oracleIsOfTypeExpr.exprOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_is_of_type_expr")
    public static final class OracleIsOfTypeExpr extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> exprOid = column("`expr_oid`", JDBCType.BIGINT);

        public OracleIsOfTypeExpr() {
            super("oracle_is_of_type_expr");
        }
    }
}