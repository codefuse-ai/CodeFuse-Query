package com.alipay.codequery.dal.mybatis.mapper;

import static com.alipay.codequery.dal.mybatis.mapper.MySqlAlterDatabaseKillJobDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.alipay.codequery.dal.mybatis.domain.MySqlAlterDatabaseKillJob;
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
public interface MySqlAlterDatabaseKillJobMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_alter_database_kill_job")
    BasicColumn[] selectList = BasicColumn.columnList(oid, jobIdOid, jobTypeOid);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_alter_database_kill_job")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_alter_database_kill_job")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_alter_database_kill_job")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<MySqlAlterDatabaseKillJob> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_alter_database_kill_job")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<MySqlAlterDatabaseKillJob> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_alter_database_kill_job")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="job_id_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="job_type_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT)
    })
    Optional<MySqlAlterDatabaseKillJob> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_alter_database_kill_job")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="job_id_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="job_type_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT)
    })
    List<MySqlAlterDatabaseKillJob> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_alter_database_kill_job")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_alter_database_kill_job")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, mySqlAlterDatabaseKillJob, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_alter_database_kill_job")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, mySqlAlterDatabaseKillJob, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_alter_database_kill_job")
    default int deleteByPrimaryKey(Long oid_) {
        return delete(c -> 
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_alter_database_kill_job")
    default int insert(MySqlAlterDatabaseKillJob record) {
        return MyBatis3Utils.insert(this::insert, record, mySqlAlterDatabaseKillJob, c ->
            c.map(oid).toProperty("oid")
            .map(jobIdOid).toProperty("jobIdOid")
            .map(jobTypeOid).toProperty("jobTypeOid")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_alter_database_kill_job")
    default int insertMultiple(Collection<MySqlAlterDatabaseKillJob> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, mySqlAlterDatabaseKillJob, c ->
            c.map(oid).toProperty("oid")
            .map(jobIdOid).toProperty("jobIdOid")
            .map(jobTypeOid).toProperty("jobTypeOid")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_alter_database_kill_job")
    default int insertSelective(MySqlAlterDatabaseKillJob record) {
        return MyBatis3Utils.insert(this::insert, record, mySqlAlterDatabaseKillJob, c ->
            c.map(oid).toPropertyWhenPresent("oid", record::getOid)
            .map(jobIdOid).toPropertyWhenPresent("jobIdOid", record::getJobIdOid)
            .map(jobTypeOid).toPropertyWhenPresent("jobTypeOid", record::getJobTypeOid)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_alter_database_kill_job")
    default Optional<MySqlAlterDatabaseKillJob> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, mySqlAlterDatabaseKillJob, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_alter_database_kill_job")
    default List<MySqlAlterDatabaseKillJob> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, mySqlAlterDatabaseKillJob, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_alter_database_kill_job")
    default List<MySqlAlterDatabaseKillJob> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, mySqlAlterDatabaseKillJob, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_alter_database_kill_job")
    default Optional<MySqlAlterDatabaseKillJob> selectByPrimaryKey(Long oid_) {
        return selectOne(c ->
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_alter_database_kill_job")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, mySqlAlterDatabaseKillJob, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_alter_database_kill_job")
    static UpdateDSL<UpdateModel> updateAllColumns(MySqlAlterDatabaseKillJob record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalTo(record::getOid)
                .set(jobIdOid).equalTo(record::getJobIdOid)
                .set(jobTypeOid).equalTo(record::getJobTypeOid);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_alter_database_kill_job")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(MySqlAlterDatabaseKillJob record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalToWhenPresent(record::getOid)
                .set(jobIdOid).equalToWhenPresent(record::getJobIdOid)
                .set(jobTypeOid).equalToWhenPresent(record::getJobTypeOid);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_alter_database_kill_job")
    default int updateByPrimaryKey(MySqlAlterDatabaseKillJob record) {
        return update(c ->
            c.set(jobIdOid).equalTo(record::getJobIdOid)
            .set(jobTypeOid).equalTo(record::getJobTypeOid)
            .where(oid, isEqualTo(record::getOid))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_alter_database_kill_job")
    default int updateByPrimaryKeySelective(MySqlAlterDatabaseKillJob record) {
        return update(c ->
            c.set(jobIdOid).equalToWhenPresent(record::getJobIdOid)
            .set(jobTypeOid).equalToWhenPresent(record::getJobTypeOid)
            .where(oid, isEqualTo(record::getOid))
        );
    }
}