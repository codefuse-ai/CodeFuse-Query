package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class OracleExplainStatementDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_explain_statement")
    public static final OracleExplainStatement oracleExplainStatement = new OracleExplainStatement();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_explain_statement.oid")
    public static final SqlColumn<Long> oid = oracleExplainStatement.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_explain_statement.into_oid")
    public static final SqlColumn<Long> intoOid = oracleExplainStatement.intoOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_explain_statement.statement_id_oid")
    public static final SqlColumn<Long> statementIdOid = oracleExplainStatement.statementIdOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_explain_statement")
    public static final class OracleExplainStatement extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> intoOid = column("`into_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> statementIdOid = column("`statement_id_oid`", JDBCType.BIGINT);

        public OracleExplainStatement() {
            super("oracle_explain_statement");
        }
    }
}