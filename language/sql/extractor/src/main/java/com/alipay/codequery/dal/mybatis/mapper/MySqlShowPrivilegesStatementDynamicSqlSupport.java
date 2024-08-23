package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class MySqlShowPrivilegesStatementDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_show_privileges_statement")
    public static final MySqlShowPrivilegesStatement mySqlShowPrivilegesStatement = new MySqlShowPrivilegesStatement();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_show_privileges_statement.oid")
    public static final SqlColumn<Long> oid = mySqlShowPrivilegesStatement.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_show_privileges_statement")
    public static final class MySqlShowPrivilegesStatement extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public MySqlShowPrivilegesStatement() {
            super("my_sql_show_privileges_statement");
        }
    }
}