package com.alipay.codequery.dal.mybatis.mapper;

import static com.alipay.codequery.dal.mybatis.mapper.MySqlShowRuleStatementDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.alipay.codequery.dal.mybatis.domain.MySqlShowRuleStatement;
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
public interface MySqlShowRuleStatementMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_show_rule_statement")
    BasicColumn[] selectList = BasicColumn.columnList(oid, isFull, isVersion, limitOid, nameOid, orderByOid, whereOid);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_show_rule_statement")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_show_rule_statement")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_show_rule_statement")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<MySqlShowRuleStatement> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_show_rule_statement")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<MySqlShowRuleStatement> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_show_rule_statement")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="is_full", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_version", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="limit_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="name_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="order_by_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="where_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT)
    })
    Optional<MySqlShowRuleStatement> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_show_rule_statement")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="is_full", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_version", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="limit_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="name_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="order_by_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="where_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT)
    })
    List<MySqlShowRuleStatement> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_show_rule_statement")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_show_rule_statement")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, mySqlShowRuleStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_show_rule_statement")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, mySqlShowRuleStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_show_rule_statement")
    default int deleteByPrimaryKey(Long oid_) {
        return delete(c -> 
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_show_rule_statement")
    default int insert(MySqlShowRuleStatement record) {
        return MyBatis3Utils.insert(this::insert, record, mySqlShowRuleStatement, c ->
            c.map(oid).toProperty("oid")
            .map(isFull).toProperty("isFull")
            .map(isVersion).toProperty("isVersion")
            .map(limitOid).toProperty("limitOid")
            .map(nameOid).toProperty("nameOid")
            .map(orderByOid).toProperty("orderByOid")
            .map(whereOid).toProperty("whereOid")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_show_rule_statement")
    default int insertMultiple(Collection<MySqlShowRuleStatement> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, mySqlShowRuleStatement, c ->
            c.map(oid).toProperty("oid")
            .map(isFull).toProperty("isFull")
            .map(isVersion).toProperty("isVersion")
            .map(limitOid).toProperty("limitOid")
            .map(nameOid).toProperty("nameOid")
            .map(orderByOid).toProperty("orderByOid")
            .map(whereOid).toProperty("whereOid")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_show_rule_statement")
    default int insertSelective(MySqlShowRuleStatement record) {
        return MyBatis3Utils.insert(this::insert, record, mySqlShowRuleStatement, c ->
            c.map(oid).toPropertyWhenPresent("oid", record::getOid)
            .map(isFull).toPropertyWhenPresent("isFull", record::getIsFull)
            .map(isVersion).toPropertyWhenPresent("isVersion", record::getIsVersion)
            .map(limitOid).toPropertyWhenPresent("limitOid", record::getLimitOid)
            .map(nameOid).toPropertyWhenPresent("nameOid", record::getNameOid)
            .map(orderByOid).toPropertyWhenPresent("orderByOid", record::getOrderByOid)
            .map(whereOid).toPropertyWhenPresent("whereOid", record::getWhereOid)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_show_rule_statement")
    default Optional<MySqlShowRuleStatement> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, mySqlShowRuleStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_show_rule_statement")
    default List<MySqlShowRuleStatement> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, mySqlShowRuleStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_show_rule_statement")
    default List<MySqlShowRuleStatement> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, mySqlShowRuleStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_show_rule_statement")
    default Optional<MySqlShowRuleStatement> selectByPrimaryKey(Long oid_) {
        return selectOne(c ->
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_show_rule_statement")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, mySqlShowRuleStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_show_rule_statement")
    static UpdateDSL<UpdateModel> updateAllColumns(MySqlShowRuleStatement record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalTo(record::getOid)
                .set(isFull).equalTo(record::getIsFull)
                .set(isVersion).equalTo(record::getIsVersion)
                .set(limitOid).equalTo(record::getLimitOid)
                .set(nameOid).equalTo(record::getNameOid)
                .set(orderByOid).equalTo(record::getOrderByOid)
                .set(whereOid).equalTo(record::getWhereOid);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_show_rule_statement")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(MySqlShowRuleStatement record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalToWhenPresent(record::getOid)
                .set(isFull).equalToWhenPresent(record::getIsFull)
                .set(isVersion).equalToWhenPresent(record::getIsVersion)
                .set(limitOid).equalToWhenPresent(record::getLimitOid)
                .set(nameOid).equalToWhenPresent(record::getNameOid)
                .set(orderByOid).equalToWhenPresent(record::getOrderByOid)
                .set(whereOid).equalToWhenPresent(record::getWhereOid);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_show_rule_statement")
    default int updateByPrimaryKey(MySqlShowRuleStatement record) {
        return update(c ->
            c.set(isFull).equalTo(record::getIsFull)
            .set(isVersion).equalTo(record::getIsVersion)
            .set(limitOid).equalTo(record::getLimitOid)
            .set(nameOid).equalTo(record::getNameOid)
            .set(orderByOid).equalTo(record::getOrderByOid)
            .set(whereOid).equalTo(record::getWhereOid)
            .where(oid, isEqualTo(record::getOid))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_show_rule_statement")
    default int updateByPrimaryKeySelective(MySqlShowRuleStatement record) {
        return update(c ->
            c.set(isFull).equalToWhenPresent(record::getIsFull)
            .set(isVersion).equalToWhenPresent(record::getIsVersion)
            .set(limitOid).equalToWhenPresent(record::getLimitOid)
            .set(nameOid).equalToWhenPresent(record::getNameOid)
            .set(orderByOid).equalToWhenPresent(record::getOrderByOid)
            .set(whereOid).equalToWhenPresent(record::getWhereOid)
            .where(oid, isEqualTo(record::getOid))
        );
    }
}