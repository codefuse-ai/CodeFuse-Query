package com.alipay.codequery.dal.mybatis.mapper;

import static com.alipay.codequery.dal.mybatis.mapper.MySqlSelectQueryBlockDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.alipay.codequery.dal.mybatis.domain.MySqlSelectQueryBlock;
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
public interface MySqlSelectQueryBlockMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_select_query_block")
    BasicColumn[] selectList = BasicColumn.columnList(oid, cache, forcePartitionOid, hintsSize, isBigResult, isBufferResult, isCalcFoundRows, isHignPriority, isLockInShareMode, isSmallResult, isStraightJoin, procedureNameOid);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_select_query_block")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_select_query_block")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_select_query_block")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<MySqlSelectQueryBlock> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_select_query_block")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<MySqlSelectQueryBlock> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_select_query_block")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="cache", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="force_partition_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="hints_size", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_big_result", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_buffer_result", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_calc_found_rows", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_hign_priority", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_lock_in_share_mode", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_small_result", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_straight_join", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="procedure_name_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT)
    })
    Optional<MySqlSelectQueryBlock> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_select_query_block")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="cache", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="force_partition_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="hints_size", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_big_result", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_buffer_result", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_calc_found_rows", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_hign_priority", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_lock_in_share_mode", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_small_result", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_straight_join", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="procedure_name_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT)
    })
    List<MySqlSelectQueryBlock> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_select_query_block")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_select_query_block")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, mySqlSelectQueryBlock, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_select_query_block")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, mySqlSelectQueryBlock, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_select_query_block")
    default int deleteByPrimaryKey(Long oid_) {
        return delete(c -> 
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_select_query_block")
    default int insert(MySqlSelectQueryBlock record) {
        return MyBatis3Utils.insert(this::insert, record, mySqlSelectQueryBlock, c ->
            c.map(oid).toProperty("oid")
            .map(cache).toProperty("cache")
            .map(forcePartitionOid).toProperty("forcePartitionOid")
            .map(hintsSize).toProperty("hintsSize")
            .map(isBigResult).toProperty("isBigResult")
            .map(isBufferResult).toProperty("isBufferResult")
            .map(isCalcFoundRows).toProperty("isCalcFoundRows")
            .map(isHignPriority).toProperty("isHignPriority")
            .map(isLockInShareMode).toProperty("isLockInShareMode")
            .map(isSmallResult).toProperty("isSmallResult")
            .map(isStraightJoin).toProperty("isStraightJoin")
            .map(procedureNameOid).toProperty("procedureNameOid")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_select_query_block")
    default int insertMultiple(Collection<MySqlSelectQueryBlock> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, mySqlSelectQueryBlock, c ->
            c.map(oid).toProperty("oid")
            .map(cache).toProperty("cache")
            .map(forcePartitionOid).toProperty("forcePartitionOid")
            .map(hintsSize).toProperty("hintsSize")
            .map(isBigResult).toProperty("isBigResult")
            .map(isBufferResult).toProperty("isBufferResult")
            .map(isCalcFoundRows).toProperty("isCalcFoundRows")
            .map(isHignPriority).toProperty("isHignPriority")
            .map(isLockInShareMode).toProperty("isLockInShareMode")
            .map(isSmallResult).toProperty("isSmallResult")
            .map(isStraightJoin).toProperty("isStraightJoin")
            .map(procedureNameOid).toProperty("procedureNameOid")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_select_query_block")
    default int insertSelective(MySqlSelectQueryBlock record) {
        return MyBatis3Utils.insert(this::insert, record, mySqlSelectQueryBlock, c ->
            c.map(oid).toPropertyWhenPresent("oid", record::getOid)
            .map(cache).toPropertyWhenPresent("cache", record::getCache)
            .map(forcePartitionOid).toPropertyWhenPresent("forcePartitionOid", record::getForcePartitionOid)
            .map(hintsSize).toPropertyWhenPresent("hintsSize", record::getHintsSize)
            .map(isBigResult).toPropertyWhenPresent("isBigResult", record::getIsBigResult)
            .map(isBufferResult).toPropertyWhenPresent("isBufferResult", record::getIsBufferResult)
            .map(isCalcFoundRows).toPropertyWhenPresent("isCalcFoundRows", record::getIsCalcFoundRows)
            .map(isHignPriority).toPropertyWhenPresent("isHignPriority", record::getIsHignPriority)
            .map(isLockInShareMode).toPropertyWhenPresent("isLockInShareMode", record::getIsLockInShareMode)
            .map(isSmallResult).toPropertyWhenPresent("isSmallResult", record::getIsSmallResult)
            .map(isStraightJoin).toPropertyWhenPresent("isStraightJoin", record::getIsStraightJoin)
            .map(procedureNameOid).toPropertyWhenPresent("procedureNameOid", record::getProcedureNameOid)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_select_query_block")
    default Optional<MySqlSelectQueryBlock> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, mySqlSelectQueryBlock, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_select_query_block")
    default List<MySqlSelectQueryBlock> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, mySqlSelectQueryBlock, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_select_query_block")
    default List<MySqlSelectQueryBlock> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, mySqlSelectQueryBlock, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_select_query_block")
    default Optional<MySqlSelectQueryBlock> selectByPrimaryKey(Long oid_) {
        return selectOne(c ->
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_select_query_block")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, mySqlSelectQueryBlock, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_select_query_block")
    static UpdateDSL<UpdateModel> updateAllColumns(MySqlSelectQueryBlock record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalTo(record::getOid)
                .set(cache).equalTo(record::getCache)
                .set(forcePartitionOid).equalTo(record::getForcePartitionOid)
                .set(hintsSize).equalTo(record::getHintsSize)
                .set(isBigResult).equalTo(record::getIsBigResult)
                .set(isBufferResult).equalTo(record::getIsBufferResult)
                .set(isCalcFoundRows).equalTo(record::getIsCalcFoundRows)
                .set(isHignPriority).equalTo(record::getIsHignPriority)
                .set(isLockInShareMode).equalTo(record::getIsLockInShareMode)
                .set(isSmallResult).equalTo(record::getIsSmallResult)
                .set(isStraightJoin).equalTo(record::getIsStraightJoin)
                .set(procedureNameOid).equalTo(record::getProcedureNameOid);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_select_query_block")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(MySqlSelectQueryBlock record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalToWhenPresent(record::getOid)
                .set(cache).equalToWhenPresent(record::getCache)
                .set(forcePartitionOid).equalToWhenPresent(record::getForcePartitionOid)
                .set(hintsSize).equalToWhenPresent(record::getHintsSize)
                .set(isBigResult).equalToWhenPresent(record::getIsBigResult)
                .set(isBufferResult).equalToWhenPresent(record::getIsBufferResult)
                .set(isCalcFoundRows).equalToWhenPresent(record::getIsCalcFoundRows)
                .set(isHignPriority).equalToWhenPresent(record::getIsHignPriority)
                .set(isLockInShareMode).equalToWhenPresent(record::getIsLockInShareMode)
                .set(isSmallResult).equalToWhenPresent(record::getIsSmallResult)
                .set(isStraightJoin).equalToWhenPresent(record::getIsStraightJoin)
                .set(procedureNameOid).equalToWhenPresent(record::getProcedureNameOid);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_select_query_block")
    default int updateByPrimaryKey(MySqlSelectQueryBlock record) {
        return update(c ->
            c.set(cache).equalTo(record::getCache)
            .set(forcePartitionOid).equalTo(record::getForcePartitionOid)
            .set(hintsSize).equalTo(record::getHintsSize)
            .set(isBigResult).equalTo(record::getIsBigResult)
            .set(isBufferResult).equalTo(record::getIsBufferResult)
            .set(isCalcFoundRows).equalTo(record::getIsCalcFoundRows)
            .set(isHignPriority).equalTo(record::getIsHignPriority)
            .set(isLockInShareMode).equalTo(record::getIsLockInShareMode)
            .set(isSmallResult).equalTo(record::getIsSmallResult)
            .set(isStraightJoin).equalTo(record::getIsStraightJoin)
            .set(procedureNameOid).equalTo(record::getProcedureNameOid)
            .where(oid, isEqualTo(record::getOid))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_select_query_block")
    default int updateByPrimaryKeySelective(MySqlSelectQueryBlock record) {
        return update(c ->
            c.set(cache).equalToWhenPresent(record::getCache)
            .set(forcePartitionOid).equalToWhenPresent(record::getForcePartitionOid)
            .set(hintsSize).equalToWhenPresent(record::getHintsSize)
            .set(isBigResult).equalToWhenPresent(record::getIsBigResult)
            .set(isBufferResult).equalToWhenPresent(record::getIsBufferResult)
            .set(isCalcFoundRows).equalToWhenPresent(record::getIsCalcFoundRows)
            .set(isHignPriority).equalToWhenPresent(record::getIsHignPriority)
            .set(isLockInShareMode).equalToWhenPresent(record::getIsLockInShareMode)
            .set(isSmallResult).equalToWhenPresent(record::getIsSmallResult)
            .set(isStraightJoin).equalToWhenPresent(record::getIsStraightJoin)
            .set(procedureNameOid).equalToWhenPresent(record::getProcedureNameOid)
            .where(oid, isEqualTo(record::getOid))
        );
    }
}