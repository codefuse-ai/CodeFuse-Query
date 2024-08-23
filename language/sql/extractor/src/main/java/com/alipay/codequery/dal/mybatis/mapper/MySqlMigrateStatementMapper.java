package com.alipay.codequery.dal.mybatis.mapper;

import static com.alipay.codequery.dal.mybatis.mapper.MySqlMigrateStatementDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.alipay.codequery.dal.mybatis.domain.MySqlMigrateStatement;
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
public interface MySqlMigrateStatementMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_migrate_statement")
    BasicColumn[] selectList = BasicColumn.columnList(oid, fromInsIdOid, fromInsIpOid, fromInsPortOid, fromInsStatusOid, migrateTypeOid, schemaOid, shardNamesOid, toInsIdOid, toInsIpOid, toInsPortOid, toInsStatusOid);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_migrate_statement")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_migrate_statement")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_migrate_statement")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<MySqlMigrateStatement> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_migrate_statement")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<MySqlMigrateStatement> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_migrate_statement")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="from_ins_id_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="from_ins_ip_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="from_ins_port_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="from_ins_status_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="migrate_type_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="schema_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="shard_names_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="to_ins_id_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="to_ins_ip_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="to_ins_port_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="to_ins_status_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT)
    })
    Optional<MySqlMigrateStatement> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_migrate_statement")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="from_ins_id_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="from_ins_ip_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="from_ins_port_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="from_ins_status_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="migrate_type_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="schema_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="shard_names_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="to_ins_id_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="to_ins_ip_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="to_ins_port_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="to_ins_status_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT)
    })
    List<MySqlMigrateStatement> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_migrate_statement")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_migrate_statement")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, mySqlMigrateStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_migrate_statement")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, mySqlMigrateStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_migrate_statement")
    default int deleteByPrimaryKey(Long oid_) {
        return delete(c -> 
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_migrate_statement")
    default int insert(MySqlMigrateStatement record) {
        return MyBatis3Utils.insert(this::insert, record, mySqlMigrateStatement, c ->
            c.map(oid).toProperty("oid")
            .map(fromInsIdOid).toProperty("fromInsIdOid")
            .map(fromInsIpOid).toProperty("fromInsIpOid")
            .map(fromInsPortOid).toProperty("fromInsPortOid")
            .map(fromInsStatusOid).toProperty("fromInsStatusOid")
            .map(migrateTypeOid).toProperty("migrateTypeOid")
            .map(schemaOid).toProperty("schemaOid")
            .map(shardNamesOid).toProperty("shardNamesOid")
            .map(toInsIdOid).toProperty("toInsIdOid")
            .map(toInsIpOid).toProperty("toInsIpOid")
            .map(toInsPortOid).toProperty("toInsPortOid")
            .map(toInsStatusOid).toProperty("toInsStatusOid")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_migrate_statement")
    default int insertMultiple(Collection<MySqlMigrateStatement> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, mySqlMigrateStatement, c ->
            c.map(oid).toProperty("oid")
            .map(fromInsIdOid).toProperty("fromInsIdOid")
            .map(fromInsIpOid).toProperty("fromInsIpOid")
            .map(fromInsPortOid).toProperty("fromInsPortOid")
            .map(fromInsStatusOid).toProperty("fromInsStatusOid")
            .map(migrateTypeOid).toProperty("migrateTypeOid")
            .map(schemaOid).toProperty("schemaOid")
            .map(shardNamesOid).toProperty("shardNamesOid")
            .map(toInsIdOid).toProperty("toInsIdOid")
            .map(toInsIpOid).toProperty("toInsIpOid")
            .map(toInsPortOid).toProperty("toInsPortOid")
            .map(toInsStatusOid).toProperty("toInsStatusOid")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_migrate_statement")
    default int insertSelective(MySqlMigrateStatement record) {
        return MyBatis3Utils.insert(this::insert, record, mySqlMigrateStatement, c ->
            c.map(oid).toPropertyWhenPresent("oid", record::getOid)
            .map(fromInsIdOid).toPropertyWhenPresent("fromInsIdOid", record::getFromInsIdOid)
            .map(fromInsIpOid).toPropertyWhenPresent("fromInsIpOid", record::getFromInsIpOid)
            .map(fromInsPortOid).toPropertyWhenPresent("fromInsPortOid", record::getFromInsPortOid)
            .map(fromInsStatusOid).toPropertyWhenPresent("fromInsStatusOid", record::getFromInsStatusOid)
            .map(migrateTypeOid).toPropertyWhenPresent("migrateTypeOid", record::getMigrateTypeOid)
            .map(schemaOid).toPropertyWhenPresent("schemaOid", record::getSchemaOid)
            .map(shardNamesOid).toPropertyWhenPresent("shardNamesOid", record::getShardNamesOid)
            .map(toInsIdOid).toPropertyWhenPresent("toInsIdOid", record::getToInsIdOid)
            .map(toInsIpOid).toPropertyWhenPresent("toInsIpOid", record::getToInsIpOid)
            .map(toInsPortOid).toPropertyWhenPresent("toInsPortOid", record::getToInsPortOid)
            .map(toInsStatusOid).toPropertyWhenPresent("toInsStatusOid", record::getToInsStatusOid)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_migrate_statement")
    default Optional<MySqlMigrateStatement> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, mySqlMigrateStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_migrate_statement")
    default List<MySqlMigrateStatement> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, mySqlMigrateStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_migrate_statement")
    default List<MySqlMigrateStatement> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, mySqlMigrateStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_migrate_statement")
    default Optional<MySqlMigrateStatement> selectByPrimaryKey(Long oid_) {
        return selectOne(c ->
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_migrate_statement")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, mySqlMigrateStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_migrate_statement")
    static UpdateDSL<UpdateModel> updateAllColumns(MySqlMigrateStatement record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalTo(record::getOid)
                .set(fromInsIdOid).equalTo(record::getFromInsIdOid)
                .set(fromInsIpOid).equalTo(record::getFromInsIpOid)
                .set(fromInsPortOid).equalTo(record::getFromInsPortOid)
                .set(fromInsStatusOid).equalTo(record::getFromInsStatusOid)
                .set(migrateTypeOid).equalTo(record::getMigrateTypeOid)
                .set(schemaOid).equalTo(record::getSchemaOid)
                .set(shardNamesOid).equalTo(record::getShardNamesOid)
                .set(toInsIdOid).equalTo(record::getToInsIdOid)
                .set(toInsIpOid).equalTo(record::getToInsIpOid)
                .set(toInsPortOid).equalTo(record::getToInsPortOid)
                .set(toInsStatusOid).equalTo(record::getToInsStatusOid);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_migrate_statement")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(MySqlMigrateStatement record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalToWhenPresent(record::getOid)
                .set(fromInsIdOid).equalToWhenPresent(record::getFromInsIdOid)
                .set(fromInsIpOid).equalToWhenPresent(record::getFromInsIpOid)
                .set(fromInsPortOid).equalToWhenPresent(record::getFromInsPortOid)
                .set(fromInsStatusOid).equalToWhenPresent(record::getFromInsStatusOid)
                .set(migrateTypeOid).equalToWhenPresent(record::getMigrateTypeOid)
                .set(schemaOid).equalToWhenPresent(record::getSchemaOid)
                .set(shardNamesOid).equalToWhenPresent(record::getShardNamesOid)
                .set(toInsIdOid).equalToWhenPresent(record::getToInsIdOid)
                .set(toInsIpOid).equalToWhenPresent(record::getToInsIpOid)
                .set(toInsPortOid).equalToWhenPresent(record::getToInsPortOid)
                .set(toInsStatusOid).equalToWhenPresent(record::getToInsStatusOid);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_migrate_statement")
    default int updateByPrimaryKey(MySqlMigrateStatement record) {
        return update(c ->
            c.set(fromInsIdOid).equalTo(record::getFromInsIdOid)
            .set(fromInsIpOid).equalTo(record::getFromInsIpOid)
            .set(fromInsPortOid).equalTo(record::getFromInsPortOid)
            .set(fromInsStatusOid).equalTo(record::getFromInsStatusOid)
            .set(migrateTypeOid).equalTo(record::getMigrateTypeOid)
            .set(schemaOid).equalTo(record::getSchemaOid)
            .set(shardNamesOid).equalTo(record::getShardNamesOid)
            .set(toInsIdOid).equalTo(record::getToInsIdOid)
            .set(toInsIpOid).equalTo(record::getToInsIpOid)
            .set(toInsPortOid).equalTo(record::getToInsPortOid)
            .set(toInsStatusOid).equalTo(record::getToInsStatusOid)
            .where(oid, isEqualTo(record::getOid))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_migrate_statement")
    default int updateByPrimaryKeySelective(MySqlMigrateStatement record) {
        return update(c ->
            c.set(fromInsIdOid).equalToWhenPresent(record::getFromInsIdOid)
            .set(fromInsIpOid).equalToWhenPresent(record::getFromInsIpOid)
            .set(fromInsPortOid).equalToWhenPresent(record::getFromInsPortOid)
            .set(fromInsStatusOid).equalToWhenPresent(record::getFromInsStatusOid)
            .set(migrateTypeOid).equalToWhenPresent(record::getMigrateTypeOid)
            .set(schemaOid).equalToWhenPresent(record::getSchemaOid)
            .set(shardNamesOid).equalToWhenPresent(record::getShardNamesOid)
            .set(toInsIdOid).equalToWhenPresent(record::getToInsIdOid)
            .set(toInsIpOid).equalToWhenPresent(record::getToInsIpOid)
            .set(toInsPortOid).equalToWhenPresent(record::getToInsPortOid)
            .set(toInsStatusOid).equalToWhenPresent(record::getToInsStatusOid)
            .where(oid, isEqualTo(record::getOid))
        );
    }
}