package com.alipay.codequery.dal.mybatis.mapper;

import static com.alipay.codequery.dal.mybatis.mapper.OracleSelectUnPivotDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.alipay.codequery.dal.mybatis.domain.OracleSelectUnPivot;
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
public interface OracleSelectUnPivotMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_select_un_pivot")
    BasicColumn[] selectList = BasicColumn.columnList(oid, nullsIncludeType, pivotIn);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_select_un_pivot")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_select_un_pivot")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_select_un_pivot")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<OracleSelectUnPivot> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_select_un_pivot")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<OracleSelectUnPivot> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_select_un_pivot")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="nulls_include_type", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="pivot_in", javaType=String.class, jdbcType=JdbcType.VARCHAR)
    })
    Optional<OracleSelectUnPivot> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_select_un_pivot")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="nulls_include_type", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="pivot_in", javaType=String.class, jdbcType=JdbcType.VARCHAR)
    })
    List<OracleSelectUnPivot> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_select_un_pivot")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_select_un_pivot")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, oracleSelectUnPivot, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_select_un_pivot")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, oracleSelectUnPivot, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_select_un_pivot")
    default int deleteByPrimaryKey(Long oid_) {
        return delete(c -> 
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_select_un_pivot")
    default int insert(OracleSelectUnPivot record) {
        return MyBatis3Utils.insert(this::insert, record, oracleSelectUnPivot, c ->
            c.map(oid).toProperty("oid")
            .map(nullsIncludeType).toProperty("nullsIncludeType")
            .map(pivotIn).toProperty("pivotIn")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_select_un_pivot")
    default int insertMultiple(Collection<OracleSelectUnPivot> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, oracleSelectUnPivot, c ->
            c.map(oid).toProperty("oid")
            .map(nullsIncludeType).toProperty("nullsIncludeType")
            .map(pivotIn).toProperty("pivotIn")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_select_un_pivot")
    default int insertSelective(OracleSelectUnPivot record) {
        return MyBatis3Utils.insert(this::insert, record, oracleSelectUnPivot, c ->
            c.map(oid).toPropertyWhenPresent("oid", record::getOid)
            .map(nullsIncludeType).toPropertyWhenPresent("nullsIncludeType", record::getNullsIncludeType)
            .map(pivotIn).toPropertyWhenPresent("pivotIn", record::getPivotIn)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_select_un_pivot")
    default Optional<OracleSelectUnPivot> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, oracleSelectUnPivot, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_select_un_pivot")
    default List<OracleSelectUnPivot> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, oracleSelectUnPivot, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_select_un_pivot")
    default List<OracleSelectUnPivot> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, oracleSelectUnPivot, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_select_un_pivot")
    default Optional<OracleSelectUnPivot> selectByPrimaryKey(Long oid_) {
        return selectOne(c ->
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_select_un_pivot")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, oracleSelectUnPivot, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_select_un_pivot")
    static UpdateDSL<UpdateModel> updateAllColumns(OracleSelectUnPivot record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalTo(record::getOid)
                .set(nullsIncludeType).equalTo(record::getNullsIncludeType)
                .set(pivotIn).equalTo(record::getPivotIn);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_select_un_pivot")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(OracleSelectUnPivot record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalToWhenPresent(record::getOid)
                .set(nullsIncludeType).equalToWhenPresent(record::getNullsIncludeType)
                .set(pivotIn).equalToWhenPresent(record::getPivotIn);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_select_un_pivot")
    default int updateByPrimaryKey(OracleSelectUnPivot record) {
        return update(c ->
            c.set(nullsIncludeType).equalTo(record::getNullsIncludeType)
            .set(pivotIn).equalTo(record::getPivotIn)
            .where(oid, isEqualTo(record::getOid))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_select_un_pivot")
    default int updateByPrimaryKeySelective(OracleSelectUnPivot record) {
        return update(c ->
            c.set(nullsIncludeType).equalToWhenPresent(record::getNullsIncludeType)
            .set(pivotIn).equalToWhenPresent(record::getPivotIn)
            .where(oid, isEqualTo(record::getOid))
        );
    }
}