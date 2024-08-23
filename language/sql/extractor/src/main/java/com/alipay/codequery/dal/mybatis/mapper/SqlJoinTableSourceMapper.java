package com.alipay.codequery.dal.mybatis.mapper;

import static com.alipay.codequery.dal.mybatis.mapper.SqlJoinTableSourceDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.alipay.codequery.dal.mybatis.domain.SqlJoinTableSource;
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
public interface SqlJoinTableSourceMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_join_table_source")
    BasicColumn[] selectList = BasicColumn.columnList(oid, conditionOid, isAsof, isGlobal, isNatural, joinType, leftOid, rightOid, udj);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_join_table_source")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_join_table_source")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_join_table_source")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<SqlJoinTableSource> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_join_table_source")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<SqlJoinTableSource> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_join_table_source")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="condition_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_asof", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_global", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_natural", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="join_type", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="left_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="right_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="udj", javaType=String.class, jdbcType=JdbcType.VARCHAR)
    })
    Optional<SqlJoinTableSource> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_join_table_source")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="condition_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_asof", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_global", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_natural", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="join_type", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="left_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="right_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="udj", javaType=String.class, jdbcType=JdbcType.VARCHAR)
    })
    List<SqlJoinTableSource> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_join_table_source")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_join_table_source")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, sqlJoinTableSource, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_join_table_source")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, sqlJoinTableSource, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_join_table_source")
    default int deleteByPrimaryKey(Long oid_) {
        return delete(c -> 
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_join_table_source")
    default int insert(SqlJoinTableSource record) {
        return MyBatis3Utils.insert(this::insert, record, sqlJoinTableSource, c ->
            c.map(oid).toProperty("oid")
            .map(conditionOid).toProperty("conditionOid")
            .map(isAsof).toProperty("isAsof")
            .map(isGlobal).toProperty("isGlobal")
            .map(isNatural).toProperty("isNatural")
            .map(joinType).toProperty("joinType")
            .map(leftOid).toProperty("leftOid")
            .map(rightOid).toProperty("rightOid")
            .map(udj).toProperty("udj")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_join_table_source")
    default int insertMultiple(Collection<SqlJoinTableSource> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, sqlJoinTableSource, c ->
            c.map(oid).toProperty("oid")
            .map(conditionOid).toProperty("conditionOid")
            .map(isAsof).toProperty("isAsof")
            .map(isGlobal).toProperty("isGlobal")
            .map(isNatural).toProperty("isNatural")
            .map(joinType).toProperty("joinType")
            .map(leftOid).toProperty("leftOid")
            .map(rightOid).toProperty("rightOid")
            .map(udj).toProperty("udj")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_join_table_source")
    default int insertSelective(SqlJoinTableSource record) {
        return MyBatis3Utils.insert(this::insert, record, sqlJoinTableSource, c ->
            c.map(oid).toPropertyWhenPresent("oid", record::getOid)
            .map(conditionOid).toPropertyWhenPresent("conditionOid", record::getConditionOid)
            .map(isAsof).toPropertyWhenPresent("isAsof", record::getIsAsof)
            .map(isGlobal).toPropertyWhenPresent("isGlobal", record::getIsGlobal)
            .map(isNatural).toPropertyWhenPresent("isNatural", record::getIsNatural)
            .map(joinType).toPropertyWhenPresent("joinType", record::getJoinType)
            .map(leftOid).toPropertyWhenPresent("leftOid", record::getLeftOid)
            .map(rightOid).toPropertyWhenPresent("rightOid", record::getRightOid)
            .map(udj).toPropertyWhenPresent("udj", record::getUdj)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_join_table_source")
    default Optional<SqlJoinTableSource> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, sqlJoinTableSource, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_join_table_source")
    default List<SqlJoinTableSource> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, sqlJoinTableSource, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_join_table_source")
    default List<SqlJoinTableSource> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, sqlJoinTableSource, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_join_table_source")
    default Optional<SqlJoinTableSource> selectByPrimaryKey(Long oid_) {
        return selectOne(c ->
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_join_table_source")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, sqlJoinTableSource, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_join_table_source")
    static UpdateDSL<UpdateModel> updateAllColumns(SqlJoinTableSource record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalTo(record::getOid)
                .set(conditionOid).equalTo(record::getConditionOid)
                .set(isAsof).equalTo(record::getIsAsof)
                .set(isGlobal).equalTo(record::getIsGlobal)
                .set(isNatural).equalTo(record::getIsNatural)
                .set(joinType).equalTo(record::getJoinType)
                .set(leftOid).equalTo(record::getLeftOid)
                .set(rightOid).equalTo(record::getRightOid)
                .set(udj).equalTo(record::getUdj);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_join_table_source")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(SqlJoinTableSource record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalToWhenPresent(record::getOid)
                .set(conditionOid).equalToWhenPresent(record::getConditionOid)
                .set(isAsof).equalToWhenPresent(record::getIsAsof)
                .set(isGlobal).equalToWhenPresent(record::getIsGlobal)
                .set(isNatural).equalToWhenPresent(record::getIsNatural)
                .set(joinType).equalToWhenPresent(record::getJoinType)
                .set(leftOid).equalToWhenPresent(record::getLeftOid)
                .set(rightOid).equalToWhenPresent(record::getRightOid)
                .set(udj).equalToWhenPresent(record::getUdj);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_join_table_source")
    default int updateByPrimaryKey(SqlJoinTableSource record) {
        return update(c ->
            c.set(conditionOid).equalTo(record::getConditionOid)
            .set(isAsof).equalTo(record::getIsAsof)
            .set(isGlobal).equalTo(record::getIsGlobal)
            .set(isNatural).equalTo(record::getIsNatural)
            .set(joinType).equalTo(record::getJoinType)
            .set(leftOid).equalTo(record::getLeftOid)
            .set(rightOid).equalTo(record::getRightOid)
            .set(udj).equalTo(record::getUdj)
            .where(oid, isEqualTo(record::getOid))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_join_table_source")
    default int updateByPrimaryKeySelective(SqlJoinTableSource record) {
        return update(c ->
            c.set(conditionOid).equalToWhenPresent(record::getConditionOid)
            .set(isAsof).equalToWhenPresent(record::getIsAsof)
            .set(isGlobal).equalToWhenPresent(record::getIsGlobal)
            .set(isNatural).equalToWhenPresent(record::getIsNatural)
            .set(joinType).equalToWhenPresent(record::getJoinType)
            .set(leftOid).equalToWhenPresent(record::getLeftOid)
            .set(rightOid).equalToWhenPresent(record::getRightOid)
            .set(udj).equalToWhenPresent(record::getUdj)
            .where(oid, isEqualTo(record::getOid))
        );
    }
}