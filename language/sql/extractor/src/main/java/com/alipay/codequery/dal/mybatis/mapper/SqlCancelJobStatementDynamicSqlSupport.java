package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SqlCancelJobStatementDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_cancel_job_statement")
    public static final SqlCancelJobStatement sqlCancelJobStatement = new SqlCancelJobStatement();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_cancel_job_statement.oid")
    public static final SqlColumn<Long> oid = sqlCancelJobStatement.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_cancel_job_statement.is_import")
    public static final SqlColumn<Integer> isImport = sqlCancelJobStatement.isImport;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_cancel_job_statement.job_name_oid")
    public static final SqlColumn<Long> jobNameOid = sqlCancelJobStatement.jobNameOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_cancel_job_statement")
    public static final class SqlCancelJobStatement extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isImport = column("`is_import`", JDBCType.BIGINT);

        public final SqlColumn<Long> jobNameOid = column("`job_name_oid`", JDBCType.BIGINT);

        public SqlCancelJobStatement() {
            super("sql_cancel_job_statement");
        }
    }
}