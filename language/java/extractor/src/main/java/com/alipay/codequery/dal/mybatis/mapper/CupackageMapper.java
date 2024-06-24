package com.alipay.codequery.dal.mybatis.mapper;

import static com.alipay.codequery.dal.mybatis.mapper.CupackageDynamicSqlSupport.*;

import com.alipay.codequery.dal.mybatis.domain.Cupackage;
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
public interface CupackageMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: cupackage")
    BasicColumn[] selectList = BasicColumn.columnList(fileHashId, packageHashId);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: cupackage")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: cupackage")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: cupackage")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<Cupackage> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: cupackage")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<Cupackage> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: cupackage")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="file_hash_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="package_hash_id", javaType=Long.class, jdbcType=JdbcType.BIGINT)
    })
    Optional<Cupackage> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: cupackage")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="file_hash_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="package_hash_id", javaType=Long.class, jdbcType=JdbcType.BIGINT)
    })
    List<Cupackage> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: cupackage")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: cupackage")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, cupackage, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: cupackage")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, cupackage, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: cupackage")
    default int insert(Cupackage record) {
        return MyBatis3Utils.insert(this::insert, record, cupackage, c ->
            c.map(fileHashId).toProperty("fileHashId")
            .map(packageHashId).toProperty("packageHashId")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: cupackage")
    default int insertMultiple(Collection<Cupackage> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, cupackage, c ->
            c.map(fileHashId).toProperty("fileHashId")
            .map(packageHashId).toProperty("packageHashId")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: cupackage")
    default int insertSelective(Cupackage record) {
        return MyBatis3Utils.insert(this::insert, record, cupackage, c ->
            c.map(fileHashId).toPropertyWhenPresent("fileHashId", record::getFileHashId)
            .map(packageHashId).toPropertyWhenPresent("packageHashId", record::getPackageHashId)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: cupackage")
    default Optional<Cupackage> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, cupackage, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: cupackage")
    default List<Cupackage> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, cupackage, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: cupackage")
    default List<Cupackage> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, cupackage, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: cupackage")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, cupackage, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: cupackage")
    static UpdateDSL<UpdateModel> updateAllColumns(Cupackage record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(fileHashId).equalTo(record::getFileHashId)
                .set(packageHashId).equalTo(record::getPackageHashId);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: cupackage")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(Cupackage record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(fileHashId).equalToWhenPresent(record::getFileHashId)
                .set(packageHashId).equalToWhenPresent(record::getPackageHashId);
    }
}