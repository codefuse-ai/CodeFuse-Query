package com.alipay.codequery.dal.mybatis.mapper;

import static com.alipay.codequery.dal.mybatis.mapper.DrdsChangeDdlJobDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.alipay.codequery.dal.mybatis.domain.DrdsChangeDdlJob;
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
public interface DrdsChangeDdlJobMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: drds_change_ddl_job")
    BasicColumn[] selectList = BasicColumn.columnList(oid, groupAndTableNameList, isAdd, isSkip, jobId);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: drds_change_ddl_job")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: drds_change_ddl_job")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: drds_change_ddl_job")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<DrdsChangeDdlJob> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: drds_change_ddl_job")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<DrdsChangeDdlJob> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: drds_change_ddl_job")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="group_and_table_name_list", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="is_add", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_skip", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="job_id", javaType=String.class, jdbcType=JdbcType.VARCHAR)
    })
    Optional<DrdsChangeDdlJob> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: drds_change_ddl_job")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="group_and_table_name_list", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="is_add", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_skip", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="job_id", javaType=String.class, jdbcType=JdbcType.VARCHAR)
    })
    List<DrdsChangeDdlJob> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: drds_change_ddl_job")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: drds_change_ddl_job")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, drdsChangeDdlJob, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: drds_change_ddl_job")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, drdsChangeDdlJob, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: drds_change_ddl_job")
    default int deleteByPrimaryKey(Long oid_) {
        return delete(c -> 
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: drds_change_ddl_job")
    default int insert(DrdsChangeDdlJob record) {
        return MyBatis3Utils.insert(this::insert, record, drdsChangeDdlJob, c ->
            c.map(oid).toProperty("oid")
            .map(groupAndTableNameList).toProperty("groupAndTableNameList")
            .map(isAdd).toProperty("isAdd")
            .map(isSkip).toProperty("isSkip")
            .map(jobId).toProperty("jobId")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: drds_change_ddl_job")
    default int insertMultiple(Collection<DrdsChangeDdlJob> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, drdsChangeDdlJob, c ->
            c.map(oid).toProperty("oid")
            .map(groupAndTableNameList).toProperty("groupAndTableNameList")
            .map(isAdd).toProperty("isAdd")
            .map(isSkip).toProperty("isSkip")
            .map(jobId).toProperty("jobId")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: drds_change_ddl_job")
    default int insertSelective(DrdsChangeDdlJob record) {
        return MyBatis3Utils.insert(this::insert, record, drdsChangeDdlJob, c ->
            c.map(oid).toPropertyWhenPresent("oid", record::getOid)
            .map(groupAndTableNameList).toPropertyWhenPresent("groupAndTableNameList", record::getGroupAndTableNameList)
            .map(isAdd).toPropertyWhenPresent("isAdd", record::getIsAdd)
            .map(isSkip).toPropertyWhenPresent("isSkip", record::getIsSkip)
            .map(jobId).toPropertyWhenPresent("jobId", record::getJobId)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: drds_change_ddl_job")
    default Optional<DrdsChangeDdlJob> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, drdsChangeDdlJob, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: drds_change_ddl_job")
    default List<DrdsChangeDdlJob> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, drdsChangeDdlJob, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: drds_change_ddl_job")
    default List<DrdsChangeDdlJob> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, drdsChangeDdlJob, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: drds_change_ddl_job")
    default Optional<DrdsChangeDdlJob> selectByPrimaryKey(Long oid_) {
        return selectOne(c ->
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: drds_change_ddl_job")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, drdsChangeDdlJob, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: drds_change_ddl_job")
    static UpdateDSL<UpdateModel> updateAllColumns(DrdsChangeDdlJob record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalTo(record::getOid)
                .set(groupAndTableNameList).equalTo(record::getGroupAndTableNameList)
                .set(isAdd).equalTo(record::getIsAdd)
                .set(isSkip).equalTo(record::getIsSkip)
                .set(jobId).equalTo(record::getJobId);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: drds_change_ddl_job")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(DrdsChangeDdlJob record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalToWhenPresent(record::getOid)
                .set(groupAndTableNameList).equalToWhenPresent(record::getGroupAndTableNameList)
                .set(isAdd).equalToWhenPresent(record::getIsAdd)
                .set(isSkip).equalToWhenPresent(record::getIsSkip)
                .set(jobId).equalToWhenPresent(record::getJobId);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: drds_change_ddl_job")
    default int updateByPrimaryKey(DrdsChangeDdlJob record) {
        return update(c ->
            c.set(groupAndTableNameList).equalTo(record::getGroupAndTableNameList)
            .set(isAdd).equalTo(record::getIsAdd)
            .set(isSkip).equalTo(record::getIsSkip)
            .set(jobId).equalTo(record::getJobId)
            .where(oid, isEqualTo(record::getOid))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: drds_change_ddl_job")
    default int updateByPrimaryKeySelective(DrdsChangeDdlJob record) {
        return update(c ->
            c.set(groupAndTableNameList).equalToWhenPresent(record::getGroupAndTableNameList)
            .set(isAdd).equalToWhenPresent(record::getIsAdd)
            .set(isSkip).equalToWhenPresent(record::getIsSkip)
            .set(jobId).equalToWhenPresent(record::getJobId)
            .where(oid, isEqualTo(record::getOid))
        );
    }
}