package com.alipay.codequery.dal.mybatis.mapper;

import static com.alipay.codequery.dal.mybatis.mapper.SuperExpressionWithQualifierDynamicSqlSupport.*;

import com.alipay.codequery.dal.mybatis.domain.SuperExpressionWithQualifier;
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
public interface SuperExpressionWithQualifierMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: super_expression_with_qualifier")
    BasicColumn[] selectList = BasicColumn.columnList(elementHashId, qualifierHashId);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: super_expression_with_qualifier")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: super_expression_with_qualifier")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: super_expression_with_qualifier")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<SuperExpressionWithQualifier> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: super_expression_with_qualifier")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<SuperExpressionWithQualifier> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: super_expression_with_qualifier")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="element_hash_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="qualifier_hash_id", javaType=Long.class, jdbcType=JdbcType.BIGINT)
    })
    Optional<SuperExpressionWithQualifier> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: super_expression_with_qualifier")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="element_hash_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="qualifier_hash_id", javaType=Long.class, jdbcType=JdbcType.BIGINT)
    })
    List<SuperExpressionWithQualifier> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: super_expression_with_qualifier")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: super_expression_with_qualifier")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, superExpressionWithQualifier, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: super_expression_with_qualifier")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, superExpressionWithQualifier, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: super_expression_with_qualifier")
    default int insert(SuperExpressionWithQualifier record) {
        return MyBatis3Utils.insert(this::insert, record, superExpressionWithQualifier, c ->
            c.map(elementHashId).toProperty("elementHashId")
            .map(qualifierHashId).toProperty("qualifierHashId")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: super_expression_with_qualifier")
    default int insertMultiple(Collection<SuperExpressionWithQualifier> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, superExpressionWithQualifier, c ->
            c.map(elementHashId).toProperty("elementHashId")
            .map(qualifierHashId).toProperty("qualifierHashId")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: super_expression_with_qualifier")
    default int insertSelective(SuperExpressionWithQualifier record) {
        return MyBatis3Utils.insert(this::insert, record, superExpressionWithQualifier, c ->
            c.map(elementHashId).toPropertyWhenPresent("elementHashId", record::getElementHashId)
            .map(qualifierHashId).toPropertyWhenPresent("qualifierHashId", record::getQualifierHashId)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: super_expression_with_qualifier")
    default Optional<SuperExpressionWithQualifier> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, superExpressionWithQualifier, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: super_expression_with_qualifier")
    default List<SuperExpressionWithQualifier> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, superExpressionWithQualifier, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: super_expression_with_qualifier")
    default List<SuperExpressionWithQualifier> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, superExpressionWithQualifier, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: super_expression_with_qualifier")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, superExpressionWithQualifier, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: super_expression_with_qualifier")
    static UpdateDSL<UpdateModel> updateAllColumns(SuperExpressionWithQualifier record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(elementHashId).equalTo(record::getElementHashId)
                .set(qualifierHashId).equalTo(record::getQualifierHashId);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: super_expression_with_qualifier")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(SuperExpressionWithQualifier record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(elementHashId).equalToWhenPresent(record::getElementHashId)
                .set(qualifierHashId).equalToWhenPresent(record::getQualifierHashId);
    }
}