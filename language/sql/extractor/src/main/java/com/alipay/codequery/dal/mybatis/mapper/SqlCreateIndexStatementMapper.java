package com.alipay.codequery.dal.mybatis.mapper;

import static com.alipay.codequery.dal.mybatis.mapper.SqlCreateIndexStatementDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.alipay.codequery.dal.mybatis.domain.SqlCreateIndexStatement;
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
public interface SqlCreateIndexStatementMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_create_index_statement")
    BasicColumn[] selectList = BasicColumn.columnList(oid, commentOid, dbPartitionByOid, inOid, indexDefinitionOid, isConcurrently, isDeferedRebuild, isGlobal, isIfNotExists, isLocal, isStoring, nameOid, rowFormatOid, schema, storedAsOid, tableOid, tableName, tablePartitionByOid, tablePartitionsOid, tablespaceOid, type, using);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_create_index_statement")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_create_index_statement")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_create_index_statement")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<SqlCreateIndexStatement> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_create_index_statement")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<SqlCreateIndexStatement> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_create_index_statement")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="comment_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="db_partition_by_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="in_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="index_definition_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_concurrently", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_defered_rebuild", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_global", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_if_not_exists", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_local", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_storing", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="name_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="row_format_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="schema", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="stored_as_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="table_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="table_name", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="table_partition_by_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="table_partitions_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="tablespace_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="type", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="using", javaType=String.class, jdbcType=JdbcType.VARCHAR)
    })
    Optional<SqlCreateIndexStatement> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_create_index_statement")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="comment_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="db_partition_by_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="in_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="index_definition_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_concurrently", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_defered_rebuild", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_global", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_if_not_exists", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_local", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_storing", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="name_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="row_format_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="schema", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="stored_as_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="table_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="table_name", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="table_partition_by_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="table_partitions_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="tablespace_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="type", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="using", javaType=String.class, jdbcType=JdbcType.VARCHAR)
    })
    List<SqlCreateIndexStatement> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_create_index_statement")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_create_index_statement")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, sqlCreateIndexStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_create_index_statement")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, sqlCreateIndexStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_create_index_statement")
    default int deleteByPrimaryKey(Long oid_) {
        return delete(c -> 
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_create_index_statement")
    default int insert(SqlCreateIndexStatement record) {
        return MyBatis3Utils.insert(this::insert, record, sqlCreateIndexStatement, c ->
            c.map(oid).toProperty("oid")
            .map(commentOid).toProperty("commentOid")
            .map(dbPartitionByOid).toProperty("dbPartitionByOid")
            .map(inOid).toProperty("inOid")
            .map(indexDefinitionOid).toProperty("indexDefinitionOid")
            .map(isConcurrently).toProperty("isConcurrently")
            .map(isDeferedRebuild).toProperty("isDeferedRebuild")
            .map(isGlobal).toProperty("isGlobal")
            .map(isIfNotExists).toProperty("isIfNotExists")
            .map(isLocal).toProperty("isLocal")
            .map(isStoring).toProperty("isStoring")
            .map(nameOid).toProperty("nameOid")
            .map(rowFormatOid).toProperty("rowFormatOid")
            .map(schema).toProperty("schema")
            .map(storedAsOid).toProperty("storedAsOid")
            .map(tableOid).toProperty("tableOid")
            .map(tableName).toProperty("tableName")
            .map(tablePartitionByOid).toProperty("tablePartitionByOid")
            .map(tablePartitionsOid).toProperty("tablePartitionsOid")
            .map(tablespaceOid).toProperty("tablespaceOid")
            .map(type).toProperty("type")
            .map(using).toProperty("using")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_create_index_statement")
    default int insertMultiple(Collection<SqlCreateIndexStatement> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, sqlCreateIndexStatement, c ->
            c.map(oid).toProperty("oid")
            .map(commentOid).toProperty("commentOid")
            .map(dbPartitionByOid).toProperty("dbPartitionByOid")
            .map(inOid).toProperty("inOid")
            .map(indexDefinitionOid).toProperty("indexDefinitionOid")
            .map(isConcurrently).toProperty("isConcurrently")
            .map(isDeferedRebuild).toProperty("isDeferedRebuild")
            .map(isGlobal).toProperty("isGlobal")
            .map(isIfNotExists).toProperty("isIfNotExists")
            .map(isLocal).toProperty("isLocal")
            .map(isStoring).toProperty("isStoring")
            .map(nameOid).toProperty("nameOid")
            .map(rowFormatOid).toProperty("rowFormatOid")
            .map(schema).toProperty("schema")
            .map(storedAsOid).toProperty("storedAsOid")
            .map(tableOid).toProperty("tableOid")
            .map(tableName).toProperty("tableName")
            .map(tablePartitionByOid).toProperty("tablePartitionByOid")
            .map(tablePartitionsOid).toProperty("tablePartitionsOid")
            .map(tablespaceOid).toProperty("tablespaceOid")
            .map(type).toProperty("type")
            .map(using).toProperty("using")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_create_index_statement")
    default int insertSelective(SqlCreateIndexStatement record) {
        return MyBatis3Utils.insert(this::insert, record, sqlCreateIndexStatement, c ->
            c.map(oid).toPropertyWhenPresent("oid", record::getOid)
            .map(commentOid).toPropertyWhenPresent("commentOid", record::getCommentOid)
            .map(dbPartitionByOid).toPropertyWhenPresent("dbPartitionByOid", record::getDbPartitionByOid)
            .map(inOid).toPropertyWhenPresent("inOid", record::getInOid)
            .map(indexDefinitionOid).toPropertyWhenPresent("indexDefinitionOid", record::getIndexDefinitionOid)
            .map(isConcurrently).toPropertyWhenPresent("isConcurrently", record::getIsConcurrently)
            .map(isDeferedRebuild).toPropertyWhenPresent("isDeferedRebuild", record::getIsDeferedRebuild)
            .map(isGlobal).toPropertyWhenPresent("isGlobal", record::getIsGlobal)
            .map(isIfNotExists).toPropertyWhenPresent("isIfNotExists", record::getIsIfNotExists)
            .map(isLocal).toPropertyWhenPresent("isLocal", record::getIsLocal)
            .map(isStoring).toPropertyWhenPresent("isStoring", record::getIsStoring)
            .map(nameOid).toPropertyWhenPresent("nameOid", record::getNameOid)
            .map(rowFormatOid).toPropertyWhenPresent("rowFormatOid", record::getRowFormatOid)
            .map(schema).toPropertyWhenPresent("schema", record::getSchema)
            .map(storedAsOid).toPropertyWhenPresent("storedAsOid", record::getStoredAsOid)
            .map(tableOid).toPropertyWhenPresent("tableOid", record::getTableOid)
            .map(tableName).toPropertyWhenPresent("tableName", record::getTableName)
            .map(tablePartitionByOid).toPropertyWhenPresent("tablePartitionByOid", record::getTablePartitionByOid)
            .map(tablePartitionsOid).toPropertyWhenPresent("tablePartitionsOid", record::getTablePartitionsOid)
            .map(tablespaceOid).toPropertyWhenPresent("tablespaceOid", record::getTablespaceOid)
            .map(type).toPropertyWhenPresent("type", record::getType)
            .map(using).toPropertyWhenPresent("using", record::getUsing)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_create_index_statement")
    default Optional<SqlCreateIndexStatement> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, sqlCreateIndexStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_create_index_statement")
    default List<SqlCreateIndexStatement> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, sqlCreateIndexStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_create_index_statement")
    default List<SqlCreateIndexStatement> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, sqlCreateIndexStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_create_index_statement")
    default Optional<SqlCreateIndexStatement> selectByPrimaryKey(Long oid_) {
        return selectOne(c ->
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_create_index_statement")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, sqlCreateIndexStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_create_index_statement")
    static UpdateDSL<UpdateModel> updateAllColumns(SqlCreateIndexStatement record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalTo(record::getOid)
                .set(commentOid).equalTo(record::getCommentOid)
                .set(dbPartitionByOid).equalTo(record::getDbPartitionByOid)
                .set(inOid).equalTo(record::getInOid)
                .set(indexDefinitionOid).equalTo(record::getIndexDefinitionOid)
                .set(isConcurrently).equalTo(record::getIsConcurrently)
                .set(isDeferedRebuild).equalTo(record::getIsDeferedRebuild)
                .set(isGlobal).equalTo(record::getIsGlobal)
                .set(isIfNotExists).equalTo(record::getIsIfNotExists)
                .set(isLocal).equalTo(record::getIsLocal)
                .set(isStoring).equalTo(record::getIsStoring)
                .set(nameOid).equalTo(record::getNameOid)
                .set(rowFormatOid).equalTo(record::getRowFormatOid)
                .set(schema).equalTo(record::getSchema)
                .set(storedAsOid).equalTo(record::getStoredAsOid)
                .set(tableOid).equalTo(record::getTableOid)
                .set(tableName).equalTo(record::getTableName)
                .set(tablePartitionByOid).equalTo(record::getTablePartitionByOid)
                .set(tablePartitionsOid).equalTo(record::getTablePartitionsOid)
                .set(tablespaceOid).equalTo(record::getTablespaceOid)
                .set(type).equalTo(record::getType)
                .set(using).equalTo(record::getUsing);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_create_index_statement")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(SqlCreateIndexStatement record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalToWhenPresent(record::getOid)
                .set(commentOid).equalToWhenPresent(record::getCommentOid)
                .set(dbPartitionByOid).equalToWhenPresent(record::getDbPartitionByOid)
                .set(inOid).equalToWhenPresent(record::getInOid)
                .set(indexDefinitionOid).equalToWhenPresent(record::getIndexDefinitionOid)
                .set(isConcurrently).equalToWhenPresent(record::getIsConcurrently)
                .set(isDeferedRebuild).equalToWhenPresent(record::getIsDeferedRebuild)
                .set(isGlobal).equalToWhenPresent(record::getIsGlobal)
                .set(isIfNotExists).equalToWhenPresent(record::getIsIfNotExists)
                .set(isLocal).equalToWhenPresent(record::getIsLocal)
                .set(isStoring).equalToWhenPresent(record::getIsStoring)
                .set(nameOid).equalToWhenPresent(record::getNameOid)
                .set(rowFormatOid).equalToWhenPresent(record::getRowFormatOid)
                .set(schema).equalToWhenPresent(record::getSchema)
                .set(storedAsOid).equalToWhenPresent(record::getStoredAsOid)
                .set(tableOid).equalToWhenPresent(record::getTableOid)
                .set(tableName).equalToWhenPresent(record::getTableName)
                .set(tablePartitionByOid).equalToWhenPresent(record::getTablePartitionByOid)
                .set(tablePartitionsOid).equalToWhenPresent(record::getTablePartitionsOid)
                .set(tablespaceOid).equalToWhenPresent(record::getTablespaceOid)
                .set(type).equalToWhenPresent(record::getType)
                .set(using).equalToWhenPresent(record::getUsing);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_create_index_statement")
    default int updateByPrimaryKey(SqlCreateIndexStatement record) {
        return update(c ->
            c.set(commentOid).equalTo(record::getCommentOid)
            .set(dbPartitionByOid).equalTo(record::getDbPartitionByOid)
            .set(inOid).equalTo(record::getInOid)
            .set(indexDefinitionOid).equalTo(record::getIndexDefinitionOid)
            .set(isConcurrently).equalTo(record::getIsConcurrently)
            .set(isDeferedRebuild).equalTo(record::getIsDeferedRebuild)
            .set(isGlobal).equalTo(record::getIsGlobal)
            .set(isIfNotExists).equalTo(record::getIsIfNotExists)
            .set(isLocal).equalTo(record::getIsLocal)
            .set(isStoring).equalTo(record::getIsStoring)
            .set(nameOid).equalTo(record::getNameOid)
            .set(rowFormatOid).equalTo(record::getRowFormatOid)
            .set(schema).equalTo(record::getSchema)
            .set(storedAsOid).equalTo(record::getStoredAsOid)
            .set(tableOid).equalTo(record::getTableOid)
            .set(tableName).equalTo(record::getTableName)
            .set(tablePartitionByOid).equalTo(record::getTablePartitionByOid)
            .set(tablePartitionsOid).equalTo(record::getTablePartitionsOid)
            .set(tablespaceOid).equalTo(record::getTablespaceOid)
            .set(type).equalTo(record::getType)
            .set(using).equalTo(record::getUsing)
            .where(oid, isEqualTo(record::getOid))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_create_index_statement")
    default int updateByPrimaryKeySelective(SqlCreateIndexStatement record) {
        return update(c ->
            c.set(commentOid).equalToWhenPresent(record::getCommentOid)
            .set(dbPartitionByOid).equalToWhenPresent(record::getDbPartitionByOid)
            .set(inOid).equalToWhenPresent(record::getInOid)
            .set(indexDefinitionOid).equalToWhenPresent(record::getIndexDefinitionOid)
            .set(isConcurrently).equalToWhenPresent(record::getIsConcurrently)
            .set(isDeferedRebuild).equalToWhenPresent(record::getIsDeferedRebuild)
            .set(isGlobal).equalToWhenPresent(record::getIsGlobal)
            .set(isIfNotExists).equalToWhenPresent(record::getIsIfNotExists)
            .set(isLocal).equalToWhenPresent(record::getIsLocal)
            .set(isStoring).equalToWhenPresent(record::getIsStoring)
            .set(nameOid).equalToWhenPresent(record::getNameOid)
            .set(rowFormatOid).equalToWhenPresent(record::getRowFormatOid)
            .set(schema).equalToWhenPresent(record::getSchema)
            .set(storedAsOid).equalToWhenPresent(record::getStoredAsOid)
            .set(tableOid).equalToWhenPresent(record::getTableOid)
            .set(tableName).equalToWhenPresent(record::getTableName)
            .set(tablePartitionByOid).equalToWhenPresent(record::getTablePartitionByOid)
            .set(tablePartitionsOid).equalToWhenPresent(record::getTablePartitionsOid)
            .set(tablespaceOid).equalToWhenPresent(record::getTablespaceOid)
            .set(type).equalToWhenPresent(record::getType)
            .set(using).equalToWhenPresent(record::getUsing)
            .where(oid, isEqualTo(record::getOid))
        );
    }
}