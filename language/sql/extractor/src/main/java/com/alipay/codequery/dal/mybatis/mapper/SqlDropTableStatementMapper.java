package com.alipay.codequery.dal.mybatis.mapper;

import static com.alipay.codequery.dal.mybatis.mapper.SqlDropTableStatementDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.alipay.codequery.dal.mybatis.domain.SqlDropTableStatement;
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
public interface SqlDropTableStatementMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_drop_table_statement")
    BasicColumn[] selectList = BasicColumn.columnList(oid, isCascade, isDropPartition, isExternal, isIfExists, isPurge, isRestrict, isTemporary, whereOid);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_drop_table_statement")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_drop_table_statement")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_drop_table_statement")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<SqlDropTableStatement> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_drop_table_statement")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<SqlDropTableStatement> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_drop_table_statement")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="is_cascade", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_drop_partition", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_external", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_if_exists", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_purge", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_restrict", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_temporary", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="where_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT)
    })
    Optional<SqlDropTableStatement> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_drop_table_statement")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="is_cascade", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_drop_partition", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_external", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_if_exists", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_purge", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_restrict", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_temporary", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="where_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT)
    })
    List<SqlDropTableStatement> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_drop_table_statement")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_drop_table_statement")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, sqlDropTableStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_drop_table_statement")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, sqlDropTableStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_drop_table_statement")
    default int deleteByPrimaryKey(Long oid_) {
        return delete(c -> 
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_drop_table_statement")
    default int insert(SqlDropTableStatement record) {
        return MyBatis3Utils.insert(this::insert, record, sqlDropTableStatement, c ->
            c.map(oid).toProperty("oid")
            .map(isCascade).toProperty("isCascade")
            .map(isDropPartition).toProperty("isDropPartition")
            .map(isExternal).toProperty("isExternal")
            .map(isIfExists).toProperty("isIfExists")
            .map(isPurge).toProperty("isPurge")
            .map(isRestrict).toProperty("isRestrict")
            .map(isTemporary).toProperty("isTemporary")
            .map(whereOid).toProperty("whereOid")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_drop_table_statement")
    default int insertMultiple(Collection<SqlDropTableStatement> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, sqlDropTableStatement, c ->
            c.map(oid).toProperty("oid")
            .map(isCascade).toProperty("isCascade")
            .map(isDropPartition).toProperty("isDropPartition")
            .map(isExternal).toProperty("isExternal")
            .map(isIfExists).toProperty("isIfExists")
            .map(isPurge).toProperty("isPurge")
            .map(isRestrict).toProperty("isRestrict")
            .map(isTemporary).toProperty("isTemporary")
            .map(whereOid).toProperty("whereOid")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_drop_table_statement")
    default int insertSelective(SqlDropTableStatement record) {
        return MyBatis3Utils.insert(this::insert, record, sqlDropTableStatement, c ->
            c.map(oid).toPropertyWhenPresent("oid", record::getOid)
            .map(isCascade).toPropertyWhenPresent("isCascade", record::getIsCascade)
            .map(isDropPartition).toPropertyWhenPresent("isDropPartition", record::getIsDropPartition)
            .map(isExternal).toPropertyWhenPresent("isExternal", record::getIsExternal)
            .map(isIfExists).toPropertyWhenPresent("isIfExists", record::getIsIfExists)
            .map(isPurge).toPropertyWhenPresent("isPurge", record::getIsPurge)
            .map(isRestrict).toPropertyWhenPresent("isRestrict", record::getIsRestrict)
            .map(isTemporary).toPropertyWhenPresent("isTemporary", record::getIsTemporary)
            .map(whereOid).toPropertyWhenPresent("whereOid", record::getWhereOid)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_drop_table_statement")
    default Optional<SqlDropTableStatement> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, sqlDropTableStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_drop_table_statement")
    default List<SqlDropTableStatement> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, sqlDropTableStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_drop_table_statement")
    default List<SqlDropTableStatement> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, sqlDropTableStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_drop_table_statement")
    default Optional<SqlDropTableStatement> selectByPrimaryKey(Long oid_) {
        return selectOne(c ->
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_drop_table_statement")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, sqlDropTableStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_drop_table_statement")
    static UpdateDSL<UpdateModel> updateAllColumns(SqlDropTableStatement record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalTo(record::getOid)
                .set(isCascade).equalTo(record::getIsCascade)
                .set(isDropPartition).equalTo(record::getIsDropPartition)
                .set(isExternal).equalTo(record::getIsExternal)
                .set(isIfExists).equalTo(record::getIsIfExists)
                .set(isPurge).equalTo(record::getIsPurge)
                .set(isRestrict).equalTo(record::getIsRestrict)
                .set(isTemporary).equalTo(record::getIsTemporary)
                .set(whereOid).equalTo(record::getWhereOid);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_drop_table_statement")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(SqlDropTableStatement record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalToWhenPresent(record::getOid)
                .set(isCascade).equalToWhenPresent(record::getIsCascade)
                .set(isDropPartition).equalToWhenPresent(record::getIsDropPartition)
                .set(isExternal).equalToWhenPresent(record::getIsExternal)
                .set(isIfExists).equalToWhenPresent(record::getIsIfExists)
                .set(isPurge).equalToWhenPresent(record::getIsPurge)
                .set(isRestrict).equalToWhenPresent(record::getIsRestrict)
                .set(isTemporary).equalToWhenPresent(record::getIsTemporary)
                .set(whereOid).equalToWhenPresent(record::getWhereOid);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_drop_table_statement")
    default int updateByPrimaryKey(SqlDropTableStatement record) {
        return update(c ->
            c.set(isCascade).equalTo(record::getIsCascade)
            .set(isDropPartition).equalTo(record::getIsDropPartition)
            .set(isExternal).equalTo(record::getIsExternal)
            .set(isIfExists).equalTo(record::getIsIfExists)
            .set(isPurge).equalTo(record::getIsPurge)
            .set(isRestrict).equalTo(record::getIsRestrict)
            .set(isTemporary).equalTo(record::getIsTemporary)
            .set(whereOid).equalTo(record::getWhereOid)
            .where(oid, isEqualTo(record::getOid))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_drop_table_statement")
    default int updateByPrimaryKeySelective(SqlDropTableStatement record) {
        return update(c ->
            c.set(isCascade).equalToWhenPresent(record::getIsCascade)
            .set(isDropPartition).equalToWhenPresent(record::getIsDropPartition)
            .set(isExternal).equalToWhenPresent(record::getIsExternal)
            .set(isIfExists).equalToWhenPresent(record::getIsIfExists)
            .set(isPurge).equalToWhenPresent(record::getIsPurge)
            .set(isRestrict).equalToWhenPresent(record::getIsRestrict)
            .set(isTemporary).equalToWhenPresent(record::getIsTemporary)
            .set(whereOid).equalToWhenPresent(record::getWhereOid)
            .where(oid, isEqualTo(record::getOid))
        );
    }
}