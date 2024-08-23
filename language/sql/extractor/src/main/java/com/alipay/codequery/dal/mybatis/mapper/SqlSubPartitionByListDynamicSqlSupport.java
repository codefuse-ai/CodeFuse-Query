package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SqlSubPartitionByListDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_sub_partition_by_list")
    public static final SqlSubPartitionByList sqlSubPartitionByList = new SqlSubPartitionByList();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_sub_partition_by_list.oid")
    public static final SqlColumn<Long> oid = sqlSubPartitionByList.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_sub_partition_by_list.column_oid")
    public static final SqlColumn<Long> columnOid = sqlSubPartitionByList.columnOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_sub_partition_by_list")
    public static final class SqlSubPartitionByList extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> columnOid = column("`column_oid`", JDBCType.BIGINT);

        public SqlSubPartitionByList() {
            super("sql_sub_partition_by_list");
        }
    }
}