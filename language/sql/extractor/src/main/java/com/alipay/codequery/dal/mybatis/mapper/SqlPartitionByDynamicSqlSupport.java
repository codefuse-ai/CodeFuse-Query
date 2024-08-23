package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SqlPartitionByDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_partition_by")
    public static final SqlPartitionBy sqlPartitionBy = new SqlPartitionBy();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_partition_by.oid")
    public static final SqlColumn<Long> oid = sqlPartitionBy.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_partition_by.is_linear")
    public static final SqlColumn<Integer> isLinear = sqlPartitionBy.isLinear;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_partition_by.lifecycle_oid")
    public static final SqlColumn<Long> lifecycleOid = sqlPartitionBy.lifecycleOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_partition_by.partitions_count_oid")
    public static final SqlColumn<Long> partitionsCountOid = sqlPartitionBy.partitionsCountOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_partition_by.sub_partition_by_oid")
    public static final SqlColumn<Long> subPartitionByOid = sqlPartitionBy.subPartitionByOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_partition_by")
    public static final class SqlPartitionBy extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isLinear = column("`is_linear`", JDBCType.BIGINT);

        public final SqlColumn<Long> lifecycleOid = column("`lifecycle_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> partitionsCountOid = column("`partitions_count_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> subPartitionByOid = column("`sub_partition_by_oid`", JDBCType.BIGINT);

        public SqlPartitionBy() {
            super("sql_partition_by");
        }
    }
}