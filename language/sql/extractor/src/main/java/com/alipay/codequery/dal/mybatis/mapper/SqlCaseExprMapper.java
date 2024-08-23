package com.alipay.codequery.dal.mybatis.mapper;

import static com.alipay.codequery.dal.mybatis.mapper.SqlCaseExprDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.alipay.codequery.dal.mybatis.domain.SqlCaseExpr;
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
public interface SqlCaseExprMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_case_expr")
    BasicColumn[] selectList = BasicColumn.columnList(oid, elseExprOid, items, valueExprOid);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_case_expr")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_case_expr")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_case_expr")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<SqlCaseExpr> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_case_expr")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<SqlCaseExpr> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_case_expr")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="else_expr_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="items", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="value_expr_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT)
    })
    Optional<SqlCaseExpr> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_case_expr")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="else_expr_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="items", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="value_expr_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT)
    })
    List<SqlCaseExpr> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_case_expr")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_case_expr")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, sqlCaseExpr, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_case_expr")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, sqlCaseExpr, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_case_expr")
    default int deleteByPrimaryKey(Long oid_) {
        return delete(c -> 
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_case_expr")
    default int insert(SqlCaseExpr record) {
        return MyBatis3Utils.insert(this::insert, record, sqlCaseExpr, c ->
            c.map(oid).toProperty("oid")
            .map(elseExprOid).toProperty("elseExprOid")
            .map(items).toProperty("items")
            .map(valueExprOid).toProperty("valueExprOid")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_case_expr")
    default int insertMultiple(Collection<SqlCaseExpr> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, sqlCaseExpr, c ->
            c.map(oid).toProperty("oid")
            .map(elseExprOid).toProperty("elseExprOid")
            .map(items).toProperty("items")
            .map(valueExprOid).toProperty("valueExprOid")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_case_expr")
    default int insertSelective(SqlCaseExpr record) {
        return MyBatis3Utils.insert(this::insert, record, sqlCaseExpr, c ->
            c.map(oid).toPropertyWhenPresent("oid", record::getOid)
            .map(elseExprOid).toPropertyWhenPresent("elseExprOid", record::getElseExprOid)
            .map(items).toPropertyWhenPresent("items", record::getItems)
            .map(valueExprOid).toPropertyWhenPresent("valueExprOid", record::getValueExprOid)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_case_expr")
    default Optional<SqlCaseExpr> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, sqlCaseExpr, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_case_expr")
    default List<SqlCaseExpr> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, sqlCaseExpr, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_case_expr")
    default List<SqlCaseExpr> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, sqlCaseExpr, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_case_expr")
    default Optional<SqlCaseExpr> selectByPrimaryKey(Long oid_) {
        return selectOne(c ->
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_case_expr")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, sqlCaseExpr, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_case_expr")
    static UpdateDSL<UpdateModel> updateAllColumns(SqlCaseExpr record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalTo(record::getOid)
                .set(elseExprOid).equalTo(record::getElseExprOid)
                .set(items).equalTo(record::getItems)
                .set(valueExprOid).equalTo(record::getValueExprOid);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_case_expr")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(SqlCaseExpr record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalToWhenPresent(record::getOid)
                .set(elseExprOid).equalToWhenPresent(record::getElseExprOid)
                .set(items).equalToWhenPresent(record::getItems)
                .set(valueExprOid).equalToWhenPresent(record::getValueExprOid);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_case_expr")
    default int updateByPrimaryKey(SqlCaseExpr record) {
        return update(c ->
            c.set(elseExprOid).equalTo(record::getElseExprOid)
            .set(items).equalTo(record::getItems)
            .set(valueExprOid).equalTo(record::getValueExprOid)
            .where(oid, isEqualTo(record::getOid))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_case_expr")
    default int updateByPrimaryKeySelective(SqlCaseExpr record) {
        return update(c ->
            c.set(elseExprOid).equalToWhenPresent(record::getElseExprOid)
            .set(items).equalToWhenPresent(record::getItems)
            .set(valueExprOid).equalToWhenPresent(record::getValueExprOid)
            .where(oid, isEqualTo(record::getOid))
        );
    }
}