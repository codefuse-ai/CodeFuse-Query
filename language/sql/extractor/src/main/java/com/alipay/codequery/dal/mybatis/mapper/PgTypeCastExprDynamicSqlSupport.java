package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class PgTypeCastExprDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: pg_type_cast_expr")
    public static final PgTypeCastExpr pgTypeCastExpr = new PgTypeCastExpr();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: pg_type_cast_expr.oid")
    public static final SqlColumn<Long> oid = pgTypeCastExpr.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: pg_type_cast_expr")
    public static final class PgTypeCastExpr extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public PgTypeCastExpr() {
            super("pg_type_cast_expr");
        }
    }
}