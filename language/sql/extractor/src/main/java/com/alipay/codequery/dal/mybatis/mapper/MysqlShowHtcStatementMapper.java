package com.alipay.codequery.dal.mybatis.mapper;

import static com.alipay.codequery.dal.mybatis.mapper.MysqlShowHtcStatementDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.alipay.codequery.dal.mybatis.domain.MysqlShowHtcStatement;
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
public interface MysqlShowHtcStatementMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: mysql_show_htc_statement")
    BasicColumn[] selectList = BasicColumn.columnList(oid, isFull, isHis);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: mysql_show_htc_statement")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: mysql_show_htc_statement")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: mysql_show_htc_statement")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<MysqlShowHtcStatement> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: mysql_show_htc_statement")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<MysqlShowHtcStatement> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: mysql_show_htc_statement")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="is_full", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_his", javaType=Integer.class, jdbcType=JdbcType.BIGINT)
    })
    Optional<MysqlShowHtcStatement> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: mysql_show_htc_statement")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="is_full", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_his", javaType=Integer.class, jdbcType=JdbcType.BIGINT)
    })
    List<MysqlShowHtcStatement> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: mysql_show_htc_statement")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: mysql_show_htc_statement")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, mysqlShowHtcStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: mysql_show_htc_statement")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, mysqlShowHtcStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: mysql_show_htc_statement")
    default int deleteByPrimaryKey(Long oid_) {
        return delete(c -> 
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: mysql_show_htc_statement")
    default int insert(MysqlShowHtcStatement record) {
        return MyBatis3Utils.insert(this::insert, record, mysqlShowHtcStatement, c ->
            c.map(oid).toProperty("oid")
            .map(isFull).toProperty("isFull")
            .map(isHis).toProperty("isHis")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: mysql_show_htc_statement")
    default int insertMultiple(Collection<MysqlShowHtcStatement> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, mysqlShowHtcStatement, c ->
            c.map(oid).toProperty("oid")
            .map(isFull).toProperty("isFull")
            .map(isHis).toProperty("isHis")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: mysql_show_htc_statement")
    default int insertSelective(MysqlShowHtcStatement record) {
        return MyBatis3Utils.insert(this::insert, record, mysqlShowHtcStatement, c ->
            c.map(oid).toPropertyWhenPresent("oid", record::getOid)
            .map(isFull).toPropertyWhenPresent("isFull", record::getIsFull)
            .map(isHis).toPropertyWhenPresent("isHis", record::getIsHis)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: mysql_show_htc_statement")
    default Optional<MysqlShowHtcStatement> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, mysqlShowHtcStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: mysql_show_htc_statement")
    default List<MysqlShowHtcStatement> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, mysqlShowHtcStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: mysql_show_htc_statement")
    default List<MysqlShowHtcStatement> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, mysqlShowHtcStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: mysql_show_htc_statement")
    default Optional<MysqlShowHtcStatement> selectByPrimaryKey(Long oid_) {
        return selectOne(c ->
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: mysql_show_htc_statement")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, mysqlShowHtcStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: mysql_show_htc_statement")
    static UpdateDSL<UpdateModel> updateAllColumns(MysqlShowHtcStatement record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalTo(record::getOid)
                .set(isFull).equalTo(record::getIsFull)
                .set(isHis).equalTo(record::getIsHis);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: mysql_show_htc_statement")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(MysqlShowHtcStatement record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalToWhenPresent(record::getOid)
                .set(isFull).equalToWhenPresent(record::getIsFull)
                .set(isHis).equalToWhenPresent(record::getIsHis);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: mysql_show_htc_statement")
    default int updateByPrimaryKey(MysqlShowHtcStatement record) {
        return update(c ->
            c.set(isFull).equalTo(record::getIsFull)
            .set(isHis).equalTo(record::getIsHis)
            .where(oid, isEqualTo(record::getOid))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: mysql_show_htc_statement")
    default int updateByPrimaryKeySelective(MysqlShowHtcStatement record) {
        return update(c ->
            c.set(isFull).equalToWhenPresent(record::getIsFull)
            .set(isHis).equalToWhenPresent(record::getIsHis)
            .where(oid, isEqualTo(record::getOid))
        );
    }
}