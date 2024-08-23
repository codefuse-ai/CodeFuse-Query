package com.alipay.codequery.dal.mybatis.mapper;

import static com.alipay.codequery.dal.mybatis.mapper.MySqlAlterLogFileGroupStatementDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.alipay.codequery.dal.mybatis.domain.MySqlAlterLogFileGroupStatement;
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
public interface MySqlAlterLogFileGroupStatementMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_alter_log_file_group_statement")
    BasicColumn[] selectList = BasicColumn.columnList(oid, addUndoFileOid, engineOid, initialSizeOid, isWait, nameOid);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_alter_log_file_group_statement")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_alter_log_file_group_statement")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_alter_log_file_group_statement")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<MySqlAlterLogFileGroupStatement> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_alter_log_file_group_statement")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<MySqlAlterLogFileGroupStatement> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_alter_log_file_group_statement")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="add_undo_file_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="engine_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="initial_size_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_wait", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="name_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT)
    })
    Optional<MySqlAlterLogFileGroupStatement> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_alter_log_file_group_statement")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="add_undo_file_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="engine_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="initial_size_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_wait", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="name_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT)
    })
    List<MySqlAlterLogFileGroupStatement> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_alter_log_file_group_statement")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_alter_log_file_group_statement")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, mySqlAlterLogFileGroupStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_alter_log_file_group_statement")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, mySqlAlterLogFileGroupStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_alter_log_file_group_statement")
    default int deleteByPrimaryKey(Long oid_) {
        return delete(c -> 
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_alter_log_file_group_statement")
    default int insert(MySqlAlterLogFileGroupStatement record) {
        return MyBatis3Utils.insert(this::insert, record, mySqlAlterLogFileGroupStatement, c ->
            c.map(oid).toProperty("oid")
            .map(addUndoFileOid).toProperty("addUndoFileOid")
            .map(engineOid).toProperty("engineOid")
            .map(initialSizeOid).toProperty("initialSizeOid")
            .map(isWait).toProperty("isWait")
            .map(nameOid).toProperty("nameOid")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_alter_log_file_group_statement")
    default int insertMultiple(Collection<MySqlAlterLogFileGroupStatement> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, mySqlAlterLogFileGroupStatement, c ->
            c.map(oid).toProperty("oid")
            .map(addUndoFileOid).toProperty("addUndoFileOid")
            .map(engineOid).toProperty("engineOid")
            .map(initialSizeOid).toProperty("initialSizeOid")
            .map(isWait).toProperty("isWait")
            .map(nameOid).toProperty("nameOid")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_alter_log_file_group_statement")
    default int insertSelective(MySqlAlterLogFileGroupStatement record) {
        return MyBatis3Utils.insert(this::insert, record, mySqlAlterLogFileGroupStatement, c ->
            c.map(oid).toPropertyWhenPresent("oid", record::getOid)
            .map(addUndoFileOid).toPropertyWhenPresent("addUndoFileOid", record::getAddUndoFileOid)
            .map(engineOid).toPropertyWhenPresent("engineOid", record::getEngineOid)
            .map(initialSizeOid).toPropertyWhenPresent("initialSizeOid", record::getInitialSizeOid)
            .map(isWait).toPropertyWhenPresent("isWait", record::getIsWait)
            .map(nameOid).toPropertyWhenPresent("nameOid", record::getNameOid)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_alter_log_file_group_statement")
    default Optional<MySqlAlterLogFileGroupStatement> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, mySqlAlterLogFileGroupStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_alter_log_file_group_statement")
    default List<MySqlAlterLogFileGroupStatement> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, mySqlAlterLogFileGroupStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_alter_log_file_group_statement")
    default List<MySqlAlterLogFileGroupStatement> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, mySqlAlterLogFileGroupStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_alter_log_file_group_statement")
    default Optional<MySqlAlterLogFileGroupStatement> selectByPrimaryKey(Long oid_) {
        return selectOne(c ->
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_alter_log_file_group_statement")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, mySqlAlterLogFileGroupStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_alter_log_file_group_statement")
    static UpdateDSL<UpdateModel> updateAllColumns(MySqlAlterLogFileGroupStatement record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalTo(record::getOid)
                .set(addUndoFileOid).equalTo(record::getAddUndoFileOid)
                .set(engineOid).equalTo(record::getEngineOid)
                .set(initialSizeOid).equalTo(record::getInitialSizeOid)
                .set(isWait).equalTo(record::getIsWait)
                .set(nameOid).equalTo(record::getNameOid);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_alter_log_file_group_statement")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(MySqlAlterLogFileGroupStatement record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalToWhenPresent(record::getOid)
                .set(addUndoFileOid).equalToWhenPresent(record::getAddUndoFileOid)
                .set(engineOid).equalToWhenPresent(record::getEngineOid)
                .set(initialSizeOid).equalToWhenPresent(record::getInitialSizeOid)
                .set(isWait).equalToWhenPresent(record::getIsWait)
                .set(nameOid).equalToWhenPresent(record::getNameOid);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_alter_log_file_group_statement")
    default int updateByPrimaryKey(MySqlAlterLogFileGroupStatement record) {
        return update(c ->
            c.set(addUndoFileOid).equalTo(record::getAddUndoFileOid)
            .set(engineOid).equalTo(record::getEngineOid)
            .set(initialSizeOid).equalTo(record::getInitialSizeOid)
            .set(isWait).equalTo(record::getIsWait)
            .set(nameOid).equalTo(record::getNameOid)
            .where(oid, isEqualTo(record::getOid))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_alter_log_file_group_statement")
    default int updateByPrimaryKeySelective(MySqlAlterLogFileGroupStatement record) {
        return update(c ->
            c.set(addUndoFileOid).equalToWhenPresent(record::getAddUndoFileOid)
            .set(engineOid).equalToWhenPresent(record::getEngineOid)
            .set(initialSizeOid).equalToWhenPresent(record::getInitialSizeOid)
            .set(isWait).equalToWhenPresent(record::getIsWait)
            .set(nameOid).equalToWhenPresent(record::getNameOid)
            .where(oid, isEqualTo(record::getOid))
        );
    }
}