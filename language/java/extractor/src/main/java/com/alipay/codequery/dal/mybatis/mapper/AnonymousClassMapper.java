package com.alipay.codequery.dal.mybatis.mapper;

import static com.alipay.codequery.dal.mybatis.mapper.AnonymousClassDynamicSqlSupport.*;

import com.alipay.codequery.dal.mybatis.domain.AnonymousClass;
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
public interface AnonymousClassMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: anonymous_class")
    BasicColumn[] selectList = BasicColumn.columnList(elementHashId, baseClassReferenceHashId, baseClassTypeHashId, locationHashId, parentHashId);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: anonymous_class")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: anonymous_class")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: anonymous_class")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<AnonymousClass> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: anonymous_class")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<AnonymousClass> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: anonymous_class")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="element_hash_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="base_class_reference_hash_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="base_class_type_hash_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="location_hash_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="parent_hash_id", javaType=Long.class, jdbcType=JdbcType.BIGINT)
    })
    Optional<AnonymousClass> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: anonymous_class")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="element_hash_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="base_class_reference_hash_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="base_class_type_hash_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="location_hash_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="parent_hash_id", javaType=Long.class, jdbcType=JdbcType.BIGINT)
    })
    List<AnonymousClass> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: anonymous_class")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: anonymous_class")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, anonymousClass, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: anonymous_class")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, anonymousClass, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: anonymous_class")
    default int insert(AnonymousClass record) {
        return MyBatis3Utils.insert(this::insert, record, anonymousClass, c ->
            c.map(elementHashId).toProperty("elementHashId")
            .map(baseClassReferenceHashId).toProperty("baseClassReferenceHashId")
            .map(baseClassTypeHashId).toProperty("baseClassTypeHashId")
            .map(locationHashId).toProperty("locationHashId")
            .map(parentHashId).toProperty("parentHashId")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: anonymous_class")
    default int insertMultiple(Collection<AnonymousClass> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, anonymousClass, c ->
            c.map(elementHashId).toProperty("elementHashId")
            .map(baseClassReferenceHashId).toProperty("baseClassReferenceHashId")
            .map(baseClassTypeHashId).toProperty("baseClassTypeHashId")
            .map(locationHashId).toProperty("locationHashId")
            .map(parentHashId).toProperty("parentHashId")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: anonymous_class")
    default int insertSelective(AnonymousClass record) {
        return MyBatis3Utils.insert(this::insert, record, anonymousClass, c ->
            c.map(elementHashId).toPropertyWhenPresent("elementHashId", record::getElementHashId)
            .map(baseClassReferenceHashId).toPropertyWhenPresent("baseClassReferenceHashId", record::getBaseClassReferenceHashId)
            .map(baseClassTypeHashId).toPropertyWhenPresent("baseClassTypeHashId", record::getBaseClassTypeHashId)
            .map(locationHashId).toPropertyWhenPresent("locationHashId", record::getLocationHashId)
            .map(parentHashId).toPropertyWhenPresent("parentHashId", record::getParentHashId)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: anonymous_class")
    default Optional<AnonymousClass> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, anonymousClass, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: anonymous_class")
    default List<AnonymousClass> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, anonymousClass, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: anonymous_class")
    default List<AnonymousClass> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, anonymousClass, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: anonymous_class")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, anonymousClass, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: anonymous_class")
    static UpdateDSL<UpdateModel> updateAllColumns(AnonymousClass record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(elementHashId).equalTo(record::getElementHashId)
                .set(baseClassReferenceHashId).equalTo(record::getBaseClassReferenceHashId)
                .set(baseClassTypeHashId).equalTo(record::getBaseClassTypeHashId)
                .set(locationHashId).equalTo(record::getLocationHashId)
                .set(parentHashId).equalTo(record::getParentHashId);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: anonymous_class")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(AnonymousClass record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(elementHashId).equalToWhenPresent(record::getElementHashId)
                .set(baseClassReferenceHashId).equalToWhenPresent(record::getBaseClassReferenceHashId)
                .set(baseClassTypeHashId).equalToWhenPresent(record::getBaseClassTypeHashId)
                .set(locationHashId).equalToWhenPresent(record::getLocationHashId)
                .set(parentHashId).equalToWhenPresent(record::getParentHashId);
    }
}