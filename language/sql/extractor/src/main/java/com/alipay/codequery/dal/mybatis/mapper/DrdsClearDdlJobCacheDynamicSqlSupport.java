package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class DrdsClearDdlJobCacheDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: drds_clear_ddl_job_cache")
    public static final DrdsClearDdlJobCache drdsClearDdlJobCache = new DrdsClearDdlJobCache();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: drds_clear_ddl_job_cache.oid")
    public static final SqlColumn<Long> oid = drdsClearDdlJobCache.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: drds_clear_ddl_job_cache.is_all_jobs")
    public static final SqlColumn<Integer> isAllJobs = drdsClearDdlJobCache.isAllJobs;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: drds_clear_ddl_job_cache.job_ids")
    public static final SqlColumn<String> jobIds = drdsClearDdlJobCache.jobIds;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: drds_clear_ddl_job_cache")
    public static final class DrdsClearDdlJobCache extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isAllJobs = column("`is_all_jobs`", JDBCType.BIGINT);

        public final SqlColumn<String> jobIds = column("`job_ids`", JDBCType.VARCHAR);

        public DrdsClearDdlJobCache() {
            super("drds_clear_ddl_job_cache");
        }
    }
}