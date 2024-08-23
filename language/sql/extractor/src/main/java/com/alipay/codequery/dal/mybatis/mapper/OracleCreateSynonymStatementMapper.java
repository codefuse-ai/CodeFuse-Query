package com.alipay.codequery.dal.mybatis.mapper;

import static com.alipay.codequery.dal.mybatis.mapper.OracleCreateSynonymStatementDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.alipay.codequery.dal.mybatis.domain.OracleCreateSynonymStatement;
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
public interface OracleCreateSynonymStatementMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_create_synonym_statement")
    BasicColumn[] selectList = BasicColumn.columnList(oid, isOrReplace, isPublic, nameOid, objectOid);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_create_synonym_statement")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_create_synonym_statement")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_create_synonym_statement")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<OracleCreateSynonymStatement> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_create_synonym_statement")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<OracleCreateSynonymStatement> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_create_synonym_statement")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="is_or_replace", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_public", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="name_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="object_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT)
    })
    Optional<OracleCreateSynonymStatement> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_create_synonym_statement")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="is_or_replace", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_public", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="name_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="object_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT)
    })
    List<OracleCreateSynonymStatement> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_create_synonym_statement")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_create_synonym_statement")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, oracleCreateSynonymStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_create_synonym_statement")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, oracleCreateSynonymStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_create_synonym_statement")
    default int deleteByPrimaryKey(Long oid_) {
        return delete(c -> 
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_create_synonym_statement")
    default int insert(OracleCreateSynonymStatement record) {
        return MyBatis3Utils.insert(this::insert, record, oracleCreateSynonymStatement, c ->
            c.map(oid).toProperty("oid")
            .map(isOrReplace).toProperty("isOrReplace")
            .map(isPublic).toProperty("isPublic")
            .map(nameOid).toProperty("nameOid")
            .map(objectOid).toProperty("objectOid")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_create_synonym_statement")
    default int insertMultiple(Collection<OracleCreateSynonymStatement> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, oracleCreateSynonymStatement, c ->
            c.map(oid).toProperty("oid")
            .map(isOrReplace).toProperty("isOrReplace")
            .map(isPublic).toProperty("isPublic")
            .map(nameOid).toProperty("nameOid")
            .map(objectOid).toProperty("objectOid")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_create_synonym_statement")
    default int insertSelective(OracleCreateSynonymStatement record) {
        return MyBatis3Utils.insert(this::insert, record, oracleCreateSynonymStatement, c ->
            c.map(oid).toPropertyWhenPresent("oid", record::getOid)
            .map(isOrReplace).toPropertyWhenPresent("isOrReplace", record::getIsOrReplace)
            .map(isPublic).toPropertyWhenPresent("isPublic", record::getIsPublic)
            .map(nameOid).toPropertyWhenPresent("nameOid", record::getNameOid)
            .map(objectOid).toPropertyWhenPresent("objectOid", record::getObjectOid)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_create_synonym_statement")
    default Optional<OracleCreateSynonymStatement> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, oracleCreateSynonymStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_create_synonym_statement")
    default List<OracleCreateSynonymStatement> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, oracleCreateSynonymStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_create_synonym_statement")
    default List<OracleCreateSynonymStatement> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, oracleCreateSynonymStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_create_synonym_statement")
    default Optional<OracleCreateSynonymStatement> selectByPrimaryKey(Long oid_) {
        return selectOne(c ->
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_create_synonym_statement")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, oracleCreateSynonymStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_create_synonym_statement")
    static UpdateDSL<UpdateModel> updateAllColumns(OracleCreateSynonymStatement record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalTo(record::getOid)
                .set(isOrReplace).equalTo(record::getIsOrReplace)
                .set(isPublic).equalTo(record::getIsPublic)
                .set(nameOid).equalTo(record::getNameOid)
                .set(objectOid).equalTo(record::getObjectOid);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_create_synonym_statement")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(OracleCreateSynonymStatement record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalToWhenPresent(record::getOid)
                .set(isOrReplace).equalToWhenPresent(record::getIsOrReplace)
                .set(isPublic).equalToWhenPresent(record::getIsPublic)
                .set(nameOid).equalToWhenPresent(record::getNameOid)
                .set(objectOid).equalToWhenPresent(record::getObjectOid);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_create_synonym_statement")
    default int updateByPrimaryKey(OracleCreateSynonymStatement record) {
        return update(c ->
            c.set(isOrReplace).equalTo(record::getIsOrReplace)
            .set(isPublic).equalTo(record::getIsPublic)
            .set(nameOid).equalTo(record::getNameOid)
            .set(objectOid).equalTo(record::getObjectOid)
            .where(oid, isEqualTo(record::getOid))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_create_synonym_statement")
    default int updateByPrimaryKeySelective(OracleCreateSynonymStatement record) {
        return update(c ->
            c.set(isOrReplace).equalToWhenPresent(record::getIsOrReplace)
            .set(isPublic).equalToWhenPresent(record::getIsPublic)
            .set(nameOid).equalToWhenPresent(record::getNameOid)
            .set(objectOid).equalToWhenPresent(record::getObjectOid)
            .where(oid, isEqualTo(record::getOid))
        );
    }
}