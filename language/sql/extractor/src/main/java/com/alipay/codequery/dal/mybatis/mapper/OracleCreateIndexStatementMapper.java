package com.alipay.codequery.dal.mybatis.mapper;

import static com.alipay.codequery.dal.mybatis.mapper.OracleCreateIndexStatementDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.alipay.codequery.dal.mybatis.domain.OracleCreateIndexStatement;
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
public interface OracleCreateIndexStatementMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_create_index_statement")
    BasicColumn[] selectList = BasicColumn.columnList(oid, compress, compressLevel, enable, freeLists, initrans, isCluster, isCompressForOltp, isComputeStatistics, isGlobal, isIndexOnlyTopLevel, isLocal, isNoParallel, isOnline, isReverse, logging, maxtrans, parallelOid, pctfree, pctincrease, pctthreshold, pctused, sort, storage, tablespaceOid);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_create_index_statement")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_create_index_statement")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_create_index_statement")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<OracleCreateIndexStatement> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_create_index_statement")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<OracleCreateIndexStatement> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_create_index_statement")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="compress", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="compress_level", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="enable", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="free_lists", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="initrans", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_cluster", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_compress_for_oltp", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_compute_statistics", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_global", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_index_only_top_level", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_local", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_no_parallel", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_online", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_reverse", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="logging", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="maxtrans", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="parallel_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="pctfree", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="pctincrease", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="pctthreshold", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="pctused", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="sort", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="storage", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="tablespace_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT)
    })
    Optional<OracleCreateIndexStatement> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_create_index_statement")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="compress", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="compress_level", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="enable", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="free_lists", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="initrans", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_cluster", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_compress_for_oltp", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_compute_statistics", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_global", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_index_only_top_level", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_local", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_no_parallel", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_online", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_reverse", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="logging", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="maxtrans", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="parallel_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="pctfree", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="pctincrease", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="pctthreshold", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="pctused", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="sort", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="storage", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="tablespace_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT)
    })
    List<OracleCreateIndexStatement> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_create_index_statement")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_create_index_statement")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, oracleCreateIndexStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_create_index_statement")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, oracleCreateIndexStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_create_index_statement")
    default int deleteByPrimaryKey(Long oid_) {
        return delete(c -> 
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_create_index_statement")
    default int insert(OracleCreateIndexStatement record) {
        return MyBatis3Utils.insert(this::insert, record, oracleCreateIndexStatement, c ->
            c.map(oid).toProperty("oid")
            .map(compress).toProperty("compress")
            .map(compressLevel).toProperty("compressLevel")
            .map(enable).toProperty("enable")
            .map(freeLists).toProperty("freeLists")
            .map(initrans).toProperty("initrans")
            .map(isCluster).toProperty("isCluster")
            .map(isCompressForOltp).toProperty("isCompressForOltp")
            .map(isComputeStatistics).toProperty("isComputeStatistics")
            .map(isGlobal).toProperty("isGlobal")
            .map(isIndexOnlyTopLevel).toProperty("isIndexOnlyTopLevel")
            .map(isLocal).toProperty("isLocal")
            .map(isNoParallel).toProperty("isNoParallel")
            .map(isOnline).toProperty("isOnline")
            .map(isReverse).toProperty("isReverse")
            .map(logging).toProperty("logging")
            .map(maxtrans).toProperty("maxtrans")
            .map(parallelOid).toProperty("parallelOid")
            .map(pctfree).toProperty("pctfree")
            .map(pctincrease).toProperty("pctincrease")
            .map(pctthreshold).toProperty("pctthreshold")
            .map(pctused).toProperty("pctused")
            .map(sort).toProperty("sort")
            .map(storage).toProperty("storage")
            .map(tablespaceOid).toProperty("tablespaceOid")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_create_index_statement")
    default int insertMultiple(Collection<OracleCreateIndexStatement> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, oracleCreateIndexStatement, c ->
            c.map(oid).toProperty("oid")
            .map(compress).toProperty("compress")
            .map(compressLevel).toProperty("compressLevel")
            .map(enable).toProperty("enable")
            .map(freeLists).toProperty("freeLists")
            .map(initrans).toProperty("initrans")
            .map(isCluster).toProperty("isCluster")
            .map(isCompressForOltp).toProperty("isCompressForOltp")
            .map(isComputeStatistics).toProperty("isComputeStatistics")
            .map(isGlobal).toProperty("isGlobal")
            .map(isIndexOnlyTopLevel).toProperty("isIndexOnlyTopLevel")
            .map(isLocal).toProperty("isLocal")
            .map(isNoParallel).toProperty("isNoParallel")
            .map(isOnline).toProperty("isOnline")
            .map(isReverse).toProperty("isReverse")
            .map(logging).toProperty("logging")
            .map(maxtrans).toProperty("maxtrans")
            .map(parallelOid).toProperty("parallelOid")
            .map(pctfree).toProperty("pctfree")
            .map(pctincrease).toProperty("pctincrease")
            .map(pctthreshold).toProperty("pctthreshold")
            .map(pctused).toProperty("pctused")
            .map(sort).toProperty("sort")
            .map(storage).toProperty("storage")
            .map(tablespaceOid).toProperty("tablespaceOid")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_create_index_statement")
    default int insertSelective(OracleCreateIndexStatement record) {
        return MyBatis3Utils.insert(this::insert, record, oracleCreateIndexStatement, c ->
            c.map(oid).toPropertyWhenPresent("oid", record::getOid)
            .map(compress).toPropertyWhenPresent("compress", record::getCompress)
            .map(compressLevel).toPropertyWhenPresent("compressLevel", record::getCompressLevel)
            .map(enable).toPropertyWhenPresent("enable", record::getEnable)
            .map(freeLists).toPropertyWhenPresent("freeLists", record::getFreeLists)
            .map(initrans).toPropertyWhenPresent("initrans", record::getInitrans)
            .map(isCluster).toPropertyWhenPresent("isCluster", record::getIsCluster)
            .map(isCompressForOltp).toPropertyWhenPresent("isCompressForOltp", record::getIsCompressForOltp)
            .map(isComputeStatistics).toPropertyWhenPresent("isComputeStatistics", record::getIsComputeStatistics)
            .map(isGlobal).toPropertyWhenPresent("isGlobal", record::getIsGlobal)
            .map(isIndexOnlyTopLevel).toPropertyWhenPresent("isIndexOnlyTopLevel", record::getIsIndexOnlyTopLevel)
            .map(isLocal).toPropertyWhenPresent("isLocal", record::getIsLocal)
            .map(isNoParallel).toPropertyWhenPresent("isNoParallel", record::getIsNoParallel)
            .map(isOnline).toPropertyWhenPresent("isOnline", record::getIsOnline)
            .map(isReverse).toPropertyWhenPresent("isReverse", record::getIsReverse)
            .map(logging).toPropertyWhenPresent("logging", record::getLogging)
            .map(maxtrans).toPropertyWhenPresent("maxtrans", record::getMaxtrans)
            .map(parallelOid).toPropertyWhenPresent("parallelOid", record::getParallelOid)
            .map(pctfree).toPropertyWhenPresent("pctfree", record::getPctfree)
            .map(pctincrease).toPropertyWhenPresent("pctincrease", record::getPctincrease)
            .map(pctthreshold).toPropertyWhenPresent("pctthreshold", record::getPctthreshold)
            .map(pctused).toPropertyWhenPresent("pctused", record::getPctused)
            .map(sort).toPropertyWhenPresent("sort", record::getSort)
            .map(storage).toPropertyWhenPresent("storage", record::getStorage)
            .map(tablespaceOid).toPropertyWhenPresent("tablespaceOid", record::getTablespaceOid)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_create_index_statement")
    default Optional<OracleCreateIndexStatement> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, oracleCreateIndexStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_create_index_statement")
    default List<OracleCreateIndexStatement> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, oracleCreateIndexStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_create_index_statement")
    default List<OracleCreateIndexStatement> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, oracleCreateIndexStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_create_index_statement")
    default Optional<OracleCreateIndexStatement> selectByPrimaryKey(Long oid_) {
        return selectOne(c ->
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_create_index_statement")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, oracleCreateIndexStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_create_index_statement")
    static UpdateDSL<UpdateModel> updateAllColumns(OracleCreateIndexStatement record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalTo(record::getOid)
                .set(compress).equalTo(record::getCompress)
                .set(compressLevel).equalTo(record::getCompressLevel)
                .set(enable).equalTo(record::getEnable)
                .set(freeLists).equalTo(record::getFreeLists)
                .set(initrans).equalTo(record::getInitrans)
                .set(isCluster).equalTo(record::getIsCluster)
                .set(isCompressForOltp).equalTo(record::getIsCompressForOltp)
                .set(isComputeStatistics).equalTo(record::getIsComputeStatistics)
                .set(isGlobal).equalTo(record::getIsGlobal)
                .set(isIndexOnlyTopLevel).equalTo(record::getIsIndexOnlyTopLevel)
                .set(isLocal).equalTo(record::getIsLocal)
                .set(isNoParallel).equalTo(record::getIsNoParallel)
                .set(isOnline).equalTo(record::getIsOnline)
                .set(isReverse).equalTo(record::getIsReverse)
                .set(logging).equalTo(record::getLogging)
                .set(maxtrans).equalTo(record::getMaxtrans)
                .set(parallelOid).equalTo(record::getParallelOid)
                .set(pctfree).equalTo(record::getPctfree)
                .set(pctincrease).equalTo(record::getPctincrease)
                .set(pctthreshold).equalTo(record::getPctthreshold)
                .set(pctused).equalTo(record::getPctused)
                .set(sort).equalTo(record::getSort)
                .set(storage).equalTo(record::getStorage)
                .set(tablespaceOid).equalTo(record::getTablespaceOid);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_create_index_statement")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(OracleCreateIndexStatement record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalToWhenPresent(record::getOid)
                .set(compress).equalToWhenPresent(record::getCompress)
                .set(compressLevel).equalToWhenPresent(record::getCompressLevel)
                .set(enable).equalToWhenPresent(record::getEnable)
                .set(freeLists).equalToWhenPresent(record::getFreeLists)
                .set(initrans).equalToWhenPresent(record::getInitrans)
                .set(isCluster).equalToWhenPresent(record::getIsCluster)
                .set(isCompressForOltp).equalToWhenPresent(record::getIsCompressForOltp)
                .set(isComputeStatistics).equalToWhenPresent(record::getIsComputeStatistics)
                .set(isGlobal).equalToWhenPresent(record::getIsGlobal)
                .set(isIndexOnlyTopLevel).equalToWhenPresent(record::getIsIndexOnlyTopLevel)
                .set(isLocal).equalToWhenPresent(record::getIsLocal)
                .set(isNoParallel).equalToWhenPresent(record::getIsNoParallel)
                .set(isOnline).equalToWhenPresent(record::getIsOnline)
                .set(isReverse).equalToWhenPresent(record::getIsReverse)
                .set(logging).equalToWhenPresent(record::getLogging)
                .set(maxtrans).equalToWhenPresent(record::getMaxtrans)
                .set(parallelOid).equalToWhenPresent(record::getParallelOid)
                .set(pctfree).equalToWhenPresent(record::getPctfree)
                .set(pctincrease).equalToWhenPresent(record::getPctincrease)
                .set(pctthreshold).equalToWhenPresent(record::getPctthreshold)
                .set(pctused).equalToWhenPresent(record::getPctused)
                .set(sort).equalToWhenPresent(record::getSort)
                .set(storage).equalToWhenPresent(record::getStorage)
                .set(tablespaceOid).equalToWhenPresent(record::getTablespaceOid);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_create_index_statement")
    default int updateByPrimaryKey(OracleCreateIndexStatement record) {
        return update(c ->
            c.set(compress).equalTo(record::getCompress)
            .set(compressLevel).equalTo(record::getCompressLevel)
            .set(enable).equalTo(record::getEnable)
            .set(freeLists).equalTo(record::getFreeLists)
            .set(initrans).equalTo(record::getInitrans)
            .set(isCluster).equalTo(record::getIsCluster)
            .set(isCompressForOltp).equalTo(record::getIsCompressForOltp)
            .set(isComputeStatistics).equalTo(record::getIsComputeStatistics)
            .set(isGlobal).equalTo(record::getIsGlobal)
            .set(isIndexOnlyTopLevel).equalTo(record::getIsIndexOnlyTopLevel)
            .set(isLocal).equalTo(record::getIsLocal)
            .set(isNoParallel).equalTo(record::getIsNoParallel)
            .set(isOnline).equalTo(record::getIsOnline)
            .set(isReverse).equalTo(record::getIsReverse)
            .set(logging).equalTo(record::getLogging)
            .set(maxtrans).equalTo(record::getMaxtrans)
            .set(parallelOid).equalTo(record::getParallelOid)
            .set(pctfree).equalTo(record::getPctfree)
            .set(pctincrease).equalTo(record::getPctincrease)
            .set(pctthreshold).equalTo(record::getPctthreshold)
            .set(pctused).equalTo(record::getPctused)
            .set(sort).equalTo(record::getSort)
            .set(storage).equalTo(record::getStorage)
            .set(tablespaceOid).equalTo(record::getTablespaceOid)
            .where(oid, isEqualTo(record::getOid))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_create_index_statement")
    default int updateByPrimaryKeySelective(OracleCreateIndexStatement record) {
        return update(c ->
            c.set(compress).equalToWhenPresent(record::getCompress)
            .set(compressLevel).equalToWhenPresent(record::getCompressLevel)
            .set(enable).equalToWhenPresent(record::getEnable)
            .set(freeLists).equalToWhenPresent(record::getFreeLists)
            .set(initrans).equalToWhenPresent(record::getInitrans)
            .set(isCluster).equalToWhenPresent(record::getIsCluster)
            .set(isCompressForOltp).equalToWhenPresent(record::getIsCompressForOltp)
            .set(isComputeStatistics).equalToWhenPresent(record::getIsComputeStatistics)
            .set(isGlobal).equalToWhenPresent(record::getIsGlobal)
            .set(isIndexOnlyTopLevel).equalToWhenPresent(record::getIsIndexOnlyTopLevel)
            .set(isLocal).equalToWhenPresent(record::getIsLocal)
            .set(isNoParallel).equalToWhenPresent(record::getIsNoParallel)
            .set(isOnline).equalToWhenPresent(record::getIsOnline)
            .set(isReverse).equalToWhenPresent(record::getIsReverse)
            .set(logging).equalToWhenPresent(record::getLogging)
            .set(maxtrans).equalToWhenPresent(record::getMaxtrans)
            .set(parallelOid).equalToWhenPresent(record::getParallelOid)
            .set(pctfree).equalToWhenPresent(record::getPctfree)
            .set(pctincrease).equalToWhenPresent(record::getPctincrease)
            .set(pctthreshold).equalToWhenPresent(record::getPctthreshold)
            .set(pctused).equalToWhenPresent(record::getPctused)
            .set(sort).equalToWhenPresent(record::getSort)
            .set(storage).equalToWhenPresent(record::getStorage)
            .set(tablespaceOid).equalToWhenPresent(record::getTablespaceOid)
            .where(oid, isEqualTo(record::getOid))
        );
    }
}