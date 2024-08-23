package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class HiveInsertStatementDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: hive_insert_statement")
    public static final HiveInsertStatement hiveInsertStatement = new HiveInsertStatement();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: hive_insert_statement.oid")
    public static final SqlColumn<Long> oid = hiveInsertStatement.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: hive_insert_statement.is_if_not_exists")
    public static final SqlColumn<Integer> isIfNotExists = hiveInsertStatement.isIfNotExists;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: hive_insert_statement")
    public static final class HiveInsertStatement extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isIfNotExists = column("`is_if_not_exists`", JDBCType.BIGINT);

        public HiveInsertStatement() {
            super("hive_insert_statement");
        }
    }
}