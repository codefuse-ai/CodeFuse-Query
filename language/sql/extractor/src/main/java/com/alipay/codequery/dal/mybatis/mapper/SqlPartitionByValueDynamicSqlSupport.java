package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SqlPartitionByValueDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_partition_by_value")
    public static final SqlPartitionByValue sqlPartitionByValue = new SqlPartitionByValue();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_partition_by_value.oid")
    public static final SqlColumn<Long> oid = sqlPartitionByValue.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_partition_by_value")
    public static final class SqlPartitionByValue extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public SqlPartitionByValue() {
            super("sql_partition_by_value");
        }
    }
}