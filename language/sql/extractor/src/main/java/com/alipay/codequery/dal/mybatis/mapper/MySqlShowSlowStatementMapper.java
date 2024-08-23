package com.alipay.codequery.dal.mybatis.mapper;

import static com.alipay.codequery.dal.mybatis.mapper.MySqlShowSlowStatementDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.alipay.codequery.dal.mybatis.domain.MySqlShowSlowStatement;
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
public interface MySqlShowSlowStatementMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_show_slow_statement")
    BasicColumn[] selectList = BasicColumn.columnList(oid, isFull, isPhysical, limitOid, orderByOid, whereOid);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_show_slow_statement")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_show_slow_statement")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_show_slow_statement")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<MySqlShowSlowStatement> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_show_slow_statement")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<MySqlShowSlowStatement> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_show_slow_statement")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="is_full", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_physical", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="limit_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="order_by_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="where_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT)
    })
    Optional<MySqlShowSlowStatement> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_show_slow_statement")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="is_full", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_physical", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="limit_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="order_by_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="where_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT)
    })
    List<MySqlShowSlowStatement> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_show_slow_statement")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_show_slow_statement")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, mySqlShowSlowStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_show_slow_statement")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, mySqlShowSlowStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_show_slow_statement")
    default int deleteByPrimaryKey(Long oid_) {
        return delete(c -> 
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_show_slow_statement")
    default int insert(MySqlShowSlowStatement record) {
        return MyBatis3Utils.insert(this::insert, record, mySqlShowSlowStatement, c ->
            c.map(oid).toProperty("oid")
            .map(isFull).toProperty("isFull")
            .map(isPhysical).toProperty("isPhysical")
            .map(limitOid).toProperty("limitOid")
            .map(orderByOid).toProperty("orderByOid")
            .map(whereOid).toProperty("whereOid")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_show_slow_statement")
    default int insertMultiple(Collection<MySqlShowSlowStatement> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, mySqlShowSlowStatement, c ->
            c.map(oid).toProperty("oid")
            .map(isFull).toProperty("isFull")
            .map(isPhysical).toProperty("isPhysical")
            .map(limitOid).toProperty("limitOid")
            .map(orderByOid).toProperty("orderByOid")
            .map(whereOid).toProperty("whereOid")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_show_slow_statement")
    default int insertSelective(MySqlShowSlowStatement record) {
        return MyBatis3Utils.insert(this::insert, record, mySqlShowSlowStatement, c ->
            c.map(oid).toPropertyWhenPresent("oid", record::getOid)
            .map(isFull).toPropertyWhenPresent("isFull", record::getIsFull)
            .map(isPhysical).toPropertyWhenPresent("isPhysical", record::getIsPhysical)
            .map(limitOid).toPropertyWhenPresent("limitOid", record::getLimitOid)
            .map(orderByOid).toPropertyWhenPresent("orderByOid", record::getOrderByOid)
            .map(whereOid).toPropertyWhenPresent("whereOid", record::getWhereOid)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_show_slow_statement")
    default Optional<MySqlShowSlowStatement> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, mySqlShowSlowStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_show_slow_statement")
    default List<MySqlShowSlowStatement> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, mySqlShowSlowStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_show_slow_statement")
    default List<MySqlShowSlowStatement> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, mySqlShowSlowStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_show_slow_statement")
    default Optional<MySqlShowSlowStatement> selectByPrimaryKey(Long oid_) {
        return selectOne(c ->
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_show_slow_statement")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, mySqlShowSlowStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_show_slow_statement")
    static UpdateDSL<UpdateModel> updateAllColumns(MySqlShowSlowStatement record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalTo(record::getOid)
                .set(isFull).equalTo(record::getIsFull)
                .set(isPhysical).equalTo(record::getIsPhysical)
                .set(limitOid).equalTo(record::getLimitOid)
                .set(orderByOid).equalTo(record::getOrderByOid)
                .set(whereOid).equalTo(record::getWhereOid);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_show_slow_statement")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(MySqlShowSlowStatement record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalToWhenPresent(record::getOid)
                .set(isFull).equalToWhenPresent(record::getIsFull)
                .set(isPhysical).equalToWhenPresent(record::getIsPhysical)
                .set(limitOid).equalToWhenPresent(record::getLimitOid)
                .set(orderByOid).equalToWhenPresent(record::getOrderByOid)
                .set(whereOid).equalToWhenPresent(record::getWhereOid);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_show_slow_statement")
    default int updateByPrimaryKey(MySqlShowSlowStatement record) {
        return update(c ->
            c.set(isFull).equalTo(record::getIsFull)
            .set(isPhysical).equalTo(record::getIsPhysical)
            .set(limitOid).equalTo(record::getLimitOid)
            .set(orderByOid).equalTo(record::getOrderByOid)
            .set(whereOid).equalTo(record::getWhereOid)
            .where(oid, isEqualTo(record::getOid))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_show_slow_statement")
    default int updateByPrimaryKeySelective(MySqlShowSlowStatement record) {
        return update(c ->
            c.set(isFull).equalToWhenPresent(record::getIsFull)
            .set(isPhysical).equalToWhenPresent(record::getIsPhysical)
            .set(limitOid).equalToWhenPresent(record::getLimitOid)
            .set(orderByOid).equalToWhenPresent(record::getOrderByOid)
            .set(whereOid).equalToWhenPresent(record::getWhereOid)
            .where(oid, isEqualTo(record::getOid))
        );
    }
}