package com.alipay.codequery.dal.mybatis.mapper;

import static com.alipay.codequery.dal.mybatis.mapper.OracleSupplementalIdKeyDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.alipay.codequery.dal.mybatis.domain.OracleSupplementalIdKey;
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
public interface OracleSupplementalIdKeyMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_supplemental_id_key")
    BasicColumn[] selectList = BasicColumn.columnList(oid, isAll, isForeignKey, isPrimaryKey, isUnique, isUniqueIndex);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_supplemental_id_key")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_supplemental_id_key")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_supplemental_id_key")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<OracleSupplementalIdKey> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_supplemental_id_key")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<OracleSupplementalIdKey> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_supplemental_id_key")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="is_all", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_foreign_key", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_primary_key", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_unique", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_unique_index", javaType=Integer.class, jdbcType=JdbcType.BIGINT)
    })
    Optional<OracleSupplementalIdKey> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_supplemental_id_key")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="is_all", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_foreign_key", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_primary_key", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_unique", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_unique_index", javaType=Integer.class, jdbcType=JdbcType.BIGINT)
    })
    List<OracleSupplementalIdKey> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_supplemental_id_key")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_supplemental_id_key")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, oracleSupplementalIdKey, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_supplemental_id_key")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, oracleSupplementalIdKey, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_supplemental_id_key")
    default int deleteByPrimaryKey(Long oid_) {
        return delete(c -> 
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_supplemental_id_key")
    default int insert(OracleSupplementalIdKey record) {
        return MyBatis3Utils.insert(this::insert, record, oracleSupplementalIdKey, c ->
            c.map(oid).toProperty("oid")
            .map(isAll).toProperty("isAll")
            .map(isForeignKey).toProperty("isForeignKey")
            .map(isPrimaryKey).toProperty("isPrimaryKey")
            .map(isUnique).toProperty("isUnique")
            .map(isUniqueIndex).toProperty("isUniqueIndex")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_supplemental_id_key")
    default int insertMultiple(Collection<OracleSupplementalIdKey> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, oracleSupplementalIdKey, c ->
            c.map(oid).toProperty("oid")
            .map(isAll).toProperty("isAll")
            .map(isForeignKey).toProperty("isForeignKey")
            .map(isPrimaryKey).toProperty("isPrimaryKey")
            .map(isUnique).toProperty("isUnique")
            .map(isUniqueIndex).toProperty("isUniqueIndex")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_supplemental_id_key")
    default int insertSelective(OracleSupplementalIdKey record) {
        return MyBatis3Utils.insert(this::insert, record, oracleSupplementalIdKey, c ->
            c.map(oid).toPropertyWhenPresent("oid", record::getOid)
            .map(isAll).toPropertyWhenPresent("isAll", record::getIsAll)
            .map(isForeignKey).toPropertyWhenPresent("isForeignKey", record::getIsForeignKey)
            .map(isPrimaryKey).toPropertyWhenPresent("isPrimaryKey", record::getIsPrimaryKey)
            .map(isUnique).toPropertyWhenPresent("isUnique", record::getIsUnique)
            .map(isUniqueIndex).toPropertyWhenPresent("isUniqueIndex", record::getIsUniqueIndex)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_supplemental_id_key")
    default Optional<OracleSupplementalIdKey> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, oracleSupplementalIdKey, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_supplemental_id_key")
    default List<OracleSupplementalIdKey> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, oracleSupplementalIdKey, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_supplemental_id_key")
    default List<OracleSupplementalIdKey> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, oracleSupplementalIdKey, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_supplemental_id_key")
    default Optional<OracleSupplementalIdKey> selectByPrimaryKey(Long oid_) {
        return selectOne(c ->
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_supplemental_id_key")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, oracleSupplementalIdKey, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_supplemental_id_key")
    static UpdateDSL<UpdateModel> updateAllColumns(OracleSupplementalIdKey record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalTo(record::getOid)
                .set(isAll).equalTo(record::getIsAll)
                .set(isForeignKey).equalTo(record::getIsForeignKey)
                .set(isPrimaryKey).equalTo(record::getIsPrimaryKey)
                .set(isUnique).equalTo(record::getIsUnique)
                .set(isUniqueIndex).equalTo(record::getIsUniqueIndex);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_supplemental_id_key")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(OracleSupplementalIdKey record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalToWhenPresent(record::getOid)
                .set(isAll).equalToWhenPresent(record::getIsAll)
                .set(isForeignKey).equalToWhenPresent(record::getIsForeignKey)
                .set(isPrimaryKey).equalToWhenPresent(record::getIsPrimaryKey)
                .set(isUnique).equalToWhenPresent(record::getIsUnique)
                .set(isUniqueIndex).equalToWhenPresent(record::getIsUniqueIndex);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_supplemental_id_key")
    default int updateByPrimaryKey(OracleSupplementalIdKey record) {
        return update(c ->
            c.set(isAll).equalTo(record::getIsAll)
            .set(isForeignKey).equalTo(record::getIsForeignKey)
            .set(isPrimaryKey).equalTo(record::getIsPrimaryKey)
            .set(isUnique).equalTo(record::getIsUnique)
            .set(isUniqueIndex).equalTo(record::getIsUniqueIndex)
            .where(oid, isEqualTo(record::getOid))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_supplemental_id_key")
    default int updateByPrimaryKeySelective(OracleSupplementalIdKey record) {
        return update(c ->
            c.set(isAll).equalToWhenPresent(record::getIsAll)
            .set(isForeignKey).equalToWhenPresent(record::getIsForeignKey)
            .set(isPrimaryKey).equalToWhenPresent(record::getIsPrimaryKey)
            .set(isUnique).equalToWhenPresent(record::getIsUnique)
            .set(isUniqueIndex).equalToWhenPresent(record::getIsUniqueIndex)
            .where(oid, isEqualTo(record::getOid))
        );
    }
}