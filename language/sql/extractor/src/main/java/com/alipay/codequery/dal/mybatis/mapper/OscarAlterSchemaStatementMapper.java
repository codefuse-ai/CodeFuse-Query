package com.alipay.codequery.dal.mybatis.mapper;

import static com.alipay.codequery.dal.mybatis.mapper.OscarAlterSchemaStatementDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.alipay.codequery.dal.mybatis.domain.OscarAlterSchemaStatement;
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
public interface OscarAlterSchemaStatementMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oscar_alter_schema_statement")
    BasicColumn[] selectList = BasicColumn.columnList(oid, newNameOid, newOwnerOid, schemaNameOid);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oscar_alter_schema_statement")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oscar_alter_schema_statement")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oscar_alter_schema_statement")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<OscarAlterSchemaStatement> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oscar_alter_schema_statement")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<OscarAlterSchemaStatement> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oscar_alter_schema_statement")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="new_name_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="new_owner_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="schema_name_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT)
    })
    Optional<OscarAlterSchemaStatement> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oscar_alter_schema_statement")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="new_name_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="new_owner_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="schema_name_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT)
    })
    List<OscarAlterSchemaStatement> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oscar_alter_schema_statement")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oscar_alter_schema_statement")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, oscarAlterSchemaStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oscar_alter_schema_statement")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, oscarAlterSchemaStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oscar_alter_schema_statement")
    default int deleteByPrimaryKey(Long oid_) {
        return delete(c -> 
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oscar_alter_schema_statement")
    default int insert(OscarAlterSchemaStatement record) {
        return MyBatis3Utils.insert(this::insert, record, oscarAlterSchemaStatement, c ->
            c.map(oid).toProperty("oid")
            .map(newNameOid).toProperty("newNameOid")
            .map(newOwnerOid).toProperty("newOwnerOid")
            .map(schemaNameOid).toProperty("schemaNameOid")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oscar_alter_schema_statement")
    default int insertMultiple(Collection<OscarAlterSchemaStatement> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, oscarAlterSchemaStatement, c ->
            c.map(oid).toProperty("oid")
            .map(newNameOid).toProperty("newNameOid")
            .map(newOwnerOid).toProperty("newOwnerOid")
            .map(schemaNameOid).toProperty("schemaNameOid")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oscar_alter_schema_statement")
    default int insertSelective(OscarAlterSchemaStatement record) {
        return MyBatis3Utils.insert(this::insert, record, oscarAlterSchemaStatement, c ->
            c.map(oid).toPropertyWhenPresent("oid", record::getOid)
            .map(newNameOid).toPropertyWhenPresent("newNameOid", record::getNewNameOid)
            .map(newOwnerOid).toPropertyWhenPresent("newOwnerOid", record::getNewOwnerOid)
            .map(schemaNameOid).toPropertyWhenPresent("schemaNameOid", record::getSchemaNameOid)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oscar_alter_schema_statement")
    default Optional<OscarAlterSchemaStatement> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, oscarAlterSchemaStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oscar_alter_schema_statement")
    default List<OscarAlterSchemaStatement> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, oscarAlterSchemaStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oscar_alter_schema_statement")
    default List<OscarAlterSchemaStatement> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, oscarAlterSchemaStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oscar_alter_schema_statement")
    default Optional<OscarAlterSchemaStatement> selectByPrimaryKey(Long oid_) {
        return selectOne(c ->
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oscar_alter_schema_statement")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, oscarAlterSchemaStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oscar_alter_schema_statement")
    static UpdateDSL<UpdateModel> updateAllColumns(OscarAlterSchemaStatement record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalTo(record::getOid)
                .set(newNameOid).equalTo(record::getNewNameOid)
                .set(newOwnerOid).equalTo(record::getNewOwnerOid)
                .set(schemaNameOid).equalTo(record::getSchemaNameOid);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oscar_alter_schema_statement")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(OscarAlterSchemaStatement record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalToWhenPresent(record::getOid)
                .set(newNameOid).equalToWhenPresent(record::getNewNameOid)
                .set(newOwnerOid).equalToWhenPresent(record::getNewOwnerOid)
                .set(schemaNameOid).equalToWhenPresent(record::getSchemaNameOid);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oscar_alter_schema_statement")
    default int updateByPrimaryKey(OscarAlterSchemaStatement record) {
        return update(c ->
            c.set(newNameOid).equalTo(record::getNewNameOid)
            .set(newOwnerOid).equalTo(record::getNewOwnerOid)
            .set(schemaNameOid).equalTo(record::getSchemaNameOid)
            .where(oid, isEqualTo(record::getOid))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oscar_alter_schema_statement")
    default int updateByPrimaryKeySelective(OscarAlterSchemaStatement record) {
        return update(c ->
            c.set(newNameOid).equalToWhenPresent(record::getNewNameOid)
            .set(newOwnerOid).equalToWhenPresent(record::getNewOwnerOid)
            .set(schemaNameOid).equalToWhenPresent(record::getSchemaNameOid)
            .where(oid, isEqualTo(record::getOid))
        );
    }
}