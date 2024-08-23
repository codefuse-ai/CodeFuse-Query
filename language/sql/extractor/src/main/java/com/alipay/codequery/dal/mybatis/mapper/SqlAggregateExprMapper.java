package com.alipay.codequery.dal.mybatis.mapper;

import static com.alipay.codequery.dal.mybatis.mapper.SqlAggregateExprDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.alipay.codequery.dal.mybatis.domain.SqlAggregateExpr;
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
public interface SqlAggregateExprMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_aggregate_expr")
    BasicColumn[] selectList = BasicColumn.columnList(oid, filterOid, ignoreNulls, isDistinct, isIgnoreNulls, isWithinGroup, keepOid, option, orderByOid, overOid, overRefOid);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_aggregate_expr")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_aggregate_expr")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_aggregate_expr")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<SqlAggregateExpr> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_aggregate_expr")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<SqlAggregateExpr> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_aggregate_expr")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="filter_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="ignore_nulls", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_distinct", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_ignore_nulls", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_within_group", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="keep_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="option", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="order_by_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="over_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="over_ref_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT)
    })
    Optional<SqlAggregateExpr> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_aggregate_expr")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="filter_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="ignore_nulls", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_distinct", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_ignore_nulls", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_within_group", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="keep_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="option", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="order_by_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="over_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="over_ref_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT)
    })
    List<SqlAggregateExpr> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_aggregate_expr")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_aggregate_expr")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, sqlAggregateExpr, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_aggregate_expr")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, sqlAggregateExpr, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_aggregate_expr")
    default int deleteByPrimaryKey(Long oid_) {
        return delete(c -> 
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_aggregate_expr")
    default int insert(SqlAggregateExpr record) {
        return MyBatis3Utils.insert(this::insert, record, sqlAggregateExpr, c ->
            c.map(oid).toProperty("oid")
            .map(filterOid).toProperty("filterOid")
            .map(ignoreNulls).toProperty("ignoreNulls")
            .map(isDistinct).toProperty("isDistinct")
            .map(isIgnoreNulls).toProperty("isIgnoreNulls")
            .map(isWithinGroup).toProperty("isWithinGroup")
            .map(keepOid).toProperty("keepOid")
            .map(option).toProperty("option")
            .map(orderByOid).toProperty("orderByOid")
            .map(overOid).toProperty("overOid")
            .map(overRefOid).toProperty("overRefOid")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_aggregate_expr")
    default int insertMultiple(Collection<SqlAggregateExpr> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, sqlAggregateExpr, c ->
            c.map(oid).toProperty("oid")
            .map(filterOid).toProperty("filterOid")
            .map(ignoreNulls).toProperty("ignoreNulls")
            .map(isDistinct).toProperty("isDistinct")
            .map(isIgnoreNulls).toProperty("isIgnoreNulls")
            .map(isWithinGroup).toProperty("isWithinGroup")
            .map(keepOid).toProperty("keepOid")
            .map(option).toProperty("option")
            .map(orderByOid).toProperty("orderByOid")
            .map(overOid).toProperty("overOid")
            .map(overRefOid).toProperty("overRefOid")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_aggregate_expr")
    default int insertSelective(SqlAggregateExpr record) {
        return MyBatis3Utils.insert(this::insert, record, sqlAggregateExpr, c ->
            c.map(oid).toPropertyWhenPresent("oid", record::getOid)
            .map(filterOid).toPropertyWhenPresent("filterOid", record::getFilterOid)
            .map(ignoreNulls).toPropertyWhenPresent("ignoreNulls", record::getIgnoreNulls)
            .map(isDistinct).toPropertyWhenPresent("isDistinct", record::getIsDistinct)
            .map(isIgnoreNulls).toPropertyWhenPresent("isIgnoreNulls", record::getIsIgnoreNulls)
            .map(isWithinGroup).toPropertyWhenPresent("isWithinGroup", record::getIsWithinGroup)
            .map(keepOid).toPropertyWhenPresent("keepOid", record::getKeepOid)
            .map(option).toPropertyWhenPresent("option", record::getOption)
            .map(orderByOid).toPropertyWhenPresent("orderByOid", record::getOrderByOid)
            .map(overOid).toPropertyWhenPresent("overOid", record::getOverOid)
            .map(overRefOid).toPropertyWhenPresent("overRefOid", record::getOverRefOid)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_aggregate_expr")
    default Optional<SqlAggregateExpr> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, sqlAggregateExpr, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_aggregate_expr")
    default List<SqlAggregateExpr> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, sqlAggregateExpr, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_aggregate_expr")
    default List<SqlAggregateExpr> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, sqlAggregateExpr, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_aggregate_expr")
    default Optional<SqlAggregateExpr> selectByPrimaryKey(Long oid_) {
        return selectOne(c ->
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_aggregate_expr")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, sqlAggregateExpr, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_aggregate_expr")
    static UpdateDSL<UpdateModel> updateAllColumns(SqlAggregateExpr record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalTo(record::getOid)
                .set(filterOid).equalTo(record::getFilterOid)
                .set(ignoreNulls).equalTo(record::getIgnoreNulls)
                .set(isDistinct).equalTo(record::getIsDistinct)
                .set(isIgnoreNulls).equalTo(record::getIsIgnoreNulls)
                .set(isWithinGroup).equalTo(record::getIsWithinGroup)
                .set(keepOid).equalTo(record::getKeepOid)
                .set(option).equalTo(record::getOption)
                .set(orderByOid).equalTo(record::getOrderByOid)
                .set(overOid).equalTo(record::getOverOid)
                .set(overRefOid).equalTo(record::getOverRefOid);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_aggregate_expr")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(SqlAggregateExpr record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalToWhenPresent(record::getOid)
                .set(filterOid).equalToWhenPresent(record::getFilterOid)
                .set(ignoreNulls).equalToWhenPresent(record::getIgnoreNulls)
                .set(isDistinct).equalToWhenPresent(record::getIsDistinct)
                .set(isIgnoreNulls).equalToWhenPresent(record::getIsIgnoreNulls)
                .set(isWithinGroup).equalToWhenPresent(record::getIsWithinGroup)
                .set(keepOid).equalToWhenPresent(record::getKeepOid)
                .set(option).equalToWhenPresent(record::getOption)
                .set(orderByOid).equalToWhenPresent(record::getOrderByOid)
                .set(overOid).equalToWhenPresent(record::getOverOid)
                .set(overRefOid).equalToWhenPresent(record::getOverRefOid);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_aggregate_expr")
    default int updateByPrimaryKey(SqlAggregateExpr record) {
        return update(c ->
            c.set(filterOid).equalTo(record::getFilterOid)
            .set(ignoreNulls).equalTo(record::getIgnoreNulls)
            .set(isDistinct).equalTo(record::getIsDistinct)
            .set(isIgnoreNulls).equalTo(record::getIsIgnoreNulls)
            .set(isWithinGroup).equalTo(record::getIsWithinGroup)
            .set(keepOid).equalTo(record::getKeepOid)
            .set(option).equalTo(record::getOption)
            .set(orderByOid).equalTo(record::getOrderByOid)
            .set(overOid).equalTo(record::getOverOid)
            .set(overRefOid).equalTo(record::getOverRefOid)
            .where(oid, isEqualTo(record::getOid))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_aggregate_expr")
    default int updateByPrimaryKeySelective(SqlAggregateExpr record) {
        return update(c ->
            c.set(filterOid).equalToWhenPresent(record::getFilterOid)
            .set(ignoreNulls).equalToWhenPresent(record::getIgnoreNulls)
            .set(isDistinct).equalToWhenPresent(record::getIsDistinct)
            .set(isIgnoreNulls).equalToWhenPresent(record::getIsIgnoreNulls)
            .set(isWithinGroup).equalToWhenPresent(record::getIsWithinGroup)
            .set(keepOid).equalToWhenPresent(record::getKeepOid)
            .set(option).equalToWhenPresent(record::getOption)
            .set(orderByOid).equalToWhenPresent(record::getOrderByOid)
            .set(overOid).equalToWhenPresent(record::getOverOid)
            .set(overRefOid).equalToWhenPresent(record::getOverRefOid)
            .where(oid, isEqualTo(record::getOid))
        );
    }
}