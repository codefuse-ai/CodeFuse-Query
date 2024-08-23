package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class PgExtractExprDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: pg_extract_expr")
    public static final PgExtractExpr pgExtractExpr = new PgExtractExpr();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: pg_extract_expr.oid")
    public static final SqlColumn<Long> oid = pgExtractExpr.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: pg_extract_expr.field")
    public static final SqlColumn<String> field = pgExtractExpr.field;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: pg_extract_expr.source_oid")
    public static final SqlColumn<Long> sourceOid = pgExtractExpr.sourceOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: pg_extract_expr")
    public static final class PgExtractExpr extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<String> field = column("`field`", JDBCType.VARCHAR);

        public final SqlColumn<Long> sourceOid = column("`source_oid`", JDBCType.BIGINT);

        public PgExtractExpr() {
            super("pg_extract_expr");
        }
    }
}