package com.alipay.codequery.dal.mybatis.mapper;

import static com.alipay.codequery.dal.mybatis.mapper.SqlOptimizeStatementDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.alipay.codequery.dal.mybatis.domain.SqlOptimizeStatement;
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
public interface SqlOptimizeStatementMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_optimize_statement")
    BasicColumn[] selectList = BasicColumn.columnList(oid, clusterOid, deduplicateByOid, isDeduplicate, isFinal);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_optimize_statement")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_optimize_statement")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_optimize_statement")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<SqlOptimizeStatement> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_optimize_statement")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<SqlOptimizeStatement> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_optimize_statement")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="cluster_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="deduplicate_by_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_deduplicate", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_final", javaType=Integer.class, jdbcType=JdbcType.BIGINT)
    })
    Optional<SqlOptimizeStatement> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_optimize_statement")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="cluster_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="deduplicate_by_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_deduplicate", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_final", javaType=Integer.class, jdbcType=JdbcType.BIGINT)
    })
    List<SqlOptimizeStatement> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_optimize_statement")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_optimize_statement")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, sqlOptimizeStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_optimize_statement")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, sqlOptimizeStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_optimize_statement")
    default int deleteByPrimaryKey(Long oid_) {
        return delete(c -> 
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_optimize_statement")
    default int insert(SqlOptimizeStatement record) {
        return MyBatis3Utils.insert(this::insert, record, sqlOptimizeStatement, c ->
            c.map(oid).toProperty("oid")
            .map(clusterOid).toProperty("clusterOid")
            .map(deduplicateByOid).toProperty("deduplicateByOid")
            .map(isDeduplicate).toProperty("isDeduplicate")
            .map(isFinal).toProperty("isFinal")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_optimize_statement")
    default int insertMultiple(Collection<SqlOptimizeStatement> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, sqlOptimizeStatement, c ->
            c.map(oid).toProperty("oid")
            .map(clusterOid).toProperty("clusterOid")
            .map(deduplicateByOid).toProperty("deduplicateByOid")
            .map(isDeduplicate).toProperty("isDeduplicate")
            .map(isFinal).toProperty("isFinal")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_optimize_statement")
    default int insertSelective(SqlOptimizeStatement record) {
        return MyBatis3Utils.insert(this::insert, record, sqlOptimizeStatement, c ->
            c.map(oid).toPropertyWhenPresent("oid", record::getOid)
            .map(clusterOid).toPropertyWhenPresent("clusterOid", record::getClusterOid)
            .map(deduplicateByOid).toPropertyWhenPresent("deduplicateByOid", record::getDeduplicateByOid)
            .map(isDeduplicate).toPropertyWhenPresent("isDeduplicate", record::getIsDeduplicate)
            .map(isFinal).toPropertyWhenPresent("isFinal", record::getIsFinal)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_optimize_statement")
    default Optional<SqlOptimizeStatement> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, sqlOptimizeStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_optimize_statement")
    default List<SqlOptimizeStatement> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, sqlOptimizeStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_optimize_statement")
    default List<SqlOptimizeStatement> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, sqlOptimizeStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_optimize_statement")
    default Optional<SqlOptimizeStatement> selectByPrimaryKey(Long oid_) {
        return selectOne(c ->
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_optimize_statement")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, sqlOptimizeStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_optimize_statement")
    static UpdateDSL<UpdateModel> updateAllColumns(SqlOptimizeStatement record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalTo(record::getOid)
                .set(clusterOid).equalTo(record::getClusterOid)
                .set(deduplicateByOid).equalTo(record::getDeduplicateByOid)
                .set(isDeduplicate).equalTo(record::getIsDeduplicate)
                .set(isFinal).equalTo(record::getIsFinal);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_optimize_statement")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(SqlOptimizeStatement record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalToWhenPresent(record::getOid)
                .set(clusterOid).equalToWhenPresent(record::getClusterOid)
                .set(deduplicateByOid).equalToWhenPresent(record::getDeduplicateByOid)
                .set(isDeduplicate).equalToWhenPresent(record::getIsDeduplicate)
                .set(isFinal).equalToWhenPresent(record::getIsFinal);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_optimize_statement")
    default int updateByPrimaryKey(SqlOptimizeStatement record) {
        return update(c ->
            c.set(clusterOid).equalTo(record::getClusterOid)
            .set(deduplicateByOid).equalTo(record::getDeduplicateByOid)
            .set(isDeduplicate).equalTo(record::getIsDeduplicate)
            .set(isFinal).equalTo(record::getIsFinal)
            .where(oid, isEqualTo(record::getOid))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_optimize_statement")
    default int updateByPrimaryKeySelective(SqlOptimizeStatement record) {
        return update(c ->
            c.set(clusterOid).equalToWhenPresent(record::getClusterOid)
            .set(deduplicateByOid).equalToWhenPresent(record::getDeduplicateByOid)
            .set(isDeduplicate).equalToWhenPresent(record::getIsDeduplicate)
            .set(isFinal).equalToWhenPresent(record::getIsFinal)
            .where(oid, isEqualTo(record::getOid))
        );
    }
}