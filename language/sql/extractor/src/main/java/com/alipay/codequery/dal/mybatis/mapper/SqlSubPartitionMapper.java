package com.alipay.codequery.dal.mybatis.mapper;

import static com.alipay.codequery.dal.mybatis.mapper.SqlSubPartitionDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.alipay.codequery.dal.mybatis.domain.SqlSubPartition;
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
public interface SqlSubPartitionMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_sub_partition")
    BasicColumn[] selectList = BasicColumn.columnList(oid, commentOid, dataDirectoryOid, engineOid, indexDirectoryOid, maxRowsOid, minRowsOid, nameOid, tableSpaceOid, valuesOid);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_sub_partition")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_sub_partition")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_sub_partition")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<SqlSubPartition> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_sub_partition")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<SqlSubPartition> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_sub_partition")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="comment_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="data_directory_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="engine_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="index_directory_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="max_rows_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="min_rows_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="name_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="table_space_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="values_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT)
    })
    Optional<SqlSubPartition> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_sub_partition")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="comment_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="data_directory_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="engine_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="index_directory_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="max_rows_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="min_rows_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="name_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="table_space_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="values_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT)
    })
    List<SqlSubPartition> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_sub_partition")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_sub_partition")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, sqlSubPartition, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_sub_partition")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, sqlSubPartition, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_sub_partition")
    default int deleteByPrimaryKey(Long oid_) {
        return delete(c -> 
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_sub_partition")
    default int insert(SqlSubPartition record) {
        return MyBatis3Utils.insert(this::insert, record, sqlSubPartition, c ->
            c.map(oid).toProperty("oid")
            .map(commentOid).toProperty("commentOid")
            .map(dataDirectoryOid).toProperty("dataDirectoryOid")
            .map(engineOid).toProperty("engineOid")
            .map(indexDirectoryOid).toProperty("indexDirectoryOid")
            .map(maxRowsOid).toProperty("maxRowsOid")
            .map(minRowsOid).toProperty("minRowsOid")
            .map(nameOid).toProperty("nameOid")
            .map(tableSpaceOid).toProperty("tableSpaceOid")
            .map(valuesOid).toProperty("valuesOid")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_sub_partition")
    default int insertMultiple(Collection<SqlSubPartition> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, sqlSubPartition, c ->
            c.map(oid).toProperty("oid")
            .map(commentOid).toProperty("commentOid")
            .map(dataDirectoryOid).toProperty("dataDirectoryOid")
            .map(engineOid).toProperty("engineOid")
            .map(indexDirectoryOid).toProperty("indexDirectoryOid")
            .map(maxRowsOid).toProperty("maxRowsOid")
            .map(minRowsOid).toProperty("minRowsOid")
            .map(nameOid).toProperty("nameOid")
            .map(tableSpaceOid).toProperty("tableSpaceOid")
            .map(valuesOid).toProperty("valuesOid")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_sub_partition")
    default int insertSelective(SqlSubPartition record) {
        return MyBatis3Utils.insert(this::insert, record, sqlSubPartition, c ->
            c.map(oid).toPropertyWhenPresent("oid", record::getOid)
            .map(commentOid).toPropertyWhenPresent("commentOid", record::getCommentOid)
            .map(dataDirectoryOid).toPropertyWhenPresent("dataDirectoryOid", record::getDataDirectoryOid)
            .map(engineOid).toPropertyWhenPresent("engineOid", record::getEngineOid)
            .map(indexDirectoryOid).toPropertyWhenPresent("indexDirectoryOid", record::getIndexDirectoryOid)
            .map(maxRowsOid).toPropertyWhenPresent("maxRowsOid", record::getMaxRowsOid)
            .map(minRowsOid).toPropertyWhenPresent("minRowsOid", record::getMinRowsOid)
            .map(nameOid).toPropertyWhenPresent("nameOid", record::getNameOid)
            .map(tableSpaceOid).toPropertyWhenPresent("tableSpaceOid", record::getTableSpaceOid)
            .map(valuesOid).toPropertyWhenPresent("valuesOid", record::getValuesOid)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_sub_partition")
    default Optional<SqlSubPartition> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, sqlSubPartition, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_sub_partition")
    default List<SqlSubPartition> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, sqlSubPartition, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_sub_partition")
    default List<SqlSubPartition> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, sqlSubPartition, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_sub_partition")
    default Optional<SqlSubPartition> selectByPrimaryKey(Long oid_) {
        return selectOne(c ->
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_sub_partition")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, sqlSubPartition, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_sub_partition")
    static UpdateDSL<UpdateModel> updateAllColumns(SqlSubPartition record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalTo(record::getOid)
                .set(commentOid).equalTo(record::getCommentOid)
                .set(dataDirectoryOid).equalTo(record::getDataDirectoryOid)
                .set(engineOid).equalTo(record::getEngineOid)
                .set(indexDirectoryOid).equalTo(record::getIndexDirectoryOid)
                .set(maxRowsOid).equalTo(record::getMaxRowsOid)
                .set(minRowsOid).equalTo(record::getMinRowsOid)
                .set(nameOid).equalTo(record::getNameOid)
                .set(tableSpaceOid).equalTo(record::getTableSpaceOid)
                .set(valuesOid).equalTo(record::getValuesOid);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_sub_partition")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(SqlSubPartition record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalToWhenPresent(record::getOid)
                .set(commentOid).equalToWhenPresent(record::getCommentOid)
                .set(dataDirectoryOid).equalToWhenPresent(record::getDataDirectoryOid)
                .set(engineOid).equalToWhenPresent(record::getEngineOid)
                .set(indexDirectoryOid).equalToWhenPresent(record::getIndexDirectoryOid)
                .set(maxRowsOid).equalToWhenPresent(record::getMaxRowsOid)
                .set(minRowsOid).equalToWhenPresent(record::getMinRowsOid)
                .set(nameOid).equalToWhenPresent(record::getNameOid)
                .set(tableSpaceOid).equalToWhenPresent(record::getTableSpaceOid)
                .set(valuesOid).equalToWhenPresent(record::getValuesOid);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_sub_partition")
    default int updateByPrimaryKey(SqlSubPartition record) {
        return update(c ->
            c.set(commentOid).equalTo(record::getCommentOid)
            .set(dataDirectoryOid).equalTo(record::getDataDirectoryOid)
            .set(engineOid).equalTo(record::getEngineOid)
            .set(indexDirectoryOid).equalTo(record::getIndexDirectoryOid)
            .set(maxRowsOid).equalTo(record::getMaxRowsOid)
            .set(minRowsOid).equalTo(record::getMinRowsOid)
            .set(nameOid).equalTo(record::getNameOid)
            .set(tableSpaceOid).equalTo(record::getTableSpaceOid)
            .set(valuesOid).equalTo(record::getValuesOid)
            .where(oid, isEqualTo(record::getOid))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_sub_partition")
    default int updateByPrimaryKeySelective(SqlSubPartition record) {
        return update(c ->
            c.set(commentOid).equalToWhenPresent(record::getCommentOid)
            .set(dataDirectoryOid).equalToWhenPresent(record::getDataDirectoryOid)
            .set(engineOid).equalToWhenPresent(record::getEngineOid)
            .set(indexDirectoryOid).equalToWhenPresent(record::getIndexDirectoryOid)
            .set(maxRowsOid).equalToWhenPresent(record::getMaxRowsOid)
            .set(minRowsOid).equalToWhenPresent(record::getMinRowsOid)
            .set(nameOid).equalToWhenPresent(record::getNameOid)
            .set(tableSpaceOid).equalToWhenPresent(record::getTableSpaceOid)
            .set(valuesOid).equalToWhenPresent(record::getValuesOid)
            .where(oid, isEqualTo(record::getOid))
        );
    }
}