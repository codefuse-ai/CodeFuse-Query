package com.alipay.codequery.dal.mybatis.mapper;

import static com.alipay.codequery.dal.mybatis.mapper.SqlCallStatementDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.alipay.codequery.dal.mybatis.domain.SqlCallStatement;
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
public interface SqlCallStatementMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_call_statement")
    BasicColumn[] selectList = BasicColumn.columnList(oid, isBrace, outParameterOid, procedureNameOid);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_call_statement")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_call_statement")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_call_statement")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<SqlCallStatement> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_call_statement")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<SqlCallStatement> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_call_statement")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="is_brace", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="out_parameter_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="procedure_name_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT)
    })
    Optional<SqlCallStatement> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_call_statement")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="is_brace", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="out_parameter_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="procedure_name_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT)
    })
    List<SqlCallStatement> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_call_statement")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_call_statement")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, sqlCallStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_call_statement")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, sqlCallStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_call_statement")
    default int deleteByPrimaryKey(Long oid_) {
        return delete(c -> 
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_call_statement")
    default int insert(SqlCallStatement record) {
        return MyBatis3Utils.insert(this::insert, record, sqlCallStatement, c ->
            c.map(oid).toProperty("oid")
            .map(isBrace).toProperty("isBrace")
            .map(outParameterOid).toProperty("outParameterOid")
            .map(procedureNameOid).toProperty("procedureNameOid")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_call_statement")
    default int insertMultiple(Collection<SqlCallStatement> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, sqlCallStatement, c ->
            c.map(oid).toProperty("oid")
            .map(isBrace).toProperty("isBrace")
            .map(outParameterOid).toProperty("outParameterOid")
            .map(procedureNameOid).toProperty("procedureNameOid")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_call_statement")
    default int insertSelective(SqlCallStatement record) {
        return MyBatis3Utils.insert(this::insert, record, sqlCallStatement, c ->
            c.map(oid).toPropertyWhenPresent("oid", record::getOid)
            .map(isBrace).toPropertyWhenPresent("isBrace", record::getIsBrace)
            .map(outParameterOid).toPropertyWhenPresent("outParameterOid", record::getOutParameterOid)
            .map(procedureNameOid).toPropertyWhenPresent("procedureNameOid", record::getProcedureNameOid)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_call_statement")
    default Optional<SqlCallStatement> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, sqlCallStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_call_statement")
    default List<SqlCallStatement> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, sqlCallStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_call_statement")
    default List<SqlCallStatement> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, sqlCallStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_call_statement")
    default Optional<SqlCallStatement> selectByPrimaryKey(Long oid_) {
        return selectOne(c ->
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_call_statement")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, sqlCallStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_call_statement")
    static UpdateDSL<UpdateModel> updateAllColumns(SqlCallStatement record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalTo(record::getOid)
                .set(isBrace).equalTo(record::getIsBrace)
                .set(outParameterOid).equalTo(record::getOutParameterOid)
                .set(procedureNameOid).equalTo(record::getProcedureNameOid);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_call_statement")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(SqlCallStatement record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalToWhenPresent(record::getOid)
                .set(isBrace).equalToWhenPresent(record::getIsBrace)
                .set(outParameterOid).equalToWhenPresent(record::getOutParameterOid)
                .set(procedureNameOid).equalToWhenPresent(record::getProcedureNameOid);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_call_statement")
    default int updateByPrimaryKey(SqlCallStatement record) {
        return update(c ->
            c.set(isBrace).equalTo(record::getIsBrace)
            .set(outParameterOid).equalTo(record::getOutParameterOid)
            .set(procedureNameOid).equalTo(record::getProcedureNameOid)
            .where(oid, isEqualTo(record::getOid))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_call_statement")
    default int updateByPrimaryKeySelective(SqlCallStatement record) {
        return update(c ->
            c.set(isBrace).equalToWhenPresent(record::getIsBrace)
            .set(outParameterOid).equalToWhenPresent(record::getOutParameterOid)
            .set(procedureNameOid).equalToWhenPresent(record::getProcedureNameOid)
            .where(oid, isEqualTo(record::getOid))
        );
    }
}