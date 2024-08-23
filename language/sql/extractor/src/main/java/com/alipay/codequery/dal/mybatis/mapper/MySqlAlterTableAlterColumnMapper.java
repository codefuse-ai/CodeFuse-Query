package com.alipay.codequery.dal.mybatis.mapper;

import static com.alipay.codequery.dal.mybatis.mapper.MySqlAlterTableAlterColumnDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.alipay.codequery.dal.mybatis.domain.MySqlAlterTableAlterColumn;
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
public interface MySqlAlterTableAlterColumnMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_alter_table_alter_column")
    BasicColumn[] selectList = BasicColumn.columnList(oid, columnOid, defaultExprOid, isDropDefault);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_alter_table_alter_column")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_alter_table_alter_column")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_alter_table_alter_column")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<MySqlAlterTableAlterColumn> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_alter_table_alter_column")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<MySqlAlterTableAlterColumn> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_alter_table_alter_column")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="column_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="default_expr_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_drop_default", javaType=Integer.class, jdbcType=JdbcType.BIGINT)
    })
    Optional<MySqlAlterTableAlterColumn> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_alter_table_alter_column")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="column_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="default_expr_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_drop_default", javaType=Integer.class, jdbcType=JdbcType.BIGINT)
    })
    List<MySqlAlterTableAlterColumn> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_alter_table_alter_column")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_alter_table_alter_column")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, mySqlAlterTableAlterColumn, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_alter_table_alter_column")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, mySqlAlterTableAlterColumn, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_alter_table_alter_column")
    default int deleteByPrimaryKey(Long oid_) {
        return delete(c -> 
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_alter_table_alter_column")
    default int insert(MySqlAlterTableAlterColumn record) {
        return MyBatis3Utils.insert(this::insert, record, mySqlAlterTableAlterColumn, c ->
            c.map(oid).toProperty("oid")
            .map(columnOid).toProperty("columnOid")
            .map(defaultExprOid).toProperty("defaultExprOid")
            .map(isDropDefault).toProperty("isDropDefault")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_alter_table_alter_column")
    default int insertMultiple(Collection<MySqlAlterTableAlterColumn> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, mySqlAlterTableAlterColumn, c ->
            c.map(oid).toProperty("oid")
            .map(columnOid).toProperty("columnOid")
            .map(defaultExprOid).toProperty("defaultExprOid")
            .map(isDropDefault).toProperty("isDropDefault")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_alter_table_alter_column")
    default int insertSelective(MySqlAlterTableAlterColumn record) {
        return MyBatis3Utils.insert(this::insert, record, mySqlAlterTableAlterColumn, c ->
            c.map(oid).toPropertyWhenPresent("oid", record::getOid)
            .map(columnOid).toPropertyWhenPresent("columnOid", record::getColumnOid)
            .map(defaultExprOid).toPropertyWhenPresent("defaultExprOid", record::getDefaultExprOid)
            .map(isDropDefault).toPropertyWhenPresent("isDropDefault", record::getIsDropDefault)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_alter_table_alter_column")
    default Optional<MySqlAlterTableAlterColumn> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, mySqlAlterTableAlterColumn, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_alter_table_alter_column")
    default List<MySqlAlterTableAlterColumn> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, mySqlAlterTableAlterColumn, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_alter_table_alter_column")
    default List<MySqlAlterTableAlterColumn> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, mySqlAlterTableAlterColumn, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_alter_table_alter_column")
    default Optional<MySqlAlterTableAlterColumn> selectByPrimaryKey(Long oid_) {
        return selectOne(c ->
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_alter_table_alter_column")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, mySqlAlterTableAlterColumn, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_alter_table_alter_column")
    static UpdateDSL<UpdateModel> updateAllColumns(MySqlAlterTableAlterColumn record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalTo(record::getOid)
                .set(columnOid).equalTo(record::getColumnOid)
                .set(defaultExprOid).equalTo(record::getDefaultExprOid)
                .set(isDropDefault).equalTo(record::getIsDropDefault);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_alter_table_alter_column")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(MySqlAlterTableAlterColumn record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalToWhenPresent(record::getOid)
                .set(columnOid).equalToWhenPresent(record::getColumnOid)
                .set(defaultExprOid).equalToWhenPresent(record::getDefaultExprOid)
                .set(isDropDefault).equalToWhenPresent(record::getIsDropDefault);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_alter_table_alter_column")
    default int updateByPrimaryKey(MySqlAlterTableAlterColumn record) {
        return update(c ->
            c.set(columnOid).equalTo(record::getColumnOid)
            .set(defaultExprOid).equalTo(record::getDefaultExprOid)
            .set(isDropDefault).equalTo(record::getIsDropDefault)
            .where(oid, isEqualTo(record::getOid))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_alter_table_alter_column")
    default int updateByPrimaryKeySelective(MySqlAlterTableAlterColumn record) {
        return update(c ->
            c.set(columnOid).equalToWhenPresent(record::getColumnOid)
            .set(defaultExprOid).equalToWhenPresent(record::getDefaultExprOid)
            .set(isDropDefault).equalToWhenPresent(record::getIsDropDefault)
            .where(oid, isEqualTo(record::getOid))
        );
    }
}