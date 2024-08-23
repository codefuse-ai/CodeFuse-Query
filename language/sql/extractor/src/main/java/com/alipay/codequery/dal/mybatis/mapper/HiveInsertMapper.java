package com.alipay.codequery.dal.mybatis.mapper;

import static com.alipay.codequery.dal.mybatis.mapper.HiveInsertDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.alipay.codequery.dal.mybatis.domain.HiveInsert;
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
public interface HiveInsertMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: hive_insert")
    BasicColumn[] selectList = BasicColumn.columnList(oid, queryOid, tableSourceOid, valuesList);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: hive_insert")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: hive_insert")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: hive_insert")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<HiveInsert> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: hive_insert")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<HiveInsert> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: hive_insert")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="query_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="table_source_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="values_list", javaType=String.class, jdbcType=JdbcType.VARCHAR)
    })
    Optional<HiveInsert> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: hive_insert")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="query_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="table_source_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="values_list", javaType=String.class, jdbcType=JdbcType.VARCHAR)
    })
    List<HiveInsert> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: hive_insert")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: hive_insert")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, hiveInsert, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: hive_insert")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, hiveInsert, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: hive_insert")
    default int deleteByPrimaryKey(Long oid_) {
        return delete(c -> 
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: hive_insert")
    default int insert(HiveInsert record) {
        return MyBatis3Utils.insert(this::insert, record, hiveInsert, c ->
            c.map(oid).toProperty("oid")
            .map(queryOid).toProperty("queryOid")
            .map(tableSourceOid).toProperty("tableSourceOid")
            .map(valuesList).toProperty("valuesList")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: hive_insert")
    default int insertMultiple(Collection<HiveInsert> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, hiveInsert, c ->
            c.map(oid).toProperty("oid")
            .map(queryOid).toProperty("queryOid")
            .map(tableSourceOid).toProperty("tableSourceOid")
            .map(valuesList).toProperty("valuesList")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: hive_insert")
    default int insertSelective(HiveInsert record) {
        return MyBatis3Utils.insert(this::insert, record, hiveInsert, c ->
            c.map(oid).toPropertyWhenPresent("oid", record::getOid)
            .map(queryOid).toPropertyWhenPresent("queryOid", record::getQueryOid)
            .map(tableSourceOid).toPropertyWhenPresent("tableSourceOid", record::getTableSourceOid)
            .map(valuesList).toPropertyWhenPresent("valuesList", record::getValuesList)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: hive_insert")
    default Optional<HiveInsert> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, hiveInsert, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: hive_insert")
    default List<HiveInsert> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, hiveInsert, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: hive_insert")
    default List<HiveInsert> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, hiveInsert, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: hive_insert")
    default Optional<HiveInsert> selectByPrimaryKey(Long oid_) {
        return selectOne(c ->
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: hive_insert")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, hiveInsert, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: hive_insert")
    static UpdateDSL<UpdateModel> updateAllColumns(HiveInsert record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalTo(record::getOid)
                .set(queryOid).equalTo(record::getQueryOid)
                .set(tableSourceOid).equalTo(record::getTableSourceOid)
                .set(valuesList).equalTo(record::getValuesList);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: hive_insert")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(HiveInsert record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalToWhenPresent(record::getOid)
                .set(queryOid).equalToWhenPresent(record::getQueryOid)
                .set(tableSourceOid).equalToWhenPresent(record::getTableSourceOid)
                .set(valuesList).equalToWhenPresent(record::getValuesList);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: hive_insert")
    default int updateByPrimaryKey(HiveInsert record) {
        return update(c ->
            c.set(queryOid).equalTo(record::getQueryOid)
            .set(tableSourceOid).equalTo(record::getTableSourceOid)
            .set(valuesList).equalTo(record::getValuesList)
            .where(oid, isEqualTo(record::getOid))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: hive_insert")
    default int updateByPrimaryKeySelective(HiveInsert record) {
        return update(c ->
            c.set(queryOid).equalToWhenPresent(record::getQueryOid)
            .set(tableSourceOid).equalToWhenPresent(record::getTableSourceOid)
            .set(valuesList).equalToWhenPresent(record::getValuesList)
            .where(oid, isEqualTo(record::getOid))
        );
    }
}