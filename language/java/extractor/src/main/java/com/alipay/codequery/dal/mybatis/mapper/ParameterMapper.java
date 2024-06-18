package com.alipay.codequery.dal.mybatis.mapper;

import static com.alipay.codequery.dal.mybatis.mapper.ParameterDynamicSqlSupport.*;

import com.alipay.codequery.dal.mybatis.domain.Parameter;
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
public interface ParameterMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: parameter")
    BasicColumn[] selectList = BasicColumn.columnList(elementHashId, name, indexOrder, parentHashId, locationHashId, debugMessage, typeHashId);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: parameter")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: parameter")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: parameter")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<Parameter> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: parameter")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<Parameter> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: parameter")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="element_hash_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="name", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="index_order", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="parent_hash_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="location_hash_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="debug_message", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="type_hash_id", javaType=Long.class, jdbcType=JdbcType.BIGINT)
    })
    Optional<Parameter> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: parameter")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="element_hash_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="name", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="index_order", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="parent_hash_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="location_hash_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="debug_message", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="type_hash_id", javaType=Long.class, jdbcType=JdbcType.BIGINT)
    })
    List<Parameter> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: parameter")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: parameter")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, parameter, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: parameter")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, parameter, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: parameter")
    default int insert(Parameter record) {
        return MyBatis3Utils.insert(this::insert, record, parameter, c ->
            c.map(elementHashId).toProperty("elementHashId")
            .map(name).toProperty("name")
            .map(indexOrder).toProperty("indexOrder")
            .map(parentHashId).toProperty("parentHashId")
            .map(locationHashId).toProperty("locationHashId")
            .map(debugMessage).toProperty("debugMessage")
            .map(typeHashId).toProperty("typeHashId")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: parameter")
    default int insertMultiple(Collection<Parameter> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, parameter, c ->
            c.map(elementHashId).toProperty("elementHashId")
            .map(name).toProperty("name")
            .map(indexOrder).toProperty("indexOrder")
            .map(parentHashId).toProperty("parentHashId")
            .map(locationHashId).toProperty("locationHashId")
            .map(debugMessage).toProperty("debugMessage")
            .map(typeHashId).toProperty("typeHashId")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: parameter")
    default int insertSelective(Parameter record) {
        return MyBatis3Utils.insert(this::insert, record, parameter, c ->
            c.map(elementHashId).toPropertyWhenPresent("elementHashId", record::getElementHashId)
            .map(name).toPropertyWhenPresent("name", record::getName)
            .map(indexOrder).toPropertyWhenPresent("indexOrder", record::getIndexOrder)
            .map(parentHashId).toPropertyWhenPresent("parentHashId", record::getParentHashId)
            .map(locationHashId).toPropertyWhenPresent("locationHashId", record::getLocationHashId)
            .map(debugMessage).toPropertyWhenPresent("debugMessage", record::getDebugMessage)
            .map(typeHashId).toPropertyWhenPresent("typeHashId", record::getTypeHashId)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: parameter")
    default Optional<Parameter> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, parameter, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: parameter")
    default List<Parameter> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, parameter, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: parameter")
    default List<Parameter> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, parameter, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: parameter")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, parameter, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: parameter")
    static UpdateDSL<UpdateModel> updateAllColumns(Parameter record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(elementHashId).equalTo(record::getElementHashId)
                .set(name).equalTo(record::getName)
                .set(indexOrder).equalTo(record::getIndexOrder)
                .set(parentHashId).equalTo(record::getParentHashId)
                .set(locationHashId).equalTo(record::getLocationHashId)
                .set(debugMessage).equalTo(record::getDebugMessage)
                .set(typeHashId).equalTo(record::getTypeHashId);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: parameter")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(Parameter record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(elementHashId).equalToWhenPresent(record::getElementHashId)
                .set(name).equalToWhenPresent(record::getName)
                .set(indexOrder).equalToWhenPresent(record::getIndexOrder)
                .set(parentHashId).equalToWhenPresent(record::getParentHashId)
                .set(locationHashId).equalToWhenPresent(record::getLocationHashId)
                .set(debugMessage).equalToWhenPresent(record::getDebugMessage)
                .set(typeHashId).equalToWhenPresent(record::getTypeHashId);
    }
}