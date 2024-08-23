package com.alipay.codequery.dal.mybatis.mapper;

import static com.alipay.codequery.dal.mybatis.mapper.SqlAlterSequenceStatementDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.alipay.codequery.dal.mybatis.domain.SqlAlterSequenceStatement;
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
public interface SqlAlterSequenceStatementMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_sequence_statement")
    BasicColumn[] selectList = BasicColumn.columnList(oid, cache, cacheValueOid, cycle, incrementByOid, isChangeToGroup, isChangeToSimple, isChangeToTime, isNoMaxValue, isNoMinValue, isRestart, maxValueOid, minValueOid, nameOid, order, restartWithOid, schema, startWithOid, withCache);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_sequence_statement")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_sequence_statement")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_sequence_statement")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<SqlAlterSequenceStatement> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_sequence_statement")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<SqlAlterSequenceStatement> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_sequence_statement")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="cache", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="cache_value_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="cycle", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="increment_by_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_change_to_group", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_change_to_simple", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_change_to_time", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_no_max_value", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_no_min_value", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_restart", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="max_value_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="min_value_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="name_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="order", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="restart_with_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="schema", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="start_with_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="with_cache", javaType=Integer.class, jdbcType=JdbcType.BIGINT)
    })
    Optional<SqlAlterSequenceStatement> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_sequence_statement")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="cache", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="cache_value_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="cycle", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="increment_by_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_change_to_group", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_change_to_simple", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_change_to_time", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_no_max_value", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_no_min_value", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_restart", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="max_value_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="min_value_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="name_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="order", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="restart_with_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="schema", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="start_with_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="with_cache", javaType=Integer.class, jdbcType=JdbcType.BIGINT)
    })
    List<SqlAlterSequenceStatement> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_sequence_statement")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_sequence_statement")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, sqlAlterSequenceStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_sequence_statement")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, sqlAlterSequenceStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_sequence_statement")
    default int deleteByPrimaryKey(Long oid_) {
        return delete(c -> 
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_sequence_statement")
    default int insert(SqlAlterSequenceStatement record) {
        return MyBatis3Utils.insert(this::insert, record, sqlAlterSequenceStatement, c ->
            c.map(oid).toProperty("oid")
            .map(cache).toProperty("cache")
            .map(cacheValueOid).toProperty("cacheValueOid")
            .map(cycle).toProperty("cycle")
            .map(incrementByOid).toProperty("incrementByOid")
            .map(isChangeToGroup).toProperty("isChangeToGroup")
            .map(isChangeToSimple).toProperty("isChangeToSimple")
            .map(isChangeToTime).toProperty("isChangeToTime")
            .map(isNoMaxValue).toProperty("isNoMaxValue")
            .map(isNoMinValue).toProperty("isNoMinValue")
            .map(isRestart).toProperty("isRestart")
            .map(maxValueOid).toProperty("maxValueOid")
            .map(minValueOid).toProperty("minValueOid")
            .map(nameOid).toProperty("nameOid")
            .map(order).toProperty("order")
            .map(restartWithOid).toProperty("restartWithOid")
            .map(schema).toProperty("schema")
            .map(startWithOid).toProperty("startWithOid")
            .map(withCache).toProperty("withCache")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_sequence_statement")
    default int insertMultiple(Collection<SqlAlterSequenceStatement> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, sqlAlterSequenceStatement, c ->
            c.map(oid).toProperty("oid")
            .map(cache).toProperty("cache")
            .map(cacheValueOid).toProperty("cacheValueOid")
            .map(cycle).toProperty("cycle")
            .map(incrementByOid).toProperty("incrementByOid")
            .map(isChangeToGroup).toProperty("isChangeToGroup")
            .map(isChangeToSimple).toProperty("isChangeToSimple")
            .map(isChangeToTime).toProperty("isChangeToTime")
            .map(isNoMaxValue).toProperty("isNoMaxValue")
            .map(isNoMinValue).toProperty("isNoMinValue")
            .map(isRestart).toProperty("isRestart")
            .map(maxValueOid).toProperty("maxValueOid")
            .map(minValueOid).toProperty("minValueOid")
            .map(nameOid).toProperty("nameOid")
            .map(order).toProperty("order")
            .map(restartWithOid).toProperty("restartWithOid")
            .map(schema).toProperty("schema")
            .map(startWithOid).toProperty("startWithOid")
            .map(withCache).toProperty("withCache")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_sequence_statement")
    default int insertSelective(SqlAlterSequenceStatement record) {
        return MyBatis3Utils.insert(this::insert, record, sqlAlterSequenceStatement, c ->
            c.map(oid).toPropertyWhenPresent("oid", record::getOid)
            .map(cache).toPropertyWhenPresent("cache", record::getCache)
            .map(cacheValueOid).toPropertyWhenPresent("cacheValueOid", record::getCacheValueOid)
            .map(cycle).toPropertyWhenPresent("cycle", record::getCycle)
            .map(incrementByOid).toPropertyWhenPresent("incrementByOid", record::getIncrementByOid)
            .map(isChangeToGroup).toPropertyWhenPresent("isChangeToGroup", record::getIsChangeToGroup)
            .map(isChangeToSimple).toPropertyWhenPresent("isChangeToSimple", record::getIsChangeToSimple)
            .map(isChangeToTime).toPropertyWhenPresent("isChangeToTime", record::getIsChangeToTime)
            .map(isNoMaxValue).toPropertyWhenPresent("isNoMaxValue", record::getIsNoMaxValue)
            .map(isNoMinValue).toPropertyWhenPresent("isNoMinValue", record::getIsNoMinValue)
            .map(isRestart).toPropertyWhenPresent("isRestart", record::getIsRestart)
            .map(maxValueOid).toPropertyWhenPresent("maxValueOid", record::getMaxValueOid)
            .map(minValueOid).toPropertyWhenPresent("minValueOid", record::getMinValueOid)
            .map(nameOid).toPropertyWhenPresent("nameOid", record::getNameOid)
            .map(order).toPropertyWhenPresent("order", record::getOrder)
            .map(restartWithOid).toPropertyWhenPresent("restartWithOid", record::getRestartWithOid)
            .map(schema).toPropertyWhenPresent("schema", record::getSchema)
            .map(startWithOid).toPropertyWhenPresent("startWithOid", record::getStartWithOid)
            .map(withCache).toPropertyWhenPresent("withCache", record::getWithCache)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_sequence_statement")
    default Optional<SqlAlterSequenceStatement> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, sqlAlterSequenceStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_sequence_statement")
    default List<SqlAlterSequenceStatement> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, sqlAlterSequenceStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_sequence_statement")
    default List<SqlAlterSequenceStatement> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, sqlAlterSequenceStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_sequence_statement")
    default Optional<SqlAlterSequenceStatement> selectByPrimaryKey(Long oid_) {
        return selectOne(c ->
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_sequence_statement")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, sqlAlterSequenceStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_sequence_statement")
    static UpdateDSL<UpdateModel> updateAllColumns(SqlAlterSequenceStatement record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalTo(record::getOid)
                .set(cache).equalTo(record::getCache)
                .set(cacheValueOid).equalTo(record::getCacheValueOid)
                .set(cycle).equalTo(record::getCycle)
                .set(incrementByOid).equalTo(record::getIncrementByOid)
                .set(isChangeToGroup).equalTo(record::getIsChangeToGroup)
                .set(isChangeToSimple).equalTo(record::getIsChangeToSimple)
                .set(isChangeToTime).equalTo(record::getIsChangeToTime)
                .set(isNoMaxValue).equalTo(record::getIsNoMaxValue)
                .set(isNoMinValue).equalTo(record::getIsNoMinValue)
                .set(isRestart).equalTo(record::getIsRestart)
                .set(maxValueOid).equalTo(record::getMaxValueOid)
                .set(minValueOid).equalTo(record::getMinValueOid)
                .set(nameOid).equalTo(record::getNameOid)
                .set(order).equalTo(record::getOrder)
                .set(restartWithOid).equalTo(record::getRestartWithOid)
                .set(schema).equalTo(record::getSchema)
                .set(startWithOid).equalTo(record::getStartWithOid)
                .set(withCache).equalTo(record::getWithCache);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_sequence_statement")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(SqlAlterSequenceStatement record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalToWhenPresent(record::getOid)
                .set(cache).equalToWhenPresent(record::getCache)
                .set(cacheValueOid).equalToWhenPresent(record::getCacheValueOid)
                .set(cycle).equalToWhenPresent(record::getCycle)
                .set(incrementByOid).equalToWhenPresent(record::getIncrementByOid)
                .set(isChangeToGroup).equalToWhenPresent(record::getIsChangeToGroup)
                .set(isChangeToSimple).equalToWhenPresent(record::getIsChangeToSimple)
                .set(isChangeToTime).equalToWhenPresent(record::getIsChangeToTime)
                .set(isNoMaxValue).equalToWhenPresent(record::getIsNoMaxValue)
                .set(isNoMinValue).equalToWhenPresent(record::getIsNoMinValue)
                .set(isRestart).equalToWhenPresent(record::getIsRestart)
                .set(maxValueOid).equalToWhenPresent(record::getMaxValueOid)
                .set(minValueOid).equalToWhenPresent(record::getMinValueOid)
                .set(nameOid).equalToWhenPresent(record::getNameOid)
                .set(order).equalToWhenPresent(record::getOrder)
                .set(restartWithOid).equalToWhenPresent(record::getRestartWithOid)
                .set(schema).equalToWhenPresent(record::getSchema)
                .set(startWithOid).equalToWhenPresent(record::getStartWithOid)
                .set(withCache).equalToWhenPresent(record::getWithCache);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_sequence_statement")
    default int updateByPrimaryKey(SqlAlterSequenceStatement record) {
        return update(c ->
            c.set(cache).equalTo(record::getCache)
            .set(cacheValueOid).equalTo(record::getCacheValueOid)
            .set(cycle).equalTo(record::getCycle)
            .set(incrementByOid).equalTo(record::getIncrementByOid)
            .set(isChangeToGroup).equalTo(record::getIsChangeToGroup)
            .set(isChangeToSimple).equalTo(record::getIsChangeToSimple)
            .set(isChangeToTime).equalTo(record::getIsChangeToTime)
            .set(isNoMaxValue).equalTo(record::getIsNoMaxValue)
            .set(isNoMinValue).equalTo(record::getIsNoMinValue)
            .set(isRestart).equalTo(record::getIsRestart)
            .set(maxValueOid).equalTo(record::getMaxValueOid)
            .set(minValueOid).equalTo(record::getMinValueOid)
            .set(nameOid).equalTo(record::getNameOid)
            .set(order).equalTo(record::getOrder)
            .set(restartWithOid).equalTo(record::getRestartWithOid)
            .set(schema).equalTo(record::getSchema)
            .set(startWithOid).equalTo(record::getStartWithOid)
            .set(withCache).equalTo(record::getWithCache)
            .where(oid, isEqualTo(record::getOid))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_sequence_statement")
    default int updateByPrimaryKeySelective(SqlAlterSequenceStatement record) {
        return update(c ->
            c.set(cache).equalToWhenPresent(record::getCache)
            .set(cacheValueOid).equalToWhenPresent(record::getCacheValueOid)
            .set(cycle).equalToWhenPresent(record::getCycle)
            .set(incrementByOid).equalToWhenPresent(record::getIncrementByOid)
            .set(isChangeToGroup).equalToWhenPresent(record::getIsChangeToGroup)
            .set(isChangeToSimple).equalToWhenPresent(record::getIsChangeToSimple)
            .set(isChangeToTime).equalToWhenPresent(record::getIsChangeToTime)
            .set(isNoMaxValue).equalToWhenPresent(record::getIsNoMaxValue)
            .set(isNoMinValue).equalToWhenPresent(record::getIsNoMinValue)
            .set(isRestart).equalToWhenPresent(record::getIsRestart)
            .set(maxValueOid).equalToWhenPresent(record::getMaxValueOid)
            .set(minValueOid).equalToWhenPresent(record::getMinValueOid)
            .set(nameOid).equalToWhenPresent(record::getNameOid)
            .set(order).equalToWhenPresent(record::getOrder)
            .set(restartWithOid).equalToWhenPresent(record::getRestartWithOid)
            .set(schema).equalToWhenPresent(record::getSchema)
            .set(startWithOid).equalToWhenPresent(record::getStartWithOid)
            .set(withCache).equalToWhenPresent(record::getWithCache)
            .where(oid, isEqualTo(record::getOid))
        );
    }
}