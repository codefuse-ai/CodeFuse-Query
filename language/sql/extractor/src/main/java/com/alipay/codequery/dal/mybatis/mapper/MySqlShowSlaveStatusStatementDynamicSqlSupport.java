package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class MySqlShowSlaveStatusStatementDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_show_slave_status_statement")
    public static final MySqlShowSlaveStatusStatement mySqlShowSlaveStatusStatement = new MySqlShowSlaveStatusStatement();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_show_slave_status_statement.oid")
    public static final SqlColumn<Long> oid = mySqlShowSlaveStatusStatement.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_show_slave_status_statement")
    public static final class MySqlShowSlaveStatusStatement extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public MySqlShowSlaveStatusStatement() {
            super("my_sql_show_slave_status_statement");
        }
    }
}