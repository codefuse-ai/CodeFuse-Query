package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class PartitionExtensionClauseDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: partition_extension_clause")
    public static final PartitionExtensionClause partitionExtensionClause = new PartitionExtensionClause();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: partition_extension_clause.oid")
    public static final SqlColumn<Long> oid = partitionExtensionClause.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: partition_extension_clause.is_sub_partition")
    public static final SqlColumn<Integer> isSubPartition = partitionExtensionClause.isSubPartition;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: partition_extension_clause.partition_oid")
    public static final SqlColumn<Long> partitionOid = partitionExtensionClause.partitionOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: partition_extension_clause")
    public static final class PartitionExtensionClause extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isSubPartition = column("`is_sub_partition`", JDBCType.BIGINT);

        public final SqlColumn<Long> partitionOid = column("`partition_oid`", JDBCType.BIGINT);

        public PartitionExtensionClause() {
            super("partition_extension_clause");
        }
    }
}