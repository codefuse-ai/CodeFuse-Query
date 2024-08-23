package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SqlServerSetTransactionIsolationLevelStatementDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_server_set_transaction_isolation_level_statement")
    public static final SqlServerSetTransactionIsolationLevelStatement sqlServerSetTransactionIsolationLevelStatement = new SqlServerSetTransactionIsolationLevelStatement();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_server_set_transaction_isolation_level_statement.oid")
    public static final SqlColumn<Long> oid = sqlServerSetTransactionIsolationLevelStatement.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_server_set_transaction_isolation_level_statement.level")
    public static final SqlColumn<String> level = sqlServerSetTransactionIsolationLevelStatement.level;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_server_set_transaction_isolation_level_statement")
    public static final class SqlServerSetTransactionIsolationLevelStatement extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<String> level = column("`level`", JDBCType.VARCHAR);

        public SqlServerSetTransactionIsolationLevelStatement() {
            super("sql_server_set_transaction_isolation_level_statement");
        }
    }
}