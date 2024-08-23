package com.alipay.codequery.dal.mybatis.mapper;

import static com.alipay.codequery.dal.mybatis.mapper.SqlDeleteStatementDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.alipay.codequery.dal.mybatis.domain.SqlDeleteStatement;
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
public interface SqlDeleteStatementMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_delete_statement")
    BasicColumn[] selectList = BasicColumn.columnList(oid, alias, exprTableSourceOid, fromOid, isOnly, tableNameOid, tableSourceOid, usingOid, whereOid, withOid);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_delete_statement")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_delete_statement")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_delete_statement")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<SqlDeleteStatement> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_delete_statement")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<SqlDeleteStatement> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_delete_statement")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="alias", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="expr_table_source_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="from_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_only", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="table_name_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="table_source_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="using_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="where_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="with_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT)
    })
    Optional<SqlDeleteStatement> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_delete_statement")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="alias", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="expr_table_source_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="from_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_only", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="table_name_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="table_source_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="using_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="where_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="with_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT)
    })
    List<SqlDeleteStatement> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_delete_statement")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_delete_statement")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, sqlDeleteStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_delete_statement")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, sqlDeleteStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_delete_statement")
    default int deleteByPrimaryKey(Long oid_) {
        return delete(c -> 
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_delete_statement")
    default int insert(SqlDeleteStatement record) {
        return MyBatis3Utils.insert(this::insert, record, sqlDeleteStatement, c ->
            c.map(oid).toProperty("oid")
            .map(alias).toProperty("alias")
            .map(exprTableSourceOid).toProperty("exprTableSourceOid")
            .map(fromOid).toProperty("fromOid")
            .map(isOnly).toProperty("isOnly")
            .map(tableNameOid).toProperty("tableNameOid")
            .map(tableSourceOid).toProperty("tableSourceOid")
            .map(usingOid).toProperty("usingOid")
            .map(whereOid).toProperty("whereOid")
            .map(withOid).toProperty("withOid")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_delete_statement")
    default int insertMultiple(Collection<SqlDeleteStatement> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, sqlDeleteStatement, c ->
            c.map(oid).toProperty("oid")
            .map(alias).toProperty("alias")
            .map(exprTableSourceOid).toProperty("exprTableSourceOid")
            .map(fromOid).toProperty("fromOid")
            .map(isOnly).toProperty("isOnly")
            .map(tableNameOid).toProperty("tableNameOid")
            .map(tableSourceOid).toProperty("tableSourceOid")
            .map(usingOid).toProperty("usingOid")
            .map(whereOid).toProperty("whereOid")
            .map(withOid).toProperty("withOid")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_delete_statement")
    default int insertSelective(SqlDeleteStatement record) {
        return MyBatis3Utils.insert(this::insert, record, sqlDeleteStatement, c ->
            c.map(oid).toPropertyWhenPresent("oid", record::getOid)
            .map(alias).toPropertyWhenPresent("alias", record::getAlias)
            .map(exprTableSourceOid).toPropertyWhenPresent("exprTableSourceOid", record::getExprTableSourceOid)
            .map(fromOid).toPropertyWhenPresent("fromOid", record::getFromOid)
            .map(isOnly).toPropertyWhenPresent("isOnly", record::getIsOnly)
            .map(tableNameOid).toPropertyWhenPresent("tableNameOid", record::getTableNameOid)
            .map(tableSourceOid).toPropertyWhenPresent("tableSourceOid", record::getTableSourceOid)
            .map(usingOid).toPropertyWhenPresent("usingOid", record::getUsingOid)
            .map(whereOid).toPropertyWhenPresent("whereOid", record::getWhereOid)
            .map(withOid).toPropertyWhenPresent("withOid", record::getWithOid)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_delete_statement")
    default Optional<SqlDeleteStatement> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, sqlDeleteStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_delete_statement")
    default List<SqlDeleteStatement> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, sqlDeleteStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_delete_statement")
    default List<SqlDeleteStatement> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, sqlDeleteStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_delete_statement")
    default Optional<SqlDeleteStatement> selectByPrimaryKey(Long oid_) {
        return selectOne(c ->
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_delete_statement")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, sqlDeleteStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_delete_statement")
    static UpdateDSL<UpdateModel> updateAllColumns(SqlDeleteStatement record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalTo(record::getOid)
                .set(alias).equalTo(record::getAlias)
                .set(exprTableSourceOid).equalTo(record::getExprTableSourceOid)
                .set(fromOid).equalTo(record::getFromOid)
                .set(isOnly).equalTo(record::getIsOnly)
                .set(tableNameOid).equalTo(record::getTableNameOid)
                .set(tableSourceOid).equalTo(record::getTableSourceOid)
                .set(usingOid).equalTo(record::getUsingOid)
                .set(whereOid).equalTo(record::getWhereOid)
                .set(withOid).equalTo(record::getWithOid);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_delete_statement")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(SqlDeleteStatement record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalToWhenPresent(record::getOid)
                .set(alias).equalToWhenPresent(record::getAlias)
                .set(exprTableSourceOid).equalToWhenPresent(record::getExprTableSourceOid)
                .set(fromOid).equalToWhenPresent(record::getFromOid)
                .set(isOnly).equalToWhenPresent(record::getIsOnly)
                .set(tableNameOid).equalToWhenPresent(record::getTableNameOid)
                .set(tableSourceOid).equalToWhenPresent(record::getTableSourceOid)
                .set(usingOid).equalToWhenPresent(record::getUsingOid)
                .set(whereOid).equalToWhenPresent(record::getWhereOid)
                .set(withOid).equalToWhenPresent(record::getWithOid);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_delete_statement")
    default int updateByPrimaryKey(SqlDeleteStatement record) {
        return update(c ->
            c.set(alias).equalTo(record::getAlias)
            .set(exprTableSourceOid).equalTo(record::getExprTableSourceOid)
            .set(fromOid).equalTo(record::getFromOid)
            .set(isOnly).equalTo(record::getIsOnly)
            .set(tableNameOid).equalTo(record::getTableNameOid)
            .set(tableSourceOid).equalTo(record::getTableSourceOid)
            .set(usingOid).equalTo(record::getUsingOid)
            .set(whereOid).equalTo(record::getWhereOid)
            .set(withOid).equalTo(record::getWithOid)
            .where(oid, isEqualTo(record::getOid))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_delete_statement")
    default int updateByPrimaryKeySelective(SqlDeleteStatement record) {
        return update(c ->
            c.set(alias).equalToWhenPresent(record::getAlias)
            .set(exprTableSourceOid).equalToWhenPresent(record::getExprTableSourceOid)
            .set(fromOid).equalToWhenPresent(record::getFromOid)
            .set(isOnly).equalToWhenPresent(record::getIsOnly)
            .set(tableNameOid).equalToWhenPresent(record::getTableNameOid)
            .set(tableSourceOid).equalToWhenPresent(record::getTableSourceOid)
            .set(usingOid).equalToWhenPresent(record::getUsingOid)
            .set(whereOid).equalToWhenPresent(record::getWhereOid)
            .set(withOid).equalToWhenPresent(record::getWithOid)
            .where(oid, isEqualTo(record::getOid))
        );
    }
}