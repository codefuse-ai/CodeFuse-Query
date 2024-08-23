package com.alipay.codequery.dal.mybatis.mapper;

import static com.alipay.codequery.dal.mybatis.mapper.SqlOverDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.alipay.codequery.dal.mybatis.domain.SqlOver;
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
public interface SqlOverMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_over")
    BasicColumn[] selectList = BasicColumn.columnList(oid, clusterByOid, distributeByOid, isExcludeCurrentRow, isWindowingBetweenEndFollowing, isWindowingBetweenEndPreceding, isWindowingPreceding, ofOid, orderByOid, sortByOid, windowingBetweenBeginOid, windowingBetweenBeginBound, windowingBetweenEndOid, windowingBetweenEndBound, windowingType);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_over")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_over")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_over")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<SqlOver> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_over")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<SqlOver> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_over")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="cluster_by_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="distribute_by_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_exclude_current_row", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_windowing_between_end_following", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_windowing_between_end_preceding", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_windowing_preceding", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="of_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="order_by_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="sort_by_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="windowing_between_begin_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="windowing_between_begin_bound", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="windowing_between_end_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="windowing_between_end_bound", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="windowing_type", javaType=String.class, jdbcType=JdbcType.VARCHAR)
    })
    Optional<SqlOver> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_over")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="cluster_by_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="distribute_by_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_exclude_current_row", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_windowing_between_end_following", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_windowing_between_end_preceding", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_windowing_preceding", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="of_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="order_by_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="sort_by_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="windowing_between_begin_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="windowing_between_begin_bound", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="windowing_between_end_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="windowing_between_end_bound", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="windowing_type", javaType=String.class, jdbcType=JdbcType.VARCHAR)
    })
    List<SqlOver> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_over")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_over")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, sqlOver, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_over")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, sqlOver, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_over")
    default int deleteByPrimaryKey(Long oid_) {
        return delete(c -> 
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_over")
    default int insert(SqlOver record) {
        return MyBatis3Utils.insert(this::insert, record, sqlOver, c ->
            c.map(oid).toProperty("oid")
            .map(clusterByOid).toProperty("clusterByOid")
            .map(distributeByOid).toProperty("distributeByOid")
            .map(isExcludeCurrentRow).toProperty("isExcludeCurrentRow")
            .map(isWindowingBetweenEndFollowing).toProperty("isWindowingBetweenEndFollowing")
            .map(isWindowingBetweenEndPreceding).toProperty("isWindowingBetweenEndPreceding")
            .map(isWindowingPreceding).toProperty("isWindowingPreceding")
            .map(ofOid).toProperty("ofOid")
            .map(orderByOid).toProperty("orderByOid")
            .map(sortByOid).toProperty("sortByOid")
            .map(windowingBetweenBeginOid).toProperty("windowingBetweenBeginOid")
            .map(windowingBetweenBeginBound).toProperty("windowingBetweenBeginBound")
            .map(windowingBetweenEndOid).toProperty("windowingBetweenEndOid")
            .map(windowingBetweenEndBound).toProperty("windowingBetweenEndBound")
            .map(windowingType).toProperty("windowingType")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_over")
    default int insertMultiple(Collection<SqlOver> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, sqlOver, c ->
            c.map(oid).toProperty("oid")
            .map(clusterByOid).toProperty("clusterByOid")
            .map(distributeByOid).toProperty("distributeByOid")
            .map(isExcludeCurrentRow).toProperty("isExcludeCurrentRow")
            .map(isWindowingBetweenEndFollowing).toProperty("isWindowingBetweenEndFollowing")
            .map(isWindowingBetweenEndPreceding).toProperty("isWindowingBetweenEndPreceding")
            .map(isWindowingPreceding).toProperty("isWindowingPreceding")
            .map(ofOid).toProperty("ofOid")
            .map(orderByOid).toProperty("orderByOid")
            .map(sortByOid).toProperty("sortByOid")
            .map(windowingBetweenBeginOid).toProperty("windowingBetweenBeginOid")
            .map(windowingBetweenBeginBound).toProperty("windowingBetweenBeginBound")
            .map(windowingBetweenEndOid).toProperty("windowingBetweenEndOid")
            .map(windowingBetweenEndBound).toProperty("windowingBetweenEndBound")
            .map(windowingType).toProperty("windowingType")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_over")
    default int insertSelective(SqlOver record) {
        return MyBatis3Utils.insert(this::insert, record, sqlOver, c ->
            c.map(oid).toPropertyWhenPresent("oid", record::getOid)
            .map(clusterByOid).toPropertyWhenPresent("clusterByOid", record::getClusterByOid)
            .map(distributeByOid).toPropertyWhenPresent("distributeByOid", record::getDistributeByOid)
            .map(isExcludeCurrentRow).toPropertyWhenPresent("isExcludeCurrentRow", record::getIsExcludeCurrentRow)
            .map(isWindowingBetweenEndFollowing).toPropertyWhenPresent("isWindowingBetweenEndFollowing", record::getIsWindowingBetweenEndFollowing)
            .map(isWindowingBetweenEndPreceding).toPropertyWhenPresent("isWindowingBetweenEndPreceding", record::getIsWindowingBetweenEndPreceding)
            .map(isWindowingPreceding).toPropertyWhenPresent("isWindowingPreceding", record::getIsWindowingPreceding)
            .map(ofOid).toPropertyWhenPresent("ofOid", record::getOfOid)
            .map(orderByOid).toPropertyWhenPresent("orderByOid", record::getOrderByOid)
            .map(sortByOid).toPropertyWhenPresent("sortByOid", record::getSortByOid)
            .map(windowingBetweenBeginOid).toPropertyWhenPresent("windowingBetweenBeginOid", record::getWindowingBetweenBeginOid)
            .map(windowingBetweenBeginBound).toPropertyWhenPresent("windowingBetweenBeginBound", record::getWindowingBetweenBeginBound)
            .map(windowingBetweenEndOid).toPropertyWhenPresent("windowingBetweenEndOid", record::getWindowingBetweenEndOid)
            .map(windowingBetweenEndBound).toPropertyWhenPresent("windowingBetweenEndBound", record::getWindowingBetweenEndBound)
            .map(windowingType).toPropertyWhenPresent("windowingType", record::getWindowingType)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_over")
    default Optional<SqlOver> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, sqlOver, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_over")
    default List<SqlOver> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, sqlOver, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_over")
    default List<SqlOver> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, sqlOver, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_over")
    default Optional<SqlOver> selectByPrimaryKey(Long oid_) {
        return selectOne(c ->
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_over")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, sqlOver, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_over")
    static UpdateDSL<UpdateModel> updateAllColumns(SqlOver record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalTo(record::getOid)
                .set(clusterByOid).equalTo(record::getClusterByOid)
                .set(distributeByOid).equalTo(record::getDistributeByOid)
                .set(isExcludeCurrentRow).equalTo(record::getIsExcludeCurrentRow)
                .set(isWindowingBetweenEndFollowing).equalTo(record::getIsWindowingBetweenEndFollowing)
                .set(isWindowingBetweenEndPreceding).equalTo(record::getIsWindowingBetweenEndPreceding)
                .set(isWindowingPreceding).equalTo(record::getIsWindowingPreceding)
                .set(ofOid).equalTo(record::getOfOid)
                .set(orderByOid).equalTo(record::getOrderByOid)
                .set(sortByOid).equalTo(record::getSortByOid)
                .set(windowingBetweenBeginOid).equalTo(record::getWindowingBetweenBeginOid)
                .set(windowingBetweenBeginBound).equalTo(record::getWindowingBetweenBeginBound)
                .set(windowingBetweenEndOid).equalTo(record::getWindowingBetweenEndOid)
                .set(windowingBetweenEndBound).equalTo(record::getWindowingBetweenEndBound)
                .set(windowingType).equalTo(record::getWindowingType);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_over")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(SqlOver record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalToWhenPresent(record::getOid)
                .set(clusterByOid).equalToWhenPresent(record::getClusterByOid)
                .set(distributeByOid).equalToWhenPresent(record::getDistributeByOid)
                .set(isExcludeCurrentRow).equalToWhenPresent(record::getIsExcludeCurrentRow)
                .set(isWindowingBetweenEndFollowing).equalToWhenPresent(record::getIsWindowingBetweenEndFollowing)
                .set(isWindowingBetweenEndPreceding).equalToWhenPresent(record::getIsWindowingBetweenEndPreceding)
                .set(isWindowingPreceding).equalToWhenPresent(record::getIsWindowingPreceding)
                .set(ofOid).equalToWhenPresent(record::getOfOid)
                .set(orderByOid).equalToWhenPresent(record::getOrderByOid)
                .set(sortByOid).equalToWhenPresent(record::getSortByOid)
                .set(windowingBetweenBeginOid).equalToWhenPresent(record::getWindowingBetweenBeginOid)
                .set(windowingBetweenBeginBound).equalToWhenPresent(record::getWindowingBetweenBeginBound)
                .set(windowingBetweenEndOid).equalToWhenPresent(record::getWindowingBetweenEndOid)
                .set(windowingBetweenEndBound).equalToWhenPresent(record::getWindowingBetweenEndBound)
                .set(windowingType).equalToWhenPresent(record::getWindowingType);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_over")
    default int updateByPrimaryKey(SqlOver record) {
        return update(c ->
            c.set(clusterByOid).equalTo(record::getClusterByOid)
            .set(distributeByOid).equalTo(record::getDistributeByOid)
            .set(isExcludeCurrentRow).equalTo(record::getIsExcludeCurrentRow)
            .set(isWindowingBetweenEndFollowing).equalTo(record::getIsWindowingBetweenEndFollowing)
            .set(isWindowingBetweenEndPreceding).equalTo(record::getIsWindowingBetweenEndPreceding)
            .set(isWindowingPreceding).equalTo(record::getIsWindowingPreceding)
            .set(ofOid).equalTo(record::getOfOid)
            .set(orderByOid).equalTo(record::getOrderByOid)
            .set(sortByOid).equalTo(record::getSortByOid)
            .set(windowingBetweenBeginOid).equalTo(record::getWindowingBetweenBeginOid)
            .set(windowingBetweenBeginBound).equalTo(record::getWindowingBetweenBeginBound)
            .set(windowingBetweenEndOid).equalTo(record::getWindowingBetweenEndOid)
            .set(windowingBetweenEndBound).equalTo(record::getWindowingBetweenEndBound)
            .set(windowingType).equalTo(record::getWindowingType)
            .where(oid, isEqualTo(record::getOid))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_over")
    default int updateByPrimaryKeySelective(SqlOver record) {
        return update(c ->
            c.set(clusterByOid).equalToWhenPresent(record::getClusterByOid)
            .set(distributeByOid).equalToWhenPresent(record::getDistributeByOid)
            .set(isExcludeCurrentRow).equalToWhenPresent(record::getIsExcludeCurrentRow)
            .set(isWindowingBetweenEndFollowing).equalToWhenPresent(record::getIsWindowingBetweenEndFollowing)
            .set(isWindowingBetweenEndPreceding).equalToWhenPresent(record::getIsWindowingBetweenEndPreceding)
            .set(isWindowingPreceding).equalToWhenPresent(record::getIsWindowingPreceding)
            .set(ofOid).equalToWhenPresent(record::getOfOid)
            .set(orderByOid).equalToWhenPresent(record::getOrderByOid)
            .set(sortByOid).equalToWhenPresent(record::getSortByOid)
            .set(windowingBetweenBeginOid).equalToWhenPresent(record::getWindowingBetweenBeginOid)
            .set(windowingBetweenBeginBound).equalToWhenPresent(record::getWindowingBetweenBeginBound)
            .set(windowingBetweenEndOid).equalToWhenPresent(record::getWindowingBetweenEndOid)
            .set(windowingBetweenEndBound).equalToWhenPresent(record::getWindowingBetweenEndBound)
            .set(windowingType).equalToWhenPresent(record::getWindowingType)
            .where(oid, isEqualTo(record::getOid))
        );
    }
}