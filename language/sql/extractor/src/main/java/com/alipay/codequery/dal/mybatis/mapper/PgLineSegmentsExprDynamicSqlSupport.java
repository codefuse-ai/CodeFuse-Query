package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class PgLineSegmentsExprDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: pg_line_segments_expr")
    public static final PgLineSegmentsExpr pgLineSegmentsExpr = new PgLineSegmentsExpr();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: pg_line_segments_expr.oid")
    public static final SqlColumn<Long> oid = pgLineSegmentsExpr.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: pg_line_segments_expr.value_oid")
    public static final SqlColumn<Long> valueOid = pgLineSegmentsExpr.valueOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: pg_line_segments_expr")
    public static final class PgLineSegmentsExpr extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> valueOid = column("`value_oid`", JDBCType.BIGINT);

        public PgLineSegmentsExpr() {
            super("pg_line_segments_expr");
        }
    }
}