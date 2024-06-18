package com.alipay.codequery.dal.mybatis.mapper;

import static com.alipay.codequery.dal.mybatis.mapper.AnnotationDeclarationParameterDefaultValueDynamicSqlSupport.*;

import com.alipay.codequery.dal.mybatis.domain.AnnotationDeclarationParameterDefaultValue;
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
public interface AnnotationDeclarationParameterDefaultValueMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: annotation_declaration_parameter_default_value")
    BasicColumn[] selectList = BasicColumn.columnList(elementHashId, defaultValue);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: annotation_declaration_parameter_default_value")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: annotation_declaration_parameter_default_value")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: annotation_declaration_parameter_default_value")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<AnnotationDeclarationParameterDefaultValue> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: annotation_declaration_parameter_default_value")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<AnnotationDeclarationParameterDefaultValue> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: annotation_declaration_parameter_default_value")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="element_hash_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="default_value", javaType=String.class, jdbcType=JdbcType.VARCHAR)
    })
    Optional<AnnotationDeclarationParameterDefaultValue> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: annotation_declaration_parameter_default_value")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="element_hash_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="default_value", javaType=String.class, jdbcType=JdbcType.VARCHAR)
    })
    List<AnnotationDeclarationParameterDefaultValue> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: annotation_declaration_parameter_default_value")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: annotation_declaration_parameter_default_value")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, annotationDeclarationParameterDefaultValue, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: annotation_declaration_parameter_default_value")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, annotationDeclarationParameterDefaultValue, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: annotation_declaration_parameter_default_value")
    default int insert(AnnotationDeclarationParameterDefaultValue record) {
        return MyBatis3Utils.insert(this::insert, record, annotationDeclarationParameterDefaultValue, c ->
            c.map(elementHashId).toProperty("elementHashId")
            .map(defaultValue).toProperty("defaultValue")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: annotation_declaration_parameter_default_value")
    default int insertMultiple(Collection<AnnotationDeclarationParameterDefaultValue> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, annotationDeclarationParameterDefaultValue, c ->
            c.map(elementHashId).toProperty("elementHashId")
            .map(defaultValue).toProperty("defaultValue")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: annotation_declaration_parameter_default_value")
    default int insertSelective(AnnotationDeclarationParameterDefaultValue record) {
        return MyBatis3Utils.insert(this::insert, record, annotationDeclarationParameterDefaultValue, c ->
            c.map(elementHashId).toPropertyWhenPresent("elementHashId", record::getElementHashId)
            .map(defaultValue).toPropertyWhenPresent("defaultValue", record::getDefaultValue)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: annotation_declaration_parameter_default_value")
    default Optional<AnnotationDeclarationParameterDefaultValue> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, annotationDeclarationParameterDefaultValue, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: annotation_declaration_parameter_default_value")
    default List<AnnotationDeclarationParameterDefaultValue> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, annotationDeclarationParameterDefaultValue, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: annotation_declaration_parameter_default_value")
    default List<AnnotationDeclarationParameterDefaultValue> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, annotationDeclarationParameterDefaultValue, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: annotation_declaration_parameter_default_value")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, annotationDeclarationParameterDefaultValue, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: annotation_declaration_parameter_default_value")
    static UpdateDSL<UpdateModel> updateAllColumns(AnnotationDeclarationParameterDefaultValue record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(elementHashId).equalTo(record::getElementHashId)
                .set(defaultValue).equalTo(record::getDefaultValue);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: annotation_declaration_parameter_default_value")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(AnnotationDeclarationParameterDefaultValue record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(elementHashId).equalToWhenPresent(record::getElementHashId)
                .set(defaultValue).equalToWhenPresent(record::getDefaultValue);
    }
}