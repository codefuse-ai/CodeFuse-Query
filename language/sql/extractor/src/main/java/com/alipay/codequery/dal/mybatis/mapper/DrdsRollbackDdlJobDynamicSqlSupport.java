package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class DrdsRollbackDdlJobDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: drds_rollback_ddl_job")
    public static final DrdsRollbackDdlJob drdsRollbackDdlJob = new DrdsRollbackDdlJob();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: drds_rollback_ddl_job.oid")
    public static final SqlColumn<Long> oid = drdsRollbackDdlJob.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: drds_rollback_ddl_job.job_ids")
    public static final SqlColumn<String> jobIds = drdsRollbackDdlJob.jobIds;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: drds_rollback_ddl_job")
    public static final class DrdsRollbackDdlJob extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<String> jobIds = column("`job_ids`", JDBCType.VARCHAR);

        public DrdsRollbackDdlJob() {
            super("drds_rollback_ddl_job");
        }
    }
}