package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SqlAggregateExprDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_aggregate_expr")
    public static final SqlAggregateExpr sqlAggregateExpr = new SqlAggregateExpr();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_aggregate_expr.oid")
    public static final SqlColumn<Long> oid = sqlAggregateExpr.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_aggregate_expr.filter_oid")
    public static final SqlColumn<Long> filterOid = sqlAggregateExpr.filterOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_aggregate_expr.ignore_nulls")
    public static final SqlColumn<Integer> ignoreNulls = sqlAggregateExpr.ignoreNulls;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_aggregate_expr.is_distinct")
    public static final SqlColumn<Integer> isDistinct = sqlAggregateExpr.isDistinct;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_aggregate_expr.is_ignore_nulls")
    public static final SqlColumn<Integer> isIgnoreNulls = sqlAggregateExpr.isIgnoreNulls;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_aggregate_expr.is_within_group")
    public static final SqlColumn<Integer> isWithinGroup = sqlAggregateExpr.isWithinGroup;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_aggregate_expr.keep_oid")
    public static final SqlColumn<Long> keepOid = sqlAggregateExpr.keepOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_aggregate_expr.option")
    public static final SqlColumn<String> option = sqlAggregateExpr.option;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_aggregate_expr.order_by_oid")
    public static final SqlColumn<Long> orderByOid = sqlAggregateExpr.orderByOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_aggregate_expr.over_oid")
    public static final SqlColumn<Long> overOid = sqlAggregateExpr.overOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_aggregate_expr.over_ref_oid")
    public static final SqlColumn<Long> overRefOid = sqlAggregateExpr.overRefOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_aggregate_expr")
    public static final class SqlAggregateExpr extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> filterOid = column("`filter_oid`", JDBCType.BIGINT);

        public final SqlColumn<Integer> ignoreNulls = column("`ignore_nulls`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isDistinct = column("`is_distinct`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isIgnoreNulls = column("`is_ignore_nulls`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isWithinGroup = column("`is_within_group`", JDBCType.BIGINT);

        public final SqlColumn<Long> keepOid = column("`keep_oid`", JDBCType.BIGINT);

        public final SqlColumn<String> option = column("`option`", JDBCType.VARCHAR);

        public final SqlColumn<Long> orderByOid = column("`order_by_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> overOid = column("`over_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> overRefOid = column("`over_ref_oid`", JDBCType.BIGINT);

        public SqlAggregateExpr() {
            super("sql_aggregate_expr");
        }
    }
}