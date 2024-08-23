package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class OracleRaiseStatementDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_raise_statement")
    public static final OracleRaiseStatement oracleRaiseStatement = new OracleRaiseStatement();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_raise_statement.oid")
    public static final SqlColumn<Long> oid = oracleRaiseStatement.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_raise_statement.exception_oid")
    public static final SqlColumn<Long> exceptionOid = oracleRaiseStatement.exceptionOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_raise_statement")
    public static final class OracleRaiseStatement extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> exceptionOid = column("`exception_oid`", JDBCType.BIGINT);

        public OracleRaiseStatement() {
            super("oracle_raise_statement");
        }
    }
}