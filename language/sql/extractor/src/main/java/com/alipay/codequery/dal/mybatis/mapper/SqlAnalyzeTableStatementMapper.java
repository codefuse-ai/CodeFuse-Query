package com.alipay.codequery.dal.mybatis.mapper;

import static com.alipay.codequery.dal.mybatis.mapper.SqlAnalyzeTableStatementDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.alipay.codequery.dal.mybatis.domain.SqlAnalyzeTableStatement;
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
public interface SqlAnalyzeTableStatementMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_analyze_table_statement")
    BasicColumn[] selectList = BasicColumn.columnList(oid, adbSchemaOid, adbWhereOid, isCacheMetadata, isComputeStatistics, isForColums, isNoscan, partitionOid, tableOid);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_analyze_table_statement")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_analyze_table_statement")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_analyze_table_statement")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<SqlAnalyzeTableStatement> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_analyze_table_statement")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<SqlAnalyzeTableStatement> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_analyze_table_statement")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="adb_schema_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="adb_where_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_cache_metadata", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_compute_statistics", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_for_colums", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_noscan", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="partition_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="table_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT)
    })
    Optional<SqlAnalyzeTableStatement> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_analyze_table_statement")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="adb_schema_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="adb_where_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_cache_metadata", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_compute_statistics", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_for_colums", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_noscan", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="partition_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="table_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT)
    })
    List<SqlAnalyzeTableStatement> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_analyze_table_statement")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_analyze_table_statement")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, sqlAnalyzeTableStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_analyze_table_statement")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, sqlAnalyzeTableStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_analyze_table_statement")
    default int deleteByPrimaryKey(Long oid_) {
        return delete(c -> 
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_analyze_table_statement")
    default int insert(SqlAnalyzeTableStatement record) {
        return MyBatis3Utils.insert(this::insert, record, sqlAnalyzeTableStatement, c ->
            c.map(oid).toProperty("oid")
            .map(adbSchemaOid).toProperty("adbSchemaOid")
            .map(adbWhereOid).toProperty("adbWhereOid")
            .map(isCacheMetadata).toProperty("isCacheMetadata")
            .map(isComputeStatistics).toProperty("isComputeStatistics")
            .map(isForColums).toProperty("isForColums")
            .map(isNoscan).toProperty("isNoscan")
            .map(partitionOid).toProperty("partitionOid")
            .map(tableOid).toProperty("tableOid")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_analyze_table_statement")
    default int insertMultiple(Collection<SqlAnalyzeTableStatement> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, sqlAnalyzeTableStatement, c ->
            c.map(oid).toProperty("oid")
            .map(adbSchemaOid).toProperty("adbSchemaOid")
            .map(adbWhereOid).toProperty("adbWhereOid")
            .map(isCacheMetadata).toProperty("isCacheMetadata")
            .map(isComputeStatistics).toProperty("isComputeStatistics")
            .map(isForColums).toProperty("isForColums")
            .map(isNoscan).toProperty("isNoscan")
            .map(partitionOid).toProperty("partitionOid")
            .map(tableOid).toProperty("tableOid")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_analyze_table_statement")
    default int insertSelective(SqlAnalyzeTableStatement record) {
        return MyBatis3Utils.insert(this::insert, record, sqlAnalyzeTableStatement, c ->
            c.map(oid).toPropertyWhenPresent("oid", record::getOid)
            .map(adbSchemaOid).toPropertyWhenPresent("adbSchemaOid", record::getAdbSchemaOid)
            .map(adbWhereOid).toPropertyWhenPresent("adbWhereOid", record::getAdbWhereOid)
            .map(isCacheMetadata).toPropertyWhenPresent("isCacheMetadata", record::getIsCacheMetadata)
            .map(isComputeStatistics).toPropertyWhenPresent("isComputeStatistics", record::getIsComputeStatistics)
            .map(isForColums).toPropertyWhenPresent("isForColums", record::getIsForColums)
            .map(isNoscan).toPropertyWhenPresent("isNoscan", record::getIsNoscan)
            .map(partitionOid).toPropertyWhenPresent("partitionOid", record::getPartitionOid)
            .map(tableOid).toPropertyWhenPresent("tableOid", record::getTableOid)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_analyze_table_statement")
    default Optional<SqlAnalyzeTableStatement> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, sqlAnalyzeTableStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_analyze_table_statement")
    default List<SqlAnalyzeTableStatement> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, sqlAnalyzeTableStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_analyze_table_statement")
    default List<SqlAnalyzeTableStatement> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, sqlAnalyzeTableStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_analyze_table_statement")
    default Optional<SqlAnalyzeTableStatement> selectByPrimaryKey(Long oid_) {
        return selectOne(c ->
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_analyze_table_statement")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, sqlAnalyzeTableStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_analyze_table_statement")
    static UpdateDSL<UpdateModel> updateAllColumns(SqlAnalyzeTableStatement record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalTo(record::getOid)
                .set(adbSchemaOid).equalTo(record::getAdbSchemaOid)
                .set(adbWhereOid).equalTo(record::getAdbWhereOid)
                .set(isCacheMetadata).equalTo(record::getIsCacheMetadata)
                .set(isComputeStatistics).equalTo(record::getIsComputeStatistics)
                .set(isForColums).equalTo(record::getIsForColums)
                .set(isNoscan).equalTo(record::getIsNoscan)
                .set(partitionOid).equalTo(record::getPartitionOid)
                .set(tableOid).equalTo(record::getTableOid);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_analyze_table_statement")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(SqlAnalyzeTableStatement record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalToWhenPresent(record::getOid)
                .set(adbSchemaOid).equalToWhenPresent(record::getAdbSchemaOid)
                .set(adbWhereOid).equalToWhenPresent(record::getAdbWhereOid)
                .set(isCacheMetadata).equalToWhenPresent(record::getIsCacheMetadata)
                .set(isComputeStatistics).equalToWhenPresent(record::getIsComputeStatistics)
                .set(isForColums).equalToWhenPresent(record::getIsForColums)
                .set(isNoscan).equalToWhenPresent(record::getIsNoscan)
                .set(partitionOid).equalToWhenPresent(record::getPartitionOid)
                .set(tableOid).equalToWhenPresent(record::getTableOid);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_analyze_table_statement")
    default int updateByPrimaryKey(SqlAnalyzeTableStatement record) {
        return update(c ->
            c.set(adbSchemaOid).equalTo(record::getAdbSchemaOid)
            .set(adbWhereOid).equalTo(record::getAdbWhereOid)
            .set(isCacheMetadata).equalTo(record::getIsCacheMetadata)
            .set(isComputeStatistics).equalTo(record::getIsComputeStatistics)
            .set(isForColums).equalTo(record::getIsForColums)
            .set(isNoscan).equalTo(record::getIsNoscan)
            .set(partitionOid).equalTo(record::getPartitionOid)
            .set(tableOid).equalTo(record::getTableOid)
            .where(oid, isEqualTo(record::getOid))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_analyze_table_statement")
    default int updateByPrimaryKeySelective(SqlAnalyzeTableStatement record) {
        return update(c ->
            c.set(adbSchemaOid).equalToWhenPresent(record::getAdbSchemaOid)
            .set(adbWhereOid).equalToWhenPresent(record::getAdbWhereOid)
            .set(isCacheMetadata).equalToWhenPresent(record::getIsCacheMetadata)
            .set(isComputeStatistics).equalToWhenPresent(record::getIsComputeStatistics)
            .set(isForColums).equalToWhenPresent(record::getIsForColums)
            .set(isNoscan).equalToWhenPresent(record::getIsNoscan)
            .set(partitionOid).equalToWhenPresent(record::getPartitionOid)
            .set(tableOid).equalToWhenPresent(record::getTableOid)
            .where(oid, isEqualTo(record::getOid))
        );
    }
}