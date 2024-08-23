package com.alipay.codequery.dal.mybatis.mapper;

import static com.alipay.codequery.dal.mybatis.mapper.SqlSelectGroupByClauseDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.alipay.codequery.dal.mybatis.domain.SqlSelectGroupByClause;
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
public interface SqlSelectGroupByClauseMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_select_group_by_clause")
    BasicColumn[] selectList = BasicColumn.columnList(oid, havingOid, hintOid, isDistinct, isParen, isWithCube, isWithRollUp);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_select_group_by_clause")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_select_group_by_clause")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_select_group_by_clause")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<SqlSelectGroupByClause> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_select_group_by_clause")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<SqlSelectGroupByClause> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_select_group_by_clause")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="having_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="hint_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_distinct", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_paren", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_with_cube", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_with_roll_up", javaType=Integer.class, jdbcType=JdbcType.BIGINT)
    })
    Optional<SqlSelectGroupByClause> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_select_group_by_clause")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="having_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="hint_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_distinct", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_paren", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_with_cube", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_with_roll_up", javaType=Integer.class, jdbcType=JdbcType.BIGINT)
    })
    List<SqlSelectGroupByClause> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_select_group_by_clause")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_select_group_by_clause")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, sqlSelectGroupByClause, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_select_group_by_clause")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, sqlSelectGroupByClause, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_select_group_by_clause")
    default int deleteByPrimaryKey(Long oid_) {
        return delete(c -> 
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_select_group_by_clause")
    default int insert(SqlSelectGroupByClause record) {
        return MyBatis3Utils.insert(this::insert, record, sqlSelectGroupByClause, c ->
            c.map(oid).toProperty("oid")
            .map(havingOid).toProperty("havingOid")
            .map(hintOid).toProperty("hintOid")
            .map(isDistinct).toProperty("isDistinct")
            .map(isParen).toProperty("isParen")
            .map(isWithCube).toProperty("isWithCube")
            .map(isWithRollUp).toProperty("isWithRollUp")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_select_group_by_clause")
    default int insertMultiple(Collection<SqlSelectGroupByClause> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, sqlSelectGroupByClause, c ->
            c.map(oid).toProperty("oid")
            .map(havingOid).toProperty("havingOid")
            .map(hintOid).toProperty("hintOid")
            .map(isDistinct).toProperty("isDistinct")
            .map(isParen).toProperty("isParen")
            .map(isWithCube).toProperty("isWithCube")
            .map(isWithRollUp).toProperty("isWithRollUp")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_select_group_by_clause")
    default int insertSelective(SqlSelectGroupByClause record) {
        return MyBatis3Utils.insert(this::insert, record, sqlSelectGroupByClause, c ->
            c.map(oid).toPropertyWhenPresent("oid", record::getOid)
            .map(havingOid).toPropertyWhenPresent("havingOid", record::getHavingOid)
            .map(hintOid).toPropertyWhenPresent("hintOid", record::getHintOid)
            .map(isDistinct).toPropertyWhenPresent("isDistinct", record::getIsDistinct)
            .map(isParen).toPropertyWhenPresent("isParen", record::getIsParen)
            .map(isWithCube).toPropertyWhenPresent("isWithCube", record::getIsWithCube)
            .map(isWithRollUp).toPropertyWhenPresent("isWithRollUp", record::getIsWithRollUp)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_select_group_by_clause")
    default Optional<SqlSelectGroupByClause> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, sqlSelectGroupByClause, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_select_group_by_clause")
    default List<SqlSelectGroupByClause> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, sqlSelectGroupByClause, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_select_group_by_clause")
    default List<SqlSelectGroupByClause> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, sqlSelectGroupByClause, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_select_group_by_clause")
    default Optional<SqlSelectGroupByClause> selectByPrimaryKey(Long oid_) {
        return selectOne(c ->
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_select_group_by_clause")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, sqlSelectGroupByClause, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_select_group_by_clause")
    static UpdateDSL<UpdateModel> updateAllColumns(SqlSelectGroupByClause record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalTo(record::getOid)
                .set(havingOid).equalTo(record::getHavingOid)
                .set(hintOid).equalTo(record::getHintOid)
                .set(isDistinct).equalTo(record::getIsDistinct)
                .set(isParen).equalTo(record::getIsParen)
                .set(isWithCube).equalTo(record::getIsWithCube)
                .set(isWithRollUp).equalTo(record::getIsWithRollUp);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_select_group_by_clause")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(SqlSelectGroupByClause record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalToWhenPresent(record::getOid)
                .set(havingOid).equalToWhenPresent(record::getHavingOid)
                .set(hintOid).equalToWhenPresent(record::getHintOid)
                .set(isDistinct).equalToWhenPresent(record::getIsDistinct)
                .set(isParen).equalToWhenPresent(record::getIsParen)
                .set(isWithCube).equalToWhenPresent(record::getIsWithCube)
                .set(isWithRollUp).equalToWhenPresent(record::getIsWithRollUp);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_select_group_by_clause")
    default int updateByPrimaryKey(SqlSelectGroupByClause record) {
        return update(c ->
            c.set(havingOid).equalTo(record::getHavingOid)
            .set(hintOid).equalTo(record::getHintOid)
            .set(isDistinct).equalTo(record::getIsDistinct)
            .set(isParen).equalTo(record::getIsParen)
            .set(isWithCube).equalTo(record::getIsWithCube)
            .set(isWithRollUp).equalTo(record::getIsWithRollUp)
            .where(oid, isEqualTo(record::getOid))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_select_group_by_clause")
    default int updateByPrimaryKeySelective(SqlSelectGroupByClause record) {
        return update(c ->
            c.set(havingOid).equalToWhenPresent(record::getHavingOid)
            .set(hintOid).equalToWhenPresent(record::getHintOid)
            .set(isDistinct).equalToWhenPresent(record::getIsDistinct)
            .set(isParen).equalToWhenPresent(record::getIsParen)
            .set(isWithCube).equalToWhenPresent(record::getIsWithCube)
            .set(isWithRollUp).equalToWhenPresent(record::getIsWithRollUp)
            .where(oid, isEqualTo(record::getOid))
        );
    }
}