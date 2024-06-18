package com.alipay.codequery.dal.mybatis.mapper;

import static com.alipay.codequery.dal.mybatis.mapper.LocalClassDynamicSqlSupport.*;

import com.alipay.codequery.dal.mybatis.domain.LocalClass;
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
public interface LocalClassMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: local_class")
    BasicColumn[] selectList = BasicColumn.columnList(elementHashId, name, debugMessage, locationHashId, parentHashId);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: local_class")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: local_class")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: local_class")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<LocalClass> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: local_class")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<LocalClass> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: local_class")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="element_hash_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="name", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="debug_message", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="location_hash_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="parent_hash_id", javaType=Long.class, jdbcType=JdbcType.BIGINT)
    })
    Optional<LocalClass> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: local_class")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="element_hash_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="name", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="debug_message", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="location_hash_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="parent_hash_id", javaType=Long.class, jdbcType=JdbcType.BIGINT)
    })
    List<LocalClass> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: local_class")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: local_class")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, localClass, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: local_class")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, localClass, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: local_class")
    default int insert(LocalClass record) {
        return MyBatis3Utils.insert(this::insert, record, localClass, c ->
            c.map(elementHashId).toProperty("elementHashId")
            .map(name).toProperty("name")
            .map(debugMessage).toProperty("debugMessage")
            .map(locationHashId).toProperty("locationHashId")
            .map(parentHashId).toProperty("parentHashId")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: local_class")
    default int insertMultiple(Collection<LocalClass> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, localClass, c ->
            c.map(elementHashId).toProperty("elementHashId")
            .map(name).toProperty("name")
            .map(debugMessage).toProperty("debugMessage")
            .map(locationHashId).toProperty("locationHashId")
            .map(parentHashId).toProperty("parentHashId")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: local_class")
    default int insertSelective(LocalClass record) {
        return MyBatis3Utils.insert(this::insert, record, localClass, c ->
            c.map(elementHashId).toPropertyWhenPresent("elementHashId", record::getElementHashId)
            .map(name).toPropertyWhenPresent("name", record::getName)
            .map(debugMessage).toPropertyWhenPresent("debugMessage", record::getDebugMessage)
            .map(locationHashId).toPropertyWhenPresent("locationHashId", record::getLocationHashId)
            .map(parentHashId).toPropertyWhenPresent("parentHashId", record::getParentHashId)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: local_class")
    default Optional<LocalClass> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, localClass, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: local_class")
    default List<LocalClass> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, localClass, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: local_class")
    default List<LocalClass> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, localClass, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: local_class")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, localClass, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: local_class")
    static UpdateDSL<UpdateModel> updateAllColumns(LocalClass record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(elementHashId).equalTo(record::getElementHashId)
                .set(name).equalTo(record::getName)
                .set(debugMessage).equalTo(record::getDebugMessage)
                .set(locationHashId).equalTo(record::getLocationHashId)
                .set(parentHashId).equalTo(record::getParentHashId);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: local_class")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(LocalClass record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(elementHashId).equalToWhenPresent(record::getElementHashId)
                .set(name).equalToWhenPresent(record::getName)
                .set(debugMessage).equalToWhenPresent(record::getDebugMessage)
                .set(locationHashId).equalToWhenPresent(record::getLocationHashId)
                .set(parentHashId).equalToWhenPresent(record::getParentHashId);
    }
}