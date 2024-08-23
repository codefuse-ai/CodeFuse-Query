package com.alipay.codequery.dal.mybatis.mapper;

import static com.alipay.codequery.dal.mybatis.mapper.SqlPartitionByRangeDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.alipay.codequery.dal.mybatis.domain.SqlPartitionByRange;
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
public interface SqlPartitionByRangeMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_partition_by_range")
    BasicColumn[] selectList = BasicColumn.columnList(oid, expireAfterOid, intervalOid, isColumns, isDisableSchedule, pivotDateExprOid, preAllocateOid, startWithOid);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_partition_by_range")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_partition_by_range")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_partition_by_range")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<SqlPartitionByRange> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_partition_by_range")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<SqlPartitionByRange> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_partition_by_range")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="expire_after_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="interval_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_columns", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_disable_schedule", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="pivot_date_expr_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="pre_allocate_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="start_with_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT)
    })
    Optional<SqlPartitionByRange> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_partition_by_range")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="expire_after_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="interval_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_columns", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_disable_schedule", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="pivot_date_expr_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="pre_allocate_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="start_with_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT)
    })
    List<SqlPartitionByRange> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_partition_by_range")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_partition_by_range")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, sqlPartitionByRange, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_partition_by_range")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, sqlPartitionByRange, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_partition_by_range")
    default int deleteByPrimaryKey(Long oid_) {
        return delete(c -> 
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_partition_by_range")
    default int insert(SqlPartitionByRange record) {
        return MyBatis3Utils.insert(this::insert, record, sqlPartitionByRange, c ->
            c.map(oid).toProperty("oid")
            .map(expireAfterOid).toProperty("expireAfterOid")
            .map(intervalOid).toProperty("intervalOid")
            .map(isColumns).toProperty("isColumns")
            .map(isDisableSchedule).toProperty("isDisableSchedule")
            .map(pivotDateExprOid).toProperty("pivotDateExprOid")
            .map(preAllocateOid).toProperty("preAllocateOid")
            .map(startWithOid).toProperty("startWithOid")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_partition_by_range")
    default int insertMultiple(Collection<SqlPartitionByRange> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, sqlPartitionByRange, c ->
            c.map(oid).toProperty("oid")
            .map(expireAfterOid).toProperty("expireAfterOid")
            .map(intervalOid).toProperty("intervalOid")
            .map(isColumns).toProperty("isColumns")
            .map(isDisableSchedule).toProperty("isDisableSchedule")
            .map(pivotDateExprOid).toProperty("pivotDateExprOid")
            .map(preAllocateOid).toProperty("preAllocateOid")
            .map(startWithOid).toProperty("startWithOid")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_partition_by_range")
    default int insertSelective(SqlPartitionByRange record) {
        return MyBatis3Utils.insert(this::insert, record, sqlPartitionByRange, c ->
            c.map(oid).toPropertyWhenPresent("oid", record::getOid)
            .map(expireAfterOid).toPropertyWhenPresent("expireAfterOid", record::getExpireAfterOid)
            .map(intervalOid).toPropertyWhenPresent("intervalOid", record::getIntervalOid)
            .map(isColumns).toPropertyWhenPresent("isColumns", record::getIsColumns)
            .map(isDisableSchedule).toPropertyWhenPresent("isDisableSchedule", record::getIsDisableSchedule)
            .map(pivotDateExprOid).toPropertyWhenPresent("pivotDateExprOid", record::getPivotDateExprOid)
            .map(preAllocateOid).toPropertyWhenPresent("preAllocateOid", record::getPreAllocateOid)
            .map(startWithOid).toPropertyWhenPresent("startWithOid", record::getStartWithOid)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_partition_by_range")
    default Optional<SqlPartitionByRange> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, sqlPartitionByRange, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_partition_by_range")
    default List<SqlPartitionByRange> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, sqlPartitionByRange, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_partition_by_range")
    default List<SqlPartitionByRange> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, sqlPartitionByRange, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_partition_by_range")
    default Optional<SqlPartitionByRange> selectByPrimaryKey(Long oid_) {
        return selectOne(c ->
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_partition_by_range")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, sqlPartitionByRange, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_partition_by_range")
    static UpdateDSL<UpdateModel> updateAllColumns(SqlPartitionByRange record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalTo(record::getOid)
                .set(expireAfterOid).equalTo(record::getExpireAfterOid)
                .set(intervalOid).equalTo(record::getIntervalOid)
                .set(isColumns).equalTo(record::getIsColumns)
                .set(isDisableSchedule).equalTo(record::getIsDisableSchedule)
                .set(pivotDateExprOid).equalTo(record::getPivotDateExprOid)
                .set(preAllocateOid).equalTo(record::getPreAllocateOid)
                .set(startWithOid).equalTo(record::getStartWithOid);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_partition_by_range")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(SqlPartitionByRange record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalToWhenPresent(record::getOid)
                .set(expireAfterOid).equalToWhenPresent(record::getExpireAfterOid)
                .set(intervalOid).equalToWhenPresent(record::getIntervalOid)
                .set(isColumns).equalToWhenPresent(record::getIsColumns)
                .set(isDisableSchedule).equalToWhenPresent(record::getIsDisableSchedule)
                .set(pivotDateExprOid).equalToWhenPresent(record::getPivotDateExprOid)
                .set(preAllocateOid).equalToWhenPresent(record::getPreAllocateOid)
                .set(startWithOid).equalToWhenPresent(record::getStartWithOid);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_partition_by_range")
    default int updateByPrimaryKey(SqlPartitionByRange record) {
        return update(c ->
            c.set(expireAfterOid).equalTo(record::getExpireAfterOid)
            .set(intervalOid).equalTo(record::getIntervalOid)
            .set(isColumns).equalTo(record::getIsColumns)
            .set(isDisableSchedule).equalTo(record::getIsDisableSchedule)
            .set(pivotDateExprOid).equalTo(record::getPivotDateExprOid)
            .set(preAllocateOid).equalTo(record::getPreAllocateOid)
            .set(startWithOid).equalTo(record::getStartWithOid)
            .where(oid, isEqualTo(record::getOid))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_partition_by_range")
    default int updateByPrimaryKeySelective(SqlPartitionByRange record) {
        return update(c ->
            c.set(expireAfterOid).equalToWhenPresent(record::getExpireAfterOid)
            .set(intervalOid).equalToWhenPresent(record::getIntervalOid)
            .set(isColumns).equalToWhenPresent(record::getIsColumns)
            .set(isDisableSchedule).equalToWhenPresent(record::getIsDisableSchedule)
            .set(pivotDateExprOid).equalToWhenPresent(record::getPivotDateExprOid)
            .set(preAllocateOid).equalToWhenPresent(record::getPreAllocateOid)
            .set(startWithOid).equalToWhenPresent(record::getStartWithOid)
            .where(oid, isEqualTo(record::getOid))
        );
    }
}