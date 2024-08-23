package com.alipay.codequery.dal.mybatis.mapper;

import static com.alipay.codequery.dal.mybatis.mapper.MysqlAlterFullTextStatementDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.alipay.codequery.dal.mybatis.domain.MysqlAlterFullTextStatement;
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
public interface MysqlAlterFullTextStatementMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: mysql_alter_full_text_statement")
    BasicColumn[] selectList = BasicColumn.columnList(oid, itemOid, nameOid, type);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: mysql_alter_full_text_statement")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: mysql_alter_full_text_statement")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: mysql_alter_full_text_statement")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<MysqlAlterFullTextStatement> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: mysql_alter_full_text_statement")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<MysqlAlterFullTextStatement> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: mysql_alter_full_text_statement")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="item_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="name_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="type", javaType=String.class, jdbcType=JdbcType.VARCHAR)
    })
    Optional<MysqlAlterFullTextStatement> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: mysql_alter_full_text_statement")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="item_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="name_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="type", javaType=String.class, jdbcType=JdbcType.VARCHAR)
    })
    List<MysqlAlterFullTextStatement> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: mysql_alter_full_text_statement")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: mysql_alter_full_text_statement")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, mysqlAlterFullTextStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: mysql_alter_full_text_statement")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, mysqlAlterFullTextStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: mysql_alter_full_text_statement")
    default int deleteByPrimaryKey(Long oid_) {
        return delete(c -> 
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: mysql_alter_full_text_statement")
    default int insert(MysqlAlterFullTextStatement record) {
        return MyBatis3Utils.insert(this::insert, record, mysqlAlterFullTextStatement, c ->
            c.map(oid).toProperty("oid")
            .map(itemOid).toProperty("itemOid")
            .map(nameOid).toProperty("nameOid")
            .map(type).toProperty("type")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: mysql_alter_full_text_statement")
    default int insertMultiple(Collection<MysqlAlterFullTextStatement> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, mysqlAlterFullTextStatement, c ->
            c.map(oid).toProperty("oid")
            .map(itemOid).toProperty("itemOid")
            .map(nameOid).toProperty("nameOid")
            .map(type).toProperty("type")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: mysql_alter_full_text_statement")
    default int insertSelective(MysqlAlterFullTextStatement record) {
        return MyBatis3Utils.insert(this::insert, record, mysqlAlterFullTextStatement, c ->
            c.map(oid).toPropertyWhenPresent("oid", record::getOid)
            .map(itemOid).toPropertyWhenPresent("itemOid", record::getItemOid)
            .map(nameOid).toPropertyWhenPresent("nameOid", record::getNameOid)
            .map(type).toPropertyWhenPresent("type", record::getType)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: mysql_alter_full_text_statement")
    default Optional<MysqlAlterFullTextStatement> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, mysqlAlterFullTextStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: mysql_alter_full_text_statement")
    default List<MysqlAlterFullTextStatement> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, mysqlAlterFullTextStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: mysql_alter_full_text_statement")
    default List<MysqlAlterFullTextStatement> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, mysqlAlterFullTextStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: mysql_alter_full_text_statement")
    default Optional<MysqlAlterFullTextStatement> selectByPrimaryKey(Long oid_) {
        return selectOne(c ->
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: mysql_alter_full_text_statement")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, mysqlAlterFullTextStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: mysql_alter_full_text_statement")
    static UpdateDSL<UpdateModel> updateAllColumns(MysqlAlterFullTextStatement record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalTo(record::getOid)
                .set(itemOid).equalTo(record::getItemOid)
                .set(nameOid).equalTo(record::getNameOid)
                .set(type).equalTo(record::getType);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: mysql_alter_full_text_statement")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(MysqlAlterFullTextStatement record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalToWhenPresent(record::getOid)
                .set(itemOid).equalToWhenPresent(record::getItemOid)
                .set(nameOid).equalToWhenPresent(record::getNameOid)
                .set(type).equalToWhenPresent(record::getType);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: mysql_alter_full_text_statement")
    default int updateByPrimaryKey(MysqlAlterFullTextStatement record) {
        return update(c ->
            c.set(itemOid).equalTo(record::getItemOid)
            .set(nameOid).equalTo(record::getNameOid)
            .set(type).equalTo(record::getType)
            .where(oid, isEqualTo(record::getOid))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: mysql_alter_full_text_statement")
    default int updateByPrimaryKeySelective(MysqlAlterFullTextStatement record) {
        return update(c ->
            c.set(itemOid).equalToWhenPresent(record::getItemOid)
            .set(nameOid).equalToWhenPresent(record::getNameOid)
            .set(type).equalToWhenPresent(record::getType)
            .where(oid, isEqualTo(record::getOid))
        );
    }
}