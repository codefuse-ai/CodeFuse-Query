package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class OracleInsertStatementDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_insert_statement")
    public static final OracleInsertStatement oracleInsertStatement = new OracleInsertStatement();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_insert_statement.oid")
    public static final SqlColumn<Long> oid = oracleInsertStatement.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_insert_statement.error_logging_oid")
    public static final SqlColumn<Long> errorLoggingOid = oracleInsertStatement.errorLoggingOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_insert_statement.returning_oid")
    public static final SqlColumn<Long> returningOid = oracleInsertStatement.returningOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_insert_statement")
    public static final class OracleInsertStatement extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> errorLoggingOid = column("`error_logging_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> returningOid = column("`returning_oid`", JDBCType.BIGINT);

        public OracleInsertStatement() {
            super("oracle_insert_statement");
        }
    }
}