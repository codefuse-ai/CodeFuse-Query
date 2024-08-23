package com.alipay.codequery.dal.mybatis.mapper;

import static com.alipay.codequery.dal.mybatis.mapper.PgInsertStatementDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.alipay.codequery.dal.mybatis.domain.PgInsertStatement;
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
public interface PgInsertStatementMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: pg_insert_statement")
    BasicColumn[] selectList = BasicColumn.columnList(oid, isDefaultValues, isOnConflictDoNothing, onConflictConstraintOid, onConflictUpdateWhereOid, onConflictWhereOid, returningOid, values, valuesList);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: pg_insert_statement")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: pg_insert_statement")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: pg_insert_statement")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<PgInsertStatement> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: pg_insert_statement")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<PgInsertStatement> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: pg_insert_statement")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="is_default_values", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_on_conflict_do_nothing", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="on_conflict_constraint_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="on_conflict_update_where_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="on_conflict_where_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="returning_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="values", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="values_list", javaType=String.class, jdbcType=JdbcType.VARCHAR)
    })
    Optional<PgInsertStatement> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: pg_insert_statement")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="is_default_values", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_on_conflict_do_nothing", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="on_conflict_constraint_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="on_conflict_update_where_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="on_conflict_where_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="returning_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="values", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="values_list", javaType=String.class, jdbcType=JdbcType.VARCHAR)
    })
    List<PgInsertStatement> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: pg_insert_statement")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: pg_insert_statement")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, pgInsertStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: pg_insert_statement")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, pgInsertStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: pg_insert_statement")
    default int deleteByPrimaryKey(Long oid_) {
        return delete(c -> 
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: pg_insert_statement")
    default int insert(PgInsertStatement record) {
        return MyBatis3Utils.insert(this::insert, record, pgInsertStatement, c ->
            c.map(oid).toProperty("oid")
            .map(isDefaultValues).toProperty("isDefaultValues")
            .map(isOnConflictDoNothing).toProperty("isOnConflictDoNothing")
            .map(onConflictConstraintOid).toProperty("onConflictConstraintOid")
            .map(onConflictUpdateWhereOid).toProperty("onConflictUpdateWhereOid")
            .map(onConflictWhereOid).toProperty("onConflictWhereOid")
            .map(returningOid).toProperty("returningOid")
            .map(values).toProperty("values")
            .map(valuesList).toProperty("valuesList")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: pg_insert_statement")
    default int insertMultiple(Collection<PgInsertStatement> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, pgInsertStatement, c ->
            c.map(oid).toProperty("oid")
            .map(isDefaultValues).toProperty("isDefaultValues")
            .map(isOnConflictDoNothing).toProperty("isOnConflictDoNothing")
            .map(onConflictConstraintOid).toProperty("onConflictConstraintOid")
            .map(onConflictUpdateWhereOid).toProperty("onConflictUpdateWhereOid")
            .map(onConflictWhereOid).toProperty("onConflictWhereOid")
            .map(returningOid).toProperty("returningOid")
            .map(values).toProperty("values")
            .map(valuesList).toProperty("valuesList")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: pg_insert_statement")
    default int insertSelective(PgInsertStatement record) {
        return MyBatis3Utils.insert(this::insert, record, pgInsertStatement, c ->
            c.map(oid).toPropertyWhenPresent("oid", record::getOid)
            .map(isDefaultValues).toPropertyWhenPresent("isDefaultValues", record::getIsDefaultValues)
            .map(isOnConflictDoNothing).toPropertyWhenPresent("isOnConflictDoNothing", record::getIsOnConflictDoNothing)
            .map(onConflictConstraintOid).toPropertyWhenPresent("onConflictConstraintOid", record::getOnConflictConstraintOid)
            .map(onConflictUpdateWhereOid).toPropertyWhenPresent("onConflictUpdateWhereOid", record::getOnConflictUpdateWhereOid)
            .map(onConflictWhereOid).toPropertyWhenPresent("onConflictWhereOid", record::getOnConflictWhereOid)
            .map(returningOid).toPropertyWhenPresent("returningOid", record::getReturningOid)
            .map(values).toPropertyWhenPresent("values", record::getValues)
            .map(valuesList).toPropertyWhenPresent("valuesList", record::getValuesList)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: pg_insert_statement")
    default Optional<PgInsertStatement> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, pgInsertStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: pg_insert_statement")
    default List<PgInsertStatement> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, pgInsertStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: pg_insert_statement")
    default List<PgInsertStatement> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, pgInsertStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: pg_insert_statement")
    default Optional<PgInsertStatement> selectByPrimaryKey(Long oid_) {
        return selectOne(c ->
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: pg_insert_statement")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, pgInsertStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: pg_insert_statement")
    static UpdateDSL<UpdateModel> updateAllColumns(PgInsertStatement record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalTo(record::getOid)
                .set(isDefaultValues).equalTo(record::getIsDefaultValues)
                .set(isOnConflictDoNothing).equalTo(record::getIsOnConflictDoNothing)
                .set(onConflictConstraintOid).equalTo(record::getOnConflictConstraintOid)
                .set(onConflictUpdateWhereOid).equalTo(record::getOnConflictUpdateWhereOid)
                .set(onConflictWhereOid).equalTo(record::getOnConflictWhereOid)
                .set(returningOid).equalTo(record::getReturningOid)
                .set(values).equalTo(record::getValues)
                .set(valuesList).equalTo(record::getValuesList);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: pg_insert_statement")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(PgInsertStatement record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalToWhenPresent(record::getOid)
                .set(isDefaultValues).equalToWhenPresent(record::getIsDefaultValues)
                .set(isOnConflictDoNothing).equalToWhenPresent(record::getIsOnConflictDoNothing)
                .set(onConflictConstraintOid).equalToWhenPresent(record::getOnConflictConstraintOid)
                .set(onConflictUpdateWhereOid).equalToWhenPresent(record::getOnConflictUpdateWhereOid)
                .set(onConflictWhereOid).equalToWhenPresent(record::getOnConflictWhereOid)
                .set(returningOid).equalToWhenPresent(record::getReturningOid)
                .set(values).equalToWhenPresent(record::getValues)
                .set(valuesList).equalToWhenPresent(record::getValuesList);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: pg_insert_statement")
    default int updateByPrimaryKey(PgInsertStatement record) {
        return update(c ->
            c.set(isDefaultValues).equalTo(record::getIsDefaultValues)
            .set(isOnConflictDoNothing).equalTo(record::getIsOnConflictDoNothing)
            .set(onConflictConstraintOid).equalTo(record::getOnConflictConstraintOid)
            .set(onConflictUpdateWhereOid).equalTo(record::getOnConflictUpdateWhereOid)
            .set(onConflictWhereOid).equalTo(record::getOnConflictWhereOid)
            .set(returningOid).equalTo(record::getReturningOid)
            .set(values).equalTo(record::getValues)
            .set(valuesList).equalTo(record::getValuesList)
            .where(oid, isEqualTo(record::getOid))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: pg_insert_statement")
    default int updateByPrimaryKeySelective(PgInsertStatement record) {
        return update(c ->
            c.set(isDefaultValues).equalToWhenPresent(record::getIsDefaultValues)
            .set(isOnConflictDoNothing).equalToWhenPresent(record::getIsOnConflictDoNothing)
            .set(onConflictConstraintOid).equalToWhenPresent(record::getOnConflictConstraintOid)
            .set(onConflictUpdateWhereOid).equalToWhenPresent(record::getOnConflictUpdateWhereOid)
            .set(onConflictWhereOid).equalToWhenPresent(record::getOnConflictWhereOid)
            .set(returningOid).equalToWhenPresent(record::getReturningOid)
            .set(values).equalToWhenPresent(record::getValues)
            .set(valuesList).equalToWhenPresent(record::getValuesList)
            .where(oid, isEqualTo(record::getOid))
        );
    }
}