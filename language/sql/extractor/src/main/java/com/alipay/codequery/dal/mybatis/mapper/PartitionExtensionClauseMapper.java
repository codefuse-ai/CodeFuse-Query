package com.alipay.codequery.dal.mybatis.mapper;

import static com.alipay.codequery.dal.mybatis.mapper.PartitionExtensionClauseDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.alipay.codequery.dal.mybatis.domain.PartitionExtensionClause;
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
public interface PartitionExtensionClauseMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: partition_extension_clause")
    BasicColumn[] selectList = BasicColumn.columnList(oid, isSubPartition, partitionOid);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: partition_extension_clause")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: partition_extension_clause")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: partition_extension_clause")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<PartitionExtensionClause> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: partition_extension_clause")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<PartitionExtensionClause> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: partition_extension_clause")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="is_sub_partition", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="partition_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT)
    })
    Optional<PartitionExtensionClause> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: partition_extension_clause")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="is_sub_partition", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="partition_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT)
    })
    List<PartitionExtensionClause> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: partition_extension_clause")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: partition_extension_clause")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, partitionExtensionClause, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: partition_extension_clause")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, partitionExtensionClause, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: partition_extension_clause")
    default int deleteByPrimaryKey(Long oid_) {
        return delete(c -> 
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: partition_extension_clause")
    default int insert(PartitionExtensionClause record) {
        return MyBatis3Utils.insert(this::insert, record, partitionExtensionClause, c ->
            c.map(oid).toProperty("oid")
            .map(isSubPartition).toProperty("isSubPartition")
            .map(partitionOid).toProperty("partitionOid")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: partition_extension_clause")
    default int insertMultiple(Collection<PartitionExtensionClause> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, partitionExtensionClause, c ->
            c.map(oid).toProperty("oid")
            .map(isSubPartition).toProperty("isSubPartition")
            .map(partitionOid).toProperty("partitionOid")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: partition_extension_clause")
    default int insertSelective(PartitionExtensionClause record) {
        return MyBatis3Utils.insert(this::insert, record, partitionExtensionClause, c ->
            c.map(oid).toPropertyWhenPresent("oid", record::getOid)
            .map(isSubPartition).toPropertyWhenPresent("isSubPartition", record::getIsSubPartition)
            .map(partitionOid).toPropertyWhenPresent("partitionOid", record::getPartitionOid)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: partition_extension_clause")
    default Optional<PartitionExtensionClause> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, partitionExtensionClause, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: partition_extension_clause")
    default List<PartitionExtensionClause> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, partitionExtensionClause, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: partition_extension_clause")
    default List<PartitionExtensionClause> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, partitionExtensionClause, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: partition_extension_clause")
    default Optional<PartitionExtensionClause> selectByPrimaryKey(Long oid_) {
        return selectOne(c ->
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: partition_extension_clause")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, partitionExtensionClause, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: partition_extension_clause")
    static UpdateDSL<UpdateModel> updateAllColumns(PartitionExtensionClause record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalTo(record::getOid)
                .set(isSubPartition).equalTo(record::getIsSubPartition)
                .set(partitionOid).equalTo(record::getPartitionOid);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: partition_extension_clause")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(PartitionExtensionClause record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalToWhenPresent(record::getOid)
                .set(isSubPartition).equalToWhenPresent(record::getIsSubPartition)
                .set(partitionOid).equalToWhenPresent(record::getPartitionOid);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: partition_extension_clause")
    default int updateByPrimaryKey(PartitionExtensionClause record) {
        return update(c ->
            c.set(isSubPartition).equalTo(record::getIsSubPartition)
            .set(partitionOid).equalTo(record::getPartitionOid)
            .where(oid, isEqualTo(record::getOid))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: partition_extension_clause")
    default int updateByPrimaryKeySelective(PartitionExtensionClause record) {
        return update(c ->
            c.set(isSubPartition).equalToWhenPresent(record::getIsSubPartition)
            .set(partitionOid).equalToWhenPresent(record::getPartitionOid)
            .where(oid, isEqualTo(record::getOid))
        );
    }
}