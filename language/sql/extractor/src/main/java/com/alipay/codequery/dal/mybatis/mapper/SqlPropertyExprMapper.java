package com.alipay.codequery.dal.mybatis.mapper;

import static com.alipay.codequery.dal.mybatis.mapper.SqlPropertyExprDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.alipay.codequery.dal.mybatis.domain.SqlPropertyExpr;
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
public interface SqlPropertyExprMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_property_expr")
    BasicColumn[] selectList = BasicColumn.columnList(oid, name, ownerOid, ownerName, resolvedColumnOid, resolvedOwnerObject, resolvedProcudureOid, resolvedTableSourceOid, simpleName);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_property_expr")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_property_expr")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_property_expr")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<SqlPropertyExpr> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_property_expr")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<SqlPropertyExpr> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_property_expr")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="name", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="owner_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="owner_name", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="resolved_column_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="resolved_owner_object", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="resolved_procudure_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="resolved_table_source_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="simple_name", javaType=String.class, jdbcType=JdbcType.VARCHAR)
    })
    Optional<SqlPropertyExpr> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_property_expr")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="name", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="owner_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="owner_name", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="resolved_column_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="resolved_owner_object", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="resolved_procudure_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="resolved_table_source_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="simple_name", javaType=String.class, jdbcType=JdbcType.VARCHAR)
    })
    List<SqlPropertyExpr> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_property_expr")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_property_expr")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, sqlPropertyExpr, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_property_expr")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, sqlPropertyExpr, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_property_expr")
    default int deleteByPrimaryKey(Long oid_) {
        return delete(c -> 
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_property_expr")
    default int insert(SqlPropertyExpr record) {
        return MyBatis3Utils.insert(this::insert, record, sqlPropertyExpr, c ->
            c.map(oid).toProperty("oid")
            .map(name).toProperty("name")
            .map(ownerOid).toProperty("ownerOid")
            .map(ownerName).toProperty("ownerName")
            .map(resolvedColumnOid).toProperty("resolvedColumnOid")
            .map(resolvedOwnerObject).toProperty("resolvedOwnerObject")
            .map(resolvedProcudureOid).toProperty("resolvedProcudureOid")
            .map(resolvedTableSourceOid).toProperty("resolvedTableSourceOid")
            .map(simpleName).toProperty("simpleName")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_property_expr")
    default int insertMultiple(Collection<SqlPropertyExpr> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, sqlPropertyExpr, c ->
            c.map(oid).toProperty("oid")
            .map(name).toProperty("name")
            .map(ownerOid).toProperty("ownerOid")
            .map(ownerName).toProperty("ownerName")
            .map(resolvedColumnOid).toProperty("resolvedColumnOid")
            .map(resolvedOwnerObject).toProperty("resolvedOwnerObject")
            .map(resolvedProcudureOid).toProperty("resolvedProcudureOid")
            .map(resolvedTableSourceOid).toProperty("resolvedTableSourceOid")
            .map(simpleName).toProperty("simpleName")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_property_expr")
    default int insertSelective(SqlPropertyExpr record) {
        return MyBatis3Utils.insert(this::insert, record, sqlPropertyExpr, c ->
            c.map(oid).toPropertyWhenPresent("oid", record::getOid)
            .map(name).toPropertyWhenPresent("name", record::getName)
            .map(ownerOid).toPropertyWhenPresent("ownerOid", record::getOwnerOid)
            .map(ownerName).toPropertyWhenPresent("ownerName", record::getOwnerName)
            .map(resolvedColumnOid).toPropertyWhenPresent("resolvedColumnOid", record::getResolvedColumnOid)
            .map(resolvedOwnerObject).toPropertyWhenPresent("resolvedOwnerObject", record::getResolvedOwnerObject)
            .map(resolvedProcudureOid).toPropertyWhenPresent("resolvedProcudureOid", record::getResolvedProcudureOid)
            .map(resolvedTableSourceOid).toPropertyWhenPresent("resolvedTableSourceOid", record::getResolvedTableSourceOid)
            .map(simpleName).toPropertyWhenPresent("simpleName", record::getSimpleName)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_property_expr")
    default Optional<SqlPropertyExpr> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, sqlPropertyExpr, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_property_expr")
    default List<SqlPropertyExpr> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, sqlPropertyExpr, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_property_expr")
    default List<SqlPropertyExpr> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, sqlPropertyExpr, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_property_expr")
    default Optional<SqlPropertyExpr> selectByPrimaryKey(Long oid_) {
        return selectOne(c ->
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_property_expr")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, sqlPropertyExpr, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_property_expr")
    static UpdateDSL<UpdateModel> updateAllColumns(SqlPropertyExpr record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalTo(record::getOid)
                .set(name).equalTo(record::getName)
                .set(ownerOid).equalTo(record::getOwnerOid)
                .set(ownerName).equalTo(record::getOwnerName)
                .set(resolvedColumnOid).equalTo(record::getResolvedColumnOid)
                .set(resolvedOwnerObject).equalTo(record::getResolvedOwnerObject)
                .set(resolvedProcudureOid).equalTo(record::getResolvedProcudureOid)
                .set(resolvedTableSourceOid).equalTo(record::getResolvedTableSourceOid)
                .set(simpleName).equalTo(record::getSimpleName);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_property_expr")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(SqlPropertyExpr record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalToWhenPresent(record::getOid)
                .set(name).equalToWhenPresent(record::getName)
                .set(ownerOid).equalToWhenPresent(record::getOwnerOid)
                .set(ownerName).equalToWhenPresent(record::getOwnerName)
                .set(resolvedColumnOid).equalToWhenPresent(record::getResolvedColumnOid)
                .set(resolvedOwnerObject).equalToWhenPresent(record::getResolvedOwnerObject)
                .set(resolvedProcudureOid).equalToWhenPresent(record::getResolvedProcudureOid)
                .set(resolvedTableSourceOid).equalToWhenPresent(record::getResolvedTableSourceOid)
                .set(simpleName).equalToWhenPresent(record::getSimpleName);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_property_expr")
    default int updateByPrimaryKey(SqlPropertyExpr record) {
        return update(c ->
            c.set(name).equalTo(record::getName)
            .set(ownerOid).equalTo(record::getOwnerOid)
            .set(ownerName).equalTo(record::getOwnerName)
            .set(resolvedColumnOid).equalTo(record::getResolvedColumnOid)
            .set(resolvedOwnerObject).equalTo(record::getResolvedOwnerObject)
            .set(resolvedProcudureOid).equalTo(record::getResolvedProcudureOid)
            .set(resolvedTableSourceOid).equalTo(record::getResolvedTableSourceOid)
            .set(simpleName).equalTo(record::getSimpleName)
            .where(oid, isEqualTo(record::getOid))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_property_expr")
    default int updateByPrimaryKeySelective(SqlPropertyExpr record) {
        return update(c ->
            c.set(name).equalToWhenPresent(record::getName)
            .set(ownerOid).equalToWhenPresent(record::getOwnerOid)
            .set(ownerName).equalToWhenPresent(record::getOwnerName)
            .set(resolvedColumnOid).equalToWhenPresent(record::getResolvedColumnOid)
            .set(resolvedOwnerObject).equalToWhenPresent(record::getResolvedOwnerObject)
            .set(resolvedProcudureOid).equalToWhenPresent(record::getResolvedProcudureOid)
            .set(resolvedTableSourceOid).equalToWhenPresent(record::getResolvedTableSourceOid)
            .set(simpleName).equalToWhenPresent(record::getSimpleName)
            .where(oid, isEqualTo(record::getOid))
        );
    }
}