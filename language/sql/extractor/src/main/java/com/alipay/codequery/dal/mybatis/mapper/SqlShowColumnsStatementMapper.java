package com.alipay.codequery.dal.mybatis.mapper;

import static com.alipay.codequery.dal.mybatis.mapper.SqlShowColumnsStatementDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.alipay.codequery.dal.mybatis.domain.SqlShowColumnsStatement;
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
public interface SqlShowColumnsStatementMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_show_columns_statement")
    BasicColumn[] selectList = BasicColumn.columnList(oid, databaseOid, isFull, likeOid, tableOid, whereOid);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_show_columns_statement")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_show_columns_statement")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_show_columns_statement")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<SqlShowColumnsStatement> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_show_columns_statement")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<SqlShowColumnsStatement> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_show_columns_statement")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="database_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_full", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="like_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="table_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="where_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT)
    })
    Optional<SqlShowColumnsStatement> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_show_columns_statement")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="database_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_full", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="like_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="table_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="where_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT)
    })
    List<SqlShowColumnsStatement> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_show_columns_statement")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_show_columns_statement")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, sqlShowColumnsStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_show_columns_statement")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, sqlShowColumnsStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_show_columns_statement")
    default int deleteByPrimaryKey(Long oid_) {
        return delete(c -> 
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_show_columns_statement")
    default int insert(SqlShowColumnsStatement record) {
        return MyBatis3Utils.insert(this::insert, record, sqlShowColumnsStatement, c ->
            c.map(oid).toProperty("oid")
            .map(databaseOid).toProperty("databaseOid")
            .map(isFull).toProperty("isFull")
            .map(likeOid).toProperty("likeOid")
            .map(tableOid).toProperty("tableOid")
            .map(whereOid).toProperty("whereOid")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_show_columns_statement")
    default int insertMultiple(Collection<SqlShowColumnsStatement> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, sqlShowColumnsStatement, c ->
            c.map(oid).toProperty("oid")
            .map(databaseOid).toProperty("databaseOid")
            .map(isFull).toProperty("isFull")
            .map(likeOid).toProperty("likeOid")
            .map(tableOid).toProperty("tableOid")
            .map(whereOid).toProperty("whereOid")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_show_columns_statement")
    default int insertSelective(SqlShowColumnsStatement record) {
        return MyBatis3Utils.insert(this::insert, record, sqlShowColumnsStatement, c ->
            c.map(oid).toPropertyWhenPresent("oid", record::getOid)
            .map(databaseOid).toPropertyWhenPresent("databaseOid", record::getDatabaseOid)
            .map(isFull).toPropertyWhenPresent("isFull", record::getIsFull)
            .map(likeOid).toPropertyWhenPresent("likeOid", record::getLikeOid)
            .map(tableOid).toPropertyWhenPresent("tableOid", record::getTableOid)
            .map(whereOid).toPropertyWhenPresent("whereOid", record::getWhereOid)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_show_columns_statement")
    default Optional<SqlShowColumnsStatement> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, sqlShowColumnsStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_show_columns_statement")
    default List<SqlShowColumnsStatement> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, sqlShowColumnsStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_show_columns_statement")
    default List<SqlShowColumnsStatement> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, sqlShowColumnsStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_show_columns_statement")
    default Optional<SqlShowColumnsStatement> selectByPrimaryKey(Long oid_) {
        return selectOne(c ->
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_show_columns_statement")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, sqlShowColumnsStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_show_columns_statement")
    static UpdateDSL<UpdateModel> updateAllColumns(SqlShowColumnsStatement record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalTo(record::getOid)
                .set(databaseOid).equalTo(record::getDatabaseOid)
                .set(isFull).equalTo(record::getIsFull)
                .set(likeOid).equalTo(record::getLikeOid)
                .set(tableOid).equalTo(record::getTableOid)
                .set(whereOid).equalTo(record::getWhereOid);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_show_columns_statement")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(SqlShowColumnsStatement record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalToWhenPresent(record::getOid)
                .set(databaseOid).equalToWhenPresent(record::getDatabaseOid)
                .set(isFull).equalToWhenPresent(record::getIsFull)
                .set(likeOid).equalToWhenPresent(record::getLikeOid)
                .set(tableOid).equalToWhenPresent(record::getTableOid)
                .set(whereOid).equalToWhenPresent(record::getWhereOid);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_show_columns_statement")
    default int updateByPrimaryKey(SqlShowColumnsStatement record) {
        return update(c ->
            c.set(databaseOid).equalTo(record::getDatabaseOid)
            .set(isFull).equalTo(record::getIsFull)
            .set(likeOid).equalTo(record::getLikeOid)
            .set(tableOid).equalTo(record::getTableOid)
            .set(whereOid).equalTo(record::getWhereOid)
            .where(oid, isEqualTo(record::getOid))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_show_columns_statement")
    default int updateByPrimaryKeySelective(SqlShowColumnsStatement record) {
        return update(c ->
            c.set(databaseOid).equalToWhenPresent(record::getDatabaseOid)
            .set(isFull).equalToWhenPresent(record::getIsFull)
            .set(likeOid).equalToWhenPresent(record::getLikeOid)
            .set(tableOid).equalToWhenPresent(record::getTableOid)
            .set(whereOid).equalToWhenPresent(record::getWhereOid)
            .where(oid, isEqualTo(record::getOid))
        );
    }
}