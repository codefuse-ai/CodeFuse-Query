package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class MySqlAlterDatabaseKillJobDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_alter_database_kill_job")
    public static final MySqlAlterDatabaseKillJob mySqlAlterDatabaseKillJob = new MySqlAlterDatabaseKillJob();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_alter_database_kill_job.oid")
    public static final SqlColumn<Long> oid = mySqlAlterDatabaseKillJob.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_alter_database_kill_job.job_id_oid")
    public static final SqlColumn<Long> jobIdOid = mySqlAlterDatabaseKillJob.jobIdOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_alter_database_kill_job.job_type_oid")
    public static final SqlColumn<Long> jobTypeOid = mySqlAlterDatabaseKillJob.jobTypeOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_alter_database_kill_job")
    public static final class MySqlAlterDatabaseKillJob extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> jobIdOid = column("`job_id_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> jobTypeOid = column("`job_type_oid`", JDBCType.BIGINT);

        public MySqlAlterDatabaseKillJob() {
            super("my_sql_alter_database_kill_job");
        }
    }
}