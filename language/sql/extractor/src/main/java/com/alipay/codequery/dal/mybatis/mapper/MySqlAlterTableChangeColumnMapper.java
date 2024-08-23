package com.alipay.codequery.dal.mybatis.mapper;

import static com.alipay.codequery.dal.mybatis.mapper.MySqlAlterTableChangeColumnDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.alipay.codequery.dal.mybatis.domain.MySqlAlterTableChangeColumn;
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
public interface MySqlAlterTableChangeColumnMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_alter_table_change_column")
    BasicColumn[] selectList = BasicColumn.columnList(oid, afterColumnOid, columnNameOid, firstColumnOid, isFirst, newColumnDefinitionOid);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_alter_table_change_column")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_alter_table_change_column")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_alter_table_change_column")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<MySqlAlterTableChangeColumn> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_alter_table_change_column")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<MySqlAlterTableChangeColumn> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_alter_table_change_column")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="after_column_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="column_name_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="first_column_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_first", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="new_column_definition_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT)
    })
    Optional<MySqlAlterTableChangeColumn> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_alter_table_change_column")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="after_column_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="column_name_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="first_column_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_first", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="new_column_definition_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT)
    })
    List<MySqlAlterTableChangeColumn> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_alter_table_change_column")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_alter_table_change_column")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, mySqlAlterTableChangeColumn, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_alter_table_change_column")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, mySqlAlterTableChangeColumn, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_alter_table_change_column")
    default int deleteByPrimaryKey(Long oid_) {
        return delete(c -> 
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_alter_table_change_column")
    default int insert(MySqlAlterTableChangeColumn record) {
        return MyBatis3Utils.insert(this::insert, record, mySqlAlterTableChangeColumn, c ->
            c.map(oid).toProperty("oid")
            .map(afterColumnOid).toProperty("afterColumnOid")
            .map(columnNameOid).toProperty("columnNameOid")
            .map(firstColumnOid).toProperty("firstColumnOid")
            .map(isFirst).toProperty("isFirst")
            .map(newColumnDefinitionOid).toProperty("newColumnDefinitionOid")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_alter_table_change_column")
    default int insertMultiple(Collection<MySqlAlterTableChangeColumn> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, mySqlAlterTableChangeColumn, c ->
            c.map(oid).toProperty("oid")
            .map(afterColumnOid).toProperty("afterColumnOid")
            .map(columnNameOid).toProperty("columnNameOid")
            .map(firstColumnOid).toProperty("firstColumnOid")
            .map(isFirst).toProperty("isFirst")
            .map(newColumnDefinitionOid).toProperty("newColumnDefinitionOid")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_alter_table_change_column")
    default int insertSelective(MySqlAlterTableChangeColumn record) {
        return MyBatis3Utils.insert(this::insert, record, mySqlAlterTableChangeColumn, c ->
            c.map(oid).toPropertyWhenPresent("oid", record::getOid)
            .map(afterColumnOid).toPropertyWhenPresent("afterColumnOid", record::getAfterColumnOid)
            .map(columnNameOid).toPropertyWhenPresent("columnNameOid", record::getColumnNameOid)
            .map(firstColumnOid).toPropertyWhenPresent("firstColumnOid", record::getFirstColumnOid)
            .map(isFirst).toPropertyWhenPresent("isFirst", record::getIsFirst)
            .map(newColumnDefinitionOid).toPropertyWhenPresent("newColumnDefinitionOid", record::getNewColumnDefinitionOid)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_alter_table_change_column")
    default Optional<MySqlAlterTableChangeColumn> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, mySqlAlterTableChangeColumn, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_alter_table_change_column")
    default List<MySqlAlterTableChangeColumn> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, mySqlAlterTableChangeColumn, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_alter_table_change_column")
    default List<MySqlAlterTableChangeColumn> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, mySqlAlterTableChangeColumn, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_alter_table_change_column")
    default Optional<MySqlAlterTableChangeColumn> selectByPrimaryKey(Long oid_) {
        return selectOne(c ->
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_alter_table_change_column")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, mySqlAlterTableChangeColumn, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_alter_table_change_column")
    static UpdateDSL<UpdateModel> updateAllColumns(MySqlAlterTableChangeColumn record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalTo(record::getOid)
                .set(afterColumnOid).equalTo(record::getAfterColumnOid)
                .set(columnNameOid).equalTo(record::getColumnNameOid)
                .set(firstColumnOid).equalTo(record::getFirstColumnOid)
                .set(isFirst).equalTo(record::getIsFirst)
                .set(newColumnDefinitionOid).equalTo(record::getNewColumnDefinitionOid);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_alter_table_change_column")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(MySqlAlterTableChangeColumn record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalToWhenPresent(record::getOid)
                .set(afterColumnOid).equalToWhenPresent(record::getAfterColumnOid)
                .set(columnNameOid).equalToWhenPresent(record::getColumnNameOid)
                .set(firstColumnOid).equalToWhenPresent(record::getFirstColumnOid)
                .set(isFirst).equalToWhenPresent(record::getIsFirst)
                .set(newColumnDefinitionOid).equalToWhenPresent(record::getNewColumnDefinitionOid);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_alter_table_change_column")
    default int updateByPrimaryKey(MySqlAlterTableChangeColumn record) {
        return update(c ->
            c.set(afterColumnOid).equalTo(record::getAfterColumnOid)
            .set(columnNameOid).equalTo(record::getColumnNameOid)
            .set(firstColumnOid).equalTo(record::getFirstColumnOid)
            .set(isFirst).equalTo(record::getIsFirst)
            .set(newColumnDefinitionOid).equalTo(record::getNewColumnDefinitionOid)
            .where(oid, isEqualTo(record::getOid))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_alter_table_change_column")
    default int updateByPrimaryKeySelective(MySqlAlterTableChangeColumn record) {
        return update(c ->
            c.set(afterColumnOid).equalToWhenPresent(record::getAfterColumnOid)
            .set(columnNameOid).equalToWhenPresent(record::getColumnNameOid)
            .set(firstColumnOid).equalToWhenPresent(record::getFirstColumnOid)
            .set(isFirst).equalToWhenPresent(record::getIsFirst)
            .set(newColumnDefinitionOid).equalToWhenPresent(record::getNewColumnDefinitionOid)
            .where(oid, isEqualTo(record::getOid))
        );
    }
}