package com.alipay.codequery.dal.mybatis.mapper;

import static com.alipay.codequery.dal.mybatis.mapper.MysqlForeignKeyDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.alipay.codequery.dal.mybatis.domain.MysqlForeignKey;
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
public interface MysqlForeignKeyMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: mysql_foreign_key")
    BasicColumn[] selectList = BasicColumn.columnList(oid, indexNameOid, isHasConstraint, onDelete, onUpdate, referenceMatch);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: mysql_foreign_key")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: mysql_foreign_key")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: mysql_foreign_key")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<MysqlForeignKey> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: mysql_foreign_key")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<MysqlForeignKey> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: mysql_foreign_key")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="index_name_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_has_constraint", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="on_delete", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="on_update", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="reference_match", javaType=String.class, jdbcType=JdbcType.VARCHAR)
    })
    Optional<MysqlForeignKey> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: mysql_foreign_key")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="index_name_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_has_constraint", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="on_delete", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="on_update", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="reference_match", javaType=String.class, jdbcType=JdbcType.VARCHAR)
    })
    List<MysqlForeignKey> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: mysql_foreign_key")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: mysql_foreign_key")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, mysqlForeignKey, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: mysql_foreign_key")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, mysqlForeignKey, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: mysql_foreign_key")
    default int deleteByPrimaryKey(Long oid_) {
        return delete(c -> 
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: mysql_foreign_key")
    default int insert(MysqlForeignKey record) {
        return MyBatis3Utils.insert(this::insert, record, mysqlForeignKey, c ->
            c.map(oid).toProperty("oid")
            .map(indexNameOid).toProperty("indexNameOid")
            .map(isHasConstraint).toProperty("isHasConstraint")
            .map(onDelete).toProperty("onDelete")
            .map(onUpdate).toProperty("onUpdate")
            .map(referenceMatch).toProperty("referenceMatch")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: mysql_foreign_key")
    default int insertMultiple(Collection<MysqlForeignKey> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, mysqlForeignKey, c ->
            c.map(oid).toProperty("oid")
            .map(indexNameOid).toProperty("indexNameOid")
            .map(isHasConstraint).toProperty("isHasConstraint")
            .map(onDelete).toProperty("onDelete")
            .map(onUpdate).toProperty("onUpdate")
            .map(referenceMatch).toProperty("referenceMatch")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: mysql_foreign_key")
    default int insertSelective(MysqlForeignKey record) {
        return MyBatis3Utils.insert(this::insert, record, mysqlForeignKey, c ->
            c.map(oid).toPropertyWhenPresent("oid", record::getOid)
            .map(indexNameOid).toPropertyWhenPresent("indexNameOid", record::getIndexNameOid)
            .map(isHasConstraint).toPropertyWhenPresent("isHasConstraint", record::getIsHasConstraint)
            .map(onDelete).toPropertyWhenPresent("onDelete", record::getOnDelete)
            .map(onUpdate).toPropertyWhenPresent("onUpdate", record::getOnUpdate)
            .map(referenceMatch).toPropertyWhenPresent("referenceMatch", record::getReferenceMatch)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: mysql_foreign_key")
    default Optional<MysqlForeignKey> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, mysqlForeignKey, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: mysql_foreign_key")
    default List<MysqlForeignKey> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, mysqlForeignKey, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: mysql_foreign_key")
    default List<MysqlForeignKey> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, mysqlForeignKey, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: mysql_foreign_key")
    default Optional<MysqlForeignKey> selectByPrimaryKey(Long oid_) {
        return selectOne(c ->
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: mysql_foreign_key")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, mysqlForeignKey, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: mysql_foreign_key")
    static UpdateDSL<UpdateModel> updateAllColumns(MysqlForeignKey record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalTo(record::getOid)
                .set(indexNameOid).equalTo(record::getIndexNameOid)
                .set(isHasConstraint).equalTo(record::getIsHasConstraint)
                .set(onDelete).equalTo(record::getOnDelete)
                .set(onUpdate).equalTo(record::getOnUpdate)
                .set(referenceMatch).equalTo(record::getReferenceMatch);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: mysql_foreign_key")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(MysqlForeignKey record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalToWhenPresent(record::getOid)
                .set(indexNameOid).equalToWhenPresent(record::getIndexNameOid)
                .set(isHasConstraint).equalToWhenPresent(record::getIsHasConstraint)
                .set(onDelete).equalToWhenPresent(record::getOnDelete)
                .set(onUpdate).equalToWhenPresent(record::getOnUpdate)
                .set(referenceMatch).equalToWhenPresent(record::getReferenceMatch);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: mysql_foreign_key")
    default int updateByPrimaryKey(MysqlForeignKey record) {
        return update(c ->
            c.set(indexNameOid).equalTo(record::getIndexNameOid)
            .set(isHasConstraint).equalTo(record::getIsHasConstraint)
            .set(onDelete).equalTo(record::getOnDelete)
            .set(onUpdate).equalTo(record::getOnUpdate)
            .set(referenceMatch).equalTo(record::getReferenceMatch)
            .where(oid, isEqualTo(record::getOid))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: mysql_foreign_key")
    default int updateByPrimaryKeySelective(MysqlForeignKey record) {
        return update(c ->
            c.set(indexNameOid).equalToWhenPresent(record::getIndexNameOid)
            .set(isHasConstraint).equalToWhenPresent(record::getIsHasConstraint)
            .set(onDelete).equalToWhenPresent(record::getOnDelete)
            .set(onUpdate).equalToWhenPresent(record::getOnUpdate)
            .set(referenceMatch).equalToWhenPresent(record::getReferenceMatch)
            .where(oid, isEqualTo(record::getOid))
        );
    }
}