package com.alipay.codequery.dal.mybatis.mapper;

import static com.alipay.codequery.dal.mybatis.mapper.ParentDynamicSqlSupport.*;

import com.alipay.codequery.dal.mybatis.domain.Parent;
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
public interface ParentMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: parent")
    BasicColumn[] selectList = BasicColumn.columnList(parentHashId, parentType);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: parent")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: parent")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: parent")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<Parent> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: parent")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<Parent> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: parent")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="parent_hash_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="parent_type", javaType=String.class, jdbcType=JdbcType.VARCHAR)
    })
    Optional<Parent> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: parent")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="parent_hash_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="parent_type", javaType=String.class, jdbcType=JdbcType.VARCHAR)
    })
    List<Parent> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: parent")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: parent")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, parent, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: parent")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, parent, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: parent")
    default int insert(Parent record) {
        return MyBatis3Utils.insert(this::insert, record, parent, c ->
            c.map(parentHashId).toProperty("parentHashId")
            .map(parentType).toProperty("parentType")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: parent")
    default int insertMultiple(Collection<Parent> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, parent, c ->
            c.map(parentHashId).toProperty("parentHashId")
            .map(parentType).toProperty("parentType")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: parent")
    default int insertSelective(Parent record) {
        return MyBatis3Utils.insert(this::insert, record, parent, c ->
            c.map(parentHashId).toPropertyWhenPresent("parentHashId", record::getParentHashId)
            .map(parentType).toPropertyWhenPresent("parentType", record::getParentType)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: parent")
    default Optional<Parent> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, parent, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: parent")
    default List<Parent> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, parent, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: parent")
    default List<Parent> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, parent, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: parent")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, parent, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: parent")
    static UpdateDSL<UpdateModel> updateAllColumns(Parent record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(parentHashId).equalTo(record::getParentHashId)
                .set(parentType).equalTo(record::getParentType);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: parent")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(Parent record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(parentHashId).equalToWhenPresent(record::getParentHashId)
                .set(parentType).equalToWhenPresent(record::getParentType);
    }
}