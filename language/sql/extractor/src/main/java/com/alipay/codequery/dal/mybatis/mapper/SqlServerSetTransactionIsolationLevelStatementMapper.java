package com.alipay.codequery.dal.mybatis.mapper;

import static com.alipay.codequery.dal.mybatis.mapper.SqlServerSetTransactionIsolationLevelStatementDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.alipay.codequery.dal.mybatis.domain.SqlServerSetTransactionIsolationLevelStatement;
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
public interface SqlServerSetTransactionIsolationLevelStatementMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_server_set_transaction_isolation_level_statement")
    BasicColumn[] selectList = BasicColumn.columnList(oid, level);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_server_set_transaction_isolation_level_statement")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_server_set_transaction_isolation_level_statement")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_server_set_transaction_isolation_level_statement")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<SqlServerSetTransactionIsolationLevelStatement> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_server_set_transaction_isolation_level_statement")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<SqlServerSetTransactionIsolationLevelStatement> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_server_set_transaction_isolation_level_statement")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="level", javaType=String.class, jdbcType=JdbcType.VARCHAR)
    })
    Optional<SqlServerSetTransactionIsolationLevelStatement> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_server_set_transaction_isolation_level_statement")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="level", javaType=String.class, jdbcType=JdbcType.VARCHAR)
    })
    List<SqlServerSetTransactionIsolationLevelStatement> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_server_set_transaction_isolation_level_statement")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_server_set_transaction_isolation_level_statement")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, sqlServerSetTransactionIsolationLevelStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_server_set_transaction_isolation_level_statement")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, sqlServerSetTransactionIsolationLevelStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_server_set_transaction_isolation_level_statement")
    default int deleteByPrimaryKey(Long oid_) {
        return delete(c -> 
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_server_set_transaction_isolation_level_statement")
    default int insert(SqlServerSetTransactionIsolationLevelStatement record) {
        return MyBatis3Utils.insert(this::insert, record, sqlServerSetTransactionIsolationLevelStatement, c ->
            c.map(oid).toProperty("oid")
            .map(level).toProperty("level")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_server_set_transaction_isolation_level_statement")
    default int insertMultiple(Collection<SqlServerSetTransactionIsolationLevelStatement> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, sqlServerSetTransactionIsolationLevelStatement, c ->
            c.map(oid).toProperty("oid")
            .map(level).toProperty("level")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_server_set_transaction_isolation_level_statement")
    default int insertSelective(SqlServerSetTransactionIsolationLevelStatement record) {
        return MyBatis3Utils.insert(this::insert, record, sqlServerSetTransactionIsolationLevelStatement, c ->
            c.map(oid).toPropertyWhenPresent("oid", record::getOid)
            .map(level).toPropertyWhenPresent("level", record::getLevel)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_server_set_transaction_isolation_level_statement")
    default Optional<SqlServerSetTransactionIsolationLevelStatement> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, sqlServerSetTransactionIsolationLevelStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_server_set_transaction_isolation_level_statement")
    default List<SqlServerSetTransactionIsolationLevelStatement> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, sqlServerSetTransactionIsolationLevelStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_server_set_transaction_isolation_level_statement")
    default List<SqlServerSetTransactionIsolationLevelStatement> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, sqlServerSetTransactionIsolationLevelStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_server_set_transaction_isolation_level_statement")
    default Optional<SqlServerSetTransactionIsolationLevelStatement> selectByPrimaryKey(Long oid_) {
        return selectOne(c ->
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_server_set_transaction_isolation_level_statement")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, sqlServerSetTransactionIsolationLevelStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_server_set_transaction_isolation_level_statement")
    static UpdateDSL<UpdateModel> updateAllColumns(SqlServerSetTransactionIsolationLevelStatement record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalTo(record::getOid)
                .set(level).equalTo(record::getLevel);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_server_set_transaction_isolation_level_statement")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(SqlServerSetTransactionIsolationLevelStatement record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalToWhenPresent(record::getOid)
                .set(level).equalToWhenPresent(record::getLevel);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_server_set_transaction_isolation_level_statement")
    default int updateByPrimaryKey(SqlServerSetTransactionIsolationLevelStatement record) {
        return update(c ->
            c.set(level).equalTo(record::getLevel)
            .where(oid, isEqualTo(record::getOid))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_server_set_transaction_isolation_level_statement")
    default int updateByPrimaryKeySelective(SqlServerSetTransactionIsolationLevelStatement record) {
        return update(c ->
            c.set(level).equalToWhenPresent(record::getLevel)
            .where(oid, isEqualTo(record::getOid))
        );
    }
}