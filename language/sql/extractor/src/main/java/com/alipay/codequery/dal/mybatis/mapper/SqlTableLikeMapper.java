package com.alipay.codequery.dal.mybatis.mapper;

import static com.alipay.codequery.dal.mybatis.mapper.SqlTableLikeDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.alipay.codequery.dal.mybatis.domain.SqlTableLike;
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
public interface SqlTableLikeMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_table_like")
    BasicColumn[] selectList = BasicColumn.columnList(oid, isExcludeProperties, isIncludeProperties, tableOid);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_table_like")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_table_like")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_table_like")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<SqlTableLike> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_table_like")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<SqlTableLike> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_table_like")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="is_exclude_properties", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_include_properties", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="table_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT)
    })
    Optional<SqlTableLike> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_table_like")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="is_exclude_properties", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_include_properties", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="table_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT)
    })
    List<SqlTableLike> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_table_like")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_table_like")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, sqlTableLike, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_table_like")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, sqlTableLike, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_table_like")
    default int deleteByPrimaryKey(Long oid_) {
        return delete(c -> 
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_table_like")
    default int insert(SqlTableLike record) {
        return MyBatis3Utils.insert(this::insert, record, sqlTableLike, c ->
            c.map(oid).toProperty("oid")
            .map(isExcludeProperties).toProperty("isExcludeProperties")
            .map(isIncludeProperties).toProperty("isIncludeProperties")
            .map(tableOid).toProperty("tableOid")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_table_like")
    default int insertMultiple(Collection<SqlTableLike> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, sqlTableLike, c ->
            c.map(oid).toProperty("oid")
            .map(isExcludeProperties).toProperty("isExcludeProperties")
            .map(isIncludeProperties).toProperty("isIncludeProperties")
            .map(tableOid).toProperty("tableOid")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_table_like")
    default int insertSelective(SqlTableLike record) {
        return MyBatis3Utils.insert(this::insert, record, sqlTableLike, c ->
            c.map(oid).toPropertyWhenPresent("oid", record::getOid)
            .map(isExcludeProperties).toPropertyWhenPresent("isExcludeProperties", record::getIsExcludeProperties)
            .map(isIncludeProperties).toPropertyWhenPresent("isIncludeProperties", record::getIsIncludeProperties)
            .map(tableOid).toPropertyWhenPresent("tableOid", record::getTableOid)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_table_like")
    default Optional<SqlTableLike> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, sqlTableLike, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_table_like")
    default List<SqlTableLike> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, sqlTableLike, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_table_like")
    default List<SqlTableLike> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, sqlTableLike, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_table_like")
    default Optional<SqlTableLike> selectByPrimaryKey(Long oid_) {
        return selectOne(c ->
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_table_like")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, sqlTableLike, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_table_like")
    static UpdateDSL<UpdateModel> updateAllColumns(SqlTableLike record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalTo(record::getOid)
                .set(isExcludeProperties).equalTo(record::getIsExcludeProperties)
                .set(isIncludeProperties).equalTo(record::getIsIncludeProperties)
                .set(tableOid).equalTo(record::getTableOid);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_table_like")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(SqlTableLike record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalToWhenPresent(record::getOid)
                .set(isExcludeProperties).equalToWhenPresent(record::getIsExcludeProperties)
                .set(isIncludeProperties).equalToWhenPresent(record::getIsIncludeProperties)
                .set(tableOid).equalToWhenPresent(record::getTableOid);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_table_like")
    default int updateByPrimaryKey(SqlTableLike record) {
        return update(c ->
            c.set(isExcludeProperties).equalTo(record::getIsExcludeProperties)
            .set(isIncludeProperties).equalTo(record::getIsIncludeProperties)
            .set(tableOid).equalTo(record::getTableOid)
            .where(oid, isEqualTo(record::getOid))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_table_like")
    default int updateByPrimaryKeySelective(SqlTableLike record) {
        return update(c ->
            c.set(isExcludeProperties).equalToWhenPresent(record::getIsExcludeProperties)
            .set(isIncludeProperties).equalToWhenPresent(record::getIsIncludeProperties)
            .set(tableOid).equalToWhenPresent(record::getTableOid)
            .where(oid, isEqualTo(record::getOid))
        );
    }
}