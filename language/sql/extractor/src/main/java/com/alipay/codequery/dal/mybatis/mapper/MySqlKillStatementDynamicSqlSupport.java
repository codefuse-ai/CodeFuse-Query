package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class MySqlKillStatementDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_kill_statement")
    public static final MySqlKillStatement mySqlKillStatement = new MySqlKillStatement();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_kill_statement.oid")
    public static final SqlColumn<Long> oid = mySqlKillStatement.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_kill_statement.thread_id_oid")
    public static final SqlColumn<Long> threadIdOid = mySqlKillStatement.threadIdOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_kill_statement.type")
    public static final SqlColumn<String> type = mySqlKillStatement.type;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_kill_statement")
    public static final class MySqlKillStatement extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> threadIdOid = column("`thread_id_oid`", JDBCType.BIGINT);

        public final SqlColumn<String> type = column("`type`", JDBCType.VARCHAR);

        public MySqlKillStatement() {
            super("my_sql_kill_statement");
        }
    }
}