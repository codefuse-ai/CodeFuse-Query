package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class OracleExecuteImmediateStatementDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_execute_immediate_statement")
    public static final OracleExecuteImmediateStatement oracleExecuteImmediateStatement = new OracleExecuteImmediateStatement();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_execute_immediate_statement.oid")
    public static final SqlColumn<Long> oid = oracleExecuteImmediateStatement.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_execute_immediate_statement.dynamic_sql_oid")
    public static final SqlColumn<Long> dynamicSqlOid = oracleExecuteImmediateStatement.dynamicSqlOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_execute_immediate_statement")
    public static final class OracleExecuteImmediateStatement extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> dynamicSqlOid = column("`dynamic_sql_oid`", JDBCType.BIGINT);

        public OracleExecuteImmediateStatement() {
            super("oracle_execute_immediate_statement");
        }
    }
}