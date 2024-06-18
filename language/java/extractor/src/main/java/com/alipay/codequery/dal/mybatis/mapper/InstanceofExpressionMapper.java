package com.alipay.codequery.dal.mybatis.mapper;

import static com.alipay.codequery.dal.mybatis.mapper.InstanceofExpressionDynamicSqlSupport.*;

import com.alipay.codequery.dal.mybatis.domain.InstanceofExpression;
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
public interface InstanceofExpressionMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: instanceof_expression")
    BasicColumn[] selectList = BasicColumn.columnList(elementHashId, operandHashId, checkTypeHashId, patternHashId);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: instanceof_expression")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: instanceof_expression")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: instanceof_expression")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<InstanceofExpression> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: instanceof_expression")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<InstanceofExpression> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: instanceof_expression")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="element_hash_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="operand_hash_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="check_type_hash_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="pattern_hash_id", javaType=Long.class, jdbcType=JdbcType.BIGINT)
    })
    Optional<InstanceofExpression> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: instanceof_expression")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="element_hash_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="operand_hash_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="check_type_hash_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="pattern_hash_id", javaType=Long.class, jdbcType=JdbcType.BIGINT)
    })
    List<InstanceofExpression> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: instanceof_expression")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: instanceof_expression")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, instanceofExpression, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: instanceof_expression")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, instanceofExpression, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: instanceof_expression")
    default int insert(InstanceofExpression record) {
        return MyBatis3Utils.insert(this::insert, record, instanceofExpression, c ->
            c.map(elementHashId).toProperty("elementHashId")
            .map(operandHashId).toProperty("operandHashId")
            .map(checkTypeHashId).toProperty("checkTypeHashId")
            .map(patternHashId).toProperty("patternHashId")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: instanceof_expression")
    default int insertMultiple(Collection<InstanceofExpression> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, instanceofExpression, c ->
            c.map(elementHashId).toProperty("elementHashId")
            .map(operandHashId).toProperty("operandHashId")
            .map(checkTypeHashId).toProperty("checkTypeHashId")
            .map(patternHashId).toProperty("patternHashId")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: instanceof_expression")
    default int insertSelective(InstanceofExpression record) {
        return MyBatis3Utils.insert(this::insert, record, instanceofExpression, c ->
            c.map(elementHashId).toPropertyWhenPresent("elementHashId", record::getElementHashId)
            .map(operandHashId).toPropertyWhenPresent("operandHashId", record::getOperandHashId)
            .map(checkTypeHashId).toPropertyWhenPresent("checkTypeHashId", record::getCheckTypeHashId)
            .map(patternHashId).toPropertyWhenPresent("patternHashId", record::getPatternHashId)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: instanceof_expression")
    default Optional<InstanceofExpression> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, instanceofExpression, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: instanceof_expression")
    default List<InstanceofExpression> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, instanceofExpression, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: instanceof_expression")
    default List<InstanceofExpression> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, instanceofExpression, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: instanceof_expression")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, instanceofExpression, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: instanceof_expression")
    static UpdateDSL<UpdateModel> updateAllColumns(InstanceofExpression record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(elementHashId).equalTo(record::getElementHashId)
                .set(operandHashId).equalTo(record::getOperandHashId)
                .set(checkTypeHashId).equalTo(record::getCheckTypeHashId)
                .set(patternHashId).equalTo(record::getPatternHashId);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: instanceof_expression")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(InstanceofExpression record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(elementHashId).equalToWhenPresent(record::getElementHashId)
                .set(operandHashId).equalToWhenPresent(record::getOperandHashId)
                .set(checkTypeHashId).equalToWhenPresent(record::getCheckTypeHashId)
                .set(patternHashId).equalToWhenPresent(record::getPatternHashId);
    }
}