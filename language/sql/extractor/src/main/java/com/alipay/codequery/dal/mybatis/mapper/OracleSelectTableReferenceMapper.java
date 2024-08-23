package com.alipay.codequery.dal.mybatis.mapper;

import static com.alipay.codequery.dal.mybatis.mapper.OracleSelectTableReferenceDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.alipay.codequery.dal.mybatis.domain.OracleSelectTableReference;
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
public interface OracleSelectTableReferenceMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_select_table_reference")
    BasicColumn[] selectList = BasicColumn.columnList(oid, isOnly, partitionOid, pivotOid, sampleClauseOid);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_select_table_reference")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_select_table_reference")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_select_table_reference")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<OracleSelectTableReference> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_select_table_reference")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<OracleSelectTableReference> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_select_table_reference")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="is_only", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="partition_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="pivot_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="sample_clause_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT)
    })
    Optional<OracleSelectTableReference> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_select_table_reference")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="is_only", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="partition_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="pivot_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="sample_clause_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT)
    })
    List<OracleSelectTableReference> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_select_table_reference")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_select_table_reference")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, oracleSelectTableReference, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_select_table_reference")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, oracleSelectTableReference, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_select_table_reference")
    default int deleteByPrimaryKey(Long oid_) {
        return delete(c -> 
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_select_table_reference")
    default int insert(OracleSelectTableReference record) {
        return MyBatis3Utils.insert(this::insert, record, oracleSelectTableReference, c ->
            c.map(oid).toProperty("oid")
            .map(isOnly).toProperty("isOnly")
            .map(partitionOid).toProperty("partitionOid")
            .map(pivotOid).toProperty("pivotOid")
            .map(sampleClauseOid).toProperty("sampleClauseOid")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_select_table_reference")
    default int insertMultiple(Collection<OracleSelectTableReference> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, oracleSelectTableReference, c ->
            c.map(oid).toProperty("oid")
            .map(isOnly).toProperty("isOnly")
            .map(partitionOid).toProperty("partitionOid")
            .map(pivotOid).toProperty("pivotOid")
            .map(sampleClauseOid).toProperty("sampleClauseOid")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_select_table_reference")
    default int insertSelective(OracleSelectTableReference record) {
        return MyBatis3Utils.insert(this::insert, record, oracleSelectTableReference, c ->
            c.map(oid).toPropertyWhenPresent("oid", record::getOid)
            .map(isOnly).toPropertyWhenPresent("isOnly", record::getIsOnly)
            .map(partitionOid).toPropertyWhenPresent("partitionOid", record::getPartitionOid)
            .map(pivotOid).toPropertyWhenPresent("pivotOid", record::getPivotOid)
            .map(sampleClauseOid).toPropertyWhenPresent("sampleClauseOid", record::getSampleClauseOid)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_select_table_reference")
    default Optional<OracleSelectTableReference> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, oracleSelectTableReference, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_select_table_reference")
    default List<OracleSelectTableReference> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, oracleSelectTableReference, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_select_table_reference")
    default List<OracleSelectTableReference> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, oracleSelectTableReference, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_select_table_reference")
    default Optional<OracleSelectTableReference> selectByPrimaryKey(Long oid_) {
        return selectOne(c ->
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_select_table_reference")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, oracleSelectTableReference, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_select_table_reference")
    static UpdateDSL<UpdateModel> updateAllColumns(OracleSelectTableReference record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalTo(record::getOid)
                .set(isOnly).equalTo(record::getIsOnly)
                .set(partitionOid).equalTo(record::getPartitionOid)
                .set(pivotOid).equalTo(record::getPivotOid)
                .set(sampleClauseOid).equalTo(record::getSampleClauseOid);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_select_table_reference")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(OracleSelectTableReference record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalToWhenPresent(record::getOid)
                .set(isOnly).equalToWhenPresent(record::getIsOnly)
                .set(partitionOid).equalToWhenPresent(record::getPartitionOid)
                .set(pivotOid).equalToWhenPresent(record::getPivotOid)
                .set(sampleClauseOid).equalToWhenPresent(record::getSampleClauseOid);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_select_table_reference")
    default int updateByPrimaryKey(OracleSelectTableReference record) {
        return update(c ->
            c.set(isOnly).equalTo(record::getIsOnly)
            .set(partitionOid).equalTo(record::getPartitionOid)
            .set(pivotOid).equalTo(record::getPivotOid)
            .set(sampleClauseOid).equalTo(record::getSampleClauseOid)
            .where(oid, isEqualTo(record::getOid))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_select_table_reference")
    default int updateByPrimaryKeySelective(OracleSelectTableReference record) {
        return update(c ->
            c.set(isOnly).equalToWhenPresent(record::getIsOnly)
            .set(partitionOid).equalToWhenPresent(record::getPartitionOid)
            .set(pivotOid).equalToWhenPresent(record::getPivotOid)
            .set(sampleClauseOid).equalToWhenPresent(record::getSampleClauseOid)
            .where(oid, isEqualTo(record::getOid))
        );
    }
}