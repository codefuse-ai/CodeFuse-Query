package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SqlPartitionByListDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_partition_by_list")
    public static final SqlPartitionByList sqlPartitionByList = new SqlPartitionByList();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_partition_by_list.oid")
    public static final SqlColumn<Long> oid = sqlPartitionByList.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_partition_by_list")
    public static final class SqlPartitionByList extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public SqlPartitionByList() {
            super("sql_partition_by_list");
        }
    }
}