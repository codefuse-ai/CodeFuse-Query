package com.alipay.codequery.dal.mybatis.mapper;

import static com.alipay.codequery.dal.mybatis.mapper.MySqlDeleteStatementDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.alipay.codequery.dal.mybatis.domain.MySqlDeleteStatement;
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
public interface MySqlDeleteStatementMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_delete_statement")
    BasicColumn[] selectList = BasicColumn.columnList(oid, forcePartitionOid, hintsSize, isForceAllPartitions, isFulltextDictionary, isIgnore, isLowPriority, isQuick, limitOid, orderByOid);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_delete_statement")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_delete_statement")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_delete_statement")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<MySqlDeleteStatement> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_delete_statement")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<MySqlDeleteStatement> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_delete_statement")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="force_partition_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="hints_size", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_force_all_partitions", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_fulltext_dictionary", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_ignore", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_low_priority", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_quick", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="limit_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="order_by_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT)
    })
    Optional<MySqlDeleteStatement> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_delete_statement")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="force_partition_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="hints_size", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_force_all_partitions", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_fulltext_dictionary", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_ignore", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_low_priority", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_quick", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="limit_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="order_by_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT)
    })
    List<MySqlDeleteStatement> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_delete_statement")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_delete_statement")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, mySqlDeleteStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_delete_statement")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, mySqlDeleteStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_delete_statement")
    default int deleteByPrimaryKey(Long oid_) {
        return delete(c -> 
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_delete_statement")
    default int insert(MySqlDeleteStatement record) {
        return MyBatis3Utils.insert(this::insert, record, mySqlDeleteStatement, c ->
            c.map(oid).toProperty("oid")
            .map(forcePartitionOid).toProperty("forcePartitionOid")
            .map(hintsSize).toProperty("hintsSize")
            .map(isForceAllPartitions).toProperty("isForceAllPartitions")
            .map(isFulltextDictionary).toProperty("isFulltextDictionary")
            .map(isIgnore).toProperty("isIgnore")
            .map(isLowPriority).toProperty("isLowPriority")
            .map(isQuick).toProperty("isQuick")
            .map(limitOid).toProperty("limitOid")
            .map(orderByOid).toProperty("orderByOid")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_delete_statement")
    default int insertMultiple(Collection<MySqlDeleteStatement> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, mySqlDeleteStatement, c ->
            c.map(oid).toProperty("oid")
            .map(forcePartitionOid).toProperty("forcePartitionOid")
            .map(hintsSize).toProperty("hintsSize")
            .map(isForceAllPartitions).toProperty("isForceAllPartitions")
            .map(isFulltextDictionary).toProperty("isFulltextDictionary")
            .map(isIgnore).toProperty("isIgnore")
            .map(isLowPriority).toProperty("isLowPriority")
            .map(isQuick).toProperty("isQuick")
            .map(limitOid).toProperty("limitOid")
            .map(orderByOid).toProperty("orderByOid")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_delete_statement")
    default int insertSelective(MySqlDeleteStatement record) {
        return MyBatis3Utils.insert(this::insert, record, mySqlDeleteStatement, c ->
            c.map(oid).toPropertyWhenPresent("oid", record::getOid)
            .map(forcePartitionOid).toPropertyWhenPresent("forcePartitionOid", record::getForcePartitionOid)
            .map(hintsSize).toPropertyWhenPresent("hintsSize", record::getHintsSize)
            .map(isForceAllPartitions).toPropertyWhenPresent("isForceAllPartitions", record::getIsForceAllPartitions)
            .map(isFulltextDictionary).toPropertyWhenPresent("isFulltextDictionary", record::getIsFulltextDictionary)
            .map(isIgnore).toPropertyWhenPresent("isIgnore", record::getIsIgnore)
            .map(isLowPriority).toPropertyWhenPresent("isLowPriority", record::getIsLowPriority)
            .map(isQuick).toPropertyWhenPresent("isQuick", record::getIsQuick)
            .map(limitOid).toPropertyWhenPresent("limitOid", record::getLimitOid)
            .map(orderByOid).toPropertyWhenPresent("orderByOid", record::getOrderByOid)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_delete_statement")
    default Optional<MySqlDeleteStatement> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, mySqlDeleteStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_delete_statement")
    default List<MySqlDeleteStatement> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, mySqlDeleteStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_delete_statement")
    default List<MySqlDeleteStatement> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, mySqlDeleteStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_delete_statement")
    default Optional<MySqlDeleteStatement> selectByPrimaryKey(Long oid_) {
        return selectOne(c ->
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_delete_statement")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, mySqlDeleteStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_delete_statement")
    static UpdateDSL<UpdateModel> updateAllColumns(MySqlDeleteStatement record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalTo(record::getOid)
                .set(forcePartitionOid).equalTo(record::getForcePartitionOid)
                .set(hintsSize).equalTo(record::getHintsSize)
                .set(isForceAllPartitions).equalTo(record::getIsForceAllPartitions)
                .set(isFulltextDictionary).equalTo(record::getIsFulltextDictionary)
                .set(isIgnore).equalTo(record::getIsIgnore)
                .set(isLowPriority).equalTo(record::getIsLowPriority)
                .set(isQuick).equalTo(record::getIsQuick)
                .set(limitOid).equalTo(record::getLimitOid)
                .set(orderByOid).equalTo(record::getOrderByOid);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_delete_statement")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(MySqlDeleteStatement record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalToWhenPresent(record::getOid)
                .set(forcePartitionOid).equalToWhenPresent(record::getForcePartitionOid)
                .set(hintsSize).equalToWhenPresent(record::getHintsSize)
                .set(isForceAllPartitions).equalToWhenPresent(record::getIsForceAllPartitions)
                .set(isFulltextDictionary).equalToWhenPresent(record::getIsFulltextDictionary)
                .set(isIgnore).equalToWhenPresent(record::getIsIgnore)
                .set(isLowPriority).equalToWhenPresent(record::getIsLowPriority)
                .set(isQuick).equalToWhenPresent(record::getIsQuick)
                .set(limitOid).equalToWhenPresent(record::getLimitOid)
                .set(orderByOid).equalToWhenPresent(record::getOrderByOid);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_delete_statement")
    default int updateByPrimaryKey(MySqlDeleteStatement record) {
        return update(c ->
            c.set(forcePartitionOid).equalTo(record::getForcePartitionOid)
            .set(hintsSize).equalTo(record::getHintsSize)
            .set(isForceAllPartitions).equalTo(record::getIsForceAllPartitions)
            .set(isFulltextDictionary).equalTo(record::getIsFulltextDictionary)
            .set(isIgnore).equalTo(record::getIsIgnore)
            .set(isLowPriority).equalTo(record::getIsLowPriority)
            .set(isQuick).equalTo(record::getIsQuick)
            .set(limitOid).equalTo(record::getLimitOid)
            .set(orderByOid).equalTo(record::getOrderByOid)
            .where(oid, isEqualTo(record::getOid))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_delete_statement")
    default int updateByPrimaryKeySelective(MySqlDeleteStatement record) {
        return update(c ->
            c.set(forcePartitionOid).equalToWhenPresent(record::getForcePartitionOid)
            .set(hintsSize).equalToWhenPresent(record::getHintsSize)
            .set(isForceAllPartitions).equalToWhenPresent(record::getIsForceAllPartitions)
            .set(isFulltextDictionary).equalToWhenPresent(record::getIsFulltextDictionary)
            .set(isIgnore).equalToWhenPresent(record::getIsIgnore)
            .set(isLowPriority).equalToWhenPresent(record::getIsLowPriority)
            .set(isQuick).equalToWhenPresent(record::getIsQuick)
            .set(limitOid).equalToWhenPresent(record::getLimitOid)
            .set(orderByOid).equalToWhenPresent(record::getOrderByOid)
            .where(oid, isEqualTo(record::getOid))
        );
    }
}