package com.alipay.codequery.dal.mybatis.mapper;

import static com.alipay.codequery.dal.mybatis.mapper.ForeachStatementDynamicSqlSupport.*;

import com.alipay.codequery.dal.mybatis.domain.ForeachStatement;
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
public interface ForeachStatementMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: foreach_statement")
    BasicColumn[] selectList = BasicColumn.columnList(elementHashId, iteratedValueHashId, iterationParameterHashId, bodyHashId);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: foreach_statement")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: foreach_statement")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: foreach_statement")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<ForeachStatement> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: foreach_statement")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<ForeachStatement> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: foreach_statement")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="element_hash_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="iterated_value_hash_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="iteration_parameter_hash_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="body_hash_id", javaType=Long.class, jdbcType=JdbcType.BIGINT)
    })
    Optional<ForeachStatement> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: foreach_statement")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="element_hash_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="iterated_value_hash_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="iteration_parameter_hash_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="body_hash_id", javaType=Long.class, jdbcType=JdbcType.BIGINT)
    })
    List<ForeachStatement> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: foreach_statement")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: foreach_statement")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, foreachStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: foreach_statement")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, foreachStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: foreach_statement")
    default int insert(ForeachStatement record) {
        return MyBatis3Utils.insert(this::insert, record, foreachStatement, c ->
            c.map(elementHashId).toProperty("elementHashId")
            .map(iteratedValueHashId).toProperty("iteratedValueHashId")
            .map(iterationParameterHashId).toProperty("iterationParameterHashId")
            .map(bodyHashId).toProperty("bodyHashId")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: foreach_statement")
    default int insertMultiple(Collection<ForeachStatement> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, foreachStatement, c ->
            c.map(elementHashId).toProperty("elementHashId")
            .map(iteratedValueHashId).toProperty("iteratedValueHashId")
            .map(iterationParameterHashId).toProperty("iterationParameterHashId")
            .map(bodyHashId).toProperty("bodyHashId")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: foreach_statement")
    default int insertSelective(ForeachStatement record) {
        return MyBatis3Utils.insert(this::insert, record, foreachStatement, c ->
            c.map(elementHashId).toPropertyWhenPresent("elementHashId", record::getElementHashId)
            .map(iteratedValueHashId).toPropertyWhenPresent("iteratedValueHashId", record::getIteratedValueHashId)
            .map(iterationParameterHashId).toPropertyWhenPresent("iterationParameterHashId", record::getIterationParameterHashId)
            .map(bodyHashId).toPropertyWhenPresent("bodyHashId", record::getBodyHashId)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: foreach_statement")
    default Optional<ForeachStatement> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, foreachStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: foreach_statement")
    default List<ForeachStatement> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, foreachStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: foreach_statement")
    default List<ForeachStatement> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, foreachStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: foreach_statement")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, foreachStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: foreach_statement")
    static UpdateDSL<UpdateModel> updateAllColumns(ForeachStatement record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(elementHashId).equalTo(record::getElementHashId)
                .set(iteratedValueHashId).equalTo(record::getIteratedValueHashId)
                .set(iterationParameterHashId).equalTo(record::getIterationParameterHashId)
                .set(bodyHashId).equalTo(record::getBodyHashId);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: foreach_statement")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(ForeachStatement record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(elementHashId).equalToWhenPresent(record::getElementHashId)
                .set(iteratedValueHashId).equalToWhenPresent(record::getIteratedValueHashId)
                .set(iterationParameterHashId).equalToWhenPresent(record::getIterationParameterHashId)
                .set(bodyHashId).equalToWhenPresent(record::getBodyHashId);
    }
}