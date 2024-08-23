package com.alipay.codequery.dal.mybatis.mapper;

import static com.alipay.codequery.dal.mybatis.mapper.SqlAlterTypeStatementDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.alipay.codequery.dal.mybatis.domain.SqlAlterTypeStatement;
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
public interface SqlAlterTypeStatementMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_type_statement")
    BasicColumn[] selectList = BasicColumn.columnList(oid, isBody, isCompile, isDebug, isReuseSettings, nameOid);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_type_statement")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_type_statement")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_type_statement")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<SqlAlterTypeStatement> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_type_statement")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<SqlAlterTypeStatement> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_type_statement")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="is_body", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_compile", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_debug", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_reuse_settings", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="name_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT)
    })
    Optional<SqlAlterTypeStatement> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_type_statement")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="is_body", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_compile", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_debug", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_reuse_settings", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="name_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT)
    })
    List<SqlAlterTypeStatement> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_type_statement")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_type_statement")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, sqlAlterTypeStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_type_statement")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, sqlAlterTypeStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_type_statement")
    default int deleteByPrimaryKey(Long oid_) {
        return delete(c -> 
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_type_statement")
    default int insert(SqlAlterTypeStatement record) {
        return MyBatis3Utils.insert(this::insert, record, sqlAlterTypeStatement, c ->
            c.map(oid).toProperty("oid")
            .map(isBody).toProperty("isBody")
            .map(isCompile).toProperty("isCompile")
            .map(isDebug).toProperty("isDebug")
            .map(isReuseSettings).toProperty("isReuseSettings")
            .map(nameOid).toProperty("nameOid")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_type_statement")
    default int insertMultiple(Collection<SqlAlterTypeStatement> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, sqlAlterTypeStatement, c ->
            c.map(oid).toProperty("oid")
            .map(isBody).toProperty("isBody")
            .map(isCompile).toProperty("isCompile")
            .map(isDebug).toProperty("isDebug")
            .map(isReuseSettings).toProperty("isReuseSettings")
            .map(nameOid).toProperty("nameOid")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_type_statement")
    default int insertSelective(SqlAlterTypeStatement record) {
        return MyBatis3Utils.insert(this::insert, record, sqlAlterTypeStatement, c ->
            c.map(oid).toPropertyWhenPresent("oid", record::getOid)
            .map(isBody).toPropertyWhenPresent("isBody", record::getIsBody)
            .map(isCompile).toPropertyWhenPresent("isCompile", record::getIsCompile)
            .map(isDebug).toPropertyWhenPresent("isDebug", record::getIsDebug)
            .map(isReuseSettings).toPropertyWhenPresent("isReuseSettings", record::getIsReuseSettings)
            .map(nameOid).toPropertyWhenPresent("nameOid", record::getNameOid)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_type_statement")
    default Optional<SqlAlterTypeStatement> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, sqlAlterTypeStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_type_statement")
    default List<SqlAlterTypeStatement> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, sqlAlterTypeStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_type_statement")
    default List<SqlAlterTypeStatement> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, sqlAlterTypeStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_type_statement")
    default Optional<SqlAlterTypeStatement> selectByPrimaryKey(Long oid_) {
        return selectOne(c ->
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_type_statement")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, sqlAlterTypeStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_type_statement")
    static UpdateDSL<UpdateModel> updateAllColumns(SqlAlterTypeStatement record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalTo(record::getOid)
                .set(isBody).equalTo(record::getIsBody)
                .set(isCompile).equalTo(record::getIsCompile)
                .set(isDebug).equalTo(record::getIsDebug)
                .set(isReuseSettings).equalTo(record::getIsReuseSettings)
                .set(nameOid).equalTo(record::getNameOid);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_type_statement")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(SqlAlterTypeStatement record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalToWhenPresent(record::getOid)
                .set(isBody).equalToWhenPresent(record::getIsBody)
                .set(isCompile).equalToWhenPresent(record::getIsCompile)
                .set(isDebug).equalToWhenPresent(record::getIsDebug)
                .set(isReuseSettings).equalToWhenPresent(record::getIsReuseSettings)
                .set(nameOid).equalToWhenPresent(record::getNameOid);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_type_statement")
    default int updateByPrimaryKey(SqlAlterTypeStatement record) {
        return update(c ->
            c.set(isBody).equalTo(record::getIsBody)
            .set(isCompile).equalTo(record::getIsCompile)
            .set(isDebug).equalTo(record::getIsDebug)
            .set(isReuseSettings).equalTo(record::getIsReuseSettings)
            .set(nameOid).equalTo(record::getNameOid)
            .where(oid, isEqualTo(record::getOid))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_type_statement")
    default int updateByPrimaryKeySelective(SqlAlterTypeStatement record) {
        return update(c ->
            c.set(isBody).equalToWhenPresent(record::getIsBody)
            .set(isCompile).equalToWhenPresent(record::getIsCompile)
            .set(isDebug).equalToWhenPresent(record::getIsDebug)
            .set(isReuseSettings).equalToWhenPresent(record::getIsReuseSettings)
            .set(nameOid).equalToWhenPresent(record::getNameOid)
            .where(oid, isEqualTo(record::getOid))
        );
    }
}