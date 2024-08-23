package com.alipay.codequery.dal.mybatis.mapper;

import static com.alipay.codequery.dal.mybatis.mapper.SqlRowDataTypeDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.alipay.codequery.dal.mybatis.domain.SqlRowDataType;
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
public interface SqlRowDataTypeMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_row_data_type")
    BasicColumn[] selectList = BasicColumn.columnList(oid, fields, isInt, isNumberic, isString, isWithLocalTimeZone, name, withTimeZone);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_row_data_type")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_row_data_type")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_row_data_type")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<SqlRowDataType> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_row_data_type")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<SqlRowDataType> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_row_data_type")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="fields", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="is_int", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_numberic", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_string", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_with_local_time_zone", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="name", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="with_time_zone", javaType=Integer.class, jdbcType=JdbcType.BIGINT)
    })
    Optional<SqlRowDataType> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_row_data_type")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="fields", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="is_int", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_numberic", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_string", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_with_local_time_zone", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="name", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="with_time_zone", javaType=Integer.class, jdbcType=JdbcType.BIGINT)
    })
    List<SqlRowDataType> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_row_data_type")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_row_data_type")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, sqlRowDataType, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_row_data_type")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, sqlRowDataType, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_row_data_type")
    default int deleteByPrimaryKey(Long oid_) {
        return delete(c -> 
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_row_data_type")
    default int insert(SqlRowDataType record) {
        return MyBatis3Utils.insert(this::insert, record, sqlRowDataType, c ->
            c.map(oid).toProperty("oid")
            .map(fields).toProperty("fields")
            .map(isInt).toProperty("isInt")
            .map(isNumberic).toProperty("isNumberic")
            .map(isString).toProperty("isString")
            .map(isWithLocalTimeZone).toProperty("isWithLocalTimeZone")
            .map(name).toProperty("name")
            .map(withTimeZone).toProperty("withTimeZone")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_row_data_type")
    default int insertMultiple(Collection<SqlRowDataType> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, sqlRowDataType, c ->
            c.map(oid).toProperty("oid")
            .map(fields).toProperty("fields")
            .map(isInt).toProperty("isInt")
            .map(isNumberic).toProperty("isNumberic")
            .map(isString).toProperty("isString")
            .map(isWithLocalTimeZone).toProperty("isWithLocalTimeZone")
            .map(name).toProperty("name")
            .map(withTimeZone).toProperty("withTimeZone")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_row_data_type")
    default int insertSelective(SqlRowDataType record) {
        return MyBatis3Utils.insert(this::insert, record, sqlRowDataType, c ->
            c.map(oid).toPropertyWhenPresent("oid", record::getOid)
            .map(fields).toPropertyWhenPresent("fields", record::getFields)
            .map(isInt).toPropertyWhenPresent("isInt", record::getIsInt)
            .map(isNumberic).toPropertyWhenPresent("isNumberic", record::getIsNumberic)
            .map(isString).toPropertyWhenPresent("isString", record::getIsString)
            .map(isWithLocalTimeZone).toPropertyWhenPresent("isWithLocalTimeZone", record::getIsWithLocalTimeZone)
            .map(name).toPropertyWhenPresent("name", record::getName)
            .map(withTimeZone).toPropertyWhenPresent("withTimeZone", record::getWithTimeZone)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_row_data_type")
    default Optional<SqlRowDataType> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, sqlRowDataType, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_row_data_type")
    default List<SqlRowDataType> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, sqlRowDataType, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_row_data_type")
    default List<SqlRowDataType> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, sqlRowDataType, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_row_data_type")
    default Optional<SqlRowDataType> selectByPrimaryKey(Long oid_) {
        return selectOne(c ->
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_row_data_type")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, sqlRowDataType, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_row_data_type")
    static UpdateDSL<UpdateModel> updateAllColumns(SqlRowDataType record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalTo(record::getOid)
                .set(fields).equalTo(record::getFields)
                .set(isInt).equalTo(record::getIsInt)
                .set(isNumberic).equalTo(record::getIsNumberic)
                .set(isString).equalTo(record::getIsString)
                .set(isWithLocalTimeZone).equalTo(record::getIsWithLocalTimeZone)
                .set(name).equalTo(record::getName)
                .set(withTimeZone).equalTo(record::getWithTimeZone);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_row_data_type")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(SqlRowDataType record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalToWhenPresent(record::getOid)
                .set(fields).equalToWhenPresent(record::getFields)
                .set(isInt).equalToWhenPresent(record::getIsInt)
                .set(isNumberic).equalToWhenPresent(record::getIsNumberic)
                .set(isString).equalToWhenPresent(record::getIsString)
                .set(isWithLocalTimeZone).equalToWhenPresent(record::getIsWithLocalTimeZone)
                .set(name).equalToWhenPresent(record::getName)
                .set(withTimeZone).equalToWhenPresent(record::getWithTimeZone);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_row_data_type")
    default int updateByPrimaryKey(SqlRowDataType record) {
        return update(c ->
            c.set(fields).equalTo(record::getFields)
            .set(isInt).equalTo(record::getIsInt)
            .set(isNumberic).equalTo(record::getIsNumberic)
            .set(isString).equalTo(record::getIsString)
            .set(isWithLocalTimeZone).equalTo(record::getIsWithLocalTimeZone)
            .set(name).equalTo(record::getName)
            .set(withTimeZone).equalTo(record::getWithTimeZone)
            .where(oid, isEqualTo(record::getOid))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_row_data_type")
    default int updateByPrimaryKeySelective(SqlRowDataType record) {
        return update(c ->
            c.set(fields).equalToWhenPresent(record::getFields)
            .set(isInt).equalToWhenPresent(record::getIsInt)
            .set(isNumberic).equalToWhenPresent(record::getIsNumberic)
            .set(isString).equalToWhenPresent(record::getIsString)
            .set(isWithLocalTimeZone).equalToWhenPresent(record::getIsWithLocalTimeZone)
            .set(name).equalToWhenPresent(record::getName)
            .set(withTimeZone).equalToWhenPresent(record::getWithTimeZone)
            .where(oid, isEqualTo(record::getOid))
        );
    }
}