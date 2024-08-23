package com.alipay.codequery.dal.mybatis.mapper;

import static com.alipay.codequery.dal.mybatis.mapper.OdpsUnloadStatementDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.alipay.codequery.dal.mybatis.domain.OdpsUnloadStatement;
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
public interface OdpsUnloadStatementMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: odps_unload_statement")
    BasicColumn[] selectList = BasicColumn.columnList(oid, fromOid, locationOid, rowFormatOid, storedAsOid);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: odps_unload_statement")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: odps_unload_statement")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: odps_unload_statement")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<OdpsUnloadStatement> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: odps_unload_statement")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<OdpsUnloadStatement> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: odps_unload_statement")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="from_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="location_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="row_format_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="stored_as_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT)
    })
    Optional<OdpsUnloadStatement> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: odps_unload_statement")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="from_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="location_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="row_format_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="stored_as_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT)
    })
    List<OdpsUnloadStatement> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: odps_unload_statement")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: odps_unload_statement")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, odpsUnloadStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: odps_unload_statement")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, odpsUnloadStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: odps_unload_statement")
    default int deleteByPrimaryKey(Long oid_) {
        return delete(c -> 
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: odps_unload_statement")
    default int insert(OdpsUnloadStatement record) {
        return MyBatis3Utils.insert(this::insert, record, odpsUnloadStatement, c ->
            c.map(oid).toProperty("oid")
            .map(fromOid).toProperty("fromOid")
            .map(locationOid).toProperty("locationOid")
            .map(rowFormatOid).toProperty("rowFormatOid")
            .map(storedAsOid).toProperty("storedAsOid")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: odps_unload_statement")
    default int insertMultiple(Collection<OdpsUnloadStatement> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, odpsUnloadStatement, c ->
            c.map(oid).toProperty("oid")
            .map(fromOid).toProperty("fromOid")
            .map(locationOid).toProperty("locationOid")
            .map(rowFormatOid).toProperty("rowFormatOid")
            .map(storedAsOid).toProperty("storedAsOid")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: odps_unload_statement")
    default int insertSelective(OdpsUnloadStatement record) {
        return MyBatis3Utils.insert(this::insert, record, odpsUnloadStatement, c ->
            c.map(oid).toPropertyWhenPresent("oid", record::getOid)
            .map(fromOid).toPropertyWhenPresent("fromOid", record::getFromOid)
            .map(locationOid).toPropertyWhenPresent("locationOid", record::getLocationOid)
            .map(rowFormatOid).toPropertyWhenPresent("rowFormatOid", record::getRowFormatOid)
            .map(storedAsOid).toPropertyWhenPresent("storedAsOid", record::getStoredAsOid)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: odps_unload_statement")
    default Optional<OdpsUnloadStatement> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, odpsUnloadStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: odps_unload_statement")
    default List<OdpsUnloadStatement> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, odpsUnloadStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: odps_unload_statement")
    default List<OdpsUnloadStatement> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, odpsUnloadStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: odps_unload_statement")
    default Optional<OdpsUnloadStatement> selectByPrimaryKey(Long oid_) {
        return selectOne(c ->
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: odps_unload_statement")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, odpsUnloadStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: odps_unload_statement")
    static UpdateDSL<UpdateModel> updateAllColumns(OdpsUnloadStatement record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalTo(record::getOid)
                .set(fromOid).equalTo(record::getFromOid)
                .set(locationOid).equalTo(record::getLocationOid)
                .set(rowFormatOid).equalTo(record::getRowFormatOid)
                .set(storedAsOid).equalTo(record::getStoredAsOid);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: odps_unload_statement")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(OdpsUnloadStatement record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalToWhenPresent(record::getOid)
                .set(fromOid).equalToWhenPresent(record::getFromOid)
                .set(locationOid).equalToWhenPresent(record::getLocationOid)
                .set(rowFormatOid).equalToWhenPresent(record::getRowFormatOid)
                .set(storedAsOid).equalToWhenPresent(record::getStoredAsOid);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: odps_unload_statement")
    default int updateByPrimaryKey(OdpsUnloadStatement record) {
        return update(c ->
            c.set(fromOid).equalTo(record::getFromOid)
            .set(locationOid).equalTo(record::getLocationOid)
            .set(rowFormatOid).equalTo(record::getRowFormatOid)
            .set(storedAsOid).equalTo(record::getStoredAsOid)
            .where(oid, isEqualTo(record::getOid))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: odps_unload_statement")
    default int updateByPrimaryKeySelective(OdpsUnloadStatement record) {
        return update(c ->
            c.set(fromOid).equalToWhenPresent(record::getFromOid)
            .set(locationOid).equalToWhenPresent(record::getLocationOid)
            .set(rowFormatOid).equalToWhenPresent(record::getRowFormatOid)
            .set(storedAsOid).equalToWhenPresent(record::getStoredAsOid)
            .where(oid, isEqualTo(record::getOid))
        );
    }
}