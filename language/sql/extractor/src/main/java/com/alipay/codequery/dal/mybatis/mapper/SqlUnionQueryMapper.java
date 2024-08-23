package com.alipay.codequery.dal.mybatis.mapper;

import static com.alipay.codequery.dal.mybatis.mapper.SqlUnionQueryDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.alipay.codequery.dal.mybatis.domain.SqlUnionQuery;
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
public interface SqlUnionQueryMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_union_query")
    BasicColumn[] selectList = BasicColumn.columnList(oid, firstQueryBlockOid, isEmpty, leftOid, limitOid, operator, orderByOid, rightOid);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_union_query")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_union_query")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_union_query")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<SqlUnionQuery> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_union_query")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<SqlUnionQuery> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_union_query")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="first_query_block_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_empty", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="left_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="limit_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="operator", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="order_by_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="right_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT)
    })
    Optional<SqlUnionQuery> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_union_query")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="first_query_block_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_empty", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="left_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="limit_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="operator", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="order_by_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="right_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT)
    })
    List<SqlUnionQuery> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_union_query")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_union_query")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, sqlUnionQuery, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_union_query")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, sqlUnionQuery, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_union_query")
    default int deleteByPrimaryKey(Long oid_) {
        return delete(c -> 
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_union_query")
    default int insert(SqlUnionQuery record) {
        return MyBatis3Utils.insert(this::insert, record, sqlUnionQuery, c ->
            c.map(oid).toProperty("oid")
            .map(firstQueryBlockOid).toProperty("firstQueryBlockOid")
            .map(isEmpty).toProperty("isEmpty")
            .map(leftOid).toProperty("leftOid")
            .map(limitOid).toProperty("limitOid")
            .map(operator).toProperty("operator")
            .map(orderByOid).toProperty("orderByOid")
            .map(rightOid).toProperty("rightOid")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_union_query")
    default int insertMultiple(Collection<SqlUnionQuery> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, sqlUnionQuery, c ->
            c.map(oid).toProperty("oid")
            .map(firstQueryBlockOid).toProperty("firstQueryBlockOid")
            .map(isEmpty).toProperty("isEmpty")
            .map(leftOid).toProperty("leftOid")
            .map(limitOid).toProperty("limitOid")
            .map(operator).toProperty("operator")
            .map(orderByOid).toProperty("orderByOid")
            .map(rightOid).toProperty("rightOid")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_union_query")
    default int insertSelective(SqlUnionQuery record) {
        return MyBatis3Utils.insert(this::insert, record, sqlUnionQuery, c ->
            c.map(oid).toPropertyWhenPresent("oid", record::getOid)
            .map(firstQueryBlockOid).toPropertyWhenPresent("firstQueryBlockOid", record::getFirstQueryBlockOid)
            .map(isEmpty).toPropertyWhenPresent("isEmpty", record::getIsEmpty)
            .map(leftOid).toPropertyWhenPresent("leftOid", record::getLeftOid)
            .map(limitOid).toPropertyWhenPresent("limitOid", record::getLimitOid)
            .map(operator).toPropertyWhenPresent("operator", record::getOperator)
            .map(orderByOid).toPropertyWhenPresent("orderByOid", record::getOrderByOid)
            .map(rightOid).toPropertyWhenPresent("rightOid", record::getRightOid)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_union_query")
    default Optional<SqlUnionQuery> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, sqlUnionQuery, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_union_query")
    default List<SqlUnionQuery> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, sqlUnionQuery, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_union_query")
    default List<SqlUnionQuery> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, sqlUnionQuery, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_union_query")
    default Optional<SqlUnionQuery> selectByPrimaryKey(Long oid_) {
        return selectOne(c ->
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_union_query")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, sqlUnionQuery, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_union_query")
    static UpdateDSL<UpdateModel> updateAllColumns(SqlUnionQuery record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalTo(record::getOid)
                .set(firstQueryBlockOid).equalTo(record::getFirstQueryBlockOid)
                .set(isEmpty).equalTo(record::getIsEmpty)
                .set(leftOid).equalTo(record::getLeftOid)
                .set(limitOid).equalTo(record::getLimitOid)
                .set(operator).equalTo(record::getOperator)
                .set(orderByOid).equalTo(record::getOrderByOid)
                .set(rightOid).equalTo(record::getRightOid);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_union_query")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(SqlUnionQuery record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalToWhenPresent(record::getOid)
                .set(firstQueryBlockOid).equalToWhenPresent(record::getFirstQueryBlockOid)
                .set(isEmpty).equalToWhenPresent(record::getIsEmpty)
                .set(leftOid).equalToWhenPresent(record::getLeftOid)
                .set(limitOid).equalToWhenPresent(record::getLimitOid)
                .set(operator).equalToWhenPresent(record::getOperator)
                .set(orderByOid).equalToWhenPresent(record::getOrderByOid)
                .set(rightOid).equalToWhenPresent(record::getRightOid);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_union_query")
    default int updateByPrimaryKey(SqlUnionQuery record) {
        return update(c ->
            c.set(firstQueryBlockOid).equalTo(record::getFirstQueryBlockOid)
            .set(isEmpty).equalTo(record::getIsEmpty)
            .set(leftOid).equalTo(record::getLeftOid)
            .set(limitOid).equalTo(record::getLimitOid)
            .set(operator).equalTo(record::getOperator)
            .set(orderByOid).equalTo(record::getOrderByOid)
            .set(rightOid).equalTo(record::getRightOid)
            .where(oid, isEqualTo(record::getOid))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_union_query")
    default int updateByPrimaryKeySelective(SqlUnionQuery record) {
        return update(c ->
            c.set(firstQueryBlockOid).equalToWhenPresent(record::getFirstQueryBlockOid)
            .set(isEmpty).equalToWhenPresent(record::getIsEmpty)
            .set(leftOid).equalToWhenPresent(record::getLeftOid)
            .set(limitOid).equalToWhenPresent(record::getLimitOid)
            .set(operator).equalToWhenPresent(record::getOperator)
            .set(orderByOid).equalToWhenPresent(record::getOrderByOid)
            .set(rightOid).equalToWhenPresent(record::getRightOid)
            .where(oid, isEqualTo(record::getOid))
        );
    }
}