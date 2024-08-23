package com.alipay.codequery.dal.mybatis.mapper;

import static com.alipay.codequery.dal.mybatis.mapper.SqlWithSubqueryClauseDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.alipay.codequery.dal.mybatis.domain.SqlWithSubqueryClause;
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
public interface SqlWithSubqueryClauseMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_with_subquery_clause")
    BasicColumn[] selectList = BasicColumn.columnList(oid, entries, recursive);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_with_subquery_clause")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_with_subquery_clause")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_with_subquery_clause")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<SqlWithSubqueryClause> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_with_subquery_clause")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<SqlWithSubqueryClause> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_with_subquery_clause")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="entries", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="recursive", javaType=Integer.class, jdbcType=JdbcType.BIGINT)
    })
    Optional<SqlWithSubqueryClause> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_with_subquery_clause")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="entries", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="recursive", javaType=Integer.class, jdbcType=JdbcType.BIGINT)
    })
    List<SqlWithSubqueryClause> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_with_subquery_clause")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_with_subquery_clause")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, sqlWithSubqueryClause, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_with_subquery_clause")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, sqlWithSubqueryClause, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_with_subquery_clause")
    default int deleteByPrimaryKey(Long oid_) {
        return delete(c -> 
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_with_subquery_clause")
    default int insert(SqlWithSubqueryClause record) {
        return MyBatis3Utils.insert(this::insert, record, sqlWithSubqueryClause, c ->
            c.map(oid).toProperty("oid")
            .map(entries).toProperty("entries")
            .map(recursive).toProperty("recursive")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_with_subquery_clause")
    default int insertMultiple(Collection<SqlWithSubqueryClause> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, sqlWithSubqueryClause, c ->
            c.map(oid).toProperty("oid")
            .map(entries).toProperty("entries")
            .map(recursive).toProperty("recursive")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_with_subquery_clause")
    default int insertSelective(SqlWithSubqueryClause record) {
        return MyBatis3Utils.insert(this::insert, record, sqlWithSubqueryClause, c ->
            c.map(oid).toPropertyWhenPresent("oid", record::getOid)
            .map(entries).toPropertyWhenPresent("entries", record::getEntries)
            .map(recursive).toPropertyWhenPresent("recursive", record::getRecursive)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_with_subquery_clause")
    default Optional<SqlWithSubqueryClause> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, sqlWithSubqueryClause, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_with_subquery_clause")
    default List<SqlWithSubqueryClause> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, sqlWithSubqueryClause, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_with_subquery_clause")
    default List<SqlWithSubqueryClause> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, sqlWithSubqueryClause, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_with_subquery_clause")
    default Optional<SqlWithSubqueryClause> selectByPrimaryKey(Long oid_) {
        return selectOne(c ->
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_with_subquery_clause")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, sqlWithSubqueryClause, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_with_subquery_clause")
    static UpdateDSL<UpdateModel> updateAllColumns(SqlWithSubqueryClause record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalTo(record::getOid)
                .set(entries).equalTo(record::getEntries)
                .set(recursive).equalTo(record::getRecursive);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_with_subquery_clause")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(SqlWithSubqueryClause record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalToWhenPresent(record::getOid)
                .set(entries).equalToWhenPresent(record::getEntries)
                .set(recursive).equalToWhenPresent(record::getRecursive);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_with_subquery_clause")
    default int updateByPrimaryKey(SqlWithSubqueryClause record) {
        return update(c ->
            c.set(entries).equalTo(record::getEntries)
            .set(recursive).equalTo(record::getRecursive)
            .where(oid, isEqualTo(record::getOid))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_with_subquery_clause")
    default int updateByPrimaryKeySelective(SqlWithSubqueryClause record) {
        return update(c ->
            c.set(entries).equalToWhenPresent(record::getEntries)
            .set(recursive).equalToWhenPresent(record::getRecursive)
            .where(oid, isEqualTo(record::getOid))
        );
    }
}