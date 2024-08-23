package com.alipay.codequery.dal.mybatis.mapper;

import static com.alipay.codequery.dal.mybatis.mapper.HiveCreateFunctionStatementDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.alipay.codequery.dal.mybatis.domain.HiveCreateFunctionStatement;
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
public interface HiveCreateFunctionStatementMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: hive_create_function_statement")
    BasicColumn[] selectList = BasicColumn.columnList(oid, classNameOid, code, isDeclare, locationOid, resourceType, symbolOid);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: hive_create_function_statement")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: hive_create_function_statement")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: hive_create_function_statement")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<HiveCreateFunctionStatement> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: hive_create_function_statement")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<HiveCreateFunctionStatement> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: hive_create_function_statement")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="class_name_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="code", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="is_declare", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="location_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="resource_type", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="symbol_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT)
    })
    Optional<HiveCreateFunctionStatement> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: hive_create_function_statement")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="class_name_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="code", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="is_declare", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="location_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="resource_type", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="symbol_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT)
    })
    List<HiveCreateFunctionStatement> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: hive_create_function_statement")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: hive_create_function_statement")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, hiveCreateFunctionStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: hive_create_function_statement")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, hiveCreateFunctionStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: hive_create_function_statement")
    default int deleteByPrimaryKey(Long oid_) {
        return delete(c -> 
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: hive_create_function_statement")
    default int insert(HiveCreateFunctionStatement record) {
        return MyBatis3Utils.insert(this::insert, record, hiveCreateFunctionStatement, c ->
            c.map(oid).toProperty("oid")
            .map(classNameOid).toProperty("classNameOid")
            .map(code).toProperty("code")
            .map(isDeclare).toProperty("isDeclare")
            .map(locationOid).toProperty("locationOid")
            .map(resourceType).toProperty("resourceType")
            .map(symbolOid).toProperty("symbolOid")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: hive_create_function_statement")
    default int insertMultiple(Collection<HiveCreateFunctionStatement> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, hiveCreateFunctionStatement, c ->
            c.map(oid).toProperty("oid")
            .map(classNameOid).toProperty("classNameOid")
            .map(code).toProperty("code")
            .map(isDeclare).toProperty("isDeclare")
            .map(locationOid).toProperty("locationOid")
            .map(resourceType).toProperty("resourceType")
            .map(symbolOid).toProperty("symbolOid")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: hive_create_function_statement")
    default int insertSelective(HiveCreateFunctionStatement record) {
        return MyBatis3Utils.insert(this::insert, record, hiveCreateFunctionStatement, c ->
            c.map(oid).toPropertyWhenPresent("oid", record::getOid)
            .map(classNameOid).toPropertyWhenPresent("classNameOid", record::getClassNameOid)
            .map(code).toPropertyWhenPresent("code", record::getCode)
            .map(isDeclare).toPropertyWhenPresent("isDeclare", record::getIsDeclare)
            .map(locationOid).toPropertyWhenPresent("locationOid", record::getLocationOid)
            .map(resourceType).toPropertyWhenPresent("resourceType", record::getResourceType)
            .map(symbolOid).toPropertyWhenPresent("symbolOid", record::getSymbolOid)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: hive_create_function_statement")
    default Optional<HiveCreateFunctionStatement> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, hiveCreateFunctionStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: hive_create_function_statement")
    default List<HiveCreateFunctionStatement> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, hiveCreateFunctionStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: hive_create_function_statement")
    default List<HiveCreateFunctionStatement> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, hiveCreateFunctionStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: hive_create_function_statement")
    default Optional<HiveCreateFunctionStatement> selectByPrimaryKey(Long oid_) {
        return selectOne(c ->
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: hive_create_function_statement")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, hiveCreateFunctionStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: hive_create_function_statement")
    static UpdateDSL<UpdateModel> updateAllColumns(HiveCreateFunctionStatement record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalTo(record::getOid)
                .set(classNameOid).equalTo(record::getClassNameOid)
                .set(code).equalTo(record::getCode)
                .set(isDeclare).equalTo(record::getIsDeclare)
                .set(locationOid).equalTo(record::getLocationOid)
                .set(resourceType).equalTo(record::getResourceType)
                .set(symbolOid).equalTo(record::getSymbolOid);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: hive_create_function_statement")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(HiveCreateFunctionStatement record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalToWhenPresent(record::getOid)
                .set(classNameOid).equalToWhenPresent(record::getClassNameOid)
                .set(code).equalToWhenPresent(record::getCode)
                .set(isDeclare).equalToWhenPresent(record::getIsDeclare)
                .set(locationOid).equalToWhenPresent(record::getLocationOid)
                .set(resourceType).equalToWhenPresent(record::getResourceType)
                .set(symbolOid).equalToWhenPresent(record::getSymbolOid);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: hive_create_function_statement")
    default int updateByPrimaryKey(HiveCreateFunctionStatement record) {
        return update(c ->
            c.set(classNameOid).equalTo(record::getClassNameOid)
            .set(code).equalTo(record::getCode)
            .set(isDeclare).equalTo(record::getIsDeclare)
            .set(locationOid).equalTo(record::getLocationOid)
            .set(resourceType).equalTo(record::getResourceType)
            .set(symbolOid).equalTo(record::getSymbolOid)
            .where(oid, isEqualTo(record::getOid))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: hive_create_function_statement")
    default int updateByPrimaryKeySelective(HiveCreateFunctionStatement record) {
        return update(c ->
            c.set(classNameOid).equalToWhenPresent(record::getClassNameOid)
            .set(code).equalToWhenPresent(record::getCode)
            .set(isDeclare).equalToWhenPresent(record::getIsDeclare)
            .set(locationOid).equalToWhenPresent(record::getLocationOid)
            .set(resourceType).equalToWhenPresent(record::getResourceType)
            .set(symbolOid).equalToWhenPresent(record::getSymbolOid)
            .where(oid, isEqualTo(record::getOid))
        );
    }
}