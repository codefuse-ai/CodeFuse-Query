package com.alipay.codequery.dal.mybatis.mapper;

import static com.alipay.codequery.dal.mybatis.mapper.SqlExternalRecordFormatDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.alipay.codequery.dal.mybatis.domain.SqlExternalRecordFormat;
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
public interface SqlExternalRecordFormatMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_external_record_format")
    BasicColumn[] selectList = BasicColumn.columnList(oid, badfile, collectionItemsTerminatedByOid, delimitedByOid, escapedByOid, isLtrim, isMissingFieldValuesAreNull, isRejectRowsWithAllNullFields, linesTerminatedByOid, logfile, mapKeysTerminatedByOid, nullDefinedAsOid, serdeOid, terminatedByOid);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_external_record_format")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_external_record_format")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_external_record_format")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<SqlExternalRecordFormat> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_external_record_format")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<SqlExternalRecordFormat> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_external_record_format")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="badfile", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="collection_items_terminated_by_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="delimited_by_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="escaped_by_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_ltrim", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_missing_field_values_are_null", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_reject_rows_with_all_null_fields", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="lines_terminated_by_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="logfile", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="map_keys_terminated_by_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="null_defined_as_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="serde_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="terminated_by_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT)
    })
    Optional<SqlExternalRecordFormat> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_external_record_format")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="badfile", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="collection_items_terminated_by_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="delimited_by_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="escaped_by_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_ltrim", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_missing_field_values_are_null", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_reject_rows_with_all_null_fields", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="lines_terminated_by_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="logfile", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="map_keys_terminated_by_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="null_defined_as_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="serde_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="terminated_by_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT)
    })
    List<SqlExternalRecordFormat> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_external_record_format")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_external_record_format")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, sqlExternalRecordFormat, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_external_record_format")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, sqlExternalRecordFormat, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_external_record_format")
    default int deleteByPrimaryKey(Long oid_) {
        return delete(c -> 
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_external_record_format")
    default int insert(SqlExternalRecordFormat record) {
        return MyBatis3Utils.insert(this::insert, record, sqlExternalRecordFormat, c ->
            c.map(oid).toProperty("oid")
            .map(badfile).toProperty("badfile")
            .map(collectionItemsTerminatedByOid).toProperty("collectionItemsTerminatedByOid")
            .map(delimitedByOid).toProperty("delimitedByOid")
            .map(escapedByOid).toProperty("escapedByOid")
            .map(isLtrim).toProperty("isLtrim")
            .map(isMissingFieldValuesAreNull).toProperty("isMissingFieldValuesAreNull")
            .map(isRejectRowsWithAllNullFields).toProperty("isRejectRowsWithAllNullFields")
            .map(linesTerminatedByOid).toProperty("linesTerminatedByOid")
            .map(logfile).toProperty("logfile")
            .map(mapKeysTerminatedByOid).toProperty("mapKeysTerminatedByOid")
            .map(nullDefinedAsOid).toProperty("nullDefinedAsOid")
            .map(serdeOid).toProperty("serdeOid")
            .map(terminatedByOid).toProperty("terminatedByOid")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_external_record_format")
    default int insertMultiple(Collection<SqlExternalRecordFormat> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, sqlExternalRecordFormat, c ->
            c.map(oid).toProperty("oid")
            .map(badfile).toProperty("badfile")
            .map(collectionItemsTerminatedByOid).toProperty("collectionItemsTerminatedByOid")
            .map(delimitedByOid).toProperty("delimitedByOid")
            .map(escapedByOid).toProperty("escapedByOid")
            .map(isLtrim).toProperty("isLtrim")
            .map(isMissingFieldValuesAreNull).toProperty("isMissingFieldValuesAreNull")
            .map(isRejectRowsWithAllNullFields).toProperty("isRejectRowsWithAllNullFields")
            .map(linesTerminatedByOid).toProperty("linesTerminatedByOid")
            .map(logfile).toProperty("logfile")
            .map(mapKeysTerminatedByOid).toProperty("mapKeysTerminatedByOid")
            .map(nullDefinedAsOid).toProperty("nullDefinedAsOid")
            .map(serdeOid).toProperty("serdeOid")
            .map(terminatedByOid).toProperty("terminatedByOid")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_external_record_format")
    default int insertSelective(SqlExternalRecordFormat record) {
        return MyBatis3Utils.insert(this::insert, record, sqlExternalRecordFormat, c ->
            c.map(oid).toPropertyWhenPresent("oid", record::getOid)
            .map(badfile).toPropertyWhenPresent("badfile", record::getBadfile)
            .map(collectionItemsTerminatedByOid).toPropertyWhenPresent("collectionItemsTerminatedByOid", record::getCollectionItemsTerminatedByOid)
            .map(delimitedByOid).toPropertyWhenPresent("delimitedByOid", record::getDelimitedByOid)
            .map(escapedByOid).toPropertyWhenPresent("escapedByOid", record::getEscapedByOid)
            .map(isLtrim).toPropertyWhenPresent("isLtrim", record::getIsLtrim)
            .map(isMissingFieldValuesAreNull).toPropertyWhenPresent("isMissingFieldValuesAreNull", record::getIsMissingFieldValuesAreNull)
            .map(isRejectRowsWithAllNullFields).toPropertyWhenPresent("isRejectRowsWithAllNullFields", record::getIsRejectRowsWithAllNullFields)
            .map(linesTerminatedByOid).toPropertyWhenPresent("linesTerminatedByOid", record::getLinesTerminatedByOid)
            .map(logfile).toPropertyWhenPresent("logfile", record::getLogfile)
            .map(mapKeysTerminatedByOid).toPropertyWhenPresent("mapKeysTerminatedByOid", record::getMapKeysTerminatedByOid)
            .map(nullDefinedAsOid).toPropertyWhenPresent("nullDefinedAsOid", record::getNullDefinedAsOid)
            .map(serdeOid).toPropertyWhenPresent("serdeOid", record::getSerdeOid)
            .map(terminatedByOid).toPropertyWhenPresent("terminatedByOid", record::getTerminatedByOid)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_external_record_format")
    default Optional<SqlExternalRecordFormat> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, sqlExternalRecordFormat, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_external_record_format")
    default List<SqlExternalRecordFormat> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, sqlExternalRecordFormat, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_external_record_format")
    default List<SqlExternalRecordFormat> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, sqlExternalRecordFormat, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_external_record_format")
    default Optional<SqlExternalRecordFormat> selectByPrimaryKey(Long oid_) {
        return selectOne(c ->
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_external_record_format")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, sqlExternalRecordFormat, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_external_record_format")
    static UpdateDSL<UpdateModel> updateAllColumns(SqlExternalRecordFormat record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalTo(record::getOid)
                .set(badfile).equalTo(record::getBadfile)
                .set(collectionItemsTerminatedByOid).equalTo(record::getCollectionItemsTerminatedByOid)
                .set(delimitedByOid).equalTo(record::getDelimitedByOid)
                .set(escapedByOid).equalTo(record::getEscapedByOid)
                .set(isLtrim).equalTo(record::getIsLtrim)
                .set(isMissingFieldValuesAreNull).equalTo(record::getIsMissingFieldValuesAreNull)
                .set(isRejectRowsWithAllNullFields).equalTo(record::getIsRejectRowsWithAllNullFields)
                .set(linesTerminatedByOid).equalTo(record::getLinesTerminatedByOid)
                .set(logfile).equalTo(record::getLogfile)
                .set(mapKeysTerminatedByOid).equalTo(record::getMapKeysTerminatedByOid)
                .set(nullDefinedAsOid).equalTo(record::getNullDefinedAsOid)
                .set(serdeOid).equalTo(record::getSerdeOid)
                .set(terminatedByOid).equalTo(record::getTerminatedByOid);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_external_record_format")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(SqlExternalRecordFormat record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalToWhenPresent(record::getOid)
                .set(badfile).equalToWhenPresent(record::getBadfile)
                .set(collectionItemsTerminatedByOid).equalToWhenPresent(record::getCollectionItemsTerminatedByOid)
                .set(delimitedByOid).equalToWhenPresent(record::getDelimitedByOid)
                .set(escapedByOid).equalToWhenPresent(record::getEscapedByOid)
                .set(isLtrim).equalToWhenPresent(record::getIsLtrim)
                .set(isMissingFieldValuesAreNull).equalToWhenPresent(record::getIsMissingFieldValuesAreNull)
                .set(isRejectRowsWithAllNullFields).equalToWhenPresent(record::getIsRejectRowsWithAllNullFields)
                .set(linesTerminatedByOid).equalToWhenPresent(record::getLinesTerminatedByOid)
                .set(logfile).equalToWhenPresent(record::getLogfile)
                .set(mapKeysTerminatedByOid).equalToWhenPresent(record::getMapKeysTerminatedByOid)
                .set(nullDefinedAsOid).equalToWhenPresent(record::getNullDefinedAsOid)
                .set(serdeOid).equalToWhenPresent(record::getSerdeOid)
                .set(terminatedByOid).equalToWhenPresent(record::getTerminatedByOid);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_external_record_format")
    default int updateByPrimaryKey(SqlExternalRecordFormat record) {
        return update(c ->
            c.set(badfile).equalTo(record::getBadfile)
            .set(collectionItemsTerminatedByOid).equalTo(record::getCollectionItemsTerminatedByOid)
            .set(delimitedByOid).equalTo(record::getDelimitedByOid)
            .set(escapedByOid).equalTo(record::getEscapedByOid)
            .set(isLtrim).equalTo(record::getIsLtrim)
            .set(isMissingFieldValuesAreNull).equalTo(record::getIsMissingFieldValuesAreNull)
            .set(isRejectRowsWithAllNullFields).equalTo(record::getIsRejectRowsWithAllNullFields)
            .set(linesTerminatedByOid).equalTo(record::getLinesTerminatedByOid)
            .set(logfile).equalTo(record::getLogfile)
            .set(mapKeysTerminatedByOid).equalTo(record::getMapKeysTerminatedByOid)
            .set(nullDefinedAsOid).equalTo(record::getNullDefinedAsOid)
            .set(serdeOid).equalTo(record::getSerdeOid)
            .set(terminatedByOid).equalTo(record::getTerminatedByOid)
            .where(oid, isEqualTo(record::getOid))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_external_record_format")
    default int updateByPrimaryKeySelective(SqlExternalRecordFormat record) {
        return update(c ->
            c.set(badfile).equalToWhenPresent(record::getBadfile)
            .set(collectionItemsTerminatedByOid).equalToWhenPresent(record::getCollectionItemsTerminatedByOid)
            .set(delimitedByOid).equalToWhenPresent(record::getDelimitedByOid)
            .set(escapedByOid).equalToWhenPresent(record::getEscapedByOid)
            .set(isLtrim).equalToWhenPresent(record::getIsLtrim)
            .set(isMissingFieldValuesAreNull).equalToWhenPresent(record::getIsMissingFieldValuesAreNull)
            .set(isRejectRowsWithAllNullFields).equalToWhenPresent(record::getIsRejectRowsWithAllNullFields)
            .set(linesTerminatedByOid).equalToWhenPresent(record::getLinesTerminatedByOid)
            .set(logfile).equalToWhenPresent(record::getLogfile)
            .set(mapKeysTerminatedByOid).equalToWhenPresent(record::getMapKeysTerminatedByOid)
            .set(nullDefinedAsOid).equalToWhenPresent(record::getNullDefinedAsOid)
            .set(serdeOid).equalToWhenPresent(record::getSerdeOid)
            .set(terminatedByOid).equalToWhenPresent(record::getTerminatedByOid)
            .where(oid, isEqualTo(record::getOid))
        );
    }
}