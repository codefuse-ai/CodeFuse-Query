package com.alipay.codequery.dal.mybatis.mapper;

import static com.alipay.codequery.dal.mybatis.mapper.IfStatementWithoutElseDynamicSqlSupport.*;

import com.alipay.codequery.dal.mybatis.domain.IfStatementWithoutElse;
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
public interface IfStatementWithoutElseMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: if_statement_without_else")
    BasicColumn[] selectList = BasicColumn.columnList(elementHashId, conditionHashId, consequentHashId);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: if_statement_without_else")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: if_statement_without_else")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: if_statement_without_else")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<IfStatementWithoutElse> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: if_statement_without_else")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<IfStatementWithoutElse> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: if_statement_without_else")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="element_hash_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="condition_hash_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="consequent_hash_id", javaType=Long.class, jdbcType=JdbcType.BIGINT)
    })
    Optional<IfStatementWithoutElse> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: if_statement_without_else")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="element_hash_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="condition_hash_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="consequent_hash_id", javaType=Long.class, jdbcType=JdbcType.BIGINT)
    })
    List<IfStatementWithoutElse> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: if_statement_without_else")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: if_statement_without_else")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, ifStatementWithoutElse, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: if_statement_without_else")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, ifStatementWithoutElse, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: if_statement_without_else")
    default int insert(IfStatementWithoutElse record) {
        return MyBatis3Utils.insert(this::insert, record, ifStatementWithoutElse, c ->
            c.map(elementHashId).toProperty("elementHashId")
            .map(conditionHashId).toProperty("conditionHashId")
            .map(consequentHashId).toProperty("consequentHashId")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: if_statement_without_else")
    default int insertMultiple(Collection<IfStatementWithoutElse> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, ifStatementWithoutElse, c ->
            c.map(elementHashId).toProperty("elementHashId")
            .map(conditionHashId).toProperty("conditionHashId")
            .map(consequentHashId).toProperty("consequentHashId")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: if_statement_without_else")
    default int insertSelective(IfStatementWithoutElse record) {
        return MyBatis3Utils.insert(this::insert, record, ifStatementWithoutElse, c ->
            c.map(elementHashId).toPropertyWhenPresent("elementHashId", record::getElementHashId)
            .map(conditionHashId).toPropertyWhenPresent("conditionHashId", record::getConditionHashId)
            .map(consequentHashId).toPropertyWhenPresent("consequentHashId", record::getConsequentHashId)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: if_statement_without_else")
    default Optional<IfStatementWithoutElse> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, ifStatementWithoutElse, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: if_statement_without_else")
    default List<IfStatementWithoutElse> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, ifStatementWithoutElse, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: if_statement_without_else")
    default List<IfStatementWithoutElse> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, ifStatementWithoutElse, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: if_statement_without_else")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, ifStatementWithoutElse, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: if_statement_without_else")
    static UpdateDSL<UpdateModel> updateAllColumns(IfStatementWithoutElse record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(elementHashId).equalTo(record::getElementHashId)
                .set(conditionHashId).equalTo(record::getConditionHashId)
                .set(consequentHashId).equalTo(record::getConsequentHashId);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: if_statement_without_else")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(IfStatementWithoutElse record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(elementHashId).equalToWhenPresent(record::getElementHashId)
                .set(conditionHashId).equalToWhenPresent(record::getConditionHashId)
                .set(consequentHashId).equalToWhenPresent(record::getConsequentHashId);
    }
}