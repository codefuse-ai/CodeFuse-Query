package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class OracleDeleteStatementDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_delete_statement")
    public static final OracleDeleteStatement oracleDeleteStatement = new OracleDeleteStatement();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_delete_statement.oid")
    public static final SqlColumn<Long> oid = oracleDeleteStatement.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_delete_statement.returning_oid")
    public static final SqlColumn<Long> returningOid = oracleDeleteStatement.returningOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_delete_statement")
    public static final class OracleDeleteStatement extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> returningOid = column("`returning_oid`", JDBCType.BIGINT);

        public OracleDeleteStatement() {
            super("oracle_delete_statement");
        }
    }
}