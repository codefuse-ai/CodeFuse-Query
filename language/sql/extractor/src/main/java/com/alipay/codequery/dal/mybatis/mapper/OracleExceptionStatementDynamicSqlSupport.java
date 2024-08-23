package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class OracleExceptionStatementDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_exception_statement")
    public static final OracleExceptionStatement oracleExceptionStatement = new OracleExceptionStatement();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_exception_statement.oid")
    public static final SqlColumn<Long> oid = oracleExceptionStatement.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_exception_statement.items")
    public static final SqlColumn<String> items = oracleExceptionStatement.items;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_exception_statement")
    public static final class OracleExceptionStatement extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<String> items = column("`items`", JDBCType.VARCHAR);

        public OracleExceptionStatement() {
            super("oracle_exception_statement");
        }
    }
}