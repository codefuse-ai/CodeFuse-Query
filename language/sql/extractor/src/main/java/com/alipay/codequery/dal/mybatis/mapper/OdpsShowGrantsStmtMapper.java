package com.alipay.codequery.dal.mybatis.mapper;

import static com.alipay.codequery.dal.mybatis.mapper.OdpsShowGrantsStmtDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.alipay.codequery.dal.mybatis.domain.OdpsShowGrantsStmt;
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
public interface OdpsShowGrantsStmtMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: odps_show_grants_stmt")
    BasicColumn[] selectList = BasicColumn.columnList(oid, isLabel, objectTypeOid, userOid);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: odps_show_grants_stmt")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: odps_show_grants_stmt")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: odps_show_grants_stmt")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<OdpsShowGrantsStmt> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: odps_show_grants_stmt")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<OdpsShowGrantsStmt> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: odps_show_grants_stmt")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="is_label", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="object_type_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="user_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT)
    })
    Optional<OdpsShowGrantsStmt> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: odps_show_grants_stmt")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="is_label", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="object_type_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="user_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT)
    })
    List<OdpsShowGrantsStmt> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: odps_show_grants_stmt")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: odps_show_grants_stmt")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, odpsShowGrantsStmt, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: odps_show_grants_stmt")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, odpsShowGrantsStmt, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: odps_show_grants_stmt")
    default int deleteByPrimaryKey(Long oid_) {
        return delete(c -> 
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: odps_show_grants_stmt")
    default int insert(OdpsShowGrantsStmt record) {
        return MyBatis3Utils.insert(this::insert, record, odpsShowGrantsStmt, c ->
            c.map(oid).toProperty("oid")
            .map(isLabel).toProperty("isLabel")
            .map(objectTypeOid).toProperty("objectTypeOid")
            .map(userOid).toProperty("userOid")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: odps_show_grants_stmt")
    default int insertMultiple(Collection<OdpsShowGrantsStmt> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, odpsShowGrantsStmt, c ->
            c.map(oid).toProperty("oid")
            .map(isLabel).toProperty("isLabel")
            .map(objectTypeOid).toProperty("objectTypeOid")
            .map(userOid).toProperty("userOid")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: odps_show_grants_stmt")
    default int insertSelective(OdpsShowGrantsStmt record) {
        return MyBatis3Utils.insert(this::insert, record, odpsShowGrantsStmt, c ->
            c.map(oid).toPropertyWhenPresent("oid", record::getOid)
            .map(isLabel).toPropertyWhenPresent("isLabel", record::getIsLabel)
            .map(objectTypeOid).toPropertyWhenPresent("objectTypeOid", record::getObjectTypeOid)
            .map(userOid).toPropertyWhenPresent("userOid", record::getUserOid)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: odps_show_grants_stmt")
    default Optional<OdpsShowGrantsStmt> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, odpsShowGrantsStmt, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: odps_show_grants_stmt")
    default List<OdpsShowGrantsStmt> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, odpsShowGrantsStmt, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: odps_show_grants_stmt")
    default List<OdpsShowGrantsStmt> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, odpsShowGrantsStmt, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: odps_show_grants_stmt")
    default Optional<OdpsShowGrantsStmt> selectByPrimaryKey(Long oid_) {
        return selectOne(c ->
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: odps_show_grants_stmt")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, odpsShowGrantsStmt, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: odps_show_grants_stmt")
    static UpdateDSL<UpdateModel> updateAllColumns(OdpsShowGrantsStmt record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalTo(record::getOid)
                .set(isLabel).equalTo(record::getIsLabel)
                .set(objectTypeOid).equalTo(record::getObjectTypeOid)
                .set(userOid).equalTo(record::getUserOid);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: odps_show_grants_stmt")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(OdpsShowGrantsStmt record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalToWhenPresent(record::getOid)
                .set(isLabel).equalToWhenPresent(record::getIsLabel)
                .set(objectTypeOid).equalToWhenPresent(record::getObjectTypeOid)
                .set(userOid).equalToWhenPresent(record::getUserOid);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: odps_show_grants_stmt")
    default int updateByPrimaryKey(OdpsShowGrantsStmt record) {
        return update(c ->
            c.set(isLabel).equalTo(record::getIsLabel)
            .set(objectTypeOid).equalTo(record::getObjectTypeOid)
            .set(userOid).equalTo(record::getUserOid)
            .where(oid, isEqualTo(record::getOid))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: odps_show_grants_stmt")
    default int updateByPrimaryKeySelective(OdpsShowGrantsStmt record) {
        return update(c ->
            c.set(isLabel).equalToWhenPresent(record::getIsLabel)
            .set(objectTypeOid).equalToWhenPresent(record::getObjectTypeOid)
            .set(userOid).equalToWhenPresent(record::getUserOid)
            .where(oid, isEqualTo(record::getOid))
        );
    }
}