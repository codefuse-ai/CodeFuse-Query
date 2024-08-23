package com.alipay.codequery.dal.mybatis.mapper;

import static com.alipay.codequery.dal.mybatis.mapper.SqlSmallIntExprDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.alipay.codequery.dal.mybatis.domain.SqlSmallIntExpr;
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
public interface SqlSmallIntExprMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_small_int_expr")
    BasicColumn[] selectList = BasicColumn.columnList(oid, number, value);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_small_int_expr")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_small_int_expr")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_small_int_expr")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<SqlSmallIntExpr> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_small_int_expr")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<SqlSmallIntExpr> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_small_int_expr")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="number", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="value", javaType=Integer.class, jdbcType=JdbcType.BIGINT)
    })
    Optional<SqlSmallIntExpr> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_small_int_expr")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="number", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="value", javaType=Integer.class, jdbcType=JdbcType.BIGINT)
    })
    List<SqlSmallIntExpr> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_small_int_expr")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_small_int_expr")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, sqlSmallIntExpr, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_small_int_expr")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, sqlSmallIntExpr, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_small_int_expr")
    default int deleteByPrimaryKey(Long oid_) {
        return delete(c -> 
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_small_int_expr")
    default int insert(SqlSmallIntExpr record) {
        return MyBatis3Utils.insert(this::insert, record, sqlSmallIntExpr, c ->
            c.map(oid).toProperty("oid")
            .map(number).toProperty("number")
            .map(value).toProperty("value")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_small_int_expr")
    default int insertMultiple(Collection<SqlSmallIntExpr> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, sqlSmallIntExpr, c ->
            c.map(oid).toProperty("oid")
            .map(number).toProperty("number")
            .map(value).toProperty("value")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_small_int_expr")
    default int insertSelective(SqlSmallIntExpr record) {
        return MyBatis3Utils.insert(this::insert, record, sqlSmallIntExpr, c ->
            c.map(oid).toPropertyWhenPresent("oid", record::getOid)
            .map(number).toPropertyWhenPresent("number", record::getNumber)
            .map(value).toPropertyWhenPresent("value", record::getValue)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_small_int_expr")
    default Optional<SqlSmallIntExpr> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, sqlSmallIntExpr, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_small_int_expr")
    default List<SqlSmallIntExpr> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, sqlSmallIntExpr, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_small_int_expr")
    default List<SqlSmallIntExpr> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, sqlSmallIntExpr, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_small_int_expr")
    default Optional<SqlSmallIntExpr> selectByPrimaryKey(Long oid_) {
        return selectOne(c ->
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_small_int_expr")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, sqlSmallIntExpr, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_small_int_expr")
    static UpdateDSL<UpdateModel> updateAllColumns(SqlSmallIntExpr record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalTo(record::getOid)
                .set(number).equalTo(record::getNumber)
                .set(value).equalTo(record::getValue);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_small_int_expr")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(SqlSmallIntExpr record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalToWhenPresent(record::getOid)
                .set(number).equalToWhenPresent(record::getNumber)
                .set(value).equalToWhenPresent(record::getValue);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_small_int_expr")
    default int updateByPrimaryKey(SqlSmallIntExpr record) {
        return update(c ->
            c.set(number).equalTo(record::getNumber)
            .set(value).equalTo(record::getValue)
            .where(oid, isEqualTo(record::getOid))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_small_int_expr")
    default int updateByPrimaryKeySelective(SqlSmallIntExpr record) {
        return update(c ->
            c.set(number).equalToWhenPresent(record::getNumber)
            .set(value).equalToWhenPresent(record::getValue)
            .where(oid, isEqualTo(record::getOid))
        );
    }
}