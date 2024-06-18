package com.alipay.codequery.dal.mybatis.mapper;

import static com.alipay.codequery.dal.mybatis.mapper.TypeParameterDynamicSqlSupport.*;

import com.alipay.codequery.dal.mybatis.domain.TypeParameter;
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
public interface TypeParameterMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: type_parameter")
    BasicColumn[] selectList = BasicColumn.columnList(elementHashId, debugMessage, ownerHashId, indexOrder, extendsListHashId, parentHashId, locationHashId);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: type_parameter")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: type_parameter")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: type_parameter")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<TypeParameter> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: type_parameter")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<TypeParameter> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: type_parameter")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="element_hash_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="debug_message", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="owner_hash_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="index_order", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="extends_list_hash_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="parent_hash_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="location_hash_id", javaType=Long.class, jdbcType=JdbcType.BIGINT)
    })
    Optional<TypeParameter> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: type_parameter")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="element_hash_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="debug_message", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="owner_hash_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="index_order", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="extends_list_hash_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="parent_hash_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="location_hash_id", javaType=Long.class, jdbcType=JdbcType.BIGINT)
    })
    List<TypeParameter> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: type_parameter")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: type_parameter")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, typeParameter, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: type_parameter")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, typeParameter, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: type_parameter")
    default int insert(TypeParameter record) {
        return MyBatis3Utils.insert(this::insert, record, typeParameter, c ->
            c.map(elementHashId).toProperty("elementHashId")
            .map(debugMessage).toProperty("debugMessage")
            .map(ownerHashId).toProperty("ownerHashId")
            .map(indexOrder).toProperty("indexOrder")
            .map(extendsListHashId).toProperty("extendsListHashId")
            .map(parentHashId).toProperty("parentHashId")
            .map(locationHashId).toProperty("locationHashId")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: type_parameter")
    default int insertMultiple(Collection<TypeParameter> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, typeParameter, c ->
            c.map(elementHashId).toProperty("elementHashId")
            .map(debugMessage).toProperty("debugMessage")
            .map(ownerHashId).toProperty("ownerHashId")
            .map(indexOrder).toProperty("indexOrder")
            .map(extendsListHashId).toProperty("extendsListHashId")
            .map(parentHashId).toProperty("parentHashId")
            .map(locationHashId).toProperty("locationHashId")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: type_parameter")
    default int insertSelective(TypeParameter record) {
        return MyBatis3Utils.insert(this::insert, record, typeParameter, c ->
            c.map(elementHashId).toPropertyWhenPresent("elementHashId", record::getElementHashId)
            .map(debugMessage).toPropertyWhenPresent("debugMessage", record::getDebugMessage)
            .map(ownerHashId).toPropertyWhenPresent("ownerHashId", record::getOwnerHashId)
            .map(indexOrder).toPropertyWhenPresent("indexOrder", record::getIndexOrder)
            .map(extendsListHashId).toPropertyWhenPresent("extendsListHashId", record::getExtendsListHashId)
            .map(parentHashId).toPropertyWhenPresent("parentHashId", record::getParentHashId)
            .map(locationHashId).toPropertyWhenPresent("locationHashId", record::getLocationHashId)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: type_parameter")
    default Optional<TypeParameter> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, typeParameter, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: type_parameter")
    default List<TypeParameter> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, typeParameter, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: type_parameter")
    default List<TypeParameter> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, typeParameter, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: type_parameter")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, typeParameter, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: type_parameter")
    static UpdateDSL<UpdateModel> updateAllColumns(TypeParameter record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(elementHashId).equalTo(record::getElementHashId)
                .set(debugMessage).equalTo(record::getDebugMessage)
                .set(ownerHashId).equalTo(record::getOwnerHashId)
                .set(indexOrder).equalTo(record::getIndexOrder)
                .set(extendsListHashId).equalTo(record::getExtendsListHashId)
                .set(parentHashId).equalTo(record::getParentHashId)
                .set(locationHashId).equalTo(record::getLocationHashId);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: type_parameter")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(TypeParameter record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(elementHashId).equalToWhenPresent(record::getElementHashId)
                .set(debugMessage).equalToWhenPresent(record::getDebugMessage)
                .set(ownerHashId).equalToWhenPresent(record::getOwnerHashId)
                .set(indexOrder).equalToWhenPresent(record::getIndexOrder)
                .set(extendsListHashId).equalToWhenPresent(record::getExtendsListHashId)
                .set(parentHashId).equalToWhenPresent(record::getParentHashId)
                .set(locationHashId).equalToWhenPresent(record::getLocationHashId);
    }
}