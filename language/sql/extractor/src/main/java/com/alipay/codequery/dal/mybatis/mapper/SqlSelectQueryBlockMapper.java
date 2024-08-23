package com.alipay.codequery.dal.mybatis.mapper;

import static com.alipay.codequery.dal.mybatis.mapper.SqlSelectQueryBlockDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.alipay.codequery.dal.mybatis.domain.SqlSelectQueryBlock;
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
public interface SqlSelectQueryBlockMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_select_query_block")
    BasicColumn[] selectList = BasicColumn.columnList(oid, cachedSelectList, cachedSelectListHash, connectByOid, distionOption, firstOid, forUpdateOfSize, fromOid, groupByOid, hintsSize, intoOid, isDistinct, isForShare, isForUpdate, isNoCycle, isNoWait, isPrior, isSkipLocked, limitOid, offsetOid, orderByOid, orderBySiblingsOid, startWithOid, waitTimeOid, whereOid);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_select_query_block")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_select_query_block")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_select_query_block")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<SqlSelectQueryBlock> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_select_query_block")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<SqlSelectQueryBlock> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_select_query_block")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="cached_select_list", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="cached_select_list_hash", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="connect_by_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="distion_option", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="first_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="for_update_of_size", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="from_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="group_by_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="hints_size", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="into_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_distinct", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_for_share", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_for_update", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_no_cycle", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_no_wait", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_prior", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_skip_locked", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="limit_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="offset_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="order_by_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="order_by_siblings_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="start_with_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="wait_time_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="where_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT)
    })
    Optional<SqlSelectQueryBlock> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_select_query_block")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="cached_select_list", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="cached_select_list_hash", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="connect_by_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="distion_option", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="first_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="for_update_of_size", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="from_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="group_by_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="hints_size", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="into_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_distinct", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_for_share", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_for_update", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_no_cycle", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_no_wait", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_prior", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_skip_locked", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="limit_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="offset_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="order_by_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="order_by_siblings_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="start_with_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="wait_time_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="where_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT)
    })
    List<SqlSelectQueryBlock> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_select_query_block")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_select_query_block")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, sqlSelectQueryBlock, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_select_query_block")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, sqlSelectQueryBlock, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_select_query_block")
    default int deleteByPrimaryKey(Long oid_) {
        return delete(c -> 
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_select_query_block")
    default int insert(SqlSelectQueryBlock record) {
        return MyBatis3Utils.insert(this::insert, record, sqlSelectQueryBlock, c ->
            c.map(oid).toProperty("oid")
            .map(cachedSelectList).toProperty("cachedSelectList")
            .map(cachedSelectListHash).toProperty("cachedSelectListHash")
            .map(connectByOid).toProperty("connectByOid")
            .map(distionOption).toProperty("distionOption")
            .map(firstOid).toProperty("firstOid")
            .map(forUpdateOfSize).toProperty("forUpdateOfSize")
            .map(fromOid).toProperty("fromOid")
            .map(groupByOid).toProperty("groupByOid")
            .map(hintsSize).toProperty("hintsSize")
            .map(intoOid).toProperty("intoOid")
            .map(isDistinct).toProperty("isDistinct")
            .map(isForShare).toProperty("isForShare")
            .map(isForUpdate).toProperty("isForUpdate")
            .map(isNoCycle).toProperty("isNoCycle")
            .map(isNoWait).toProperty("isNoWait")
            .map(isPrior).toProperty("isPrior")
            .map(isSkipLocked).toProperty("isSkipLocked")
            .map(limitOid).toProperty("limitOid")
            .map(offsetOid).toProperty("offsetOid")
            .map(orderByOid).toProperty("orderByOid")
            .map(orderBySiblingsOid).toProperty("orderBySiblingsOid")
            .map(startWithOid).toProperty("startWithOid")
            .map(waitTimeOid).toProperty("waitTimeOid")
            .map(whereOid).toProperty("whereOid")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_select_query_block")
    default int insertMultiple(Collection<SqlSelectQueryBlock> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, sqlSelectQueryBlock, c ->
            c.map(oid).toProperty("oid")
            .map(cachedSelectList).toProperty("cachedSelectList")
            .map(cachedSelectListHash).toProperty("cachedSelectListHash")
            .map(connectByOid).toProperty("connectByOid")
            .map(distionOption).toProperty("distionOption")
            .map(firstOid).toProperty("firstOid")
            .map(forUpdateOfSize).toProperty("forUpdateOfSize")
            .map(fromOid).toProperty("fromOid")
            .map(groupByOid).toProperty("groupByOid")
            .map(hintsSize).toProperty("hintsSize")
            .map(intoOid).toProperty("intoOid")
            .map(isDistinct).toProperty("isDistinct")
            .map(isForShare).toProperty("isForShare")
            .map(isForUpdate).toProperty("isForUpdate")
            .map(isNoCycle).toProperty("isNoCycle")
            .map(isNoWait).toProperty("isNoWait")
            .map(isPrior).toProperty("isPrior")
            .map(isSkipLocked).toProperty("isSkipLocked")
            .map(limitOid).toProperty("limitOid")
            .map(offsetOid).toProperty("offsetOid")
            .map(orderByOid).toProperty("orderByOid")
            .map(orderBySiblingsOid).toProperty("orderBySiblingsOid")
            .map(startWithOid).toProperty("startWithOid")
            .map(waitTimeOid).toProperty("waitTimeOid")
            .map(whereOid).toProperty("whereOid")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_select_query_block")
    default int insertSelective(SqlSelectQueryBlock record) {
        return MyBatis3Utils.insert(this::insert, record, sqlSelectQueryBlock, c ->
            c.map(oid).toPropertyWhenPresent("oid", record::getOid)
            .map(cachedSelectList).toPropertyWhenPresent("cachedSelectList", record::getCachedSelectList)
            .map(cachedSelectListHash).toPropertyWhenPresent("cachedSelectListHash", record::getCachedSelectListHash)
            .map(connectByOid).toPropertyWhenPresent("connectByOid", record::getConnectByOid)
            .map(distionOption).toPropertyWhenPresent("distionOption", record::getDistionOption)
            .map(firstOid).toPropertyWhenPresent("firstOid", record::getFirstOid)
            .map(forUpdateOfSize).toPropertyWhenPresent("forUpdateOfSize", record::getForUpdateOfSize)
            .map(fromOid).toPropertyWhenPresent("fromOid", record::getFromOid)
            .map(groupByOid).toPropertyWhenPresent("groupByOid", record::getGroupByOid)
            .map(hintsSize).toPropertyWhenPresent("hintsSize", record::getHintsSize)
            .map(intoOid).toPropertyWhenPresent("intoOid", record::getIntoOid)
            .map(isDistinct).toPropertyWhenPresent("isDistinct", record::getIsDistinct)
            .map(isForShare).toPropertyWhenPresent("isForShare", record::getIsForShare)
            .map(isForUpdate).toPropertyWhenPresent("isForUpdate", record::getIsForUpdate)
            .map(isNoCycle).toPropertyWhenPresent("isNoCycle", record::getIsNoCycle)
            .map(isNoWait).toPropertyWhenPresent("isNoWait", record::getIsNoWait)
            .map(isPrior).toPropertyWhenPresent("isPrior", record::getIsPrior)
            .map(isSkipLocked).toPropertyWhenPresent("isSkipLocked", record::getIsSkipLocked)
            .map(limitOid).toPropertyWhenPresent("limitOid", record::getLimitOid)
            .map(offsetOid).toPropertyWhenPresent("offsetOid", record::getOffsetOid)
            .map(orderByOid).toPropertyWhenPresent("orderByOid", record::getOrderByOid)
            .map(orderBySiblingsOid).toPropertyWhenPresent("orderBySiblingsOid", record::getOrderBySiblingsOid)
            .map(startWithOid).toPropertyWhenPresent("startWithOid", record::getStartWithOid)
            .map(waitTimeOid).toPropertyWhenPresent("waitTimeOid", record::getWaitTimeOid)
            .map(whereOid).toPropertyWhenPresent("whereOid", record::getWhereOid)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_select_query_block")
    default Optional<SqlSelectQueryBlock> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, sqlSelectQueryBlock, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_select_query_block")
    default List<SqlSelectQueryBlock> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, sqlSelectQueryBlock, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_select_query_block")
    default List<SqlSelectQueryBlock> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, sqlSelectQueryBlock, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_select_query_block")
    default Optional<SqlSelectQueryBlock> selectByPrimaryKey(Long oid_) {
        return selectOne(c ->
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_select_query_block")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, sqlSelectQueryBlock, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_select_query_block")
    static UpdateDSL<UpdateModel> updateAllColumns(SqlSelectQueryBlock record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalTo(record::getOid)
                .set(cachedSelectList).equalTo(record::getCachedSelectList)
                .set(cachedSelectListHash).equalTo(record::getCachedSelectListHash)
                .set(connectByOid).equalTo(record::getConnectByOid)
                .set(distionOption).equalTo(record::getDistionOption)
                .set(firstOid).equalTo(record::getFirstOid)
                .set(forUpdateOfSize).equalTo(record::getForUpdateOfSize)
                .set(fromOid).equalTo(record::getFromOid)
                .set(groupByOid).equalTo(record::getGroupByOid)
                .set(hintsSize).equalTo(record::getHintsSize)
                .set(intoOid).equalTo(record::getIntoOid)
                .set(isDistinct).equalTo(record::getIsDistinct)
                .set(isForShare).equalTo(record::getIsForShare)
                .set(isForUpdate).equalTo(record::getIsForUpdate)
                .set(isNoCycle).equalTo(record::getIsNoCycle)
                .set(isNoWait).equalTo(record::getIsNoWait)
                .set(isPrior).equalTo(record::getIsPrior)
                .set(isSkipLocked).equalTo(record::getIsSkipLocked)
                .set(limitOid).equalTo(record::getLimitOid)
                .set(offsetOid).equalTo(record::getOffsetOid)
                .set(orderByOid).equalTo(record::getOrderByOid)
                .set(orderBySiblingsOid).equalTo(record::getOrderBySiblingsOid)
                .set(startWithOid).equalTo(record::getStartWithOid)
                .set(waitTimeOid).equalTo(record::getWaitTimeOid)
                .set(whereOid).equalTo(record::getWhereOid);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_select_query_block")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(SqlSelectQueryBlock record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalToWhenPresent(record::getOid)
                .set(cachedSelectList).equalToWhenPresent(record::getCachedSelectList)
                .set(cachedSelectListHash).equalToWhenPresent(record::getCachedSelectListHash)
                .set(connectByOid).equalToWhenPresent(record::getConnectByOid)
                .set(distionOption).equalToWhenPresent(record::getDistionOption)
                .set(firstOid).equalToWhenPresent(record::getFirstOid)
                .set(forUpdateOfSize).equalToWhenPresent(record::getForUpdateOfSize)
                .set(fromOid).equalToWhenPresent(record::getFromOid)
                .set(groupByOid).equalToWhenPresent(record::getGroupByOid)
                .set(hintsSize).equalToWhenPresent(record::getHintsSize)
                .set(intoOid).equalToWhenPresent(record::getIntoOid)
                .set(isDistinct).equalToWhenPresent(record::getIsDistinct)
                .set(isForShare).equalToWhenPresent(record::getIsForShare)
                .set(isForUpdate).equalToWhenPresent(record::getIsForUpdate)
                .set(isNoCycle).equalToWhenPresent(record::getIsNoCycle)
                .set(isNoWait).equalToWhenPresent(record::getIsNoWait)
                .set(isPrior).equalToWhenPresent(record::getIsPrior)
                .set(isSkipLocked).equalToWhenPresent(record::getIsSkipLocked)
                .set(limitOid).equalToWhenPresent(record::getLimitOid)
                .set(offsetOid).equalToWhenPresent(record::getOffsetOid)
                .set(orderByOid).equalToWhenPresent(record::getOrderByOid)
                .set(orderBySiblingsOid).equalToWhenPresent(record::getOrderBySiblingsOid)
                .set(startWithOid).equalToWhenPresent(record::getStartWithOid)
                .set(waitTimeOid).equalToWhenPresent(record::getWaitTimeOid)
                .set(whereOid).equalToWhenPresent(record::getWhereOid);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_select_query_block")
    default int updateByPrimaryKey(SqlSelectQueryBlock record) {
        return update(c ->
            c.set(cachedSelectList).equalTo(record::getCachedSelectList)
            .set(cachedSelectListHash).equalTo(record::getCachedSelectListHash)
            .set(connectByOid).equalTo(record::getConnectByOid)
            .set(distionOption).equalTo(record::getDistionOption)
            .set(firstOid).equalTo(record::getFirstOid)
            .set(forUpdateOfSize).equalTo(record::getForUpdateOfSize)
            .set(fromOid).equalTo(record::getFromOid)
            .set(groupByOid).equalTo(record::getGroupByOid)
            .set(hintsSize).equalTo(record::getHintsSize)
            .set(intoOid).equalTo(record::getIntoOid)
            .set(isDistinct).equalTo(record::getIsDistinct)
            .set(isForShare).equalTo(record::getIsForShare)
            .set(isForUpdate).equalTo(record::getIsForUpdate)
            .set(isNoCycle).equalTo(record::getIsNoCycle)
            .set(isNoWait).equalTo(record::getIsNoWait)
            .set(isPrior).equalTo(record::getIsPrior)
            .set(isSkipLocked).equalTo(record::getIsSkipLocked)
            .set(limitOid).equalTo(record::getLimitOid)
            .set(offsetOid).equalTo(record::getOffsetOid)
            .set(orderByOid).equalTo(record::getOrderByOid)
            .set(orderBySiblingsOid).equalTo(record::getOrderBySiblingsOid)
            .set(startWithOid).equalTo(record::getStartWithOid)
            .set(waitTimeOid).equalTo(record::getWaitTimeOid)
            .set(whereOid).equalTo(record::getWhereOid)
            .where(oid, isEqualTo(record::getOid))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_select_query_block")
    default int updateByPrimaryKeySelective(SqlSelectQueryBlock record) {
        return update(c ->
            c.set(cachedSelectList).equalToWhenPresent(record::getCachedSelectList)
            .set(cachedSelectListHash).equalToWhenPresent(record::getCachedSelectListHash)
            .set(connectByOid).equalToWhenPresent(record::getConnectByOid)
            .set(distionOption).equalToWhenPresent(record::getDistionOption)
            .set(firstOid).equalToWhenPresent(record::getFirstOid)
            .set(forUpdateOfSize).equalToWhenPresent(record::getForUpdateOfSize)
            .set(fromOid).equalToWhenPresent(record::getFromOid)
            .set(groupByOid).equalToWhenPresent(record::getGroupByOid)
            .set(hintsSize).equalToWhenPresent(record::getHintsSize)
            .set(intoOid).equalToWhenPresent(record::getIntoOid)
            .set(isDistinct).equalToWhenPresent(record::getIsDistinct)
            .set(isForShare).equalToWhenPresent(record::getIsForShare)
            .set(isForUpdate).equalToWhenPresent(record::getIsForUpdate)
            .set(isNoCycle).equalToWhenPresent(record::getIsNoCycle)
            .set(isNoWait).equalToWhenPresent(record::getIsNoWait)
            .set(isPrior).equalToWhenPresent(record::getIsPrior)
            .set(isSkipLocked).equalToWhenPresent(record::getIsSkipLocked)
            .set(limitOid).equalToWhenPresent(record::getLimitOid)
            .set(offsetOid).equalToWhenPresent(record::getOffsetOid)
            .set(orderByOid).equalToWhenPresent(record::getOrderByOid)
            .set(orderBySiblingsOid).equalToWhenPresent(record::getOrderBySiblingsOid)
            .set(startWithOid).equalToWhenPresent(record::getStartWithOid)
            .set(waitTimeOid).equalToWhenPresent(record::getWaitTimeOid)
            .set(whereOid).equalToWhenPresent(record::getWhereOid)
            .where(oid, isEqualTo(record::getOid))
        );
    }
}