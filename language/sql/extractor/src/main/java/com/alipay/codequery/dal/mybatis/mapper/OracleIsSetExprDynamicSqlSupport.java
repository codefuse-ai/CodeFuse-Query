package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class OracleIsSetExprDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_is_set_expr")
    public static final OracleIsSetExpr oracleIsSetExpr = new OracleIsSetExpr();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_is_set_expr.oid")
    public static final SqlColumn<Long> oid = oracleIsSetExpr.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_is_set_expr.nested_table_oid")
    public static final SqlColumn<Long> nestedTableOid = oracleIsSetExpr.nestedTableOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_is_set_expr")
    public static final class OracleIsSetExpr extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> nestedTableOid = column("`nested_table_oid`", JDBCType.BIGINT);

        public OracleIsSetExpr() {
            super("oracle_is_set_expr");
        }
    }
}