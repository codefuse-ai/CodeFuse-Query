package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class MySqlShowCreateEventStatementDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_show_create_event_statement")
    public static final MySqlShowCreateEventStatement mySqlShowCreateEventStatement = new MySqlShowCreateEventStatement();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_show_create_event_statement.oid")
    public static final SqlColumn<Long> oid = mySqlShowCreateEventStatement.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_show_create_event_statement.event_name_oid")
    public static final SqlColumn<Long> eventNameOid = mySqlShowCreateEventStatement.eventNameOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_show_create_event_statement")
    public static final class MySqlShowCreateEventStatement extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> eventNameOid = column("`event_name_oid`", JDBCType.BIGINT);

        public MySqlShowCreateEventStatement() {
            super("my_sql_show_create_event_statement");
        }
    }
}