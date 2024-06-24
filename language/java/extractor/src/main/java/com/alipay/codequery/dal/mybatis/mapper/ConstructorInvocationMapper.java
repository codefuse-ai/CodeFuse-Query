package com.alipay.codequery.dal.mybatis.mapper;

import static com.alipay.codequery.dal.mybatis.mapper.ConstructorInvocationDynamicSqlSupport.*;

import com.alipay.codequery.dal.mybatis.domain.ConstructorInvocation;
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
public interface ConstructorInvocationMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: constructor_invocation")
    BasicColumn[] selectList = BasicColumn.columnList(elementHashId, classReferenceHashId);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: constructor_invocation")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: constructor_invocation")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: constructor_invocation")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<ConstructorInvocation> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: constructor_invocation")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<ConstructorInvocation> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: constructor_invocation")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="element_hash_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="class_reference_hash_id", javaType=Long.class, jdbcType=JdbcType.BIGINT)
    })
    Optional<ConstructorInvocation> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: constructor_invocation")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="element_hash_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="class_reference_hash_id", javaType=Long.class, jdbcType=JdbcType.BIGINT)
    })
    List<ConstructorInvocation> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: constructor_invocation")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: constructor_invocation")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, constructorInvocation, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: constructor_invocation")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, constructorInvocation, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: constructor_invocation")
    default int insert(ConstructorInvocation record) {
        return MyBatis3Utils.insert(this::insert, record, constructorInvocation, c ->
            c.map(elementHashId).toProperty("elementHashId")
            .map(classReferenceHashId).toProperty("classReferenceHashId")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: constructor_invocation")
    default int insertMultiple(Collection<ConstructorInvocation> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, constructorInvocation, c ->
            c.map(elementHashId).toProperty("elementHashId")
            .map(classReferenceHashId).toProperty("classReferenceHashId")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: constructor_invocation")
    default int insertSelective(ConstructorInvocation record) {
        return MyBatis3Utils.insert(this::insert, record, constructorInvocation, c ->
            c.map(elementHashId).toPropertyWhenPresent("elementHashId", record::getElementHashId)
            .map(classReferenceHashId).toPropertyWhenPresent("classReferenceHashId", record::getClassReferenceHashId)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: constructor_invocation")
    default Optional<ConstructorInvocation> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, constructorInvocation, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: constructor_invocation")
    default List<ConstructorInvocation> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, constructorInvocation, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: constructor_invocation")
    default List<ConstructorInvocation> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, constructorInvocation, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: constructor_invocation")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, constructorInvocation, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: constructor_invocation")
    static UpdateDSL<UpdateModel> updateAllColumns(ConstructorInvocation record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(elementHashId).equalTo(record::getElementHashId)
                .set(classReferenceHashId).equalTo(record::getClassReferenceHashId);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: constructor_invocation")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(ConstructorInvocation record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(elementHashId).equalToWhenPresent(record::getElementHashId)
                .set(classReferenceHashId).equalToWhenPresent(record::getClassReferenceHashId);
    }
}