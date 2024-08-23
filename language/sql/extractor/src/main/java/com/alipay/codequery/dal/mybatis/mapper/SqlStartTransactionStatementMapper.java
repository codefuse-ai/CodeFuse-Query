package com.alipay.codequery.dal.mybatis.mapper;

import static com.alipay.codequery.dal.mybatis.mapper.SqlStartTransactionStatementDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.alipay.codequery.dal.mybatis.domain.SqlStartTransactionStatement;
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
public interface SqlStartTransactionStatementMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_start_transaction_statement")
    BasicColumn[] selectList = BasicColumn.columnList(oid, isBegin, isConsistentSnapshot, isReadOnly, isWork, isolationLevel, nameOid);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_start_transaction_statement")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_start_transaction_statement")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_start_transaction_statement")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<SqlStartTransactionStatement> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_start_transaction_statement")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<SqlStartTransactionStatement> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_start_transaction_statement")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="is_begin", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_consistent_snapshot", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_read_only", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_work", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="isolation_level", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="name_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT)
    })
    Optional<SqlStartTransactionStatement> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_start_transaction_statement")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="is_begin", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_consistent_snapshot", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_read_only", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_work", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="isolation_level", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="name_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT)
    })
    List<SqlStartTransactionStatement> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_start_transaction_statement")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_start_transaction_statement")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, sqlStartTransactionStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_start_transaction_statement")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, sqlStartTransactionStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_start_transaction_statement")
    default int deleteByPrimaryKey(Long oid_) {
        return delete(c -> 
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_start_transaction_statement")
    default int insert(SqlStartTransactionStatement record) {
        return MyBatis3Utils.insert(this::insert, record, sqlStartTransactionStatement, c ->
            c.map(oid).toProperty("oid")
            .map(isBegin).toProperty("isBegin")
            .map(isConsistentSnapshot).toProperty("isConsistentSnapshot")
            .map(isReadOnly).toProperty("isReadOnly")
            .map(isWork).toProperty("isWork")
            .map(isolationLevel).toProperty("isolationLevel")
            .map(nameOid).toProperty("nameOid")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_start_transaction_statement")
    default int insertMultiple(Collection<SqlStartTransactionStatement> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, sqlStartTransactionStatement, c ->
            c.map(oid).toProperty("oid")
            .map(isBegin).toProperty("isBegin")
            .map(isConsistentSnapshot).toProperty("isConsistentSnapshot")
            .map(isReadOnly).toProperty("isReadOnly")
            .map(isWork).toProperty("isWork")
            .map(isolationLevel).toProperty("isolationLevel")
            .map(nameOid).toProperty("nameOid")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_start_transaction_statement")
    default int insertSelective(SqlStartTransactionStatement record) {
        return MyBatis3Utils.insert(this::insert, record, sqlStartTransactionStatement, c ->
            c.map(oid).toPropertyWhenPresent("oid", record::getOid)
            .map(isBegin).toPropertyWhenPresent("isBegin", record::getIsBegin)
            .map(isConsistentSnapshot).toPropertyWhenPresent("isConsistentSnapshot", record::getIsConsistentSnapshot)
            .map(isReadOnly).toPropertyWhenPresent("isReadOnly", record::getIsReadOnly)
            .map(isWork).toPropertyWhenPresent("isWork", record::getIsWork)
            .map(isolationLevel).toPropertyWhenPresent("isolationLevel", record::getIsolationLevel)
            .map(nameOid).toPropertyWhenPresent("nameOid", record::getNameOid)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_start_transaction_statement")
    default Optional<SqlStartTransactionStatement> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, sqlStartTransactionStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_start_transaction_statement")
    default List<SqlStartTransactionStatement> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, sqlStartTransactionStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_start_transaction_statement")
    default List<SqlStartTransactionStatement> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, sqlStartTransactionStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_start_transaction_statement")
    default Optional<SqlStartTransactionStatement> selectByPrimaryKey(Long oid_) {
        return selectOne(c ->
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_start_transaction_statement")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, sqlStartTransactionStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_start_transaction_statement")
    static UpdateDSL<UpdateModel> updateAllColumns(SqlStartTransactionStatement record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalTo(record::getOid)
                .set(isBegin).equalTo(record::getIsBegin)
                .set(isConsistentSnapshot).equalTo(record::getIsConsistentSnapshot)
                .set(isReadOnly).equalTo(record::getIsReadOnly)
                .set(isWork).equalTo(record::getIsWork)
                .set(isolationLevel).equalTo(record::getIsolationLevel)
                .set(nameOid).equalTo(record::getNameOid);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_start_transaction_statement")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(SqlStartTransactionStatement record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalToWhenPresent(record::getOid)
                .set(isBegin).equalToWhenPresent(record::getIsBegin)
                .set(isConsistentSnapshot).equalToWhenPresent(record::getIsConsistentSnapshot)
                .set(isReadOnly).equalToWhenPresent(record::getIsReadOnly)
                .set(isWork).equalToWhenPresent(record::getIsWork)
                .set(isolationLevel).equalToWhenPresent(record::getIsolationLevel)
                .set(nameOid).equalToWhenPresent(record::getNameOid);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_start_transaction_statement")
    default int updateByPrimaryKey(SqlStartTransactionStatement record) {
        return update(c ->
            c.set(isBegin).equalTo(record::getIsBegin)
            .set(isConsistentSnapshot).equalTo(record::getIsConsistentSnapshot)
            .set(isReadOnly).equalTo(record::getIsReadOnly)
            .set(isWork).equalTo(record::getIsWork)
            .set(isolationLevel).equalTo(record::getIsolationLevel)
            .set(nameOid).equalTo(record::getNameOid)
            .where(oid, isEqualTo(record::getOid))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_start_transaction_statement")
    default int updateByPrimaryKeySelective(SqlStartTransactionStatement record) {
        return update(c ->
            c.set(isBegin).equalToWhenPresent(record::getIsBegin)
            .set(isConsistentSnapshot).equalToWhenPresent(record::getIsConsistentSnapshot)
            .set(isReadOnly).equalToWhenPresent(record::getIsReadOnly)
            .set(isWork).equalToWhenPresent(record::getIsWork)
            .set(isolationLevel).equalToWhenPresent(record::getIsolationLevel)
            .set(nameOid).equalToWhenPresent(record::getNameOid)
            .where(oid, isEqualTo(record::getOid))
        );
    }
}