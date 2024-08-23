package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SqlOverDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_over")
    public static final SqlOver sqlOver = new SqlOver();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_over.oid")
    public static final SqlColumn<Long> oid = sqlOver.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_over.cluster_by_oid")
    public static final SqlColumn<Long> clusterByOid = sqlOver.clusterByOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_over.distribute_by_oid")
    public static final SqlColumn<Long> distributeByOid = sqlOver.distributeByOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_over.is_exclude_current_row")
    public static final SqlColumn<Integer> isExcludeCurrentRow = sqlOver.isExcludeCurrentRow;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_over.is_windowing_between_end_following")
    public static final SqlColumn<Integer> isWindowingBetweenEndFollowing = sqlOver.isWindowingBetweenEndFollowing;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_over.is_windowing_between_end_preceding")
    public static final SqlColumn<Integer> isWindowingBetweenEndPreceding = sqlOver.isWindowingBetweenEndPreceding;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_over.is_windowing_preceding")
    public static final SqlColumn<Integer> isWindowingPreceding = sqlOver.isWindowingPreceding;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_over.of_oid")
    public static final SqlColumn<Long> ofOid = sqlOver.ofOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_over.order_by_oid")
    public static final SqlColumn<Long> orderByOid = sqlOver.orderByOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_over.sort_by_oid")
    public static final SqlColumn<Long> sortByOid = sqlOver.sortByOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_over.windowing_between_begin_oid")
    public static final SqlColumn<Long> windowingBetweenBeginOid = sqlOver.windowingBetweenBeginOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_over.windowing_between_begin_bound")
    public static final SqlColumn<String> windowingBetweenBeginBound = sqlOver.windowingBetweenBeginBound;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_over.windowing_between_end_oid")
    public static final SqlColumn<Long> windowingBetweenEndOid = sqlOver.windowingBetweenEndOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_over.windowing_between_end_bound")
    public static final SqlColumn<String> windowingBetweenEndBound = sqlOver.windowingBetweenEndBound;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_over.windowing_type")
    public static final SqlColumn<String> windowingType = sqlOver.windowingType;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_over")
    public static final class SqlOver extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> clusterByOid = column("`cluster_by_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> distributeByOid = column("`distribute_by_oid`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isExcludeCurrentRow = column("`is_exclude_current_row`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isWindowingBetweenEndFollowing = column("`is_windowing_between_end_following`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isWindowingBetweenEndPreceding = column("`is_windowing_between_end_preceding`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isWindowingPreceding = column("`is_windowing_preceding`", JDBCType.BIGINT);

        public final SqlColumn<Long> ofOid = column("`of_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> orderByOid = column("`order_by_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> sortByOid = column("`sort_by_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> windowingBetweenBeginOid = column("`windowing_between_begin_oid`", JDBCType.BIGINT);

        public final SqlColumn<String> windowingBetweenBeginBound = column("`windowing_between_begin_bound`", JDBCType.VARCHAR);

        public final SqlColumn<Long> windowingBetweenEndOid = column("`windowing_between_end_oid`", JDBCType.BIGINT);

        public final SqlColumn<String> windowingBetweenEndBound = column("`windowing_between_end_bound`", JDBCType.VARCHAR);

        public final SqlColumn<String> windowingType = column("`windowing_type`", JDBCType.VARCHAR);

        public SqlOver() {
            super("sql_over");
        }
    }
}