package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SqlMergeStatementDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_merge_statement")
    public static final SqlMergeStatement sqlMergeStatement = new SqlMergeStatement();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_merge_statement.oid")
    public static final SqlColumn<Long> oid = sqlMergeStatement.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_merge_statement.alias")
    public static final SqlColumn<String> alias = sqlMergeStatement.alias;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_merge_statement.error_logging_clause_oid")
    public static final SqlColumn<Long> errorLoggingClauseOid = sqlMergeStatement.errorLoggingClauseOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_merge_statement.insert_clause")
    public static final SqlColumn<String> insertClause = sqlMergeStatement.insertClause;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_merge_statement.into_oid")
    public static final SqlColumn<Long> intoOid = sqlMergeStatement.intoOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_merge_statement.on_oid")
    public static final SqlColumn<Long> onOid = sqlMergeStatement.onOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_merge_statement.update_clause")
    public static final SqlColumn<String> updateClause = sqlMergeStatement.updateClause;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_merge_statement.using_oid")
    public static final SqlColumn<Long> usingOid = sqlMergeStatement.usingOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_merge_statement")
    public static final class SqlMergeStatement extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<String> alias = column("`alias`", JDBCType.VARCHAR);

        public final SqlColumn<Long> errorLoggingClauseOid = column("`error_logging_clause_oid`", JDBCType.BIGINT);

        public final SqlColumn<String> insertClause = column("`insert_clause`", JDBCType.VARCHAR);

        public final SqlColumn<Long> intoOid = column("`into_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> onOid = column("`on_oid`", JDBCType.BIGINT);

        public final SqlColumn<String> updateClause = column("`update_clause`", JDBCType.VARCHAR);

        public final SqlColumn<Long> usingOid = column("`using_oid`", JDBCType.BIGINT);

        public SqlMergeStatement() {
            super("sql_merge_statement");
        }
    }
}