package com.alipay.codequery.dal.mybatis.mapper;

import static com.alipay.codequery.dal.mybatis.mapper.SqlCommitStatementDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.alipay.codequery.dal.mybatis.domain.SqlCommitStatement;
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
public interface SqlCommitStatementMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_commit_statement")
    BasicColumn[] selectList = BasicColumn.columnList(oid, chain, delayedDurabilityOid, immediate, isWork, isWrite, release, transactionNameOid, wait);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_commit_statement")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_commit_statement")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_commit_statement")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<SqlCommitStatement> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_commit_statement")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<SqlCommitStatement> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_commit_statement")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="chain", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="delayed_durability_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="immediate", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_work", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_write", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="release", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="transaction_name_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="wait", javaType=Integer.class, jdbcType=JdbcType.BIGINT)
    })
    Optional<SqlCommitStatement> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_commit_statement")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="chain", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="delayed_durability_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="immediate", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_work", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_write", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="release", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="transaction_name_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="wait", javaType=Integer.class, jdbcType=JdbcType.BIGINT)
    })
    List<SqlCommitStatement> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_commit_statement")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_commit_statement")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, sqlCommitStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_commit_statement")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, sqlCommitStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_commit_statement")
    default int deleteByPrimaryKey(Long oid_) {
        return delete(c -> 
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_commit_statement")
    default int insert(SqlCommitStatement record) {
        return MyBatis3Utils.insert(this::insert, record, sqlCommitStatement, c ->
            c.map(oid).toProperty("oid")
            .map(chain).toProperty("chain")
            .map(delayedDurabilityOid).toProperty("delayedDurabilityOid")
            .map(immediate).toProperty("immediate")
            .map(isWork).toProperty("isWork")
            .map(isWrite).toProperty("isWrite")
            .map(release).toProperty("release")
            .map(transactionNameOid).toProperty("transactionNameOid")
            .map(wait).toProperty("wait")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_commit_statement")
    default int insertMultiple(Collection<SqlCommitStatement> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, sqlCommitStatement, c ->
            c.map(oid).toProperty("oid")
            .map(chain).toProperty("chain")
            .map(delayedDurabilityOid).toProperty("delayedDurabilityOid")
            .map(immediate).toProperty("immediate")
            .map(isWork).toProperty("isWork")
            .map(isWrite).toProperty("isWrite")
            .map(release).toProperty("release")
            .map(transactionNameOid).toProperty("transactionNameOid")
            .map(wait).toProperty("wait")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_commit_statement")
    default int insertSelective(SqlCommitStatement record) {
        return MyBatis3Utils.insert(this::insert, record, sqlCommitStatement, c ->
            c.map(oid).toPropertyWhenPresent("oid", record::getOid)
            .map(chain).toPropertyWhenPresent("chain", record::getChain)
            .map(delayedDurabilityOid).toPropertyWhenPresent("delayedDurabilityOid", record::getDelayedDurabilityOid)
            .map(immediate).toPropertyWhenPresent("immediate", record::getImmediate)
            .map(isWork).toPropertyWhenPresent("isWork", record::getIsWork)
            .map(isWrite).toPropertyWhenPresent("isWrite", record::getIsWrite)
            .map(release).toPropertyWhenPresent("release", record::getRelease)
            .map(transactionNameOid).toPropertyWhenPresent("transactionNameOid", record::getTransactionNameOid)
            .map(wait).toPropertyWhenPresent("wait", record::getWait)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_commit_statement")
    default Optional<SqlCommitStatement> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, sqlCommitStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_commit_statement")
    default List<SqlCommitStatement> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, sqlCommitStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_commit_statement")
    default List<SqlCommitStatement> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, sqlCommitStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_commit_statement")
    default Optional<SqlCommitStatement> selectByPrimaryKey(Long oid_) {
        return selectOne(c ->
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_commit_statement")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, sqlCommitStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_commit_statement")
    static UpdateDSL<UpdateModel> updateAllColumns(SqlCommitStatement record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalTo(record::getOid)
                .set(chain).equalTo(record::getChain)
                .set(delayedDurabilityOid).equalTo(record::getDelayedDurabilityOid)
                .set(immediate).equalTo(record::getImmediate)
                .set(isWork).equalTo(record::getIsWork)
                .set(isWrite).equalTo(record::getIsWrite)
                .set(release).equalTo(record::getRelease)
                .set(transactionNameOid).equalTo(record::getTransactionNameOid)
                .set(wait).equalTo(record::getWait);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_commit_statement")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(SqlCommitStatement record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalToWhenPresent(record::getOid)
                .set(chain).equalToWhenPresent(record::getChain)
                .set(delayedDurabilityOid).equalToWhenPresent(record::getDelayedDurabilityOid)
                .set(immediate).equalToWhenPresent(record::getImmediate)
                .set(isWork).equalToWhenPresent(record::getIsWork)
                .set(isWrite).equalToWhenPresent(record::getIsWrite)
                .set(release).equalToWhenPresent(record::getRelease)
                .set(transactionNameOid).equalToWhenPresent(record::getTransactionNameOid)
                .set(wait).equalToWhenPresent(record::getWait);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_commit_statement")
    default int updateByPrimaryKey(SqlCommitStatement record) {
        return update(c ->
            c.set(chain).equalTo(record::getChain)
            .set(delayedDurabilityOid).equalTo(record::getDelayedDurabilityOid)
            .set(immediate).equalTo(record::getImmediate)
            .set(isWork).equalTo(record::getIsWork)
            .set(isWrite).equalTo(record::getIsWrite)
            .set(release).equalTo(record::getRelease)
            .set(transactionNameOid).equalTo(record::getTransactionNameOid)
            .set(wait).equalTo(record::getWait)
            .where(oid, isEqualTo(record::getOid))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_commit_statement")
    default int updateByPrimaryKeySelective(SqlCommitStatement record) {
        return update(c ->
            c.set(chain).equalToWhenPresent(record::getChain)
            .set(delayedDurabilityOid).equalToWhenPresent(record::getDelayedDurabilityOid)
            .set(immediate).equalToWhenPresent(record::getImmediate)
            .set(isWork).equalToWhenPresent(record::getIsWork)
            .set(isWrite).equalToWhenPresent(record::getIsWrite)
            .set(release).equalToWhenPresent(record::getRelease)
            .set(transactionNameOid).equalToWhenPresent(record::getTransactionNameOid)
            .set(wait).equalToWhenPresent(record::getWait)
            .where(oid, isEqualTo(record::getOid))
        );
    }
}