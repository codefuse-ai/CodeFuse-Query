package com.alipay.codequery.dal.mybatis.mapper;

import static com.alipay.codequery.dal.mybatis.mapper.SqlAlterTableDropPartitionDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.alipay.codequery.dal.mybatis.domain.SqlAlterTableDropPartition;
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
public interface SqlAlterTableDropPartitionMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_table_drop_partition")
    BasicColumn[] selectList = BasicColumn.columnList(oid, isIfExists, isPurge);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_table_drop_partition")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_table_drop_partition")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_table_drop_partition")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<SqlAlterTableDropPartition> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_table_drop_partition")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<SqlAlterTableDropPartition> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_table_drop_partition")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="is_if_exists", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_purge", javaType=Integer.class, jdbcType=JdbcType.BIGINT)
    })
    Optional<SqlAlterTableDropPartition> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_table_drop_partition")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="is_if_exists", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_purge", javaType=Integer.class, jdbcType=JdbcType.BIGINT)
    })
    List<SqlAlterTableDropPartition> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_table_drop_partition")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_table_drop_partition")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, sqlAlterTableDropPartition, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_table_drop_partition")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, sqlAlterTableDropPartition, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_table_drop_partition")
    default int deleteByPrimaryKey(Long oid_) {
        return delete(c -> 
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_table_drop_partition")
    default int insert(SqlAlterTableDropPartition record) {
        return MyBatis3Utils.insert(this::insert, record, sqlAlterTableDropPartition, c ->
            c.map(oid).toProperty("oid")
            .map(isIfExists).toProperty("isIfExists")
            .map(isPurge).toProperty("isPurge")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_table_drop_partition")
    default int insertMultiple(Collection<SqlAlterTableDropPartition> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, sqlAlterTableDropPartition, c ->
            c.map(oid).toProperty("oid")
            .map(isIfExists).toProperty("isIfExists")
            .map(isPurge).toProperty("isPurge")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_table_drop_partition")
    default int insertSelective(SqlAlterTableDropPartition record) {
        return MyBatis3Utils.insert(this::insert, record, sqlAlterTableDropPartition, c ->
            c.map(oid).toPropertyWhenPresent("oid", record::getOid)
            .map(isIfExists).toPropertyWhenPresent("isIfExists", record::getIsIfExists)
            .map(isPurge).toPropertyWhenPresent("isPurge", record::getIsPurge)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_table_drop_partition")
    default Optional<SqlAlterTableDropPartition> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, sqlAlterTableDropPartition, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_table_drop_partition")
    default List<SqlAlterTableDropPartition> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, sqlAlterTableDropPartition, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_table_drop_partition")
    default List<SqlAlterTableDropPartition> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, sqlAlterTableDropPartition, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_table_drop_partition")
    default Optional<SqlAlterTableDropPartition> selectByPrimaryKey(Long oid_) {
        return selectOne(c ->
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_table_drop_partition")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, sqlAlterTableDropPartition, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_table_drop_partition")
    static UpdateDSL<UpdateModel> updateAllColumns(SqlAlterTableDropPartition record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalTo(record::getOid)
                .set(isIfExists).equalTo(record::getIsIfExists)
                .set(isPurge).equalTo(record::getIsPurge);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_table_drop_partition")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(SqlAlterTableDropPartition record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalToWhenPresent(record::getOid)
                .set(isIfExists).equalToWhenPresent(record::getIsIfExists)
                .set(isPurge).equalToWhenPresent(record::getIsPurge);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_table_drop_partition")
    default int updateByPrimaryKey(SqlAlterTableDropPartition record) {
        return update(c ->
            c.set(isIfExists).equalTo(record::getIsIfExists)
            .set(isPurge).equalTo(record::getIsPurge)
            .where(oid, isEqualTo(record::getOid))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_table_drop_partition")
    default int updateByPrimaryKeySelective(SqlAlterTableDropPartition record) {
        return update(c ->
            c.set(isIfExists).equalToWhenPresent(record::getIsIfExists)
            .set(isPurge).equalToWhenPresent(record::getIsPurge)
            .where(oid, isEqualTo(record::getOid))
        );
    }
}