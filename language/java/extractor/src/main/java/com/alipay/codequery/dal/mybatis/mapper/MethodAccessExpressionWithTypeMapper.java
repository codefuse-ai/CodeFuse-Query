package com.alipay.codequery.dal.mybatis.mapper;

import static com.alipay.codequery.dal.mybatis.mapper.MethodAccessExpressionWithTypeDynamicSqlSupport.*;

import com.alipay.codequery.dal.mybatis.domain.MethodAccessExpressionWithType;
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
public interface MethodAccessExpressionWithTypeMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: method_access_expression_with_type")
    BasicColumn[] selectList = BasicColumn.columnList(elementHashId, typeHashId, referenMethodHashId, argumentListHashId);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: method_access_expression_with_type")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: method_access_expression_with_type")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: method_access_expression_with_type")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<MethodAccessExpressionWithType> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: method_access_expression_with_type")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<MethodAccessExpressionWithType> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: method_access_expression_with_type")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="element_hash_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="type_hash_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="referen_method_hash_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="argument_list_hash_id", javaType=Long.class, jdbcType=JdbcType.BIGINT)
    })
    Optional<MethodAccessExpressionWithType> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: method_access_expression_with_type")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="element_hash_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="type_hash_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="referen_method_hash_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="argument_list_hash_id", javaType=Long.class, jdbcType=JdbcType.BIGINT)
    })
    List<MethodAccessExpressionWithType> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: method_access_expression_with_type")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: method_access_expression_with_type")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, methodAccessExpressionWithType, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: method_access_expression_with_type")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, methodAccessExpressionWithType, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: method_access_expression_with_type")
    default int insert(MethodAccessExpressionWithType record) {
        return MyBatis3Utils.insert(this::insert, record, methodAccessExpressionWithType, c ->
            c.map(elementHashId).toProperty("elementHashId")
            .map(typeHashId).toProperty("typeHashId")
            .map(referenMethodHashId).toProperty("referenMethodHashId")
            .map(argumentListHashId).toProperty("argumentListHashId")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: method_access_expression_with_type")
    default int insertMultiple(Collection<MethodAccessExpressionWithType> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, methodAccessExpressionWithType, c ->
            c.map(elementHashId).toProperty("elementHashId")
            .map(typeHashId).toProperty("typeHashId")
            .map(referenMethodHashId).toProperty("referenMethodHashId")
            .map(argumentListHashId).toProperty("argumentListHashId")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: method_access_expression_with_type")
    default int insertSelective(MethodAccessExpressionWithType record) {
        return MyBatis3Utils.insert(this::insert, record, methodAccessExpressionWithType, c ->
            c.map(elementHashId).toPropertyWhenPresent("elementHashId", record::getElementHashId)
            .map(typeHashId).toPropertyWhenPresent("typeHashId", record::getTypeHashId)
            .map(referenMethodHashId).toPropertyWhenPresent("referenMethodHashId", record::getReferenMethodHashId)
            .map(argumentListHashId).toPropertyWhenPresent("argumentListHashId", record::getArgumentListHashId)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: method_access_expression_with_type")
    default Optional<MethodAccessExpressionWithType> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, methodAccessExpressionWithType, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: method_access_expression_with_type")
    default List<MethodAccessExpressionWithType> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, methodAccessExpressionWithType, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: method_access_expression_with_type")
    default List<MethodAccessExpressionWithType> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, methodAccessExpressionWithType, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: method_access_expression_with_type")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, methodAccessExpressionWithType, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: method_access_expression_with_type")
    static UpdateDSL<UpdateModel> updateAllColumns(MethodAccessExpressionWithType record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(elementHashId).equalTo(record::getElementHashId)
                .set(typeHashId).equalTo(record::getTypeHashId)
                .set(referenMethodHashId).equalTo(record::getReferenMethodHashId)
                .set(argumentListHashId).equalTo(record::getArgumentListHashId);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: method_access_expression_with_type")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(MethodAccessExpressionWithType record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(elementHashId).equalToWhenPresent(record::getElementHashId)
                .set(typeHashId).equalToWhenPresent(record::getTypeHashId)
                .set(referenMethodHashId).equalToWhenPresent(record::getReferenMethodHashId)
                .set(argumentListHashId).equalToWhenPresent(record::getArgumentListHashId);
    }
}