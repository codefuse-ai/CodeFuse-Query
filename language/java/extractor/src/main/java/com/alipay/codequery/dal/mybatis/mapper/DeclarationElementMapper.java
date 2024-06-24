package com.alipay.codequery.dal.mybatis.mapper;

import static com.alipay.codequery.dal.mybatis.mapper.DeclarationElementDynamicSqlSupport.*;

import com.alipay.codequery.dal.mybatis.domain.DeclarationElement;
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
public interface DeclarationElementMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: declaration_element")
    BasicColumn[] selectList = BasicColumn.columnList(elementHashId, indexOrder, declarationStatementHashId);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: declaration_element")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: declaration_element")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: declaration_element")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<DeclarationElement> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: declaration_element")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<DeclarationElement> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: declaration_element")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="element_hash_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="index_order", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="declaration_statement_hash_id", javaType=Long.class, jdbcType=JdbcType.BIGINT)
    })
    Optional<DeclarationElement> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: declaration_element")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="element_hash_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="index_order", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="declaration_statement_hash_id", javaType=Long.class, jdbcType=JdbcType.BIGINT)
    })
    List<DeclarationElement> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: declaration_element")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: declaration_element")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, declarationElement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: declaration_element")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, declarationElement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: declaration_element")
    default int insert(DeclarationElement record) {
        return MyBatis3Utils.insert(this::insert, record, declarationElement, c ->
            c.map(elementHashId).toProperty("elementHashId")
            .map(indexOrder).toProperty("indexOrder")
            .map(declarationStatementHashId).toProperty("declarationStatementHashId")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: declaration_element")
    default int insertMultiple(Collection<DeclarationElement> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, declarationElement, c ->
            c.map(elementHashId).toProperty("elementHashId")
            .map(indexOrder).toProperty("indexOrder")
            .map(declarationStatementHashId).toProperty("declarationStatementHashId")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: declaration_element")
    default int insertSelective(DeclarationElement record) {
        return MyBatis3Utils.insert(this::insert, record, declarationElement, c ->
            c.map(elementHashId).toPropertyWhenPresent("elementHashId", record::getElementHashId)
            .map(indexOrder).toPropertyWhenPresent("indexOrder", record::getIndexOrder)
            .map(declarationStatementHashId).toPropertyWhenPresent("declarationStatementHashId", record::getDeclarationStatementHashId)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: declaration_element")
    default Optional<DeclarationElement> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, declarationElement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: declaration_element")
    default List<DeclarationElement> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, declarationElement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: declaration_element")
    default List<DeclarationElement> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, declarationElement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: declaration_element")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, declarationElement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: declaration_element")
    static UpdateDSL<UpdateModel> updateAllColumns(DeclarationElement record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(elementHashId).equalTo(record::getElementHashId)
                .set(indexOrder).equalTo(record::getIndexOrder)
                .set(declarationStatementHashId).equalTo(record::getDeclarationStatementHashId);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: declaration_element")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(DeclarationElement record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(elementHashId).equalToWhenPresent(record::getElementHashId)
                .set(indexOrder).equalToWhenPresent(record::getIndexOrder)
                .set(declarationStatementHashId).equalToWhenPresent(record::getDeclarationStatementHashId);
    }
}