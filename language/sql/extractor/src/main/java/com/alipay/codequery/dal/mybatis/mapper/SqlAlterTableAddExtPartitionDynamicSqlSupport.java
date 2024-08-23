package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SqlAlterTableAddExtPartitionDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_table_add_ext_partition")
    public static final SqlAlterTableAddExtPartition sqlAlterTableAddExtPartition = new SqlAlterTableAddExtPartition();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_table_add_ext_partition.oid")
    public static final SqlColumn<Long> oid = sqlAlterTableAddExtPartition.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_table_add_ext_partition.ext_partition_oid")
    public static final SqlColumn<Long> extPartitionOid = sqlAlterTableAddExtPartition.extPartitionOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_table_add_ext_partition")
    public static final class SqlAlterTableAddExtPartition extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> extPartitionOid = column("`ext_partition_oid`", JDBCType.BIGINT);

        public SqlAlterTableAddExtPartition() {
            super("sql_alter_table_add_ext_partition");
        }
    }
}