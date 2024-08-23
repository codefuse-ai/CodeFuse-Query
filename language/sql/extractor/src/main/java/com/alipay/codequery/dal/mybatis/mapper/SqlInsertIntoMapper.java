package com.alipay.codequery.dal.mybatis.mapper;

import static com.alipay.codequery.dal.mybatis.mapper.SqlInsertIntoDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.alipay.codequery.dal.mybatis.domain.SqlInsertInto;
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
public interface SqlInsertIntoMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_insert_into")
    BasicColumn[] selectList = BasicColumn.columnList(oid, alias, columnsString, columnsStringHash, hintOid, insertBeforeCommentsDirect, isOverwrite, queryOid, tableNameOid, tableSourceOid, values, valuesList);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_insert_into")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_insert_into")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_insert_into")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<SqlInsertInto> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_insert_into")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<SqlInsertInto> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_insert_into")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="alias", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="columns_string", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="columns_string_hash", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="hint_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="insert_before_comments_direct", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="is_overwrite", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="query_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="table_name_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="table_source_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="values", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="values_list", javaType=String.class, jdbcType=JdbcType.VARCHAR)
    })
    Optional<SqlInsertInto> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_insert_into")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="alias", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="columns_string", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="columns_string_hash", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="hint_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="insert_before_comments_direct", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="is_overwrite", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="query_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="table_name_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="table_source_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="values", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="values_list", javaType=String.class, jdbcType=JdbcType.VARCHAR)
    })
    List<SqlInsertInto> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_insert_into")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_insert_into")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, sqlInsertInto, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_insert_into")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, sqlInsertInto, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_insert_into")
    default int deleteByPrimaryKey(Long oid_) {
        return delete(c -> 
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_insert_into")
    default int insert(SqlInsertInto record) {
        return MyBatis3Utils.insert(this::insert, record, sqlInsertInto, c ->
            c.map(oid).toProperty("oid")
            .map(alias).toProperty("alias")
            .map(columnsString).toProperty("columnsString")
            .map(columnsStringHash).toProperty("columnsStringHash")
            .map(hintOid).toProperty("hintOid")
            .map(insertBeforeCommentsDirect).toProperty("insertBeforeCommentsDirect")
            .map(isOverwrite).toProperty("isOverwrite")
            .map(queryOid).toProperty("queryOid")
            .map(tableNameOid).toProperty("tableNameOid")
            .map(tableSourceOid).toProperty("tableSourceOid")
            .map(values).toProperty("values")
            .map(valuesList).toProperty("valuesList")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_insert_into")
    default int insertMultiple(Collection<SqlInsertInto> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, sqlInsertInto, c ->
            c.map(oid).toProperty("oid")
            .map(alias).toProperty("alias")
            .map(columnsString).toProperty("columnsString")
            .map(columnsStringHash).toProperty("columnsStringHash")
            .map(hintOid).toProperty("hintOid")
            .map(insertBeforeCommentsDirect).toProperty("insertBeforeCommentsDirect")
            .map(isOverwrite).toProperty("isOverwrite")
            .map(queryOid).toProperty("queryOid")
            .map(tableNameOid).toProperty("tableNameOid")
            .map(tableSourceOid).toProperty("tableSourceOid")
            .map(values).toProperty("values")
            .map(valuesList).toProperty("valuesList")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_insert_into")
    default int insertSelective(SqlInsertInto record) {
        return MyBatis3Utils.insert(this::insert, record, sqlInsertInto, c ->
            c.map(oid).toPropertyWhenPresent("oid", record::getOid)
            .map(alias).toPropertyWhenPresent("alias", record::getAlias)
            .map(columnsString).toPropertyWhenPresent("columnsString", record::getColumnsString)
            .map(columnsStringHash).toPropertyWhenPresent("columnsStringHash", record::getColumnsStringHash)
            .map(hintOid).toPropertyWhenPresent("hintOid", record::getHintOid)
            .map(insertBeforeCommentsDirect).toPropertyWhenPresent("insertBeforeCommentsDirect", record::getInsertBeforeCommentsDirect)
            .map(isOverwrite).toPropertyWhenPresent("isOverwrite", record::getIsOverwrite)
            .map(queryOid).toPropertyWhenPresent("queryOid", record::getQueryOid)
            .map(tableNameOid).toPropertyWhenPresent("tableNameOid", record::getTableNameOid)
            .map(tableSourceOid).toPropertyWhenPresent("tableSourceOid", record::getTableSourceOid)
            .map(values).toPropertyWhenPresent("values", record::getValues)
            .map(valuesList).toPropertyWhenPresent("valuesList", record::getValuesList)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_insert_into")
    default Optional<SqlInsertInto> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, sqlInsertInto, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_insert_into")
    default List<SqlInsertInto> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, sqlInsertInto, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_insert_into")
    default List<SqlInsertInto> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, sqlInsertInto, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_insert_into")
    default Optional<SqlInsertInto> selectByPrimaryKey(Long oid_) {
        return selectOne(c ->
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_insert_into")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, sqlInsertInto, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_insert_into")
    static UpdateDSL<UpdateModel> updateAllColumns(SqlInsertInto record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalTo(record::getOid)
                .set(alias).equalTo(record::getAlias)
                .set(columnsString).equalTo(record::getColumnsString)
                .set(columnsStringHash).equalTo(record::getColumnsStringHash)
                .set(hintOid).equalTo(record::getHintOid)
                .set(insertBeforeCommentsDirect).equalTo(record::getInsertBeforeCommentsDirect)
                .set(isOverwrite).equalTo(record::getIsOverwrite)
                .set(queryOid).equalTo(record::getQueryOid)
                .set(tableNameOid).equalTo(record::getTableNameOid)
                .set(tableSourceOid).equalTo(record::getTableSourceOid)
                .set(values).equalTo(record::getValues)
                .set(valuesList).equalTo(record::getValuesList);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_insert_into")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(SqlInsertInto record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalToWhenPresent(record::getOid)
                .set(alias).equalToWhenPresent(record::getAlias)
                .set(columnsString).equalToWhenPresent(record::getColumnsString)
                .set(columnsStringHash).equalToWhenPresent(record::getColumnsStringHash)
                .set(hintOid).equalToWhenPresent(record::getHintOid)
                .set(insertBeforeCommentsDirect).equalToWhenPresent(record::getInsertBeforeCommentsDirect)
                .set(isOverwrite).equalToWhenPresent(record::getIsOverwrite)
                .set(queryOid).equalToWhenPresent(record::getQueryOid)
                .set(tableNameOid).equalToWhenPresent(record::getTableNameOid)
                .set(tableSourceOid).equalToWhenPresent(record::getTableSourceOid)
                .set(values).equalToWhenPresent(record::getValues)
                .set(valuesList).equalToWhenPresent(record::getValuesList);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_insert_into")
    default int updateByPrimaryKey(SqlInsertInto record) {
        return update(c ->
            c.set(alias).equalTo(record::getAlias)
            .set(columnsString).equalTo(record::getColumnsString)
            .set(columnsStringHash).equalTo(record::getColumnsStringHash)
            .set(hintOid).equalTo(record::getHintOid)
            .set(insertBeforeCommentsDirect).equalTo(record::getInsertBeforeCommentsDirect)
            .set(isOverwrite).equalTo(record::getIsOverwrite)
            .set(queryOid).equalTo(record::getQueryOid)
            .set(tableNameOid).equalTo(record::getTableNameOid)
            .set(tableSourceOid).equalTo(record::getTableSourceOid)
            .set(values).equalTo(record::getValues)
            .set(valuesList).equalTo(record::getValuesList)
            .where(oid, isEqualTo(record::getOid))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_insert_into")
    default int updateByPrimaryKeySelective(SqlInsertInto record) {
        return update(c ->
            c.set(alias).equalToWhenPresent(record::getAlias)
            .set(columnsString).equalToWhenPresent(record::getColumnsString)
            .set(columnsStringHash).equalToWhenPresent(record::getColumnsStringHash)
            .set(hintOid).equalToWhenPresent(record::getHintOid)
            .set(insertBeforeCommentsDirect).equalToWhenPresent(record::getInsertBeforeCommentsDirect)
            .set(isOverwrite).equalToWhenPresent(record::getIsOverwrite)
            .set(queryOid).equalToWhenPresent(record::getQueryOid)
            .set(tableNameOid).equalToWhenPresent(record::getTableNameOid)
            .set(tableSourceOid).equalToWhenPresent(record::getTableSourceOid)
            .set(values).equalToWhenPresent(record::getValues)
            .set(valuesList).equalToWhenPresent(record::getValuesList)
            .where(oid, isEqualTo(record::getOid))
        );
    }
}