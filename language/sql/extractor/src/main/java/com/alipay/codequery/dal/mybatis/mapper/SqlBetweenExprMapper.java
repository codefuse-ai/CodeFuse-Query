package com.alipay.codequery.dal.mybatis.mapper;

import static com.alipay.codequery.dal.mybatis.mapper.SqlBetweenExprDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.alipay.codequery.dal.mybatis.domain.SqlBetweenExpr;
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
public interface SqlBetweenExprMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_between_expr")
    BasicColumn[] selectList = BasicColumn.columnList(oid, beginExprOid, endExprOid, isNot, testExprOid);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_between_expr")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_between_expr")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_between_expr")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<SqlBetweenExpr> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_between_expr")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<SqlBetweenExpr> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_between_expr")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="begin_expr_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="end_expr_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_not", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="test_expr_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT)
    })
    Optional<SqlBetweenExpr> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_between_expr")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="begin_expr_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="end_expr_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_not", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="test_expr_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT)
    })
    List<SqlBetweenExpr> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_between_expr")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_between_expr")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, sqlBetweenExpr, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_between_expr")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, sqlBetweenExpr, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_between_expr")
    default int deleteByPrimaryKey(Long oid_) {
        return delete(c -> 
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_between_expr")
    default int insert(SqlBetweenExpr record) {
        return MyBatis3Utils.insert(this::insert, record, sqlBetweenExpr, c ->
            c.map(oid).toProperty("oid")
            .map(beginExprOid).toProperty("beginExprOid")
            .map(endExprOid).toProperty("endExprOid")
            .map(isNot).toProperty("isNot")
            .map(testExprOid).toProperty("testExprOid")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_between_expr")
    default int insertMultiple(Collection<SqlBetweenExpr> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, sqlBetweenExpr, c ->
            c.map(oid).toProperty("oid")
            .map(beginExprOid).toProperty("beginExprOid")
            .map(endExprOid).toProperty("endExprOid")
            .map(isNot).toProperty("isNot")
            .map(testExprOid).toProperty("testExprOid")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_between_expr")
    default int insertSelective(SqlBetweenExpr record) {
        return MyBatis3Utils.insert(this::insert, record, sqlBetweenExpr, c ->
            c.map(oid).toPropertyWhenPresent("oid", record::getOid)
            .map(beginExprOid).toPropertyWhenPresent("beginExprOid", record::getBeginExprOid)
            .map(endExprOid).toPropertyWhenPresent("endExprOid", record::getEndExprOid)
            .map(isNot).toPropertyWhenPresent("isNot", record::getIsNot)
            .map(testExprOid).toPropertyWhenPresent("testExprOid", record::getTestExprOid)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_between_expr")
    default Optional<SqlBetweenExpr> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, sqlBetweenExpr, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_between_expr")
    default List<SqlBetweenExpr> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, sqlBetweenExpr, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_between_expr")
    default List<SqlBetweenExpr> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, sqlBetweenExpr, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_between_expr")
    default Optional<SqlBetweenExpr> selectByPrimaryKey(Long oid_) {
        return selectOne(c ->
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_between_expr")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, sqlBetweenExpr, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_between_expr")
    static UpdateDSL<UpdateModel> updateAllColumns(SqlBetweenExpr record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalTo(record::getOid)
                .set(beginExprOid).equalTo(record::getBeginExprOid)
                .set(endExprOid).equalTo(record::getEndExprOid)
                .set(isNot).equalTo(record::getIsNot)
                .set(testExprOid).equalTo(record::getTestExprOid);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_between_expr")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(SqlBetweenExpr record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalToWhenPresent(record::getOid)
                .set(beginExprOid).equalToWhenPresent(record::getBeginExprOid)
                .set(endExprOid).equalToWhenPresent(record::getEndExprOid)
                .set(isNot).equalToWhenPresent(record::getIsNot)
                .set(testExprOid).equalToWhenPresent(record::getTestExprOid);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_between_expr")
    default int updateByPrimaryKey(SqlBetweenExpr record) {
        return update(c ->
            c.set(beginExprOid).equalTo(record::getBeginExprOid)
            .set(endExprOid).equalTo(record::getEndExprOid)
            .set(isNot).equalTo(record::getIsNot)
            .set(testExprOid).equalTo(record::getTestExprOid)
            .where(oid, isEqualTo(record::getOid))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_between_expr")
    default int updateByPrimaryKeySelective(SqlBetweenExpr record) {
        return update(c ->
            c.set(beginExprOid).equalToWhenPresent(record::getBeginExprOid)
            .set(endExprOid).equalToWhenPresent(record::getEndExprOid)
            .set(isNot).equalToWhenPresent(record::getIsNot)
            .set(testExprOid).equalToWhenPresent(record::getTestExprOid)
            .where(oid, isEqualTo(record::getOid))
        );
    }
}