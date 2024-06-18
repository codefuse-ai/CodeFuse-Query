package com.alipay.codequery.dal.mybatis.mapper;

import static com.alipay.codequery.dal.mybatis.mapper.SynchronizedStatementDynamicSqlSupport.*;

import com.alipay.codequery.dal.mybatis.domain.SynchronizedStatement;
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
public interface SynchronizedStatementMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: synchronized_statement")
    BasicColumn[] selectList = BasicColumn.columnList(elementHashId, lockExpressionHashId, bodyDeclarationHashId);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: synchronized_statement")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: synchronized_statement")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: synchronized_statement")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<SynchronizedStatement> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: synchronized_statement")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<SynchronizedStatement> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: synchronized_statement")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="element_hash_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="lock_expression_hash_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="body_declaration_hash_id", javaType=Long.class, jdbcType=JdbcType.BIGINT)
    })
    Optional<SynchronizedStatement> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: synchronized_statement")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="element_hash_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="lock_expression_hash_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="body_declaration_hash_id", javaType=Long.class, jdbcType=JdbcType.BIGINT)
    })
    List<SynchronizedStatement> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: synchronized_statement")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: synchronized_statement")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, synchronizedStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: synchronized_statement")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, synchronizedStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: synchronized_statement")
    default int insert(SynchronizedStatement record) {
        return MyBatis3Utils.insert(this::insert, record, synchronizedStatement, c ->
            c.map(elementHashId).toProperty("elementHashId")
            .map(lockExpressionHashId).toProperty("lockExpressionHashId")
            .map(bodyDeclarationHashId).toProperty("bodyDeclarationHashId")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: synchronized_statement")
    default int insertMultiple(Collection<SynchronizedStatement> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, synchronizedStatement, c ->
            c.map(elementHashId).toProperty("elementHashId")
            .map(lockExpressionHashId).toProperty("lockExpressionHashId")
            .map(bodyDeclarationHashId).toProperty("bodyDeclarationHashId")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: synchronized_statement")
    default int insertSelective(SynchronizedStatement record) {
        return MyBatis3Utils.insert(this::insert, record, synchronizedStatement, c ->
            c.map(elementHashId).toPropertyWhenPresent("elementHashId", record::getElementHashId)
            .map(lockExpressionHashId).toPropertyWhenPresent("lockExpressionHashId", record::getLockExpressionHashId)
            .map(bodyDeclarationHashId).toPropertyWhenPresent("bodyDeclarationHashId", record::getBodyDeclarationHashId)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: synchronized_statement")
    default Optional<SynchronizedStatement> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, synchronizedStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: synchronized_statement")
    default List<SynchronizedStatement> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, synchronizedStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: synchronized_statement")
    default List<SynchronizedStatement> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, synchronizedStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: synchronized_statement")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, synchronizedStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: synchronized_statement")
    static UpdateDSL<UpdateModel> updateAllColumns(SynchronizedStatement record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(elementHashId).equalTo(record::getElementHashId)
                .set(lockExpressionHashId).equalTo(record::getLockExpressionHashId)
                .set(bodyDeclarationHashId).equalTo(record::getBodyDeclarationHashId);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: synchronized_statement")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(SynchronizedStatement record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(elementHashId).equalToWhenPresent(record::getElementHashId)
                .set(lockExpressionHashId).equalToWhenPresent(record::getLockExpressionHashId)
                .set(bodyDeclarationHashId).equalToWhenPresent(record::getBodyDeclarationHashId);
    }
}