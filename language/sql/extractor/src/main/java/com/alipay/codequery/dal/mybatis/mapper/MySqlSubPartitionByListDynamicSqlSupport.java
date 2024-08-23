package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class MySqlSubPartitionByListDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_sub_partition_by_list")
    public static final MySqlSubPartitionByList mySqlSubPartitionByList = new MySqlSubPartitionByList();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_sub_partition_by_list.oid")
    public static final SqlColumn<Long> oid = mySqlSubPartitionByList.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_sub_partition_by_list")
    public static final class MySqlSubPartitionByList extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public MySqlSubPartitionByList() {
            super("my_sql_sub_partition_by_list");
        }
    }
}