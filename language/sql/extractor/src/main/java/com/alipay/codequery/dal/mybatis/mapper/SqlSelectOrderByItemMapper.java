package com.alipay.codequery.dal.mybatis.mapper;

import static com.alipay.codequery.dal.mybatis.mapper.SqlSelectOrderByItemDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.alipay.codequery.dal.mybatis.domain.SqlSelectOrderByItem;
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
public interface SqlSelectOrderByItemMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_select_order_by_item")
    BasicColumn[] selectList = BasicColumn.columnList(oid, collate, exprOid, isClusterBy, isDistributeBy, isSortBy, nullsOrderType, resolvedSelectItemOid, type);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_select_order_by_item")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_select_order_by_item")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_select_order_by_item")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<SqlSelectOrderByItem> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_select_order_by_item")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<SqlSelectOrderByItem> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_select_order_by_item")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="collate", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="expr_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_cluster_by", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_distribute_by", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_sort_by", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="nulls_order_type", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="resolved_select_item_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="type", javaType=String.class, jdbcType=JdbcType.VARCHAR)
    })
    Optional<SqlSelectOrderByItem> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_select_order_by_item")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="collate", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="expr_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_cluster_by", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_distribute_by", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_sort_by", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="nulls_order_type", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="resolved_select_item_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="type", javaType=String.class, jdbcType=JdbcType.VARCHAR)
    })
    List<SqlSelectOrderByItem> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_select_order_by_item")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_select_order_by_item")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, sqlSelectOrderByItem, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_select_order_by_item")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, sqlSelectOrderByItem, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_select_order_by_item")
    default int deleteByPrimaryKey(Long oid_) {
        return delete(c -> 
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_select_order_by_item")
    default int insert(SqlSelectOrderByItem record) {
        return MyBatis3Utils.insert(this::insert, record, sqlSelectOrderByItem, c ->
            c.map(oid).toProperty("oid")
            .map(collate).toProperty("collate")
            .map(exprOid).toProperty("exprOid")
            .map(isClusterBy).toProperty("isClusterBy")
            .map(isDistributeBy).toProperty("isDistributeBy")
            .map(isSortBy).toProperty("isSortBy")
            .map(nullsOrderType).toProperty("nullsOrderType")
            .map(resolvedSelectItemOid).toProperty("resolvedSelectItemOid")
            .map(type).toProperty("type")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_select_order_by_item")
    default int insertMultiple(Collection<SqlSelectOrderByItem> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, sqlSelectOrderByItem, c ->
            c.map(oid).toProperty("oid")
            .map(collate).toProperty("collate")
            .map(exprOid).toProperty("exprOid")
            .map(isClusterBy).toProperty("isClusterBy")
            .map(isDistributeBy).toProperty("isDistributeBy")
            .map(isSortBy).toProperty("isSortBy")
            .map(nullsOrderType).toProperty("nullsOrderType")
            .map(resolvedSelectItemOid).toProperty("resolvedSelectItemOid")
            .map(type).toProperty("type")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_select_order_by_item")
    default int insertSelective(SqlSelectOrderByItem record) {
        return MyBatis3Utils.insert(this::insert, record, sqlSelectOrderByItem, c ->
            c.map(oid).toPropertyWhenPresent("oid", record::getOid)
            .map(collate).toPropertyWhenPresent("collate", record::getCollate)
            .map(exprOid).toPropertyWhenPresent("exprOid", record::getExprOid)
            .map(isClusterBy).toPropertyWhenPresent("isClusterBy", record::getIsClusterBy)
            .map(isDistributeBy).toPropertyWhenPresent("isDistributeBy", record::getIsDistributeBy)
            .map(isSortBy).toPropertyWhenPresent("isSortBy", record::getIsSortBy)
            .map(nullsOrderType).toPropertyWhenPresent("nullsOrderType", record::getNullsOrderType)
            .map(resolvedSelectItemOid).toPropertyWhenPresent("resolvedSelectItemOid", record::getResolvedSelectItemOid)
            .map(type).toPropertyWhenPresent("type", record::getType)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_select_order_by_item")
    default Optional<SqlSelectOrderByItem> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, sqlSelectOrderByItem, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_select_order_by_item")
    default List<SqlSelectOrderByItem> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, sqlSelectOrderByItem, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_select_order_by_item")
    default List<SqlSelectOrderByItem> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, sqlSelectOrderByItem, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_select_order_by_item")
    default Optional<SqlSelectOrderByItem> selectByPrimaryKey(Long oid_) {
        return selectOne(c ->
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_select_order_by_item")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, sqlSelectOrderByItem, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_select_order_by_item")
    static UpdateDSL<UpdateModel> updateAllColumns(SqlSelectOrderByItem record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalTo(record::getOid)
                .set(collate).equalTo(record::getCollate)
                .set(exprOid).equalTo(record::getExprOid)
                .set(isClusterBy).equalTo(record::getIsClusterBy)
                .set(isDistributeBy).equalTo(record::getIsDistributeBy)
                .set(isSortBy).equalTo(record::getIsSortBy)
                .set(nullsOrderType).equalTo(record::getNullsOrderType)
                .set(resolvedSelectItemOid).equalTo(record::getResolvedSelectItemOid)
                .set(type).equalTo(record::getType);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_select_order_by_item")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(SqlSelectOrderByItem record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalToWhenPresent(record::getOid)
                .set(collate).equalToWhenPresent(record::getCollate)
                .set(exprOid).equalToWhenPresent(record::getExprOid)
                .set(isClusterBy).equalToWhenPresent(record::getIsClusterBy)
                .set(isDistributeBy).equalToWhenPresent(record::getIsDistributeBy)
                .set(isSortBy).equalToWhenPresent(record::getIsSortBy)
                .set(nullsOrderType).equalToWhenPresent(record::getNullsOrderType)
                .set(resolvedSelectItemOid).equalToWhenPresent(record::getResolvedSelectItemOid)
                .set(type).equalToWhenPresent(record::getType);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_select_order_by_item")
    default int updateByPrimaryKey(SqlSelectOrderByItem record) {
        return update(c ->
            c.set(collate).equalTo(record::getCollate)
            .set(exprOid).equalTo(record::getExprOid)
            .set(isClusterBy).equalTo(record::getIsClusterBy)
            .set(isDistributeBy).equalTo(record::getIsDistributeBy)
            .set(isSortBy).equalTo(record::getIsSortBy)
            .set(nullsOrderType).equalTo(record::getNullsOrderType)
            .set(resolvedSelectItemOid).equalTo(record::getResolvedSelectItemOid)
            .set(type).equalTo(record::getType)
            .where(oid, isEqualTo(record::getOid))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_select_order_by_item")
    default int updateByPrimaryKeySelective(SqlSelectOrderByItem record) {
        return update(c ->
            c.set(collate).equalToWhenPresent(record::getCollate)
            .set(exprOid).equalToWhenPresent(record::getExprOid)
            .set(isClusterBy).equalToWhenPresent(record::getIsClusterBy)
            .set(isDistributeBy).equalToWhenPresent(record::getIsDistributeBy)
            .set(isSortBy).equalToWhenPresent(record::getIsSortBy)
            .set(nullsOrderType).equalToWhenPresent(record::getNullsOrderType)
            .set(resolvedSelectItemOid).equalToWhenPresent(record::getResolvedSelectItemOid)
            .set(type).equalToWhenPresent(record::getType)
            .where(oid, isEqualTo(record::getOid))
        );
    }
}