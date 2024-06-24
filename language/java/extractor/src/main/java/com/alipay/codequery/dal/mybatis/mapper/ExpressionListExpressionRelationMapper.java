package com.alipay.codequery.dal.mybatis.mapper;

import static com.alipay.codequery.dal.mybatis.mapper.ExpressionListExpressionRelationDynamicSqlSupport.*;

import com.alipay.codequery.dal.mybatis.domain.ExpressionListExpressionRelation;
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
public interface ExpressionListExpressionRelationMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: expression_list_expression_relation")
    BasicColumn[] selectList = BasicColumn.columnList(expressionListHashId, expressionHashId, position);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: expression_list_expression_relation")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: expression_list_expression_relation")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: expression_list_expression_relation")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<ExpressionListExpressionRelation> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: expression_list_expression_relation")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<ExpressionListExpressionRelation> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: expression_list_expression_relation")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="expression_list_hash_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="expression_hash_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="position", javaType=Integer.class, jdbcType=JdbcType.INTEGER)
    })
    Optional<ExpressionListExpressionRelation> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: expression_list_expression_relation")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="expression_list_hash_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="expression_hash_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="position", javaType=Integer.class, jdbcType=JdbcType.INTEGER)
    })
    List<ExpressionListExpressionRelation> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: expression_list_expression_relation")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: expression_list_expression_relation")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, expressionListExpressionRelation, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: expression_list_expression_relation")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, expressionListExpressionRelation, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: expression_list_expression_relation")
    default int insert(ExpressionListExpressionRelation record) {
        return MyBatis3Utils.insert(this::insert, record, expressionListExpressionRelation, c ->
            c.map(expressionListHashId).toProperty("expressionListHashId")
            .map(expressionHashId).toProperty("expressionHashId")
            .map(position).toProperty("position")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: expression_list_expression_relation")
    default int insertMultiple(Collection<ExpressionListExpressionRelation> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, expressionListExpressionRelation, c ->
            c.map(expressionListHashId).toProperty("expressionListHashId")
            .map(expressionHashId).toProperty("expressionHashId")
            .map(position).toProperty("position")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: expression_list_expression_relation")
    default int insertSelective(ExpressionListExpressionRelation record) {
        return MyBatis3Utils.insert(this::insert, record, expressionListExpressionRelation, c ->
            c.map(expressionListHashId).toPropertyWhenPresent("expressionListHashId", record::getExpressionListHashId)
            .map(expressionHashId).toPropertyWhenPresent("expressionHashId", record::getExpressionHashId)
            .map(position).toPropertyWhenPresent("position", record::getPosition)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: expression_list_expression_relation")
    default Optional<ExpressionListExpressionRelation> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, expressionListExpressionRelation, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: expression_list_expression_relation")
    default List<ExpressionListExpressionRelation> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, expressionListExpressionRelation, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: expression_list_expression_relation")
    default List<ExpressionListExpressionRelation> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, expressionListExpressionRelation, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: expression_list_expression_relation")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, expressionListExpressionRelation, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: expression_list_expression_relation")
    static UpdateDSL<UpdateModel> updateAllColumns(ExpressionListExpressionRelation record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(expressionListHashId).equalTo(record::getExpressionListHashId)
                .set(expressionHashId).equalTo(record::getExpressionHashId)
                .set(position).equalTo(record::getPosition);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: expression_list_expression_relation")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(ExpressionListExpressionRelation record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(expressionListHashId).equalToWhenPresent(record::getExpressionListHashId)
                .set(expressionHashId).equalToWhenPresent(record::getExpressionHashId)
                .set(position).equalToWhenPresent(record::getPosition);
    }
}