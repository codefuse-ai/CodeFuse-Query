package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SqlPartitionByRangeDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_partition_by_range")
    public static final SqlPartitionByRange sqlPartitionByRange = new SqlPartitionByRange();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_partition_by_range.oid")
    public static final SqlColumn<Long> oid = sqlPartitionByRange.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_partition_by_range.expire_after_oid")
    public static final SqlColumn<Long> expireAfterOid = sqlPartitionByRange.expireAfterOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_partition_by_range.interval_oid")
    public static final SqlColumn<Long> intervalOid = sqlPartitionByRange.intervalOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_partition_by_range.is_columns")
    public static final SqlColumn<Integer> isColumns = sqlPartitionByRange.isColumns;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_partition_by_range.is_disable_schedule")
    public static final SqlColumn<Integer> isDisableSchedule = sqlPartitionByRange.isDisableSchedule;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_partition_by_range.pivot_date_expr_oid")
    public static final SqlColumn<Long> pivotDateExprOid = sqlPartitionByRange.pivotDateExprOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_partition_by_range.pre_allocate_oid")
    public static final SqlColumn<Long> preAllocateOid = sqlPartitionByRange.preAllocateOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_partition_by_range.start_with_oid")
    public static final SqlColumn<Long> startWithOid = sqlPartitionByRange.startWithOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_partition_by_range")
    public static final class SqlPartitionByRange extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> expireAfterOid = column("`expire_after_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> intervalOid = column("`interval_oid`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isColumns = column("`is_columns`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isDisableSchedule = column("`is_disable_schedule`", JDBCType.BIGINT);

        public final SqlColumn<Long> pivotDateExprOid = column("`pivot_date_expr_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> preAllocateOid = column("`pre_allocate_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> startWithOid = column("`start_with_oid`", JDBCType.BIGINT);

        public SqlPartitionByRange() {
            super("sql_partition_by_range");
        }
    }
}