package com.alipay.codequery.dal.mybatis.mapper;

import static com.alipay.codequery.dal.mybatis.mapper.SqlAlterTableStatementDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.alipay.codequery.dal.mybatis.domain.SqlAlterTableStatement;
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
public interface SqlAlterTableStatementMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_table_statement")
    BasicColumn[] selectList = BasicColumn.columnList(oid, buckets, isIfExists, isIgnore, isInvalidateGlobalIndexes, isMergeSmallFiles, isNotClustered, isOffline, isOnline, isRange, isRemovePatiting, isUpdateGlobalIndexes, isUpgradePatiting, nameOid, partitionOid, schema, shards, tableName, tableSourceOid);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_table_statement")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_table_statement")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_table_statement")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<SqlAlterTableStatement> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_table_statement")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<SqlAlterTableStatement> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_table_statement")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="buckets", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_if_exists", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_ignore", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_invalidate_global_indexes", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_merge_small_files", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_not_clustered", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_offline", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_online", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_range", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_remove_patiting", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_update_global_indexes", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_upgrade_patiting", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="name_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="partition_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="schema", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="shards", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="table_name", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="table_source_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT)
    })
    Optional<SqlAlterTableStatement> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_table_statement")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="buckets", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_if_exists", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_ignore", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_invalidate_global_indexes", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_merge_small_files", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_not_clustered", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_offline", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_online", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_range", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_remove_patiting", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_update_global_indexes", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_upgrade_patiting", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="name_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="partition_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="schema", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="shards", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="table_name", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="table_source_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT)
    })
    List<SqlAlterTableStatement> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_table_statement")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_table_statement")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, sqlAlterTableStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_table_statement")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, sqlAlterTableStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_table_statement")
    default int deleteByPrimaryKey(Long oid_) {
        return delete(c -> 
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_table_statement")
    default int insert(SqlAlterTableStatement record) {
        return MyBatis3Utils.insert(this::insert, record, sqlAlterTableStatement, c ->
            c.map(oid).toProperty("oid")
            .map(buckets).toProperty("buckets")
            .map(isIfExists).toProperty("isIfExists")
            .map(isIgnore).toProperty("isIgnore")
            .map(isInvalidateGlobalIndexes).toProperty("isInvalidateGlobalIndexes")
            .map(isMergeSmallFiles).toProperty("isMergeSmallFiles")
            .map(isNotClustered).toProperty("isNotClustered")
            .map(isOffline).toProperty("isOffline")
            .map(isOnline).toProperty("isOnline")
            .map(isRange).toProperty("isRange")
            .map(isRemovePatiting).toProperty("isRemovePatiting")
            .map(isUpdateGlobalIndexes).toProperty("isUpdateGlobalIndexes")
            .map(isUpgradePatiting).toProperty("isUpgradePatiting")
            .map(nameOid).toProperty("nameOid")
            .map(partitionOid).toProperty("partitionOid")
            .map(schema).toProperty("schema")
            .map(shards).toProperty("shards")
            .map(tableName).toProperty("tableName")
            .map(tableSourceOid).toProperty("tableSourceOid")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_table_statement")
    default int insertMultiple(Collection<SqlAlterTableStatement> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, sqlAlterTableStatement, c ->
            c.map(oid).toProperty("oid")
            .map(buckets).toProperty("buckets")
            .map(isIfExists).toProperty("isIfExists")
            .map(isIgnore).toProperty("isIgnore")
            .map(isInvalidateGlobalIndexes).toProperty("isInvalidateGlobalIndexes")
            .map(isMergeSmallFiles).toProperty("isMergeSmallFiles")
            .map(isNotClustered).toProperty("isNotClustered")
            .map(isOffline).toProperty("isOffline")
            .map(isOnline).toProperty("isOnline")
            .map(isRange).toProperty("isRange")
            .map(isRemovePatiting).toProperty("isRemovePatiting")
            .map(isUpdateGlobalIndexes).toProperty("isUpdateGlobalIndexes")
            .map(isUpgradePatiting).toProperty("isUpgradePatiting")
            .map(nameOid).toProperty("nameOid")
            .map(partitionOid).toProperty("partitionOid")
            .map(schema).toProperty("schema")
            .map(shards).toProperty("shards")
            .map(tableName).toProperty("tableName")
            .map(tableSourceOid).toProperty("tableSourceOid")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_table_statement")
    default int insertSelective(SqlAlterTableStatement record) {
        return MyBatis3Utils.insert(this::insert, record, sqlAlterTableStatement, c ->
            c.map(oid).toPropertyWhenPresent("oid", record::getOid)
            .map(buckets).toPropertyWhenPresent("buckets", record::getBuckets)
            .map(isIfExists).toPropertyWhenPresent("isIfExists", record::getIsIfExists)
            .map(isIgnore).toPropertyWhenPresent("isIgnore", record::getIsIgnore)
            .map(isInvalidateGlobalIndexes).toPropertyWhenPresent("isInvalidateGlobalIndexes", record::getIsInvalidateGlobalIndexes)
            .map(isMergeSmallFiles).toPropertyWhenPresent("isMergeSmallFiles", record::getIsMergeSmallFiles)
            .map(isNotClustered).toPropertyWhenPresent("isNotClustered", record::getIsNotClustered)
            .map(isOffline).toPropertyWhenPresent("isOffline", record::getIsOffline)
            .map(isOnline).toPropertyWhenPresent("isOnline", record::getIsOnline)
            .map(isRange).toPropertyWhenPresent("isRange", record::getIsRange)
            .map(isRemovePatiting).toPropertyWhenPresent("isRemovePatiting", record::getIsRemovePatiting)
            .map(isUpdateGlobalIndexes).toPropertyWhenPresent("isUpdateGlobalIndexes", record::getIsUpdateGlobalIndexes)
            .map(isUpgradePatiting).toPropertyWhenPresent("isUpgradePatiting", record::getIsUpgradePatiting)
            .map(nameOid).toPropertyWhenPresent("nameOid", record::getNameOid)
            .map(partitionOid).toPropertyWhenPresent("partitionOid", record::getPartitionOid)
            .map(schema).toPropertyWhenPresent("schema", record::getSchema)
            .map(shards).toPropertyWhenPresent("shards", record::getShards)
            .map(tableName).toPropertyWhenPresent("tableName", record::getTableName)
            .map(tableSourceOid).toPropertyWhenPresent("tableSourceOid", record::getTableSourceOid)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_table_statement")
    default Optional<SqlAlterTableStatement> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, sqlAlterTableStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_table_statement")
    default List<SqlAlterTableStatement> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, sqlAlterTableStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_table_statement")
    default List<SqlAlterTableStatement> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, sqlAlterTableStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_table_statement")
    default Optional<SqlAlterTableStatement> selectByPrimaryKey(Long oid_) {
        return selectOne(c ->
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_table_statement")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, sqlAlterTableStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_table_statement")
    static UpdateDSL<UpdateModel> updateAllColumns(SqlAlterTableStatement record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalTo(record::getOid)
                .set(buckets).equalTo(record::getBuckets)
                .set(isIfExists).equalTo(record::getIsIfExists)
                .set(isIgnore).equalTo(record::getIsIgnore)
                .set(isInvalidateGlobalIndexes).equalTo(record::getIsInvalidateGlobalIndexes)
                .set(isMergeSmallFiles).equalTo(record::getIsMergeSmallFiles)
                .set(isNotClustered).equalTo(record::getIsNotClustered)
                .set(isOffline).equalTo(record::getIsOffline)
                .set(isOnline).equalTo(record::getIsOnline)
                .set(isRange).equalTo(record::getIsRange)
                .set(isRemovePatiting).equalTo(record::getIsRemovePatiting)
                .set(isUpdateGlobalIndexes).equalTo(record::getIsUpdateGlobalIndexes)
                .set(isUpgradePatiting).equalTo(record::getIsUpgradePatiting)
                .set(nameOid).equalTo(record::getNameOid)
                .set(partitionOid).equalTo(record::getPartitionOid)
                .set(schema).equalTo(record::getSchema)
                .set(shards).equalTo(record::getShards)
                .set(tableName).equalTo(record::getTableName)
                .set(tableSourceOid).equalTo(record::getTableSourceOid);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_table_statement")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(SqlAlterTableStatement record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalToWhenPresent(record::getOid)
                .set(buckets).equalToWhenPresent(record::getBuckets)
                .set(isIfExists).equalToWhenPresent(record::getIsIfExists)
                .set(isIgnore).equalToWhenPresent(record::getIsIgnore)
                .set(isInvalidateGlobalIndexes).equalToWhenPresent(record::getIsInvalidateGlobalIndexes)
                .set(isMergeSmallFiles).equalToWhenPresent(record::getIsMergeSmallFiles)
                .set(isNotClustered).equalToWhenPresent(record::getIsNotClustered)
                .set(isOffline).equalToWhenPresent(record::getIsOffline)
                .set(isOnline).equalToWhenPresent(record::getIsOnline)
                .set(isRange).equalToWhenPresent(record::getIsRange)
                .set(isRemovePatiting).equalToWhenPresent(record::getIsRemovePatiting)
                .set(isUpdateGlobalIndexes).equalToWhenPresent(record::getIsUpdateGlobalIndexes)
                .set(isUpgradePatiting).equalToWhenPresent(record::getIsUpgradePatiting)
                .set(nameOid).equalToWhenPresent(record::getNameOid)
                .set(partitionOid).equalToWhenPresent(record::getPartitionOid)
                .set(schema).equalToWhenPresent(record::getSchema)
                .set(shards).equalToWhenPresent(record::getShards)
                .set(tableName).equalToWhenPresent(record::getTableName)
                .set(tableSourceOid).equalToWhenPresent(record::getTableSourceOid);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_table_statement")
    default int updateByPrimaryKey(SqlAlterTableStatement record) {
        return update(c ->
            c.set(buckets).equalTo(record::getBuckets)
            .set(isIfExists).equalTo(record::getIsIfExists)
            .set(isIgnore).equalTo(record::getIsIgnore)
            .set(isInvalidateGlobalIndexes).equalTo(record::getIsInvalidateGlobalIndexes)
            .set(isMergeSmallFiles).equalTo(record::getIsMergeSmallFiles)
            .set(isNotClustered).equalTo(record::getIsNotClustered)
            .set(isOffline).equalTo(record::getIsOffline)
            .set(isOnline).equalTo(record::getIsOnline)
            .set(isRange).equalTo(record::getIsRange)
            .set(isRemovePatiting).equalTo(record::getIsRemovePatiting)
            .set(isUpdateGlobalIndexes).equalTo(record::getIsUpdateGlobalIndexes)
            .set(isUpgradePatiting).equalTo(record::getIsUpgradePatiting)
            .set(nameOid).equalTo(record::getNameOid)
            .set(partitionOid).equalTo(record::getPartitionOid)
            .set(schema).equalTo(record::getSchema)
            .set(shards).equalTo(record::getShards)
            .set(tableName).equalTo(record::getTableName)
            .set(tableSourceOid).equalTo(record::getTableSourceOid)
            .where(oid, isEqualTo(record::getOid))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_table_statement")
    default int updateByPrimaryKeySelective(SqlAlterTableStatement record) {
        return update(c ->
            c.set(buckets).equalToWhenPresent(record::getBuckets)
            .set(isIfExists).equalToWhenPresent(record::getIsIfExists)
            .set(isIgnore).equalToWhenPresent(record::getIsIgnore)
            .set(isInvalidateGlobalIndexes).equalToWhenPresent(record::getIsInvalidateGlobalIndexes)
            .set(isMergeSmallFiles).equalToWhenPresent(record::getIsMergeSmallFiles)
            .set(isNotClustered).equalToWhenPresent(record::getIsNotClustered)
            .set(isOffline).equalToWhenPresent(record::getIsOffline)
            .set(isOnline).equalToWhenPresent(record::getIsOnline)
            .set(isRange).equalToWhenPresent(record::getIsRange)
            .set(isRemovePatiting).equalToWhenPresent(record::getIsRemovePatiting)
            .set(isUpdateGlobalIndexes).equalToWhenPresent(record::getIsUpdateGlobalIndexes)
            .set(isUpgradePatiting).equalToWhenPresent(record::getIsUpgradePatiting)
            .set(nameOid).equalToWhenPresent(record::getNameOid)
            .set(partitionOid).equalToWhenPresent(record::getPartitionOid)
            .set(schema).equalToWhenPresent(record::getSchema)
            .set(shards).equalToWhenPresent(record::getShards)
            .set(tableName).equalToWhenPresent(record::getTableName)
            .set(tableSourceOid).equalToWhenPresent(record::getTableSourceOid)
            .where(oid, isEqualTo(record::getOid))
        );
    }
}