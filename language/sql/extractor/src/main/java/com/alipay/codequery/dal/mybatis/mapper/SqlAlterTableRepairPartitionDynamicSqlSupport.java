package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SqlAlterTableRepairPartitionDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_table_repair_partition")
    public static final SqlAlterTableRepairPartition sqlAlterTableRepairPartition = new SqlAlterTableRepairPartition();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_table_repair_partition.oid")
    public static final SqlColumn<Long> oid = sqlAlterTableRepairPartition.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_table_repair_partition")
    public static final class SqlAlterTableRepairPartition extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public SqlAlterTableRepairPartition() {
            super("sql_alter_table_repair_partition");
        }
    }
}