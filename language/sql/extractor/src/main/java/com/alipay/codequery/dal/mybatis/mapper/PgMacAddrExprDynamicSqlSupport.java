package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class PgMacAddrExprDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: pg_mac_addr_expr")
    public static final PgMacAddrExpr pgMacAddrExpr = new PgMacAddrExpr();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: pg_mac_addr_expr.oid")
    public static final SqlColumn<Long> oid = pgMacAddrExpr.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: pg_mac_addr_expr.value_oid")
    public static final SqlColumn<Long> valueOid = pgMacAddrExpr.valueOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: pg_mac_addr_expr")
    public static final class PgMacAddrExpr extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> valueOid = column("`value_oid`", JDBCType.BIGINT);

        public PgMacAddrExpr() {
            super("pg_mac_addr_expr");
        }
    }
}