package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SqlVariantRefExprDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_variant_ref_expr")
    public static final SqlVariantRefExpr sqlVariantRefExpr = new SqlVariantRefExpr();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_variant_ref_expr.oid")
    public static final SqlColumn<Long> oid = sqlVariantRefExpr.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_variant_ref_expr.index")
    public static final SqlColumn<Integer> index = sqlVariantRefExpr.index;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_variant_ref_expr.is_global")
    public static final SqlColumn<Integer> isGlobal = sqlVariantRefExpr.isGlobal;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_variant_ref_expr.is_session")
    public static final SqlColumn<Integer> isSession = sqlVariantRefExpr.isSession;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_variant_ref_expr.name")
    public static final SqlColumn<String> name = sqlVariantRefExpr.name;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_variant_ref_expr")
    public static final class SqlVariantRefExpr extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Integer> index = column("`index`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isGlobal = column("`is_global`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isSession = column("`is_session`", JDBCType.BIGINT);

        public final SqlColumn<String> name = column("`name`", JDBCType.VARCHAR);

        public SqlVariantRefExpr() {
            super("sql_variant_ref_expr");
        }
    }
}