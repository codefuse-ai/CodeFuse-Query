package com.alipay.codequery.dal.mybatis.mapper;

import static com.alipay.codequery.dal.mybatis.mapper.SqlTableSourceImplDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.alipay.codequery.dal.mybatis.domain.SqlTableSourceImpl;
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
public interface SqlTableSourceImplMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_table_source_impl")
    BasicColumn[] selectList = BasicColumn.columnList(oid, alias, alias2, flashbackOid, hintsSize);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_table_source_impl")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_table_source_impl")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_table_source_impl")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<SqlTableSourceImpl> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_table_source_impl")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<SqlTableSourceImpl> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_table_source_impl")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="alias", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="alias2", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="flashback_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="hints_size", javaType=Integer.class, jdbcType=JdbcType.BIGINT)
    })
    Optional<SqlTableSourceImpl> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_table_source_impl")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="alias", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="alias2", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="flashback_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="hints_size", javaType=Integer.class, jdbcType=JdbcType.BIGINT)
    })
    List<SqlTableSourceImpl> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_table_source_impl")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_table_source_impl")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, sqlTableSourceImpl, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_table_source_impl")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, sqlTableSourceImpl, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_table_source_impl")
    default int deleteByPrimaryKey(Long oid_) {
        return delete(c -> 
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_table_source_impl")
    default int insert(SqlTableSourceImpl record) {
        return MyBatis3Utils.insert(this::insert, record, sqlTableSourceImpl, c ->
            c.map(oid).toProperty("oid")
            .map(alias).toProperty("alias")
            .map(alias2).toProperty("alias2")
            .map(flashbackOid).toProperty("flashbackOid")
            .map(hintsSize).toProperty("hintsSize")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_table_source_impl")
    default int insertMultiple(Collection<SqlTableSourceImpl> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, sqlTableSourceImpl, c ->
            c.map(oid).toProperty("oid")
            .map(alias).toProperty("alias")
            .map(alias2).toProperty("alias2")
            .map(flashbackOid).toProperty("flashbackOid")
            .map(hintsSize).toProperty("hintsSize")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_table_source_impl")
    default int insertSelective(SqlTableSourceImpl record) {
        return MyBatis3Utils.insert(this::insert, record, sqlTableSourceImpl, c ->
            c.map(oid).toPropertyWhenPresent("oid", record::getOid)
            .map(alias).toPropertyWhenPresent("alias", record::getAlias)
            .map(alias2).toPropertyWhenPresent("alias2", record::getAlias2)
            .map(flashbackOid).toPropertyWhenPresent("flashbackOid", record::getFlashbackOid)
            .map(hintsSize).toPropertyWhenPresent("hintsSize", record::getHintsSize)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_table_source_impl")
    default Optional<SqlTableSourceImpl> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, sqlTableSourceImpl, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_table_source_impl")
    default List<SqlTableSourceImpl> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, sqlTableSourceImpl, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_table_source_impl")
    default List<SqlTableSourceImpl> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, sqlTableSourceImpl, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_table_source_impl")
    default Optional<SqlTableSourceImpl> selectByPrimaryKey(Long oid_) {
        return selectOne(c ->
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_table_source_impl")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, sqlTableSourceImpl, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_table_source_impl")
    static UpdateDSL<UpdateModel> updateAllColumns(SqlTableSourceImpl record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalTo(record::getOid)
                .set(alias).equalTo(record::getAlias)
                .set(alias2).equalTo(record::getAlias2)
                .set(flashbackOid).equalTo(record::getFlashbackOid)
                .set(hintsSize).equalTo(record::getHintsSize);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_table_source_impl")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(SqlTableSourceImpl record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalToWhenPresent(record::getOid)
                .set(alias).equalToWhenPresent(record::getAlias)
                .set(alias2).equalToWhenPresent(record::getAlias2)
                .set(flashbackOid).equalToWhenPresent(record::getFlashbackOid)
                .set(hintsSize).equalToWhenPresent(record::getHintsSize);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_table_source_impl")
    default int updateByPrimaryKey(SqlTableSourceImpl record) {
        return update(c ->
            c.set(alias).equalTo(record::getAlias)
            .set(alias2).equalTo(record::getAlias2)
            .set(flashbackOid).equalTo(record::getFlashbackOid)
            .set(hintsSize).equalTo(record::getHintsSize)
            .where(oid, isEqualTo(record::getOid))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_table_source_impl")
    default int updateByPrimaryKeySelective(SqlTableSourceImpl record) {
        return update(c ->
            c.set(alias).equalToWhenPresent(record::getAlias)
            .set(alias2).equalToWhenPresent(record::getAlias2)
            .set(flashbackOid).equalToWhenPresent(record::getFlashbackOid)
            .set(hintsSize).equalToWhenPresent(record::getHintsSize)
            .where(oid, isEqualTo(record::getOid))
        );
    }
}