package com.alipay.codequery.dal.mybatis.mapper;

import static com.alipay.codequery.dal.mybatis.mapper.SqlExportDatabaseStatementDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.alipay.codequery.dal.mybatis.domain.SqlExportDatabaseStatement;
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
public interface SqlExportDatabaseStatementMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_export_database_statement")
    BasicColumn[] selectList = BasicColumn.columnList(oid, dbOid, isRealtime);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_export_database_statement")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_export_database_statement")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_export_database_statement")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<SqlExportDatabaseStatement> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_export_database_statement")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<SqlExportDatabaseStatement> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_export_database_statement")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="db_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_realtime", javaType=Integer.class, jdbcType=JdbcType.BIGINT)
    })
    Optional<SqlExportDatabaseStatement> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_export_database_statement")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="db_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_realtime", javaType=Integer.class, jdbcType=JdbcType.BIGINT)
    })
    List<SqlExportDatabaseStatement> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_export_database_statement")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_export_database_statement")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, sqlExportDatabaseStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_export_database_statement")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, sqlExportDatabaseStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_export_database_statement")
    default int deleteByPrimaryKey(Long oid_) {
        return delete(c -> 
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_export_database_statement")
    default int insert(SqlExportDatabaseStatement record) {
        return MyBatis3Utils.insert(this::insert, record, sqlExportDatabaseStatement, c ->
            c.map(oid).toProperty("oid")
            .map(dbOid).toProperty("dbOid")
            .map(isRealtime).toProperty("isRealtime")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_export_database_statement")
    default int insertMultiple(Collection<SqlExportDatabaseStatement> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, sqlExportDatabaseStatement, c ->
            c.map(oid).toProperty("oid")
            .map(dbOid).toProperty("dbOid")
            .map(isRealtime).toProperty("isRealtime")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_export_database_statement")
    default int insertSelective(SqlExportDatabaseStatement record) {
        return MyBatis3Utils.insert(this::insert, record, sqlExportDatabaseStatement, c ->
            c.map(oid).toPropertyWhenPresent("oid", record::getOid)
            .map(dbOid).toPropertyWhenPresent("dbOid", record::getDbOid)
            .map(isRealtime).toPropertyWhenPresent("isRealtime", record::getIsRealtime)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_export_database_statement")
    default Optional<SqlExportDatabaseStatement> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, sqlExportDatabaseStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_export_database_statement")
    default List<SqlExportDatabaseStatement> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, sqlExportDatabaseStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_export_database_statement")
    default List<SqlExportDatabaseStatement> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, sqlExportDatabaseStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_export_database_statement")
    default Optional<SqlExportDatabaseStatement> selectByPrimaryKey(Long oid_) {
        return selectOne(c ->
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_export_database_statement")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, sqlExportDatabaseStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_export_database_statement")
    static UpdateDSL<UpdateModel> updateAllColumns(SqlExportDatabaseStatement record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalTo(record::getOid)
                .set(dbOid).equalTo(record::getDbOid)
                .set(isRealtime).equalTo(record::getIsRealtime);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_export_database_statement")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(SqlExportDatabaseStatement record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalToWhenPresent(record::getOid)
                .set(dbOid).equalToWhenPresent(record::getDbOid)
                .set(isRealtime).equalToWhenPresent(record::getIsRealtime);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_export_database_statement")
    default int updateByPrimaryKey(SqlExportDatabaseStatement record) {
        return update(c ->
            c.set(dbOid).equalTo(record::getDbOid)
            .set(isRealtime).equalTo(record::getIsRealtime)
            .where(oid, isEqualTo(record::getOid))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_export_database_statement")
    default int updateByPrimaryKeySelective(SqlExportDatabaseStatement record) {
        return update(c ->
            c.set(dbOid).equalToWhenPresent(record::getDbOid)
            .set(isRealtime).equalToWhenPresent(record::getIsRealtime)
            .where(oid, isEqualTo(record::getOid))
        );
    }
}