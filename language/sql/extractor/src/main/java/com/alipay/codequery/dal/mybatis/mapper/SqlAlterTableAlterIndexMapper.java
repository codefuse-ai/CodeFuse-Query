package com.alipay.codequery.dal.mybatis.mapper;

import static com.alipay.codequery.dal.mybatis.mapper.SqlAlterTableAlterIndexDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.alipay.codequery.dal.mybatis.domain.SqlAlterTableAlterIndex;
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
public interface SqlAlterTableAlterIndexMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_table_alter_index")
    BasicColumn[] selectList = BasicColumn.columnList(oid, algorithm, commentOid, dbPartitionByOid, distanceMeasure, indexDefinitionOid, isGlobal, isHashMapType, isKey, isUnique, keyBlockSizeOid, nameOid, parserName, tablePartitionByOid, tablePartitionsOid, type, using);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_table_alter_index")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_table_alter_index")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_table_alter_index")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<SqlAlterTableAlterIndex> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_table_alter_index")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<SqlAlterTableAlterIndex> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_table_alter_index")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="algorithm", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="comment_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="db_partition_by_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="distance_measure", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="index_definition_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_global", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_hash_map_type", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_key", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_unique", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="key_block_size_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="name_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="parser_name", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="table_partition_by_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="table_partitions_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="type", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="using", javaType=String.class, jdbcType=JdbcType.VARCHAR)
    })
    Optional<SqlAlterTableAlterIndex> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_table_alter_index")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="algorithm", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="comment_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="db_partition_by_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="distance_measure", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="index_definition_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_global", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_hash_map_type", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_key", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_unique", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="key_block_size_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="name_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="parser_name", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="table_partition_by_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="table_partitions_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="type", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="using", javaType=String.class, jdbcType=JdbcType.VARCHAR)
    })
    List<SqlAlterTableAlterIndex> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_table_alter_index")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_table_alter_index")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, sqlAlterTableAlterIndex, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_table_alter_index")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, sqlAlterTableAlterIndex, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_table_alter_index")
    default int deleteByPrimaryKey(Long oid_) {
        return delete(c -> 
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_table_alter_index")
    default int insert(SqlAlterTableAlterIndex record) {
        return MyBatis3Utils.insert(this::insert, record, sqlAlterTableAlterIndex, c ->
            c.map(oid).toProperty("oid")
            .map(algorithm).toProperty("algorithm")
            .map(commentOid).toProperty("commentOid")
            .map(dbPartitionByOid).toProperty("dbPartitionByOid")
            .map(distanceMeasure).toProperty("distanceMeasure")
            .map(indexDefinitionOid).toProperty("indexDefinitionOid")
            .map(isGlobal).toProperty("isGlobal")
            .map(isHashMapType).toProperty("isHashMapType")
            .map(isKey).toProperty("isKey")
            .map(isUnique).toProperty("isUnique")
            .map(keyBlockSizeOid).toProperty("keyBlockSizeOid")
            .map(nameOid).toProperty("nameOid")
            .map(parserName).toProperty("parserName")
            .map(tablePartitionByOid).toProperty("tablePartitionByOid")
            .map(tablePartitionsOid).toProperty("tablePartitionsOid")
            .map(type).toProperty("type")
            .map(using).toProperty("using")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_table_alter_index")
    default int insertMultiple(Collection<SqlAlterTableAlterIndex> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, sqlAlterTableAlterIndex, c ->
            c.map(oid).toProperty("oid")
            .map(algorithm).toProperty("algorithm")
            .map(commentOid).toProperty("commentOid")
            .map(dbPartitionByOid).toProperty("dbPartitionByOid")
            .map(distanceMeasure).toProperty("distanceMeasure")
            .map(indexDefinitionOid).toProperty("indexDefinitionOid")
            .map(isGlobal).toProperty("isGlobal")
            .map(isHashMapType).toProperty("isHashMapType")
            .map(isKey).toProperty("isKey")
            .map(isUnique).toProperty("isUnique")
            .map(keyBlockSizeOid).toProperty("keyBlockSizeOid")
            .map(nameOid).toProperty("nameOid")
            .map(parserName).toProperty("parserName")
            .map(tablePartitionByOid).toProperty("tablePartitionByOid")
            .map(tablePartitionsOid).toProperty("tablePartitionsOid")
            .map(type).toProperty("type")
            .map(using).toProperty("using")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_table_alter_index")
    default int insertSelective(SqlAlterTableAlterIndex record) {
        return MyBatis3Utils.insert(this::insert, record, sqlAlterTableAlterIndex, c ->
            c.map(oid).toPropertyWhenPresent("oid", record::getOid)
            .map(algorithm).toPropertyWhenPresent("algorithm", record::getAlgorithm)
            .map(commentOid).toPropertyWhenPresent("commentOid", record::getCommentOid)
            .map(dbPartitionByOid).toPropertyWhenPresent("dbPartitionByOid", record::getDbPartitionByOid)
            .map(distanceMeasure).toPropertyWhenPresent("distanceMeasure", record::getDistanceMeasure)
            .map(indexDefinitionOid).toPropertyWhenPresent("indexDefinitionOid", record::getIndexDefinitionOid)
            .map(isGlobal).toPropertyWhenPresent("isGlobal", record::getIsGlobal)
            .map(isHashMapType).toPropertyWhenPresent("isHashMapType", record::getIsHashMapType)
            .map(isKey).toPropertyWhenPresent("isKey", record::getIsKey)
            .map(isUnique).toPropertyWhenPresent("isUnique", record::getIsUnique)
            .map(keyBlockSizeOid).toPropertyWhenPresent("keyBlockSizeOid", record::getKeyBlockSizeOid)
            .map(nameOid).toPropertyWhenPresent("nameOid", record::getNameOid)
            .map(parserName).toPropertyWhenPresent("parserName", record::getParserName)
            .map(tablePartitionByOid).toPropertyWhenPresent("tablePartitionByOid", record::getTablePartitionByOid)
            .map(tablePartitionsOid).toPropertyWhenPresent("tablePartitionsOid", record::getTablePartitionsOid)
            .map(type).toPropertyWhenPresent("type", record::getType)
            .map(using).toPropertyWhenPresent("using", record::getUsing)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_table_alter_index")
    default Optional<SqlAlterTableAlterIndex> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, sqlAlterTableAlterIndex, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_table_alter_index")
    default List<SqlAlterTableAlterIndex> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, sqlAlterTableAlterIndex, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_table_alter_index")
    default List<SqlAlterTableAlterIndex> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, sqlAlterTableAlterIndex, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_table_alter_index")
    default Optional<SqlAlterTableAlterIndex> selectByPrimaryKey(Long oid_) {
        return selectOne(c ->
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_table_alter_index")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, sqlAlterTableAlterIndex, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_table_alter_index")
    static UpdateDSL<UpdateModel> updateAllColumns(SqlAlterTableAlterIndex record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalTo(record::getOid)
                .set(algorithm).equalTo(record::getAlgorithm)
                .set(commentOid).equalTo(record::getCommentOid)
                .set(dbPartitionByOid).equalTo(record::getDbPartitionByOid)
                .set(distanceMeasure).equalTo(record::getDistanceMeasure)
                .set(indexDefinitionOid).equalTo(record::getIndexDefinitionOid)
                .set(isGlobal).equalTo(record::getIsGlobal)
                .set(isHashMapType).equalTo(record::getIsHashMapType)
                .set(isKey).equalTo(record::getIsKey)
                .set(isUnique).equalTo(record::getIsUnique)
                .set(keyBlockSizeOid).equalTo(record::getKeyBlockSizeOid)
                .set(nameOid).equalTo(record::getNameOid)
                .set(parserName).equalTo(record::getParserName)
                .set(tablePartitionByOid).equalTo(record::getTablePartitionByOid)
                .set(tablePartitionsOid).equalTo(record::getTablePartitionsOid)
                .set(type).equalTo(record::getType)
                .set(using).equalTo(record::getUsing);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_table_alter_index")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(SqlAlterTableAlterIndex record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalToWhenPresent(record::getOid)
                .set(algorithm).equalToWhenPresent(record::getAlgorithm)
                .set(commentOid).equalToWhenPresent(record::getCommentOid)
                .set(dbPartitionByOid).equalToWhenPresent(record::getDbPartitionByOid)
                .set(distanceMeasure).equalToWhenPresent(record::getDistanceMeasure)
                .set(indexDefinitionOid).equalToWhenPresent(record::getIndexDefinitionOid)
                .set(isGlobal).equalToWhenPresent(record::getIsGlobal)
                .set(isHashMapType).equalToWhenPresent(record::getIsHashMapType)
                .set(isKey).equalToWhenPresent(record::getIsKey)
                .set(isUnique).equalToWhenPresent(record::getIsUnique)
                .set(keyBlockSizeOid).equalToWhenPresent(record::getKeyBlockSizeOid)
                .set(nameOid).equalToWhenPresent(record::getNameOid)
                .set(parserName).equalToWhenPresent(record::getParserName)
                .set(tablePartitionByOid).equalToWhenPresent(record::getTablePartitionByOid)
                .set(tablePartitionsOid).equalToWhenPresent(record::getTablePartitionsOid)
                .set(type).equalToWhenPresent(record::getType)
                .set(using).equalToWhenPresent(record::getUsing);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_table_alter_index")
    default int updateByPrimaryKey(SqlAlterTableAlterIndex record) {
        return update(c ->
            c.set(algorithm).equalTo(record::getAlgorithm)
            .set(commentOid).equalTo(record::getCommentOid)
            .set(dbPartitionByOid).equalTo(record::getDbPartitionByOid)
            .set(distanceMeasure).equalTo(record::getDistanceMeasure)
            .set(indexDefinitionOid).equalTo(record::getIndexDefinitionOid)
            .set(isGlobal).equalTo(record::getIsGlobal)
            .set(isHashMapType).equalTo(record::getIsHashMapType)
            .set(isKey).equalTo(record::getIsKey)
            .set(isUnique).equalTo(record::getIsUnique)
            .set(keyBlockSizeOid).equalTo(record::getKeyBlockSizeOid)
            .set(nameOid).equalTo(record::getNameOid)
            .set(parserName).equalTo(record::getParserName)
            .set(tablePartitionByOid).equalTo(record::getTablePartitionByOid)
            .set(tablePartitionsOid).equalTo(record::getTablePartitionsOid)
            .set(type).equalTo(record::getType)
            .set(using).equalTo(record::getUsing)
            .where(oid, isEqualTo(record::getOid))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_table_alter_index")
    default int updateByPrimaryKeySelective(SqlAlterTableAlterIndex record) {
        return update(c ->
            c.set(algorithm).equalToWhenPresent(record::getAlgorithm)
            .set(commentOid).equalToWhenPresent(record::getCommentOid)
            .set(dbPartitionByOid).equalToWhenPresent(record::getDbPartitionByOid)
            .set(distanceMeasure).equalToWhenPresent(record::getDistanceMeasure)
            .set(indexDefinitionOid).equalToWhenPresent(record::getIndexDefinitionOid)
            .set(isGlobal).equalToWhenPresent(record::getIsGlobal)
            .set(isHashMapType).equalToWhenPresent(record::getIsHashMapType)
            .set(isKey).equalToWhenPresent(record::getIsKey)
            .set(isUnique).equalToWhenPresent(record::getIsUnique)
            .set(keyBlockSizeOid).equalToWhenPresent(record::getKeyBlockSizeOid)
            .set(nameOid).equalToWhenPresent(record::getNameOid)
            .set(parserName).equalToWhenPresent(record::getParserName)
            .set(tablePartitionByOid).equalToWhenPresent(record::getTablePartitionByOid)
            .set(tablePartitionsOid).equalToWhenPresent(record::getTablePartitionsOid)
            .set(type).equalToWhenPresent(record::getType)
            .set(using).equalToWhenPresent(record::getUsing)
            .where(oid, isEqualTo(record::getOid))
        );
    }
}