package com.alipay.codequery.dal.mybatis.mapper;

import static com.alipay.codequery.dal.mybatis.mapper.SqlReplaceStatementDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.alipay.codequery.dal.mybatis.domain.SqlReplaceStatement;
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
public interface SqlReplaceStatementMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_replace_statement")
    BasicColumn[] selectList = BasicColumn.columnList(oid, hintsSize, isDelayed, isLowPriority, queryOid, tableNameOid, tableSourceOid, valuesList);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_replace_statement")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_replace_statement")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_replace_statement")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<SqlReplaceStatement> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_replace_statement")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<SqlReplaceStatement> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_replace_statement")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="hints_size", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_delayed", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_low_priority", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="query_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="table_name_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="table_source_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="values_list", javaType=String.class, jdbcType=JdbcType.VARCHAR)
    })
    Optional<SqlReplaceStatement> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_replace_statement")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="hints_size", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_delayed", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_low_priority", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="query_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="table_name_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="table_source_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="values_list", javaType=String.class, jdbcType=JdbcType.VARCHAR)
    })
    List<SqlReplaceStatement> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_replace_statement")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_replace_statement")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, sqlReplaceStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_replace_statement")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, sqlReplaceStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_replace_statement")
    default int deleteByPrimaryKey(Long oid_) {
        return delete(c -> 
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_replace_statement")
    default int insert(SqlReplaceStatement record) {
        return MyBatis3Utils.insert(this::insert, record, sqlReplaceStatement, c ->
            c.map(oid).toProperty("oid")
            .map(hintsSize).toProperty("hintsSize")
            .map(isDelayed).toProperty("isDelayed")
            .map(isLowPriority).toProperty("isLowPriority")
            .map(queryOid).toProperty("queryOid")
            .map(tableNameOid).toProperty("tableNameOid")
            .map(tableSourceOid).toProperty("tableSourceOid")
            .map(valuesList).toProperty("valuesList")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_replace_statement")
    default int insertMultiple(Collection<SqlReplaceStatement> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, sqlReplaceStatement, c ->
            c.map(oid).toProperty("oid")
            .map(hintsSize).toProperty("hintsSize")
            .map(isDelayed).toProperty("isDelayed")
            .map(isLowPriority).toProperty("isLowPriority")
            .map(queryOid).toProperty("queryOid")
            .map(tableNameOid).toProperty("tableNameOid")
            .map(tableSourceOid).toProperty("tableSourceOid")
            .map(valuesList).toProperty("valuesList")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_replace_statement")
    default int insertSelective(SqlReplaceStatement record) {
        return MyBatis3Utils.insert(this::insert, record, sqlReplaceStatement, c ->
            c.map(oid).toPropertyWhenPresent("oid", record::getOid)
            .map(hintsSize).toPropertyWhenPresent("hintsSize", record::getHintsSize)
            .map(isDelayed).toPropertyWhenPresent("isDelayed", record::getIsDelayed)
            .map(isLowPriority).toPropertyWhenPresent("isLowPriority", record::getIsLowPriority)
            .map(queryOid).toPropertyWhenPresent("queryOid", record::getQueryOid)
            .map(tableNameOid).toPropertyWhenPresent("tableNameOid", record::getTableNameOid)
            .map(tableSourceOid).toPropertyWhenPresent("tableSourceOid", record::getTableSourceOid)
            .map(valuesList).toPropertyWhenPresent("valuesList", record::getValuesList)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_replace_statement")
    default Optional<SqlReplaceStatement> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, sqlReplaceStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_replace_statement")
    default List<SqlReplaceStatement> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, sqlReplaceStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_replace_statement")
    default List<SqlReplaceStatement> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, sqlReplaceStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_replace_statement")
    default Optional<SqlReplaceStatement> selectByPrimaryKey(Long oid_) {
        return selectOne(c ->
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_replace_statement")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, sqlReplaceStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_replace_statement")
    static UpdateDSL<UpdateModel> updateAllColumns(SqlReplaceStatement record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalTo(record::getOid)
                .set(hintsSize).equalTo(record::getHintsSize)
                .set(isDelayed).equalTo(record::getIsDelayed)
                .set(isLowPriority).equalTo(record::getIsLowPriority)
                .set(queryOid).equalTo(record::getQueryOid)
                .set(tableNameOid).equalTo(record::getTableNameOid)
                .set(tableSourceOid).equalTo(record::getTableSourceOid)
                .set(valuesList).equalTo(record::getValuesList);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_replace_statement")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(SqlReplaceStatement record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalToWhenPresent(record::getOid)
                .set(hintsSize).equalToWhenPresent(record::getHintsSize)
                .set(isDelayed).equalToWhenPresent(record::getIsDelayed)
                .set(isLowPriority).equalToWhenPresent(record::getIsLowPriority)
                .set(queryOid).equalToWhenPresent(record::getQueryOid)
                .set(tableNameOid).equalToWhenPresent(record::getTableNameOid)
                .set(tableSourceOid).equalToWhenPresent(record::getTableSourceOid)
                .set(valuesList).equalToWhenPresent(record::getValuesList);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_replace_statement")
    default int updateByPrimaryKey(SqlReplaceStatement record) {
        return update(c ->
            c.set(hintsSize).equalTo(record::getHintsSize)
            .set(isDelayed).equalTo(record::getIsDelayed)
            .set(isLowPriority).equalTo(record::getIsLowPriority)
            .set(queryOid).equalTo(record::getQueryOid)
            .set(tableNameOid).equalTo(record::getTableNameOid)
            .set(tableSourceOid).equalTo(record::getTableSourceOid)
            .set(valuesList).equalTo(record::getValuesList)
            .where(oid, isEqualTo(record::getOid))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_replace_statement")
    default int updateByPrimaryKeySelective(SqlReplaceStatement record) {
        return update(c ->
            c.set(hintsSize).equalToWhenPresent(record::getHintsSize)
            .set(isDelayed).equalToWhenPresent(record::getIsDelayed)
            .set(isLowPriority).equalToWhenPresent(record::getIsLowPriority)
            .set(queryOid).equalToWhenPresent(record::getQueryOid)
            .set(tableNameOid).equalToWhenPresent(record::getTableNameOid)
            .set(tableSourceOid).equalToWhenPresent(record::getTableSourceOid)
            .set(valuesList).equalToWhenPresent(record::getValuesList)
            .where(oid, isEqualTo(record::getOid))
        );
    }
}