package com.alipay.codequery.dal.mybatis.mapper;

import static com.alipay.codequery.dal.mybatis.mapper.SqlInSubQueryExprDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.alipay.codequery.dal.mybatis.domain.SqlInSubQueryExpr;
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
public interface SqlInSubQueryExprMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_in_sub_query_expr")
    BasicColumn[] selectList = BasicColumn.columnList(oid, exprOid, hintOid, isGlobal, isNot, subQueryOid);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_in_sub_query_expr")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_in_sub_query_expr")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_in_sub_query_expr")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<SqlInSubQueryExpr> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_in_sub_query_expr")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<SqlInSubQueryExpr> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_in_sub_query_expr")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="expr_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="hint_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_global", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_not", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="sub_query_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT)
    })
    Optional<SqlInSubQueryExpr> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_in_sub_query_expr")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="expr_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="hint_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_global", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_not", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="sub_query_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT)
    })
    List<SqlInSubQueryExpr> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_in_sub_query_expr")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_in_sub_query_expr")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, sqlInSubQueryExpr, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_in_sub_query_expr")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, sqlInSubQueryExpr, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_in_sub_query_expr")
    default int deleteByPrimaryKey(Long oid_) {
        return delete(c -> 
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_in_sub_query_expr")
    default int insert(SqlInSubQueryExpr record) {
        return MyBatis3Utils.insert(this::insert, record, sqlInSubQueryExpr, c ->
            c.map(oid).toProperty("oid")
            .map(exprOid).toProperty("exprOid")
            .map(hintOid).toProperty("hintOid")
            .map(isGlobal).toProperty("isGlobal")
            .map(isNot).toProperty("isNot")
            .map(subQueryOid).toProperty("subQueryOid")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_in_sub_query_expr")
    default int insertMultiple(Collection<SqlInSubQueryExpr> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, sqlInSubQueryExpr, c ->
            c.map(oid).toProperty("oid")
            .map(exprOid).toProperty("exprOid")
            .map(hintOid).toProperty("hintOid")
            .map(isGlobal).toProperty("isGlobal")
            .map(isNot).toProperty("isNot")
            .map(subQueryOid).toProperty("subQueryOid")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_in_sub_query_expr")
    default int insertSelective(SqlInSubQueryExpr record) {
        return MyBatis3Utils.insert(this::insert, record, sqlInSubQueryExpr, c ->
            c.map(oid).toPropertyWhenPresent("oid", record::getOid)
            .map(exprOid).toPropertyWhenPresent("exprOid", record::getExprOid)
            .map(hintOid).toPropertyWhenPresent("hintOid", record::getHintOid)
            .map(isGlobal).toPropertyWhenPresent("isGlobal", record::getIsGlobal)
            .map(isNot).toPropertyWhenPresent("isNot", record::getIsNot)
            .map(subQueryOid).toPropertyWhenPresent("subQueryOid", record::getSubQueryOid)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_in_sub_query_expr")
    default Optional<SqlInSubQueryExpr> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, sqlInSubQueryExpr, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_in_sub_query_expr")
    default List<SqlInSubQueryExpr> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, sqlInSubQueryExpr, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_in_sub_query_expr")
    default List<SqlInSubQueryExpr> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, sqlInSubQueryExpr, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_in_sub_query_expr")
    default Optional<SqlInSubQueryExpr> selectByPrimaryKey(Long oid_) {
        return selectOne(c ->
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_in_sub_query_expr")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, sqlInSubQueryExpr, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_in_sub_query_expr")
    static UpdateDSL<UpdateModel> updateAllColumns(SqlInSubQueryExpr record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalTo(record::getOid)
                .set(exprOid).equalTo(record::getExprOid)
                .set(hintOid).equalTo(record::getHintOid)
                .set(isGlobal).equalTo(record::getIsGlobal)
                .set(isNot).equalTo(record::getIsNot)
                .set(subQueryOid).equalTo(record::getSubQueryOid);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_in_sub_query_expr")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(SqlInSubQueryExpr record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalToWhenPresent(record::getOid)
                .set(exprOid).equalToWhenPresent(record::getExprOid)
                .set(hintOid).equalToWhenPresent(record::getHintOid)
                .set(isGlobal).equalToWhenPresent(record::getIsGlobal)
                .set(isNot).equalToWhenPresent(record::getIsNot)
                .set(subQueryOid).equalToWhenPresent(record::getSubQueryOid);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_in_sub_query_expr")
    default int updateByPrimaryKey(SqlInSubQueryExpr record) {
        return update(c ->
            c.set(exprOid).equalTo(record::getExprOid)
            .set(hintOid).equalTo(record::getHintOid)
            .set(isGlobal).equalTo(record::getIsGlobal)
            .set(isNot).equalTo(record::getIsNot)
            .set(subQueryOid).equalTo(record::getSubQueryOid)
            .where(oid, isEqualTo(record::getOid))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_in_sub_query_expr")
    default int updateByPrimaryKeySelective(SqlInSubQueryExpr record) {
        return update(c ->
            c.set(exprOid).equalToWhenPresent(record::getExprOid)
            .set(hintOid).equalToWhenPresent(record::getHintOid)
            .set(isGlobal).equalToWhenPresent(record::getIsGlobal)
            .set(isNot).equalToWhenPresent(record::getIsNot)
            .set(subQueryOid).equalToWhenPresent(record::getSubQueryOid)
            .where(oid, isEqualTo(record::getOid))
        );
    }
}