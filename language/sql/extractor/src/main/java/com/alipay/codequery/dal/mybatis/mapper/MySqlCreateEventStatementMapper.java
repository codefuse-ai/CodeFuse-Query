package com.alipay.codequery.dal.mybatis.mapper;

import static com.alipay.codequery.dal.mybatis.mapper.MySqlCreateEventStatementDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.alipay.codequery.dal.mybatis.domain.MySqlCreateEventStatement;
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
public interface MySqlCreateEventStatementMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_create_event_statement")
    BasicColumn[] selectList = BasicColumn.columnList(oid, commentOid, definerOid, enable, eventBodyOid, isDisableOnSlave, isIfNotExists, isOnCompletionPreserve, nameOid, renameToOid, scheduleOid);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_create_event_statement")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_create_event_statement")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_create_event_statement")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<MySqlCreateEventStatement> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_create_event_statement")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<MySqlCreateEventStatement> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_create_event_statement")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="comment_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="definer_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="enable", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="event_body_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_disable_on_slave", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_if_not_exists", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_on_completion_preserve", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="name_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="rename_to_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="schedule_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT)
    })
    Optional<MySqlCreateEventStatement> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_create_event_statement")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="comment_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="definer_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="enable", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="event_body_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_disable_on_slave", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_if_not_exists", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_on_completion_preserve", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="name_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="rename_to_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="schedule_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT)
    })
    List<MySqlCreateEventStatement> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_create_event_statement")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_create_event_statement")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, mySqlCreateEventStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_create_event_statement")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, mySqlCreateEventStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_create_event_statement")
    default int deleteByPrimaryKey(Long oid_) {
        return delete(c -> 
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_create_event_statement")
    default int insert(MySqlCreateEventStatement record) {
        return MyBatis3Utils.insert(this::insert, record, mySqlCreateEventStatement, c ->
            c.map(oid).toProperty("oid")
            .map(commentOid).toProperty("commentOid")
            .map(definerOid).toProperty("definerOid")
            .map(enable).toProperty("enable")
            .map(eventBodyOid).toProperty("eventBodyOid")
            .map(isDisableOnSlave).toProperty("isDisableOnSlave")
            .map(isIfNotExists).toProperty("isIfNotExists")
            .map(isOnCompletionPreserve).toProperty("isOnCompletionPreserve")
            .map(nameOid).toProperty("nameOid")
            .map(renameToOid).toProperty("renameToOid")
            .map(scheduleOid).toProperty("scheduleOid")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_create_event_statement")
    default int insertMultiple(Collection<MySqlCreateEventStatement> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, mySqlCreateEventStatement, c ->
            c.map(oid).toProperty("oid")
            .map(commentOid).toProperty("commentOid")
            .map(definerOid).toProperty("definerOid")
            .map(enable).toProperty("enable")
            .map(eventBodyOid).toProperty("eventBodyOid")
            .map(isDisableOnSlave).toProperty("isDisableOnSlave")
            .map(isIfNotExists).toProperty("isIfNotExists")
            .map(isOnCompletionPreserve).toProperty("isOnCompletionPreserve")
            .map(nameOid).toProperty("nameOid")
            .map(renameToOid).toProperty("renameToOid")
            .map(scheduleOid).toProperty("scheduleOid")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_create_event_statement")
    default int insertSelective(MySqlCreateEventStatement record) {
        return MyBatis3Utils.insert(this::insert, record, mySqlCreateEventStatement, c ->
            c.map(oid).toPropertyWhenPresent("oid", record::getOid)
            .map(commentOid).toPropertyWhenPresent("commentOid", record::getCommentOid)
            .map(definerOid).toPropertyWhenPresent("definerOid", record::getDefinerOid)
            .map(enable).toPropertyWhenPresent("enable", record::getEnable)
            .map(eventBodyOid).toPropertyWhenPresent("eventBodyOid", record::getEventBodyOid)
            .map(isDisableOnSlave).toPropertyWhenPresent("isDisableOnSlave", record::getIsDisableOnSlave)
            .map(isIfNotExists).toPropertyWhenPresent("isIfNotExists", record::getIsIfNotExists)
            .map(isOnCompletionPreserve).toPropertyWhenPresent("isOnCompletionPreserve", record::getIsOnCompletionPreserve)
            .map(nameOid).toPropertyWhenPresent("nameOid", record::getNameOid)
            .map(renameToOid).toPropertyWhenPresent("renameToOid", record::getRenameToOid)
            .map(scheduleOid).toPropertyWhenPresent("scheduleOid", record::getScheduleOid)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_create_event_statement")
    default Optional<MySqlCreateEventStatement> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, mySqlCreateEventStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_create_event_statement")
    default List<MySqlCreateEventStatement> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, mySqlCreateEventStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_create_event_statement")
    default List<MySqlCreateEventStatement> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, mySqlCreateEventStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_create_event_statement")
    default Optional<MySqlCreateEventStatement> selectByPrimaryKey(Long oid_) {
        return selectOne(c ->
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_create_event_statement")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, mySqlCreateEventStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_create_event_statement")
    static UpdateDSL<UpdateModel> updateAllColumns(MySqlCreateEventStatement record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalTo(record::getOid)
                .set(commentOid).equalTo(record::getCommentOid)
                .set(definerOid).equalTo(record::getDefinerOid)
                .set(enable).equalTo(record::getEnable)
                .set(eventBodyOid).equalTo(record::getEventBodyOid)
                .set(isDisableOnSlave).equalTo(record::getIsDisableOnSlave)
                .set(isIfNotExists).equalTo(record::getIsIfNotExists)
                .set(isOnCompletionPreserve).equalTo(record::getIsOnCompletionPreserve)
                .set(nameOid).equalTo(record::getNameOid)
                .set(renameToOid).equalTo(record::getRenameToOid)
                .set(scheduleOid).equalTo(record::getScheduleOid);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_create_event_statement")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(MySqlCreateEventStatement record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalToWhenPresent(record::getOid)
                .set(commentOid).equalToWhenPresent(record::getCommentOid)
                .set(definerOid).equalToWhenPresent(record::getDefinerOid)
                .set(enable).equalToWhenPresent(record::getEnable)
                .set(eventBodyOid).equalToWhenPresent(record::getEventBodyOid)
                .set(isDisableOnSlave).equalToWhenPresent(record::getIsDisableOnSlave)
                .set(isIfNotExists).equalToWhenPresent(record::getIsIfNotExists)
                .set(isOnCompletionPreserve).equalToWhenPresent(record::getIsOnCompletionPreserve)
                .set(nameOid).equalToWhenPresent(record::getNameOid)
                .set(renameToOid).equalToWhenPresent(record::getRenameToOid)
                .set(scheduleOid).equalToWhenPresent(record::getScheduleOid);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_create_event_statement")
    default int updateByPrimaryKey(MySqlCreateEventStatement record) {
        return update(c ->
            c.set(commentOid).equalTo(record::getCommentOid)
            .set(definerOid).equalTo(record::getDefinerOid)
            .set(enable).equalTo(record::getEnable)
            .set(eventBodyOid).equalTo(record::getEventBodyOid)
            .set(isDisableOnSlave).equalTo(record::getIsDisableOnSlave)
            .set(isIfNotExists).equalTo(record::getIsIfNotExists)
            .set(isOnCompletionPreserve).equalTo(record::getIsOnCompletionPreserve)
            .set(nameOid).equalTo(record::getNameOid)
            .set(renameToOid).equalTo(record::getRenameToOid)
            .set(scheduleOid).equalTo(record::getScheduleOid)
            .where(oid, isEqualTo(record::getOid))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_create_event_statement")
    default int updateByPrimaryKeySelective(MySqlCreateEventStatement record) {
        return update(c ->
            c.set(commentOid).equalToWhenPresent(record::getCommentOid)
            .set(definerOid).equalToWhenPresent(record::getDefinerOid)
            .set(enable).equalToWhenPresent(record::getEnable)
            .set(eventBodyOid).equalToWhenPresent(record::getEventBodyOid)
            .set(isDisableOnSlave).equalToWhenPresent(record::getIsDisableOnSlave)
            .set(isIfNotExists).equalToWhenPresent(record::getIsIfNotExists)
            .set(isOnCompletionPreserve).equalToWhenPresent(record::getIsOnCompletionPreserve)
            .set(nameOid).equalToWhenPresent(record::getNameOid)
            .set(renameToOid).equalToWhenPresent(record::getRenameToOid)
            .set(scheduleOid).equalToWhenPresent(record::getScheduleOid)
            .where(oid, isEqualTo(record::getOid))
        );
    }
}