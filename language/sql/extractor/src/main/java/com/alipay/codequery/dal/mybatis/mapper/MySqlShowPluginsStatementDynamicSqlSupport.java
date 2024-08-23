package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class MySqlShowPluginsStatementDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_show_plugins_statement")
    public static final MySqlShowPluginsStatement mySqlShowPluginsStatement = new MySqlShowPluginsStatement();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_show_plugins_statement.oid")
    public static final SqlColumn<Long> oid = mySqlShowPluginsStatement.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_show_plugins_statement")
    public static final class MySqlShowPluginsStatement extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public MySqlShowPluginsStatement() {
            super("my_sql_show_plugins_statement");
        }
    }
}