package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SqlAlterTablePartitionCountDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_table_partition_count")
    public static final SqlAlterTablePartitionCount sqlAlterTablePartitionCount = new SqlAlterTablePartitionCount();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_table_partition_count.oid")
    public static final SqlColumn<Long> oid = sqlAlterTablePartitionCount.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_table_partition_count.count_oid")
    public static final SqlColumn<Long> countOid = sqlAlterTablePartitionCount.countOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_table_partition_count")
    public static final class SqlAlterTablePartitionCount extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> countOid = column("`count_oid`", JDBCType.BIGINT);

        public SqlAlterTablePartitionCount() {
            super("sql_alter_table_partition_count");
        }
    }
}