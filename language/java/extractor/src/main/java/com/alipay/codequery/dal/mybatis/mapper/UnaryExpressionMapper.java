package com.alipay.codequery.dal.mybatis.mapper;

import static com.alipay.codequery.dal.mybatis.mapper.UnaryExpressionDynamicSqlSupport.*;

import com.alipay.codequery.dal.mybatis.domain.UnaryExpression;
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
public interface UnaryExpressionMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: unary_expression")
    BasicColumn[] selectList = BasicColumn.columnList(elementHashId, operandHashId, opcode, isPostfix);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: unary_expression")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: unary_expression")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: unary_expression")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<UnaryExpression> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: unary_expression")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<UnaryExpression> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: unary_expression")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="element_hash_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="operand_hash_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="opcode", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="is_postfix", javaType=Integer.class, jdbcType=JdbcType.INTEGER)
    })
    Optional<UnaryExpression> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: unary_expression")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="element_hash_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="operand_hash_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="opcode", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="is_postfix", javaType=Integer.class, jdbcType=JdbcType.INTEGER)
    })
    List<UnaryExpression> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: unary_expression")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: unary_expression")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, unaryExpression, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: unary_expression")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, unaryExpression, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: unary_expression")
    default int insert(UnaryExpression record) {
        return MyBatis3Utils.insert(this::insert, record, unaryExpression, c ->
            c.map(elementHashId).toProperty("elementHashId")
            .map(operandHashId).toProperty("operandHashId")
            .map(opcode).toProperty("opcode")
            .map(isPostfix).toProperty("isPostfix")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: unary_expression")
    default int insertMultiple(Collection<UnaryExpression> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, unaryExpression, c ->
            c.map(elementHashId).toProperty("elementHashId")
            .map(operandHashId).toProperty("operandHashId")
            .map(opcode).toProperty("opcode")
            .map(isPostfix).toProperty("isPostfix")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: unary_expression")
    default int insertSelective(UnaryExpression record) {
        return MyBatis3Utils.insert(this::insert, record, unaryExpression, c ->
            c.map(elementHashId).toPropertyWhenPresent("elementHashId", record::getElementHashId)
            .map(operandHashId).toPropertyWhenPresent("operandHashId", record::getOperandHashId)
            .map(opcode).toPropertyWhenPresent("opcode", record::getOpcode)
            .map(isPostfix).toPropertyWhenPresent("isPostfix", record::getIsPostfix)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: unary_expression")
    default Optional<UnaryExpression> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, unaryExpression, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: unary_expression")
    default List<UnaryExpression> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, unaryExpression, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: unary_expression")
    default List<UnaryExpression> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, unaryExpression, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: unary_expression")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, unaryExpression, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: unary_expression")
    static UpdateDSL<UpdateModel> updateAllColumns(UnaryExpression record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(elementHashId).equalTo(record::getElementHashId)
                .set(operandHashId).equalTo(record::getOperandHashId)
                .set(opcode).equalTo(record::getOpcode)
                .set(isPostfix).equalTo(record::getIsPostfix);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: unary_expression")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(UnaryExpression record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(elementHashId).equalToWhenPresent(record::getElementHashId)
                .set(operandHashId).equalToWhenPresent(record::getOperandHashId)
                .set(opcode).equalToWhenPresent(record::getOpcode)
                .set(isPostfix).equalToWhenPresent(record::getIsPostfix);
    }
}