package com.alipay.codequery.dal.mybatis.mapper;

import static com.alipay.codequery.dal.mybatis.mapper.MySqlInsertStatementDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.alipay.codequery.dal.mybatis.domain.MySqlInsertStatement;
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
public interface MySqlInsertStatementMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_insert_statement")
    BasicColumn[] selectList = BasicColumn.columnList(oid, hintsSize, isDelayed, isFulltextDictionary, isHighPriority, isIfNotExists, isIgnore, isLowPriority, isOverwrite, isRollbackOnFail);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_insert_statement")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_insert_statement")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_insert_statement")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<MySqlInsertStatement> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_insert_statement")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<MySqlInsertStatement> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_insert_statement")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="hints_size", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_delayed", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_fulltext_dictionary", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_high_priority", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_if_not_exists", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_ignore", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_low_priority", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_overwrite", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_rollback_on_fail", javaType=Integer.class, jdbcType=JdbcType.BIGINT)
    })
    Optional<MySqlInsertStatement> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_insert_statement")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="hints_size", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_delayed", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_fulltext_dictionary", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_high_priority", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_if_not_exists", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_ignore", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_low_priority", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_overwrite", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_rollback_on_fail", javaType=Integer.class, jdbcType=JdbcType.BIGINT)
    })
    List<MySqlInsertStatement> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_insert_statement")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_insert_statement")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, mySqlInsertStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_insert_statement")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, mySqlInsertStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_insert_statement")
    default int deleteByPrimaryKey(Long oid_) {
        return delete(c -> 
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_insert_statement")
    default int insert(MySqlInsertStatement record) {
        return MyBatis3Utils.insert(this::insert, record, mySqlInsertStatement, c ->
            c.map(oid).toProperty("oid")
            .map(hintsSize).toProperty("hintsSize")
            .map(isDelayed).toProperty("isDelayed")
            .map(isFulltextDictionary).toProperty("isFulltextDictionary")
            .map(isHighPriority).toProperty("isHighPriority")
            .map(isIfNotExists).toProperty("isIfNotExists")
            .map(isIgnore).toProperty("isIgnore")
            .map(isLowPriority).toProperty("isLowPriority")
            .map(isOverwrite).toProperty("isOverwrite")
            .map(isRollbackOnFail).toProperty("isRollbackOnFail")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_insert_statement")
    default int insertMultiple(Collection<MySqlInsertStatement> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, mySqlInsertStatement, c ->
            c.map(oid).toProperty("oid")
            .map(hintsSize).toProperty("hintsSize")
            .map(isDelayed).toProperty("isDelayed")
            .map(isFulltextDictionary).toProperty("isFulltextDictionary")
            .map(isHighPriority).toProperty("isHighPriority")
            .map(isIfNotExists).toProperty("isIfNotExists")
            .map(isIgnore).toProperty("isIgnore")
            .map(isLowPriority).toProperty("isLowPriority")
            .map(isOverwrite).toProperty("isOverwrite")
            .map(isRollbackOnFail).toProperty("isRollbackOnFail")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_insert_statement")
    default int insertSelective(MySqlInsertStatement record) {
        return MyBatis3Utils.insert(this::insert, record, mySqlInsertStatement, c ->
            c.map(oid).toPropertyWhenPresent("oid", record::getOid)
            .map(hintsSize).toPropertyWhenPresent("hintsSize", record::getHintsSize)
            .map(isDelayed).toPropertyWhenPresent("isDelayed", record::getIsDelayed)
            .map(isFulltextDictionary).toPropertyWhenPresent("isFulltextDictionary", record::getIsFulltextDictionary)
            .map(isHighPriority).toPropertyWhenPresent("isHighPriority", record::getIsHighPriority)
            .map(isIfNotExists).toPropertyWhenPresent("isIfNotExists", record::getIsIfNotExists)
            .map(isIgnore).toPropertyWhenPresent("isIgnore", record::getIsIgnore)
            .map(isLowPriority).toPropertyWhenPresent("isLowPriority", record::getIsLowPriority)
            .map(isOverwrite).toPropertyWhenPresent("isOverwrite", record::getIsOverwrite)
            .map(isRollbackOnFail).toPropertyWhenPresent("isRollbackOnFail", record::getIsRollbackOnFail)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_insert_statement")
    default Optional<MySqlInsertStatement> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, mySqlInsertStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_insert_statement")
    default List<MySqlInsertStatement> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, mySqlInsertStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_insert_statement")
    default List<MySqlInsertStatement> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, mySqlInsertStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_insert_statement")
    default Optional<MySqlInsertStatement> selectByPrimaryKey(Long oid_) {
        return selectOne(c ->
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_insert_statement")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, mySqlInsertStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_insert_statement")
    static UpdateDSL<UpdateModel> updateAllColumns(MySqlInsertStatement record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalTo(record::getOid)
                .set(hintsSize).equalTo(record::getHintsSize)
                .set(isDelayed).equalTo(record::getIsDelayed)
                .set(isFulltextDictionary).equalTo(record::getIsFulltextDictionary)
                .set(isHighPriority).equalTo(record::getIsHighPriority)
                .set(isIfNotExists).equalTo(record::getIsIfNotExists)
                .set(isIgnore).equalTo(record::getIsIgnore)
                .set(isLowPriority).equalTo(record::getIsLowPriority)
                .set(isOverwrite).equalTo(record::getIsOverwrite)
                .set(isRollbackOnFail).equalTo(record::getIsRollbackOnFail);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_insert_statement")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(MySqlInsertStatement record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalToWhenPresent(record::getOid)
                .set(hintsSize).equalToWhenPresent(record::getHintsSize)
                .set(isDelayed).equalToWhenPresent(record::getIsDelayed)
                .set(isFulltextDictionary).equalToWhenPresent(record::getIsFulltextDictionary)
                .set(isHighPriority).equalToWhenPresent(record::getIsHighPriority)
                .set(isIfNotExists).equalToWhenPresent(record::getIsIfNotExists)
                .set(isIgnore).equalToWhenPresent(record::getIsIgnore)
                .set(isLowPriority).equalToWhenPresent(record::getIsLowPriority)
                .set(isOverwrite).equalToWhenPresent(record::getIsOverwrite)
                .set(isRollbackOnFail).equalToWhenPresent(record::getIsRollbackOnFail);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_insert_statement")
    default int updateByPrimaryKey(MySqlInsertStatement record) {
        return update(c ->
            c.set(hintsSize).equalTo(record::getHintsSize)
            .set(isDelayed).equalTo(record::getIsDelayed)
            .set(isFulltextDictionary).equalTo(record::getIsFulltextDictionary)
            .set(isHighPriority).equalTo(record::getIsHighPriority)
            .set(isIfNotExists).equalTo(record::getIsIfNotExists)
            .set(isIgnore).equalTo(record::getIsIgnore)
            .set(isLowPriority).equalTo(record::getIsLowPriority)
            .set(isOverwrite).equalTo(record::getIsOverwrite)
            .set(isRollbackOnFail).equalTo(record::getIsRollbackOnFail)
            .where(oid, isEqualTo(record::getOid))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_insert_statement")
    default int updateByPrimaryKeySelective(MySqlInsertStatement record) {
        return update(c ->
            c.set(hintsSize).equalToWhenPresent(record::getHintsSize)
            .set(isDelayed).equalToWhenPresent(record::getIsDelayed)
            .set(isFulltextDictionary).equalToWhenPresent(record::getIsFulltextDictionary)
            .set(isHighPriority).equalToWhenPresent(record::getIsHighPriority)
            .set(isIfNotExists).equalToWhenPresent(record::getIsIfNotExists)
            .set(isIgnore).equalToWhenPresent(record::getIsIgnore)
            .set(isLowPriority).equalToWhenPresent(record::getIsLowPriority)
            .set(isOverwrite).equalToWhenPresent(record::getIsOverwrite)
            .set(isRollbackOnFail).equalToWhenPresent(record::getIsRollbackOnFail)
            .where(oid, isEqualTo(record::getOid))
        );
    }
}