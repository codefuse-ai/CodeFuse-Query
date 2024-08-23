package com.alipay.codequery.dal.mybatis.mapper;

import static com.alipay.codequery.dal.mybatis.mapper.SqlAnnIndexDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.alipay.codequery.dal.mybatis.domain.SqlAnnIndex;
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
public interface SqlAnnIndexMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_ann_index")
    BasicColumn[] selectList = BasicColumn.columnList(oid, distance, indexType, rtIndexType);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_ann_index")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_ann_index")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_ann_index")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<SqlAnnIndex> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_ann_index")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<SqlAnnIndex> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_ann_index")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="distance", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="index_type", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="rt_index_type", javaType=Integer.class, jdbcType=JdbcType.BIGINT)
    })
    Optional<SqlAnnIndex> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_ann_index")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="distance", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="index_type", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="rt_index_type", javaType=Integer.class, jdbcType=JdbcType.BIGINT)
    })
    List<SqlAnnIndex> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_ann_index")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_ann_index")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, sqlAnnIndex, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_ann_index")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, sqlAnnIndex, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_ann_index")
    default int deleteByPrimaryKey(Long oid_) {
        return delete(c -> 
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_ann_index")
    default int insert(SqlAnnIndex record) {
        return MyBatis3Utils.insert(this::insert, record, sqlAnnIndex, c ->
            c.map(oid).toProperty("oid")
            .map(distance).toProperty("distance")
            .map(indexType).toProperty("indexType")
            .map(rtIndexType).toProperty("rtIndexType")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_ann_index")
    default int insertMultiple(Collection<SqlAnnIndex> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, sqlAnnIndex, c ->
            c.map(oid).toProperty("oid")
            .map(distance).toProperty("distance")
            .map(indexType).toProperty("indexType")
            .map(rtIndexType).toProperty("rtIndexType")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_ann_index")
    default int insertSelective(SqlAnnIndex record) {
        return MyBatis3Utils.insert(this::insert, record, sqlAnnIndex, c ->
            c.map(oid).toPropertyWhenPresent("oid", record::getOid)
            .map(distance).toPropertyWhenPresent("distance", record::getDistance)
            .map(indexType).toPropertyWhenPresent("indexType", record::getIndexType)
            .map(rtIndexType).toPropertyWhenPresent("rtIndexType", record::getRtIndexType)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_ann_index")
    default Optional<SqlAnnIndex> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, sqlAnnIndex, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_ann_index")
    default List<SqlAnnIndex> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, sqlAnnIndex, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_ann_index")
    default List<SqlAnnIndex> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, sqlAnnIndex, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_ann_index")
    default Optional<SqlAnnIndex> selectByPrimaryKey(Long oid_) {
        return selectOne(c ->
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_ann_index")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, sqlAnnIndex, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_ann_index")
    static UpdateDSL<UpdateModel> updateAllColumns(SqlAnnIndex record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalTo(record::getOid)
                .set(distance).equalTo(record::getDistance)
                .set(indexType).equalTo(record::getIndexType)
                .set(rtIndexType).equalTo(record::getRtIndexType);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_ann_index")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(SqlAnnIndex record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalToWhenPresent(record::getOid)
                .set(distance).equalToWhenPresent(record::getDistance)
                .set(indexType).equalToWhenPresent(record::getIndexType)
                .set(rtIndexType).equalToWhenPresent(record::getRtIndexType);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_ann_index")
    default int updateByPrimaryKey(SqlAnnIndex record) {
        return update(c ->
            c.set(distance).equalTo(record::getDistance)
            .set(indexType).equalTo(record::getIndexType)
            .set(rtIndexType).equalTo(record::getRtIndexType)
            .where(oid, isEqualTo(record::getOid))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_ann_index")
    default int updateByPrimaryKeySelective(SqlAnnIndex record) {
        return update(c ->
            c.set(distance).equalToWhenPresent(record::getDistance)
            .set(indexType).equalToWhenPresent(record::getIndexType)
            .set(rtIndexType).equalToWhenPresent(record::getRtIndexType)
            .where(oid, isEqualTo(record::getOid))
        );
    }
}