package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class MySqlShowSlaveHostsStatementDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_show_slave_hosts_statement")
    public static final MySqlShowSlaveHostsStatement mySqlShowSlaveHostsStatement = new MySqlShowSlaveHostsStatement();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_show_slave_hosts_statement.oid")
    public static final SqlColumn<Long> oid = mySqlShowSlaveHostsStatement.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_show_slave_hosts_statement")
    public static final class MySqlShowSlaveHostsStatement extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public MySqlShowSlaveHostsStatement() {
            super("my_sql_show_slave_hosts_statement");
        }
    }
}