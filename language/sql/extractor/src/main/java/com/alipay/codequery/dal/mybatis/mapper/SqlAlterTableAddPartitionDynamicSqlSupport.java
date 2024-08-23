package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SqlAlterTableAddPartitionDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_table_add_partition")
    public static final SqlAlterTableAddPartition sqlAlterTableAddPartition = new SqlAlterTableAddPartition();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_table_add_partition.oid")
    public static final SqlColumn<Long> oid = sqlAlterTableAddPartition.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_table_add_partition.is_if_not_exists")
    public static final SqlColumn<Integer> isIfNotExists = sqlAlterTableAddPartition.isIfNotExists;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_table_add_partition.location_oid")
    public static final SqlColumn<Long> locationOid = sqlAlterTableAddPartition.locationOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_table_add_partition.partition_count_oid")
    public static final SqlColumn<Long> partitionCountOid = sqlAlterTableAddPartition.partitionCountOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_table_add_partition")
    public static final class SqlAlterTableAddPartition extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isIfNotExists = column("`is_if_not_exists`", JDBCType.BIGINT);

        public final SqlColumn<Long> locationOid = column("`location_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> partitionCountOid = column("`partition_count_oid`", JDBCType.BIGINT);

        public SqlAlterTableAddPartition() {
            super("sql_alter_table_add_partition");
        }
    }
}