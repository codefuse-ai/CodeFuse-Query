package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class DrdsChangeDdlJobDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: drds_change_ddl_job")
    public static final DrdsChangeDdlJob drdsChangeDdlJob = new DrdsChangeDdlJob();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: drds_change_ddl_job.oid")
    public static final SqlColumn<Long> oid = drdsChangeDdlJob.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: drds_change_ddl_job.group_and_table_name_list")
    public static final SqlColumn<String> groupAndTableNameList = drdsChangeDdlJob.groupAndTableNameList;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: drds_change_ddl_job.is_add")
    public static final SqlColumn<Integer> isAdd = drdsChangeDdlJob.isAdd;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: drds_change_ddl_job.is_skip")
    public static final SqlColumn<Integer> isSkip = drdsChangeDdlJob.isSkip;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: drds_change_ddl_job.job_id")
    public static final SqlColumn<String> jobId = drdsChangeDdlJob.jobId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: drds_change_ddl_job")
    public static final class DrdsChangeDdlJob extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<String> groupAndTableNameList = column("`group_and_table_name_list`", JDBCType.VARCHAR);

        public final SqlColumn<Integer> isAdd = column("`is_add`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isSkip = column("`is_skip`", JDBCType.BIGINT);

        public final SqlColumn<String> jobId = column("`job_id`", JDBCType.VARCHAR);

        public DrdsChangeDdlJob() {
            super("drds_change_ddl_job");
        }
    }
}