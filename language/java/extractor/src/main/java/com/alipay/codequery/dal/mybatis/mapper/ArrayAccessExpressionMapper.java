package com.alipay.codequery.dal.mybatis.mapper;

import static com.alipay.codequery.dal.mybatis.mapper.ArrayAccessExpressionDynamicSqlSupport.*;

import com.alipay.codequery.dal.mybatis.domain.ArrayAccessExpression;
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
public interface ArrayAccessExpressionMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: array_access_expression")
    BasicColumn[] selectList = BasicColumn.columnList(elementHashId, indexExpressionHashId, arrayExpressionHashId);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: array_access_expression")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: array_access_expression")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: array_access_expression")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<ArrayAccessExpression> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: array_access_expression")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<ArrayAccessExpression> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: array_access_expression")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="element_hash_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="index_expression_hash_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="array_expression_hash_id", javaType=Long.class, jdbcType=JdbcType.BIGINT)
    })
    Optional<ArrayAccessExpression> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: array_access_expression")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="element_hash_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="index_expression_hash_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="array_expression_hash_id", javaType=Long.class, jdbcType=JdbcType.BIGINT)
    })
    List<ArrayAccessExpression> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: array_access_expression")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: array_access_expression")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, arrayAccessExpression, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: array_access_expression")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, arrayAccessExpression, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: array_access_expression")
    default int insert(ArrayAccessExpression record) {
        return MyBatis3Utils.insert(this::insert, record, arrayAccessExpression, c ->
            c.map(elementHashId).toProperty("elementHashId")
            .map(indexExpressionHashId).toProperty("indexExpressionHashId")
            .map(arrayExpressionHashId).toProperty("arrayExpressionHashId")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: array_access_expression")
    default int insertMultiple(Collection<ArrayAccessExpression> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, arrayAccessExpression, c ->
            c.map(elementHashId).toProperty("elementHashId")
            .map(indexExpressionHashId).toProperty("indexExpressionHashId")
            .map(arrayExpressionHashId).toProperty("arrayExpressionHashId")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: array_access_expression")
    default int insertSelective(ArrayAccessExpression record) {
        return MyBatis3Utils.insert(this::insert, record, arrayAccessExpression, c ->
            c.map(elementHashId).toPropertyWhenPresent("elementHashId", record::getElementHashId)
            .map(indexExpressionHashId).toPropertyWhenPresent("indexExpressionHashId", record::getIndexExpressionHashId)
            .map(arrayExpressionHashId).toPropertyWhenPresent("arrayExpressionHashId", record::getArrayExpressionHashId)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: array_access_expression")
    default Optional<ArrayAccessExpression> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, arrayAccessExpression, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: array_access_expression")
    default List<ArrayAccessExpression> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, arrayAccessExpression, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: array_access_expression")
    default List<ArrayAccessExpression> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, arrayAccessExpression, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: array_access_expression")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, arrayAccessExpression, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: array_access_expression")
    static UpdateDSL<UpdateModel> updateAllColumns(ArrayAccessExpression record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(elementHashId).equalTo(record::getElementHashId)
                .set(indexExpressionHashId).equalTo(record::getIndexExpressionHashId)
                .set(arrayExpressionHashId).equalTo(record::getArrayExpressionHashId);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: array_access_expression")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(ArrayAccessExpression record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(elementHashId).equalToWhenPresent(record::getElementHashId)
                .set(indexExpressionHashId).equalToWhenPresent(record::getIndexExpressionHashId)
                .set(arrayExpressionHashId).equalToWhenPresent(record::getArrayExpressionHashId);
    }
}