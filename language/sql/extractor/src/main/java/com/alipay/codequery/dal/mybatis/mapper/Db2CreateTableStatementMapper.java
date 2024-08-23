package com.alipay.codequery.dal.mybatis.mapper;

import static com.alipay.codequery.dal.mybatis.mapper.Db2CreateTableStatementDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.alipay.codequery.dal.mybatis.domain.Db2CreateTableStatement;
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
public interface Db2CreateTableStatementMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: db2_create_table_statement")
    BasicColumn[] selectList = BasicColumn.columnList(oid, databaseOid, indexInOid, isDataCaptureChanges, isDataCaptureNone, validprocOid);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: db2_create_table_statement")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: db2_create_table_statement")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: db2_create_table_statement")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<Db2CreateTableStatement> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: db2_create_table_statement")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<Db2CreateTableStatement> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: db2_create_table_statement")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="database_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="index_in_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_data_capture_changes", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_data_capture_none", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="validproc_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT)
    })
    Optional<Db2CreateTableStatement> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: db2_create_table_statement")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="database_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="index_in_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_data_capture_changes", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_data_capture_none", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="validproc_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT)
    })
    List<Db2CreateTableStatement> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: db2_create_table_statement")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: db2_create_table_statement")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, db2CreateTableStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: db2_create_table_statement")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, db2CreateTableStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: db2_create_table_statement")
    default int deleteByPrimaryKey(Long oid_) {
        return delete(c -> 
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: db2_create_table_statement")
    default int insert(Db2CreateTableStatement record) {
        return MyBatis3Utils.insert(this::insert, record, db2CreateTableStatement, c ->
            c.map(oid).toProperty("oid")
            .map(databaseOid).toProperty("databaseOid")
            .map(indexInOid).toProperty("indexInOid")
            .map(isDataCaptureChanges).toProperty("isDataCaptureChanges")
            .map(isDataCaptureNone).toProperty("isDataCaptureNone")
            .map(validprocOid).toProperty("validprocOid")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: db2_create_table_statement")
    default int insertMultiple(Collection<Db2CreateTableStatement> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, db2CreateTableStatement, c ->
            c.map(oid).toProperty("oid")
            .map(databaseOid).toProperty("databaseOid")
            .map(indexInOid).toProperty("indexInOid")
            .map(isDataCaptureChanges).toProperty("isDataCaptureChanges")
            .map(isDataCaptureNone).toProperty("isDataCaptureNone")
            .map(validprocOid).toProperty("validprocOid")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: db2_create_table_statement")
    default int insertSelective(Db2CreateTableStatement record) {
        return MyBatis3Utils.insert(this::insert, record, db2CreateTableStatement, c ->
            c.map(oid).toPropertyWhenPresent("oid", record::getOid)
            .map(databaseOid).toPropertyWhenPresent("databaseOid", record::getDatabaseOid)
            .map(indexInOid).toPropertyWhenPresent("indexInOid", record::getIndexInOid)
            .map(isDataCaptureChanges).toPropertyWhenPresent("isDataCaptureChanges", record::getIsDataCaptureChanges)
            .map(isDataCaptureNone).toPropertyWhenPresent("isDataCaptureNone", record::getIsDataCaptureNone)
            .map(validprocOid).toPropertyWhenPresent("validprocOid", record::getValidprocOid)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: db2_create_table_statement")
    default Optional<Db2CreateTableStatement> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, db2CreateTableStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: db2_create_table_statement")
    default List<Db2CreateTableStatement> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, db2CreateTableStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: db2_create_table_statement")
    default List<Db2CreateTableStatement> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, db2CreateTableStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: db2_create_table_statement")
    default Optional<Db2CreateTableStatement> selectByPrimaryKey(Long oid_) {
        return selectOne(c ->
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: db2_create_table_statement")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, db2CreateTableStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: db2_create_table_statement")
    static UpdateDSL<UpdateModel> updateAllColumns(Db2CreateTableStatement record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalTo(record::getOid)
                .set(databaseOid).equalTo(record::getDatabaseOid)
                .set(indexInOid).equalTo(record::getIndexInOid)
                .set(isDataCaptureChanges).equalTo(record::getIsDataCaptureChanges)
                .set(isDataCaptureNone).equalTo(record::getIsDataCaptureNone)
                .set(validprocOid).equalTo(record::getValidprocOid);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: db2_create_table_statement")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(Db2CreateTableStatement record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalToWhenPresent(record::getOid)
                .set(databaseOid).equalToWhenPresent(record::getDatabaseOid)
                .set(indexInOid).equalToWhenPresent(record::getIndexInOid)
                .set(isDataCaptureChanges).equalToWhenPresent(record::getIsDataCaptureChanges)
                .set(isDataCaptureNone).equalToWhenPresent(record::getIsDataCaptureNone)
                .set(validprocOid).equalToWhenPresent(record::getValidprocOid);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: db2_create_table_statement")
    default int updateByPrimaryKey(Db2CreateTableStatement record) {
        return update(c ->
            c.set(databaseOid).equalTo(record::getDatabaseOid)
            .set(indexInOid).equalTo(record::getIndexInOid)
            .set(isDataCaptureChanges).equalTo(record::getIsDataCaptureChanges)
            .set(isDataCaptureNone).equalTo(record::getIsDataCaptureNone)
            .set(validprocOid).equalTo(record::getValidprocOid)
            .where(oid, isEqualTo(record::getOid))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: db2_create_table_statement")
    default int updateByPrimaryKeySelective(Db2CreateTableStatement record) {
        return update(c ->
            c.set(databaseOid).equalToWhenPresent(record::getDatabaseOid)
            .set(indexInOid).equalToWhenPresent(record::getIndexInOid)
            .set(isDataCaptureChanges).equalToWhenPresent(record::getIsDataCaptureChanges)
            .set(isDataCaptureNone).equalToWhenPresent(record::getIsDataCaptureNone)
            .set(validprocOid).equalToWhenPresent(record::getValidprocOid)
            .where(oid, isEqualTo(record::getOid))
        );
    }
}