package com.alipay.codequery.dal.mybatis.mapper;

import static com.alipay.codequery.dal.mybatis.mapper.SqlIndexOptionsDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.alipay.codequery.dal.mybatis.domain.SqlIndexOptions;
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
public interface SqlIndexOptionsMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_index_options")
    BasicColumn[] selectList = BasicColumn.columnList(oid, algorithm, commentOid, indexType, isGlobal, isInvisible, isLocal, isVisible, keyBlockSizeOid, lock, parserName);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_index_options")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_index_options")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_index_options")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<SqlIndexOptions> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_index_options")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<SqlIndexOptions> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_index_options")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="algorithm", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="comment_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="index_type", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="is_global", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_invisible", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_local", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_visible", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="key_block_size_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="lock", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="parser_name", javaType=String.class, jdbcType=JdbcType.VARCHAR)
    })
    Optional<SqlIndexOptions> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_index_options")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="algorithm", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="comment_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="index_type", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="is_global", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_invisible", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_local", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_visible", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="key_block_size_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="lock", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="parser_name", javaType=String.class, jdbcType=JdbcType.VARCHAR)
    })
    List<SqlIndexOptions> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_index_options")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_index_options")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, sqlIndexOptions, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_index_options")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, sqlIndexOptions, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_index_options")
    default int deleteByPrimaryKey(Long oid_) {
        return delete(c -> 
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_index_options")
    default int insert(SqlIndexOptions record) {
        return MyBatis3Utils.insert(this::insert, record, sqlIndexOptions, c ->
            c.map(oid).toProperty("oid")
            .map(algorithm).toProperty("algorithm")
            .map(commentOid).toProperty("commentOid")
            .map(indexType).toProperty("indexType")
            .map(isGlobal).toProperty("isGlobal")
            .map(isInvisible).toProperty("isInvisible")
            .map(isLocal).toProperty("isLocal")
            .map(isVisible).toProperty("isVisible")
            .map(keyBlockSizeOid).toProperty("keyBlockSizeOid")
            .map(lock).toProperty("lock")
            .map(parserName).toProperty("parserName")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_index_options")
    default int insertMultiple(Collection<SqlIndexOptions> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, sqlIndexOptions, c ->
            c.map(oid).toProperty("oid")
            .map(algorithm).toProperty("algorithm")
            .map(commentOid).toProperty("commentOid")
            .map(indexType).toProperty("indexType")
            .map(isGlobal).toProperty("isGlobal")
            .map(isInvisible).toProperty("isInvisible")
            .map(isLocal).toProperty("isLocal")
            .map(isVisible).toProperty("isVisible")
            .map(keyBlockSizeOid).toProperty("keyBlockSizeOid")
            .map(lock).toProperty("lock")
            .map(parserName).toProperty("parserName")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_index_options")
    default int insertSelective(SqlIndexOptions record) {
        return MyBatis3Utils.insert(this::insert, record, sqlIndexOptions, c ->
            c.map(oid).toPropertyWhenPresent("oid", record::getOid)
            .map(algorithm).toPropertyWhenPresent("algorithm", record::getAlgorithm)
            .map(commentOid).toPropertyWhenPresent("commentOid", record::getCommentOid)
            .map(indexType).toPropertyWhenPresent("indexType", record::getIndexType)
            .map(isGlobal).toPropertyWhenPresent("isGlobal", record::getIsGlobal)
            .map(isInvisible).toPropertyWhenPresent("isInvisible", record::getIsInvisible)
            .map(isLocal).toPropertyWhenPresent("isLocal", record::getIsLocal)
            .map(isVisible).toPropertyWhenPresent("isVisible", record::getIsVisible)
            .map(keyBlockSizeOid).toPropertyWhenPresent("keyBlockSizeOid", record::getKeyBlockSizeOid)
            .map(lock).toPropertyWhenPresent("lock", record::getLock)
            .map(parserName).toPropertyWhenPresent("parserName", record::getParserName)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_index_options")
    default Optional<SqlIndexOptions> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, sqlIndexOptions, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_index_options")
    default List<SqlIndexOptions> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, sqlIndexOptions, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_index_options")
    default List<SqlIndexOptions> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, sqlIndexOptions, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_index_options")
    default Optional<SqlIndexOptions> selectByPrimaryKey(Long oid_) {
        return selectOne(c ->
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_index_options")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, sqlIndexOptions, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_index_options")
    static UpdateDSL<UpdateModel> updateAllColumns(SqlIndexOptions record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalTo(record::getOid)
                .set(algorithm).equalTo(record::getAlgorithm)
                .set(commentOid).equalTo(record::getCommentOid)
                .set(indexType).equalTo(record::getIndexType)
                .set(isGlobal).equalTo(record::getIsGlobal)
                .set(isInvisible).equalTo(record::getIsInvisible)
                .set(isLocal).equalTo(record::getIsLocal)
                .set(isVisible).equalTo(record::getIsVisible)
                .set(keyBlockSizeOid).equalTo(record::getKeyBlockSizeOid)
                .set(lock).equalTo(record::getLock)
                .set(parserName).equalTo(record::getParserName);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_index_options")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(SqlIndexOptions record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalToWhenPresent(record::getOid)
                .set(algorithm).equalToWhenPresent(record::getAlgorithm)
                .set(commentOid).equalToWhenPresent(record::getCommentOid)
                .set(indexType).equalToWhenPresent(record::getIndexType)
                .set(isGlobal).equalToWhenPresent(record::getIsGlobal)
                .set(isInvisible).equalToWhenPresent(record::getIsInvisible)
                .set(isLocal).equalToWhenPresent(record::getIsLocal)
                .set(isVisible).equalToWhenPresent(record::getIsVisible)
                .set(keyBlockSizeOid).equalToWhenPresent(record::getKeyBlockSizeOid)
                .set(lock).equalToWhenPresent(record::getLock)
                .set(parserName).equalToWhenPresent(record::getParserName);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_index_options")
    default int updateByPrimaryKey(SqlIndexOptions record) {
        return update(c ->
            c.set(algorithm).equalTo(record::getAlgorithm)
            .set(commentOid).equalTo(record::getCommentOid)
            .set(indexType).equalTo(record::getIndexType)
            .set(isGlobal).equalTo(record::getIsGlobal)
            .set(isInvisible).equalTo(record::getIsInvisible)
            .set(isLocal).equalTo(record::getIsLocal)
            .set(isVisible).equalTo(record::getIsVisible)
            .set(keyBlockSizeOid).equalTo(record::getKeyBlockSizeOid)
            .set(lock).equalTo(record::getLock)
            .set(parserName).equalTo(record::getParserName)
            .where(oid, isEqualTo(record::getOid))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_index_options")
    default int updateByPrimaryKeySelective(SqlIndexOptions record) {
        return update(c ->
            c.set(algorithm).equalToWhenPresent(record::getAlgorithm)
            .set(commentOid).equalToWhenPresent(record::getCommentOid)
            .set(indexType).equalToWhenPresent(record::getIndexType)
            .set(isGlobal).equalToWhenPresent(record::getIsGlobal)
            .set(isInvisible).equalToWhenPresent(record::getIsInvisible)
            .set(isLocal).equalToWhenPresent(record::getIsLocal)
            .set(isVisible).equalToWhenPresent(record::getIsVisible)
            .set(keyBlockSizeOid).equalToWhenPresent(record::getKeyBlockSizeOid)
            .set(lock).equalToWhenPresent(record::getLock)
            .set(parserName).equalToWhenPresent(record::getParserName)
            .where(oid, isEqualTo(record::getOid))
        );
    }
}