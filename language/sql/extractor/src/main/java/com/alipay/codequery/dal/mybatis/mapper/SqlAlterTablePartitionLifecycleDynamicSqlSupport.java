package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SqlAlterTablePartitionLifecycleDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_table_partition_lifecycle")
    public static final SqlAlterTablePartitionLifecycle sqlAlterTablePartitionLifecycle = new SqlAlterTablePartitionLifecycle();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_table_partition_lifecycle.oid")
    public static final SqlColumn<Long> oid = sqlAlterTablePartitionLifecycle.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_table_partition_lifecycle.lifecycle_oid")
    public static final SqlColumn<Long> lifecycleOid = sqlAlterTablePartitionLifecycle.lifecycleOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_table_partition_lifecycle")
    public static final class SqlAlterTablePartitionLifecycle extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> lifecycleOid = column("`lifecycle_oid`", JDBCType.BIGINT);

        public SqlAlterTablePartitionLifecycle() {
            super("sql_alter_table_partition_lifecycle");
        }
    }
}