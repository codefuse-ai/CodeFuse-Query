package com.alipay.codequery.dal.mybatis.mapper;

import static com.alipay.codequery.dal.mybatis.mapper.BinaryExpressionDynamicSqlSupport.*;

import com.alipay.codequery.dal.mybatis.domain.BinaryExpression;
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
public interface BinaryExpressionMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: binary_expression")
    BasicColumn[] selectList = BasicColumn.columnList(elementHashId, lhsHashId, rhsHashId, opcode);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: binary_expression")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: binary_expression")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: binary_expression")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<BinaryExpression> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: binary_expression")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<BinaryExpression> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: binary_expression")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="element_hash_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="lhs_hash_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="rhs_hash_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="opcode", javaType=String.class, jdbcType=JdbcType.VARCHAR)
    })
    Optional<BinaryExpression> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: binary_expression")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="element_hash_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="lhs_hash_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="rhs_hash_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="opcode", javaType=String.class, jdbcType=JdbcType.VARCHAR)
    })
    List<BinaryExpression> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: binary_expression")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: binary_expression")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, binaryExpression, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: binary_expression")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, binaryExpression, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: binary_expression")
    default int insert(BinaryExpression record) {
        return MyBatis3Utils.insert(this::insert, record, binaryExpression, c ->
            c.map(elementHashId).toProperty("elementHashId")
            .map(lhsHashId).toProperty("lhsHashId")
            .map(rhsHashId).toProperty("rhsHashId")
            .map(opcode).toProperty("opcode")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: binary_expression")
    default int insertMultiple(Collection<BinaryExpression> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, binaryExpression, c ->
            c.map(elementHashId).toProperty("elementHashId")
            .map(lhsHashId).toProperty("lhsHashId")
            .map(rhsHashId).toProperty("rhsHashId")
            .map(opcode).toProperty("opcode")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: binary_expression")
    default int insertSelective(BinaryExpression record) {
        return MyBatis3Utils.insert(this::insert, record, binaryExpression, c ->
            c.map(elementHashId).toPropertyWhenPresent("elementHashId", record::getElementHashId)
            .map(lhsHashId).toPropertyWhenPresent("lhsHashId", record::getLhsHashId)
            .map(rhsHashId).toPropertyWhenPresent("rhsHashId", record::getRhsHashId)
            .map(opcode).toPropertyWhenPresent("opcode", record::getOpcode)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: binary_expression")
    default Optional<BinaryExpression> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, binaryExpression, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: binary_expression")
    default List<BinaryExpression> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, binaryExpression, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: binary_expression")
    default List<BinaryExpression> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, binaryExpression, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: binary_expression")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, binaryExpression, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: binary_expression")
    static UpdateDSL<UpdateModel> updateAllColumns(BinaryExpression record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(elementHashId).equalTo(record::getElementHashId)
                .set(lhsHashId).equalTo(record::getLhsHashId)
                .set(rhsHashId).equalTo(record::getRhsHashId)
                .set(opcode).equalTo(record::getOpcode);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: binary_expression")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(BinaryExpression record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(elementHashId).equalToWhenPresent(record::getElementHashId)
                .set(lhsHashId).equalToWhenPresent(record::getLhsHashId)
                .set(rhsHashId).equalToWhenPresent(record::getRhsHashId)
                .set(opcode).equalToWhenPresent(record::getOpcode);
    }
}