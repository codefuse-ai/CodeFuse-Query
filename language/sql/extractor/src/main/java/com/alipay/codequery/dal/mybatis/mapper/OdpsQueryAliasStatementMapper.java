package com.alipay.codequery.dal.mybatis.mapper;

import static com.alipay.codequery.dal.mybatis.mapper.OdpsQueryAliasStatementDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.alipay.codequery.dal.mybatis.domain.OdpsQueryAliasStatement;
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
public interface OdpsQueryAliasStatementMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: odps_query_alias_statement")
    BasicColumn[] selectList = BasicColumn.columnList(oid, isCache, statementOid, variant);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: odps_query_alias_statement")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: odps_query_alias_statement")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: odps_query_alias_statement")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<OdpsQueryAliasStatement> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: odps_query_alias_statement")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<OdpsQueryAliasStatement> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: odps_query_alias_statement")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="is_cache", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="statement_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="variant", javaType=String.class, jdbcType=JdbcType.VARCHAR)
    })
    Optional<OdpsQueryAliasStatement> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: odps_query_alias_statement")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="is_cache", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="statement_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="variant", javaType=String.class, jdbcType=JdbcType.VARCHAR)
    })
    List<OdpsQueryAliasStatement> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: odps_query_alias_statement")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: odps_query_alias_statement")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, odpsQueryAliasStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: odps_query_alias_statement")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, odpsQueryAliasStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: odps_query_alias_statement")
    default int deleteByPrimaryKey(Long oid_) {
        return delete(c -> 
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: odps_query_alias_statement")
    default int insert(OdpsQueryAliasStatement record) {
        return MyBatis3Utils.insert(this::insert, record, odpsQueryAliasStatement, c ->
            c.map(oid).toProperty("oid")
            .map(isCache).toProperty("isCache")
            .map(statementOid).toProperty("statementOid")
            .map(variant).toProperty("variant")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: odps_query_alias_statement")
    default int insertMultiple(Collection<OdpsQueryAliasStatement> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, odpsQueryAliasStatement, c ->
            c.map(oid).toProperty("oid")
            .map(isCache).toProperty("isCache")
            .map(statementOid).toProperty("statementOid")
            .map(variant).toProperty("variant")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: odps_query_alias_statement")
    default int insertSelective(OdpsQueryAliasStatement record) {
        return MyBatis3Utils.insert(this::insert, record, odpsQueryAliasStatement, c ->
            c.map(oid).toPropertyWhenPresent("oid", record::getOid)
            .map(isCache).toPropertyWhenPresent("isCache", record::getIsCache)
            .map(statementOid).toPropertyWhenPresent("statementOid", record::getStatementOid)
            .map(variant).toPropertyWhenPresent("variant", record::getVariant)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: odps_query_alias_statement")
    default Optional<OdpsQueryAliasStatement> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, odpsQueryAliasStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: odps_query_alias_statement")
    default List<OdpsQueryAliasStatement> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, odpsQueryAliasStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: odps_query_alias_statement")
    default List<OdpsQueryAliasStatement> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, odpsQueryAliasStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: odps_query_alias_statement")
    default Optional<OdpsQueryAliasStatement> selectByPrimaryKey(Long oid_) {
        return selectOne(c ->
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: odps_query_alias_statement")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, odpsQueryAliasStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: odps_query_alias_statement")
    static UpdateDSL<UpdateModel> updateAllColumns(OdpsQueryAliasStatement record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalTo(record::getOid)
                .set(isCache).equalTo(record::getIsCache)
                .set(statementOid).equalTo(record::getStatementOid)
                .set(variant).equalTo(record::getVariant);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: odps_query_alias_statement")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(OdpsQueryAliasStatement record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalToWhenPresent(record::getOid)
                .set(isCache).equalToWhenPresent(record::getIsCache)
                .set(statementOid).equalToWhenPresent(record::getStatementOid)
                .set(variant).equalToWhenPresent(record::getVariant);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: odps_query_alias_statement")
    default int updateByPrimaryKey(OdpsQueryAliasStatement record) {
        return update(c ->
            c.set(isCache).equalTo(record::getIsCache)
            .set(statementOid).equalTo(record::getStatementOid)
            .set(variant).equalTo(record::getVariant)
            .where(oid, isEqualTo(record::getOid))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: odps_query_alias_statement")
    default int updateByPrimaryKeySelective(OdpsQueryAliasStatement record) {
        return update(c ->
            c.set(isCache).equalToWhenPresent(record::getIsCache)
            .set(statementOid).equalToWhenPresent(record::getStatementOid)
            .set(variant).equalToWhenPresent(record::getVariant)
            .where(oid, isEqualTo(record::getOid))
        );
    }
}