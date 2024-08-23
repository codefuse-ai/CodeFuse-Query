package com.alipay.codequery.dal.mybatis.mapper;

import static com.alipay.codequery.dal.mybatis.mapper.SqlCreateTableStatementDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.alipay.codequery.dal.mybatis.domain.SqlCreateTableStatement;
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
public interface SqlCreateTableStatementMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_create_table_statement")
    BasicColumn[] selectList = BasicColumn.columnList(oid, bodyBeforeCommentsDirect, buckets, catalog, clusteringType, columnComments, commentOid, compress, engineOid, inheritsOid, isDimension, isExternal, isIfNotExists, isIgnore, isOnCommitPreserveRows, isReplace, isSingle, likeOid, localPartitioningOid, locationOid, logging, nameOid, partitioningOid, primaryKeyNames, rowFormatOid, schema, selectOid, shards, storedAsOid, tableName, tableSourceOid, tablespaceOid, type);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_create_table_statement")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_create_table_statement")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_create_table_statement")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<SqlCreateTableStatement> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_create_table_statement")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<SqlCreateTableStatement> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_create_table_statement")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="body_before_comments_direct", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="buckets", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="catalog", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="clustering_type", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="column_comments", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="comment_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="compress", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="engine_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="inherits_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_dimension", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_external", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_if_not_exists", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_ignore", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_on_commit_preserve_rows", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_replace", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_single", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="like_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="local_partitioning_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="location_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="logging", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="name_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="partitioning_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="primary_key_names", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="row_format_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="schema", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="select_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="shards", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="stored_as_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="table_name", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="table_source_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="tablespace_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="type", javaType=String.class, jdbcType=JdbcType.VARCHAR)
    })
    Optional<SqlCreateTableStatement> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_create_table_statement")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="body_before_comments_direct", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="buckets", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="catalog", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="clustering_type", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="column_comments", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="comment_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="compress", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="engine_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="inherits_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_dimension", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_external", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_if_not_exists", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_ignore", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_on_commit_preserve_rows", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_replace", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_single", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="like_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="local_partitioning_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="location_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="logging", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="name_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="partitioning_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="primary_key_names", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="row_format_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="schema", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="select_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="shards", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="stored_as_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="table_name", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="table_source_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="tablespace_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="type", javaType=String.class, jdbcType=JdbcType.VARCHAR)
    })
    List<SqlCreateTableStatement> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_create_table_statement")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_create_table_statement")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, sqlCreateTableStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_create_table_statement")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, sqlCreateTableStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_create_table_statement")
    default int deleteByPrimaryKey(Long oid_) {
        return delete(c -> 
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_create_table_statement")
    default int insert(SqlCreateTableStatement record) {
        return MyBatis3Utils.insert(this::insert, record, sqlCreateTableStatement, c ->
            c.map(oid).toProperty("oid")
            .map(bodyBeforeCommentsDirect).toProperty("bodyBeforeCommentsDirect")
            .map(buckets).toProperty("buckets")
            .map(catalog).toProperty("catalog")
            .map(clusteringType).toProperty("clusteringType")
            .map(columnComments).toProperty("columnComments")
            .map(commentOid).toProperty("commentOid")
            .map(compress).toProperty("compress")
            .map(engineOid).toProperty("engineOid")
            .map(inheritsOid).toProperty("inheritsOid")
            .map(isDimension).toProperty("isDimension")
            .map(isExternal).toProperty("isExternal")
            .map(isIfNotExists).toProperty("isIfNotExists")
            .map(isIgnore).toProperty("isIgnore")
            .map(isOnCommitPreserveRows).toProperty("isOnCommitPreserveRows")
            .map(isReplace).toProperty("isReplace")
            .map(isSingle).toProperty("isSingle")
            .map(likeOid).toProperty("likeOid")
            .map(localPartitioningOid).toProperty("localPartitioningOid")
            .map(locationOid).toProperty("locationOid")
            .map(logging).toProperty("logging")
            .map(nameOid).toProperty("nameOid")
            .map(partitioningOid).toProperty("partitioningOid")
            .map(primaryKeyNames).toProperty("primaryKeyNames")
            .map(rowFormatOid).toProperty("rowFormatOid")
            .map(schema).toProperty("schema")
            .map(selectOid).toProperty("selectOid")
            .map(shards).toProperty("shards")
            .map(storedAsOid).toProperty("storedAsOid")
            .map(tableName).toProperty("tableName")
            .map(tableSourceOid).toProperty("tableSourceOid")
            .map(tablespaceOid).toProperty("tablespaceOid")
            .map(type).toProperty("type")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_create_table_statement")
    default int insertMultiple(Collection<SqlCreateTableStatement> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, sqlCreateTableStatement, c ->
            c.map(oid).toProperty("oid")
            .map(bodyBeforeCommentsDirect).toProperty("bodyBeforeCommentsDirect")
            .map(buckets).toProperty("buckets")
            .map(catalog).toProperty("catalog")
            .map(clusteringType).toProperty("clusteringType")
            .map(columnComments).toProperty("columnComments")
            .map(commentOid).toProperty("commentOid")
            .map(compress).toProperty("compress")
            .map(engineOid).toProperty("engineOid")
            .map(inheritsOid).toProperty("inheritsOid")
            .map(isDimension).toProperty("isDimension")
            .map(isExternal).toProperty("isExternal")
            .map(isIfNotExists).toProperty("isIfNotExists")
            .map(isIgnore).toProperty("isIgnore")
            .map(isOnCommitPreserveRows).toProperty("isOnCommitPreserveRows")
            .map(isReplace).toProperty("isReplace")
            .map(isSingle).toProperty("isSingle")
            .map(likeOid).toProperty("likeOid")
            .map(localPartitioningOid).toProperty("localPartitioningOid")
            .map(locationOid).toProperty("locationOid")
            .map(logging).toProperty("logging")
            .map(nameOid).toProperty("nameOid")
            .map(partitioningOid).toProperty("partitioningOid")
            .map(primaryKeyNames).toProperty("primaryKeyNames")
            .map(rowFormatOid).toProperty("rowFormatOid")
            .map(schema).toProperty("schema")
            .map(selectOid).toProperty("selectOid")
            .map(shards).toProperty("shards")
            .map(storedAsOid).toProperty("storedAsOid")
            .map(tableName).toProperty("tableName")
            .map(tableSourceOid).toProperty("tableSourceOid")
            .map(tablespaceOid).toProperty("tablespaceOid")
            .map(type).toProperty("type")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_create_table_statement")
    default int insertSelective(SqlCreateTableStatement record) {
        return MyBatis3Utils.insert(this::insert, record, sqlCreateTableStatement, c ->
            c.map(oid).toPropertyWhenPresent("oid", record::getOid)
            .map(bodyBeforeCommentsDirect).toPropertyWhenPresent("bodyBeforeCommentsDirect", record::getBodyBeforeCommentsDirect)
            .map(buckets).toPropertyWhenPresent("buckets", record::getBuckets)
            .map(catalog).toPropertyWhenPresent("catalog", record::getCatalog)
            .map(clusteringType).toPropertyWhenPresent("clusteringType", record::getClusteringType)
            .map(columnComments).toPropertyWhenPresent("columnComments", record::getColumnComments)
            .map(commentOid).toPropertyWhenPresent("commentOid", record::getCommentOid)
            .map(compress).toPropertyWhenPresent("compress", record::getCompress)
            .map(engineOid).toPropertyWhenPresent("engineOid", record::getEngineOid)
            .map(inheritsOid).toPropertyWhenPresent("inheritsOid", record::getInheritsOid)
            .map(isDimension).toPropertyWhenPresent("isDimension", record::getIsDimension)
            .map(isExternal).toPropertyWhenPresent("isExternal", record::getIsExternal)
            .map(isIfNotExists).toPropertyWhenPresent("isIfNotExists", record::getIsIfNotExists)
            .map(isIgnore).toPropertyWhenPresent("isIgnore", record::getIsIgnore)
            .map(isOnCommitPreserveRows).toPropertyWhenPresent("isOnCommitPreserveRows", record::getIsOnCommitPreserveRows)
            .map(isReplace).toPropertyWhenPresent("isReplace", record::getIsReplace)
            .map(isSingle).toPropertyWhenPresent("isSingle", record::getIsSingle)
            .map(likeOid).toPropertyWhenPresent("likeOid", record::getLikeOid)
            .map(localPartitioningOid).toPropertyWhenPresent("localPartitioningOid", record::getLocalPartitioningOid)
            .map(locationOid).toPropertyWhenPresent("locationOid", record::getLocationOid)
            .map(logging).toPropertyWhenPresent("logging", record::getLogging)
            .map(nameOid).toPropertyWhenPresent("nameOid", record::getNameOid)
            .map(partitioningOid).toPropertyWhenPresent("partitioningOid", record::getPartitioningOid)
            .map(primaryKeyNames).toPropertyWhenPresent("primaryKeyNames", record::getPrimaryKeyNames)
            .map(rowFormatOid).toPropertyWhenPresent("rowFormatOid", record::getRowFormatOid)
            .map(schema).toPropertyWhenPresent("schema", record::getSchema)
            .map(selectOid).toPropertyWhenPresent("selectOid", record::getSelectOid)
            .map(shards).toPropertyWhenPresent("shards", record::getShards)
            .map(storedAsOid).toPropertyWhenPresent("storedAsOid", record::getStoredAsOid)
            .map(tableName).toPropertyWhenPresent("tableName", record::getTableName)
            .map(tableSourceOid).toPropertyWhenPresent("tableSourceOid", record::getTableSourceOid)
            .map(tablespaceOid).toPropertyWhenPresent("tablespaceOid", record::getTablespaceOid)
            .map(type).toPropertyWhenPresent("type", record::getType)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_create_table_statement")
    default Optional<SqlCreateTableStatement> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, sqlCreateTableStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_create_table_statement")
    default List<SqlCreateTableStatement> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, sqlCreateTableStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_create_table_statement")
    default List<SqlCreateTableStatement> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, sqlCreateTableStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_create_table_statement")
    default Optional<SqlCreateTableStatement> selectByPrimaryKey(Long oid_) {
        return selectOne(c ->
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_create_table_statement")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, sqlCreateTableStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_create_table_statement")
    static UpdateDSL<UpdateModel> updateAllColumns(SqlCreateTableStatement record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalTo(record::getOid)
                .set(bodyBeforeCommentsDirect).equalTo(record::getBodyBeforeCommentsDirect)
                .set(buckets).equalTo(record::getBuckets)
                .set(catalog).equalTo(record::getCatalog)
                .set(clusteringType).equalTo(record::getClusteringType)
                .set(columnComments).equalTo(record::getColumnComments)
                .set(commentOid).equalTo(record::getCommentOid)
                .set(compress).equalTo(record::getCompress)
                .set(engineOid).equalTo(record::getEngineOid)
                .set(inheritsOid).equalTo(record::getInheritsOid)
                .set(isDimension).equalTo(record::getIsDimension)
                .set(isExternal).equalTo(record::getIsExternal)
                .set(isIfNotExists).equalTo(record::getIsIfNotExists)
                .set(isIgnore).equalTo(record::getIsIgnore)
                .set(isOnCommitPreserveRows).equalTo(record::getIsOnCommitPreserveRows)
                .set(isReplace).equalTo(record::getIsReplace)
                .set(isSingle).equalTo(record::getIsSingle)
                .set(likeOid).equalTo(record::getLikeOid)
                .set(localPartitioningOid).equalTo(record::getLocalPartitioningOid)
                .set(locationOid).equalTo(record::getLocationOid)
                .set(logging).equalTo(record::getLogging)
                .set(nameOid).equalTo(record::getNameOid)
                .set(partitioningOid).equalTo(record::getPartitioningOid)
                .set(primaryKeyNames).equalTo(record::getPrimaryKeyNames)
                .set(rowFormatOid).equalTo(record::getRowFormatOid)
                .set(schema).equalTo(record::getSchema)
                .set(selectOid).equalTo(record::getSelectOid)
                .set(shards).equalTo(record::getShards)
                .set(storedAsOid).equalTo(record::getStoredAsOid)
                .set(tableName).equalTo(record::getTableName)
                .set(tableSourceOid).equalTo(record::getTableSourceOid)
                .set(tablespaceOid).equalTo(record::getTablespaceOid)
                .set(type).equalTo(record::getType);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_create_table_statement")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(SqlCreateTableStatement record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalToWhenPresent(record::getOid)
                .set(bodyBeforeCommentsDirect).equalToWhenPresent(record::getBodyBeforeCommentsDirect)
                .set(buckets).equalToWhenPresent(record::getBuckets)
                .set(catalog).equalToWhenPresent(record::getCatalog)
                .set(clusteringType).equalToWhenPresent(record::getClusteringType)
                .set(columnComments).equalToWhenPresent(record::getColumnComments)
                .set(commentOid).equalToWhenPresent(record::getCommentOid)
                .set(compress).equalToWhenPresent(record::getCompress)
                .set(engineOid).equalToWhenPresent(record::getEngineOid)
                .set(inheritsOid).equalToWhenPresent(record::getInheritsOid)
                .set(isDimension).equalToWhenPresent(record::getIsDimension)
                .set(isExternal).equalToWhenPresent(record::getIsExternal)
                .set(isIfNotExists).equalToWhenPresent(record::getIsIfNotExists)
                .set(isIgnore).equalToWhenPresent(record::getIsIgnore)
                .set(isOnCommitPreserveRows).equalToWhenPresent(record::getIsOnCommitPreserveRows)
                .set(isReplace).equalToWhenPresent(record::getIsReplace)
                .set(isSingle).equalToWhenPresent(record::getIsSingle)
                .set(likeOid).equalToWhenPresent(record::getLikeOid)
                .set(localPartitioningOid).equalToWhenPresent(record::getLocalPartitioningOid)
                .set(locationOid).equalToWhenPresent(record::getLocationOid)
                .set(logging).equalToWhenPresent(record::getLogging)
                .set(nameOid).equalToWhenPresent(record::getNameOid)
                .set(partitioningOid).equalToWhenPresent(record::getPartitioningOid)
                .set(primaryKeyNames).equalToWhenPresent(record::getPrimaryKeyNames)
                .set(rowFormatOid).equalToWhenPresent(record::getRowFormatOid)
                .set(schema).equalToWhenPresent(record::getSchema)
                .set(selectOid).equalToWhenPresent(record::getSelectOid)
                .set(shards).equalToWhenPresent(record::getShards)
                .set(storedAsOid).equalToWhenPresent(record::getStoredAsOid)
                .set(tableName).equalToWhenPresent(record::getTableName)
                .set(tableSourceOid).equalToWhenPresent(record::getTableSourceOid)
                .set(tablespaceOid).equalToWhenPresent(record::getTablespaceOid)
                .set(type).equalToWhenPresent(record::getType);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_create_table_statement")
    default int updateByPrimaryKey(SqlCreateTableStatement record) {
        return update(c ->
            c.set(bodyBeforeCommentsDirect).equalTo(record::getBodyBeforeCommentsDirect)
            .set(buckets).equalTo(record::getBuckets)
            .set(catalog).equalTo(record::getCatalog)
            .set(clusteringType).equalTo(record::getClusteringType)
            .set(columnComments).equalTo(record::getColumnComments)
            .set(commentOid).equalTo(record::getCommentOid)
            .set(compress).equalTo(record::getCompress)
            .set(engineOid).equalTo(record::getEngineOid)
            .set(inheritsOid).equalTo(record::getInheritsOid)
            .set(isDimension).equalTo(record::getIsDimension)
            .set(isExternal).equalTo(record::getIsExternal)
            .set(isIfNotExists).equalTo(record::getIsIfNotExists)
            .set(isIgnore).equalTo(record::getIsIgnore)
            .set(isOnCommitPreserveRows).equalTo(record::getIsOnCommitPreserveRows)
            .set(isReplace).equalTo(record::getIsReplace)
            .set(isSingle).equalTo(record::getIsSingle)
            .set(likeOid).equalTo(record::getLikeOid)
            .set(localPartitioningOid).equalTo(record::getLocalPartitioningOid)
            .set(locationOid).equalTo(record::getLocationOid)
            .set(logging).equalTo(record::getLogging)
            .set(nameOid).equalTo(record::getNameOid)
            .set(partitioningOid).equalTo(record::getPartitioningOid)
            .set(primaryKeyNames).equalTo(record::getPrimaryKeyNames)
            .set(rowFormatOid).equalTo(record::getRowFormatOid)
            .set(schema).equalTo(record::getSchema)
            .set(selectOid).equalTo(record::getSelectOid)
            .set(shards).equalTo(record::getShards)
            .set(storedAsOid).equalTo(record::getStoredAsOid)
            .set(tableName).equalTo(record::getTableName)
            .set(tableSourceOid).equalTo(record::getTableSourceOid)
            .set(tablespaceOid).equalTo(record::getTablespaceOid)
            .set(type).equalTo(record::getType)
            .where(oid, isEqualTo(record::getOid))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_create_table_statement")
    default int updateByPrimaryKeySelective(SqlCreateTableStatement record) {
        return update(c ->
            c.set(bodyBeforeCommentsDirect).equalToWhenPresent(record::getBodyBeforeCommentsDirect)
            .set(buckets).equalToWhenPresent(record::getBuckets)
            .set(catalog).equalToWhenPresent(record::getCatalog)
            .set(clusteringType).equalToWhenPresent(record::getClusteringType)
            .set(columnComments).equalToWhenPresent(record::getColumnComments)
            .set(commentOid).equalToWhenPresent(record::getCommentOid)
            .set(compress).equalToWhenPresent(record::getCompress)
            .set(engineOid).equalToWhenPresent(record::getEngineOid)
            .set(inheritsOid).equalToWhenPresent(record::getInheritsOid)
            .set(isDimension).equalToWhenPresent(record::getIsDimension)
            .set(isExternal).equalToWhenPresent(record::getIsExternal)
            .set(isIfNotExists).equalToWhenPresent(record::getIsIfNotExists)
            .set(isIgnore).equalToWhenPresent(record::getIsIgnore)
            .set(isOnCommitPreserveRows).equalToWhenPresent(record::getIsOnCommitPreserveRows)
            .set(isReplace).equalToWhenPresent(record::getIsReplace)
            .set(isSingle).equalToWhenPresent(record::getIsSingle)
            .set(likeOid).equalToWhenPresent(record::getLikeOid)
            .set(localPartitioningOid).equalToWhenPresent(record::getLocalPartitioningOid)
            .set(locationOid).equalToWhenPresent(record::getLocationOid)
            .set(logging).equalToWhenPresent(record::getLogging)
            .set(nameOid).equalToWhenPresent(record::getNameOid)
            .set(partitioningOid).equalToWhenPresent(record::getPartitioningOid)
            .set(primaryKeyNames).equalToWhenPresent(record::getPrimaryKeyNames)
            .set(rowFormatOid).equalToWhenPresent(record::getRowFormatOid)
            .set(schema).equalToWhenPresent(record::getSchema)
            .set(selectOid).equalToWhenPresent(record::getSelectOid)
            .set(shards).equalToWhenPresent(record::getShards)
            .set(storedAsOid).equalToWhenPresent(record::getStoredAsOid)
            .set(tableName).equalToWhenPresent(record::getTableName)
            .set(tableSourceOid).equalToWhenPresent(record::getTableSourceOid)
            .set(tablespaceOid).equalToWhenPresent(record::getTablespaceOid)
            .set(type).equalToWhenPresent(record::getType)
            .where(oid, isEqualTo(record::getOid))
        );
    }
}