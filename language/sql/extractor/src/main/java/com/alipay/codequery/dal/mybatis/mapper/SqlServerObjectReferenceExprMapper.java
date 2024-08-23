package com.alipay.codequery.dal.mybatis.mapper;

import static com.alipay.codequery.dal.mybatis.mapper.SqlServerObjectReferenceExprDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.alipay.codequery.dal.mybatis.domain.SqlServerObjectReferenceExpr;
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
public interface SqlServerObjectReferenceExprMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_server_object_reference_expr")
    BasicColumn[] selectList = BasicColumn.columnList(oid, database, resolvedColumnOid, schema, server, simpleName);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_server_object_reference_expr")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_server_object_reference_expr")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_server_object_reference_expr")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<SqlServerObjectReferenceExpr> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_server_object_reference_expr")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<SqlServerObjectReferenceExpr> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_server_object_reference_expr")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="database", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="resolved_column_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="schema", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="server", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="simple_name", javaType=String.class, jdbcType=JdbcType.VARCHAR)
    })
    Optional<SqlServerObjectReferenceExpr> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_server_object_reference_expr")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="database", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="resolved_column_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="schema", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="server", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="simple_name", javaType=String.class, jdbcType=JdbcType.VARCHAR)
    })
    List<SqlServerObjectReferenceExpr> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_server_object_reference_expr")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_server_object_reference_expr")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, sqlServerObjectReferenceExpr, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_server_object_reference_expr")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, sqlServerObjectReferenceExpr, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_server_object_reference_expr")
    default int deleteByPrimaryKey(Long oid_) {
        return delete(c -> 
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_server_object_reference_expr")
    default int insert(SqlServerObjectReferenceExpr record) {
        return MyBatis3Utils.insert(this::insert, record, sqlServerObjectReferenceExpr, c ->
            c.map(oid).toProperty("oid")
            .map(database).toProperty("database")
            .map(resolvedColumnOid).toProperty("resolvedColumnOid")
            .map(schema).toProperty("schema")
            .map(server).toProperty("server")
            .map(simpleName).toProperty("simpleName")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_server_object_reference_expr")
    default int insertMultiple(Collection<SqlServerObjectReferenceExpr> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, sqlServerObjectReferenceExpr, c ->
            c.map(oid).toProperty("oid")
            .map(database).toProperty("database")
            .map(resolvedColumnOid).toProperty("resolvedColumnOid")
            .map(schema).toProperty("schema")
            .map(server).toProperty("server")
            .map(simpleName).toProperty("simpleName")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_server_object_reference_expr")
    default int insertSelective(SqlServerObjectReferenceExpr record) {
        return MyBatis3Utils.insert(this::insert, record, sqlServerObjectReferenceExpr, c ->
            c.map(oid).toPropertyWhenPresent("oid", record::getOid)
            .map(database).toPropertyWhenPresent("database", record::getDatabase)
            .map(resolvedColumnOid).toPropertyWhenPresent("resolvedColumnOid", record::getResolvedColumnOid)
            .map(schema).toPropertyWhenPresent("schema", record::getSchema)
            .map(server).toPropertyWhenPresent("server", record::getServer)
            .map(simpleName).toPropertyWhenPresent("simpleName", record::getSimpleName)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_server_object_reference_expr")
    default Optional<SqlServerObjectReferenceExpr> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, sqlServerObjectReferenceExpr, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_server_object_reference_expr")
    default List<SqlServerObjectReferenceExpr> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, sqlServerObjectReferenceExpr, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_server_object_reference_expr")
    default List<SqlServerObjectReferenceExpr> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, sqlServerObjectReferenceExpr, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_server_object_reference_expr")
    default Optional<SqlServerObjectReferenceExpr> selectByPrimaryKey(Long oid_) {
        return selectOne(c ->
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_server_object_reference_expr")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, sqlServerObjectReferenceExpr, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_server_object_reference_expr")
    static UpdateDSL<UpdateModel> updateAllColumns(SqlServerObjectReferenceExpr record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalTo(record::getOid)
                .set(database).equalTo(record::getDatabase)
                .set(resolvedColumnOid).equalTo(record::getResolvedColumnOid)
                .set(schema).equalTo(record::getSchema)
                .set(server).equalTo(record::getServer)
                .set(simpleName).equalTo(record::getSimpleName);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_server_object_reference_expr")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(SqlServerObjectReferenceExpr record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalToWhenPresent(record::getOid)
                .set(database).equalToWhenPresent(record::getDatabase)
                .set(resolvedColumnOid).equalToWhenPresent(record::getResolvedColumnOid)
                .set(schema).equalToWhenPresent(record::getSchema)
                .set(server).equalToWhenPresent(record::getServer)
                .set(simpleName).equalToWhenPresent(record::getSimpleName);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_server_object_reference_expr")
    default int updateByPrimaryKey(SqlServerObjectReferenceExpr record) {
        return update(c ->
            c.set(database).equalTo(record::getDatabase)
            .set(resolvedColumnOid).equalTo(record::getResolvedColumnOid)
            .set(schema).equalTo(record::getSchema)
            .set(server).equalTo(record::getServer)
            .set(simpleName).equalTo(record::getSimpleName)
            .where(oid, isEqualTo(record::getOid))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_server_object_reference_expr")
    default int updateByPrimaryKeySelective(SqlServerObjectReferenceExpr record) {
        return update(c ->
            c.set(database).equalToWhenPresent(record::getDatabase)
            .set(resolvedColumnOid).equalToWhenPresent(record::getResolvedColumnOid)
            .set(schema).equalToWhenPresent(record::getSchema)
            .set(server).equalToWhenPresent(record::getServer)
            .set(simpleName).equalToWhenPresent(record::getSimpleName)
            .where(oid, isEqualTo(record::getOid))
        );
    }
}