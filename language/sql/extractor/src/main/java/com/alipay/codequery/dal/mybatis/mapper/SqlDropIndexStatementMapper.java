package com.alipay.codequery.dal.mybatis.mapper;

import static com.alipay.codequery.dal.mybatis.mapper.SqlDropIndexStatementDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.alipay.codequery.dal.mybatis.domain.SqlDropIndexStatement;
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
public interface SqlDropIndexStatementMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_drop_index_statement")
    BasicColumn[] selectList = BasicColumn.columnList(oid, algorithmOid, indexNameOid, isIfExists, lockOptionOid, tableNameOid);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_drop_index_statement")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_drop_index_statement")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_drop_index_statement")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<SqlDropIndexStatement> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_drop_index_statement")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<SqlDropIndexStatement> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_drop_index_statement")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="algorithm_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="index_name_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_if_exists", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="lock_option_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="table_name_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT)
    })
    Optional<SqlDropIndexStatement> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_drop_index_statement")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="algorithm_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="index_name_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_if_exists", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="lock_option_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="table_name_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT)
    })
    List<SqlDropIndexStatement> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_drop_index_statement")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_drop_index_statement")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, sqlDropIndexStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_drop_index_statement")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, sqlDropIndexStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_drop_index_statement")
    default int deleteByPrimaryKey(Long oid_) {
        return delete(c -> 
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_drop_index_statement")
    default int insert(SqlDropIndexStatement record) {
        return MyBatis3Utils.insert(this::insert, record, sqlDropIndexStatement, c ->
            c.map(oid).toProperty("oid")
            .map(algorithmOid).toProperty("algorithmOid")
            .map(indexNameOid).toProperty("indexNameOid")
            .map(isIfExists).toProperty("isIfExists")
            .map(lockOptionOid).toProperty("lockOptionOid")
            .map(tableNameOid).toProperty("tableNameOid")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_drop_index_statement")
    default int insertMultiple(Collection<SqlDropIndexStatement> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, sqlDropIndexStatement, c ->
            c.map(oid).toProperty("oid")
            .map(algorithmOid).toProperty("algorithmOid")
            .map(indexNameOid).toProperty("indexNameOid")
            .map(isIfExists).toProperty("isIfExists")
            .map(lockOptionOid).toProperty("lockOptionOid")
            .map(tableNameOid).toProperty("tableNameOid")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_drop_index_statement")
    default int insertSelective(SqlDropIndexStatement record) {
        return MyBatis3Utils.insert(this::insert, record, sqlDropIndexStatement, c ->
            c.map(oid).toPropertyWhenPresent("oid", record::getOid)
            .map(algorithmOid).toPropertyWhenPresent("algorithmOid", record::getAlgorithmOid)
            .map(indexNameOid).toPropertyWhenPresent("indexNameOid", record::getIndexNameOid)
            .map(isIfExists).toPropertyWhenPresent("isIfExists", record::getIsIfExists)
            .map(lockOptionOid).toPropertyWhenPresent("lockOptionOid", record::getLockOptionOid)
            .map(tableNameOid).toPropertyWhenPresent("tableNameOid", record::getTableNameOid)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_drop_index_statement")
    default Optional<SqlDropIndexStatement> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, sqlDropIndexStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_drop_index_statement")
    default List<SqlDropIndexStatement> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, sqlDropIndexStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_drop_index_statement")
    default List<SqlDropIndexStatement> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, sqlDropIndexStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_drop_index_statement")
    default Optional<SqlDropIndexStatement> selectByPrimaryKey(Long oid_) {
        return selectOne(c ->
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_drop_index_statement")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, sqlDropIndexStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_drop_index_statement")
    static UpdateDSL<UpdateModel> updateAllColumns(SqlDropIndexStatement record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalTo(record::getOid)
                .set(algorithmOid).equalTo(record::getAlgorithmOid)
                .set(indexNameOid).equalTo(record::getIndexNameOid)
                .set(isIfExists).equalTo(record::getIsIfExists)
                .set(lockOptionOid).equalTo(record::getLockOptionOid)
                .set(tableNameOid).equalTo(record::getTableNameOid);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_drop_index_statement")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(SqlDropIndexStatement record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalToWhenPresent(record::getOid)
                .set(algorithmOid).equalToWhenPresent(record::getAlgorithmOid)
                .set(indexNameOid).equalToWhenPresent(record::getIndexNameOid)
                .set(isIfExists).equalToWhenPresent(record::getIsIfExists)
                .set(lockOptionOid).equalToWhenPresent(record::getLockOptionOid)
                .set(tableNameOid).equalToWhenPresent(record::getTableNameOid);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_drop_index_statement")
    default int updateByPrimaryKey(SqlDropIndexStatement record) {
        return update(c ->
            c.set(algorithmOid).equalTo(record::getAlgorithmOid)
            .set(indexNameOid).equalTo(record::getIndexNameOid)
            .set(isIfExists).equalTo(record::getIsIfExists)
            .set(lockOptionOid).equalTo(record::getLockOptionOid)
            .set(tableNameOid).equalTo(record::getTableNameOid)
            .where(oid, isEqualTo(record::getOid))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_drop_index_statement")
    default int updateByPrimaryKeySelective(SqlDropIndexStatement record) {
        return update(c ->
            c.set(algorithmOid).equalToWhenPresent(record::getAlgorithmOid)
            .set(indexNameOid).equalToWhenPresent(record::getIndexNameOid)
            .set(isIfExists).equalToWhenPresent(record::getIsIfExists)
            .set(lockOptionOid).equalToWhenPresent(record::getLockOptionOid)
            .set(tableNameOid).equalToWhenPresent(record::getTableNameOid)
            .where(oid, isEqualTo(record::getOid))
        );
    }
}