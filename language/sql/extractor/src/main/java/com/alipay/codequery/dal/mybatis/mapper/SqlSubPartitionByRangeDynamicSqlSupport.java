package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SqlSubPartitionByRangeDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_sub_partition_by_range")
    public static final SqlSubPartitionByRange sqlSubPartitionByRange = new SqlSubPartitionByRange();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_sub_partition_by_range.oid")
    public static final SqlColumn<Long> oid = sqlSubPartitionByRange.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_sub_partition_by_range")
    public static final class SqlSubPartitionByRange extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public SqlSubPartitionByRange() {
            super("sql_sub_partition_by_range");
        }
    }
}