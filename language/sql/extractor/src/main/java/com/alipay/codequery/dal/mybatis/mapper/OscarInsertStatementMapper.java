package com.alipay.codequery.dal.mybatis.mapper;

import static com.alipay.codequery.dal.mybatis.mapper.OscarInsertStatementDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.alipay.codequery.dal.mybatis.domain.OscarInsertStatement;
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
public interface OscarInsertStatementMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oscar_insert_statement")
    BasicColumn[] selectList = BasicColumn.columnList(oid, isDefaultValues, isOnConflictDoNothing, onConflictConstraintOid, onConflictUpdateWhereOid, onConflictWhereOid, returningOid, values, valuesList);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oscar_insert_statement")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oscar_insert_statement")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oscar_insert_statement")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<OscarInsertStatement> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oscar_insert_statement")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<OscarInsertStatement> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oscar_insert_statement")
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
    Optional<OscarInsertStatement> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oscar_insert_statement")
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
    List<OscarInsertStatement> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oscar_insert_statement")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oscar_insert_statement")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, oscarInsertStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oscar_insert_statement")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, oscarInsertStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oscar_insert_statement")
    default int deleteByPrimaryKey(Long oid_) {
        return delete(c -> 
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oscar_insert_statement")
    default int insert(OscarInsertStatement record) {
        return MyBatis3Utils.insert(this::insert, record, oscarInsertStatement, c ->
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

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oscar_insert_statement")
    default int insertMultiple(Collection<OscarInsertStatement> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, oscarInsertStatement, c ->
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

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oscar_insert_statement")
    default int insertSelective(OscarInsertStatement record) {
        return MyBatis3Utils.insert(this::insert, record, oscarInsertStatement, c ->
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

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oscar_insert_statement")
    default Optional<OscarInsertStatement> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, oscarInsertStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oscar_insert_statement")
    default List<OscarInsertStatement> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, oscarInsertStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oscar_insert_statement")
    default List<OscarInsertStatement> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, oscarInsertStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oscar_insert_statement")
    default Optional<OscarInsertStatement> selectByPrimaryKey(Long oid_) {
        return selectOne(c ->
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oscar_insert_statement")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, oscarInsertStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oscar_insert_statement")
    static UpdateDSL<UpdateModel> updateAllColumns(OscarInsertStatement record, UpdateDSL<UpdateModel> dsl) {
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

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oscar_insert_statement")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(OscarInsertStatement record, UpdateDSL<UpdateModel> dsl) {
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

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oscar_insert_statement")
    default int updateByPrimaryKey(OscarInsertStatement record) {
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

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oscar_insert_statement")
    default int updateByPrimaryKeySelective(OscarInsertStatement record) {
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