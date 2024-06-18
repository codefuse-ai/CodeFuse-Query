package com.alipay.codequery.dal.mybatis.mapper;

import static com.alipay.codequery.dal.mybatis.mapper.EnumConstantDynamicSqlSupport.*;

import com.alipay.codequery.dal.mybatis.domain.EnumConstant;
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
public interface EnumConstantMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: enum_constant")
    BasicColumn[] selectList = BasicColumn.columnList(elementHashId, name, parentHashId, locationHashId, debugMessage);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: enum_constant")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: enum_constant")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: enum_constant")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<EnumConstant> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: enum_constant")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<EnumConstant> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: enum_constant")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="element_hash_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="name", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="parent_hash_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="location_hash_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="debug_message", javaType=String.class, jdbcType=JdbcType.VARCHAR)
    })
    Optional<EnumConstant> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: enum_constant")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="element_hash_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="name", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="parent_hash_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="location_hash_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="debug_message", javaType=String.class, jdbcType=JdbcType.VARCHAR)
    })
    List<EnumConstant> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: enum_constant")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: enum_constant")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, enumConstant, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: enum_constant")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, enumConstant, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: enum_constant")
    default int insert(EnumConstant record) {
        return MyBatis3Utils.insert(this::insert, record, enumConstant, c ->
            c.map(elementHashId).toProperty("elementHashId")
            .map(name).toProperty("name")
            .map(parentHashId).toProperty("parentHashId")
            .map(locationHashId).toProperty("locationHashId")
            .map(debugMessage).toProperty("debugMessage")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: enum_constant")
    default int insertMultiple(Collection<EnumConstant> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, enumConstant, c ->
            c.map(elementHashId).toProperty("elementHashId")
            .map(name).toProperty("name")
            .map(parentHashId).toProperty("parentHashId")
            .map(locationHashId).toProperty("locationHashId")
            .map(debugMessage).toProperty("debugMessage")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: enum_constant")
    default int insertSelective(EnumConstant record) {
        return MyBatis3Utils.insert(this::insert, record, enumConstant, c ->
            c.map(elementHashId).toPropertyWhenPresent("elementHashId", record::getElementHashId)
            .map(name).toPropertyWhenPresent("name", record::getName)
            .map(parentHashId).toPropertyWhenPresent("parentHashId", record::getParentHashId)
            .map(locationHashId).toPropertyWhenPresent("locationHashId", record::getLocationHashId)
            .map(debugMessage).toPropertyWhenPresent("debugMessage", record::getDebugMessage)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: enum_constant")
    default Optional<EnumConstant> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, enumConstant, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: enum_constant")
    default List<EnumConstant> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, enumConstant, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: enum_constant")
    default List<EnumConstant> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, enumConstant, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: enum_constant")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, enumConstant, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: enum_constant")
    static UpdateDSL<UpdateModel> updateAllColumns(EnumConstant record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(elementHashId).equalTo(record::getElementHashId)
                .set(name).equalTo(record::getName)
                .set(parentHashId).equalTo(record::getParentHashId)
                .set(locationHashId).equalTo(record::getLocationHashId)
                .set(debugMessage).equalTo(record::getDebugMessage);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: enum_constant")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(EnumConstant record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(elementHashId).equalToWhenPresent(record::getElementHashId)
                .set(name).equalToWhenPresent(record::getName)
                .set(parentHashId).equalToWhenPresent(record::getParentHashId)
                .set(locationHashId).equalToWhenPresent(record::getLocationHashId)
                .set(debugMessage).equalToWhenPresent(record::getDebugMessage);
    }
}