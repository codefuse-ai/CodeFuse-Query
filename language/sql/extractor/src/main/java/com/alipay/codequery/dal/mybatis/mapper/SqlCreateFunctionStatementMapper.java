package com.alipay.codequery.dal.mybatis.mapper;

import static com.alipay.codequery.dal.mybatis.mapper.SqlCreateFunctionStatementDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.alipay.codequery.dal.mybatis.domain.SqlCreateFunctionStatement;
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
public interface SqlCreateFunctionStatementMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_create_function_statement")
    BasicColumn[] selectList = BasicColumn.columnList(oid, authidOid, blockOid, comment, dataTypeOid, definerOid, isAggregate, isCreate, isDeterministic, isIfNotExists, isOrReplace, isParallelEnable, isPipelined, isResultCache, isTemporary, javaCallSpec, language, nameOid, returnDataTypeOid, schema, usingOid, wrappedSource);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_create_function_statement")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_create_function_statement")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_create_function_statement")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<SqlCreateFunctionStatement> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_create_function_statement")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<SqlCreateFunctionStatement> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_create_function_statement")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="authid_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="block_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="comment", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="data_type_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="definer_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_aggregate", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_create", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_deterministic", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_if_not_exists", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_or_replace", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_parallel_enable", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_pipelined", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_result_cache", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_temporary", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="java_call_spec", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="language", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="name_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="return_data_type_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="schema", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="using_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="wrapped_source", javaType=String.class, jdbcType=JdbcType.VARCHAR)
    })
    Optional<SqlCreateFunctionStatement> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_create_function_statement")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="authid_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="block_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="comment", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="data_type_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="definer_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_aggregate", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_create", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_deterministic", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_if_not_exists", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_or_replace", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_parallel_enable", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_pipelined", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_result_cache", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_temporary", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="java_call_spec", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="language", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="name_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="return_data_type_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="schema", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="using_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="wrapped_source", javaType=String.class, jdbcType=JdbcType.VARCHAR)
    })
    List<SqlCreateFunctionStatement> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_create_function_statement")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_create_function_statement")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, sqlCreateFunctionStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_create_function_statement")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, sqlCreateFunctionStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_create_function_statement")
    default int deleteByPrimaryKey(Long oid_) {
        return delete(c -> 
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_create_function_statement")
    default int insert(SqlCreateFunctionStatement record) {
        return MyBatis3Utils.insert(this::insert, record, sqlCreateFunctionStatement, c ->
            c.map(oid).toProperty("oid")
            .map(authidOid).toProperty("authidOid")
            .map(blockOid).toProperty("blockOid")
            .map(comment).toProperty("comment")
            .map(dataTypeOid).toProperty("dataTypeOid")
            .map(definerOid).toProperty("definerOid")
            .map(isAggregate).toProperty("isAggregate")
            .map(isCreate).toProperty("isCreate")
            .map(isDeterministic).toProperty("isDeterministic")
            .map(isIfNotExists).toProperty("isIfNotExists")
            .map(isOrReplace).toProperty("isOrReplace")
            .map(isParallelEnable).toProperty("isParallelEnable")
            .map(isPipelined).toProperty("isPipelined")
            .map(isResultCache).toProperty("isResultCache")
            .map(isTemporary).toProperty("isTemporary")
            .map(javaCallSpec).toProperty("javaCallSpec")
            .map(language).toProperty("language")
            .map(nameOid).toProperty("nameOid")
            .map(returnDataTypeOid).toProperty("returnDataTypeOid")
            .map(schema).toProperty("schema")
            .map(usingOid).toProperty("usingOid")
            .map(wrappedSource).toProperty("wrappedSource")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_create_function_statement")
    default int insertMultiple(Collection<SqlCreateFunctionStatement> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, sqlCreateFunctionStatement, c ->
            c.map(oid).toProperty("oid")
            .map(authidOid).toProperty("authidOid")
            .map(blockOid).toProperty("blockOid")
            .map(comment).toProperty("comment")
            .map(dataTypeOid).toProperty("dataTypeOid")
            .map(definerOid).toProperty("definerOid")
            .map(isAggregate).toProperty("isAggregate")
            .map(isCreate).toProperty("isCreate")
            .map(isDeterministic).toProperty("isDeterministic")
            .map(isIfNotExists).toProperty("isIfNotExists")
            .map(isOrReplace).toProperty("isOrReplace")
            .map(isParallelEnable).toProperty("isParallelEnable")
            .map(isPipelined).toProperty("isPipelined")
            .map(isResultCache).toProperty("isResultCache")
            .map(isTemporary).toProperty("isTemporary")
            .map(javaCallSpec).toProperty("javaCallSpec")
            .map(language).toProperty("language")
            .map(nameOid).toProperty("nameOid")
            .map(returnDataTypeOid).toProperty("returnDataTypeOid")
            .map(schema).toProperty("schema")
            .map(usingOid).toProperty("usingOid")
            .map(wrappedSource).toProperty("wrappedSource")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_create_function_statement")
    default int insertSelective(SqlCreateFunctionStatement record) {
        return MyBatis3Utils.insert(this::insert, record, sqlCreateFunctionStatement, c ->
            c.map(oid).toPropertyWhenPresent("oid", record::getOid)
            .map(authidOid).toPropertyWhenPresent("authidOid", record::getAuthidOid)
            .map(blockOid).toPropertyWhenPresent("blockOid", record::getBlockOid)
            .map(comment).toPropertyWhenPresent("comment", record::getComment)
            .map(dataTypeOid).toPropertyWhenPresent("dataTypeOid", record::getDataTypeOid)
            .map(definerOid).toPropertyWhenPresent("definerOid", record::getDefinerOid)
            .map(isAggregate).toPropertyWhenPresent("isAggregate", record::getIsAggregate)
            .map(isCreate).toPropertyWhenPresent("isCreate", record::getIsCreate)
            .map(isDeterministic).toPropertyWhenPresent("isDeterministic", record::getIsDeterministic)
            .map(isIfNotExists).toPropertyWhenPresent("isIfNotExists", record::getIsIfNotExists)
            .map(isOrReplace).toPropertyWhenPresent("isOrReplace", record::getIsOrReplace)
            .map(isParallelEnable).toPropertyWhenPresent("isParallelEnable", record::getIsParallelEnable)
            .map(isPipelined).toPropertyWhenPresent("isPipelined", record::getIsPipelined)
            .map(isResultCache).toPropertyWhenPresent("isResultCache", record::getIsResultCache)
            .map(isTemporary).toPropertyWhenPresent("isTemporary", record::getIsTemporary)
            .map(javaCallSpec).toPropertyWhenPresent("javaCallSpec", record::getJavaCallSpec)
            .map(language).toPropertyWhenPresent("language", record::getLanguage)
            .map(nameOid).toPropertyWhenPresent("nameOid", record::getNameOid)
            .map(returnDataTypeOid).toPropertyWhenPresent("returnDataTypeOid", record::getReturnDataTypeOid)
            .map(schema).toPropertyWhenPresent("schema", record::getSchema)
            .map(usingOid).toPropertyWhenPresent("usingOid", record::getUsingOid)
            .map(wrappedSource).toPropertyWhenPresent("wrappedSource", record::getWrappedSource)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_create_function_statement")
    default Optional<SqlCreateFunctionStatement> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, sqlCreateFunctionStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_create_function_statement")
    default List<SqlCreateFunctionStatement> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, sqlCreateFunctionStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_create_function_statement")
    default List<SqlCreateFunctionStatement> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, sqlCreateFunctionStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_create_function_statement")
    default Optional<SqlCreateFunctionStatement> selectByPrimaryKey(Long oid_) {
        return selectOne(c ->
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_create_function_statement")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, sqlCreateFunctionStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_create_function_statement")
    static UpdateDSL<UpdateModel> updateAllColumns(SqlCreateFunctionStatement record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalTo(record::getOid)
                .set(authidOid).equalTo(record::getAuthidOid)
                .set(blockOid).equalTo(record::getBlockOid)
                .set(comment).equalTo(record::getComment)
                .set(dataTypeOid).equalTo(record::getDataTypeOid)
                .set(definerOid).equalTo(record::getDefinerOid)
                .set(isAggregate).equalTo(record::getIsAggregate)
                .set(isCreate).equalTo(record::getIsCreate)
                .set(isDeterministic).equalTo(record::getIsDeterministic)
                .set(isIfNotExists).equalTo(record::getIsIfNotExists)
                .set(isOrReplace).equalTo(record::getIsOrReplace)
                .set(isParallelEnable).equalTo(record::getIsParallelEnable)
                .set(isPipelined).equalTo(record::getIsPipelined)
                .set(isResultCache).equalTo(record::getIsResultCache)
                .set(isTemporary).equalTo(record::getIsTemporary)
                .set(javaCallSpec).equalTo(record::getJavaCallSpec)
                .set(language).equalTo(record::getLanguage)
                .set(nameOid).equalTo(record::getNameOid)
                .set(returnDataTypeOid).equalTo(record::getReturnDataTypeOid)
                .set(schema).equalTo(record::getSchema)
                .set(usingOid).equalTo(record::getUsingOid)
                .set(wrappedSource).equalTo(record::getWrappedSource);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_create_function_statement")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(SqlCreateFunctionStatement record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalToWhenPresent(record::getOid)
                .set(authidOid).equalToWhenPresent(record::getAuthidOid)
                .set(blockOid).equalToWhenPresent(record::getBlockOid)
                .set(comment).equalToWhenPresent(record::getComment)
                .set(dataTypeOid).equalToWhenPresent(record::getDataTypeOid)
                .set(definerOid).equalToWhenPresent(record::getDefinerOid)
                .set(isAggregate).equalToWhenPresent(record::getIsAggregate)
                .set(isCreate).equalToWhenPresent(record::getIsCreate)
                .set(isDeterministic).equalToWhenPresent(record::getIsDeterministic)
                .set(isIfNotExists).equalToWhenPresent(record::getIsIfNotExists)
                .set(isOrReplace).equalToWhenPresent(record::getIsOrReplace)
                .set(isParallelEnable).equalToWhenPresent(record::getIsParallelEnable)
                .set(isPipelined).equalToWhenPresent(record::getIsPipelined)
                .set(isResultCache).equalToWhenPresent(record::getIsResultCache)
                .set(isTemporary).equalToWhenPresent(record::getIsTemporary)
                .set(javaCallSpec).equalToWhenPresent(record::getJavaCallSpec)
                .set(language).equalToWhenPresent(record::getLanguage)
                .set(nameOid).equalToWhenPresent(record::getNameOid)
                .set(returnDataTypeOid).equalToWhenPresent(record::getReturnDataTypeOid)
                .set(schema).equalToWhenPresent(record::getSchema)
                .set(usingOid).equalToWhenPresent(record::getUsingOid)
                .set(wrappedSource).equalToWhenPresent(record::getWrappedSource);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_create_function_statement")
    default int updateByPrimaryKey(SqlCreateFunctionStatement record) {
        return update(c ->
            c.set(authidOid).equalTo(record::getAuthidOid)
            .set(blockOid).equalTo(record::getBlockOid)
            .set(comment).equalTo(record::getComment)
            .set(dataTypeOid).equalTo(record::getDataTypeOid)
            .set(definerOid).equalTo(record::getDefinerOid)
            .set(isAggregate).equalTo(record::getIsAggregate)
            .set(isCreate).equalTo(record::getIsCreate)
            .set(isDeterministic).equalTo(record::getIsDeterministic)
            .set(isIfNotExists).equalTo(record::getIsIfNotExists)
            .set(isOrReplace).equalTo(record::getIsOrReplace)
            .set(isParallelEnable).equalTo(record::getIsParallelEnable)
            .set(isPipelined).equalTo(record::getIsPipelined)
            .set(isResultCache).equalTo(record::getIsResultCache)
            .set(isTemporary).equalTo(record::getIsTemporary)
            .set(javaCallSpec).equalTo(record::getJavaCallSpec)
            .set(language).equalTo(record::getLanguage)
            .set(nameOid).equalTo(record::getNameOid)
            .set(returnDataTypeOid).equalTo(record::getReturnDataTypeOid)
            .set(schema).equalTo(record::getSchema)
            .set(usingOid).equalTo(record::getUsingOid)
            .set(wrappedSource).equalTo(record::getWrappedSource)
            .where(oid, isEqualTo(record::getOid))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_create_function_statement")
    default int updateByPrimaryKeySelective(SqlCreateFunctionStatement record) {
        return update(c ->
            c.set(authidOid).equalToWhenPresent(record::getAuthidOid)
            .set(blockOid).equalToWhenPresent(record::getBlockOid)
            .set(comment).equalToWhenPresent(record::getComment)
            .set(dataTypeOid).equalToWhenPresent(record::getDataTypeOid)
            .set(definerOid).equalToWhenPresent(record::getDefinerOid)
            .set(isAggregate).equalToWhenPresent(record::getIsAggregate)
            .set(isCreate).equalToWhenPresent(record::getIsCreate)
            .set(isDeterministic).equalToWhenPresent(record::getIsDeterministic)
            .set(isIfNotExists).equalToWhenPresent(record::getIsIfNotExists)
            .set(isOrReplace).equalToWhenPresent(record::getIsOrReplace)
            .set(isParallelEnable).equalToWhenPresent(record::getIsParallelEnable)
            .set(isPipelined).equalToWhenPresent(record::getIsPipelined)
            .set(isResultCache).equalToWhenPresent(record::getIsResultCache)
            .set(isTemporary).equalToWhenPresent(record::getIsTemporary)
            .set(javaCallSpec).equalToWhenPresent(record::getJavaCallSpec)
            .set(language).equalToWhenPresent(record::getLanguage)
            .set(nameOid).equalToWhenPresent(record::getNameOid)
            .set(returnDataTypeOid).equalToWhenPresent(record::getReturnDataTypeOid)
            .set(schema).equalToWhenPresent(record::getSchema)
            .set(usingOid).equalToWhenPresent(record::getUsingOid)
            .set(wrappedSource).equalToWhenPresent(record::getWrappedSource)
            .where(oid, isEqualTo(record::getOid))
        );
    }
}