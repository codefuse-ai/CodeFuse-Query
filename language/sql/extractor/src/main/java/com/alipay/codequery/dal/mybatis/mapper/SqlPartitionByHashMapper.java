package com.alipay.codequery.dal.mybatis.mapper;

import static com.alipay.codequery.dal.mybatis.mapper.SqlPartitionByHashDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.alipay.codequery.dal.mybatis.domain.SqlPartitionByHash;
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
public interface SqlPartitionByHashMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_partition_by_hash")
    BasicColumn[] selectList = BasicColumn.columnList(oid, isKey, isUnique);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_partition_by_hash")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_partition_by_hash")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_partition_by_hash")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<SqlPartitionByHash> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_partition_by_hash")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<SqlPartitionByHash> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_partition_by_hash")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="is_key", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_unique", javaType=Integer.class, jdbcType=JdbcType.BIGINT)
    })
    Optional<SqlPartitionByHash> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_partition_by_hash")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="is_key", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_unique", javaType=Integer.class, jdbcType=JdbcType.BIGINT)
    })
    List<SqlPartitionByHash> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_partition_by_hash")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_partition_by_hash")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, sqlPartitionByHash, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_partition_by_hash")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, sqlPartitionByHash, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_partition_by_hash")
    default int deleteByPrimaryKey(Long oid_) {
        return delete(c -> 
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_partition_by_hash")
    default int insert(SqlPartitionByHash record) {
        return MyBatis3Utils.insert(this::insert, record, sqlPartitionByHash, c ->
            c.map(oid).toProperty("oid")
            .map(isKey).toProperty("isKey")
            .map(isUnique).toProperty("isUnique")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_partition_by_hash")
    default int insertMultiple(Collection<SqlPartitionByHash> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, sqlPartitionByHash, c ->
            c.map(oid).toProperty("oid")
            .map(isKey).toProperty("isKey")
            .map(isUnique).toProperty("isUnique")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_partition_by_hash")
    default int insertSelective(SqlPartitionByHash record) {
        return MyBatis3Utils.insert(this::insert, record, sqlPartitionByHash, c ->
            c.map(oid).toPropertyWhenPresent("oid", record::getOid)
            .map(isKey).toPropertyWhenPresent("isKey", record::getIsKey)
            .map(isUnique).toPropertyWhenPresent("isUnique", record::getIsUnique)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_partition_by_hash")
    default Optional<SqlPartitionByHash> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, sqlPartitionByHash, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_partition_by_hash")
    default List<SqlPartitionByHash> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, sqlPartitionByHash, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_partition_by_hash")
    default List<SqlPartitionByHash> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, sqlPartitionByHash, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_partition_by_hash")
    default Optional<SqlPartitionByHash> selectByPrimaryKey(Long oid_) {
        return selectOne(c ->
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_partition_by_hash")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, sqlPartitionByHash, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_partition_by_hash")
    static UpdateDSL<UpdateModel> updateAllColumns(SqlPartitionByHash record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalTo(record::getOid)
                .set(isKey).equalTo(record::getIsKey)
                .set(isUnique).equalTo(record::getIsUnique);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_partition_by_hash")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(SqlPartitionByHash record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalToWhenPresent(record::getOid)
                .set(isKey).equalToWhenPresent(record::getIsKey)
                .set(isUnique).equalToWhenPresent(record::getIsUnique);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_partition_by_hash")
    default int updateByPrimaryKey(SqlPartitionByHash record) {
        return update(c ->
            c.set(isKey).equalTo(record::getIsKey)
            .set(isUnique).equalTo(record::getIsUnique)
            .where(oid, isEqualTo(record::getOid))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_partition_by_hash")
    default int updateByPrimaryKeySelective(SqlPartitionByHash record) {
        return update(c ->
            c.set(isKey).equalToWhenPresent(record::getIsKey)
            .set(isUnique).equalToWhenPresent(record::getIsUnique)
            .where(oid, isEqualTo(record::getOid))
        );
    }
}