package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class HiveMultiInsertStatementDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: hive_multi_insert_statement")
    public static final HiveMultiInsertStatement hiveMultiInsertStatement = new HiveMultiInsertStatement();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: hive_multi_insert_statement.oid")
    public static final SqlColumn<Long> oid = hiveMultiInsertStatement.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: hive_multi_insert_statement.from_oid")
    public static final SqlColumn<Long> fromOid = hiveMultiInsertStatement.fromOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: hive_multi_insert_statement.with_oid")
    public static final SqlColumn<Long> withOid = hiveMultiInsertStatement.withOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: hive_multi_insert_statement")
    public static final class HiveMultiInsertStatement extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> fromOid = column("`from_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> withOid = column("`with_oid`", JDBCType.BIGINT);

        public HiveMultiInsertStatement() {
            super("hive_multi_insert_statement");
        }
    }
}