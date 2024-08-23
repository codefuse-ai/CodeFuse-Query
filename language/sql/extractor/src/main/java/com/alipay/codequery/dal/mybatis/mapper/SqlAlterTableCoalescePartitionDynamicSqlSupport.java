package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SqlAlterTableCoalescePartitionDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_table_coalesce_partition")
    public static final SqlAlterTableCoalescePartition sqlAlterTableCoalescePartition = new SqlAlterTableCoalescePartition();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_table_coalesce_partition.oid")
    public static final SqlColumn<Long> oid = sqlAlterTableCoalescePartition.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_table_coalesce_partition.count_oid")
    public static final SqlColumn<Long> countOid = sqlAlterTableCoalescePartition.countOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_table_coalesce_partition")
    public static final class SqlAlterTableCoalescePartition extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> countOid = column("`count_oid`", JDBCType.BIGINT);

        public SqlAlterTableCoalescePartition() {
            super("sql_alter_table_coalesce_partition");
        }
    }
}