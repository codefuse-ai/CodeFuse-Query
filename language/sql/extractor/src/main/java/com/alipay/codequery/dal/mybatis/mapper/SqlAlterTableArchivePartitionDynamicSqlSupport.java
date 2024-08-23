package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SqlAlterTableArchivePartitionDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_table_archive_partition")
    public static final SqlAlterTableArchivePartition sqlAlterTableArchivePartition = new SqlAlterTableArchivePartition();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_table_archive_partition.oid")
    public static final SqlColumn<Long> oid = sqlAlterTableArchivePartition.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_table_archive_partition")
    public static final class SqlAlterTableArchivePartition extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public SqlAlterTableArchivePartition() {
            super("sql_alter_table_archive_partition");
        }
    }
}