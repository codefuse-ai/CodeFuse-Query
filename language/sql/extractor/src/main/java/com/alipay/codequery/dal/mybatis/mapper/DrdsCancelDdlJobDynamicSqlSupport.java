package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class DrdsCancelDdlJobDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: drds_cancel_ddl_job")
    public static final DrdsCancelDdlJob drdsCancelDdlJob = new DrdsCancelDdlJob();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: drds_cancel_ddl_job.oid")
    public static final SqlColumn<Long> oid = drdsCancelDdlJob.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: drds_cancel_ddl_job.job_ids")
    public static final SqlColumn<String> jobIds = drdsCancelDdlJob.jobIds;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: drds_cancel_ddl_job")
    public static final class DrdsCancelDdlJob extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<String> jobIds = column("`job_ids`", JDBCType.VARCHAR);

        public DrdsCancelDdlJob() {
            super("drds_cancel_ddl_job");
        }
    }
}