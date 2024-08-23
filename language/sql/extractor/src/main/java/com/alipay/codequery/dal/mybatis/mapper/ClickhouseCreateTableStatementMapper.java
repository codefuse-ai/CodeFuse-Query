package com.alipay.codequery.dal.mybatis.mapper;

import static com.alipay.codequery.dal.mybatis.mapper.ClickhouseCreateTableStatementDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.alipay.codequery.dal.mybatis.domain.ClickhouseCreateTableStatement;
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
public interface ClickhouseCreateTableStatementMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: clickhouse_create_table_statement")
    BasicColumn[] selectList = BasicColumn.columnList(oid, orderByOid, partitionByOid, sampleByOid);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: clickhouse_create_table_statement")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: clickhouse_create_table_statement")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: clickhouse_create_table_statement")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<ClickhouseCreateTableStatement> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: clickhouse_create_table_statement")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<ClickhouseCreateTableStatement> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: clickhouse_create_table_statement")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="order_by_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="partition_by_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="sample_by_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT)
    })
    Optional<ClickhouseCreateTableStatement> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: clickhouse_create_table_statement")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="order_by_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="partition_by_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="sample_by_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT)
    })
    List<ClickhouseCreateTableStatement> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: clickhouse_create_table_statement")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: clickhouse_create_table_statement")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, clickhouseCreateTableStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: clickhouse_create_table_statement")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, clickhouseCreateTableStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: clickhouse_create_table_statement")
    default int deleteByPrimaryKey(Long oid_) {
        return delete(c -> 
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: clickhouse_create_table_statement")
    default int insert(ClickhouseCreateTableStatement record) {
        return MyBatis3Utils.insert(this::insert, record, clickhouseCreateTableStatement, c ->
            c.map(oid).toProperty("oid")
            .map(orderByOid).toProperty("orderByOid")
            .map(partitionByOid).toProperty("partitionByOid")
            .map(sampleByOid).toProperty("sampleByOid")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: clickhouse_create_table_statement")
    default int insertMultiple(Collection<ClickhouseCreateTableStatement> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, clickhouseCreateTableStatement, c ->
            c.map(oid).toProperty("oid")
            .map(orderByOid).toProperty("orderByOid")
            .map(partitionByOid).toProperty("partitionByOid")
            .map(sampleByOid).toProperty("sampleByOid")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: clickhouse_create_table_statement")
    default int insertSelective(ClickhouseCreateTableStatement record) {
        return MyBatis3Utils.insert(this::insert, record, clickhouseCreateTableStatement, c ->
            c.map(oid).toPropertyWhenPresent("oid", record::getOid)
            .map(orderByOid).toPropertyWhenPresent("orderByOid", record::getOrderByOid)
            .map(partitionByOid).toPropertyWhenPresent("partitionByOid", record::getPartitionByOid)
            .map(sampleByOid).toPropertyWhenPresent("sampleByOid", record::getSampleByOid)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: clickhouse_create_table_statement")
    default Optional<ClickhouseCreateTableStatement> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, clickhouseCreateTableStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: clickhouse_create_table_statement")
    default List<ClickhouseCreateTableStatement> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, clickhouseCreateTableStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: clickhouse_create_table_statement")
    default List<ClickhouseCreateTableStatement> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, clickhouseCreateTableStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: clickhouse_create_table_statement")
    default Optional<ClickhouseCreateTableStatement> selectByPrimaryKey(Long oid_) {
        return selectOne(c ->
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: clickhouse_create_table_statement")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, clickhouseCreateTableStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: clickhouse_create_table_statement")
    static UpdateDSL<UpdateModel> updateAllColumns(ClickhouseCreateTableStatement record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalTo(record::getOid)
                .set(orderByOid).equalTo(record::getOrderByOid)
                .set(partitionByOid).equalTo(record::getPartitionByOid)
                .set(sampleByOid).equalTo(record::getSampleByOid);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: clickhouse_create_table_statement")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(ClickhouseCreateTableStatement record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalToWhenPresent(record::getOid)
                .set(orderByOid).equalToWhenPresent(record::getOrderByOid)
                .set(partitionByOid).equalToWhenPresent(record::getPartitionByOid)
                .set(sampleByOid).equalToWhenPresent(record::getSampleByOid);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: clickhouse_create_table_statement")
    default int updateByPrimaryKey(ClickhouseCreateTableStatement record) {
        return update(c ->
            c.set(orderByOid).equalTo(record::getOrderByOid)
            .set(partitionByOid).equalTo(record::getPartitionByOid)
            .set(sampleByOid).equalTo(record::getSampleByOid)
            .where(oid, isEqualTo(record::getOid))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: clickhouse_create_table_statement")
    default int updateByPrimaryKeySelective(ClickhouseCreateTableStatement record) {
        return update(c ->
            c.set(orderByOid).equalToWhenPresent(record::getOrderByOid)
            .set(partitionByOid).equalToWhenPresent(record::getPartitionByOid)
            .set(sampleByOid).equalToWhenPresent(record::getSampleByOid)
            .where(oid, isEqualTo(record::getOid))
        );
    }
}