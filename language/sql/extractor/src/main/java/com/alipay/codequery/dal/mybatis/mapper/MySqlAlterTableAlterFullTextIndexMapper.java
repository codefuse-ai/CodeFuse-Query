package com.alipay.codequery.dal.mybatis.mapper;

import static com.alipay.codequery.dal.mybatis.mapper.MySqlAlterTableAlterFullTextIndexDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.alipay.codequery.dal.mybatis.domain.MySqlAlterTableAlterFullTextIndex;
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
public interface MySqlAlterTableAlterFullTextIndexMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_alter_table_alter_full_text_index")
    BasicColumn[] selectList = BasicColumn.columnList(oid, analyzerNameOid, analyzerType, indexNameOid);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_alter_table_alter_full_text_index")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_alter_table_alter_full_text_index")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_alter_table_alter_full_text_index")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<MySqlAlterTableAlterFullTextIndex> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_alter_table_alter_full_text_index")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<MySqlAlterTableAlterFullTextIndex> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_alter_table_alter_full_text_index")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="analyzer_name_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="analyzer_type", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="index_name_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT)
    })
    Optional<MySqlAlterTableAlterFullTextIndex> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_alter_table_alter_full_text_index")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="analyzer_name_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="analyzer_type", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="index_name_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT)
    })
    List<MySqlAlterTableAlterFullTextIndex> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_alter_table_alter_full_text_index")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_alter_table_alter_full_text_index")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, mySqlAlterTableAlterFullTextIndex, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_alter_table_alter_full_text_index")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, mySqlAlterTableAlterFullTextIndex, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_alter_table_alter_full_text_index")
    default int deleteByPrimaryKey(Long oid_) {
        return delete(c -> 
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_alter_table_alter_full_text_index")
    default int insert(MySqlAlterTableAlterFullTextIndex record) {
        return MyBatis3Utils.insert(this::insert, record, mySqlAlterTableAlterFullTextIndex, c ->
            c.map(oid).toProperty("oid")
            .map(analyzerNameOid).toProperty("analyzerNameOid")
            .map(analyzerType).toProperty("analyzerType")
            .map(indexNameOid).toProperty("indexNameOid")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_alter_table_alter_full_text_index")
    default int insertMultiple(Collection<MySqlAlterTableAlterFullTextIndex> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, mySqlAlterTableAlterFullTextIndex, c ->
            c.map(oid).toProperty("oid")
            .map(analyzerNameOid).toProperty("analyzerNameOid")
            .map(analyzerType).toProperty("analyzerType")
            .map(indexNameOid).toProperty("indexNameOid")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_alter_table_alter_full_text_index")
    default int insertSelective(MySqlAlterTableAlterFullTextIndex record) {
        return MyBatis3Utils.insert(this::insert, record, mySqlAlterTableAlterFullTextIndex, c ->
            c.map(oid).toPropertyWhenPresent("oid", record::getOid)
            .map(analyzerNameOid).toPropertyWhenPresent("analyzerNameOid", record::getAnalyzerNameOid)
            .map(analyzerType).toPropertyWhenPresent("analyzerType", record::getAnalyzerType)
            .map(indexNameOid).toPropertyWhenPresent("indexNameOid", record::getIndexNameOid)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_alter_table_alter_full_text_index")
    default Optional<MySqlAlterTableAlterFullTextIndex> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, mySqlAlterTableAlterFullTextIndex, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_alter_table_alter_full_text_index")
    default List<MySqlAlterTableAlterFullTextIndex> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, mySqlAlterTableAlterFullTextIndex, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_alter_table_alter_full_text_index")
    default List<MySqlAlterTableAlterFullTextIndex> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, mySqlAlterTableAlterFullTextIndex, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_alter_table_alter_full_text_index")
    default Optional<MySqlAlterTableAlterFullTextIndex> selectByPrimaryKey(Long oid_) {
        return selectOne(c ->
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_alter_table_alter_full_text_index")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, mySqlAlterTableAlterFullTextIndex, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_alter_table_alter_full_text_index")
    static UpdateDSL<UpdateModel> updateAllColumns(MySqlAlterTableAlterFullTextIndex record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalTo(record::getOid)
                .set(analyzerNameOid).equalTo(record::getAnalyzerNameOid)
                .set(analyzerType).equalTo(record::getAnalyzerType)
                .set(indexNameOid).equalTo(record::getIndexNameOid);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_alter_table_alter_full_text_index")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(MySqlAlterTableAlterFullTextIndex record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalToWhenPresent(record::getOid)
                .set(analyzerNameOid).equalToWhenPresent(record::getAnalyzerNameOid)
                .set(analyzerType).equalToWhenPresent(record::getAnalyzerType)
                .set(indexNameOid).equalToWhenPresent(record::getIndexNameOid);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_alter_table_alter_full_text_index")
    default int updateByPrimaryKey(MySqlAlterTableAlterFullTextIndex record) {
        return update(c ->
            c.set(analyzerNameOid).equalTo(record::getAnalyzerNameOid)
            .set(analyzerType).equalTo(record::getAnalyzerType)
            .set(indexNameOid).equalTo(record::getIndexNameOid)
            .where(oid, isEqualTo(record::getOid))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_alter_table_alter_full_text_index")
    default int updateByPrimaryKeySelective(MySqlAlterTableAlterFullTextIndex record) {
        return update(c ->
            c.set(analyzerNameOid).equalToWhenPresent(record::getAnalyzerNameOid)
            .set(analyzerType).equalToWhenPresent(record::getAnalyzerType)
            .set(indexNameOid).equalToWhenPresent(record::getIndexNameOid)
            .where(oid, isEqualTo(record::getOid))
        );
    }
}