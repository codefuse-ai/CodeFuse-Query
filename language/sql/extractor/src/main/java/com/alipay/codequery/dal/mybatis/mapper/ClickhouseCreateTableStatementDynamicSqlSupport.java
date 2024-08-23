package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class ClickhouseCreateTableStatementDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: clickhouse_create_table_statement")
    public static final ClickhouseCreateTableStatement clickhouseCreateTableStatement = new ClickhouseCreateTableStatement();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: clickhouse_create_table_statement.oid")
    public static final SqlColumn<Long> oid = clickhouseCreateTableStatement.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: clickhouse_create_table_statement.order_by_oid")
    public static final SqlColumn<Long> orderByOid = clickhouseCreateTableStatement.orderByOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: clickhouse_create_table_statement.partition_by_oid")
    public static final SqlColumn<Long> partitionByOid = clickhouseCreateTableStatement.partitionByOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: clickhouse_create_table_statement.sample_by_oid")
    public static final SqlColumn<Long> sampleByOid = clickhouseCreateTableStatement.sampleByOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: clickhouse_create_table_statement")
    public static final class ClickhouseCreateTableStatement extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> orderByOid = column("`order_by_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> partitionByOid = column("`partition_by_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> sampleByOid = column("`sample_by_oid`", JDBCType.BIGINT);

        public ClickhouseCreateTableStatement() {
            super("clickhouse_create_table_statement");
        }
    }
}