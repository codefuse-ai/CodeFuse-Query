package com.alipay.codequery.dal.mybatis.mapper;

import static com.alipay.codequery.dal.mybatis.mapper.ModelClauseDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.alipay.codequery.dal.mybatis.domain.ModelClause;
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
public interface ModelClauseMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: model_clause")
    BasicColumn[] selectList = BasicColumn.columnList(oid, cellReferenceOptions, mainModel, referenceModelClauses, returnRowsClause);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: model_clause")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: model_clause")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: model_clause")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<ModelClause> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: model_clause")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<ModelClause> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: model_clause")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="cell_reference_options", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="main_model", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="reference_model_clauses", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="return_rows_clause", javaType=String.class, jdbcType=JdbcType.VARCHAR)
    })
    Optional<ModelClause> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: model_clause")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="cell_reference_options", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="main_model", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="reference_model_clauses", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="return_rows_clause", javaType=String.class, jdbcType=JdbcType.VARCHAR)
    })
    List<ModelClause> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: model_clause")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: model_clause")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, modelClause, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: model_clause")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, modelClause, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: model_clause")
    default int deleteByPrimaryKey(Long oid_) {
        return delete(c -> 
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: model_clause")
    default int insert(ModelClause record) {
        return MyBatis3Utils.insert(this::insert, record, modelClause, c ->
            c.map(oid).toProperty("oid")
            .map(cellReferenceOptions).toProperty("cellReferenceOptions")
            .map(mainModel).toProperty("mainModel")
            .map(referenceModelClauses).toProperty("referenceModelClauses")
            .map(returnRowsClause).toProperty("returnRowsClause")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: model_clause")
    default int insertMultiple(Collection<ModelClause> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, modelClause, c ->
            c.map(oid).toProperty("oid")
            .map(cellReferenceOptions).toProperty("cellReferenceOptions")
            .map(mainModel).toProperty("mainModel")
            .map(referenceModelClauses).toProperty("referenceModelClauses")
            .map(returnRowsClause).toProperty("returnRowsClause")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: model_clause")
    default int insertSelective(ModelClause record) {
        return MyBatis3Utils.insert(this::insert, record, modelClause, c ->
            c.map(oid).toPropertyWhenPresent("oid", record::getOid)
            .map(cellReferenceOptions).toPropertyWhenPresent("cellReferenceOptions", record::getCellReferenceOptions)
            .map(mainModel).toPropertyWhenPresent("mainModel", record::getMainModel)
            .map(referenceModelClauses).toPropertyWhenPresent("referenceModelClauses", record::getReferenceModelClauses)
            .map(returnRowsClause).toPropertyWhenPresent("returnRowsClause", record::getReturnRowsClause)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: model_clause")
    default Optional<ModelClause> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, modelClause, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: model_clause")
    default List<ModelClause> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, modelClause, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: model_clause")
    default List<ModelClause> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, modelClause, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: model_clause")
    default Optional<ModelClause> selectByPrimaryKey(Long oid_) {
        return selectOne(c ->
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: model_clause")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, modelClause, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: model_clause")
    static UpdateDSL<UpdateModel> updateAllColumns(ModelClause record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalTo(record::getOid)
                .set(cellReferenceOptions).equalTo(record::getCellReferenceOptions)
                .set(mainModel).equalTo(record::getMainModel)
                .set(referenceModelClauses).equalTo(record::getReferenceModelClauses)
                .set(returnRowsClause).equalTo(record::getReturnRowsClause);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: model_clause")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(ModelClause record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalToWhenPresent(record::getOid)
                .set(cellReferenceOptions).equalToWhenPresent(record::getCellReferenceOptions)
                .set(mainModel).equalToWhenPresent(record::getMainModel)
                .set(referenceModelClauses).equalToWhenPresent(record::getReferenceModelClauses)
                .set(returnRowsClause).equalToWhenPresent(record::getReturnRowsClause);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: model_clause")
    default int updateByPrimaryKey(ModelClause record) {
        return update(c ->
            c.set(cellReferenceOptions).equalTo(record::getCellReferenceOptions)
            .set(mainModel).equalTo(record::getMainModel)
            .set(referenceModelClauses).equalTo(record::getReferenceModelClauses)
            .set(returnRowsClause).equalTo(record::getReturnRowsClause)
            .where(oid, isEqualTo(record::getOid))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: model_clause")
    default int updateByPrimaryKeySelective(ModelClause record) {
        return update(c ->
            c.set(cellReferenceOptions).equalToWhenPresent(record::getCellReferenceOptions)
            .set(mainModel).equalToWhenPresent(record::getMainModel)
            .set(referenceModelClauses).equalToWhenPresent(record::getReferenceModelClauses)
            .set(returnRowsClause).equalToWhenPresent(record::getReturnRowsClause)
            .where(oid, isEqualTo(record::getOid))
        );
    }
}