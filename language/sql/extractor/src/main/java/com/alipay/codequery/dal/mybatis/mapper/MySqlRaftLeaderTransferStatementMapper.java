package com.alipay.codequery.dal.mybatis.mapper;

import static com.alipay.codequery.dal.mybatis.mapper.MySqlRaftLeaderTransferStatementDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.alipay.codequery.dal.mybatis.domain.MySqlRaftLeaderTransferStatement;
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
public interface MySqlRaftLeaderTransferStatementMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_raft_leader_transfer_statement")
    BasicColumn[] selectList = BasicColumn.columnList(oid, fromOid, shardOid, timeoutOid, toOid);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_raft_leader_transfer_statement")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_raft_leader_transfer_statement")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_raft_leader_transfer_statement")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<MySqlRaftLeaderTransferStatement> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_raft_leader_transfer_statement")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<MySqlRaftLeaderTransferStatement> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_raft_leader_transfer_statement")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="from_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="shard_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="timeout_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="to_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT)
    })
    Optional<MySqlRaftLeaderTransferStatement> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_raft_leader_transfer_statement")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="from_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="shard_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="timeout_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="to_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT)
    })
    List<MySqlRaftLeaderTransferStatement> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_raft_leader_transfer_statement")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_raft_leader_transfer_statement")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, mySqlRaftLeaderTransferStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_raft_leader_transfer_statement")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, mySqlRaftLeaderTransferStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_raft_leader_transfer_statement")
    default int deleteByPrimaryKey(Long oid_) {
        return delete(c -> 
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_raft_leader_transfer_statement")
    default int insert(MySqlRaftLeaderTransferStatement record) {
        return MyBatis3Utils.insert(this::insert, record, mySqlRaftLeaderTransferStatement, c ->
            c.map(oid).toProperty("oid")
            .map(fromOid).toProperty("fromOid")
            .map(shardOid).toProperty("shardOid")
            .map(timeoutOid).toProperty("timeoutOid")
            .map(toOid).toProperty("toOid")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_raft_leader_transfer_statement")
    default int insertMultiple(Collection<MySqlRaftLeaderTransferStatement> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, mySqlRaftLeaderTransferStatement, c ->
            c.map(oid).toProperty("oid")
            .map(fromOid).toProperty("fromOid")
            .map(shardOid).toProperty("shardOid")
            .map(timeoutOid).toProperty("timeoutOid")
            .map(toOid).toProperty("toOid")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_raft_leader_transfer_statement")
    default int insertSelective(MySqlRaftLeaderTransferStatement record) {
        return MyBatis3Utils.insert(this::insert, record, mySqlRaftLeaderTransferStatement, c ->
            c.map(oid).toPropertyWhenPresent("oid", record::getOid)
            .map(fromOid).toPropertyWhenPresent("fromOid", record::getFromOid)
            .map(shardOid).toPropertyWhenPresent("shardOid", record::getShardOid)
            .map(timeoutOid).toPropertyWhenPresent("timeoutOid", record::getTimeoutOid)
            .map(toOid).toPropertyWhenPresent("toOid", record::getToOid)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_raft_leader_transfer_statement")
    default Optional<MySqlRaftLeaderTransferStatement> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, mySqlRaftLeaderTransferStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_raft_leader_transfer_statement")
    default List<MySqlRaftLeaderTransferStatement> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, mySqlRaftLeaderTransferStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_raft_leader_transfer_statement")
    default List<MySqlRaftLeaderTransferStatement> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, mySqlRaftLeaderTransferStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_raft_leader_transfer_statement")
    default Optional<MySqlRaftLeaderTransferStatement> selectByPrimaryKey(Long oid_) {
        return selectOne(c ->
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_raft_leader_transfer_statement")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, mySqlRaftLeaderTransferStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_raft_leader_transfer_statement")
    static UpdateDSL<UpdateModel> updateAllColumns(MySqlRaftLeaderTransferStatement record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalTo(record::getOid)
                .set(fromOid).equalTo(record::getFromOid)
                .set(shardOid).equalTo(record::getShardOid)
                .set(timeoutOid).equalTo(record::getTimeoutOid)
                .set(toOid).equalTo(record::getToOid);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_raft_leader_transfer_statement")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(MySqlRaftLeaderTransferStatement record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalToWhenPresent(record::getOid)
                .set(fromOid).equalToWhenPresent(record::getFromOid)
                .set(shardOid).equalToWhenPresent(record::getShardOid)
                .set(timeoutOid).equalToWhenPresent(record::getTimeoutOid)
                .set(toOid).equalToWhenPresent(record::getToOid);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_raft_leader_transfer_statement")
    default int updateByPrimaryKey(MySqlRaftLeaderTransferStatement record) {
        return update(c ->
            c.set(fromOid).equalTo(record::getFromOid)
            .set(shardOid).equalTo(record::getShardOid)
            .set(timeoutOid).equalTo(record::getTimeoutOid)
            .set(toOid).equalTo(record::getToOid)
            .where(oid, isEqualTo(record::getOid))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_raft_leader_transfer_statement")
    default int updateByPrimaryKeySelective(MySqlRaftLeaderTransferStatement record) {
        return update(c ->
            c.set(fromOid).equalToWhenPresent(record::getFromOid)
            .set(shardOid).equalToWhenPresent(record::getShardOid)
            .set(timeoutOid).equalToWhenPresent(record::getTimeoutOid)
            .set(toOid).equalToWhenPresent(record::getToOid)
            .where(oid, isEqualTo(record::getOid))
        );
    }
}