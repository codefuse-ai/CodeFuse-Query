package com.alipay.codequery.dal.mybatis.mapper;

import static com.alipay.codequery.dal.mybatis.mapper.OracleCreateDatabaseDbLinkStatementDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.alipay.codequery.dal.mybatis.domain.OracleCreateDatabaseDbLinkStatement;
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
public interface OracleCreateDatabaseDbLinkStatementMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_create_database_db_link_statement")
    BasicColumn[] selectList = BasicColumn.columnList(oid, authenticatedPassword, authenticatedUserOid, isPublic, isShared, nameOid, password, userOid, usingOid);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_create_database_db_link_statement")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_create_database_db_link_statement")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_create_database_db_link_statement")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<OracleCreateDatabaseDbLinkStatement> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_create_database_db_link_statement")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<OracleCreateDatabaseDbLinkStatement> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_create_database_db_link_statement")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="authenticated_password", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="authenticated_user_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_public", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_shared", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="name_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="password", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="user_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="using_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT)
    })
    Optional<OracleCreateDatabaseDbLinkStatement> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_create_database_db_link_statement")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="authenticated_password", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="authenticated_user_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_public", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_shared", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="name_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="password", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="user_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="using_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT)
    })
    List<OracleCreateDatabaseDbLinkStatement> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_create_database_db_link_statement")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_create_database_db_link_statement")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, oracleCreateDatabaseDbLinkStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_create_database_db_link_statement")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, oracleCreateDatabaseDbLinkStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_create_database_db_link_statement")
    default int deleteByPrimaryKey(Long oid_) {
        return delete(c -> 
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_create_database_db_link_statement")
    default int insert(OracleCreateDatabaseDbLinkStatement record) {
        return MyBatis3Utils.insert(this::insert, record, oracleCreateDatabaseDbLinkStatement, c ->
            c.map(oid).toProperty("oid")
            .map(authenticatedPassword).toProperty("authenticatedPassword")
            .map(authenticatedUserOid).toProperty("authenticatedUserOid")
            .map(isPublic).toProperty("isPublic")
            .map(isShared).toProperty("isShared")
            .map(nameOid).toProperty("nameOid")
            .map(password).toProperty("password")
            .map(userOid).toProperty("userOid")
            .map(usingOid).toProperty("usingOid")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_create_database_db_link_statement")
    default int insertMultiple(Collection<OracleCreateDatabaseDbLinkStatement> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, oracleCreateDatabaseDbLinkStatement, c ->
            c.map(oid).toProperty("oid")
            .map(authenticatedPassword).toProperty("authenticatedPassword")
            .map(authenticatedUserOid).toProperty("authenticatedUserOid")
            .map(isPublic).toProperty("isPublic")
            .map(isShared).toProperty("isShared")
            .map(nameOid).toProperty("nameOid")
            .map(password).toProperty("password")
            .map(userOid).toProperty("userOid")
            .map(usingOid).toProperty("usingOid")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_create_database_db_link_statement")
    default int insertSelective(OracleCreateDatabaseDbLinkStatement record) {
        return MyBatis3Utils.insert(this::insert, record, oracleCreateDatabaseDbLinkStatement, c ->
            c.map(oid).toPropertyWhenPresent("oid", record::getOid)
            .map(authenticatedPassword).toPropertyWhenPresent("authenticatedPassword", record::getAuthenticatedPassword)
            .map(authenticatedUserOid).toPropertyWhenPresent("authenticatedUserOid", record::getAuthenticatedUserOid)
            .map(isPublic).toPropertyWhenPresent("isPublic", record::getIsPublic)
            .map(isShared).toPropertyWhenPresent("isShared", record::getIsShared)
            .map(nameOid).toPropertyWhenPresent("nameOid", record::getNameOid)
            .map(password).toPropertyWhenPresent("password", record::getPassword)
            .map(userOid).toPropertyWhenPresent("userOid", record::getUserOid)
            .map(usingOid).toPropertyWhenPresent("usingOid", record::getUsingOid)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_create_database_db_link_statement")
    default Optional<OracleCreateDatabaseDbLinkStatement> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, oracleCreateDatabaseDbLinkStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_create_database_db_link_statement")
    default List<OracleCreateDatabaseDbLinkStatement> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, oracleCreateDatabaseDbLinkStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_create_database_db_link_statement")
    default List<OracleCreateDatabaseDbLinkStatement> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, oracleCreateDatabaseDbLinkStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_create_database_db_link_statement")
    default Optional<OracleCreateDatabaseDbLinkStatement> selectByPrimaryKey(Long oid_) {
        return selectOne(c ->
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_create_database_db_link_statement")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, oracleCreateDatabaseDbLinkStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_create_database_db_link_statement")
    static UpdateDSL<UpdateModel> updateAllColumns(OracleCreateDatabaseDbLinkStatement record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalTo(record::getOid)
                .set(authenticatedPassword).equalTo(record::getAuthenticatedPassword)
                .set(authenticatedUserOid).equalTo(record::getAuthenticatedUserOid)
                .set(isPublic).equalTo(record::getIsPublic)
                .set(isShared).equalTo(record::getIsShared)
                .set(nameOid).equalTo(record::getNameOid)
                .set(password).equalTo(record::getPassword)
                .set(userOid).equalTo(record::getUserOid)
                .set(usingOid).equalTo(record::getUsingOid);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_create_database_db_link_statement")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(OracleCreateDatabaseDbLinkStatement record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalToWhenPresent(record::getOid)
                .set(authenticatedPassword).equalToWhenPresent(record::getAuthenticatedPassword)
                .set(authenticatedUserOid).equalToWhenPresent(record::getAuthenticatedUserOid)
                .set(isPublic).equalToWhenPresent(record::getIsPublic)
                .set(isShared).equalToWhenPresent(record::getIsShared)
                .set(nameOid).equalToWhenPresent(record::getNameOid)
                .set(password).equalToWhenPresent(record::getPassword)
                .set(userOid).equalToWhenPresent(record::getUserOid)
                .set(usingOid).equalToWhenPresent(record::getUsingOid);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_create_database_db_link_statement")
    default int updateByPrimaryKey(OracleCreateDatabaseDbLinkStatement record) {
        return update(c ->
            c.set(authenticatedPassword).equalTo(record::getAuthenticatedPassword)
            .set(authenticatedUserOid).equalTo(record::getAuthenticatedUserOid)
            .set(isPublic).equalTo(record::getIsPublic)
            .set(isShared).equalTo(record::getIsShared)
            .set(nameOid).equalTo(record::getNameOid)
            .set(password).equalTo(record::getPassword)
            .set(userOid).equalTo(record::getUserOid)
            .set(usingOid).equalTo(record::getUsingOid)
            .where(oid, isEqualTo(record::getOid))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_create_database_db_link_statement")
    default int updateByPrimaryKeySelective(OracleCreateDatabaseDbLinkStatement record) {
        return update(c ->
            c.set(authenticatedPassword).equalToWhenPresent(record::getAuthenticatedPassword)
            .set(authenticatedUserOid).equalToWhenPresent(record::getAuthenticatedUserOid)
            .set(isPublic).equalToWhenPresent(record::getIsPublic)
            .set(isShared).equalToWhenPresent(record::getIsShared)
            .set(nameOid).equalToWhenPresent(record::getNameOid)
            .set(password).equalToWhenPresent(record::getPassword)
            .set(userOid).equalToWhenPresent(record::getUserOid)
            .set(usingOid).equalToWhenPresent(record::getUsingOid)
            .where(oid, isEqualTo(record::getOid))
        );
    }
}