package com.alipay.codequery.dal.mybatis.mapper;

import static com.alipay.codequery.dal.mybatis.mapper.PgSelectQueryBlockDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.alipay.codequery.dal.mybatis.domain.PgSelectQueryBlock;
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
public interface PgSelectQueryBlockMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: pg_select_query_block")
    BasicColumn[] selectList = BasicColumn.columnList(oid, fetch, forClause, intoOption);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: pg_select_query_block")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: pg_select_query_block")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: pg_select_query_block")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<PgSelectQueryBlock> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: pg_select_query_block")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<PgSelectQueryBlock> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: pg_select_query_block")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="fetch", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="for_clause", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="into_option", javaType=String.class, jdbcType=JdbcType.VARCHAR)
    })
    Optional<PgSelectQueryBlock> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: pg_select_query_block")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="fetch", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="for_clause", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="into_option", javaType=String.class, jdbcType=JdbcType.VARCHAR)
    })
    List<PgSelectQueryBlock> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: pg_select_query_block")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: pg_select_query_block")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, pgSelectQueryBlock, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: pg_select_query_block")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, pgSelectQueryBlock, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: pg_select_query_block")
    default int deleteByPrimaryKey(Long oid_) {
        return delete(c -> 
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: pg_select_query_block")
    default int insert(PgSelectQueryBlock record) {
        return MyBatis3Utils.insert(this::insert, record, pgSelectQueryBlock, c ->
            c.map(oid).toProperty("oid")
            .map(fetch).toProperty("fetch")
            .map(forClause).toProperty("forClause")
            .map(intoOption).toProperty("intoOption")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: pg_select_query_block")
    default int insertMultiple(Collection<PgSelectQueryBlock> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, pgSelectQueryBlock, c ->
            c.map(oid).toProperty("oid")
            .map(fetch).toProperty("fetch")
            .map(forClause).toProperty("forClause")
            .map(intoOption).toProperty("intoOption")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: pg_select_query_block")
    default int insertSelective(PgSelectQueryBlock record) {
        return MyBatis3Utils.insert(this::insert, record, pgSelectQueryBlock, c ->
            c.map(oid).toPropertyWhenPresent("oid", record::getOid)
            .map(fetch).toPropertyWhenPresent("fetch", record::getFetch)
            .map(forClause).toPropertyWhenPresent("forClause", record::getForClause)
            .map(intoOption).toPropertyWhenPresent("intoOption", record::getIntoOption)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: pg_select_query_block")
    default Optional<PgSelectQueryBlock> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, pgSelectQueryBlock, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: pg_select_query_block")
    default List<PgSelectQueryBlock> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, pgSelectQueryBlock, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: pg_select_query_block")
    default List<PgSelectQueryBlock> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, pgSelectQueryBlock, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: pg_select_query_block")
    default Optional<PgSelectQueryBlock> selectByPrimaryKey(Long oid_) {
        return selectOne(c ->
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: pg_select_query_block")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, pgSelectQueryBlock, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: pg_select_query_block")
    static UpdateDSL<UpdateModel> updateAllColumns(PgSelectQueryBlock record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalTo(record::getOid)
                .set(fetch).equalTo(record::getFetch)
                .set(forClause).equalTo(record::getForClause)
                .set(intoOption).equalTo(record::getIntoOption);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: pg_select_query_block")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(PgSelectQueryBlock record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalToWhenPresent(record::getOid)
                .set(fetch).equalToWhenPresent(record::getFetch)
                .set(forClause).equalToWhenPresent(record::getForClause)
                .set(intoOption).equalToWhenPresent(record::getIntoOption);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: pg_select_query_block")
    default int updateByPrimaryKey(PgSelectQueryBlock record) {
        return update(c ->
            c.set(fetch).equalTo(record::getFetch)
            .set(forClause).equalTo(record::getForClause)
            .set(intoOption).equalTo(record::getIntoOption)
            .where(oid, isEqualTo(record::getOid))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: pg_select_query_block")
    default int updateByPrimaryKeySelective(PgSelectQueryBlock record) {
        return update(c ->
            c.set(fetch).equalToWhenPresent(record::getFetch)
            .set(forClause).equalToWhenPresent(record::getForClause)
            .set(intoOption).equalToWhenPresent(record::getIntoOption)
            .where(oid, isEqualTo(record::getOid))
        );
    }
}