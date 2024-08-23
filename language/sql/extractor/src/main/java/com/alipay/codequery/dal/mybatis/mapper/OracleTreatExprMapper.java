package com.alipay.codequery.dal.mybatis.mapper;

import static com.alipay.codequery.dal.mybatis.mapper.OracleTreatExprDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.alipay.codequery.dal.mybatis.domain.OracleTreatExpr;
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
public interface OracleTreatExprMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_treat_expr")
    BasicColumn[] selectList = BasicColumn.columnList(oid, exprOid, isRef, typeOid);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_treat_expr")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_treat_expr")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_treat_expr")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<OracleTreatExpr> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_treat_expr")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<OracleTreatExpr> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_treat_expr")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="expr_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_ref", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="type_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT)
    })
    Optional<OracleTreatExpr> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_treat_expr")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="expr_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_ref", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="type_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT)
    })
    List<OracleTreatExpr> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_treat_expr")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_treat_expr")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, oracleTreatExpr, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_treat_expr")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, oracleTreatExpr, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_treat_expr")
    default int deleteByPrimaryKey(Long oid_) {
        return delete(c -> 
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_treat_expr")
    default int insert(OracleTreatExpr record) {
        return MyBatis3Utils.insert(this::insert, record, oracleTreatExpr, c ->
            c.map(oid).toProperty("oid")
            .map(exprOid).toProperty("exprOid")
            .map(isRef).toProperty("isRef")
            .map(typeOid).toProperty("typeOid")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_treat_expr")
    default int insertMultiple(Collection<OracleTreatExpr> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, oracleTreatExpr, c ->
            c.map(oid).toProperty("oid")
            .map(exprOid).toProperty("exprOid")
            .map(isRef).toProperty("isRef")
            .map(typeOid).toProperty("typeOid")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_treat_expr")
    default int insertSelective(OracleTreatExpr record) {
        return MyBatis3Utils.insert(this::insert, record, oracleTreatExpr, c ->
            c.map(oid).toPropertyWhenPresent("oid", record::getOid)
            .map(exprOid).toPropertyWhenPresent("exprOid", record::getExprOid)
            .map(isRef).toPropertyWhenPresent("isRef", record::getIsRef)
            .map(typeOid).toPropertyWhenPresent("typeOid", record::getTypeOid)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_treat_expr")
    default Optional<OracleTreatExpr> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, oracleTreatExpr, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_treat_expr")
    default List<OracleTreatExpr> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, oracleTreatExpr, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_treat_expr")
    default List<OracleTreatExpr> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, oracleTreatExpr, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_treat_expr")
    default Optional<OracleTreatExpr> selectByPrimaryKey(Long oid_) {
        return selectOne(c ->
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_treat_expr")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, oracleTreatExpr, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_treat_expr")
    static UpdateDSL<UpdateModel> updateAllColumns(OracleTreatExpr record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalTo(record::getOid)
                .set(exprOid).equalTo(record::getExprOid)
                .set(isRef).equalTo(record::getIsRef)
                .set(typeOid).equalTo(record::getTypeOid);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_treat_expr")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(OracleTreatExpr record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalToWhenPresent(record::getOid)
                .set(exprOid).equalToWhenPresent(record::getExprOid)
                .set(isRef).equalToWhenPresent(record::getIsRef)
                .set(typeOid).equalToWhenPresent(record::getTypeOid);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_treat_expr")
    default int updateByPrimaryKey(OracleTreatExpr record) {
        return update(c ->
            c.set(exprOid).equalTo(record::getExprOid)
            .set(isRef).equalTo(record::getIsRef)
            .set(typeOid).equalTo(record::getTypeOid)
            .where(oid, isEqualTo(record::getOid))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_treat_expr")
    default int updateByPrimaryKeySelective(OracleTreatExpr record) {
        return update(c ->
            c.set(exprOid).equalToWhenPresent(record::getExprOid)
            .set(isRef).equalToWhenPresent(record::getIsRef)
            .set(typeOid).equalToWhenPresent(record::getTypeOid)
            .where(oid, isEqualTo(record::getOid))
        );
    }
}