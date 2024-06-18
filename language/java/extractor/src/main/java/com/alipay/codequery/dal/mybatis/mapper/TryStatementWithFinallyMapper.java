package com.alipay.codequery.dal.mybatis.mapper;

import static com.alipay.codequery.dal.mybatis.mapper.TryStatementWithFinallyDynamicSqlSupport.*;

import com.alipay.codequery.dal.mybatis.domain.TryStatementWithFinally;
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
public interface TryStatementWithFinallyMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: try_statement_with_finally")
    BasicColumn[] selectList = BasicColumn.columnList(elementHashId, tryBlockHashId, finallyBlockHashId);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: try_statement_with_finally")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: try_statement_with_finally")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: try_statement_with_finally")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<TryStatementWithFinally> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: try_statement_with_finally")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<TryStatementWithFinally> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: try_statement_with_finally")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="element_hash_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="try_block_hash_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="finally_block_hash_id", javaType=Long.class, jdbcType=JdbcType.BIGINT)
    })
    Optional<TryStatementWithFinally> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: try_statement_with_finally")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="element_hash_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="try_block_hash_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="finally_block_hash_id", javaType=Long.class, jdbcType=JdbcType.BIGINT)
    })
    List<TryStatementWithFinally> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: try_statement_with_finally")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: try_statement_with_finally")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, tryStatementWithFinally, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: try_statement_with_finally")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, tryStatementWithFinally, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: try_statement_with_finally")
    default int insert(TryStatementWithFinally record) {
        return MyBatis3Utils.insert(this::insert, record, tryStatementWithFinally, c ->
            c.map(elementHashId).toProperty("elementHashId")
            .map(tryBlockHashId).toProperty("tryBlockHashId")
            .map(finallyBlockHashId).toProperty("finallyBlockHashId")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: try_statement_with_finally")
    default int insertMultiple(Collection<TryStatementWithFinally> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, tryStatementWithFinally, c ->
            c.map(elementHashId).toProperty("elementHashId")
            .map(tryBlockHashId).toProperty("tryBlockHashId")
            .map(finallyBlockHashId).toProperty("finallyBlockHashId")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: try_statement_with_finally")
    default int insertSelective(TryStatementWithFinally record) {
        return MyBatis3Utils.insert(this::insert, record, tryStatementWithFinally, c ->
            c.map(elementHashId).toPropertyWhenPresent("elementHashId", record::getElementHashId)
            .map(tryBlockHashId).toPropertyWhenPresent("tryBlockHashId", record::getTryBlockHashId)
            .map(finallyBlockHashId).toPropertyWhenPresent("finallyBlockHashId", record::getFinallyBlockHashId)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: try_statement_with_finally")
    default Optional<TryStatementWithFinally> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, tryStatementWithFinally, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: try_statement_with_finally")
    default List<TryStatementWithFinally> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, tryStatementWithFinally, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: try_statement_with_finally")
    default List<TryStatementWithFinally> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, tryStatementWithFinally, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: try_statement_with_finally")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, tryStatementWithFinally, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: try_statement_with_finally")
    static UpdateDSL<UpdateModel> updateAllColumns(TryStatementWithFinally record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(elementHashId).equalTo(record::getElementHashId)
                .set(tryBlockHashId).equalTo(record::getTryBlockHashId)
                .set(finallyBlockHashId).equalTo(record::getFinallyBlockHashId);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: try_statement_with_finally")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(TryStatementWithFinally record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(elementHashId).equalToWhenPresent(record::getElementHashId)
                .set(tryBlockHashId).equalToWhenPresent(record::getTryBlockHashId)
                .set(finallyBlockHashId).equalToWhenPresent(record::getFinallyBlockHashId);
    }
}