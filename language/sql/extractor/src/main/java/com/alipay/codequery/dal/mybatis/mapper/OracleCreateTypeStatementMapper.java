package com.alipay.codequery.dal.mybatis.mapper;

import static com.alipay.codequery.dal.mybatis.mapper.OracleCreateTypeStatementDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.alipay.codequery.dal.mybatis.domain.OracleCreateTypeStatement;
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
public interface OracleCreateTypeStatementMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_create_type_statement")
    BasicColumn[] selectList = BasicColumn.columnList(oid, authIdOid, instantiable, isBody, isFinal, isForce, isObject, isOrReplace, isParen, nameOid, oidOid, tableOfOid, underOid, varrayDataTypeOid, varraySizeLimitOid, wrappedSource);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_create_type_statement")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_create_type_statement")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_create_type_statement")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<OracleCreateTypeStatement> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_create_type_statement")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<OracleCreateTypeStatement> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_create_type_statement")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="auth_id_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="instantiable", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_body", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_final", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_force", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_object", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_or_replace", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_paren", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="name_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="oid_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="table_of_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="under_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="varray_data_type_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="varray_size_limit_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="wrapped_source", javaType=String.class, jdbcType=JdbcType.VARCHAR)
    })
    Optional<OracleCreateTypeStatement> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_create_type_statement")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="auth_id_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="instantiable", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_body", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_final", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_force", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_object", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_or_replace", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_paren", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="name_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="oid_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="table_of_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="under_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="varray_data_type_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="varray_size_limit_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="wrapped_source", javaType=String.class, jdbcType=JdbcType.VARCHAR)
    })
    List<OracleCreateTypeStatement> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_create_type_statement")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_create_type_statement")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, oracleCreateTypeStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_create_type_statement")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, oracleCreateTypeStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_create_type_statement")
    default int deleteByPrimaryKey(Long oid_) {
        return delete(c -> 
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_create_type_statement")
    default int insert(OracleCreateTypeStatement record) {
        return MyBatis3Utils.insert(this::insert, record, oracleCreateTypeStatement, c ->
            c.map(oid).toProperty("oid")
            .map(authIdOid).toProperty("authIdOid")
            .map(instantiable).toProperty("instantiable")
            .map(isBody).toProperty("isBody")
            .map(isFinal).toProperty("isFinal")
            .map(isForce).toProperty("isForce")
            .map(isObject).toProperty("isObject")
            .map(isOrReplace).toProperty("isOrReplace")
            .map(isParen).toProperty("isParen")
            .map(nameOid).toProperty("nameOid")
            .map(oidOid).toProperty("oidOid")
            .map(tableOfOid).toProperty("tableOfOid")
            .map(underOid).toProperty("underOid")
            .map(varrayDataTypeOid).toProperty("varrayDataTypeOid")
            .map(varraySizeLimitOid).toProperty("varraySizeLimitOid")
            .map(wrappedSource).toProperty("wrappedSource")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_create_type_statement")
    default int insertMultiple(Collection<OracleCreateTypeStatement> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, oracleCreateTypeStatement, c ->
            c.map(oid).toProperty("oid")
            .map(authIdOid).toProperty("authIdOid")
            .map(instantiable).toProperty("instantiable")
            .map(isBody).toProperty("isBody")
            .map(isFinal).toProperty("isFinal")
            .map(isForce).toProperty("isForce")
            .map(isObject).toProperty("isObject")
            .map(isOrReplace).toProperty("isOrReplace")
            .map(isParen).toProperty("isParen")
            .map(nameOid).toProperty("nameOid")
            .map(oidOid).toProperty("oidOid")
            .map(tableOfOid).toProperty("tableOfOid")
            .map(underOid).toProperty("underOid")
            .map(varrayDataTypeOid).toProperty("varrayDataTypeOid")
            .map(varraySizeLimitOid).toProperty("varraySizeLimitOid")
            .map(wrappedSource).toProperty("wrappedSource")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_create_type_statement")
    default int insertSelective(OracleCreateTypeStatement record) {
        return MyBatis3Utils.insert(this::insert, record, oracleCreateTypeStatement, c ->
            c.map(oid).toPropertyWhenPresent("oid", record::getOid)
            .map(authIdOid).toPropertyWhenPresent("authIdOid", record::getAuthIdOid)
            .map(instantiable).toPropertyWhenPresent("instantiable", record::getInstantiable)
            .map(isBody).toPropertyWhenPresent("isBody", record::getIsBody)
            .map(isFinal).toPropertyWhenPresent("isFinal", record::getIsFinal)
            .map(isForce).toPropertyWhenPresent("isForce", record::getIsForce)
            .map(isObject).toPropertyWhenPresent("isObject", record::getIsObject)
            .map(isOrReplace).toPropertyWhenPresent("isOrReplace", record::getIsOrReplace)
            .map(isParen).toPropertyWhenPresent("isParen", record::getIsParen)
            .map(nameOid).toPropertyWhenPresent("nameOid", record::getNameOid)
            .map(oidOid).toPropertyWhenPresent("oidOid", record::getOidOid)
            .map(tableOfOid).toPropertyWhenPresent("tableOfOid", record::getTableOfOid)
            .map(underOid).toPropertyWhenPresent("underOid", record::getUnderOid)
            .map(varrayDataTypeOid).toPropertyWhenPresent("varrayDataTypeOid", record::getVarrayDataTypeOid)
            .map(varraySizeLimitOid).toPropertyWhenPresent("varraySizeLimitOid", record::getVarraySizeLimitOid)
            .map(wrappedSource).toPropertyWhenPresent("wrappedSource", record::getWrappedSource)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_create_type_statement")
    default Optional<OracleCreateTypeStatement> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, oracleCreateTypeStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_create_type_statement")
    default List<OracleCreateTypeStatement> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, oracleCreateTypeStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_create_type_statement")
    default List<OracleCreateTypeStatement> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, oracleCreateTypeStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_create_type_statement")
    default Optional<OracleCreateTypeStatement> selectByPrimaryKey(Long oid_) {
        return selectOne(c ->
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_create_type_statement")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, oracleCreateTypeStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_create_type_statement")
    static UpdateDSL<UpdateModel> updateAllColumns(OracleCreateTypeStatement record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalTo(record::getOid)
                .set(authIdOid).equalTo(record::getAuthIdOid)
                .set(instantiable).equalTo(record::getInstantiable)
                .set(isBody).equalTo(record::getIsBody)
                .set(isFinal).equalTo(record::getIsFinal)
                .set(isForce).equalTo(record::getIsForce)
                .set(isObject).equalTo(record::getIsObject)
                .set(isOrReplace).equalTo(record::getIsOrReplace)
                .set(isParen).equalTo(record::getIsParen)
                .set(nameOid).equalTo(record::getNameOid)
                .set(oidOid).equalTo(record::getOidOid)
                .set(tableOfOid).equalTo(record::getTableOfOid)
                .set(underOid).equalTo(record::getUnderOid)
                .set(varrayDataTypeOid).equalTo(record::getVarrayDataTypeOid)
                .set(varraySizeLimitOid).equalTo(record::getVarraySizeLimitOid)
                .set(wrappedSource).equalTo(record::getWrappedSource);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_create_type_statement")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(OracleCreateTypeStatement record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalToWhenPresent(record::getOid)
                .set(authIdOid).equalToWhenPresent(record::getAuthIdOid)
                .set(instantiable).equalToWhenPresent(record::getInstantiable)
                .set(isBody).equalToWhenPresent(record::getIsBody)
                .set(isFinal).equalToWhenPresent(record::getIsFinal)
                .set(isForce).equalToWhenPresent(record::getIsForce)
                .set(isObject).equalToWhenPresent(record::getIsObject)
                .set(isOrReplace).equalToWhenPresent(record::getIsOrReplace)
                .set(isParen).equalToWhenPresent(record::getIsParen)
                .set(nameOid).equalToWhenPresent(record::getNameOid)
                .set(oidOid).equalToWhenPresent(record::getOidOid)
                .set(tableOfOid).equalToWhenPresent(record::getTableOfOid)
                .set(underOid).equalToWhenPresent(record::getUnderOid)
                .set(varrayDataTypeOid).equalToWhenPresent(record::getVarrayDataTypeOid)
                .set(varraySizeLimitOid).equalToWhenPresent(record::getVarraySizeLimitOid)
                .set(wrappedSource).equalToWhenPresent(record::getWrappedSource);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_create_type_statement")
    default int updateByPrimaryKey(OracleCreateTypeStatement record) {
        return update(c ->
            c.set(authIdOid).equalTo(record::getAuthIdOid)
            .set(instantiable).equalTo(record::getInstantiable)
            .set(isBody).equalTo(record::getIsBody)
            .set(isFinal).equalTo(record::getIsFinal)
            .set(isForce).equalTo(record::getIsForce)
            .set(isObject).equalTo(record::getIsObject)
            .set(isOrReplace).equalTo(record::getIsOrReplace)
            .set(isParen).equalTo(record::getIsParen)
            .set(nameOid).equalTo(record::getNameOid)
            .set(oidOid).equalTo(record::getOidOid)
            .set(tableOfOid).equalTo(record::getTableOfOid)
            .set(underOid).equalTo(record::getUnderOid)
            .set(varrayDataTypeOid).equalTo(record::getVarrayDataTypeOid)
            .set(varraySizeLimitOid).equalTo(record::getVarraySizeLimitOid)
            .set(wrappedSource).equalTo(record::getWrappedSource)
            .where(oid, isEqualTo(record::getOid))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_create_type_statement")
    default int updateByPrimaryKeySelective(OracleCreateTypeStatement record) {
        return update(c ->
            c.set(authIdOid).equalToWhenPresent(record::getAuthIdOid)
            .set(instantiable).equalToWhenPresent(record::getInstantiable)
            .set(isBody).equalToWhenPresent(record::getIsBody)
            .set(isFinal).equalToWhenPresent(record::getIsFinal)
            .set(isForce).equalToWhenPresent(record::getIsForce)
            .set(isObject).equalToWhenPresent(record::getIsObject)
            .set(isOrReplace).equalToWhenPresent(record::getIsOrReplace)
            .set(isParen).equalToWhenPresent(record::getIsParen)
            .set(nameOid).equalToWhenPresent(record::getNameOid)
            .set(oidOid).equalToWhenPresent(record::getOidOid)
            .set(tableOfOid).equalToWhenPresent(record::getTableOfOid)
            .set(underOid).equalToWhenPresent(record::getUnderOid)
            .set(varrayDataTypeOid).equalToWhenPresent(record::getVarrayDataTypeOid)
            .set(varraySizeLimitOid).equalToWhenPresent(record::getVarraySizeLimitOid)
            .set(wrappedSource).equalToWhenPresent(record::getWrappedSource)
            .where(oid, isEqualTo(record::getOid))
        );
    }
}