package com.alipay.codequery.dal.mybatis.mapper;

import static com.alipay.codequery.dal.mybatis.mapper.SqlInsertStatementDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.alipay.codequery.dal.mybatis.domain.SqlInsertStatement;
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
public interface SqlInsertStatementMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_insert_statement")
    BasicColumn[] selectList = BasicColumn.columnList(oid, isAfterSemi, isUpsert, withOid);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_insert_statement")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_insert_statement")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_insert_statement")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<SqlInsertStatement> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_insert_statement")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<SqlInsertStatement> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_insert_statement")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="is_after_semi", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_upsert", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="with_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT)
    })
    Optional<SqlInsertStatement> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_insert_statement")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="is_after_semi", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_upsert", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="with_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT)
    })
    List<SqlInsertStatement> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_insert_statement")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_insert_statement")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, sqlInsertStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_insert_statement")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, sqlInsertStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_insert_statement")
    default int deleteByPrimaryKey(Long oid_) {
        return delete(c -> 
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_insert_statement")
    default int insert(SqlInsertStatement record) {
        return MyBatis3Utils.insert(this::insert, record, sqlInsertStatement, c ->
            c.map(oid).toProperty("oid")
            .map(isAfterSemi).toProperty("isAfterSemi")
            .map(isUpsert).toProperty("isUpsert")
            .map(withOid).toProperty("withOid")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_insert_statement")
    default int insertMultiple(Collection<SqlInsertStatement> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, sqlInsertStatement, c ->
            c.map(oid).toProperty("oid")
            .map(isAfterSemi).toProperty("isAfterSemi")
            .map(isUpsert).toProperty("isUpsert")
            .map(withOid).toProperty("withOid")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_insert_statement")
    default int insertSelective(SqlInsertStatement record) {
        return MyBatis3Utils.insert(this::insert, record, sqlInsertStatement, c ->
            c.map(oid).toPropertyWhenPresent("oid", record::getOid)
            .map(isAfterSemi).toPropertyWhenPresent("isAfterSemi", record::getIsAfterSemi)
            .map(isUpsert).toPropertyWhenPresent("isUpsert", record::getIsUpsert)
            .map(withOid).toPropertyWhenPresent("withOid", record::getWithOid)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_insert_statement")
    default Optional<SqlInsertStatement> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, sqlInsertStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_insert_statement")
    default List<SqlInsertStatement> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, sqlInsertStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_insert_statement")
    default List<SqlInsertStatement> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, sqlInsertStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_insert_statement")
    default Optional<SqlInsertStatement> selectByPrimaryKey(Long oid_) {
        return selectOne(c ->
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_insert_statement")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, sqlInsertStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_insert_statement")
    static UpdateDSL<UpdateModel> updateAllColumns(SqlInsertStatement record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalTo(record::getOid)
                .set(isAfterSemi).equalTo(record::getIsAfterSemi)
                .set(isUpsert).equalTo(record::getIsUpsert)
                .set(withOid).equalTo(record::getWithOid);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_insert_statement")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(SqlInsertStatement record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalToWhenPresent(record::getOid)
                .set(isAfterSemi).equalToWhenPresent(record::getIsAfterSemi)
                .set(isUpsert).equalToWhenPresent(record::getIsUpsert)
                .set(withOid).equalToWhenPresent(record::getWithOid);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_insert_statement")
    default int updateByPrimaryKey(SqlInsertStatement record) {
        return update(c ->
            c.set(isAfterSemi).equalTo(record::getIsAfterSemi)
            .set(isUpsert).equalTo(record::getIsUpsert)
            .set(withOid).equalTo(record::getWithOid)
            .where(oid, isEqualTo(record::getOid))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_insert_statement")
    default int updateByPrimaryKeySelective(SqlInsertStatement record) {
        return update(c ->
            c.set(isAfterSemi).equalToWhenPresent(record::getIsAfterSemi)
            .set(isUpsert).equalToWhenPresent(record::getIsUpsert)
            .set(withOid).equalToWhenPresent(record::getWithOid)
            .where(oid, isEqualTo(record::getOid))
        );
    }
}