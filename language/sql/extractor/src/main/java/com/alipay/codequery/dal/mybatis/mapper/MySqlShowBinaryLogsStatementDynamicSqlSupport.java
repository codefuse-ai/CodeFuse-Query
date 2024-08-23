package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class MySqlShowBinaryLogsStatementDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_show_binary_logs_statement")
    public static final MySqlShowBinaryLogsStatement mySqlShowBinaryLogsStatement = new MySqlShowBinaryLogsStatement();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_show_binary_logs_statement.oid")
    public static final SqlColumn<Long> oid = mySqlShowBinaryLogsStatement.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_show_binary_logs_statement")
    public static final class MySqlShowBinaryLogsStatement extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public MySqlShowBinaryLogsStatement() {
            super("my_sql_show_binary_logs_statement");
        }
    }
}