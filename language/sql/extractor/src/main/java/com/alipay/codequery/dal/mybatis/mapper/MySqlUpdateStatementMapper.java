package com.alipay.codequery.dal.mybatis.mapper;

import static com.alipay.codequery.dal.mybatis.mapper.MySqlUpdateStatementDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.alipay.codequery.dal.mybatis.domain.MySqlUpdateStatement;
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
public interface MySqlUpdateStatementMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_update_statement")
    BasicColumn[] selectList = BasicColumn.columnList(oid, forcePartitionOid, hintsSize, isCommitOnSuccess, isForceAllPartitions, isIgnore, isLowPriority, isQueryOnPk, isRollBackOnFail, limitOid, targetAffectRowOid);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_update_statement")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_update_statement")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_update_statement")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<MySqlUpdateStatement> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_update_statement")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<MySqlUpdateStatement> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_update_statement")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="force_partition_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="hints_size", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_commit_on_success", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_force_all_partitions", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_ignore", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_low_priority", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_query_on_pk", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_roll_back_on_fail", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="limit_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="target_affect_row_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT)
    })
    Optional<MySqlUpdateStatement> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_update_statement")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="force_partition_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="hints_size", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_commit_on_success", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_force_all_partitions", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_ignore", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_low_priority", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_query_on_pk", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_roll_back_on_fail", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="limit_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="target_affect_row_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT)
    })
    List<MySqlUpdateStatement> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_update_statement")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_update_statement")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, mySqlUpdateStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_update_statement")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, mySqlUpdateStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_update_statement")
    default int deleteByPrimaryKey(Long oid_) {
        return delete(c -> 
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_update_statement")
    default int insert(MySqlUpdateStatement record) {
        return MyBatis3Utils.insert(this::insert, record, mySqlUpdateStatement, c ->
            c.map(oid).toProperty("oid")
            .map(forcePartitionOid).toProperty("forcePartitionOid")
            .map(hintsSize).toProperty("hintsSize")
            .map(isCommitOnSuccess).toProperty("isCommitOnSuccess")
            .map(isForceAllPartitions).toProperty("isForceAllPartitions")
            .map(isIgnore).toProperty("isIgnore")
            .map(isLowPriority).toProperty("isLowPriority")
            .map(isQueryOnPk).toProperty("isQueryOnPk")
            .map(isRollBackOnFail).toProperty("isRollBackOnFail")
            .map(limitOid).toProperty("limitOid")
            .map(targetAffectRowOid).toProperty("targetAffectRowOid")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_update_statement")
    default int insertMultiple(Collection<MySqlUpdateStatement> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, mySqlUpdateStatement, c ->
            c.map(oid).toProperty("oid")
            .map(forcePartitionOid).toProperty("forcePartitionOid")
            .map(hintsSize).toProperty("hintsSize")
            .map(isCommitOnSuccess).toProperty("isCommitOnSuccess")
            .map(isForceAllPartitions).toProperty("isForceAllPartitions")
            .map(isIgnore).toProperty("isIgnore")
            .map(isLowPriority).toProperty("isLowPriority")
            .map(isQueryOnPk).toProperty("isQueryOnPk")
            .map(isRollBackOnFail).toProperty("isRollBackOnFail")
            .map(limitOid).toProperty("limitOid")
            .map(targetAffectRowOid).toProperty("targetAffectRowOid")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_update_statement")
    default int insertSelective(MySqlUpdateStatement record) {
        return MyBatis3Utils.insert(this::insert, record, mySqlUpdateStatement, c ->
            c.map(oid).toPropertyWhenPresent("oid", record::getOid)
            .map(forcePartitionOid).toPropertyWhenPresent("forcePartitionOid", record::getForcePartitionOid)
            .map(hintsSize).toPropertyWhenPresent("hintsSize", record::getHintsSize)
            .map(isCommitOnSuccess).toPropertyWhenPresent("isCommitOnSuccess", record::getIsCommitOnSuccess)
            .map(isForceAllPartitions).toPropertyWhenPresent("isForceAllPartitions", record::getIsForceAllPartitions)
            .map(isIgnore).toPropertyWhenPresent("isIgnore", record::getIsIgnore)
            .map(isLowPriority).toPropertyWhenPresent("isLowPriority", record::getIsLowPriority)
            .map(isQueryOnPk).toPropertyWhenPresent("isQueryOnPk", record::getIsQueryOnPk)
            .map(isRollBackOnFail).toPropertyWhenPresent("isRollBackOnFail", record::getIsRollBackOnFail)
            .map(limitOid).toPropertyWhenPresent("limitOid", record::getLimitOid)
            .map(targetAffectRowOid).toPropertyWhenPresent("targetAffectRowOid", record::getTargetAffectRowOid)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_update_statement")
    default Optional<MySqlUpdateStatement> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, mySqlUpdateStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_update_statement")
    default List<MySqlUpdateStatement> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, mySqlUpdateStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_update_statement")
    default List<MySqlUpdateStatement> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, mySqlUpdateStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_update_statement")
    default Optional<MySqlUpdateStatement> selectByPrimaryKey(Long oid_) {
        return selectOne(c ->
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_update_statement")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, mySqlUpdateStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_update_statement")
    static UpdateDSL<UpdateModel> updateAllColumns(MySqlUpdateStatement record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalTo(record::getOid)
                .set(forcePartitionOid).equalTo(record::getForcePartitionOid)
                .set(hintsSize).equalTo(record::getHintsSize)
                .set(isCommitOnSuccess).equalTo(record::getIsCommitOnSuccess)
                .set(isForceAllPartitions).equalTo(record::getIsForceAllPartitions)
                .set(isIgnore).equalTo(record::getIsIgnore)
                .set(isLowPriority).equalTo(record::getIsLowPriority)
                .set(isQueryOnPk).equalTo(record::getIsQueryOnPk)
                .set(isRollBackOnFail).equalTo(record::getIsRollBackOnFail)
                .set(limitOid).equalTo(record::getLimitOid)
                .set(targetAffectRowOid).equalTo(record::getTargetAffectRowOid);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_update_statement")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(MySqlUpdateStatement record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalToWhenPresent(record::getOid)
                .set(forcePartitionOid).equalToWhenPresent(record::getForcePartitionOid)
                .set(hintsSize).equalToWhenPresent(record::getHintsSize)
                .set(isCommitOnSuccess).equalToWhenPresent(record::getIsCommitOnSuccess)
                .set(isForceAllPartitions).equalToWhenPresent(record::getIsForceAllPartitions)
                .set(isIgnore).equalToWhenPresent(record::getIsIgnore)
                .set(isLowPriority).equalToWhenPresent(record::getIsLowPriority)
                .set(isQueryOnPk).equalToWhenPresent(record::getIsQueryOnPk)
                .set(isRollBackOnFail).equalToWhenPresent(record::getIsRollBackOnFail)
                .set(limitOid).equalToWhenPresent(record::getLimitOid)
                .set(targetAffectRowOid).equalToWhenPresent(record::getTargetAffectRowOid);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_update_statement")
    default int updateByPrimaryKey(MySqlUpdateStatement record) {
        return update(c ->
            c.set(forcePartitionOid).equalTo(record::getForcePartitionOid)
            .set(hintsSize).equalTo(record::getHintsSize)
            .set(isCommitOnSuccess).equalTo(record::getIsCommitOnSuccess)
            .set(isForceAllPartitions).equalTo(record::getIsForceAllPartitions)
            .set(isIgnore).equalTo(record::getIsIgnore)
            .set(isLowPriority).equalTo(record::getIsLowPriority)
            .set(isQueryOnPk).equalTo(record::getIsQueryOnPk)
            .set(isRollBackOnFail).equalTo(record::getIsRollBackOnFail)
            .set(limitOid).equalTo(record::getLimitOid)
            .set(targetAffectRowOid).equalTo(record::getTargetAffectRowOid)
            .where(oid, isEqualTo(record::getOid))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_update_statement")
    default int updateByPrimaryKeySelective(MySqlUpdateStatement record) {
        return update(c ->
            c.set(forcePartitionOid).equalToWhenPresent(record::getForcePartitionOid)
            .set(hintsSize).equalToWhenPresent(record::getHintsSize)
            .set(isCommitOnSuccess).equalToWhenPresent(record::getIsCommitOnSuccess)
            .set(isForceAllPartitions).equalToWhenPresent(record::getIsForceAllPartitions)
            .set(isIgnore).equalToWhenPresent(record::getIsIgnore)
            .set(isLowPriority).equalToWhenPresent(record::getIsLowPriority)
            .set(isQueryOnPk).equalToWhenPresent(record::getIsQueryOnPk)
            .set(isRollBackOnFail).equalToWhenPresent(record::getIsRollBackOnFail)
            .set(limitOid).equalToWhenPresent(record::getLimitOid)
            .set(targetAffectRowOid).equalToWhenPresent(record::getTargetAffectRowOid)
            .where(oid, isEqualTo(record::getOid))
        );
    }
}