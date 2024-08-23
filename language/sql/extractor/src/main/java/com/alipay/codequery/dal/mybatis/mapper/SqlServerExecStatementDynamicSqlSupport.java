package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SqlServerExecStatementDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_server_exec_statement")
    public static final SqlServerExecStatement sqlServerExecStatement = new SqlServerExecStatement();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_server_exec_statement.oid")
    public static final SqlColumn<Long> oid = sqlServerExecStatement.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_server_exec_statement.module_name_oid")
    public static final SqlColumn<Long> moduleNameOid = sqlServerExecStatement.moduleNameOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_server_exec_statement.parameters")
    public static final SqlColumn<String> parameters = sqlServerExecStatement.parameters;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_server_exec_statement.return_status_oid")
    public static final SqlColumn<Long> returnStatusOid = sqlServerExecStatement.returnStatusOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_server_exec_statement")
    public static final class SqlServerExecStatement extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> moduleNameOid = column("`module_name_oid`", JDBCType.BIGINT);

        public final SqlColumn<String> parameters = column("`parameters`", JDBCType.VARCHAR);

        public final SqlColumn<Long> returnStatusOid = column("`return_status_oid`", JDBCType.BIGINT);

        public SqlServerExecStatement() {
            super("sql_server_exec_statement");
        }
    }
}