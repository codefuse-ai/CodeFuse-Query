package com.alipay.codequery.dal.mybatis.mapper;

import static com.alipay.codequery.dal.mybatis.mapper.OracleSupplementalLogGrpDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.alipay.codequery.dal.mybatis.domain.OracleSupplementalLogGrp;
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
public interface OracleSupplementalLogGrpMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_supplemental_log_grp")
    BasicColumn[] selectList = BasicColumn.columnList(oid, groupOid, isAlways);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_supplemental_log_grp")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_supplemental_log_grp")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_supplemental_log_grp")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<OracleSupplementalLogGrp> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_supplemental_log_grp")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<OracleSupplementalLogGrp> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_supplemental_log_grp")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="group_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_always", javaType=Integer.class, jdbcType=JdbcType.BIGINT)
    })
    Optional<OracleSupplementalLogGrp> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_supplemental_log_grp")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="group_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_always", javaType=Integer.class, jdbcType=JdbcType.BIGINT)
    })
    List<OracleSupplementalLogGrp> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_supplemental_log_grp")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_supplemental_log_grp")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, oracleSupplementalLogGrp, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_supplemental_log_grp")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, oracleSupplementalLogGrp, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_supplemental_log_grp")
    default int deleteByPrimaryKey(Long oid_) {
        return delete(c -> 
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_supplemental_log_grp")
    default int insert(OracleSupplementalLogGrp record) {
        return MyBatis3Utils.insert(this::insert, record, oracleSupplementalLogGrp, c ->
            c.map(oid).toProperty("oid")
            .map(groupOid).toProperty("groupOid")
            .map(isAlways).toProperty("isAlways")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_supplemental_log_grp")
    default int insertMultiple(Collection<OracleSupplementalLogGrp> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, oracleSupplementalLogGrp, c ->
            c.map(oid).toProperty("oid")
            .map(groupOid).toProperty("groupOid")
            .map(isAlways).toProperty("isAlways")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_supplemental_log_grp")
    default int insertSelective(OracleSupplementalLogGrp record) {
        return MyBatis3Utils.insert(this::insert, record, oracleSupplementalLogGrp, c ->
            c.map(oid).toPropertyWhenPresent("oid", record::getOid)
            .map(groupOid).toPropertyWhenPresent("groupOid", record::getGroupOid)
            .map(isAlways).toPropertyWhenPresent("isAlways", record::getIsAlways)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_supplemental_log_grp")
    default Optional<OracleSupplementalLogGrp> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, oracleSupplementalLogGrp, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_supplemental_log_grp")
    default List<OracleSupplementalLogGrp> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, oracleSupplementalLogGrp, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_supplemental_log_grp")
    default List<OracleSupplementalLogGrp> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, oracleSupplementalLogGrp, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_supplemental_log_grp")
    default Optional<OracleSupplementalLogGrp> selectByPrimaryKey(Long oid_) {
        return selectOne(c ->
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_supplemental_log_grp")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, oracleSupplementalLogGrp, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_supplemental_log_grp")
    static UpdateDSL<UpdateModel> updateAllColumns(OracleSupplementalLogGrp record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalTo(record::getOid)
                .set(groupOid).equalTo(record::getGroupOid)
                .set(isAlways).equalTo(record::getIsAlways);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_supplemental_log_grp")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(OracleSupplementalLogGrp record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalToWhenPresent(record::getOid)
                .set(groupOid).equalToWhenPresent(record::getGroupOid)
                .set(isAlways).equalToWhenPresent(record::getIsAlways);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_supplemental_log_grp")
    default int updateByPrimaryKey(OracleSupplementalLogGrp record) {
        return update(c ->
            c.set(groupOid).equalTo(record::getGroupOid)
            .set(isAlways).equalTo(record::getIsAlways)
            .where(oid, isEqualTo(record::getOid))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_supplemental_log_grp")
    default int updateByPrimaryKeySelective(OracleSupplementalLogGrp record) {
        return update(c ->
            c.set(groupOid).equalToWhenPresent(record::getGroupOid)
            .set(isAlways).equalToWhenPresent(record::getIsAlways)
            .where(oid, isEqualTo(record::getOid))
        );
    }
}