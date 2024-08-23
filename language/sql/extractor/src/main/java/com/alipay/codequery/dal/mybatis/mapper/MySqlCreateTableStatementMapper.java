package com.alipay.codequery.dal.mybatis.mapper;

import static com.alipay.codequery.dal.mybatis.mapper.MySqlCreateTableStatementDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.alipay.codequery.dal.mybatis.domain.MySqlCreateTableStatement;
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
public interface MySqlCreateTableStatementMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_create_table_statement")
    BasicColumn[] selectList = BasicColumn.columnList(oid, archiveByOid, dbPartitionByOid, dbPartitionsOid, dbpartitionsOid, distributeByTypeOid, engineOid, extPartitionOid, isBroadCast, storedByOid, tableGroupOid, tablePartitionByOid, tablePartitionsOid, tbpartitionsOid, with, withData);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_create_table_statement")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_create_table_statement")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_create_table_statement")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<MySqlCreateTableStatement> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_create_table_statement")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<MySqlCreateTableStatement> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_create_table_statement")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="archive_by_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="db_partition_by_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="db_partitions_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="dbpartitions_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="distribute_by_type_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="engine_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="ext_partition_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_broad_cast", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="stored_by_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="table_group_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="table_partition_by_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="table_partitions_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="tbpartitions_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="with", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="with_data", javaType=Integer.class, jdbcType=JdbcType.BIGINT)
    })
    Optional<MySqlCreateTableStatement> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_create_table_statement")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="archive_by_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="db_partition_by_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="db_partitions_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="dbpartitions_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="distribute_by_type_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="engine_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="ext_partition_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_broad_cast", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="stored_by_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="table_group_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="table_partition_by_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="table_partitions_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="tbpartitions_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="with", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="with_data", javaType=Integer.class, jdbcType=JdbcType.BIGINT)
    })
    List<MySqlCreateTableStatement> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_create_table_statement")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_create_table_statement")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, mySqlCreateTableStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_create_table_statement")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, mySqlCreateTableStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_create_table_statement")
    default int deleteByPrimaryKey(Long oid_) {
        return delete(c -> 
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_create_table_statement")
    default int insert(MySqlCreateTableStatement record) {
        return MyBatis3Utils.insert(this::insert, record, mySqlCreateTableStatement, c ->
            c.map(oid).toProperty("oid")
            .map(archiveByOid).toProperty("archiveByOid")
            .map(dbPartitionByOid).toProperty("dbPartitionByOid")
            .map(dbPartitionsOid).toProperty("dbPartitionsOid")
            .map(dbpartitionsOid).toProperty("dbpartitionsOid")
            .map(distributeByTypeOid).toProperty("distributeByTypeOid")
            .map(engineOid).toProperty("engineOid")
            .map(extPartitionOid).toProperty("extPartitionOid")
            .map(isBroadCast).toProperty("isBroadCast")
            .map(storedByOid).toProperty("storedByOid")
            .map(tableGroupOid).toProperty("tableGroupOid")
            .map(tablePartitionByOid).toProperty("tablePartitionByOid")
            .map(tablePartitionsOid).toProperty("tablePartitionsOid")
            .map(tbpartitionsOid).toProperty("tbpartitionsOid")
            .map(with).toProperty("with")
            .map(withData).toProperty("withData")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_create_table_statement")
    default int insertMultiple(Collection<MySqlCreateTableStatement> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, mySqlCreateTableStatement, c ->
            c.map(oid).toProperty("oid")
            .map(archiveByOid).toProperty("archiveByOid")
            .map(dbPartitionByOid).toProperty("dbPartitionByOid")
            .map(dbPartitionsOid).toProperty("dbPartitionsOid")
            .map(dbpartitionsOid).toProperty("dbpartitionsOid")
            .map(distributeByTypeOid).toProperty("distributeByTypeOid")
            .map(engineOid).toProperty("engineOid")
            .map(extPartitionOid).toProperty("extPartitionOid")
            .map(isBroadCast).toProperty("isBroadCast")
            .map(storedByOid).toProperty("storedByOid")
            .map(tableGroupOid).toProperty("tableGroupOid")
            .map(tablePartitionByOid).toProperty("tablePartitionByOid")
            .map(tablePartitionsOid).toProperty("tablePartitionsOid")
            .map(tbpartitionsOid).toProperty("tbpartitionsOid")
            .map(with).toProperty("with")
            .map(withData).toProperty("withData")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_create_table_statement")
    default int insertSelective(MySqlCreateTableStatement record) {
        return MyBatis3Utils.insert(this::insert, record, mySqlCreateTableStatement, c ->
            c.map(oid).toPropertyWhenPresent("oid", record::getOid)
            .map(archiveByOid).toPropertyWhenPresent("archiveByOid", record::getArchiveByOid)
            .map(dbPartitionByOid).toPropertyWhenPresent("dbPartitionByOid", record::getDbPartitionByOid)
            .map(dbPartitionsOid).toPropertyWhenPresent("dbPartitionsOid", record::getDbPartitionsOid)
            .map(dbpartitionsOid).toPropertyWhenPresent("dbpartitionsOid", record::getDbpartitionsOid)
            .map(distributeByTypeOid).toPropertyWhenPresent("distributeByTypeOid", record::getDistributeByTypeOid)
            .map(engineOid).toPropertyWhenPresent("engineOid", record::getEngineOid)
            .map(extPartitionOid).toPropertyWhenPresent("extPartitionOid", record::getExtPartitionOid)
            .map(isBroadCast).toPropertyWhenPresent("isBroadCast", record::getIsBroadCast)
            .map(storedByOid).toPropertyWhenPresent("storedByOid", record::getStoredByOid)
            .map(tableGroupOid).toPropertyWhenPresent("tableGroupOid", record::getTableGroupOid)
            .map(tablePartitionByOid).toPropertyWhenPresent("tablePartitionByOid", record::getTablePartitionByOid)
            .map(tablePartitionsOid).toPropertyWhenPresent("tablePartitionsOid", record::getTablePartitionsOid)
            .map(tbpartitionsOid).toPropertyWhenPresent("tbpartitionsOid", record::getTbpartitionsOid)
            .map(with).toPropertyWhenPresent("with", record::getWith)
            .map(withData).toPropertyWhenPresent("withData", record::getWithData)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_create_table_statement")
    default Optional<MySqlCreateTableStatement> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, mySqlCreateTableStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_create_table_statement")
    default List<MySqlCreateTableStatement> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, mySqlCreateTableStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_create_table_statement")
    default List<MySqlCreateTableStatement> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, mySqlCreateTableStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_create_table_statement")
    default Optional<MySqlCreateTableStatement> selectByPrimaryKey(Long oid_) {
        return selectOne(c ->
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_create_table_statement")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, mySqlCreateTableStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_create_table_statement")
    static UpdateDSL<UpdateModel> updateAllColumns(MySqlCreateTableStatement record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalTo(record::getOid)
                .set(archiveByOid).equalTo(record::getArchiveByOid)
                .set(dbPartitionByOid).equalTo(record::getDbPartitionByOid)
                .set(dbPartitionsOid).equalTo(record::getDbPartitionsOid)
                .set(dbpartitionsOid).equalTo(record::getDbpartitionsOid)
                .set(distributeByTypeOid).equalTo(record::getDistributeByTypeOid)
                .set(engineOid).equalTo(record::getEngineOid)
                .set(extPartitionOid).equalTo(record::getExtPartitionOid)
                .set(isBroadCast).equalTo(record::getIsBroadCast)
                .set(storedByOid).equalTo(record::getStoredByOid)
                .set(tableGroupOid).equalTo(record::getTableGroupOid)
                .set(tablePartitionByOid).equalTo(record::getTablePartitionByOid)
                .set(tablePartitionsOid).equalTo(record::getTablePartitionsOid)
                .set(tbpartitionsOid).equalTo(record::getTbpartitionsOid)
                .set(with).equalTo(record::getWith)
                .set(withData).equalTo(record::getWithData);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_create_table_statement")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(MySqlCreateTableStatement record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalToWhenPresent(record::getOid)
                .set(archiveByOid).equalToWhenPresent(record::getArchiveByOid)
                .set(dbPartitionByOid).equalToWhenPresent(record::getDbPartitionByOid)
                .set(dbPartitionsOid).equalToWhenPresent(record::getDbPartitionsOid)
                .set(dbpartitionsOid).equalToWhenPresent(record::getDbpartitionsOid)
                .set(distributeByTypeOid).equalToWhenPresent(record::getDistributeByTypeOid)
                .set(engineOid).equalToWhenPresent(record::getEngineOid)
                .set(extPartitionOid).equalToWhenPresent(record::getExtPartitionOid)
                .set(isBroadCast).equalToWhenPresent(record::getIsBroadCast)
                .set(storedByOid).equalToWhenPresent(record::getStoredByOid)
                .set(tableGroupOid).equalToWhenPresent(record::getTableGroupOid)
                .set(tablePartitionByOid).equalToWhenPresent(record::getTablePartitionByOid)
                .set(tablePartitionsOid).equalToWhenPresent(record::getTablePartitionsOid)
                .set(tbpartitionsOid).equalToWhenPresent(record::getTbpartitionsOid)
                .set(with).equalToWhenPresent(record::getWith)
                .set(withData).equalToWhenPresent(record::getWithData);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_create_table_statement")
    default int updateByPrimaryKey(MySqlCreateTableStatement record) {
        return update(c ->
            c.set(archiveByOid).equalTo(record::getArchiveByOid)
            .set(dbPartitionByOid).equalTo(record::getDbPartitionByOid)
            .set(dbPartitionsOid).equalTo(record::getDbPartitionsOid)
            .set(dbpartitionsOid).equalTo(record::getDbpartitionsOid)
            .set(distributeByTypeOid).equalTo(record::getDistributeByTypeOid)
            .set(engineOid).equalTo(record::getEngineOid)
            .set(extPartitionOid).equalTo(record::getExtPartitionOid)
            .set(isBroadCast).equalTo(record::getIsBroadCast)
            .set(storedByOid).equalTo(record::getStoredByOid)
            .set(tableGroupOid).equalTo(record::getTableGroupOid)
            .set(tablePartitionByOid).equalTo(record::getTablePartitionByOid)
            .set(tablePartitionsOid).equalTo(record::getTablePartitionsOid)
            .set(tbpartitionsOid).equalTo(record::getTbpartitionsOid)
            .set(with).equalTo(record::getWith)
            .set(withData).equalTo(record::getWithData)
            .where(oid, isEqualTo(record::getOid))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_create_table_statement")
    default int updateByPrimaryKeySelective(MySqlCreateTableStatement record) {
        return update(c ->
            c.set(archiveByOid).equalToWhenPresent(record::getArchiveByOid)
            .set(dbPartitionByOid).equalToWhenPresent(record::getDbPartitionByOid)
            .set(dbPartitionsOid).equalToWhenPresent(record::getDbPartitionsOid)
            .set(dbpartitionsOid).equalToWhenPresent(record::getDbpartitionsOid)
            .set(distributeByTypeOid).equalToWhenPresent(record::getDistributeByTypeOid)
            .set(engineOid).equalToWhenPresent(record::getEngineOid)
            .set(extPartitionOid).equalToWhenPresent(record::getExtPartitionOid)
            .set(isBroadCast).equalToWhenPresent(record::getIsBroadCast)
            .set(storedByOid).equalToWhenPresent(record::getStoredByOid)
            .set(tableGroupOid).equalToWhenPresent(record::getTableGroupOid)
            .set(tablePartitionByOid).equalToWhenPresent(record::getTablePartitionByOid)
            .set(tablePartitionsOid).equalToWhenPresent(record::getTablePartitionsOid)
            .set(tbpartitionsOid).equalToWhenPresent(record::getTbpartitionsOid)
            .set(with).equalToWhenPresent(record::getWith)
            .set(withData).equalToWhenPresent(record::getWithData)
            .where(oid, isEqualTo(record::getOid))
        );
    }
}