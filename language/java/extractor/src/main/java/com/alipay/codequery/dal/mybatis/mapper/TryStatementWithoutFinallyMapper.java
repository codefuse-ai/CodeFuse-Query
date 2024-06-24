package com.alipay.codequery.dal.mybatis.mapper;

import static com.alipay.codequery.dal.mybatis.mapper.TryStatementWithoutFinallyDynamicSqlSupport.*;

import com.alipay.codequery.dal.mybatis.domain.TryStatementWithoutFinally;
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
public interface TryStatementWithoutFinallyMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: try_statement_without_finally")
    BasicColumn[] selectList = BasicColumn.columnList(elementHashId, tryBlockHashId);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: try_statement_without_finally")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: try_statement_without_finally")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: try_statement_without_finally")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<TryStatementWithoutFinally> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: try_statement_without_finally")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<TryStatementWithoutFinally> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: try_statement_without_finally")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="element_hash_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="try_block_hash_id", javaType=Long.class, jdbcType=JdbcType.BIGINT)
    })
    Optional<TryStatementWithoutFinally> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: try_statement_without_finally")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="element_hash_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="try_block_hash_id", javaType=Long.class, jdbcType=JdbcType.BIGINT)
    })
    List<TryStatementWithoutFinally> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: try_statement_without_finally")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: try_statement_without_finally")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, tryStatementWithoutFinally, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: try_statement_without_finally")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, tryStatementWithoutFinally, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: try_statement_without_finally")
    default int insert(TryStatementWithoutFinally record) {
        return MyBatis3Utils.insert(this::insert, record, tryStatementWithoutFinally, c ->
            c.map(elementHashId).toProperty("elementHashId")
            .map(tryBlockHashId).toProperty("tryBlockHashId")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: try_statement_without_finally")
    default int insertMultiple(Collection<TryStatementWithoutFinally> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, tryStatementWithoutFinally, c ->
            c.map(elementHashId).toProperty("elementHashId")
            .map(tryBlockHashId).toProperty("tryBlockHashId")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: try_statement_without_finally")
    default int insertSelective(TryStatementWithoutFinally record) {
        return MyBatis3Utils.insert(this::insert, record, tryStatementWithoutFinally, c ->
            c.map(elementHashId).toPropertyWhenPresent("elementHashId", record::getElementHashId)
            .map(tryBlockHashId).toPropertyWhenPresent("tryBlockHashId", record::getTryBlockHashId)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: try_statement_without_finally")
    default Optional<TryStatementWithoutFinally> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, tryStatementWithoutFinally, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: try_statement_without_finally")
    default List<TryStatementWithoutFinally> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, tryStatementWithoutFinally, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: try_statement_without_finally")
    default List<TryStatementWithoutFinally> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, tryStatementWithoutFinally, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: try_statement_without_finally")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, tryStatementWithoutFinally, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: try_statement_without_finally")
    static UpdateDSL<UpdateModel> updateAllColumns(TryStatementWithoutFinally record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(elementHashId).equalTo(record::getElementHashId)
                .set(tryBlockHashId).equalTo(record::getTryBlockHashId);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: try_statement_without_finally")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(TryStatementWithoutFinally record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(elementHashId).equalToWhenPresent(record::getElementHashId)
                .set(tryBlockHashId).equalToWhenPresent(record::getTryBlockHashId);
    }
}