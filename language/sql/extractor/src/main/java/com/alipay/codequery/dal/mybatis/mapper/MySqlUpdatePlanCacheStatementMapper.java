package com.alipay.codequery.dal.mybatis.mapper;

import static com.alipay.codequery.dal.mybatis.mapper.MySqlUpdatePlanCacheStatementDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.alipay.codequery.dal.mybatis.domain.MySqlUpdatePlanCacheStatement;
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
public interface MySqlUpdatePlanCacheStatementMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_update_plan_cache_statement")
    BasicColumn[] selectList = BasicColumn.columnList(oid, formSelectOid, toSelectOid);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_update_plan_cache_statement")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_update_plan_cache_statement")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_update_plan_cache_statement")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<MySqlUpdatePlanCacheStatement> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_update_plan_cache_statement")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<MySqlUpdatePlanCacheStatement> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_update_plan_cache_statement")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="form_select_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="to_select_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT)
    })
    Optional<MySqlUpdatePlanCacheStatement> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_update_plan_cache_statement")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="form_select_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="to_select_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT)
    })
    List<MySqlUpdatePlanCacheStatement> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_update_plan_cache_statement")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_update_plan_cache_statement")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, mySqlUpdatePlanCacheStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_update_plan_cache_statement")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, mySqlUpdatePlanCacheStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_update_plan_cache_statement")
    default int deleteByPrimaryKey(Long oid_) {
        return delete(c -> 
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_update_plan_cache_statement")
    default int insert(MySqlUpdatePlanCacheStatement record) {
        return MyBatis3Utils.insert(this::insert, record, mySqlUpdatePlanCacheStatement, c ->
            c.map(oid).toProperty("oid")
            .map(formSelectOid).toProperty("formSelectOid")
            .map(toSelectOid).toProperty("toSelectOid")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_update_plan_cache_statement")
    default int insertMultiple(Collection<MySqlUpdatePlanCacheStatement> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, mySqlUpdatePlanCacheStatement, c ->
            c.map(oid).toProperty("oid")
            .map(formSelectOid).toProperty("formSelectOid")
            .map(toSelectOid).toProperty("toSelectOid")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_update_plan_cache_statement")
    default int insertSelective(MySqlUpdatePlanCacheStatement record) {
        return MyBatis3Utils.insert(this::insert, record, mySqlUpdatePlanCacheStatement, c ->
            c.map(oid).toPropertyWhenPresent("oid", record::getOid)
            .map(formSelectOid).toPropertyWhenPresent("formSelectOid", record::getFormSelectOid)
            .map(toSelectOid).toPropertyWhenPresent("toSelectOid", record::getToSelectOid)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_update_plan_cache_statement")
    default Optional<MySqlUpdatePlanCacheStatement> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, mySqlUpdatePlanCacheStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_update_plan_cache_statement")
    default List<MySqlUpdatePlanCacheStatement> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, mySqlUpdatePlanCacheStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_update_plan_cache_statement")
    default List<MySqlUpdatePlanCacheStatement> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, mySqlUpdatePlanCacheStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_update_plan_cache_statement")
    default Optional<MySqlUpdatePlanCacheStatement> selectByPrimaryKey(Long oid_) {
        return selectOne(c ->
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_update_plan_cache_statement")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, mySqlUpdatePlanCacheStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_update_plan_cache_statement")
    static UpdateDSL<UpdateModel> updateAllColumns(MySqlUpdatePlanCacheStatement record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalTo(record::getOid)
                .set(formSelectOid).equalTo(record::getFormSelectOid)
                .set(toSelectOid).equalTo(record::getToSelectOid);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_update_plan_cache_statement")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(MySqlUpdatePlanCacheStatement record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalToWhenPresent(record::getOid)
                .set(formSelectOid).equalToWhenPresent(record::getFormSelectOid)
                .set(toSelectOid).equalToWhenPresent(record::getToSelectOid);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_update_plan_cache_statement")
    default int updateByPrimaryKey(MySqlUpdatePlanCacheStatement record) {
        return update(c ->
            c.set(formSelectOid).equalTo(record::getFormSelectOid)
            .set(toSelectOid).equalTo(record::getToSelectOid)
            .where(oid, isEqualTo(record::getOid))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_update_plan_cache_statement")
    default int updateByPrimaryKeySelective(MySqlUpdatePlanCacheStatement record) {
        return update(c ->
            c.set(formSelectOid).equalToWhenPresent(record::getFormSelectOid)
            .set(toSelectOid).equalToWhenPresent(record::getToSelectOid)
            .where(oid, isEqualTo(record::getOid))
        );
    }
}