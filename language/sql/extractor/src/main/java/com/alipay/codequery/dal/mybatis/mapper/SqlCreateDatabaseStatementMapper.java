package com.alipay.codequery.dal.mybatis.mapper;

import static com.alipay.codequery.dal.mybatis.mapper.SqlCreateDatabaseStatementDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.alipay.codequery.dal.mybatis.domain.SqlCreateDatabaseStatement;
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
public interface SqlCreateDatabaseStatementMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_create_database_statement")
    BasicColumn[] selectList = BasicColumn.columnList(oid, characterSet, collate, commentOid, databaseName, isIfNotExists, isPhysical, locationOid, nameOid, options, passwordOid, server, storedAsOid, storedBy, storedInOid, user);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_create_database_statement")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_create_database_statement")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_create_database_statement")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<SqlCreateDatabaseStatement> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_create_database_statement")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<SqlCreateDatabaseStatement> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_create_database_statement")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="character_set", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="collate", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="comment_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="database_name", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="is_if_not_exists", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_physical", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="location_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="name_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="options", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="password_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="server", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="stored_as_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="stored_by", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="stored_in_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="user", javaType=String.class, jdbcType=JdbcType.VARCHAR)
    })
    Optional<SqlCreateDatabaseStatement> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_create_database_statement")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="character_set", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="collate", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="comment_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="database_name", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="is_if_not_exists", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_physical", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="location_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="name_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="options", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="password_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="server", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="stored_as_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="stored_by", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="stored_in_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="user", javaType=String.class, jdbcType=JdbcType.VARCHAR)
    })
    List<SqlCreateDatabaseStatement> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_create_database_statement")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_create_database_statement")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, sqlCreateDatabaseStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_create_database_statement")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, sqlCreateDatabaseStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_create_database_statement")
    default int deleteByPrimaryKey(Long oid_) {
        return delete(c -> 
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_create_database_statement")
    default int insert(SqlCreateDatabaseStatement record) {
        return MyBatis3Utils.insert(this::insert, record, sqlCreateDatabaseStatement, c ->
            c.map(oid).toProperty("oid")
            .map(characterSet).toProperty("characterSet")
            .map(collate).toProperty("collate")
            .map(commentOid).toProperty("commentOid")
            .map(databaseName).toProperty("databaseName")
            .map(isIfNotExists).toProperty("isIfNotExists")
            .map(isPhysical).toProperty("isPhysical")
            .map(locationOid).toProperty("locationOid")
            .map(nameOid).toProperty("nameOid")
            .map(options).toProperty("options")
            .map(passwordOid).toProperty("passwordOid")
            .map(server).toProperty("server")
            .map(storedAsOid).toProperty("storedAsOid")
            .map(storedBy).toProperty("storedBy")
            .map(storedInOid).toProperty("storedInOid")
            .map(user).toProperty("user")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_create_database_statement")
    default int insertMultiple(Collection<SqlCreateDatabaseStatement> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, sqlCreateDatabaseStatement, c ->
            c.map(oid).toProperty("oid")
            .map(characterSet).toProperty("characterSet")
            .map(collate).toProperty("collate")
            .map(commentOid).toProperty("commentOid")
            .map(databaseName).toProperty("databaseName")
            .map(isIfNotExists).toProperty("isIfNotExists")
            .map(isPhysical).toProperty("isPhysical")
            .map(locationOid).toProperty("locationOid")
            .map(nameOid).toProperty("nameOid")
            .map(options).toProperty("options")
            .map(passwordOid).toProperty("passwordOid")
            .map(server).toProperty("server")
            .map(storedAsOid).toProperty("storedAsOid")
            .map(storedBy).toProperty("storedBy")
            .map(storedInOid).toProperty("storedInOid")
            .map(user).toProperty("user")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_create_database_statement")
    default int insertSelective(SqlCreateDatabaseStatement record) {
        return MyBatis3Utils.insert(this::insert, record, sqlCreateDatabaseStatement, c ->
            c.map(oid).toPropertyWhenPresent("oid", record::getOid)
            .map(characterSet).toPropertyWhenPresent("characterSet", record::getCharacterSet)
            .map(collate).toPropertyWhenPresent("collate", record::getCollate)
            .map(commentOid).toPropertyWhenPresent("commentOid", record::getCommentOid)
            .map(databaseName).toPropertyWhenPresent("databaseName", record::getDatabaseName)
            .map(isIfNotExists).toPropertyWhenPresent("isIfNotExists", record::getIsIfNotExists)
            .map(isPhysical).toPropertyWhenPresent("isPhysical", record::getIsPhysical)
            .map(locationOid).toPropertyWhenPresent("locationOid", record::getLocationOid)
            .map(nameOid).toPropertyWhenPresent("nameOid", record::getNameOid)
            .map(options).toPropertyWhenPresent("options", record::getOptions)
            .map(passwordOid).toPropertyWhenPresent("passwordOid", record::getPasswordOid)
            .map(server).toPropertyWhenPresent("server", record::getServer)
            .map(storedAsOid).toPropertyWhenPresent("storedAsOid", record::getStoredAsOid)
            .map(storedBy).toPropertyWhenPresent("storedBy", record::getStoredBy)
            .map(storedInOid).toPropertyWhenPresent("storedInOid", record::getStoredInOid)
            .map(user).toPropertyWhenPresent("user", record::getUser)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_create_database_statement")
    default Optional<SqlCreateDatabaseStatement> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, sqlCreateDatabaseStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_create_database_statement")
    default List<SqlCreateDatabaseStatement> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, sqlCreateDatabaseStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_create_database_statement")
    default List<SqlCreateDatabaseStatement> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, sqlCreateDatabaseStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_create_database_statement")
    default Optional<SqlCreateDatabaseStatement> selectByPrimaryKey(Long oid_) {
        return selectOne(c ->
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_create_database_statement")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, sqlCreateDatabaseStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_create_database_statement")
    static UpdateDSL<UpdateModel> updateAllColumns(SqlCreateDatabaseStatement record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalTo(record::getOid)
                .set(characterSet).equalTo(record::getCharacterSet)
                .set(collate).equalTo(record::getCollate)
                .set(commentOid).equalTo(record::getCommentOid)
                .set(databaseName).equalTo(record::getDatabaseName)
                .set(isIfNotExists).equalTo(record::getIsIfNotExists)
                .set(isPhysical).equalTo(record::getIsPhysical)
                .set(locationOid).equalTo(record::getLocationOid)
                .set(nameOid).equalTo(record::getNameOid)
                .set(options).equalTo(record::getOptions)
                .set(passwordOid).equalTo(record::getPasswordOid)
                .set(server).equalTo(record::getServer)
                .set(storedAsOid).equalTo(record::getStoredAsOid)
                .set(storedBy).equalTo(record::getStoredBy)
                .set(storedInOid).equalTo(record::getStoredInOid)
                .set(user).equalTo(record::getUser);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_create_database_statement")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(SqlCreateDatabaseStatement record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalToWhenPresent(record::getOid)
                .set(characterSet).equalToWhenPresent(record::getCharacterSet)
                .set(collate).equalToWhenPresent(record::getCollate)
                .set(commentOid).equalToWhenPresent(record::getCommentOid)
                .set(databaseName).equalToWhenPresent(record::getDatabaseName)
                .set(isIfNotExists).equalToWhenPresent(record::getIsIfNotExists)
                .set(isPhysical).equalToWhenPresent(record::getIsPhysical)
                .set(locationOid).equalToWhenPresent(record::getLocationOid)
                .set(nameOid).equalToWhenPresent(record::getNameOid)
                .set(options).equalToWhenPresent(record::getOptions)
                .set(passwordOid).equalToWhenPresent(record::getPasswordOid)
                .set(server).equalToWhenPresent(record::getServer)
                .set(storedAsOid).equalToWhenPresent(record::getStoredAsOid)
                .set(storedBy).equalToWhenPresent(record::getStoredBy)
                .set(storedInOid).equalToWhenPresent(record::getStoredInOid)
                .set(user).equalToWhenPresent(record::getUser);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_create_database_statement")
    default int updateByPrimaryKey(SqlCreateDatabaseStatement record) {
        return update(c ->
            c.set(characterSet).equalTo(record::getCharacterSet)
            .set(collate).equalTo(record::getCollate)
            .set(commentOid).equalTo(record::getCommentOid)
            .set(databaseName).equalTo(record::getDatabaseName)
            .set(isIfNotExists).equalTo(record::getIsIfNotExists)
            .set(isPhysical).equalTo(record::getIsPhysical)
            .set(locationOid).equalTo(record::getLocationOid)
            .set(nameOid).equalTo(record::getNameOid)
            .set(options).equalTo(record::getOptions)
            .set(passwordOid).equalTo(record::getPasswordOid)
            .set(server).equalTo(record::getServer)
            .set(storedAsOid).equalTo(record::getStoredAsOid)
            .set(storedBy).equalTo(record::getStoredBy)
            .set(storedInOid).equalTo(record::getStoredInOid)
            .set(user).equalTo(record::getUser)
            .where(oid, isEqualTo(record::getOid))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_create_database_statement")
    default int updateByPrimaryKeySelective(SqlCreateDatabaseStatement record) {
        return update(c ->
            c.set(characterSet).equalToWhenPresent(record::getCharacterSet)
            .set(collate).equalToWhenPresent(record::getCollate)
            .set(commentOid).equalToWhenPresent(record::getCommentOid)
            .set(databaseName).equalToWhenPresent(record::getDatabaseName)
            .set(isIfNotExists).equalToWhenPresent(record::getIsIfNotExists)
            .set(isPhysical).equalToWhenPresent(record::getIsPhysical)
            .set(locationOid).equalToWhenPresent(record::getLocationOid)
            .set(nameOid).equalToWhenPresent(record::getNameOid)
            .set(options).equalToWhenPresent(record::getOptions)
            .set(passwordOid).equalToWhenPresent(record::getPasswordOid)
            .set(server).equalToWhenPresent(record::getServer)
            .set(storedAsOid).equalToWhenPresent(record::getStoredAsOid)
            .set(storedBy).equalToWhenPresent(record::getStoredBy)
            .set(storedInOid).equalToWhenPresent(record::getStoredInOid)
            .set(user).equalToWhenPresent(record::getUser)
            .where(oid, isEqualTo(record::getOid))
        );
    }
}