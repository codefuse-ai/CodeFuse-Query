package com.alipay.codequery.dal.mybatis.mapper;

import static com.alipay.codequery.dal.mybatis.mapper.SqlAlterTableAlterColumnDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.alipay.codequery.dal.mybatis.domain.SqlAlterTableAlterColumn;
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
public interface SqlAlterTableAlterColumnMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_table_alter_column")
    BasicColumn[] selectList = BasicColumn.columnList(oid, afterOid, columnOid, dataTypeOid, isDropDefault, isDropNotNull, isFirst, isSetNotNull, originColumnOid, setDefaultOid);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_table_alter_column")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_table_alter_column")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_table_alter_column")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<SqlAlterTableAlterColumn> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_table_alter_column")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<SqlAlterTableAlterColumn> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_table_alter_column")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="after_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="column_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="data_type_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_drop_default", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_drop_not_null", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_first", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_set_not_null", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="origin_column_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="set_default_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT)
    })
    Optional<SqlAlterTableAlterColumn> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_table_alter_column")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="after_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="column_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="data_type_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_drop_default", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_drop_not_null", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_first", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_set_not_null", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="origin_column_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="set_default_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT)
    })
    List<SqlAlterTableAlterColumn> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_table_alter_column")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_table_alter_column")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, sqlAlterTableAlterColumn, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_table_alter_column")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, sqlAlterTableAlterColumn, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_table_alter_column")
    default int deleteByPrimaryKey(Long oid_) {
        return delete(c -> 
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_table_alter_column")
    default int insert(SqlAlterTableAlterColumn record) {
        return MyBatis3Utils.insert(this::insert, record, sqlAlterTableAlterColumn, c ->
            c.map(oid).toProperty("oid")
            .map(afterOid).toProperty("afterOid")
            .map(columnOid).toProperty("columnOid")
            .map(dataTypeOid).toProperty("dataTypeOid")
            .map(isDropDefault).toProperty("isDropDefault")
            .map(isDropNotNull).toProperty("isDropNotNull")
            .map(isFirst).toProperty("isFirst")
            .map(isSetNotNull).toProperty("isSetNotNull")
            .map(originColumnOid).toProperty("originColumnOid")
            .map(setDefaultOid).toProperty("setDefaultOid")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_table_alter_column")
    default int insertMultiple(Collection<SqlAlterTableAlterColumn> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, sqlAlterTableAlterColumn, c ->
            c.map(oid).toProperty("oid")
            .map(afterOid).toProperty("afterOid")
            .map(columnOid).toProperty("columnOid")
            .map(dataTypeOid).toProperty("dataTypeOid")
            .map(isDropDefault).toProperty("isDropDefault")
            .map(isDropNotNull).toProperty("isDropNotNull")
            .map(isFirst).toProperty("isFirst")
            .map(isSetNotNull).toProperty("isSetNotNull")
            .map(originColumnOid).toProperty("originColumnOid")
            .map(setDefaultOid).toProperty("setDefaultOid")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_table_alter_column")
    default int insertSelective(SqlAlterTableAlterColumn record) {
        return MyBatis3Utils.insert(this::insert, record, sqlAlterTableAlterColumn, c ->
            c.map(oid).toPropertyWhenPresent("oid", record::getOid)
            .map(afterOid).toPropertyWhenPresent("afterOid", record::getAfterOid)
            .map(columnOid).toPropertyWhenPresent("columnOid", record::getColumnOid)
            .map(dataTypeOid).toPropertyWhenPresent("dataTypeOid", record::getDataTypeOid)
            .map(isDropDefault).toPropertyWhenPresent("isDropDefault", record::getIsDropDefault)
            .map(isDropNotNull).toPropertyWhenPresent("isDropNotNull", record::getIsDropNotNull)
            .map(isFirst).toPropertyWhenPresent("isFirst", record::getIsFirst)
            .map(isSetNotNull).toPropertyWhenPresent("isSetNotNull", record::getIsSetNotNull)
            .map(originColumnOid).toPropertyWhenPresent("originColumnOid", record::getOriginColumnOid)
            .map(setDefaultOid).toPropertyWhenPresent("setDefaultOid", record::getSetDefaultOid)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_table_alter_column")
    default Optional<SqlAlterTableAlterColumn> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, sqlAlterTableAlterColumn, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_table_alter_column")
    default List<SqlAlterTableAlterColumn> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, sqlAlterTableAlterColumn, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_table_alter_column")
    default List<SqlAlterTableAlterColumn> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, sqlAlterTableAlterColumn, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_table_alter_column")
    default Optional<SqlAlterTableAlterColumn> selectByPrimaryKey(Long oid_) {
        return selectOne(c ->
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_table_alter_column")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, sqlAlterTableAlterColumn, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_table_alter_column")
    static UpdateDSL<UpdateModel> updateAllColumns(SqlAlterTableAlterColumn record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalTo(record::getOid)
                .set(afterOid).equalTo(record::getAfterOid)
                .set(columnOid).equalTo(record::getColumnOid)
                .set(dataTypeOid).equalTo(record::getDataTypeOid)
                .set(isDropDefault).equalTo(record::getIsDropDefault)
                .set(isDropNotNull).equalTo(record::getIsDropNotNull)
                .set(isFirst).equalTo(record::getIsFirst)
                .set(isSetNotNull).equalTo(record::getIsSetNotNull)
                .set(originColumnOid).equalTo(record::getOriginColumnOid)
                .set(setDefaultOid).equalTo(record::getSetDefaultOid);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_table_alter_column")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(SqlAlterTableAlterColumn record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalToWhenPresent(record::getOid)
                .set(afterOid).equalToWhenPresent(record::getAfterOid)
                .set(columnOid).equalToWhenPresent(record::getColumnOid)
                .set(dataTypeOid).equalToWhenPresent(record::getDataTypeOid)
                .set(isDropDefault).equalToWhenPresent(record::getIsDropDefault)
                .set(isDropNotNull).equalToWhenPresent(record::getIsDropNotNull)
                .set(isFirst).equalToWhenPresent(record::getIsFirst)
                .set(isSetNotNull).equalToWhenPresent(record::getIsSetNotNull)
                .set(originColumnOid).equalToWhenPresent(record::getOriginColumnOid)
                .set(setDefaultOid).equalToWhenPresent(record::getSetDefaultOid);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_table_alter_column")
    default int updateByPrimaryKey(SqlAlterTableAlterColumn record) {
        return update(c ->
            c.set(afterOid).equalTo(record::getAfterOid)
            .set(columnOid).equalTo(record::getColumnOid)
            .set(dataTypeOid).equalTo(record::getDataTypeOid)
            .set(isDropDefault).equalTo(record::getIsDropDefault)
            .set(isDropNotNull).equalTo(record::getIsDropNotNull)
            .set(isFirst).equalTo(record::getIsFirst)
            .set(isSetNotNull).equalTo(record::getIsSetNotNull)
            .set(originColumnOid).equalTo(record::getOriginColumnOid)
            .set(setDefaultOid).equalTo(record::getSetDefaultOid)
            .where(oid, isEqualTo(record::getOid))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_table_alter_column")
    default int updateByPrimaryKeySelective(SqlAlterTableAlterColumn record) {
        return update(c ->
            c.set(afterOid).equalToWhenPresent(record::getAfterOid)
            .set(columnOid).equalToWhenPresent(record::getColumnOid)
            .set(dataTypeOid).equalToWhenPresent(record::getDataTypeOid)
            .set(isDropDefault).equalToWhenPresent(record::getIsDropDefault)
            .set(isDropNotNull).equalToWhenPresent(record::getIsDropNotNull)
            .set(isFirst).equalToWhenPresent(record::getIsFirst)
            .set(isSetNotNull).equalToWhenPresent(record::getIsSetNotNull)
            .set(originColumnOid).equalToWhenPresent(record::getOriginColumnOid)
            .set(setDefaultOid).equalToWhenPresent(record::getSetDefaultOid)
            .where(oid, isEqualTo(record::getOid))
        );
    }
}