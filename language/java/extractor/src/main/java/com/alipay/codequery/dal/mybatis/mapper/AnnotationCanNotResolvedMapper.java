package com.alipay.codequery.dal.mybatis.mapper;

import static com.alipay.codequery.dal.mybatis.mapper.AnnotationCanNotResolvedDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.alipay.codequery.dal.mybatis.domain.AnnotationCanNotResolved;
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
public interface AnnotationCanNotResolvedMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: annotation_can_not_resolved")
    BasicColumn[] selectList = BasicColumn.columnList(elementHashId, name, locationHashId, debugMessage, parentHashId);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: annotation_can_not_resolved")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: annotation_can_not_resolved")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: annotation_can_not_resolved")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<AnnotationCanNotResolved> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: annotation_can_not_resolved")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<AnnotationCanNotResolved> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: annotation_can_not_resolved")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="element_hash_id", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="name", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="location_hash_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="debug_message", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="parent_hash_id", javaType=Long.class, jdbcType=JdbcType.BIGINT)
    })
    Optional<AnnotationCanNotResolved> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: annotation_can_not_resolved")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="element_hash_id", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="name", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="location_hash_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="debug_message", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="parent_hash_id", javaType=Long.class, jdbcType=JdbcType.BIGINT)
    })
    List<AnnotationCanNotResolved> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: annotation_can_not_resolved")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: annotation_can_not_resolved")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, annotationCanNotResolved, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: annotation_can_not_resolved")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, annotationCanNotResolved, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: annotation_can_not_resolved")
    default int deleteByPrimaryKey(Long elementHashId_) {
        return delete(c -> 
            c.where(elementHashId, isEqualTo(elementHashId_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: annotation_can_not_resolved")
    default int insert(AnnotationCanNotResolved record) {
        return MyBatis3Utils.insert(this::insert, record, annotationCanNotResolved, c ->
            c.map(elementHashId).toProperty("elementHashId")
            .map(name).toProperty("name")
            .map(locationHashId).toProperty("locationHashId")
            .map(debugMessage).toProperty("debugMessage")
            .map(parentHashId).toProperty("parentHashId")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: annotation_can_not_resolved")
    default int insertMultiple(Collection<AnnotationCanNotResolved> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, annotationCanNotResolved, c ->
            c.map(elementHashId).toProperty("elementHashId")
            .map(name).toProperty("name")
            .map(locationHashId).toProperty("locationHashId")
            .map(debugMessage).toProperty("debugMessage")
            .map(parentHashId).toProperty("parentHashId")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: annotation_can_not_resolved")
    default int insertSelective(AnnotationCanNotResolved record) {
        return MyBatis3Utils.insert(this::insert, record, annotationCanNotResolved, c ->
            c.map(elementHashId).toPropertyWhenPresent("elementHashId", record::getElementHashId)
            .map(name).toPropertyWhenPresent("name", record::getName)
            .map(locationHashId).toPropertyWhenPresent("locationHashId", record::getLocationHashId)
            .map(debugMessage).toPropertyWhenPresent("debugMessage", record::getDebugMessage)
            .map(parentHashId).toPropertyWhenPresent("parentHashId", record::getParentHashId)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: annotation_can_not_resolved")
    default Optional<AnnotationCanNotResolved> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, annotationCanNotResolved, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: annotation_can_not_resolved")
    default List<AnnotationCanNotResolved> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, annotationCanNotResolved, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: annotation_can_not_resolved")
    default List<AnnotationCanNotResolved> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, annotationCanNotResolved, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: annotation_can_not_resolved")
    default Optional<AnnotationCanNotResolved> selectByPrimaryKey(Long elementHashId_) {
        return selectOne(c ->
            c.where(elementHashId, isEqualTo(elementHashId_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: annotation_can_not_resolved")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, annotationCanNotResolved, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: annotation_can_not_resolved")
    static UpdateDSL<UpdateModel> updateAllColumns(AnnotationCanNotResolved record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(elementHashId).equalTo(record::getElementHashId)
                .set(name).equalTo(record::getName)
                .set(locationHashId).equalTo(record::getLocationHashId)
                .set(debugMessage).equalTo(record::getDebugMessage)
                .set(parentHashId).equalTo(record::getParentHashId);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: annotation_can_not_resolved")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(AnnotationCanNotResolved record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(elementHashId).equalToWhenPresent(record::getElementHashId)
                .set(name).equalToWhenPresent(record::getName)
                .set(locationHashId).equalToWhenPresent(record::getLocationHashId)
                .set(debugMessage).equalToWhenPresent(record::getDebugMessage)
                .set(parentHashId).equalToWhenPresent(record::getParentHashId);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: annotation_can_not_resolved")
    default int updateByPrimaryKey(AnnotationCanNotResolved record) {
        return update(c ->
            c.set(name).equalTo(record::getName)
            .set(locationHashId).equalTo(record::getLocationHashId)
            .set(debugMessage).equalTo(record::getDebugMessage)
            .set(parentHashId).equalTo(record::getParentHashId)
            .where(elementHashId, isEqualTo(record::getElementHashId))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: annotation_can_not_resolved")
    default int updateByPrimaryKeySelective(AnnotationCanNotResolved record) {
        return update(c ->
            c.set(name).equalToWhenPresent(record::getName)
            .set(locationHashId).equalToWhenPresent(record::getLocationHashId)
            .set(debugMessage).equalToWhenPresent(record::getDebugMessage)
            .set(parentHashId).equalToWhenPresent(record::getParentHashId)
            .where(elementHashId, isEqualTo(record::getElementHashId))
        );
    }
}