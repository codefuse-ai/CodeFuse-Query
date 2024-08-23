package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SqlSelectQueryBlockDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_select_query_block")
    public static final SqlSelectQueryBlock sqlSelectQueryBlock = new SqlSelectQueryBlock();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_select_query_block.oid")
    public static final SqlColumn<Long> oid = sqlSelectQueryBlock.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_select_query_block.cached_select_list")
    public static final SqlColumn<String> cachedSelectList = sqlSelectQueryBlock.cachedSelectList;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_select_query_block.cached_select_list_hash")
    public static final SqlColumn<String> cachedSelectListHash = sqlSelectQueryBlock.cachedSelectListHash;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_select_query_block.connect_by_oid")
    public static final SqlColumn<Long> connectByOid = sqlSelectQueryBlock.connectByOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_select_query_block.distion_option")
    public static final SqlColumn<Integer> distionOption = sqlSelectQueryBlock.distionOption;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_select_query_block.first_oid")
    public static final SqlColumn<Long> firstOid = sqlSelectQueryBlock.firstOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_select_query_block.for_update_of_size")
    public static final SqlColumn<Integer> forUpdateOfSize = sqlSelectQueryBlock.forUpdateOfSize;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_select_query_block.from_oid")
    public static final SqlColumn<Long> fromOid = sqlSelectQueryBlock.fromOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_select_query_block.group_by_oid")
    public static final SqlColumn<Long> groupByOid = sqlSelectQueryBlock.groupByOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_select_query_block.hints_size")
    public static final SqlColumn<Integer> hintsSize = sqlSelectQueryBlock.hintsSize;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_select_query_block.into_oid")
    public static final SqlColumn<Long> intoOid = sqlSelectQueryBlock.intoOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_select_query_block.is_distinct")
    public static final SqlColumn<Integer> isDistinct = sqlSelectQueryBlock.isDistinct;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_select_query_block.is_for_share")
    public static final SqlColumn<Integer> isForShare = sqlSelectQueryBlock.isForShare;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_select_query_block.is_for_update")
    public static final SqlColumn<Integer> isForUpdate = sqlSelectQueryBlock.isForUpdate;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_select_query_block.is_no_cycle")
    public static final SqlColumn<Integer> isNoCycle = sqlSelectQueryBlock.isNoCycle;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_select_query_block.is_no_wait")
    public static final SqlColumn<Integer> isNoWait = sqlSelectQueryBlock.isNoWait;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_select_query_block.is_prior")
    public static final SqlColumn<Integer> isPrior = sqlSelectQueryBlock.isPrior;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_select_query_block.is_skip_locked")
    public static final SqlColumn<Integer> isSkipLocked = sqlSelectQueryBlock.isSkipLocked;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_select_query_block.limit_oid")
    public static final SqlColumn<Long> limitOid = sqlSelectQueryBlock.limitOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_select_query_block.offset_oid")
    public static final SqlColumn<Long> offsetOid = sqlSelectQueryBlock.offsetOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_select_query_block.order_by_oid")
    public static final SqlColumn<Long> orderByOid = sqlSelectQueryBlock.orderByOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_select_query_block.order_by_siblings_oid")
    public static final SqlColumn<Long> orderBySiblingsOid = sqlSelectQueryBlock.orderBySiblingsOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_select_query_block.start_with_oid")
    public static final SqlColumn<Long> startWithOid = sqlSelectQueryBlock.startWithOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_select_query_block.wait_time_oid")
    public static final SqlColumn<Long> waitTimeOid = sqlSelectQueryBlock.waitTimeOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_select_query_block.where_oid")
    public static final SqlColumn<Long> whereOid = sqlSelectQueryBlock.whereOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_select_query_block")
    public static final class SqlSelectQueryBlock extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<String> cachedSelectList = column("`cached_select_list`", JDBCType.VARCHAR);

        public final SqlColumn<String> cachedSelectListHash = column("`cached_select_list_hash`", JDBCType.VARCHAR);

        public final SqlColumn<Long> connectByOid = column("`connect_by_oid`", JDBCType.BIGINT);

        public final SqlColumn<Integer> distionOption = column("`distion_option`", JDBCType.BIGINT);

        public final SqlColumn<Long> firstOid = column("`first_oid`", JDBCType.BIGINT);

        public final SqlColumn<Integer> forUpdateOfSize = column("`for_update_of_size`", JDBCType.BIGINT);

        public final SqlColumn<Long> fromOid = column("`from_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> groupByOid = column("`group_by_oid`", JDBCType.BIGINT);

        public final SqlColumn<Integer> hintsSize = column("`hints_size`", JDBCType.BIGINT);

        public final SqlColumn<Long> intoOid = column("`into_oid`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isDistinct = column("`is_distinct`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isForShare = column("`is_for_share`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isForUpdate = column("`is_for_update`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isNoCycle = column("`is_no_cycle`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isNoWait = column("`is_no_wait`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isPrior = column("`is_prior`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isSkipLocked = column("`is_skip_locked`", JDBCType.BIGINT);

        public final SqlColumn<Long> limitOid = column("`limit_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> offsetOid = column("`offset_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> orderByOid = column("`order_by_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> orderBySiblingsOid = column("`order_by_siblings_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> startWithOid = column("`start_with_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> waitTimeOid = column("`wait_time_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> whereOid = column("`where_oid`", JDBCType.BIGINT);

        public SqlSelectQueryBlock() {
            super("sql_select_query_block");
        }
    }
}