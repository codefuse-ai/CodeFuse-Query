package com.alipay.codequery.dal.mybatis.mapper;

import static com.alipay.codequery.dal.mybatis.mapper.OraclePrimaryKeyDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.alipay.codequery.dal.mybatis.domain.OraclePrimaryKey;
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
public interface OraclePrimaryKeyMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_primary_key")
    BasicColumn[] selectList = BasicColumn.columnList(oid, deferrable, enable, exceptionsIntoOid, initially, usingOid);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_primary_key")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_primary_key")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_primary_key")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<OraclePrimaryKey> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_primary_key")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<OraclePrimaryKey> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_primary_key")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="deferrable", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="enable", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="exceptions_into_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="initially", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="using_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT)
    })
    Optional<OraclePrimaryKey> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_primary_key")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="deferrable", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="enable", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="exceptions_into_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="initially", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="using_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT)
    })
    List<OraclePrimaryKey> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_primary_key")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_primary_key")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, oraclePrimaryKey, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_primary_key")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, oraclePrimaryKey, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_primary_key")
    default int deleteByPrimaryKey(Long oid_) {
        return delete(c -> 
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_primary_key")
    default int insert(OraclePrimaryKey record) {
        return MyBatis3Utils.insert(this::insert, record, oraclePrimaryKey, c ->
            c.map(oid).toProperty("oid")
            .map(deferrable).toProperty("deferrable")
            .map(enable).toProperty("enable")
            .map(exceptionsIntoOid).toProperty("exceptionsIntoOid")
            .map(initially).toProperty("initially")
            .map(usingOid).toProperty("usingOid")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_primary_key")
    default int insertMultiple(Collection<OraclePrimaryKey> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, oraclePrimaryKey, c ->
            c.map(oid).toProperty("oid")
            .map(deferrable).toProperty("deferrable")
            .map(enable).toProperty("enable")
            .map(exceptionsIntoOid).toProperty("exceptionsIntoOid")
            .map(initially).toProperty("initially")
            .map(usingOid).toProperty("usingOid")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_primary_key")
    default int insertSelective(OraclePrimaryKey record) {
        return MyBatis3Utils.insert(this::insert, record, oraclePrimaryKey, c ->
            c.map(oid).toPropertyWhenPresent("oid", record::getOid)
            .map(deferrable).toPropertyWhenPresent("deferrable", record::getDeferrable)
            .map(enable).toPropertyWhenPresent("enable", record::getEnable)
            .map(exceptionsIntoOid).toPropertyWhenPresent("exceptionsIntoOid", record::getExceptionsIntoOid)
            .map(initially).toPropertyWhenPresent("initially", record::getInitially)
            .map(usingOid).toPropertyWhenPresent("usingOid", record::getUsingOid)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_primary_key")
    default Optional<OraclePrimaryKey> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, oraclePrimaryKey, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_primary_key")
    default List<OraclePrimaryKey> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, oraclePrimaryKey, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_primary_key")
    default List<OraclePrimaryKey> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, oraclePrimaryKey, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_primary_key")
    default Optional<OraclePrimaryKey> selectByPrimaryKey(Long oid_) {
        return selectOne(c ->
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_primary_key")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, oraclePrimaryKey, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_primary_key")
    static UpdateDSL<UpdateModel> updateAllColumns(OraclePrimaryKey record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalTo(record::getOid)
                .set(deferrable).equalTo(record::getDeferrable)
                .set(enable).equalTo(record::getEnable)
                .set(exceptionsIntoOid).equalTo(record::getExceptionsIntoOid)
                .set(initially).equalTo(record::getInitially)
                .set(usingOid).equalTo(record::getUsingOid);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_primary_key")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(OraclePrimaryKey record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalToWhenPresent(record::getOid)
                .set(deferrable).equalToWhenPresent(record::getDeferrable)
                .set(enable).equalToWhenPresent(record::getEnable)
                .set(exceptionsIntoOid).equalToWhenPresent(record::getExceptionsIntoOid)
                .set(initially).equalToWhenPresent(record::getInitially)
                .set(usingOid).equalToWhenPresent(record::getUsingOid);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_primary_key")
    default int updateByPrimaryKey(OraclePrimaryKey record) {
        return update(c ->
            c.set(deferrable).equalTo(record::getDeferrable)
            .set(enable).equalTo(record::getEnable)
            .set(exceptionsIntoOid).equalTo(record::getExceptionsIntoOid)
            .set(initially).equalTo(record::getInitially)
            .set(usingOid).equalTo(record::getUsingOid)
            .where(oid, isEqualTo(record::getOid))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_primary_key")
    default int updateByPrimaryKeySelective(OraclePrimaryKey record) {
        return update(c ->
            c.set(deferrable).equalToWhenPresent(record::getDeferrable)
            .set(enable).equalToWhenPresent(record::getEnable)
            .set(exceptionsIntoOid).equalToWhenPresent(record::getExceptionsIntoOid)
            .set(initially).equalToWhenPresent(record::getInitially)
            .set(usingOid).equalToWhenPresent(record::getUsingOid)
            .where(oid, isEqualTo(record::getOid))
        );
    }
}