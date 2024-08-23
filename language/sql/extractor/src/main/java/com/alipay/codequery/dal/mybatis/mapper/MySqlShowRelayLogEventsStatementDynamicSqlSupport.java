package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class MySqlShowRelayLogEventsStatementDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_show_relay_log_events_statement")
    public static final MySqlShowRelayLogEventsStatement mySqlShowRelayLogEventsStatement = new MySqlShowRelayLogEventsStatement();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_show_relay_log_events_statement.oid")
    public static final SqlColumn<Long> oid = mySqlShowRelayLogEventsStatement.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_show_relay_log_events_statement.from_oid")
    public static final SqlColumn<Long> fromOid = mySqlShowRelayLogEventsStatement.fromOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_show_relay_log_events_statement.limit_oid")
    public static final SqlColumn<Long> limitOid = mySqlShowRelayLogEventsStatement.limitOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_show_relay_log_events_statement.log_name_oid")
    public static final SqlColumn<Long> logNameOid = mySqlShowRelayLogEventsStatement.logNameOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_show_relay_log_events_statement")
    public static final class MySqlShowRelayLogEventsStatement extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> fromOid = column("`from_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> limitOid = column("`limit_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> logNameOid = column("`log_name_oid`", JDBCType.BIGINT);

        public MySqlShowRelayLogEventsStatement() {
            super("my_sql_show_relay_log_events_statement");
        }
    }
}