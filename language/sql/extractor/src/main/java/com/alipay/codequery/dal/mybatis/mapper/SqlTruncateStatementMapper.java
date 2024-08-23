package com.alipay.codequery.dal.mybatis.mapper;

import static com.alipay.codequery.dal.mybatis.mapper.SqlTruncateStatementDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.alipay.codequery.dal.mybatis.domain.SqlTruncateStatement;
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
public interface SqlTruncateStatementMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_truncate_statement")
    BasicColumn[] selectList = BasicColumn.columnList(oid, cascade, isContinueIdentity, isDropStorage, isIfExists, isIgnoreDeleteTriggers, isImmediate, isOnly, isPartitionAll, isPurgeSnapshotLog, isRestrictWhenDeleteTriggers, isReuseStorage, restartIdentity);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_truncate_statement")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_truncate_statement")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_truncate_statement")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<SqlTruncateStatement> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_truncate_statement")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<SqlTruncateStatement> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_truncate_statement")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="cascade", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_continue_identity", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_drop_storage", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_if_exists", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_ignore_delete_triggers", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_immediate", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_only", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_partition_all", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_purge_snapshot_log", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_restrict_when_delete_triggers", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_reuse_storage", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="restart_identity", javaType=Integer.class, jdbcType=JdbcType.BIGINT)
    })
    Optional<SqlTruncateStatement> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_truncate_statement")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="cascade", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_continue_identity", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_drop_storage", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_if_exists", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_ignore_delete_triggers", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_immediate", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_only", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_partition_all", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_purge_snapshot_log", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_restrict_when_delete_triggers", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_reuse_storage", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="restart_identity", javaType=Integer.class, jdbcType=JdbcType.BIGINT)
    })
    List<SqlTruncateStatement> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_truncate_statement")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_truncate_statement")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, sqlTruncateStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_truncate_statement")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, sqlTruncateStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_truncate_statement")
    default int deleteByPrimaryKey(Long oid_) {
        return delete(c -> 
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_truncate_statement")
    default int insert(SqlTruncateStatement record) {
        return MyBatis3Utils.insert(this::insert, record, sqlTruncateStatement, c ->
            c.map(oid).toProperty("oid")
            .map(cascade).toProperty("cascade")
            .map(isContinueIdentity).toProperty("isContinueIdentity")
            .map(isDropStorage).toProperty("isDropStorage")
            .map(isIfExists).toProperty("isIfExists")
            .map(isIgnoreDeleteTriggers).toProperty("isIgnoreDeleteTriggers")
            .map(isImmediate).toProperty("isImmediate")
            .map(isOnly).toProperty("isOnly")
            .map(isPartitionAll).toProperty("isPartitionAll")
            .map(isPurgeSnapshotLog).toProperty("isPurgeSnapshotLog")
            .map(isRestrictWhenDeleteTriggers).toProperty("isRestrictWhenDeleteTriggers")
            .map(isReuseStorage).toProperty("isReuseStorage")
            .map(restartIdentity).toProperty("restartIdentity")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_truncate_statement")
    default int insertMultiple(Collection<SqlTruncateStatement> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, sqlTruncateStatement, c ->
            c.map(oid).toProperty("oid")
            .map(cascade).toProperty("cascade")
            .map(isContinueIdentity).toProperty("isContinueIdentity")
            .map(isDropStorage).toProperty("isDropStorage")
            .map(isIfExists).toProperty("isIfExists")
            .map(isIgnoreDeleteTriggers).toProperty("isIgnoreDeleteTriggers")
            .map(isImmediate).toProperty("isImmediate")
            .map(isOnly).toProperty("isOnly")
            .map(isPartitionAll).toProperty("isPartitionAll")
            .map(isPurgeSnapshotLog).toProperty("isPurgeSnapshotLog")
            .map(isRestrictWhenDeleteTriggers).toProperty("isRestrictWhenDeleteTriggers")
            .map(isReuseStorage).toProperty("isReuseStorage")
            .map(restartIdentity).toProperty("restartIdentity")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_truncate_statement")
    default int insertSelective(SqlTruncateStatement record) {
        return MyBatis3Utils.insert(this::insert, record, sqlTruncateStatement, c ->
            c.map(oid).toPropertyWhenPresent("oid", record::getOid)
            .map(cascade).toPropertyWhenPresent("cascade", record::getCascade)
            .map(isContinueIdentity).toPropertyWhenPresent("isContinueIdentity", record::getIsContinueIdentity)
            .map(isDropStorage).toPropertyWhenPresent("isDropStorage", record::getIsDropStorage)
            .map(isIfExists).toPropertyWhenPresent("isIfExists", record::getIsIfExists)
            .map(isIgnoreDeleteTriggers).toPropertyWhenPresent("isIgnoreDeleteTriggers", record::getIsIgnoreDeleteTriggers)
            .map(isImmediate).toPropertyWhenPresent("isImmediate", record::getIsImmediate)
            .map(isOnly).toPropertyWhenPresent("isOnly", record::getIsOnly)
            .map(isPartitionAll).toPropertyWhenPresent("isPartitionAll", record::getIsPartitionAll)
            .map(isPurgeSnapshotLog).toPropertyWhenPresent("isPurgeSnapshotLog", record::getIsPurgeSnapshotLog)
            .map(isRestrictWhenDeleteTriggers).toPropertyWhenPresent("isRestrictWhenDeleteTriggers", record::getIsRestrictWhenDeleteTriggers)
            .map(isReuseStorage).toPropertyWhenPresent("isReuseStorage", record::getIsReuseStorage)
            .map(restartIdentity).toPropertyWhenPresent("restartIdentity", record::getRestartIdentity)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_truncate_statement")
    default Optional<SqlTruncateStatement> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, sqlTruncateStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_truncate_statement")
    default List<SqlTruncateStatement> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, sqlTruncateStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_truncate_statement")
    default List<SqlTruncateStatement> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, sqlTruncateStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_truncate_statement")
    default Optional<SqlTruncateStatement> selectByPrimaryKey(Long oid_) {
        return selectOne(c ->
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_truncate_statement")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, sqlTruncateStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_truncate_statement")
    static UpdateDSL<UpdateModel> updateAllColumns(SqlTruncateStatement record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalTo(record::getOid)
                .set(cascade).equalTo(record::getCascade)
                .set(isContinueIdentity).equalTo(record::getIsContinueIdentity)
                .set(isDropStorage).equalTo(record::getIsDropStorage)
                .set(isIfExists).equalTo(record::getIsIfExists)
                .set(isIgnoreDeleteTriggers).equalTo(record::getIsIgnoreDeleteTriggers)
                .set(isImmediate).equalTo(record::getIsImmediate)
                .set(isOnly).equalTo(record::getIsOnly)
                .set(isPartitionAll).equalTo(record::getIsPartitionAll)
                .set(isPurgeSnapshotLog).equalTo(record::getIsPurgeSnapshotLog)
                .set(isRestrictWhenDeleteTriggers).equalTo(record::getIsRestrictWhenDeleteTriggers)
                .set(isReuseStorage).equalTo(record::getIsReuseStorage)
                .set(restartIdentity).equalTo(record::getRestartIdentity);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_truncate_statement")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(SqlTruncateStatement record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalToWhenPresent(record::getOid)
                .set(cascade).equalToWhenPresent(record::getCascade)
                .set(isContinueIdentity).equalToWhenPresent(record::getIsContinueIdentity)
                .set(isDropStorage).equalToWhenPresent(record::getIsDropStorage)
                .set(isIfExists).equalToWhenPresent(record::getIsIfExists)
                .set(isIgnoreDeleteTriggers).equalToWhenPresent(record::getIsIgnoreDeleteTriggers)
                .set(isImmediate).equalToWhenPresent(record::getIsImmediate)
                .set(isOnly).equalToWhenPresent(record::getIsOnly)
                .set(isPartitionAll).equalToWhenPresent(record::getIsPartitionAll)
                .set(isPurgeSnapshotLog).equalToWhenPresent(record::getIsPurgeSnapshotLog)
                .set(isRestrictWhenDeleteTriggers).equalToWhenPresent(record::getIsRestrictWhenDeleteTriggers)
                .set(isReuseStorage).equalToWhenPresent(record::getIsReuseStorage)
                .set(restartIdentity).equalToWhenPresent(record::getRestartIdentity);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_truncate_statement")
    default int updateByPrimaryKey(SqlTruncateStatement record) {
        return update(c ->
            c.set(cascade).equalTo(record::getCascade)
            .set(isContinueIdentity).equalTo(record::getIsContinueIdentity)
            .set(isDropStorage).equalTo(record::getIsDropStorage)
            .set(isIfExists).equalTo(record::getIsIfExists)
            .set(isIgnoreDeleteTriggers).equalTo(record::getIsIgnoreDeleteTriggers)
            .set(isImmediate).equalTo(record::getIsImmediate)
            .set(isOnly).equalTo(record::getIsOnly)
            .set(isPartitionAll).equalTo(record::getIsPartitionAll)
            .set(isPurgeSnapshotLog).equalTo(record::getIsPurgeSnapshotLog)
            .set(isRestrictWhenDeleteTriggers).equalTo(record::getIsRestrictWhenDeleteTriggers)
            .set(isReuseStorage).equalTo(record::getIsReuseStorage)
            .set(restartIdentity).equalTo(record::getRestartIdentity)
            .where(oid, isEqualTo(record::getOid))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_truncate_statement")
    default int updateByPrimaryKeySelective(SqlTruncateStatement record) {
        return update(c ->
            c.set(cascade).equalToWhenPresent(record::getCascade)
            .set(isContinueIdentity).equalToWhenPresent(record::getIsContinueIdentity)
            .set(isDropStorage).equalToWhenPresent(record::getIsDropStorage)
            .set(isIfExists).equalToWhenPresent(record::getIsIfExists)
            .set(isIgnoreDeleteTriggers).equalToWhenPresent(record::getIsIgnoreDeleteTriggers)
            .set(isImmediate).equalToWhenPresent(record::getIsImmediate)
            .set(isOnly).equalToWhenPresent(record::getIsOnly)
            .set(isPartitionAll).equalToWhenPresent(record::getIsPartitionAll)
            .set(isPurgeSnapshotLog).equalToWhenPresent(record::getIsPurgeSnapshotLog)
            .set(isRestrictWhenDeleteTriggers).equalToWhenPresent(record::getIsRestrictWhenDeleteTriggers)
            .set(isReuseStorage).equalToWhenPresent(record::getIsReuseStorage)
            .set(restartIdentity).equalToWhenPresent(record::getRestartIdentity)
            .where(oid, isEqualTo(record::getOid))
        );
    }
}