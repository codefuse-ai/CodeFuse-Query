package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class BlinkCreateTableStatementDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: blink_create_table_statement")
    public static final BlinkCreateTableStatement blinkCreateTableStatement = new BlinkCreateTableStatement();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: blink_create_table_statement.oid")
    public static final SqlColumn<Long> oid = blinkCreateTableStatement.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: blink_create_table_statement.period_for_oid")
    public static final SqlColumn<Long> periodForOid = blinkCreateTableStatement.periodForOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: blink_create_table_statement")
    public static final class BlinkCreateTableStatement extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> periodForOid = column("`period_for_oid`", JDBCType.BIGINT);

        public BlinkCreateTableStatement() {
            super("blink_create_table_statement");
        }
    }
}