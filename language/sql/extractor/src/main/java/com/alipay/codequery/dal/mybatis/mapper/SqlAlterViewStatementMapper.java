package com.alipay.codequery.dal.mybatis.mapper;

import static com.alipay.codequery.dal.mybatis.mapper.SqlAlterViewStatementDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.alipay.codequery.dal.mybatis.domain.SqlAlterViewStatement;
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
public interface SqlAlterViewStatementMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_view_statement")
    BasicColumn[] selectList = BasicColumn.columnList(oid, algorithm, commentOid, definerOid, isForce, isIfNotExists, isWithCascaded, isWithCheckOption, isWithLocal, isWithReadOnly, nameOid, schema, sqlSecurity, subQueryOid, tableSourceOid);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_view_statement")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_view_statement")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_view_statement")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<SqlAlterViewStatement> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_view_statement")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<SqlAlterViewStatement> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_view_statement")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="algorithm", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="comment_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="definer_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_force", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_if_not_exists", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_with_cascaded", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_with_check_option", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_with_local", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_with_read_only", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="name_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="schema", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="sql_security", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="sub_query_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="table_source_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT)
    })
    Optional<SqlAlterViewStatement> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_view_statement")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="algorithm", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="comment_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="definer_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_force", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_if_not_exists", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_with_cascaded", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_with_check_option", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_with_local", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_with_read_only", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="name_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="schema", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="sql_security", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="sub_query_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="table_source_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT)
    })
    List<SqlAlterViewStatement> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_view_statement")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_view_statement")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, sqlAlterViewStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_view_statement")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, sqlAlterViewStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_view_statement")
    default int deleteByPrimaryKey(Long oid_) {
        return delete(c -> 
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_view_statement")
    default int insert(SqlAlterViewStatement record) {
        return MyBatis3Utils.insert(this::insert, record, sqlAlterViewStatement, c ->
            c.map(oid).toProperty("oid")
            .map(algorithm).toProperty("algorithm")
            .map(commentOid).toProperty("commentOid")
            .map(definerOid).toProperty("definerOid")
            .map(isForce).toProperty("isForce")
            .map(isIfNotExists).toProperty("isIfNotExists")
            .map(isWithCascaded).toProperty("isWithCascaded")
            .map(isWithCheckOption).toProperty("isWithCheckOption")
            .map(isWithLocal).toProperty("isWithLocal")
            .map(isWithReadOnly).toProperty("isWithReadOnly")
            .map(nameOid).toProperty("nameOid")
            .map(schema).toProperty("schema")
            .map(sqlSecurity).toProperty("sqlSecurity")
            .map(subQueryOid).toProperty("subQueryOid")
            .map(tableSourceOid).toProperty("tableSourceOid")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_view_statement")
    default int insertMultiple(Collection<SqlAlterViewStatement> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, sqlAlterViewStatement, c ->
            c.map(oid).toProperty("oid")
            .map(algorithm).toProperty("algorithm")
            .map(commentOid).toProperty("commentOid")
            .map(definerOid).toProperty("definerOid")
            .map(isForce).toProperty("isForce")
            .map(isIfNotExists).toProperty("isIfNotExists")
            .map(isWithCascaded).toProperty("isWithCascaded")
            .map(isWithCheckOption).toProperty("isWithCheckOption")
            .map(isWithLocal).toProperty("isWithLocal")
            .map(isWithReadOnly).toProperty("isWithReadOnly")
            .map(nameOid).toProperty("nameOid")
            .map(schema).toProperty("schema")
            .map(sqlSecurity).toProperty("sqlSecurity")
            .map(subQueryOid).toProperty("subQueryOid")
            .map(tableSourceOid).toProperty("tableSourceOid")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_view_statement")
    default int insertSelective(SqlAlterViewStatement record) {
        return MyBatis3Utils.insert(this::insert, record, sqlAlterViewStatement, c ->
            c.map(oid).toPropertyWhenPresent("oid", record::getOid)
            .map(algorithm).toPropertyWhenPresent("algorithm", record::getAlgorithm)
            .map(commentOid).toPropertyWhenPresent("commentOid", record::getCommentOid)
            .map(definerOid).toPropertyWhenPresent("definerOid", record::getDefinerOid)
            .map(isForce).toPropertyWhenPresent("isForce", record::getIsForce)
            .map(isIfNotExists).toPropertyWhenPresent("isIfNotExists", record::getIsIfNotExists)
            .map(isWithCascaded).toPropertyWhenPresent("isWithCascaded", record::getIsWithCascaded)
            .map(isWithCheckOption).toPropertyWhenPresent("isWithCheckOption", record::getIsWithCheckOption)
            .map(isWithLocal).toPropertyWhenPresent("isWithLocal", record::getIsWithLocal)
            .map(isWithReadOnly).toPropertyWhenPresent("isWithReadOnly", record::getIsWithReadOnly)
            .map(nameOid).toPropertyWhenPresent("nameOid", record::getNameOid)
            .map(schema).toPropertyWhenPresent("schema", record::getSchema)
            .map(sqlSecurity).toPropertyWhenPresent("sqlSecurity", record::getSqlSecurity)
            .map(subQueryOid).toPropertyWhenPresent("subQueryOid", record::getSubQueryOid)
            .map(tableSourceOid).toPropertyWhenPresent("tableSourceOid", record::getTableSourceOid)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_view_statement")
    default Optional<SqlAlterViewStatement> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, sqlAlterViewStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_view_statement")
    default List<SqlAlterViewStatement> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, sqlAlterViewStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_view_statement")
    default List<SqlAlterViewStatement> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, sqlAlterViewStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_view_statement")
    default Optional<SqlAlterViewStatement> selectByPrimaryKey(Long oid_) {
        return selectOne(c ->
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_view_statement")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, sqlAlterViewStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_view_statement")
    static UpdateDSL<UpdateModel> updateAllColumns(SqlAlterViewStatement record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalTo(record::getOid)
                .set(algorithm).equalTo(record::getAlgorithm)
                .set(commentOid).equalTo(record::getCommentOid)
                .set(definerOid).equalTo(record::getDefinerOid)
                .set(isForce).equalTo(record::getIsForce)
                .set(isIfNotExists).equalTo(record::getIsIfNotExists)
                .set(isWithCascaded).equalTo(record::getIsWithCascaded)
                .set(isWithCheckOption).equalTo(record::getIsWithCheckOption)
                .set(isWithLocal).equalTo(record::getIsWithLocal)
                .set(isWithReadOnly).equalTo(record::getIsWithReadOnly)
                .set(nameOid).equalTo(record::getNameOid)
                .set(schema).equalTo(record::getSchema)
                .set(sqlSecurity).equalTo(record::getSqlSecurity)
                .set(subQueryOid).equalTo(record::getSubQueryOid)
                .set(tableSourceOid).equalTo(record::getTableSourceOid);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_view_statement")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(SqlAlterViewStatement record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalToWhenPresent(record::getOid)
                .set(algorithm).equalToWhenPresent(record::getAlgorithm)
                .set(commentOid).equalToWhenPresent(record::getCommentOid)
                .set(definerOid).equalToWhenPresent(record::getDefinerOid)
                .set(isForce).equalToWhenPresent(record::getIsForce)
                .set(isIfNotExists).equalToWhenPresent(record::getIsIfNotExists)
                .set(isWithCascaded).equalToWhenPresent(record::getIsWithCascaded)
                .set(isWithCheckOption).equalToWhenPresent(record::getIsWithCheckOption)
                .set(isWithLocal).equalToWhenPresent(record::getIsWithLocal)
                .set(isWithReadOnly).equalToWhenPresent(record::getIsWithReadOnly)
                .set(nameOid).equalToWhenPresent(record::getNameOid)
                .set(schema).equalToWhenPresent(record::getSchema)
                .set(sqlSecurity).equalToWhenPresent(record::getSqlSecurity)
                .set(subQueryOid).equalToWhenPresent(record::getSubQueryOid)
                .set(tableSourceOid).equalToWhenPresent(record::getTableSourceOid);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_view_statement")
    default int updateByPrimaryKey(SqlAlterViewStatement record) {
        return update(c ->
            c.set(algorithm).equalTo(record::getAlgorithm)
            .set(commentOid).equalTo(record::getCommentOid)
            .set(definerOid).equalTo(record::getDefinerOid)
            .set(isForce).equalTo(record::getIsForce)
            .set(isIfNotExists).equalTo(record::getIsIfNotExists)
            .set(isWithCascaded).equalTo(record::getIsWithCascaded)
            .set(isWithCheckOption).equalTo(record::getIsWithCheckOption)
            .set(isWithLocal).equalTo(record::getIsWithLocal)
            .set(isWithReadOnly).equalTo(record::getIsWithReadOnly)
            .set(nameOid).equalTo(record::getNameOid)
            .set(schema).equalTo(record::getSchema)
            .set(sqlSecurity).equalTo(record::getSqlSecurity)
            .set(subQueryOid).equalTo(record::getSubQueryOid)
            .set(tableSourceOid).equalTo(record::getTableSourceOid)
            .where(oid, isEqualTo(record::getOid))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_view_statement")
    default int updateByPrimaryKeySelective(SqlAlterViewStatement record) {
        return update(c ->
            c.set(algorithm).equalToWhenPresent(record::getAlgorithm)
            .set(commentOid).equalToWhenPresent(record::getCommentOid)
            .set(definerOid).equalToWhenPresent(record::getDefinerOid)
            .set(isForce).equalToWhenPresent(record::getIsForce)
            .set(isIfNotExists).equalToWhenPresent(record::getIsIfNotExists)
            .set(isWithCascaded).equalToWhenPresent(record::getIsWithCascaded)
            .set(isWithCheckOption).equalToWhenPresent(record::getIsWithCheckOption)
            .set(isWithLocal).equalToWhenPresent(record::getIsWithLocal)
            .set(isWithReadOnly).equalToWhenPresent(record::getIsWithReadOnly)
            .set(nameOid).equalToWhenPresent(record::getNameOid)
            .set(schema).equalToWhenPresent(record::getSchema)
            .set(sqlSecurity).equalToWhenPresent(record::getSqlSecurity)
            .set(subQueryOid).equalToWhenPresent(record::getSubQueryOid)
            .set(tableSourceOid).equalToWhenPresent(record::getTableSourceOid)
            .where(oid, isEqualTo(record::getOid))
        );
    }
}