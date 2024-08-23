package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SqlAlterTableExchangePartitionDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_table_exchange_partition")
    public static final SqlAlterTableExchangePartition sqlAlterTableExchangePartition = new SqlAlterTableExchangePartition();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_table_exchange_partition.oid")
    public static final SqlColumn<Long> oid = sqlAlterTableExchangePartition.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_table_exchange_partition.table_oid")
    public static final SqlColumn<Long> tableOid = sqlAlterTableExchangePartition.tableOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_table_exchange_partition.validation")
    public static final SqlColumn<Integer> validation = sqlAlterTableExchangePartition.validation;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_table_exchange_partition")
    public static final class SqlAlterTableExchangePartition extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> tableOid = column("`table_oid`", JDBCType.BIGINT);

        public final SqlColumn<Integer> validation = column("`validation`", JDBCType.BIGINT);

        public SqlAlterTableExchangePartition() {
            super("sql_alter_table_exchange_partition");
        }
    }
}