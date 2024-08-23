package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SqlExplainAnalyzeStatementDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_explain_analyze_statement")
    public static final SqlExplainAnalyzeStatement sqlExplainAnalyzeStatement = new SqlExplainAnalyzeStatement();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_explain_analyze_statement.oid")
    public static final SqlColumn<Long> oid = sqlExplainAnalyzeStatement.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_explain_analyze_statement.select_oid")
    public static final SqlColumn<Long> selectOid = sqlExplainAnalyzeStatement.selectOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_explain_analyze_statement")
    public static final class SqlExplainAnalyzeStatement extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> selectOid = column("`select_oid`", JDBCType.BIGINT);

        public SqlExplainAnalyzeStatement() {
            super("sql_explain_analyze_statement");
        }
    }
}