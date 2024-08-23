package com.alipay.codequery.dal.mybatis.mapper;

import static com.alipay.codequery.dal.mybatis.mapper.SqlTableSamplingDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.alipay.codequery.dal.mybatis.domain.SqlTableSampling;
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
public interface SqlTableSamplingMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_table_sampling")
    BasicColumn[] selectList = BasicColumn.columnList(oid, bucketOid, byteLengthOid, isBernoulli, isSystem, onOid, outOfOid, percentOid, rowsOid);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_table_sampling")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_table_sampling")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_table_sampling")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<SqlTableSampling> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_table_sampling")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<SqlTableSampling> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_table_sampling")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="bucket_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="byte_length_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_bernoulli", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_system", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="on_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="out_of_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="percent_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="rows_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT)
    })
    Optional<SqlTableSampling> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_table_sampling")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="bucket_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="byte_length_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_bernoulli", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_system", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="on_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="out_of_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="percent_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="rows_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT)
    })
    List<SqlTableSampling> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_table_sampling")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_table_sampling")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, sqlTableSampling, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_table_sampling")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, sqlTableSampling, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_table_sampling")
    default int deleteByPrimaryKey(Long oid_) {
        return delete(c -> 
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_table_sampling")
    default int insert(SqlTableSampling record) {
        return MyBatis3Utils.insert(this::insert, record, sqlTableSampling, c ->
            c.map(oid).toProperty("oid")
            .map(bucketOid).toProperty("bucketOid")
            .map(byteLengthOid).toProperty("byteLengthOid")
            .map(isBernoulli).toProperty("isBernoulli")
            .map(isSystem).toProperty("isSystem")
            .map(onOid).toProperty("onOid")
            .map(outOfOid).toProperty("outOfOid")
            .map(percentOid).toProperty("percentOid")
            .map(rowsOid).toProperty("rowsOid")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_table_sampling")
    default int insertMultiple(Collection<SqlTableSampling> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, sqlTableSampling, c ->
            c.map(oid).toProperty("oid")
            .map(bucketOid).toProperty("bucketOid")
            .map(byteLengthOid).toProperty("byteLengthOid")
            .map(isBernoulli).toProperty("isBernoulli")
            .map(isSystem).toProperty("isSystem")
            .map(onOid).toProperty("onOid")
            .map(outOfOid).toProperty("outOfOid")
            .map(percentOid).toProperty("percentOid")
            .map(rowsOid).toProperty("rowsOid")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_table_sampling")
    default int insertSelective(SqlTableSampling record) {
        return MyBatis3Utils.insert(this::insert, record, sqlTableSampling, c ->
            c.map(oid).toPropertyWhenPresent("oid", record::getOid)
            .map(bucketOid).toPropertyWhenPresent("bucketOid", record::getBucketOid)
            .map(byteLengthOid).toPropertyWhenPresent("byteLengthOid", record::getByteLengthOid)
            .map(isBernoulli).toPropertyWhenPresent("isBernoulli", record::getIsBernoulli)
            .map(isSystem).toPropertyWhenPresent("isSystem", record::getIsSystem)
            .map(onOid).toPropertyWhenPresent("onOid", record::getOnOid)
            .map(outOfOid).toPropertyWhenPresent("outOfOid", record::getOutOfOid)
            .map(percentOid).toPropertyWhenPresent("percentOid", record::getPercentOid)
            .map(rowsOid).toPropertyWhenPresent("rowsOid", record::getRowsOid)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_table_sampling")
    default Optional<SqlTableSampling> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, sqlTableSampling, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_table_sampling")
    default List<SqlTableSampling> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, sqlTableSampling, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_table_sampling")
    default List<SqlTableSampling> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, sqlTableSampling, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_table_sampling")
    default Optional<SqlTableSampling> selectByPrimaryKey(Long oid_) {
        return selectOne(c ->
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_table_sampling")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, sqlTableSampling, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_table_sampling")
    static UpdateDSL<UpdateModel> updateAllColumns(SqlTableSampling record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalTo(record::getOid)
                .set(bucketOid).equalTo(record::getBucketOid)
                .set(byteLengthOid).equalTo(record::getByteLengthOid)
                .set(isBernoulli).equalTo(record::getIsBernoulli)
                .set(isSystem).equalTo(record::getIsSystem)
                .set(onOid).equalTo(record::getOnOid)
                .set(outOfOid).equalTo(record::getOutOfOid)
                .set(percentOid).equalTo(record::getPercentOid)
                .set(rowsOid).equalTo(record::getRowsOid);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_table_sampling")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(SqlTableSampling record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalToWhenPresent(record::getOid)
                .set(bucketOid).equalToWhenPresent(record::getBucketOid)
                .set(byteLengthOid).equalToWhenPresent(record::getByteLengthOid)
                .set(isBernoulli).equalToWhenPresent(record::getIsBernoulli)
                .set(isSystem).equalToWhenPresent(record::getIsSystem)
                .set(onOid).equalToWhenPresent(record::getOnOid)
                .set(outOfOid).equalToWhenPresent(record::getOutOfOid)
                .set(percentOid).equalToWhenPresent(record::getPercentOid)
                .set(rowsOid).equalToWhenPresent(record::getRowsOid);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_table_sampling")
    default int updateByPrimaryKey(SqlTableSampling record) {
        return update(c ->
            c.set(bucketOid).equalTo(record::getBucketOid)
            .set(byteLengthOid).equalTo(record::getByteLengthOid)
            .set(isBernoulli).equalTo(record::getIsBernoulli)
            .set(isSystem).equalTo(record::getIsSystem)
            .set(onOid).equalTo(record::getOnOid)
            .set(outOfOid).equalTo(record::getOutOfOid)
            .set(percentOid).equalTo(record::getPercentOid)
            .set(rowsOid).equalTo(record::getRowsOid)
            .where(oid, isEqualTo(record::getOid))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_table_sampling")
    default int updateByPrimaryKeySelective(SqlTableSampling record) {
        return update(c ->
            c.set(bucketOid).equalToWhenPresent(record::getBucketOid)
            .set(byteLengthOid).equalToWhenPresent(record::getByteLengthOid)
            .set(isBernoulli).equalToWhenPresent(record::getIsBernoulli)
            .set(isSystem).equalToWhenPresent(record::getIsSystem)
            .set(onOid).equalToWhenPresent(record::getOnOid)
            .set(outOfOid).equalToWhenPresent(record::getOutOfOid)
            .set(percentOid).equalToWhenPresent(record::getPercentOid)
            .set(rowsOid).equalToWhenPresent(record::getRowsOid)
            .where(oid, isEqualTo(record::getOid))
        );
    }
}