package com.alipay.codequery.dal.mybatis.mapper;

import static com.alipay.codequery.dal.mybatis.mapper.SqlServerExecStatementDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.alipay.codequery.dal.mybatis.domain.SqlServerExecStatement;
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
public interface SqlServerExecStatementMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_server_exec_statement")
    BasicColumn[] selectList = BasicColumn.columnList(oid, moduleNameOid, parameters, returnStatusOid);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_server_exec_statement")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_server_exec_statement")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_server_exec_statement")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<SqlServerExecStatement> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_server_exec_statement")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<SqlServerExecStatement> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_server_exec_statement")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="module_name_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="parameters", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="return_status_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT)
    })
    Optional<SqlServerExecStatement> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_server_exec_statement")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="module_name_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="parameters", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="return_status_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT)
    })
    List<SqlServerExecStatement> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_server_exec_statement")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_server_exec_statement")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, sqlServerExecStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_server_exec_statement")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, sqlServerExecStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_server_exec_statement")
    default int deleteByPrimaryKey(Long oid_) {
        return delete(c -> 
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_server_exec_statement")
    default int insert(SqlServerExecStatement record) {
        return MyBatis3Utils.insert(this::insert, record, sqlServerExecStatement, c ->
            c.map(oid).toProperty("oid")
            .map(moduleNameOid).toProperty("moduleNameOid")
            .map(parameters).toProperty("parameters")
            .map(returnStatusOid).toProperty("returnStatusOid")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_server_exec_statement")
    default int insertMultiple(Collection<SqlServerExecStatement> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, sqlServerExecStatement, c ->
            c.map(oid).toProperty("oid")
            .map(moduleNameOid).toProperty("moduleNameOid")
            .map(parameters).toProperty("parameters")
            .map(returnStatusOid).toProperty("returnStatusOid")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_server_exec_statement")
    default int insertSelective(SqlServerExecStatement record) {
        return MyBatis3Utils.insert(this::insert, record, sqlServerExecStatement, c ->
            c.map(oid).toPropertyWhenPresent("oid", record::getOid)
            .map(moduleNameOid).toPropertyWhenPresent("moduleNameOid", record::getModuleNameOid)
            .map(parameters).toPropertyWhenPresent("parameters", record::getParameters)
            .map(returnStatusOid).toPropertyWhenPresent("returnStatusOid", record::getReturnStatusOid)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_server_exec_statement")
    default Optional<SqlServerExecStatement> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, sqlServerExecStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_server_exec_statement")
    default List<SqlServerExecStatement> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, sqlServerExecStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_server_exec_statement")
    default List<SqlServerExecStatement> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, sqlServerExecStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_server_exec_statement")
    default Optional<SqlServerExecStatement> selectByPrimaryKey(Long oid_) {
        return selectOne(c ->
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_server_exec_statement")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, sqlServerExecStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_server_exec_statement")
    static UpdateDSL<UpdateModel> updateAllColumns(SqlServerExecStatement record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalTo(record::getOid)
                .set(moduleNameOid).equalTo(record::getModuleNameOid)
                .set(parameters).equalTo(record::getParameters)
                .set(returnStatusOid).equalTo(record::getReturnStatusOid);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_server_exec_statement")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(SqlServerExecStatement record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalToWhenPresent(record::getOid)
                .set(moduleNameOid).equalToWhenPresent(record::getModuleNameOid)
                .set(parameters).equalToWhenPresent(record::getParameters)
                .set(returnStatusOid).equalToWhenPresent(record::getReturnStatusOid);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_server_exec_statement")
    default int updateByPrimaryKey(SqlServerExecStatement record) {
        return update(c ->
            c.set(moduleNameOid).equalTo(record::getModuleNameOid)
            .set(parameters).equalTo(record::getParameters)
            .set(returnStatusOid).equalTo(record::getReturnStatusOid)
            .where(oid, isEqualTo(record::getOid))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_server_exec_statement")
    default int updateByPrimaryKeySelective(SqlServerExecStatement record) {
        return update(c ->
            c.set(moduleNameOid).equalToWhenPresent(record::getModuleNameOid)
            .set(parameters).equalToWhenPresent(record::getParameters)
            .set(returnStatusOid).equalToWhenPresent(record::getReturnStatusOid)
            .where(oid, isEqualTo(record::getOid))
        );
    }
}