package com.alipay.codequery.dal.mybatis.mapper;

import static com.alipay.codequery.dal.mybatis.mapper.MethodDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.alipay.codequery.dal.mybatis.domain.Method;
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
public interface MethodMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: method")
    BasicColumn[] selectList = BasicColumn.columnList(elementHashId, name, signature, typeHashId, parentHashId, locationHashId, definitionBody);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: method")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: method")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: method")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<Method> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: method")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<Method> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: method")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="element_hash_id", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="name", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="signature", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="type_hash_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="parent_hash_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="location_hash_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="definition_body", javaType=String.class, jdbcType=JdbcType.VARCHAR)
    })
    Optional<Method> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: method")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="element_hash_id", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="name", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="signature", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="type_hash_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="parent_hash_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="location_hash_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="definition_body", javaType=String.class, jdbcType=JdbcType.VARCHAR)
    })
    List<Method> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: method")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: method")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, method, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: method")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, method, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: method")
    default int deleteByPrimaryKey(Long elementHashId_) {
        return delete(c -> 
            c.where(elementHashId, isEqualTo(elementHashId_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: method")
    default int insert(Method record) {
        return MyBatis3Utils.insert(this::insert, record, method, c ->
            c.map(elementHashId).toProperty("elementHashId")
            .map(name).toProperty("name")
            .map(signature).toProperty("signature")
            .map(typeHashId).toProperty("typeHashId")
            .map(parentHashId).toProperty("parentHashId")
            .map(locationHashId).toProperty("locationHashId")
            .map(definitionBody).toProperty("definitionBody")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: method")
    default int insertMultiple(Collection<Method> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, method, c ->
            c.map(elementHashId).toProperty("elementHashId")
            .map(name).toProperty("name")
            .map(signature).toProperty("signature")
            .map(typeHashId).toProperty("typeHashId")
            .map(parentHashId).toProperty("parentHashId")
            .map(locationHashId).toProperty("locationHashId")
            .map(definitionBody).toProperty("definitionBody")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: method")
    default int insertSelective(Method record) {
        return MyBatis3Utils.insert(this::insert, record, method, c ->
            c.map(elementHashId).toPropertyWhenPresent("elementHashId", record::getElementHashId)
            .map(name).toPropertyWhenPresent("name", record::getName)
            .map(signature).toPropertyWhenPresent("signature", record::getSignature)
            .map(typeHashId).toPropertyWhenPresent("typeHashId", record::getTypeHashId)
            .map(parentHashId).toPropertyWhenPresent("parentHashId", record::getParentHashId)
            .map(locationHashId).toPropertyWhenPresent("locationHashId", record::getLocationHashId)
            .map(definitionBody).toPropertyWhenPresent("definitionBody", record::getDefinitionBody)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: method")
    default Optional<Method> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, method, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: method")
    default List<Method> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, method, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: method")
    default List<Method> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, method, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: method")
    default Optional<Method> selectByPrimaryKey(Long elementHashId_) {
        return selectOne(c ->
            c.where(elementHashId, isEqualTo(elementHashId_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: method")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, method, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: method")
    static UpdateDSL<UpdateModel> updateAllColumns(Method record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(elementHashId).equalTo(record::getElementHashId)
                .set(name).equalTo(record::getName)
                .set(signature).equalTo(record::getSignature)
                .set(typeHashId).equalTo(record::getTypeHashId)
                .set(parentHashId).equalTo(record::getParentHashId)
                .set(locationHashId).equalTo(record::getLocationHashId)
                .set(definitionBody).equalTo(record::getDefinitionBody);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: method")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(Method record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(elementHashId).equalToWhenPresent(record::getElementHashId)
                .set(name).equalToWhenPresent(record::getName)
                .set(signature).equalToWhenPresent(record::getSignature)
                .set(typeHashId).equalToWhenPresent(record::getTypeHashId)
                .set(parentHashId).equalToWhenPresent(record::getParentHashId)
                .set(locationHashId).equalToWhenPresent(record::getLocationHashId)
                .set(definitionBody).equalToWhenPresent(record::getDefinitionBody);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: method")
    default int updateByPrimaryKey(Method record) {
        return update(c ->
            c.set(name).equalTo(record::getName)
            .set(signature).equalTo(record::getSignature)
            .set(typeHashId).equalTo(record::getTypeHashId)
            .set(parentHashId).equalTo(record::getParentHashId)
            .set(locationHashId).equalTo(record::getLocationHashId)
            .set(definitionBody).equalTo(record::getDefinitionBody)
            .where(elementHashId, isEqualTo(record::getElementHashId))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: method")
    default int updateByPrimaryKeySelective(Method record) {
        return update(c ->
            c.set(name).equalToWhenPresent(record::getName)
            .set(signature).equalToWhenPresent(record::getSignature)
            .set(typeHashId).equalToWhenPresent(record::getTypeHashId)
            .set(parentHashId).equalToWhenPresent(record::getParentHashId)
            .set(locationHashId).equalToWhenPresent(record::getLocationHashId)
            .set(definitionBody).equalToWhenPresent(record::getDefinitionBody)
            .where(elementHashId, isEqualTo(record::getElementHashId))
        );
    }
}