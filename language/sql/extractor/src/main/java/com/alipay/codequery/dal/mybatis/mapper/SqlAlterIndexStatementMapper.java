package com.alipay.codequery.dal.mybatis.mapper;

import static com.alipay.codequery.dal.mybatis.mapper.SqlAlterIndexStatementDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.alipay.codequery.dal.mybatis.domain.SqlAlterIndexStatement;
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
public interface SqlAlterIndexStatementMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_index_statement")
    BasicColumn[] selectList = BasicColumn.columnList(oid, dbPartitionByOid, enable, isCompile, isUnusable, monitoringUsage, nameOid, parallelOid, rebuild, renameToOid, tableOid);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_index_statement")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_index_statement")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_index_statement")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<SqlAlterIndexStatement> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_index_statement")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<SqlAlterIndexStatement> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_index_statement")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="db_partition_by_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="enable", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_compile", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_unusable", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="monitoring_usage", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="name_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="parallel_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="rebuild", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="rename_to_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="table_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT)
    })
    Optional<SqlAlterIndexStatement> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_index_statement")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="db_partition_by_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="enable", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_compile", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_unusable", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="monitoring_usage", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="name_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="parallel_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="rebuild", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="rename_to_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="table_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT)
    })
    List<SqlAlterIndexStatement> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_index_statement")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_index_statement")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, sqlAlterIndexStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_index_statement")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, sqlAlterIndexStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_index_statement")
    default int deleteByPrimaryKey(Long oid_) {
        return delete(c -> 
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_index_statement")
    default int insert(SqlAlterIndexStatement record) {
        return MyBatis3Utils.insert(this::insert, record, sqlAlterIndexStatement, c ->
            c.map(oid).toProperty("oid")
            .map(dbPartitionByOid).toProperty("dbPartitionByOid")
            .map(enable).toProperty("enable")
            .map(isCompile).toProperty("isCompile")
            .map(isUnusable).toProperty("isUnusable")
            .map(monitoringUsage).toProperty("monitoringUsage")
            .map(nameOid).toProperty("nameOid")
            .map(parallelOid).toProperty("parallelOid")
            .map(rebuild).toProperty("rebuild")
            .map(renameToOid).toProperty("renameToOid")
            .map(tableOid).toProperty("tableOid")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_index_statement")
    default int insertMultiple(Collection<SqlAlterIndexStatement> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, sqlAlterIndexStatement, c ->
            c.map(oid).toProperty("oid")
            .map(dbPartitionByOid).toProperty("dbPartitionByOid")
            .map(enable).toProperty("enable")
            .map(isCompile).toProperty("isCompile")
            .map(isUnusable).toProperty("isUnusable")
            .map(monitoringUsage).toProperty("monitoringUsage")
            .map(nameOid).toProperty("nameOid")
            .map(parallelOid).toProperty("parallelOid")
            .map(rebuild).toProperty("rebuild")
            .map(renameToOid).toProperty("renameToOid")
            .map(tableOid).toProperty("tableOid")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_index_statement")
    default int insertSelective(SqlAlterIndexStatement record) {
        return MyBatis3Utils.insert(this::insert, record, sqlAlterIndexStatement, c ->
            c.map(oid).toPropertyWhenPresent("oid", record::getOid)
            .map(dbPartitionByOid).toPropertyWhenPresent("dbPartitionByOid", record::getDbPartitionByOid)
            .map(enable).toPropertyWhenPresent("enable", record::getEnable)
            .map(isCompile).toPropertyWhenPresent("isCompile", record::getIsCompile)
            .map(isUnusable).toPropertyWhenPresent("isUnusable", record::getIsUnusable)
            .map(monitoringUsage).toPropertyWhenPresent("monitoringUsage", record::getMonitoringUsage)
            .map(nameOid).toPropertyWhenPresent("nameOid", record::getNameOid)
            .map(parallelOid).toPropertyWhenPresent("parallelOid", record::getParallelOid)
            .map(rebuild).toPropertyWhenPresent("rebuild", record::getRebuild)
            .map(renameToOid).toPropertyWhenPresent("renameToOid", record::getRenameToOid)
            .map(tableOid).toPropertyWhenPresent("tableOid", record::getTableOid)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_index_statement")
    default Optional<SqlAlterIndexStatement> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, sqlAlterIndexStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_index_statement")
    default List<SqlAlterIndexStatement> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, sqlAlterIndexStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_index_statement")
    default List<SqlAlterIndexStatement> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, sqlAlterIndexStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_index_statement")
    default Optional<SqlAlterIndexStatement> selectByPrimaryKey(Long oid_) {
        return selectOne(c ->
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_index_statement")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, sqlAlterIndexStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_index_statement")
    static UpdateDSL<UpdateModel> updateAllColumns(SqlAlterIndexStatement record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalTo(record::getOid)
                .set(dbPartitionByOid).equalTo(record::getDbPartitionByOid)
                .set(enable).equalTo(record::getEnable)
                .set(isCompile).equalTo(record::getIsCompile)
                .set(isUnusable).equalTo(record::getIsUnusable)
                .set(monitoringUsage).equalTo(record::getMonitoringUsage)
                .set(nameOid).equalTo(record::getNameOid)
                .set(parallelOid).equalTo(record::getParallelOid)
                .set(rebuild).equalTo(record::getRebuild)
                .set(renameToOid).equalTo(record::getRenameToOid)
                .set(tableOid).equalTo(record::getTableOid);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_index_statement")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(SqlAlterIndexStatement record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalToWhenPresent(record::getOid)
                .set(dbPartitionByOid).equalToWhenPresent(record::getDbPartitionByOid)
                .set(enable).equalToWhenPresent(record::getEnable)
                .set(isCompile).equalToWhenPresent(record::getIsCompile)
                .set(isUnusable).equalToWhenPresent(record::getIsUnusable)
                .set(monitoringUsage).equalToWhenPresent(record::getMonitoringUsage)
                .set(nameOid).equalToWhenPresent(record::getNameOid)
                .set(parallelOid).equalToWhenPresent(record::getParallelOid)
                .set(rebuild).equalToWhenPresent(record::getRebuild)
                .set(renameToOid).equalToWhenPresent(record::getRenameToOid)
                .set(tableOid).equalToWhenPresent(record::getTableOid);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_index_statement")
    default int updateByPrimaryKey(SqlAlterIndexStatement record) {
        return update(c ->
            c.set(dbPartitionByOid).equalTo(record::getDbPartitionByOid)
            .set(enable).equalTo(record::getEnable)
            .set(isCompile).equalTo(record::getIsCompile)
            .set(isUnusable).equalTo(record::getIsUnusable)
            .set(monitoringUsage).equalTo(record::getMonitoringUsage)
            .set(nameOid).equalTo(record::getNameOid)
            .set(parallelOid).equalTo(record::getParallelOid)
            .set(rebuild).equalTo(record::getRebuild)
            .set(renameToOid).equalTo(record::getRenameToOid)
            .set(tableOid).equalTo(record::getTableOid)
            .where(oid, isEqualTo(record::getOid))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_index_statement")
    default int updateByPrimaryKeySelective(SqlAlterIndexStatement record) {
        return update(c ->
            c.set(dbPartitionByOid).equalToWhenPresent(record::getDbPartitionByOid)
            .set(enable).equalToWhenPresent(record::getEnable)
            .set(isCompile).equalToWhenPresent(record::getIsCompile)
            .set(isUnusable).equalToWhenPresent(record::getIsUnusable)
            .set(monitoringUsage).equalToWhenPresent(record::getMonitoringUsage)
            .set(nameOid).equalToWhenPresent(record::getNameOid)
            .set(parallelOid).equalToWhenPresent(record::getParallelOid)
            .set(rebuild).equalToWhenPresent(record::getRebuild)
            .set(renameToOid).equalToWhenPresent(record::getRenameToOid)
            .set(tableOid).equalToWhenPresent(record::getTableOid)
            .where(oid, isEqualTo(record::getOid))
        );
    }
}