package com.alipay.codequery.dal.mybatis.mapper;

import static com.alipay.codequery.dal.mybatis.mapper.OracleIntervalExprDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.alipay.codequery.dal.mybatis.domain.OracleIntervalExpr;
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
public interface OracleIntervalExprMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_interval_expr")
    BasicColumn[] selectList = BasicColumn.columnList(oid, factionalSecondsPrecision, precisionOid, toFactionalSecondsPrecisionOid, toType, type, valueOid);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_interval_expr")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_interval_expr")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_interval_expr")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<OracleIntervalExpr> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_interval_expr")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<OracleIntervalExpr> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_interval_expr")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="factional_seconds_precision", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="precision_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="to_factional_seconds_precision_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="to_type", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="type", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="value_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT)
    })
    Optional<OracleIntervalExpr> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_interval_expr")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="factional_seconds_precision", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="precision_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="to_factional_seconds_precision_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="to_type", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="type", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="value_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT)
    })
    List<OracleIntervalExpr> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_interval_expr")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_interval_expr")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, oracleIntervalExpr, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_interval_expr")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, oracleIntervalExpr, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_interval_expr")
    default int deleteByPrimaryKey(Long oid_) {
        return delete(c -> 
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_interval_expr")
    default int insert(OracleIntervalExpr record) {
        return MyBatis3Utils.insert(this::insert, record, oracleIntervalExpr, c ->
            c.map(oid).toProperty("oid")
            .map(factionalSecondsPrecision).toProperty("factionalSecondsPrecision")
            .map(precisionOid).toProperty("precisionOid")
            .map(toFactionalSecondsPrecisionOid).toProperty("toFactionalSecondsPrecisionOid")
            .map(toType).toProperty("toType")
            .map(type).toProperty("type")
            .map(valueOid).toProperty("valueOid")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_interval_expr")
    default int insertMultiple(Collection<OracleIntervalExpr> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, oracleIntervalExpr, c ->
            c.map(oid).toProperty("oid")
            .map(factionalSecondsPrecision).toProperty("factionalSecondsPrecision")
            .map(precisionOid).toProperty("precisionOid")
            .map(toFactionalSecondsPrecisionOid).toProperty("toFactionalSecondsPrecisionOid")
            .map(toType).toProperty("toType")
            .map(type).toProperty("type")
            .map(valueOid).toProperty("valueOid")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_interval_expr")
    default int insertSelective(OracleIntervalExpr record) {
        return MyBatis3Utils.insert(this::insert, record, oracleIntervalExpr, c ->
            c.map(oid).toPropertyWhenPresent("oid", record::getOid)
            .map(factionalSecondsPrecision).toPropertyWhenPresent("factionalSecondsPrecision", record::getFactionalSecondsPrecision)
            .map(precisionOid).toPropertyWhenPresent("precisionOid", record::getPrecisionOid)
            .map(toFactionalSecondsPrecisionOid).toPropertyWhenPresent("toFactionalSecondsPrecisionOid", record::getToFactionalSecondsPrecisionOid)
            .map(toType).toPropertyWhenPresent("toType", record::getToType)
            .map(type).toPropertyWhenPresent("type", record::getType)
            .map(valueOid).toPropertyWhenPresent("valueOid", record::getValueOid)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_interval_expr")
    default Optional<OracleIntervalExpr> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, oracleIntervalExpr, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_interval_expr")
    default List<OracleIntervalExpr> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, oracleIntervalExpr, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_interval_expr")
    default List<OracleIntervalExpr> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, oracleIntervalExpr, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_interval_expr")
    default Optional<OracleIntervalExpr> selectByPrimaryKey(Long oid_) {
        return selectOne(c ->
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_interval_expr")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, oracleIntervalExpr, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_interval_expr")
    static UpdateDSL<UpdateModel> updateAllColumns(OracleIntervalExpr record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalTo(record::getOid)
                .set(factionalSecondsPrecision).equalTo(record::getFactionalSecondsPrecision)
                .set(precisionOid).equalTo(record::getPrecisionOid)
                .set(toFactionalSecondsPrecisionOid).equalTo(record::getToFactionalSecondsPrecisionOid)
                .set(toType).equalTo(record::getToType)
                .set(type).equalTo(record::getType)
                .set(valueOid).equalTo(record::getValueOid);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_interval_expr")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(OracleIntervalExpr record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalToWhenPresent(record::getOid)
                .set(factionalSecondsPrecision).equalToWhenPresent(record::getFactionalSecondsPrecision)
                .set(precisionOid).equalToWhenPresent(record::getPrecisionOid)
                .set(toFactionalSecondsPrecisionOid).equalToWhenPresent(record::getToFactionalSecondsPrecisionOid)
                .set(toType).equalToWhenPresent(record::getToType)
                .set(type).equalToWhenPresent(record::getType)
                .set(valueOid).equalToWhenPresent(record::getValueOid);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_interval_expr")
    default int updateByPrimaryKey(OracleIntervalExpr record) {
        return update(c ->
            c.set(factionalSecondsPrecision).equalTo(record::getFactionalSecondsPrecision)
            .set(precisionOid).equalTo(record::getPrecisionOid)
            .set(toFactionalSecondsPrecisionOid).equalTo(record::getToFactionalSecondsPrecisionOid)
            .set(toType).equalTo(record::getToType)
            .set(type).equalTo(record::getType)
            .set(valueOid).equalTo(record::getValueOid)
            .where(oid, isEqualTo(record::getOid))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_interval_expr")
    default int updateByPrimaryKeySelective(OracleIntervalExpr record) {
        return update(c ->
            c.set(factionalSecondsPrecision).equalToWhenPresent(record::getFactionalSecondsPrecision)
            .set(precisionOid).equalToWhenPresent(record::getPrecisionOid)
            .set(toFactionalSecondsPrecisionOid).equalToWhenPresent(record::getToFactionalSecondsPrecisionOid)
            .set(toType).equalToWhenPresent(record::getToType)
            .set(type).equalToWhenPresent(record::getType)
            .set(valueOid).equalToWhenPresent(record::getValueOid)
            .where(oid, isEqualTo(record::getOid))
        );
    }
}