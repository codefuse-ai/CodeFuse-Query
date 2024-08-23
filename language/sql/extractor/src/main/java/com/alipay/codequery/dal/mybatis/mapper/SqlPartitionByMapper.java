package com.alipay.codequery.dal.mybatis.mapper;

import static com.alipay.codequery.dal.mybatis.mapper.SqlPartitionByDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.alipay.codequery.dal.mybatis.domain.SqlPartitionBy;
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
public interface SqlPartitionByMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_partition_by")
    BasicColumn[] selectList = BasicColumn.columnList(oid, isLinear, lifecycleOid, partitionsCountOid, subPartitionByOid);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_partition_by")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_partition_by")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_partition_by")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<SqlPartitionBy> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_partition_by")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<SqlPartitionBy> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_partition_by")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="is_linear", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="lifecycle_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="partitions_count_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="sub_partition_by_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT)
    })
    Optional<SqlPartitionBy> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_partition_by")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="is_linear", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="lifecycle_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="partitions_count_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="sub_partition_by_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT)
    })
    List<SqlPartitionBy> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_partition_by")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_partition_by")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, sqlPartitionBy, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_partition_by")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, sqlPartitionBy, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_partition_by")
    default int deleteByPrimaryKey(Long oid_) {
        return delete(c -> 
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_partition_by")
    default int insert(SqlPartitionBy record) {
        return MyBatis3Utils.insert(this::insert, record, sqlPartitionBy, c ->
            c.map(oid).toProperty("oid")
            .map(isLinear).toProperty("isLinear")
            .map(lifecycleOid).toProperty("lifecycleOid")
            .map(partitionsCountOid).toProperty("partitionsCountOid")
            .map(subPartitionByOid).toProperty("subPartitionByOid")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_partition_by")
    default int insertMultiple(Collection<SqlPartitionBy> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, sqlPartitionBy, c ->
            c.map(oid).toProperty("oid")
            .map(isLinear).toProperty("isLinear")
            .map(lifecycleOid).toProperty("lifecycleOid")
            .map(partitionsCountOid).toProperty("partitionsCountOid")
            .map(subPartitionByOid).toProperty("subPartitionByOid")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_partition_by")
    default int insertSelective(SqlPartitionBy record) {
        return MyBatis3Utils.insert(this::insert, record, sqlPartitionBy, c ->
            c.map(oid).toPropertyWhenPresent("oid", record::getOid)
            .map(isLinear).toPropertyWhenPresent("isLinear", record::getIsLinear)
            .map(lifecycleOid).toPropertyWhenPresent("lifecycleOid", record::getLifecycleOid)
            .map(partitionsCountOid).toPropertyWhenPresent("partitionsCountOid", record::getPartitionsCountOid)
            .map(subPartitionByOid).toPropertyWhenPresent("subPartitionByOid", record::getSubPartitionByOid)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_partition_by")
    default Optional<SqlPartitionBy> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, sqlPartitionBy, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_partition_by")
    default List<SqlPartitionBy> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, sqlPartitionBy, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_partition_by")
    default List<SqlPartitionBy> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, sqlPartitionBy, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_partition_by")
    default Optional<SqlPartitionBy> selectByPrimaryKey(Long oid_) {
        return selectOne(c ->
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_partition_by")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, sqlPartitionBy, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_partition_by")
    static UpdateDSL<UpdateModel> updateAllColumns(SqlPartitionBy record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalTo(record::getOid)
                .set(isLinear).equalTo(record::getIsLinear)
                .set(lifecycleOid).equalTo(record::getLifecycleOid)
                .set(partitionsCountOid).equalTo(record::getPartitionsCountOid)
                .set(subPartitionByOid).equalTo(record::getSubPartitionByOid);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_partition_by")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(SqlPartitionBy record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalToWhenPresent(record::getOid)
                .set(isLinear).equalToWhenPresent(record::getIsLinear)
                .set(lifecycleOid).equalToWhenPresent(record::getLifecycleOid)
                .set(partitionsCountOid).equalToWhenPresent(record::getPartitionsCountOid)
                .set(subPartitionByOid).equalToWhenPresent(record::getSubPartitionByOid);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_partition_by")
    default int updateByPrimaryKey(SqlPartitionBy record) {
        return update(c ->
            c.set(isLinear).equalTo(record::getIsLinear)
            .set(lifecycleOid).equalTo(record::getLifecycleOid)
            .set(partitionsCountOid).equalTo(record::getPartitionsCountOid)
            .set(subPartitionByOid).equalTo(record::getSubPartitionByOid)
            .where(oid, isEqualTo(record::getOid))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_partition_by")
    default int updateByPrimaryKeySelective(SqlPartitionBy record) {
        return update(c ->
            c.set(isLinear).equalToWhenPresent(record::getIsLinear)
            .set(lifecycleOid).equalToWhenPresent(record::getLifecycleOid)
            .set(partitionsCountOid).equalToWhenPresent(record::getPartitionsCountOid)
            .set(subPartitionByOid).equalToWhenPresent(record::getSubPartitionByOid)
            .where(oid, isEqualTo(record::getOid))
        );
    }
}