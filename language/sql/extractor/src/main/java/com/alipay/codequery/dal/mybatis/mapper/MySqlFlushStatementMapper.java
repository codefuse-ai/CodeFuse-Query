package com.alipay.codequery.dal.mybatis.mapper;

import static com.alipay.codequery.dal.mybatis.mapper.MySqlFlushStatementDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.alipay.codequery.dal.mybatis.domain.MySqlFlushStatement;
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
public interface MySqlFlushStatementMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_flush_statement")
    BasicColumn[] selectList = BasicColumn.columnList(oid, isBinaryLogs, isDesKeyFile, isEngineLogs, isErrorLogs, isForExport, isGeneralLogs, isHots, isLocal, isLogs, isMaster, isNoWriteToBinlog, isOptimizerCosts, isPrivileges, isQueryCache, isRelayLogs, isSlowLogs, isStatus, isTableOption, isUserResources, isWithReadLock, relayLogsForChannelOid, versionOid);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_flush_statement")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_flush_statement")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_flush_statement")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<MySqlFlushStatement> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_flush_statement")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<MySqlFlushStatement> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_flush_statement")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="is_binary_logs", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_des_key_file", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_engine_logs", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_error_logs", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_for_export", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_general_logs", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_hots", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_local", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_logs", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_master", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_no_write_to_binlog", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_optimizer_costs", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_privileges", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_query_cache", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_relay_logs", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_slow_logs", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_status", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_table_option", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_user_resources", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_with_read_lock", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="relay_logs_for_channel_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="version_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT)
    })
    Optional<MySqlFlushStatement> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_flush_statement")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="is_binary_logs", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_des_key_file", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_engine_logs", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_error_logs", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_for_export", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_general_logs", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_hots", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_local", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_logs", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_master", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_no_write_to_binlog", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_optimizer_costs", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_privileges", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_query_cache", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_relay_logs", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_slow_logs", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_status", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_table_option", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_user_resources", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_with_read_lock", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="relay_logs_for_channel_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="version_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT)
    })
    List<MySqlFlushStatement> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_flush_statement")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_flush_statement")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, mySqlFlushStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_flush_statement")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, mySqlFlushStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_flush_statement")
    default int deleteByPrimaryKey(Long oid_) {
        return delete(c -> 
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_flush_statement")
    default int insert(MySqlFlushStatement record) {
        return MyBatis3Utils.insert(this::insert, record, mySqlFlushStatement, c ->
            c.map(oid).toProperty("oid")
            .map(isBinaryLogs).toProperty("isBinaryLogs")
            .map(isDesKeyFile).toProperty("isDesKeyFile")
            .map(isEngineLogs).toProperty("isEngineLogs")
            .map(isErrorLogs).toProperty("isErrorLogs")
            .map(isForExport).toProperty("isForExport")
            .map(isGeneralLogs).toProperty("isGeneralLogs")
            .map(isHots).toProperty("isHots")
            .map(isLocal).toProperty("isLocal")
            .map(isLogs).toProperty("isLogs")
            .map(isMaster).toProperty("isMaster")
            .map(isNoWriteToBinlog).toProperty("isNoWriteToBinlog")
            .map(isOptimizerCosts).toProperty("isOptimizerCosts")
            .map(isPrivileges).toProperty("isPrivileges")
            .map(isQueryCache).toProperty("isQueryCache")
            .map(isRelayLogs).toProperty("isRelayLogs")
            .map(isSlowLogs).toProperty("isSlowLogs")
            .map(isStatus).toProperty("isStatus")
            .map(isTableOption).toProperty("isTableOption")
            .map(isUserResources).toProperty("isUserResources")
            .map(isWithReadLock).toProperty("isWithReadLock")
            .map(relayLogsForChannelOid).toProperty("relayLogsForChannelOid")
            .map(versionOid).toProperty("versionOid")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_flush_statement")
    default int insertMultiple(Collection<MySqlFlushStatement> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, mySqlFlushStatement, c ->
            c.map(oid).toProperty("oid")
            .map(isBinaryLogs).toProperty("isBinaryLogs")
            .map(isDesKeyFile).toProperty("isDesKeyFile")
            .map(isEngineLogs).toProperty("isEngineLogs")
            .map(isErrorLogs).toProperty("isErrorLogs")
            .map(isForExport).toProperty("isForExport")
            .map(isGeneralLogs).toProperty("isGeneralLogs")
            .map(isHots).toProperty("isHots")
            .map(isLocal).toProperty("isLocal")
            .map(isLogs).toProperty("isLogs")
            .map(isMaster).toProperty("isMaster")
            .map(isNoWriteToBinlog).toProperty("isNoWriteToBinlog")
            .map(isOptimizerCosts).toProperty("isOptimizerCosts")
            .map(isPrivileges).toProperty("isPrivileges")
            .map(isQueryCache).toProperty("isQueryCache")
            .map(isRelayLogs).toProperty("isRelayLogs")
            .map(isSlowLogs).toProperty("isSlowLogs")
            .map(isStatus).toProperty("isStatus")
            .map(isTableOption).toProperty("isTableOption")
            .map(isUserResources).toProperty("isUserResources")
            .map(isWithReadLock).toProperty("isWithReadLock")
            .map(relayLogsForChannelOid).toProperty("relayLogsForChannelOid")
            .map(versionOid).toProperty("versionOid")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_flush_statement")
    default int insertSelective(MySqlFlushStatement record) {
        return MyBatis3Utils.insert(this::insert, record, mySqlFlushStatement, c ->
            c.map(oid).toPropertyWhenPresent("oid", record::getOid)
            .map(isBinaryLogs).toPropertyWhenPresent("isBinaryLogs", record::getIsBinaryLogs)
            .map(isDesKeyFile).toPropertyWhenPresent("isDesKeyFile", record::getIsDesKeyFile)
            .map(isEngineLogs).toPropertyWhenPresent("isEngineLogs", record::getIsEngineLogs)
            .map(isErrorLogs).toPropertyWhenPresent("isErrorLogs", record::getIsErrorLogs)
            .map(isForExport).toPropertyWhenPresent("isForExport", record::getIsForExport)
            .map(isGeneralLogs).toPropertyWhenPresent("isGeneralLogs", record::getIsGeneralLogs)
            .map(isHots).toPropertyWhenPresent("isHots", record::getIsHots)
            .map(isLocal).toPropertyWhenPresent("isLocal", record::getIsLocal)
            .map(isLogs).toPropertyWhenPresent("isLogs", record::getIsLogs)
            .map(isMaster).toPropertyWhenPresent("isMaster", record::getIsMaster)
            .map(isNoWriteToBinlog).toPropertyWhenPresent("isNoWriteToBinlog", record::getIsNoWriteToBinlog)
            .map(isOptimizerCosts).toPropertyWhenPresent("isOptimizerCosts", record::getIsOptimizerCosts)
            .map(isPrivileges).toPropertyWhenPresent("isPrivileges", record::getIsPrivileges)
            .map(isQueryCache).toPropertyWhenPresent("isQueryCache", record::getIsQueryCache)
            .map(isRelayLogs).toPropertyWhenPresent("isRelayLogs", record::getIsRelayLogs)
            .map(isSlowLogs).toPropertyWhenPresent("isSlowLogs", record::getIsSlowLogs)
            .map(isStatus).toPropertyWhenPresent("isStatus", record::getIsStatus)
            .map(isTableOption).toPropertyWhenPresent("isTableOption", record::getIsTableOption)
            .map(isUserResources).toPropertyWhenPresent("isUserResources", record::getIsUserResources)
            .map(isWithReadLock).toPropertyWhenPresent("isWithReadLock", record::getIsWithReadLock)
            .map(relayLogsForChannelOid).toPropertyWhenPresent("relayLogsForChannelOid", record::getRelayLogsForChannelOid)
            .map(versionOid).toPropertyWhenPresent("versionOid", record::getVersionOid)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_flush_statement")
    default Optional<MySqlFlushStatement> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, mySqlFlushStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_flush_statement")
    default List<MySqlFlushStatement> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, mySqlFlushStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_flush_statement")
    default List<MySqlFlushStatement> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, mySqlFlushStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_flush_statement")
    default Optional<MySqlFlushStatement> selectByPrimaryKey(Long oid_) {
        return selectOne(c ->
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_flush_statement")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, mySqlFlushStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_flush_statement")
    static UpdateDSL<UpdateModel> updateAllColumns(MySqlFlushStatement record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalTo(record::getOid)
                .set(isBinaryLogs).equalTo(record::getIsBinaryLogs)
                .set(isDesKeyFile).equalTo(record::getIsDesKeyFile)
                .set(isEngineLogs).equalTo(record::getIsEngineLogs)
                .set(isErrorLogs).equalTo(record::getIsErrorLogs)
                .set(isForExport).equalTo(record::getIsForExport)
                .set(isGeneralLogs).equalTo(record::getIsGeneralLogs)
                .set(isHots).equalTo(record::getIsHots)
                .set(isLocal).equalTo(record::getIsLocal)
                .set(isLogs).equalTo(record::getIsLogs)
                .set(isMaster).equalTo(record::getIsMaster)
                .set(isNoWriteToBinlog).equalTo(record::getIsNoWriteToBinlog)
                .set(isOptimizerCosts).equalTo(record::getIsOptimizerCosts)
                .set(isPrivileges).equalTo(record::getIsPrivileges)
                .set(isQueryCache).equalTo(record::getIsQueryCache)
                .set(isRelayLogs).equalTo(record::getIsRelayLogs)
                .set(isSlowLogs).equalTo(record::getIsSlowLogs)
                .set(isStatus).equalTo(record::getIsStatus)
                .set(isTableOption).equalTo(record::getIsTableOption)
                .set(isUserResources).equalTo(record::getIsUserResources)
                .set(isWithReadLock).equalTo(record::getIsWithReadLock)
                .set(relayLogsForChannelOid).equalTo(record::getRelayLogsForChannelOid)
                .set(versionOid).equalTo(record::getVersionOid);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_flush_statement")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(MySqlFlushStatement record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalToWhenPresent(record::getOid)
                .set(isBinaryLogs).equalToWhenPresent(record::getIsBinaryLogs)
                .set(isDesKeyFile).equalToWhenPresent(record::getIsDesKeyFile)
                .set(isEngineLogs).equalToWhenPresent(record::getIsEngineLogs)
                .set(isErrorLogs).equalToWhenPresent(record::getIsErrorLogs)
                .set(isForExport).equalToWhenPresent(record::getIsForExport)
                .set(isGeneralLogs).equalToWhenPresent(record::getIsGeneralLogs)
                .set(isHots).equalToWhenPresent(record::getIsHots)
                .set(isLocal).equalToWhenPresent(record::getIsLocal)
                .set(isLogs).equalToWhenPresent(record::getIsLogs)
                .set(isMaster).equalToWhenPresent(record::getIsMaster)
                .set(isNoWriteToBinlog).equalToWhenPresent(record::getIsNoWriteToBinlog)
                .set(isOptimizerCosts).equalToWhenPresent(record::getIsOptimizerCosts)
                .set(isPrivileges).equalToWhenPresent(record::getIsPrivileges)
                .set(isQueryCache).equalToWhenPresent(record::getIsQueryCache)
                .set(isRelayLogs).equalToWhenPresent(record::getIsRelayLogs)
                .set(isSlowLogs).equalToWhenPresent(record::getIsSlowLogs)
                .set(isStatus).equalToWhenPresent(record::getIsStatus)
                .set(isTableOption).equalToWhenPresent(record::getIsTableOption)
                .set(isUserResources).equalToWhenPresent(record::getIsUserResources)
                .set(isWithReadLock).equalToWhenPresent(record::getIsWithReadLock)
                .set(relayLogsForChannelOid).equalToWhenPresent(record::getRelayLogsForChannelOid)
                .set(versionOid).equalToWhenPresent(record::getVersionOid);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_flush_statement")
    default int updateByPrimaryKey(MySqlFlushStatement record) {
        return update(c ->
            c.set(isBinaryLogs).equalTo(record::getIsBinaryLogs)
            .set(isDesKeyFile).equalTo(record::getIsDesKeyFile)
            .set(isEngineLogs).equalTo(record::getIsEngineLogs)
            .set(isErrorLogs).equalTo(record::getIsErrorLogs)
            .set(isForExport).equalTo(record::getIsForExport)
            .set(isGeneralLogs).equalTo(record::getIsGeneralLogs)
            .set(isHots).equalTo(record::getIsHots)
            .set(isLocal).equalTo(record::getIsLocal)
            .set(isLogs).equalTo(record::getIsLogs)
            .set(isMaster).equalTo(record::getIsMaster)
            .set(isNoWriteToBinlog).equalTo(record::getIsNoWriteToBinlog)
            .set(isOptimizerCosts).equalTo(record::getIsOptimizerCosts)
            .set(isPrivileges).equalTo(record::getIsPrivileges)
            .set(isQueryCache).equalTo(record::getIsQueryCache)
            .set(isRelayLogs).equalTo(record::getIsRelayLogs)
            .set(isSlowLogs).equalTo(record::getIsSlowLogs)
            .set(isStatus).equalTo(record::getIsStatus)
            .set(isTableOption).equalTo(record::getIsTableOption)
            .set(isUserResources).equalTo(record::getIsUserResources)
            .set(isWithReadLock).equalTo(record::getIsWithReadLock)
            .set(relayLogsForChannelOid).equalTo(record::getRelayLogsForChannelOid)
            .set(versionOid).equalTo(record::getVersionOid)
            .where(oid, isEqualTo(record::getOid))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_flush_statement")
    default int updateByPrimaryKeySelective(MySqlFlushStatement record) {
        return update(c ->
            c.set(isBinaryLogs).equalToWhenPresent(record::getIsBinaryLogs)
            .set(isDesKeyFile).equalToWhenPresent(record::getIsDesKeyFile)
            .set(isEngineLogs).equalToWhenPresent(record::getIsEngineLogs)
            .set(isErrorLogs).equalToWhenPresent(record::getIsErrorLogs)
            .set(isForExport).equalToWhenPresent(record::getIsForExport)
            .set(isGeneralLogs).equalToWhenPresent(record::getIsGeneralLogs)
            .set(isHots).equalToWhenPresent(record::getIsHots)
            .set(isLocal).equalToWhenPresent(record::getIsLocal)
            .set(isLogs).equalToWhenPresent(record::getIsLogs)
            .set(isMaster).equalToWhenPresent(record::getIsMaster)
            .set(isNoWriteToBinlog).equalToWhenPresent(record::getIsNoWriteToBinlog)
            .set(isOptimizerCosts).equalToWhenPresent(record::getIsOptimizerCosts)
            .set(isPrivileges).equalToWhenPresent(record::getIsPrivileges)
            .set(isQueryCache).equalToWhenPresent(record::getIsQueryCache)
            .set(isRelayLogs).equalToWhenPresent(record::getIsRelayLogs)
            .set(isSlowLogs).equalToWhenPresent(record::getIsSlowLogs)
            .set(isStatus).equalToWhenPresent(record::getIsStatus)
            .set(isTableOption).equalToWhenPresent(record::getIsTableOption)
            .set(isUserResources).equalToWhenPresent(record::getIsUserResources)
            .set(isWithReadLock).equalToWhenPresent(record::getIsWithReadLock)
            .set(relayLogsForChannelOid).equalToWhenPresent(record::getRelayLogsForChannelOid)
            .set(versionOid).equalToWhenPresent(record::getVersionOid)
            .where(oid, isEqualTo(record::getOid))
        );
    }
}