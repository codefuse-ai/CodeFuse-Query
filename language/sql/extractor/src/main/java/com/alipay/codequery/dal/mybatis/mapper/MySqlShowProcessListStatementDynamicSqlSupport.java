package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class MySqlShowProcessListStatementDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_show_process_list_statement")
    public static final MySqlShowProcessListStatement mySqlShowProcessListStatement = new MySqlShowProcessListStatement();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_show_process_list_statement.oid")
    public static final SqlColumn<Long> oid = mySqlShowProcessListStatement.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_show_process_list_statement")
    public static final class MySqlShowProcessListStatement extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public MySqlShowProcessListStatement() {
            super("my_sql_show_process_list_statement");
        }
    }
}