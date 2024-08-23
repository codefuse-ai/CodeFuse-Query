package com.alipay.codequery.dal.mybatis.mapper;

import static com.alipay.codequery.dal.mybatis.mapper.MySqlDeclareConditionStatementDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.alipay.codequery.dal.mybatis.domain.MySqlDeclareConditionStatement;
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
public interface MySqlDeclareConditionStatementMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_declare_condition_statement")
    BasicColumn[] selectList = BasicColumn.columnList(oid, conditionName, conditionValue);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_declare_condition_statement")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_declare_condition_statement")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_declare_condition_statement")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<MySqlDeclareConditionStatement> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_declare_condition_statement")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<MySqlDeclareConditionStatement> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_declare_condition_statement")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="condition_name", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="condition_value", javaType=String.class, jdbcType=JdbcType.VARCHAR)
    })
    Optional<MySqlDeclareConditionStatement> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_declare_condition_statement")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="condition_name", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="condition_value", javaType=String.class, jdbcType=JdbcType.VARCHAR)
    })
    List<MySqlDeclareConditionStatement> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_declare_condition_statement")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_declare_condition_statement")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, mySqlDeclareConditionStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_declare_condition_statement")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, mySqlDeclareConditionStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_declare_condition_statement")
    default int deleteByPrimaryKey(Long oid_) {
        return delete(c -> 
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_declare_condition_statement")
    default int insert(MySqlDeclareConditionStatement record) {
        return MyBatis3Utils.insert(this::insert, record, mySqlDeclareConditionStatement, c ->
            c.map(oid).toProperty("oid")
            .map(conditionName).toProperty("conditionName")
            .map(conditionValue).toProperty("conditionValue")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_declare_condition_statement")
    default int insertMultiple(Collection<MySqlDeclareConditionStatement> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, mySqlDeclareConditionStatement, c ->
            c.map(oid).toProperty("oid")
            .map(conditionName).toProperty("conditionName")
            .map(conditionValue).toProperty("conditionValue")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_declare_condition_statement")
    default int insertSelective(MySqlDeclareConditionStatement record) {
        return MyBatis3Utils.insert(this::insert, record, mySqlDeclareConditionStatement, c ->
            c.map(oid).toPropertyWhenPresent("oid", record::getOid)
            .map(conditionName).toPropertyWhenPresent("conditionName", record::getConditionName)
            .map(conditionValue).toPropertyWhenPresent("conditionValue", record::getConditionValue)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_declare_condition_statement")
    default Optional<MySqlDeclareConditionStatement> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, mySqlDeclareConditionStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_declare_condition_statement")
    default List<MySqlDeclareConditionStatement> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, mySqlDeclareConditionStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_declare_condition_statement")
    default List<MySqlDeclareConditionStatement> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, mySqlDeclareConditionStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_declare_condition_statement")
    default Optional<MySqlDeclareConditionStatement> selectByPrimaryKey(Long oid_) {
        return selectOne(c ->
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_declare_condition_statement")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, mySqlDeclareConditionStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_declare_condition_statement")
    static UpdateDSL<UpdateModel> updateAllColumns(MySqlDeclareConditionStatement record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalTo(record::getOid)
                .set(conditionName).equalTo(record::getConditionName)
                .set(conditionValue).equalTo(record::getConditionValue);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_declare_condition_statement")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(MySqlDeclareConditionStatement record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalToWhenPresent(record::getOid)
                .set(conditionName).equalToWhenPresent(record::getConditionName)
                .set(conditionValue).equalToWhenPresent(record::getConditionValue);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_declare_condition_statement")
    default int updateByPrimaryKey(MySqlDeclareConditionStatement record) {
        return update(c ->
            c.set(conditionName).equalTo(record::getConditionName)
            .set(conditionValue).equalTo(record::getConditionValue)
            .where(oid, isEqualTo(record::getOid))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_declare_condition_statement")
    default int updateByPrimaryKeySelective(MySqlDeclareConditionStatement record) {
        return update(c ->
            c.set(conditionName).equalToWhenPresent(record::getConditionName)
            .set(conditionValue).equalToWhenPresent(record::getConditionValue)
            .where(oid, isEqualTo(record::getOid))
        );
    }
}