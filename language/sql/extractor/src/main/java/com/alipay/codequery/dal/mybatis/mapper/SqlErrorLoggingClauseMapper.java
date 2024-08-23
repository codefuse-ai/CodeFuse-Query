package com.alipay.codequery.dal.mybatis.mapper;

import static com.alipay.codequery.dal.mybatis.mapper.SqlErrorLoggingClauseDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.alipay.codequery.dal.mybatis.domain.SqlErrorLoggingClause;
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
public interface SqlErrorLoggingClauseMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_error_logging_clause")
    BasicColumn[] selectList = BasicColumn.columnList(oid, intoOid, limitOid, simpleExpressionOid);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_error_logging_clause")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_error_logging_clause")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_error_logging_clause")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<SqlErrorLoggingClause> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_error_logging_clause")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<SqlErrorLoggingClause> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_error_logging_clause")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="into_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="limit_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="simple_expression_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT)
    })
    Optional<SqlErrorLoggingClause> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_error_logging_clause")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="into_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="limit_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="simple_expression_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT)
    })
    List<SqlErrorLoggingClause> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_error_logging_clause")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_error_logging_clause")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, sqlErrorLoggingClause, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_error_logging_clause")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, sqlErrorLoggingClause, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_error_logging_clause")
    default int deleteByPrimaryKey(Long oid_) {
        return delete(c -> 
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_error_logging_clause")
    default int insert(SqlErrorLoggingClause record) {
        return MyBatis3Utils.insert(this::insert, record, sqlErrorLoggingClause, c ->
            c.map(oid).toProperty("oid")
            .map(intoOid).toProperty("intoOid")
            .map(limitOid).toProperty("limitOid")
            .map(simpleExpressionOid).toProperty("simpleExpressionOid")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_error_logging_clause")
    default int insertMultiple(Collection<SqlErrorLoggingClause> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, sqlErrorLoggingClause, c ->
            c.map(oid).toProperty("oid")
            .map(intoOid).toProperty("intoOid")
            .map(limitOid).toProperty("limitOid")
            .map(simpleExpressionOid).toProperty("simpleExpressionOid")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_error_logging_clause")
    default int insertSelective(SqlErrorLoggingClause record) {
        return MyBatis3Utils.insert(this::insert, record, sqlErrorLoggingClause, c ->
            c.map(oid).toPropertyWhenPresent("oid", record::getOid)
            .map(intoOid).toPropertyWhenPresent("intoOid", record::getIntoOid)
            .map(limitOid).toPropertyWhenPresent("limitOid", record::getLimitOid)
            .map(simpleExpressionOid).toPropertyWhenPresent("simpleExpressionOid", record::getSimpleExpressionOid)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_error_logging_clause")
    default Optional<SqlErrorLoggingClause> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, sqlErrorLoggingClause, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_error_logging_clause")
    default List<SqlErrorLoggingClause> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, sqlErrorLoggingClause, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_error_logging_clause")
    default List<SqlErrorLoggingClause> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, sqlErrorLoggingClause, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_error_logging_clause")
    default Optional<SqlErrorLoggingClause> selectByPrimaryKey(Long oid_) {
        return selectOne(c ->
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_error_logging_clause")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, sqlErrorLoggingClause, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_error_logging_clause")
    static UpdateDSL<UpdateModel> updateAllColumns(SqlErrorLoggingClause record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalTo(record::getOid)
                .set(intoOid).equalTo(record::getIntoOid)
                .set(limitOid).equalTo(record::getLimitOid)
                .set(simpleExpressionOid).equalTo(record::getSimpleExpressionOid);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_error_logging_clause")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(SqlErrorLoggingClause record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalToWhenPresent(record::getOid)
                .set(intoOid).equalToWhenPresent(record::getIntoOid)
                .set(limitOid).equalToWhenPresent(record::getLimitOid)
                .set(simpleExpressionOid).equalToWhenPresent(record::getSimpleExpressionOid);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_error_logging_clause")
    default int updateByPrimaryKey(SqlErrorLoggingClause record) {
        return update(c ->
            c.set(intoOid).equalTo(record::getIntoOid)
            .set(limitOid).equalTo(record::getLimitOid)
            .set(simpleExpressionOid).equalTo(record::getSimpleExpressionOid)
            .where(oid, isEqualTo(record::getOid))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_error_logging_clause")
    default int updateByPrimaryKeySelective(SqlErrorLoggingClause record) {
        return update(c ->
            c.set(intoOid).equalToWhenPresent(record::getIntoOid)
            .set(limitOid).equalToWhenPresent(record::getLimitOid)
            .set(simpleExpressionOid).equalToWhenPresent(record::getSimpleExpressionOid)
            .where(oid, isEqualTo(record::getOid))
        );
    }
}