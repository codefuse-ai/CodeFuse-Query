package com.alipay.codequery.dal.mybatis.mapper;

import static com.alipay.codequery.dal.mybatis.mapper.MySqlCharExprDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.alipay.codequery.dal.mybatis.domain.MySqlCharExpr;
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
public interface MySqlCharExprMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_char_expr")
    BasicColumn[] selectList = BasicColumn.columnList(oid, charset, collate, type);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_char_expr")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_char_expr")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_char_expr")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<MySqlCharExpr> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_char_expr")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<MySqlCharExpr> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_char_expr")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="charset", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="collate", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="type", javaType=String.class, jdbcType=JdbcType.VARCHAR)
    })
    Optional<MySqlCharExpr> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_char_expr")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="charset", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="collate", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="type", javaType=String.class, jdbcType=JdbcType.VARCHAR)
    })
    List<MySqlCharExpr> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_char_expr")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_char_expr")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, mySqlCharExpr, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_char_expr")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, mySqlCharExpr, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_char_expr")
    default int deleteByPrimaryKey(Long oid_) {
        return delete(c -> 
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_char_expr")
    default int insert(MySqlCharExpr record) {
        return MyBatis3Utils.insert(this::insert, record, mySqlCharExpr, c ->
            c.map(oid).toProperty("oid")
            .map(charset).toProperty("charset")
            .map(collate).toProperty("collate")
            .map(type).toProperty("type")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_char_expr")
    default int insertMultiple(Collection<MySqlCharExpr> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, mySqlCharExpr, c ->
            c.map(oid).toProperty("oid")
            .map(charset).toProperty("charset")
            .map(collate).toProperty("collate")
            .map(type).toProperty("type")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_char_expr")
    default int insertSelective(MySqlCharExpr record) {
        return MyBatis3Utils.insert(this::insert, record, mySqlCharExpr, c ->
            c.map(oid).toPropertyWhenPresent("oid", record::getOid)
            .map(charset).toPropertyWhenPresent("charset", record::getCharset)
            .map(collate).toPropertyWhenPresent("collate", record::getCollate)
            .map(type).toPropertyWhenPresent("type", record::getType)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_char_expr")
    default Optional<MySqlCharExpr> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, mySqlCharExpr, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_char_expr")
    default List<MySqlCharExpr> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, mySqlCharExpr, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_char_expr")
    default List<MySqlCharExpr> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, mySqlCharExpr, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_char_expr")
    default Optional<MySqlCharExpr> selectByPrimaryKey(Long oid_) {
        return selectOne(c ->
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_char_expr")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, mySqlCharExpr, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_char_expr")
    static UpdateDSL<UpdateModel> updateAllColumns(MySqlCharExpr record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalTo(record::getOid)
                .set(charset).equalTo(record::getCharset)
                .set(collate).equalTo(record::getCollate)
                .set(type).equalTo(record::getType);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_char_expr")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(MySqlCharExpr record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalToWhenPresent(record::getOid)
                .set(charset).equalToWhenPresent(record::getCharset)
                .set(collate).equalToWhenPresent(record::getCollate)
                .set(type).equalToWhenPresent(record::getType);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_char_expr")
    default int updateByPrimaryKey(MySqlCharExpr record) {
        return update(c ->
            c.set(charset).equalTo(record::getCharset)
            .set(collate).equalTo(record::getCollate)
            .set(type).equalTo(record::getType)
            .where(oid, isEqualTo(record::getOid))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_char_expr")
    default int updateByPrimaryKeySelective(MySqlCharExpr record) {
        return update(c ->
            c.set(charset).equalToWhenPresent(record::getCharset)
            .set(collate).equalToWhenPresent(record::getCollate)
            .set(type).equalToWhenPresent(record::getType)
            .where(oid, isEqualTo(record::getOid))
        );
    }
}