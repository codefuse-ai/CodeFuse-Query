package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class MySqlExecuteStatementDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_execute_statement")
    public static final MySqlExecuteStatement mySqlExecuteStatement = new MySqlExecuteStatement();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_execute_statement.oid")
    public static final SqlColumn<Long> oid = mySqlExecuteStatement.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_execute_statement.statement_name_oid")
    public static final SqlColumn<Long> statementNameOid = mySqlExecuteStatement.statementNameOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_execute_statement")
    public static final class MySqlExecuteStatement extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> statementNameOid = column("`statement_name_oid`", JDBCType.BIGINT);

        public MySqlExecuteStatement() {
            super("my_sql_execute_statement");
        }
    }
}