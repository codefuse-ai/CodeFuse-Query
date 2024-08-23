package com.alipay.codequery.dal.mybatis.mapper;

import static com.alipay.codequery.dal.mybatis.mapper.SqlMergeStatementDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.alipay.codequery.dal.mybatis.domain.SqlMergeStatement;
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
public interface SqlMergeStatementMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_merge_statement")
    BasicColumn[] selectList = BasicColumn.columnList(oid, alias, errorLoggingClauseOid, insertClause, intoOid, onOid, updateClause, usingOid);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_merge_statement")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_merge_statement")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_merge_statement")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<SqlMergeStatement> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_merge_statement")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<SqlMergeStatement> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_merge_statement")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="alias", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="error_logging_clause_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="insert_clause", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="into_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="on_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="update_clause", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="using_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT)
    })
    Optional<SqlMergeStatement> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_merge_statement")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="alias", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="error_logging_clause_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="insert_clause", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="into_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="on_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="update_clause", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="using_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT)
    })
    List<SqlMergeStatement> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_merge_statement")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_merge_statement")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, sqlMergeStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_merge_statement")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, sqlMergeStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_merge_statement")
    default int deleteByPrimaryKey(Long oid_) {
        return delete(c -> 
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_merge_statement")
    default int insert(SqlMergeStatement record) {
        return MyBatis3Utils.insert(this::insert, record, sqlMergeStatement, c ->
            c.map(oid).toProperty("oid")
            .map(alias).toProperty("alias")
            .map(errorLoggingClauseOid).toProperty("errorLoggingClauseOid")
            .map(insertClause).toProperty("insertClause")
            .map(intoOid).toProperty("intoOid")
            .map(onOid).toProperty("onOid")
            .map(updateClause).toProperty("updateClause")
            .map(usingOid).toProperty("usingOid")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_merge_statement")
    default int insertMultiple(Collection<SqlMergeStatement> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, sqlMergeStatement, c ->
            c.map(oid).toProperty("oid")
            .map(alias).toProperty("alias")
            .map(errorLoggingClauseOid).toProperty("errorLoggingClauseOid")
            .map(insertClause).toProperty("insertClause")
            .map(intoOid).toProperty("intoOid")
            .map(onOid).toProperty("onOid")
            .map(updateClause).toProperty("updateClause")
            .map(usingOid).toProperty("usingOid")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_merge_statement")
    default int insertSelective(SqlMergeStatement record) {
        return MyBatis3Utils.insert(this::insert, record, sqlMergeStatement, c ->
            c.map(oid).toPropertyWhenPresent("oid", record::getOid)
            .map(alias).toPropertyWhenPresent("alias", record::getAlias)
            .map(errorLoggingClauseOid).toPropertyWhenPresent("errorLoggingClauseOid", record::getErrorLoggingClauseOid)
            .map(insertClause).toPropertyWhenPresent("insertClause", record::getInsertClause)
            .map(intoOid).toPropertyWhenPresent("intoOid", record::getIntoOid)
            .map(onOid).toPropertyWhenPresent("onOid", record::getOnOid)
            .map(updateClause).toPropertyWhenPresent("updateClause", record::getUpdateClause)
            .map(usingOid).toPropertyWhenPresent("usingOid", record::getUsingOid)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_merge_statement")
    default Optional<SqlMergeStatement> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, sqlMergeStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_merge_statement")
    default List<SqlMergeStatement> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, sqlMergeStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_merge_statement")
    default List<SqlMergeStatement> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, sqlMergeStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_merge_statement")
    default Optional<SqlMergeStatement> selectByPrimaryKey(Long oid_) {
        return selectOne(c ->
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_merge_statement")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, sqlMergeStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_merge_statement")
    static UpdateDSL<UpdateModel> updateAllColumns(SqlMergeStatement record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalTo(record::getOid)
                .set(alias).equalTo(record::getAlias)
                .set(errorLoggingClauseOid).equalTo(record::getErrorLoggingClauseOid)
                .set(insertClause).equalTo(record::getInsertClause)
                .set(intoOid).equalTo(record::getIntoOid)
                .set(onOid).equalTo(record::getOnOid)
                .set(updateClause).equalTo(record::getUpdateClause)
                .set(usingOid).equalTo(record::getUsingOid);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_merge_statement")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(SqlMergeStatement record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalToWhenPresent(record::getOid)
                .set(alias).equalToWhenPresent(record::getAlias)
                .set(errorLoggingClauseOid).equalToWhenPresent(record::getErrorLoggingClauseOid)
                .set(insertClause).equalToWhenPresent(record::getInsertClause)
                .set(intoOid).equalToWhenPresent(record::getIntoOid)
                .set(onOid).equalToWhenPresent(record::getOnOid)
                .set(updateClause).equalToWhenPresent(record::getUpdateClause)
                .set(usingOid).equalToWhenPresent(record::getUsingOid);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_merge_statement")
    default int updateByPrimaryKey(SqlMergeStatement record) {
        return update(c ->
            c.set(alias).equalTo(record::getAlias)
            .set(errorLoggingClauseOid).equalTo(record::getErrorLoggingClauseOid)
            .set(insertClause).equalTo(record::getInsertClause)
            .set(intoOid).equalTo(record::getIntoOid)
            .set(onOid).equalTo(record::getOnOid)
            .set(updateClause).equalTo(record::getUpdateClause)
            .set(usingOid).equalTo(record::getUsingOid)
            .where(oid, isEqualTo(record::getOid))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_merge_statement")
    default int updateByPrimaryKeySelective(SqlMergeStatement record) {
        return update(c ->
            c.set(alias).equalToWhenPresent(record::getAlias)
            .set(errorLoggingClauseOid).equalToWhenPresent(record::getErrorLoggingClauseOid)
            .set(insertClause).equalToWhenPresent(record::getInsertClause)
            .set(intoOid).equalToWhenPresent(record::getIntoOid)
            .set(onOid).equalToWhenPresent(record::getOnOid)
            .set(updateClause).equalToWhenPresent(record::getUpdateClause)
            .set(usingOid).equalToWhenPresent(record::getUsingOid)
            .where(oid, isEqualTo(record::getOid))
        );
    }
}