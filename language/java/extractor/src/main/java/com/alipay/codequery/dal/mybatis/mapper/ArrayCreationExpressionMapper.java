package com.alipay.codequery.dal.mybatis.mapper;

import static com.alipay.codequery.dal.mybatis.mapper.ArrayCreationExpressionDynamicSqlSupport.*;

import com.alipay.codequery.dal.mybatis.domain.ArrayCreationExpression;
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
public interface ArrayCreationExpressionMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: array_creation_expression")
    BasicColumn[] selectList = BasicColumn.columnList(elementHashId, numberOfArrayDimension, typeHashId);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: array_creation_expression")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: array_creation_expression")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: array_creation_expression")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<ArrayCreationExpression> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: array_creation_expression")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<ArrayCreationExpression> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: array_creation_expression")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="element_hash_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="number_of_array_dimension", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="type_hash_id", javaType=Long.class, jdbcType=JdbcType.BIGINT)
    })
    Optional<ArrayCreationExpression> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: array_creation_expression")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="element_hash_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="number_of_array_dimension", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="type_hash_id", javaType=Long.class, jdbcType=JdbcType.BIGINT)
    })
    List<ArrayCreationExpression> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: array_creation_expression")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: array_creation_expression")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, arrayCreationExpression, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: array_creation_expression")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, arrayCreationExpression, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: array_creation_expression")
    default int insert(ArrayCreationExpression record) {
        return MyBatis3Utils.insert(this::insert, record, arrayCreationExpression, c ->
            c.map(elementHashId).toProperty("elementHashId")
            .map(numberOfArrayDimension).toProperty("numberOfArrayDimension")
            .map(typeHashId).toProperty("typeHashId")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: array_creation_expression")
    default int insertMultiple(Collection<ArrayCreationExpression> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, arrayCreationExpression, c ->
            c.map(elementHashId).toProperty("elementHashId")
            .map(numberOfArrayDimension).toProperty("numberOfArrayDimension")
            .map(typeHashId).toProperty("typeHashId")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: array_creation_expression")
    default int insertSelective(ArrayCreationExpression record) {
        return MyBatis3Utils.insert(this::insert, record, arrayCreationExpression, c ->
            c.map(elementHashId).toPropertyWhenPresent("elementHashId", record::getElementHashId)
            .map(numberOfArrayDimension).toPropertyWhenPresent("numberOfArrayDimension", record::getNumberOfArrayDimension)
            .map(typeHashId).toPropertyWhenPresent("typeHashId", record::getTypeHashId)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: array_creation_expression")
    default Optional<ArrayCreationExpression> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, arrayCreationExpression, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: array_creation_expression")
    default List<ArrayCreationExpression> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, arrayCreationExpression, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: array_creation_expression")
    default List<ArrayCreationExpression> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, arrayCreationExpression, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: array_creation_expression")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, arrayCreationExpression, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: array_creation_expression")
    static UpdateDSL<UpdateModel> updateAllColumns(ArrayCreationExpression record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(elementHashId).equalTo(record::getElementHashId)
                .set(numberOfArrayDimension).equalTo(record::getNumberOfArrayDimension)
                .set(typeHashId).equalTo(record::getTypeHashId);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: array_creation_expression")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(ArrayCreationExpression record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(elementHashId).equalToWhenPresent(record::getElementHashId)
                .set(numberOfArrayDimension).equalToWhenPresent(record::getNumberOfArrayDimension)
                .set(typeHashId).equalToWhenPresent(record::getTypeHashId);
    }
}