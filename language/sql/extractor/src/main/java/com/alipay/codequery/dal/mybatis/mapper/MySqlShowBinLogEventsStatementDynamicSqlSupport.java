package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class MySqlShowBinLogEventsStatementDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_show_bin_log_events_statement")
    public static final MySqlShowBinLogEventsStatement mySqlShowBinLogEventsStatement = new MySqlShowBinLogEventsStatement();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_show_bin_log_events_statement.oid")
    public static final SqlColumn<Long> oid = mySqlShowBinLogEventsStatement.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_show_bin_log_events_statement.from_oid")
    public static final SqlColumn<Long> fromOid = mySqlShowBinLogEventsStatement.fromOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_show_bin_log_events_statement.in_oid")
    public static final SqlColumn<Long> inOid = mySqlShowBinLogEventsStatement.inOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_show_bin_log_events_statement.limit_oid")
    public static final SqlColumn<Long> limitOid = mySqlShowBinLogEventsStatement.limitOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_show_bin_log_events_statement")
    public static final class MySqlShowBinLogEventsStatement extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> fromOid = column("`from_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> inOid = column("`in_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> limitOid = column("`limit_oid`", JDBCType.BIGINT);

        public MySqlShowBinLogEventsStatement() {
            super("my_sql_show_bin_log_events_statement");
        }
    }
}