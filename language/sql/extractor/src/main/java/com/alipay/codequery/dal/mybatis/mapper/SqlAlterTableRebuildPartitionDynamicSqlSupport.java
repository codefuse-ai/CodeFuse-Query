package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SqlAlterTableRebuildPartitionDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_table_rebuild_partition")
    public static final SqlAlterTableRebuildPartition sqlAlterTableRebuildPartition = new SqlAlterTableRebuildPartition();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_table_rebuild_partition.oid")
    public static final SqlColumn<Long> oid = sqlAlterTableRebuildPartition.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_table_rebuild_partition")
    public static final class SqlAlterTableRebuildPartition extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public SqlAlterTableRebuildPartition() {
            super("sql_alter_table_rebuild_partition");
        }
    }
}