package com.alipay.codequery.dal.mybatis.mapper;

import static com.alipay.codequery.dal.mybatis.mapper.AntsparkCreateTableStatementDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.alipay.codequery.dal.mybatis.domain.AntsparkCreateTableStatement;
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
public interface AntsparkCreateTableStatementMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: antspark_create_table_statement")
    BasicColumn[] selectList = BasicColumn.columnList(oid, datasourceOid, metaLifeCycleOid, serdeProperties);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: antspark_create_table_statement")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: antspark_create_table_statement")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: antspark_create_table_statement")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<AntsparkCreateTableStatement> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: antspark_create_table_statement")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<AntsparkCreateTableStatement> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: antspark_create_table_statement")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="datasource_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="meta_life_cycle_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="serde_properties", javaType=String.class, jdbcType=JdbcType.VARCHAR)
    })
    Optional<AntsparkCreateTableStatement> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: antspark_create_table_statement")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="datasource_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="meta_life_cycle_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="serde_properties", javaType=String.class, jdbcType=JdbcType.VARCHAR)
    })
    List<AntsparkCreateTableStatement> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: antspark_create_table_statement")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: antspark_create_table_statement")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, antsparkCreateTableStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: antspark_create_table_statement")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, antsparkCreateTableStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: antspark_create_table_statement")
    default int deleteByPrimaryKey(Long oid_) {
        return delete(c -> 
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: antspark_create_table_statement")
    default int insert(AntsparkCreateTableStatement record) {
        return MyBatis3Utils.insert(this::insert, record, antsparkCreateTableStatement, c ->
            c.map(oid).toProperty("oid")
            .map(datasourceOid).toProperty("datasourceOid")
            .map(metaLifeCycleOid).toProperty("metaLifeCycleOid")
            .map(serdeProperties).toProperty("serdeProperties")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: antspark_create_table_statement")
    default int insertMultiple(Collection<AntsparkCreateTableStatement> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, antsparkCreateTableStatement, c ->
            c.map(oid).toProperty("oid")
            .map(datasourceOid).toProperty("datasourceOid")
            .map(metaLifeCycleOid).toProperty("metaLifeCycleOid")
            .map(serdeProperties).toProperty("serdeProperties")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: antspark_create_table_statement")
    default int insertSelective(AntsparkCreateTableStatement record) {
        return MyBatis3Utils.insert(this::insert, record, antsparkCreateTableStatement, c ->
            c.map(oid).toPropertyWhenPresent("oid", record::getOid)
            .map(datasourceOid).toPropertyWhenPresent("datasourceOid", record::getDatasourceOid)
            .map(metaLifeCycleOid).toPropertyWhenPresent("metaLifeCycleOid", record::getMetaLifeCycleOid)
            .map(serdeProperties).toPropertyWhenPresent("serdeProperties", record::getSerdeProperties)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: antspark_create_table_statement")
    default Optional<AntsparkCreateTableStatement> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, antsparkCreateTableStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: antspark_create_table_statement")
    default List<AntsparkCreateTableStatement> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, antsparkCreateTableStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: antspark_create_table_statement")
    default List<AntsparkCreateTableStatement> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, antsparkCreateTableStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: antspark_create_table_statement")
    default Optional<AntsparkCreateTableStatement> selectByPrimaryKey(Long oid_) {
        return selectOne(c ->
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: antspark_create_table_statement")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, antsparkCreateTableStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: antspark_create_table_statement")
    static UpdateDSL<UpdateModel> updateAllColumns(AntsparkCreateTableStatement record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalTo(record::getOid)
                .set(datasourceOid).equalTo(record::getDatasourceOid)
                .set(metaLifeCycleOid).equalTo(record::getMetaLifeCycleOid)
                .set(serdeProperties).equalTo(record::getSerdeProperties);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: antspark_create_table_statement")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(AntsparkCreateTableStatement record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalToWhenPresent(record::getOid)
                .set(datasourceOid).equalToWhenPresent(record::getDatasourceOid)
                .set(metaLifeCycleOid).equalToWhenPresent(record::getMetaLifeCycleOid)
                .set(serdeProperties).equalToWhenPresent(record::getSerdeProperties);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: antspark_create_table_statement")
    default int updateByPrimaryKey(AntsparkCreateTableStatement record) {
        return update(c ->
            c.set(datasourceOid).equalTo(record::getDatasourceOid)
            .set(metaLifeCycleOid).equalTo(record::getMetaLifeCycleOid)
            .set(serdeProperties).equalTo(record::getSerdeProperties)
            .where(oid, isEqualTo(record::getOid))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: antspark_create_table_statement")
    default int updateByPrimaryKeySelective(AntsparkCreateTableStatement record) {
        return update(c ->
            c.set(datasourceOid).equalToWhenPresent(record::getDatasourceOid)
            .set(metaLifeCycleOid).equalToWhenPresent(record::getMetaLifeCycleOid)
            .set(serdeProperties).equalToWhenPresent(record::getSerdeProperties)
            .where(oid, isEqualTo(record::getOid))
        );
    }
}