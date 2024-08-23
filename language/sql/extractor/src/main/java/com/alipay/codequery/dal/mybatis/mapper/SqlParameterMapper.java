package com.alipay.codequery.dal.mybatis.mapper;

import static com.alipay.codequery.dal.mybatis.mapper.SqlParameterDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.alipay.codequery.dal.mybatis.domain.SqlParameter;
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
public interface SqlParameterMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_parameter")
    BasicColumn[] selectList = BasicColumn.columnList(oid, cursorNameOid, dataTypeOid, defaultValueOid, isConstant, isMap, isMember, isNoCopy, isOrder, nameOid, paramType);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_parameter")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_parameter")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_parameter")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<SqlParameter> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_parameter")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<SqlParameter> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_parameter")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="cursor_name_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="data_type_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="default_value_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_constant", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_map", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_member", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_no_copy", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_order", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="name_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="param_type", javaType=String.class, jdbcType=JdbcType.VARCHAR)
    })
    Optional<SqlParameter> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_parameter")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="cursor_name_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="data_type_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="default_value_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_constant", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_map", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_member", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_no_copy", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_order", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="name_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="param_type", javaType=String.class, jdbcType=JdbcType.VARCHAR)
    })
    List<SqlParameter> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_parameter")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_parameter")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, sqlParameter, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_parameter")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, sqlParameter, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_parameter")
    default int deleteByPrimaryKey(Long oid_) {
        return delete(c -> 
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_parameter")
    default int insert(SqlParameter record) {
        return MyBatis3Utils.insert(this::insert, record, sqlParameter, c ->
            c.map(oid).toProperty("oid")
            .map(cursorNameOid).toProperty("cursorNameOid")
            .map(dataTypeOid).toProperty("dataTypeOid")
            .map(defaultValueOid).toProperty("defaultValueOid")
            .map(isConstant).toProperty("isConstant")
            .map(isMap).toProperty("isMap")
            .map(isMember).toProperty("isMember")
            .map(isNoCopy).toProperty("isNoCopy")
            .map(isOrder).toProperty("isOrder")
            .map(nameOid).toProperty("nameOid")
            .map(paramType).toProperty("paramType")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_parameter")
    default int insertMultiple(Collection<SqlParameter> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, sqlParameter, c ->
            c.map(oid).toProperty("oid")
            .map(cursorNameOid).toProperty("cursorNameOid")
            .map(dataTypeOid).toProperty("dataTypeOid")
            .map(defaultValueOid).toProperty("defaultValueOid")
            .map(isConstant).toProperty("isConstant")
            .map(isMap).toProperty("isMap")
            .map(isMember).toProperty("isMember")
            .map(isNoCopy).toProperty("isNoCopy")
            .map(isOrder).toProperty("isOrder")
            .map(nameOid).toProperty("nameOid")
            .map(paramType).toProperty("paramType")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_parameter")
    default int insertSelective(SqlParameter record) {
        return MyBatis3Utils.insert(this::insert, record, sqlParameter, c ->
            c.map(oid).toPropertyWhenPresent("oid", record::getOid)
            .map(cursorNameOid).toPropertyWhenPresent("cursorNameOid", record::getCursorNameOid)
            .map(dataTypeOid).toPropertyWhenPresent("dataTypeOid", record::getDataTypeOid)
            .map(defaultValueOid).toPropertyWhenPresent("defaultValueOid", record::getDefaultValueOid)
            .map(isConstant).toPropertyWhenPresent("isConstant", record::getIsConstant)
            .map(isMap).toPropertyWhenPresent("isMap", record::getIsMap)
            .map(isMember).toPropertyWhenPresent("isMember", record::getIsMember)
            .map(isNoCopy).toPropertyWhenPresent("isNoCopy", record::getIsNoCopy)
            .map(isOrder).toPropertyWhenPresent("isOrder", record::getIsOrder)
            .map(nameOid).toPropertyWhenPresent("nameOid", record::getNameOid)
            .map(paramType).toPropertyWhenPresent("paramType", record::getParamType)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_parameter")
    default Optional<SqlParameter> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, sqlParameter, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_parameter")
    default List<SqlParameter> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, sqlParameter, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_parameter")
    default List<SqlParameter> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, sqlParameter, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_parameter")
    default Optional<SqlParameter> selectByPrimaryKey(Long oid_) {
        return selectOne(c ->
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_parameter")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, sqlParameter, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_parameter")
    static UpdateDSL<UpdateModel> updateAllColumns(SqlParameter record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalTo(record::getOid)
                .set(cursorNameOid).equalTo(record::getCursorNameOid)
                .set(dataTypeOid).equalTo(record::getDataTypeOid)
                .set(defaultValueOid).equalTo(record::getDefaultValueOid)
                .set(isConstant).equalTo(record::getIsConstant)
                .set(isMap).equalTo(record::getIsMap)
                .set(isMember).equalTo(record::getIsMember)
                .set(isNoCopy).equalTo(record::getIsNoCopy)
                .set(isOrder).equalTo(record::getIsOrder)
                .set(nameOid).equalTo(record::getNameOid)
                .set(paramType).equalTo(record::getParamType);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_parameter")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(SqlParameter record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalToWhenPresent(record::getOid)
                .set(cursorNameOid).equalToWhenPresent(record::getCursorNameOid)
                .set(dataTypeOid).equalToWhenPresent(record::getDataTypeOid)
                .set(defaultValueOid).equalToWhenPresent(record::getDefaultValueOid)
                .set(isConstant).equalToWhenPresent(record::getIsConstant)
                .set(isMap).equalToWhenPresent(record::getIsMap)
                .set(isMember).equalToWhenPresent(record::getIsMember)
                .set(isNoCopy).equalToWhenPresent(record::getIsNoCopy)
                .set(isOrder).equalToWhenPresent(record::getIsOrder)
                .set(nameOid).equalToWhenPresent(record::getNameOid)
                .set(paramType).equalToWhenPresent(record::getParamType);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_parameter")
    default int updateByPrimaryKey(SqlParameter record) {
        return update(c ->
            c.set(cursorNameOid).equalTo(record::getCursorNameOid)
            .set(dataTypeOid).equalTo(record::getDataTypeOid)
            .set(defaultValueOid).equalTo(record::getDefaultValueOid)
            .set(isConstant).equalTo(record::getIsConstant)
            .set(isMap).equalTo(record::getIsMap)
            .set(isMember).equalTo(record::getIsMember)
            .set(isNoCopy).equalTo(record::getIsNoCopy)
            .set(isOrder).equalTo(record::getIsOrder)
            .set(nameOid).equalTo(record::getNameOid)
            .set(paramType).equalTo(record::getParamType)
            .where(oid, isEqualTo(record::getOid))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_parameter")
    default int updateByPrimaryKeySelective(SqlParameter record) {
        return update(c ->
            c.set(cursorNameOid).equalToWhenPresent(record::getCursorNameOid)
            .set(dataTypeOid).equalToWhenPresent(record::getDataTypeOid)
            .set(defaultValueOid).equalToWhenPresent(record::getDefaultValueOid)
            .set(isConstant).equalToWhenPresent(record::getIsConstant)
            .set(isMap).equalToWhenPresent(record::getIsMap)
            .set(isMember).equalToWhenPresent(record::getIsMember)
            .set(isNoCopy).equalToWhenPresent(record::getIsNoCopy)
            .set(isOrder).equalToWhenPresent(record::getIsOrder)
            .set(nameOid).equalToWhenPresent(record::getNameOid)
            .set(paramType).equalToWhenPresent(record::getParamType)
            .where(oid, isEqualTo(record::getOid))
        );
    }
}