package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class MySqlLockTableStatementDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_lock_table_statement")
    public static final MySqlLockTableStatement mySqlLockTableStatement = new MySqlLockTableStatement();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_lock_table_statement.oid")
    public static final SqlColumn<Long> oid = mySqlLockTableStatement.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_lock_table_statement.items")
    public static final SqlColumn<String> items = mySqlLockTableStatement.items;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_lock_table_statement")
    public static final class MySqlLockTableStatement extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<String> items = column("`items`", JDBCType.VARCHAR);

        public MySqlLockTableStatement() {
            super("my_sql_lock_table_statement");
        }
    }
}