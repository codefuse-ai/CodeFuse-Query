package com.alipay.codequery.dal.mybatis.mapper;

import static com.alipay.codequery.dal.mybatis.mapper.CallableBindingDynamicSqlSupport.*;

import com.alipay.codequery.dal.mybatis.domain.CallableBinding;
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
public interface CallableBindingMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: callable_binding")
    BasicColumn[] selectList = BasicColumn.columnList(callerHashId, calleeHashId);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: callable_binding")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: callable_binding")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: callable_binding")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<CallableBinding> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: callable_binding")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<CallableBinding> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: callable_binding")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="caller_hash_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="callee_hash_id", javaType=Long.class, jdbcType=JdbcType.BIGINT)
    })
    Optional<CallableBinding> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: callable_binding")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="caller_hash_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="callee_hash_id", javaType=Long.class, jdbcType=JdbcType.BIGINT)
    })
    List<CallableBinding> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: callable_binding")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: callable_binding")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, callableBinding, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: callable_binding")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, callableBinding, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: callable_binding")
    default int insert(CallableBinding record) {
        return MyBatis3Utils.insert(this::insert, record, callableBinding, c ->
            c.map(callerHashId).toProperty("callerHashId")
            .map(calleeHashId).toProperty("calleeHashId")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: callable_binding")
    default int insertMultiple(Collection<CallableBinding> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, callableBinding, c ->
            c.map(callerHashId).toProperty("callerHashId")
            .map(calleeHashId).toProperty("calleeHashId")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: callable_binding")
    default int insertSelective(CallableBinding record) {
        return MyBatis3Utils.insert(this::insert, record, callableBinding, c ->
            c.map(callerHashId).toPropertyWhenPresent("callerHashId", record::getCallerHashId)
            .map(calleeHashId).toPropertyWhenPresent("calleeHashId", record::getCalleeHashId)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: callable_binding")
    default Optional<CallableBinding> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, callableBinding, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: callable_binding")
    default List<CallableBinding> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, callableBinding, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: callable_binding")
    default List<CallableBinding> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, callableBinding, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: callable_binding")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, callableBinding, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: callable_binding")
    static UpdateDSL<UpdateModel> updateAllColumns(CallableBinding record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(callerHashId).equalTo(record::getCallerHashId)
                .set(calleeHashId).equalTo(record::getCalleeHashId);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: callable_binding")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(CallableBinding record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(callerHashId).equalToWhenPresent(record::getCallerHashId)
                .set(calleeHashId).equalToWhenPresent(record::getCalleeHashId);
    }
}