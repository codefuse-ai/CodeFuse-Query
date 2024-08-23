package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SqlCreateMaterializedViewStatementDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_create_materialized_view_statement")
    public static final SqlCreateMaterializedViewStatement sqlCreateMaterializedViewStatement = new SqlCreateMaterializedViewStatement();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_materialized_view_statement.oid")
    public static final SqlColumn<Long> oid = sqlCreateMaterializedViewStatement.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_materialized_view_statement.cache")
    public static final SqlColumn<Integer> cache = sqlCreateMaterializedViewStatement.cache;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_materialized_view_statement.comment_oid")
    public static final SqlColumn<Long> commentOid = sqlCreateMaterializedViewStatement.commentOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_materialized_view_statement.compress")
    public static final SqlColumn<Integer> compress = sqlCreateMaterializedViewStatement.compress;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_materialized_view_statement.compress_level")
    public static final SqlColumn<Integer> compressLevel = sqlCreateMaterializedViewStatement.compressLevel;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_materialized_view_statement.distributed_by_type_oid")
    public static final SqlColumn<Long> distributedByTypeOid = sqlCreateMaterializedViewStatement.distributedByTypeOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_materialized_view_statement.enable_query_rewrite")
    public static final SqlColumn<Integer> enableQueryRewrite = sqlCreateMaterializedViewStatement.enableQueryRewrite;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_materialized_view_statement.free_lists")
    public static final SqlColumn<Integer> freeLists = sqlCreateMaterializedViewStatement.freeLists;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_materialized_view_statement.initrans")
    public static final SqlColumn<Integer> initrans = sqlCreateMaterializedViewStatement.initrans;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_materialized_view_statement.is_build_deferred")
    public static final SqlColumn<Integer> isBuildDeferred = sqlCreateMaterializedViewStatement.isBuildDeferred;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_materialized_view_statement.is_build_immediate")
    public static final SqlColumn<Integer> isBuildImmediate = sqlCreateMaterializedViewStatement.isBuildImmediate;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_materialized_view_statement.is_compress_for_oltp")
    public static final SqlColumn<Integer> isCompressForOltp = sqlCreateMaterializedViewStatement.isCompressForOltp;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_materialized_view_statement.is_if_not_exists")
    public static final SqlColumn<Integer> isIfNotExists = sqlCreateMaterializedViewStatement.isIfNotExists;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_materialized_view_statement.is_refresh")
    public static final SqlColumn<Integer> isRefresh = sqlCreateMaterializedViewStatement.isRefresh;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_materialized_view_statement.is_refresh_complete")
    public static final SqlColumn<Integer> isRefreshComplete = sqlCreateMaterializedViewStatement.isRefreshComplete;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_materialized_view_statement.is_refresh_fast")
    public static final SqlColumn<Integer> isRefreshFast = sqlCreateMaterializedViewStatement.isRefreshFast;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_materialized_view_statement.is_refresh_force")
    public static final SqlColumn<Integer> isRefreshForce = sqlCreateMaterializedViewStatement.isRefreshForce;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_materialized_view_statement.is_refresh_next")
    public static final SqlColumn<Integer> isRefreshNext = sqlCreateMaterializedViewStatement.isRefreshNext;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_materialized_view_statement.is_refresh_on_commit")
    public static final SqlColumn<Integer> isRefreshOnCommit = sqlCreateMaterializedViewStatement.isRefreshOnCommit;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_materialized_view_statement.is_refresh_on_demand")
    public static final SqlColumn<Integer> isRefreshOnDemand = sqlCreateMaterializedViewStatement.isRefreshOnDemand;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_materialized_view_statement.is_refresh_on_over_write")
    public static final SqlColumn<Integer> isRefreshOnOverWrite = sqlCreateMaterializedViewStatement.isRefreshOnOverWrite;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_materialized_view_statement.is_refresh_start_with")
    public static final SqlColumn<Integer> isRefreshStartWith = sqlCreateMaterializedViewStatement.isRefreshStartWith;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_materialized_view_statement.is_with_row_id")
    public static final SqlColumn<Integer> isWithRowId = sqlCreateMaterializedViewStatement.isWithRowId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_materialized_view_statement.lify_cycle_oid")
    public static final SqlColumn<Long> lifyCycleOid = sqlCreateMaterializedViewStatement.lifyCycleOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_materialized_view_statement.logging")
    public static final SqlColumn<Integer> logging = sqlCreateMaterializedViewStatement.logging;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_materialized_view_statement.maxtrans")
    public static final SqlColumn<Integer> maxtrans = sqlCreateMaterializedViewStatement.maxtrans;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_materialized_view_statement.name_oid")
    public static final SqlColumn<Long> nameOid = sqlCreateMaterializedViewStatement.nameOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_materialized_view_statement.next_oid")
    public static final SqlColumn<Long> nextOid = sqlCreateMaterializedViewStatement.nextOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_materialized_view_statement.parallel")
    public static final SqlColumn<Integer> parallel = sqlCreateMaterializedViewStatement.parallel;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_materialized_view_statement.parallel_value")
    public static final SqlColumn<Integer> parallelValue = sqlCreateMaterializedViewStatement.parallelValue;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_materialized_view_statement.partition_by_oid")
    public static final SqlColumn<Long> partitionByOid = sqlCreateMaterializedViewStatement.partitionByOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_materialized_view_statement.pctfree")
    public static final SqlColumn<Integer> pctfree = sqlCreateMaterializedViewStatement.pctfree;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_materialized_view_statement.pctincrease")
    public static final SqlColumn<Integer> pctincrease = sqlCreateMaterializedViewStatement.pctincrease;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_materialized_view_statement.pctthreshold")
    public static final SqlColumn<Integer> pctthreshold = sqlCreateMaterializedViewStatement.pctthreshold;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_materialized_view_statement.pctused")
    public static final SqlColumn<Integer> pctused = sqlCreateMaterializedViewStatement.pctused;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_materialized_view_statement.query_oid")
    public static final SqlColumn<Long> queryOid = sqlCreateMaterializedViewStatement.queryOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_materialized_view_statement.start_with_oid")
    public static final SqlColumn<Long> startWithOid = sqlCreateMaterializedViewStatement.startWithOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_materialized_view_statement.storage")
    public static final SqlColumn<String> storage = sqlCreateMaterializedViewStatement.storage;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_materialized_view_statement.tablespace_oid")
    public static final SqlColumn<Long> tablespaceOid = sqlCreateMaterializedViewStatement.tablespaceOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_create_materialized_view_statement")
    public static final class SqlCreateMaterializedViewStatement extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Integer> cache = column("`cache`", JDBCType.BIGINT);

        public final SqlColumn<Long> commentOid = column("`comment_oid`", JDBCType.BIGINT);

        public final SqlColumn<Integer> compress = column("`compress`", JDBCType.BIGINT);

        public final SqlColumn<Integer> compressLevel = column("`compress_level`", JDBCType.BIGINT);

        public final SqlColumn<Long> distributedByTypeOid = column("`distributed_by_type_oid`", JDBCType.BIGINT);

        public final SqlColumn<Integer> enableQueryRewrite = column("`enable_query_rewrite`", JDBCType.BIGINT);

        public final SqlColumn<Integer> freeLists = column("`free_lists`", JDBCType.BIGINT);

        public final SqlColumn<Integer> initrans = column("`initrans`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isBuildDeferred = column("`is_build_deferred`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isBuildImmediate = column("`is_build_immediate`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isCompressForOltp = column("`is_compress_for_oltp`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isIfNotExists = column("`is_if_not_exists`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isRefresh = column("`is_refresh`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isRefreshComplete = column("`is_refresh_complete`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isRefreshFast = column("`is_refresh_fast`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isRefreshForce = column("`is_refresh_force`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isRefreshNext = column("`is_refresh_next`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isRefreshOnCommit = column("`is_refresh_on_commit`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isRefreshOnDemand = column("`is_refresh_on_demand`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isRefreshOnOverWrite = column("`is_refresh_on_over_write`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isRefreshStartWith = column("`is_refresh_start_with`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isWithRowId = column("`is_with_row_id`", JDBCType.BIGINT);

        public final SqlColumn<Long> lifyCycleOid = column("`lify_cycle_oid`", JDBCType.BIGINT);

        public final SqlColumn<Integer> logging = column("`logging`", JDBCType.BIGINT);

        public final SqlColumn<Integer> maxtrans = column("`maxtrans`", JDBCType.BIGINT);

        public final SqlColumn<Long> nameOid = column("`name_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> nextOid = column("`next_oid`", JDBCType.BIGINT);

        public final SqlColumn<Integer> parallel = column("`parallel`", JDBCType.BIGINT);

        public final SqlColumn<Integer> parallelValue = column("`parallel_value`", JDBCType.BIGINT);

        public final SqlColumn<Long> partitionByOid = column("`partition_by_oid`", JDBCType.BIGINT);

        public final SqlColumn<Integer> pctfree = column("`pctfree`", JDBCType.BIGINT);

        public final SqlColumn<Integer> pctincrease = column("`pctincrease`", JDBCType.BIGINT);

        public final SqlColumn<Integer> pctthreshold = column("`pctthreshold`", JDBCType.BIGINT);

        public final SqlColumn<Integer> pctused = column("`pctused`", JDBCType.BIGINT);

        public final SqlColumn<Long> queryOid = column("`query_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> startWithOid = column("`start_with_oid`", JDBCType.BIGINT);

        public final SqlColumn<String> storage = column("`storage`", JDBCType.VARCHAR);

        public final SqlColumn<Long> tablespaceOid = column("`tablespace_oid`", JDBCType.BIGINT);

        public SqlCreateMaterializedViewStatement() {
            super("sql_create_materialized_view_statement");
        }
    }
}