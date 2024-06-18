package com.alipay.codequery.dal.mybatis.mapper;

import static com.alipay.codequery.dal.mybatis.mapper.ForStatementDynamicSqlSupport.*;

import com.alipay.codequery.dal.mybatis.domain.ForStatement;
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
public interface ForStatementMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: for_statement")
    BasicColumn[] selectList = BasicColumn.columnList(elementHashId, initializationHashId, conditionHashId, updateHashId, bodyHashId);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: for_statement")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: for_statement")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: for_statement")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<ForStatement> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: for_statement")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<ForStatement> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: for_statement")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="element_hash_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="initialization_hash_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="condition_hash_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="update_hash_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="body_hash_id", javaType=Long.class, jdbcType=JdbcType.BIGINT)
    })
    Optional<ForStatement> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: for_statement")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="element_hash_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="initialization_hash_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="condition_hash_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="update_hash_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="body_hash_id", javaType=Long.class, jdbcType=JdbcType.BIGINT)
    })
    List<ForStatement> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: for_statement")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: for_statement")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, forStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: for_statement")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, forStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: for_statement")
    default int insert(ForStatement record) {
        return MyBatis3Utils.insert(this::insert, record, forStatement, c ->
            c.map(elementHashId).toProperty("elementHashId")
            .map(initializationHashId).toProperty("initializationHashId")
            .map(conditionHashId).toProperty("conditionHashId")
            .map(updateHashId).toProperty("updateHashId")
            .map(bodyHashId).toProperty("bodyHashId")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: for_statement")
    default int insertMultiple(Collection<ForStatement> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, forStatement, c ->
            c.map(elementHashId).toProperty("elementHashId")
            .map(initializationHashId).toProperty("initializationHashId")
            .map(conditionHashId).toProperty("conditionHashId")
            .map(updateHashId).toProperty("updateHashId")
            .map(bodyHashId).toProperty("bodyHashId")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: for_statement")
    default int insertSelective(ForStatement record) {
        return MyBatis3Utils.insert(this::insert, record, forStatement, c ->
            c.map(elementHashId).toPropertyWhenPresent("elementHashId", record::getElementHashId)
            .map(initializationHashId).toPropertyWhenPresent("initializationHashId", record::getInitializationHashId)
            .map(conditionHashId).toPropertyWhenPresent("conditionHashId", record::getConditionHashId)
            .map(updateHashId).toPropertyWhenPresent("updateHashId", record::getUpdateHashId)
            .map(bodyHashId).toPropertyWhenPresent("bodyHashId", record::getBodyHashId)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: for_statement")
    default Optional<ForStatement> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, forStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: for_statement")
    default List<ForStatement> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, forStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: for_statement")
    default List<ForStatement> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, forStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: for_statement")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, forStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: for_statement")
    static UpdateDSL<UpdateModel> updateAllColumns(ForStatement record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(elementHashId).equalTo(record::getElementHashId)
                .set(initializationHashId).equalTo(record::getInitializationHashId)
                .set(conditionHashId).equalTo(record::getConditionHashId)
                .set(updateHashId).equalTo(record::getUpdateHashId)
                .set(bodyHashId).equalTo(record::getBodyHashId);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: for_statement")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(ForStatement record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(elementHashId).equalToWhenPresent(record::getElementHashId)
                .set(initializationHashId).equalToWhenPresent(record::getInitializationHashId)
                .set(conditionHashId).equalToWhenPresent(record::getConditionHashId)
                .set(updateHashId).equalToWhenPresent(record::getUpdateHashId)
                .set(bodyHashId).equalToWhenPresent(record::getBodyHashId);
    }
}