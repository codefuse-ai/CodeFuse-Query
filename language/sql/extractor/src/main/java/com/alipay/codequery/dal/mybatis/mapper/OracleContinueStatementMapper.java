package com.alipay.codequery.dal.mybatis.mapper;

import static com.alipay.codequery.dal.mybatis.mapper.OracleContinueStatementDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.alipay.codequery.dal.mybatis.domain.OracleContinueStatement;
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
public interface OracleContinueStatementMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_continue_statement")
    BasicColumn[] selectList = BasicColumn.columnList(oid, label, whenOid);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_continue_statement")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_continue_statement")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_continue_statement")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<OracleContinueStatement> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_continue_statement")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<OracleContinueStatement> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_continue_statement")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="label", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="when_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT)
    })
    Optional<OracleContinueStatement> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_continue_statement")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="label", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="when_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT)
    })
    List<OracleContinueStatement> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_continue_statement")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_continue_statement")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, oracleContinueStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_continue_statement")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, oracleContinueStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_continue_statement")
    default int deleteByPrimaryKey(Long oid_) {
        return delete(c -> 
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_continue_statement")
    default int insert(OracleContinueStatement record) {
        return MyBatis3Utils.insert(this::insert, record, oracleContinueStatement, c ->
            c.map(oid).toProperty("oid")
            .map(label).toProperty("label")
            .map(whenOid).toProperty("whenOid")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_continue_statement")
    default int insertMultiple(Collection<OracleContinueStatement> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, oracleContinueStatement, c ->
            c.map(oid).toProperty("oid")
            .map(label).toProperty("label")
            .map(whenOid).toProperty("whenOid")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_continue_statement")
    default int insertSelective(OracleContinueStatement record) {
        return MyBatis3Utils.insert(this::insert, record, oracleContinueStatement, c ->
            c.map(oid).toPropertyWhenPresent("oid", record::getOid)
            .map(label).toPropertyWhenPresent("label", record::getLabel)
            .map(whenOid).toPropertyWhenPresent("whenOid", record::getWhenOid)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_continue_statement")
    default Optional<OracleContinueStatement> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, oracleContinueStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_continue_statement")
    default List<OracleContinueStatement> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, oracleContinueStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_continue_statement")
    default List<OracleContinueStatement> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, oracleContinueStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_continue_statement")
    default Optional<OracleContinueStatement> selectByPrimaryKey(Long oid_) {
        return selectOne(c ->
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_continue_statement")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, oracleContinueStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_continue_statement")
    static UpdateDSL<UpdateModel> updateAllColumns(OracleContinueStatement record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalTo(record::getOid)
                .set(label).equalTo(record::getLabel)
                .set(whenOid).equalTo(record::getWhenOid);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_continue_statement")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(OracleContinueStatement record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalToWhenPresent(record::getOid)
                .set(label).equalToWhenPresent(record::getLabel)
                .set(whenOid).equalToWhenPresent(record::getWhenOid);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_continue_statement")
    default int updateByPrimaryKey(OracleContinueStatement record) {
        return update(c ->
            c.set(label).equalTo(record::getLabel)
            .set(whenOid).equalTo(record::getWhenOid)
            .where(oid, isEqualTo(record::getOid))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_continue_statement")
    default int updateByPrimaryKeySelective(OracleContinueStatement record) {
        return update(c ->
            c.set(label).equalToWhenPresent(record::getLabel)
            .set(whenOid).equalToWhenPresent(record::getWhenOid)
            .where(oid, isEqualTo(record::getOid))
        );
    }
}