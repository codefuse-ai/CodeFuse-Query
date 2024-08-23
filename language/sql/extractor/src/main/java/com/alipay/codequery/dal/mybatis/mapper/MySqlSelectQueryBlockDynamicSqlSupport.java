package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class MySqlSelectQueryBlockDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_select_query_block")
    public static final MySqlSelectQueryBlock mySqlSelectQueryBlock = new MySqlSelectQueryBlock();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_select_query_block.oid")
    public static final SqlColumn<Long> oid = mySqlSelectQueryBlock.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_select_query_block.cache")
    public static final SqlColumn<Integer> cache = mySqlSelectQueryBlock.cache;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_select_query_block.force_partition_oid")
    public static final SqlColumn<Long> forcePartitionOid = mySqlSelectQueryBlock.forcePartitionOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_select_query_block.hints_size")
    public static final SqlColumn<Integer> hintsSize = mySqlSelectQueryBlock.hintsSize;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_select_query_block.is_big_result")
    public static final SqlColumn<Integer> isBigResult = mySqlSelectQueryBlock.isBigResult;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_select_query_block.is_buffer_result")
    public static final SqlColumn<Integer> isBufferResult = mySqlSelectQueryBlock.isBufferResult;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_select_query_block.is_calc_found_rows")
    public static final SqlColumn<Integer> isCalcFoundRows = mySqlSelectQueryBlock.isCalcFoundRows;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_select_query_block.is_hign_priority")
    public static final SqlColumn<Integer> isHignPriority = mySqlSelectQueryBlock.isHignPriority;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_select_query_block.is_lock_in_share_mode")
    public static final SqlColumn<Integer> isLockInShareMode = mySqlSelectQueryBlock.isLockInShareMode;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_select_query_block.is_small_result")
    public static final SqlColumn<Integer> isSmallResult = mySqlSelectQueryBlock.isSmallResult;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_select_query_block.is_straight_join")
    public static final SqlColumn<Integer> isStraightJoin = mySqlSelectQueryBlock.isStraightJoin;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_select_query_block.procedure_name_oid")
    public static final SqlColumn<Long> procedureNameOid = mySqlSelectQueryBlock.procedureNameOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_select_query_block")
    public static final class MySqlSelectQueryBlock extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Integer> cache = column("`cache`", JDBCType.BIGINT);

        public final SqlColumn<Long> forcePartitionOid = column("`force_partition_oid`", JDBCType.BIGINT);

        public final SqlColumn<Integer> hintsSize = column("`hints_size`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isBigResult = column("`is_big_result`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isBufferResult = column("`is_buffer_result`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isCalcFoundRows = column("`is_calc_found_rows`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isHignPriority = column("`is_hign_priority`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isLockInShareMode = column("`is_lock_in_share_mode`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isSmallResult = column("`is_small_result`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isStraightJoin = column("`is_straight_join`", JDBCType.BIGINT);

        public final SqlColumn<Long> procedureNameOid = column("`procedure_name_oid`", JDBCType.BIGINT);

        public MySqlSelectQueryBlock() {
            super("my_sql_select_query_block");
        }
    }
}