package com.alipay.codequery.dal.mybatis.mapper;

import static com.alipay.codequery.dal.mybatis.mapper.MySqlExplainStatementDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.alipay.codequery.dal.mybatis.domain.MySqlExplainStatement;
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
public interface MySqlExplainStatementMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_explain_statement")
    BasicColumn[] selectList = BasicColumn.columnList(oid, columnNameOid, connectionIdOid, isDescribe, isDistributeInfo, tableNameOid, wildOid);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_explain_statement")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_explain_statement")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_explain_statement")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<MySqlExplainStatement> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_explain_statement")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<MySqlExplainStatement> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_explain_statement")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="column_name_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="connection_id_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_describe", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_distribute_info", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="table_name_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="wild_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT)
    })
    Optional<MySqlExplainStatement> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_explain_statement")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="column_name_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="connection_id_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_describe", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_distribute_info", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="table_name_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="wild_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT)
    })
    List<MySqlExplainStatement> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_explain_statement")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_explain_statement")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, mySqlExplainStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_explain_statement")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, mySqlExplainStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_explain_statement")
    default int deleteByPrimaryKey(Long oid_) {
        return delete(c -> 
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_explain_statement")
    default int insert(MySqlExplainStatement record) {
        return MyBatis3Utils.insert(this::insert, record, mySqlExplainStatement, c ->
            c.map(oid).toProperty("oid")
            .map(columnNameOid).toProperty("columnNameOid")
            .map(connectionIdOid).toProperty("connectionIdOid")
            .map(isDescribe).toProperty("isDescribe")
            .map(isDistributeInfo).toProperty("isDistributeInfo")
            .map(tableNameOid).toProperty("tableNameOid")
            .map(wildOid).toProperty("wildOid")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_explain_statement")
    default int insertMultiple(Collection<MySqlExplainStatement> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, mySqlExplainStatement, c ->
            c.map(oid).toProperty("oid")
            .map(columnNameOid).toProperty("columnNameOid")
            .map(connectionIdOid).toProperty("connectionIdOid")
            .map(isDescribe).toProperty("isDescribe")
            .map(isDistributeInfo).toProperty("isDistributeInfo")
            .map(tableNameOid).toProperty("tableNameOid")
            .map(wildOid).toProperty("wildOid")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_explain_statement")
    default int insertSelective(MySqlExplainStatement record) {
        return MyBatis3Utils.insert(this::insert, record, mySqlExplainStatement, c ->
            c.map(oid).toPropertyWhenPresent("oid", record::getOid)
            .map(columnNameOid).toPropertyWhenPresent("columnNameOid", record::getColumnNameOid)
            .map(connectionIdOid).toPropertyWhenPresent("connectionIdOid", record::getConnectionIdOid)
            .map(isDescribe).toPropertyWhenPresent("isDescribe", record::getIsDescribe)
            .map(isDistributeInfo).toPropertyWhenPresent("isDistributeInfo", record::getIsDistributeInfo)
            .map(tableNameOid).toPropertyWhenPresent("tableNameOid", record::getTableNameOid)
            .map(wildOid).toPropertyWhenPresent("wildOid", record::getWildOid)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_explain_statement")
    default Optional<MySqlExplainStatement> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, mySqlExplainStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_explain_statement")
    default List<MySqlExplainStatement> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, mySqlExplainStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_explain_statement")
    default List<MySqlExplainStatement> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, mySqlExplainStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_explain_statement")
    default Optional<MySqlExplainStatement> selectByPrimaryKey(Long oid_) {
        return selectOne(c ->
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_explain_statement")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, mySqlExplainStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_explain_statement")
    static UpdateDSL<UpdateModel> updateAllColumns(MySqlExplainStatement record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalTo(record::getOid)
                .set(columnNameOid).equalTo(record::getColumnNameOid)
                .set(connectionIdOid).equalTo(record::getConnectionIdOid)
                .set(isDescribe).equalTo(record::getIsDescribe)
                .set(isDistributeInfo).equalTo(record::getIsDistributeInfo)
                .set(tableNameOid).equalTo(record::getTableNameOid)
                .set(wildOid).equalTo(record::getWildOid);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_explain_statement")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(MySqlExplainStatement record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalToWhenPresent(record::getOid)
                .set(columnNameOid).equalToWhenPresent(record::getColumnNameOid)
                .set(connectionIdOid).equalToWhenPresent(record::getConnectionIdOid)
                .set(isDescribe).equalToWhenPresent(record::getIsDescribe)
                .set(isDistributeInfo).equalToWhenPresent(record::getIsDistributeInfo)
                .set(tableNameOid).equalToWhenPresent(record::getTableNameOid)
                .set(wildOid).equalToWhenPresent(record::getWildOid);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_explain_statement")
    default int updateByPrimaryKey(MySqlExplainStatement record) {
        return update(c ->
            c.set(columnNameOid).equalTo(record::getColumnNameOid)
            .set(connectionIdOid).equalTo(record::getConnectionIdOid)
            .set(isDescribe).equalTo(record::getIsDescribe)
            .set(isDistributeInfo).equalTo(record::getIsDistributeInfo)
            .set(tableNameOid).equalTo(record::getTableNameOid)
            .set(wildOid).equalTo(record::getWildOid)
            .where(oid, isEqualTo(record::getOid))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_explain_statement")
    default int updateByPrimaryKeySelective(MySqlExplainStatement record) {
        return update(c ->
            c.set(columnNameOid).equalToWhenPresent(record::getColumnNameOid)
            .set(connectionIdOid).equalToWhenPresent(record::getConnectionIdOid)
            .set(isDescribe).equalToWhenPresent(record::getIsDescribe)
            .set(isDistributeInfo).equalToWhenPresent(record::getIsDistributeInfo)
            .set(tableNameOid).equalToWhenPresent(record::getTableNameOid)
            .set(wildOid).equalToWhenPresent(record::getWildOid)
            .where(oid, isEqualTo(record::getOid))
        );
    }
}