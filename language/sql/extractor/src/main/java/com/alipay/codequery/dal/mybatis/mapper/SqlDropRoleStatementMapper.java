package com.alipay.codequery.dal.mybatis.mapper;

import static com.alipay.codequery.dal.mybatis.mapper.SqlDropRoleStatementDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.alipay.codequery.dal.mybatis.domain.SqlDropRoleStatement;
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
public interface SqlDropRoleStatementMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_drop_role_statement")
    BasicColumn[] selectList = BasicColumn.columnList(oid, isIfNotExists, nameOid);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_drop_role_statement")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_drop_role_statement")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_drop_role_statement")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<SqlDropRoleStatement> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_drop_role_statement")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<SqlDropRoleStatement> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_drop_role_statement")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="is_if_not_exists", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="name_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT)
    })
    Optional<SqlDropRoleStatement> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_drop_role_statement")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="is_if_not_exists", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="name_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT)
    })
    List<SqlDropRoleStatement> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_drop_role_statement")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_drop_role_statement")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, sqlDropRoleStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_drop_role_statement")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, sqlDropRoleStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_drop_role_statement")
    default int deleteByPrimaryKey(Long oid_) {
        return delete(c -> 
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_drop_role_statement")
    default int insert(SqlDropRoleStatement record) {
        return MyBatis3Utils.insert(this::insert, record, sqlDropRoleStatement, c ->
            c.map(oid).toProperty("oid")
            .map(isIfNotExists).toProperty("isIfNotExists")
            .map(nameOid).toProperty("nameOid")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_drop_role_statement")
    default int insertMultiple(Collection<SqlDropRoleStatement> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, sqlDropRoleStatement, c ->
            c.map(oid).toProperty("oid")
            .map(isIfNotExists).toProperty("isIfNotExists")
            .map(nameOid).toProperty("nameOid")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_drop_role_statement")
    default int insertSelective(SqlDropRoleStatement record) {
        return MyBatis3Utils.insert(this::insert, record, sqlDropRoleStatement, c ->
            c.map(oid).toPropertyWhenPresent("oid", record::getOid)
            .map(isIfNotExists).toPropertyWhenPresent("isIfNotExists", record::getIsIfNotExists)
            .map(nameOid).toPropertyWhenPresent("nameOid", record::getNameOid)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_drop_role_statement")
    default Optional<SqlDropRoleStatement> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, sqlDropRoleStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_drop_role_statement")
    default List<SqlDropRoleStatement> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, sqlDropRoleStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_drop_role_statement")
    default List<SqlDropRoleStatement> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, sqlDropRoleStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_drop_role_statement")
    default Optional<SqlDropRoleStatement> selectByPrimaryKey(Long oid_) {
        return selectOne(c ->
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_drop_role_statement")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, sqlDropRoleStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_drop_role_statement")
    static UpdateDSL<UpdateModel> updateAllColumns(SqlDropRoleStatement record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalTo(record::getOid)
                .set(isIfNotExists).equalTo(record::getIsIfNotExists)
                .set(nameOid).equalTo(record::getNameOid);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_drop_role_statement")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(SqlDropRoleStatement record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalToWhenPresent(record::getOid)
                .set(isIfNotExists).equalToWhenPresent(record::getIsIfNotExists)
                .set(nameOid).equalToWhenPresent(record::getNameOid);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_drop_role_statement")
    default int updateByPrimaryKey(SqlDropRoleStatement record) {
        return update(c ->
            c.set(isIfNotExists).equalTo(record::getIsIfNotExists)
            .set(nameOid).equalTo(record::getNameOid)
            .where(oid, isEqualTo(record::getOid))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_drop_role_statement")
    default int updateByPrimaryKeySelective(SqlDropRoleStatement record) {
        return update(c ->
            c.set(isIfNotExists).equalToWhenPresent(record::getIsIfNotExists)
            .set(nameOid).equalToWhenPresent(record::getNameOid)
            .where(oid, isEqualTo(record::getOid))
        );
    }
}