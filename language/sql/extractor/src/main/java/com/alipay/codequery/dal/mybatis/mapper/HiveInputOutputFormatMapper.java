package com.alipay.codequery.dal.mybatis.mapper;

import static com.alipay.codequery.dal.mybatis.mapper.HiveInputOutputFormatDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.alipay.codequery.dal.mybatis.domain.HiveInputOutputFormat;
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
public interface HiveInputOutputFormatMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: hive_input_output_format")
    BasicColumn[] selectList = BasicColumn.columnList(oid, inputOid, outputOid);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: hive_input_output_format")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: hive_input_output_format")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: hive_input_output_format")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<HiveInputOutputFormat> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: hive_input_output_format")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<HiveInputOutputFormat> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: hive_input_output_format")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="input_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="output_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT)
    })
    Optional<HiveInputOutputFormat> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: hive_input_output_format")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="input_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="output_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT)
    })
    List<HiveInputOutputFormat> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: hive_input_output_format")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: hive_input_output_format")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, hiveInputOutputFormat, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: hive_input_output_format")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, hiveInputOutputFormat, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: hive_input_output_format")
    default int deleteByPrimaryKey(Long oid_) {
        return delete(c -> 
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: hive_input_output_format")
    default int insert(HiveInputOutputFormat record) {
        return MyBatis3Utils.insert(this::insert, record, hiveInputOutputFormat, c ->
            c.map(oid).toProperty("oid")
            .map(inputOid).toProperty("inputOid")
            .map(outputOid).toProperty("outputOid")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: hive_input_output_format")
    default int insertMultiple(Collection<HiveInputOutputFormat> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, hiveInputOutputFormat, c ->
            c.map(oid).toProperty("oid")
            .map(inputOid).toProperty("inputOid")
            .map(outputOid).toProperty("outputOid")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: hive_input_output_format")
    default int insertSelective(HiveInputOutputFormat record) {
        return MyBatis3Utils.insert(this::insert, record, hiveInputOutputFormat, c ->
            c.map(oid).toPropertyWhenPresent("oid", record::getOid)
            .map(inputOid).toPropertyWhenPresent("inputOid", record::getInputOid)
            .map(outputOid).toPropertyWhenPresent("outputOid", record::getOutputOid)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: hive_input_output_format")
    default Optional<HiveInputOutputFormat> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, hiveInputOutputFormat, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: hive_input_output_format")
    default List<HiveInputOutputFormat> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, hiveInputOutputFormat, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: hive_input_output_format")
    default List<HiveInputOutputFormat> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, hiveInputOutputFormat, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: hive_input_output_format")
    default Optional<HiveInputOutputFormat> selectByPrimaryKey(Long oid_) {
        return selectOne(c ->
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: hive_input_output_format")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, hiveInputOutputFormat, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: hive_input_output_format")
    static UpdateDSL<UpdateModel> updateAllColumns(HiveInputOutputFormat record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalTo(record::getOid)
                .set(inputOid).equalTo(record::getInputOid)
                .set(outputOid).equalTo(record::getOutputOid);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: hive_input_output_format")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(HiveInputOutputFormat record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalToWhenPresent(record::getOid)
                .set(inputOid).equalToWhenPresent(record::getInputOid)
                .set(outputOid).equalToWhenPresent(record::getOutputOid);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: hive_input_output_format")
    default int updateByPrimaryKey(HiveInputOutputFormat record) {
        return update(c ->
            c.set(inputOid).equalTo(record::getInputOid)
            .set(outputOid).equalTo(record::getOutputOid)
            .where(oid, isEqualTo(record::getOid))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: hive_input_output_format")
    default int updateByPrimaryKeySelective(HiveInputOutputFormat record) {
        return update(c ->
            c.set(inputOid).equalToWhenPresent(record::getInputOid)
            .set(outputOid).equalToWhenPresent(record::getOutputOid)
            .where(oid, isEqualTo(record::getOid))
        );
    }
}