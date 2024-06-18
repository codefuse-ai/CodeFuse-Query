package com.alipay.codequery.dal.mybatis.mapper;

import static com.alipay.codequery.dal.mybatis.mapper.YieldStatementDynamicSqlSupport.*;

import com.alipay.codequery.dal.mybatis.domain.YieldStatement;
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
public interface YieldStatementMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: yield_statement")
    BasicColumn[] selectList = BasicColumn.columnList(elementHashId, expressionHashId, enclosingExpressionHashId);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: yield_statement")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: yield_statement")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: yield_statement")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<YieldStatement> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: yield_statement")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<YieldStatement> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: yield_statement")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="element_hash_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="expression_hash_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="enclosing_expression_hash_id", javaType=Long.class, jdbcType=JdbcType.BIGINT)
    })
    Optional<YieldStatement> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: yield_statement")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="element_hash_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="expression_hash_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="enclosing_expression_hash_id", javaType=Long.class, jdbcType=JdbcType.BIGINT)
    })
    List<YieldStatement> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: yield_statement")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: yield_statement")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, yieldStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: yield_statement")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, yieldStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: yield_statement")
    default int insert(YieldStatement record) {
        return MyBatis3Utils.insert(this::insert, record, yieldStatement, c ->
            c.map(elementHashId).toProperty("elementHashId")
            .map(expressionHashId).toProperty("expressionHashId")
            .map(enclosingExpressionHashId).toProperty("enclosingExpressionHashId")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: yield_statement")
    default int insertMultiple(Collection<YieldStatement> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, yieldStatement, c ->
            c.map(elementHashId).toProperty("elementHashId")
            .map(expressionHashId).toProperty("expressionHashId")
            .map(enclosingExpressionHashId).toProperty("enclosingExpressionHashId")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: yield_statement")
    default int insertSelective(YieldStatement record) {
        return MyBatis3Utils.insert(this::insert, record, yieldStatement, c ->
            c.map(elementHashId).toPropertyWhenPresent("elementHashId", record::getElementHashId)
            .map(expressionHashId).toPropertyWhenPresent("expressionHashId", record::getExpressionHashId)
            .map(enclosingExpressionHashId).toPropertyWhenPresent("enclosingExpressionHashId", record::getEnclosingExpressionHashId)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: yield_statement")
    default Optional<YieldStatement> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, yieldStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: yield_statement")
    default List<YieldStatement> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, yieldStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: yield_statement")
    default List<YieldStatement> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, yieldStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: yield_statement")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, yieldStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: yield_statement")
    static UpdateDSL<UpdateModel> updateAllColumns(YieldStatement record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(elementHashId).equalTo(record::getElementHashId)
                .set(expressionHashId).equalTo(record::getExpressionHashId)
                .set(enclosingExpressionHashId).equalTo(record::getEnclosingExpressionHashId);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: yield_statement")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(YieldStatement record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(elementHashId).equalToWhenPresent(record::getElementHashId)
                .set(expressionHashId).equalToWhenPresent(record::getExpressionHashId)
                .set(enclosingExpressionHashId).equalToWhenPresent(record::getEnclosingExpressionHashId);
    }
}