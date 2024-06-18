package com.alipay.codequery.dal.mybatis.mapper;

import static com.alipay.codequery.dal.mybatis.mapper.ReferenceParameterListDynamicSqlSupport.*;

import com.alipay.codequery.dal.mybatis.domain.ReferenceParameterList;
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
public interface ReferenceParameterListMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: reference_parameter_list")
    BasicColumn[] selectList = BasicColumn.columnList(typeElementHashId, listHashId, indexOrder, parentHashId, debugMessage, locationHashId);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: reference_parameter_list")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: reference_parameter_list")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: reference_parameter_list")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<ReferenceParameterList> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: reference_parameter_list")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<ReferenceParameterList> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: reference_parameter_list")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="type_element_hash_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="list_hash_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="index_order", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="parent_hash_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="debug_message", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="location_hash_id", javaType=Long.class, jdbcType=JdbcType.BIGINT)
    })
    Optional<ReferenceParameterList> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: reference_parameter_list")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="type_element_hash_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="list_hash_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="index_order", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="parent_hash_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="debug_message", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="location_hash_id", javaType=Long.class, jdbcType=JdbcType.BIGINT)
    })
    List<ReferenceParameterList> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: reference_parameter_list")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: reference_parameter_list")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, referenceParameterList, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: reference_parameter_list")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, referenceParameterList, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: reference_parameter_list")
    default int insert(ReferenceParameterList record) {
        return MyBatis3Utils.insert(this::insert, record, referenceParameterList, c ->
            c.map(typeElementHashId).toProperty("typeElementHashId")
            .map(listHashId).toProperty("listHashId")
            .map(indexOrder).toProperty("indexOrder")
            .map(parentHashId).toProperty("parentHashId")
            .map(debugMessage).toProperty("debugMessage")
            .map(locationHashId).toProperty("locationHashId")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: reference_parameter_list")
    default int insertMultiple(Collection<ReferenceParameterList> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, referenceParameterList, c ->
            c.map(typeElementHashId).toProperty("typeElementHashId")
            .map(listHashId).toProperty("listHashId")
            .map(indexOrder).toProperty("indexOrder")
            .map(parentHashId).toProperty("parentHashId")
            .map(debugMessage).toProperty("debugMessage")
            .map(locationHashId).toProperty("locationHashId")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: reference_parameter_list")
    default int insertSelective(ReferenceParameterList record) {
        return MyBatis3Utils.insert(this::insert, record, referenceParameterList, c ->
            c.map(typeElementHashId).toPropertyWhenPresent("typeElementHashId", record::getTypeElementHashId)
            .map(listHashId).toPropertyWhenPresent("listHashId", record::getListHashId)
            .map(indexOrder).toPropertyWhenPresent("indexOrder", record::getIndexOrder)
            .map(parentHashId).toPropertyWhenPresent("parentHashId", record::getParentHashId)
            .map(debugMessage).toPropertyWhenPresent("debugMessage", record::getDebugMessage)
            .map(locationHashId).toPropertyWhenPresent("locationHashId", record::getLocationHashId)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: reference_parameter_list")
    default Optional<ReferenceParameterList> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, referenceParameterList, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: reference_parameter_list")
    default List<ReferenceParameterList> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, referenceParameterList, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: reference_parameter_list")
    default List<ReferenceParameterList> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, referenceParameterList, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: reference_parameter_list")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, referenceParameterList, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: reference_parameter_list")
    static UpdateDSL<UpdateModel> updateAllColumns(ReferenceParameterList record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(typeElementHashId).equalTo(record::getTypeElementHashId)
                .set(listHashId).equalTo(record::getListHashId)
                .set(indexOrder).equalTo(record::getIndexOrder)
                .set(parentHashId).equalTo(record::getParentHashId)
                .set(debugMessage).equalTo(record::getDebugMessage)
                .set(locationHashId).equalTo(record::getLocationHashId);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: reference_parameter_list")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(ReferenceParameterList record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(typeElementHashId).equalToWhenPresent(record::getTypeElementHashId)
                .set(listHashId).equalToWhenPresent(record::getListHashId)
                .set(indexOrder).equalToWhenPresent(record::getIndexOrder)
                .set(parentHashId).equalToWhenPresent(record::getParentHashId)
                .set(debugMessage).equalToWhenPresent(record::getDebugMessage)
                .set(locationHashId).equalToWhenPresent(record::getLocationHashId);
    }
}