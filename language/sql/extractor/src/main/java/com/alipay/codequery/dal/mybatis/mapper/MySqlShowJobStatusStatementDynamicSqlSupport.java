package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class MySqlShowJobStatusStatementDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_show_job_status_statement")
    public static final MySqlShowJobStatusStatement mySqlShowJobStatusStatement = new MySqlShowJobStatusStatement();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_show_job_status_statement.oid")
    public static final SqlColumn<Long> oid = mySqlShowJobStatusStatement.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_show_job_status_statement.is_sync")
    public static final SqlColumn<Integer> isSync = mySqlShowJobStatusStatement.isSync;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_show_job_status_statement.where_oid")
    public static final SqlColumn<Long> whereOid = mySqlShowJobStatusStatement.whereOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_show_job_status_statement")
    public static final class MySqlShowJobStatusStatement extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isSync = column("`is_sync`", JDBCType.BIGINT);

        public final SqlColumn<Long> whereOid = column("`where_oid`", JDBCType.BIGINT);

        public MySqlShowJobStatusStatement() {
            super("my_sql_show_job_status_statement");
        }
    }
}