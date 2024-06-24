package com.alipay.codequery.dal.mybatis.mapper;

import static com.alipay.codequery.dal.mybatis.mapper.LambdaExpressionDynamicSqlSupport.*;

import com.alipay.codequery.dal.mybatis.domain.LambdaExpression;
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
public interface LambdaExpressionMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: lambda_expression")
    BasicColumn[] selectList = BasicColumn.columnList(elementHashId, parameterListHashId, bodyHashId, isVoidCompatible, isValueCompatible);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: lambda_expression")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: lambda_expression")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: lambda_expression")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<LambdaExpression> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: lambda_expression")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<LambdaExpression> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: lambda_expression")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="element_hash_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="parameter_list_hash_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="body_hash_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_void_compatible", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="is_value_compatible", javaType=Integer.class, jdbcType=JdbcType.INTEGER)
    })
    Optional<LambdaExpression> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: lambda_expression")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="element_hash_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="parameter_list_hash_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="body_hash_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_void_compatible", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="is_value_compatible", javaType=Integer.class, jdbcType=JdbcType.INTEGER)
    })
    List<LambdaExpression> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: lambda_expression")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: lambda_expression")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, lambdaExpression, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: lambda_expression")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, lambdaExpression, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: lambda_expression")
    default int insert(LambdaExpression record) {
        return MyBatis3Utils.insert(this::insert, record, lambdaExpression, c ->
            c.map(elementHashId).toProperty("elementHashId")
            .map(parameterListHashId).toProperty("parameterListHashId")
            .map(bodyHashId).toProperty("bodyHashId")
            .map(isVoidCompatible).toProperty("isVoidCompatible")
            .map(isValueCompatible).toProperty("isValueCompatible")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: lambda_expression")
    default int insertMultiple(Collection<LambdaExpression> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, lambdaExpression, c ->
            c.map(elementHashId).toProperty("elementHashId")
            .map(parameterListHashId).toProperty("parameterListHashId")
            .map(bodyHashId).toProperty("bodyHashId")
            .map(isVoidCompatible).toProperty("isVoidCompatible")
            .map(isValueCompatible).toProperty("isValueCompatible")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: lambda_expression")
    default int insertSelective(LambdaExpression record) {
        return MyBatis3Utils.insert(this::insert, record, lambdaExpression, c ->
            c.map(elementHashId).toPropertyWhenPresent("elementHashId", record::getElementHashId)
            .map(parameterListHashId).toPropertyWhenPresent("parameterListHashId", record::getParameterListHashId)
            .map(bodyHashId).toPropertyWhenPresent("bodyHashId", record::getBodyHashId)
            .map(isVoidCompatible).toPropertyWhenPresent("isVoidCompatible", record::getIsVoidCompatible)
            .map(isValueCompatible).toPropertyWhenPresent("isValueCompatible", record::getIsValueCompatible)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: lambda_expression")
    default Optional<LambdaExpression> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, lambdaExpression, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: lambda_expression")
    default List<LambdaExpression> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, lambdaExpression, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: lambda_expression")
    default List<LambdaExpression> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, lambdaExpression, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: lambda_expression")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, lambdaExpression, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: lambda_expression")
    static UpdateDSL<UpdateModel> updateAllColumns(LambdaExpression record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(elementHashId).equalTo(record::getElementHashId)
                .set(parameterListHashId).equalTo(record::getParameterListHashId)
                .set(bodyHashId).equalTo(record::getBodyHashId)
                .set(isVoidCompatible).equalTo(record::getIsVoidCompatible)
                .set(isValueCompatible).equalTo(record::getIsValueCompatible);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: lambda_expression")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(LambdaExpression record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(elementHashId).equalToWhenPresent(record::getElementHashId)
                .set(parameterListHashId).equalToWhenPresent(record::getParameterListHashId)
                .set(bodyHashId).equalToWhenPresent(record::getBodyHashId)
                .set(isVoidCompatible).equalToWhenPresent(record::getIsVoidCompatible)
                .set(isValueCompatible).equalToWhenPresent(record::getIsValueCompatible);
    }
}