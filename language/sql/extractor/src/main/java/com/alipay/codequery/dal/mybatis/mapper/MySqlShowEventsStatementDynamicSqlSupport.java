package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class MySqlShowEventsStatementDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_show_events_statement")
    public static final MySqlShowEventsStatement mySqlShowEventsStatement = new MySqlShowEventsStatement();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_show_events_statement.oid")
    public static final SqlColumn<Long> oid = mySqlShowEventsStatement.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_show_events_statement.like_oid")
    public static final SqlColumn<Long> likeOid = mySqlShowEventsStatement.likeOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_show_events_statement.schema_oid")
    public static final SqlColumn<Long> schemaOid = mySqlShowEventsStatement.schemaOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_show_events_statement.where_oid")
    public static final SqlColumn<Long> whereOid = mySqlShowEventsStatement.whereOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_show_events_statement")
    public static final class MySqlShowEventsStatement extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> likeOid = column("`like_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> schemaOid = column("`schema_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> whereOid = column("`where_oid`", JDBCType.BIGINT);

        public MySqlShowEventsStatement() {
            super("my_sql_show_events_statement");
        }
    }
}