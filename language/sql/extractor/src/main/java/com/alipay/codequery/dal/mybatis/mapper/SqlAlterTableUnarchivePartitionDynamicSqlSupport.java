package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SqlAlterTableUnarchivePartitionDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_table_unarchive_partition")
    public static final SqlAlterTableUnarchivePartition sqlAlterTableUnarchivePartition = new SqlAlterTableUnarchivePartition();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_table_unarchive_partition.oid")
    public static final SqlColumn<Long> oid = sqlAlterTableUnarchivePartition.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_table_unarchive_partition")
    public static final class SqlAlterTableUnarchivePartition extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public SqlAlterTableUnarchivePartition() {
            super("sql_alter_table_unarchive_partition");
        }
    }
}