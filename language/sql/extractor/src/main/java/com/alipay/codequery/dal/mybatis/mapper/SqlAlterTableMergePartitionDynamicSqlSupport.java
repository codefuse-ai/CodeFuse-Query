package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SqlAlterTableMergePartitionDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_table_merge_partition")
    public static final SqlAlterTableMergePartition sqlAlterTableMergePartition = new SqlAlterTableMergePartition();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_table_merge_partition.oid")
    public static final SqlColumn<Long> oid = sqlAlterTableMergePartition.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_table_merge_partition.is_if_exists")
    public static final SqlColumn<Integer> isIfExists = sqlAlterTableMergePartition.isIfExists;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_table_merge_partition.is_purge")
    public static final SqlColumn<Integer> isPurge = sqlAlterTableMergePartition.isPurge;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_table_merge_partition.overwrite_partition_oid")
    public static final SqlColumn<Long> overwritePartitionOid = sqlAlterTableMergePartition.overwritePartitionOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_table_merge_partition")
    public static final class SqlAlterTableMergePartition extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isIfExists = column("`is_if_exists`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isPurge = column("`is_purge`", JDBCType.BIGINT);

        public final SqlColumn<Long> overwritePartitionOid = column("`overwrite_partition_oid`", JDBCType.BIGINT);

        public SqlAlterTableMergePartition() {
            super("sql_alter_table_merge_partition");
        }
    }
}