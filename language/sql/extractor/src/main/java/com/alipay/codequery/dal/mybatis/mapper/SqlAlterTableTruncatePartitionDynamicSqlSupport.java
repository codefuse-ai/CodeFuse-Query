package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SqlAlterTableTruncatePartitionDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_table_truncate_partition")
    public static final SqlAlterTableTruncatePartition sqlAlterTableTruncatePartition = new SqlAlterTableTruncatePartition();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_table_truncate_partition.oid")
    public static final SqlColumn<Long> oid = sqlAlterTableTruncatePartition.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_table_truncate_partition")
    public static final class SqlAlterTableTruncatePartition extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public SqlAlterTableTruncatePartition() {
            super("sql_alter_table_truncate_partition");
        }
    }
}