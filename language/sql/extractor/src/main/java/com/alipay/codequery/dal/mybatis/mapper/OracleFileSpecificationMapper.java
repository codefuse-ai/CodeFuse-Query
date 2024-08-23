package com.alipay.codequery.dal.mybatis.mapper;

import static com.alipay.codequery.dal.mybatis.mapper.OracleFileSpecificationDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.alipay.codequery.dal.mybatis.domain.OracleFileSpecification;
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
public interface OracleFileSpecificationMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_file_specification")
    BasicColumn[] selectList = BasicColumn.columnList(oid, autoExtendOnOid, isAutoExtendOff, sizeOid);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_file_specification")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_file_specification")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_file_specification")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<OracleFileSpecification> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_file_specification")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<OracleFileSpecification> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_file_specification")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="auto_extend_on_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_auto_extend_off", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="size_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT)
    })
    Optional<OracleFileSpecification> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_file_specification")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="auto_extend_on_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_auto_extend_off", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="size_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT)
    })
    List<OracleFileSpecification> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_file_specification")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_file_specification")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, oracleFileSpecification, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_file_specification")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, oracleFileSpecification, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_file_specification")
    default int deleteByPrimaryKey(Long oid_) {
        return delete(c -> 
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_file_specification")
    default int insert(OracleFileSpecification record) {
        return MyBatis3Utils.insert(this::insert, record, oracleFileSpecification, c ->
            c.map(oid).toProperty("oid")
            .map(autoExtendOnOid).toProperty("autoExtendOnOid")
            .map(isAutoExtendOff).toProperty("isAutoExtendOff")
            .map(sizeOid).toProperty("sizeOid")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_file_specification")
    default int insertMultiple(Collection<OracleFileSpecification> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, oracleFileSpecification, c ->
            c.map(oid).toProperty("oid")
            .map(autoExtendOnOid).toProperty("autoExtendOnOid")
            .map(isAutoExtendOff).toProperty("isAutoExtendOff")
            .map(sizeOid).toProperty("sizeOid")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_file_specification")
    default int insertSelective(OracleFileSpecification record) {
        return MyBatis3Utils.insert(this::insert, record, oracleFileSpecification, c ->
            c.map(oid).toPropertyWhenPresent("oid", record::getOid)
            .map(autoExtendOnOid).toPropertyWhenPresent("autoExtendOnOid", record::getAutoExtendOnOid)
            .map(isAutoExtendOff).toPropertyWhenPresent("isAutoExtendOff", record::getIsAutoExtendOff)
            .map(sizeOid).toPropertyWhenPresent("sizeOid", record::getSizeOid)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_file_specification")
    default Optional<OracleFileSpecification> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, oracleFileSpecification, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_file_specification")
    default List<OracleFileSpecification> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, oracleFileSpecification, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_file_specification")
    default List<OracleFileSpecification> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, oracleFileSpecification, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_file_specification")
    default Optional<OracleFileSpecification> selectByPrimaryKey(Long oid_) {
        return selectOne(c ->
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_file_specification")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, oracleFileSpecification, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_file_specification")
    static UpdateDSL<UpdateModel> updateAllColumns(OracleFileSpecification record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalTo(record::getOid)
                .set(autoExtendOnOid).equalTo(record::getAutoExtendOnOid)
                .set(isAutoExtendOff).equalTo(record::getIsAutoExtendOff)
                .set(sizeOid).equalTo(record::getSizeOid);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_file_specification")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(OracleFileSpecification record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalToWhenPresent(record::getOid)
                .set(autoExtendOnOid).equalToWhenPresent(record::getAutoExtendOnOid)
                .set(isAutoExtendOff).equalToWhenPresent(record::getIsAutoExtendOff)
                .set(sizeOid).equalToWhenPresent(record::getSizeOid);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_file_specification")
    default int updateByPrimaryKey(OracleFileSpecification record) {
        return update(c ->
            c.set(autoExtendOnOid).equalTo(record::getAutoExtendOnOid)
            .set(isAutoExtendOff).equalTo(record::getIsAutoExtendOff)
            .set(sizeOid).equalTo(record::getSizeOid)
            .where(oid, isEqualTo(record::getOid))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_file_specification")
    default int updateByPrimaryKeySelective(OracleFileSpecification record) {
        return update(c ->
            c.set(autoExtendOnOid).equalToWhenPresent(record::getAutoExtendOnOid)
            .set(isAutoExtendOff).equalToWhenPresent(record::getIsAutoExtendOff)
            .set(sizeOid).equalToWhenPresent(record::getSizeOid)
            .where(oid, isEqualTo(record::getOid))
        );
    }
}