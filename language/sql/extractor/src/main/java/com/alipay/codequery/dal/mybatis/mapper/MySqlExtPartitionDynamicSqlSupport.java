package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class MySqlExtPartitionDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_ext_partition")
    public static final MySqlExtPartition mySqlExtPartition = new MySqlExtPartition();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_ext_partition.oid")
    public static final SqlColumn<Long> oid = mySqlExtPartition.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_ext_partition.items")
    public static final SqlColumn<String> items = mySqlExtPartition.items;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_ext_partition")
    public static final class MySqlExtPartition extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<String> items = column("`items`", JDBCType.VARCHAR);

        public MySqlExtPartition() {
            super("my_sql_ext_partition");
        }
    }
}