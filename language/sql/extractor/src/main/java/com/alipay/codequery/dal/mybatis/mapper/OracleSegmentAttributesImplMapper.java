package com.alipay.codequery.dal.mybatis.mapper;

import static com.alipay.codequery.dal.mybatis.mapper.OracleSegmentAttributesImplDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.alipay.codequery.dal.mybatis.domain.OracleSegmentAttributesImpl;
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
public interface OracleSegmentAttributesImplMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_segment_attributes_impl")
    BasicColumn[] selectList = BasicColumn.columnList(oid, compress, compressLevel, freeLists, initrans, isCompressForOltp, logging, maxtrans, pctfree, pctincrease, pctthreshold, pctused, storage, tablespaceOid);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_segment_attributes_impl")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_segment_attributes_impl")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_segment_attributes_impl")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<OracleSegmentAttributesImpl> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_segment_attributes_impl")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<OracleSegmentAttributesImpl> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_segment_attributes_impl")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="compress", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="compress_level", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="free_lists", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="initrans", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_compress_for_oltp", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="logging", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="maxtrans", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="pctfree", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="pctincrease", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="pctthreshold", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="pctused", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="storage", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="tablespace_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT)
    })
    Optional<OracleSegmentAttributesImpl> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_segment_attributes_impl")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="compress", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="compress_level", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="free_lists", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="initrans", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_compress_for_oltp", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="logging", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="maxtrans", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="pctfree", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="pctincrease", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="pctthreshold", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="pctused", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="storage", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="tablespace_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT)
    })
    List<OracleSegmentAttributesImpl> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_segment_attributes_impl")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_segment_attributes_impl")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, oracleSegmentAttributesImpl, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_segment_attributes_impl")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, oracleSegmentAttributesImpl, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_segment_attributes_impl")
    default int deleteByPrimaryKey(Long oid_) {
        return delete(c -> 
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_segment_attributes_impl")
    default int insert(OracleSegmentAttributesImpl record) {
        return MyBatis3Utils.insert(this::insert, record, oracleSegmentAttributesImpl, c ->
            c.map(oid).toProperty("oid")
            .map(compress).toProperty("compress")
            .map(compressLevel).toProperty("compressLevel")
            .map(freeLists).toProperty("freeLists")
            .map(initrans).toProperty("initrans")
            .map(isCompressForOltp).toProperty("isCompressForOltp")
            .map(logging).toProperty("logging")
            .map(maxtrans).toProperty("maxtrans")
            .map(pctfree).toProperty("pctfree")
            .map(pctincrease).toProperty("pctincrease")
            .map(pctthreshold).toProperty("pctthreshold")
            .map(pctused).toProperty("pctused")
            .map(storage).toProperty("storage")
            .map(tablespaceOid).toProperty("tablespaceOid")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_segment_attributes_impl")
    default int insertMultiple(Collection<OracleSegmentAttributesImpl> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, oracleSegmentAttributesImpl, c ->
            c.map(oid).toProperty("oid")
            .map(compress).toProperty("compress")
            .map(compressLevel).toProperty("compressLevel")
            .map(freeLists).toProperty("freeLists")
            .map(initrans).toProperty("initrans")
            .map(isCompressForOltp).toProperty("isCompressForOltp")
            .map(logging).toProperty("logging")
            .map(maxtrans).toProperty("maxtrans")
            .map(pctfree).toProperty("pctfree")
            .map(pctincrease).toProperty("pctincrease")
            .map(pctthreshold).toProperty("pctthreshold")
            .map(pctused).toProperty("pctused")
            .map(storage).toProperty("storage")
            .map(tablespaceOid).toProperty("tablespaceOid")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_segment_attributes_impl")
    default int insertSelective(OracleSegmentAttributesImpl record) {
        return MyBatis3Utils.insert(this::insert, record, oracleSegmentAttributesImpl, c ->
            c.map(oid).toPropertyWhenPresent("oid", record::getOid)
            .map(compress).toPropertyWhenPresent("compress", record::getCompress)
            .map(compressLevel).toPropertyWhenPresent("compressLevel", record::getCompressLevel)
            .map(freeLists).toPropertyWhenPresent("freeLists", record::getFreeLists)
            .map(initrans).toPropertyWhenPresent("initrans", record::getInitrans)
            .map(isCompressForOltp).toPropertyWhenPresent("isCompressForOltp", record::getIsCompressForOltp)
            .map(logging).toPropertyWhenPresent("logging", record::getLogging)
            .map(maxtrans).toPropertyWhenPresent("maxtrans", record::getMaxtrans)
            .map(pctfree).toPropertyWhenPresent("pctfree", record::getPctfree)
            .map(pctincrease).toPropertyWhenPresent("pctincrease", record::getPctincrease)
            .map(pctthreshold).toPropertyWhenPresent("pctthreshold", record::getPctthreshold)
            .map(pctused).toPropertyWhenPresent("pctused", record::getPctused)
            .map(storage).toPropertyWhenPresent("storage", record::getStorage)
            .map(tablespaceOid).toPropertyWhenPresent("tablespaceOid", record::getTablespaceOid)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_segment_attributes_impl")
    default Optional<OracleSegmentAttributesImpl> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, oracleSegmentAttributesImpl, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_segment_attributes_impl")
    default List<OracleSegmentAttributesImpl> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, oracleSegmentAttributesImpl, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_segment_attributes_impl")
    default List<OracleSegmentAttributesImpl> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, oracleSegmentAttributesImpl, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_segment_attributes_impl")
    default Optional<OracleSegmentAttributesImpl> selectByPrimaryKey(Long oid_) {
        return selectOne(c ->
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_segment_attributes_impl")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, oracleSegmentAttributesImpl, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_segment_attributes_impl")
    static UpdateDSL<UpdateModel> updateAllColumns(OracleSegmentAttributesImpl record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalTo(record::getOid)
                .set(compress).equalTo(record::getCompress)
                .set(compressLevel).equalTo(record::getCompressLevel)
                .set(freeLists).equalTo(record::getFreeLists)
                .set(initrans).equalTo(record::getInitrans)
                .set(isCompressForOltp).equalTo(record::getIsCompressForOltp)
                .set(logging).equalTo(record::getLogging)
                .set(maxtrans).equalTo(record::getMaxtrans)
                .set(pctfree).equalTo(record::getPctfree)
                .set(pctincrease).equalTo(record::getPctincrease)
                .set(pctthreshold).equalTo(record::getPctthreshold)
                .set(pctused).equalTo(record::getPctused)
                .set(storage).equalTo(record::getStorage)
                .set(tablespaceOid).equalTo(record::getTablespaceOid);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_segment_attributes_impl")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(OracleSegmentAttributesImpl record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalToWhenPresent(record::getOid)
                .set(compress).equalToWhenPresent(record::getCompress)
                .set(compressLevel).equalToWhenPresent(record::getCompressLevel)
                .set(freeLists).equalToWhenPresent(record::getFreeLists)
                .set(initrans).equalToWhenPresent(record::getInitrans)
                .set(isCompressForOltp).equalToWhenPresent(record::getIsCompressForOltp)
                .set(logging).equalToWhenPresent(record::getLogging)
                .set(maxtrans).equalToWhenPresent(record::getMaxtrans)
                .set(pctfree).equalToWhenPresent(record::getPctfree)
                .set(pctincrease).equalToWhenPresent(record::getPctincrease)
                .set(pctthreshold).equalToWhenPresent(record::getPctthreshold)
                .set(pctused).equalToWhenPresent(record::getPctused)
                .set(storage).equalToWhenPresent(record::getStorage)
                .set(tablespaceOid).equalToWhenPresent(record::getTablespaceOid);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_segment_attributes_impl")
    default int updateByPrimaryKey(OracleSegmentAttributesImpl record) {
        return update(c ->
            c.set(compress).equalTo(record::getCompress)
            .set(compressLevel).equalTo(record::getCompressLevel)
            .set(freeLists).equalTo(record::getFreeLists)
            .set(initrans).equalTo(record::getInitrans)
            .set(isCompressForOltp).equalTo(record::getIsCompressForOltp)
            .set(logging).equalTo(record::getLogging)
            .set(maxtrans).equalTo(record::getMaxtrans)
            .set(pctfree).equalTo(record::getPctfree)
            .set(pctincrease).equalTo(record::getPctincrease)
            .set(pctthreshold).equalTo(record::getPctthreshold)
            .set(pctused).equalTo(record::getPctused)
            .set(storage).equalTo(record::getStorage)
            .set(tablespaceOid).equalTo(record::getTablespaceOid)
            .where(oid, isEqualTo(record::getOid))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_segment_attributes_impl")
    default int updateByPrimaryKeySelective(OracleSegmentAttributesImpl record) {
        return update(c ->
            c.set(compress).equalToWhenPresent(record::getCompress)
            .set(compressLevel).equalToWhenPresent(record::getCompressLevel)
            .set(freeLists).equalToWhenPresent(record::getFreeLists)
            .set(initrans).equalToWhenPresent(record::getInitrans)
            .set(isCompressForOltp).equalToWhenPresent(record::getIsCompressForOltp)
            .set(logging).equalToWhenPresent(record::getLogging)
            .set(maxtrans).equalToWhenPresent(record::getMaxtrans)
            .set(pctfree).equalToWhenPresent(record::getPctfree)
            .set(pctincrease).equalToWhenPresent(record::getPctincrease)
            .set(pctthreshold).equalToWhenPresent(record::getPctthreshold)
            .set(pctused).equalToWhenPresent(record::getPctused)
            .set(storage).equalToWhenPresent(record::getStorage)
            .set(tablespaceOid).equalToWhenPresent(record::getTablespaceOid)
            .where(oid, isEqualTo(record::getOid))
        );
    }
}