package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class PgPointExprDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: pg_point_expr")
    public static final PgPointExpr pgPointExpr = new PgPointExpr();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: pg_point_expr.oid")
    public static final SqlColumn<Long> oid = pgPointExpr.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: pg_point_expr.value_oid")
    public static final SqlColumn<Long> valueOid = pgPointExpr.valueOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: pg_point_expr")
    public static final class PgPointExpr extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> valueOid = column("`value_oid`", JDBCType.BIGINT);

        public PgPointExpr() {
            super("pg_point_expr");
        }
    }
}