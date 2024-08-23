package com.alipay.codequery.dal.mybatis.mapper;

import static com.alipay.codequery.dal.mybatis.mapper.OracleDataTypeIntervalDayDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.alipay.codequery.dal.mybatis.domain.OracleDataTypeIntervalDay;
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
public interface OracleDataTypeIntervalDayMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_data_type_interval_day")
    BasicColumn[] selectList = BasicColumn.columnList(oid, isToSecond);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_data_type_interval_day")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_data_type_interval_day")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_data_type_interval_day")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<OracleDataTypeIntervalDay> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_data_type_interval_day")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<OracleDataTypeIntervalDay> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_data_type_interval_day")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="is_to_second", javaType=Integer.class, jdbcType=JdbcType.BIGINT)
    })
    Optional<OracleDataTypeIntervalDay> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_data_type_interval_day")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="is_to_second", javaType=Integer.class, jdbcType=JdbcType.BIGINT)
    })
    List<OracleDataTypeIntervalDay> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_data_type_interval_day")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_data_type_interval_day")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, oracleDataTypeIntervalDay, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_data_type_interval_day")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, oracleDataTypeIntervalDay, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_data_type_interval_day")
    default int deleteByPrimaryKey(Long oid_) {
        return delete(c -> 
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_data_type_interval_day")
    default int insert(OracleDataTypeIntervalDay record) {
        return MyBatis3Utils.insert(this::insert, record, oracleDataTypeIntervalDay, c ->
            c.map(oid).toProperty("oid")
            .map(isToSecond).toProperty("isToSecond")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_data_type_interval_day")
    default int insertMultiple(Collection<OracleDataTypeIntervalDay> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, oracleDataTypeIntervalDay, c ->
            c.map(oid).toProperty("oid")
            .map(isToSecond).toProperty("isToSecond")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_data_type_interval_day")
    default int insertSelective(OracleDataTypeIntervalDay record) {
        return MyBatis3Utils.insert(this::insert, record, oracleDataTypeIntervalDay, c ->
            c.map(oid).toPropertyWhenPresent("oid", record::getOid)
            .map(isToSecond).toPropertyWhenPresent("isToSecond", record::getIsToSecond)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_data_type_interval_day")
    default Optional<OracleDataTypeIntervalDay> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, oracleDataTypeIntervalDay, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_data_type_interval_day")
    default List<OracleDataTypeIntervalDay> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, oracleDataTypeIntervalDay, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_data_type_interval_day")
    default List<OracleDataTypeIntervalDay> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, oracleDataTypeIntervalDay, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_data_type_interval_day")
    default Optional<OracleDataTypeIntervalDay> selectByPrimaryKey(Long oid_) {
        return selectOne(c ->
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_data_type_interval_day")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, oracleDataTypeIntervalDay, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_data_type_interval_day")
    static UpdateDSL<UpdateModel> updateAllColumns(OracleDataTypeIntervalDay record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalTo(record::getOid)
                .set(isToSecond).equalTo(record::getIsToSecond);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_data_type_interval_day")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(OracleDataTypeIntervalDay record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalToWhenPresent(record::getOid)
                .set(isToSecond).equalToWhenPresent(record::getIsToSecond);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_data_type_interval_day")
    default int updateByPrimaryKey(OracleDataTypeIntervalDay record) {
        return update(c ->
            c.set(isToSecond).equalTo(record::getIsToSecond)
            .where(oid, isEqualTo(record::getOid))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_data_type_interval_day")
    default int updateByPrimaryKeySelective(OracleDataTypeIntervalDay record) {
        return update(c ->
            c.set(isToSecond).equalToWhenPresent(record::getIsToSecond)
            .where(oid, isEqualTo(record::getOid))
        );
    }
}