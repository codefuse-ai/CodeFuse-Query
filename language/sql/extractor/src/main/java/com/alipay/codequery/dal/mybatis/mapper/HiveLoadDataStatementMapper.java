package com.alipay.codequery.dal.mybatis.mapper;

import static com.alipay.codequery.dal.mybatis.mapper.HiveLoadDataStatementDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.alipay.codequery.dal.mybatis.domain.HiveLoadDataStatement;
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
public interface HiveLoadDataStatementMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: hive_load_data_statement")
    BasicColumn[] selectList = BasicColumn.columnList(oid, formatOid, inpathOid, intoOid, isLocal, isOverwrite, rowFormatOid, serdeProperties, storedAsOid, storedByOid, usingOid);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: hive_load_data_statement")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: hive_load_data_statement")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: hive_load_data_statement")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<HiveLoadDataStatement> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: hive_load_data_statement")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<HiveLoadDataStatement> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: hive_load_data_statement")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="format_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="inpath_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="into_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_local", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_overwrite", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="row_format_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="serde_properties", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="stored_as_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="stored_by_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="using_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT)
    })
    Optional<HiveLoadDataStatement> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: hive_load_data_statement")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="format_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="inpath_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="into_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_local", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_overwrite", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="row_format_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="serde_properties", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="stored_as_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="stored_by_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="using_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT)
    })
    List<HiveLoadDataStatement> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: hive_load_data_statement")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: hive_load_data_statement")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, hiveLoadDataStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: hive_load_data_statement")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, hiveLoadDataStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: hive_load_data_statement")
    default int deleteByPrimaryKey(Long oid_) {
        return delete(c -> 
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: hive_load_data_statement")
    default int insert(HiveLoadDataStatement record) {
        return MyBatis3Utils.insert(this::insert, record, hiveLoadDataStatement, c ->
            c.map(oid).toProperty("oid")
            .map(formatOid).toProperty("formatOid")
            .map(inpathOid).toProperty("inpathOid")
            .map(intoOid).toProperty("intoOid")
            .map(isLocal).toProperty("isLocal")
            .map(isOverwrite).toProperty("isOverwrite")
            .map(rowFormatOid).toProperty("rowFormatOid")
            .map(serdeProperties).toProperty("serdeProperties")
            .map(storedAsOid).toProperty("storedAsOid")
            .map(storedByOid).toProperty("storedByOid")
            .map(usingOid).toProperty("usingOid")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: hive_load_data_statement")
    default int insertMultiple(Collection<HiveLoadDataStatement> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, hiveLoadDataStatement, c ->
            c.map(oid).toProperty("oid")
            .map(formatOid).toProperty("formatOid")
            .map(inpathOid).toProperty("inpathOid")
            .map(intoOid).toProperty("intoOid")
            .map(isLocal).toProperty("isLocal")
            .map(isOverwrite).toProperty("isOverwrite")
            .map(rowFormatOid).toProperty("rowFormatOid")
            .map(serdeProperties).toProperty("serdeProperties")
            .map(storedAsOid).toProperty("storedAsOid")
            .map(storedByOid).toProperty("storedByOid")
            .map(usingOid).toProperty("usingOid")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: hive_load_data_statement")
    default int insertSelective(HiveLoadDataStatement record) {
        return MyBatis3Utils.insert(this::insert, record, hiveLoadDataStatement, c ->
            c.map(oid).toPropertyWhenPresent("oid", record::getOid)
            .map(formatOid).toPropertyWhenPresent("formatOid", record::getFormatOid)
            .map(inpathOid).toPropertyWhenPresent("inpathOid", record::getInpathOid)
            .map(intoOid).toPropertyWhenPresent("intoOid", record::getIntoOid)
            .map(isLocal).toPropertyWhenPresent("isLocal", record::getIsLocal)
            .map(isOverwrite).toPropertyWhenPresent("isOverwrite", record::getIsOverwrite)
            .map(rowFormatOid).toPropertyWhenPresent("rowFormatOid", record::getRowFormatOid)
            .map(serdeProperties).toPropertyWhenPresent("serdeProperties", record::getSerdeProperties)
            .map(storedAsOid).toPropertyWhenPresent("storedAsOid", record::getStoredAsOid)
            .map(storedByOid).toPropertyWhenPresent("storedByOid", record::getStoredByOid)
            .map(usingOid).toPropertyWhenPresent("usingOid", record::getUsingOid)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: hive_load_data_statement")
    default Optional<HiveLoadDataStatement> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, hiveLoadDataStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: hive_load_data_statement")
    default List<HiveLoadDataStatement> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, hiveLoadDataStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: hive_load_data_statement")
    default List<HiveLoadDataStatement> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, hiveLoadDataStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: hive_load_data_statement")
    default Optional<HiveLoadDataStatement> selectByPrimaryKey(Long oid_) {
        return selectOne(c ->
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: hive_load_data_statement")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, hiveLoadDataStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: hive_load_data_statement")
    static UpdateDSL<UpdateModel> updateAllColumns(HiveLoadDataStatement record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalTo(record::getOid)
                .set(formatOid).equalTo(record::getFormatOid)
                .set(inpathOid).equalTo(record::getInpathOid)
                .set(intoOid).equalTo(record::getIntoOid)
                .set(isLocal).equalTo(record::getIsLocal)
                .set(isOverwrite).equalTo(record::getIsOverwrite)
                .set(rowFormatOid).equalTo(record::getRowFormatOid)
                .set(serdeProperties).equalTo(record::getSerdeProperties)
                .set(storedAsOid).equalTo(record::getStoredAsOid)
                .set(storedByOid).equalTo(record::getStoredByOid)
                .set(usingOid).equalTo(record::getUsingOid);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: hive_load_data_statement")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(HiveLoadDataStatement record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalToWhenPresent(record::getOid)
                .set(formatOid).equalToWhenPresent(record::getFormatOid)
                .set(inpathOid).equalToWhenPresent(record::getInpathOid)
                .set(intoOid).equalToWhenPresent(record::getIntoOid)
                .set(isLocal).equalToWhenPresent(record::getIsLocal)
                .set(isOverwrite).equalToWhenPresent(record::getIsOverwrite)
                .set(rowFormatOid).equalToWhenPresent(record::getRowFormatOid)
                .set(serdeProperties).equalToWhenPresent(record::getSerdeProperties)
                .set(storedAsOid).equalToWhenPresent(record::getStoredAsOid)
                .set(storedByOid).equalToWhenPresent(record::getStoredByOid)
                .set(usingOid).equalToWhenPresent(record::getUsingOid);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: hive_load_data_statement")
    default int updateByPrimaryKey(HiveLoadDataStatement record) {
        return update(c ->
            c.set(formatOid).equalTo(record::getFormatOid)
            .set(inpathOid).equalTo(record::getInpathOid)
            .set(intoOid).equalTo(record::getIntoOid)
            .set(isLocal).equalTo(record::getIsLocal)
            .set(isOverwrite).equalTo(record::getIsOverwrite)
            .set(rowFormatOid).equalTo(record::getRowFormatOid)
            .set(serdeProperties).equalTo(record::getSerdeProperties)
            .set(storedAsOid).equalTo(record::getStoredAsOid)
            .set(storedByOid).equalTo(record::getStoredByOid)
            .set(usingOid).equalTo(record::getUsingOid)
            .where(oid, isEqualTo(record::getOid))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: hive_load_data_statement")
    default int updateByPrimaryKeySelective(HiveLoadDataStatement record) {
        return update(c ->
            c.set(formatOid).equalToWhenPresent(record::getFormatOid)
            .set(inpathOid).equalToWhenPresent(record::getInpathOid)
            .set(intoOid).equalToWhenPresent(record::getIntoOid)
            .set(isLocal).equalToWhenPresent(record::getIsLocal)
            .set(isOverwrite).equalToWhenPresent(record::getIsOverwrite)
            .set(rowFormatOid).equalToWhenPresent(record::getRowFormatOid)
            .set(serdeProperties).equalToWhenPresent(record::getSerdeProperties)
            .set(storedAsOid).equalToWhenPresent(record::getStoredAsOid)
            .set(storedByOid).equalToWhenPresent(record::getStoredByOid)
            .set(usingOid).equalToWhenPresent(record::getUsingOid)
            .where(oid, isEqualTo(record::getOid))
        );
    }
}