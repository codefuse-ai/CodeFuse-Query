package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SqlAlterTableSubpartitionAvailablePartitionNumDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_table_subpartition_available_partition_num")
    public static final SqlAlterTableSubpartitionAvailablePartitionNum sqlAlterTableSubpartitionAvailablePartitionNum = new SqlAlterTableSubpartitionAvailablePartitionNum();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_table_subpartition_available_partition_num.oid")
    public static final SqlColumn<Long> oid = sqlAlterTableSubpartitionAvailablePartitionNum.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_table_subpartition_available_partition_num.number_oid")
    public static final SqlColumn<Long> numberOid = sqlAlterTableSubpartitionAvailablePartitionNum.numberOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_table_subpartition_available_partition_num")
    public static final class SqlAlterTableSubpartitionAvailablePartitionNum extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> numberOid = column("`number_oid`", JDBCType.BIGINT);

        public SqlAlterTableSubpartitionAvailablePartitionNum() {
            super("sql_alter_table_subpartition_available_partition_num");
        }
    }
}