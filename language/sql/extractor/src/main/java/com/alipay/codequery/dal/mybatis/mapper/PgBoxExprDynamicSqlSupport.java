package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class PgBoxExprDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: pg_box_expr")
    public static final PgBoxExpr pgBoxExpr = new PgBoxExpr();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: pg_box_expr.oid")
    public static final SqlColumn<Long> oid = pgBoxExpr.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: pg_box_expr.value_oid")
    public static final SqlColumn<Long> valueOid = pgBoxExpr.valueOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: pg_box_expr")
    public static final class PgBoxExpr extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> valueOid = column("`value_oid`", JDBCType.BIGINT);

        public PgBoxExpr() {
            super("pg_box_expr");
        }
    }
}