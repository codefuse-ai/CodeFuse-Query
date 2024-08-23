package com.alipay.codequery.dal.mybatis.mapper;

import static com.alipay.codequery.dal.mybatis.mapper.SqlAlterMaterializedViewStatementDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.alipay.codequery.dal.mybatis.domain.SqlAlterMaterializedViewStatement;
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
public interface SqlAlterMaterializedViewStatementMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_materialized_view_statement")
    BasicColumn[] selectList = BasicColumn.columnList(oid, enableQueryRewrite, isRebuild, isRefresh, isRefreshComplete, isRefreshFast, isRefreshForce, isRefreshNext, isRefreshOnCommit, isRefreshOnDemand, isRefreshOnOverWrite, isRefreshStartWith, nameOid, nextOid, startWithOid);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_materialized_view_statement")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_materialized_view_statement")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_materialized_view_statement")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<SqlAlterMaterializedViewStatement> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_materialized_view_statement")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<SqlAlterMaterializedViewStatement> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_materialized_view_statement")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="enable_query_rewrite", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_rebuild", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_refresh", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_refresh_complete", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_refresh_fast", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_refresh_force", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_refresh_next", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_refresh_on_commit", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_refresh_on_demand", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_refresh_on_over_write", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_refresh_start_with", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="name_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="next_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="start_with_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT)
    })
    Optional<SqlAlterMaterializedViewStatement> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_materialized_view_statement")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="enable_query_rewrite", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_rebuild", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_refresh", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_refresh_complete", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_refresh_fast", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_refresh_force", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_refresh_next", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_refresh_on_commit", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_refresh_on_demand", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_refresh_on_over_write", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_refresh_start_with", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="name_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="next_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="start_with_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT)
    })
    List<SqlAlterMaterializedViewStatement> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_materialized_view_statement")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_materialized_view_statement")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, sqlAlterMaterializedViewStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_materialized_view_statement")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, sqlAlterMaterializedViewStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_materialized_view_statement")
    default int deleteByPrimaryKey(Long oid_) {
        return delete(c -> 
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_materialized_view_statement")
    default int insert(SqlAlterMaterializedViewStatement record) {
        return MyBatis3Utils.insert(this::insert, record, sqlAlterMaterializedViewStatement, c ->
            c.map(oid).toProperty("oid")
            .map(enableQueryRewrite).toProperty("enableQueryRewrite")
            .map(isRebuild).toProperty("isRebuild")
            .map(isRefresh).toProperty("isRefresh")
            .map(isRefreshComplete).toProperty("isRefreshComplete")
            .map(isRefreshFast).toProperty("isRefreshFast")
            .map(isRefreshForce).toProperty("isRefreshForce")
            .map(isRefreshNext).toProperty("isRefreshNext")
            .map(isRefreshOnCommit).toProperty("isRefreshOnCommit")
            .map(isRefreshOnDemand).toProperty("isRefreshOnDemand")
            .map(isRefreshOnOverWrite).toProperty("isRefreshOnOverWrite")
            .map(isRefreshStartWith).toProperty("isRefreshStartWith")
            .map(nameOid).toProperty("nameOid")
            .map(nextOid).toProperty("nextOid")
            .map(startWithOid).toProperty("startWithOid")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_materialized_view_statement")
    default int insertMultiple(Collection<SqlAlterMaterializedViewStatement> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, sqlAlterMaterializedViewStatement, c ->
            c.map(oid).toProperty("oid")
            .map(enableQueryRewrite).toProperty("enableQueryRewrite")
            .map(isRebuild).toProperty("isRebuild")
            .map(isRefresh).toProperty("isRefresh")
            .map(isRefreshComplete).toProperty("isRefreshComplete")
            .map(isRefreshFast).toProperty("isRefreshFast")
            .map(isRefreshForce).toProperty("isRefreshForce")
            .map(isRefreshNext).toProperty("isRefreshNext")
            .map(isRefreshOnCommit).toProperty("isRefreshOnCommit")
            .map(isRefreshOnDemand).toProperty("isRefreshOnDemand")
            .map(isRefreshOnOverWrite).toProperty("isRefreshOnOverWrite")
            .map(isRefreshStartWith).toProperty("isRefreshStartWith")
            .map(nameOid).toProperty("nameOid")
            .map(nextOid).toProperty("nextOid")
            .map(startWithOid).toProperty("startWithOid")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_materialized_view_statement")
    default int insertSelective(SqlAlterMaterializedViewStatement record) {
        return MyBatis3Utils.insert(this::insert, record, sqlAlterMaterializedViewStatement, c ->
            c.map(oid).toPropertyWhenPresent("oid", record::getOid)
            .map(enableQueryRewrite).toPropertyWhenPresent("enableQueryRewrite", record::getEnableQueryRewrite)
            .map(isRebuild).toPropertyWhenPresent("isRebuild", record::getIsRebuild)
            .map(isRefresh).toPropertyWhenPresent("isRefresh", record::getIsRefresh)
            .map(isRefreshComplete).toPropertyWhenPresent("isRefreshComplete", record::getIsRefreshComplete)
            .map(isRefreshFast).toPropertyWhenPresent("isRefreshFast", record::getIsRefreshFast)
            .map(isRefreshForce).toPropertyWhenPresent("isRefreshForce", record::getIsRefreshForce)
            .map(isRefreshNext).toPropertyWhenPresent("isRefreshNext", record::getIsRefreshNext)
            .map(isRefreshOnCommit).toPropertyWhenPresent("isRefreshOnCommit", record::getIsRefreshOnCommit)
            .map(isRefreshOnDemand).toPropertyWhenPresent("isRefreshOnDemand", record::getIsRefreshOnDemand)
            .map(isRefreshOnOverWrite).toPropertyWhenPresent("isRefreshOnOverWrite", record::getIsRefreshOnOverWrite)
            .map(isRefreshStartWith).toPropertyWhenPresent("isRefreshStartWith", record::getIsRefreshStartWith)
            .map(nameOid).toPropertyWhenPresent("nameOid", record::getNameOid)
            .map(nextOid).toPropertyWhenPresent("nextOid", record::getNextOid)
            .map(startWithOid).toPropertyWhenPresent("startWithOid", record::getStartWithOid)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_materialized_view_statement")
    default Optional<SqlAlterMaterializedViewStatement> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, sqlAlterMaterializedViewStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_materialized_view_statement")
    default List<SqlAlterMaterializedViewStatement> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, sqlAlterMaterializedViewStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_materialized_view_statement")
    default List<SqlAlterMaterializedViewStatement> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, sqlAlterMaterializedViewStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_materialized_view_statement")
    default Optional<SqlAlterMaterializedViewStatement> selectByPrimaryKey(Long oid_) {
        return selectOne(c ->
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_materialized_view_statement")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, sqlAlterMaterializedViewStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_materialized_view_statement")
    static UpdateDSL<UpdateModel> updateAllColumns(SqlAlterMaterializedViewStatement record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalTo(record::getOid)
                .set(enableQueryRewrite).equalTo(record::getEnableQueryRewrite)
                .set(isRebuild).equalTo(record::getIsRebuild)
                .set(isRefresh).equalTo(record::getIsRefresh)
                .set(isRefreshComplete).equalTo(record::getIsRefreshComplete)
                .set(isRefreshFast).equalTo(record::getIsRefreshFast)
                .set(isRefreshForce).equalTo(record::getIsRefreshForce)
                .set(isRefreshNext).equalTo(record::getIsRefreshNext)
                .set(isRefreshOnCommit).equalTo(record::getIsRefreshOnCommit)
                .set(isRefreshOnDemand).equalTo(record::getIsRefreshOnDemand)
                .set(isRefreshOnOverWrite).equalTo(record::getIsRefreshOnOverWrite)
                .set(isRefreshStartWith).equalTo(record::getIsRefreshStartWith)
                .set(nameOid).equalTo(record::getNameOid)
                .set(nextOid).equalTo(record::getNextOid)
                .set(startWithOid).equalTo(record::getStartWithOid);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_materialized_view_statement")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(SqlAlterMaterializedViewStatement record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalToWhenPresent(record::getOid)
                .set(enableQueryRewrite).equalToWhenPresent(record::getEnableQueryRewrite)
                .set(isRebuild).equalToWhenPresent(record::getIsRebuild)
                .set(isRefresh).equalToWhenPresent(record::getIsRefresh)
                .set(isRefreshComplete).equalToWhenPresent(record::getIsRefreshComplete)
                .set(isRefreshFast).equalToWhenPresent(record::getIsRefreshFast)
                .set(isRefreshForce).equalToWhenPresent(record::getIsRefreshForce)
                .set(isRefreshNext).equalToWhenPresent(record::getIsRefreshNext)
                .set(isRefreshOnCommit).equalToWhenPresent(record::getIsRefreshOnCommit)
                .set(isRefreshOnDemand).equalToWhenPresent(record::getIsRefreshOnDemand)
                .set(isRefreshOnOverWrite).equalToWhenPresent(record::getIsRefreshOnOverWrite)
                .set(isRefreshStartWith).equalToWhenPresent(record::getIsRefreshStartWith)
                .set(nameOid).equalToWhenPresent(record::getNameOid)
                .set(nextOid).equalToWhenPresent(record::getNextOid)
                .set(startWithOid).equalToWhenPresent(record::getStartWithOid);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_materialized_view_statement")
    default int updateByPrimaryKey(SqlAlterMaterializedViewStatement record) {
        return update(c ->
            c.set(enableQueryRewrite).equalTo(record::getEnableQueryRewrite)
            .set(isRebuild).equalTo(record::getIsRebuild)
            .set(isRefresh).equalTo(record::getIsRefresh)
            .set(isRefreshComplete).equalTo(record::getIsRefreshComplete)
            .set(isRefreshFast).equalTo(record::getIsRefreshFast)
            .set(isRefreshForce).equalTo(record::getIsRefreshForce)
            .set(isRefreshNext).equalTo(record::getIsRefreshNext)
            .set(isRefreshOnCommit).equalTo(record::getIsRefreshOnCommit)
            .set(isRefreshOnDemand).equalTo(record::getIsRefreshOnDemand)
            .set(isRefreshOnOverWrite).equalTo(record::getIsRefreshOnOverWrite)
            .set(isRefreshStartWith).equalTo(record::getIsRefreshStartWith)
            .set(nameOid).equalTo(record::getNameOid)
            .set(nextOid).equalTo(record::getNextOid)
            .set(startWithOid).equalTo(record::getStartWithOid)
            .where(oid, isEqualTo(record::getOid))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_materialized_view_statement")
    default int updateByPrimaryKeySelective(SqlAlterMaterializedViewStatement record) {
        return update(c ->
            c.set(enableQueryRewrite).equalToWhenPresent(record::getEnableQueryRewrite)
            .set(isRebuild).equalToWhenPresent(record::getIsRebuild)
            .set(isRefresh).equalToWhenPresent(record::getIsRefresh)
            .set(isRefreshComplete).equalToWhenPresent(record::getIsRefreshComplete)
            .set(isRefreshFast).equalToWhenPresent(record::getIsRefreshFast)
            .set(isRefreshForce).equalToWhenPresent(record::getIsRefreshForce)
            .set(isRefreshNext).equalToWhenPresent(record::getIsRefreshNext)
            .set(isRefreshOnCommit).equalToWhenPresent(record::getIsRefreshOnCommit)
            .set(isRefreshOnDemand).equalToWhenPresent(record::getIsRefreshOnDemand)
            .set(isRefreshOnOverWrite).equalToWhenPresent(record::getIsRefreshOnOverWrite)
            .set(isRefreshStartWith).equalToWhenPresent(record::getIsRefreshStartWith)
            .set(nameOid).equalToWhenPresent(record::getNameOid)
            .set(nextOid).equalToWhenPresent(record::getNextOid)
            .set(startWithOid).equalToWhenPresent(record::getStartWithOid)
            .where(oid, isEqualTo(record::getOid))
        );
    }
}