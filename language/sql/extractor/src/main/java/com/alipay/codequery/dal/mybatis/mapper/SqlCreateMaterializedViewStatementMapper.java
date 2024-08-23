package com.alipay.codequery.dal.mybatis.mapper;

import static com.alipay.codequery.dal.mybatis.mapper.SqlCreateMaterializedViewStatementDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.alipay.codequery.dal.mybatis.domain.SqlCreateMaterializedViewStatement;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import javax.annotation.Generated;
import org.apache.ibatis.annotations.Arg;
import org.apache.ibatis.annotations.ConstructorArgs;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;
import org.mybatis.dynamic.sql.BasicColumn;
import org.mybatis.dynamic.sql.delete.DeleteDSLCompleter;
import org.mybatis.dynamic.sql.delete.render.DeleteStatementProvider;
import org.mybatis.dynamic.sql.insert.render.InsertStatementProvider;
import org.mybatis.dynamic.sql.insert.render.MultiRowInsertStatementProvider;
import org.mybatis.dynamic.sql.select.CountDSLCompleter;
import org.mybatis.dynamic.sql.select.SelectDSLCompleter;
import org.mybatis.dynamic.sql.select.render.SelectStatementProvider;
import org.mybatis.dynamic.sql.update.UpdateDSL;
import org.mybatis.dynamic.sql.update.UpdateDSLCompleter;
import org.mybatis.dynamic.sql.update.UpdateModel;
import org.mybatis.dynamic.sql.update.render.UpdateStatementProvider;
import org.mybatis.dynamic.sql.util.SqlProviderAdapter;
import org.mybatis.dynamic.sql.util.mybatis3.MyBatis3Utils;

@Mapper
public interface SqlCreateMaterializedViewStatementMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_create_materialized_view_statement")
    BasicColumn[] selectList = BasicColumn.columnList(oid, cache, commentOid, compress, compressLevel, distributedByTypeOid, enableQueryRewrite, freeLists, initrans, isBuildDeferred, isBuildImmediate, isCompressForOltp, isIfNotExists, isRefresh, isRefreshComplete, isRefreshFast, isRefreshForce, isRefreshNext, isRefreshOnCommit, isRefreshOnDemand, isRefreshOnOverWrite, isRefreshStartWith, isWithRowId, lifyCycleOid, logging, maxtrans, nameOid, nextOid, parallel, parallelValue, partitionByOid, pctfree, pctincrease, pctthreshold, pctused, queryOid, startWithOid, storage, tablespaceOid);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_create_materialized_view_statement")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_create_materialized_view_statement")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_create_materialized_view_statement")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<SqlCreateMaterializedViewStatement> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_create_materialized_view_statement")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<SqlCreateMaterializedViewStatement> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_create_materialized_view_statement")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="cache", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="comment_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="compress", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="compress_level", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="distributed_by_type_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="enable_query_rewrite", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="free_lists", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="initrans", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_build_deferred", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_build_immediate", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_compress_for_oltp", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_if_not_exists", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_refresh", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_refresh_complete", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_refresh_fast", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_refresh_force", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_refresh_next", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_refresh_on_commit", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_refresh_on_demand", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_refresh_on_over_write", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_refresh_start_with", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_with_row_id", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="lify_cycle_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="logging", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="maxtrans", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="name_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="next_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="parallel", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="parallel_value", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="partition_by_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="pctfree", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="pctincrease", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="pctthreshold", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="pctused", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="query_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="start_with_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="storage", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="tablespace_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT)
    })
    Optional<SqlCreateMaterializedViewStatement> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_create_materialized_view_statement")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="cache", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="comment_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="compress", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="compress_level", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="distributed_by_type_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="enable_query_rewrite", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="free_lists", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="initrans", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_build_deferred", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_build_immediate", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_compress_for_oltp", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_if_not_exists", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_refresh", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_refresh_complete", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_refresh_fast", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_refresh_force", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_refresh_next", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_refresh_on_commit", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_refresh_on_demand", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_refresh_on_over_write", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_refresh_start_with", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_with_row_id", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="lify_cycle_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="logging", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="maxtrans", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="name_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="next_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="parallel", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="parallel_value", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="partition_by_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="pctfree", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="pctincrease", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="pctthreshold", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="pctused", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="query_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="start_with_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="storage", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="tablespace_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT)
    })
    List<SqlCreateMaterializedViewStatement> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_create_materialized_view_statement")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_create_materialized_view_statement")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, sqlCreateMaterializedViewStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_create_materialized_view_statement")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, sqlCreateMaterializedViewStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_create_materialized_view_statement")
    default int deleteByPrimaryKey(Long oid_) {
        return delete(c -> 
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_create_materialized_view_statement")
    default int insert(SqlCreateMaterializedViewStatement record) {
        return MyBatis3Utils.insert(this::insert, record, sqlCreateMaterializedViewStatement, c ->
            c.map(oid).toProperty("oid")
            .map(cache).toProperty("cache")
            .map(commentOid).toProperty("commentOid")
            .map(compress).toProperty("compress")
            .map(compressLevel).toProperty("compressLevel")
            .map(distributedByTypeOid).toProperty("distributedByTypeOid")
            .map(enableQueryRewrite).toProperty("enableQueryRewrite")
            .map(freeLists).toProperty("freeLists")
            .map(initrans).toProperty("initrans")
            .map(isBuildDeferred).toProperty("isBuildDeferred")
            .map(isBuildImmediate).toProperty("isBuildImmediate")
            .map(isCompressForOltp).toProperty("isCompressForOltp")
            .map(isIfNotExists).toProperty("isIfNotExists")
            .map(isRefresh).toProperty("isRefresh")
            .map(isRefreshComplete).toProperty("isRefreshComplete")
            .map(isRefreshFast).toProperty("isRefreshFast")
            .map(isRefreshForce).toProperty("isRefreshForce")
            .map(isRefreshNext).toProperty("isRefreshNext")
            .map(isRefreshOnCommit).toProperty("isRefreshOnCommit")
            .map(isRefreshOnDemand).toProperty("isRefreshOnDemand")
            .map(isRefreshOnOverWrite).toProperty("isRefreshOnOverWrite")
            .map(isRefreshStartWith).toProperty("isRefreshStartWith")
            .map(isWithRowId).toProperty("isWithRowId")
            .map(lifyCycleOid).toProperty("lifyCycleOid")
            .map(logging).toProperty("logging")
            .map(maxtrans).toProperty("maxtrans")
            .map(nameOid).toProperty("nameOid")
            .map(nextOid).toProperty("nextOid")
            .map(parallel).toProperty("parallel")
            .map(parallelValue).toProperty("parallelValue")
            .map(partitionByOid).toProperty("partitionByOid")
            .map(pctfree).toProperty("pctfree")
            .map(pctincrease).toProperty("pctincrease")
            .map(pctthreshold).toProperty("pctthreshold")
            .map(pctused).toProperty("pctused")
            .map(queryOid).toProperty("queryOid")
            .map(startWithOid).toProperty("startWithOid")
            .map(storage).toProperty("storage")
            .map(tablespaceOid).toProperty("tablespaceOid")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_create_materialized_view_statement")
    default int insertMultiple(Collection<SqlCreateMaterializedViewStatement> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, sqlCreateMaterializedViewStatement, c ->
            c.map(oid).toProperty("oid")
            .map(cache).toProperty("cache")
            .map(commentOid).toProperty("commentOid")
            .map(compress).toProperty("compress")
            .map(compressLevel).toProperty("compressLevel")
            .map(distributedByTypeOid).toProperty("distributedByTypeOid")
            .map(enableQueryRewrite).toProperty("enableQueryRewrite")
            .map(freeLists).toProperty("freeLists")
            .map(initrans).toProperty("initrans")
            .map(isBuildDeferred).toProperty("isBuildDeferred")
            .map(isBuildImmediate).toProperty("isBuildImmediate")
            .map(isCompressForOltp).toProperty("isCompressForOltp")
            .map(isIfNotExists).toProperty("isIfNotExists")
            .map(isRefresh).toProperty("isRefresh")
            .map(isRefreshComplete).toProperty("isRefreshComplete")
            .map(isRefreshFast).toProperty("isRefreshFast")
            .map(isRefreshForce).toProperty("isRefreshForce")
            .map(isRefreshNext).toProperty("isRefreshNext")
            .map(isRefreshOnCommit).toProperty("isRefreshOnCommit")
            .map(isRefreshOnDemand).toProperty("isRefreshOnDemand")
            .map(isRefreshOnOverWrite).toProperty("isRefreshOnOverWrite")
            .map(isRefreshStartWith).toProperty("isRefreshStartWith")
            .map(isWithRowId).toProperty("isWithRowId")
            .map(lifyCycleOid).toProperty("lifyCycleOid")
            .map(logging).toProperty("logging")
            .map(maxtrans).toProperty("maxtrans")
            .map(nameOid).toProperty("nameOid")
            .map(nextOid).toProperty("nextOid")
            .map(parallel).toProperty("parallel")
            .map(parallelValue).toProperty("parallelValue")
            .map(partitionByOid).toProperty("partitionByOid")
            .map(pctfree).toProperty("pctfree")
            .map(pctincrease).toProperty("pctincrease")
            .map(pctthreshold).toProperty("pctthreshold")
            .map(pctused).toProperty("pctused")
            .map(queryOid).toProperty("queryOid")
            .map(startWithOid).toProperty("startWithOid")
            .map(storage).toProperty("storage")
            .map(tablespaceOid).toProperty("tablespaceOid")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_create_materialized_view_statement")
    default int insertSelective(SqlCreateMaterializedViewStatement record) {
        return MyBatis3Utils.insert(this::insert, record, sqlCreateMaterializedViewStatement, c ->
            c.map(oid).toPropertyWhenPresent("oid", record::getOid)
            .map(cache).toPropertyWhenPresent("cache", record::getCache)
            .map(commentOid).toPropertyWhenPresent("commentOid", record::getCommentOid)
            .map(compress).toPropertyWhenPresent("compress", record::getCompress)
            .map(compressLevel).toPropertyWhenPresent("compressLevel", record::getCompressLevel)
            .map(distributedByTypeOid).toPropertyWhenPresent("distributedByTypeOid", record::getDistributedByTypeOid)
            .map(enableQueryRewrite).toPropertyWhenPresent("enableQueryRewrite", record::getEnableQueryRewrite)
            .map(freeLists).toPropertyWhenPresent("freeLists", record::getFreeLists)
            .map(initrans).toPropertyWhenPresent("initrans", record::getInitrans)
            .map(isBuildDeferred).toPropertyWhenPresent("isBuildDeferred", record::getIsBuildDeferred)
            .map(isBuildImmediate).toPropertyWhenPresent("isBuildImmediate", record::getIsBuildImmediate)
            .map(isCompressForOltp).toPropertyWhenPresent("isCompressForOltp", record::getIsCompressForOltp)
            .map(isIfNotExists).toPropertyWhenPresent("isIfNotExists", record::getIsIfNotExists)
            .map(isRefresh).toPropertyWhenPresent("isRefresh", record::getIsRefresh)
            .map(isRefreshComplete).toPropertyWhenPresent("isRefreshComplete", record::getIsRefreshComplete)
            .map(isRefreshFast).toPropertyWhenPresent("isRefreshFast", record::getIsRefreshFast)
            .map(isRefreshForce).toPropertyWhenPresent("isRefreshForce", record::getIsRefreshForce)
            .map(isRefreshNext).toPropertyWhenPresent("isRefreshNext", record::getIsRefreshNext)
            .map(isRefreshOnCommit).toPropertyWhenPresent("isRefreshOnCommit", record::getIsRefreshOnCommit)
            .map(isRefreshOnDemand).toPropertyWhenPresent("isRefreshOnDemand", record::getIsRefreshOnDemand)
            .map(isRefreshOnOverWrite).toPropertyWhenPresent("isRefreshOnOverWrite", record::getIsRefreshOnOverWrite)
            .map(isRefreshStartWith).toPropertyWhenPresent("isRefreshStartWith", record::getIsRefreshStartWith)
            .map(isWithRowId).toPropertyWhenPresent("isWithRowId", record::getIsWithRowId)
            .map(lifyCycleOid).toPropertyWhenPresent("lifyCycleOid", record::getLifyCycleOid)
            .map(logging).toPropertyWhenPresent("logging", record::getLogging)
            .map(maxtrans).toPropertyWhenPresent("maxtrans", record::getMaxtrans)
            .map(nameOid).toPropertyWhenPresent("nameOid", record::getNameOid)
            .map(nextOid).toPropertyWhenPresent("nextOid", record::getNextOid)
            .map(parallel).toPropertyWhenPresent("parallel", record::getParallel)
            .map(parallelValue).toPropertyWhenPresent("parallelValue", record::getParallelValue)
            .map(partitionByOid).toPropertyWhenPresent("partitionByOid", record::getPartitionByOid)
            .map(pctfree).toPropertyWhenPresent("pctfree", record::getPctfree)
            .map(pctincrease).toPropertyWhenPresent("pctincrease", record::getPctincrease)
            .map(pctthreshold).toPropertyWhenPresent("pctthreshold", record::getPctthreshold)
            .map(pctused).toPropertyWhenPresent("pctused", record::getPctused)
            .map(queryOid).toPropertyWhenPresent("queryOid", record::getQueryOid)
            .map(startWithOid).toPropertyWhenPresent("startWithOid", record::getStartWithOid)
            .map(storage).toPropertyWhenPresent("storage", record::getStorage)
            .map(tablespaceOid).toPropertyWhenPresent("tablespaceOid", record::getTablespaceOid)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_create_materialized_view_statement")
    default Optional<SqlCreateMaterializedViewStatement> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, sqlCreateMaterializedViewStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_create_materialized_view_statement")
    default List<SqlCreateMaterializedViewStatement> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, sqlCreateMaterializedViewStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_create_materialized_view_statement")
    default List<SqlCreateMaterializedViewStatement> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, sqlCreateMaterializedViewStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_create_materialized_view_statement")
    default Optional<SqlCreateMaterializedViewStatement> selectByPrimaryKey(Long oid_) {
        return selectOne(c ->
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_create_materialized_view_statement")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, sqlCreateMaterializedViewStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_create_materialized_view_statement")
    static UpdateDSL<UpdateModel> updateAllColumns(SqlCreateMaterializedViewStatement record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalTo(record::getOid)
                .set(cache).equalTo(record::getCache)
                .set(commentOid).equalTo(record::getCommentOid)
                .set(compress).equalTo(record::getCompress)
                .set(compressLevel).equalTo(record::getCompressLevel)
                .set(distributedByTypeOid).equalTo(record::getDistributedByTypeOid)
                .set(enableQueryRewrite).equalTo(record::getEnableQueryRewrite)
                .set(freeLists).equalTo(record::getFreeLists)
                .set(initrans).equalTo(record::getInitrans)
                .set(isBuildDeferred).equalTo(record::getIsBuildDeferred)
                .set(isBuildImmediate).equalTo(record::getIsBuildImmediate)
                .set(isCompressForOltp).equalTo(record::getIsCompressForOltp)
                .set(isIfNotExists).equalTo(record::getIsIfNotExists)
                .set(isRefresh).equalTo(record::getIsRefresh)
                .set(isRefreshComplete).equalTo(record::getIsRefreshComplete)
                .set(isRefreshFast).equalTo(record::getIsRefreshFast)
                .set(isRefreshForce).equalTo(record::getIsRefreshForce)
                .set(isRefreshNext).equalTo(record::getIsRefreshNext)
                .set(isRefreshOnCommit).equalTo(record::getIsRefreshOnCommit)
                .set(isRefreshOnDemand).equalTo(record::getIsRefreshOnDemand)
                .set(isRefreshOnOverWrite).equalTo(record::getIsRefreshOnOverWrite)
                .set(isRefreshStartWith).equalTo(record::getIsRefreshStartWith)
                .set(isWithRowId).equalTo(record::getIsWithRowId)
                .set(lifyCycleOid).equalTo(record::getLifyCycleOid)
                .set(logging).equalTo(record::getLogging)
                .set(maxtrans).equalTo(record::getMaxtrans)
                .set(nameOid).equalTo(record::getNameOid)
                .set(nextOid).equalTo(record::getNextOid)
                .set(parallel).equalTo(record::getParallel)
                .set(parallelValue).equalTo(record::getParallelValue)
                .set(partitionByOid).equalTo(record::getPartitionByOid)
                .set(pctfree).equalTo(record::getPctfree)
                .set(pctincrease).equalTo(record::getPctincrease)
                .set(pctthreshold).equalTo(record::getPctthreshold)
                .set(pctused).equalTo(record::getPctused)
                .set(queryOid).equalTo(record::getQueryOid)
                .set(startWithOid).equalTo(record::getStartWithOid)
                .set(storage).equalTo(record::getStorage)
                .set(tablespaceOid).equalTo(record::getTablespaceOid);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_create_materialized_view_statement")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(SqlCreateMaterializedViewStatement record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalToWhenPresent(record::getOid)
                .set(cache).equalToWhenPresent(record::getCache)
                .set(commentOid).equalToWhenPresent(record::getCommentOid)
                .set(compress).equalToWhenPresent(record::getCompress)
                .set(compressLevel).equalToWhenPresent(record::getCompressLevel)
                .set(distributedByTypeOid).equalToWhenPresent(record::getDistributedByTypeOid)
                .set(enableQueryRewrite).equalToWhenPresent(record::getEnableQueryRewrite)
                .set(freeLists).equalToWhenPresent(record::getFreeLists)
                .set(initrans).equalToWhenPresent(record::getInitrans)
                .set(isBuildDeferred).equalToWhenPresent(record::getIsBuildDeferred)
                .set(isBuildImmediate).equalToWhenPresent(record::getIsBuildImmediate)
                .set(isCompressForOltp).equalToWhenPresent(record::getIsCompressForOltp)
                .set(isIfNotExists).equalToWhenPresent(record::getIsIfNotExists)
                .set(isRefresh).equalToWhenPresent(record::getIsRefresh)
                .set(isRefreshComplete).equalToWhenPresent(record::getIsRefreshComplete)
                .set(isRefreshFast).equalToWhenPresent(record::getIsRefreshFast)
                .set(isRefreshForce).equalToWhenPresent(record::getIsRefreshForce)
                .set(isRefreshNext).equalToWhenPresent(record::getIsRefreshNext)
                .set(isRefreshOnCommit).equalToWhenPresent(record::getIsRefreshOnCommit)
                .set(isRefreshOnDemand).equalToWhenPresent(record::getIsRefreshOnDemand)
                .set(isRefreshOnOverWrite).equalToWhenPresent(record::getIsRefreshOnOverWrite)
                .set(isRefreshStartWith).equalToWhenPresent(record::getIsRefreshStartWith)
                .set(isWithRowId).equalToWhenPresent(record::getIsWithRowId)
                .set(lifyCycleOid).equalToWhenPresent(record::getLifyCycleOid)
                .set(logging).equalToWhenPresent(record::getLogging)
                .set(maxtrans).equalToWhenPresent(record::getMaxtrans)
                .set(nameOid).equalToWhenPresent(record::getNameOid)
                .set(nextOid).equalToWhenPresent(record::getNextOid)
                .set(parallel).equalToWhenPresent(record::getParallel)
                .set(parallelValue).equalToWhenPresent(record::getParallelValue)
                .set(partitionByOid).equalToWhenPresent(record::getPartitionByOid)
                .set(pctfree).equalToWhenPresent(record::getPctfree)
                .set(pctincrease).equalToWhenPresent(record::getPctincrease)
                .set(pctthreshold).equalToWhenPresent(record::getPctthreshold)
                .set(pctused).equalToWhenPresent(record::getPctused)
                .set(queryOid).equalToWhenPresent(record::getQueryOid)
                .set(startWithOid).equalToWhenPresent(record::getStartWithOid)
                .set(storage).equalToWhenPresent(record::getStorage)
                .set(tablespaceOid).equalToWhenPresent(record::getTablespaceOid);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_create_materialized_view_statement")
    default int updateByPrimaryKey(SqlCreateMaterializedViewStatement record) {
        return update(c ->
            c.set(cache).equalTo(record::getCache)
            .set(commentOid).equalTo(record::getCommentOid)
            .set(compress).equalTo(record::getCompress)
            .set(compressLevel).equalTo(record::getCompressLevel)
            .set(distributedByTypeOid).equalTo(record::getDistributedByTypeOid)
            .set(enableQueryRewrite).equalTo(record::getEnableQueryRewrite)
            .set(freeLists).equalTo(record::getFreeLists)
            .set(initrans).equalTo(record::getInitrans)
            .set(isBuildDeferred).equalTo(record::getIsBuildDeferred)
            .set(isBuildImmediate).equalTo(record::getIsBuildImmediate)
            .set(isCompressForOltp).equalTo(record::getIsCompressForOltp)
            .set(isIfNotExists).equalTo(record::getIsIfNotExists)
            .set(isRefresh).equalTo(record::getIsRefresh)
            .set(isRefreshComplete).equalTo(record::getIsRefreshComplete)
            .set(isRefreshFast).equalTo(record::getIsRefreshFast)
            .set(isRefreshForce).equalTo(record::getIsRefreshForce)
            .set(isRefreshNext).equalTo(record::getIsRefreshNext)
            .set(isRefreshOnCommit).equalTo(record::getIsRefreshOnCommit)
            .set(isRefreshOnDemand).equalTo(record::getIsRefreshOnDemand)
            .set(isRefreshOnOverWrite).equalTo(record::getIsRefreshOnOverWrite)
            .set(isRefreshStartWith).equalTo(record::getIsRefreshStartWith)
            .set(isWithRowId).equalTo(record::getIsWithRowId)
            .set(lifyCycleOid).equalTo(record::getLifyCycleOid)
            .set(logging).equalTo(record::getLogging)
            .set(maxtrans).equalTo(record::getMaxtrans)
            .set(nameOid).equalTo(record::getNameOid)
            .set(nextOid).equalTo(record::getNextOid)
            .set(parallel).equalTo(record::getParallel)
            .set(parallelValue).equalTo(record::getParallelValue)
            .set(partitionByOid).equalTo(record::getPartitionByOid)
            .set(pctfree).equalTo(record::getPctfree)
            .set(pctincrease).equalTo(record::getPctincrease)
            .set(pctthreshold).equalTo(record::getPctthreshold)
            .set(pctused).equalTo(record::getPctused)
            .set(queryOid).equalTo(record::getQueryOid)
            .set(startWithOid).equalTo(record::getStartWithOid)
            .set(storage).equalTo(record::getStorage)
            .set(tablespaceOid).equalTo(record::getTablespaceOid)
            .where(oid, isEqualTo(record::getOid))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_create_materialized_view_statement")
    default int updateByPrimaryKeySelective(SqlCreateMaterializedViewStatement record) {
        return update(c ->
            c.set(cache).equalToWhenPresent(record::getCache)
            .set(commentOid).equalToWhenPresent(record::getCommentOid)
            .set(compress).equalToWhenPresent(record::getCompress)
            .set(compressLevel).equalToWhenPresent(record::getCompressLevel)
            .set(distributedByTypeOid).equalToWhenPresent(record::getDistributedByTypeOid)
            .set(enableQueryRewrite).equalToWhenPresent(record::getEnableQueryRewrite)
            .set(freeLists).equalToWhenPresent(record::getFreeLists)
            .set(initrans).equalToWhenPresent(record::getInitrans)
            .set(isBuildDeferred).equalToWhenPresent(record::getIsBuildDeferred)
            .set(isBuildImmediate).equalToWhenPresent(record::getIsBuildImmediate)
            .set(isCompressForOltp).equalToWhenPresent(record::getIsCompressForOltp)
            .set(isIfNotExists).equalToWhenPresent(record::getIsIfNotExists)
            .set(isRefresh).equalToWhenPresent(record::getIsRefresh)
            .set(isRefreshComplete).equalToWhenPresent(record::getIsRefreshComplete)
            .set(isRefreshFast).equalToWhenPresent(record::getIsRefreshFast)
            .set(isRefreshForce).equalToWhenPresent(record::getIsRefreshForce)
            .set(isRefreshNext).equalToWhenPresent(record::getIsRefreshNext)
            .set(isRefreshOnCommit).equalToWhenPresent(record::getIsRefreshOnCommit)
            .set(isRefreshOnDemand).equalToWhenPresent(record::getIsRefreshOnDemand)
            .set(isRefreshOnOverWrite).equalToWhenPresent(record::getIsRefreshOnOverWrite)
            .set(isRefreshStartWith).equalToWhenPresent(record::getIsRefreshStartWith)
            .set(isWithRowId).equalToWhenPresent(record::getIsWithRowId)
            .set(lifyCycleOid).equalToWhenPresent(record::getLifyCycleOid)
            .set(logging).equalToWhenPresent(record::getLogging)
            .set(maxtrans).equalToWhenPresent(record::getMaxtrans)
            .set(nameOid).equalToWhenPresent(record::getNameOid)
            .set(nextOid).equalToWhenPresent(record::getNextOid)
            .set(parallel).equalToWhenPresent(record::getParallel)
            .set(parallelValue).equalToWhenPresent(record::getParallelValue)
            .set(partitionByOid).equalToWhenPresent(record::getPartitionByOid)
            .set(pctfree).equalToWhenPresent(record::getPctfree)
            .set(pctincrease).equalToWhenPresent(record::getPctincrease)
            .set(pctthreshold).equalToWhenPresent(record::getPctthreshold)
            .set(pctused).equalToWhenPresent(record::getPctused)
            .set(queryOid).equalToWhenPresent(record::getQueryOid)
            .set(startWithOid).equalToWhenPresent(record::getStartWithOid)
            .set(storage).equalToWhenPresent(record::getStorage)
            .set(tablespaceOid).equalToWhenPresent(record::getTablespaceOid)
            .where(oid, isEqualTo(record::getOid))
        );
    }
}