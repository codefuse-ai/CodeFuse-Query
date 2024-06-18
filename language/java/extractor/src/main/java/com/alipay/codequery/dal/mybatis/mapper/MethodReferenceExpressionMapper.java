package com.alipay.codequery.dal.mybatis.mapper;

import static com.alipay.codequery.dal.mybatis.mapper.MethodReferenceExpressionDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.alipay.codequery.dal.mybatis.domain.MethodReferenceExpression;
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
public interface MethodReferenceExpressionMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: method_reference_expression")
    BasicColumn[] selectList = BasicColumn.columnList(elementHashId, isConstructor);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: method_reference_expression")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: method_reference_expression")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: method_reference_expression")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<MethodReferenceExpression> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: method_reference_expression")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<MethodReferenceExpression> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: method_reference_expression")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="element_hash_id", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="is_constructor", javaType=Integer.class, jdbcType=JdbcType.INTEGER)
    })
    Optional<MethodReferenceExpression> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: method_reference_expression")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="element_hash_id", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="is_constructor", javaType=Integer.class, jdbcType=JdbcType.INTEGER)
    })
    List<MethodReferenceExpression> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: method_reference_expression")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: method_reference_expression")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, methodReferenceExpression, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: method_reference_expression")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, methodReferenceExpression, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: method_reference_expression")
    default int deleteByPrimaryKey(Long elementHashId_) {
        return delete(c -> 
            c.where(elementHashId, isEqualTo(elementHashId_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: method_reference_expression")
    default int insert(MethodReferenceExpression record) {
        return MyBatis3Utils.insert(this::insert, record, methodReferenceExpression, c ->
            c.map(elementHashId).toProperty("elementHashId")
            .map(isConstructor).toProperty("isConstructor")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: method_reference_expression")
    default int insertMultiple(Collection<MethodReferenceExpression> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, methodReferenceExpression, c ->
            c.map(elementHashId).toProperty("elementHashId")
            .map(isConstructor).toProperty("isConstructor")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: method_reference_expression")
    default int insertSelective(MethodReferenceExpression record) {
        return MyBatis3Utils.insert(this::insert, record, methodReferenceExpression, c ->
            c.map(elementHashId).toPropertyWhenPresent("elementHashId", record::getElementHashId)
            .map(isConstructor).toPropertyWhenPresent("isConstructor", record::getIsConstructor)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: method_reference_expression")
    default Optional<MethodReferenceExpression> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, methodReferenceExpression, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: method_reference_expression")
    default List<MethodReferenceExpression> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, methodReferenceExpression, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: method_reference_expression")
    default List<MethodReferenceExpression> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, methodReferenceExpression, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: method_reference_expression")
    default Optional<MethodReferenceExpression> selectByPrimaryKey(Long elementHashId_) {
        return selectOne(c ->
            c.where(elementHashId, isEqualTo(elementHashId_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: method_reference_expression")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, methodReferenceExpression, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: method_reference_expression")
    static UpdateDSL<UpdateModel> updateAllColumns(MethodReferenceExpression record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(elementHashId).equalTo(record::getElementHashId)
                .set(isConstructor).equalTo(record::getIsConstructor);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: method_reference_expression")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(MethodReferenceExpression record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(elementHashId).equalToWhenPresent(record::getElementHashId)
                .set(isConstructor).equalToWhenPresent(record::getIsConstructor);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: method_reference_expression")
    default int updateByPrimaryKey(MethodReferenceExpression record) {
        return update(c ->
            c.set(isConstructor).equalTo(record::getIsConstructor)
            .where(elementHashId, isEqualTo(record::getElementHashId))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: method_reference_expression")
    default int updateByPrimaryKeySelective(MethodReferenceExpression record) {
        return update(c ->
            c.set(isConstructor).equalToWhenPresent(record::getIsConstructor)
            .where(elementHashId, isEqualTo(record::getElementHashId))
        );
    }
}