package com.alipay.codequery.dal.mybatis.mapper;

import static com.alipay.codequery.dal.mybatis.mapper.NpClassDynamicSqlSupport.*;

import com.alipay.codequery.dal.mybatis.domain.NpClass;
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
public interface NpClassMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: np_class")
    BasicColumn[] selectList = BasicColumn.columnList(elementHashId, name, qualifiedName, parentHashId);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: np_class")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: np_class")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: np_class")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<NpClass> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: np_class")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<NpClass> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: np_class")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="element_hash_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="name", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="qualified_name", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="parent_hash_id", javaType=Long.class, jdbcType=JdbcType.BIGINT)
    })
    Optional<NpClass> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: np_class")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="element_hash_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="name", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="qualified_name", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="parent_hash_id", javaType=Long.class, jdbcType=JdbcType.BIGINT)
    })
    List<NpClass> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: np_class")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: np_class")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, npClass, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: np_class")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, npClass, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: np_class")
    default int insert(NpClass record) {
        return MyBatis3Utils.insert(this::insert, record, npClass, c ->
            c.map(elementHashId).toProperty("elementHashId")
            .map(name).toProperty("name")
            .map(qualifiedName).toProperty("qualifiedName")
            .map(parentHashId).toProperty("parentHashId")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: np_class")
    default int insertMultiple(Collection<NpClass> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, npClass, c ->
            c.map(elementHashId).toProperty("elementHashId")
            .map(name).toProperty("name")
            .map(qualifiedName).toProperty("qualifiedName")
            .map(parentHashId).toProperty("parentHashId")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: np_class")
    default int insertSelective(NpClass record) {
        return MyBatis3Utils.insert(this::insert, record, npClass, c ->
            c.map(elementHashId).toPropertyWhenPresent("elementHashId", record::getElementHashId)
            .map(name).toPropertyWhenPresent("name", record::getName)
            .map(qualifiedName).toPropertyWhenPresent("qualifiedName", record::getQualifiedName)
            .map(parentHashId).toPropertyWhenPresent("parentHashId", record::getParentHashId)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: np_class")
    default Optional<NpClass> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, npClass, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: np_class")
    default List<NpClass> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, npClass, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: np_class")
    default List<NpClass> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, npClass, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: np_class")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, npClass, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: np_class")
    static UpdateDSL<UpdateModel> updateAllColumns(NpClass record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(elementHashId).equalTo(record::getElementHashId)
                .set(name).equalTo(record::getName)
                .set(qualifiedName).equalTo(record::getQualifiedName)
                .set(parentHashId).equalTo(record::getParentHashId);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: np_class")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(NpClass record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(elementHashId).equalToWhenPresent(record::getElementHashId)
                .set(name).equalToWhenPresent(record::getName)
                .set(qualifiedName).equalToWhenPresent(record::getQualifiedName)
                .set(parentHashId).equalToWhenPresent(record::getParentHashId);
    }
}