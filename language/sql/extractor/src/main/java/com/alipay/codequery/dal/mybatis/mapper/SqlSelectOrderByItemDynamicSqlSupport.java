package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SqlSelectOrderByItemDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_select_order_by_item")
    public static final SqlSelectOrderByItem sqlSelectOrderByItem = new SqlSelectOrderByItem();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_select_order_by_item.oid")
    public static final SqlColumn<Long> oid = sqlSelectOrderByItem.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_select_order_by_item.collate")
    public static final SqlColumn<String> collate = sqlSelectOrderByItem.collate;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_select_order_by_item.expr_oid")
    public static final SqlColumn<Long> exprOid = sqlSelectOrderByItem.exprOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_select_order_by_item.is_cluster_by")
    public static final SqlColumn<Integer> isClusterBy = sqlSelectOrderByItem.isClusterBy;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_select_order_by_item.is_distribute_by")
    public static final SqlColumn<Integer> isDistributeBy = sqlSelectOrderByItem.isDistributeBy;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_select_order_by_item.is_sort_by")
    public static final SqlColumn<Integer> isSortBy = sqlSelectOrderByItem.isSortBy;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_select_order_by_item.nulls_order_type")
    public static final SqlColumn<String> nullsOrderType = sqlSelectOrderByItem.nullsOrderType;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_select_order_by_item.resolved_select_item_oid")
    public static final SqlColumn<Long> resolvedSelectItemOid = sqlSelectOrderByItem.resolvedSelectItemOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_select_order_by_item.type")
    public static final SqlColumn<String> type = sqlSelectOrderByItem.type;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_select_order_by_item")
    public static final class SqlSelectOrderByItem extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<String> collate = column("`collate`", JDBCType.VARCHAR);

        public final SqlColumn<Long> exprOid = column("`expr_oid`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isClusterBy = column("`is_cluster_by`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isDistributeBy = column("`is_distribute_by`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isSortBy = column("`is_sort_by`", JDBCType.BIGINT);

        public final SqlColumn<String> nullsOrderType = column("`nulls_order_type`", JDBCType.VARCHAR);

        public final SqlColumn<Long> resolvedSelectItemOid = column("`resolved_select_item_oid`", JDBCType.BIGINT);

        public final SqlColumn<String> type = column("`type`", JDBCType.VARCHAR);

        public SqlSelectOrderByItem() {
            super("sql_select_order_by_item");
        }
    }
}