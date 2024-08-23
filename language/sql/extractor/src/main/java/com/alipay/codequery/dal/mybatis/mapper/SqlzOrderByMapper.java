package com.alipay.codequery.dal.mybatis.mapper;

import static com.alipay.codequery.dal.mybatis.mapper.SqlzOrderByDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.alipay.codequery.dal.mybatis.domain.SqlzOrderBy;
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
public interface SqlzOrderByMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sqlz_order_by")
    BasicColumn[] selectList = BasicColumn.columnList(oid, isSibings);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sqlz_order_by")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sqlz_order_by")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sqlz_order_by")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<SqlzOrderBy> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sqlz_order_by")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<SqlzOrderBy> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sqlz_order_by")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="is_sibings", javaType=Integer.class, jdbcType=JdbcType.BIGINT)
    })
    Optional<SqlzOrderBy> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sqlz_order_by")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="is_sibings", javaType=Integer.class, jdbcType=JdbcType.BIGINT)
    })
    List<SqlzOrderBy> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sqlz_order_by")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sqlz_order_by")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, sqlzOrderBy, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sqlz_order_by")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, sqlzOrderBy, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sqlz_order_by")
    default int deleteByPrimaryKey(Long oid_) {
        return delete(c -> 
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sqlz_order_by")
    default int insert(SqlzOrderBy record) {
        return MyBatis3Utils.insert(this::insert, record, sqlzOrderBy, c ->
            c.map(oid).toProperty("oid")
            .map(isSibings).toProperty("isSibings")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sqlz_order_by")
    default int insertMultiple(Collection<SqlzOrderBy> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, sqlzOrderBy, c ->
            c.map(oid).toProperty("oid")
            .map(isSibings).toProperty("isSibings")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sqlz_order_by")
    default int insertSelective(SqlzOrderBy record) {
        return MyBatis3Utils.insert(this::insert, record, sqlzOrderBy, c ->
            c.map(oid).toPropertyWhenPresent("oid", record::getOid)
            .map(isSibings).toPropertyWhenPresent("isSibings", record::getIsSibings)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sqlz_order_by")
    default Optional<SqlzOrderBy> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, sqlzOrderBy, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sqlz_order_by")
    default List<SqlzOrderBy> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, sqlzOrderBy, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sqlz_order_by")
    default List<SqlzOrderBy> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, sqlzOrderBy, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sqlz_order_by")
    default Optional<SqlzOrderBy> selectByPrimaryKey(Long oid_) {
        return selectOne(c ->
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sqlz_order_by")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, sqlzOrderBy, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sqlz_order_by")
    static UpdateDSL<UpdateModel> updateAllColumns(SqlzOrderBy record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalTo(record::getOid)
                .set(isSibings).equalTo(record::getIsSibings);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sqlz_order_by")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(SqlzOrderBy record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalToWhenPresent(record::getOid)
                .set(isSibings).equalToWhenPresent(record::getIsSibings);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sqlz_order_by")
    default int updateByPrimaryKey(SqlzOrderBy record) {
        return update(c ->
            c.set(isSibings).equalTo(record::getIsSibings)
            .where(oid, isEqualTo(record::getOid))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sqlz_order_by")
    default int updateByPrimaryKeySelective(SqlzOrderBy record) {
        return update(c ->
            c.set(isSibings).equalToWhenPresent(record::getIsSibings)
            .where(oid, isEqualTo(record::getOid))
        );
    }
}