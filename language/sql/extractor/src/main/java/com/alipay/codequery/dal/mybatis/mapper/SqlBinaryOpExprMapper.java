package com.alipay.codequery.dal.mybatis.mapper;

import static com.alipay.codequery.dal.mybatis.mapper.SqlBinaryOpExprDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.alipay.codequery.dal.mybatis.domain.SqlBinaryOpExpr;
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
public interface SqlBinaryOpExprMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_binary_op_expr")
    BasicColumn[] selectList = BasicColumn.columnList(oid, isBothName, isLeftFunctionAndRightLiteral, isLeftLiteralAndRightName, isLeftNameAndRightLiteral, isNameAndLiteral, isParenthesized, leftOid, operator, rightOid);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_binary_op_expr")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_binary_op_expr")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_binary_op_expr")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<SqlBinaryOpExpr> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_binary_op_expr")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<SqlBinaryOpExpr> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_binary_op_expr")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="is_both_name", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_left_function_and_right_literal", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_left_literal_and_right_name", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_left_name_and_right_literal", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_name_and_literal", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_parenthesized", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="left_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="operator", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="right_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT)
    })
    Optional<SqlBinaryOpExpr> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_binary_op_expr")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="is_both_name", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_left_function_and_right_literal", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_left_literal_and_right_name", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_left_name_and_right_literal", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_name_and_literal", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_parenthesized", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="left_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="operator", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="right_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT)
    })
    List<SqlBinaryOpExpr> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_binary_op_expr")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_binary_op_expr")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, sqlBinaryOpExpr, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_binary_op_expr")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, sqlBinaryOpExpr, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_binary_op_expr")
    default int deleteByPrimaryKey(Long oid_) {
        return delete(c -> 
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_binary_op_expr")
    default int insert(SqlBinaryOpExpr record) {
        return MyBatis3Utils.insert(this::insert, record, sqlBinaryOpExpr, c ->
            c.map(oid).toProperty("oid")
            .map(isBothName).toProperty("isBothName")
            .map(isLeftFunctionAndRightLiteral).toProperty("isLeftFunctionAndRightLiteral")
            .map(isLeftLiteralAndRightName).toProperty("isLeftLiteralAndRightName")
            .map(isLeftNameAndRightLiteral).toProperty("isLeftNameAndRightLiteral")
            .map(isNameAndLiteral).toProperty("isNameAndLiteral")
            .map(isParenthesized).toProperty("isParenthesized")
            .map(leftOid).toProperty("leftOid")
            .map(operator).toProperty("operator")
            .map(rightOid).toProperty("rightOid")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_binary_op_expr")
    default int insertMultiple(Collection<SqlBinaryOpExpr> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, sqlBinaryOpExpr, c ->
            c.map(oid).toProperty("oid")
            .map(isBothName).toProperty("isBothName")
            .map(isLeftFunctionAndRightLiteral).toProperty("isLeftFunctionAndRightLiteral")
            .map(isLeftLiteralAndRightName).toProperty("isLeftLiteralAndRightName")
            .map(isLeftNameAndRightLiteral).toProperty("isLeftNameAndRightLiteral")
            .map(isNameAndLiteral).toProperty("isNameAndLiteral")
            .map(isParenthesized).toProperty("isParenthesized")
            .map(leftOid).toProperty("leftOid")
            .map(operator).toProperty("operator")
            .map(rightOid).toProperty("rightOid")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_binary_op_expr")
    default int insertSelective(SqlBinaryOpExpr record) {
        return MyBatis3Utils.insert(this::insert, record, sqlBinaryOpExpr, c ->
            c.map(oid).toPropertyWhenPresent("oid", record::getOid)
            .map(isBothName).toPropertyWhenPresent("isBothName", record::getIsBothName)
            .map(isLeftFunctionAndRightLiteral).toPropertyWhenPresent("isLeftFunctionAndRightLiteral", record::getIsLeftFunctionAndRightLiteral)
            .map(isLeftLiteralAndRightName).toPropertyWhenPresent("isLeftLiteralAndRightName", record::getIsLeftLiteralAndRightName)
            .map(isLeftNameAndRightLiteral).toPropertyWhenPresent("isLeftNameAndRightLiteral", record::getIsLeftNameAndRightLiteral)
            .map(isNameAndLiteral).toPropertyWhenPresent("isNameAndLiteral", record::getIsNameAndLiteral)
            .map(isParenthesized).toPropertyWhenPresent("isParenthesized", record::getIsParenthesized)
            .map(leftOid).toPropertyWhenPresent("leftOid", record::getLeftOid)
            .map(operator).toPropertyWhenPresent("operator", record::getOperator)
            .map(rightOid).toPropertyWhenPresent("rightOid", record::getRightOid)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_binary_op_expr")
    default Optional<SqlBinaryOpExpr> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, sqlBinaryOpExpr, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_binary_op_expr")
    default List<SqlBinaryOpExpr> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, sqlBinaryOpExpr, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_binary_op_expr")
    default List<SqlBinaryOpExpr> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, sqlBinaryOpExpr, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_binary_op_expr")
    default Optional<SqlBinaryOpExpr> selectByPrimaryKey(Long oid_) {
        return selectOne(c ->
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_binary_op_expr")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, sqlBinaryOpExpr, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_binary_op_expr")
    static UpdateDSL<UpdateModel> updateAllColumns(SqlBinaryOpExpr record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalTo(record::getOid)
                .set(isBothName).equalTo(record::getIsBothName)
                .set(isLeftFunctionAndRightLiteral).equalTo(record::getIsLeftFunctionAndRightLiteral)
                .set(isLeftLiteralAndRightName).equalTo(record::getIsLeftLiteralAndRightName)
                .set(isLeftNameAndRightLiteral).equalTo(record::getIsLeftNameAndRightLiteral)
                .set(isNameAndLiteral).equalTo(record::getIsNameAndLiteral)
                .set(isParenthesized).equalTo(record::getIsParenthesized)
                .set(leftOid).equalTo(record::getLeftOid)
                .set(operator).equalTo(record::getOperator)
                .set(rightOid).equalTo(record::getRightOid);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_binary_op_expr")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(SqlBinaryOpExpr record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalToWhenPresent(record::getOid)
                .set(isBothName).equalToWhenPresent(record::getIsBothName)
                .set(isLeftFunctionAndRightLiteral).equalToWhenPresent(record::getIsLeftFunctionAndRightLiteral)
                .set(isLeftLiteralAndRightName).equalToWhenPresent(record::getIsLeftLiteralAndRightName)
                .set(isLeftNameAndRightLiteral).equalToWhenPresent(record::getIsLeftNameAndRightLiteral)
                .set(isNameAndLiteral).equalToWhenPresent(record::getIsNameAndLiteral)
                .set(isParenthesized).equalToWhenPresent(record::getIsParenthesized)
                .set(leftOid).equalToWhenPresent(record::getLeftOid)
                .set(operator).equalToWhenPresent(record::getOperator)
                .set(rightOid).equalToWhenPresent(record::getRightOid);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_binary_op_expr")
    default int updateByPrimaryKey(SqlBinaryOpExpr record) {
        return update(c ->
            c.set(isBothName).equalTo(record::getIsBothName)
            .set(isLeftFunctionAndRightLiteral).equalTo(record::getIsLeftFunctionAndRightLiteral)
            .set(isLeftLiteralAndRightName).equalTo(record::getIsLeftLiteralAndRightName)
            .set(isLeftNameAndRightLiteral).equalTo(record::getIsLeftNameAndRightLiteral)
            .set(isNameAndLiteral).equalTo(record::getIsNameAndLiteral)
            .set(isParenthesized).equalTo(record::getIsParenthesized)
            .set(leftOid).equalTo(record::getLeftOid)
            .set(operator).equalTo(record::getOperator)
            .set(rightOid).equalTo(record::getRightOid)
            .where(oid, isEqualTo(record::getOid))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_binary_op_expr")
    default int updateByPrimaryKeySelective(SqlBinaryOpExpr record) {
        return update(c ->
            c.set(isBothName).equalToWhenPresent(record::getIsBothName)
            .set(isLeftFunctionAndRightLiteral).equalToWhenPresent(record::getIsLeftFunctionAndRightLiteral)
            .set(isLeftLiteralAndRightName).equalToWhenPresent(record::getIsLeftLiteralAndRightName)
            .set(isLeftNameAndRightLiteral).equalToWhenPresent(record::getIsLeftNameAndRightLiteral)
            .set(isNameAndLiteral).equalToWhenPresent(record::getIsNameAndLiteral)
            .set(isParenthesized).equalToWhenPresent(record::getIsParenthesized)
            .set(leftOid).equalToWhenPresent(record::getLeftOid)
            .set(operator).equalToWhenPresent(record::getOperator)
            .set(rightOid).equalToWhenPresent(record::getRightOid)
            .where(oid, isEqualTo(record::getOid))
        );
    }
}