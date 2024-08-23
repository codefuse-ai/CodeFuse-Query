package com.alipay.codequery.dal.mybatis.mapper;

import static com.alipay.codequery.dal.mybatis.mapper.SqlDropSynonymStatementDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.alipay.codequery.dal.mybatis.domain.SqlDropSynonymStatement;
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
public interface SqlDropSynonymStatementMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_drop_synonym_statement")
    BasicColumn[] selectList = BasicColumn.columnList(oid, isForce, isIfExists, isPublic, nameOid, schema);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_drop_synonym_statement")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_drop_synonym_statement")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_drop_synonym_statement")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<SqlDropSynonymStatement> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_drop_synonym_statement")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<SqlDropSynonymStatement> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_drop_synonym_statement")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="is_force", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_if_exists", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_public", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="name_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="schema", javaType=String.class, jdbcType=JdbcType.VARCHAR)
    })
    Optional<SqlDropSynonymStatement> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_drop_synonym_statement")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="is_force", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_if_exists", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_public", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="name_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="schema", javaType=String.class, jdbcType=JdbcType.VARCHAR)
    })
    List<SqlDropSynonymStatement> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_drop_synonym_statement")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_drop_synonym_statement")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, sqlDropSynonymStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_drop_synonym_statement")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, sqlDropSynonymStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_drop_synonym_statement")
    default int deleteByPrimaryKey(Long oid_) {
        return delete(c -> 
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_drop_synonym_statement")
    default int insert(SqlDropSynonymStatement record) {
        return MyBatis3Utils.insert(this::insert, record, sqlDropSynonymStatement, c ->
            c.map(oid).toProperty("oid")
            .map(isForce).toProperty("isForce")
            .map(isIfExists).toProperty("isIfExists")
            .map(isPublic).toProperty("isPublic")
            .map(nameOid).toProperty("nameOid")
            .map(schema).toProperty("schema")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_drop_synonym_statement")
    default int insertMultiple(Collection<SqlDropSynonymStatement> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, sqlDropSynonymStatement, c ->
            c.map(oid).toProperty("oid")
            .map(isForce).toProperty("isForce")
            .map(isIfExists).toProperty("isIfExists")
            .map(isPublic).toProperty("isPublic")
            .map(nameOid).toProperty("nameOid")
            .map(schema).toProperty("schema")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_drop_synonym_statement")
    default int insertSelective(SqlDropSynonymStatement record) {
        return MyBatis3Utils.insert(this::insert, record, sqlDropSynonymStatement, c ->
            c.map(oid).toPropertyWhenPresent("oid", record::getOid)
            .map(isForce).toPropertyWhenPresent("isForce", record::getIsForce)
            .map(isIfExists).toPropertyWhenPresent("isIfExists", record::getIsIfExists)
            .map(isPublic).toPropertyWhenPresent("isPublic", record::getIsPublic)
            .map(nameOid).toPropertyWhenPresent("nameOid", record::getNameOid)
            .map(schema).toPropertyWhenPresent("schema", record::getSchema)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_drop_synonym_statement")
    default Optional<SqlDropSynonymStatement> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, sqlDropSynonymStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_drop_synonym_statement")
    default List<SqlDropSynonymStatement> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, sqlDropSynonymStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_drop_synonym_statement")
    default List<SqlDropSynonymStatement> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, sqlDropSynonymStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_drop_synonym_statement")
    default Optional<SqlDropSynonymStatement> selectByPrimaryKey(Long oid_) {
        return selectOne(c ->
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_drop_synonym_statement")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, sqlDropSynonymStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_drop_synonym_statement")
    static UpdateDSL<UpdateModel> updateAllColumns(SqlDropSynonymStatement record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalTo(record::getOid)
                .set(isForce).equalTo(record::getIsForce)
                .set(isIfExists).equalTo(record::getIsIfExists)
                .set(isPublic).equalTo(record::getIsPublic)
                .set(nameOid).equalTo(record::getNameOid)
                .set(schema).equalTo(record::getSchema);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_drop_synonym_statement")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(SqlDropSynonymStatement record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalToWhenPresent(record::getOid)
                .set(isForce).equalToWhenPresent(record::getIsForce)
                .set(isIfExists).equalToWhenPresent(record::getIsIfExists)
                .set(isPublic).equalToWhenPresent(record::getIsPublic)
                .set(nameOid).equalToWhenPresent(record::getNameOid)
                .set(schema).equalToWhenPresent(record::getSchema);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_drop_synonym_statement")
    default int updateByPrimaryKey(SqlDropSynonymStatement record) {
        return update(c ->
            c.set(isForce).equalTo(record::getIsForce)
            .set(isIfExists).equalTo(record::getIsIfExists)
            .set(isPublic).equalTo(record::getIsPublic)
            .set(nameOid).equalTo(record::getNameOid)
            .set(schema).equalTo(record::getSchema)
            .where(oid, isEqualTo(record::getOid))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_drop_synonym_statement")
    default int updateByPrimaryKeySelective(SqlDropSynonymStatement record) {
        return update(c ->
            c.set(isForce).equalToWhenPresent(record::getIsForce)
            .set(isIfExists).equalToWhenPresent(record::getIsIfExists)
            .set(isPublic).equalToWhenPresent(record::getIsPublic)
            .set(nameOid).equalToWhenPresent(record::getNameOid)
            .set(schema).equalToWhenPresent(record::getSchema)
            .where(oid, isEqualTo(record::getOid))
        );
    }
}