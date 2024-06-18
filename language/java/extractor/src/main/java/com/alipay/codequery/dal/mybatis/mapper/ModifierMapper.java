package com.alipay.codequery.dal.mybatis.mapper;

import static com.alipay.codequery.dal.mybatis.mapper.ModifierDynamicSqlSupport.*;

import com.alipay.codequery.dal.mybatis.domain.Modifier;
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
public interface ModifierMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: modifier")
    BasicColumn[] selectList = BasicColumn.columnList(elementHashId, name, parentHashId, locationHashId);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: modifier")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: modifier")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: modifier")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<Modifier> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: modifier")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<Modifier> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: modifier")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="element_hash_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="name", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="parent_hash_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="location_hash_id", javaType=Long.class, jdbcType=JdbcType.BIGINT)
    })
    Optional<Modifier> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: modifier")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="element_hash_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="name", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="parent_hash_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="location_hash_id", javaType=Long.class, jdbcType=JdbcType.BIGINT)
    })
    List<Modifier> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: modifier")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: modifier")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, modifier, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: modifier")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, modifier, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: modifier")
    default int insert(Modifier record) {
        return MyBatis3Utils.insert(this::insert, record, modifier, c ->
            c.map(elementHashId).toProperty("elementHashId")
            .map(name).toProperty("name")
            .map(parentHashId).toProperty("parentHashId")
            .map(locationHashId).toProperty("locationHashId")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: modifier")
    default int insertMultiple(Collection<Modifier> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, modifier, c ->
            c.map(elementHashId).toProperty("elementHashId")
            .map(name).toProperty("name")
            .map(parentHashId).toProperty("parentHashId")
            .map(locationHashId).toProperty("locationHashId")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: modifier")
    default int insertSelective(Modifier record) {
        return MyBatis3Utils.insert(this::insert, record, modifier, c ->
            c.map(elementHashId).toPropertyWhenPresent("elementHashId", record::getElementHashId)
            .map(name).toPropertyWhenPresent("name", record::getName)
            .map(parentHashId).toPropertyWhenPresent("parentHashId", record::getParentHashId)
            .map(locationHashId).toPropertyWhenPresent("locationHashId", record::getLocationHashId)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: modifier")
    default Optional<Modifier> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, modifier, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: modifier")
    default List<Modifier> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, modifier, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: modifier")
    default List<Modifier> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, modifier, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: modifier")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, modifier, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: modifier")
    static UpdateDSL<UpdateModel> updateAllColumns(Modifier record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(elementHashId).equalTo(record::getElementHashId)
                .set(name).equalTo(record::getName)
                .set(parentHashId).equalTo(record::getParentHashId)
                .set(locationHashId).equalTo(record::getLocationHashId);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: modifier")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(Modifier record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(elementHashId).equalToWhenPresent(record::getElementHashId)
                .set(name).equalToWhenPresent(record::getName)
                .set(parentHashId).equalToWhenPresent(record::getParentHashId)
                .set(locationHashId).equalToWhenPresent(record::getLocationHashId);
    }
}