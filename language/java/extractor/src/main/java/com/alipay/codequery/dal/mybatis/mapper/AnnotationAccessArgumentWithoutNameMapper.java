package com.alipay.codequery.dal.mybatis.mapper;

import static com.alipay.codequery.dal.mybatis.mapper.AnnotationAccessArgumentWithoutNameDynamicSqlSupport.*;

import com.alipay.codequery.dal.mybatis.domain.AnnotationAccessArgumentWithoutName;
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
public interface AnnotationAccessArgumentWithoutNameMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: annotation_access_argument_without_name")
    BasicColumn[] selectList = BasicColumn.columnList(elementHashId, annotationAccessHashId, argumentValueHashId, locationHashId, indexOrder, debugMessage);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: annotation_access_argument_without_name")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: annotation_access_argument_without_name")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: annotation_access_argument_without_name")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<AnnotationAccessArgumentWithoutName> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: annotation_access_argument_without_name")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<AnnotationAccessArgumentWithoutName> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: annotation_access_argument_without_name")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="element_hash_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="annotation_access_hash_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="argument_value_hash_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="location_hash_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="index_order", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="debug_message", javaType=String.class, jdbcType=JdbcType.VARCHAR)
    })
    Optional<AnnotationAccessArgumentWithoutName> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: annotation_access_argument_without_name")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="element_hash_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="annotation_access_hash_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="argument_value_hash_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="location_hash_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="index_order", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="debug_message", javaType=String.class, jdbcType=JdbcType.VARCHAR)
    })
    List<AnnotationAccessArgumentWithoutName> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: annotation_access_argument_without_name")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: annotation_access_argument_without_name")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, annotationAccessArgumentWithoutName, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: annotation_access_argument_without_name")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, annotationAccessArgumentWithoutName, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: annotation_access_argument_without_name")
    default int insert(AnnotationAccessArgumentWithoutName record) {
        return MyBatis3Utils.insert(this::insert, record, annotationAccessArgumentWithoutName, c ->
            c.map(elementHashId).toProperty("elementHashId")
            .map(annotationAccessHashId).toProperty("annotationAccessHashId")
            .map(argumentValueHashId).toProperty("argumentValueHashId")
            .map(locationHashId).toProperty("locationHashId")
            .map(indexOrder).toProperty("indexOrder")
            .map(debugMessage).toProperty("debugMessage")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: annotation_access_argument_without_name")
    default int insertMultiple(Collection<AnnotationAccessArgumentWithoutName> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, annotationAccessArgumentWithoutName, c ->
            c.map(elementHashId).toProperty("elementHashId")
            .map(annotationAccessHashId).toProperty("annotationAccessHashId")
            .map(argumentValueHashId).toProperty("argumentValueHashId")
            .map(locationHashId).toProperty("locationHashId")
            .map(indexOrder).toProperty("indexOrder")
            .map(debugMessage).toProperty("debugMessage")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: annotation_access_argument_without_name")
    default int insertSelective(AnnotationAccessArgumentWithoutName record) {
        return MyBatis3Utils.insert(this::insert, record, annotationAccessArgumentWithoutName, c ->
            c.map(elementHashId).toPropertyWhenPresent("elementHashId", record::getElementHashId)
            .map(annotationAccessHashId).toPropertyWhenPresent("annotationAccessHashId", record::getAnnotationAccessHashId)
            .map(argumentValueHashId).toPropertyWhenPresent("argumentValueHashId", record::getArgumentValueHashId)
            .map(locationHashId).toPropertyWhenPresent("locationHashId", record::getLocationHashId)
            .map(indexOrder).toPropertyWhenPresent("indexOrder", record::getIndexOrder)
            .map(debugMessage).toPropertyWhenPresent("debugMessage", record::getDebugMessage)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: annotation_access_argument_without_name")
    default Optional<AnnotationAccessArgumentWithoutName> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, annotationAccessArgumentWithoutName, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: annotation_access_argument_without_name")
    default List<AnnotationAccessArgumentWithoutName> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, annotationAccessArgumentWithoutName, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: annotation_access_argument_without_name")
    default List<AnnotationAccessArgumentWithoutName> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, annotationAccessArgumentWithoutName, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: annotation_access_argument_without_name")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, annotationAccessArgumentWithoutName, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: annotation_access_argument_without_name")
    static UpdateDSL<UpdateModel> updateAllColumns(AnnotationAccessArgumentWithoutName record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(elementHashId).equalTo(record::getElementHashId)
                .set(annotationAccessHashId).equalTo(record::getAnnotationAccessHashId)
                .set(argumentValueHashId).equalTo(record::getArgumentValueHashId)
                .set(locationHashId).equalTo(record::getLocationHashId)
                .set(indexOrder).equalTo(record::getIndexOrder)
                .set(debugMessage).equalTo(record::getDebugMessage);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: annotation_access_argument_without_name")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(AnnotationAccessArgumentWithoutName record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(elementHashId).equalToWhenPresent(record::getElementHashId)
                .set(annotationAccessHashId).equalToWhenPresent(record::getAnnotationAccessHashId)
                .set(argumentValueHashId).equalToWhenPresent(record::getArgumentValueHashId)
                .set(locationHashId).equalToWhenPresent(record::getLocationHashId)
                .set(indexOrder).equalToWhenPresent(record::getIndexOrder)
                .set(debugMessage).equalToWhenPresent(record::getDebugMessage);
    }
}