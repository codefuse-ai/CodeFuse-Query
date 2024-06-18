package com.alipay.codequery.dal.mybatis.mapper;

import static com.alipay.codequery.dal.mybatis.mapper.ElementDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.alipay.codequery.dal.mybatis.domain.Element;
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
public interface ElementMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: element")
    BasicColumn[] selectList = BasicColumn.columnList(elementHashId, type, parentId, parentType);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: element")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: element")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: element")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<Element> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: element")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<Element> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: element")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="element_hash_id", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="type", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="parent_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="parent_type", javaType=String.class, jdbcType=JdbcType.VARCHAR)
    })
    Optional<Element> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: element")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="element_hash_id", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="type", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="parent_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="parent_type", javaType=String.class, jdbcType=JdbcType.VARCHAR)
    })
    List<Element> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: element")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: element")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, element, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: element")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, element, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: element")
    default int deleteByPrimaryKey(Long elementHashId_) {
        return delete(c -> 
            c.where(elementHashId, isEqualTo(elementHashId_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: element")
    default int insert(Element record) {
        return MyBatis3Utils.insert(this::insert, record, element, c ->
            c.map(elementHashId).toProperty("elementHashId")
            .map(type).toProperty("type")
            .map(parentId).toProperty("parentId")
            .map(parentType).toProperty("parentType")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: element")
    default int insertMultiple(Collection<Element> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, element, c ->
            c.map(elementHashId).toProperty("elementHashId")
            .map(type).toProperty("type")
            .map(parentId).toProperty("parentId")
            .map(parentType).toProperty("parentType")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: element")
    default int insertSelective(Element record) {
        return MyBatis3Utils.insert(this::insert, record, element, c ->
            c.map(elementHashId).toPropertyWhenPresent("elementHashId", record::getElementHashId)
            .map(type).toPropertyWhenPresent("type", record::getType)
            .map(parentId).toPropertyWhenPresent("parentId", record::getParentId)
            .map(parentType).toPropertyWhenPresent("parentType", record::getParentType)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: element")
    default Optional<Element> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, element, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: element")
    default List<Element> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, element, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: element")
    default List<Element> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, element, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: element")
    default Optional<Element> selectByPrimaryKey(Long elementHashId_) {
        return selectOne(c ->
            c.where(elementHashId, isEqualTo(elementHashId_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: element")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, element, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: element")
    static UpdateDSL<UpdateModel> updateAllColumns(Element record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(elementHashId).equalTo(record::getElementHashId)
                .set(type).equalTo(record::getType)
                .set(parentId).equalTo(record::getParentId)
                .set(parentType).equalTo(record::getParentType);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: element")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(Element record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(elementHashId).equalToWhenPresent(record::getElementHashId)
                .set(type).equalToWhenPresent(record::getType)
                .set(parentId).equalToWhenPresent(record::getParentId)
                .set(parentType).equalToWhenPresent(record::getParentType);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: element")
    default int updateByPrimaryKey(Element record) {
        return update(c ->
            c.set(type).equalTo(record::getType)
            .set(parentId).equalTo(record::getParentId)
            .set(parentType).equalTo(record::getParentType)
            .where(elementHashId, isEqualTo(record::getElementHashId))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: element")
    default int updateByPrimaryKeySelective(Element record) {
        return update(c ->
            c.set(type).equalToWhenPresent(record::getType)
            .set(parentId).equalToWhenPresent(record::getParentId)
            .set(parentType).equalToWhenPresent(record::getParentType)
            .where(elementHashId, isEqualTo(record::getElementHashId))
        );
    }
}