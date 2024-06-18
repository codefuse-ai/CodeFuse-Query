package com.alipay.codequery.dal.mybatis.mapper;

import static com.alipay.codequery.dal.mybatis.mapper.PackageStatementDynamicSqlSupport.*;

import com.alipay.codequery.dal.mybatis.domain.PackageStatement;
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
public interface PackageStatementMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: package_statement")
    BasicColumn[] selectList = BasicColumn.columnList(elementHashId, qualifiedName, locationHashId, packageHashId, parentHashId);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: package_statement")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: package_statement")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: package_statement")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<PackageStatement> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: package_statement")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<PackageStatement> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: package_statement")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="element_hash_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="qualified_name", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="location_hash_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="package_hash_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="parent_hash_id", javaType=Long.class, jdbcType=JdbcType.BIGINT)
    })
    Optional<PackageStatement> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: package_statement")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="element_hash_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="qualified_name", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="location_hash_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="package_hash_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="parent_hash_id", javaType=Long.class, jdbcType=JdbcType.BIGINT)
    })
    List<PackageStatement> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: package_statement")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: package_statement")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, packageStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: package_statement")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, packageStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: package_statement")
    default int insert(PackageStatement record) {
        return MyBatis3Utils.insert(this::insert, record, packageStatement, c ->
            c.map(elementHashId).toProperty("elementHashId")
            .map(qualifiedName).toProperty("qualifiedName")
            .map(locationHashId).toProperty("locationHashId")
            .map(packageHashId).toProperty("packageHashId")
            .map(parentHashId).toProperty("parentHashId")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: package_statement")
    default int insertMultiple(Collection<PackageStatement> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, packageStatement, c ->
            c.map(elementHashId).toProperty("elementHashId")
            .map(qualifiedName).toProperty("qualifiedName")
            .map(locationHashId).toProperty("locationHashId")
            .map(packageHashId).toProperty("packageHashId")
            .map(parentHashId).toProperty("parentHashId")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: package_statement")
    default int insertSelective(PackageStatement record) {
        return MyBatis3Utils.insert(this::insert, record, packageStatement, c ->
            c.map(elementHashId).toPropertyWhenPresent("elementHashId", record::getElementHashId)
            .map(qualifiedName).toPropertyWhenPresent("qualifiedName", record::getQualifiedName)
            .map(locationHashId).toPropertyWhenPresent("locationHashId", record::getLocationHashId)
            .map(packageHashId).toPropertyWhenPresent("packageHashId", record::getPackageHashId)
            .map(parentHashId).toPropertyWhenPresent("parentHashId", record::getParentHashId)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: package_statement")
    default Optional<PackageStatement> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, packageStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: package_statement")
    default List<PackageStatement> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, packageStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: package_statement")
    default List<PackageStatement> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, packageStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: package_statement")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, packageStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: package_statement")
    static UpdateDSL<UpdateModel> updateAllColumns(PackageStatement record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(elementHashId).equalTo(record::getElementHashId)
                .set(qualifiedName).equalTo(record::getQualifiedName)
                .set(locationHashId).equalTo(record::getLocationHashId)
                .set(packageHashId).equalTo(record::getPackageHashId)
                .set(parentHashId).equalTo(record::getParentHashId);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: package_statement")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(PackageStatement record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(elementHashId).equalToWhenPresent(record::getElementHashId)
                .set(qualifiedName).equalToWhenPresent(record::getQualifiedName)
                .set(locationHashId).equalToWhenPresent(record::getLocationHashId)
                .set(packageHashId).equalToWhenPresent(record::getPackageHashId)
                .set(parentHashId).equalToWhenPresent(record::getParentHashId);
    }
}