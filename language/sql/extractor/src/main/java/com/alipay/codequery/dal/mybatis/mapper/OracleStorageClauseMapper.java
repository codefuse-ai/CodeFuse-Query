package com.alipay.codequery.dal.mybatis.mapper;

import static com.alipay.codequery.dal.mybatis.mapper.OracleStorageClauseDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.alipay.codequery.dal.mybatis.domain.OracleStorageClause;
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
public interface OracleStorageClauseMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_storage_clause")
    BasicColumn[] selectList = BasicColumn.columnList(oid, bufferPoolOid, cellFlashCache, flashCache, freeListGroupsOid, freeListsOid, initialOid, maxExtentsOid, maxSizeOid, minExtentsOid, nextOid, objnoOid, pctIncreaseOid);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_storage_clause")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_storage_clause")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_storage_clause")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<OracleStorageClause> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_storage_clause")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<OracleStorageClause> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_storage_clause")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="buffer_pool_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="cell_flash_cache", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="flash_cache", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="free_list_groups_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="free_lists_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="initial_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="max_extents_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="max_size_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="min_extents_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="next_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="objno_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="pct_increase_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT)
    })
    Optional<OracleStorageClause> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_storage_clause")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="buffer_pool_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="cell_flash_cache", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="flash_cache", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="free_list_groups_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="free_lists_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="initial_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="max_extents_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="max_size_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="min_extents_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="next_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="objno_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="pct_increase_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT)
    })
    List<OracleStorageClause> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_storage_clause")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_storage_clause")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, oracleStorageClause, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_storage_clause")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, oracleStorageClause, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_storage_clause")
    default int deleteByPrimaryKey(Long oid_) {
        return delete(c -> 
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_storage_clause")
    default int insert(OracleStorageClause record) {
        return MyBatis3Utils.insert(this::insert, record, oracleStorageClause, c ->
            c.map(oid).toProperty("oid")
            .map(bufferPoolOid).toProperty("bufferPoolOid")
            .map(cellFlashCache).toProperty("cellFlashCache")
            .map(flashCache).toProperty("flashCache")
            .map(freeListGroupsOid).toProperty("freeListGroupsOid")
            .map(freeListsOid).toProperty("freeListsOid")
            .map(initialOid).toProperty("initialOid")
            .map(maxExtentsOid).toProperty("maxExtentsOid")
            .map(maxSizeOid).toProperty("maxSizeOid")
            .map(minExtentsOid).toProperty("minExtentsOid")
            .map(nextOid).toProperty("nextOid")
            .map(objnoOid).toProperty("objnoOid")
            .map(pctIncreaseOid).toProperty("pctIncreaseOid")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_storage_clause")
    default int insertMultiple(Collection<OracleStorageClause> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, oracleStorageClause, c ->
            c.map(oid).toProperty("oid")
            .map(bufferPoolOid).toProperty("bufferPoolOid")
            .map(cellFlashCache).toProperty("cellFlashCache")
            .map(flashCache).toProperty("flashCache")
            .map(freeListGroupsOid).toProperty("freeListGroupsOid")
            .map(freeListsOid).toProperty("freeListsOid")
            .map(initialOid).toProperty("initialOid")
            .map(maxExtentsOid).toProperty("maxExtentsOid")
            .map(maxSizeOid).toProperty("maxSizeOid")
            .map(minExtentsOid).toProperty("minExtentsOid")
            .map(nextOid).toProperty("nextOid")
            .map(objnoOid).toProperty("objnoOid")
            .map(pctIncreaseOid).toProperty("pctIncreaseOid")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_storage_clause")
    default int insertSelective(OracleStorageClause record) {
        return MyBatis3Utils.insert(this::insert, record, oracleStorageClause, c ->
            c.map(oid).toPropertyWhenPresent("oid", record::getOid)
            .map(bufferPoolOid).toPropertyWhenPresent("bufferPoolOid", record::getBufferPoolOid)
            .map(cellFlashCache).toPropertyWhenPresent("cellFlashCache", record::getCellFlashCache)
            .map(flashCache).toPropertyWhenPresent("flashCache", record::getFlashCache)
            .map(freeListGroupsOid).toPropertyWhenPresent("freeListGroupsOid", record::getFreeListGroupsOid)
            .map(freeListsOid).toPropertyWhenPresent("freeListsOid", record::getFreeListsOid)
            .map(initialOid).toPropertyWhenPresent("initialOid", record::getInitialOid)
            .map(maxExtentsOid).toPropertyWhenPresent("maxExtentsOid", record::getMaxExtentsOid)
            .map(maxSizeOid).toPropertyWhenPresent("maxSizeOid", record::getMaxSizeOid)
            .map(minExtentsOid).toPropertyWhenPresent("minExtentsOid", record::getMinExtentsOid)
            .map(nextOid).toPropertyWhenPresent("nextOid", record::getNextOid)
            .map(objnoOid).toPropertyWhenPresent("objnoOid", record::getObjnoOid)
            .map(pctIncreaseOid).toPropertyWhenPresent("pctIncreaseOid", record::getPctIncreaseOid)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_storage_clause")
    default Optional<OracleStorageClause> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, oracleStorageClause, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_storage_clause")
    default List<OracleStorageClause> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, oracleStorageClause, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_storage_clause")
    default List<OracleStorageClause> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, oracleStorageClause, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_storage_clause")
    default Optional<OracleStorageClause> selectByPrimaryKey(Long oid_) {
        return selectOne(c ->
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_storage_clause")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, oracleStorageClause, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_storage_clause")
    static UpdateDSL<UpdateModel> updateAllColumns(OracleStorageClause record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalTo(record::getOid)
                .set(bufferPoolOid).equalTo(record::getBufferPoolOid)
                .set(cellFlashCache).equalTo(record::getCellFlashCache)
                .set(flashCache).equalTo(record::getFlashCache)
                .set(freeListGroupsOid).equalTo(record::getFreeListGroupsOid)
                .set(freeListsOid).equalTo(record::getFreeListsOid)
                .set(initialOid).equalTo(record::getInitialOid)
                .set(maxExtentsOid).equalTo(record::getMaxExtentsOid)
                .set(maxSizeOid).equalTo(record::getMaxSizeOid)
                .set(minExtentsOid).equalTo(record::getMinExtentsOid)
                .set(nextOid).equalTo(record::getNextOid)
                .set(objnoOid).equalTo(record::getObjnoOid)
                .set(pctIncreaseOid).equalTo(record::getPctIncreaseOid);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_storage_clause")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(OracleStorageClause record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalToWhenPresent(record::getOid)
                .set(bufferPoolOid).equalToWhenPresent(record::getBufferPoolOid)
                .set(cellFlashCache).equalToWhenPresent(record::getCellFlashCache)
                .set(flashCache).equalToWhenPresent(record::getFlashCache)
                .set(freeListGroupsOid).equalToWhenPresent(record::getFreeListGroupsOid)
                .set(freeListsOid).equalToWhenPresent(record::getFreeListsOid)
                .set(initialOid).equalToWhenPresent(record::getInitialOid)
                .set(maxExtentsOid).equalToWhenPresent(record::getMaxExtentsOid)
                .set(maxSizeOid).equalToWhenPresent(record::getMaxSizeOid)
                .set(minExtentsOid).equalToWhenPresent(record::getMinExtentsOid)
                .set(nextOid).equalToWhenPresent(record::getNextOid)
                .set(objnoOid).equalToWhenPresent(record::getObjnoOid)
                .set(pctIncreaseOid).equalToWhenPresent(record::getPctIncreaseOid);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_storage_clause")
    default int updateByPrimaryKey(OracleStorageClause record) {
        return update(c ->
            c.set(bufferPoolOid).equalTo(record::getBufferPoolOid)
            .set(cellFlashCache).equalTo(record::getCellFlashCache)
            .set(flashCache).equalTo(record::getFlashCache)
            .set(freeListGroupsOid).equalTo(record::getFreeListGroupsOid)
            .set(freeListsOid).equalTo(record::getFreeListsOid)
            .set(initialOid).equalTo(record::getInitialOid)
            .set(maxExtentsOid).equalTo(record::getMaxExtentsOid)
            .set(maxSizeOid).equalTo(record::getMaxSizeOid)
            .set(minExtentsOid).equalTo(record::getMinExtentsOid)
            .set(nextOid).equalTo(record::getNextOid)
            .set(objnoOid).equalTo(record::getObjnoOid)
            .set(pctIncreaseOid).equalTo(record::getPctIncreaseOid)
            .where(oid, isEqualTo(record::getOid))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_storage_clause")
    default int updateByPrimaryKeySelective(OracleStorageClause record) {
        return update(c ->
            c.set(bufferPoolOid).equalToWhenPresent(record::getBufferPoolOid)
            .set(cellFlashCache).equalToWhenPresent(record::getCellFlashCache)
            .set(flashCache).equalToWhenPresent(record::getFlashCache)
            .set(freeListGroupsOid).equalToWhenPresent(record::getFreeListGroupsOid)
            .set(freeListsOid).equalToWhenPresent(record::getFreeListsOid)
            .set(initialOid).equalToWhenPresent(record::getInitialOid)
            .set(maxExtentsOid).equalToWhenPresent(record::getMaxExtentsOid)
            .set(maxSizeOid).equalToWhenPresent(record::getMaxSizeOid)
            .set(minExtentsOid).equalToWhenPresent(record::getMinExtentsOid)
            .set(nextOid).equalToWhenPresent(record::getNextOid)
            .set(objnoOid).equalToWhenPresent(record::getObjnoOid)
            .set(pctIncreaseOid).equalToWhenPresent(record::getPctIncreaseOid)
            .where(oid, isEqualTo(record::getOid))
        );
    }
}