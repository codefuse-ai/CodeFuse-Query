package com.alipay.codequery.dal.mybatis.mapper;

import static com.alipay.codequery.dal.mybatis.mapper.SqlMethodInvokeExprDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.alipay.codequery.dal.mybatis.domain.SqlMethodInvokeExpr;
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
public interface SqlMethodInvokeExprMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_method_invoke_expr")
    BasicColumn[] selectList = BasicColumn.columnList(oid, forOid, fromOid, methodName, ownerOid, resolvedReturnDataTypeOid, trimOption, usingOid);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_method_invoke_expr")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_method_invoke_expr")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_method_invoke_expr")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<SqlMethodInvokeExpr> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_method_invoke_expr")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<SqlMethodInvokeExpr> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_method_invoke_expr")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="for_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="from_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="method_name", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="owner_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="resolved_return_data_type_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="trim_option", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="using_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT)
    })
    Optional<SqlMethodInvokeExpr> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_method_invoke_expr")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="for_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="from_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="method_name", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="owner_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="resolved_return_data_type_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="trim_option", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="using_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT)
    })
    List<SqlMethodInvokeExpr> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_method_invoke_expr")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_method_invoke_expr")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, sqlMethodInvokeExpr, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_method_invoke_expr")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, sqlMethodInvokeExpr, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_method_invoke_expr")
    default int deleteByPrimaryKey(Long oid_) {
        return delete(c -> 
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_method_invoke_expr")
    default int insert(SqlMethodInvokeExpr record) {
        return MyBatis3Utils.insert(this::insert, record, sqlMethodInvokeExpr, c ->
            c.map(oid).toProperty("oid")
            .map(forOid).toProperty("forOid")
            .map(fromOid).toProperty("fromOid")
            .map(methodName).toProperty("methodName")
            .map(ownerOid).toProperty("ownerOid")
            .map(resolvedReturnDataTypeOid).toProperty("resolvedReturnDataTypeOid")
            .map(trimOption).toProperty("trimOption")
            .map(usingOid).toProperty("usingOid")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_method_invoke_expr")
    default int insertMultiple(Collection<SqlMethodInvokeExpr> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, sqlMethodInvokeExpr, c ->
            c.map(oid).toProperty("oid")
            .map(forOid).toProperty("forOid")
            .map(fromOid).toProperty("fromOid")
            .map(methodName).toProperty("methodName")
            .map(ownerOid).toProperty("ownerOid")
            .map(resolvedReturnDataTypeOid).toProperty("resolvedReturnDataTypeOid")
            .map(trimOption).toProperty("trimOption")
            .map(usingOid).toProperty("usingOid")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_method_invoke_expr")
    default int insertSelective(SqlMethodInvokeExpr record) {
        return MyBatis3Utils.insert(this::insert, record, sqlMethodInvokeExpr, c ->
            c.map(oid).toPropertyWhenPresent("oid", record::getOid)
            .map(forOid).toPropertyWhenPresent("forOid", record::getForOid)
            .map(fromOid).toPropertyWhenPresent("fromOid", record::getFromOid)
            .map(methodName).toPropertyWhenPresent("methodName", record::getMethodName)
            .map(ownerOid).toPropertyWhenPresent("ownerOid", record::getOwnerOid)
            .map(resolvedReturnDataTypeOid).toPropertyWhenPresent("resolvedReturnDataTypeOid", record::getResolvedReturnDataTypeOid)
            .map(trimOption).toPropertyWhenPresent("trimOption", record::getTrimOption)
            .map(usingOid).toPropertyWhenPresent("usingOid", record::getUsingOid)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_method_invoke_expr")
    default Optional<SqlMethodInvokeExpr> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, sqlMethodInvokeExpr, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_method_invoke_expr")
    default List<SqlMethodInvokeExpr> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, sqlMethodInvokeExpr, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_method_invoke_expr")
    default List<SqlMethodInvokeExpr> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, sqlMethodInvokeExpr, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_method_invoke_expr")
    default Optional<SqlMethodInvokeExpr> selectByPrimaryKey(Long oid_) {
        return selectOne(c ->
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_method_invoke_expr")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, sqlMethodInvokeExpr, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_method_invoke_expr")
    static UpdateDSL<UpdateModel> updateAllColumns(SqlMethodInvokeExpr record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalTo(record::getOid)
                .set(forOid).equalTo(record::getForOid)
                .set(fromOid).equalTo(record::getFromOid)
                .set(methodName).equalTo(record::getMethodName)
                .set(ownerOid).equalTo(record::getOwnerOid)
                .set(resolvedReturnDataTypeOid).equalTo(record::getResolvedReturnDataTypeOid)
                .set(trimOption).equalTo(record::getTrimOption)
                .set(usingOid).equalTo(record::getUsingOid);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_method_invoke_expr")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(SqlMethodInvokeExpr record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalToWhenPresent(record::getOid)
                .set(forOid).equalToWhenPresent(record::getForOid)
                .set(fromOid).equalToWhenPresent(record::getFromOid)
                .set(methodName).equalToWhenPresent(record::getMethodName)
                .set(ownerOid).equalToWhenPresent(record::getOwnerOid)
                .set(resolvedReturnDataTypeOid).equalToWhenPresent(record::getResolvedReturnDataTypeOid)
                .set(trimOption).equalToWhenPresent(record::getTrimOption)
                .set(usingOid).equalToWhenPresent(record::getUsingOid);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_method_invoke_expr")
    default int updateByPrimaryKey(SqlMethodInvokeExpr record) {
        return update(c ->
            c.set(forOid).equalTo(record::getForOid)
            .set(fromOid).equalTo(record::getFromOid)
            .set(methodName).equalTo(record::getMethodName)
            .set(ownerOid).equalTo(record::getOwnerOid)
            .set(resolvedReturnDataTypeOid).equalTo(record::getResolvedReturnDataTypeOid)
            .set(trimOption).equalTo(record::getTrimOption)
            .set(usingOid).equalTo(record::getUsingOid)
            .where(oid, isEqualTo(record::getOid))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_method_invoke_expr")
    default int updateByPrimaryKeySelective(SqlMethodInvokeExpr record) {
        return update(c ->
            c.set(forOid).equalToWhenPresent(record::getForOid)
            .set(fromOid).equalToWhenPresent(record::getFromOid)
            .set(methodName).equalToWhenPresent(record::getMethodName)
            .set(ownerOid).equalToWhenPresent(record::getOwnerOid)
            .set(resolvedReturnDataTypeOid).equalToWhenPresent(record::getResolvedReturnDataTypeOid)
            .set(trimOption).equalToWhenPresent(record::getTrimOption)
            .set(usingOid).equalToWhenPresent(record::getUsingOid)
            .where(oid, isEqualTo(record::getOid))
        );
    }
}