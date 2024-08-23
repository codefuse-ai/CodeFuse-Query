package com.alipay.codequery.dal.mybatis.mapper;

import static com.alipay.codequery.dal.mybatis.mapper.SqlServerWaitForStatementDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.alipay.codequery.dal.mybatis.domain.SqlServerWaitForStatement;
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
public interface SqlServerWaitForStatementMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_server_wait_for_statement")
    BasicColumn[] selectList = BasicColumn.columnList(oid, delayOid, statementOid, timeOid, timeoutOid);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_server_wait_for_statement")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_server_wait_for_statement")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_server_wait_for_statement")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<SqlServerWaitForStatement> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_server_wait_for_statement")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<SqlServerWaitForStatement> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_server_wait_for_statement")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="delay_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="statement_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="time_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="timeout_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT)
    })
    Optional<SqlServerWaitForStatement> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_server_wait_for_statement")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="delay_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="statement_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="time_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="timeout_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT)
    })
    List<SqlServerWaitForStatement> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_server_wait_for_statement")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_server_wait_for_statement")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, sqlServerWaitForStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_server_wait_for_statement")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, sqlServerWaitForStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_server_wait_for_statement")
    default int deleteByPrimaryKey(Long oid_) {
        return delete(c -> 
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_server_wait_for_statement")
    default int insert(SqlServerWaitForStatement record) {
        return MyBatis3Utils.insert(this::insert, record, sqlServerWaitForStatement, c ->
            c.map(oid).toProperty("oid")
            .map(delayOid).toProperty("delayOid")
            .map(statementOid).toProperty("statementOid")
            .map(timeOid).toProperty("timeOid")
            .map(timeoutOid).toProperty("timeoutOid")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_server_wait_for_statement")
    default int insertMultiple(Collection<SqlServerWaitForStatement> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, sqlServerWaitForStatement, c ->
            c.map(oid).toProperty("oid")
            .map(delayOid).toProperty("delayOid")
            .map(statementOid).toProperty("statementOid")
            .map(timeOid).toProperty("timeOid")
            .map(timeoutOid).toProperty("timeoutOid")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_server_wait_for_statement")
    default int insertSelective(SqlServerWaitForStatement record) {
        return MyBatis3Utils.insert(this::insert, record, sqlServerWaitForStatement, c ->
            c.map(oid).toPropertyWhenPresent("oid", record::getOid)
            .map(delayOid).toPropertyWhenPresent("delayOid", record::getDelayOid)
            .map(statementOid).toPropertyWhenPresent("statementOid", record::getStatementOid)
            .map(timeOid).toPropertyWhenPresent("timeOid", record::getTimeOid)
            .map(timeoutOid).toPropertyWhenPresent("timeoutOid", record::getTimeoutOid)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_server_wait_for_statement")
    default Optional<SqlServerWaitForStatement> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, sqlServerWaitForStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_server_wait_for_statement")
    default List<SqlServerWaitForStatement> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, sqlServerWaitForStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_server_wait_for_statement")
    default List<SqlServerWaitForStatement> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, sqlServerWaitForStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_server_wait_for_statement")
    default Optional<SqlServerWaitForStatement> selectByPrimaryKey(Long oid_) {
        return selectOne(c ->
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_server_wait_for_statement")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, sqlServerWaitForStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_server_wait_for_statement")
    static UpdateDSL<UpdateModel> updateAllColumns(SqlServerWaitForStatement record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalTo(record::getOid)
                .set(delayOid).equalTo(record::getDelayOid)
                .set(statementOid).equalTo(record::getStatementOid)
                .set(timeOid).equalTo(record::getTimeOid)
                .set(timeoutOid).equalTo(record::getTimeoutOid);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_server_wait_for_statement")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(SqlServerWaitForStatement record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalToWhenPresent(record::getOid)
                .set(delayOid).equalToWhenPresent(record::getDelayOid)
                .set(statementOid).equalToWhenPresent(record::getStatementOid)
                .set(timeOid).equalToWhenPresent(record::getTimeOid)
                .set(timeoutOid).equalToWhenPresent(record::getTimeoutOid);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_server_wait_for_statement")
    default int updateByPrimaryKey(SqlServerWaitForStatement record) {
        return update(c ->
            c.set(delayOid).equalTo(record::getDelayOid)
            .set(statementOid).equalTo(record::getStatementOid)
            .set(timeOid).equalTo(record::getTimeOid)
            .set(timeoutOid).equalTo(record::getTimeoutOid)
            .where(oid, isEqualTo(record::getOid))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_server_wait_for_statement")
    default int updateByPrimaryKeySelective(SqlServerWaitForStatement record) {
        return update(c ->
            c.set(delayOid).equalToWhenPresent(record::getDelayOid)
            .set(statementOid).equalToWhenPresent(record::getStatementOid)
            .set(timeOid).equalToWhenPresent(record::getTimeOid)
            .set(timeoutOid).equalToWhenPresent(record::getTimeoutOid)
            .where(oid, isEqualTo(record::getOid))
        );
    }
}