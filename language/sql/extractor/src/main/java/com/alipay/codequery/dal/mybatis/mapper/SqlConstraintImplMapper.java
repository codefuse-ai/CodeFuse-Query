package com.alipay.codequery.dal.mybatis.mapper;

import static com.alipay.codequery.dal.mybatis.mapper.SqlConstraintImplDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.alipay.codequery.dal.mybatis.domain.SqlConstraintImpl;
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
public interface SqlConstraintImplMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_constraint_impl")
    BasicColumn[] selectList = BasicColumn.columnList(oid, commentOid, enable, nameOid, rely, validate);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_constraint_impl")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_constraint_impl")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_constraint_impl")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<SqlConstraintImpl> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_constraint_impl")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<SqlConstraintImpl> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_constraint_impl")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="comment_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="enable", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="name_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="rely", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="validate", javaType=Integer.class, jdbcType=JdbcType.BIGINT)
    })
    Optional<SqlConstraintImpl> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_constraint_impl")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="comment_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="enable", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="name_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="rely", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="validate", javaType=Integer.class, jdbcType=JdbcType.BIGINT)
    })
    List<SqlConstraintImpl> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_constraint_impl")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_constraint_impl")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, sqlConstraintImpl, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_constraint_impl")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, sqlConstraintImpl, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_constraint_impl")
    default int deleteByPrimaryKey(Long oid_) {
        return delete(c -> 
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_constraint_impl")
    default int insert(SqlConstraintImpl record) {
        return MyBatis3Utils.insert(this::insert, record, sqlConstraintImpl, c ->
            c.map(oid).toProperty("oid")
            .map(commentOid).toProperty("commentOid")
            .map(enable).toProperty("enable")
            .map(nameOid).toProperty("nameOid")
            .map(rely).toProperty("rely")
            .map(validate).toProperty("validate")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_constraint_impl")
    default int insertMultiple(Collection<SqlConstraintImpl> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, sqlConstraintImpl, c ->
            c.map(oid).toProperty("oid")
            .map(commentOid).toProperty("commentOid")
            .map(enable).toProperty("enable")
            .map(nameOid).toProperty("nameOid")
            .map(rely).toProperty("rely")
            .map(validate).toProperty("validate")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_constraint_impl")
    default int insertSelective(SqlConstraintImpl record) {
        return MyBatis3Utils.insert(this::insert, record, sqlConstraintImpl, c ->
            c.map(oid).toPropertyWhenPresent("oid", record::getOid)
            .map(commentOid).toPropertyWhenPresent("commentOid", record::getCommentOid)
            .map(enable).toPropertyWhenPresent("enable", record::getEnable)
            .map(nameOid).toPropertyWhenPresent("nameOid", record::getNameOid)
            .map(rely).toPropertyWhenPresent("rely", record::getRely)
            .map(validate).toPropertyWhenPresent("validate", record::getValidate)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_constraint_impl")
    default Optional<SqlConstraintImpl> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, sqlConstraintImpl, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_constraint_impl")
    default List<SqlConstraintImpl> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, sqlConstraintImpl, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_constraint_impl")
    default List<SqlConstraintImpl> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, sqlConstraintImpl, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_constraint_impl")
    default Optional<SqlConstraintImpl> selectByPrimaryKey(Long oid_) {
        return selectOne(c ->
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_constraint_impl")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, sqlConstraintImpl, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_constraint_impl")
    static UpdateDSL<UpdateModel> updateAllColumns(SqlConstraintImpl record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalTo(record::getOid)
                .set(commentOid).equalTo(record::getCommentOid)
                .set(enable).equalTo(record::getEnable)
                .set(nameOid).equalTo(record::getNameOid)
                .set(rely).equalTo(record::getRely)
                .set(validate).equalTo(record::getValidate);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_constraint_impl")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(SqlConstraintImpl record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalToWhenPresent(record::getOid)
                .set(commentOid).equalToWhenPresent(record::getCommentOid)
                .set(enable).equalToWhenPresent(record::getEnable)
                .set(nameOid).equalToWhenPresent(record::getNameOid)
                .set(rely).equalToWhenPresent(record::getRely)
                .set(validate).equalToWhenPresent(record::getValidate);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_constraint_impl")
    default int updateByPrimaryKey(SqlConstraintImpl record) {
        return update(c ->
            c.set(commentOid).equalTo(record::getCommentOid)
            .set(enable).equalTo(record::getEnable)
            .set(nameOid).equalTo(record::getNameOid)
            .set(rely).equalTo(record::getRely)
            .set(validate).equalTo(record::getValidate)
            .where(oid, isEqualTo(record::getOid))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_constraint_impl")
    default int updateByPrimaryKeySelective(SqlConstraintImpl record) {
        return update(c ->
            c.set(commentOid).equalToWhenPresent(record::getCommentOid)
            .set(enable).equalToWhenPresent(record::getEnable)
            .set(nameOid).equalToWhenPresent(record::getNameOid)
            .set(rely).equalToWhenPresent(record::getRely)
            .set(validate).equalToWhenPresent(record::getValidate)
            .where(oid, isEqualTo(record::getOid))
        );
    }
}