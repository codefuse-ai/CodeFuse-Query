package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class MySqlPartitionByKeyDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_partition_by_key")
    public static final MySqlPartitionByKey mySqlPartitionByKey = new MySqlPartitionByKey();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_partition_by_key.oid")
    public static final SqlColumn<Long> oid = mySqlPartitionByKey.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_partition_by_key.algorithm")
    public static final SqlColumn<Integer> algorithm = mySqlPartitionByKey.algorithm;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_partition_by_key")
    public static final class MySqlPartitionByKey extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Integer> algorithm = column("`algorithm`", JDBCType.BIGINT);

        public MySqlPartitionByKey() {
            super("my_sql_partition_by_key");
        }
    }
}