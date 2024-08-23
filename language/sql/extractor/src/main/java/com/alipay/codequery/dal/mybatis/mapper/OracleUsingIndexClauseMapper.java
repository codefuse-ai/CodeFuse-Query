package com.alipay.codequery.dal.mybatis.mapper;

import static com.alipay.codequery.dal.mybatis.mapper.OracleUsingIndexClauseDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.alipay.codequery.dal.mybatis.domain.OracleUsingIndexClause;
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
public interface OracleUsingIndexClauseMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_using_index_clause")
    BasicColumn[] selectList = BasicColumn.columnList(oid, enable, index, isComputeStatistics, isReverse);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_using_index_clause")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_using_index_clause")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_using_index_clause")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<OracleUsingIndexClause> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_using_index_clause")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<OracleUsingIndexClause> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_using_index_clause")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="enable", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="index", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="is_compute_statistics", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_reverse", javaType=Integer.class, jdbcType=JdbcType.BIGINT)
    })
    Optional<OracleUsingIndexClause> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_using_index_clause")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="enable", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="index", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="is_compute_statistics", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_reverse", javaType=Integer.class, jdbcType=JdbcType.BIGINT)
    })
    List<OracleUsingIndexClause> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_using_index_clause")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_using_index_clause")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, oracleUsingIndexClause, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_using_index_clause")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, oracleUsingIndexClause, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_using_index_clause")
    default int deleteByPrimaryKey(Long oid_) {
        return delete(c -> 
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_using_index_clause")
    default int insert(OracleUsingIndexClause record) {
        return MyBatis3Utils.insert(this::insert, record, oracleUsingIndexClause, c ->
            c.map(oid).toProperty("oid")
            .map(enable).toProperty("enable")
            .map(index).toProperty("index")
            .map(isComputeStatistics).toProperty("isComputeStatistics")
            .map(isReverse).toProperty("isReverse")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_using_index_clause")
    default int insertMultiple(Collection<OracleUsingIndexClause> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, oracleUsingIndexClause, c ->
            c.map(oid).toProperty("oid")
            .map(enable).toProperty("enable")
            .map(index).toProperty("index")
            .map(isComputeStatistics).toProperty("isComputeStatistics")
            .map(isReverse).toProperty("isReverse")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_using_index_clause")
    default int insertSelective(OracleUsingIndexClause record) {
        return MyBatis3Utils.insert(this::insert, record, oracleUsingIndexClause, c ->
            c.map(oid).toPropertyWhenPresent("oid", record::getOid)
            .map(enable).toPropertyWhenPresent("enable", record::getEnable)
            .map(index).toPropertyWhenPresent("index", record::getIndex)
            .map(isComputeStatistics).toPropertyWhenPresent("isComputeStatistics", record::getIsComputeStatistics)
            .map(isReverse).toPropertyWhenPresent("isReverse", record::getIsReverse)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_using_index_clause")
    default Optional<OracleUsingIndexClause> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, oracleUsingIndexClause, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_using_index_clause")
    default List<OracleUsingIndexClause> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, oracleUsingIndexClause, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_using_index_clause")
    default List<OracleUsingIndexClause> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, oracleUsingIndexClause, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_using_index_clause")
    default Optional<OracleUsingIndexClause> selectByPrimaryKey(Long oid_) {
        return selectOne(c ->
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_using_index_clause")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, oracleUsingIndexClause, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_using_index_clause")
    static UpdateDSL<UpdateModel> updateAllColumns(OracleUsingIndexClause record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalTo(record::getOid)
                .set(enable).equalTo(record::getEnable)
                .set(index).equalTo(record::getIndex)
                .set(isComputeStatistics).equalTo(record::getIsComputeStatistics)
                .set(isReverse).equalTo(record::getIsReverse);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_using_index_clause")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(OracleUsingIndexClause record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalToWhenPresent(record::getOid)
                .set(enable).equalToWhenPresent(record::getEnable)
                .set(index).equalToWhenPresent(record::getIndex)
                .set(isComputeStatistics).equalToWhenPresent(record::getIsComputeStatistics)
                .set(isReverse).equalToWhenPresent(record::getIsReverse);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_using_index_clause")
    default int updateByPrimaryKey(OracleUsingIndexClause record) {
        return update(c ->
            c.set(enable).equalTo(record::getEnable)
            .set(index).equalTo(record::getIndex)
            .set(isComputeStatistics).equalTo(record::getIsComputeStatistics)
            .set(isReverse).equalTo(record::getIsReverse)
            .where(oid, isEqualTo(record::getOid))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_using_index_clause")
    default int updateByPrimaryKeySelective(OracleUsingIndexClause record) {
        return update(c ->
            c.set(enable).equalToWhenPresent(record::getEnable)
            .set(index).equalToWhenPresent(record::getIndex)
            .set(isComputeStatistics).equalToWhenPresent(record::getIsComputeStatistics)
            .set(isReverse).equalToWhenPresent(record::getIsReverse)
            .where(oid, isEqualTo(record::getOid))
        );
    }
}