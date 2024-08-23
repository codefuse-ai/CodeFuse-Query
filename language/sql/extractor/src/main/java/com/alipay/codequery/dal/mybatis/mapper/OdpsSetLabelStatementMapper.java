package com.alipay.codequery.dal.mybatis.mapper;

import static com.alipay.codequery.dal.mybatis.mapper.OdpsSetLabelStatementDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.alipay.codequery.dal.mybatis.domain.OdpsSetLabelStatement;
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
public interface OdpsSetLabelStatementMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: odps_set_label_statement")
    BasicColumn[] selectList = BasicColumn.columnList(oid, label, projectOid, tableOid, userOid);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: odps_set_label_statement")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: odps_set_label_statement")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: odps_set_label_statement")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<OdpsSetLabelStatement> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: odps_set_label_statement")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<OdpsSetLabelStatement> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: odps_set_label_statement")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="label", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="project_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="table_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="user_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT)
    })
    Optional<OdpsSetLabelStatement> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: odps_set_label_statement")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="label", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="project_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="table_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="user_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT)
    })
    List<OdpsSetLabelStatement> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: odps_set_label_statement")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: odps_set_label_statement")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, odpsSetLabelStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: odps_set_label_statement")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, odpsSetLabelStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: odps_set_label_statement")
    default int deleteByPrimaryKey(Long oid_) {
        return delete(c -> 
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: odps_set_label_statement")
    default int insert(OdpsSetLabelStatement record) {
        return MyBatis3Utils.insert(this::insert, record, odpsSetLabelStatement, c ->
            c.map(oid).toProperty("oid")
            .map(label).toProperty("label")
            .map(projectOid).toProperty("projectOid")
            .map(tableOid).toProperty("tableOid")
            .map(userOid).toProperty("userOid")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: odps_set_label_statement")
    default int insertMultiple(Collection<OdpsSetLabelStatement> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, odpsSetLabelStatement, c ->
            c.map(oid).toProperty("oid")
            .map(label).toProperty("label")
            .map(projectOid).toProperty("projectOid")
            .map(tableOid).toProperty("tableOid")
            .map(userOid).toProperty("userOid")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: odps_set_label_statement")
    default int insertSelective(OdpsSetLabelStatement record) {
        return MyBatis3Utils.insert(this::insert, record, odpsSetLabelStatement, c ->
            c.map(oid).toPropertyWhenPresent("oid", record::getOid)
            .map(label).toPropertyWhenPresent("label", record::getLabel)
            .map(projectOid).toPropertyWhenPresent("projectOid", record::getProjectOid)
            .map(tableOid).toPropertyWhenPresent("tableOid", record::getTableOid)
            .map(userOid).toPropertyWhenPresent("userOid", record::getUserOid)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: odps_set_label_statement")
    default Optional<OdpsSetLabelStatement> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, odpsSetLabelStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: odps_set_label_statement")
    default List<OdpsSetLabelStatement> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, odpsSetLabelStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: odps_set_label_statement")
    default List<OdpsSetLabelStatement> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, odpsSetLabelStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: odps_set_label_statement")
    default Optional<OdpsSetLabelStatement> selectByPrimaryKey(Long oid_) {
        return selectOne(c ->
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: odps_set_label_statement")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, odpsSetLabelStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: odps_set_label_statement")
    static UpdateDSL<UpdateModel> updateAllColumns(OdpsSetLabelStatement record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalTo(record::getOid)
                .set(label).equalTo(record::getLabel)
                .set(projectOid).equalTo(record::getProjectOid)
                .set(tableOid).equalTo(record::getTableOid)
                .set(userOid).equalTo(record::getUserOid);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: odps_set_label_statement")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(OdpsSetLabelStatement record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalToWhenPresent(record::getOid)
                .set(label).equalToWhenPresent(record::getLabel)
                .set(projectOid).equalToWhenPresent(record::getProjectOid)
                .set(tableOid).equalToWhenPresent(record::getTableOid)
                .set(userOid).equalToWhenPresent(record::getUserOid);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: odps_set_label_statement")
    default int updateByPrimaryKey(OdpsSetLabelStatement record) {
        return update(c ->
            c.set(label).equalTo(record::getLabel)
            .set(projectOid).equalTo(record::getProjectOid)
            .set(tableOid).equalTo(record::getTableOid)
            .set(userOid).equalTo(record::getUserOid)
            .where(oid, isEqualTo(record::getOid))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: odps_set_label_statement")
    default int updateByPrimaryKeySelective(OdpsSetLabelStatement record) {
        return update(c ->
            c.set(label).equalToWhenPresent(record::getLabel)
            .set(projectOid).equalToWhenPresent(record::getProjectOid)
            .set(tableOid).equalToWhenPresent(record::getTableOid)
            .set(userOid).equalToWhenPresent(record::getUserOid)
            .where(oid, isEqualTo(record::getOid))
        );
    }
}