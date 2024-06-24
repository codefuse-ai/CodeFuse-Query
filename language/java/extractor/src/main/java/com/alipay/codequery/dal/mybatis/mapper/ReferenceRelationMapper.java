package com.alipay.codequery.dal.mybatis.mapper;

import static com.alipay.codequery.dal.mybatis.mapper.ReferenceRelationDynamicSqlSupport.*;

import com.alipay.codequery.dal.mybatis.domain.ReferenceRelation;
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
public interface ReferenceRelationMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: reference_relation")
    BasicColumn[] selectList = BasicColumn.columnList(referenceElementHashId, definitionElementHashId);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: reference_relation")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: reference_relation")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: reference_relation")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<ReferenceRelation> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: reference_relation")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<ReferenceRelation> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: reference_relation")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="reference_element_hash_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="definition_element_hash_id", javaType=Long.class, jdbcType=JdbcType.BIGINT)
    })
    Optional<ReferenceRelation> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: reference_relation")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="reference_element_hash_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="definition_element_hash_id", javaType=Long.class, jdbcType=JdbcType.BIGINT)
    })
    List<ReferenceRelation> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: reference_relation")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: reference_relation")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, referenceRelation, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: reference_relation")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, referenceRelation, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: reference_relation")
    default int insert(ReferenceRelation record) {
        return MyBatis3Utils.insert(this::insert, record, referenceRelation, c ->
            c.map(referenceElementHashId).toProperty("referenceElementHashId")
            .map(definitionElementHashId).toProperty("definitionElementHashId")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: reference_relation")
    default int insertMultiple(Collection<ReferenceRelation> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, referenceRelation, c ->
            c.map(referenceElementHashId).toProperty("referenceElementHashId")
            .map(definitionElementHashId).toProperty("definitionElementHashId")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: reference_relation")
    default int insertSelective(ReferenceRelation record) {
        return MyBatis3Utils.insert(this::insert, record, referenceRelation, c ->
            c.map(referenceElementHashId).toPropertyWhenPresent("referenceElementHashId", record::getReferenceElementHashId)
            .map(definitionElementHashId).toPropertyWhenPresent("definitionElementHashId", record::getDefinitionElementHashId)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: reference_relation")
    default Optional<ReferenceRelation> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, referenceRelation, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: reference_relation")
    default List<ReferenceRelation> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, referenceRelation, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: reference_relation")
    default List<ReferenceRelation> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, referenceRelation, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: reference_relation")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, referenceRelation, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: reference_relation")
    static UpdateDSL<UpdateModel> updateAllColumns(ReferenceRelation record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(referenceElementHashId).equalTo(record::getReferenceElementHashId)
                .set(definitionElementHashId).equalTo(record::getDefinitionElementHashId);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: reference_relation")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(ReferenceRelation record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(referenceElementHashId).equalToWhenPresent(record::getReferenceElementHashId)
                .set(definitionElementHashId).equalToWhenPresent(record::getDefinitionElementHashId);
    }
}