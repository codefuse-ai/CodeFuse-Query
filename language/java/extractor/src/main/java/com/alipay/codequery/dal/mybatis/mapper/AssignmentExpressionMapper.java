package com.alipay.codequery.dal.mybatis.mapper;

import static com.alipay.codequery.dal.mybatis.mapper.AssignmentExpressionDynamicSqlSupport.*;

import com.alipay.codequery.dal.mybatis.domain.AssignmentExpression;
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
public interface AssignmentExpressionMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: assignment_expression")
    BasicColumn[] selectList = BasicColumn.columnList(elementHashId, lhsHashId, rhsHashId, opcode);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: assignment_expression")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: assignment_expression")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: assignment_expression")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<AssignmentExpression> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: assignment_expression")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<AssignmentExpression> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: assignment_expression")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="element_hash_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="lhs_hash_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="rhs_hash_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="opcode", javaType=String.class, jdbcType=JdbcType.VARCHAR)
    })
    Optional<AssignmentExpression> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: assignment_expression")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="element_hash_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="lhs_hash_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="rhs_hash_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="opcode", javaType=String.class, jdbcType=JdbcType.VARCHAR)
    })
    List<AssignmentExpression> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: assignment_expression")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: assignment_expression")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, assignmentExpression, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: assignment_expression")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, assignmentExpression, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: assignment_expression")
    default int insert(AssignmentExpression record) {
        return MyBatis3Utils.insert(this::insert, record, assignmentExpression, c ->
            c.map(elementHashId).toProperty("elementHashId")
            .map(lhsHashId).toProperty("lhsHashId")
            .map(rhsHashId).toProperty("rhsHashId")
            .map(opcode).toProperty("opcode")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: assignment_expression")
    default int insertMultiple(Collection<AssignmentExpression> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, assignmentExpression, c ->
            c.map(elementHashId).toProperty("elementHashId")
            .map(lhsHashId).toProperty("lhsHashId")
            .map(rhsHashId).toProperty("rhsHashId")
            .map(opcode).toProperty("opcode")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: assignment_expression")
    default int insertSelective(AssignmentExpression record) {
        return MyBatis3Utils.insert(this::insert, record, assignmentExpression, c ->
            c.map(elementHashId).toPropertyWhenPresent("elementHashId", record::getElementHashId)
            .map(lhsHashId).toPropertyWhenPresent("lhsHashId", record::getLhsHashId)
            .map(rhsHashId).toPropertyWhenPresent("rhsHashId", record::getRhsHashId)
            .map(opcode).toPropertyWhenPresent("opcode", record::getOpcode)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: assignment_expression")
    default Optional<AssignmentExpression> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, assignmentExpression, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: assignment_expression")
    default List<AssignmentExpression> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, assignmentExpression, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: assignment_expression")
    default List<AssignmentExpression> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, assignmentExpression, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: assignment_expression")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, assignmentExpression, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: assignment_expression")
    static UpdateDSL<UpdateModel> updateAllColumns(AssignmentExpression record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(elementHashId).equalTo(record::getElementHashId)
                .set(lhsHashId).equalTo(record::getLhsHashId)
                .set(rhsHashId).equalTo(record::getRhsHashId)
                .set(opcode).equalTo(record::getOpcode);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: assignment_expression")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(AssignmentExpression record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(elementHashId).equalToWhenPresent(record::getElementHashId)
                .set(lhsHashId).equalToWhenPresent(record::getLhsHashId)
                .set(rhsHashId).equalToWhenPresent(record::getRhsHashId)
                .set(opcode).equalToWhenPresent(record::getOpcode);
    }
}