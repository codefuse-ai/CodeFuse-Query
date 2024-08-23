package com.alipay.codequery.dal.mybatis.mapper;

import static com.alipay.codequery.dal.mybatis.mapper.MySqlExecuteForAdsStatementDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.alipay.codequery.dal.mybatis.domain.MySqlExecuteForAdsStatement;
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
public interface MySqlExecuteForAdsStatementMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_execute_for_ads_statement")
    BasicColumn[] selectList = BasicColumn.columnList(oid, actionOid, roleOid, statusOid, targetIdOid);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_execute_for_ads_statement")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_execute_for_ads_statement")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_execute_for_ads_statement")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<MySqlExecuteForAdsStatement> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_execute_for_ads_statement")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<MySqlExecuteForAdsStatement> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_execute_for_ads_statement")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="action_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="role_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="status_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="target_id_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT)
    })
    Optional<MySqlExecuteForAdsStatement> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_execute_for_ads_statement")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="action_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="role_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="status_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="target_id_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT)
    })
    List<MySqlExecuteForAdsStatement> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_execute_for_ads_statement")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_execute_for_ads_statement")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, mySqlExecuteForAdsStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_execute_for_ads_statement")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, mySqlExecuteForAdsStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_execute_for_ads_statement")
    default int deleteByPrimaryKey(Long oid_) {
        return delete(c -> 
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_execute_for_ads_statement")
    default int insert(MySqlExecuteForAdsStatement record) {
        return MyBatis3Utils.insert(this::insert, record, mySqlExecuteForAdsStatement, c ->
            c.map(oid).toProperty("oid")
            .map(actionOid).toProperty("actionOid")
            .map(roleOid).toProperty("roleOid")
            .map(statusOid).toProperty("statusOid")
            .map(targetIdOid).toProperty("targetIdOid")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_execute_for_ads_statement")
    default int insertMultiple(Collection<MySqlExecuteForAdsStatement> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, mySqlExecuteForAdsStatement, c ->
            c.map(oid).toProperty("oid")
            .map(actionOid).toProperty("actionOid")
            .map(roleOid).toProperty("roleOid")
            .map(statusOid).toProperty("statusOid")
            .map(targetIdOid).toProperty("targetIdOid")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_execute_for_ads_statement")
    default int insertSelective(MySqlExecuteForAdsStatement record) {
        return MyBatis3Utils.insert(this::insert, record, mySqlExecuteForAdsStatement, c ->
            c.map(oid).toPropertyWhenPresent("oid", record::getOid)
            .map(actionOid).toPropertyWhenPresent("actionOid", record::getActionOid)
            .map(roleOid).toPropertyWhenPresent("roleOid", record::getRoleOid)
            .map(statusOid).toPropertyWhenPresent("statusOid", record::getStatusOid)
            .map(targetIdOid).toPropertyWhenPresent("targetIdOid", record::getTargetIdOid)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_execute_for_ads_statement")
    default Optional<MySqlExecuteForAdsStatement> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, mySqlExecuteForAdsStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_execute_for_ads_statement")
    default List<MySqlExecuteForAdsStatement> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, mySqlExecuteForAdsStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_execute_for_ads_statement")
    default List<MySqlExecuteForAdsStatement> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, mySqlExecuteForAdsStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_execute_for_ads_statement")
    default Optional<MySqlExecuteForAdsStatement> selectByPrimaryKey(Long oid_) {
        return selectOne(c ->
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_execute_for_ads_statement")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, mySqlExecuteForAdsStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_execute_for_ads_statement")
    static UpdateDSL<UpdateModel> updateAllColumns(MySqlExecuteForAdsStatement record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalTo(record::getOid)
                .set(actionOid).equalTo(record::getActionOid)
                .set(roleOid).equalTo(record::getRoleOid)
                .set(statusOid).equalTo(record::getStatusOid)
                .set(targetIdOid).equalTo(record::getTargetIdOid);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_execute_for_ads_statement")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(MySqlExecuteForAdsStatement record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalToWhenPresent(record::getOid)
                .set(actionOid).equalToWhenPresent(record::getActionOid)
                .set(roleOid).equalToWhenPresent(record::getRoleOid)
                .set(statusOid).equalToWhenPresent(record::getStatusOid)
                .set(targetIdOid).equalToWhenPresent(record::getTargetIdOid);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_execute_for_ads_statement")
    default int updateByPrimaryKey(MySqlExecuteForAdsStatement record) {
        return update(c ->
            c.set(actionOid).equalTo(record::getActionOid)
            .set(roleOid).equalTo(record::getRoleOid)
            .set(statusOid).equalTo(record::getStatusOid)
            .set(targetIdOid).equalTo(record::getTargetIdOid)
            .where(oid, isEqualTo(record::getOid))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_execute_for_ads_statement")
    default int updateByPrimaryKeySelective(MySqlExecuteForAdsStatement record) {
        return update(c ->
            c.set(actionOid).equalToWhenPresent(record::getActionOid)
            .set(roleOid).equalToWhenPresent(record::getRoleOid)
            .set(statusOid).equalToWhenPresent(record::getStatusOid)
            .set(targetIdOid).equalToWhenPresent(record::getTargetIdOid)
            .where(oid, isEqualTo(record::getOid))
        );
    }
}