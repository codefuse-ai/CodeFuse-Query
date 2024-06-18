package com.alipay.codequery.dal.mybatis.mapper;

import static com.alipay.codequery.dal.mybatis.mapper.TypeCastExpressionDynamicSqlSupport.*;

import com.alipay.codequery.dal.mybatis.domain.TypeCastExpression;
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
public interface TypeCastExpressionMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: type_cast_expression")
    BasicColumn[] selectList = BasicColumn.columnList(elementHashId, castExpressionHashId);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: type_cast_expression")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: type_cast_expression")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: type_cast_expression")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<TypeCastExpression> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: type_cast_expression")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<TypeCastExpression> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: type_cast_expression")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="element_hash_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="cast_expression_hash_id", javaType=Long.class, jdbcType=JdbcType.BIGINT)
    })
    Optional<TypeCastExpression> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: type_cast_expression")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="element_hash_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="cast_expression_hash_id", javaType=Long.class, jdbcType=JdbcType.BIGINT)
    })
    List<TypeCastExpression> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: type_cast_expression")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: type_cast_expression")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, typeCastExpression, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: type_cast_expression")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, typeCastExpression, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: type_cast_expression")
    default int insert(TypeCastExpression record) {
        return MyBatis3Utils.insert(this::insert, record, typeCastExpression, c ->
            c.map(elementHashId).toProperty("elementHashId")
            .map(castExpressionHashId).toProperty("castExpressionHashId")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: type_cast_expression")
    default int insertMultiple(Collection<TypeCastExpression> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, typeCastExpression, c ->
            c.map(elementHashId).toProperty("elementHashId")
            .map(castExpressionHashId).toProperty("castExpressionHashId")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: type_cast_expression")
    default int insertSelective(TypeCastExpression record) {
        return MyBatis3Utils.insert(this::insert, record, typeCastExpression, c ->
            c.map(elementHashId).toPropertyWhenPresent("elementHashId", record::getElementHashId)
            .map(castExpressionHashId).toPropertyWhenPresent("castExpressionHashId", record::getCastExpressionHashId)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: type_cast_expression")
    default Optional<TypeCastExpression> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, typeCastExpression, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: type_cast_expression")
    default List<TypeCastExpression> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, typeCastExpression, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: type_cast_expression")
    default List<TypeCastExpression> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, typeCastExpression, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: type_cast_expression")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, typeCastExpression, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: type_cast_expression")
    static UpdateDSL<UpdateModel> updateAllColumns(TypeCastExpression record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(elementHashId).equalTo(record::getElementHashId)
                .set(castExpressionHashId).equalTo(record::getCastExpressionHashId);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: type_cast_expression")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(TypeCastExpression record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(elementHashId).equalToWhenPresent(record::getElementHashId)
                .set(castExpressionHashId).equalToWhenPresent(record::getCastExpressionHashId);
    }
}