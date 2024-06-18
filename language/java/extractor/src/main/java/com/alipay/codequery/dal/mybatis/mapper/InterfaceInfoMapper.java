package com.alipay.codequery.dal.mybatis.mapper;

import static com.alipay.codequery.dal.mybatis.mapper.InterfaceInfoDynamicSqlSupport.*;

import com.alipay.codequery.dal.mybatis.domain.InterfaceInfo;
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
public interface InterfaceInfoMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: interface")
    BasicColumn[] selectList = BasicColumn.columnList(elementHashId, qualifiedName, identifierHashId, locationHashId, parentHashId);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: interface")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: interface")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: interface")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<InterfaceInfo> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: interface")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<InterfaceInfo> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: interface")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="element_hash_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="qualified_name", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="identifier_hash_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="location_hash_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="parent_hash_id", javaType=Long.class, jdbcType=JdbcType.BIGINT)
    })
    Optional<InterfaceInfo> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: interface")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="element_hash_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="qualified_name", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="identifier_hash_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="location_hash_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="parent_hash_id", javaType=Long.class, jdbcType=JdbcType.BIGINT)
    })
    List<InterfaceInfo> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: interface")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: interface")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, interfaceInfo, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: interface")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, interfaceInfo, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: interface")
    default int insert(InterfaceInfo record) {
        return MyBatis3Utils.insert(this::insert, record, interfaceInfo, c ->
            c.map(elementHashId).toProperty("elementHashId")
            .map(qualifiedName).toProperty("qualifiedName")
            .map(identifierHashId).toProperty("identifierHashId")
            .map(locationHashId).toProperty("locationHashId")
            .map(parentHashId).toProperty("parentHashId")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: interface")
    default int insertMultiple(Collection<InterfaceInfo> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, interfaceInfo, c ->
            c.map(elementHashId).toProperty("elementHashId")
            .map(qualifiedName).toProperty("qualifiedName")
            .map(identifierHashId).toProperty("identifierHashId")
            .map(locationHashId).toProperty("locationHashId")
            .map(parentHashId).toProperty("parentHashId")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: interface")
    default int insertSelective(InterfaceInfo record) {
        return MyBatis3Utils.insert(this::insert, record, interfaceInfo, c ->
            c.map(elementHashId).toPropertyWhenPresent("elementHashId", record::getElementHashId)
            .map(qualifiedName).toPropertyWhenPresent("qualifiedName", record::getQualifiedName)
            .map(identifierHashId).toPropertyWhenPresent("identifierHashId", record::getIdentifierHashId)
            .map(locationHashId).toPropertyWhenPresent("locationHashId", record::getLocationHashId)
            .map(parentHashId).toPropertyWhenPresent("parentHashId", record::getParentHashId)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: interface")
    default Optional<InterfaceInfo> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, interfaceInfo, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: interface")
    default List<InterfaceInfo> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, interfaceInfo, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: interface")
    default List<InterfaceInfo> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, interfaceInfo, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: interface")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, interfaceInfo, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: interface")
    static UpdateDSL<UpdateModel> updateAllColumns(InterfaceInfo record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(elementHashId).equalTo(record::getElementHashId)
                .set(qualifiedName).equalTo(record::getQualifiedName)
                .set(identifierHashId).equalTo(record::getIdentifierHashId)
                .set(locationHashId).equalTo(record::getLocationHashId)
                .set(parentHashId).equalTo(record::getParentHashId);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: interface")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(InterfaceInfo record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(elementHashId).equalToWhenPresent(record::getElementHashId)
                .set(qualifiedName).equalToWhenPresent(record::getQualifiedName)
                .set(identifierHashId).equalToWhenPresent(record::getIdentifierHashId)
                .set(locationHashId).equalToWhenPresent(record::getLocationHashId)
                .set(parentHashId).equalToWhenPresent(record::getParentHashId);
    }
}