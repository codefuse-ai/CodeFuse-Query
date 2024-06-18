package com.alipay.codequery.dal.mybatis.mapper;

import static com.alipay.codequery.dal.mybatis.mapper.CallableEnclosingStatementDynamicSqlSupport.*;

import com.alipay.codequery.dal.mybatis.domain.CallableEnclosingStatement;
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
public interface CallableEnclosingStatementMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: callable_enclosing_statement")
    BasicColumn[] selectList = BasicColumn.columnList(statementHashId, callableHashId);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: callable_enclosing_statement")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: callable_enclosing_statement")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: callable_enclosing_statement")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<CallableEnclosingStatement> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: callable_enclosing_statement")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<CallableEnclosingStatement> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: callable_enclosing_statement")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="statement_hash_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="callable_hash_id", javaType=Long.class, jdbcType=JdbcType.BIGINT)
    })
    Optional<CallableEnclosingStatement> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: callable_enclosing_statement")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="statement_hash_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="callable_hash_id", javaType=Long.class, jdbcType=JdbcType.BIGINT)
    })
    List<CallableEnclosingStatement> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: callable_enclosing_statement")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: callable_enclosing_statement")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, callableEnclosingStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: callable_enclosing_statement")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, callableEnclosingStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: callable_enclosing_statement")
    default int insert(CallableEnclosingStatement record) {
        return MyBatis3Utils.insert(this::insert, record, callableEnclosingStatement, c ->
            c.map(statementHashId).toProperty("statementHashId")
            .map(callableHashId).toProperty("callableHashId")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: callable_enclosing_statement")
    default int insertMultiple(Collection<CallableEnclosingStatement> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, callableEnclosingStatement, c ->
            c.map(statementHashId).toProperty("statementHashId")
            .map(callableHashId).toProperty("callableHashId")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: callable_enclosing_statement")
    default int insertSelective(CallableEnclosingStatement record) {
        return MyBatis3Utils.insert(this::insert, record, callableEnclosingStatement, c ->
            c.map(statementHashId).toPropertyWhenPresent("statementHashId", record::getStatementHashId)
            .map(callableHashId).toPropertyWhenPresent("callableHashId", record::getCallableHashId)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: callable_enclosing_statement")
    default Optional<CallableEnclosingStatement> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, callableEnclosingStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: callable_enclosing_statement")
    default List<CallableEnclosingStatement> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, callableEnclosingStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: callable_enclosing_statement")
    default List<CallableEnclosingStatement> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, callableEnclosingStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: callable_enclosing_statement")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, callableEnclosingStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: callable_enclosing_statement")
    static UpdateDSL<UpdateModel> updateAllColumns(CallableEnclosingStatement record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(statementHashId).equalTo(record::getStatementHashId)
                .set(callableHashId).equalTo(record::getCallableHashId);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: callable_enclosing_statement")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(CallableEnclosingStatement record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(statementHashId).equalToWhenPresent(record::getStatementHashId)
                .set(callableHashId).equalToWhenPresent(record::getCallableHashId);
    }
}