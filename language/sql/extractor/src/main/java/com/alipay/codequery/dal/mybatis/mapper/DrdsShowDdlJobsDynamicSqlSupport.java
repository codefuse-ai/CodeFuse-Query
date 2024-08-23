package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class DrdsShowDdlJobsDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: drds_show_ddl_jobs")
    public static final DrdsShowDdlJobs drdsShowDdlJobs = new DrdsShowDdlJobs();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: drds_show_ddl_jobs.oid")
    public static final SqlColumn<Long> oid = drdsShowDdlJobs.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: drds_show_ddl_jobs.is_full")
    public static final SqlColumn<Integer> isFull = drdsShowDdlJobs.isFull;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: drds_show_ddl_jobs.job_ids")
    public static final SqlColumn<String> jobIds = drdsShowDdlJobs.jobIds;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: drds_show_ddl_jobs")
    public static final class DrdsShowDdlJobs extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isFull = column("`is_full`", JDBCType.BIGINT);

        public final SqlColumn<String> jobIds = column("`job_ids`", JDBCType.VARCHAR);

        public DrdsShowDdlJobs() {
            super("drds_show_ddl_jobs");
        }
    }
}