package com.alipay.codequery.dal.mybatis.mapper;

import static com.alipay.codequery.dal.mybatis.mapper.MySqlTableIndexDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.alipay.codequery.dal.mybatis.domain.MySqlTableIndex;
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
public interface MySqlTableIndexMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_table_index")
    BasicColumn[] selectList = BasicColumn.columnList(oid, algorithm, analyzerNameOid, commentOid, dbPartitionByOid, distanceMeasure, indexAnalyzerNameOid, indexDefinitionOid, indexType, isGlobal, isLocal, nameOid, queryAnalyzerNameOid, tablePartitionByOid, tablePartitionsOid, withDicNameOid);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_table_index")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_table_index")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_table_index")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<MySqlTableIndex> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_table_index")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<MySqlTableIndex> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_table_index")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="algorithm", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="analyzer_name_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="comment_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="db_partition_by_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="distance_measure", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="index_analyzer_name_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="index_definition_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="index_type", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="is_global", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_local", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="name_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="query_analyzer_name_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="table_partition_by_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="table_partitions_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="with_dic_name_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT)
    })
    Optional<MySqlTableIndex> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_table_index")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="algorithm", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="analyzer_name_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="comment_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="db_partition_by_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="distance_measure", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="index_analyzer_name_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="index_definition_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="index_type", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="is_global", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_local", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="name_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="query_analyzer_name_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="table_partition_by_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="table_partitions_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="with_dic_name_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT)
    })
    List<MySqlTableIndex> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_table_index")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_table_index")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, mySqlTableIndex, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_table_index")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, mySqlTableIndex, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_table_index")
    default int deleteByPrimaryKey(Long oid_) {
        return delete(c -> 
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_table_index")
    default int insert(MySqlTableIndex record) {
        return MyBatis3Utils.insert(this::insert, record, mySqlTableIndex, c ->
            c.map(oid).toProperty("oid")
            .map(algorithm).toProperty("algorithm")
            .map(analyzerNameOid).toProperty("analyzerNameOid")
            .map(commentOid).toProperty("commentOid")
            .map(dbPartitionByOid).toProperty("dbPartitionByOid")
            .map(distanceMeasure).toProperty("distanceMeasure")
            .map(indexAnalyzerNameOid).toProperty("indexAnalyzerNameOid")
            .map(indexDefinitionOid).toProperty("indexDefinitionOid")
            .map(indexType).toProperty("indexType")
            .map(isGlobal).toProperty("isGlobal")
            .map(isLocal).toProperty("isLocal")
            .map(nameOid).toProperty("nameOid")
            .map(queryAnalyzerNameOid).toProperty("queryAnalyzerNameOid")
            .map(tablePartitionByOid).toProperty("tablePartitionByOid")
            .map(tablePartitionsOid).toProperty("tablePartitionsOid")
            .map(withDicNameOid).toProperty("withDicNameOid")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_table_index")
    default int insertMultiple(Collection<MySqlTableIndex> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, mySqlTableIndex, c ->
            c.map(oid).toProperty("oid")
            .map(algorithm).toProperty("algorithm")
            .map(analyzerNameOid).toProperty("analyzerNameOid")
            .map(commentOid).toProperty("commentOid")
            .map(dbPartitionByOid).toProperty("dbPartitionByOid")
            .map(distanceMeasure).toProperty("distanceMeasure")
            .map(indexAnalyzerNameOid).toProperty("indexAnalyzerNameOid")
            .map(indexDefinitionOid).toProperty("indexDefinitionOid")
            .map(indexType).toProperty("indexType")
            .map(isGlobal).toProperty("isGlobal")
            .map(isLocal).toProperty("isLocal")
            .map(nameOid).toProperty("nameOid")
            .map(queryAnalyzerNameOid).toProperty("queryAnalyzerNameOid")
            .map(tablePartitionByOid).toProperty("tablePartitionByOid")
            .map(tablePartitionsOid).toProperty("tablePartitionsOid")
            .map(withDicNameOid).toProperty("withDicNameOid")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_table_index")
    default int insertSelective(MySqlTableIndex record) {
        return MyBatis3Utils.insert(this::insert, record, mySqlTableIndex, c ->
            c.map(oid).toPropertyWhenPresent("oid", record::getOid)
            .map(algorithm).toPropertyWhenPresent("algorithm", record::getAlgorithm)
            .map(analyzerNameOid).toPropertyWhenPresent("analyzerNameOid", record::getAnalyzerNameOid)
            .map(commentOid).toPropertyWhenPresent("commentOid", record::getCommentOid)
            .map(dbPartitionByOid).toPropertyWhenPresent("dbPartitionByOid", record::getDbPartitionByOid)
            .map(distanceMeasure).toPropertyWhenPresent("distanceMeasure", record::getDistanceMeasure)
            .map(indexAnalyzerNameOid).toPropertyWhenPresent("indexAnalyzerNameOid", record::getIndexAnalyzerNameOid)
            .map(indexDefinitionOid).toPropertyWhenPresent("indexDefinitionOid", record::getIndexDefinitionOid)
            .map(indexType).toPropertyWhenPresent("indexType", record::getIndexType)
            .map(isGlobal).toPropertyWhenPresent("isGlobal", record::getIsGlobal)
            .map(isLocal).toPropertyWhenPresent("isLocal", record::getIsLocal)
            .map(nameOid).toPropertyWhenPresent("nameOid", record::getNameOid)
            .map(queryAnalyzerNameOid).toPropertyWhenPresent("queryAnalyzerNameOid", record::getQueryAnalyzerNameOid)
            .map(tablePartitionByOid).toPropertyWhenPresent("tablePartitionByOid", record::getTablePartitionByOid)
            .map(tablePartitionsOid).toPropertyWhenPresent("tablePartitionsOid", record::getTablePartitionsOid)
            .map(withDicNameOid).toPropertyWhenPresent("withDicNameOid", record::getWithDicNameOid)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_table_index")
    default Optional<MySqlTableIndex> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, mySqlTableIndex, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_table_index")
    default List<MySqlTableIndex> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, mySqlTableIndex, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_table_index")
    default List<MySqlTableIndex> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, mySqlTableIndex, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_table_index")
    default Optional<MySqlTableIndex> selectByPrimaryKey(Long oid_) {
        return selectOne(c ->
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_table_index")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, mySqlTableIndex, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_table_index")
    static UpdateDSL<UpdateModel> updateAllColumns(MySqlTableIndex record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalTo(record::getOid)
                .set(algorithm).equalTo(record::getAlgorithm)
                .set(analyzerNameOid).equalTo(record::getAnalyzerNameOid)
                .set(commentOid).equalTo(record::getCommentOid)
                .set(dbPartitionByOid).equalTo(record::getDbPartitionByOid)
                .set(distanceMeasure).equalTo(record::getDistanceMeasure)
                .set(indexAnalyzerNameOid).equalTo(record::getIndexAnalyzerNameOid)
                .set(indexDefinitionOid).equalTo(record::getIndexDefinitionOid)
                .set(indexType).equalTo(record::getIndexType)
                .set(isGlobal).equalTo(record::getIsGlobal)
                .set(isLocal).equalTo(record::getIsLocal)
                .set(nameOid).equalTo(record::getNameOid)
                .set(queryAnalyzerNameOid).equalTo(record::getQueryAnalyzerNameOid)
                .set(tablePartitionByOid).equalTo(record::getTablePartitionByOid)
                .set(tablePartitionsOid).equalTo(record::getTablePartitionsOid)
                .set(withDicNameOid).equalTo(record::getWithDicNameOid);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_table_index")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(MySqlTableIndex record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalToWhenPresent(record::getOid)
                .set(algorithm).equalToWhenPresent(record::getAlgorithm)
                .set(analyzerNameOid).equalToWhenPresent(record::getAnalyzerNameOid)
                .set(commentOid).equalToWhenPresent(record::getCommentOid)
                .set(dbPartitionByOid).equalToWhenPresent(record::getDbPartitionByOid)
                .set(distanceMeasure).equalToWhenPresent(record::getDistanceMeasure)
                .set(indexAnalyzerNameOid).equalToWhenPresent(record::getIndexAnalyzerNameOid)
                .set(indexDefinitionOid).equalToWhenPresent(record::getIndexDefinitionOid)
                .set(indexType).equalToWhenPresent(record::getIndexType)
                .set(isGlobal).equalToWhenPresent(record::getIsGlobal)
                .set(isLocal).equalToWhenPresent(record::getIsLocal)
                .set(nameOid).equalToWhenPresent(record::getNameOid)
                .set(queryAnalyzerNameOid).equalToWhenPresent(record::getQueryAnalyzerNameOid)
                .set(tablePartitionByOid).equalToWhenPresent(record::getTablePartitionByOid)
                .set(tablePartitionsOid).equalToWhenPresent(record::getTablePartitionsOid)
                .set(withDicNameOid).equalToWhenPresent(record::getWithDicNameOid);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_table_index")
    default int updateByPrimaryKey(MySqlTableIndex record) {
        return update(c ->
            c.set(algorithm).equalTo(record::getAlgorithm)
            .set(analyzerNameOid).equalTo(record::getAnalyzerNameOid)
            .set(commentOid).equalTo(record::getCommentOid)
            .set(dbPartitionByOid).equalTo(record::getDbPartitionByOid)
            .set(distanceMeasure).equalTo(record::getDistanceMeasure)
            .set(indexAnalyzerNameOid).equalTo(record::getIndexAnalyzerNameOid)
            .set(indexDefinitionOid).equalTo(record::getIndexDefinitionOid)
            .set(indexType).equalTo(record::getIndexType)
            .set(isGlobal).equalTo(record::getIsGlobal)
            .set(isLocal).equalTo(record::getIsLocal)
            .set(nameOid).equalTo(record::getNameOid)
            .set(queryAnalyzerNameOid).equalTo(record::getQueryAnalyzerNameOid)
            .set(tablePartitionByOid).equalTo(record::getTablePartitionByOid)
            .set(tablePartitionsOid).equalTo(record::getTablePartitionsOid)
            .set(withDicNameOid).equalTo(record::getWithDicNameOid)
            .where(oid, isEqualTo(record::getOid))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_table_index")
    default int updateByPrimaryKeySelective(MySqlTableIndex record) {
        return update(c ->
            c.set(algorithm).equalToWhenPresent(record::getAlgorithm)
            .set(analyzerNameOid).equalToWhenPresent(record::getAnalyzerNameOid)
            .set(commentOid).equalToWhenPresent(record::getCommentOid)
            .set(dbPartitionByOid).equalToWhenPresent(record::getDbPartitionByOid)
            .set(distanceMeasure).equalToWhenPresent(record::getDistanceMeasure)
            .set(indexAnalyzerNameOid).equalToWhenPresent(record::getIndexAnalyzerNameOid)
            .set(indexDefinitionOid).equalToWhenPresent(record::getIndexDefinitionOid)
            .set(indexType).equalToWhenPresent(record::getIndexType)
            .set(isGlobal).equalToWhenPresent(record::getIsGlobal)
            .set(isLocal).equalToWhenPresent(record::getIsLocal)
            .set(nameOid).equalToWhenPresent(record::getNameOid)
            .set(queryAnalyzerNameOid).equalToWhenPresent(record::getQueryAnalyzerNameOid)
            .set(tablePartitionByOid).equalToWhenPresent(record::getTablePartitionByOid)
            .set(tablePartitionsOid).equalToWhenPresent(record::getTablePartitionsOid)
            .set(withDicNameOid).equalToWhenPresent(record::getWithDicNameOid)
            .where(oid, isEqualTo(record::getOid))
        );
    }
}