package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class PgInetExprDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: pg_inet_expr")
    public static final PgInetExpr pgInetExpr = new PgInetExpr();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: pg_inet_expr.oid")
    public static final SqlColumn<Long> oid = pgInetExpr.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: pg_inet_expr.value_oid")
    public static final SqlColumn<Long> valueOid = pgInetExpr.valueOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: pg_inet_expr")
    public static final class PgInetExpr extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> valueOid = column("`value_oid`", JDBCType.BIGINT);

        public PgInetExpr() {
            super("pg_inet_expr");
        }
    }
}