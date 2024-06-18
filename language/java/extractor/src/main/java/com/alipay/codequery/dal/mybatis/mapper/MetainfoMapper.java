package com.alipay.codequery.dal.mybatis.mapper;

import static com.alipay.codequery.dal.mybatis.mapper.MetainfoDynamicSqlSupport.*;

import com.alipay.codequery.dal.mybatis.domain.Metainfo;
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
public interface MetainfoMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: metainfo")
    BasicColumn[] selectList = BasicColumn.columnList(oid, kind, value, programHashId);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: metainfo")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: metainfo")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: metainfo")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<Metainfo> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: metainfo")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<Metainfo> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: metainfo")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="kind", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="value", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="program_hash_id", javaType=Long.class, jdbcType=JdbcType.BIGINT)
    })
    Optional<Metainfo> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: metainfo")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="kind", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="value", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="program_hash_id", javaType=Long.class, jdbcType=JdbcType.BIGINT)
    })
    List<Metainfo> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: metainfo")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: metainfo")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, metainfo, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: metainfo")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, metainfo, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: metainfo")
    default int insert(Metainfo record) {
        return MyBatis3Utils.insert(this::insert, record, metainfo, c ->
            c.map(oid).toProperty("oid")
            .map(kind).toProperty("kind")
            .map(value).toProperty("value")
            .map(programHashId).toProperty("programHashId")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: metainfo")
    default int insertMultiple(Collection<Metainfo> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, metainfo, c ->
            c.map(oid).toProperty("oid")
            .map(kind).toProperty("kind")
            .map(value).toProperty("value")
            .map(programHashId).toProperty("programHashId")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: metainfo")
    default int insertSelective(Metainfo record) {
        return MyBatis3Utils.insert(this::insert, record, metainfo, c ->
            c.map(oid).toPropertyWhenPresent("oid", record::getOid)
            .map(kind).toPropertyWhenPresent("kind", record::getKind)
            .map(value).toPropertyWhenPresent("value", record::getValue)
            .map(programHashId).toPropertyWhenPresent("programHashId", record::getProgramHashId)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: metainfo")
    default Optional<Metainfo> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, metainfo, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: metainfo")
    default List<Metainfo> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, metainfo, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: metainfo")
    default List<Metainfo> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, metainfo, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: metainfo")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, metainfo, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: metainfo")
    static UpdateDSL<UpdateModel> updateAllColumns(Metainfo record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalTo(record::getOid)
                .set(kind).equalTo(record::getKind)
                .set(value).equalTo(record::getValue)
                .set(programHashId).equalTo(record::getProgramHashId);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: metainfo")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(Metainfo record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalToWhenPresent(record::getOid)
                .set(kind).equalToWhenPresent(record::getKind)
                .set(value).equalToWhenPresent(record::getValue)
                .set(programHashId).equalToWhenPresent(record::getProgramHashId);
    }
}