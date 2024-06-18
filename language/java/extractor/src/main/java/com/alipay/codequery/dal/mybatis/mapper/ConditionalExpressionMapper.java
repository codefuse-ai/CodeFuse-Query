package com.alipay.codequery.dal.mybatis.mapper;

import static com.alipay.codequery.dal.mybatis.mapper.ConditionalExpressionDynamicSqlSupport.*;

import com.alipay.codequery.dal.mybatis.domain.ConditionalExpression;
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
public interface ConditionalExpressionMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: conditional_expression")
    BasicColumn[] selectList = BasicColumn.columnList(elementHashId, conditionExpressionHashId, thenPartHashId, elsePartHashId);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: conditional_expression")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: conditional_expression")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: conditional_expression")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<ConditionalExpression> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: conditional_expression")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<ConditionalExpression> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: conditional_expression")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="element_hash_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="condition_expression_hash_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="then_part_hash_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="else_part_hash_id", javaType=Long.class, jdbcType=JdbcType.BIGINT)
    })
    Optional<ConditionalExpression> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: conditional_expression")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="element_hash_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="condition_expression_hash_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="then_part_hash_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="else_part_hash_id", javaType=Long.class, jdbcType=JdbcType.BIGINT)
    })
    List<ConditionalExpression> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: conditional_expression")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: conditional_expression")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, conditionalExpression, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: conditional_expression")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, conditionalExpression, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: conditional_expression")
    default int insert(ConditionalExpression record) {
        return MyBatis3Utils.insert(this::insert, record, conditionalExpression, c ->
            c.map(elementHashId).toProperty("elementHashId")
            .map(conditionExpressionHashId).toProperty("conditionExpressionHashId")
            .map(thenPartHashId).toProperty("thenPartHashId")
            .map(elsePartHashId).toProperty("elsePartHashId")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: conditional_expression")
    default int insertMultiple(Collection<ConditionalExpression> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, conditionalExpression, c ->
            c.map(elementHashId).toProperty("elementHashId")
            .map(conditionExpressionHashId).toProperty("conditionExpressionHashId")
            .map(thenPartHashId).toProperty("thenPartHashId")
            .map(elsePartHashId).toProperty("elsePartHashId")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: conditional_expression")
    default int insertSelective(ConditionalExpression record) {
        return MyBatis3Utils.insert(this::insert, record, conditionalExpression, c ->
            c.map(elementHashId).toPropertyWhenPresent("elementHashId", record::getElementHashId)
            .map(conditionExpressionHashId).toPropertyWhenPresent("conditionExpressionHashId", record::getConditionExpressionHashId)
            .map(thenPartHashId).toPropertyWhenPresent("thenPartHashId", record::getThenPartHashId)
            .map(elsePartHashId).toPropertyWhenPresent("elsePartHashId", record::getElsePartHashId)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: conditional_expression")
    default Optional<ConditionalExpression> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, conditionalExpression, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: conditional_expression")
    default List<ConditionalExpression> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, conditionalExpression, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: conditional_expression")
    default List<ConditionalExpression> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, conditionalExpression, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: conditional_expression")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, conditionalExpression, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: conditional_expression")
    static UpdateDSL<UpdateModel> updateAllColumns(ConditionalExpression record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(elementHashId).equalTo(record::getElementHashId)
                .set(conditionExpressionHashId).equalTo(record::getConditionExpressionHashId)
                .set(thenPartHashId).equalTo(record::getThenPartHashId)
                .set(elsePartHashId).equalTo(record::getElsePartHashId);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: conditional_expression")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(ConditionalExpression record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(elementHashId).equalToWhenPresent(record::getElementHashId)
                .set(conditionExpressionHashId).equalToWhenPresent(record::getConditionExpressionHashId)
                .set(thenPartHashId).equalToWhenPresent(record::getThenPartHashId)
                .set(elsePartHashId).equalToWhenPresent(record::getElsePartHashId);
    }
}