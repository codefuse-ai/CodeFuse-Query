package com.alipay.codequery.dal.mybatis.mapper;

import static com.alipay.codequery.dal.mybatis.mapper.SqlBlockStatementDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.alipay.codequery.dal.mybatis.domain.SqlBlockStatement;
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
public interface SqlBlockStatementMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_block_statement")
    BasicColumn[] selectList = BasicColumn.columnList(oid, endLabel, exceptionOid, isEndOfCommit, labelName);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_block_statement")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_block_statement")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_block_statement")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<SqlBlockStatement> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_block_statement")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<SqlBlockStatement> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_block_statement")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="end_label", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="exception_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_end_of_commit", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="label_name", javaType=String.class, jdbcType=JdbcType.VARCHAR)
    })
    Optional<SqlBlockStatement> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_block_statement")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="end_label", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="exception_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_end_of_commit", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="label_name", javaType=String.class, jdbcType=JdbcType.VARCHAR)
    })
    List<SqlBlockStatement> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_block_statement")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_block_statement")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, sqlBlockStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_block_statement")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, sqlBlockStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_block_statement")
    default int deleteByPrimaryKey(Long oid_) {
        return delete(c -> 
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_block_statement")
    default int insert(SqlBlockStatement record) {
        return MyBatis3Utils.insert(this::insert, record, sqlBlockStatement, c ->
            c.map(oid).toProperty("oid")
            .map(endLabel).toProperty("endLabel")
            .map(exceptionOid).toProperty("exceptionOid")
            .map(isEndOfCommit).toProperty("isEndOfCommit")
            .map(labelName).toProperty("labelName")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_block_statement")
    default int insertMultiple(Collection<SqlBlockStatement> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, sqlBlockStatement, c ->
            c.map(oid).toProperty("oid")
            .map(endLabel).toProperty("endLabel")
            .map(exceptionOid).toProperty("exceptionOid")
            .map(isEndOfCommit).toProperty("isEndOfCommit")
            .map(labelName).toProperty("labelName")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_block_statement")
    default int insertSelective(SqlBlockStatement record) {
        return MyBatis3Utils.insert(this::insert, record, sqlBlockStatement, c ->
            c.map(oid).toPropertyWhenPresent("oid", record::getOid)
            .map(endLabel).toPropertyWhenPresent("endLabel", record::getEndLabel)
            .map(exceptionOid).toPropertyWhenPresent("exceptionOid", record::getExceptionOid)
            .map(isEndOfCommit).toPropertyWhenPresent("isEndOfCommit", record::getIsEndOfCommit)
            .map(labelName).toPropertyWhenPresent("labelName", record::getLabelName)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_block_statement")
    default Optional<SqlBlockStatement> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, sqlBlockStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_block_statement")
    default List<SqlBlockStatement> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, sqlBlockStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_block_statement")
    default List<SqlBlockStatement> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, sqlBlockStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_block_statement")
    default Optional<SqlBlockStatement> selectByPrimaryKey(Long oid_) {
        return selectOne(c ->
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_block_statement")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, sqlBlockStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_block_statement")
    static UpdateDSL<UpdateModel> updateAllColumns(SqlBlockStatement record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalTo(record::getOid)
                .set(endLabel).equalTo(record::getEndLabel)
                .set(exceptionOid).equalTo(record::getExceptionOid)
                .set(isEndOfCommit).equalTo(record::getIsEndOfCommit)
                .set(labelName).equalTo(record::getLabelName);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_block_statement")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(SqlBlockStatement record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalToWhenPresent(record::getOid)
                .set(endLabel).equalToWhenPresent(record::getEndLabel)
                .set(exceptionOid).equalToWhenPresent(record::getExceptionOid)
                .set(isEndOfCommit).equalToWhenPresent(record::getIsEndOfCommit)
                .set(labelName).equalToWhenPresent(record::getLabelName);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_block_statement")
    default int updateByPrimaryKey(SqlBlockStatement record) {
        return update(c ->
            c.set(endLabel).equalTo(record::getEndLabel)
            .set(exceptionOid).equalTo(record::getExceptionOid)
            .set(isEndOfCommit).equalTo(record::getIsEndOfCommit)
            .set(labelName).equalTo(record::getLabelName)
            .where(oid, isEqualTo(record::getOid))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_block_statement")
    default int updateByPrimaryKeySelective(SqlBlockStatement record) {
        return update(c ->
            c.set(endLabel).equalToWhenPresent(record::getEndLabel)
            .set(exceptionOid).equalToWhenPresent(record::getExceptionOid)
            .set(isEndOfCommit).equalToWhenPresent(record::getIsEndOfCommit)
            .set(labelName).equalToWhenPresent(record::getLabelName)
            .where(oid, isEqualTo(record::getOid))
        );
    }
}