package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class OracleExitStatementDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_exit_statement")
    public static final OracleExitStatement oracleExitStatement = new OracleExitStatement();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_exit_statement.oid")
    public static final SqlColumn<Long> oid = oracleExitStatement.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_exit_statement.label")
    public static final SqlColumn<String> label = oracleExitStatement.label;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_exit_statement.when_oid")
    public static final SqlColumn<Long> whenOid = oracleExitStatement.whenOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_exit_statement")
    public static final class OracleExitStatement extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<String> label = column("`label`", JDBCType.VARCHAR);

        public final SqlColumn<Long> whenOid = column("`when_oid`", JDBCType.BIGINT);

        public OracleExitStatement() {
            super("oracle_exit_statement");
        }
    }
}