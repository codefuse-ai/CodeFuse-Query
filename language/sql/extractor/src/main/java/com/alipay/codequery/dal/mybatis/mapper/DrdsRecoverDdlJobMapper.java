package com.alipay.codequery.dal.mybatis.mapper;

import static com.alipay.codequery.dal.mybatis.mapper.DrdsRecoverDdlJobDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.alipay.codequery.dal.mybatis.domain.DrdsRecoverDdlJob;
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
public interface DrdsRecoverDdlJobMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: drds_recover_ddl_job")
    BasicColumn[] selectList = BasicColumn.columnList(oid, isAllJobs, jobIds);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: drds_recover_ddl_job")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: drds_recover_ddl_job")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: drds_recover_ddl_job")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<DrdsRecoverDdlJob> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: drds_recover_ddl_job")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<DrdsRecoverDdlJob> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: drds_recover_ddl_job")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="is_all_jobs", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="job_ids", javaType=String.class, jdbcType=JdbcType.VARCHAR)
    })
    Optional<DrdsRecoverDdlJob> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: drds_recover_ddl_job")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="is_all_jobs", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="job_ids", javaType=String.class, jdbcType=JdbcType.VARCHAR)
    })
    List<DrdsRecoverDdlJob> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: drds_recover_ddl_job")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: drds_recover_ddl_job")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, drdsRecoverDdlJob, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: drds_recover_ddl_job")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, drdsRecoverDdlJob, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: drds_recover_ddl_job")
    default int deleteByPrimaryKey(Long oid_) {
        return delete(c -> 
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: drds_recover_ddl_job")
    default int insert(DrdsRecoverDdlJob record) {
        return MyBatis3Utils.insert(this::insert, record, drdsRecoverDdlJob, c ->
            c.map(oid).toProperty("oid")
            .map(isAllJobs).toProperty("isAllJobs")
            .map(jobIds).toProperty("jobIds")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: drds_recover_ddl_job")
    default int insertMultiple(Collection<DrdsRecoverDdlJob> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, drdsRecoverDdlJob, c ->
            c.map(oid).toProperty("oid")
            .map(isAllJobs).toProperty("isAllJobs")
            .map(jobIds).toProperty("jobIds")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: drds_recover_ddl_job")
    default int insertSelective(DrdsRecoverDdlJob record) {
        return MyBatis3Utils.insert(this::insert, record, drdsRecoverDdlJob, c ->
            c.map(oid).toPropertyWhenPresent("oid", record::getOid)
            .map(isAllJobs).toPropertyWhenPresent("isAllJobs", record::getIsAllJobs)
            .map(jobIds).toPropertyWhenPresent("jobIds", record::getJobIds)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: drds_recover_ddl_job")
    default Optional<DrdsRecoverDdlJob> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, drdsRecoverDdlJob, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: drds_recover_ddl_job")
    default List<DrdsRecoverDdlJob> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, drdsRecoverDdlJob, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: drds_recover_ddl_job")
    default List<DrdsRecoverDdlJob> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, drdsRecoverDdlJob, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: drds_recover_ddl_job")
    default Optional<DrdsRecoverDdlJob> selectByPrimaryKey(Long oid_) {
        return selectOne(c ->
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: drds_recover_ddl_job")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, drdsRecoverDdlJob, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: drds_recover_ddl_job")
    static UpdateDSL<UpdateModel> updateAllColumns(DrdsRecoverDdlJob record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalTo(record::getOid)
                .set(isAllJobs).equalTo(record::getIsAllJobs)
                .set(jobIds).equalTo(record::getJobIds);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: drds_recover_ddl_job")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(DrdsRecoverDdlJob record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalToWhenPresent(record::getOid)
                .set(isAllJobs).equalToWhenPresent(record::getIsAllJobs)
                .set(jobIds).equalToWhenPresent(record::getJobIds);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: drds_recover_ddl_job")
    default int updateByPrimaryKey(DrdsRecoverDdlJob record) {
        return update(c ->
            c.set(isAllJobs).equalTo(record::getIsAllJobs)
            .set(jobIds).equalTo(record::getJobIds)
            .where(oid, isEqualTo(record::getOid))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: drds_recover_ddl_job")
    default int updateByPrimaryKeySelective(DrdsRecoverDdlJob record) {
        return update(c ->
            c.set(isAllJobs).equalToWhenPresent(record::getIsAllJobs)
            .set(jobIds).equalToWhenPresent(record::getJobIds)
            .where(oid, isEqualTo(record::getOid))
        );
    }
}