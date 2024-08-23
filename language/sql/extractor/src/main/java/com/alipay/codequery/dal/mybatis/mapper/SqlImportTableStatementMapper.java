package com.alipay.codequery.dal.mybatis.mapper;

import static com.alipay.codequery.dal.mybatis.mapper.SqlImportTableStatementDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.alipay.codequery.dal.mybatis.domain.SqlImportTableStatement;
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
public interface SqlImportTableStatementMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_import_table_statement")
    BasicColumn[] selectList = BasicColumn.columnList(oid, fromOid, isExtenal, isUsingBuild, locationOid, tableOid, versionOid);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_import_table_statement")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_import_table_statement")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_import_table_statement")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<SqlImportTableStatement> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_import_table_statement")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<SqlImportTableStatement> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_import_table_statement")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="from_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_extenal", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_using_build", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="location_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="table_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="version_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT)
    })
    Optional<SqlImportTableStatement> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_import_table_statement")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="from_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_extenal", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_using_build", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="location_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="table_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="version_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT)
    })
    List<SqlImportTableStatement> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_import_table_statement")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_import_table_statement")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, sqlImportTableStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_import_table_statement")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, sqlImportTableStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_import_table_statement")
    default int deleteByPrimaryKey(Long oid_) {
        return delete(c -> 
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_import_table_statement")
    default int insert(SqlImportTableStatement record) {
        return MyBatis3Utils.insert(this::insert, record, sqlImportTableStatement, c ->
            c.map(oid).toProperty("oid")
            .map(fromOid).toProperty("fromOid")
            .map(isExtenal).toProperty("isExtenal")
            .map(isUsingBuild).toProperty("isUsingBuild")
            .map(locationOid).toProperty("locationOid")
            .map(tableOid).toProperty("tableOid")
            .map(versionOid).toProperty("versionOid")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_import_table_statement")
    default int insertMultiple(Collection<SqlImportTableStatement> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, sqlImportTableStatement, c ->
            c.map(oid).toProperty("oid")
            .map(fromOid).toProperty("fromOid")
            .map(isExtenal).toProperty("isExtenal")
            .map(isUsingBuild).toProperty("isUsingBuild")
            .map(locationOid).toProperty("locationOid")
            .map(tableOid).toProperty("tableOid")
            .map(versionOid).toProperty("versionOid")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_import_table_statement")
    default int insertSelective(SqlImportTableStatement record) {
        return MyBatis3Utils.insert(this::insert, record, sqlImportTableStatement, c ->
            c.map(oid).toPropertyWhenPresent("oid", record::getOid)
            .map(fromOid).toPropertyWhenPresent("fromOid", record::getFromOid)
            .map(isExtenal).toPropertyWhenPresent("isExtenal", record::getIsExtenal)
            .map(isUsingBuild).toPropertyWhenPresent("isUsingBuild", record::getIsUsingBuild)
            .map(locationOid).toPropertyWhenPresent("locationOid", record::getLocationOid)
            .map(tableOid).toPropertyWhenPresent("tableOid", record::getTableOid)
            .map(versionOid).toPropertyWhenPresent("versionOid", record::getVersionOid)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_import_table_statement")
    default Optional<SqlImportTableStatement> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, sqlImportTableStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_import_table_statement")
    default List<SqlImportTableStatement> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, sqlImportTableStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_import_table_statement")
    default List<SqlImportTableStatement> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, sqlImportTableStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_import_table_statement")
    default Optional<SqlImportTableStatement> selectByPrimaryKey(Long oid_) {
        return selectOne(c ->
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_import_table_statement")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, sqlImportTableStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_import_table_statement")
    static UpdateDSL<UpdateModel> updateAllColumns(SqlImportTableStatement record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalTo(record::getOid)
                .set(fromOid).equalTo(record::getFromOid)
                .set(isExtenal).equalTo(record::getIsExtenal)
                .set(isUsingBuild).equalTo(record::getIsUsingBuild)
                .set(locationOid).equalTo(record::getLocationOid)
                .set(tableOid).equalTo(record::getTableOid)
                .set(versionOid).equalTo(record::getVersionOid);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_import_table_statement")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(SqlImportTableStatement record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalToWhenPresent(record::getOid)
                .set(fromOid).equalToWhenPresent(record::getFromOid)
                .set(isExtenal).equalToWhenPresent(record::getIsExtenal)
                .set(isUsingBuild).equalToWhenPresent(record::getIsUsingBuild)
                .set(locationOid).equalToWhenPresent(record::getLocationOid)
                .set(tableOid).equalToWhenPresent(record::getTableOid)
                .set(versionOid).equalToWhenPresent(record::getVersionOid);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_import_table_statement")
    default int updateByPrimaryKey(SqlImportTableStatement record) {
        return update(c ->
            c.set(fromOid).equalTo(record::getFromOid)
            .set(isExtenal).equalTo(record::getIsExtenal)
            .set(isUsingBuild).equalTo(record::getIsUsingBuild)
            .set(locationOid).equalTo(record::getLocationOid)
            .set(tableOid).equalTo(record::getTableOid)
            .set(versionOid).equalTo(record::getVersionOid)
            .where(oid, isEqualTo(record::getOid))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_import_table_statement")
    default int updateByPrimaryKeySelective(SqlImportTableStatement record) {
        return update(c ->
            c.set(fromOid).equalToWhenPresent(record::getFromOid)
            .set(isExtenal).equalToWhenPresent(record::getIsExtenal)
            .set(isUsingBuild).equalToWhenPresent(record::getIsUsingBuild)
            .set(locationOid).equalToWhenPresent(record::getLocationOid)
            .set(tableOid).equalToWhenPresent(record::getTableOid)
            .set(versionOid).equalToWhenPresent(record::getVersionOid)
            .where(oid, isEqualTo(record::getOid))
        );
    }
}