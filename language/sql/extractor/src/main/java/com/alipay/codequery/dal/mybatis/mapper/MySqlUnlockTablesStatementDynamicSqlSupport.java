package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class MySqlUnlockTablesStatementDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_unlock_tables_statement")
    public static final MySqlUnlockTablesStatement mySqlUnlockTablesStatement = new MySqlUnlockTablesStatement();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_unlock_tables_statement.oid")
    public static final SqlColumn<Long> oid = mySqlUnlockTablesStatement.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_unlock_tables_statement")
    public static final class MySqlUnlockTablesStatement extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public MySqlUnlockTablesStatement() {
            super("my_sql_unlock_tables_statement");
        }
    }
}