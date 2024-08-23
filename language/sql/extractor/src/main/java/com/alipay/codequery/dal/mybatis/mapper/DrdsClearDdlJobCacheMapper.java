package com.alipay.codequery.dal.mybatis.mapper;

import static com.alipay.codequery.dal.mybatis.mapper.DrdsClearDdlJobCacheDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.alipay.codequery.dal.mybatis.domain.DrdsClearDdlJobCache;
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
public interface DrdsClearDdlJobCacheMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: drds_clear_ddl_job_cache")
    BasicColumn[] selectList = BasicColumn.columnList(oid, isAllJobs, jobIds);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: drds_clear_ddl_job_cache")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: drds_clear_ddl_job_cache")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: drds_clear_ddl_job_cache")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<DrdsClearDdlJobCache> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: drds_clear_ddl_job_cache")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<DrdsClearDdlJobCache> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: drds_clear_ddl_job_cache")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="is_all_jobs", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="job_ids", javaType=String.class, jdbcType=JdbcType.VARCHAR)
    })
    Optional<DrdsClearDdlJobCache> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: drds_clear_ddl_job_cache")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="is_all_jobs", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="job_ids", javaType=String.class, jdbcType=JdbcType.VARCHAR)
    })
    List<DrdsClearDdlJobCache> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: drds_clear_ddl_job_cache")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: drds_clear_ddl_job_cache")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, drdsClearDdlJobCache, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: drds_clear_ddl_job_cache")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, drdsClearDdlJobCache, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: drds_clear_ddl_job_cache")
    default int deleteByPrimaryKey(Long oid_) {
        return delete(c -> 
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: drds_clear_ddl_job_cache")
    default int insert(DrdsClearDdlJobCache record) {
        return MyBatis3Utils.insert(this::insert, record, drdsClearDdlJobCache, c ->
            c.map(oid).toProperty("oid")
            .map(isAllJobs).toProperty("isAllJobs")
            .map(jobIds).toProperty("jobIds")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: drds_clear_ddl_job_cache")
    default int insertMultiple(Collection<DrdsClearDdlJobCache> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, drdsClearDdlJobCache, c ->
            c.map(oid).toProperty("oid")
            .map(isAllJobs).toProperty("isAllJobs")
            .map(jobIds).toProperty("jobIds")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: drds_clear_ddl_job_cache")
    default int insertSelective(DrdsClearDdlJobCache record) {
        return MyBatis3Utils.insert(this::insert, record, drdsClearDdlJobCache, c ->
            c.map(oid).toPropertyWhenPresent("oid", record::getOid)
            .map(isAllJobs).toPropertyWhenPresent("isAllJobs", record::getIsAllJobs)
            .map(jobIds).toPropertyWhenPresent("jobIds", record::getJobIds)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: drds_clear_ddl_job_cache")
    default Optional<DrdsClearDdlJobCache> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, drdsClearDdlJobCache, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: drds_clear_ddl_job_cache")
    default List<DrdsClearDdlJobCache> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, drdsClearDdlJobCache, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: drds_clear_ddl_job_cache")
    default List<DrdsClearDdlJobCache> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, drdsClearDdlJobCache, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: drds_clear_ddl_job_cache")
    default Optional<DrdsClearDdlJobCache> selectByPrimaryKey(Long oid_) {
        return selectOne(c ->
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: drds_clear_ddl_job_cache")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, drdsClearDdlJobCache, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: drds_clear_ddl_job_cache")
    static UpdateDSL<UpdateModel> updateAllColumns(DrdsClearDdlJobCache record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalTo(record::getOid)
                .set(isAllJobs).equalTo(record::getIsAllJobs)
                .set(jobIds).equalTo(record::getJobIds);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: drds_clear_ddl_job_cache")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(DrdsClearDdlJobCache record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalToWhenPresent(record::getOid)
                .set(isAllJobs).equalToWhenPresent(record::getIsAllJobs)
                .set(jobIds).equalToWhenPresent(record::getJobIds);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: drds_clear_ddl_job_cache")
    default int updateByPrimaryKey(DrdsClearDdlJobCache record) {
        return update(c ->
            c.set(isAllJobs).equalTo(record::getIsAllJobs)
            .set(jobIds).equalTo(record::getJobIds)
            .where(oid, isEqualTo(record::getOid))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: drds_clear_ddl_job_cache")
    default int updateByPrimaryKeySelective(DrdsClearDdlJobCache record) {
        return update(c ->
            c.set(isAllJobs).equalToWhenPresent(record::getIsAllJobs)
            .set(jobIds).equalToWhenPresent(record::getJobIds)
            .where(oid, isEqualTo(record::getOid))
        );
    }
}