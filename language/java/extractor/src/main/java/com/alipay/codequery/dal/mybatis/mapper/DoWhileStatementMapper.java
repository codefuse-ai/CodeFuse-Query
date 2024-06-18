package com.alipay.codequery.dal.mybatis.mapper;

import static com.alipay.codequery.dal.mybatis.mapper.DoWhileStatementDynamicSqlSupport.*;

import com.alipay.codequery.dal.mybatis.domain.DoWhileStatement;
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
public interface DoWhileStatementMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: do_while_statement")
    BasicColumn[] selectList = BasicColumn.columnList(elementHashId, keyword, conditionHashId, bodyDeclarationHashId);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: do_while_statement")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: do_while_statement")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: do_while_statement")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<DoWhileStatement> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: do_while_statement")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<DoWhileStatement> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: do_while_statement")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="element_hash_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="keyword", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="condition_hash_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="body_declaration_hash_id", javaType=Long.class, jdbcType=JdbcType.BIGINT)
    })
    Optional<DoWhileStatement> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: do_while_statement")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="element_hash_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="keyword", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="condition_hash_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="body_declaration_hash_id", javaType=Long.class, jdbcType=JdbcType.BIGINT)
    })
    List<DoWhileStatement> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: do_while_statement")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: do_while_statement")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, doWhileStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: do_while_statement")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, doWhileStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: do_while_statement")
    default int insert(DoWhileStatement record) {
        return MyBatis3Utils.insert(this::insert, record, doWhileStatement, c ->
            c.map(elementHashId).toProperty("elementHashId")
            .map(keyword).toProperty("keyword")
            .map(conditionHashId).toProperty("conditionHashId")
            .map(bodyDeclarationHashId).toProperty("bodyDeclarationHashId")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: do_while_statement")
    default int insertMultiple(Collection<DoWhileStatement> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, doWhileStatement, c ->
            c.map(elementHashId).toProperty("elementHashId")
            .map(keyword).toProperty("keyword")
            .map(conditionHashId).toProperty("conditionHashId")
            .map(bodyDeclarationHashId).toProperty("bodyDeclarationHashId")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: do_while_statement")
    default int insertSelective(DoWhileStatement record) {
        return MyBatis3Utils.insert(this::insert, record, doWhileStatement, c ->
            c.map(elementHashId).toPropertyWhenPresent("elementHashId", record::getElementHashId)
            .map(keyword).toPropertyWhenPresent("keyword", record::getKeyword)
            .map(conditionHashId).toPropertyWhenPresent("conditionHashId", record::getConditionHashId)
            .map(bodyDeclarationHashId).toPropertyWhenPresent("bodyDeclarationHashId", record::getBodyDeclarationHashId)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: do_while_statement")
    default Optional<DoWhileStatement> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, doWhileStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: do_while_statement")
    default List<DoWhileStatement> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, doWhileStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: do_while_statement")
    default List<DoWhileStatement> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, doWhileStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: do_while_statement")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, doWhileStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: do_while_statement")
    static UpdateDSL<UpdateModel> updateAllColumns(DoWhileStatement record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(elementHashId).equalTo(record::getElementHashId)
                .set(keyword).equalTo(record::getKeyword)
                .set(conditionHashId).equalTo(record::getConditionHashId)
                .set(bodyDeclarationHashId).equalTo(record::getBodyDeclarationHashId);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: do_while_statement")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(DoWhileStatement record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(elementHashId).equalToWhenPresent(record::getElementHashId)
                .set(keyword).equalToWhenPresent(record::getKeyword)
                .set(conditionHashId).equalToWhenPresent(record::getConditionHashId)
                .set(bodyDeclarationHashId).equalToWhenPresent(record::getBodyDeclarationHashId);
    }
}