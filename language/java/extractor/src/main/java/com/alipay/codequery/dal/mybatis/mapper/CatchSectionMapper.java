package com.alipay.codequery.dal.mybatis.mapper;

import static com.alipay.codequery.dal.mybatis.mapper.CatchSectionDynamicSqlSupport.*;

import com.alipay.codequery.dal.mybatis.domain.CatchSection;
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
public interface CatchSectionMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: catch_section")
    BasicColumn[] selectList = BasicColumn.columnList(elementHashId, debugMessage, parameterHashId, typeHashId, locationHashId, tryStatementHashId, indexOrder);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: catch_section")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: catch_section")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: catch_section")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<CatchSection> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: catch_section")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<CatchSection> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: catch_section")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="element_hash_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="debug_message", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="parameter_hash_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="type_hash_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="location_hash_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="try_statement_hash_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="index_order", javaType=Integer.class, jdbcType=JdbcType.INTEGER)
    })
    Optional<CatchSection> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: catch_section")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="element_hash_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="debug_message", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="parameter_hash_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="type_hash_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="location_hash_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="try_statement_hash_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="index_order", javaType=Integer.class, jdbcType=JdbcType.INTEGER)
    })
    List<CatchSection> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: catch_section")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: catch_section")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, catchSection, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: catch_section")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, catchSection, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: catch_section")
    default int insert(CatchSection record) {
        return MyBatis3Utils.insert(this::insert, record, catchSection, c ->
            c.map(elementHashId).toProperty("elementHashId")
            .map(debugMessage).toProperty("debugMessage")
            .map(parameterHashId).toProperty("parameterHashId")
            .map(typeHashId).toProperty("typeHashId")
            .map(locationHashId).toProperty("locationHashId")
            .map(tryStatementHashId).toProperty("tryStatementHashId")
            .map(indexOrder).toProperty("indexOrder")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: catch_section")
    default int insertMultiple(Collection<CatchSection> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, catchSection, c ->
            c.map(elementHashId).toProperty("elementHashId")
            .map(debugMessage).toProperty("debugMessage")
            .map(parameterHashId).toProperty("parameterHashId")
            .map(typeHashId).toProperty("typeHashId")
            .map(locationHashId).toProperty("locationHashId")
            .map(tryStatementHashId).toProperty("tryStatementHashId")
            .map(indexOrder).toProperty("indexOrder")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: catch_section")
    default int insertSelective(CatchSection record) {
        return MyBatis3Utils.insert(this::insert, record, catchSection, c ->
            c.map(elementHashId).toPropertyWhenPresent("elementHashId", record::getElementHashId)
            .map(debugMessage).toPropertyWhenPresent("debugMessage", record::getDebugMessage)
            .map(parameterHashId).toPropertyWhenPresent("parameterHashId", record::getParameterHashId)
            .map(typeHashId).toPropertyWhenPresent("typeHashId", record::getTypeHashId)
            .map(locationHashId).toPropertyWhenPresent("locationHashId", record::getLocationHashId)
            .map(tryStatementHashId).toPropertyWhenPresent("tryStatementHashId", record::getTryStatementHashId)
            .map(indexOrder).toPropertyWhenPresent("indexOrder", record::getIndexOrder)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: catch_section")
    default Optional<CatchSection> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, catchSection, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: catch_section")
    default List<CatchSection> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, catchSection, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: catch_section")
    default List<CatchSection> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, catchSection, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: catch_section")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, catchSection, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: catch_section")
    static UpdateDSL<UpdateModel> updateAllColumns(CatchSection record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(elementHashId).equalTo(record::getElementHashId)
                .set(debugMessage).equalTo(record::getDebugMessage)
                .set(parameterHashId).equalTo(record::getParameterHashId)
                .set(typeHashId).equalTo(record::getTypeHashId)
                .set(locationHashId).equalTo(record::getLocationHashId)
                .set(tryStatementHashId).equalTo(record::getTryStatementHashId)
                .set(indexOrder).equalTo(record::getIndexOrder);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: catch_section")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(CatchSection record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(elementHashId).equalToWhenPresent(record::getElementHashId)
                .set(debugMessage).equalToWhenPresent(record::getDebugMessage)
                .set(parameterHashId).equalToWhenPresent(record::getParameterHashId)
                .set(typeHashId).equalToWhenPresent(record::getTypeHashId)
                .set(locationHashId).equalToWhenPresent(record::getLocationHashId)
                .set(tryStatementHashId).equalToWhenPresent(record::getTryStatementHashId)
                .set(indexOrder).equalToWhenPresent(record::getIndexOrder);
    }
}