package com.alipay.codequery.dal.mybatis.mapper;

import static com.alipay.codequery.dal.mybatis.mapper.LabeledStatementDynamicSqlSupport.*;

import com.alipay.codequery.dal.mybatis.domain.LabeledStatement;
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
public interface LabeledStatementMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: labeled_statement")
    BasicColumn[] selectList = BasicColumn.columnList(elementHashId, labeledHashIdentifierHashId, statementHashId);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: labeled_statement")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: labeled_statement")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: labeled_statement")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<LabeledStatement> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: labeled_statement")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<LabeledStatement> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: labeled_statement")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="element_hash_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="labeled_hash_identifier_hash_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="statement_hash_id", javaType=Long.class, jdbcType=JdbcType.BIGINT)
    })
    Optional<LabeledStatement> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: labeled_statement")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="element_hash_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="labeled_hash_identifier_hash_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="statement_hash_id", javaType=Long.class, jdbcType=JdbcType.BIGINT)
    })
    List<LabeledStatement> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: labeled_statement")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: labeled_statement")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, labeledStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: labeled_statement")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, labeledStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: labeled_statement")
    default int insert(LabeledStatement record) {
        return MyBatis3Utils.insert(this::insert, record, labeledStatement, c ->
            c.map(elementHashId).toProperty("elementHashId")
            .map(labeledHashIdentifierHashId).toProperty("labeledHashIdentifierHashId")
            .map(statementHashId).toProperty("statementHashId")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: labeled_statement")
    default int insertMultiple(Collection<LabeledStatement> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, labeledStatement, c ->
            c.map(elementHashId).toProperty("elementHashId")
            .map(labeledHashIdentifierHashId).toProperty("labeledHashIdentifierHashId")
            .map(statementHashId).toProperty("statementHashId")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: labeled_statement")
    default int insertSelective(LabeledStatement record) {
        return MyBatis3Utils.insert(this::insert, record, labeledStatement, c ->
            c.map(elementHashId).toPropertyWhenPresent("elementHashId", record::getElementHashId)
            .map(labeledHashIdentifierHashId).toPropertyWhenPresent("labeledHashIdentifierHashId", record::getLabeledHashIdentifierHashId)
            .map(statementHashId).toPropertyWhenPresent("statementHashId", record::getStatementHashId)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: labeled_statement")
    default Optional<LabeledStatement> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, labeledStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: labeled_statement")
    default List<LabeledStatement> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, labeledStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: labeled_statement")
    default List<LabeledStatement> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, labeledStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: labeled_statement")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, labeledStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: labeled_statement")
    static UpdateDSL<UpdateModel> updateAllColumns(LabeledStatement record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(elementHashId).equalTo(record::getElementHashId)
                .set(labeledHashIdentifierHashId).equalTo(record::getLabeledHashIdentifierHashId)
                .set(statementHashId).equalTo(record::getStatementHashId);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: labeled_statement")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(LabeledStatement record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(elementHashId).equalToWhenPresent(record::getElementHashId)
                .set(labeledHashIdentifierHashId).equalToWhenPresent(record::getLabeledHashIdentifierHashId)
                .set(statementHashId).equalToWhenPresent(record::getStatementHashId);
    }
}