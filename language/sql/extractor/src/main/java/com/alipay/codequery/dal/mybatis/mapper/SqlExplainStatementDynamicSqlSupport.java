package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SqlExplainStatementDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_explain_statement")
    public static final SqlExplainStatement sqlExplainStatement = new SqlExplainStatement();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_explain_statement.oid")
    public static final SqlColumn<Long> oid = sqlExplainStatement.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_explain_statement.format")
    public static final SqlColumn<String> format = sqlExplainStatement.format;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_explain_statement.is_authorization")
    public static final SqlColumn<Integer> isAuthorization = sqlExplainStatement.isAuthorization;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_explain_statement.is_dependency")
    public static final SqlColumn<Integer> isDependency = sqlExplainStatement.isDependency;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_explain_statement.is_extended")
    public static final SqlColumn<Integer> isExtended = sqlExplainStatement.isExtended;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_explain_statement.is_optimizer")
    public static final SqlColumn<Integer> isOptimizer = sqlExplainStatement.isOptimizer;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_explain_statement.is_parenthesis")
    public static final SqlColumn<Integer> isParenthesis = sqlExplainStatement.isParenthesis;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_explain_statement.statement_oid")
    public static final SqlColumn<Long> statementOid = sqlExplainStatement.statementOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_explain_statement.type")
    public static final SqlColumn<String> type = sqlExplainStatement.type;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_explain_statement")
    public static final class SqlExplainStatement extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<String> format = column("`format`", JDBCType.VARCHAR);

        public final SqlColumn<Integer> isAuthorization = column("`is_authorization`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isDependency = column("`is_dependency`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isExtended = column("`is_extended`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isOptimizer = column("`is_optimizer`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isParenthesis = column("`is_parenthesis`", JDBCType.BIGINT);

        public final SqlColumn<Long> statementOid = column("`statement_oid`", JDBCType.BIGINT);

        public final SqlColumn<String> type = column("`type`", JDBCType.VARCHAR);

        public SqlExplainStatement() {
            super("sql_explain_statement");
        }
    }
}