package com.alipay.codequery.dal.mybatis.mapper;

import static com.alipay.codequery.dal.mybatis.mapper.OdpsDeclareVariableStatementDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.alipay.codequery.dal.mybatis.domain.OdpsDeclareVariableStatement;
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
public interface OdpsDeclareVariableStatementMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: odps_declare_variable_statement")
    BasicColumn[] selectList = BasicColumn.columnList(oid, dataTypeOid, initValueOid, variant);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: odps_declare_variable_statement")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: odps_declare_variable_statement")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: odps_declare_variable_statement")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<OdpsDeclareVariableStatement> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: odps_declare_variable_statement")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<OdpsDeclareVariableStatement> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: odps_declare_variable_statement")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="data_type_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="init_value_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="variant", javaType=String.class, jdbcType=JdbcType.VARCHAR)
    })
    Optional<OdpsDeclareVariableStatement> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: odps_declare_variable_statement")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="data_type_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="init_value_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="variant", javaType=String.class, jdbcType=JdbcType.VARCHAR)
    })
    List<OdpsDeclareVariableStatement> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: odps_declare_variable_statement")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: odps_declare_variable_statement")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, odpsDeclareVariableStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: odps_declare_variable_statement")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, odpsDeclareVariableStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: odps_declare_variable_statement")
    default int deleteByPrimaryKey(Long oid_) {
        return delete(c -> 
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: odps_declare_variable_statement")
    default int insert(OdpsDeclareVariableStatement record) {
        return MyBatis3Utils.insert(this::insert, record, odpsDeclareVariableStatement, c ->
            c.map(oid).toProperty("oid")
            .map(dataTypeOid).toProperty("dataTypeOid")
            .map(initValueOid).toProperty("initValueOid")
            .map(variant).toProperty("variant")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: odps_declare_variable_statement")
    default int insertMultiple(Collection<OdpsDeclareVariableStatement> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, odpsDeclareVariableStatement, c ->
            c.map(oid).toProperty("oid")
            .map(dataTypeOid).toProperty("dataTypeOid")
            .map(initValueOid).toProperty("initValueOid")
            .map(variant).toProperty("variant")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: odps_declare_variable_statement")
    default int insertSelective(OdpsDeclareVariableStatement record) {
        return MyBatis3Utils.insert(this::insert, record, odpsDeclareVariableStatement, c ->
            c.map(oid).toPropertyWhenPresent("oid", record::getOid)
            .map(dataTypeOid).toPropertyWhenPresent("dataTypeOid", record::getDataTypeOid)
            .map(initValueOid).toPropertyWhenPresent("initValueOid", record::getInitValueOid)
            .map(variant).toPropertyWhenPresent("variant", record::getVariant)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: odps_declare_variable_statement")
    default Optional<OdpsDeclareVariableStatement> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, odpsDeclareVariableStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: odps_declare_variable_statement")
    default List<OdpsDeclareVariableStatement> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, odpsDeclareVariableStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: odps_declare_variable_statement")
    default List<OdpsDeclareVariableStatement> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, odpsDeclareVariableStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: odps_declare_variable_statement")
    default Optional<OdpsDeclareVariableStatement> selectByPrimaryKey(Long oid_) {
        return selectOne(c ->
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: odps_declare_variable_statement")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, odpsDeclareVariableStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: odps_declare_variable_statement")
    static UpdateDSL<UpdateModel> updateAllColumns(OdpsDeclareVariableStatement record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalTo(record::getOid)
                .set(dataTypeOid).equalTo(record::getDataTypeOid)
                .set(initValueOid).equalTo(record::getInitValueOid)
                .set(variant).equalTo(record::getVariant);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: odps_declare_variable_statement")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(OdpsDeclareVariableStatement record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalToWhenPresent(record::getOid)
                .set(dataTypeOid).equalToWhenPresent(record::getDataTypeOid)
                .set(initValueOid).equalToWhenPresent(record::getInitValueOid)
                .set(variant).equalToWhenPresent(record::getVariant);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: odps_declare_variable_statement")
    default int updateByPrimaryKey(OdpsDeclareVariableStatement record) {
        return update(c ->
            c.set(dataTypeOid).equalTo(record::getDataTypeOid)
            .set(initValueOid).equalTo(record::getInitValueOid)
            .set(variant).equalTo(record::getVariant)
            .where(oid, isEqualTo(record::getOid))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: odps_declare_variable_statement")
    default int updateByPrimaryKeySelective(OdpsDeclareVariableStatement record) {
        return update(c ->
            c.set(dataTypeOid).equalToWhenPresent(record::getDataTypeOid)
            .set(initValueOid).equalToWhenPresent(record::getInitValueOid)
            .set(variant).equalToWhenPresent(record::getVariant)
            .where(oid, isEqualTo(record::getOid))
        );
    }
}