package com.alipay.codequery.dal.mybatis.mapper;

import static com.alipay.codequery.dal.mybatis.mapper.SqlSyncMetaStatementDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.alipay.codequery.dal.mybatis.domain.SqlSyncMetaStatement;
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
public interface SqlSyncMetaStatementMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_sync_meta_statement")
    BasicColumn[] selectList = BasicColumn.columnList(oid, fromOid, ignore, likeOid, restrict);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_sync_meta_statement")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_sync_meta_statement")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_sync_meta_statement")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<SqlSyncMetaStatement> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_sync_meta_statement")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<SqlSyncMetaStatement> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_sync_meta_statement")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="from_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="ignore", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="like_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="restrict", javaType=Integer.class, jdbcType=JdbcType.BIGINT)
    })
    Optional<SqlSyncMetaStatement> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_sync_meta_statement")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="from_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="ignore", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="like_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="restrict", javaType=Integer.class, jdbcType=JdbcType.BIGINT)
    })
    List<SqlSyncMetaStatement> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_sync_meta_statement")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_sync_meta_statement")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, sqlSyncMetaStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_sync_meta_statement")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, sqlSyncMetaStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_sync_meta_statement")
    default int deleteByPrimaryKey(Long oid_) {
        return delete(c -> 
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_sync_meta_statement")
    default int insert(SqlSyncMetaStatement record) {
        return MyBatis3Utils.insert(this::insert, record, sqlSyncMetaStatement, c ->
            c.map(oid).toProperty("oid")
            .map(fromOid).toProperty("fromOid")
            .map(ignore).toProperty("ignore")
            .map(likeOid).toProperty("likeOid")
            .map(restrict).toProperty("restrict")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_sync_meta_statement")
    default int insertMultiple(Collection<SqlSyncMetaStatement> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, sqlSyncMetaStatement, c ->
            c.map(oid).toProperty("oid")
            .map(fromOid).toProperty("fromOid")
            .map(ignore).toProperty("ignore")
            .map(likeOid).toProperty("likeOid")
            .map(restrict).toProperty("restrict")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_sync_meta_statement")
    default int insertSelective(SqlSyncMetaStatement record) {
        return MyBatis3Utils.insert(this::insert, record, sqlSyncMetaStatement, c ->
            c.map(oid).toPropertyWhenPresent("oid", record::getOid)
            .map(fromOid).toPropertyWhenPresent("fromOid", record::getFromOid)
            .map(ignore).toPropertyWhenPresent("ignore", record::getIgnore)
            .map(likeOid).toPropertyWhenPresent("likeOid", record::getLikeOid)
            .map(restrict).toPropertyWhenPresent("restrict", record::getRestrict)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_sync_meta_statement")
    default Optional<SqlSyncMetaStatement> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, sqlSyncMetaStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_sync_meta_statement")
    default List<SqlSyncMetaStatement> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, sqlSyncMetaStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_sync_meta_statement")
    default List<SqlSyncMetaStatement> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, sqlSyncMetaStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_sync_meta_statement")
    default Optional<SqlSyncMetaStatement> selectByPrimaryKey(Long oid_) {
        return selectOne(c ->
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_sync_meta_statement")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, sqlSyncMetaStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_sync_meta_statement")
    static UpdateDSL<UpdateModel> updateAllColumns(SqlSyncMetaStatement record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalTo(record::getOid)
                .set(fromOid).equalTo(record::getFromOid)
                .set(ignore).equalTo(record::getIgnore)
                .set(likeOid).equalTo(record::getLikeOid)
                .set(restrict).equalTo(record::getRestrict);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_sync_meta_statement")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(SqlSyncMetaStatement record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalToWhenPresent(record::getOid)
                .set(fromOid).equalToWhenPresent(record::getFromOid)
                .set(ignore).equalToWhenPresent(record::getIgnore)
                .set(likeOid).equalToWhenPresent(record::getLikeOid)
                .set(restrict).equalToWhenPresent(record::getRestrict);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_sync_meta_statement")
    default int updateByPrimaryKey(SqlSyncMetaStatement record) {
        return update(c ->
            c.set(fromOid).equalTo(record::getFromOid)
            .set(ignore).equalTo(record::getIgnore)
            .set(likeOid).equalTo(record::getLikeOid)
            .set(restrict).equalTo(record::getRestrict)
            .where(oid, isEqualTo(record::getOid))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_sync_meta_statement")
    default int updateByPrimaryKeySelective(SqlSyncMetaStatement record) {
        return update(c ->
            c.set(fromOid).equalToWhenPresent(record::getFromOid)
            .set(ignore).equalToWhenPresent(record::getIgnore)
            .set(likeOid).equalToWhenPresent(record::getLikeOid)
            .set(restrict).equalToWhenPresent(record::getRestrict)
            .where(oid, isEqualTo(record::getOid))
        );
    }
}