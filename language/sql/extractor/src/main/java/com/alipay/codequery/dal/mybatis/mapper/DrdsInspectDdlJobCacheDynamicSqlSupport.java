package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class DrdsInspectDdlJobCacheDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: drds_inspect_ddl_job_cache")
    public static final DrdsInspectDdlJobCache drdsInspectDdlJobCache = new DrdsInspectDdlJobCache();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: drds_inspect_ddl_job_cache.oid")
    public static final SqlColumn<Long> oid = drdsInspectDdlJobCache.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: drds_inspect_ddl_job_cache")
    public static final class DrdsInspectDdlJobCache extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public DrdsInspectDdlJobCache() {
            super("drds_inspect_ddl_job_cache");
        }
    }
}