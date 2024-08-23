package com.alipay.codequery.dal.mybatis.mapper;

import static com.alipay.codequery.dal.mybatis.mapper.MySqlDeclareHandlerStatementDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.alipay.codequery.dal.mybatis.domain.MySqlDeclareHandlerStatement;
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
public interface MySqlDeclareHandlerStatementMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_declare_handler_statement")
    BasicColumn[] selectList = BasicColumn.columnList(oid, conditionValues, handleType, spStatementOid);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_declare_handler_statement")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_declare_handler_statement")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_declare_handler_statement")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<MySqlDeclareHandlerStatement> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_declare_handler_statement")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<MySqlDeclareHandlerStatement> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_declare_handler_statement")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="condition_values", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="handle_type", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="sp_statement_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT)
    })
    Optional<MySqlDeclareHandlerStatement> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_declare_handler_statement")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="condition_values", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="handle_type", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="sp_statement_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT)
    })
    List<MySqlDeclareHandlerStatement> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_declare_handler_statement")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_declare_handler_statement")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, mySqlDeclareHandlerStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_declare_handler_statement")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, mySqlDeclareHandlerStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_declare_handler_statement")
    default int deleteByPrimaryKey(Long oid_) {
        return delete(c -> 
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_declare_handler_statement")
    default int insert(MySqlDeclareHandlerStatement record) {
        return MyBatis3Utils.insert(this::insert, record, mySqlDeclareHandlerStatement, c ->
            c.map(oid).toProperty("oid")
            .map(conditionValues).toProperty("conditionValues")
            .map(handleType).toProperty("handleType")
            .map(spStatementOid).toProperty("spStatementOid")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_declare_handler_statement")
    default int insertMultiple(Collection<MySqlDeclareHandlerStatement> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, mySqlDeclareHandlerStatement, c ->
            c.map(oid).toProperty("oid")
            .map(conditionValues).toProperty("conditionValues")
            .map(handleType).toProperty("handleType")
            .map(spStatementOid).toProperty("spStatementOid")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_declare_handler_statement")
    default int insertSelective(MySqlDeclareHandlerStatement record) {
        return MyBatis3Utils.insert(this::insert, record, mySqlDeclareHandlerStatement, c ->
            c.map(oid).toPropertyWhenPresent("oid", record::getOid)
            .map(conditionValues).toPropertyWhenPresent("conditionValues", record::getConditionValues)
            .map(handleType).toPropertyWhenPresent("handleType", record::getHandleType)
            .map(spStatementOid).toPropertyWhenPresent("spStatementOid", record::getSpStatementOid)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_declare_handler_statement")
    default Optional<MySqlDeclareHandlerStatement> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, mySqlDeclareHandlerStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_declare_handler_statement")
    default List<MySqlDeclareHandlerStatement> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, mySqlDeclareHandlerStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_declare_handler_statement")
    default List<MySqlDeclareHandlerStatement> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, mySqlDeclareHandlerStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_declare_handler_statement")
    default Optional<MySqlDeclareHandlerStatement> selectByPrimaryKey(Long oid_) {
        return selectOne(c ->
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_declare_handler_statement")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, mySqlDeclareHandlerStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_declare_handler_statement")
    static UpdateDSL<UpdateModel> updateAllColumns(MySqlDeclareHandlerStatement record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalTo(record::getOid)
                .set(conditionValues).equalTo(record::getConditionValues)
                .set(handleType).equalTo(record::getHandleType)
                .set(spStatementOid).equalTo(record::getSpStatementOid);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_declare_handler_statement")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(MySqlDeclareHandlerStatement record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalToWhenPresent(record::getOid)
                .set(conditionValues).equalToWhenPresent(record::getConditionValues)
                .set(handleType).equalToWhenPresent(record::getHandleType)
                .set(spStatementOid).equalToWhenPresent(record::getSpStatementOid);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_declare_handler_statement")
    default int updateByPrimaryKey(MySqlDeclareHandlerStatement record) {
        return update(c ->
            c.set(conditionValues).equalTo(record::getConditionValues)
            .set(handleType).equalTo(record::getHandleType)
            .set(spStatementOid).equalTo(record::getSpStatementOid)
            .where(oid, isEqualTo(record::getOid))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_declare_handler_statement")
    default int updateByPrimaryKeySelective(MySqlDeclareHandlerStatement record) {
        return update(c ->
            c.set(conditionValues).equalToWhenPresent(record::getConditionValues)
            .set(handleType).equalToWhenPresent(record::getHandleType)
            .set(spStatementOid).equalToWhenPresent(record::getSpStatementOid)
            .where(oid, isEqualTo(record::getOid))
        );
    }
}