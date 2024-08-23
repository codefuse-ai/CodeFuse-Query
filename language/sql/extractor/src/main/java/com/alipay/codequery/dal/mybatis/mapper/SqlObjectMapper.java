package com.alipay.codequery.dal.mybatis.mapper;

import static com.alipay.codequery.dal.mybatis.mapper.SqlObjectDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.alipay.codequery.dal.mybatis.domain.SqlObject;
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
public interface SqlObjectMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_object")
    BasicColumn[] selectList = BasicColumn.columnList(oid, parentOid, locationOid, nodeType, indexInParent, afterCommentsDirect, beforeCommentsDirect, dbType, debugMessage);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_object")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_object")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_object")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<SqlObject> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_object")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<SqlObject> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_object")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="parent_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="location_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="node_type", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="index_in_parent", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="after_comments_direct", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="before_comments_direct", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="db_type", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="debug_message", javaType=String.class, jdbcType=JdbcType.VARCHAR)
    })
    Optional<SqlObject> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_object")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="parent_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="location_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="node_type", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="index_in_parent", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="after_comments_direct", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="before_comments_direct", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="db_type", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="debug_message", javaType=String.class, jdbcType=JdbcType.VARCHAR)
    })
    List<SqlObject> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_object")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_object")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, sqlObject, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_object")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, sqlObject, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_object")
    default int deleteByPrimaryKey(Long oid_) {
        return delete(c -> 
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_object")
    default int insert(SqlObject record) {
        return MyBatis3Utils.insert(this::insert, record, sqlObject, c ->
            c.map(oid).toProperty("oid")
            .map(parentOid).toProperty("parentOid")
            .map(locationOid).toProperty("locationOid")
            .map(nodeType).toProperty("nodeType")
            .map(indexInParent).toProperty("indexInParent")
            .map(afterCommentsDirect).toProperty("afterCommentsDirect")
            .map(beforeCommentsDirect).toProperty("beforeCommentsDirect")
            .map(dbType).toProperty("dbType")
            .map(debugMessage).toProperty("debugMessage")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_object")
    default int insertMultiple(Collection<SqlObject> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, sqlObject, c ->
            c.map(oid).toProperty("oid")
            .map(parentOid).toProperty("parentOid")
            .map(locationOid).toProperty("locationOid")
            .map(nodeType).toProperty("nodeType")
            .map(indexInParent).toProperty("indexInParent")
            .map(afterCommentsDirect).toProperty("afterCommentsDirect")
            .map(beforeCommentsDirect).toProperty("beforeCommentsDirect")
            .map(dbType).toProperty("dbType")
            .map(debugMessage).toProperty("debugMessage")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_object")
    default int insertSelective(SqlObject record) {
        return MyBatis3Utils.insert(this::insert, record, sqlObject, c ->
            c.map(oid).toPropertyWhenPresent("oid", record::getOid)
            .map(parentOid).toPropertyWhenPresent("parentOid", record::getParentOid)
            .map(locationOid).toPropertyWhenPresent("locationOid", record::getLocationOid)
            .map(nodeType).toPropertyWhenPresent("nodeType", record::getNodeType)
            .map(indexInParent).toPropertyWhenPresent("indexInParent", record::getIndexInParent)
            .map(afterCommentsDirect).toPropertyWhenPresent("afterCommentsDirect", record::getAfterCommentsDirect)
            .map(beforeCommentsDirect).toPropertyWhenPresent("beforeCommentsDirect", record::getBeforeCommentsDirect)
            .map(dbType).toPropertyWhenPresent("dbType", record::getDbType)
            .map(debugMessage).toPropertyWhenPresent("debugMessage", record::getDebugMessage)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_object")
    default Optional<SqlObject> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, sqlObject, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_object")
    default List<SqlObject> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, sqlObject, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_object")
    default List<SqlObject> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, sqlObject, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_object")
    default Optional<SqlObject> selectByPrimaryKey(Long oid_) {
        return selectOne(c ->
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_object")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, sqlObject, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_object")
    static UpdateDSL<UpdateModel> updateAllColumns(SqlObject record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalTo(record::getOid)
                .set(parentOid).equalTo(record::getParentOid)
                .set(locationOid).equalTo(record::getLocationOid)
                .set(nodeType).equalTo(record::getNodeType)
                .set(indexInParent).equalTo(record::getIndexInParent)
                .set(afterCommentsDirect).equalTo(record::getAfterCommentsDirect)
                .set(beforeCommentsDirect).equalTo(record::getBeforeCommentsDirect)
                .set(dbType).equalTo(record::getDbType)
                .set(debugMessage).equalTo(record::getDebugMessage);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_object")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(SqlObject record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalToWhenPresent(record::getOid)
                .set(parentOid).equalToWhenPresent(record::getParentOid)
                .set(locationOid).equalToWhenPresent(record::getLocationOid)
                .set(nodeType).equalToWhenPresent(record::getNodeType)
                .set(indexInParent).equalToWhenPresent(record::getIndexInParent)
                .set(afterCommentsDirect).equalToWhenPresent(record::getAfterCommentsDirect)
                .set(beforeCommentsDirect).equalToWhenPresent(record::getBeforeCommentsDirect)
                .set(dbType).equalToWhenPresent(record::getDbType)
                .set(debugMessage).equalToWhenPresent(record::getDebugMessage);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_object")
    default int updateByPrimaryKey(SqlObject record) {
        return update(c ->
            c.set(parentOid).equalTo(record::getParentOid)
            .set(locationOid).equalTo(record::getLocationOid)
            .set(nodeType).equalTo(record::getNodeType)
            .set(indexInParent).equalTo(record::getIndexInParent)
            .set(afterCommentsDirect).equalTo(record::getAfterCommentsDirect)
            .set(beforeCommentsDirect).equalTo(record::getBeforeCommentsDirect)
            .set(dbType).equalTo(record::getDbType)
            .set(debugMessage).equalTo(record::getDebugMessage)
            .where(oid, isEqualTo(record::getOid))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_object")
    default int updateByPrimaryKeySelective(SqlObject record) {
        return update(c ->
            c.set(parentOid).equalToWhenPresent(record::getParentOid)
            .set(locationOid).equalToWhenPresent(record::getLocationOid)
            .set(nodeType).equalToWhenPresent(record::getNodeType)
            .set(indexInParent).equalToWhenPresent(record::getIndexInParent)
            .set(afterCommentsDirect).equalToWhenPresent(record::getAfterCommentsDirect)
            .set(beforeCommentsDirect).equalToWhenPresent(record::getBeforeCommentsDirect)
            .set(dbType).equalToWhenPresent(record::getDbType)
            .set(debugMessage).equalToWhenPresent(record::getDebugMessage)
            .where(oid, isEqualTo(record::getOid))
        );
    }
}