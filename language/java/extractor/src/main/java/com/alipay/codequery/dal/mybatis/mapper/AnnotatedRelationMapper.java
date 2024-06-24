package com.alipay.codequery.dal.mybatis.mapper;

import static com.alipay.codequery.dal.mybatis.mapper.AnnotatedRelationDynamicSqlSupport.*;

import com.alipay.codequery.dal.mybatis.domain.AnnotatedRelation;
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
public interface AnnotatedRelationMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: annotated_relation")
    BasicColumn[] selectList = BasicColumn.columnList(annotationHashId, annotatedItemHashId);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: annotated_relation")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: annotated_relation")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: annotated_relation")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<AnnotatedRelation> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: annotated_relation")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<AnnotatedRelation> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: annotated_relation")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="annotation_hash_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="annotated_item_hash_id", javaType=Long.class, jdbcType=JdbcType.BIGINT)
    })
    Optional<AnnotatedRelation> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: annotated_relation")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="annotation_hash_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="annotated_item_hash_id", javaType=Long.class, jdbcType=JdbcType.BIGINT)
    })
    List<AnnotatedRelation> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: annotated_relation")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: annotated_relation")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, annotatedRelation, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: annotated_relation")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, annotatedRelation, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: annotated_relation")
    default int insert(AnnotatedRelation record) {
        return MyBatis3Utils.insert(this::insert, record, annotatedRelation, c ->
            c.map(annotationHashId).toProperty("annotationHashId")
            .map(annotatedItemHashId).toProperty("annotatedItemHashId")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: annotated_relation")
    default int insertMultiple(Collection<AnnotatedRelation> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, annotatedRelation, c ->
            c.map(annotationHashId).toProperty("annotationHashId")
            .map(annotatedItemHashId).toProperty("annotatedItemHashId")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: annotated_relation")
    default int insertSelective(AnnotatedRelation record) {
        return MyBatis3Utils.insert(this::insert, record, annotatedRelation, c ->
            c.map(annotationHashId).toPropertyWhenPresent("annotationHashId", record::getAnnotationHashId)
            .map(annotatedItemHashId).toPropertyWhenPresent("annotatedItemHashId", record::getAnnotatedItemHashId)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: annotated_relation")
    default Optional<AnnotatedRelation> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, annotatedRelation, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: annotated_relation")
    default List<AnnotatedRelation> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, annotatedRelation, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: annotated_relation")
    default List<AnnotatedRelation> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, annotatedRelation, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: annotated_relation")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, annotatedRelation, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: annotated_relation")
    static UpdateDSL<UpdateModel> updateAllColumns(AnnotatedRelation record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(annotationHashId).equalTo(record::getAnnotationHashId)
                .set(annotatedItemHashId).equalTo(record::getAnnotatedItemHashId);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: annotated_relation")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(AnnotatedRelation record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(annotationHashId).equalToWhenPresent(record::getAnnotationHashId)
                .set(annotatedItemHashId).equalToWhenPresent(record::getAnnotatedItemHashId);
    }
}