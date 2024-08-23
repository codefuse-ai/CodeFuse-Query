package com.alipay.codequery.dal.mybatis.mapper;

import static com.alipay.codequery.dal.mybatis.mapper.SqlExprTableSourceDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.alipay.codequery.dal.mybatis.domain.SqlExprTableSource;
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
public interface SqlExprTableSourceMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_expr_table_source")
    BasicColumn[] selectList = BasicColumn.columnList(oid, catalog, exprOid, nameOid, partitionSize, samplingOid, schema, schemaObject, tableName);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_expr_table_source")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_expr_table_source")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_expr_table_source")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<SqlExprTableSource> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_expr_table_source")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<SqlExprTableSource> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_expr_table_source")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="catalog", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="expr_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="name_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="partition_size", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="sampling_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="schema", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="schema_object", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="table_name", javaType=String.class, jdbcType=JdbcType.VARCHAR)
    })
    Optional<SqlExprTableSource> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_expr_table_source")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="catalog", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="expr_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="name_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="partition_size", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="sampling_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="schema", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="schema_object", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="table_name", javaType=String.class, jdbcType=JdbcType.VARCHAR)
    })
    List<SqlExprTableSource> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_expr_table_source")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_expr_table_source")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, sqlExprTableSource, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_expr_table_source")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, sqlExprTableSource, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_expr_table_source")
    default int deleteByPrimaryKey(Long oid_) {
        return delete(c -> 
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_expr_table_source")
    default int insert(SqlExprTableSource record) {
        return MyBatis3Utils.insert(this::insert, record, sqlExprTableSource, c ->
            c.map(oid).toProperty("oid")
            .map(catalog).toProperty("catalog")
            .map(exprOid).toProperty("exprOid")
            .map(nameOid).toProperty("nameOid")
            .map(partitionSize).toProperty("partitionSize")
            .map(samplingOid).toProperty("samplingOid")
            .map(schema).toProperty("schema")
            .map(schemaObject).toProperty("schemaObject")
            .map(tableName).toProperty("tableName")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_expr_table_source")
    default int insertMultiple(Collection<SqlExprTableSource> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, sqlExprTableSource, c ->
            c.map(oid).toProperty("oid")
            .map(catalog).toProperty("catalog")
            .map(exprOid).toProperty("exprOid")
            .map(nameOid).toProperty("nameOid")
            .map(partitionSize).toProperty("partitionSize")
            .map(samplingOid).toProperty("samplingOid")
            .map(schema).toProperty("schema")
            .map(schemaObject).toProperty("schemaObject")
            .map(tableName).toProperty("tableName")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_expr_table_source")
    default int insertSelective(SqlExprTableSource record) {
        return MyBatis3Utils.insert(this::insert, record, sqlExprTableSource, c ->
            c.map(oid).toPropertyWhenPresent("oid", record::getOid)
            .map(catalog).toPropertyWhenPresent("catalog", record::getCatalog)
            .map(exprOid).toPropertyWhenPresent("exprOid", record::getExprOid)
            .map(nameOid).toPropertyWhenPresent("nameOid", record::getNameOid)
            .map(partitionSize).toPropertyWhenPresent("partitionSize", record::getPartitionSize)
            .map(samplingOid).toPropertyWhenPresent("samplingOid", record::getSamplingOid)
            .map(schema).toPropertyWhenPresent("schema", record::getSchema)
            .map(schemaObject).toPropertyWhenPresent("schemaObject", record::getSchemaObject)
            .map(tableName).toPropertyWhenPresent("tableName", record::getTableName)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_expr_table_source")
    default Optional<SqlExprTableSource> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, sqlExprTableSource, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_expr_table_source")
    default List<SqlExprTableSource> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, sqlExprTableSource, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_expr_table_source")
    default List<SqlExprTableSource> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, sqlExprTableSource, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_expr_table_source")
    default Optional<SqlExprTableSource> selectByPrimaryKey(Long oid_) {
        return selectOne(c ->
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_expr_table_source")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, sqlExprTableSource, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_expr_table_source")
    static UpdateDSL<UpdateModel> updateAllColumns(SqlExprTableSource record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalTo(record::getOid)
                .set(catalog).equalTo(record::getCatalog)
                .set(exprOid).equalTo(record::getExprOid)
                .set(nameOid).equalTo(record::getNameOid)
                .set(partitionSize).equalTo(record::getPartitionSize)
                .set(samplingOid).equalTo(record::getSamplingOid)
                .set(schema).equalTo(record::getSchema)
                .set(schemaObject).equalTo(record::getSchemaObject)
                .set(tableName).equalTo(record::getTableName);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_expr_table_source")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(SqlExprTableSource record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalToWhenPresent(record::getOid)
                .set(catalog).equalToWhenPresent(record::getCatalog)
                .set(exprOid).equalToWhenPresent(record::getExprOid)
                .set(nameOid).equalToWhenPresent(record::getNameOid)
                .set(partitionSize).equalToWhenPresent(record::getPartitionSize)
                .set(samplingOid).equalToWhenPresent(record::getSamplingOid)
                .set(schema).equalToWhenPresent(record::getSchema)
                .set(schemaObject).equalToWhenPresent(record::getSchemaObject)
                .set(tableName).equalToWhenPresent(record::getTableName);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_expr_table_source")
    default int updateByPrimaryKey(SqlExprTableSource record) {
        return update(c ->
            c.set(catalog).equalTo(record::getCatalog)
            .set(exprOid).equalTo(record::getExprOid)
            .set(nameOid).equalTo(record::getNameOid)
            .set(partitionSize).equalTo(record::getPartitionSize)
            .set(samplingOid).equalTo(record::getSamplingOid)
            .set(schema).equalTo(record::getSchema)
            .set(schemaObject).equalTo(record::getSchemaObject)
            .set(tableName).equalTo(record::getTableName)
            .where(oid, isEqualTo(record::getOid))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_expr_table_source")
    default int updateByPrimaryKeySelective(SqlExprTableSource record) {
        return update(c ->
            c.set(catalog).equalToWhenPresent(record::getCatalog)
            .set(exprOid).equalToWhenPresent(record::getExprOid)
            .set(nameOid).equalToWhenPresent(record::getNameOid)
            .set(partitionSize).equalToWhenPresent(record::getPartitionSize)
            .set(samplingOid).equalToWhenPresent(record::getSamplingOid)
            .set(schema).equalToWhenPresent(record::getSchema)
            .set(schemaObject).equalToWhenPresent(record::getSchemaObject)
            .set(tableName).equalToWhenPresent(record::getTableName)
            .where(oid, isEqualTo(record::getOid))
        );
    }
}