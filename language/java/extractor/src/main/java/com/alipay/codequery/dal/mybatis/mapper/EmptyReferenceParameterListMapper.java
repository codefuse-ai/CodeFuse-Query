package com.alipay.codequery.dal.mybatis.mapper;

import static com.alipay.codequery.dal.mybatis.mapper.EmptyReferenceParameterListDynamicSqlSupport.*;

import com.alipay.codequery.dal.mybatis.domain.EmptyReferenceParameterList;
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
public interface EmptyReferenceParameterListMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: empty_reference_parameter_list")
    BasicColumn[] selectList = BasicColumn.columnList(listHashId, parentHashId, debugMessage, locationHashId);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: empty_reference_parameter_list")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: empty_reference_parameter_list")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: empty_reference_parameter_list")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<EmptyReferenceParameterList> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: empty_reference_parameter_list")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<EmptyReferenceParameterList> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: empty_reference_parameter_list")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="list_hash_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="parent_hash_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="debug_message", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="location_hash_id", javaType=Long.class, jdbcType=JdbcType.BIGINT)
    })
    Optional<EmptyReferenceParameterList> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: empty_reference_parameter_list")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="list_hash_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="parent_hash_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="debug_message", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="location_hash_id", javaType=Long.class, jdbcType=JdbcType.BIGINT)
    })
    List<EmptyReferenceParameterList> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: empty_reference_parameter_list")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: empty_reference_parameter_list")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, emptyReferenceParameterList, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: empty_reference_parameter_list")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, emptyReferenceParameterList, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: empty_reference_parameter_list")
    default int insert(EmptyReferenceParameterList record) {
        return MyBatis3Utils.insert(this::insert, record, emptyReferenceParameterList, c ->
            c.map(listHashId).toProperty("listHashId")
            .map(parentHashId).toProperty("parentHashId")
            .map(debugMessage).toProperty("debugMessage")
            .map(locationHashId).toProperty("locationHashId")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: empty_reference_parameter_list")
    default int insertMultiple(Collection<EmptyReferenceParameterList> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, emptyReferenceParameterList, c ->
            c.map(listHashId).toProperty("listHashId")
            .map(parentHashId).toProperty("parentHashId")
            .map(debugMessage).toProperty("debugMessage")
            .map(locationHashId).toProperty("locationHashId")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: empty_reference_parameter_list")
    default int insertSelective(EmptyReferenceParameterList record) {
        return MyBatis3Utils.insert(this::insert, record, emptyReferenceParameterList, c ->
            c.map(listHashId).toPropertyWhenPresent("listHashId", record::getListHashId)
            .map(parentHashId).toPropertyWhenPresent("parentHashId", record::getParentHashId)
            .map(debugMessage).toPropertyWhenPresent("debugMessage", record::getDebugMessage)
            .map(locationHashId).toPropertyWhenPresent("locationHashId", record::getLocationHashId)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: empty_reference_parameter_list")
    default Optional<EmptyReferenceParameterList> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, emptyReferenceParameterList, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: empty_reference_parameter_list")
    default List<EmptyReferenceParameterList> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, emptyReferenceParameterList, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: empty_reference_parameter_list")
    default List<EmptyReferenceParameterList> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, emptyReferenceParameterList, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: empty_reference_parameter_list")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, emptyReferenceParameterList, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: empty_reference_parameter_list")
    static UpdateDSL<UpdateModel> updateAllColumns(EmptyReferenceParameterList record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(listHashId).equalTo(record::getListHashId)
                .set(parentHashId).equalTo(record::getParentHashId)
                .set(debugMessage).equalTo(record::getDebugMessage)
                .set(locationHashId).equalTo(record::getLocationHashId);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: empty_reference_parameter_list")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(EmptyReferenceParameterList record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(listHashId).equalToWhenPresent(record::getListHashId)
                .set(parentHashId).equalToWhenPresent(record::getParentHashId)
                .set(debugMessage).equalToWhenPresent(record::getDebugMessage)
                .set(locationHashId).equalToWhenPresent(record::getLocationHashId);
    }
}