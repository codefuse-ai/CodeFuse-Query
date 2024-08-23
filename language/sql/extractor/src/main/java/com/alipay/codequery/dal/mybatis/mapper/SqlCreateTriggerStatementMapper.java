package com.alipay.codequery.dal.mybatis.mapper;

import static com.alipay.codequery.dal.mybatis.mapper.SqlCreateTriggerStatementDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.alipay.codequery.dal.mybatis.domain.SqlCreateTriggerStatement;
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
public interface SqlCreateTriggerStatementMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_create_trigger_statement")
    BasicColumn[] selectList = BasicColumn.columnList(oid, bodyOid, definerOid, isDelete, isForEachRow, isInsert, isOrReplace, isUpdate, nameOid, onOid, triggerEvents, triggerType, whenOid);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_create_trigger_statement")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_create_trigger_statement")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_create_trigger_statement")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<SqlCreateTriggerStatement> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_create_trigger_statement")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<SqlCreateTriggerStatement> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_create_trigger_statement")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="body_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="definer_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_delete", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_for_each_row", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_insert", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_or_replace", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_update", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="name_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="on_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="trigger_events", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="trigger_type", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="when_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT)
    })
    Optional<SqlCreateTriggerStatement> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_create_trigger_statement")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="body_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="definer_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_delete", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_for_each_row", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_insert", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_or_replace", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_update", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="name_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="on_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="trigger_events", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="trigger_type", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="when_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT)
    })
    List<SqlCreateTriggerStatement> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_create_trigger_statement")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_create_trigger_statement")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, sqlCreateTriggerStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_create_trigger_statement")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, sqlCreateTriggerStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_create_trigger_statement")
    default int deleteByPrimaryKey(Long oid_) {
        return delete(c -> 
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_create_trigger_statement")
    default int insert(SqlCreateTriggerStatement record) {
        return MyBatis3Utils.insert(this::insert, record, sqlCreateTriggerStatement, c ->
            c.map(oid).toProperty("oid")
            .map(bodyOid).toProperty("bodyOid")
            .map(definerOid).toProperty("definerOid")
            .map(isDelete).toProperty("isDelete")
            .map(isForEachRow).toProperty("isForEachRow")
            .map(isInsert).toProperty("isInsert")
            .map(isOrReplace).toProperty("isOrReplace")
            .map(isUpdate).toProperty("isUpdate")
            .map(nameOid).toProperty("nameOid")
            .map(onOid).toProperty("onOid")
            .map(triggerEvents).toProperty("triggerEvents")
            .map(triggerType).toProperty("triggerType")
            .map(whenOid).toProperty("whenOid")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_create_trigger_statement")
    default int insertMultiple(Collection<SqlCreateTriggerStatement> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, sqlCreateTriggerStatement, c ->
            c.map(oid).toProperty("oid")
            .map(bodyOid).toProperty("bodyOid")
            .map(definerOid).toProperty("definerOid")
            .map(isDelete).toProperty("isDelete")
            .map(isForEachRow).toProperty("isForEachRow")
            .map(isInsert).toProperty("isInsert")
            .map(isOrReplace).toProperty("isOrReplace")
            .map(isUpdate).toProperty("isUpdate")
            .map(nameOid).toProperty("nameOid")
            .map(onOid).toProperty("onOid")
            .map(triggerEvents).toProperty("triggerEvents")
            .map(triggerType).toProperty("triggerType")
            .map(whenOid).toProperty("whenOid")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_create_trigger_statement")
    default int insertSelective(SqlCreateTriggerStatement record) {
        return MyBatis3Utils.insert(this::insert, record, sqlCreateTriggerStatement, c ->
            c.map(oid).toPropertyWhenPresent("oid", record::getOid)
            .map(bodyOid).toPropertyWhenPresent("bodyOid", record::getBodyOid)
            .map(definerOid).toPropertyWhenPresent("definerOid", record::getDefinerOid)
            .map(isDelete).toPropertyWhenPresent("isDelete", record::getIsDelete)
            .map(isForEachRow).toPropertyWhenPresent("isForEachRow", record::getIsForEachRow)
            .map(isInsert).toPropertyWhenPresent("isInsert", record::getIsInsert)
            .map(isOrReplace).toPropertyWhenPresent("isOrReplace", record::getIsOrReplace)
            .map(isUpdate).toPropertyWhenPresent("isUpdate", record::getIsUpdate)
            .map(nameOid).toPropertyWhenPresent("nameOid", record::getNameOid)
            .map(onOid).toPropertyWhenPresent("onOid", record::getOnOid)
            .map(triggerEvents).toPropertyWhenPresent("triggerEvents", record::getTriggerEvents)
            .map(triggerType).toPropertyWhenPresent("triggerType", record::getTriggerType)
            .map(whenOid).toPropertyWhenPresent("whenOid", record::getWhenOid)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_create_trigger_statement")
    default Optional<SqlCreateTriggerStatement> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, sqlCreateTriggerStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_create_trigger_statement")
    default List<SqlCreateTriggerStatement> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, sqlCreateTriggerStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_create_trigger_statement")
    default List<SqlCreateTriggerStatement> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, sqlCreateTriggerStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_create_trigger_statement")
    default Optional<SqlCreateTriggerStatement> selectByPrimaryKey(Long oid_) {
        return selectOne(c ->
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_create_trigger_statement")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, sqlCreateTriggerStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_create_trigger_statement")
    static UpdateDSL<UpdateModel> updateAllColumns(SqlCreateTriggerStatement record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalTo(record::getOid)
                .set(bodyOid).equalTo(record::getBodyOid)
                .set(definerOid).equalTo(record::getDefinerOid)
                .set(isDelete).equalTo(record::getIsDelete)
                .set(isForEachRow).equalTo(record::getIsForEachRow)
                .set(isInsert).equalTo(record::getIsInsert)
                .set(isOrReplace).equalTo(record::getIsOrReplace)
                .set(isUpdate).equalTo(record::getIsUpdate)
                .set(nameOid).equalTo(record::getNameOid)
                .set(onOid).equalTo(record::getOnOid)
                .set(triggerEvents).equalTo(record::getTriggerEvents)
                .set(triggerType).equalTo(record::getTriggerType)
                .set(whenOid).equalTo(record::getWhenOid);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_create_trigger_statement")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(SqlCreateTriggerStatement record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalToWhenPresent(record::getOid)
                .set(bodyOid).equalToWhenPresent(record::getBodyOid)
                .set(definerOid).equalToWhenPresent(record::getDefinerOid)
                .set(isDelete).equalToWhenPresent(record::getIsDelete)
                .set(isForEachRow).equalToWhenPresent(record::getIsForEachRow)
                .set(isInsert).equalToWhenPresent(record::getIsInsert)
                .set(isOrReplace).equalToWhenPresent(record::getIsOrReplace)
                .set(isUpdate).equalToWhenPresent(record::getIsUpdate)
                .set(nameOid).equalToWhenPresent(record::getNameOid)
                .set(onOid).equalToWhenPresent(record::getOnOid)
                .set(triggerEvents).equalToWhenPresent(record::getTriggerEvents)
                .set(triggerType).equalToWhenPresent(record::getTriggerType)
                .set(whenOid).equalToWhenPresent(record::getWhenOid);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_create_trigger_statement")
    default int updateByPrimaryKey(SqlCreateTriggerStatement record) {
        return update(c ->
            c.set(bodyOid).equalTo(record::getBodyOid)
            .set(definerOid).equalTo(record::getDefinerOid)
            .set(isDelete).equalTo(record::getIsDelete)
            .set(isForEachRow).equalTo(record::getIsForEachRow)
            .set(isInsert).equalTo(record::getIsInsert)
            .set(isOrReplace).equalTo(record::getIsOrReplace)
            .set(isUpdate).equalTo(record::getIsUpdate)
            .set(nameOid).equalTo(record::getNameOid)
            .set(onOid).equalTo(record::getOnOid)
            .set(triggerEvents).equalTo(record::getTriggerEvents)
            .set(triggerType).equalTo(record::getTriggerType)
            .set(whenOid).equalTo(record::getWhenOid)
            .where(oid, isEqualTo(record::getOid))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_create_trigger_statement")
    default int updateByPrimaryKeySelective(SqlCreateTriggerStatement record) {
        return update(c ->
            c.set(bodyOid).equalToWhenPresent(record::getBodyOid)
            .set(definerOid).equalToWhenPresent(record::getDefinerOid)
            .set(isDelete).equalToWhenPresent(record::getIsDelete)
            .set(isForEachRow).equalToWhenPresent(record::getIsForEachRow)
            .set(isInsert).equalToWhenPresent(record::getIsInsert)
            .set(isOrReplace).equalToWhenPresent(record::getIsOrReplace)
            .set(isUpdate).equalToWhenPresent(record::getIsUpdate)
            .set(nameOid).equalToWhenPresent(record::getNameOid)
            .set(onOid).equalToWhenPresent(record::getOnOid)
            .set(triggerEvents).equalToWhenPresent(record::getTriggerEvents)
            .set(triggerType).equalToWhenPresent(record::getTriggerType)
            .set(whenOid).equalToWhenPresent(record::getWhenOid)
            .where(oid, isEqualTo(record::getOid))
        );
    }
}