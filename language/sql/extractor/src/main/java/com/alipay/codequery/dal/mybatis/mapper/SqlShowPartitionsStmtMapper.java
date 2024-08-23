package com.alipay.codequery.dal.mybatis.mapper;

import static com.alipay.codequery.dal.mybatis.mapper.SqlShowPartitionsStmtDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.alipay.codequery.dal.mybatis.domain.SqlShowPartitionsStmt;
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
public interface SqlShowPartitionsStmtMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_show_partitions_stmt")
    BasicColumn[] selectList = BasicColumn.columnList(oid, tableSourceOid, whereOid);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_show_partitions_stmt")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_show_partitions_stmt")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_show_partitions_stmt")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<SqlShowPartitionsStmt> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_show_partitions_stmt")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<SqlShowPartitionsStmt> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_show_partitions_stmt")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="table_source_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="where_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT)
    })
    Optional<SqlShowPartitionsStmt> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_show_partitions_stmt")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="table_source_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="where_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT)
    })
    List<SqlShowPartitionsStmt> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_show_partitions_stmt")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_show_partitions_stmt")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, sqlShowPartitionsStmt, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_show_partitions_stmt")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, sqlShowPartitionsStmt, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_show_partitions_stmt")
    default int deleteByPrimaryKey(Long oid_) {
        return delete(c -> 
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_show_partitions_stmt")
    default int insert(SqlShowPartitionsStmt record) {
        return MyBatis3Utils.insert(this::insert, record, sqlShowPartitionsStmt, c ->
            c.map(oid).toProperty("oid")
            .map(tableSourceOid).toProperty("tableSourceOid")
            .map(whereOid).toProperty("whereOid")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_show_partitions_stmt")
    default int insertMultiple(Collection<SqlShowPartitionsStmt> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, sqlShowPartitionsStmt, c ->
            c.map(oid).toProperty("oid")
            .map(tableSourceOid).toProperty("tableSourceOid")
            .map(whereOid).toProperty("whereOid")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_show_partitions_stmt")
    default int insertSelective(SqlShowPartitionsStmt record) {
        return MyBatis3Utils.insert(this::insert, record, sqlShowPartitionsStmt, c ->
            c.map(oid).toPropertyWhenPresent("oid", record::getOid)
            .map(tableSourceOid).toPropertyWhenPresent("tableSourceOid", record::getTableSourceOid)
            .map(whereOid).toPropertyWhenPresent("whereOid", record::getWhereOid)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_show_partitions_stmt")
    default Optional<SqlShowPartitionsStmt> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, sqlShowPartitionsStmt, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_show_partitions_stmt")
    default List<SqlShowPartitionsStmt> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, sqlShowPartitionsStmt, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_show_partitions_stmt")
    default List<SqlShowPartitionsStmt> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, sqlShowPartitionsStmt, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_show_partitions_stmt")
    default Optional<SqlShowPartitionsStmt> selectByPrimaryKey(Long oid_) {
        return selectOne(c ->
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_show_partitions_stmt")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, sqlShowPartitionsStmt, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_show_partitions_stmt")
    static UpdateDSL<UpdateModel> updateAllColumns(SqlShowPartitionsStmt record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalTo(record::getOid)
                .set(tableSourceOid).equalTo(record::getTableSourceOid)
                .set(whereOid).equalTo(record::getWhereOid);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_show_partitions_stmt")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(SqlShowPartitionsStmt record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalToWhenPresent(record::getOid)
                .set(tableSourceOid).equalToWhenPresent(record::getTableSourceOid)
                .set(whereOid).equalToWhenPresent(record::getWhereOid);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_show_partitions_stmt")
    default int updateByPrimaryKey(SqlShowPartitionsStmt record) {
        return update(c ->
            c.set(tableSourceOid).equalTo(record::getTableSourceOid)
            .set(whereOid).equalTo(record::getWhereOid)
            .where(oid, isEqualTo(record::getOid))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_show_partitions_stmt")
    default int updateByPrimaryKeySelective(SqlShowPartitionsStmt record) {
        return update(c ->
            c.set(tableSourceOid).equalToWhenPresent(record::getTableSourceOid)
            .set(whereOid).equalToWhenPresent(record::getWhereOid)
            .where(oid, isEqualTo(record::getOid))
        );
    }
}