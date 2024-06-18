package com.alipay.codequery.dal.mybatis.mapper;

import static com.alipay.codequery.dal.mybatis.mapper.AssertStatementDynamicSqlSupport.*;

import com.alipay.codequery.dal.mybatis.domain.AssertStatement;
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
public interface AssertStatementMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: assert_statement")
    BasicColumn[] selectList = BasicColumn.columnList(elementHashId, assertConditionHashId, assertDescriptionHashId);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: assert_statement")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: assert_statement")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: assert_statement")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<AssertStatement> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: assert_statement")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<AssertStatement> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: assert_statement")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="element_hash_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="assert_condition_hash_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="assert_description_hash_id", javaType=Long.class, jdbcType=JdbcType.BIGINT)
    })
    Optional<AssertStatement> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: assert_statement")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="element_hash_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="assert_condition_hash_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="assert_description_hash_id", javaType=Long.class, jdbcType=JdbcType.BIGINT)
    })
    List<AssertStatement> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: assert_statement")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: assert_statement")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, assertStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: assert_statement")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, assertStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: assert_statement")
    default int insert(AssertStatement record) {
        return MyBatis3Utils.insert(this::insert, record, assertStatement, c ->
            c.map(elementHashId).toProperty("elementHashId")
            .map(assertConditionHashId).toProperty("assertConditionHashId")
            .map(assertDescriptionHashId).toProperty("assertDescriptionHashId")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: assert_statement")
    default int insertMultiple(Collection<AssertStatement> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, assertStatement, c ->
            c.map(elementHashId).toProperty("elementHashId")
            .map(assertConditionHashId).toProperty("assertConditionHashId")
            .map(assertDescriptionHashId).toProperty("assertDescriptionHashId")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: assert_statement")
    default int insertSelective(AssertStatement record) {
        return MyBatis3Utils.insert(this::insert, record, assertStatement, c ->
            c.map(elementHashId).toPropertyWhenPresent("elementHashId", record::getElementHashId)
            .map(assertConditionHashId).toPropertyWhenPresent("assertConditionHashId", record::getAssertConditionHashId)
            .map(assertDescriptionHashId).toPropertyWhenPresent("assertDescriptionHashId", record::getAssertDescriptionHashId)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: assert_statement")
    default Optional<AssertStatement> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, assertStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: assert_statement")
    default List<AssertStatement> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, assertStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: assert_statement")
    default List<AssertStatement> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, assertStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: assert_statement")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, assertStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: assert_statement")
    static UpdateDSL<UpdateModel> updateAllColumns(AssertStatement record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(elementHashId).equalTo(record::getElementHashId)
                .set(assertConditionHashId).equalTo(record::getAssertConditionHashId)
                .set(assertDescriptionHashId).equalTo(record::getAssertDescriptionHashId);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: assert_statement")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(AssertStatement record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(elementHashId).equalToWhenPresent(record::getElementHashId)
                .set(assertConditionHashId).equalToWhenPresent(record::getAssertConditionHashId)
                .set(assertDescriptionHashId).equalToWhenPresent(record::getAssertDescriptionHashId);
    }
}