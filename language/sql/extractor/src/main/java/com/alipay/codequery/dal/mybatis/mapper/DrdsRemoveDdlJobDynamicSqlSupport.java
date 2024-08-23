package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class DrdsRemoveDdlJobDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: drds_remove_ddl_job")
    public static final DrdsRemoveDdlJob drdsRemoveDdlJob = new DrdsRemoveDdlJob();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: drds_remove_ddl_job.oid")
    public static final SqlColumn<Long> oid = drdsRemoveDdlJob.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: drds_remove_ddl_job.is_all_completed")
    public static final SqlColumn<Integer> isAllCompleted = drdsRemoveDdlJob.isAllCompleted;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: drds_remove_ddl_job.is_all_pending")
    public static final SqlColumn<Integer> isAllPending = drdsRemoveDdlJob.isAllPending;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: drds_remove_ddl_job.job_ids")
    public static final SqlColumn<String> jobIds = drdsRemoveDdlJob.jobIds;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: drds_remove_ddl_job")
    public static final class DrdsRemoveDdlJob extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isAllCompleted = column("`is_all_completed`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isAllPending = column("`is_all_pending`", JDBCType.BIGINT);

        public final SqlColumn<String> jobIds = column("`job_ids`", JDBCType.VARCHAR);

        public DrdsRemoveDdlJob() {
            super("drds_remove_ddl_job");
        }
    }
}