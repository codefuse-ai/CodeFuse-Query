package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SqlAlterTableDiscardPartitionDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_table_discard_partition")
    public static final SqlAlterTableDiscardPartition sqlAlterTableDiscardPartition = new SqlAlterTableDiscardPartition();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_table_discard_partition.oid")
    public static final SqlColumn<Long> oid = sqlAlterTableDiscardPartition.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_table_discard_partition.is_tablespace")
    public static final SqlColumn<Integer> isTablespace = sqlAlterTableDiscardPartition.isTablespace;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_table_discard_partition")
    public static final class SqlAlterTableDiscardPartition extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isTablespace = column("`is_tablespace`", JDBCType.BIGINT);

        public SqlAlterTableDiscardPartition() {
            super("sql_alter_table_discard_partition");
        }
    }
}