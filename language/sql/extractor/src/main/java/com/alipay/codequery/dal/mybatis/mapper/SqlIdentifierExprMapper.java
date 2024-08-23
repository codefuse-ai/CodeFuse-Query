package com.alipay.codequery.dal.mybatis.mapper;

import static com.alipay.codequery.dal.mybatis.mapper.SqlIdentifierExprDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.alipay.codequery.dal.mybatis.domain.SqlIdentifierExpr;
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
public interface SqlIdentifierExprMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_identifier_expr")
    BasicColumn[] selectList = BasicColumn.columnList(oid, lowerName, name, resolvedColumnObject, resolvedColumnOid, resolvedDeclareItemOid, resolvedOwnerObject, resolvedParameterOid, resolvedSelectItemOid, resolvedTableSourceOid, simpleName);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_identifier_expr")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_identifier_expr")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_identifier_expr")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<SqlIdentifierExpr> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_identifier_expr")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<SqlIdentifierExpr> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_identifier_expr")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="lower_name", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="name", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="resolved_column_object", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="resolved_column_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="resolved_declare_item_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="resolved_owner_object", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="resolved_parameter_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="resolved_select_item_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="resolved_table_source_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="simple_name", javaType=String.class, jdbcType=JdbcType.VARCHAR)
    })
    Optional<SqlIdentifierExpr> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_identifier_expr")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="lower_name", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="name", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="resolved_column_object", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="resolved_column_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="resolved_declare_item_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="resolved_owner_object", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="resolved_parameter_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="resolved_select_item_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="resolved_table_source_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="simple_name", javaType=String.class, jdbcType=JdbcType.VARCHAR)
    })
    List<SqlIdentifierExpr> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_identifier_expr")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_identifier_expr")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, sqlIdentifierExpr, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_identifier_expr")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, sqlIdentifierExpr, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_identifier_expr")
    default int deleteByPrimaryKey(Long oid_) {
        return delete(c -> 
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_identifier_expr")
    default int insert(SqlIdentifierExpr record) {
        return MyBatis3Utils.insert(this::insert, record, sqlIdentifierExpr, c ->
            c.map(oid).toProperty("oid")
            .map(lowerName).toProperty("lowerName")
            .map(name).toProperty("name")
            .map(resolvedColumnObject).toProperty("resolvedColumnObject")
            .map(resolvedColumnOid).toProperty("resolvedColumnOid")
            .map(resolvedDeclareItemOid).toProperty("resolvedDeclareItemOid")
            .map(resolvedOwnerObject).toProperty("resolvedOwnerObject")
            .map(resolvedParameterOid).toProperty("resolvedParameterOid")
            .map(resolvedSelectItemOid).toProperty("resolvedSelectItemOid")
            .map(resolvedTableSourceOid).toProperty("resolvedTableSourceOid")
            .map(simpleName).toProperty("simpleName")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_identifier_expr")
    default int insertMultiple(Collection<SqlIdentifierExpr> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, sqlIdentifierExpr, c ->
            c.map(oid).toProperty("oid")
            .map(lowerName).toProperty("lowerName")
            .map(name).toProperty("name")
            .map(resolvedColumnObject).toProperty("resolvedColumnObject")
            .map(resolvedColumnOid).toProperty("resolvedColumnOid")
            .map(resolvedDeclareItemOid).toProperty("resolvedDeclareItemOid")
            .map(resolvedOwnerObject).toProperty("resolvedOwnerObject")
            .map(resolvedParameterOid).toProperty("resolvedParameterOid")
            .map(resolvedSelectItemOid).toProperty("resolvedSelectItemOid")
            .map(resolvedTableSourceOid).toProperty("resolvedTableSourceOid")
            .map(simpleName).toProperty("simpleName")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_identifier_expr")
    default int insertSelective(SqlIdentifierExpr record) {
        return MyBatis3Utils.insert(this::insert, record, sqlIdentifierExpr, c ->
            c.map(oid).toPropertyWhenPresent("oid", record::getOid)
            .map(lowerName).toPropertyWhenPresent("lowerName", record::getLowerName)
            .map(name).toPropertyWhenPresent("name", record::getName)
            .map(resolvedColumnObject).toPropertyWhenPresent("resolvedColumnObject", record::getResolvedColumnObject)
            .map(resolvedColumnOid).toPropertyWhenPresent("resolvedColumnOid", record::getResolvedColumnOid)
            .map(resolvedDeclareItemOid).toPropertyWhenPresent("resolvedDeclareItemOid", record::getResolvedDeclareItemOid)
            .map(resolvedOwnerObject).toPropertyWhenPresent("resolvedOwnerObject", record::getResolvedOwnerObject)
            .map(resolvedParameterOid).toPropertyWhenPresent("resolvedParameterOid", record::getResolvedParameterOid)
            .map(resolvedSelectItemOid).toPropertyWhenPresent("resolvedSelectItemOid", record::getResolvedSelectItemOid)
            .map(resolvedTableSourceOid).toPropertyWhenPresent("resolvedTableSourceOid", record::getResolvedTableSourceOid)
            .map(simpleName).toPropertyWhenPresent("simpleName", record::getSimpleName)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_identifier_expr")
    default Optional<SqlIdentifierExpr> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, sqlIdentifierExpr, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_identifier_expr")
    default List<SqlIdentifierExpr> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, sqlIdentifierExpr, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_identifier_expr")
    default List<SqlIdentifierExpr> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, sqlIdentifierExpr, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_identifier_expr")
    default Optional<SqlIdentifierExpr> selectByPrimaryKey(Long oid_) {
        return selectOne(c ->
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_identifier_expr")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, sqlIdentifierExpr, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_identifier_expr")
    static UpdateDSL<UpdateModel> updateAllColumns(SqlIdentifierExpr record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalTo(record::getOid)
                .set(lowerName).equalTo(record::getLowerName)
                .set(name).equalTo(record::getName)
                .set(resolvedColumnObject).equalTo(record::getResolvedColumnObject)
                .set(resolvedColumnOid).equalTo(record::getResolvedColumnOid)
                .set(resolvedDeclareItemOid).equalTo(record::getResolvedDeclareItemOid)
                .set(resolvedOwnerObject).equalTo(record::getResolvedOwnerObject)
                .set(resolvedParameterOid).equalTo(record::getResolvedParameterOid)
                .set(resolvedSelectItemOid).equalTo(record::getResolvedSelectItemOid)
                .set(resolvedTableSourceOid).equalTo(record::getResolvedTableSourceOid)
                .set(simpleName).equalTo(record::getSimpleName);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_identifier_expr")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(SqlIdentifierExpr record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalToWhenPresent(record::getOid)
                .set(lowerName).equalToWhenPresent(record::getLowerName)
                .set(name).equalToWhenPresent(record::getName)
                .set(resolvedColumnObject).equalToWhenPresent(record::getResolvedColumnObject)
                .set(resolvedColumnOid).equalToWhenPresent(record::getResolvedColumnOid)
                .set(resolvedDeclareItemOid).equalToWhenPresent(record::getResolvedDeclareItemOid)
                .set(resolvedOwnerObject).equalToWhenPresent(record::getResolvedOwnerObject)
                .set(resolvedParameterOid).equalToWhenPresent(record::getResolvedParameterOid)
                .set(resolvedSelectItemOid).equalToWhenPresent(record::getResolvedSelectItemOid)
                .set(resolvedTableSourceOid).equalToWhenPresent(record::getResolvedTableSourceOid)
                .set(simpleName).equalToWhenPresent(record::getSimpleName);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_identifier_expr")
    default int updateByPrimaryKey(SqlIdentifierExpr record) {
        return update(c ->
            c.set(lowerName).equalTo(record::getLowerName)
            .set(name).equalTo(record::getName)
            .set(resolvedColumnObject).equalTo(record::getResolvedColumnObject)
            .set(resolvedColumnOid).equalTo(record::getResolvedColumnOid)
            .set(resolvedDeclareItemOid).equalTo(record::getResolvedDeclareItemOid)
            .set(resolvedOwnerObject).equalTo(record::getResolvedOwnerObject)
            .set(resolvedParameterOid).equalTo(record::getResolvedParameterOid)
            .set(resolvedSelectItemOid).equalTo(record::getResolvedSelectItemOid)
            .set(resolvedTableSourceOid).equalTo(record::getResolvedTableSourceOid)
            .set(simpleName).equalTo(record::getSimpleName)
            .where(oid, isEqualTo(record::getOid))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_identifier_expr")
    default int updateByPrimaryKeySelective(SqlIdentifierExpr record) {
        return update(c ->
            c.set(lowerName).equalToWhenPresent(record::getLowerName)
            .set(name).equalToWhenPresent(record::getName)
            .set(resolvedColumnObject).equalToWhenPresent(record::getResolvedColumnObject)
            .set(resolvedColumnOid).equalToWhenPresent(record::getResolvedColumnOid)
            .set(resolvedDeclareItemOid).equalToWhenPresent(record::getResolvedDeclareItemOid)
            .set(resolvedOwnerObject).equalToWhenPresent(record::getResolvedOwnerObject)
            .set(resolvedParameterOid).equalToWhenPresent(record::getResolvedParameterOid)
            .set(resolvedSelectItemOid).equalToWhenPresent(record::getResolvedSelectItemOid)
            .set(resolvedTableSourceOid).equalToWhenPresent(record::getResolvedTableSourceOid)
            .set(simpleName).equalToWhenPresent(record::getSimpleName)
            .where(oid, isEqualTo(record::getOid))
        );
    }
}