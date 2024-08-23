package com.alipay.codequery.dal.mybatis.mapper;

import static com.alipay.codequery.dal.mybatis.mapper.SqlColumnReferenceDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.alipay.codequery.dal.mybatis.domain.SqlColumnReference;
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
public interface SqlColumnReferenceMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_column_reference")
    BasicColumn[] selectList = BasicColumn.columnList(oid, onDelete, onUpdate, referenceMatch, tableOid);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_column_reference")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_column_reference")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_column_reference")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<SqlColumnReference> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_column_reference")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<SqlColumnReference> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_column_reference")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="on_delete", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="on_update", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="reference_match", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="table_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT)
    })
    Optional<SqlColumnReference> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_column_reference")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="on_delete", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="on_update", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="reference_match", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="table_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT)
    })
    List<SqlColumnReference> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_column_reference")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_column_reference")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, sqlColumnReference, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_column_reference")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, sqlColumnReference, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_column_reference")
    default int deleteByPrimaryKey(Long oid_) {
        return delete(c -> 
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_column_reference")
    default int insert(SqlColumnReference record) {
        return MyBatis3Utils.insert(this::insert, record, sqlColumnReference, c ->
            c.map(oid).toProperty("oid")
            .map(onDelete).toProperty("onDelete")
            .map(onUpdate).toProperty("onUpdate")
            .map(referenceMatch).toProperty("referenceMatch")
            .map(tableOid).toProperty("tableOid")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_column_reference")
    default int insertMultiple(Collection<SqlColumnReference> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, sqlColumnReference, c ->
            c.map(oid).toProperty("oid")
            .map(onDelete).toProperty("onDelete")
            .map(onUpdate).toProperty("onUpdate")
            .map(referenceMatch).toProperty("referenceMatch")
            .map(tableOid).toProperty("tableOid")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_column_reference")
    default int insertSelective(SqlColumnReference record) {
        return MyBatis3Utils.insert(this::insert, record, sqlColumnReference, c ->
            c.map(oid).toPropertyWhenPresent("oid", record::getOid)
            .map(onDelete).toPropertyWhenPresent("onDelete", record::getOnDelete)
            .map(onUpdate).toPropertyWhenPresent("onUpdate", record::getOnUpdate)
            .map(referenceMatch).toPropertyWhenPresent("referenceMatch", record::getReferenceMatch)
            .map(tableOid).toPropertyWhenPresent("tableOid", record::getTableOid)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_column_reference")
    default Optional<SqlColumnReference> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, sqlColumnReference, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_column_reference")
    default List<SqlColumnReference> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, sqlColumnReference, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_column_reference")
    default List<SqlColumnReference> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, sqlColumnReference, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_column_reference")
    default Optional<SqlColumnReference> selectByPrimaryKey(Long oid_) {
        return selectOne(c ->
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_column_reference")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, sqlColumnReference, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_column_reference")
    static UpdateDSL<UpdateModel> updateAllColumns(SqlColumnReference record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalTo(record::getOid)
                .set(onDelete).equalTo(record::getOnDelete)
                .set(onUpdate).equalTo(record::getOnUpdate)
                .set(referenceMatch).equalTo(record::getReferenceMatch)
                .set(tableOid).equalTo(record::getTableOid);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_column_reference")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(SqlColumnReference record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalToWhenPresent(record::getOid)
                .set(onDelete).equalToWhenPresent(record::getOnDelete)
                .set(onUpdate).equalToWhenPresent(record::getOnUpdate)
                .set(referenceMatch).equalToWhenPresent(record::getReferenceMatch)
                .set(tableOid).equalToWhenPresent(record::getTableOid);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_column_reference")
    default int updateByPrimaryKey(SqlColumnReference record) {
        return update(c ->
            c.set(onDelete).equalTo(record::getOnDelete)
            .set(onUpdate).equalTo(record::getOnUpdate)
            .set(referenceMatch).equalTo(record::getReferenceMatch)
            .set(tableOid).equalTo(record::getTableOid)
            .where(oid, isEqualTo(record::getOid))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_column_reference")
    default int updateByPrimaryKeySelective(SqlColumnReference record) {
        return update(c ->
            c.set(onDelete).equalToWhenPresent(record::getOnDelete)
            .set(onUpdate).equalToWhenPresent(record::getOnUpdate)
            .set(referenceMatch).equalToWhenPresent(record::getReferenceMatch)
            .set(tableOid).equalToWhenPresent(record::getTableOid)
            .where(oid, isEqualTo(record::getOid))
        );
    }
}