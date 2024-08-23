package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SqlAlterTableRenamePartitionDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_table_rename_partition")
    public static final SqlAlterTableRenamePartition sqlAlterTableRenamePartition = new SqlAlterTableRenamePartition();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_table_rename_partition.oid")
    public static final SqlColumn<Long> oid = sqlAlterTableRenamePartition.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_table_rename_partition.is_if_not_exists")
    public static final SqlColumn<Integer> isIfNotExists = sqlAlterTableRenamePartition.isIfNotExists;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_table_rename_partition")
    public static final class SqlAlterTableRenamePartition extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isIfNotExists = column("`is_if_not_exists`", JDBCType.BIGINT);

        public SqlAlterTableRenamePartition() {
            super("sql_alter_table_rename_partition");
        }
    }
}