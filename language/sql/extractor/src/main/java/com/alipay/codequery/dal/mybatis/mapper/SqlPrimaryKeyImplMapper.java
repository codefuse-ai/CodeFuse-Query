package com.alipay.codequery.dal.mybatis.mapper;

import static com.alipay.codequery.dal.mybatis.mapper.SqlPrimaryKeyImplDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.alipay.codequery.dal.mybatis.domain.SqlPrimaryKeyImpl;
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
public interface SqlPrimaryKeyImplMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_primary_key_impl")
    BasicColumn[] selectList = BasicColumn.columnList(oid, isClustered, isDisableNovalidate);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_primary_key_impl")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_primary_key_impl")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_primary_key_impl")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<SqlPrimaryKeyImpl> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_primary_key_impl")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<SqlPrimaryKeyImpl> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_primary_key_impl")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="is_clustered", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_disable_novalidate", javaType=Integer.class, jdbcType=JdbcType.BIGINT)
    })
    Optional<SqlPrimaryKeyImpl> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_primary_key_impl")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="is_clustered", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_disable_novalidate", javaType=Integer.class, jdbcType=JdbcType.BIGINT)
    })
    List<SqlPrimaryKeyImpl> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_primary_key_impl")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_primary_key_impl")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, sqlPrimaryKeyImpl, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_primary_key_impl")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, sqlPrimaryKeyImpl, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_primary_key_impl")
    default int deleteByPrimaryKey(Long oid_) {
        return delete(c -> 
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_primary_key_impl")
    default int insert(SqlPrimaryKeyImpl record) {
        return MyBatis3Utils.insert(this::insert, record, sqlPrimaryKeyImpl, c ->
            c.map(oid).toProperty("oid")
            .map(isClustered).toProperty("isClustered")
            .map(isDisableNovalidate).toProperty("isDisableNovalidate")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_primary_key_impl")
    default int insertMultiple(Collection<SqlPrimaryKeyImpl> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, sqlPrimaryKeyImpl, c ->
            c.map(oid).toProperty("oid")
            .map(isClustered).toProperty("isClustered")
            .map(isDisableNovalidate).toProperty("isDisableNovalidate")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_primary_key_impl")
    default int insertSelective(SqlPrimaryKeyImpl record) {
        return MyBatis3Utils.insert(this::insert, record, sqlPrimaryKeyImpl, c ->
            c.map(oid).toPropertyWhenPresent("oid", record::getOid)
            .map(isClustered).toPropertyWhenPresent("isClustered", record::getIsClustered)
            .map(isDisableNovalidate).toPropertyWhenPresent("isDisableNovalidate", record::getIsDisableNovalidate)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_primary_key_impl")
    default Optional<SqlPrimaryKeyImpl> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, sqlPrimaryKeyImpl, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_primary_key_impl")
    default List<SqlPrimaryKeyImpl> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, sqlPrimaryKeyImpl, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_primary_key_impl")
    default List<SqlPrimaryKeyImpl> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, sqlPrimaryKeyImpl, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_primary_key_impl")
    default Optional<SqlPrimaryKeyImpl> selectByPrimaryKey(Long oid_) {
        return selectOne(c ->
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_primary_key_impl")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, sqlPrimaryKeyImpl, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_primary_key_impl")
    static UpdateDSL<UpdateModel> updateAllColumns(SqlPrimaryKeyImpl record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalTo(record::getOid)
                .set(isClustered).equalTo(record::getIsClustered)
                .set(isDisableNovalidate).equalTo(record::getIsDisableNovalidate);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_primary_key_impl")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(SqlPrimaryKeyImpl record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalToWhenPresent(record::getOid)
                .set(isClustered).equalToWhenPresent(record::getIsClustered)
                .set(isDisableNovalidate).equalToWhenPresent(record::getIsDisableNovalidate);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_primary_key_impl")
    default int updateByPrimaryKey(SqlPrimaryKeyImpl record) {
        return update(c ->
            c.set(isClustered).equalTo(record::getIsClustered)
            .set(isDisableNovalidate).equalTo(record::getIsDisableNovalidate)
            .where(oid, isEqualTo(record::getOid))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_primary_key_impl")
    default int updateByPrimaryKeySelective(SqlPrimaryKeyImpl record) {
        return update(c ->
            c.set(isClustered).equalToWhenPresent(record::getIsClustered)
            .set(isDisableNovalidate).equalToWhenPresent(record::getIsDisableNovalidate)
            .where(oid, isEqualTo(record::getOid))
        );
    }
}