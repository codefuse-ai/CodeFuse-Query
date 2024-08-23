package com.alipay.codequery.dal.mybatis.mapper;

import static com.alipay.codequery.dal.mybatis.mapper.PgDropSchemaStatementDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.alipay.codequery.dal.mybatis.domain.PgDropSchemaStatement;
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
public interface PgDropSchemaStatementMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: pg_drop_schema_statement")
    BasicColumn[] selectList = BasicColumn.columnList(oid, isCascade, isIfExists, isRestrict, schemaNameOid);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: pg_drop_schema_statement")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: pg_drop_schema_statement")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: pg_drop_schema_statement")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<PgDropSchemaStatement> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: pg_drop_schema_statement")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<PgDropSchemaStatement> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: pg_drop_schema_statement")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="is_cascade", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_if_exists", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_restrict", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="schema_name_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT)
    })
    Optional<PgDropSchemaStatement> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: pg_drop_schema_statement")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="is_cascade", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_if_exists", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_restrict", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="schema_name_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT)
    })
    List<PgDropSchemaStatement> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: pg_drop_schema_statement")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: pg_drop_schema_statement")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, pgDropSchemaStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: pg_drop_schema_statement")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, pgDropSchemaStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: pg_drop_schema_statement")
    default int deleteByPrimaryKey(Long oid_) {
        return delete(c -> 
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: pg_drop_schema_statement")
    default int insert(PgDropSchemaStatement record) {
        return MyBatis3Utils.insert(this::insert, record, pgDropSchemaStatement, c ->
            c.map(oid).toProperty("oid")
            .map(isCascade).toProperty("isCascade")
            .map(isIfExists).toProperty("isIfExists")
            .map(isRestrict).toProperty("isRestrict")
            .map(schemaNameOid).toProperty("schemaNameOid")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: pg_drop_schema_statement")
    default int insertMultiple(Collection<PgDropSchemaStatement> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, pgDropSchemaStatement, c ->
            c.map(oid).toProperty("oid")
            .map(isCascade).toProperty("isCascade")
            .map(isIfExists).toProperty("isIfExists")
            .map(isRestrict).toProperty("isRestrict")
            .map(schemaNameOid).toProperty("schemaNameOid")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: pg_drop_schema_statement")
    default int insertSelective(PgDropSchemaStatement record) {
        return MyBatis3Utils.insert(this::insert, record, pgDropSchemaStatement, c ->
            c.map(oid).toPropertyWhenPresent("oid", record::getOid)
            .map(isCascade).toPropertyWhenPresent("isCascade", record::getIsCascade)
            .map(isIfExists).toPropertyWhenPresent("isIfExists", record::getIsIfExists)
            .map(isRestrict).toPropertyWhenPresent("isRestrict", record::getIsRestrict)
            .map(schemaNameOid).toPropertyWhenPresent("schemaNameOid", record::getSchemaNameOid)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: pg_drop_schema_statement")
    default Optional<PgDropSchemaStatement> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, pgDropSchemaStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: pg_drop_schema_statement")
    default List<PgDropSchemaStatement> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, pgDropSchemaStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: pg_drop_schema_statement")
    default List<PgDropSchemaStatement> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, pgDropSchemaStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: pg_drop_schema_statement")
    default Optional<PgDropSchemaStatement> selectByPrimaryKey(Long oid_) {
        return selectOne(c ->
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: pg_drop_schema_statement")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, pgDropSchemaStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: pg_drop_schema_statement")
    static UpdateDSL<UpdateModel> updateAllColumns(PgDropSchemaStatement record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalTo(record::getOid)
                .set(isCascade).equalTo(record::getIsCascade)
                .set(isIfExists).equalTo(record::getIsIfExists)
                .set(isRestrict).equalTo(record::getIsRestrict)
                .set(schemaNameOid).equalTo(record::getSchemaNameOid);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: pg_drop_schema_statement")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(PgDropSchemaStatement record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalToWhenPresent(record::getOid)
                .set(isCascade).equalToWhenPresent(record::getIsCascade)
                .set(isIfExists).equalToWhenPresent(record::getIsIfExists)
                .set(isRestrict).equalToWhenPresent(record::getIsRestrict)
                .set(schemaNameOid).equalToWhenPresent(record::getSchemaNameOid);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: pg_drop_schema_statement")
    default int updateByPrimaryKey(PgDropSchemaStatement record) {
        return update(c ->
            c.set(isCascade).equalTo(record::getIsCascade)
            .set(isIfExists).equalTo(record::getIsIfExists)
            .set(isRestrict).equalTo(record::getIsRestrict)
            .set(schemaNameOid).equalTo(record::getSchemaNameOid)
            .where(oid, isEqualTo(record::getOid))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: pg_drop_schema_statement")
    default int updateByPrimaryKeySelective(PgDropSchemaStatement record) {
        return update(c ->
            c.set(isCascade).equalToWhenPresent(record::getIsCascade)
            .set(isIfExists).equalToWhenPresent(record::getIsIfExists)
            .set(isRestrict).equalToWhenPresent(record::getIsRestrict)
            .set(schemaNameOid).equalToWhenPresent(record::getSchemaNameOid)
            .where(oid, isEqualTo(record::getOid))
        );
    }
}