package com.alipay.codequery.dal.mybatis.mapper;

import static com.alipay.codequery.dal.mybatis.mapper.SqlDropDatabaseStatementDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.alipay.codequery.dal.mybatis.domain.SqlDropDatabaseStatement;
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
public interface SqlDropDatabaseStatementMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_drop_database_statement")
    BasicColumn[] selectList = BasicColumn.columnList(oid, databaseOid, databaseName, isCascade, isIfExists, isPhysical, isRestrict, nameOid, restrict, server);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_drop_database_statement")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_drop_database_statement")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_drop_database_statement")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<SqlDropDatabaseStatement> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_drop_database_statement")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<SqlDropDatabaseStatement> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_drop_database_statement")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="database_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="database_name", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="is_cascade", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_if_exists", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_physical", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_restrict", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="name_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="restrict", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="server", javaType=String.class, jdbcType=JdbcType.VARCHAR)
    })
    Optional<SqlDropDatabaseStatement> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_drop_database_statement")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="database_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="database_name", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="is_cascade", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_if_exists", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_physical", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_restrict", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="name_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="restrict", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="server", javaType=String.class, jdbcType=JdbcType.VARCHAR)
    })
    List<SqlDropDatabaseStatement> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_drop_database_statement")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_drop_database_statement")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, sqlDropDatabaseStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_drop_database_statement")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, sqlDropDatabaseStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_drop_database_statement")
    default int deleteByPrimaryKey(Long oid_) {
        return delete(c -> 
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_drop_database_statement")
    default int insert(SqlDropDatabaseStatement record) {
        return MyBatis3Utils.insert(this::insert, record, sqlDropDatabaseStatement, c ->
            c.map(oid).toProperty("oid")
            .map(databaseOid).toProperty("databaseOid")
            .map(databaseName).toProperty("databaseName")
            .map(isCascade).toProperty("isCascade")
            .map(isIfExists).toProperty("isIfExists")
            .map(isPhysical).toProperty("isPhysical")
            .map(isRestrict).toProperty("isRestrict")
            .map(nameOid).toProperty("nameOid")
            .map(restrict).toProperty("restrict")
            .map(server).toProperty("server")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_drop_database_statement")
    default int insertMultiple(Collection<SqlDropDatabaseStatement> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, sqlDropDatabaseStatement, c ->
            c.map(oid).toProperty("oid")
            .map(databaseOid).toProperty("databaseOid")
            .map(databaseName).toProperty("databaseName")
            .map(isCascade).toProperty("isCascade")
            .map(isIfExists).toProperty("isIfExists")
            .map(isPhysical).toProperty("isPhysical")
            .map(isRestrict).toProperty("isRestrict")
            .map(nameOid).toProperty("nameOid")
            .map(restrict).toProperty("restrict")
            .map(server).toProperty("server")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_drop_database_statement")
    default int insertSelective(SqlDropDatabaseStatement record) {
        return MyBatis3Utils.insert(this::insert, record, sqlDropDatabaseStatement, c ->
            c.map(oid).toPropertyWhenPresent("oid", record::getOid)
            .map(databaseOid).toPropertyWhenPresent("databaseOid", record::getDatabaseOid)
            .map(databaseName).toPropertyWhenPresent("databaseName", record::getDatabaseName)
            .map(isCascade).toPropertyWhenPresent("isCascade", record::getIsCascade)
            .map(isIfExists).toPropertyWhenPresent("isIfExists", record::getIsIfExists)
            .map(isPhysical).toPropertyWhenPresent("isPhysical", record::getIsPhysical)
            .map(isRestrict).toPropertyWhenPresent("isRestrict", record::getIsRestrict)
            .map(nameOid).toPropertyWhenPresent("nameOid", record::getNameOid)
            .map(restrict).toPropertyWhenPresent("restrict", record::getRestrict)
            .map(server).toPropertyWhenPresent("server", record::getServer)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_drop_database_statement")
    default Optional<SqlDropDatabaseStatement> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, sqlDropDatabaseStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_drop_database_statement")
    default List<SqlDropDatabaseStatement> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, sqlDropDatabaseStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_drop_database_statement")
    default List<SqlDropDatabaseStatement> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, sqlDropDatabaseStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_drop_database_statement")
    default Optional<SqlDropDatabaseStatement> selectByPrimaryKey(Long oid_) {
        return selectOne(c ->
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_drop_database_statement")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, sqlDropDatabaseStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_drop_database_statement")
    static UpdateDSL<UpdateModel> updateAllColumns(SqlDropDatabaseStatement record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalTo(record::getOid)
                .set(databaseOid).equalTo(record::getDatabaseOid)
                .set(databaseName).equalTo(record::getDatabaseName)
                .set(isCascade).equalTo(record::getIsCascade)
                .set(isIfExists).equalTo(record::getIsIfExists)
                .set(isPhysical).equalTo(record::getIsPhysical)
                .set(isRestrict).equalTo(record::getIsRestrict)
                .set(nameOid).equalTo(record::getNameOid)
                .set(restrict).equalTo(record::getRestrict)
                .set(server).equalTo(record::getServer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_drop_database_statement")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(SqlDropDatabaseStatement record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalToWhenPresent(record::getOid)
                .set(databaseOid).equalToWhenPresent(record::getDatabaseOid)
                .set(databaseName).equalToWhenPresent(record::getDatabaseName)
                .set(isCascade).equalToWhenPresent(record::getIsCascade)
                .set(isIfExists).equalToWhenPresent(record::getIsIfExists)
                .set(isPhysical).equalToWhenPresent(record::getIsPhysical)
                .set(isRestrict).equalToWhenPresent(record::getIsRestrict)
                .set(nameOid).equalToWhenPresent(record::getNameOid)
                .set(restrict).equalToWhenPresent(record::getRestrict)
                .set(server).equalToWhenPresent(record::getServer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_drop_database_statement")
    default int updateByPrimaryKey(SqlDropDatabaseStatement record) {
        return update(c ->
            c.set(databaseOid).equalTo(record::getDatabaseOid)
            .set(databaseName).equalTo(record::getDatabaseName)
            .set(isCascade).equalTo(record::getIsCascade)
            .set(isIfExists).equalTo(record::getIsIfExists)
            .set(isPhysical).equalTo(record::getIsPhysical)
            .set(isRestrict).equalTo(record::getIsRestrict)
            .set(nameOid).equalTo(record::getNameOid)
            .set(restrict).equalTo(record::getRestrict)
            .set(server).equalTo(record::getServer)
            .where(oid, isEqualTo(record::getOid))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_drop_database_statement")
    default int updateByPrimaryKeySelective(SqlDropDatabaseStatement record) {
        return update(c ->
            c.set(databaseOid).equalToWhenPresent(record::getDatabaseOid)
            .set(databaseName).equalToWhenPresent(record::getDatabaseName)
            .set(isCascade).equalToWhenPresent(record::getIsCascade)
            .set(isIfExists).equalToWhenPresent(record::getIsIfExists)
            .set(isPhysical).equalToWhenPresent(record::getIsPhysical)
            .set(isRestrict).equalToWhenPresent(record::getIsRestrict)
            .set(nameOid).equalToWhenPresent(record::getNameOid)
            .set(restrict).equalToWhenPresent(record::getRestrict)
            .set(server).equalToWhenPresent(record::getServer)
            .where(oid, isEqualTo(record::getOid))
        );
    }
}