package com.alipay.codequery.dal.mybatis.mapper;

import static com.alipay.codequery.dal.mybatis.mapper.SqlPartitionDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.alipay.codequery.dal.mybatis.domain.SqlPartition;
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
public interface SqlPartitionMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_partition")
    BasicColumn[] selectList = BasicColumn.columnList(oid, commentOid, dataDirectoryOid, engineOid, indexDirectoryOid, isSegmentCreationDeferred, isSegmentCreationImmediate, lobStorage, localityOid, maxRowsOid, minRowsOid, nameOid, subPartitionsCountOid, valuesOid);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_partition")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_partition")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_partition")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<SqlPartition> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_partition")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<SqlPartition> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_partition")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="comment_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="data_directory_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="engine_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="index_directory_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_segment_creation_deferred", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_segment_creation_immediate", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="lob_storage", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="locality_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="max_rows_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="min_rows_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="name_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="sub_partitions_count_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="values_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT)
    })
    Optional<SqlPartition> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_partition")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="comment_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="data_directory_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="engine_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="index_directory_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_segment_creation_deferred", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_segment_creation_immediate", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="lob_storage", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="locality_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="max_rows_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="min_rows_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="name_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="sub_partitions_count_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="values_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT)
    })
    List<SqlPartition> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_partition")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_partition")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, sqlPartition, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_partition")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, sqlPartition, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_partition")
    default int deleteByPrimaryKey(Long oid_) {
        return delete(c -> 
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_partition")
    default int insert(SqlPartition record) {
        return MyBatis3Utils.insert(this::insert, record, sqlPartition, c ->
            c.map(oid).toProperty("oid")
            .map(commentOid).toProperty("commentOid")
            .map(dataDirectoryOid).toProperty("dataDirectoryOid")
            .map(engineOid).toProperty("engineOid")
            .map(indexDirectoryOid).toProperty("indexDirectoryOid")
            .map(isSegmentCreationDeferred).toProperty("isSegmentCreationDeferred")
            .map(isSegmentCreationImmediate).toProperty("isSegmentCreationImmediate")
            .map(lobStorage).toProperty("lobStorage")
            .map(localityOid).toProperty("localityOid")
            .map(maxRowsOid).toProperty("maxRowsOid")
            .map(minRowsOid).toProperty("minRowsOid")
            .map(nameOid).toProperty("nameOid")
            .map(subPartitionsCountOid).toProperty("subPartitionsCountOid")
            .map(valuesOid).toProperty("valuesOid")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_partition")
    default int insertMultiple(Collection<SqlPartition> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, sqlPartition, c ->
            c.map(oid).toProperty("oid")
            .map(commentOid).toProperty("commentOid")
            .map(dataDirectoryOid).toProperty("dataDirectoryOid")
            .map(engineOid).toProperty("engineOid")
            .map(indexDirectoryOid).toProperty("indexDirectoryOid")
            .map(isSegmentCreationDeferred).toProperty("isSegmentCreationDeferred")
            .map(isSegmentCreationImmediate).toProperty("isSegmentCreationImmediate")
            .map(lobStorage).toProperty("lobStorage")
            .map(localityOid).toProperty("localityOid")
            .map(maxRowsOid).toProperty("maxRowsOid")
            .map(minRowsOid).toProperty("minRowsOid")
            .map(nameOid).toProperty("nameOid")
            .map(subPartitionsCountOid).toProperty("subPartitionsCountOid")
            .map(valuesOid).toProperty("valuesOid")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_partition")
    default int insertSelective(SqlPartition record) {
        return MyBatis3Utils.insert(this::insert, record, sqlPartition, c ->
            c.map(oid).toPropertyWhenPresent("oid", record::getOid)
            .map(commentOid).toPropertyWhenPresent("commentOid", record::getCommentOid)
            .map(dataDirectoryOid).toPropertyWhenPresent("dataDirectoryOid", record::getDataDirectoryOid)
            .map(engineOid).toPropertyWhenPresent("engineOid", record::getEngineOid)
            .map(indexDirectoryOid).toPropertyWhenPresent("indexDirectoryOid", record::getIndexDirectoryOid)
            .map(isSegmentCreationDeferred).toPropertyWhenPresent("isSegmentCreationDeferred", record::getIsSegmentCreationDeferred)
            .map(isSegmentCreationImmediate).toPropertyWhenPresent("isSegmentCreationImmediate", record::getIsSegmentCreationImmediate)
            .map(lobStorage).toPropertyWhenPresent("lobStorage", record::getLobStorage)
            .map(localityOid).toPropertyWhenPresent("localityOid", record::getLocalityOid)
            .map(maxRowsOid).toPropertyWhenPresent("maxRowsOid", record::getMaxRowsOid)
            .map(minRowsOid).toPropertyWhenPresent("minRowsOid", record::getMinRowsOid)
            .map(nameOid).toPropertyWhenPresent("nameOid", record::getNameOid)
            .map(subPartitionsCountOid).toPropertyWhenPresent("subPartitionsCountOid", record::getSubPartitionsCountOid)
            .map(valuesOid).toPropertyWhenPresent("valuesOid", record::getValuesOid)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_partition")
    default Optional<SqlPartition> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, sqlPartition, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_partition")
    default List<SqlPartition> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, sqlPartition, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_partition")
    default List<SqlPartition> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, sqlPartition, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_partition")
    default Optional<SqlPartition> selectByPrimaryKey(Long oid_) {
        return selectOne(c ->
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_partition")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, sqlPartition, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_partition")
    static UpdateDSL<UpdateModel> updateAllColumns(SqlPartition record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalTo(record::getOid)
                .set(commentOid).equalTo(record::getCommentOid)
                .set(dataDirectoryOid).equalTo(record::getDataDirectoryOid)
                .set(engineOid).equalTo(record::getEngineOid)
                .set(indexDirectoryOid).equalTo(record::getIndexDirectoryOid)
                .set(isSegmentCreationDeferred).equalTo(record::getIsSegmentCreationDeferred)
                .set(isSegmentCreationImmediate).equalTo(record::getIsSegmentCreationImmediate)
                .set(lobStorage).equalTo(record::getLobStorage)
                .set(localityOid).equalTo(record::getLocalityOid)
                .set(maxRowsOid).equalTo(record::getMaxRowsOid)
                .set(minRowsOid).equalTo(record::getMinRowsOid)
                .set(nameOid).equalTo(record::getNameOid)
                .set(subPartitionsCountOid).equalTo(record::getSubPartitionsCountOid)
                .set(valuesOid).equalTo(record::getValuesOid);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_partition")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(SqlPartition record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalToWhenPresent(record::getOid)
                .set(commentOid).equalToWhenPresent(record::getCommentOid)
                .set(dataDirectoryOid).equalToWhenPresent(record::getDataDirectoryOid)
                .set(engineOid).equalToWhenPresent(record::getEngineOid)
                .set(indexDirectoryOid).equalToWhenPresent(record::getIndexDirectoryOid)
                .set(isSegmentCreationDeferred).equalToWhenPresent(record::getIsSegmentCreationDeferred)
                .set(isSegmentCreationImmediate).equalToWhenPresent(record::getIsSegmentCreationImmediate)
                .set(lobStorage).equalToWhenPresent(record::getLobStorage)
                .set(localityOid).equalToWhenPresent(record::getLocalityOid)
                .set(maxRowsOid).equalToWhenPresent(record::getMaxRowsOid)
                .set(minRowsOid).equalToWhenPresent(record::getMinRowsOid)
                .set(nameOid).equalToWhenPresent(record::getNameOid)
                .set(subPartitionsCountOid).equalToWhenPresent(record::getSubPartitionsCountOid)
                .set(valuesOid).equalToWhenPresent(record::getValuesOid);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_partition")
    default int updateByPrimaryKey(SqlPartition record) {
        return update(c ->
            c.set(commentOid).equalTo(record::getCommentOid)
            .set(dataDirectoryOid).equalTo(record::getDataDirectoryOid)
            .set(engineOid).equalTo(record::getEngineOid)
            .set(indexDirectoryOid).equalTo(record::getIndexDirectoryOid)
            .set(isSegmentCreationDeferred).equalTo(record::getIsSegmentCreationDeferred)
            .set(isSegmentCreationImmediate).equalTo(record::getIsSegmentCreationImmediate)
            .set(lobStorage).equalTo(record::getLobStorage)
            .set(localityOid).equalTo(record::getLocalityOid)
            .set(maxRowsOid).equalTo(record::getMaxRowsOid)
            .set(minRowsOid).equalTo(record::getMinRowsOid)
            .set(nameOid).equalTo(record::getNameOid)
            .set(subPartitionsCountOid).equalTo(record::getSubPartitionsCountOid)
            .set(valuesOid).equalTo(record::getValuesOid)
            .where(oid, isEqualTo(record::getOid))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_partition")
    default int updateByPrimaryKeySelective(SqlPartition record) {
        return update(c ->
            c.set(commentOid).equalToWhenPresent(record::getCommentOid)
            .set(dataDirectoryOid).equalToWhenPresent(record::getDataDirectoryOid)
            .set(engineOid).equalToWhenPresent(record::getEngineOid)
            .set(indexDirectoryOid).equalToWhenPresent(record::getIndexDirectoryOid)
            .set(isSegmentCreationDeferred).equalToWhenPresent(record::getIsSegmentCreationDeferred)
            .set(isSegmentCreationImmediate).equalToWhenPresent(record::getIsSegmentCreationImmediate)
            .set(lobStorage).equalToWhenPresent(record::getLobStorage)
            .set(localityOid).equalToWhenPresent(record::getLocalityOid)
            .set(maxRowsOid).equalToWhenPresent(record::getMaxRowsOid)
            .set(minRowsOid).equalToWhenPresent(record::getMinRowsOid)
            .set(nameOid).equalToWhenPresent(record::getNameOid)
            .set(subPartitionsCountOid).equalToWhenPresent(record::getSubPartitionsCountOid)
            .set(valuesOid).equalToWhenPresent(record::getValuesOid)
            .where(oid, isEqualTo(record::getOid))
        );
    }
}