package com.alipay.codequery.dal.mybatis.mapper;

import static com.alipay.codequery.dal.mybatis.mapper.MySqlUniqueDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.alipay.codequery.dal.mybatis.domain.MySqlUnique;
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
public interface MySqlUniqueMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_unique")
    BasicColumn[] selectList = BasicColumn.columnList(oid, dbPartitionByOid, isGlobal, isLocal, tablePartitionByOid, tablePartitionsOid);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_unique")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_unique")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_unique")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<MySqlUnique> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_unique")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<MySqlUnique> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_unique")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="db_partition_by_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_global", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_local", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="table_partition_by_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="table_partitions_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT)
    })
    Optional<MySqlUnique> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_unique")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="db_partition_by_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_global", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_local", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="table_partition_by_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="table_partitions_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT)
    })
    List<MySqlUnique> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_unique")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_unique")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, mySqlUnique, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_unique")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, mySqlUnique, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_unique")
    default int deleteByPrimaryKey(Long oid_) {
        return delete(c -> 
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_unique")
    default int insert(MySqlUnique record) {
        return MyBatis3Utils.insert(this::insert, record, mySqlUnique, c ->
            c.map(oid).toProperty("oid")
            .map(dbPartitionByOid).toProperty("dbPartitionByOid")
            .map(isGlobal).toProperty("isGlobal")
            .map(isLocal).toProperty("isLocal")
            .map(tablePartitionByOid).toProperty("tablePartitionByOid")
            .map(tablePartitionsOid).toProperty("tablePartitionsOid")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_unique")
    default int insertMultiple(Collection<MySqlUnique> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, mySqlUnique, c ->
            c.map(oid).toProperty("oid")
            .map(dbPartitionByOid).toProperty("dbPartitionByOid")
            .map(isGlobal).toProperty("isGlobal")
            .map(isLocal).toProperty("isLocal")
            .map(tablePartitionByOid).toProperty("tablePartitionByOid")
            .map(tablePartitionsOid).toProperty("tablePartitionsOid")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_unique")
    default int insertSelective(MySqlUnique record) {
        return MyBatis3Utils.insert(this::insert, record, mySqlUnique, c ->
            c.map(oid).toPropertyWhenPresent("oid", record::getOid)
            .map(dbPartitionByOid).toPropertyWhenPresent("dbPartitionByOid", record::getDbPartitionByOid)
            .map(isGlobal).toPropertyWhenPresent("isGlobal", record::getIsGlobal)
            .map(isLocal).toPropertyWhenPresent("isLocal", record::getIsLocal)
            .map(tablePartitionByOid).toPropertyWhenPresent("tablePartitionByOid", record::getTablePartitionByOid)
            .map(tablePartitionsOid).toPropertyWhenPresent("tablePartitionsOid", record::getTablePartitionsOid)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_unique")
    default Optional<MySqlUnique> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, mySqlUnique, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_unique")
    default List<MySqlUnique> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, mySqlUnique, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_unique")
    default List<MySqlUnique> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, mySqlUnique, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_unique")
    default Optional<MySqlUnique> selectByPrimaryKey(Long oid_) {
        return selectOne(c ->
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_unique")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, mySqlUnique, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_unique")
    static UpdateDSL<UpdateModel> updateAllColumns(MySqlUnique record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalTo(record::getOid)
                .set(dbPartitionByOid).equalTo(record::getDbPartitionByOid)
                .set(isGlobal).equalTo(record::getIsGlobal)
                .set(isLocal).equalTo(record::getIsLocal)
                .set(tablePartitionByOid).equalTo(record::getTablePartitionByOid)
                .set(tablePartitionsOid).equalTo(record::getTablePartitionsOid);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_unique")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(MySqlUnique record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalToWhenPresent(record::getOid)
                .set(dbPartitionByOid).equalToWhenPresent(record::getDbPartitionByOid)
                .set(isGlobal).equalToWhenPresent(record::getIsGlobal)
                .set(isLocal).equalToWhenPresent(record::getIsLocal)
                .set(tablePartitionByOid).equalToWhenPresent(record::getTablePartitionByOid)
                .set(tablePartitionsOid).equalToWhenPresent(record::getTablePartitionsOid);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_unique")
    default int updateByPrimaryKey(MySqlUnique record) {
        return update(c ->
            c.set(dbPartitionByOid).equalTo(record::getDbPartitionByOid)
            .set(isGlobal).equalTo(record::getIsGlobal)
            .set(isLocal).equalTo(record::getIsLocal)
            .set(tablePartitionByOid).equalTo(record::getTablePartitionByOid)
            .set(tablePartitionsOid).equalTo(record::getTablePartitionsOid)
            .where(oid, isEqualTo(record::getOid))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_unique")
    default int updateByPrimaryKeySelective(MySqlUnique record) {
        return update(c ->
            c.set(dbPartitionByOid).equalToWhenPresent(record::getDbPartitionByOid)
            .set(isGlobal).equalToWhenPresent(record::getIsGlobal)
            .set(isLocal).equalToWhenPresent(record::getIsLocal)
            .set(tablePartitionByOid).equalToWhenPresent(record::getTablePartitionByOid)
            .set(tablePartitionsOid).equalToWhenPresent(record::getTablePartitionsOid)
            .where(oid, isEqualTo(record::getOid))
        );
    }
}