package com.alipay.codequery.dal.mybatis.mapper;

import static com.alipay.codequery.dal.mybatis.mapper.OscarDropSchemaStatementDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.alipay.codequery.dal.mybatis.domain.OscarDropSchemaStatement;
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
public interface OscarDropSchemaStatementMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oscar_drop_schema_statement")
    BasicColumn[] selectList = BasicColumn.columnList(oid, isCascade, isIfExists, isRestrict, schemaNameOid);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oscar_drop_schema_statement")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oscar_drop_schema_statement")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oscar_drop_schema_statement")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<OscarDropSchemaStatement> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oscar_drop_schema_statement")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<OscarDropSchemaStatement> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oscar_drop_schema_statement")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="is_cascade", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_if_exists", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_restrict", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="schema_name_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT)
    })
    Optional<OscarDropSchemaStatement> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oscar_drop_schema_statement")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="is_cascade", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_if_exists", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_restrict", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="schema_name_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT)
    })
    List<OscarDropSchemaStatement> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oscar_drop_schema_statement")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oscar_drop_schema_statement")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, oscarDropSchemaStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oscar_drop_schema_statement")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, oscarDropSchemaStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oscar_drop_schema_statement")
    default int deleteByPrimaryKey(Long oid_) {
        return delete(c -> 
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oscar_drop_schema_statement")
    default int insert(OscarDropSchemaStatement record) {
        return MyBatis3Utils.insert(this::insert, record, oscarDropSchemaStatement, c ->
            c.map(oid).toProperty("oid")
            .map(isCascade).toProperty("isCascade")
            .map(isIfExists).toProperty("isIfExists")
            .map(isRestrict).toProperty("isRestrict")
            .map(schemaNameOid).toProperty("schemaNameOid")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oscar_drop_schema_statement")
    default int insertMultiple(Collection<OscarDropSchemaStatement> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, oscarDropSchemaStatement, c ->
            c.map(oid).toProperty("oid")
            .map(isCascade).toProperty("isCascade")
            .map(isIfExists).toProperty("isIfExists")
            .map(isRestrict).toProperty("isRestrict")
            .map(schemaNameOid).toProperty("schemaNameOid")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oscar_drop_schema_statement")
    default int insertSelective(OscarDropSchemaStatement record) {
        return MyBatis3Utils.insert(this::insert, record, oscarDropSchemaStatement, c ->
            c.map(oid).toPropertyWhenPresent("oid", record::getOid)
            .map(isCascade).toPropertyWhenPresent("isCascade", record::getIsCascade)
            .map(isIfExists).toPropertyWhenPresent("isIfExists", record::getIsIfExists)
            .map(isRestrict).toPropertyWhenPresent("isRestrict", record::getIsRestrict)
            .map(schemaNameOid).toPropertyWhenPresent("schemaNameOid", record::getSchemaNameOid)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oscar_drop_schema_statement")
    default Optional<OscarDropSchemaStatement> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, oscarDropSchemaStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oscar_drop_schema_statement")
    default List<OscarDropSchemaStatement> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, oscarDropSchemaStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oscar_drop_schema_statement")
    default List<OscarDropSchemaStatement> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, oscarDropSchemaStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oscar_drop_schema_statement")
    default Optional<OscarDropSchemaStatement> selectByPrimaryKey(Long oid_) {
        return selectOne(c ->
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oscar_drop_schema_statement")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, oscarDropSchemaStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oscar_drop_schema_statement")
    static UpdateDSL<UpdateModel> updateAllColumns(OscarDropSchemaStatement record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalTo(record::getOid)
                .set(isCascade).equalTo(record::getIsCascade)
                .set(isIfExists).equalTo(record::getIsIfExists)
                .set(isRestrict).equalTo(record::getIsRestrict)
                .set(schemaNameOid).equalTo(record::getSchemaNameOid);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oscar_drop_schema_statement")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(OscarDropSchemaStatement record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalToWhenPresent(record::getOid)
                .set(isCascade).equalToWhenPresent(record::getIsCascade)
                .set(isIfExists).equalToWhenPresent(record::getIsIfExists)
                .set(isRestrict).equalToWhenPresent(record::getIsRestrict)
                .set(schemaNameOid).equalToWhenPresent(record::getSchemaNameOid);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oscar_drop_schema_statement")
    default int updateByPrimaryKey(OscarDropSchemaStatement record) {
        return update(c ->
            c.set(isCascade).equalTo(record::getIsCascade)
            .set(isIfExists).equalTo(record::getIsIfExists)
            .set(isRestrict).equalTo(record::getIsRestrict)
            .set(schemaNameOid).equalTo(record::getSchemaNameOid)
            .where(oid, isEqualTo(record::getOid))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oscar_drop_schema_statement")
    default int updateByPrimaryKeySelective(OscarDropSchemaStatement record) {
        return update(c ->
            c.set(isCascade).equalToWhenPresent(record::getIsCascade)
            .set(isIfExists).equalToWhenPresent(record::getIsIfExists)
            .set(isRestrict).equalToWhenPresent(record::getIsRestrict)
            .set(schemaNameOid).equalToWhenPresent(record::getSchemaNameOid)
            .where(oid, isEqualTo(record::getOid))
        );
    }
}