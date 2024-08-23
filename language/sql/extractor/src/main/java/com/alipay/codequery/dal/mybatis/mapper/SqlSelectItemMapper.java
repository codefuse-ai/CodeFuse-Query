package com.alipay.codequery.dal.mybatis.mapper;

import static com.alipay.codequery.dal.mybatis.mapper.SqlSelectItemDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.alipay.codequery.dal.mybatis.domain.SqlSelectItem;
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
public interface SqlSelectItemMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_select_item")
    BasicColumn[] selectList = BasicColumn.columnList(oid, alias, alias2, aliasList, exprOid, isConnectByRoot, isUdtfSelectItem);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_select_item")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_select_item")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_select_item")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<SqlSelectItem> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_select_item")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<SqlSelectItem> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_select_item")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="alias", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="alias2", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="alias_list", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="expr_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_connect_by_root", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_udtf_select_item", javaType=Integer.class, jdbcType=JdbcType.BIGINT)
    })
    Optional<SqlSelectItem> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_select_item")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="alias", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="alias2", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="alias_list", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="expr_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_connect_by_root", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_udtf_select_item", javaType=Integer.class, jdbcType=JdbcType.BIGINT)
    })
    List<SqlSelectItem> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_select_item")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_select_item")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, sqlSelectItem, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_select_item")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, sqlSelectItem, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_select_item")
    default int deleteByPrimaryKey(Long oid_) {
        return delete(c -> 
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_select_item")
    default int insert(SqlSelectItem record) {
        return MyBatis3Utils.insert(this::insert, record, sqlSelectItem, c ->
            c.map(oid).toProperty("oid")
            .map(alias).toProperty("alias")
            .map(alias2).toProperty("alias2")
            .map(aliasList).toProperty("aliasList")
            .map(exprOid).toProperty("exprOid")
            .map(isConnectByRoot).toProperty("isConnectByRoot")
            .map(isUdtfSelectItem).toProperty("isUdtfSelectItem")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_select_item")
    default int insertMultiple(Collection<SqlSelectItem> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, sqlSelectItem, c ->
            c.map(oid).toProperty("oid")
            .map(alias).toProperty("alias")
            .map(alias2).toProperty("alias2")
            .map(aliasList).toProperty("aliasList")
            .map(exprOid).toProperty("exprOid")
            .map(isConnectByRoot).toProperty("isConnectByRoot")
            .map(isUdtfSelectItem).toProperty("isUdtfSelectItem")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_select_item")
    default int insertSelective(SqlSelectItem record) {
        return MyBatis3Utils.insert(this::insert, record, sqlSelectItem, c ->
            c.map(oid).toPropertyWhenPresent("oid", record::getOid)
            .map(alias).toPropertyWhenPresent("alias", record::getAlias)
            .map(alias2).toPropertyWhenPresent("alias2", record::getAlias2)
            .map(aliasList).toPropertyWhenPresent("aliasList", record::getAliasList)
            .map(exprOid).toPropertyWhenPresent("exprOid", record::getExprOid)
            .map(isConnectByRoot).toPropertyWhenPresent("isConnectByRoot", record::getIsConnectByRoot)
            .map(isUdtfSelectItem).toPropertyWhenPresent("isUdtfSelectItem", record::getIsUdtfSelectItem)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_select_item")
    default Optional<SqlSelectItem> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, sqlSelectItem, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_select_item")
    default List<SqlSelectItem> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, sqlSelectItem, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_select_item")
    default List<SqlSelectItem> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, sqlSelectItem, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_select_item")
    default Optional<SqlSelectItem> selectByPrimaryKey(Long oid_) {
        return selectOne(c ->
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_select_item")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, sqlSelectItem, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_select_item")
    static UpdateDSL<UpdateModel> updateAllColumns(SqlSelectItem record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalTo(record::getOid)
                .set(alias).equalTo(record::getAlias)
                .set(alias2).equalTo(record::getAlias2)
                .set(aliasList).equalTo(record::getAliasList)
                .set(exprOid).equalTo(record::getExprOid)
                .set(isConnectByRoot).equalTo(record::getIsConnectByRoot)
                .set(isUdtfSelectItem).equalTo(record::getIsUdtfSelectItem);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_select_item")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(SqlSelectItem record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalToWhenPresent(record::getOid)
                .set(alias).equalToWhenPresent(record::getAlias)
                .set(alias2).equalToWhenPresent(record::getAlias2)
                .set(aliasList).equalToWhenPresent(record::getAliasList)
                .set(exprOid).equalToWhenPresent(record::getExprOid)
                .set(isConnectByRoot).equalToWhenPresent(record::getIsConnectByRoot)
                .set(isUdtfSelectItem).equalToWhenPresent(record::getIsUdtfSelectItem);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_select_item")
    default int updateByPrimaryKey(SqlSelectItem record) {
        return update(c ->
            c.set(alias).equalTo(record::getAlias)
            .set(alias2).equalTo(record::getAlias2)
            .set(aliasList).equalTo(record::getAliasList)
            .set(exprOid).equalTo(record::getExprOid)
            .set(isConnectByRoot).equalTo(record::getIsConnectByRoot)
            .set(isUdtfSelectItem).equalTo(record::getIsUdtfSelectItem)
            .where(oid, isEqualTo(record::getOid))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_select_item")
    default int updateByPrimaryKeySelective(SqlSelectItem record) {
        return update(c ->
            c.set(alias).equalToWhenPresent(record::getAlias)
            .set(alias2).equalToWhenPresent(record::getAlias2)
            .set(aliasList).equalToWhenPresent(record::getAliasList)
            .set(exprOid).equalToWhenPresent(record::getExprOid)
            .set(isConnectByRoot).equalToWhenPresent(record::getIsConnectByRoot)
            .set(isUdtfSelectItem).equalToWhenPresent(record::getIsUdtfSelectItem)
            .where(oid, isEqualTo(record::getOid))
        );
    }
}