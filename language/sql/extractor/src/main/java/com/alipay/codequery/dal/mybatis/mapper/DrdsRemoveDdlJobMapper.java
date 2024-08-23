package com.alipay.codequery.dal.mybatis.mapper;

import static com.alipay.codequery.dal.mybatis.mapper.DrdsRemoveDdlJobDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.alipay.codequery.dal.mybatis.domain.DrdsRemoveDdlJob;
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
public interface DrdsRemoveDdlJobMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: drds_remove_ddl_job")
    BasicColumn[] selectList = BasicColumn.columnList(oid, isAllCompleted, isAllPending, jobIds);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: drds_remove_ddl_job")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: drds_remove_ddl_job")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: drds_remove_ddl_job")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<DrdsRemoveDdlJob> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: drds_remove_ddl_job")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<DrdsRemoveDdlJob> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: drds_remove_ddl_job")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="is_all_completed", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_all_pending", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="job_ids", javaType=String.class, jdbcType=JdbcType.VARCHAR)
    })
    Optional<DrdsRemoveDdlJob> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: drds_remove_ddl_job")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="is_all_completed", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_all_pending", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="job_ids", javaType=String.class, jdbcType=JdbcType.VARCHAR)
    })
    List<DrdsRemoveDdlJob> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: drds_remove_ddl_job")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: drds_remove_ddl_job")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, drdsRemoveDdlJob, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: drds_remove_ddl_job")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, drdsRemoveDdlJob, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: drds_remove_ddl_job")
    default int deleteByPrimaryKey(Long oid_) {
        return delete(c -> 
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: drds_remove_ddl_job")
    default int insert(DrdsRemoveDdlJob record) {
        return MyBatis3Utils.insert(this::insert, record, drdsRemoveDdlJob, c ->
            c.map(oid).toProperty("oid")
            .map(isAllCompleted).toProperty("isAllCompleted")
            .map(isAllPending).toProperty("isAllPending")
            .map(jobIds).toProperty("jobIds")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: drds_remove_ddl_job")
    default int insertMultiple(Collection<DrdsRemoveDdlJob> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, drdsRemoveDdlJob, c ->
            c.map(oid).toProperty("oid")
            .map(isAllCompleted).toProperty("isAllCompleted")
            .map(isAllPending).toProperty("isAllPending")
            .map(jobIds).toProperty("jobIds")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: drds_remove_ddl_job")
    default int insertSelective(DrdsRemoveDdlJob record) {
        return MyBatis3Utils.insert(this::insert, record, drdsRemoveDdlJob, c ->
            c.map(oid).toPropertyWhenPresent("oid", record::getOid)
            .map(isAllCompleted).toPropertyWhenPresent("isAllCompleted", record::getIsAllCompleted)
            .map(isAllPending).toPropertyWhenPresent("isAllPending", record::getIsAllPending)
            .map(jobIds).toPropertyWhenPresent("jobIds", record::getJobIds)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: drds_remove_ddl_job")
    default Optional<DrdsRemoveDdlJob> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, drdsRemoveDdlJob, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: drds_remove_ddl_job")
    default List<DrdsRemoveDdlJob> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, drdsRemoveDdlJob, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: drds_remove_ddl_job")
    default List<DrdsRemoveDdlJob> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, drdsRemoveDdlJob, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: drds_remove_ddl_job")
    default Optional<DrdsRemoveDdlJob> selectByPrimaryKey(Long oid_) {
        return selectOne(c ->
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: drds_remove_ddl_job")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, drdsRemoveDdlJob, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: drds_remove_ddl_job")
    static UpdateDSL<UpdateModel> updateAllColumns(DrdsRemoveDdlJob record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalTo(record::getOid)
                .set(isAllCompleted).equalTo(record::getIsAllCompleted)
                .set(isAllPending).equalTo(record::getIsAllPending)
                .set(jobIds).equalTo(record::getJobIds);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: drds_remove_ddl_job")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(DrdsRemoveDdlJob record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalToWhenPresent(record::getOid)
                .set(isAllCompleted).equalToWhenPresent(record::getIsAllCompleted)
                .set(isAllPending).equalToWhenPresent(record::getIsAllPending)
                .set(jobIds).equalToWhenPresent(record::getJobIds);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: drds_remove_ddl_job")
    default int updateByPrimaryKey(DrdsRemoveDdlJob record) {
        return update(c ->
            c.set(isAllCompleted).equalTo(record::getIsAllCompleted)
            .set(isAllPending).equalTo(record::getIsAllPending)
            .set(jobIds).equalTo(record::getJobIds)
            .where(oid, isEqualTo(record::getOid))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: drds_remove_ddl_job")
    default int updateByPrimaryKeySelective(DrdsRemoveDdlJob record) {
        return update(c ->
            c.set(isAllCompleted).equalToWhenPresent(record::getIsAllCompleted)
            .set(isAllPending).equalToWhenPresent(record::getIsAllPending)
            .set(jobIds).equalToWhenPresent(record::getJobIds)
            .where(oid, isEqualTo(record::getOid))
        );
    }
}