package com.alipay.codequery.dal.mybatis.mapper;

import static com.alipay.codequery.dal.mybatis.mapper.OracleCreateTableStatementDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.alipay.codequery.dal.mybatis.domain.OracleCreateTableStatement;
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
public interface OracleCreateTableStatementMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_create_table_statement")
    BasicColumn[] selectList = BasicColumn.columnList(oid, cache, clusterOid, compressLevel, deferredSegmentCreation, enableRowMovement, initrans, isCompressForOltp, isCursorSpecificSegment, isInMemoryMetadata, isMonitoring, isOnCommitDeleteRows, lobStorageOid, maxtrans, ofOid, oidIndex, organization, parallel, parallelValueOid, pctfree, pctincrease, pctused, storageOid, xmlTypeColumnPropertiesOid);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_create_table_statement")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_create_table_statement")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_create_table_statement")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<OracleCreateTableStatement> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_create_table_statement")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<OracleCreateTableStatement> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_create_table_statement")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="cache", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="cluster_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="compress_level", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="deferred_segment_creation", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="enable_row_movement", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="initrans", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_compress_for_oltp", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_cursor_specific_segment", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_in_memory_metadata", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_monitoring", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_on_commit_delete_rows", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="lob_storage_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="maxtrans", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="of_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="oid_index", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="organization", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="parallel", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="parallel_value_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="pctfree", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="pctincrease", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="pctused", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="storage_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="xml_type_column_properties_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT)
    })
    Optional<OracleCreateTableStatement> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_create_table_statement")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="cache", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="cluster_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="compress_level", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="deferred_segment_creation", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="enable_row_movement", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="initrans", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_compress_for_oltp", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_cursor_specific_segment", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_in_memory_metadata", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_monitoring", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_on_commit_delete_rows", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="lob_storage_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="maxtrans", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="of_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="oid_index", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="organization", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="parallel", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="parallel_value_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="pctfree", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="pctincrease", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="pctused", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="storage_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="xml_type_column_properties_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT)
    })
    List<OracleCreateTableStatement> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_create_table_statement")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_create_table_statement")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, oracleCreateTableStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_create_table_statement")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, oracleCreateTableStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_create_table_statement")
    default int deleteByPrimaryKey(Long oid_) {
        return delete(c -> 
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_create_table_statement")
    default int insert(OracleCreateTableStatement record) {
        return MyBatis3Utils.insert(this::insert, record, oracleCreateTableStatement, c ->
            c.map(oid).toProperty("oid")
            .map(cache).toProperty("cache")
            .map(clusterOid).toProperty("clusterOid")
            .map(compressLevel).toProperty("compressLevel")
            .map(deferredSegmentCreation).toProperty("deferredSegmentCreation")
            .map(enableRowMovement).toProperty("enableRowMovement")
            .map(initrans).toProperty("initrans")
            .map(isCompressForOltp).toProperty("isCompressForOltp")
            .map(isCursorSpecificSegment).toProperty("isCursorSpecificSegment")
            .map(isInMemoryMetadata).toProperty("isInMemoryMetadata")
            .map(isMonitoring).toProperty("isMonitoring")
            .map(isOnCommitDeleteRows).toProperty("isOnCommitDeleteRows")
            .map(lobStorageOid).toProperty("lobStorageOid")
            .map(maxtrans).toProperty("maxtrans")
            .map(ofOid).toProperty("ofOid")
            .map(oidIndex).toProperty("oidIndex")
            .map(organization).toProperty("organization")
            .map(parallel).toProperty("parallel")
            .map(parallelValueOid).toProperty("parallelValueOid")
            .map(pctfree).toProperty("pctfree")
            .map(pctincrease).toProperty("pctincrease")
            .map(pctused).toProperty("pctused")
            .map(storageOid).toProperty("storageOid")
            .map(xmlTypeColumnPropertiesOid).toProperty("xmlTypeColumnPropertiesOid")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_create_table_statement")
    default int insertMultiple(Collection<OracleCreateTableStatement> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, oracleCreateTableStatement, c ->
            c.map(oid).toProperty("oid")
            .map(cache).toProperty("cache")
            .map(clusterOid).toProperty("clusterOid")
            .map(compressLevel).toProperty("compressLevel")
            .map(deferredSegmentCreation).toProperty("deferredSegmentCreation")
            .map(enableRowMovement).toProperty("enableRowMovement")
            .map(initrans).toProperty("initrans")
            .map(isCompressForOltp).toProperty("isCompressForOltp")
            .map(isCursorSpecificSegment).toProperty("isCursorSpecificSegment")
            .map(isInMemoryMetadata).toProperty("isInMemoryMetadata")
            .map(isMonitoring).toProperty("isMonitoring")
            .map(isOnCommitDeleteRows).toProperty("isOnCommitDeleteRows")
            .map(lobStorageOid).toProperty("lobStorageOid")
            .map(maxtrans).toProperty("maxtrans")
            .map(ofOid).toProperty("ofOid")
            .map(oidIndex).toProperty("oidIndex")
            .map(organization).toProperty("organization")
            .map(parallel).toProperty("parallel")
            .map(parallelValueOid).toProperty("parallelValueOid")
            .map(pctfree).toProperty("pctfree")
            .map(pctincrease).toProperty("pctincrease")
            .map(pctused).toProperty("pctused")
            .map(storageOid).toProperty("storageOid")
            .map(xmlTypeColumnPropertiesOid).toProperty("xmlTypeColumnPropertiesOid")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_create_table_statement")
    default int insertSelective(OracleCreateTableStatement record) {
        return MyBatis3Utils.insert(this::insert, record, oracleCreateTableStatement, c ->
            c.map(oid).toPropertyWhenPresent("oid", record::getOid)
            .map(cache).toPropertyWhenPresent("cache", record::getCache)
            .map(clusterOid).toPropertyWhenPresent("clusterOid", record::getClusterOid)
            .map(compressLevel).toPropertyWhenPresent("compressLevel", record::getCompressLevel)
            .map(deferredSegmentCreation).toPropertyWhenPresent("deferredSegmentCreation", record::getDeferredSegmentCreation)
            .map(enableRowMovement).toPropertyWhenPresent("enableRowMovement", record::getEnableRowMovement)
            .map(initrans).toPropertyWhenPresent("initrans", record::getInitrans)
            .map(isCompressForOltp).toPropertyWhenPresent("isCompressForOltp", record::getIsCompressForOltp)
            .map(isCursorSpecificSegment).toPropertyWhenPresent("isCursorSpecificSegment", record::getIsCursorSpecificSegment)
            .map(isInMemoryMetadata).toPropertyWhenPresent("isInMemoryMetadata", record::getIsInMemoryMetadata)
            .map(isMonitoring).toPropertyWhenPresent("isMonitoring", record::getIsMonitoring)
            .map(isOnCommitDeleteRows).toPropertyWhenPresent("isOnCommitDeleteRows", record::getIsOnCommitDeleteRows)
            .map(lobStorageOid).toPropertyWhenPresent("lobStorageOid", record::getLobStorageOid)
            .map(maxtrans).toPropertyWhenPresent("maxtrans", record::getMaxtrans)
            .map(ofOid).toPropertyWhenPresent("ofOid", record::getOfOid)
            .map(oidIndex).toPropertyWhenPresent("oidIndex", record::getOidIndex)
            .map(organization).toPropertyWhenPresent("organization", record::getOrganization)
            .map(parallel).toPropertyWhenPresent("parallel", record::getParallel)
            .map(parallelValueOid).toPropertyWhenPresent("parallelValueOid", record::getParallelValueOid)
            .map(pctfree).toPropertyWhenPresent("pctfree", record::getPctfree)
            .map(pctincrease).toPropertyWhenPresent("pctincrease", record::getPctincrease)
            .map(pctused).toPropertyWhenPresent("pctused", record::getPctused)
            .map(storageOid).toPropertyWhenPresent("storageOid", record::getStorageOid)
            .map(xmlTypeColumnPropertiesOid).toPropertyWhenPresent("xmlTypeColumnPropertiesOid", record::getXmlTypeColumnPropertiesOid)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_create_table_statement")
    default Optional<OracleCreateTableStatement> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, oracleCreateTableStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_create_table_statement")
    default List<OracleCreateTableStatement> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, oracleCreateTableStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_create_table_statement")
    default List<OracleCreateTableStatement> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, oracleCreateTableStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_create_table_statement")
    default Optional<OracleCreateTableStatement> selectByPrimaryKey(Long oid_) {
        return selectOne(c ->
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_create_table_statement")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, oracleCreateTableStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_create_table_statement")
    static UpdateDSL<UpdateModel> updateAllColumns(OracleCreateTableStatement record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalTo(record::getOid)
                .set(cache).equalTo(record::getCache)
                .set(clusterOid).equalTo(record::getClusterOid)
                .set(compressLevel).equalTo(record::getCompressLevel)
                .set(deferredSegmentCreation).equalTo(record::getDeferredSegmentCreation)
                .set(enableRowMovement).equalTo(record::getEnableRowMovement)
                .set(initrans).equalTo(record::getInitrans)
                .set(isCompressForOltp).equalTo(record::getIsCompressForOltp)
                .set(isCursorSpecificSegment).equalTo(record::getIsCursorSpecificSegment)
                .set(isInMemoryMetadata).equalTo(record::getIsInMemoryMetadata)
                .set(isMonitoring).equalTo(record::getIsMonitoring)
                .set(isOnCommitDeleteRows).equalTo(record::getIsOnCommitDeleteRows)
                .set(lobStorageOid).equalTo(record::getLobStorageOid)
                .set(maxtrans).equalTo(record::getMaxtrans)
                .set(ofOid).equalTo(record::getOfOid)
                .set(oidIndex).equalTo(record::getOidIndex)
                .set(organization).equalTo(record::getOrganization)
                .set(parallel).equalTo(record::getParallel)
                .set(parallelValueOid).equalTo(record::getParallelValueOid)
                .set(pctfree).equalTo(record::getPctfree)
                .set(pctincrease).equalTo(record::getPctincrease)
                .set(pctused).equalTo(record::getPctused)
                .set(storageOid).equalTo(record::getStorageOid)
                .set(xmlTypeColumnPropertiesOid).equalTo(record::getXmlTypeColumnPropertiesOid);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_create_table_statement")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(OracleCreateTableStatement record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalToWhenPresent(record::getOid)
                .set(cache).equalToWhenPresent(record::getCache)
                .set(clusterOid).equalToWhenPresent(record::getClusterOid)
                .set(compressLevel).equalToWhenPresent(record::getCompressLevel)
                .set(deferredSegmentCreation).equalToWhenPresent(record::getDeferredSegmentCreation)
                .set(enableRowMovement).equalToWhenPresent(record::getEnableRowMovement)
                .set(initrans).equalToWhenPresent(record::getInitrans)
                .set(isCompressForOltp).equalToWhenPresent(record::getIsCompressForOltp)
                .set(isCursorSpecificSegment).equalToWhenPresent(record::getIsCursorSpecificSegment)
                .set(isInMemoryMetadata).equalToWhenPresent(record::getIsInMemoryMetadata)
                .set(isMonitoring).equalToWhenPresent(record::getIsMonitoring)
                .set(isOnCommitDeleteRows).equalToWhenPresent(record::getIsOnCommitDeleteRows)
                .set(lobStorageOid).equalToWhenPresent(record::getLobStorageOid)
                .set(maxtrans).equalToWhenPresent(record::getMaxtrans)
                .set(ofOid).equalToWhenPresent(record::getOfOid)
                .set(oidIndex).equalToWhenPresent(record::getOidIndex)
                .set(organization).equalToWhenPresent(record::getOrganization)
                .set(parallel).equalToWhenPresent(record::getParallel)
                .set(parallelValueOid).equalToWhenPresent(record::getParallelValueOid)
                .set(pctfree).equalToWhenPresent(record::getPctfree)
                .set(pctincrease).equalToWhenPresent(record::getPctincrease)
                .set(pctused).equalToWhenPresent(record::getPctused)
                .set(storageOid).equalToWhenPresent(record::getStorageOid)
                .set(xmlTypeColumnPropertiesOid).equalToWhenPresent(record::getXmlTypeColumnPropertiesOid);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_create_table_statement")
    default int updateByPrimaryKey(OracleCreateTableStatement record) {
        return update(c ->
            c.set(cache).equalTo(record::getCache)
            .set(clusterOid).equalTo(record::getClusterOid)
            .set(compressLevel).equalTo(record::getCompressLevel)
            .set(deferredSegmentCreation).equalTo(record::getDeferredSegmentCreation)
            .set(enableRowMovement).equalTo(record::getEnableRowMovement)
            .set(initrans).equalTo(record::getInitrans)
            .set(isCompressForOltp).equalTo(record::getIsCompressForOltp)
            .set(isCursorSpecificSegment).equalTo(record::getIsCursorSpecificSegment)
            .set(isInMemoryMetadata).equalTo(record::getIsInMemoryMetadata)
            .set(isMonitoring).equalTo(record::getIsMonitoring)
            .set(isOnCommitDeleteRows).equalTo(record::getIsOnCommitDeleteRows)
            .set(lobStorageOid).equalTo(record::getLobStorageOid)
            .set(maxtrans).equalTo(record::getMaxtrans)
            .set(ofOid).equalTo(record::getOfOid)
            .set(oidIndex).equalTo(record::getOidIndex)
            .set(organization).equalTo(record::getOrganization)
            .set(parallel).equalTo(record::getParallel)
            .set(parallelValueOid).equalTo(record::getParallelValueOid)
            .set(pctfree).equalTo(record::getPctfree)
            .set(pctincrease).equalTo(record::getPctincrease)
            .set(pctused).equalTo(record::getPctused)
            .set(storageOid).equalTo(record::getStorageOid)
            .set(xmlTypeColumnPropertiesOid).equalTo(record::getXmlTypeColumnPropertiesOid)
            .where(oid, isEqualTo(record::getOid))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_create_table_statement")
    default int updateByPrimaryKeySelective(OracleCreateTableStatement record) {
        return update(c ->
            c.set(cache).equalToWhenPresent(record::getCache)
            .set(clusterOid).equalToWhenPresent(record::getClusterOid)
            .set(compressLevel).equalToWhenPresent(record::getCompressLevel)
            .set(deferredSegmentCreation).equalToWhenPresent(record::getDeferredSegmentCreation)
            .set(enableRowMovement).equalToWhenPresent(record::getEnableRowMovement)
            .set(initrans).equalToWhenPresent(record::getInitrans)
            .set(isCompressForOltp).equalToWhenPresent(record::getIsCompressForOltp)
            .set(isCursorSpecificSegment).equalToWhenPresent(record::getIsCursorSpecificSegment)
            .set(isInMemoryMetadata).equalToWhenPresent(record::getIsInMemoryMetadata)
            .set(isMonitoring).equalToWhenPresent(record::getIsMonitoring)
            .set(isOnCommitDeleteRows).equalToWhenPresent(record::getIsOnCommitDeleteRows)
            .set(lobStorageOid).equalToWhenPresent(record::getLobStorageOid)
            .set(maxtrans).equalToWhenPresent(record::getMaxtrans)
            .set(ofOid).equalToWhenPresent(record::getOfOid)
            .set(oidIndex).equalToWhenPresent(record::getOidIndex)
            .set(organization).equalToWhenPresent(record::getOrganization)
            .set(parallel).equalToWhenPresent(record::getParallel)
            .set(parallelValueOid).equalToWhenPresent(record::getParallelValueOid)
            .set(pctfree).equalToWhenPresent(record::getPctfree)
            .set(pctincrease).equalToWhenPresent(record::getPctincrease)
            .set(pctused).equalToWhenPresent(record::getPctused)
            .set(storageOid).equalToWhenPresent(record::getStorageOid)
            .set(xmlTypeColumnPropertiesOid).equalToWhenPresent(record::getXmlTypeColumnPropertiesOid)
            .where(oid, isEqualTo(record::getOid))
        );
    }
}