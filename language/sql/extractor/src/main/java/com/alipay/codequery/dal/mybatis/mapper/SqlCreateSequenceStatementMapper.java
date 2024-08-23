package com.alipay.codequery.dal.mybatis.mapper;

import static com.alipay.codequery.dal.mybatis.mapper.SqlCreateSequenceStatementDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.alipay.codequery.dal.mybatis.domain.SqlCreateSequenceStatement;
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
public interface SqlCreateSequenceStatementMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_create_sequence_statement")
    BasicColumn[] selectList = BasicColumn.columnList(oid, cache, cacheValueOid, cycle, incrementByOid, isGroup, isNoMaxValue, isNoMinValue, isSimple, isTime, maxValueOid, minValueOid, nameOid, order, schema, startWithOid, stepOid, unitCountOid, unitIndexOid, withCache);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_create_sequence_statement")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_create_sequence_statement")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_create_sequence_statement")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<SqlCreateSequenceStatement> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_create_sequence_statement")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<SqlCreateSequenceStatement> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_create_sequence_statement")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="cache", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="cache_value_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="cycle", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="increment_by_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_group", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_no_max_value", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_no_min_value", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_simple", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_time", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="max_value_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="min_value_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="name_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="order", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="schema", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="start_with_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="step_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="unit_count_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="unit_index_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="with_cache", javaType=Integer.class, jdbcType=JdbcType.BIGINT)
    })
    Optional<SqlCreateSequenceStatement> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_create_sequence_statement")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="cache", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="cache_value_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="cycle", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="increment_by_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_group", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_no_max_value", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_no_min_value", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_simple", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_time", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="max_value_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="min_value_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="name_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="order", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="schema", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="start_with_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="step_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="unit_count_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="unit_index_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="with_cache", javaType=Integer.class, jdbcType=JdbcType.BIGINT)
    })
    List<SqlCreateSequenceStatement> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_create_sequence_statement")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_create_sequence_statement")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, sqlCreateSequenceStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_create_sequence_statement")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, sqlCreateSequenceStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_create_sequence_statement")
    default int deleteByPrimaryKey(Long oid_) {
        return delete(c -> 
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_create_sequence_statement")
    default int insert(SqlCreateSequenceStatement record) {
        return MyBatis3Utils.insert(this::insert, record, sqlCreateSequenceStatement, c ->
            c.map(oid).toProperty("oid")
            .map(cache).toProperty("cache")
            .map(cacheValueOid).toProperty("cacheValueOid")
            .map(cycle).toProperty("cycle")
            .map(incrementByOid).toProperty("incrementByOid")
            .map(isGroup).toProperty("isGroup")
            .map(isNoMaxValue).toProperty("isNoMaxValue")
            .map(isNoMinValue).toProperty("isNoMinValue")
            .map(isSimple).toProperty("isSimple")
            .map(isTime).toProperty("isTime")
            .map(maxValueOid).toProperty("maxValueOid")
            .map(minValueOid).toProperty("minValueOid")
            .map(nameOid).toProperty("nameOid")
            .map(order).toProperty("order")
            .map(schema).toProperty("schema")
            .map(startWithOid).toProperty("startWithOid")
            .map(stepOid).toProperty("stepOid")
            .map(unitCountOid).toProperty("unitCountOid")
            .map(unitIndexOid).toProperty("unitIndexOid")
            .map(withCache).toProperty("withCache")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_create_sequence_statement")
    default int insertMultiple(Collection<SqlCreateSequenceStatement> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, sqlCreateSequenceStatement, c ->
            c.map(oid).toProperty("oid")
            .map(cache).toProperty("cache")
            .map(cacheValueOid).toProperty("cacheValueOid")
            .map(cycle).toProperty("cycle")
            .map(incrementByOid).toProperty("incrementByOid")
            .map(isGroup).toProperty("isGroup")
            .map(isNoMaxValue).toProperty("isNoMaxValue")
            .map(isNoMinValue).toProperty("isNoMinValue")
            .map(isSimple).toProperty("isSimple")
            .map(isTime).toProperty("isTime")
            .map(maxValueOid).toProperty("maxValueOid")
            .map(minValueOid).toProperty("minValueOid")
            .map(nameOid).toProperty("nameOid")
            .map(order).toProperty("order")
            .map(schema).toProperty("schema")
            .map(startWithOid).toProperty("startWithOid")
            .map(stepOid).toProperty("stepOid")
            .map(unitCountOid).toProperty("unitCountOid")
            .map(unitIndexOid).toProperty("unitIndexOid")
            .map(withCache).toProperty("withCache")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_create_sequence_statement")
    default int insertSelective(SqlCreateSequenceStatement record) {
        return MyBatis3Utils.insert(this::insert, record, sqlCreateSequenceStatement, c ->
            c.map(oid).toPropertyWhenPresent("oid", record::getOid)
            .map(cache).toPropertyWhenPresent("cache", record::getCache)
            .map(cacheValueOid).toPropertyWhenPresent("cacheValueOid", record::getCacheValueOid)
            .map(cycle).toPropertyWhenPresent("cycle", record::getCycle)
            .map(incrementByOid).toPropertyWhenPresent("incrementByOid", record::getIncrementByOid)
            .map(isGroup).toPropertyWhenPresent("isGroup", record::getIsGroup)
            .map(isNoMaxValue).toPropertyWhenPresent("isNoMaxValue", record::getIsNoMaxValue)
            .map(isNoMinValue).toPropertyWhenPresent("isNoMinValue", record::getIsNoMinValue)
            .map(isSimple).toPropertyWhenPresent("isSimple", record::getIsSimple)
            .map(isTime).toPropertyWhenPresent("isTime", record::getIsTime)
            .map(maxValueOid).toPropertyWhenPresent("maxValueOid", record::getMaxValueOid)
            .map(minValueOid).toPropertyWhenPresent("minValueOid", record::getMinValueOid)
            .map(nameOid).toPropertyWhenPresent("nameOid", record::getNameOid)
            .map(order).toPropertyWhenPresent("order", record::getOrder)
            .map(schema).toPropertyWhenPresent("schema", record::getSchema)
            .map(startWithOid).toPropertyWhenPresent("startWithOid", record::getStartWithOid)
            .map(stepOid).toPropertyWhenPresent("stepOid", record::getStepOid)
            .map(unitCountOid).toPropertyWhenPresent("unitCountOid", record::getUnitCountOid)
            .map(unitIndexOid).toPropertyWhenPresent("unitIndexOid", record::getUnitIndexOid)
            .map(withCache).toPropertyWhenPresent("withCache", record::getWithCache)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_create_sequence_statement")
    default Optional<SqlCreateSequenceStatement> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, sqlCreateSequenceStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_create_sequence_statement")
    default List<SqlCreateSequenceStatement> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, sqlCreateSequenceStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_create_sequence_statement")
    default List<SqlCreateSequenceStatement> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, sqlCreateSequenceStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_create_sequence_statement")
    default Optional<SqlCreateSequenceStatement> selectByPrimaryKey(Long oid_) {
        return selectOne(c ->
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_create_sequence_statement")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, sqlCreateSequenceStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_create_sequence_statement")
    static UpdateDSL<UpdateModel> updateAllColumns(SqlCreateSequenceStatement record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalTo(record::getOid)
                .set(cache).equalTo(record::getCache)
                .set(cacheValueOid).equalTo(record::getCacheValueOid)
                .set(cycle).equalTo(record::getCycle)
                .set(incrementByOid).equalTo(record::getIncrementByOid)
                .set(isGroup).equalTo(record::getIsGroup)
                .set(isNoMaxValue).equalTo(record::getIsNoMaxValue)
                .set(isNoMinValue).equalTo(record::getIsNoMinValue)
                .set(isSimple).equalTo(record::getIsSimple)
                .set(isTime).equalTo(record::getIsTime)
                .set(maxValueOid).equalTo(record::getMaxValueOid)
                .set(minValueOid).equalTo(record::getMinValueOid)
                .set(nameOid).equalTo(record::getNameOid)
                .set(order).equalTo(record::getOrder)
                .set(schema).equalTo(record::getSchema)
                .set(startWithOid).equalTo(record::getStartWithOid)
                .set(stepOid).equalTo(record::getStepOid)
                .set(unitCountOid).equalTo(record::getUnitCountOid)
                .set(unitIndexOid).equalTo(record::getUnitIndexOid)
                .set(withCache).equalTo(record::getWithCache);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_create_sequence_statement")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(SqlCreateSequenceStatement record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalToWhenPresent(record::getOid)
                .set(cache).equalToWhenPresent(record::getCache)
                .set(cacheValueOid).equalToWhenPresent(record::getCacheValueOid)
                .set(cycle).equalToWhenPresent(record::getCycle)
                .set(incrementByOid).equalToWhenPresent(record::getIncrementByOid)
                .set(isGroup).equalToWhenPresent(record::getIsGroup)
                .set(isNoMaxValue).equalToWhenPresent(record::getIsNoMaxValue)
                .set(isNoMinValue).equalToWhenPresent(record::getIsNoMinValue)
                .set(isSimple).equalToWhenPresent(record::getIsSimple)
                .set(isTime).equalToWhenPresent(record::getIsTime)
                .set(maxValueOid).equalToWhenPresent(record::getMaxValueOid)
                .set(minValueOid).equalToWhenPresent(record::getMinValueOid)
                .set(nameOid).equalToWhenPresent(record::getNameOid)
                .set(order).equalToWhenPresent(record::getOrder)
                .set(schema).equalToWhenPresent(record::getSchema)
                .set(startWithOid).equalToWhenPresent(record::getStartWithOid)
                .set(stepOid).equalToWhenPresent(record::getStepOid)
                .set(unitCountOid).equalToWhenPresent(record::getUnitCountOid)
                .set(unitIndexOid).equalToWhenPresent(record::getUnitIndexOid)
                .set(withCache).equalToWhenPresent(record::getWithCache);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_create_sequence_statement")
    default int updateByPrimaryKey(SqlCreateSequenceStatement record) {
        return update(c ->
            c.set(cache).equalTo(record::getCache)
            .set(cacheValueOid).equalTo(record::getCacheValueOid)
            .set(cycle).equalTo(record::getCycle)
            .set(incrementByOid).equalTo(record::getIncrementByOid)
            .set(isGroup).equalTo(record::getIsGroup)
            .set(isNoMaxValue).equalTo(record::getIsNoMaxValue)
            .set(isNoMinValue).equalTo(record::getIsNoMinValue)
            .set(isSimple).equalTo(record::getIsSimple)
            .set(isTime).equalTo(record::getIsTime)
            .set(maxValueOid).equalTo(record::getMaxValueOid)
            .set(minValueOid).equalTo(record::getMinValueOid)
            .set(nameOid).equalTo(record::getNameOid)
            .set(order).equalTo(record::getOrder)
            .set(schema).equalTo(record::getSchema)
            .set(startWithOid).equalTo(record::getStartWithOid)
            .set(stepOid).equalTo(record::getStepOid)
            .set(unitCountOid).equalTo(record::getUnitCountOid)
            .set(unitIndexOid).equalTo(record::getUnitIndexOid)
            .set(withCache).equalTo(record::getWithCache)
            .where(oid, isEqualTo(record::getOid))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_create_sequence_statement")
    default int updateByPrimaryKeySelective(SqlCreateSequenceStatement record) {
        return update(c ->
            c.set(cache).equalToWhenPresent(record::getCache)
            .set(cacheValueOid).equalToWhenPresent(record::getCacheValueOid)
            .set(cycle).equalToWhenPresent(record::getCycle)
            .set(incrementByOid).equalToWhenPresent(record::getIncrementByOid)
            .set(isGroup).equalToWhenPresent(record::getIsGroup)
            .set(isNoMaxValue).equalToWhenPresent(record::getIsNoMaxValue)
            .set(isNoMinValue).equalToWhenPresent(record::getIsNoMinValue)
            .set(isSimple).equalToWhenPresent(record::getIsSimple)
            .set(isTime).equalToWhenPresent(record::getIsTime)
            .set(maxValueOid).equalToWhenPresent(record::getMaxValueOid)
            .set(minValueOid).equalToWhenPresent(record::getMinValueOid)
            .set(nameOid).equalToWhenPresent(record::getNameOid)
            .set(order).equalToWhenPresent(record::getOrder)
            .set(schema).equalToWhenPresent(record::getSchema)
            .set(startWithOid).equalToWhenPresent(record::getStartWithOid)
            .set(stepOid).equalToWhenPresent(record::getStepOid)
            .set(unitCountOid).equalToWhenPresent(record::getUnitCountOid)
            .set(unitIndexOid).equalToWhenPresent(record::getUnitIndexOid)
            .set(withCache).equalToWhenPresent(record::getWithCache)
            .where(oid, isEqualTo(record::getOid))
        );
    }
}