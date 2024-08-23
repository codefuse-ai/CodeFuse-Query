package com.alipay.codequery.dal.mybatis.mapper;

import static com.alipay.codequery.dal.mybatis.mapper.SqlBuildTableStatementDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.alipay.codequery.dal.mybatis.domain.SqlBuildTableStatement;
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
public interface SqlBuildTableStatementMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_build_table_statement")
    BasicColumn[] selectList = BasicColumn.columnList(oid, isForce, isWithSplit, tableOid, versionOid);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_build_table_statement")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_build_table_statement")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_build_table_statement")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<SqlBuildTableStatement> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_build_table_statement")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<SqlBuildTableStatement> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_build_table_statement")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="is_force", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_with_split", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="table_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="version_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT)
    })
    Optional<SqlBuildTableStatement> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_build_table_statement")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="is_force", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_with_split", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="table_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="version_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT)
    })
    List<SqlBuildTableStatement> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_build_table_statement")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_build_table_statement")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, sqlBuildTableStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_build_table_statement")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, sqlBuildTableStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_build_table_statement")
    default int deleteByPrimaryKey(Long oid_) {
        return delete(c -> 
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_build_table_statement")
    default int insert(SqlBuildTableStatement record) {
        return MyBatis3Utils.insert(this::insert, record, sqlBuildTableStatement, c ->
            c.map(oid).toProperty("oid")
            .map(isForce).toProperty("isForce")
            .map(isWithSplit).toProperty("isWithSplit")
            .map(tableOid).toProperty("tableOid")
            .map(versionOid).toProperty("versionOid")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_build_table_statement")
    default int insertMultiple(Collection<SqlBuildTableStatement> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, sqlBuildTableStatement, c ->
            c.map(oid).toProperty("oid")
            .map(isForce).toProperty("isForce")
            .map(isWithSplit).toProperty("isWithSplit")
            .map(tableOid).toProperty("tableOid")
            .map(versionOid).toProperty("versionOid")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_build_table_statement")
    default int insertSelective(SqlBuildTableStatement record) {
        return MyBatis3Utils.insert(this::insert, record, sqlBuildTableStatement, c ->
            c.map(oid).toPropertyWhenPresent("oid", record::getOid)
            .map(isForce).toPropertyWhenPresent("isForce", record::getIsForce)
            .map(isWithSplit).toPropertyWhenPresent("isWithSplit", record::getIsWithSplit)
            .map(tableOid).toPropertyWhenPresent("tableOid", record::getTableOid)
            .map(versionOid).toPropertyWhenPresent("versionOid", record::getVersionOid)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_build_table_statement")
    default Optional<SqlBuildTableStatement> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, sqlBuildTableStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_build_table_statement")
    default List<SqlBuildTableStatement> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, sqlBuildTableStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_build_table_statement")
    default List<SqlBuildTableStatement> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, sqlBuildTableStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_build_table_statement")
    default Optional<SqlBuildTableStatement> selectByPrimaryKey(Long oid_) {
        return selectOne(c ->
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_build_table_statement")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, sqlBuildTableStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_build_table_statement")
    static UpdateDSL<UpdateModel> updateAllColumns(SqlBuildTableStatement record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalTo(record::getOid)
                .set(isForce).equalTo(record::getIsForce)
                .set(isWithSplit).equalTo(record::getIsWithSplit)
                .set(tableOid).equalTo(record::getTableOid)
                .set(versionOid).equalTo(record::getVersionOid);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_build_table_statement")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(SqlBuildTableStatement record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalToWhenPresent(record::getOid)
                .set(isForce).equalToWhenPresent(record::getIsForce)
                .set(isWithSplit).equalToWhenPresent(record::getIsWithSplit)
                .set(tableOid).equalToWhenPresent(record::getTableOid)
                .set(versionOid).equalToWhenPresent(record::getVersionOid);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_build_table_statement")
    default int updateByPrimaryKey(SqlBuildTableStatement record) {
        return update(c ->
            c.set(isForce).equalTo(record::getIsForce)
            .set(isWithSplit).equalTo(record::getIsWithSplit)
            .set(tableOid).equalTo(record::getTableOid)
            .set(versionOid).equalTo(record::getVersionOid)
            .where(oid, isEqualTo(record::getOid))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_build_table_statement")
    default int updateByPrimaryKeySelective(SqlBuildTableStatement record) {
        return update(c ->
            c.set(isForce).equalToWhenPresent(record::getIsForce)
            .set(isWithSplit).equalToWhenPresent(record::getIsWithSplit)
            .set(tableOid).equalToWhenPresent(record::getTableOid)
            .set(versionOid).equalToWhenPresent(record::getVersionOid)
            .where(oid, isEqualTo(record::getOid))
        );
    }
}