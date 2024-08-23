package com.alipay.codequery.dal.mybatis.mapper;

import static com.alipay.codequery.dal.mybatis.mapper.MySqlCreateExternalCatalogStatementDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.alipay.codequery.dal.mybatis.domain.MySqlCreateExternalCatalogStatement;
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
public interface MySqlCreateExternalCatalogStatementMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_create_external_catalog_statement")
    BasicColumn[] selectList = BasicColumn.columnList(oid, commentOid, isIfNotExists, nameOid, properties);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_create_external_catalog_statement")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_create_external_catalog_statement")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_create_external_catalog_statement")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<MySqlCreateExternalCatalogStatement> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_create_external_catalog_statement")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<MySqlCreateExternalCatalogStatement> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_create_external_catalog_statement")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="comment_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_if_not_exists", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="name_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="properties", javaType=String.class, jdbcType=JdbcType.VARCHAR)
    })
    Optional<MySqlCreateExternalCatalogStatement> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_create_external_catalog_statement")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="comment_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_if_not_exists", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="name_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="properties", javaType=String.class, jdbcType=JdbcType.VARCHAR)
    })
    List<MySqlCreateExternalCatalogStatement> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_create_external_catalog_statement")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_create_external_catalog_statement")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, mySqlCreateExternalCatalogStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_create_external_catalog_statement")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, mySqlCreateExternalCatalogStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_create_external_catalog_statement")
    default int deleteByPrimaryKey(Long oid_) {
        return delete(c -> 
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_create_external_catalog_statement")
    default int insert(MySqlCreateExternalCatalogStatement record) {
        return MyBatis3Utils.insert(this::insert, record, mySqlCreateExternalCatalogStatement, c ->
            c.map(oid).toProperty("oid")
            .map(commentOid).toProperty("commentOid")
            .map(isIfNotExists).toProperty("isIfNotExists")
            .map(nameOid).toProperty("nameOid")
            .map(properties).toProperty("properties")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_create_external_catalog_statement")
    default int insertMultiple(Collection<MySqlCreateExternalCatalogStatement> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, mySqlCreateExternalCatalogStatement, c ->
            c.map(oid).toProperty("oid")
            .map(commentOid).toProperty("commentOid")
            .map(isIfNotExists).toProperty("isIfNotExists")
            .map(nameOid).toProperty("nameOid")
            .map(properties).toProperty("properties")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_create_external_catalog_statement")
    default int insertSelective(MySqlCreateExternalCatalogStatement record) {
        return MyBatis3Utils.insert(this::insert, record, mySqlCreateExternalCatalogStatement, c ->
            c.map(oid).toPropertyWhenPresent("oid", record::getOid)
            .map(commentOid).toPropertyWhenPresent("commentOid", record::getCommentOid)
            .map(isIfNotExists).toPropertyWhenPresent("isIfNotExists", record::getIsIfNotExists)
            .map(nameOid).toPropertyWhenPresent("nameOid", record::getNameOid)
            .map(properties).toPropertyWhenPresent("properties", record::getProperties)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_create_external_catalog_statement")
    default Optional<MySqlCreateExternalCatalogStatement> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, mySqlCreateExternalCatalogStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_create_external_catalog_statement")
    default List<MySqlCreateExternalCatalogStatement> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, mySqlCreateExternalCatalogStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_create_external_catalog_statement")
    default List<MySqlCreateExternalCatalogStatement> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, mySqlCreateExternalCatalogStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_create_external_catalog_statement")
    default Optional<MySqlCreateExternalCatalogStatement> selectByPrimaryKey(Long oid_) {
        return selectOne(c ->
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_create_external_catalog_statement")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, mySqlCreateExternalCatalogStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_create_external_catalog_statement")
    static UpdateDSL<UpdateModel> updateAllColumns(MySqlCreateExternalCatalogStatement record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalTo(record::getOid)
                .set(commentOid).equalTo(record::getCommentOid)
                .set(isIfNotExists).equalTo(record::getIsIfNotExists)
                .set(nameOid).equalTo(record::getNameOid)
                .set(properties).equalTo(record::getProperties);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_create_external_catalog_statement")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(MySqlCreateExternalCatalogStatement record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalToWhenPresent(record::getOid)
                .set(commentOid).equalToWhenPresent(record::getCommentOid)
                .set(isIfNotExists).equalToWhenPresent(record::getIsIfNotExists)
                .set(nameOid).equalToWhenPresent(record::getNameOid)
                .set(properties).equalToWhenPresent(record::getProperties);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_create_external_catalog_statement")
    default int updateByPrimaryKey(MySqlCreateExternalCatalogStatement record) {
        return update(c ->
            c.set(commentOid).equalTo(record::getCommentOid)
            .set(isIfNotExists).equalTo(record::getIsIfNotExists)
            .set(nameOid).equalTo(record::getNameOid)
            .set(properties).equalTo(record::getProperties)
            .where(oid, isEqualTo(record::getOid))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_create_external_catalog_statement")
    default int updateByPrimaryKeySelective(MySqlCreateExternalCatalogStatement record) {
        return update(c ->
            c.set(commentOid).equalToWhenPresent(record::getCommentOid)
            .set(isIfNotExists).equalToWhenPresent(record::getIsIfNotExists)
            .set(nameOid).equalToWhenPresent(record::getNameOid)
            .set(properties).equalToWhenPresent(record::getProperties)
            .where(oid, isEqualTo(record::getOid))
        );
    }
}