package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class DrdsRecoverDdlJobDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: drds_recover_ddl_job")
    public static final DrdsRecoverDdlJob drdsRecoverDdlJob = new DrdsRecoverDdlJob();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: drds_recover_ddl_job.oid")
    public static final SqlColumn<Long> oid = drdsRecoverDdlJob.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: drds_recover_ddl_job.is_all_jobs")
    public static final SqlColumn<Integer> isAllJobs = drdsRecoverDdlJob.isAllJobs;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: drds_recover_ddl_job.job_ids")
    public static final SqlColumn<String> jobIds = drdsRecoverDdlJob.jobIds;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: drds_recover_ddl_job")
    public static final class DrdsRecoverDdlJob extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isAllJobs = column("`is_all_jobs`", JDBCType.BIGINT);

        public final SqlColumn<String> jobIds = column("`job_ids`", JDBCType.VARCHAR);

        public DrdsRecoverDdlJob() {
            super("drds_recover_ddl_job");
        }
    }
}