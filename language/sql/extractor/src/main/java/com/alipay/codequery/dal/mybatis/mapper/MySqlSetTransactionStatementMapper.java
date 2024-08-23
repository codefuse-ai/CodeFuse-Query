package com.alipay.codequery.dal.mybatis.mapper;

import static com.alipay.codequery.dal.mybatis.mapper.MySqlSetTransactionStatementDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.alipay.codequery.dal.mybatis.domain.MySqlSetTransactionStatement;
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
public interface MySqlSetTransactionStatementMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_set_transaction_statement")
    BasicColumn[] selectList = BasicColumn.columnList(oid, accessModel, global, isLocal, isolationLevel, policyOid, session);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_set_transaction_statement")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_set_transaction_statement")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_set_transaction_statement")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<MySqlSetTransactionStatement> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_set_transaction_statement")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<MySqlSetTransactionStatement> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_set_transaction_statement")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="access_model", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="global", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_local", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="isolation_level", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="policy_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="session", javaType=Integer.class, jdbcType=JdbcType.BIGINT)
    })
    Optional<MySqlSetTransactionStatement> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_set_transaction_statement")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="access_model", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="global", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_local", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="isolation_level", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="policy_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="session", javaType=Integer.class, jdbcType=JdbcType.BIGINT)
    })
    List<MySqlSetTransactionStatement> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_set_transaction_statement")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_set_transaction_statement")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, mySqlSetTransactionStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_set_transaction_statement")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, mySqlSetTransactionStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_set_transaction_statement")
    default int deleteByPrimaryKey(Long oid_) {
        return delete(c -> 
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_set_transaction_statement")
    default int insert(MySqlSetTransactionStatement record) {
        return MyBatis3Utils.insert(this::insert, record, mySqlSetTransactionStatement, c ->
            c.map(oid).toProperty("oid")
            .map(accessModel).toProperty("accessModel")
            .map(global).toProperty("global")
            .map(isLocal).toProperty("isLocal")
            .map(isolationLevel).toProperty("isolationLevel")
            .map(policyOid).toProperty("policyOid")
            .map(session).toProperty("session")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_set_transaction_statement")
    default int insertMultiple(Collection<MySqlSetTransactionStatement> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, mySqlSetTransactionStatement, c ->
            c.map(oid).toProperty("oid")
            .map(accessModel).toProperty("accessModel")
            .map(global).toProperty("global")
            .map(isLocal).toProperty("isLocal")
            .map(isolationLevel).toProperty("isolationLevel")
            .map(policyOid).toProperty("policyOid")
            .map(session).toProperty("session")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_set_transaction_statement")
    default int insertSelective(MySqlSetTransactionStatement record) {
        return MyBatis3Utils.insert(this::insert, record, mySqlSetTransactionStatement, c ->
            c.map(oid).toPropertyWhenPresent("oid", record::getOid)
            .map(accessModel).toPropertyWhenPresent("accessModel", record::getAccessModel)
            .map(global).toPropertyWhenPresent("global", record::getGlobal)
            .map(isLocal).toPropertyWhenPresent("isLocal", record::getIsLocal)
            .map(isolationLevel).toPropertyWhenPresent("isolationLevel", record::getIsolationLevel)
            .map(policyOid).toPropertyWhenPresent("policyOid", record::getPolicyOid)
            .map(session).toPropertyWhenPresent("session", record::getSession)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_set_transaction_statement")
    default Optional<MySqlSetTransactionStatement> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, mySqlSetTransactionStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_set_transaction_statement")
    default List<MySqlSetTransactionStatement> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, mySqlSetTransactionStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_set_transaction_statement")
    default List<MySqlSetTransactionStatement> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, mySqlSetTransactionStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_set_transaction_statement")
    default Optional<MySqlSetTransactionStatement> selectByPrimaryKey(Long oid_) {
        return selectOne(c ->
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_set_transaction_statement")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, mySqlSetTransactionStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_set_transaction_statement")
    static UpdateDSL<UpdateModel> updateAllColumns(MySqlSetTransactionStatement record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalTo(record::getOid)
                .set(accessModel).equalTo(record::getAccessModel)
                .set(global).equalTo(record::getGlobal)
                .set(isLocal).equalTo(record::getIsLocal)
                .set(isolationLevel).equalTo(record::getIsolationLevel)
                .set(policyOid).equalTo(record::getPolicyOid)
                .set(session).equalTo(record::getSession);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_set_transaction_statement")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(MySqlSetTransactionStatement record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalToWhenPresent(record::getOid)
                .set(accessModel).equalToWhenPresent(record::getAccessModel)
                .set(global).equalToWhenPresent(record::getGlobal)
                .set(isLocal).equalToWhenPresent(record::getIsLocal)
                .set(isolationLevel).equalToWhenPresent(record::getIsolationLevel)
                .set(policyOid).equalToWhenPresent(record::getPolicyOid)
                .set(session).equalToWhenPresent(record::getSession);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_set_transaction_statement")
    default int updateByPrimaryKey(MySqlSetTransactionStatement record) {
        return update(c ->
            c.set(accessModel).equalTo(record::getAccessModel)
            .set(global).equalTo(record::getGlobal)
            .set(isLocal).equalTo(record::getIsLocal)
            .set(isolationLevel).equalTo(record::getIsolationLevel)
            .set(policyOid).equalTo(record::getPolicyOid)
            .set(session).equalTo(record::getSession)
            .where(oid, isEqualTo(record::getOid))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_set_transaction_statement")
    default int updateByPrimaryKeySelective(MySqlSetTransactionStatement record) {
        return update(c ->
            c.set(accessModel).equalToWhenPresent(record::getAccessModel)
            .set(global).equalToWhenPresent(record::getGlobal)
            .set(isLocal).equalToWhenPresent(record::getIsLocal)
            .set(isolationLevel).equalToWhenPresent(record::getIsolationLevel)
            .set(policyOid).equalToWhenPresent(record::getPolicyOid)
            .set(session).equalToWhenPresent(record::getSession)
            .where(oid, isEqualTo(record::getOid))
        );
    }
}