package com.alipay.codequery.dal.mybatis.mapper;

import static com.alipay.codequery.dal.mybatis.mapper.SqlDefaultDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.alipay.codequery.dal.mybatis.domain.SqlDefault;
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
public interface SqlDefaultMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_default")
    BasicColumn[] selectList = BasicColumn.columnList(oid, columnOid, exprOid, isWithValues);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_default")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_default")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_default")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<SqlDefault> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_default")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<SqlDefault> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_default")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="column_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="expr_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_with_values", javaType=Integer.class, jdbcType=JdbcType.BIGINT)
    })
    Optional<SqlDefault> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_default")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="column_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="expr_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_with_values", javaType=Integer.class, jdbcType=JdbcType.BIGINT)
    })
    List<SqlDefault> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_default")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_default")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, sqlDefault, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_default")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, sqlDefault, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_default")
    default int deleteByPrimaryKey(Long oid_) {
        return delete(c -> 
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_default")
    default int insert(SqlDefault record) {
        return MyBatis3Utils.insert(this::insert, record, sqlDefault, c ->
            c.map(oid).toProperty("oid")
            .map(columnOid).toProperty("columnOid")
            .map(exprOid).toProperty("exprOid")
            .map(isWithValues).toProperty("isWithValues")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_default")
    default int insertMultiple(Collection<SqlDefault> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, sqlDefault, c ->
            c.map(oid).toProperty("oid")
            .map(columnOid).toProperty("columnOid")
            .map(exprOid).toProperty("exprOid")
            .map(isWithValues).toProperty("isWithValues")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_default")
    default int insertSelective(SqlDefault record) {
        return MyBatis3Utils.insert(this::insert, record, sqlDefault, c ->
            c.map(oid).toPropertyWhenPresent("oid", record::getOid)
            .map(columnOid).toPropertyWhenPresent("columnOid", record::getColumnOid)
            .map(exprOid).toPropertyWhenPresent("exprOid", record::getExprOid)
            .map(isWithValues).toPropertyWhenPresent("isWithValues", record::getIsWithValues)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_default")
    default Optional<SqlDefault> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, sqlDefault, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_default")
    default List<SqlDefault> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, sqlDefault, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_default")
    default List<SqlDefault> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, sqlDefault, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_default")
    default Optional<SqlDefault> selectByPrimaryKey(Long oid_) {
        return selectOne(c ->
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_default")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, sqlDefault, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_default")
    static UpdateDSL<UpdateModel> updateAllColumns(SqlDefault record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalTo(record::getOid)
                .set(columnOid).equalTo(record::getColumnOid)
                .set(exprOid).equalTo(record::getExprOid)
                .set(isWithValues).equalTo(record::getIsWithValues);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_default")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(SqlDefault record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalToWhenPresent(record::getOid)
                .set(columnOid).equalToWhenPresent(record::getColumnOid)
                .set(exprOid).equalToWhenPresent(record::getExprOid)
                .set(isWithValues).equalToWhenPresent(record::getIsWithValues);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_default")
    default int updateByPrimaryKey(SqlDefault record) {
        return update(c ->
            c.set(columnOid).equalTo(record::getColumnOid)
            .set(exprOid).equalTo(record::getExprOid)
            .set(isWithValues).equalTo(record::getIsWithValues)
            .where(oid, isEqualTo(record::getOid))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_default")
    default int updateByPrimaryKeySelective(SqlDefault record) {
        return update(c ->
            c.set(columnOid).equalToWhenPresent(record::getColumnOid)
            .set(exprOid).equalToWhenPresent(record::getExprOid)
            .set(isWithValues).equalToWhenPresent(record::getIsWithValues)
            .where(oid, isEqualTo(record::getOid))
        );
    }
}