package com.alipay.codequery.dal.mybatis.mapper;

import static com.alipay.codequery.dal.mybatis.mapper.CallableEnclosingExpressionDynamicSqlSupport.*;

import com.alipay.codequery.dal.mybatis.domain.CallableEnclosingExpression;
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
public interface CallableEnclosingExpressionMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: callable_enclosing_expression")
    BasicColumn[] selectList = BasicColumn.columnList(expressionHashId, callableHashId);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: callable_enclosing_expression")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: callable_enclosing_expression")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: callable_enclosing_expression")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<CallableEnclosingExpression> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: callable_enclosing_expression")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<CallableEnclosingExpression> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: callable_enclosing_expression")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="expression_hash_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="callable_hash_id", javaType=Long.class, jdbcType=JdbcType.BIGINT)
    })
    Optional<CallableEnclosingExpression> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: callable_enclosing_expression")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="expression_hash_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="callable_hash_id", javaType=Long.class, jdbcType=JdbcType.BIGINT)
    })
    List<CallableEnclosingExpression> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: callable_enclosing_expression")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: callable_enclosing_expression")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, callableEnclosingExpression, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: callable_enclosing_expression")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, callableEnclosingExpression, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: callable_enclosing_expression")
    default int insert(CallableEnclosingExpression record) {
        return MyBatis3Utils.insert(this::insert, record, callableEnclosingExpression, c ->
            c.map(expressionHashId).toProperty("expressionHashId")
            .map(callableHashId).toProperty("callableHashId")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: callable_enclosing_expression")
    default int insertMultiple(Collection<CallableEnclosingExpression> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, callableEnclosingExpression, c ->
            c.map(expressionHashId).toProperty("expressionHashId")
            .map(callableHashId).toProperty("callableHashId")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: callable_enclosing_expression")
    default int insertSelective(CallableEnclosingExpression record) {
        return MyBatis3Utils.insert(this::insert, record, callableEnclosingExpression, c ->
            c.map(expressionHashId).toPropertyWhenPresent("expressionHashId", record::getExpressionHashId)
            .map(callableHashId).toPropertyWhenPresent("callableHashId", record::getCallableHashId)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: callable_enclosing_expression")
    default Optional<CallableEnclosingExpression> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, callableEnclosingExpression, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: callable_enclosing_expression")
    default List<CallableEnclosingExpression> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, callableEnclosingExpression, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: callable_enclosing_expression")
    default List<CallableEnclosingExpression> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, callableEnclosingExpression, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: callable_enclosing_expression")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, callableEnclosingExpression, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: callable_enclosing_expression")
    static UpdateDSL<UpdateModel> updateAllColumns(CallableEnclosingExpression record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(expressionHashId).equalTo(record::getExpressionHashId)
                .set(callableHashId).equalTo(record::getCallableHashId);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: callable_enclosing_expression")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(CallableEnclosingExpression record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(expressionHashId).equalToWhenPresent(record::getExpressionHashId)
                .set(callableHashId).equalToWhenPresent(record::getCallableHashId);
    }
}