package com.alipay.codequery.dal.mybatis.mapper;

import static com.alipay.codequery.dal.mybatis.mapper.SqlSubPartitionByDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.alipay.codequery.dal.mybatis.domain.SqlSubPartitionBy;
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
public interface SqlSubPartitionByMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_sub_partition_by")
    BasicColumn[] selectList = BasicColumn.columnList(oid, isLinear, lifecycleOid, subPartitionsCountOid);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_sub_partition_by")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_sub_partition_by")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_sub_partition_by")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<SqlSubPartitionBy> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_sub_partition_by")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<SqlSubPartitionBy> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_sub_partition_by")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="is_linear", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="lifecycle_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="sub_partitions_count_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT)
    })
    Optional<SqlSubPartitionBy> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_sub_partition_by")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="is_linear", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="lifecycle_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="sub_partitions_count_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT)
    })
    List<SqlSubPartitionBy> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_sub_partition_by")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_sub_partition_by")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, sqlSubPartitionBy, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_sub_partition_by")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, sqlSubPartitionBy, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_sub_partition_by")
    default int deleteByPrimaryKey(Long oid_) {
        return delete(c -> 
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_sub_partition_by")
    default int insert(SqlSubPartitionBy record) {
        return MyBatis3Utils.insert(this::insert, record, sqlSubPartitionBy, c ->
            c.map(oid).toProperty("oid")
            .map(isLinear).toProperty("isLinear")
            .map(lifecycleOid).toProperty("lifecycleOid")
            .map(subPartitionsCountOid).toProperty("subPartitionsCountOid")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_sub_partition_by")
    default int insertMultiple(Collection<SqlSubPartitionBy> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, sqlSubPartitionBy, c ->
            c.map(oid).toProperty("oid")
            .map(isLinear).toProperty("isLinear")
            .map(lifecycleOid).toProperty("lifecycleOid")
            .map(subPartitionsCountOid).toProperty("subPartitionsCountOid")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_sub_partition_by")
    default int insertSelective(SqlSubPartitionBy record) {
        return MyBatis3Utils.insert(this::insert, record, sqlSubPartitionBy, c ->
            c.map(oid).toPropertyWhenPresent("oid", record::getOid)
            .map(isLinear).toPropertyWhenPresent("isLinear", record::getIsLinear)
            .map(lifecycleOid).toPropertyWhenPresent("lifecycleOid", record::getLifecycleOid)
            .map(subPartitionsCountOid).toPropertyWhenPresent("subPartitionsCountOid", record::getSubPartitionsCountOid)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_sub_partition_by")
    default Optional<SqlSubPartitionBy> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, sqlSubPartitionBy, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_sub_partition_by")
    default List<SqlSubPartitionBy> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, sqlSubPartitionBy, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_sub_partition_by")
    default List<SqlSubPartitionBy> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, sqlSubPartitionBy, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_sub_partition_by")
    default Optional<SqlSubPartitionBy> selectByPrimaryKey(Long oid_) {
        return selectOne(c ->
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_sub_partition_by")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, sqlSubPartitionBy, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_sub_partition_by")
    static UpdateDSL<UpdateModel> updateAllColumns(SqlSubPartitionBy record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalTo(record::getOid)
                .set(isLinear).equalTo(record::getIsLinear)
                .set(lifecycleOid).equalTo(record::getLifecycleOid)
                .set(subPartitionsCountOid).equalTo(record::getSubPartitionsCountOid);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_sub_partition_by")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(SqlSubPartitionBy record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalToWhenPresent(record::getOid)
                .set(isLinear).equalToWhenPresent(record::getIsLinear)
                .set(lifecycleOid).equalToWhenPresent(record::getLifecycleOid)
                .set(subPartitionsCountOid).equalToWhenPresent(record::getSubPartitionsCountOid);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_sub_partition_by")
    default int updateByPrimaryKey(SqlSubPartitionBy record) {
        return update(c ->
            c.set(isLinear).equalTo(record::getIsLinear)
            .set(lifecycleOid).equalTo(record::getLifecycleOid)
            .set(subPartitionsCountOid).equalTo(record::getSubPartitionsCountOid)
            .where(oid, isEqualTo(record::getOid))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_sub_partition_by")
    default int updateByPrimaryKeySelective(SqlSubPartitionBy record) {
        return update(c ->
            c.set(isLinear).equalToWhenPresent(record::getIsLinear)
            .set(lifecycleOid).equalToWhenPresent(record::getLifecycleOid)
            .set(subPartitionsCountOid).equalToWhenPresent(record::getSubPartitionsCountOid)
            .where(oid, isEqualTo(record::getOid))
        );
    }
}