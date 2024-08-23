package com.alipay.codequery.dal.mybatis.mapper;

import static com.alipay.codequery.dal.mybatis.mapper.SqlPurgeLogsStatementDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.alipay.codequery.dal.mybatis.domain.SqlPurgeLogsStatement;
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
public interface SqlPurgeLogsStatementMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_purge_logs_statement")
    BasicColumn[] selectList = BasicColumn.columnList(oid, beforeOid, isAll, isBinary, isMaster, toOid);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_purge_logs_statement")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_purge_logs_statement")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_purge_logs_statement")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<SqlPurgeLogsStatement> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_purge_logs_statement")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<SqlPurgeLogsStatement> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_purge_logs_statement")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="before_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_all", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_binary", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_master", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="to_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT)
    })
    Optional<SqlPurgeLogsStatement> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_purge_logs_statement")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="before_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_all", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_binary", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_master", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="to_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT)
    })
    List<SqlPurgeLogsStatement> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_purge_logs_statement")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_purge_logs_statement")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, sqlPurgeLogsStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_purge_logs_statement")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, sqlPurgeLogsStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_purge_logs_statement")
    default int deleteByPrimaryKey(Long oid_) {
        return delete(c -> 
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_purge_logs_statement")
    default int insert(SqlPurgeLogsStatement record) {
        return MyBatis3Utils.insert(this::insert, record, sqlPurgeLogsStatement, c ->
            c.map(oid).toProperty("oid")
            .map(beforeOid).toProperty("beforeOid")
            .map(isAll).toProperty("isAll")
            .map(isBinary).toProperty("isBinary")
            .map(isMaster).toProperty("isMaster")
            .map(toOid).toProperty("toOid")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_purge_logs_statement")
    default int insertMultiple(Collection<SqlPurgeLogsStatement> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, sqlPurgeLogsStatement, c ->
            c.map(oid).toProperty("oid")
            .map(beforeOid).toProperty("beforeOid")
            .map(isAll).toProperty("isAll")
            .map(isBinary).toProperty("isBinary")
            .map(isMaster).toProperty("isMaster")
            .map(toOid).toProperty("toOid")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_purge_logs_statement")
    default int insertSelective(SqlPurgeLogsStatement record) {
        return MyBatis3Utils.insert(this::insert, record, sqlPurgeLogsStatement, c ->
            c.map(oid).toPropertyWhenPresent("oid", record::getOid)
            .map(beforeOid).toPropertyWhenPresent("beforeOid", record::getBeforeOid)
            .map(isAll).toPropertyWhenPresent("isAll", record::getIsAll)
            .map(isBinary).toPropertyWhenPresent("isBinary", record::getIsBinary)
            .map(isMaster).toPropertyWhenPresent("isMaster", record::getIsMaster)
            .map(toOid).toPropertyWhenPresent("toOid", record::getToOid)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_purge_logs_statement")
    default Optional<SqlPurgeLogsStatement> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, sqlPurgeLogsStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_purge_logs_statement")
    default List<SqlPurgeLogsStatement> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, sqlPurgeLogsStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_purge_logs_statement")
    default List<SqlPurgeLogsStatement> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, sqlPurgeLogsStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_purge_logs_statement")
    default Optional<SqlPurgeLogsStatement> selectByPrimaryKey(Long oid_) {
        return selectOne(c ->
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_purge_logs_statement")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, sqlPurgeLogsStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_purge_logs_statement")
    static UpdateDSL<UpdateModel> updateAllColumns(SqlPurgeLogsStatement record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalTo(record::getOid)
                .set(beforeOid).equalTo(record::getBeforeOid)
                .set(isAll).equalTo(record::getIsAll)
                .set(isBinary).equalTo(record::getIsBinary)
                .set(isMaster).equalTo(record::getIsMaster)
                .set(toOid).equalTo(record::getToOid);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_purge_logs_statement")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(SqlPurgeLogsStatement record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalToWhenPresent(record::getOid)
                .set(beforeOid).equalToWhenPresent(record::getBeforeOid)
                .set(isAll).equalToWhenPresent(record::getIsAll)
                .set(isBinary).equalToWhenPresent(record::getIsBinary)
                .set(isMaster).equalToWhenPresent(record::getIsMaster)
                .set(toOid).equalToWhenPresent(record::getToOid);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_purge_logs_statement")
    default int updateByPrimaryKey(SqlPurgeLogsStatement record) {
        return update(c ->
            c.set(beforeOid).equalTo(record::getBeforeOid)
            .set(isAll).equalTo(record::getIsAll)
            .set(isBinary).equalTo(record::getIsBinary)
            .set(isMaster).equalTo(record::getIsMaster)
            .set(toOid).equalTo(record::getToOid)
            .where(oid, isEqualTo(record::getOid))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_purge_logs_statement")
    default int updateByPrimaryKeySelective(SqlPurgeLogsStatement record) {
        return update(c ->
            c.set(beforeOid).equalToWhenPresent(record::getBeforeOid)
            .set(isAll).equalToWhenPresent(record::getIsAll)
            .set(isBinary).equalToWhenPresent(record::getIsBinary)
            .set(isMaster).equalToWhenPresent(record::getIsMaster)
            .set(toOid).equalToWhenPresent(record::getToOid)
            .where(oid, isEqualTo(record::getOid))
        );
    }
}