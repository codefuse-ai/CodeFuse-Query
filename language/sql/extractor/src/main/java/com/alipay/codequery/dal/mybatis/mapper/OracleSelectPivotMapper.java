package com.alipay.codequery.dal.mybatis.mapper;

import static com.alipay.codequery.dal.mybatis.mapper.OracleSelectPivotDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.alipay.codequery.dal.mybatis.domain.OracleSelectPivot;
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
public interface OracleSelectPivotMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_select_pivot")
    BasicColumn[] selectList = BasicColumn.columnList(oid, isXml, items, pivotIn);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_select_pivot")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_select_pivot")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_select_pivot")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<OracleSelectPivot> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_select_pivot")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<OracleSelectPivot> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_select_pivot")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="is_xml", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="items", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="pivot_in", javaType=String.class, jdbcType=JdbcType.VARCHAR)
    })
    Optional<OracleSelectPivot> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_select_pivot")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="is_xml", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="items", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="pivot_in", javaType=String.class, jdbcType=JdbcType.VARCHAR)
    })
    List<OracleSelectPivot> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_select_pivot")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_select_pivot")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, oracleSelectPivot, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_select_pivot")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, oracleSelectPivot, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_select_pivot")
    default int deleteByPrimaryKey(Long oid_) {
        return delete(c -> 
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_select_pivot")
    default int insert(OracleSelectPivot record) {
        return MyBatis3Utils.insert(this::insert, record, oracleSelectPivot, c ->
            c.map(oid).toProperty("oid")
            .map(isXml).toProperty("isXml")
            .map(items).toProperty("items")
            .map(pivotIn).toProperty("pivotIn")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_select_pivot")
    default int insertMultiple(Collection<OracleSelectPivot> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, oracleSelectPivot, c ->
            c.map(oid).toProperty("oid")
            .map(isXml).toProperty("isXml")
            .map(items).toProperty("items")
            .map(pivotIn).toProperty("pivotIn")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_select_pivot")
    default int insertSelective(OracleSelectPivot record) {
        return MyBatis3Utils.insert(this::insert, record, oracleSelectPivot, c ->
            c.map(oid).toPropertyWhenPresent("oid", record::getOid)
            .map(isXml).toPropertyWhenPresent("isXml", record::getIsXml)
            .map(items).toPropertyWhenPresent("items", record::getItems)
            .map(pivotIn).toPropertyWhenPresent("pivotIn", record::getPivotIn)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_select_pivot")
    default Optional<OracleSelectPivot> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, oracleSelectPivot, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_select_pivot")
    default List<OracleSelectPivot> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, oracleSelectPivot, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_select_pivot")
    default List<OracleSelectPivot> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, oracleSelectPivot, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_select_pivot")
    default Optional<OracleSelectPivot> selectByPrimaryKey(Long oid_) {
        return selectOne(c ->
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_select_pivot")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, oracleSelectPivot, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_select_pivot")
    static UpdateDSL<UpdateModel> updateAllColumns(OracleSelectPivot record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalTo(record::getOid)
                .set(isXml).equalTo(record::getIsXml)
                .set(items).equalTo(record::getItems)
                .set(pivotIn).equalTo(record::getPivotIn);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_select_pivot")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(OracleSelectPivot record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalToWhenPresent(record::getOid)
                .set(isXml).equalToWhenPresent(record::getIsXml)
                .set(items).equalToWhenPresent(record::getItems)
                .set(pivotIn).equalToWhenPresent(record::getPivotIn);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_select_pivot")
    default int updateByPrimaryKey(OracleSelectPivot record) {
        return update(c ->
            c.set(isXml).equalTo(record::getIsXml)
            .set(items).equalTo(record::getItems)
            .set(pivotIn).equalTo(record::getPivotIn)
            .where(oid, isEqualTo(record::getOid))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_select_pivot")
    default int updateByPrimaryKeySelective(OracleSelectPivot record) {
        return update(c ->
            c.set(isXml).equalToWhenPresent(record::getIsXml)
            .set(items).equalToWhenPresent(record::getItems)
            .set(pivotIn).equalToWhenPresent(record::getPivotIn)
            .where(oid, isEqualTo(record::getOid))
        );
    }
}