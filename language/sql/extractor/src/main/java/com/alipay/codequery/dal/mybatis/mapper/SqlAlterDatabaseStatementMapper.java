package com.alipay.codequery.dal.mybatis.mapper;

import static com.alipay.codequery.dal.mybatis.mapper.SqlAlterDatabaseStatementDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.alipay.codequery.dal.mybatis.domain.SqlAlterDatabaseStatement;
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
public interface SqlAlterDatabaseStatementMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_database_statement")
    BasicColumn[] selectList = BasicColumn.columnList(oid, characterOid, isUpgradeDataDirectoryName, itemOid, nameOid);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_database_statement")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_database_statement")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_database_statement")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<SqlAlterDatabaseStatement> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_database_statement")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<SqlAlterDatabaseStatement> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_database_statement")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="character_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_upgrade_data_directory_name", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="item_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="name_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT)
    })
    Optional<SqlAlterDatabaseStatement> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_database_statement")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="character_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_upgrade_data_directory_name", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="item_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="name_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT)
    })
    List<SqlAlterDatabaseStatement> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_database_statement")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_database_statement")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, sqlAlterDatabaseStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_database_statement")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, sqlAlterDatabaseStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_database_statement")
    default int deleteByPrimaryKey(Long oid_) {
        return delete(c -> 
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_database_statement")
    default int insert(SqlAlterDatabaseStatement record) {
        return MyBatis3Utils.insert(this::insert, record, sqlAlterDatabaseStatement, c ->
            c.map(oid).toProperty("oid")
            .map(characterOid).toProperty("characterOid")
            .map(isUpgradeDataDirectoryName).toProperty("isUpgradeDataDirectoryName")
            .map(itemOid).toProperty("itemOid")
            .map(nameOid).toProperty("nameOid")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_database_statement")
    default int insertMultiple(Collection<SqlAlterDatabaseStatement> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, sqlAlterDatabaseStatement, c ->
            c.map(oid).toProperty("oid")
            .map(characterOid).toProperty("characterOid")
            .map(isUpgradeDataDirectoryName).toProperty("isUpgradeDataDirectoryName")
            .map(itemOid).toProperty("itemOid")
            .map(nameOid).toProperty("nameOid")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_database_statement")
    default int insertSelective(SqlAlterDatabaseStatement record) {
        return MyBatis3Utils.insert(this::insert, record, sqlAlterDatabaseStatement, c ->
            c.map(oid).toPropertyWhenPresent("oid", record::getOid)
            .map(characterOid).toPropertyWhenPresent("characterOid", record::getCharacterOid)
            .map(isUpgradeDataDirectoryName).toPropertyWhenPresent("isUpgradeDataDirectoryName", record::getIsUpgradeDataDirectoryName)
            .map(itemOid).toPropertyWhenPresent("itemOid", record::getItemOid)
            .map(nameOid).toPropertyWhenPresent("nameOid", record::getNameOid)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_database_statement")
    default Optional<SqlAlterDatabaseStatement> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, sqlAlterDatabaseStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_database_statement")
    default List<SqlAlterDatabaseStatement> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, sqlAlterDatabaseStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_database_statement")
    default List<SqlAlterDatabaseStatement> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, sqlAlterDatabaseStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_database_statement")
    default Optional<SqlAlterDatabaseStatement> selectByPrimaryKey(Long oid_) {
        return selectOne(c ->
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_database_statement")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, sqlAlterDatabaseStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_database_statement")
    static UpdateDSL<UpdateModel> updateAllColumns(SqlAlterDatabaseStatement record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalTo(record::getOid)
                .set(characterOid).equalTo(record::getCharacterOid)
                .set(isUpgradeDataDirectoryName).equalTo(record::getIsUpgradeDataDirectoryName)
                .set(itemOid).equalTo(record::getItemOid)
                .set(nameOid).equalTo(record::getNameOid);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_database_statement")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(SqlAlterDatabaseStatement record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalToWhenPresent(record::getOid)
                .set(characterOid).equalToWhenPresent(record::getCharacterOid)
                .set(isUpgradeDataDirectoryName).equalToWhenPresent(record::getIsUpgradeDataDirectoryName)
                .set(itemOid).equalToWhenPresent(record::getItemOid)
                .set(nameOid).equalToWhenPresent(record::getNameOid);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_database_statement")
    default int updateByPrimaryKey(SqlAlterDatabaseStatement record) {
        return update(c ->
            c.set(characterOid).equalTo(record::getCharacterOid)
            .set(isUpgradeDataDirectoryName).equalTo(record::getIsUpgradeDataDirectoryName)
            .set(itemOid).equalTo(record::getItemOid)
            .set(nameOid).equalTo(record::getNameOid)
            .where(oid, isEqualTo(record::getOid))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_database_statement")
    default int updateByPrimaryKeySelective(SqlAlterDatabaseStatement record) {
        return update(c ->
            c.set(characterOid).equalToWhenPresent(record::getCharacterOid)
            .set(isUpgradeDataDirectoryName).equalToWhenPresent(record::getIsUpgradeDataDirectoryName)
            .set(itemOid).equalToWhenPresent(record::getItemOid)
            .set(nameOid).equalToWhenPresent(record::getNameOid)
            .where(oid, isEqualTo(record::getOid))
        );
    }
}