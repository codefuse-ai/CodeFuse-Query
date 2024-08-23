package com.alipay.codequery.dal.mybatis.mapper;

import static com.alipay.codequery.dal.mybatis.mapper.SqlExplainStatementDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.alipay.codequery.dal.mybatis.domain.SqlExplainStatement;
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
public interface SqlExplainStatementMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_explain_statement")
    BasicColumn[] selectList = BasicColumn.columnList(oid, format, isAuthorization, isDependency, isExtended, isOptimizer, isParenthesis, statementOid, type);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_explain_statement")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_explain_statement")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_explain_statement")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<SqlExplainStatement> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_explain_statement")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<SqlExplainStatement> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_explain_statement")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="format", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="is_authorization", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_dependency", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_extended", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_optimizer", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_parenthesis", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="statement_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="type", javaType=String.class, jdbcType=JdbcType.VARCHAR)
    })
    Optional<SqlExplainStatement> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_explain_statement")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="format", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="is_authorization", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_dependency", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_extended", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_optimizer", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_parenthesis", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="statement_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="type", javaType=String.class, jdbcType=JdbcType.VARCHAR)
    })
    List<SqlExplainStatement> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_explain_statement")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_explain_statement")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, sqlExplainStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_explain_statement")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, sqlExplainStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_explain_statement")
    default int deleteByPrimaryKey(Long oid_) {
        return delete(c -> 
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_explain_statement")
    default int insert(SqlExplainStatement record) {
        return MyBatis3Utils.insert(this::insert, record, sqlExplainStatement, c ->
            c.map(oid).toProperty("oid")
            .map(format).toProperty("format")
            .map(isAuthorization).toProperty("isAuthorization")
            .map(isDependency).toProperty("isDependency")
            .map(isExtended).toProperty("isExtended")
            .map(isOptimizer).toProperty("isOptimizer")
            .map(isParenthesis).toProperty("isParenthesis")
            .map(statementOid).toProperty("statementOid")
            .map(type).toProperty("type")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_explain_statement")
    default int insertMultiple(Collection<SqlExplainStatement> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, sqlExplainStatement, c ->
            c.map(oid).toProperty("oid")
            .map(format).toProperty("format")
            .map(isAuthorization).toProperty("isAuthorization")
            .map(isDependency).toProperty("isDependency")
            .map(isExtended).toProperty("isExtended")
            .map(isOptimizer).toProperty("isOptimizer")
            .map(isParenthesis).toProperty("isParenthesis")
            .map(statementOid).toProperty("statementOid")
            .map(type).toProperty("type")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_explain_statement")
    default int insertSelective(SqlExplainStatement record) {
        return MyBatis3Utils.insert(this::insert, record, sqlExplainStatement, c ->
            c.map(oid).toPropertyWhenPresent("oid", record::getOid)
            .map(format).toPropertyWhenPresent("format", record::getFormat)
            .map(isAuthorization).toPropertyWhenPresent("isAuthorization", record::getIsAuthorization)
            .map(isDependency).toPropertyWhenPresent("isDependency", record::getIsDependency)
            .map(isExtended).toPropertyWhenPresent("isExtended", record::getIsExtended)
            .map(isOptimizer).toPropertyWhenPresent("isOptimizer", record::getIsOptimizer)
            .map(isParenthesis).toPropertyWhenPresent("isParenthesis", record::getIsParenthesis)
            .map(statementOid).toPropertyWhenPresent("statementOid", record::getStatementOid)
            .map(type).toPropertyWhenPresent("type", record::getType)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_explain_statement")
    default Optional<SqlExplainStatement> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, sqlExplainStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_explain_statement")
    default List<SqlExplainStatement> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, sqlExplainStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_explain_statement")
    default List<SqlExplainStatement> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, sqlExplainStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_explain_statement")
    default Optional<SqlExplainStatement> selectByPrimaryKey(Long oid_) {
        return selectOne(c ->
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_explain_statement")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, sqlExplainStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_explain_statement")
    static UpdateDSL<UpdateModel> updateAllColumns(SqlExplainStatement record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalTo(record::getOid)
                .set(format).equalTo(record::getFormat)
                .set(isAuthorization).equalTo(record::getIsAuthorization)
                .set(isDependency).equalTo(record::getIsDependency)
                .set(isExtended).equalTo(record::getIsExtended)
                .set(isOptimizer).equalTo(record::getIsOptimizer)
                .set(isParenthesis).equalTo(record::getIsParenthesis)
                .set(statementOid).equalTo(record::getStatementOid)
                .set(type).equalTo(record::getType);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_explain_statement")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(SqlExplainStatement record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalToWhenPresent(record::getOid)
                .set(format).equalToWhenPresent(record::getFormat)
                .set(isAuthorization).equalToWhenPresent(record::getIsAuthorization)
                .set(isDependency).equalToWhenPresent(record::getIsDependency)
                .set(isExtended).equalToWhenPresent(record::getIsExtended)
                .set(isOptimizer).equalToWhenPresent(record::getIsOptimizer)
                .set(isParenthesis).equalToWhenPresent(record::getIsParenthesis)
                .set(statementOid).equalToWhenPresent(record::getStatementOid)
                .set(type).equalToWhenPresent(record::getType);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_explain_statement")
    default int updateByPrimaryKey(SqlExplainStatement record) {
        return update(c ->
            c.set(format).equalTo(record::getFormat)
            .set(isAuthorization).equalTo(record::getIsAuthorization)
            .set(isDependency).equalTo(record::getIsDependency)
            .set(isExtended).equalTo(record::getIsExtended)
            .set(isOptimizer).equalTo(record::getIsOptimizer)
            .set(isParenthesis).equalTo(record::getIsParenthesis)
            .set(statementOid).equalTo(record::getStatementOid)
            .set(type).equalTo(record::getType)
            .where(oid, isEqualTo(record::getOid))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_explain_statement")
    default int updateByPrimaryKeySelective(SqlExplainStatement record) {
        return update(c ->
            c.set(format).equalToWhenPresent(record::getFormat)
            .set(isAuthorization).equalToWhenPresent(record::getIsAuthorization)
            .set(isDependency).equalToWhenPresent(record::getIsDependency)
            .set(isExtended).equalToWhenPresent(record::getIsExtended)
            .set(isOptimizer).equalToWhenPresent(record::getIsOptimizer)
            .set(isParenthesis).equalToWhenPresent(record::getIsParenthesis)
            .set(statementOid).equalToWhenPresent(record::getStatementOid)
            .set(type).equalToWhenPresent(record::getType)
            .where(oid, isEqualTo(record::getOid))
        );
    }
}