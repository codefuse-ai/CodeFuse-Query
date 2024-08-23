package com.alipay.codequery.dal.mybatis.mapper;

import static com.alipay.codequery.dal.mybatis.mapper.SqlLateralViewTableSourceDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.alipay.codequery.dal.mybatis.domain.SqlLateralViewTableSource;
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
public interface SqlLateralViewTableSourceMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_lateral_view_table_source")
    BasicColumn[] selectList = BasicColumn.columnList(oid, isOuter, methodOid, onOid, tableSourceOid);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_lateral_view_table_source")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_lateral_view_table_source")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_lateral_view_table_source")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<SqlLateralViewTableSource> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_lateral_view_table_source")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<SqlLateralViewTableSource> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_lateral_view_table_source")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="is_outer", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="method_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="on_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="table_source_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT)
    })
    Optional<SqlLateralViewTableSource> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_lateral_view_table_source")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="is_outer", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="method_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="on_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="table_source_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT)
    })
    List<SqlLateralViewTableSource> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_lateral_view_table_source")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_lateral_view_table_source")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, sqlLateralViewTableSource, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_lateral_view_table_source")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, sqlLateralViewTableSource, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_lateral_view_table_source")
    default int deleteByPrimaryKey(Long oid_) {
        return delete(c -> 
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_lateral_view_table_source")
    default int insert(SqlLateralViewTableSource record) {
        return MyBatis3Utils.insert(this::insert, record, sqlLateralViewTableSource, c ->
            c.map(oid).toProperty("oid")
            .map(isOuter).toProperty("isOuter")
            .map(methodOid).toProperty("methodOid")
            .map(onOid).toProperty("onOid")
            .map(tableSourceOid).toProperty("tableSourceOid")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_lateral_view_table_source")
    default int insertMultiple(Collection<SqlLateralViewTableSource> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, sqlLateralViewTableSource, c ->
            c.map(oid).toProperty("oid")
            .map(isOuter).toProperty("isOuter")
            .map(methodOid).toProperty("methodOid")
            .map(onOid).toProperty("onOid")
            .map(tableSourceOid).toProperty("tableSourceOid")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_lateral_view_table_source")
    default int insertSelective(SqlLateralViewTableSource record) {
        return MyBatis3Utils.insert(this::insert, record, sqlLateralViewTableSource, c ->
            c.map(oid).toPropertyWhenPresent("oid", record::getOid)
            .map(isOuter).toPropertyWhenPresent("isOuter", record::getIsOuter)
            .map(methodOid).toPropertyWhenPresent("methodOid", record::getMethodOid)
            .map(onOid).toPropertyWhenPresent("onOid", record::getOnOid)
            .map(tableSourceOid).toPropertyWhenPresent("tableSourceOid", record::getTableSourceOid)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_lateral_view_table_source")
    default Optional<SqlLateralViewTableSource> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, sqlLateralViewTableSource, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_lateral_view_table_source")
    default List<SqlLateralViewTableSource> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, sqlLateralViewTableSource, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_lateral_view_table_source")
    default List<SqlLateralViewTableSource> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, sqlLateralViewTableSource, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_lateral_view_table_source")
    default Optional<SqlLateralViewTableSource> selectByPrimaryKey(Long oid_) {
        return selectOne(c ->
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_lateral_view_table_source")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, sqlLateralViewTableSource, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_lateral_view_table_source")
    static UpdateDSL<UpdateModel> updateAllColumns(SqlLateralViewTableSource record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalTo(record::getOid)
                .set(isOuter).equalTo(record::getIsOuter)
                .set(methodOid).equalTo(record::getMethodOid)
                .set(onOid).equalTo(record::getOnOid)
                .set(tableSourceOid).equalTo(record::getTableSourceOid);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_lateral_view_table_source")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(SqlLateralViewTableSource record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalToWhenPresent(record::getOid)
                .set(isOuter).equalToWhenPresent(record::getIsOuter)
                .set(methodOid).equalToWhenPresent(record::getMethodOid)
                .set(onOid).equalToWhenPresent(record::getOnOid)
                .set(tableSourceOid).equalToWhenPresent(record::getTableSourceOid);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_lateral_view_table_source")
    default int updateByPrimaryKey(SqlLateralViewTableSource record) {
        return update(c ->
            c.set(isOuter).equalTo(record::getIsOuter)
            .set(methodOid).equalTo(record::getMethodOid)
            .set(onOid).equalTo(record::getOnOid)
            .set(tableSourceOid).equalTo(record::getTableSourceOid)
            .where(oid, isEqualTo(record::getOid))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_lateral_view_table_source")
    default int updateByPrimaryKeySelective(SqlLateralViewTableSource record) {
        return update(c ->
            c.set(isOuter).equalToWhenPresent(record::getIsOuter)
            .set(methodOid).equalToWhenPresent(record::getMethodOid)
            .set(onOid).equalToWhenPresent(record::getOnOid)
            .set(tableSourceOid).equalToWhenPresent(record::getTableSourceOid)
            .where(oid, isEqualTo(record::getOid))
        );
    }
}