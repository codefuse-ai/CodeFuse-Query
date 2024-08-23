package com.alipay.codequery.dal.mybatis.mapper;

import static com.alipay.codequery.dal.mybatis.mapper.PgCreateSchemaStatementDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.alipay.codequery.dal.mybatis.domain.PgCreateSchemaStatement;
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
public interface PgCreateSchemaStatementMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: pg_create_schema_statement")
    BasicColumn[] selectList = BasicColumn.columnList(oid, isAuthorization, isIfNotExists, schemaNameOid, userNameOid);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: pg_create_schema_statement")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: pg_create_schema_statement")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: pg_create_schema_statement")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<PgCreateSchemaStatement> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: pg_create_schema_statement")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<PgCreateSchemaStatement> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: pg_create_schema_statement")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="is_authorization", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_if_not_exists", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="schema_name_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="user_name_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT)
    })
    Optional<PgCreateSchemaStatement> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: pg_create_schema_statement")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="is_authorization", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_if_not_exists", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="schema_name_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="user_name_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT)
    })
    List<PgCreateSchemaStatement> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: pg_create_schema_statement")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: pg_create_schema_statement")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, pgCreateSchemaStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: pg_create_schema_statement")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, pgCreateSchemaStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: pg_create_schema_statement")
    default int deleteByPrimaryKey(Long oid_) {
        return delete(c -> 
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: pg_create_schema_statement")
    default int insert(PgCreateSchemaStatement record) {
        return MyBatis3Utils.insert(this::insert, record, pgCreateSchemaStatement, c ->
            c.map(oid).toProperty("oid")
            .map(isAuthorization).toProperty("isAuthorization")
            .map(isIfNotExists).toProperty("isIfNotExists")
            .map(schemaNameOid).toProperty("schemaNameOid")
            .map(userNameOid).toProperty("userNameOid")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: pg_create_schema_statement")
    default int insertMultiple(Collection<PgCreateSchemaStatement> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, pgCreateSchemaStatement, c ->
            c.map(oid).toProperty("oid")
            .map(isAuthorization).toProperty("isAuthorization")
            .map(isIfNotExists).toProperty("isIfNotExists")
            .map(schemaNameOid).toProperty("schemaNameOid")
            .map(userNameOid).toProperty("userNameOid")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: pg_create_schema_statement")
    default int insertSelective(PgCreateSchemaStatement record) {
        return MyBatis3Utils.insert(this::insert, record, pgCreateSchemaStatement, c ->
            c.map(oid).toPropertyWhenPresent("oid", record::getOid)
            .map(isAuthorization).toPropertyWhenPresent("isAuthorization", record::getIsAuthorization)
            .map(isIfNotExists).toPropertyWhenPresent("isIfNotExists", record::getIsIfNotExists)
            .map(schemaNameOid).toPropertyWhenPresent("schemaNameOid", record::getSchemaNameOid)
            .map(userNameOid).toPropertyWhenPresent("userNameOid", record::getUserNameOid)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: pg_create_schema_statement")
    default Optional<PgCreateSchemaStatement> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, pgCreateSchemaStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: pg_create_schema_statement")
    default List<PgCreateSchemaStatement> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, pgCreateSchemaStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: pg_create_schema_statement")
    default List<PgCreateSchemaStatement> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, pgCreateSchemaStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: pg_create_schema_statement")
    default Optional<PgCreateSchemaStatement> selectByPrimaryKey(Long oid_) {
        return selectOne(c ->
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: pg_create_schema_statement")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, pgCreateSchemaStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: pg_create_schema_statement")
    static UpdateDSL<UpdateModel> updateAllColumns(PgCreateSchemaStatement record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalTo(record::getOid)
                .set(isAuthorization).equalTo(record::getIsAuthorization)
                .set(isIfNotExists).equalTo(record::getIsIfNotExists)
                .set(schemaNameOid).equalTo(record::getSchemaNameOid)
                .set(userNameOid).equalTo(record::getUserNameOid);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: pg_create_schema_statement")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(PgCreateSchemaStatement record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalToWhenPresent(record::getOid)
                .set(isAuthorization).equalToWhenPresent(record::getIsAuthorization)
                .set(isIfNotExists).equalToWhenPresent(record::getIsIfNotExists)
                .set(schemaNameOid).equalToWhenPresent(record::getSchemaNameOid)
                .set(userNameOid).equalToWhenPresent(record::getUserNameOid);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: pg_create_schema_statement")
    default int updateByPrimaryKey(PgCreateSchemaStatement record) {
        return update(c ->
            c.set(isAuthorization).equalTo(record::getIsAuthorization)
            .set(isIfNotExists).equalTo(record::getIsIfNotExists)
            .set(schemaNameOid).equalTo(record::getSchemaNameOid)
            .set(userNameOid).equalTo(record::getUserNameOid)
            .where(oid, isEqualTo(record::getOid))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: pg_create_schema_statement")
    default int updateByPrimaryKeySelective(PgCreateSchemaStatement record) {
        return update(c ->
            c.set(isAuthorization).equalToWhenPresent(record::getIsAuthorization)
            .set(isIfNotExists).equalToWhenPresent(record::getIsIfNotExists)
            .set(schemaNameOid).equalToWhenPresent(record::getSchemaNameOid)
            .set(userNameOid).equalToWhenPresent(record::getUserNameOid)
            .where(oid, isEqualTo(record::getOid))
        );
    }
}