package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SqlScriptCommitStatementDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_script_commit_statement")
    public static final SqlScriptCommitStatement sqlScriptCommitStatement = new SqlScriptCommitStatement();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_script_commit_statement.oid")
    public static final SqlColumn<Long> oid = sqlScriptCommitStatement.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_script_commit_statement")
    public static final class SqlScriptCommitStatement extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public SqlScriptCommitStatement() {
            super("sql_script_commit_statement");
        }
    }
}