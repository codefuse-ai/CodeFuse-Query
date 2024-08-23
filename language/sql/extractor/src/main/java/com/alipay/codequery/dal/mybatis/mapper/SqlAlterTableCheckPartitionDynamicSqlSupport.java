package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SqlAlterTableCheckPartitionDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_table_check_partition")
    public static final SqlAlterTableCheckPartition sqlAlterTableCheckPartition = new SqlAlterTableCheckPartition();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_table_check_partition.oid")
    public static final SqlColumn<Long> oid = sqlAlterTableCheckPartition.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_table_check_partition")
    public static final class SqlAlterTableCheckPartition extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public SqlAlterTableCheckPartition() {
            super("sql_alter_table_check_partition");
        }
    }
}