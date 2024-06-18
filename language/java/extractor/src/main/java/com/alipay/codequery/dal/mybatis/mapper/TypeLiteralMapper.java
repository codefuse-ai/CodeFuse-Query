package com.alipay.codequery.dal.mybatis.mapper;

import static com.alipay.codequery.dal.mybatis.mapper.TypeLiteralDynamicSqlSupport.*;

import com.alipay.codequery.dal.mybatis.domain.TypeLiteral;
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
public interface TypeLiteralMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: type_literal")
    BasicColumn[] selectList = BasicColumn.columnList(elementHashId, typeElementHashId, typeHashId);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: type_literal")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: type_literal")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: type_literal")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<TypeLiteral> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: type_literal")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<TypeLiteral> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: type_literal")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="element_hash_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="type_element_hash_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="type_hash_id", javaType=Long.class, jdbcType=JdbcType.BIGINT)
    })
    Optional<TypeLiteral> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: type_literal")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="element_hash_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="type_element_hash_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="type_hash_id", javaType=Long.class, jdbcType=JdbcType.BIGINT)
    })
    List<TypeLiteral> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: type_literal")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: type_literal")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, typeLiteral, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: type_literal")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, typeLiteral, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: type_literal")
    default int insert(TypeLiteral record) {
        return MyBatis3Utils.insert(this::insert, record, typeLiteral, c ->
            c.map(elementHashId).toProperty("elementHashId")
            .map(typeElementHashId).toProperty("typeElementHashId")
            .map(typeHashId).toProperty("typeHashId")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: type_literal")
    default int insertMultiple(Collection<TypeLiteral> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, typeLiteral, c ->
            c.map(elementHashId).toProperty("elementHashId")
            .map(typeElementHashId).toProperty("typeElementHashId")
            .map(typeHashId).toProperty("typeHashId")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: type_literal")
    default int insertSelective(TypeLiteral record) {
        return MyBatis3Utils.insert(this::insert, record, typeLiteral, c ->
            c.map(elementHashId).toPropertyWhenPresent("elementHashId", record::getElementHashId)
            .map(typeElementHashId).toPropertyWhenPresent("typeElementHashId", record::getTypeElementHashId)
            .map(typeHashId).toPropertyWhenPresent("typeHashId", record::getTypeHashId)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: type_literal")
    default Optional<TypeLiteral> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, typeLiteral, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: type_literal")
    default List<TypeLiteral> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, typeLiteral, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: type_literal")
    default List<TypeLiteral> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, typeLiteral, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: type_literal")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, typeLiteral, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: type_literal")
    static UpdateDSL<UpdateModel> updateAllColumns(TypeLiteral record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(elementHashId).equalTo(record::getElementHashId)
                .set(typeElementHashId).equalTo(record::getTypeElementHashId)
                .set(typeHashId).equalTo(record::getTypeHashId);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: type_literal")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(TypeLiteral record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(elementHashId).equalToWhenPresent(record::getElementHashId)
                .set(typeElementHashId).equalToWhenPresent(record::getTypeElementHashId)
                .set(typeHashId).equalToWhenPresent(record::getTypeHashId);
    }
}