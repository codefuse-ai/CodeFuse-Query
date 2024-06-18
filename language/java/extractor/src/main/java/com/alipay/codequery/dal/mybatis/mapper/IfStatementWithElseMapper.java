package com.alipay.codequery.dal.mybatis.mapper;

import static com.alipay.codequery.dal.mybatis.mapper.IfStatementWithElseDynamicSqlSupport.*;

import com.alipay.codequery.dal.mybatis.domain.IfStatementWithElse;
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
public interface IfStatementWithElseMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: if_statement_with_else")
    BasicColumn[] selectList = BasicColumn.columnList(elementHashId, conditionHashId, consequentHashId, alternateHashId);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: if_statement_with_else")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: if_statement_with_else")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: if_statement_with_else")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<IfStatementWithElse> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: if_statement_with_else")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<IfStatementWithElse> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: if_statement_with_else")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="element_hash_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="condition_hash_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="consequent_hash_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="alternate_hash_id", javaType=Long.class, jdbcType=JdbcType.BIGINT)
    })
    Optional<IfStatementWithElse> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: if_statement_with_else")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="element_hash_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="condition_hash_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="consequent_hash_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="alternate_hash_id", javaType=Long.class, jdbcType=JdbcType.BIGINT)
    })
    List<IfStatementWithElse> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: if_statement_with_else")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: if_statement_with_else")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, ifStatementWithElse, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: if_statement_with_else")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, ifStatementWithElse, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: if_statement_with_else")
    default int insert(IfStatementWithElse record) {
        return MyBatis3Utils.insert(this::insert, record, ifStatementWithElse, c ->
            c.map(elementHashId).toProperty("elementHashId")
            .map(conditionHashId).toProperty("conditionHashId")
            .map(consequentHashId).toProperty("consequentHashId")
            .map(alternateHashId).toProperty("alternateHashId")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: if_statement_with_else")
    default int insertMultiple(Collection<IfStatementWithElse> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, ifStatementWithElse, c ->
            c.map(elementHashId).toProperty("elementHashId")
            .map(conditionHashId).toProperty("conditionHashId")
            .map(consequentHashId).toProperty("consequentHashId")
            .map(alternateHashId).toProperty("alternateHashId")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: if_statement_with_else")
    default int insertSelective(IfStatementWithElse record) {
        return MyBatis3Utils.insert(this::insert, record, ifStatementWithElse, c ->
            c.map(elementHashId).toPropertyWhenPresent("elementHashId", record::getElementHashId)
            .map(conditionHashId).toPropertyWhenPresent("conditionHashId", record::getConditionHashId)
            .map(consequentHashId).toPropertyWhenPresent("consequentHashId", record::getConsequentHashId)
            .map(alternateHashId).toPropertyWhenPresent("alternateHashId", record::getAlternateHashId)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: if_statement_with_else")
    default Optional<IfStatementWithElse> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, ifStatementWithElse, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: if_statement_with_else")
    default List<IfStatementWithElse> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, ifStatementWithElse, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: if_statement_with_else")
    default List<IfStatementWithElse> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, ifStatementWithElse, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: if_statement_with_else")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, ifStatementWithElse, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: if_statement_with_else")
    static UpdateDSL<UpdateModel> updateAllColumns(IfStatementWithElse record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(elementHashId).equalTo(record::getElementHashId)
                .set(conditionHashId).equalTo(record::getConditionHashId)
                .set(consequentHashId).equalTo(record::getConsequentHashId)
                .set(alternateHashId).equalTo(record::getAlternateHashId);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: if_statement_with_else")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(IfStatementWithElse record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(elementHashId).equalToWhenPresent(record::getElementHashId)
                .set(conditionHashId).equalToWhenPresent(record::getConditionHashId)
                .set(consequentHashId).equalToWhenPresent(record::getConsequentHashId)
                .set(alternateHashId).equalToWhenPresent(record::getAlternateHashId);
    }
}