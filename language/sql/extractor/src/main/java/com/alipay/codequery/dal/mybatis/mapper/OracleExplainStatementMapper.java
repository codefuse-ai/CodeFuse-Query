package com.alipay.codequery.dal.mybatis.mapper;

import static com.alipay.codequery.dal.mybatis.mapper.OracleExplainStatementDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.alipay.codequery.dal.mybatis.domain.OracleExplainStatement;
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
public interface OracleExplainStatementMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_explain_statement")
    BasicColumn[] selectList = BasicColumn.columnList(oid, intoOid, statementIdOid);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_explain_statement")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_explain_statement")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_explain_statement")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<OracleExplainStatement> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_explain_statement")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<OracleExplainStatement> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_explain_statement")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="into_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="statement_id_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT)
    })
    Optional<OracleExplainStatement> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_explain_statement")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="into_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="statement_id_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT)
    })
    List<OracleExplainStatement> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_explain_statement")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_explain_statement")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, oracleExplainStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_explain_statement")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, oracleExplainStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_explain_statement")
    default int deleteByPrimaryKey(Long oid_) {
        return delete(c -> 
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_explain_statement")
    default int insert(OracleExplainStatement record) {
        return MyBatis3Utils.insert(this::insert, record, oracleExplainStatement, c ->
            c.map(oid).toProperty("oid")
            .map(intoOid).toProperty("intoOid")
            .map(statementIdOid).toProperty("statementIdOid")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_explain_statement")
    default int insertMultiple(Collection<OracleExplainStatement> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, oracleExplainStatement, c ->
            c.map(oid).toProperty("oid")
            .map(intoOid).toProperty("intoOid")
            .map(statementIdOid).toProperty("statementIdOid")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_explain_statement")
    default int insertSelective(OracleExplainStatement record) {
        return MyBatis3Utils.insert(this::insert, record, oracleExplainStatement, c ->
            c.map(oid).toPropertyWhenPresent("oid", record::getOid)
            .map(intoOid).toPropertyWhenPresent("intoOid", record::getIntoOid)
            .map(statementIdOid).toPropertyWhenPresent("statementIdOid", record::getStatementIdOid)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_explain_statement")
    default Optional<OracleExplainStatement> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, oracleExplainStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_explain_statement")
    default List<OracleExplainStatement> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, oracleExplainStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_explain_statement")
    default List<OracleExplainStatement> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, oracleExplainStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_explain_statement")
    default Optional<OracleExplainStatement> selectByPrimaryKey(Long oid_) {
        return selectOne(c ->
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_explain_statement")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, oracleExplainStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_explain_statement")
    static UpdateDSL<UpdateModel> updateAllColumns(OracleExplainStatement record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalTo(record::getOid)
                .set(intoOid).equalTo(record::getIntoOid)
                .set(statementIdOid).equalTo(record::getStatementIdOid);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_explain_statement")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(OracleExplainStatement record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalToWhenPresent(record::getOid)
                .set(intoOid).equalToWhenPresent(record::getIntoOid)
                .set(statementIdOid).equalToWhenPresent(record::getStatementIdOid);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_explain_statement")
    default int updateByPrimaryKey(OracleExplainStatement record) {
        return update(c ->
            c.set(intoOid).equalTo(record::getIntoOid)
            .set(statementIdOid).equalTo(record::getStatementIdOid)
            .where(oid, isEqualTo(record::getOid))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_explain_statement")
    default int updateByPrimaryKeySelective(OracleExplainStatement record) {
        return update(c ->
            c.set(intoOid).equalToWhenPresent(record::getIntoOid)
            .set(statementIdOid).equalToWhenPresent(record::getStatementIdOid)
            .where(oid, isEqualTo(record::getOid))
        );
    }
}