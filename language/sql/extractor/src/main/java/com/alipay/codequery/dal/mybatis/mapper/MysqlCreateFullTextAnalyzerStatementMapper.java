package com.alipay.codequery.dal.mybatis.mapper;

import static com.alipay.codequery.dal.mybatis.mapper.MysqlCreateFullTextAnalyzerStatementDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.alipay.codequery.dal.mybatis.domain.MysqlCreateFullTextAnalyzerStatement;
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
public interface MysqlCreateFullTextAnalyzerStatementMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: mysql_create_full_text_analyzer_statement")
    BasicColumn[] selectList = BasicColumn.columnList(oid, charfilters, nameOid, tokenizer, tokenizers);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: mysql_create_full_text_analyzer_statement")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: mysql_create_full_text_analyzer_statement")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: mysql_create_full_text_analyzer_statement")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<MysqlCreateFullTextAnalyzerStatement> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: mysql_create_full_text_analyzer_statement")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<MysqlCreateFullTextAnalyzerStatement> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: mysql_create_full_text_analyzer_statement")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="charfilters", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="name_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="tokenizer", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="tokenizers", javaType=String.class, jdbcType=JdbcType.VARCHAR)
    })
    Optional<MysqlCreateFullTextAnalyzerStatement> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: mysql_create_full_text_analyzer_statement")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="charfilters", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="name_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="tokenizer", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="tokenizers", javaType=String.class, jdbcType=JdbcType.VARCHAR)
    })
    List<MysqlCreateFullTextAnalyzerStatement> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: mysql_create_full_text_analyzer_statement")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: mysql_create_full_text_analyzer_statement")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, mysqlCreateFullTextAnalyzerStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: mysql_create_full_text_analyzer_statement")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, mysqlCreateFullTextAnalyzerStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: mysql_create_full_text_analyzer_statement")
    default int deleteByPrimaryKey(Long oid_) {
        return delete(c -> 
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: mysql_create_full_text_analyzer_statement")
    default int insert(MysqlCreateFullTextAnalyzerStatement record) {
        return MyBatis3Utils.insert(this::insert, record, mysqlCreateFullTextAnalyzerStatement, c ->
            c.map(oid).toProperty("oid")
            .map(charfilters).toProperty("charfilters")
            .map(nameOid).toProperty("nameOid")
            .map(tokenizer).toProperty("tokenizer")
            .map(tokenizers).toProperty("tokenizers")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: mysql_create_full_text_analyzer_statement")
    default int insertMultiple(Collection<MysqlCreateFullTextAnalyzerStatement> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, mysqlCreateFullTextAnalyzerStatement, c ->
            c.map(oid).toProperty("oid")
            .map(charfilters).toProperty("charfilters")
            .map(nameOid).toProperty("nameOid")
            .map(tokenizer).toProperty("tokenizer")
            .map(tokenizers).toProperty("tokenizers")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: mysql_create_full_text_analyzer_statement")
    default int insertSelective(MysqlCreateFullTextAnalyzerStatement record) {
        return MyBatis3Utils.insert(this::insert, record, mysqlCreateFullTextAnalyzerStatement, c ->
            c.map(oid).toPropertyWhenPresent("oid", record::getOid)
            .map(charfilters).toPropertyWhenPresent("charfilters", record::getCharfilters)
            .map(nameOid).toPropertyWhenPresent("nameOid", record::getNameOid)
            .map(tokenizer).toPropertyWhenPresent("tokenizer", record::getTokenizer)
            .map(tokenizers).toPropertyWhenPresent("tokenizers", record::getTokenizers)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: mysql_create_full_text_analyzer_statement")
    default Optional<MysqlCreateFullTextAnalyzerStatement> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, mysqlCreateFullTextAnalyzerStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: mysql_create_full_text_analyzer_statement")
    default List<MysqlCreateFullTextAnalyzerStatement> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, mysqlCreateFullTextAnalyzerStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: mysql_create_full_text_analyzer_statement")
    default List<MysqlCreateFullTextAnalyzerStatement> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, mysqlCreateFullTextAnalyzerStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: mysql_create_full_text_analyzer_statement")
    default Optional<MysqlCreateFullTextAnalyzerStatement> selectByPrimaryKey(Long oid_) {
        return selectOne(c ->
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: mysql_create_full_text_analyzer_statement")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, mysqlCreateFullTextAnalyzerStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: mysql_create_full_text_analyzer_statement")
    static UpdateDSL<UpdateModel> updateAllColumns(MysqlCreateFullTextAnalyzerStatement record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalTo(record::getOid)
                .set(charfilters).equalTo(record::getCharfilters)
                .set(nameOid).equalTo(record::getNameOid)
                .set(tokenizer).equalTo(record::getTokenizer)
                .set(tokenizers).equalTo(record::getTokenizers);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: mysql_create_full_text_analyzer_statement")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(MysqlCreateFullTextAnalyzerStatement record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalToWhenPresent(record::getOid)
                .set(charfilters).equalToWhenPresent(record::getCharfilters)
                .set(nameOid).equalToWhenPresent(record::getNameOid)
                .set(tokenizer).equalToWhenPresent(record::getTokenizer)
                .set(tokenizers).equalToWhenPresent(record::getTokenizers);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: mysql_create_full_text_analyzer_statement")
    default int updateByPrimaryKey(MysqlCreateFullTextAnalyzerStatement record) {
        return update(c ->
            c.set(charfilters).equalTo(record::getCharfilters)
            .set(nameOid).equalTo(record::getNameOid)
            .set(tokenizer).equalTo(record::getTokenizer)
            .set(tokenizers).equalTo(record::getTokenizers)
            .where(oid, isEqualTo(record::getOid))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: mysql_create_full_text_analyzer_statement")
    default int updateByPrimaryKeySelective(MysqlCreateFullTextAnalyzerStatement record) {
        return update(c ->
            c.set(charfilters).equalToWhenPresent(record::getCharfilters)
            .set(nameOid).equalToWhenPresent(record::getNameOid)
            .set(tokenizer).equalToWhenPresent(record::getTokenizer)
            .set(tokenizers).equalToWhenPresent(record::getTokenizers)
            .where(oid, isEqualTo(record::getOid))
        );
    }
}