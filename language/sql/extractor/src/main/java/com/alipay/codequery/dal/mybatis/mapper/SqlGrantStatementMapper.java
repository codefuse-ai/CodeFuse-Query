package com.alipay.codequery.dal.mybatis.mapper;

import static com.alipay.codequery.dal.mybatis.mapper.SqlGrantStatementDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.alipay.codequery.dal.mybatis.domain.SqlGrantStatement;
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
public interface SqlGrantStatementMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_grant_statement")
    BasicColumn[] selectList = BasicColumn.columnList(oid, identifiedByOid, identifiedByPassword, isAdminOption, maxConnectionsPerHourOid, maxQueriesPerHourOid, maxUpdatesPerHourOid, maxUserConnectionsOid, resourceType, withGrantOption);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_grant_statement")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_grant_statement")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_grant_statement")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<SqlGrantStatement> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_grant_statement")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<SqlGrantStatement> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_grant_statement")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="identified_by_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="identified_by_password", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="is_admin_option", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="max_connections_per_hour_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="max_queries_per_hour_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="max_updates_per_hour_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="max_user_connections_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="resource_type", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="with_grant_option", javaType=Integer.class, jdbcType=JdbcType.BIGINT)
    })
    Optional<SqlGrantStatement> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_grant_statement")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="identified_by_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="identified_by_password", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="is_admin_option", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="max_connections_per_hour_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="max_queries_per_hour_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="max_updates_per_hour_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="max_user_connections_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="resource_type", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="with_grant_option", javaType=Integer.class, jdbcType=JdbcType.BIGINT)
    })
    List<SqlGrantStatement> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_grant_statement")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_grant_statement")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, sqlGrantStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_grant_statement")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, sqlGrantStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_grant_statement")
    default int deleteByPrimaryKey(Long oid_) {
        return delete(c -> 
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_grant_statement")
    default int insert(SqlGrantStatement record) {
        return MyBatis3Utils.insert(this::insert, record, sqlGrantStatement, c ->
            c.map(oid).toProperty("oid")
            .map(identifiedByOid).toProperty("identifiedByOid")
            .map(identifiedByPassword).toProperty("identifiedByPassword")
            .map(isAdminOption).toProperty("isAdminOption")
            .map(maxConnectionsPerHourOid).toProperty("maxConnectionsPerHourOid")
            .map(maxQueriesPerHourOid).toProperty("maxQueriesPerHourOid")
            .map(maxUpdatesPerHourOid).toProperty("maxUpdatesPerHourOid")
            .map(maxUserConnectionsOid).toProperty("maxUserConnectionsOid")
            .map(resourceType).toProperty("resourceType")
            .map(withGrantOption).toProperty("withGrantOption")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_grant_statement")
    default int insertMultiple(Collection<SqlGrantStatement> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, sqlGrantStatement, c ->
            c.map(oid).toProperty("oid")
            .map(identifiedByOid).toProperty("identifiedByOid")
            .map(identifiedByPassword).toProperty("identifiedByPassword")
            .map(isAdminOption).toProperty("isAdminOption")
            .map(maxConnectionsPerHourOid).toProperty("maxConnectionsPerHourOid")
            .map(maxQueriesPerHourOid).toProperty("maxQueriesPerHourOid")
            .map(maxUpdatesPerHourOid).toProperty("maxUpdatesPerHourOid")
            .map(maxUserConnectionsOid).toProperty("maxUserConnectionsOid")
            .map(resourceType).toProperty("resourceType")
            .map(withGrantOption).toProperty("withGrantOption")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_grant_statement")
    default int insertSelective(SqlGrantStatement record) {
        return MyBatis3Utils.insert(this::insert, record, sqlGrantStatement, c ->
            c.map(oid).toPropertyWhenPresent("oid", record::getOid)
            .map(identifiedByOid).toPropertyWhenPresent("identifiedByOid", record::getIdentifiedByOid)
            .map(identifiedByPassword).toPropertyWhenPresent("identifiedByPassword", record::getIdentifiedByPassword)
            .map(isAdminOption).toPropertyWhenPresent("isAdminOption", record::getIsAdminOption)
            .map(maxConnectionsPerHourOid).toPropertyWhenPresent("maxConnectionsPerHourOid", record::getMaxConnectionsPerHourOid)
            .map(maxQueriesPerHourOid).toPropertyWhenPresent("maxQueriesPerHourOid", record::getMaxQueriesPerHourOid)
            .map(maxUpdatesPerHourOid).toPropertyWhenPresent("maxUpdatesPerHourOid", record::getMaxUpdatesPerHourOid)
            .map(maxUserConnectionsOid).toPropertyWhenPresent("maxUserConnectionsOid", record::getMaxUserConnectionsOid)
            .map(resourceType).toPropertyWhenPresent("resourceType", record::getResourceType)
            .map(withGrantOption).toPropertyWhenPresent("withGrantOption", record::getWithGrantOption)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_grant_statement")
    default Optional<SqlGrantStatement> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, sqlGrantStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_grant_statement")
    default List<SqlGrantStatement> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, sqlGrantStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_grant_statement")
    default List<SqlGrantStatement> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, sqlGrantStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_grant_statement")
    default Optional<SqlGrantStatement> selectByPrimaryKey(Long oid_) {
        return selectOne(c ->
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_grant_statement")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, sqlGrantStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_grant_statement")
    static UpdateDSL<UpdateModel> updateAllColumns(SqlGrantStatement record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalTo(record::getOid)
                .set(identifiedByOid).equalTo(record::getIdentifiedByOid)
                .set(identifiedByPassword).equalTo(record::getIdentifiedByPassword)
                .set(isAdminOption).equalTo(record::getIsAdminOption)
                .set(maxConnectionsPerHourOid).equalTo(record::getMaxConnectionsPerHourOid)
                .set(maxQueriesPerHourOid).equalTo(record::getMaxQueriesPerHourOid)
                .set(maxUpdatesPerHourOid).equalTo(record::getMaxUpdatesPerHourOid)
                .set(maxUserConnectionsOid).equalTo(record::getMaxUserConnectionsOid)
                .set(resourceType).equalTo(record::getResourceType)
                .set(withGrantOption).equalTo(record::getWithGrantOption);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_grant_statement")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(SqlGrantStatement record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalToWhenPresent(record::getOid)
                .set(identifiedByOid).equalToWhenPresent(record::getIdentifiedByOid)
                .set(identifiedByPassword).equalToWhenPresent(record::getIdentifiedByPassword)
                .set(isAdminOption).equalToWhenPresent(record::getIsAdminOption)
                .set(maxConnectionsPerHourOid).equalToWhenPresent(record::getMaxConnectionsPerHourOid)
                .set(maxQueriesPerHourOid).equalToWhenPresent(record::getMaxQueriesPerHourOid)
                .set(maxUpdatesPerHourOid).equalToWhenPresent(record::getMaxUpdatesPerHourOid)
                .set(maxUserConnectionsOid).equalToWhenPresent(record::getMaxUserConnectionsOid)
                .set(resourceType).equalToWhenPresent(record::getResourceType)
                .set(withGrantOption).equalToWhenPresent(record::getWithGrantOption);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_grant_statement")
    default int updateByPrimaryKey(SqlGrantStatement record) {
        return update(c ->
            c.set(identifiedByOid).equalTo(record::getIdentifiedByOid)
            .set(identifiedByPassword).equalTo(record::getIdentifiedByPassword)
            .set(isAdminOption).equalTo(record::getIsAdminOption)
            .set(maxConnectionsPerHourOid).equalTo(record::getMaxConnectionsPerHourOid)
            .set(maxQueriesPerHourOid).equalTo(record::getMaxQueriesPerHourOid)
            .set(maxUpdatesPerHourOid).equalTo(record::getMaxUpdatesPerHourOid)
            .set(maxUserConnectionsOid).equalTo(record::getMaxUserConnectionsOid)
            .set(resourceType).equalTo(record::getResourceType)
            .set(withGrantOption).equalTo(record::getWithGrantOption)
            .where(oid, isEqualTo(record::getOid))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_grant_statement")
    default int updateByPrimaryKeySelective(SqlGrantStatement record) {
        return update(c ->
            c.set(identifiedByOid).equalToWhenPresent(record::getIdentifiedByOid)
            .set(identifiedByPassword).equalToWhenPresent(record::getIdentifiedByPassword)
            .set(isAdminOption).equalToWhenPresent(record::getIsAdminOption)
            .set(maxConnectionsPerHourOid).equalToWhenPresent(record::getMaxConnectionsPerHourOid)
            .set(maxQueriesPerHourOid).equalToWhenPresent(record::getMaxQueriesPerHourOid)
            .set(maxUpdatesPerHourOid).equalToWhenPresent(record::getMaxUpdatesPerHourOid)
            .set(maxUserConnectionsOid).equalToWhenPresent(record::getMaxUserConnectionsOid)
            .set(resourceType).equalToWhenPresent(record::getResourceType)
            .set(withGrantOption).equalToWhenPresent(record::getWithGrantOption)
            .where(oid, isEqualTo(record::getOid))
        );
    }
}