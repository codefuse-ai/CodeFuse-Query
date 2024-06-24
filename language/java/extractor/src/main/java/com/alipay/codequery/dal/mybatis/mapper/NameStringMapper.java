package com.alipay.codequery.dal.mybatis.mapper;

import static com.alipay.codequery.dal.mybatis.mapper.NameStringDynamicSqlSupport.*;

import com.alipay.codequery.dal.mybatis.domain.NameString;
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
public interface NameStringMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: name_string")
    BasicColumn[] selectList = BasicColumn.columnList(parentHashId, nameElementHashId, valueElementHashId);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: name_string")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: name_string")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: name_string")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<NameString> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: name_string")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<NameString> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: name_string")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="parent_hash_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="name_element_hash_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="value_element_hash_id", javaType=Long.class, jdbcType=JdbcType.BIGINT)
    })
    Optional<NameString> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: name_string")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="parent_hash_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="name_element_hash_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="value_element_hash_id", javaType=Long.class, jdbcType=JdbcType.BIGINT)
    })
    List<NameString> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: name_string")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: name_string")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, nameString, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: name_string")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, nameString, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: name_string")
    default int insert(NameString record) {
        return MyBatis3Utils.insert(this::insert, record, nameString, c ->
            c.map(parentHashId).toProperty("parentHashId")
            .map(nameElementHashId).toProperty("nameElementHashId")
            .map(valueElementHashId).toProperty("valueElementHashId")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: name_string")
    default int insertMultiple(Collection<NameString> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, nameString, c ->
            c.map(parentHashId).toProperty("parentHashId")
            .map(nameElementHashId).toProperty("nameElementHashId")
            .map(valueElementHashId).toProperty("valueElementHashId")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: name_string")
    default int insertSelective(NameString record) {
        return MyBatis3Utils.insert(this::insert, record, nameString, c ->
            c.map(parentHashId).toPropertyWhenPresent("parentHashId", record::getParentHashId)
            .map(nameElementHashId).toPropertyWhenPresent("nameElementHashId", record::getNameElementHashId)
            .map(valueElementHashId).toPropertyWhenPresent("valueElementHashId", record::getValueElementHashId)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: name_string")
    default Optional<NameString> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, nameString, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: name_string")
    default List<NameString> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, nameString, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: name_string")
    default List<NameString> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, nameString, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: name_string")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, nameString, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: name_string")
    static UpdateDSL<UpdateModel> updateAllColumns(NameString record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(parentHashId).equalTo(record::getParentHashId)
                .set(nameElementHashId).equalTo(record::getNameElementHashId)
                .set(valueElementHashId).equalTo(record::getValueElementHashId);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: name_string")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(NameString record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(parentHashId).equalToWhenPresent(record::getParentHashId)
                .set(nameElementHashId).equalToWhenPresent(record::getNameElementHashId)
                .set(valueElementHashId).equalToWhenPresent(record::getValueElementHashId);
    }
}