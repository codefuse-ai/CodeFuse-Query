package com.alipay.codequery.dal.mybatis.mapper;

import static com.alipay.codequery.dal.mybatis.mapper.MySqlOptimizeStatementDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.alipay.codequery.dal.mybatis.domain.MySqlOptimizeStatement;
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
public interface MySqlOptimizeStatementMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_optimize_statement")
    BasicColumn[] selectList = BasicColumn.columnList(oid, isLocal, isNoWriteToBinlog);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_optimize_statement")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_optimize_statement")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_optimize_statement")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<MySqlOptimizeStatement> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_optimize_statement")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<MySqlOptimizeStatement> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_optimize_statement")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="is_local", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_no_write_to_binlog", javaType=Integer.class, jdbcType=JdbcType.BIGINT)
    })
    Optional<MySqlOptimizeStatement> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_optimize_statement")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="is_local", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_no_write_to_binlog", javaType=Integer.class, jdbcType=JdbcType.BIGINT)
    })
    List<MySqlOptimizeStatement> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_optimize_statement")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_optimize_statement")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, mySqlOptimizeStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_optimize_statement")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, mySqlOptimizeStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_optimize_statement")
    default int deleteByPrimaryKey(Long oid_) {
        return delete(c -> 
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_optimize_statement")
    default int insert(MySqlOptimizeStatement record) {
        return MyBatis3Utils.insert(this::insert, record, mySqlOptimizeStatement, c ->
            c.map(oid).toProperty("oid")
            .map(isLocal).toProperty("isLocal")
            .map(isNoWriteToBinlog).toProperty("isNoWriteToBinlog")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_optimize_statement")
    default int insertMultiple(Collection<MySqlOptimizeStatement> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, mySqlOptimizeStatement, c ->
            c.map(oid).toProperty("oid")
            .map(isLocal).toProperty("isLocal")
            .map(isNoWriteToBinlog).toProperty("isNoWriteToBinlog")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_optimize_statement")
    default int insertSelective(MySqlOptimizeStatement record) {
        return MyBatis3Utils.insert(this::insert, record, mySqlOptimizeStatement, c ->
            c.map(oid).toPropertyWhenPresent("oid", record::getOid)
            .map(isLocal).toPropertyWhenPresent("isLocal", record::getIsLocal)
            .map(isNoWriteToBinlog).toPropertyWhenPresent("isNoWriteToBinlog", record::getIsNoWriteToBinlog)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_optimize_statement")
    default Optional<MySqlOptimizeStatement> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, mySqlOptimizeStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_optimize_statement")
    default List<MySqlOptimizeStatement> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, mySqlOptimizeStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_optimize_statement")
    default List<MySqlOptimizeStatement> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, mySqlOptimizeStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_optimize_statement")
    default Optional<MySqlOptimizeStatement> selectByPrimaryKey(Long oid_) {
        return selectOne(c ->
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_optimize_statement")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, mySqlOptimizeStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_optimize_statement")
    static UpdateDSL<UpdateModel> updateAllColumns(MySqlOptimizeStatement record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalTo(record::getOid)
                .set(isLocal).equalTo(record::getIsLocal)
                .set(isNoWriteToBinlog).equalTo(record::getIsNoWriteToBinlog);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_optimize_statement")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(MySqlOptimizeStatement record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalToWhenPresent(record::getOid)
                .set(isLocal).equalToWhenPresent(record::getIsLocal)
                .set(isNoWriteToBinlog).equalToWhenPresent(record::getIsNoWriteToBinlog);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_optimize_statement")
    default int updateByPrimaryKey(MySqlOptimizeStatement record) {
        return update(c ->
            c.set(isLocal).equalTo(record::getIsLocal)
            .set(isNoWriteToBinlog).equalTo(record::getIsNoWriteToBinlog)
            .where(oid, isEqualTo(record::getOid))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_optimize_statement")
    default int updateByPrimaryKeySelective(MySqlOptimizeStatement record) {
        return update(c ->
            c.set(isLocal).equalToWhenPresent(record::getIsLocal)
            .set(isNoWriteToBinlog).equalToWhenPresent(record::getIsNoWriteToBinlog)
            .where(oid, isEqualTo(record::getOid))
        );
    }
}