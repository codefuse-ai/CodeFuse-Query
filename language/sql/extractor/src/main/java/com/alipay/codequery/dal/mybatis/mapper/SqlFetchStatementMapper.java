package com.alipay.codequery.dal.mybatis.mapper;

import static com.alipay.codequery.dal.mybatis.mapper.SqlFetchStatementDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.alipay.codequery.dal.mybatis.domain.SqlFetchStatement;
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
public interface SqlFetchStatementMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_fetch_statement")
    BasicColumn[] selectList = BasicColumn.columnList(oid, cursorNameOid, isBulkCollect, limitOid);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_fetch_statement")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_fetch_statement")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_fetch_statement")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<SqlFetchStatement> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_fetch_statement")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<SqlFetchStatement> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_fetch_statement")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="cursor_name_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_bulk_collect", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="limit_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT)
    })
    Optional<SqlFetchStatement> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_fetch_statement")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="cursor_name_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_bulk_collect", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="limit_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT)
    })
    List<SqlFetchStatement> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_fetch_statement")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_fetch_statement")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, sqlFetchStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_fetch_statement")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, sqlFetchStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_fetch_statement")
    default int deleteByPrimaryKey(Long oid_) {
        return delete(c -> 
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_fetch_statement")
    default int insert(SqlFetchStatement record) {
        return MyBatis3Utils.insert(this::insert, record, sqlFetchStatement, c ->
            c.map(oid).toProperty("oid")
            .map(cursorNameOid).toProperty("cursorNameOid")
            .map(isBulkCollect).toProperty("isBulkCollect")
            .map(limitOid).toProperty("limitOid")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_fetch_statement")
    default int insertMultiple(Collection<SqlFetchStatement> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, sqlFetchStatement, c ->
            c.map(oid).toProperty("oid")
            .map(cursorNameOid).toProperty("cursorNameOid")
            .map(isBulkCollect).toProperty("isBulkCollect")
            .map(limitOid).toProperty("limitOid")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_fetch_statement")
    default int insertSelective(SqlFetchStatement record) {
        return MyBatis3Utils.insert(this::insert, record, sqlFetchStatement, c ->
            c.map(oid).toPropertyWhenPresent("oid", record::getOid)
            .map(cursorNameOid).toPropertyWhenPresent("cursorNameOid", record::getCursorNameOid)
            .map(isBulkCollect).toPropertyWhenPresent("isBulkCollect", record::getIsBulkCollect)
            .map(limitOid).toPropertyWhenPresent("limitOid", record::getLimitOid)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_fetch_statement")
    default Optional<SqlFetchStatement> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, sqlFetchStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_fetch_statement")
    default List<SqlFetchStatement> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, sqlFetchStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_fetch_statement")
    default List<SqlFetchStatement> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, sqlFetchStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_fetch_statement")
    default Optional<SqlFetchStatement> selectByPrimaryKey(Long oid_) {
        return selectOne(c ->
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_fetch_statement")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, sqlFetchStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_fetch_statement")
    static UpdateDSL<UpdateModel> updateAllColumns(SqlFetchStatement record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalTo(record::getOid)
                .set(cursorNameOid).equalTo(record::getCursorNameOid)
                .set(isBulkCollect).equalTo(record::getIsBulkCollect)
                .set(limitOid).equalTo(record::getLimitOid);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_fetch_statement")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(SqlFetchStatement record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalToWhenPresent(record::getOid)
                .set(cursorNameOid).equalToWhenPresent(record::getCursorNameOid)
                .set(isBulkCollect).equalToWhenPresent(record::getIsBulkCollect)
                .set(limitOid).equalToWhenPresent(record::getLimitOid);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_fetch_statement")
    default int updateByPrimaryKey(SqlFetchStatement record) {
        return update(c ->
            c.set(cursorNameOid).equalTo(record::getCursorNameOid)
            .set(isBulkCollect).equalTo(record::getIsBulkCollect)
            .set(limitOid).equalTo(record::getLimitOid)
            .where(oid, isEqualTo(record::getOid))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_fetch_statement")
    default int updateByPrimaryKeySelective(SqlFetchStatement record) {
        return update(c ->
            c.set(cursorNameOid).equalToWhenPresent(record::getCursorNameOid)
            .set(isBulkCollect).equalToWhenPresent(record::getIsBulkCollect)
            .set(limitOid).equalToWhenPresent(record::getLimitOid)
            .where(oid, isEqualTo(record::getOid))
        );
    }
}