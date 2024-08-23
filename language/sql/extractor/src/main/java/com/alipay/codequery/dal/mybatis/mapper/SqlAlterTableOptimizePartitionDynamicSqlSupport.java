package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SqlAlterTableOptimizePartitionDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_table_optimize_partition")
    public static final SqlAlterTableOptimizePartition sqlAlterTableOptimizePartition = new SqlAlterTableOptimizePartition();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_table_optimize_partition.oid")
    public static final SqlColumn<Long> oid = sqlAlterTableOptimizePartition.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_table_optimize_partition")
    public static final class SqlAlterTableOptimizePartition extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public SqlAlterTableOptimizePartition() {
            super("sql_alter_table_optimize_partition");
        }
    }
}