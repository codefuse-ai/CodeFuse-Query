package com.alipay.codequery.dal.mybatis.mapper;

import static com.alipay.codequery.dal.mybatis.mapper.MySqlUserNameDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.alipay.codequery.dal.mybatis.domain.MySqlUserName;
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
public interface MySqlUserNameMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_user_name")
    BasicColumn[] selectList = BasicColumn.columnList(oid, host, identifiedBy, normalizeUserName, resolvedColumnOid, simpleName, userName);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_user_name")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_user_name")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_user_name")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<MySqlUserName> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_user_name")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<MySqlUserName> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_user_name")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="host", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="identified_by", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="normalize_user_name", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="resolved_column_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="simple_name", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="user_name", javaType=String.class, jdbcType=JdbcType.VARCHAR)
    })
    Optional<MySqlUserName> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_user_name")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="host", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="identified_by", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="normalize_user_name", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="resolved_column_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="simple_name", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="user_name", javaType=String.class, jdbcType=JdbcType.VARCHAR)
    })
    List<MySqlUserName> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_user_name")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_user_name")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, mySqlUserName, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_user_name")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, mySqlUserName, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_user_name")
    default int deleteByPrimaryKey(Long oid_) {
        return delete(c -> 
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_user_name")
    default int insert(MySqlUserName record) {
        return MyBatis3Utils.insert(this::insert, record, mySqlUserName, c ->
            c.map(oid).toProperty("oid")
            .map(host).toProperty("host")
            .map(identifiedBy).toProperty("identifiedBy")
            .map(normalizeUserName).toProperty("normalizeUserName")
            .map(resolvedColumnOid).toProperty("resolvedColumnOid")
            .map(simpleName).toProperty("simpleName")
            .map(userName).toProperty("userName")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_user_name")
    default int insertMultiple(Collection<MySqlUserName> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, mySqlUserName, c ->
            c.map(oid).toProperty("oid")
            .map(host).toProperty("host")
            .map(identifiedBy).toProperty("identifiedBy")
            .map(normalizeUserName).toProperty("normalizeUserName")
            .map(resolvedColumnOid).toProperty("resolvedColumnOid")
            .map(simpleName).toProperty("simpleName")
            .map(userName).toProperty("userName")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_user_name")
    default int insertSelective(MySqlUserName record) {
        return MyBatis3Utils.insert(this::insert, record, mySqlUserName, c ->
            c.map(oid).toPropertyWhenPresent("oid", record::getOid)
            .map(host).toPropertyWhenPresent("host", record::getHost)
            .map(identifiedBy).toPropertyWhenPresent("identifiedBy", record::getIdentifiedBy)
            .map(normalizeUserName).toPropertyWhenPresent("normalizeUserName", record::getNormalizeUserName)
            .map(resolvedColumnOid).toPropertyWhenPresent("resolvedColumnOid", record::getResolvedColumnOid)
            .map(simpleName).toPropertyWhenPresent("simpleName", record::getSimpleName)
            .map(userName).toPropertyWhenPresent("userName", record::getUserName)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_user_name")
    default Optional<MySqlUserName> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, mySqlUserName, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_user_name")
    default List<MySqlUserName> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, mySqlUserName, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_user_name")
    default List<MySqlUserName> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, mySqlUserName, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_user_name")
    default Optional<MySqlUserName> selectByPrimaryKey(Long oid_) {
        return selectOne(c ->
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_user_name")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, mySqlUserName, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_user_name")
    static UpdateDSL<UpdateModel> updateAllColumns(MySqlUserName record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalTo(record::getOid)
                .set(host).equalTo(record::getHost)
                .set(identifiedBy).equalTo(record::getIdentifiedBy)
                .set(normalizeUserName).equalTo(record::getNormalizeUserName)
                .set(resolvedColumnOid).equalTo(record::getResolvedColumnOid)
                .set(simpleName).equalTo(record::getSimpleName)
                .set(userName).equalTo(record::getUserName);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_user_name")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(MySqlUserName record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalToWhenPresent(record::getOid)
                .set(host).equalToWhenPresent(record::getHost)
                .set(identifiedBy).equalToWhenPresent(record::getIdentifiedBy)
                .set(normalizeUserName).equalToWhenPresent(record::getNormalizeUserName)
                .set(resolvedColumnOid).equalToWhenPresent(record::getResolvedColumnOid)
                .set(simpleName).equalToWhenPresent(record::getSimpleName)
                .set(userName).equalToWhenPresent(record::getUserName);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_user_name")
    default int updateByPrimaryKey(MySqlUserName record) {
        return update(c ->
            c.set(host).equalTo(record::getHost)
            .set(identifiedBy).equalTo(record::getIdentifiedBy)
            .set(normalizeUserName).equalTo(record::getNormalizeUserName)
            .set(resolvedColumnOid).equalTo(record::getResolvedColumnOid)
            .set(simpleName).equalTo(record::getSimpleName)
            .set(userName).equalTo(record::getUserName)
            .where(oid, isEqualTo(record::getOid))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_user_name")
    default int updateByPrimaryKeySelective(MySqlUserName record) {
        return update(c ->
            c.set(host).equalToWhenPresent(record::getHost)
            .set(identifiedBy).equalToWhenPresent(record::getIdentifiedBy)
            .set(normalizeUserName).equalToWhenPresent(record::getNormalizeUserName)
            .set(resolvedColumnOid).equalToWhenPresent(record::getResolvedColumnOid)
            .set(simpleName).equalToWhenPresent(record::getSimpleName)
            .set(userName).equalToWhenPresent(record::getUserName)
            .where(oid, isEqualTo(record::getOid))
        );
    }
}