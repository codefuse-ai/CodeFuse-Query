package com.alipay.codequery.dal.mybatis.mapper;

import static com.alipay.codequery.dal.mybatis.mapper.Db2SelectQueryBlockDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.alipay.codequery.dal.mybatis.domain.Db2SelectQueryBlock;
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
public interface Db2SelectQueryBlockMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: db2_select_query_block")
    BasicColumn[] selectList = BasicColumn.columnList(oid, isForReadOnly, isolation, optimizeForOid);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: db2_select_query_block")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: db2_select_query_block")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: db2_select_query_block")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<Db2SelectQueryBlock> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: db2_select_query_block")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<Db2SelectQueryBlock> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: db2_select_query_block")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="is_for_read_only", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="isolation", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="optimize_for_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT)
    })
    Optional<Db2SelectQueryBlock> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: db2_select_query_block")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="is_for_read_only", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="isolation", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="optimize_for_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT)
    })
    List<Db2SelectQueryBlock> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: db2_select_query_block")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: db2_select_query_block")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, db2SelectQueryBlock, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: db2_select_query_block")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, db2SelectQueryBlock, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: db2_select_query_block")
    default int deleteByPrimaryKey(Long oid_) {
        return delete(c -> 
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: db2_select_query_block")
    default int insert(Db2SelectQueryBlock record) {
        return MyBatis3Utils.insert(this::insert, record, db2SelectQueryBlock, c ->
            c.map(oid).toProperty("oid")
            .map(isForReadOnly).toProperty("isForReadOnly")
            .map(isolation).toProperty("isolation")
            .map(optimizeForOid).toProperty("optimizeForOid")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: db2_select_query_block")
    default int insertMultiple(Collection<Db2SelectQueryBlock> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, db2SelectQueryBlock, c ->
            c.map(oid).toProperty("oid")
            .map(isForReadOnly).toProperty("isForReadOnly")
            .map(isolation).toProperty("isolation")
            .map(optimizeForOid).toProperty("optimizeForOid")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: db2_select_query_block")
    default int insertSelective(Db2SelectQueryBlock record) {
        return MyBatis3Utils.insert(this::insert, record, db2SelectQueryBlock, c ->
            c.map(oid).toPropertyWhenPresent("oid", record::getOid)
            .map(isForReadOnly).toPropertyWhenPresent("isForReadOnly", record::getIsForReadOnly)
            .map(isolation).toPropertyWhenPresent("isolation", record::getIsolation)
            .map(optimizeForOid).toPropertyWhenPresent("optimizeForOid", record::getOptimizeForOid)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: db2_select_query_block")
    default Optional<Db2SelectQueryBlock> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, db2SelectQueryBlock, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: db2_select_query_block")
    default List<Db2SelectQueryBlock> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, db2SelectQueryBlock, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: db2_select_query_block")
    default List<Db2SelectQueryBlock> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, db2SelectQueryBlock, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: db2_select_query_block")
    default Optional<Db2SelectQueryBlock> selectByPrimaryKey(Long oid_) {
        return selectOne(c ->
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: db2_select_query_block")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, db2SelectQueryBlock, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: db2_select_query_block")
    static UpdateDSL<UpdateModel> updateAllColumns(Db2SelectQueryBlock record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalTo(record::getOid)
                .set(isForReadOnly).equalTo(record::getIsForReadOnly)
                .set(isolation).equalTo(record::getIsolation)
                .set(optimizeForOid).equalTo(record::getOptimizeForOid);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: db2_select_query_block")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(Db2SelectQueryBlock record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalToWhenPresent(record::getOid)
                .set(isForReadOnly).equalToWhenPresent(record::getIsForReadOnly)
                .set(isolation).equalToWhenPresent(record::getIsolation)
                .set(optimizeForOid).equalToWhenPresent(record::getOptimizeForOid);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: db2_select_query_block")
    default int updateByPrimaryKey(Db2SelectQueryBlock record) {
        return update(c ->
            c.set(isForReadOnly).equalTo(record::getIsForReadOnly)
            .set(isolation).equalTo(record::getIsolation)
            .set(optimizeForOid).equalTo(record::getOptimizeForOid)
            .where(oid, isEqualTo(record::getOid))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: db2_select_query_block")
    default int updateByPrimaryKeySelective(Db2SelectQueryBlock record) {
        return update(c ->
            c.set(isForReadOnly).equalToWhenPresent(record::getIsForReadOnly)
            .set(isolation).equalToWhenPresent(record::getIsolation)
            .set(optimizeForOid).equalToWhenPresent(record::getOptimizeForOid)
            .where(oid, isEqualTo(record::getOid))
        );
    }
}