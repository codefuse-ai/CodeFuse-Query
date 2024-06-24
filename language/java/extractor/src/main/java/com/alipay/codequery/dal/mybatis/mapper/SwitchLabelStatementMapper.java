package com.alipay.codequery.dal.mybatis.mapper;

import static com.alipay.codequery.dal.mybatis.mapper.SwitchLabelStatementDynamicSqlSupport.*;

import com.alipay.codequery.dal.mybatis.domain.SwitchLabelStatement;
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
public interface SwitchLabelStatementMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: switch_label_statement")
    BasicColumn[] selectList = BasicColumn.columnList(elementHashId, caseValueHashId, enclosingSwitchBlockHashId, nextSwitchCaseHashId);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: switch_label_statement")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: switch_label_statement")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: switch_label_statement")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<SwitchLabelStatement> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: switch_label_statement")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<SwitchLabelStatement> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: switch_label_statement")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="element_hash_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="case_value_hash_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="enclosing_switch_block_hash_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="next_switch_case_hash_id", javaType=Long.class, jdbcType=JdbcType.BIGINT)
    })
    Optional<SwitchLabelStatement> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: switch_label_statement")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="element_hash_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="case_value_hash_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="enclosing_switch_block_hash_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="next_switch_case_hash_id", javaType=Long.class, jdbcType=JdbcType.BIGINT)
    })
    List<SwitchLabelStatement> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: switch_label_statement")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: switch_label_statement")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, switchLabelStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: switch_label_statement")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, switchLabelStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: switch_label_statement")
    default int insert(SwitchLabelStatement record) {
        return MyBatis3Utils.insert(this::insert, record, switchLabelStatement, c ->
            c.map(elementHashId).toProperty("elementHashId")
            .map(caseValueHashId).toProperty("caseValueHashId")
            .map(enclosingSwitchBlockHashId).toProperty("enclosingSwitchBlockHashId")
            .map(nextSwitchCaseHashId).toProperty("nextSwitchCaseHashId")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: switch_label_statement")
    default int insertMultiple(Collection<SwitchLabelStatement> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, switchLabelStatement, c ->
            c.map(elementHashId).toProperty("elementHashId")
            .map(caseValueHashId).toProperty("caseValueHashId")
            .map(enclosingSwitchBlockHashId).toProperty("enclosingSwitchBlockHashId")
            .map(nextSwitchCaseHashId).toProperty("nextSwitchCaseHashId")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: switch_label_statement")
    default int insertSelective(SwitchLabelStatement record) {
        return MyBatis3Utils.insert(this::insert, record, switchLabelStatement, c ->
            c.map(elementHashId).toPropertyWhenPresent("elementHashId", record::getElementHashId)
            .map(caseValueHashId).toPropertyWhenPresent("caseValueHashId", record::getCaseValueHashId)
            .map(enclosingSwitchBlockHashId).toPropertyWhenPresent("enclosingSwitchBlockHashId", record::getEnclosingSwitchBlockHashId)
            .map(nextSwitchCaseHashId).toPropertyWhenPresent("nextSwitchCaseHashId", record::getNextSwitchCaseHashId)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: switch_label_statement")
    default Optional<SwitchLabelStatement> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, switchLabelStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: switch_label_statement")
    default List<SwitchLabelStatement> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, switchLabelStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: switch_label_statement")
    default List<SwitchLabelStatement> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, switchLabelStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: switch_label_statement")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, switchLabelStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: switch_label_statement")
    static UpdateDSL<UpdateModel> updateAllColumns(SwitchLabelStatement record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(elementHashId).equalTo(record::getElementHashId)
                .set(caseValueHashId).equalTo(record::getCaseValueHashId)
                .set(enclosingSwitchBlockHashId).equalTo(record::getEnclosingSwitchBlockHashId)
                .set(nextSwitchCaseHashId).equalTo(record::getNextSwitchCaseHashId);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: switch_label_statement")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(SwitchLabelStatement record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(elementHashId).equalToWhenPresent(record::getElementHashId)
                .set(caseValueHashId).equalToWhenPresent(record::getCaseValueHashId)
                .set(enclosingSwitchBlockHashId).equalToWhenPresent(record::getEnclosingSwitchBlockHashId)
                .set(nextSwitchCaseHashId).equalToWhenPresent(record::getNextSwitchCaseHashId);
    }
}