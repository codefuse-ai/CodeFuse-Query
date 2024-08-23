package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class MySqlSubPartitionByValueDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_sub_partition_by_value")
    public static final MySqlSubPartitionByValue mySqlSubPartitionByValue = new MySqlSubPartitionByValue();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_sub_partition_by_value.oid")
    public static final SqlColumn<Long> oid = mySqlSubPartitionByValue.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_sub_partition_by_value")
    public static final class MySqlSubPartitionByValue extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public MySqlSubPartitionByValue() {
            super("my_sql_sub_partition_by_value");
        }
    }
}