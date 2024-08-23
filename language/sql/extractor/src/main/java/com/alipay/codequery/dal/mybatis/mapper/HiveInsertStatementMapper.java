package com.alipay.codequery.dal.mybatis.mapper;

import static com.alipay.codequery.dal.mybatis.mapper.HiveInsertStatementDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.alipay.codequery.dal.mybatis.domain.HiveInsertStatement;
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
public interface HiveInsertStatementMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: hive_insert_statement")
    BasicColumn[] selectList = BasicColumn.columnList(oid, isIfNotExists);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: hive_insert_statement")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: hive_insert_statement")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: hive_insert_statement")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<HiveInsertStatement> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: hive_insert_statement")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<HiveInsertStatement> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: hive_insert_statement")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="is_if_not_exists", javaType=Integer.class, jdbcType=JdbcType.BIGINT)
    })
    Optional<HiveInsertStatement> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: hive_insert_statement")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="is_if_not_exists", javaType=Integer.class, jdbcType=JdbcType.BIGINT)
    })
    List<HiveInsertStatement> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: hive_insert_statement")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: hive_insert_statement")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, hiveInsertStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: hive_insert_statement")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, hiveInsertStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: hive_insert_statement")
    default int deleteByPrimaryKey(Long oid_) {
        return delete(c -> 
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: hive_insert_statement")
    default int insert(HiveInsertStatement record) {
        return MyBatis3Utils.insert(this::insert, record, hiveInsertStatement, c ->
            c.map(oid).toProperty("oid")
            .map(isIfNotExists).toProperty("isIfNotExists")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: hive_insert_statement")
    default int insertMultiple(Collection<HiveInsertStatement> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, hiveInsertStatement, c ->
            c.map(oid).toProperty("oid")
            .map(isIfNotExists).toProperty("isIfNotExists")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: hive_insert_statement")
    default int insertSelective(HiveInsertStatement record) {
        return MyBatis3Utils.insert(this::insert, record, hiveInsertStatement, c ->
            c.map(oid).toPropertyWhenPresent("oid", record::getOid)
            .map(isIfNotExists).toPropertyWhenPresent("isIfNotExists", record::getIsIfNotExists)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: hive_insert_statement")
    default Optional<HiveInsertStatement> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, hiveInsertStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: hive_insert_statement")
    default List<HiveInsertStatement> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, hiveInsertStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: hive_insert_statement")
    default List<HiveInsertStatement> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, hiveInsertStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: hive_insert_statement")
    default Optional<HiveInsertStatement> selectByPrimaryKey(Long oid_) {
        return selectOne(c ->
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: hive_insert_statement")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, hiveInsertStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: hive_insert_statement")
    static UpdateDSL<UpdateModel> updateAllColumns(HiveInsertStatement record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalTo(record::getOid)
                .set(isIfNotExists).equalTo(record::getIsIfNotExists);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: hive_insert_statement")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(HiveInsertStatement record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalToWhenPresent(record::getOid)
                .set(isIfNotExists).equalToWhenPresent(record::getIsIfNotExists);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: hive_insert_statement")
    default int updateByPrimaryKey(HiveInsertStatement record) {
        return update(c ->
            c.set(isIfNotExists).equalTo(record::getIsIfNotExists)
            .where(oid, isEqualTo(record::getOid))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: hive_insert_statement")
    default int updateByPrimaryKeySelective(HiveInsertStatement record) {
        return update(c ->
            c.set(isIfNotExists).equalToWhenPresent(record::getIsIfNotExists)
            .where(oid, isEqualTo(record::getOid))
        );
    }
}