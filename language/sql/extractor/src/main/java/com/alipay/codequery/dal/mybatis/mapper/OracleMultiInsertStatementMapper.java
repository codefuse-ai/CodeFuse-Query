package com.alipay.codequery.dal.mybatis.mapper;

import static com.alipay.codequery.dal.mybatis.mapper.OracleMultiInsertStatementDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.alipay.codequery.dal.mybatis.domain.OracleMultiInsertStatement;
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
public interface OracleMultiInsertStatementMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_multi_insert_statement")
    BasicColumn[] selectList = BasicColumn.columnList(oid, entries, option, subQueryOid);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_multi_insert_statement")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_multi_insert_statement")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_multi_insert_statement")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<OracleMultiInsertStatement> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_multi_insert_statement")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<OracleMultiInsertStatement> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_multi_insert_statement")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="entries", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="option", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="sub_query_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT)
    })
    Optional<OracleMultiInsertStatement> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_multi_insert_statement")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="entries", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="option", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="sub_query_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT)
    })
    List<OracleMultiInsertStatement> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_multi_insert_statement")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_multi_insert_statement")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, oracleMultiInsertStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_multi_insert_statement")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, oracleMultiInsertStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_multi_insert_statement")
    default int deleteByPrimaryKey(Long oid_) {
        return delete(c -> 
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_multi_insert_statement")
    default int insert(OracleMultiInsertStatement record) {
        return MyBatis3Utils.insert(this::insert, record, oracleMultiInsertStatement, c ->
            c.map(oid).toProperty("oid")
            .map(entries).toProperty("entries")
            .map(option).toProperty("option")
            .map(subQueryOid).toProperty("subQueryOid")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_multi_insert_statement")
    default int insertMultiple(Collection<OracleMultiInsertStatement> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, oracleMultiInsertStatement, c ->
            c.map(oid).toProperty("oid")
            .map(entries).toProperty("entries")
            .map(option).toProperty("option")
            .map(subQueryOid).toProperty("subQueryOid")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_multi_insert_statement")
    default int insertSelective(OracleMultiInsertStatement record) {
        return MyBatis3Utils.insert(this::insert, record, oracleMultiInsertStatement, c ->
            c.map(oid).toPropertyWhenPresent("oid", record::getOid)
            .map(entries).toPropertyWhenPresent("entries", record::getEntries)
            .map(option).toPropertyWhenPresent("option", record::getOption)
            .map(subQueryOid).toPropertyWhenPresent("subQueryOid", record::getSubQueryOid)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_multi_insert_statement")
    default Optional<OracleMultiInsertStatement> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, oracleMultiInsertStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_multi_insert_statement")
    default List<OracleMultiInsertStatement> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, oracleMultiInsertStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_multi_insert_statement")
    default List<OracleMultiInsertStatement> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, oracleMultiInsertStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_multi_insert_statement")
    default Optional<OracleMultiInsertStatement> selectByPrimaryKey(Long oid_) {
        return selectOne(c ->
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_multi_insert_statement")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, oracleMultiInsertStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_multi_insert_statement")
    static UpdateDSL<UpdateModel> updateAllColumns(OracleMultiInsertStatement record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalTo(record::getOid)
                .set(entries).equalTo(record::getEntries)
                .set(option).equalTo(record::getOption)
                .set(subQueryOid).equalTo(record::getSubQueryOid);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_multi_insert_statement")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(OracleMultiInsertStatement record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalToWhenPresent(record::getOid)
                .set(entries).equalToWhenPresent(record::getEntries)
                .set(option).equalToWhenPresent(record::getOption)
                .set(subQueryOid).equalToWhenPresent(record::getSubQueryOid);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_multi_insert_statement")
    default int updateByPrimaryKey(OracleMultiInsertStatement record) {
        return update(c ->
            c.set(entries).equalTo(record::getEntries)
            .set(option).equalTo(record::getOption)
            .set(subQueryOid).equalTo(record::getSubQueryOid)
            .where(oid, isEqualTo(record::getOid))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_multi_insert_statement")
    default int updateByPrimaryKeySelective(OracleMultiInsertStatement record) {
        return update(c ->
            c.set(entries).equalToWhenPresent(record::getEntries)
            .set(option).equalToWhenPresent(record::getOption)
            .set(subQueryOid).equalToWhenPresent(record::getSubQueryOid)
            .where(oid, isEqualTo(record::getOid))
        );
    }
}