package com.alipay.codequery.dal.mybatis.mapper;

import static com.alipay.codequery.dal.mybatis.mapper.SqlIfStatementDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.alipay.codequery.dal.mybatis.domain.SqlIfStatement;
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
public interface SqlIfStatementMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_if_statement")
    BasicColumn[] selectList = BasicColumn.columnList(oid, conditionOid, elseIfList, elseItem);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_if_statement")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_if_statement")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_if_statement")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<SqlIfStatement> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_if_statement")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<SqlIfStatement> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_if_statement")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="condition_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="else_if_list", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="else_item", javaType=String.class, jdbcType=JdbcType.VARCHAR)
    })
    Optional<SqlIfStatement> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_if_statement")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="condition_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="else_if_list", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="else_item", javaType=String.class, jdbcType=JdbcType.VARCHAR)
    })
    List<SqlIfStatement> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_if_statement")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_if_statement")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, sqlIfStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_if_statement")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, sqlIfStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_if_statement")
    default int deleteByPrimaryKey(Long oid_) {
        return delete(c -> 
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_if_statement")
    default int insert(SqlIfStatement record) {
        return MyBatis3Utils.insert(this::insert, record, sqlIfStatement, c ->
            c.map(oid).toProperty("oid")
            .map(conditionOid).toProperty("conditionOid")
            .map(elseIfList).toProperty("elseIfList")
            .map(elseItem).toProperty("elseItem")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_if_statement")
    default int insertMultiple(Collection<SqlIfStatement> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, sqlIfStatement, c ->
            c.map(oid).toProperty("oid")
            .map(conditionOid).toProperty("conditionOid")
            .map(elseIfList).toProperty("elseIfList")
            .map(elseItem).toProperty("elseItem")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_if_statement")
    default int insertSelective(SqlIfStatement record) {
        return MyBatis3Utils.insert(this::insert, record, sqlIfStatement, c ->
            c.map(oid).toPropertyWhenPresent("oid", record::getOid)
            .map(conditionOid).toPropertyWhenPresent("conditionOid", record::getConditionOid)
            .map(elseIfList).toPropertyWhenPresent("elseIfList", record::getElseIfList)
            .map(elseItem).toPropertyWhenPresent("elseItem", record::getElseItem)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_if_statement")
    default Optional<SqlIfStatement> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, sqlIfStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_if_statement")
    default List<SqlIfStatement> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, sqlIfStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_if_statement")
    default List<SqlIfStatement> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, sqlIfStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_if_statement")
    default Optional<SqlIfStatement> selectByPrimaryKey(Long oid_) {
        return selectOne(c ->
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_if_statement")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, sqlIfStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_if_statement")
    static UpdateDSL<UpdateModel> updateAllColumns(SqlIfStatement record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalTo(record::getOid)
                .set(conditionOid).equalTo(record::getConditionOid)
                .set(elseIfList).equalTo(record::getElseIfList)
                .set(elseItem).equalTo(record::getElseItem);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_if_statement")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(SqlIfStatement record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalToWhenPresent(record::getOid)
                .set(conditionOid).equalToWhenPresent(record::getConditionOid)
                .set(elseIfList).equalToWhenPresent(record::getElseIfList)
                .set(elseItem).equalToWhenPresent(record::getElseItem);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_if_statement")
    default int updateByPrimaryKey(SqlIfStatement record) {
        return update(c ->
            c.set(conditionOid).equalTo(record::getConditionOid)
            .set(elseIfList).equalTo(record::getElseIfList)
            .set(elseItem).equalTo(record::getElseItem)
            .where(oid, isEqualTo(record::getOid))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_if_statement")
    default int updateByPrimaryKeySelective(SqlIfStatement record) {
        return update(c ->
            c.set(conditionOid).equalToWhenPresent(record::getConditionOid)
            .set(elseIfList).equalToWhenPresent(record::getElseIfList)
            .set(elseItem).equalToWhenPresent(record::getElseItem)
            .where(oid, isEqualTo(record::getOid))
        );
    }
}