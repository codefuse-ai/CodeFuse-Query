package com.alipay.codequery.dal.mybatis.mapper;

import static com.alipay.codequery.dal.mybatis.mapper.SqlMatchAgainstExprDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.alipay.codequery.dal.mybatis.domain.SqlMatchAgainstExpr;
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
public interface SqlMatchAgainstExprMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_match_against_expr")
    BasicColumn[] selectList = BasicColumn.columnList(oid, againstOid, searchModifier);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_match_against_expr")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_match_against_expr")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_match_against_expr")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<SqlMatchAgainstExpr> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_match_against_expr")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<SqlMatchAgainstExpr> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_match_against_expr")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="against_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="search_modifier", javaType=String.class, jdbcType=JdbcType.VARCHAR)
    })
    Optional<SqlMatchAgainstExpr> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_match_against_expr")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="against_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="search_modifier", javaType=String.class, jdbcType=JdbcType.VARCHAR)
    })
    List<SqlMatchAgainstExpr> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_match_against_expr")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_match_against_expr")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, sqlMatchAgainstExpr, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_match_against_expr")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, sqlMatchAgainstExpr, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_match_against_expr")
    default int deleteByPrimaryKey(Long oid_) {
        return delete(c -> 
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_match_against_expr")
    default int insert(SqlMatchAgainstExpr record) {
        return MyBatis3Utils.insert(this::insert, record, sqlMatchAgainstExpr, c ->
            c.map(oid).toProperty("oid")
            .map(againstOid).toProperty("againstOid")
            .map(searchModifier).toProperty("searchModifier")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_match_against_expr")
    default int insertMultiple(Collection<SqlMatchAgainstExpr> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, sqlMatchAgainstExpr, c ->
            c.map(oid).toProperty("oid")
            .map(againstOid).toProperty("againstOid")
            .map(searchModifier).toProperty("searchModifier")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_match_against_expr")
    default int insertSelective(SqlMatchAgainstExpr record) {
        return MyBatis3Utils.insert(this::insert, record, sqlMatchAgainstExpr, c ->
            c.map(oid).toPropertyWhenPresent("oid", record::getOid)
            .map(againstOid).toPropertyWhenPresent("againstOid", record::getAgainstOid)
            .map(searchModifier).toPropertyWhenPresent("searchModifier", record::getSearchModifier)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_match_against_expr")
    default Optional<SqlMatchAgainstExpr> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, sqlMatchAgainstExpr, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_match_against_expr")
    default List<SqlMatchAgainstExpr> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, sqlMatchAgainstExpr, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_match_against_expr")
    default List<SqlMatchAgainstExpr> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, sqlMatchAgainstExpr, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_match_against_expr")
    default Optional<SqlMatchAgainstExpr> selectByPrimaryKey(Long oid_) {
        return selectOne(c ->
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_match_against_expr")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, sqlMatchAgainstExpr, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_match_against_expr")
    static UpdateDSL<UpdateModel> updateAllColumns(SqlMatchAgainstExpr record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalTo(record::getOid)
                .set(againstOid).equalTo(record::getAgainstOid)
                .set(searchModifier).equalTo(record::getSearchModifier);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_match_against_expr")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(SqlMatchAgainstExpr record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalToWhenPresent(record::getOid)
                .set(againstOid).equalToWhenPresent(record::getAgainstOid)
                .set(searchModifier).equalToWhenPresent(record::getSearchModifier);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_match_against_expr")
    default int updateByPrimaryKey(SqlMatchAgainstExpr record) {
        return update(c ->
            c.set(againstOid).equalTo(record::getAgainstOid)
            .set(searchModifier).equalTo(record::getSearchModifier)
            .where(oid, isEqualTo(record::getOid))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_match_against_expr")
    default int updateByPrimaryKeySelective(SqlMatchAgainstExpr record) {
        return update(c ->
            c.set(againstOid).equalToWhenPresent(record::getAgainstOid)
            .set(searchModifier).equalToWhenPresent(record::getSearchModifier)
            .where(oid, isEqualTo(record::getOid))
        );
    }
}