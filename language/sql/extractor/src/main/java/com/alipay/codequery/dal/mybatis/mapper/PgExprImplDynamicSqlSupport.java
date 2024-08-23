package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class PgExprImplDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: pg_expr_impl")
    public static final PgExprImpl pgExprImpl = new PgExprImpl();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: pg_expr_impl.oid")
    public static final SqlColumn<Long> oid = pgExprImpl.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: pg_expr_impl")
    public static final class PgExprImpl extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public PgExprImpl() {
            super("pg_expr_impl");
        }
    }
}