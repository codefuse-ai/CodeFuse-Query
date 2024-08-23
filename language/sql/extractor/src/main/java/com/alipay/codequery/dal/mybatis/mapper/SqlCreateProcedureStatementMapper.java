package com.alipay.codequery.dal.mybatis.mapper;

import static com.alipay.codequery.dal.mybatis.mapper.SqlCreateProcedureStatementDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.alipay.codequery.dal.mybatis.domain.SqlCreateProcedureStatement;
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
public interface SqlCreateProcedureStatementMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_create_procedure_statement")
    BasicColumn[] selectList = BasicColumn.columnList(oid, authidOid, blockOid, commentOid, definerOid, isContainsSql, isCreate, isDeterministic, isLanguageSql, isModifiesSqlData, isNoSql, isOrReplace, isReadSqlData, javaCallSpec, nameOid, wrappedSource);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_create_procedure_statement")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_create_procedure_statement")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_create_procedure_statement")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<SqlCreateProcedureStatement> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_create_procedure_statement")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<SqlCreateProcedureStatement> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_create_procedure_statement")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="authid_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="block_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="comment_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="definer_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_contains_sql", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_create", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_deterministic", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_language_sql", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_modifies_sql_data", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_no_sql", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_or_replace", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_read_sql_data", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="java_call_spec", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="name_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="wrapped_source", javaType=String.class, jdbcType=JdbcType.VARCHAR)
    })
    Optional<SqlCreateProcedureStatement> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_create_procedure_statement")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="authid_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="block_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="comment_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="definer_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_contains_sql", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_create", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_deterministic", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_language_sql", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_modifies_sql_data", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_no_sql", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_or_replace", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_read_sql_data", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="java_call_spec", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="name_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="wrapped_source", javaType=String.class, jdbcType=JdbcType.VARCHAR)
    })
    List<SqlCreateProcedureStatement> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_create_procedure_statement")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_create_procedure_statement")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, sqlCreateProcedureStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_create_procedure_statement")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, sqlCreateProcedureStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_create_procedure_statement")
    default int deleteByPrimaryKey(Long oid_) {
        return delete(c -> 
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_create_procedure_statement")
    default int insert(SqlCreateProcedureStatement record) {
        return MyBatis3Utils.insert(this::insert, record, sqlCreateProcedureStatement, c ->
            c.map(oid).toProperty("oid")
            .map(authidOid).toProperty("authidOid")
            .map(blockOid).toProperty("blockOid")
            .map(commentOid).toProperty("commentOid")
            .map(definerOid).toProperty("definerOid")
            .map(isContainsSql).toProperty("isContainsSql")
            .map(isCreate).toProperty("isCreate")
            .map(isDeterministic).toProperty("isDeterministic")
            .map(isLanguageSql).toProperty("isLanguageSql")
            .map(isModifiesSqlData).toProperty("isModifiesSqlData")
            .map(isNoSql).toProperty("isNoSql")
            .map(isOrReplace).toProperty("isOrReplace")
            .map(isReadSqlData).toProperty("isReadSqlData")
            .map(javaCallSpec).toProperty("javaCallSpec")
            .map(nameOid).toProperty("nameOid")
            .map(wrappedSource).toProperty("wrappedSource")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_create_procedure_statement")
    default int insertMultiple(Collection<SqlCreateProcedureStatement> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, sqlCreateProcedureStatement, c ->
            c.map(oid).toProperty("oid")
            .map(authidOid).toProperty("authidOid")
            .map(blockOid).toProperty("blockOid")
            .map(commentOid).toProperty("commentOid")
            .map(definerOid).toProperty("definerOid")
            .map(isContainsSql).toProperty("isContainsSql")
            .map(isCreate).toProperty("isCreate")
            .map(isDeterministic).toProperty("isDeterministic")
            .map(isLanguageSql).toProperty("isLanguageSql")
            .map(isModifiesSqlData).toProperty("isModifiesSqlData")
            .map(isNoSql).toProperty("isNoSql")
            .map(isOrReplace).toProperty("isOrReplace")
            .map(isReadSqlData).toProperty("isReadSqlData")
            .map(javaCallSpec).toProperty("javaCallSpec")
            .map(nameOid).toProperty("nameOid")
            .map(wrappedSource).toProperty("wrappedSource")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_create_procedure_statement")
    default int insertSelective(SqlCreateProcedureStatement record) {
        return MyBatis3Utils.insert(this::insert, record, sqlCreateProcedureStatement, c ->
            c.map(oid).toPropertyWhenPresent("oid", record::getOid)
            .map(authidOid).toPropertyWhenPresent("authidOid", record::getAuthidOid)
            .map(blockOid).toPropertyWhenPresent("blockOid", record::getBlockOid)
            .map(commentOid).toPropertyWhenPresent("commentOid", record::getCommentOid)
            .map(definerOid).toPropertyWhenPresent("definerOid", record::getDefinerOid)
            .map(isContainsSql).toPropertyWhenPresent("isContainsSql", record::getIsContainsSql)
            .map(isCreate).toPropertyWhenPresent("isCreate", record::getIsCreate)
            .map(isDeterministic).toPropertyWhenPresent("isDeterministic", record::getIsDeterministic)
            .map(isLanguageSql).toPropertyWhenPresent("isLanguageSql", record::getIsLanguageSql)
            .map(isModifiesSqlData).toPropertyWhenPresent("isModifiesSqlData", record::getIsModifiesSqlData)
            .map(isNoSql).toPropertyWhenPresent("isNoSql", record::getIsNoSql)
            .map(isOrReplace).toPropertyWhenPresent("isOrReplace", record::getIsOrReplace)
            .map(isReadSqlData).toPropertyWhenPresent("isReadSqlData", record::getIsReadSqlData)
            .map(javaCallSpec).toPropertyWhenPresent("javaCallSpec", record::getJavaCallSpec)
            .map(nameOid).toPropertyWhenPresent("nameOid", record::getNameOid)
            .map(wrappedSource).toPropertyWhenPresent("wrappedSource", record::getWrappedSource)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_create_procedure_statement")
    default Optional<SqlCreateProcedureStatement> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, sqlCreateProcedureStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_create_procedure_statement")
    default List<SqlCreateProcedureStatement> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, sqlCreateProcedureStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_create_procedure_statement")
    default List<SqlCreateProcedureStatement> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, sqlCreateProcedureStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_create_procedure_statement")
    default Optional<SqlCreateProcedureStatement> selectByPrimaryKey(Long oid_) {
        return selectOne(c ->
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_create_procedure_statement")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, sqlCreateProcedureStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_create_procedure_statement")
    static UpdateDSL<UpdateModel> updateAllColumns(SqlCreateProcedureStatement record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalTo(record::getOid)
                .set(authidOid).equalTo(record::getAuthidOid)
                .set(blockOid).equalTo(record::getBlockOid)
                .set(commentOid).equalTo(record::getCommentOid)
                .set(definerOid).equalTo(record::getDefinerOid)
                .set(isContainsSql).equalTo(record::getIsContainsSql)
                .set(isCreate).equalTo(record::getIsCreate)
                .set(isDeterministic).equalTo(record::getIsDeterministic)
                .set(isLanguageSql).equalTo(record::getIsLanguageSql)
                .set(isModifiesSqlData).equalTo(record::getIsModifiesSqlData)
                .set(isNoSql).equalTo(record::getIsNoSql)
                .set(isOrReplace).equalTo(record::getIsOrReplace)
                .set(isReadSqlData).equalTo(record::getIsReadSqlData)
                .set(javaCallSpec).equalTo(record::getJavaCallSpec)
                .set(nameOid).equalTo(record::getNameOid)
                .set(wrappedSource).equalTo(record::getWrappedSource);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_create_procedure_statement")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(SqlCreateProcedureStatement record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalToWhenPresent(record::getOid)
                .set(authidOid).equalToWhenPresent(record::getAuthidOid)
                .set(blockOid).equalToWhenPresent(record::getBlockOid)
                .set(commentOid).equalToWhenPresent(record::getCommentOid)
                .set(definerOid).equalToWhenPresent(record::getDefinerOid)
                .set(isContainsSql).equalToWhenPresent(record::getIsContainsSql)
                .set(isCreate).equalToWhenPresent(record::getIsCreate)
                .set(isDeterministic).equalToWhenPresent(record::getIsDeterministic)
                .set(isLanguageSql).equalToWhenPresent(record::getIsLanguageSql)
                .set(isModifiesSqlData).equalToWhenPresent(record::getIsModifiesSqlData)
                .set(isNoSql).equalToWhenPresent(record::getIsNoSql)
                .set(isOrReplace).equalToWhenPresent(record::getIsOrReplace)
                .set(isReadSqlData).equalToWhenPresent(record::getIsReadSqlData)
                .set(javaCallSpec).equalToWhenPresent(record::getJavaCallSpec)
                .set(nameOid).equalToWhenPresent(record::getNameOid)
                .set(wrappedSource).equalToWhenPresent(record::getWrappedSource);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_create_procedure_statement")
    default int updateByPrimaryKey(SqlCreateProcedureStatement record) {
        return update(c ->
            c.set(authidOid).equalTo(record::getAuthidOid)
            .set(blockOid).equalTo(record::getBlockOid)
            .set(commentOid).equalTo(record::getCommentOid)
            .set(definerOid).equalTo(record::getDefinerOid)
            .set(isContainsSql).equalTo(record::getIsContainsSql)
            .set(isCreate).equalTo(record::getIsCreate)
            .set(isDeterministic).equalTo(record::getIsDeterministic)
            .set(isLanguageSql).equalTo(record::getIsLanguageSql)
            .set(isModifiesSqlData).equalTo(record::getIsModifiesSqlData)
            .set(isNoSql).equalTo(record::getIsNoSql)
            .set(isOrReplace).equalTo(record::getIsOrReplace)
            .set(isReadSqlData).equalTo(record::getIsReadSqlData)
            .set(javaCallSpec).equalTo(record::getJavaCallSpec)
            .set(nameOid).equalTo(record::getNameOid)
            .set(wrappedSource).equalTo(record::getWrappedSource)
            .where(oid, isEqualTo(record::getOid))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_create_procedure_statement")
    default int updateByPrimaryKeySelective(SqlCreateProcedureStatement record) {
        return update(c ->
            c.set(authidOid).equalToWhenPresent(record::getAuthidOid)
            .set(blockOid).equalToWhenPresent(record::getBlockOid)
            .set(commentOid).equalToWhenPresent(record::getCommentOid)
            .set(definerOid).equalToWhenPresent(record::getDefinerOid)
            .set(isContainsSql).equalToWhenPresent(record::getIsContainsSql)
            .set(isCreate).equalToWhenPresent(record::getIsCreate)
            .set(isDeterministic).equalToWhenPresent(record::getIsDeterministic)
            .set(isLanguageSql).equalToWhenPresent(record::getIsLanguageSql)
            .set(isModifiesSqlData).equalToWhenPresent(record::getIsModifiesSqlData)
            .set(isNoSql).equalToWhenPresent(record::getIsNoSql)
            .set(isOrReplace).equalToWhenPresent(record::getIsOrReplace)
            .set(isReadSqlData).equalToWhenPresent(record::getIsReadSqlData)
            .set(javaCallSpec).equalToWhenPresent(record::getJavaCallSpec)
            .set(nameOid).equalToWhenPresent(record::getNameOid)
            .set(wrappedSource).equalToWhenPresent(record::getWrappedSource)
            .where(oid, isEqualTo(record::getOid))
        );
    }
}