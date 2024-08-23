package com.alipay.codequery.dal.mybatis.mapper;

import static com.alipay.codequery.dal.mybatis.mapper.MySqlJsonTableExprDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.alipay.codequery.dal.mybatis.domain.MySqlJsonTableExpr;
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
public interface MySqlJsonTableExprMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_json_table_expr")
    BasicColumn[] selectList = BasicColumn.columnList(oid, columns, exprOid, pathOid);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_json_table_expr")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_json_table_expr")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_json_table_expr")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<MySqlJsonTableExpr> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_json_table_expr")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<MySqlJsonTableExpr> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_json_table_expr")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="columns", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="expr_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="path_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT)
    })
    Optional<MySqlJsonTableExpr> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_json_table_expr")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="columns", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="expr_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="path_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT)
    })
    List<MySqlJsonTableExpr> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_json_table_expr")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_json_table_expr")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, mySqlJsonTableExpr, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_json_table_expr")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, mySqlJsonTableExpr, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_json_table_expr")
    default int deleteByPrimaryKey(Long oid_) {
        return delete(c -> 
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_json_table_expr")
    default int insert(MySqlJsonTableExpr record) {
        return MyBatis3Utils.insert(this::insert, record, mySqlJsonTableExpr, c ->
            c.map(oid).toProperty("oid")
            .map(columns).toProperty("columns")
            .map(exprOid).toProperty("exprOid")
            .map(pathOid).toProperty("pathOid")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_json_table_expr")
    default int insertMultiple(Collection<MySqlJsonTableExpr> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, mySqlJsonTableExpr, c ->
            c.map(oid).toProperty("oid")
            .map(columns).toProperty("columns")
            .map(exprOid).toProperty("exprOid")
            .map(pathOid).toProperty("pathOid")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_json_table_expr")
    default int insertSelective(MySqlJsonTableExpr record) {
        return MyBatis3Utils.insert(this::insert, record, mySqlJsonTableExpr, c ->
            c.map(oid).toPropertyWhenPresent("oid", record::getOid)
            .map(columns).toPropertyWhenPresent("columns", record::getColumns)
            .map(exprOid).toPropertyWhenPresent("exprOid", record::getExprOid)
            .map(pathOid).toPropertyWhenPresent("pathOid", record::getPathOid)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_json_table_expr")
    default Optional<MySqlJsonTableExpr> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, mySqlJsonTableExpr, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_json_table_expr")
    default List<MySqlJsonTableExpr> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, mySqlJsonTableExpr, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_json_table_expr")
    default List<MySqlJsonTableExpr> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, mySqlJsonTableExpr, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_json_table_expr")
    default Optional<MySqlJsonTableExpr> selectByPrimaryKey(Long oid_) {
        return selectOne(c ->
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_json_table_expr")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, mySqlJsonTableExpr, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_json_table_expr")
    static UpdateDSL<UpdateModel> updateAllColumns(MySqlJsonTableExpr record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalTo(record::getOid)
                .set(columns).equalTo(record::getColumns)
                .set(exprOid).equalTo(record::getExprOid)
                .set(pathOid).equalTo(record::getPathOid);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_json_table_expr")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(MySqlJsonTableExpr record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalToWhenPresent(record::getOid)
                .set(columns).equalToWhenPresent(record::getColumns)
                .set(exprOid).equalToWhenPresent(record::getExprOid)
                .set(pathOid).equalToWhenPresent(record::getPathOid);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_json_table_expr")
    default int updateByPrimaryKey(MySqlJsonTableExpr record) {
        return update(c ->
            c.set(columns).equalTo(record::getColumns)
            .set(exprOid).equalTo(record::getExprOid)
            .set(pathOid).equalTo(record::getPathOid)
            .where(oid, isEqualTo(record::getOid))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_json_table_expr")
    default int updateByPrimaryKeySelective(MySqlJsonTableExpr record) {
        return update(c ->
            c.set(columns).equalToWhenPresent(record::getColumns)
            .set(exprOid).equalToWhenPresent(record::getExprOid)
            .set(pathOid).equalToWhenPresent(record::getPathOid)
            .where(oid, isEqualTo(record::getOid))
        );
    }
}