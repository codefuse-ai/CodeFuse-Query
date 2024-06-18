package com.alipay.codequery.dal.mybatis.mapper;

import static com.alipay.codequery.dal.mybatis.mapper.ReferenceListDynamicSqlSupport.*;

import com.alipay.codequery.dal.mybatis.domain.ReferenceList;
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
public interface ReferenceListMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: reference_list")
    BasicColumn[] selectList = BasicColumn.columnList(elementHashId, locationHashId, parentHashId, debugMessage, role);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: reference_list")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: reference_list")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: reference_list")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<ReferenceList> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: reference_list")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<ReferenceList> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: reference_list")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="element_hash_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="location_hash_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="parent_hash_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="debug_message", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="role", javaType=String.class, jdbcType=JdbcType.VARCHAR)
    })
    Optional<ReferenceList> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: reference_list")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="element_hash_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="location_hash_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="parent_hash_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="debug_message", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="role", javaType=String.class, jdbcType=JdbcType.VARCHAR)
    })
    List<ReferenceList> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: reference_list")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: reference_list")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, referenceList, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: reference_list")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, referenceList, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: reference_list")
    default int insert(ReferenceList record) {
        return MyBatis3Utils.insert(this::insert, record, referenceList, c ->
            c.map(elementHashId).toProperty("elementHashId")
            .map(locationHashId).toProperty("locationHashId")
            .map(parentHashId).toProperty("parentHashId")
            .map(debugMessage).toProperty("debugMessage")
            .map(role).toProperty("role")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: reference_list")
    default int insertMultiple(Collection<ReferenceList> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, referenceList, c ->
            c.map(elementHashId).toProperty("elementHashId")
            .map(locationHashId).toProperty("locationHashId")
            .map(parentHashId).toProperty("parentHashId")
            .map(debugMessage).toProperty("debugMessage")
            .map(role).toProperty("role")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: reference_list")
    default int insertSelective(ReferenceList record) {
        return MyBatis3Utils.insert(this::insert, record, referenceList, c ->
            c.map(elementHashId).toPropertyWhenPresent("elementHashId", record::getElementHashId)
            .map(locationHashId).toPropertyWhenPresent("locationHashId", record::getLocationHashId)
            .map(parentHashId).toPropertyWhenPresent("parentHashId", record::getParentHashId)
            .map(debugMessage).toPropertyWhenPresent("debugMessage", record::getDebugMessage)
            .map(role).toPropertyWhenPresent("role", record::getRole)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: reference_list")
    default Optional<ReferenceList> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, referenceList, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: reference_list")
    default List<ReferenceList> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, referenceList, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: reference_list")
    default List<ReferenceList> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, referenceList, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: reference_list")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, referenceList, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: reference_list")
    static UpdateDSL<UpdateModel> updateAllColumns(ReferenceList record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(elementHashId).equalTo(record::getElementHashId)
                .set(locationHashId).equalTo(record::getLocationHashId)
                .set(parentHashId).equalTo(record::getParentHashId)
                .set(debugMessage).equalTo(record::getDebugMessage)
                .set(role).equalTo(record::getRole);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: reference_list")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(ReferenceList record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(elementHashId).equalToWhenPresent(record::getElementHashId)
                .set(locationHashId).equalToWhenPresent(record::getLocationHashId)
                .set(parentHashId).equalToWhenPresent(record::getParentHashId)
                .set(debugMessage).equalToWhenPresent(record::getDebugMessage)
                .set(role).equalToWhenPresent(record::getRole);
    }
}