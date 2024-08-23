package com.alipay.codequery.dal.mybatis.mapper;

import static com.alipay.codequery.dal.mybatis.mapper.HiveCreateTableStatementDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.alipay.codequery.dal.mybatis.domain.HiveCreateTableStatement;
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
public interface HiveCreateTableStatementMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: hive_create_table_statement")
    BasicColumn[] selectList = BasicColumn.columnList(oid, intoBucketsOid, isLikeQuery, metaLifeCycleOid, serdeProperties, usingOid);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: hive_create_table_statement")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: hive_create_table_statement")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: hive_create_table_statement")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<HiveCreateTableStatement> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: hive_create_table_statement")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<HiveCreateTableStatement> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: hive_create_table_statement")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="into_buckets_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_like_query", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="meta_life_cycle_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="serde_properties", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="using_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT)
    })
    Optional<HiveCreateTableStatement> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: hive_create_table_statement")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="into_buckets_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_like_query", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="meta_life_cycle_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="serde_properties", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="using_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT)
    })
    List<HiveCreateTableStatement> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: hive_create_table_statement")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: hive_create_table_statement")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, hiveCreateTableStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: hive_create_table_statement")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, hiveCreateTableStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: hive_create_table_statement")
    default int deleteByPrimaryKey(Long oid_) {
        return delete(c -> 
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: hive_create_table_statement")
    default int insert(HiveCreateTableStatement record) {
        return MyBatis3Utils.insert(this::insert, record, hiveCreateTableStatement, c ->
            c.map(oid).toProperty("oid")
            .map(intoBucketsOid).toProperty("intoBucketsOid")
            .map(isLikeQuery).toProperty("isLikeQuery")
            .map(metaLifeCycleOid).toProperty("metaLifeCycleOid")
            .map(serdeProperties).toProperty("serdeProperties")
            .map(usingOid).toProperty("usingOid")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: hive_create_table_statement")
    default int insertMultiple(Collection<HiveCreateTableStatement> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, hiveCreateTableStatement, c ->
            c.map(oid).toProperty("oid")
            .map(intoBucketsOid).toProperty("intoBucketsOid")
            .map(isLikeQuery).toProperty("isLikeQuery")
            .map(metaLifeCycleOid).toProperty("metaLifeCycleOid")
            .map(serdeProperties).toProperty("serdeProperties")
            .map(usingOid).toProperty("usingOid")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: hive_create_table_statement")
    default int insertSelective(HiveCreateTableStatement record) {
        return MyBatis3Utils.insert(this::insert, record, hiveCreateTableStatement, c ->
            c.map(oid).toPropertyWhenPresent("oid", record::getOid)
            .map(intoBucketsOid).toPropertyWhenPresent("intoBucketsOid", record::getIntoBucketsOid)
            .map(isLikeQuery).toPropertyWhenPresent("isLikeQuery", record::getIsLikeQuery)
            .map(metaLifeCycleOid).toPropertyWhenPresent("metaLifeCycleOid", record::getMetaLifeCycleOid)
            .map(serdeProperties).toPropertyWhenPresent("serdeProperties", record::getSerdeProperties)
            .map(usingOid).toPropertyWhenPresent("usingOid", record::getUsingOid)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: hive_create_table_statement")
    default Optional<HiveCreateTableStatement> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, hiveCreateTableStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: hive_create_table_statement")
    default List<HiveCreateTableStatement> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, hiveCreateTableStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: hive_create_table_statement")
    default List<HiveCreateTableStatement> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, hiveCreateTableStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: hive_create_table_statement")
    default Optional<HiveCreateTableStatement> selectByPrimaryKey(Long oid_) {
        return selectOne(c ->
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: hive_create_table_statement")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, hiveCreateTableStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: hive_create_table_statement")
    static UpdateDSL<UpdateModel> updateAllColumns(HiveCreateTableStatement record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalTo(record::getOid)
                .set(intoBucketsOid).equalTo(record::getIntoBucketsOid)
                .set(isLikeQuery).equalTo(record::getIsLikeQuery)
                .set(metaLifeCycleOid).equalTo(record::getMetaLifeCycleOid)
                .set(serdeProperties).equalTo(record::getSerdeProperties)
                .set(usingOid).equalTo(record::getUsingOid);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: hive_create_table_statement")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(HiveCreateTableStatement record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalToWhenPresent(record::getOid)
                .set(intoBucketsOid).equalToWhenPresent(record::getIntoBucketsOid)
                .set(isLikeQuery).equalToWhenPresent(record::getIsLikeQuery)
                .set(metaLifeCycleOid).equalToWhenPresent(record::getMetaLifeCycleOid)
                .set(serdeProperties).equalToWhenPresent(record::getSerdeProperties)
                .set(usingOid).equalToWhenPresent(record::getUsingOid);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: hive_create_table_statement")
    default int updateByPrimaryKey(HiveCreateTableStatement record) {
        return update(c ->
            c.set(intoBucketsOid).equalTo(record::getIntoBucketsOid)
            .set(isLikeQuery).equalTo(record::getIsLikeQuery)
            .set(metaLifeCycleOid).equalTo(record::getMetaLifeCycleOid)
            .set(serdeProperties).equalTo(record::getSerdeProperties)
            .set(usingOid).equalTo(record::getUsingOid)
            .where(oid, isEqualTo(record::getOid))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: hive_create_table_statement")
    default int updateByPrimaryKeySelective(HiveCreateTableStatement record) {
        return update(c ->
            c.set(intoBucketsOid).equalToWhenPresent(record::getIntoBucketsOid)
            .set(isLikeQuery).equalToWhenPresent(record::getIsLikeQuery)
            .set(metaLifeCycleOid).equalToWhenPresent(record::getMetaLifeCycleOid)
            .set(serdeProperties).equalToWhenPresent(record::getSerdeProperties)
            .set(usingOid).equalToWhenPresent(record::getUsingOid)
            .where(oid, isEqualTo(record::getOid))
        );
    }
}