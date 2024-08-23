package com.alipay.codequery.dal.mybatis.mapper;

import static com.alipay.codequery.dal.mybatis.mapper.MySqlKeyDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.alipay.codequery.dal.mybatis.domain.MySqlKey;
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
public interface MySqlKeyMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_key")
    BasicColumn[] selectList = BasicColumn.columnList(oid, indexType, isHasConstraint, keyBlockSizeOid);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_key")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_key")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_key")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<MySqlKey> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_key")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<MySqlKey> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_key")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="index_type", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="is_has_constraint", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="key_block_size_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT)
    })
    Optional<MySqlKey> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_key")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="index_type", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="is_has_constraint", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="key_block_size_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT)
    })
    List<MySqlKey> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_key")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_key")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, mySqlKey, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_key")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, mySqlKey, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_key")
    default int deleteByPrimaryKey(Long oid_) {
        return delete(c -> 
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_key")
    default int insert(MySqlKey record) {
        return MyBatis3Utils.insert(this::insert, record, mySqlKey, c ->
            c.map(oid).toProperty("oid")
            .map(indexType).toProperty("indexType")
            .map(isHasConstraint).toProperty("isHasConstraint")
            .map(keyBlockSizeOid).toProperty("keyBlockSizeOid")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_key")
    default int insertMultiple(Collection<MySqlKey> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, mySqlKey, c ->
            c.map(oid).toProperty("oid")
            .map(indexType).toProperty("indexType")
            .map(isHasConstraint).toProperty("isHasConstraint")
            .map(keyBlockSizeOid).toProperty("keyBlockSizeOid")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_key")
    default int insertSelective(MySqlKey record) {
        return MyBatis3Utils.insert(this::insert, record, mySqlKey, c ->
            c.map(oid).toPropertyWhenPresent("oid", record::getOid)
            .map(indexType).toPropertyWhenPresent("indexType", record::getIndexType)
            .map(isHasConstraint).toPropertyWhenPresent("isHasConstraint", record::getIsHasConstraint)
            .map(keyBlockSizeOid).toPropertyWhenPresent("keyBlockSizeOid", record::getKeyBlockSizeOid)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_key")
    default Optional<MySqlKey> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, mySqlKey, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_key")
    default List<MySqlKey> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, mySqlKey, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_key")
    default List<MySqlKey> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, mySqlKey, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_key")
    default Optional<MySqlKey> selectByPrimaryKey(Long oid_) {
        return selectOne(c ->
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_key")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, mySqlKey, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_key")
    static UpdateDSL<UpdateModel> updateAllColumns(MySqlKey record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalTo(record::getOid)
                .set(indexType).equalTo(record::getIndexType)
                .set(isHasConstraint).equalTo(record::getIsHasConstraint)
                .set(keyBlockSizeOid).equalTo(record::getKeyBlockSizeOid);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_key")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(MySqlKey record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalToWhenPresent(record::getOid)
                .set(indexType).equalToWhenPresent(record::getIndexType)
                .set(isHasConstraint).equalToWhenPresent(record::getIsHasConstraint)
                .set(keyBlockSizeOid).equalToWhenPresent(record::getKeyBlockSizeOid);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_key")
    default int updateByPrimaryKey(MySqlKey record) {
        return update(c ->
            c.set(indexType).equalTo(record::getIndexType)
            .set(isHasConstraint).equalTo(record::getIsHasConstraint)
            .set(keyBlockSizeOid).equalTo(record::getKeyBlockSizeOid)
            .where(oid, isEqualTo(record::getOid))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_key")
    default int updateByPrimaryKeySelective(MySqlKey record) {
        return update(c ->
            c.set(indexType).equalToWhenPresent(record::getIndexType)
            .set(isHasConstraint).equalToWhenPresent(record::getIsHasConstraint)
            .set(keyBlockSizeOid).equalToWhenPresent(record::getKeyBlockSizeOid)
            .where(oid, isEqualTo(record::getOid))
        );
    }
}