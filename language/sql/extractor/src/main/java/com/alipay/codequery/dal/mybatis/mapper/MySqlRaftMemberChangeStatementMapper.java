package com.alipay.codequery.dal.mybatis.mapper;

import static com.alipay.codequery.dal.mybatis.mapper.MySqlRaftMemberChangeStatementDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.alipay.codequery.dal.mybatis.domain.MySqlRaftMemberChangeStatement;
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
public interface MySqlRaftMemberChangeStatementMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_raft_member_change_statement")
    BasicColumn[] selectList = BasicColumn.columnList(oid, hostOid, isForce, isNoLeader, shardOid, statusOid);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_raft_member_change_statement")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_raft_member_change_statement")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_raft_member_change_statement")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<MySqlRaftMemberChangeStatement> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_raft_member_change_statement")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<MySqlRaftMemberChangeStatement> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_raft_member_change_statement")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="host_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_force", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_no_leader", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="shard_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="status_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT)
    })
    Optional<MySqlRaftMemberChangeStatement> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_raft_member_change_statement")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="host_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_force", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_no_leader", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="shard_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="status_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT)
    })
    List<MySqlRaftMemberChangeStatement> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_raft_member_change_statement")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_raft_member_change_statement")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, mySqlRaftMemberChangeStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_raft_member_change_statement")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, mySqlRaftMemberChangeStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_raft_member_change_statement")
    default int deleteByPrimaryKey(Long oid_) {
        return delete(c -> 
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_raft_member_change_statement")
    default int insert(MySqlRaftMemberChangeStatement record) {
        return MyBatis3Utils.insert(this::insert, record, mySqlRaftMemberChangeStatement, c ->
            c.map(oid).toProperty("oid")
            .map(hostOid).toProperty("hostOid")
            .map(isForce).toProperty("isForce")
            .map(isNoLeader).toProperty("isNoLeader")
            .map(shardOid).toProperty("shardOid")
            .map(statusOid).toProperty("statusOid")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_raft_member_change_statement")
    default int insertMultiple(Collection<MySqlRaftMemberChangeStatement> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, mySqlRaftMemberChangeStatement, c ->
            c.map(oid).toProperty("oid")
            .map(hostOid).toProperty("hostOid")
            .map(isForce).toProperty("isForce")
            .map(isNoLeader).toProperty("isNoLeader")
            .map(shardOid).toProperty("shardOid")
            .map(statusOid).toProperty("statusOid")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_raft_member_change_statement")
    default int insertSelective(MySqlRaftMemberChangeStatement record) {
        return MyBatis3Utils.insert(this::insert, record, mySqlRaftMemberChangeStatement, c ->
            c.map(oid).toPropertyWhenPresent("oid", record::getOid)
            .map(hostOid).toPropertyWhenPresent("hostOid", record::getHostOid)
            .map(isForce).toPropertyWhenPresent("isForce", record::getIsForce)
            .map(isNoLeader).toPropertyWhenPresent("isNoLeader", record::getIsNoLeader)
            .map(shardOid).toPropertyWhenPresent("shardOid", record::getShardOid)
            .map(statusOid).toPropertyWhenPresent("statusOid", record::getStatusOid)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_raft_member_change_statement")
    default Optional<MySqlRaftMemberChangeStatement> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, mySqlRaftMemberChangeStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_raft_member_change_statement")
    default List<MySqlRaftMemberChangeStatement> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, mySqlRaftMemberChangeStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_raft_member_change_statement")
    default List<MySqlRaftMemberChangeStatement> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, mySqlRaftMemberChangeStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_raft_member_change_statement")
    default Optional<MySqlRaftMemberChangeStatement> selectByPrimaryKey(Long oid_) {
        return selectOne(c ->
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_raft_member_change_statement")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, mySqlRaftMemberChangeStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_raft_member_change_statement")
    static UpdateDSL<UpdateModel> updateAllColumns(MySqlRaftMemberChangeStatement record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalTo(record::getOid)
                .set(hostOid).equalTo(record::getHostOid)
                .set(isForce).equalTo(record::getIsForce)
                .set(isNoLeader).equalTo(record::getIsNoLeader)
                .set(shardOid).equalTo(record::getShardOid)
                .set(statusOid).equalTo(record::getStatusOid);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_raft_member_change_statement")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(MySqlRaftMemberChangeStatement record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalToWhenPresent(record::getOid)
                .set(hostOid).equalToWhenPresent(record::getHostOid)
                .set(isForce).equalToWhenPresent(record::getIsForce)
                .set(isNoLeader).equalToWhenPresent(record::getIsNoLeader)
                .set(shardOid).equalToWhenPresent(record::getShardOid)
                .set(statusOid).equalToWhenPresent(record::getStatusOid);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_raft_member_change_statement")
    default int updateByPrimaryKey(MySqlRaftMemberChangeStatement record) {
        return update(c ->
            c.set(hostOid).equalTo(record::getHostOid)
            .set(isForce).equalTo(record::getIsForce)
            .set(isNoLeader).equalTo(record::getIsNoLeader)
            .set(shardOid).equalTo(record::getShardOid)
            .set(statusOid).equalTo(record::getStatusOid)
            .where(oid, isEqualTo(record::getOid))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_raft_member_change_statement")
    default int updateByPrimaryKeySelective(MySqlRaftMemberChangeStatement record) {
        return update(c ->
            c.set(hostOid).equalToWhenPresent(record::getHostOid)
            .set(isForce).equalToWhenPresent(record::getIsForce)
            .set(isNoLeader).equalToWhenPresent(record::getIsNoLeader)
            .set(shardOid).equalToWhenPresent(record::getShardOid)
            .set(statusOid).equalToWhenPresent(record::getStatusOid)
            .where(oid, isEqualTo(record::getOid))
        );
    }
}