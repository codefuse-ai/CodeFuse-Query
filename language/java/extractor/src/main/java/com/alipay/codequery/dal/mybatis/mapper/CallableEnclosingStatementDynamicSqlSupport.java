package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class CallableEnclosingStatementDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: callable_enclosing_statement")
    public static final CallableEnclosingStatement callableEnclosingStatement = new CallableEnclosingStatement();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: callable_enclosing_statement.statement_hash_id")
    public static final SqlColumn<Long> statementHashId = callableEnclosingStatement.statementHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: callable_enclosing_statement.callable_hash_id")
    public static final SqlColumn<Long> callableHashId = callableEnclosingStatement.callableHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: callable_enclosing_statement")
    public static final class CallableEnclosingStatement extends SqlTable {
        public final SqlColumn<Long> statementHashId = column("statement_hash_id", JDBCType.BIGINT);

        public final SqlColumn<Long> callableHashId = column("callable_hash_id", JDBCType.BIGINT);

        public CallableEnclosingStatement() {
            super("callable_enclosing_statement");
        }
    }
}