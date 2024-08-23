package com.alipay.codequery.dal.mybatis.mapper;

import static com.alipay.codequery.dal.mybatis.mapper.OracleLockTableStatementDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.alipay.codequery.dal.mybatis.domain.OracleLockTableStatement;
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
public interface OracleLockTableStatementMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_lock_table_statement")
    BasicColumn[] selectList = BasicColumn.columnList(oid, isNoWait, lockMode, partitionOid, tableOid, waitOid);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_lock_table_statement")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_lock_table_statement")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_lock_table_statement")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<OracleLockTableStatement> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_lock_table_statement")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<OracleLockTableStatement> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_lock_table_statement")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="is_no_wait", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="lock_mode", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="partition_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="table_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="wait_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT)
    })
    Optional<OracleLockTableStatement> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_lock_table_statement")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="is_no_wait", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="lock_mode", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="partition_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="table_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="wait_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT)
    })
    List<OracleLockTableStatement> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_lock_table_statement")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_lock_table_statement")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, oracleLockTableStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_lock_table_statement")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, oracleLockTableStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_lock_table_statement")
    default int deleteByPrimaryKey(Long oid_) {
        return delete(c -> 
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_lock_table_statement")
    default int insert(OracleLockTableStatement record) {
        return MyBatis3Utils.insert(this::insert, record, oracleLockTableStatement, c ->
            c.map(oid).toProperty("oid")
            .map(isNoWait).toProperty("isNoWait")
            .map(lockMode).toProperty("lockMode")
            .map(partitionOid).toProperty("partitionOid")
            .map(tableOid).toProperty("tableOid")
            .map(waitOid).toProperty("waitOid")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_lock_table_statement")
    default int insertMultiple(Collection<OracleLockTableStatement> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, oracleLockTableStatement, c ->
            c.map(oid).toProperty("oid")
            .map(isNoWait).toProperty("isNoWait")
            .map(lockMode).toProperty("lockMode")
            .map(partitionOid).toProperty("partitionOid")
            .map(tableOid).toProperty("tableOid")
            .map(waitOid).toProperty("waitOid")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_lock_table_statement")
    default int insertSelective(OracleLockTableStatement record) {
        return MyBatis3Utils.insert(this::insert, record, oracleLockTableStatement, c ->
            c.map(oid).toPropertyWhenPresent("oid", record::getOid)
            .map(isNoWait).toPropertyWhenPresent("isNoWait", record::getIsNoWait)
            .map(lockMode).toPropertyWhenPresent("lockMode", record::getLockMode)
            .map(partitionOid).toPropertyWhenPresent("partitionOid", record::getPartitionOid)
            .map(tableOid).toPropertyWhenPresent("tableOid", record::getTableOid)
            .map(waitOid).toPropertyWhenPresent("waitOid", record::getWaitOid)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_lock_table_statement")
    default Optional<OracleLockTableStatement> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, oracleLockTableStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_lock_table_statement")
    default List<OracleLockTableStatement> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, oracleLockTableStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_lock_table_statement")
    default List<OracleLockTableStatement> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, oracleLockTableStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_lock_table_statement")
    default Optional<OracleLockTableStatement> selectByPrimaryKey(Long oid_) {
        return selectOne(c ->
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_lock_table_statement")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, oracleLockTableStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_lock_table_statement")
    static UpdateDSL<UpdateModel> updateAllColumns(OracleLockTableStatement record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalTo(record::getOid)
                .set(isNoWait).equalTo(record::getIsNoWait)
                .set(lockMode).equalTo(record::getLockMode)
                .set(partitionOid).equalTo(record::getPartitionOid)
                .set(tableOid).equalTo(record::getTableOid)
                .set(waitOid).equalTo(record::getWaitOid);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_lock_table_statement")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(OracleLockTableStatement record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalToWhenPresent(record::getOid)
                .set(isNoWait).equalToWhenPresent(record::getIsNoWait)
                .set(lockMode).equalToWhenPresent(record::getLockMode)
                .set(partitionOid).equalToWhenPresent(record::getPartitionOid)
                .set(tableOid).equalToWhenPresent(record::getTableOid)
                .set(waitOid).equalToWhenPresent(record::getWaitOid);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_lock_table_statement")
    default int updateByPrimaryKey(OracleLockTableStatement record) {
        return update(c ->
            c.set(isNoWait).equalTo(record::getIsNoWait)
            .set(lockMode).equalTo(record::getLockMode)
            .set(partitionOid).equalTo(record::getPartitionOid)
            .set(tableOid).equalTo(record::getTableOid)
            .set(waitOid).equalTo(record::getWaitOid)
            .where(oid, isEqualTo(record::getOid))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_lock_table_statement")
    default int updateByPrimaryKeySelective(OracleLockTableStatement record) {
        return update(c ->
            c.set(isNoWait).equalToWhenPresent(record::getIsNoWait)
            .set(lockMode).equalToWhenPresent(record::getLockMode)
            .set(partitionOid).equalToWhenPresent(record::getPartitionOid)
            .set(tableOid).equalToWhenPresent(record::getTableOid)
            .set(waitOid).equalToWhenPresent(record::getWaitOid)
            .where(oid, isEqualTo(record::getOid))
        );
    }
}