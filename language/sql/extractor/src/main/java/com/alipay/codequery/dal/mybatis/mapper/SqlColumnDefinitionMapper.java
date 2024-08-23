package com.alipay.codequery.dal.mybatis.mapper;

import static com.alipay.codequery.dal.mybatis.mapper.SqlColumnDefinitionDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.alipay.codequery.dal.mybatis.domain.SqlColumnDefinition;
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
public interface SqlColumnDefinitionMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_column_definition")
    BasicColumn[] selectList = BasicColumn.columnList(oid, annIndexOid, asExprOid, charsetExprOid, collateExprOid, columnName, commentOid, compressionOid, dataTypeOid, defaultExprOid, delimiterOid, delimiterTokenizerOid, enable, encodeOid, formatOid, generatedAlawsAsOid, identity, isAutoIncrement, isDisableIndex, isOnlyPrimaryKey, isPartitionBy, isPreSort, isPrimaryKey, isStored, isVirtual, isVisible, jsonIndexAttrsExprOid, nameOid, nameAsString, nlpTokenizerOid, nplTokenizerOid, onUpdateOid, preSortOrder, rely, sequenceType, stepOid, storageOid, unitCountOid, unitIndexOid, validate, valueTypeOid);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_column_definition")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_column_definition")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_column_definition")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<SqlColumnDefinition> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_column_definition")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<SqlColumnDefinition> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_column_definition")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="ann_index_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="as_expr_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="charset_expr_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="collate_expr_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="column_name", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="comment_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="compression_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="data_type_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="default_expr_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="delimiter_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="delimiter_tokenizer_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="enable", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="encode_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="format_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="generated_alaws_as_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="identity", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="is_auto_increment", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_disable_index", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_only_primary_key", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_partition_by", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_pre_sort", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_primary_key", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_stored", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_virtual", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_visible", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="json_index_attrs_expr_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="name_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="name_as_string", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="nlp_tokenizer_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="npl_tokenizer_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="on_update_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="pre_sort_order", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="rely", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="sequence_type", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="step_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="storage_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="unit_count_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="unit_index_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="validate", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="value_type_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT)
    })
    Optional<SqlColumnDefinition> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_column_definition")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="ann_index_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="as_expr_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="charset_expr_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="collate_expr_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="column_name", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="comment_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="compression_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="data_type_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="default_expr_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="delimiter_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="delimiter_tokenizer_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="enable", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="encode_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="format_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="generated_alaws_as_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="identity", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="is_auto_increment", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_disable_index", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_only_primary_key", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_partition_by", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_pre_sort", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_primary_key", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_stored", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_virtual", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_visible", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="json_index_attrs_expr_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="name_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="name_as_string", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="nlp_tokenizer_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="npl_tokenizer_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="on_update_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="pre_sort_order", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="rely", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="sequence_type", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="step_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="storage_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="unit_count_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="unit_index_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="validate", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="value_type_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT)
    })
    List<SqlColumnDefinition> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_column_definition")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_column_definition")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, sqlColumnDefinition, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_column_definition")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, sqlColumnDefinition, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_column_definition")
    default int deleteByPrimaryKey(Long oid_) {
        return delete(c -> 
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_column_definition")
    default int insert(SqlColumnDefinition record) {
        return MyBatis3Utils.insert(this::insert, record, sqlColumnDefinition, c ->
            c.map(oid).toProperty("oid")
            .map(annIndexOid).toProperty("annIndexOid")
            .map(asExprOid).toProperty("asExprOid")
            .map(charsetExprOid).toProperty("charsetExprOid")
            .map(collateExprOid).toProperty("collateExprOid")
            .map(columnName).toProperty("columnName")
            .map(commentOid).toProperty("commentOid")
            .map(compressionOid).toProperty("compressionOid")
            .map(dataTypeOid).toProperty("dataTypeOid")
            .map(defaultExprOid).toProperty("defaultExprOid")
            .map(delimiterOid).toProperty("delimiterOid")
            .map(delimiterTokenizerOid).toProperty("delimiterTokenizerOid")
            .map(enable).toProperty("enable")
            .map(encodeOid).toProperty("encodeOid")
            .map(formatOid).toProperty("formatOid")
            .map(generatedAlawsAsOid).toProperty("generatedAlawsAsOid")
            .map(identity).toProperty("identity")
            .map(isAutoIncrement).toProperty("isAutoIncrement")
            .map(isDisableIndex).toProperty("isDisableIndex")
            .map(isOnlyPrimaryKey).toProperty("isOnlyPrimaryKey")
            .map(isPartitionBy).toProperty("isPartitionBy")
            .map(isPreSort).toProperty("isPreSort")
            .map(isPrimaryKey).toProperty("isPrimaryKey")
            .map(isStored).toProperty("isStored")
            .map(isVirtual).toProperty("isVirtual")
            .map(isVisible).toProperty("isVisible")
            .map(jsonIndexAttrsExprOid).toProperty("jsonIndexAttrsExprOid")
            .map(nameOid).toProperty("nameOid")
            .map(nameAsString).toProperty("nameAsString")
            .map(nlpTokenizerOid).toProperty("nlpTokenizerOid")
            .map(nplTokenizerOid).toProperty("nplTokenizerOid")
            .map(onUpdateOid).toProperty("onUpdateOid")
            .map(preSortOrder).toProperty("preSortOrder")
            .map(rely).toProperty("rely")
            .map(sequenceType).toProperty("sequenceType")
            .map(stepOid).toProperty("stepOid")
            .map(storageOid).toProperty("storageOid")
            .map(unitCountOid).toProperty("unitCountOid")
            .map(unitIndexOid).toProperty("unitIndexOid")
            .map(validate).toProperty("validate")
            .map(valueTypeOid).toProperty("valueTypeOid")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_column_definition")
    default int insertMultiple(Collection<SqlColumnDefinition> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, sqlColumnDefinition, c ->
            c.map(oid).toProperty("oid")
            .map(annIndexOid).toProperty("annIndexOid")
            .map(asExprOid).toProperty("asExprOid")
            .map(charsetExprOid).toProperty("charsetExprOid")
            .map(collateExprOid).toProperty("collateExprOid")
            .map(columnName).toProperty("columnName")
            .map(commentOid).toProperty("commentOid")
            .map(compressionOid).toProperty("compressionOid")
            .map(dataTypeOid).toProperty("dataTypeOid")
            .map(defaultExprOid).toProperty("defaultExprOid")
            .map(delimiterOid).toProperty("delimiterOid")
            .map(delimiterTokenizerOid).toProperty("delimiterTokenizerOid")
            .map(enable).toProperty("enable")
            .map(encodeOid).toProperty("encodeOid")
            .map(formatOid).toProperty("formatOid")
            .map(generatedAlawsAsOid).toProperty("generatedAlawsAsOid")
            .map(identity).toProperty("identity")
            .map(isAutoIncrement).toProperty("isAutoIncrement")
            .map(isDisableIndex).toProperty("isDisableIndex")
            .map(isOnlyPrimaryKey).toProperty("isOnlyPrimaryKey")
            .map(isPartitionBy).toProperty("isPartitionBy")
            .map(isPreSort).toProperty("isPreSort")
            .map(isPrimaryKey).toProperty("isPrimaryKey")
            .map(isStored).toProperty("isStored")
            .map(isVirtual).toProperty("isVirtual")
            .map(isVisible).toProperty("isVisible")
            .map(jsonIndexAttrsExprOid).toProperty("jsonIndexAttrsExprOid")
            .map(nameOid).toProperty("nameOid")
            .map(nameAsString).toProperty("nameAsString")
            .map(nlpTokenizerOid).toProperty("nlpTokenizerOid")
            .map(nplTokenizerOid).toProperty("nplTokenizerOid")
            .map(onUpdateOid).toProperty("onUpdateOid")
            .map(preSortOrder).toProperty("preSortOrder")
            .map(rely).toProperty("rely")
            .map(sequenceType).toProperty("sequenceType")
            .map(stepOid).toProperty("stepOid")
            .map(storageOid).toProperty("storageOid")
            .map(unitCountOid).toProperty("unitCountOid")
            .map(unitIndexOid).toProperty("unitIndexOid")
            .map(validate).toProperty("validate")
            .map(valueTypeOid).toProperty("valueTypeOid")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_column_definition")
    default int insertSelective(SqlColumnDefinition record) {
        return MyBatis3Utils.insert(this::insert, record, sqlColumnDefinition, c ->
            c.map(oid).toPropertyWhenPresent("oid", record::getOid)
            .map(annIndexOid).toPropertyWhenPresent("annIndexOid", record::getAnnIndexOid)
            .map(asExprOid).toPropertyWhenPresent("asExprOid", record::getAsExprOid)
            .map(charsetExprOid).toPropertyWhenPresent("charsetExprOid", record::getCharsetExprOid)
            .map(collateExprOid).toPropertyWhenPresent("collateExprOid", record::getCollateExprOid)
            .map(columnName).toPropertyWhenPresent("columnName", record::getColumnName)
            .map(commentOid).toPropertyWhenPresent("commentOid", record::getCommentOid)
            .map(compressionOid).toPropertyWhenPresent("compressionOid", record::getCompressionOid)
            .map(dataTypeOid).toPropertyWhenPresent("dataTypeOid", record::getDataTypeOid)
            .map(defaultExprOid).toPropertyWhenPresent("defaultExprOid", record::getDefaultExprOid)
            .map(delimiterOid).toPropertyWhenPresent("delimiterOid", record::getDelimiterOid)
            .map(delimiterTokenizerOid).toPropertyWhenPresent("delimiterTokenizerOid", record::getDelimiterTokenizerOid)
            .map(enable).toPropertyWhenPresent("enable", record::getEnable)
            .map(encodeOid).toPropertyWhenPresent("encodeOid", record::getEncodeOid)
            .map(formatOid).toPropertyWhenPresent("formatOid", record::getFormatOid)
            .map(generatedAlawsAsOid).toPropertyWhenPresent("generatedAlawsAsOid", record::getGeneratedAlawsAsOid)
            .map(identity).toPropertyWhenPresent("identity", record::getIdentity)
            .map(isAutoIncrement).toPropertyWhenPresent("isAutoIncrement", record::getIsAutoIncrement)
            .map(isDisableIndex).toPropertyWhenPresent("isDisableIndex", record::getIsDisableIndex)
            .map(isOnlyPrimaryKey).toPropertyWhenPresent("isOnlyPrimaryKey", record::getIsOnlyPrimaryKey)
            .map(isPartitionBy).toPropertyWhenPresent("isPartitionBy", record::getIsPartitionBy)
            .map(isPreSort).toPropertyWhenPresent("isPreSort", record::getIsPreSort)
            .map(isPrimaryKey).toPropertyWhenPresent("isPrimaryKey", record::getIsPrimaryKey)
            .map(isStored).toPropertyWhenPresent("isStored", record::getIsStored)
            .map(isVirtual).toPropertyWhenPresent("isVirtual", record::getIsVirtual)
            .map(isVisible).toPropertyWhenPresent("isVisible", record::getIsVisible)
            .map(jsonIndexAttrsExprOid).toPropertyWhenPresent("jsonIndexAttrsExprOid", record::getJsonIndexAttrsExprOid)
            .map(nameOid).toPropertyWhenPresent("nameOid", record::getNameOid)
            .map(nameAsString).toPropertyWhenPresent("nameAsString", record::getNameAsString)
            .map(nlpTokenizerOid).toPropertyWhenPresent("nlpTokenizerOid", record::getNlpTokenizerOid)
            .map(nplTokenizerOid).toPropertyWhenPresent("nplTokenizerOid", record::getNplTokenizerOid)
            .map(onUpdateOid).toPropertyWhenPresent("onUpdateOid", record::getOnUpdateOid)
            .map(preSortOrder).toPropertyWhenPresent("preSortOrder", record::getPreSortOrder)
            .map(rely).toPropertyWhenPresent("rely", record::getRely)
            .map(sequenceType).toPropertyWhenPresent("sequenceType", record::getSequenceType)
            .map(stepOid).toPropertyWhenPresent("stepOid", record::getStepOid)
            .map(storageOid).toPropertyWhenPresent("storageOid", record::getStorageOid)
            .map(unitCountOid).toPropertyWhenPresent("unitCountOid", record::getUnitCountOid)
            .map(unitIndexOid).toPropertyWhenPresent("unitIndexOid", record::getUnitIndexOid)
            .map(validate).toPropertyWhenPresent("validate", record::getValidate)
            .map(valueTypeOid).toPropertyWhenPresent("valueTypeOid", record::getValueTypeOid)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_column_definition")
    default Optional<SqlColumnDefinition> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, sqlColumnDefinition, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_column_definition")
    default List<SqlColumnDefinition> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, sqlColumnDefinition, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_column_definition")
    default List<SqlColumnDefinition> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, sqlColumnDefinition, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_column_definition")
    default Optional<SqlColumnDefinition> selectByPrimaryKey(Long oid_) {
        return selectOne(c ->
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_column_definition")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, sqlColumnDefinition, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_column_definition")
    static UpdateDSL<UpdateModel> updateAllColumns(SqlColumnDefinition record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalTo(record::getOid)
                .set(annIndexOid).equalTo(record::getAnnIndexOid)
                .set(asExprOid).equalTo(record::getAsExprOid)
                .set(charsetExprOid).equalTo(record::getCharsetExprOid)
                .set(collateExprOid).equalTo(record::getCollateExprOid)
                .set(columnName).equalTo(record::getColumnName)
                .set(commentOid).equalTo(record::getCommentOid)
                .set(compressionOid).equalTo(record::getCompressionOid)
                .set(dataTypeOid).equalTo(record::getDataTypeOid)
                .set(defaultExprOid).equalTo(record::getDefaultExprOid)
                .set(delimiterOid).equalTo(record::getDelimiterOid)
                .set(delimiterTokenizerOid).equalTo(record::getDelimiterTokenizerOid)
                .set(enable).equalTo(record::getEnable)
                .set(encodeOid).equalTo(record::getEncodeOid)
                .set(formatOid).equalTo(record::getFormatOid)
                .set(generatedAlawsAsOid).equalTo(record::getGeneratedAlawsAsOid)
                .set(identity).equalTo(record::getIdentity)
                .set(isAutoIncrement).equalTo(record::getIsAutoIncrement)
                .set(isDisableIndex).equalTo(record::getIsDisableIndex)
                .set(isOnlyPrimaryKey).equalTo(record::getIsOnlyPrimaryKey)
                .set(isPartitionBy).equalTo(record::getIsPartitionBy)
                .set(isPreSort).equalTo(record::getIsPreSort)
                .set(isPrimaryKey).equalTo(record::getIsPrimaryKey)
                .set(isStored).equalTo(record::getIsStored)
                .set(isVirtual).equalTo(record::getIsVirtual)
                .set(isVisible).equalTo(record::getIsVisible)
                .set(jsonIndexAttrsExprOid).equalTo(record::getJsonIndexAttrsExprOid)
                .set(nameOid).equalTo(record::getNameOid)
                .set(nameAsString).equalTo(record::getNameAsString)
                .set(nlpTokenizerOid).equalTo(record::getNlpTokenizerOid)
                .set(nplTokenizerOid).equalTo(record::getNplTokenizerOid)
                .set(onUpdateOid).equalTo(record::getOnUpdateOid)
                .set(preSortOrder).equalTo(record::getPreSortOrder)
                .set(rely).equalTo(record::getRely)
                .set(sequenceType).equalTo(record::getSequenceType)
                .set(stepOid).equalTo(record::getStepOid)
                .set(storageOid).equalTo(record::getStorageOid)
                .set(unitCountOid).equalTo(record::getUnitCountOid)
                .set(unitIndexOid).equalTo(record::getUnitIndexOid)
                .set(validate).equalTo(record::getValidate)
                .set(valueTypeOid).equalTo(record::getValueTypeOid);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_column_definition")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(SqlColumnDefinition record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalToWhenPresent(record::getOid)
                .set(annIndexOid).equalToWhenPresent(record::getAnnIndexOid)
                .set(asExprOid).equalToWhenPresent(record::getAsExprOid)
                .set(charsetExprOid).equalToWhenPresent(record::getCharsetExprOid)
                .set(collateExprOid).equalToWhenPresent(record::getCollateExprOid)
                .set(columnName).equalToWhenPresent(record::getColumnName)
                .set(commentOid).equalToWhenPresent(record::getCommentOid)
                .set(compressionOid).equalToWhenPresent(record::getCompressionOid)
                .set(dataTypeOid).equalToWhenPresent(record::getDataTypeOid)
                .set(defaultExprOid).equalToWhenPresent(record::getDefaultExprOid)
                .set(delimiterOid).equalToWhenPresent(record::getDelimiterOid)
                .set(delimiterTokenizerOid).equalToWhenPresent(record::getDelimiterTokenizerOid)
                .set(enable).equalToWhenPresent(record::getEnable)
                .set(encodeOid).equalToWhenPresent(record::getEncodeOid)
                .set(formatOid).equalToWhenPresent(record::getFormatOid)
                .set(generatedAlawsAsOid).equalToWhenPresent(record::getGeneratedAlawsAsOid)
                .set(identity).equalToWhenPresent(record::getIdentity)
                .set(isAutoIncrement).equalToWhenPresent(record::getIsAutoIncrement)
                .set(isDisableIndex).equalToWhenPresent(record::getIsDisableIndex)
                .set(isOnlyPrimaryKey).equalToWhenPresent(record::getIsOnlyPrimaryKey)
                .set(isPartitionBy).equalToWhenPresent(record::getIsPartitionBy)
                .set(isPreSort).equalToWhenPresent(record::getIsPreSort)
                .set(isPrimaryKey).equalToWhenPresent(record::getIsPrimaryKey)
                .set(isStored).equalToWhenPresent(record::getIsStored)
                .set(isVirtual).equalToWhenPresent(record::getIsVirtual)
                .set(isVisible).equalToWhenPresent(record::getIsVisible)
                .set(jsonIndexAttrsExprOid).equalToWhenPresent(record::getJsonIndexAttrsExprOid)
                .set(nameOid).equalToWhenPresent(record::getNameOid)
                .set(nameAsString).equalToWhenPresent(record::getNameAsString)
                .set(nlpTokenizerOid).equalToWhenPresent(record::getNlpTokenizerOid)
                .set(nplTokenizerOid).equalToWhenPresent(record::getNplTokenizerOid)
                .set(onUpdateOid).equalToWhenPresent(record::getOnUpdateOid)
                .set(preSortOrder).equalToWhenPresent(record::getPreSortOrder)
                .set(rely).equalToWhenPresent(record::getRely)
                .set(sequenceType).equalToWhenPresent(record::getSequenceType)
                .set(stepOid).equalToWhenPresent(record::getStepOid)
                .set(storageOid).equalToWhenPresent(record::getStorageOid)
                .set(unitCountOid).equalToWhenPresent(record::getUnitCountOid)
                .set(unitIndexOid).equalToWhenPresent(record::getUnitIndexOid)
                .set(validate).equalToWhenPresent(record::getValidate)
                .set(valueTypeOid).equalToWhenPresent(record::getValueTypeOid);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_column_definition")
    default int updateByPrimaryKey(SqlColumnDefinition record) {
        return update(c ->
            c.set(annIndexOid).equalTo(record::getAnnIndexOid)
            .set(asExprOid).equalTo(record::getAsExprOid)
            .set(charsetExprOid).equalTo(record::getCharsetExprOid)
            .set(collateExprOid).equalTo(record::getCollateExprOid)
            .set(columnName).equalTo(record::getColumnName)
            .set(commentOid).equalTo(record::getCommentOid)
            .set(compressionOid).equalTo(record::getCompressionOid)
            .set(dataTypeOid).equalTo(record::getDataTypeOid)
            .set(defaultExprOid).equalTo(record::getDefaultExprOid)
            .set(delimiterOid).equalTo(record::getDelimiterOid)
            .set(delimiterTokenizerOid).equalTo(record::getDelimiterTokenizerOid)
            .set(enable).equalTo(record::getEnable)
            .set(encodeOid).equalTo(record::getEncodeOid)
            .set(formatOid).equalTo(record::getFormatOid)
            .set(generatedAlawsAsOid).equalTo(record::getGeneratedAlawsAsOid)
            .set(identity).equalTo(record::getIdentity)
            .set(isAutoIncrement).equalTo(record::getIsAutoIncrement)
            .set(isDisableIndex).equalTo(record::getIsDisableIndex)
            .set(isOnlyPrimaryKey).equalTo(record::getIsOnlyPrimaryKey)
            .set(isPartitionBy).equalTo(record::getIsPartitionBy)
            .set(isPreSort).equalTo(record::getIsPreSort)
            .set(isPrimaryKey).equalTo(record::getIsPrimaryKey)
            .set(isStored).equalTo(record::getIsStored)
            .set(isVirtual).equalTo(record::getIsVirtual)
            .set(isVisible).equalTo(record::getIsVisible)
            .set(jsonIndexAttrsExprOid).equalTo(record::getJsonIndexAttrsExprOid)
            .set(nameOid).equalTo(record::getNameOid)
            .set(nameAsString).equalTo(record::getNameAsString)
            .set(nlpTokenizerOid).equalTo(record::getNlpTokenizerOid)
            .set(nplTokenizerOid).equalTo(record::getNplTokenizerOid)
            .set(onUpdateOid).equalTo(record::getOnUpdateOid)
            .set(preSortOrder).equalTo(record::getPreSortOrder)
            .set(rely).equalTo(record::getRely)
            .set(sequenceType).equalTo(record::getSequenceType)
            .set(stepOid).equalTo(record::getStepOid)
            .set(storageOid).equalTo(record::getStorageOid)
            .set(unitCountOid).equalTo(record::getUnitCountOid)
            .set(unitIndexOid).equalTo(record::getUnitIndexOid)
            .set(validate).equalTo(record::getValidate)
            .set(valueTypeOid).equalTo(record::getValueTypeOid)
            .where(oid, isEqualTo(record::getOid))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_column_definition")
    default int updateByPrimaryKeySelective(SqlColumnDefinition record) {
        return update(c ->
            c.set(annIndexOid).equalToWhenPresent(record::getAnnIndexOid)
            .set(asExprOid).equalToWhenPresent(record::getAsExprOid)
            .set(charsetExprOid).equalToWhenPresent(record::getCharsetExprOid)
            .set(collateExprOid).equalToWhenPresent(record::getCollateExprOid)
            .set(columnName).equalToWhenPresent(record::getColumnName)
            .set(commentOid).equalToWhenPresent(record::getCommentOid)
            .set(compressionOid).equalToWhenPresent(record::getCompressionOid)
            .set(dataTypeOid).equalToWhenPresent(record::getDataTypeOid)
            .set(defaultExprOid).equalToWhenPresent(record::getDefaultExprOid)
            .set(delimiterOid).equalToWhenPresent(record::getDelimiterOid)
            .set(delimiterTokenizerOid).equalToWhenPresent(record::getDelimiterTokenizerOid)
            .set(enable).equalToWhenPresent(record::getEnable)
            .set(encodeOid).equalToWhenPresent(record::getEncodeOid)
            .set(formatOid).equalToWhenPresent(record::getFormatOid)
            .set(generatedAlawsAsOid).equalToWhenPresent(record::getGeneratedAlawsAsOid)
            .set(identity).equalToWhenPresent(record::getIdentity)
            .set(isAutoIncrement).equalToWhenPresent(record::getIsAutoIncrement)
            .set(isDisableIndex).equalToWhenPresent(record::getIsDisableIndex)
            .set(isOnlyPrimaryKey).equalToWhenPresent(record::getIsOnlyPrimaryKey)
            .set(isPartitionBy).equalToWhenPresent(record::getIsPartitionBy)
            .set(isPreSort).equalToWhenPresent(record::getIsPreSort)
            .set(isPrimaryKey).equalToWhenPresent(record::getIsPrimaryKey)
            .set(isStored).equalToWhenPresent(record::getIsStored)
            .set(isVirtual).equalToWhenPresent(record::getIsVirtual)
            .set(isVisible).equalToWhenPresent(record::getIsVisible)
            .set(jsonIndexAttrsExprOid).equalToWhenPresent(record::getJsonIndexAttrsExprOid)
            .set(nameOid).equalToWhenPresent(record::getNameOid)
            .set(nameAsString).equalToWhenPresent(record::getNameAsString)
            .set(nlpTokenizerOid).equalToWhenPresent(record::getNlpTokenizerOid)
            .set(nplTokenizerOid).equalToWhenPresent(record::getNplTokenizerOid)
            .set(onUpdateOid).equalToWhenPresent(record::getOnUpdateOid)
            .set(preSortOrder).equalToWhenPresent(record::getPreSortOrder)
            .set(rely).equalToWhenPresent(record::getRely)
            .set(sequenceType).equalToWhenPresent(record::getSequenceType)
            .set(stepOid).equalToWhenPresent(record::getStepOid)
            .set(storageOid).equalToWhenPresent(record::getStorageOid)
            .set(unitCountOid).equalToWhenPresent(record::getUnitCountOid)
            .set(unitIndexOid).equalToWhenPresent(record::getUnitIndexOid)
            .set(validate).equalToWhenPresent(record::getValidate)
            .set(valueTypeOid).equalToWhenPresent(record::getValueTypeOid)
            .where(oid, isEqualTo(record::getOid))
        );
    }
}