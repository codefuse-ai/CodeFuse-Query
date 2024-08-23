package com.alipay.codequery.dal.mybatis.mapper;

import static com.alipay.codequery.dal.mybatis.mapper.SqlForeignKeyImplDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.alipay.codequery.dal.mybatis.domain.SqlForeignKeyImpl;
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
public interface SqlForeignKeyImplMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_foreign_key_impl")
    BasicColumn[] selectList = BasicColumn.columnList(oid, isDisableNovalidate, isOnDeleteCascade, isOnDeleteSetNull, referencedTableNameOid, referencedTableOid);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_foreign_key_impl")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_foreign_key_impl")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_foreign_key_impl")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<SqlForeignKeyImpl> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_foreign_key_impl")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<SqlForeignKeyImpl> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_foreign_key_impl")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="is_disable_novalidate", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_on_delete_cascade", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_on_delete_set_null", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="referenced_table_name_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="referenced_table_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT)
    })
    Optional<SqlForeignKeyImpl> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_foreign_key_impl")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="is_disable_novalidate", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_on_delete_cascade", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_on_delete_set_null", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="referenced_table_name_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="referenced_table_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT)
    })
    List<SqlForeignKeyImpl> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_foreign_key_impl")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_foreign_key_impl")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, sqlForeignKeyImpl, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_foreign_key_impl")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, sqlForeignKeyImpl, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_foreign_key_impl")
    default int deleteByPrimaryKey(Long oid_) {
        return delete(c -> 
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_foreign_key_impl")
    default int insert(SqlForeignKeyImpl record) {
        return MyBatis3Utils.insert(this::insert, record, sqlForeignKeyImpl, c ->
            c.map(oid).toProperty("oid")
            .map(isDisableNovalidate).toProperty("isDisableNovalidate")
            .map(isOnDeleteCascade).toProperty("isOnDeleteCascade")
            .map(isOnDeleteSetNull).toProperty("isOnDeleteSetNull")
            .map(referencedTableNameOid).toProperty("referencedTableNameOid")
            .map(referencedTableOid).toProperty("referencedTableOid")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_foreign_key_impl")
    default int insertMultiple(Collection<SqlForeignKeyImpl> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, sqlForeignKeyImpl, c ->
            c.map(oid).toProperty("oid")
            .map(isDisableNovalidate).toProperty("isDisableNovalidate")
            .map(isOnDeleteCascade).toProperty("isOnDeleteCascade")
            .map(isOnDeleteSetNull).toProperty("isOnDeleteSetNull")
            .map(referencedTableNameOid).toProperty("referencedTableNameOid")
            .map(referencedTableOid).toProperty("referencedTableOid")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_foreign_key_impl")
    default int insertSelective(SqlForeignKeyImpl record) {
        return MyBatis3Utils.insert(this::insert, record, sqlForeignKeyImpl, c ->
            c.map(oid).toPropertyWhenPresent("oid", record::getOid)
            .map(isDisableNovalidate).toPropertyWhenPresent("isDisableNovalidate", record::getIsDisableNovalidate)
            .map(isOnDeleteCascade).toPropertyWhenPresent("isOnDeleteCascade", record::getIsOnDeleteCascade)
            .map(isOnDeleteSetNull).toPropertyWhenPresent("isOnDeleteSetNull", record::getIsOnDeleteSetNull)
            .map(referencedTableNameOid).toPropertyWhenPresent("referencedTableNameOid", record::getReferencedTableNameOid)
            .map(referencedTableOid).toPropertyWhenPresent("referencedTableOid", record::getReferencedTableOid)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_foreign_key_impl")
    default Optional<SqlForeignKeyImpl> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, sqlForeignKeyImpl, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_foreign_key_impl")
    default List<SqlForeignKeyImpl> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, sqlForeignKeyImpl, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_foreign_key_impl")
    default List<SqlForeignKeyImpl> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, sqlForeignKeyImpl, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_foreign_key_impl")
    default Optional<SqlForeignKeyImpl> selectByPrimaryKey(Long oid_) {
        return selectOne(c ->
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_foreign_key_impl")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, sqlForeignKeyImpl, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_foreign_key_impl")
    static UpdateDSL<UpdateModel> updateAllColumns(SqlForeignKeyImpl record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalTo(record::getOid)
                .set(isDisableNovalidate).equalTo(record::getIsDisableNovalidate)
                .set(isOnDeleteCascade).equalTo(record::getIsOnDeleteCascade)
                .set(isOnDeleteSetNull).equalTo(record::getIsOnDeleteSetNull)
                .set(referencedTableNameOid).equalTo(record::getReferencedTableNameOid)
                .set(referencedTableOid).equalTo(record::getReferencedTableOid);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_foreign_key_impl")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(SqlForeignKeyImpl record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalToWhenPresent(record::getOid)
                .set(isDisableNovalidate).equalToWhenPresent(record::getIsDisableNovalidate)
                .set(isOnDeleteCascade).equalToWhenPresent(record::getIsOnDeleteCascade)
                .set(isOnDeleteSetNull).equalToWhenPresent(record::getIsOnDeleteSetNull)
                .set(referencedTableNameOid).equalToWhenPresent(record::getReferencedTableNameOid)
                .set(referencedTableOid).equalToWhenPresent(record::getReferencedTableOid);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_foreign_key_impl")
    default int updateByPrimaryKey(SqlForeignKeyImpl record) {
        return update(c ->
            c.set(isDisableNovalidate).equalTo(record::getIsDisableNovalidate)
            .set(isOnDeleteCascade).equalTo(record::getIsOnDeleteCascade)
            .set(isOnDeleteSetNull).equalTo(record::getIsOnDeleteSetNull)
            .set(referencedTableNameOid).equalTo(record::getReferencedTableNameOid)
            .set(referencedTableOid).equalTo(record::getReferencedTableOid)
            .where(oid, isEqualTo(record::getOid))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_foreign_key_impl")
    default int updateByPrimaryKeySelective(SqlForeignKeyImpl record) {
        return update(c ->
            c.set(isDisableNovalidate).equalToWhenPresent(record::getIsDisableNovalidate)
            .set(isOnDeleteCascade).equalToWhenPresent(record::getIsOnDeleteCascade)
            .set(isOnDeleteSetNull).equalToWhenPresent(record::getIsOnDeleteSetNull)
            .set(referencedTableNameOid).equalToWhenPresent(record::getReferencedTableNameOid)
            .set(referencedTableOid).equalToWhenPresent(record::getReferencedTableOid)
            .where(oid, isEqualTo(record::getOid))
        );
    }
}