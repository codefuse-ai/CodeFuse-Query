package com.alipay.codequery.dal.mybatis.mapper;

import static com.alipay.codequery.dal.mybatis.mapper.SwitchStatementDynamicSqlSupport.*;

import com.alipay.codequery.dal.mybatis.domain.SwitchStatement;
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
public interface SwitchStatementMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: switch_statement")
    BasicColumn[] selectList = BasicColumn.columnList(elementHashId, discriminantHashId, bodyDeclarationHashId);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: switch_statement")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: switch_statement")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: switch_statement")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<SwitchStatement> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: switch_statement")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<SwitchStatement> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: switch_statement")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="element_hash_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="discriminant_hash_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="body_declaration_hash_id", javaType=Long.class, jdbcType=JdbcType.BIGINT)
    })
    Optional<SwitchStatement> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: switch_statement")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="element_hash_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="discriminant_hash_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="body_declaration_hash_id", javaType=Long.class, jdbcType=JdbcType.BIGINT)
    })
    List<SwitchStatement> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: switch_statement")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: switch_statement")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, switchStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: switch_statement")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, switchStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: switch_statement")
    default int insert(SwitchStatement record) {
        return MyBatis3Utils.insert(this::insert, record, switchStatement, c ->
            c.map(elementHashId).toProperty("elementHashId")
            .map(discriminantHashId).toProperty("discriminantHashId")
            .map(bodyDeclarationHashId).toProperty("bodyDeclarationHashId")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: switch_statement")
    default int insertMultiple(Collection<SwitchStatement> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, switchStatement, c ->
            c.map(elementHashId).toProperty("elementHashId")
            .map(discriminantHashId).toProperty("discriminantHashId")
            .map(bodyDeclarationHashId).toProperty("bodyDeclarationHashId")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: switch_statement")
    default int insertSelective(SwitchStatement record) {
        return MyBatis3Utils.insert(this::insert, record, switchStatement, c ->
            c.map(elementHashId).toPropertyWhenPresent("elementHashId", record::getElementHashId)
            .map(discriminantHashId).toPropertyWhenPresent("discriminantHashId", record::getDiscriminantHashId)
            .map(bodyDeclarationHashId).toPropertyWhenPresent("bodyDeclarationHashId", record::getBodyDeclarationHashId)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: switch_statement")
    default Optional<SwitchStatement> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, switchStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: switch_statement")
    default List<SwitchStatement> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, switchStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: switch_statement")
    default List<SwitchStatement> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, switchStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: switch_statement")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, switchStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: switch_statement")
    static UpdateDSL<UpdateModel> updateAllColumns(SwitchStatement record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(elementHashId).equalTo(record::getElementHashId)
                .set(discriminantHashId).equalTo(record::getDiscriminantHashId)
                .set(bodyDeclarationHashId).equalTo(record::getBodyDeclarationHashId);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: switch_statement")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(SwitchStatement record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(elementHashId).equalToWhenPresent(record::getElementHashId)
                .set(discriminantHashId).equalToWhenPresent(record::getDiscriminantHashId)
                .set(bodyDeclarationHashId).equalToWhenPresent(record::getBodyDeclarationHashId);
    }
}