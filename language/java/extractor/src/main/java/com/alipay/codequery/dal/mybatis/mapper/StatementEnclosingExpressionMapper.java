package com.alipay.codequery.dal.mybatis.mapper;

import static com.alipay.codequery.dal.mybatis.mapper.StatementEnclosingExpressionDynamicSqlSupport.*;

import com.alipay.codequery.dal.mybatis.domain.StatementEnclosingExpression;
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
public interface StatementEnclosingExpressionMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: statement_enclosing_expression")
    BasicColumn[] selectList = BasicColumn.columnList(expressionHashId, statementHashId);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: statement_enclosing_expression")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: statement_enclosing_expression")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: statement_enclosing_expression")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<StatementEnclosingExpression> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: statement_enclosing_expression")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<StatementEnclosingExpression> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: statement_enclosing_expression")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="expression_hash_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="statement_hash_id", javaType=Long.class, jdbcType=JdbcType.BIGINT)
    })
    Optional<StatementEnclosingExpression> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: statement_enclosing_expression")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="expression_hash_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="statement_hash_id", javaType=Long.class, jdbcType=JdbcType.BIGINT)
    })
    List<StatementEnclosingExpression> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: statement_enclosing_expression")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: statement_enclosing_expression")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, statementEnclosingExpression, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: statement_enclosing_expression")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, statementEnclosingExpression, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: statement_enclosing_expression")
    default int insert(StatementEnclosingExpression record) {
        return MyBatis3Utils.insert(this::insert, record, statementEnclosingExpression, c ->
            c.map(expressionHashId).toProperty("expressionHashId")
            .map(statementHashId).toProperty("statementHashId")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: statement_enclosing_expression")
    default int insertMultiple(Collection<StatementEnclosingExpression> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, statementEnclosingExpression, c ->
            c.map(expressionHashId).toProperty("expressionHashId")
            .map(statementHashId).toProperty("statementHashId")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: statement_enclosing_expression")
    default int insertSelective(StatementEnclosingExpression record) {
        return MyBatis3Utils.insert(this::insert, record, statementEnclosingExpression, c ->
            c.map(expressionHashId).toPropertyWhenPresent("expressionHashId", record::getExpressionHashId)
            .map(statementHashId).toPropertyWhenPresent("statementHashId", record::getStatementHashId)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: statement_enclosing_expression")
    default Optional<StatementEnclosingExpression> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, statementEnclosingExpression, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: statement_enclosing_expression")
    default List<StatementEnclosingExpression> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, statementEnclosingExpression, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: statement_enclosing_expression")
    default List<StatementEnclosingExpression> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, statementEnclosingExpression, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: statement_enclosing_expression")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, statementEnclosingExpression, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: statement_enclosing_expression")
    static UpdateDSL<UpdateModel> updateAllColumns(StatementEnclosingExpression record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(expressionHashId).equalTo(record::getExpressionHashId)
                .set(statementHashId).equalTo(record::getStatementHashId);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: statement_enclosing_expression")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(StatementEnclosingExpression record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(expressionHashId).equalToWhenPresent(record::getExpressionHashId)
                .set(statementHashId).equalToWhenPresent(record::getStatementHashId);
    }
}