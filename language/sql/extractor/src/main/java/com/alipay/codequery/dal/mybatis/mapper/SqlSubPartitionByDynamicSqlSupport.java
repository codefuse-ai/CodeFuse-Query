package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SqlSubPartitionByDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_sub_partition_by")
    public static final SqlSubPartitionBy sqlSubPartitionBy = new SqlSubPartitionBy();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_sub_partition_by.oid")
    public static final SqlColumn<Long> oid = sqlSubPartitionBy.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_sub_partition_by.is_linear")
    public static final SqlColumn<Integer> isLinear = sqlSubPartitionBy.isLinear;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_sub_partition_by.lifecycle_oid")
    public static final SqlColumn<Long> lifecycleOid = sqlSubPartitionBy.lifecycleOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_sub_partition_by.sub_partitions_count_oid")
    public static final SqlColumn<Long> subPartitionsCountOid = sqlSubPartitionBy.subPartitionsCountOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_sub_partition_by")
    public static final class SqlSubPartitionBy extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isLinear = column("`is_linear`", JDBCType.BIGINT);

        public final SqlColumn<Long> lifecycleOid = column("`lifecycle_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> subPartitionsCountOid = column("`sub_partitions_count_oid`", JDBCType.BIGINT);

        public SqlSubPartitionBy() {
            super("sql_sub_partition_by");
        }
    }
}