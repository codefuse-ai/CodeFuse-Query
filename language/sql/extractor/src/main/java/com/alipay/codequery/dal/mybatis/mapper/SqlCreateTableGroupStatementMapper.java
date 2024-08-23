package com.alipay.codequery.dal.mybatis.mapper;

import static com.alipay.codequery.dal.mybatis.mapper.SqlCreateTableGroupStatementDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.alipay.codequery.dal.mybatis.domain.SqlCreateTableGroupStatement;
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
public interface SqlCreateTableGroupStatementMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_create_table_group_statement")
    BasicColumn[] selectList = BasicColumn.columnList(oid, isIfNotExists, nameOid, partitionNumOid, schemaName, tableGroupName);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_create_table_group_statement")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_create_table_group_statement")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_create_table_group_statement")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<SqlCreateTableGroupStatement> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_create_table_group_statement")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<SqlCreateTableGroupStatement> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_create_table_group_statement")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="is_if_not_exists", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="name_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="partition_num_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="schema_name", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="table_group_name", javaType=String.class, jdbcType=JdbcType.VARCHAR)
    })
    Optional<SqlCreateTableGroupStatement> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_create_table_group_statement")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="is_if_not_exists", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="name_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="partition_num_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="schema_name", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="table_group_name", javaType=String.class, jdbcType=JdbcType.VARCHAR)
    })
    List<SqlCreateTableGroupStatement> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_create_table_group_statement")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_create_table_group_statement")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, sqlCreateTableGroupStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_create_table_group_statement")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, sqlCreateTableGroupStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_create_table_group_statement")
    default int deleteByPrimaryKey(Long oid_) {
        return delete(c -> 
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_create_table_group_statement")
    default int insert(SqlCreateTableGroupStatement record) {
        return MyBatis3Utils.insert(this::insert, record, sqlCreateTableGroupStatement, c ->
            c.map(oid).toProperty("oid")
            .map(isIfNotExists).toProperty("isIfNotExists")
            .map(nameOid).toProperty("nameOid")
            .map(partitionNumOid).toProperty("partitionNumOid")
            .map(schemaName).toProperty("schemaName")
            .map(tableGroupName).toProperty("tableGroupName")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_create_table_group_statement")
    default int insertMultiple(Collection<SqlCreateTableGroupStatement> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, sqlCreateTableGroupStatement, c ->
            c.map(oid).toProperty("oid")
            .map(isIfNotExists).toProperty("isIfNotExists")
            .map(nameOid).toProperty("nameOid")
            .map(partitionNumOid).toProperty("partitionNumOid")
            .map(schemaName).toProperty("schemaName")
            .map(tableGroupName).toProperty("tableGroupName")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_create_table_group_statement")
    default int insertSelective(SqlCreateTableGroupStatement record) {
        return MyBatis3Utils.insert(this::insert, record, sqlCreateTableGroupStatement, c ->
            c.map(oid).toPropertyWhenPresent("oid", record::getOid)
            .map(isIfNotExists).toPropertyWhenPresent("isIfNotExists", record::getIsIfNotExists)
            .map(nameOid).toPropertyWhenPresent("nameOid", record::getNameOid)
            .map(partitionNumOid).toPropertyWhenPresent("partitionNumOid", record::getPartitionNumOid)
            .map(schemaName).toPropertyWhenPresent("schemaName", record::getSchemaName)
            .map(tableGroupName).toPropertyWhenPresent("tableGroupName", record::getTableGroupName)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_create_table_group_statement")
    default Optional<SqlCreateTableGroupStatement> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, sqlCreateTableGroupStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_create_table_group_statement")
    default List<SqlCreateTableGroupStatement> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, sqlCreateTableGroupStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_create_table_group_statement")
    default List<SqlCreateTableGroupStatement> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, sqlCreateTableGroupStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_create_table_group_statement")
    default Optional<SqlCreateTableGroupStatement> selectByPrimaryKey(Long oid_) {
        return selectOne(c ->
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_create_table_group_statement")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, sqlCreateTableGroupStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_create_table_group_statement")
    static UpdateDSL<UpdateModel> updateAllColumns(SqlCreateTableGroupStatement record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalTo(record::getOid)
                .set(isIfNotExists).equalTo(record::getIsIfNotExists)
                .set(nameOid).equalTo(record::getNameOid)
                .set(partitionNumOid).equalTo(record::getPartitionNumOid)
                .set(schemaName).equalTo(record::getSchemaName)
                .set(tableGroupName).equalTo(record::getTableGroupName);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_create_table_group_statement")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(SqlCreateTableGroupStatement record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalToWhenPresent(record::getOid)
                .set(isIfNotExists).equalToWhenPresent(record::getIsIfNotExists)
                .set(nameOid).equalToWhenPresent(record::getNameOid)
                .set(partitionNumOid).equalToWhenPresent(record::getPartitionNumOid)
                .set(schemaName).equalToWhenPresent(record::getSchemaName)
                .set(tableGroupName).equalToWhenPresent(record::getTableGroupName);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_create_table_group_statement")
    default int updateByPrimaryKey(SqlCreateTableGroupStatement record) {
        return update(c ->
            c.set(isIfNotExists).equalTo(record::getIsIfNotExists)
            .set(nameOid).equalTo(record::getNameOid)
            .set(partitionNumOid).equalTo(record::getPartitionNumOid)
            .set(schemaName).equalTo(record::getSchemaName)
            .set(tableGroupName).equalTo(record::getTableGroupName)
            .where(oid, isEqualTo(record::getOid))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_create_table_group_statement")
    default int updateByPrimaryKeySelective(SqlCreateTableGroupStatement record) {
        return update(c ->
            c.set(isIfNotExists).equalToWhenPresent(record::getIsIfNotExists)
            .set(nameOid).equalToWhenPresent(record::getNameOid)
            .set(partitionNumOid).equalToWhenPresent(record::getPartitionNumOid)
            .set(schemaName).equalToWhenPresent(record::getSchemaName)
            .set(tableGroupName).equalToWhenPresent(record::getTableGroupName)
            .where(oid, isEqualTo(record::getOid))
        );
    }
}