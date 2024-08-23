package com.alipay.codequery.dal.mybatis.mapper;

import static com.alipay.codequery.dal.mybatis.mapper.MySqlManageInstanceGroupStatementDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.alipay.codequery.dal.mybatis.domain.MySqlManageInstanceGroupStatement;
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
public interface MySqlManageInstanceGroupStatementMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_manage_instance_group_statement")
    BasicColumn[] selectList = BasicColumn.columnList(oid, groupNamesToString, operationOid, replicationOid);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_manage_instance_group_statement")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_manage_instance_group_statement")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_manage_instance_group_statement")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<MySqlManageInstanceGroupStatement> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_manage_instance_group_statement")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<MySqlManageInstanceGroupStatement> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_manage_instance_group_statement")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="group_names_to_string", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="operation_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="replication_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT)
    })
    Optional<MySqlManageInstanceGroupStatement> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_manage_instance_group_statement")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="group_names_to_string", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="operation_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="replication_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT)
    })
    List<MySqlManageInstanceGroupStatement> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_manage_instance_group_statement")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_manage_instance_group_statement")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, mySqlManageInstanceGroupStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_manage_instance_group_statement")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, mySqlManageInstanceGroupStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_manage_instance_group_statement")
    default int deleteByPrimaryKey(Long oid_) {
        return delete(c -> 
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_manage_instance_group_statement")
    default int insert(MySqlManageInstanceGroupStatement record) {
        return MyBatis3Utils.insert(this::insert, record, mySqlManageInstanceGroupStatement, c ->
            c.map(oid).toProperty("oid")
            .map(groupNamesToString).toProperty("groupNamesToString")
            .map(operationOid).toProperty("operationOid")
            .map(replicationOid).toProperty("replicationOid")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_manage_instance_group_statement")
    default int insertMultiple(Collection<MySqlManageInstanceGroupStatement> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, mySqlManageInstanceGroupStatement, c ->
            c.map(oid).toProperty("oid")
            .map(groupNamesToString).toProperty("groupNamesToString")
            .map(operationOid).toProperty("operationOid")
            .map(replicationOid).toProperty("replicationOid")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_manage_instance_group_statement")
    default int insertSelective(MySqlManageInstanceGroupStatement record) {
        return MyBatis3Utils.insert(this::insert, record, mySqlManageInstanceGroupStatement, c ->
            c.map(oid).toPropertyWhenPresent("oid", record::getOid)
            .map(groupNamesToString).toPropertyWhenPresent("groupNamesToString", record::getGroupNamesToString)
            .map(operationOid).toPropertyWhenPresent("operationOid", record::getOperationOid)
            .map(replicationOid).toPropertyWhenPresent("replicationOid", record::getReplicationOid)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_manage_instance_group_statement")
    default Optional<MySqlManageInstanceGroupStatement> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, mySqlManageInstanceGroupStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_manage_instance_group_statement")
    default List<MySqlManageInstanceGroupStatement> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, mySqlManageInstanceGroupStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_manage_instance_group_statement")
    default List<MySqlManageInstanceGroupStatement> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, mySqlManageInstanceGroupStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_manage_instance_group_statement")
    default Optional<MySqlManageInstanceGroupStatement> selectByPrimaryKey(Long oid_) {
        return selectOne(c ->
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_manage_instance_group_statement")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, mySqlManageInstanceGroupStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_manage_instance_group_statement")
    static UpdateDSL<UpdateModel> updateAllColumns(MySqlManageInstanceGroupStatement record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalTo(record::getOid)
                .set(groupNamesToString).equalTo(record::getGroupNamesToString)
                .set(operationOid).equalTo(record::getOperationOid)
                .set(replicationOid).equalTo(record::getReplicationOid);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_manage_instance_group_statement")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(MySqlManageInstanceGroupStatement record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalToWhenPresent(record::getOid)
                .set(groupNamesToString).equalToWhenPresent(record::getGroupNamesToString)
                .set(operationOid).equalToWhenPresent(record::getOperationOid)
                .set(replicationOid).equalToWhenPresent(record::getReplicationOid);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_manage_instance_group_statement")
    default int updateByPrimaryKey(MySqlManageInstanceGroupStatement record) {
        return update(c ->
            c.set(groupNamesToString).equalTo(record::getGroupNamesToString)
            .set(operationOid).equalTo(record::getOperationOid)
            .set(replicationOid).equalTo(record::getReplicationOid)
            .where(oid, isEqualTo(record::getOid))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_manage_instance_group_statement")
    default int updateByPrimaryKeySelective(MySqlManageInstanceGroupStatement record) {
        return update(c ->
            c.set(groupNamesToString).equalToWhenPresent(record::getGroupNamesToString)
            .set(operationOid).equalToWhenPresent(record::getOperationOid)
            .set(replicationOid).equalToWhenPresent(record::getReplicationOid)
            .where(oid, isEqualTo(record::getOid))
        );
    }
}