package com.alipay.codequery.dal.mybatis.mapper;

import static com.alipay.codequery.dal.mybatis.mapper.SqlDataTypeImplDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.alipay.codequery.dal.mybatis.domain.SqlDataTypeImpl;
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
public interface SqlDataTypeImplMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_data_type_impl")
    BasicColumn[] selectList = BasicColumn.columnList(oid, indexByOid, isInt, isNumberic, isString, isUnsigned, isWithLocalTimeZone, isZerofill, name, withTimeZone);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_data_type_impl")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_data_type_impl")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_data_type_impl")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<SqlDataTypeImpl> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_data_type_impl")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<SqlDataTypeImpl> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_data_type_impl")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="index_by_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_int", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_numberic", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_string", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_unsigned", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_with_local_time_zone", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_zerofill", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="name", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="with_time_zone", javaType=Integer.class, jdbcType=JdbcType.BIGINT)
    })
    Optional<SqlDataTypeImpl> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_data_type_impl")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="index_by_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_int", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_numberic", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_string", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_unsigned", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_with_local_time_zone", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_zerofill", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="name", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="with_time_zone", javaType=Integer.class, jdbcType=JdbcType.BIGINT)
    })
    List<SqlDataTypeImpl> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_data_type_impl")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_data_type_impl")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, sqlDataTypeImpl, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_data_type_impl")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, sqlDataTypeImpl, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_data_type_impl")
    default int deleteByPrimaryKey(Long oid_) {
        return delete(c -> 
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_data_type_impl")
    default int insert(SqlDataTypeImpl record) {
        return MyBatis3Utils.insert(this::insert, record, sqlDataTypeImpl, c ->
            c.map(oid).toProperty("oid")
            .map(indexByOid).toProperty("indexByOid")
            .map(isInt).toProperty("isInt")
            .map(isNumberic).toProperty("isNumberic")
            .map(isString).toProperty("isString")
            .map(isUnsigned).toProperty("isUnsigned")
            .map(isWithLocalTimeZone).toProperty("isWithLocalTimeZone")
            .map(isZerofill).toProperty("isZerofill")
            .map(name).toProperty("name")
            .map(withTimeZone).toProperty("withTimeZone")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_data_type_impl")
    default int insertMultiple(Collection<SqlDataTypeImpl> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, sqlDataTypeImpl, c ->
            c.map(oid).toProperty("oid")
            .map(indexByOid).toProperty("indexByOid")
            .map(isInt).toProperty("isInt")
            .map(isNumberic).toProperty("isNumberic")
            .map(isString).toProperty("isString")
            .map(isUnsigned).toProperty("isUnsigned")
            .map(isWithLocalTimeZone).toProperty("isWithLocalTimeZone")
            .map(isZerofill).toProperty("isZerofill")
            .map(name).toProperty("name")
            .map(withTimeZone).toProperty("withTimeZone")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_data_type_impl")
    default int insertSelective(SqlDataTypeImpl record) {
        return MyBatis3Utils.insert(this::insert, record, sqlDataTypeImpl, c ->
            c.map(oid).toPropertyWhenPresent("oid", record::getOid)
            .map(indexByOid).toPropertyWhenPresent("indexByOid", record::getIndexByOid)
            .map(isInt).toPropertyWhenPresent("isInt", record::getIsInt)
            .map(isNumberic).toPropertyWhenPresent("isNumberic", record::getIsNumberic)
            .map(isString).toPropertyWhenPresent("isString", record::getIsString)
            .map(isUnsigned).toPropertyWhenPresent("isUnsigned", record::getIsUnsigned)
            .map(isWithLocalTimeZone).toPropertyWhenPresent("isWithLocalTimeZone", record::getIsWithLocalTimeZone)
            .map(isZerofill).toPropertyWhenPresent("isZerofill", record::getIsZerofill)
            .map(name).toPropertyWhenPresent("name", record::getName)
            .map(withTimeZone).toPropertyWhenPresent("withTimeZone", record::getWithTimeZone)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_data_type_impl")
    default Optional<SqlDataTypeImpl> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, sqlDataTypeImpl, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_data_type_impl")
    default List<SqlDataTypeImpl> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, sqlDataTypeImpl, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_data_type_impl")
    default List<SqlDataTypeImpl> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, sqlDataTypeImpl, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_data_type_impl")
    default Optional<SqlDataTypeImpl> selectByPrimaryKey(Long oid_) {
        return selectOne(c ->
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_data_type_impl")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, sqlDataTypeImpl, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_data_type_impl")
    static UpdateDSL<UpdateModel> updateAllColumns(SqlDataTypeImpl record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalTo(record::getOid)
                .set(indexByOid).equalTo(record::getIndexByOid)
                .set(isInt).equalTo(record::getIsInt)
                .set(isNumberic).equalTo(record::getIsNumberic)
                .set(isString).equalTo(record::getIsString)
                .set(isUnsigned).equalTo(record::getIsUnsigned)
                .set(isWithLocalTimeZone).equalTo(record::getIsWithLocalTimeZone)
                .set(isZerofill).equalTo(record::getIsZerofill)
                .set(name).equalTo(record::getName)
                .set(withTimeZone).equalTo(record::getWithTimeZone);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_data_type_impl")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(SqlDataTypeImpl record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalToWhenPresent(record::getOid)
                .set(indexByOid).equalToWhenPresent(record::getIndexByOid)
                .set(isInt).equalToWhenPresent(record::getIsInt)
                .set(isNumberic).equalToWhenPresent(record::getIsNumberic)
                .set(isString).equalToWhenPresent(record::getIsString)
                .set(isUnsigned).equalToWhenPresent(record::getIsUnsigned)
                .set(isWithLocalTimeZone).equalToWhenPresent(record::getIsWithLocalTimeZone)
                .set(isZerofill).equalToWhenPresent(record::getIsZerofill)
                .set(name).equalToWhenPresent(record::getName)
                .set(withTimeZone).equalToWhenPresent(record::getWithTimeZone);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_data_type_impl")
    default int updateByPrimaryKey(SqlDataTypeImpl record) {
        return update(c ->
            c.set(indexByOid).equalTo(record::getIndexByOid)
            .set(isInt).equalTo(record::getIsInt)
            .set(isNumberic).equalTo(record::getIsNumberic)
            .set(isString).equalTo(record::getIsString)
            .set(isUnsigned).equalTo(record::getIsUnsigned)
            .set(isWithLocalTimeZone).equalTo(record::getIsWithLocalTimeZone)
            .set(isZerofill).equalTo(record::getIsZerofill)
            .set(name).equalTo(record::getName)
            .set(withTimeZone).equalTo(record::getWithTimeZone)
            .where(oid, isEqualTo(record::getOid))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_data_type_impl")
    default int updateByPrimaryKeySelective(SqlDataTypeImpl record) {
        return update(c ->
            c.set(indexByOid).equalToWhenPresent(record::getIndexByOid)
            .set(isInt).equalToWhenPresent(record::getIsInt)
            .set(isNumberic).equalToWhenPresent(record::getIsNumberic)
            .set(isString).equalToWhenPresent(record::getIsString)
            .set(isUnsigned).equalToWhenPresent(record::getIsUnsigned)
            .set(isWithLocalTimeZone).equalToWhenPresent(record::getIsWithLocalTimeZone)
            .set(isZerofill).equalToWhenPresent(record::getIsZerofill)
            .set(name).equalToWhenPresent(record::getName)
            .set(withTimeZone).equalToWhenPresent(record::getWithTimeZone)
            .where(oid, isEqualTo(record::getOid))
        );
    }
}