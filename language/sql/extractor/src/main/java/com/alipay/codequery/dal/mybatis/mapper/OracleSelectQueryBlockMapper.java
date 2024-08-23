package com.alipay.codequery.dal.mybatis.mapper;

import static com.alipay.codequery.dal.mybatis.mapper.OracleSelectQueryBlockDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.alipay.codequery.dal.mybatis.domain.OracleSelectQueryBlock;
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
public interface OracleSelectQueryBlockMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_select_query_block")
    BasicColumn[] selectList = BasicColumn.columnList(oid, isSkipLocked, modelClauseOid);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_select_query_block")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_select_query_block")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_select_query_block")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<OracleSelectQueryBlock> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_select_query_block")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<OracleSelectQueryBlock> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_select_query_block")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="is_skip_locked", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="model_clause_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT)
    })
    Optional<OracleSelectQueryBlock> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_select_query_block")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="is_skip_locked", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="model_clause_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT)
    })
    List<OracleSelectQueryBlock> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_select_query_block")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_select_query_block")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, oracleSelectQueryBlock, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_select_query_block")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, oracleSelectQueryBlock, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_select_query_block")
    default int deleteByPrimaryKey(Long oid_) {
        return delete(c -> 
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_select_query_block")
    default int insert(OracleSelectQueryBlock record) {
        return MyBatis3Utils.insert(this::insert, record, oracleSelectQueryBlock, c ->
            c.map(oid).toProperty("oid")
            .map(isSkipLocked).toProperty("isSkipLocked")
            .map(modelClauseOid).toProperty("modelClauseOid")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_select_query_block")
    default int insertMultiple(Collection<OracleSelectQueryBlock> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, oracleSelectQueryBlock, c ->
            c.map(oid).toProperty("oid")
            .map(isSkipLocked).toProperty("isSkipLocked")
            .map(modelClauseOid).toProperty("modelClauseOid")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_select_query_block")
    default int insertSelective(OracleSelectQueryBlock record) {
        return MyBatis3Utils.insert(this::insert, record, oracleSelectQueryBlock, c ->
            c.map(oid).toPropertyWhenPresent("oid", record::getOid)
            .map(isSkipLocked).toPropertyWhenPresent("isSkipLocked", record::getIsSkipLocked)
            .map(modelClauseOid).toPropertyWhenPresent("modelClauseOid", record::getModelClauseOid)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_select_query_block")
    default Optional<OracleSelectQueryBlock> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, oracleSelectQueryBlock, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_select_query_block")
    default List<OracleSelectQueryBlock> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, oracleSelectQueryBlock, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_select_query_block")
    default List<OracleSelectQueryBlock> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, oracleSelectQueryBlock, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_select_query_block")
    default Optional<OracleSelectQueryBlock> selectByPrimaryKey(Long oid_) {
        return selectOne(c ->
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_select_query_block")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, oracleSelectQueryBlock, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_select_query_block")
    static UpdateDSL<UpdateModel> updateAllColumns(OracleSelectQueryBlock record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalTo(record::getOid)
                .set(isSkipLocked).equalTo(record::getIsSkipLocked)
                .set(modelClauseOid).equalTo(record::getModelClauseOid);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_select_query_block")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(OracleSelectQueryBlock record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalToWhenPresent(record::getOid)
                .set(isSkipLocked).equalToWhenPresent(record::getIsSkipLocked)
                .set(modelClauseOid).equalToWhenPresent(record::getModelClauseOid);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_select_query_block")
    default int updateByPrimaryKey(OracleSelectQueryBlock record) {
        return update(c ->
            c.set(isSkipLocked).equalTo(record::getIsSkipLocked)
            .set(modelClauseOid).equalTo(record::getModelClauseOid)
            .where(oid, isEqualTo(record::getOid))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_select_query_block")
    default int updateByPrimaryKeySelective(OracleSelectQueryBlock record) {
        return update(c ->
            c.set(isSkipLocked).equalToWhenPresent(record::getIsSkipLocked)
            .set(modelClauseOid).equalToWhenPresent(record::getModelClauseOid)
            .where(oid, isEqualTo(record::getOid))
        );
    }
}