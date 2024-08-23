package com.alipay.codequery.dal.mybatis.mapper;

import static com.alipay.codequery.dal.mybatis.mapper.OracleLobStorageClauseDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.alipay.codequery.dal.mybatis.domain.OracleLobStorageClause;
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
public interface OracleLobStorageClauseMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_lob_storage_clause")
    BasicColumn[] selectList = BasicColumn.columnList(oid, cache, chunkOid, compress, enable, isBasicFile, isRetention, isSecureFile, keepDuplicate, logging, pctversionOid, segementNameOid, storageClauseOid);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_lob_storage_clause")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_lob_storage_clause")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_lob_storage_clause")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<OracleLobStorageClause> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_lob_storage_clause")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<OracleLobStorageClause> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_lob_storage_clause")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="cache", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="chunk_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="compress", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="enable", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_basic_file", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_retention", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_secure_file", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="keep_duplicate", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="logging", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="pctversion_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="segement_name_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="storage_clause_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT)
    })
    Optional<OracleLobStorageClause> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_lob_storage_clause")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="cache", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="chunk_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="compress", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="enable", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_basic_file", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_retention", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_secure_file", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="keep_duplicate", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="logging", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="pctversion_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="segement_name_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="storage_clause_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT)
    })
    List<OracleLobStorageClause> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_lob_storage_clause")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_lob_storage_clause")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, oracleLobStorageClause, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_lob_storage_clause")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, oracleLobStorageClause, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_lob_storage_clause")
    default int deleteByPrimaryKey(Long oid_) {
        return delete(c -> 
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_lob_storage_clause")
    default int insert(OracleLobStorageClause record) {
        return MyBatis3Utils.insert(this::insert, record, oracleLobStorageClause, c ->
            c.map(oid).toProperty("oid")
            .map(cache).toProperty("cache")
            .map(chunkOid).toProperty("chunkOid")
            .map(compress).toProperty("compress")
            .map(enable).toProperty("enable")
            .map(isBasicFile).toProperty("isBasicFile")
            .map(isRetention).toProperty("isRetention")
            .map(isSecureFile).toProperty("isSecureFile")
            .map(keepDuplicate).toProperty("keepDuplicate")
            .map(logging).toProperty("logging")
            .map(pctversionOid).toProperty("pctversionOid")
            .map(segementNameOid).toProperty("segementNameOid")
            .map(storageClauseOid).toProperty("storageClauseOid")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_lob_storage_clause")
    default int insertMultiple(Collection<OracleLobStorageClause> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, oracleLobStorageClause, c ->
            c.map(oid).toProperty("oid")
            .map(cache).toProperty("cache")
            .map(chunkOid).toProperty("chunkOid")
            .map(compress).toProperty("compress")
            .map(enable).toProperty("enable")
            .map(isBasicFile).toProperty("isBasicFile")
            .map(isRetention).toProperty("isRetention")
            .map(isSecureFile).toProperty("isSecureFile")
            .map(keepDuplicate).toProperty("keepDuplicate")
            .map(logging).toProperty("logging")
            .map(pctversionOid).toProperty("pctversionOid")
            .map(segementNameOid).toProperty("segementNameOid")
            .map(storageClauseOid).toProperty("storageClauseOid")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_lob_storage_clause")
    default int insertSelective(OracleLobStorageClause record) {
        return MyBatis3Utils.insert(this::insert, record, oracleLobStorageClause, c ->
            c.map(oid).toPropertyWhenPresent("oid", record::getOid)
            .map(cache).toPropertyWhenPresent("cache", record::getCache)
            .map(chunkOid).toPropertyWhenPresent("chunkOid", record::getChunkOid)
            .map(compress).toPropertyWhenPresent("compress", record::getCompress)
            .map(enable).toPropertyWhenPresent("enable", record::getEnable)
            .map(isBasicFile).toPropertyWhenPresent("isBasicFile", record::getIsBasicFile)
            .map(isRetention).toPropertyWhenPresent("isRetention", record::getIsRetention)
            .map(isSecureFile).toPropertyWhenPresent("isSecureFile", record::getIsSecureFile)
            .map(keepDuplicate).toPropertyWhenPresent("keepDuplicate", record::getKeepDuplicate)
            .map(logging).toPropertyWhenPresent("logging", record::getLogging)
            .map(pctversionOid).toPropertyWhenPresent("pctversionOid", record::getPctversionOid)
            .map(segementNameOid).toPropertyWhenPresent("segementNameOid", record::getSegementNameOid)
            .map(storageClauseOid).toPropertyWhenPresent("storageClauseOid", record::getStorageClauseOid)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_lob_storage_clause")
    default Optional<OracleLobStorageClause> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, oracleLobStorageClause, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_lob_storage_clause")
    default List<OracleLobStorageClause> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, oracleLobStorageClause, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_lob_storage_clause")
    default List<OracleLobStorageClause> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, oracleLobStorageClause, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_lob_storage_clause")
    default Optional<OracleLobStorageClause> selectByPrimaryKey(Long oid_) {
        return selectOne(c ->
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_lob_storage_clause")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, oracleLobStorageClause, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_lob_storage_clause")
    static UpdateDSL<UpdateModel> updateAllColumns(OracleLobStorageClause record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalTo(record::getOid)
                .set(cache).equalTo(record::getCache)
                .set(chunkOid).equalTo(record::getChunkOid)
                .set(compress).equalTo(record::getCompress)
                .set(enable).equalTo(record::getEnable)
                .set(isBasicFile).equalTo(record::getIsBasicFile)
                .set(isRetention).equalTo(record::getIsRetention)
                .set(isSecureFile).equalTo(record::getIsSecureFile)
                .set(keepDuplicate).equalTo(record::getKeepDuplicate)
                .set(logging).equalTo(record::getLogging)
                .set(pctversionOid).equalTo(record::getPctversionOid)
                .set(segementNameOid).equalTo(record::getSegementNameOid)
                .set(storageClauseOid).equalTo(record::getStorageClauseOid);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_lob_storage_clause")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(OracleLobStorageClause record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalToWhenPresent(record::getOid)
                .set(cache).equalToWhenPresent(record::getCache)
                .set(chunkOid).equalToWhenPresent(record::getChunkOid)
                .set(compress).equalToWhenPresent(record::getCompress)
                .set(enable).equalToWhenPresent(record::getEnable)
                .set(isBasicFile).equalToWhenPresent(record::getIsBasicFile)
                .set(isRetention).equalToWhenPresent(record::getIsRetention)
                .set(isSecureFile).equalToWhenPresent(record::getIsSecureFile)
                .set(keepDuplicate).equalToWhenPresent(record::getKeepDuplicate)
                .set(logging).equalToWhenPresent(record::getLogging)
                .set(pctversionOid).equalToWhenPresent(record::getPctversionOid)
                .set(segementNameOid).equalToWhenPresent(record::getSegementNameOid)
                .set(storageClauseOid).equalToWhenPresent(record::getStorageClauseOid);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_lob_storage_clause")
    default int updateByPrimaryKey(OracleLobStorageClause record) {
        return update(c ->
            c.set(cache).equalTo(record::getCache)
            .set(chunkOid).equalTo(record::getChunkOid)
            .set(compress).equalTo(record::getCompress)
            .set(enable).equalTo(record::getEnable)
            .set(isBasicFile).equalTo(record::getIsBasicFile)
            .set(isRetention).equalTo(record::getIsRetention)
            .set(isSecureFile).equalTo(record::getIsSecureFile)
            .set(keepDuplicate).equalTo(record::getKeepDuplicate)
            .set(logging).equalTo(record::getLogging)
            .set(pctversionOid).equalTo(record::getPctversionOid)
            .set(segementNameOid).equalTo(record::getSegementNameOid)
            .set(storageClauseOid).equalTo(record::getStorageClauseOid)
            .where(oid, isEqualTo(record::getOid))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_lob_storage_clause")
    default int updateByPrimaryKeySelective(OracleLobStorageClause record) {
        return update(c ->
            c.set(cache).equalToWhenPresent(record::getCache)
            .set(chunkOid).equalToWhenPresent(record::getChunkOid)
            .set(compress).equalToWhenPresent(record::getCompress)
            .set(enable).equalToWhenPresent(record::getEnable)
            .set(isBasicFile).equalToWhenPresent(record::getIsBasicFile)
            .set(isRetention).equalToWhenPresent(record::getIsRetention)
            .set(isSecureFile).equalToWhenPresent(record::getIsSecureFile)
            .set(keepDuplicate).equalToWhenPresent(record::getKeepDuplicate)
            .set(logging).equalToWhenPresent(record::getLogging)
            .set(pctversionOid).equalToWhenPresent(record::getPctversionOid)
            .set(segementNameOid).equalToWhenPresent(record::getSegementNameOid)
            .set(storageClauseOid).equalToWhenPresent(record::getStorageClauseOid)
            .where(oid, isEqualTo(record::getOid))
        );
    }
}