package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SqlAlterTableDropPartitionDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_table_drop_partition")
    public static final SqlAlterTableDropPartition sqlAlterTableDropPartition = new SqlAlterTableDropPartition();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_table_drop_partition.oid")
    public static final SqlColumn<Long> oid = sqlAlterTableDropPartition.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_table_drop_partition.is_if_exists")
    public static final SqlColumn<Integer> isIfExists = sqlAlterTableDropPartition.isIfExists;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_table_drop_partition.is_purge")
    public static final SqlColumn<Integer> isPurge = sqlAlterTableDropPartition.isPurge;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_table_drop_partition")
    public static final class SqlAlterTableDropPartition extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isIfExists = column("`is_if_exists`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isPurge = column("`is_purge`", JDBCType.BIGINT);

        public SqlAlterTableDropPartition() {
            super("sql_alter_table_drop_partition");
        }
    }
}