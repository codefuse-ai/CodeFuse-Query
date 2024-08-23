package com.alipay.codequery.dal.mybatis.mapper;

import static com.alipay.codequery.dal.mybatis.mapper.SqlIndexDefinitionDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.alipay.codequery.dal.mybatis.domain.SqlIndexDefinition;
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
public interface SqlIndexDefinitionMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_index_definition")
    BasicColumn[] selectList = BasicColumn.columnList(oid, algorithm, analyzerNameOid, dbPartitionByOid, distanceMeasure, indexAnalyzerNameOid, isGlobal, isHashMapType, isHashType, isIndex, isKey, isLocal, nameOid, optionsOid, queryAnalyzerNameOid, symbolOid, tableOid, tbPartitionByOid, tbPartitionsOid, type, withDicNameOid);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_index_definition")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_index_definition")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_index_definition")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<SqlIndexDefinition> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_index_definition")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<SqlIndexDefinition> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_index_definition")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="algorithm", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="analyzer_name_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="db_partition_by_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="distance_measure", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="index_analyzer_name_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_global", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_hash_map_type", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_hash_type", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_index", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_key", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_local", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="name_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="options_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="query_analyzer_name_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="symbol_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="table_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="tb_partition_by_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="tb_partitions_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="type", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="with_dic_name_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT)
    })
    Optional<SqlIndexDefinition> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_index_definition")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="algorithm", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="analyzer_name_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="db_partition_by_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="distance_measure", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="index_analyzer_name_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_global", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_hash_map_type", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_hash_type", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_index", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_key", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_local", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="name_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="options_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="query_analyzer_name_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="symbol_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="table_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="tb_partition_by_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="tb_partitions_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="type", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="with_dic_name_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT)
    })
    List<SqlIndexDefinition> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_index_definition")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_index_definition")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, sqlIndexDefinition, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_index_definition")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, sqlIndexDefinition, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_index_definition")
    default int deleteByPrimaryKey(Long oid_) {
        return delete(c -> 
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_index_definition")
    default int insert(SqlIndexDefinition record) {
        return MyBatis3Utils.insert(this::insert, record, sqlIndexDefinition, c ->
            c.map(oid).toProperty("oid")
            .map(algorithm).toProperty("algorithm")
            .map(analyzerNameOid).toProperty("analyzerNameOid")
            .map(dbPartitionByOid).toProperty("dbPartitionByOid")
            .map(distanceMeasure).toProperty("distanceMeasure")
            .map(indexAnalyzerNameOid).toProperty("indexAnalyzerNameOid")
            .map(isGlobal).toProperty("isGlobal")
            .map(isHashMapType).toProperty("isHashMapType")
            .map(isHashType).toProperty("isHashType")
            .map(isIndex).toProperty("isIndex")
            .map(isKey).toProperty("isKey")
            .map(isLocal).toProperty("isLocal")
            .map(nameOid).toProperty("nameOid")
            .map(optionsOid).toProperty("optionsOid")
            .map(queryAnalyzerNameOid).toProperty("queryAnalyzerNameOid")
            .map(symbolOid).toProperty("symbolOid")
            .map(tableOid).toProperty("tableOid")
            .map(tbPartitionByOid).toProperty("tbPartitionByOid")
            .map(tbPartitionsOid).toProperty("tbPartitionsOid")
            .map(type).toProperty("type")
            .map(withDicNameOid).toProperty("withDicNameOid")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_index_definition")
    default int insertMultiple(Collection<SqlIndexDefinition> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, sqlIndexDefinition, c ->
            c.map(oid).toProperty("oid")
            .map(algorithm).toProperty("algorithm")
            .map(analyzerNameOid).toProperty("analyzerNameOid")
            .map(dbPartitionByOid).toProperty("dbPartitionByOid")
            .map(distanceMeasure).toProperty("distanceMeasure")
            .map(indexAnalyzerNameOid).toProperty("indexAnalyzerNameOid")
            .map(isGlobal).toProperty("isGlobal")
            .map(isHashMapType).toProperty("isHashMapType")
            .map(isHashType).toProperty("isHashType")
            .map(isIndex).toProperty("isIndex")
            .map(isKey).toProperty("isKey")
            .map(isLocal).toProperty("isLocal")
            .map(nameOid).toProperty("nameOid")
            .map(optionsOid).toProperty("optionsOid")
            .map(queryAnalyzerNameOid).toProperty("queryAnalyzerNameOid")
            .map(symbolOid).toProperty("symbolOid")
            .map(tableOid).toProperty("tableOid")
            .map(tbPartitionByOid).toProperty("tbPartitionByOid")
            .map(tbPartitionsOid).toProperty("tbPartitionsOid")
            .map(type).toProperty("type")
            .map(withDicNameOid).toProperty("withDicNameOid")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_index_definition")
    default int insertSelective(SqlIndexDefinition record) {
        return MyBatis3Utils.insert(this::insert, record, sqlIndexDefinition, c ->
            c.map(oid).toPropertyWhenPresent("oid", record::getOid)
            .map(algorithm).toPropertyWhenPresent("algorithm", record::getAlgorithm)
            .map(analyzerNameOid).toPropertyWhenPresent("analyzerNameOid", record::getAnalyzerNameOid)
            .map(dbPartitionByOid).toPropertyWhenPresent("dbPartitionByOid", record::getDbPartitionByOid)
            .map(distanceMeasure).toPropertyWhenPresent("distanceMeasure", record::getDistanceMeasure)
            .map(indexAnalyzerNameOid).toPropertyWhenPresent("indexAnalyzerNameOid", record::getIndexAnalyzerNameOid)
            .map(isGlobal).toPropertyWhenPresent("isGlobal", record::getIsGlobal)
            .map(isHashMapType).toPropertyWhenPresent("isHashMapType", record::getIsHashMapType)
            .map(isHashType).toPropertyWhenPresent("isHashType", record::getIsHashType)
            .map(isIndex).toPropertyWhenPresent("isIndex", record::getIsIndex)
            .map(isKey).toPropertyWhenPresent("isKey", record::getIsKey)
            .map(isLocal).toPropertyWhenPresent("isLocal", record::getIsLocal)
            .map(nameOid).toPropertyWhenPresent("nameOid", record::getNameOid)
            .map(optionsOid).toPropertyWhenPresent("optionsOid", record::getOptionsOid)
            .map(queryAnalyzerNameOid).toPropertyWhenPresent("queryAnalyzerNameOid", record::getQueryAnalyzerNameOid)
            .map(symbolOid).toPropertyWhenPresent("symbolOid", record::getSymbolOid)
            .map(tableOid).toPropertyWhenPresent("tableOid", record::getTableOid)
            .map(tbPartitionByOid).toPropertyWhenPresent("tbPartitionByOid", record::getTbPartitionByOid)
            .map(tbPartitionsOid).toPropertyWhenPresent("tbPartitionsOid", record::getTbPartitionsOid)
            .map(type).toPropertyWhenPresent("type", record::getType)
            .map(withDicNameOid).toPropertyWhenPresent("withDicNameOid", record::getWithDicNameOid)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_index_definition")
    default Optional<SqlIndexDefinition> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, sqlIndexDefinition, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_index_definition")
    default List<SqlIndexDefinition> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, sqlIndexDefinition, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_index_definition")
    default List<SqlIndexDefinition> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, sqlIndexDefinition, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_index_definition")
    default Optional<SqlIndexDefinition> selectByPrimaryKey(Long oid_) {
        return selectOne(c ->
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_index_definition")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, sqlIndexDefinition, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_index_definition")
    static UpdateDSL<UpdateModel> updateAllColumns(SqlIndexDefinition record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalTo(record::getOid)
                .set(algorithm).equalTo(record::getAlgorithm)
                .set(analyzerNameOid).equalTo(record::getAnalyzerNameOid)
                .set(dbPartitionByOid).equalTo(record::getDbPartitionByOid)
                .set(distanceMeasure).equalTo(record::getDistanceMeasure)
                .set(indexAnalyzerNameOid).equalTo(record::getIndexAnalyzerNameOid)
                .set(isGlobal).equalTo(record::getIsGlobal)
                .set(isHashMapType).equalTo(record::getIsHashMapType)
                .set(isHashType).equalTo(record::getIsHashType)
                .set(isIndex).equalTo(record::getIsIndex)
                .set(isKey).equalTo(record::getIsKey)
                .set(isLocal).equalTo(record::getIsLocal)
                .set(nameOid).equalTo(record::getNameOid)
                .set(optionsOid).equalTo(record::getOptionsOid)
                .set(queryAnalyzerNameOid).equalTo(record::getQueryAnalyzerNameOid)
                .set(symbolOid).equalTo(record::getSymbolOid)
                .set(tableOid).equalTo(record::getTableOid)
                .set(tbPartitionByOid).equalTo(record::getTbPartitionByOid)
                .set(tbPartitionsOid).equalTo(record::getTbPartitionsOid)
                .set(type).equalTo(record::getType)
                .set(withDicNameOid).equalTo(record::getWithDicNameOid);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_index_definition")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(SqlIndexDefinition record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalToWhenPresent(record::getOid)
                .set(algorithm).equalToWhenPresent(record::getAlgorithm)
                .set(analyzerNameOid).equalToWhenPresent(record::getAnalyzerNameOid)
                .set(dbPartitionByOid).equalToWhenPresent(record::getDbPartitionByOid)
                .set(distanceMeasure).equalToWhenPresent(record::getDistanceMeasure)
                .set(indexAnalyzerNameOid).equalToWhenPresent(record::getIndexAnalyzerNameOid)
                .set(isGlobal).equalToWhenPresent(record::getIsGlobal)
                .set(isHashMapType).equalToWhenPresent(record::getIsHashMapType)
                .set(isHashType).equalToWhenPresent(record::getIsHashType)
                .set(isIndex).equalToWhenPresent(record::getIsIndex)
                .set(isKey).equalToWhenPresent(record::getIsKey)
                .set(isLocal).equalToWhenPresent(record::getIsLocal)
                .set(nameOid).equalToWhenPresent(record::getNameOid)
                .set(optionsOid).equalToWhenPresent(record::getOptionsOid)
                .set(queryAnalyzerNameOid).equalToWhenPresent(record::getQueryAnalyzerNameOid)
                .set(symbolOid).equalToWhenPresent(record::getSymbolOid)
                .set(tableOid).equalToWhenPresent(record::getTableOid)
                .set(tbPartitionByOid).equalToWhenPresent(record::getTbPartitionByOid)
                .set(tbPartitionsOid).equalToWhenPresent(record::getTbPartitionsOid)
                .set(type).equalToWhenPresent(record::getType)
                .set(withDicNameOid).equalToWhenPresent(record::getWithDicNameOid);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_index_definition")
    default int updateByPrimaryKey(SqlIndexDefinition record) {
        return update(c ->
            c.set(algorithm).equalTo(record::getAlgorithm)
            .set(analyzerNameOid).equalTo(record::getAnalyzerNameOid)
            .set(dbPartitionByOid).equalTo(record::getDbPartitionByOid)
            .set(distanceMeasure).equalTo(record::getDistanceMeasure)
            .set(indexAnalyzerNameOid).equalTo(record::getIndexAnalyzerNameOid)
            .set(isGlobal).equalTo(record::getIsGlobal)
            .set(isHashMapType).equalTo(record::getIsHashMapType)
            .set(isHashType).equalTo(record::getIsHashType)
            .set(isIndex).equalTo(record::getIsIndex)
            .set(isKey).equalTo(record::getIsKey)
            .set(isLocal).equalTo(record::getIsLocal)
            .set(nameOid).equalTo(record::getNameOid)
            .set(optionsOid).equalTo(record::getOptionsOid)
            .set(queryAnalyzerNameOid).equalTo(record::getQueryAnalyzerNameOid)
            .set(symbolOid).equalTo(record::getSymbolOid)
            .set(tableOid).equalTo(record::getTableOid)
            .set(tbPartitionByOid).equalTo(record::getTbPartitionByOid)
            .set(tbPartitionsOid).equalTo(record::getTbPartitionsOid)
            .set(type).equalTo(record::getType)
            .set(withDicNameOid).equalTo(record::getWithDicNameOid)
            .where(oid, isEqualTo(record::getOid))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_index_definition")
    default int updateByPrimaryKeySelective(SqlIndexDefinition record) {
        return update(c ->
            c.set(algorithm).equalToWhenPresent(record::getAlgorithm)
            .set(analyzerNameOid).equalToWhenPresent(record::getAnalyzerNameOid)
            .set(dbPartitionByOid).equalToWhenPresent(record::getDbPartitionByOid)
            .set(distanceMeasure).equalToWhenPresent(record::getDistanceMeasure)
            .set(indexAnalyzerNameOid).equalToWhenPresent(record::getIndexAnalyzerNameOid)
            .set(isGlobal).equalToWhenPresent(record::getIsGlobal)
            .set(isHashMapType).equalToWhenPresent(record::getIsHashMapType)
            .set(isHashType).equalToWhenPresent(record::getIsHashType)
            .set(isIndex).equalToWhenPresent(record::getIsIndex)
            .set(isKey).equalToWhenPresent(record::getIsKey)
            .set(isLocal).equalToWhenPresent(record::getIsLocal)
            .set(nameOid).equalToWhenPresent(record::getNameOid)
            .set(optionsOid).equalToWhenPresent(record::getOptionsOid)
            .set(queryAnalyzerNameOid).equalToWhenPresent(record::getQueryAnalyzerNameOid)
            .set(symbolOid).equalToWhenPresent(record::getSymbolOid)
            .set(tableOid).equalToWhenPresent(record::getTableOid)
            .set(tbPartitionByOid).equalToWhenPresent(record::getTbPartitionByOid)
            .set(tbPartitionsOid).equalToWhenPresent(record::getTbPartitionsOid)
            .set(type).equalToWhenPresent(record::getType)
            .set(withDicNameOid).equalToWhenPresent(record::getWithDicNameOid)
            .where(oid, isEqualTo(record::getOid))
        );
    }
}