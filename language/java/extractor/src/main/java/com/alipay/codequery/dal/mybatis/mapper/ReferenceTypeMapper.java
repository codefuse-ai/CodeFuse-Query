package com.alipay.codequery.dal.mybatis.mapper;

import static com.alipay.codequery.dal.mybatis.mapper.ReferenceTypeDynamicSqlSupport.*;

import com.alipay.codequery.dal.mybatis.domain.ReferenceType;
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
public interface ReferenceTypeMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: reference_type")
    BasicColumn[] selectList = BasicColumn.columnList(oid, name, qualifiedName);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: reference_type")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: reference_type")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: reference_type")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<ReferenceType> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: reference_type")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<ReferenceType> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: reference_type")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="name", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="qualified_name", javaType=String.class, jdbcType=JdbcType.VARCHAR)
    })
    Optional<ReferenceType> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: reference_type")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="name", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="qualified_name", javaType=String.class, jdbcType=JdbcType.VARCHAR)
    })
    List<ReferenceType> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: reference_type")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: reference_type")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, referenceType, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: reference_type")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, referenceType, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: reference_type")
    default int insert(ReferenceType record) {
        return MyBatis3Utils.insert(this::insert, record, referenceType, c ->
            c.map(oid).toProperty("oid")
            .map(name).toProperty("name")
            .map(qualifiedName).toProperty("qualifiedName")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: reference_type")
    default int insertMultiple(Collection<ReferenceType> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, referenceType, c ->
            c.map(oid).toProperty("oid")
            .map(name).toProperty("name")
            .map(qualifiedName).toProperty("qualifiedName")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: reference_type")
    default int insertSelective(ReferenceType record) {
        return MyBatis3Utils.insert(this::insert, record, referenceType, c ->
            c.map(oid).toPropertyWhenPresent("oid", record::getOid)
            .map(name).toPropertyWhenPresent("name", record::getName)
            .map(qualifiedName).toPropertyWhenPresent("qualifiedName", record::getQualifiedName)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: reference_type")
    default Optional<ReferenceType> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, referenceType, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: reference_type")
    default List<ReferenceType> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, referenceType, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: reference_type")
    default List<ReferenceType> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, referenceType, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: reference_type")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, referenceType, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: reference_type")
    static UpdateDSL<UpdateModel> updateAllColumns(ReferenceType record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalTo(record::getOid)
                .set(name).equalTo(record::getName)
                .set(qualifiedName).equalTo(record::getQualifiedName);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: reference_type")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(ReferenceType record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalToWhenPresent(record::getOid)
                .set(name).equalToWhenPresent(record::getName)
                .set(qualifiedName).equalToWhenPresent(record::getQualifiedName);
    }
}