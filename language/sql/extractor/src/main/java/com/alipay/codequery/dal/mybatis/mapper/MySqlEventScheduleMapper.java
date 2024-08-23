package com.alipay.codequery.dal.mybatis.mapper;

import static com.alipay.codequery.dal.mybatis.mapper.MySqlEventScheduleDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.alipay.codequery.dal.mybatis.domain.MySqlEventSchedule;
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
public interface MySqlEventScheduleMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_event_schedule")
    BasicColumn[] selectList = BasicColumn.columnList(oid, atOid, endsOid, everyOid, startsOid);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_event_schedule")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_event_schedule")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_event_schedule")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<MySqlEventSchedule> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_event_schedule")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<MySqlEventSchedule> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_event_schedule")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="at_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="ends_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="every_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="starts_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT)
    })
    Optional<MySqlEventSchedule> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_event_schedule")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="at_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="ends_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="every_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="starts_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT)
    })
    List<MySqlEventSchedule> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_event_schedule")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_event_schedule")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, mySqlEventSchedule, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_event_schedule")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, mySqlEventSchedule, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_event_schedule")
    default int deleteByPrimaryKey(Long oid_) {
        return delete(c -> 
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_event_schedule")
    default int insert(MySqlEventSchedule record) {
        return MyBatis3Utils.insert(this::insert, record, mySqlEventSchedule, c ->
            c.map(oid).toProperty("oid")
            .map(atOid).toProperty("atOid")
            .map(endsOid).toProperty("endsOid")
            .map(everyOid).toProperty("everyOid")
            .map(startsOid).toProperty("startsOid")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_event_schedule")
    default int insertMultiple(Collection<MySqlEventSchedule> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, mySqlEventSchedule, c ->
            c.map(oid).toProperty("oid")
            .map(atOid).toProperty("atOid")
            .map(endsOid).toProperty("endsOid")
            .map(everyOid).toProperty("everyOid")
            .map(startsOid).toProperty("startsOid")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_event_schedule")
    default int insertSelective(MySqlEventSchedule record) {
        return MyBatis3Utils.insert(this::insert, record, mySqlEventSchedule, c ->
            c.map(oid).toPropertyWhenPresent("oid", record::getOid)
            .map(atOid).toPropertyWhenPresent("atOid", record::getAtOid)
            .map(endsOid).toPropertyWhenPresent("endsOid", record::getEndsOid)
            .map(everyOid).toPropertyWhenPresent("everyOid", record::getEveryOid)
            .map(startsOid).toPropertyWhenPresent("startsOid", record::getStartsOid)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_event_schedule")
    default Optional<MySqlEventSchedule> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, mySqlEventSchedule, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_event_schedule")
    default List<MySqlEventSchedule> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, mySqlEventSchedule, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_event_schedule")
    default List<MySqlEventSchedule> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, mySqlEventSchedule, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_event_schedule")
    default Optional<MySqlEventSchedule> selectByPrimaryKey(Long oid_) {
        return selectOne(c ->
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_event_schedule")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, mySqlEventSchedule, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_event_schedule")
    static UpdateDSL<UpdateModel> updateAllColumns(MySqlEventSchedule record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalTo(record::getOid)
                .set(atOid).equalTo(record::getAtOid)
                .set(endsOid).equalTo(record::getEndsOid)
                .set(everyOid).equalTo(record::getEveryOid)
                .set(startsOid).equalTo(record::getStartsOid);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_event_schedule")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(MySqlEventSchedule record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalToWhenPresent(record::getOid)
                .set(atOid).equalToWhenPresent(record::getAtOid)
                .set(endsOid).equalToWhenPresent(record::getEndsOid)
                .set(everyOid).equalToWhenPresent(record::getEveryOid)
                .set(startsOid).equalToWhenPresent(record::getStartsOid);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_event_schedule")
    default int updateByPrimaryKey(MySqlEventSchedule record) {
        return update(c ->
            c.set(atOid).equalTo(record::getAtOid)
            .set(endsOid).equalTo(record::getEndsOid)
            .set(everyOid).equalTo(record::getEveryOid)
            .set(startsOid).equalTo(record::getStartsOid)
            .where(oid, isEqualTo(record::getOid))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_event_schedule")
    default int updateByPrimaryKeySelective(MySqlEventSchedule record) {
        return update(c ->
            c.set(atOid).equalToWhenPresent(record::getAtOid)
            .set(endsOid).equalToWhenPresent(record::getEndsOid)
            .set(everyOid).equalToWhenPresent(record::getEveryOid)
            .set(startsOid).equalToWhenPresent(record::getStartsOid)
            .where(oid, isEqualTo(record::getOid))
        );
    }
}