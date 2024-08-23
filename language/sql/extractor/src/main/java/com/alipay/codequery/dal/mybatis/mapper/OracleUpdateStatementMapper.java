package com.alipay.codequery.dal.mybatis.mapper;

import static com.alipay.codequery.dal.mybatis.mapper.OracleUpdateStatementDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.alipay.codequery.dal.mybatis.domain.OracleUpdateStatement;
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
public interface OracleUpdateStatementMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_update_statement")
    BasicColumn[] selectList = BasicColumn.columnList(oid, alias, hintsSize, isOnly);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_update_statement")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_update_statement")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_update_statement")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<OracleUpdateStatement> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_update_statement")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<OracleUpdateStatement> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_update_statement")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="alias", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="hints_size", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_only", javaType=Integer.class, jdbcType=JdbcType.BIGINT)
    })
    Optional<OracleUpdateStatement> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_update_statement")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="alias", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="hints_size", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_only", javaType=Integer.class, jdbcType=JdbcType.BIGINT)
    })
    List<OracleUpdateStatement> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_update_statement")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_update_statement")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, oracleUpdateStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_update_statement")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, oracleUpdateStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_update_statement")
    default int deleteByPrimaryKey(Long oid_) {
        return delete(c -> 
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_update_statement")
    default int insert(OracleUpdateStatement record) {
        return MyBatis3Utils.insert(this::insert, record, oracleUpdateStatement, c ->
            c.map(oid).toProperty("oid")
            .map(alias).toProperty("alias")
            .map(hintsSize).toProperty("hintsSize")
            .map(isOnly).toProperty("isOnly")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_update_statement")
    default int insertMultiple(Collection<OracleUpdateStatement> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, oracleUpdateStatement, c ->
            c.map(oid).toProperty("oid")
            .map(alias).toProperty("alias")
            .map(hintsSize).toProperty("hintsSize")
            .map(isOnly).toProperty("isOnly")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_update_statement")
    default int insertSelective(OracleUpdateStatement record) {
        return MyBatis3Utils.insert(this::insert, record, oracleUpdateStatement, c ->
            c.map(oid).toPropertyWhenPresent("oid", record::getOid)
            .map(alias).toPropertyWhenPresent("alias", record::getAlias)
            .map(hintsSize).toPropertyWhenPresent("hintsSize", record::getHintsSize)
            .map(isOnly).toPropertyWhenPresent("isOnly", record::getIsOnly)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_update_statement")
    default Optional<OracleUpdateStatement> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, oracleUpdateStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_update_statement")
    default List<OracleUpdateStatement> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, oracleUpdateStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_update_statement")
    default List<OracleUpdateStatement> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, oracleUpdateStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_update_statement")
    default Optional<OracleUpdateStatement> selectByPrimaryKey(Long oid_) {
        return selectOne(c ->
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_update_statement")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, oracleUpdateStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_update_statement")
    static UpdateDSL<UpdateModel> updateAllColumns(OracleUpdateStatement record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalTo(record::getOid)
                .set(alias).equalTo(record::getAlias)
                .set(hintsSize).equalTo(record::getHintsSize)
                .set(isOnly).equalTo(record::getIsOnly);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_update_statement")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(OracleUpdateStatement record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalToWhenPresent(record::getOid)
                .set(alias).equalToWhenPresent(record::getAlias)
                .set(hintsSize).equalToWhenPresent(record::getHintsSize)
                .set(isOnly).equalToWhenPresent(record::getIsOnly);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_update_statement")
    default int updateByPrimaryKey(OracleUpdateStatement record) {
        return update(c ->
            c.set(alias).equalTo(record::getAlias)
            .set(hintsSize).equalTo(record::getHintsSize)
            .set(isOnly).equalTo(record::getIsOnly)
            .where(oid, isEqualTo(record::getOid))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_update_statement")
    default int updateByPrimaryKeySelective(OracleUpdateStatement record) {
        return update(c ->
            c.set(alias).equalToWhenPresent(record::getAlias)
            .set(hintsSize).equalToWhenPresent(record::getHintsSize)
            .set(isOnly).equalToWhenPresent(record::getIsOnly)
            .where(oid, isEqualTo(record::getOid))
        );
    }
}