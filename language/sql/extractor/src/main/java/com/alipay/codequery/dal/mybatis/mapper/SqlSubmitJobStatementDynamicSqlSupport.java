package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SqlSubmitJobStatementDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_submit_job_statement")
    public static final SqlSubmitJobStatement sqlSubmitJobStatement = new SqlSubmitJobStatement();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_submit_job_statement.oid")
    public static final SqlColumn<Long> oid = sqlSubmitJobStatement.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_submit_job_statement.is_await")
    public static final SqlColumn<Integer> isAwait = sqlSubmitJobStatement.isAwait;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_submit_job_statement.statment_oid")
    public static final SqlColumn<Long> statmentOid = sqlSubmitJobStatement.statmentOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_submit_job_statement")
    public static final class SqlSubmitJobStatement extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isAwait = column("`is_await`", JDBCType.BIGINT);

        public final SqlColumn<Long> statmentOid = column("`statment_oid`", JDBCType.BIGINT);

        public SqlSubmitJobStatement() {
            super("sql_submit_job_statement");
        }
    }
}