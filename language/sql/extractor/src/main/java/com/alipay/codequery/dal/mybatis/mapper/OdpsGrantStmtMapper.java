package com.alipay.codequery.dal.mybatis.mapper;

import static com.alipay.codequery.dal.mybatis.mapper.OdpsGrantStmtDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.alipay.codequery.dal.mybatis.domain.OdpsGrantStmt;
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
public interface OdpsGrantStmtMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: odps_grant_stmt")
    BasicColumn[] selectList = BasicColumn.columnList(oid, expireOid, isLabel, isSuper, labelOid, subjectType);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: odps_grant_stmt")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: odps_grant_stmt")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: odps_grant_stmt")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<OdpsGrantStmt> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: odps_grant_stmt")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<OdpsGrantStmt> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: odps_grant_stmt")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="expire_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_label", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_super", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="label_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="subject_type", javaType=String.class, jdbcType=JdbcType.VARCHAR)
    })
    Optional<OdpsGrantStmt> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: odps_grant_stmt")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="expire_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_label", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_super", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="label_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="subject_type", javaType=String.class, jdbcType=JdbcType.VARCHAR)
    })
    List<OdpsGrantStmt> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: odps_grant_stmt")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: odps_grant_stmt")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, odpsGrantStmt, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: odps_grant_stmt")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, odpsGrantStmt, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: odps_grant_stmt")
    default int deleteByPrimaryKey(Long oid_) {
        return delete(c -> 
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: odps_grant_stmt")
    default int insert(OdpsGrantStmt record) {
        return MyBatis3Utils.insert(this::insert, record, odpsGrantStmt, c ->
            c.map(oid).toProperty("oid")
            .map(expireOid).toProperty("expireOid")
            .map(isLabel).toProperty("isLabel")
            .map(isSuper).toProperty("isSuper")
            .map(labelOid).toProperty("labelOid")
            .map(subjectType).toProperty("subjectType")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: odps_grant_stmt")
    default int insertMultiple(Collection<OdpsGrantStmt> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, odpsGrantStmt, c ->
            c.map(oid).toProperty("oid")
            .map(expireOid).toProperty("expireOid")
            .map(isLabel).toProperty("isLabel")
            .map(isSuper).toProperty("isSuper")
            .map(labelOid).toProperty("labelOid")
            .map(subjectType).toProperty("subjectType")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: odps_grant_stmt")
    default int insertSelective(OdpsGrantStmt record) {
        return MyBatis3Utils.insert(this::insert, record, odpsGrantStmt, c ->
            c.map(oid).toPropertyWhenPresent("oid", record::getOid)
            .map(expireOid).toPropertyWhenPresent("expireOid", record::getExpireOid)
            .map(isLabel).toPropertyWhenPresent("isLabel", record::getIsLabel)
            .map(isSuper).toPropertyWhenPresent("isSuper", record::getIsSuper)
            .map(labelOid).toPropertyWhenPresent("labelOid", record::getLabelOid)
            .map(subjectType).toPropertyWhenPresent("subjectType", record::getSubjectType)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: odps_grant_stmt")
    default Optional<OdpsGrantStmt> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, odpsGrantStmt, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: odps_grant_stmt")
    default List<OdpsGrantStmt> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, odpsGrantStmt, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: odps_grant_stmt")
    default List<OdpsGrantStmt> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, odpsGrantStmt, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: odps_grant_stmt")
    default Optional<OdpsGrantStmt> selectByPrimaryKey(Long oid_) {
        return selectOne(c ->
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: odps_grant_stmt")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, odpsGrantStmt, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: odps_grant_stmt")
    static UpdateDSL<UpdateModel> updateAllColumns(OdpsGrantStmt record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalTo(record::getOid)
                .set(expireOid).equalTo(record::getExpireOid)
                .set(isLabel).equalTo(record::getIsLabel)
                .set(isSuper).equalTo(record::getIsSuper)
                .set(labelOid).equalTo(record::getLabelOid)
                .set(subjectType).equalTo(record::getSubjectType);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: odps_grant_stmt")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(OdpsGrantStmt record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalToWhenPresent(record::getOid)
                .set(expireOid).equalToWhenPresent(record::getExpireOid)
                .set(isLabel).equalToWhenPresent(record::getIsLabel)
                .set(isSuper).equalToWhenPresent(record::getIsSuper)
                .set(labelOid).equalToWhenPresent(record::getLabelOid)
                .set(subjectType).equalToWhenPresent(record::getSubjectType);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: odps_grant_stmt")
    default int updateByPrimaryKey(OdpsGrantStmt record) {
        return update(c ->
            c.set(expireOid).equalTo(record::getExpireOid)
            .set(isLabel).equalTo(record::getIsLabel)
            .set(isSuper).equalTo(record::getIsSuper)
            .set(labelOid).equalTo(record::getLabelOid)
            .set(subjectType).equalTo(record::getSubjectType)
            .where(oid, isEqualTo(record::getOid))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: odps_grant_stmt")
    default int updateByPrimaryKeySelective(OdpsGrantStmt record) {
        return update(c ->
            c.set(expireOid).equalToWhenPresent(record::getExpireOid)
            .set(isLabel).equalToWhenPresent(record::getIsLabel)
            .set(isSuper).equalToWhenPresent(record::getIsSuper)
            .set(labelOid).equalToWhenPresent(record::getLabelOid)
            .set(subjectType).equalToWhenPresent(record::getSubjectType)
            .where(oid, isEqualTo(record::getOid))
        );
    }
}