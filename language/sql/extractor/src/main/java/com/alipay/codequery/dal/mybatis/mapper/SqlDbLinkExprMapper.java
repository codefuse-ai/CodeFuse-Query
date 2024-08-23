package com.alipay.codequery.dal.mybatis.mapper;

import static com.alipay.codequery.dal.mybatis.mapper.SqlDbLinkExprDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.alipay.codequery.dal.mybatis.domain.SqlDbLinkExpr;
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
public interface SqlDbLinkExprMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_db_link_expr")
    BasicColumn[] selectList = BasicColumn.columnList(oid, dbLink, exprOid, resolvedColumnOid, simpleName);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_db_link_expr")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_db_link_expr")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_db_link_expr")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<SqlDbLinkExpr> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_db_link_expr")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<SqlDbLinkExpr> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_db_link_expr")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="db_link", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="expr_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="resolved_column_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="simple_name", javaType=String.class, jdbcType=JdbcType.VARCHAR)
    })
    Optional<SqlDbLinkExpr> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_db_link_expr")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="db_link", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="expr_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="resolved_column_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="simple_name", javaType=String.class, jdbcType=JdbcType.VARCHAR)
    })
    List<SqlDbLinkExpr> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_db_link_expr")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_db_link_expr")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, sqlDbLinkExpr, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_db_link_expr")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, sqlDbLinkExpr, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_db_link_expr")
    default int deleteByPrimaryKey(Long oid_) {
        return delete(c -> 
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_db_link_expr")
    default int insert(SqlDbLinkExpr record) {
        return MyBatis3Utils.insert(this::insert, record, sqlDbLinkExpr, c ->
            c.map(oid).toProperty("oid")
            .map(dbLink).toProperty("dbLink")
            .map(exprOid).toProperty("exprOid")
            .map(resolvedColumnOid).toProperty("resolvedColumnOid")
            .map(simpleName).toProperty("simpleName")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_db_link_expr")
    default int insertMultiple(Collection<SqlDbLinkExpr> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, sqlDbLinkExpr, c ->
            c.map(oid).toProperty("oid")
            .map(dbLink).toProperty("dbLink")
            .map(exprOid).toProperty("exprOid")
            .map(resolvedColumnOid).toProperty("resolvedColumnOid")
            .map(simpleName).toProperty("simpleName")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_db_link_expr")
    default int insertSelective(SqlDbLinkExpr record) {
        return MyBatis3Utils.insert(this::insert, record, sqlDbLinkExpr, c ->
            c.map(oid).toPropertyWhenPresent("oid", record::getOid)
            .map(dbLink).toPropertyWhenPresent("dbLink", record::getDbLink)
            .map(exprOid).toPropertyWhenPresent("exprOid", record::getExprOid)
            .map(resolvedColumnOid).toPropertyWhenPresent("resolvedColumnOid", record::getResolvedColumnOid)
            .map(simpleName).toPropertyWhenPresent("simpleName", record::getSimpleName)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_db_link_expr")
    default Optional<SqlDbLinkExpr> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, sqlDbLinkExpr, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_db_link_expr")
    default List<SqlDbLinkExpr> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, sqlDbLinkExpr, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_db_link_expr")
    default List<SqlDbLinkExpr> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, sqlDbLinkExpr, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_db_link_expr")
    default Optional<SqlDbLinkExpr> selectByPrimaryKey(Long oid_) {
        return selectOne(c ->
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_db_link_expr")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, sqlDbLinkExpr, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_db_link_expr")
    static UpdateDSL<UpdateModel> updateAllColumns(SqlDbLinkExpr record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalTo(record::getOid)
                .set(dbLink).equalTo(record::getDbLink)
                .set(exprOid).equalTo(record::getExprOid)
                .set(resolvedColumnOid).equalTo(record::getResolvedColumnOid)
                .set(simpleName).equalTo(record::getSimpleName);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_db_link_expr")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(SqlDbLinkExpr record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalToWhenPresent(record::getOid)
                .set(dbLink).equalToWhenPresent(record::getDbLink)
                .set(exprOid).equalToWhenPresent(record::getExprOid)
                .set(resolvedColumnOid).equalToWhenPresent(record::getResolvedColumnOid)
                .set(simpleName).equalToWhenPresent(record::getSimpleName);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_db_link_expr")
    default int updateByPrimaryKey(SqlDbLinkExpr record) {
        return update(c ->
            c.set(dbLink).equalTo(record::getDbLink)
            .set(exprOid).equalTo(record::getExprOid)
            .set(resolvedColumnOid).equalTo(record::getResolvedColumnOid)
            .set(simpleName).equalTo(record::getSimpleName)
            .where(oid, isEqualTo(record::getOid))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_db_link_expr")
    default int updateByPrimaryKeySelective(SqlDbLinkExpr record) {
        return update(c ->
            c.set(dbLink).equalToWhenPresent(record::getDbLink)
            .set(exprOid).equalToWhenPresent(record::getExprOid)
            .set(resolvedColumnOid).equalToWhenPresent(record::getResolvedColumnOid)
            .set(simpleName).equalToWhenPresent(record::getSimpleName)
            .where(oid, isEqualTo(record::getOid))
        );
    }
}