package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SqlServerWaitForStatementDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_server_wait_for_statement")
    public static final SqlServerWaitForStatement sqlServerWaitForStatement = new SqlServerWaitForStatement();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_server_wait_for_statement.oid")
    public static final SqlColumn<Long> oid = sqlServerWaitForStatement.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_server_wait_for_statement.delay_oid")
    public static final SqlColumn<Long> delayOid = sqlServerWaitForStatement.delayOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_server_wait_for_statement.statement_oid")
    public static final SqlColumn<Long> statementOid = sqlServerWaitForStatement.statementOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_server_wait_for_statement.time_oid")
    public static final SqlColumn<Long> timeOid = sqlServerWaitForStatement.timeOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_server_wait_for_statement.timeout_oid")
    public static final SqlColumn<Long> timeoutOid = sqlServerWaitForStatement.timeoutOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_server_wait_for_statement")
    public static final class SqlServerWaitForStatement extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> delayOid = column("`delay_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> statementOid = column("`statement_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> timeOid = column("`time_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> timeoutOid = column("`timeout_oid`", JDBCType.BIGINT);

        public SqlServerWaitForStatement() {
            super("sql_server_wait_for_statement");
        }
    }
}