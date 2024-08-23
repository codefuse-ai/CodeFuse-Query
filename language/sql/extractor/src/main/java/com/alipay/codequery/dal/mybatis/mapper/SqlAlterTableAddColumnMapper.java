package com.alipay.codequery.dal.mybatis.mapper;

import static com.alipay.codequery.dal.mybatis.mapper.SqlAlterTableAddColumnDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.alipay.codequery.dal.mybatis.domain.SqlAlterTableAddColumn;
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
public interface SqlAlterTableAddColumnMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_table_add_column")
    BasicColumn[] selectList = BasicColumn.columnList(oid, afterColumnOid, firstColumnOid, isCascade, isFirst, isRestrict, restrict);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_table_add_column")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_table_add_column")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_table_add_column")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<SqlAlterTableAddColumn> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_table_add_column")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<SqlAlterTableAddColumn> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_table_add_column")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="after_column_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="first_column_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_cascade", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_first", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_restrict", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="restrict", javaType=Integer.class, jdbcType=JdbcType.BIGINT)
    })
    Optional<SqlAlterTableAddColumn> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_table_add_column")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="after_column_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="first_column_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_cascade", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_first", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_restrict", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="restrict", javaType=Integer.class, jdbcType=JdbcType.BIGINT)
    })
    List<SqlAlterTableAddColumn> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_table_add_column")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_table_add_column")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, sqlAlterTableAddColumn, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_table_add_column")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, sqlAlterTableAddColumn, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_table_add_column")
    default int deleteByPrimaryKey(Long oid_) {
        return delete(c -> 
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_table_add_column")
    default int insert(SqlAlterTableAddColumn record) {
        return MyBatis3Utils.insert(this::insert, record, sqlAlterTableAddColumn, c ->
            c.map(oid).toProperty("oid")
            .map(afterColumnOid).toProperty("afterColumnOid")
            .map(firstColumnOid).toProperty("firstColumnOid")
            .map(isCascade).toProperty("isCascade")
            .map(isFirst).toProperty("isFirst")
            .map(isRestrict).toProperty("isRestrict")
            .map(restrict).toProperty("restrict")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_table_add_column")
    default int insertMultiple(Collection<SqlAlterTableAddColumn> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, sqlAlterTableAddColumn, c ->
            c.map(oid).toProperty("oid")
            .map(afterColumnOid).toProperty("afterColumnOid")
            .map(firstColumnOid).toProperty("firstColumnOid")
            .map(isCascade).toProperty("isCascade")
            .map(isFirst).toProperty("isFirst")
            .map(isRestrict).toProperty("isRestrict")
            .map(restrict).toProperty("restrict")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_table_add_column")
    default int insertSelective(SqlAlterTableAddColumn record) {
        return MyBatis3Utils.insert(this::insert, record, sqlAlterTableAddColumn, c ->
            c.map(oid).toPropertyWhenPresent("oid", record::getOid)
            .map(afterColumnOid).toPropertyWhenPresent("afterColumnOid", record::getAfterColumnOid)
            .map(firstColumnOid).toPropertyWhenPresent("firstColumnOid", record::getFirstColumnOid)
            .map(isCascade).toPropertyWhenPresent("isCascade", record::getIsCascade)
            .map(isFirst).toPropertyWhenPresent("isFirst", record::getIsFirst)
            .map(isRestrict).toPropertyWhenPresent("isRestrict", record::getIsRestrict)
            .map(restrict).toPropertyWhenPresent("restrict", record::getRestrict)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_table_add_column")
    default Optional<SqlAlterTableAddColumn> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, sqlAlterTableAddColumn, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_table_add_column")
    default List<SqlAlterTableAddColumn> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, sqlAlterTableAddColumn, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_table_add_column")
    default List<SqlAlterTableAddColumn> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, sqlAlterTableAddColumn, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_table_add_column")
    default Optional<SqlAlterTableAddColumn> selectByPrimaryKey(Long oid_) {
        return selectOne(c ->
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_table_add_column")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, sqlAlterTableAddColumn, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_table_add_column")
    static UpdateDSL<UpdateModel> updateAllColumns(SqlAlterTableAddColumn record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalTo(record::getOid)
                .set(afterColumnOid).equalTo(record::getAfterColumnOid)
                .set(firstColumnOid).equalTo(record::getFirstColumnOid)
                .set(isCascade).equalTo(record::getIsCascade)
                .set(isFirst).equalTo(record::getIsFirst)
                .set(isRestrict).equalTo(record::getIsRestrict)
                .set(restrict).equalTo(record::getRestrict);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_table_add_column")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(SqlAlterTableAddColumn record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalToWhenPresent(record::getOid)
                .set(afterColumnOid).equalToWhenPresent(record::getAfterColumnOid)
                .set(firstColumnOid).equalToWhenPresent(record::getFirstColumnOid)
                .set(isCascade).equalToWhenPresent(record::getIsCascade)
                .set(isFirst).equalToWhenPresent(record::getIsFirst)
                .set(isRestrict).equalToWhenPresent(record::getIsRestrict)
                .set(restrict).equalToWhenPresent(record::getRestrict);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_table_add_column")
    default int updateByPrimaryKey(SqlAlterTableAddColumn record) {
        return update(c ->
            c.set(afterColumnOid).equalTo(record::getAfterColumnOid)
            .set(firstColumnOid).equalTo(record::getFirstColumnOid)
            .set(isCascade).equalTo(record::getIsCascade)
            .set(isFirst).equalTo(record::getIsFirst)
            .set(isRestrict).equalTo(record::getIsRestrict)
            .set(restrict).equalTo(record::getRestrict)
            .where(oid, isEqualTo(record::getOid))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_table_add_column")
    default int updateByPrimaryKeySelective(SqlAlterTableAddColumn record) {
        return update(c ->
            c.set(afterColumnOid).equalToWhenPresent(record::getAfterColumnOid)
            .set(firstColumnOid).equalToWhenPresent(record::getFirstColumnOid)
            .set(isCascade).equalToWhenPresent(record::getIsCascade)
            .set(isFirst).equalToWhenPresent(record::getIsFirst)
            .set(isRestrict).equalToWhenPresent(record::getIsRestrict)
            .set(restrict).equalToWhenPresent(record::getRestrict)
            .where(oid, isEqualTo(record::getOid))
        );
    }
}