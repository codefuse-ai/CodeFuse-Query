package com.alipay.codequery.dal.mybatis.mapper;

import static com.alipay.codequery.dal.mybatis.mapper.OracleWithSubqueryEntryDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.alipay.codequery.dal.mybatis.domain.OracleWithSubqueryEntry;
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
public interface OracleWithSubqueryEntryMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_with_subquery_entry")
    BasicColumn[] selectList = BasicColumn.columnList(oid, cycleClauseOid, searchClauseOid);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_with_subquery_entry")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_with_subquery_entry")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_with_subquery_entry")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<OracleWithSubqueryEntry> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_with_subquery_entry")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<OracleWithSubqueryEntry> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_with_subquery_entry")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="cycle_clause_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="search_clause_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT)
    })
    Optional<OracleWithSubqueryEntry> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_with_subquery_entry")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="cycle_clause_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="search_clause_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT)
    })
    List<OracleWithSubqueryEntry> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_with_subquery_entry")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_with_subquery_entry")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, oracleWithSubqueryEntry, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_with_subquery_entry")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, oracleWithSubqueryEntry, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_with_subquery_entry")
    default int deleteByPrimaryKey(Long oid_) {
        return delete(c -> 
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_with_subquery_entry")
    default int insert(OracleWithSubqueryEntry record) {
        return MyBatis3Utils.insert(this::insert, record, oracleWithSubqueryEntry, c ->
            c.map(oid).toProperty("oid")
            .map(cycleClauseOid).toProperty("cycleClauseOid")
            .map(searchClauseOid).toProperty("searchClauseOid")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_with_subquery_entry")
    default int insertMultiple(Collection<OracleWithSubqueryEntry> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, oracleWithSubqueryEntry, c ->
            c.map(oid).toProperty("oid")
            .map(cycleClauseOid).toProperty("cycleClauseOid")
            .map(searchClauseOid).toProperty("searchClauseOid")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_with_subquery_entry")
    default int insertSelective(OracleWithSubqueryEntry record) {
        return MyBatis3Utils.insert(this::insert, record, oracleWithSubqueryEntry, c ->
            c.map(oid).toPropertyWhenPresent("oid", record::getOid)
            .map(cycleClauseOid).toPropertyWhenPresent("cycleClauseOid", record::getCycleClauseOid)
            .map(searchClauseOid).toPropertyWhenPresent("searchClauseOid", record::getSearchClauseOid)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_with_subquery_entry")
    default Optional<OracleWithSubqueryEntry> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, oracleWithSubqueryEntry, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_with_subquery_entry")
    default List<OracleWithSubqueryEntry> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, oracleWithSubqueryEntry, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_with_subquery_entry")
    default List<OracleWithSubqueryEntry> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, oracleWithSubqueryEntry, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_with_subquery_entry")
    default Optional<OracleWithSubqueryEntry> selectByPrimaryKey(Long oid_) {
        return selectOne(c ->
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_with_subquery_entry")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, oracleWithSubqueryEntry, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_with_subquery_entry")
    static UpdateDSL<UpdateModel> updateAllColumns(OracleWithSubqueryEntry record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalTo(record::getOid)
                .set(cycleClauseOid).equalTo(record::getCycleClauseOid)
                .set(searchClauseOid).equalTo(record::getSearchClauseOid);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_with_subquery_entry")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(OracleWithSubqueryEntry record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalToWhenPresent(record::getOid)
                .set(cycleClauseOid).equalToWhenPresent(record::getCycleClauseOid)
                .set(searchClauseOid).equalToWhenPresent(record::getSearchClauseOid);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_with_subquery_entry")
    default int updateByPrimaryKey(OracleWithSubqueryEntry record) {
        return update(c ->
            c.set(cycleClauseOid).equalTo(record::getCycleClauseOid)
            .set(searchClauseOid).equalTo(record::getSearchClauseOid)
            .where(oid, isEqualTo(record::getOid))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_with_subquery_entry")
    default int updateByPrimaryKeySelective(OracleWithSubqueryEntry record) {
        return update(c ->
            c.set(cycleClauseOid).equalToWhenPresent(record::getCycleClauseOid)
            .set(searchClauseOid).equalToWhenPresent(record::getSearchClauseOid)
            .where(oid, isEqualTo(record::getOid))
        );
    }
}