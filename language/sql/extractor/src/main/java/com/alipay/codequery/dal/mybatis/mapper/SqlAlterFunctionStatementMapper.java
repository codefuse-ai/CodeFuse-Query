package com.alipay.codequery.dal.mybatis.mapper;

import static com.alipay.codequery.dal.mybatis.mapper.SqlAlterFunctionStatementDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.alipay.codequery.dal.mybatis.domain.SqlAlterFunctionStatement;
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
public interface SqlAlterFunctionStatementMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_function_statement")
    BasicColumn[] selectList = BasicColumn.columnList(oid, commentOid, isContainsSql, isDebug, isLanguageSql, isReuseSettings, nameOid, sqlSecurityOid);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_function_statement")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_function_statement")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_function_statement")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<SqlAlterFunctionStatement> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_function_statement")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<SqlAlterFunctionStatement> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_function_statement")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="comment_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_contains_sql", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_debug", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_language_sql", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_reuse_settings", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="name_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="sql_security_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT)
    })
    Optional<SqlAlterFunctionStatement> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_function_statement")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="comment_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_contains_sql", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_debug", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_language_sql", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_reuse_settings", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="name_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="sql_security_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT)
    })
    List<SqlAlterFunctionStatement> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_function_statement")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_function_statement")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, sqlAlterFunctionStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_function_statement")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, sqlAlterFunctionStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_function_statement")
    default int deleteByPrimaryKey(Long oid_) {
        return delete(c -> 
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_function_statement")
    default int insert(SqlAlterFunctionStatement record) {
        return MyBatis3Utils.insert(this::insert, record, sqlAlterFunctionStatement, c ->
            c.map(oid).toProperty("oid")
            .map(commentOid).toProperty("commentOid")
            .map(isContainsSql).toProperty("isContainsSql")
            .map(isDebug).toProperty("isDebug")
            .map(isLanguageSql).toProperty("isLanguageSql")
            .map(isReuseSettings).toProperty("isReuseSettings")
            .map(nameOid).toProperty("nameOid")
            .map(sqlSecurityOid).toProperty("sqlSecurityOid")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_function_statement")
    default int insertMultiple(Collection<SqlAlterFunctionStatement> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, sqlAlterFunctionStatement, c ->
            c.map(oid).toProperty("oid")
            .map(commentOid).toProperty("commentOid")
            .map(isContainsSql).toProperty("isContainsSql")
            .map(isDebug).toProperty("isDebug")
            .map(isLanguageSql).toProperty("isLanguageSql")
            .map(isReuseSettings).toProperty("isReuseSettings")
            .map(nameOid).toProperty("nameOid")
            .map(sqlSecurityOid).toProperty("sqlSecurityOid")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_function_statement")
    default int insertSelective(SqlAlterFunctionStatement record) {
        return MyBatis3Utils.insert(this::insert, record, sqlAlterFunctionStatement, c ->
            c.map(oid).toPropertyWhenPresent("oid", record::getOid)
            .map(commentOid).toPropertyWhenPresent("commentOid", record::getCommentOid)
            .map(isContainsSql).toPropertyWhenPresent("isContainsSql", record::getIsContainsSql)
            .map(isDebug).toPropertyWhenPresent("isDebug", record::getIsDebug)
            .map(isLanguageSql).toPropertyWhenPresent("isLanguageSql", record::getIsLanguageSql)
            .map(isReuseSettings).toPropertyWhenPresent("isReuseSettings", record::getIsReuseSettings)
            .map(nameOid).toPropertyWhenPresent("nameOid", record::getNameOid)
            .map(sqlSecurityOid).toPropertyWhenPresent("sqlSecurityOid", record::getSqlSecurityOid)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_function_statement")
    default Optional<SqlAlterFunctionStatement> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, sqlAlterFunctionStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_function_statement")
    default List<SqlAlterFunctionStatement> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, sqlAlterFunctionStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_function_statement")
    default List<SqlAlterFunctionStatement> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, sqlAlterFunctionStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_function_statement")
    default Optional<SqlAlterFunctionStatement> selectByPrimaryKey(Long oid_) {
        return selectOne(c ->
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_function_statement")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, sqlAlterFunctionStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_function_statement")
    static UpdateDSL<UpdateModel> updateAllColumns(SqlAlterFunctionStatement record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalTo(record::getOid)
                .set(commentOid).equalTo(record::getCommentOid)
                .set(isContainsSql).equalTo(record::getIsContainsSql)
                .set(isDebug).equalTo(record::getIsDebug)
                .set(isLanguageSql).equalTo(record::getIsLanguageSql)
                .set(isReuseSettings).equalTo(record::getIsReuseSettings)
                .set(nameOid).equalTo(record::getNameOid)
                .set(sqlSecurityOid).equalTo(record::getSqlSecurityOid);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_function_statement")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(SqlAlterFunctionStatement record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalToWhenPresent(record::getOid)
                .set(commentOid).equalToWhenPresent(record::getCommentOid)
                .set(isContainsSql).equalToWhenPresent(record::getIsContainsSql)
                .set(isDebug).equalToWhenPresent(record::getIsDebug)
                .set(isLanguageSql).equalToWhenPresent(record::getIsLanguageSql)
                .set(isReuseSettings).equalToWhenPresent(record::getIsReuseSettings)
                .set(nameOid).equalToWhenPresent(record::getNameOid)
                .set(sqlSecurityOid).equalToWhenPresent(record::getSqlSecurityOid);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_function_statement")
    default int updateByPrimaryKey(SqlAlterFunctionStatement record) {
        return update(c ->
            c.set(commentOid).equalTo(record::getCommentOid)
            .set(isContainsSql).equalTo(record::getIsContainsSql)
            .set(isDebug).equalTo(record::getIsDebug)
            .set(isLanguageSql).equalTo(record::getIsLanguageSql)
            .set(isReuseSettings).equalTo(record::getIsReuseSettings)
            .set(nameOid).equalTo(record::getNameOid)
            .set(sqlSecurityOid).equalTo(record::getSqlSecurityOid)
            .where(oid, isEqualTo(record::getOid))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_function_statement")
    default int updateByPrimaryKeySelective(SqlAlterFunctionStatement record) {
        return update(c ->
            c.set(commentOid).equalToWhenPresent(record::getCommentOid)
            .set(isContainsSql).equalToWhenPresent(record::getIsContainsSql)
            .set(isDebug).equalToWhenPresent(record::getIsDebug)
            .set(isLanguageSql).equalToWhenPresent(record::getIsLanguageSql)
            .set(isReuseSettings).equalToWhenPresent(record::getIsReuseSettings)
            .set(nameOid).equalToWhenPresent(record::getNameOid)
            .set(sqlSecurityOid).equalToWhenPresent(record::getSqlSecurityOid)
            .where(oid, isEqualTo(record::getOid))
        );
    }
}