package com.alipay.codequery.dal.mybatis.mapper;

import static com.alipay.codequery.dal.mybatis.mapper.MySqlCreateAddLogFileGroupStatementDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.alipay.codequery.dal.mybatis.domain.MySqlCreateAddLogFileGroupStatement;
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
public interface MySqlCreateAddLogFileGroupStatementMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_create_add_log_file_group_statement")
    BasicColumn[] selectList = BasicColumn.columnList(oid, addUndoFileOid, commentOid, engineOid, initialSizeOid, isWait, nameOid, nodeGroupOid, redoBufferSizeOid, undoBufferSizeOid);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_create_add_log_file_group_statement")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_create_add_log_file_group_statement")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_create_add_log_file_group_statement")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<MySqlCreateAddLogFileGroupStatement> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_create_add_log_file_group_statement")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<MySqlCreateAddLogFileGroupStatement> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_create_add_log_file_group_statement")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="add_undo_file_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="comment_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="engine_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="initial_size_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_wait", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="name_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="node_group_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="redo_buffer_size_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="undo_buffer_size_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT)
    })
    Optional<MySqlCreateAddLogFileGroupStatement> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_create_add_log_file_group_statement")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="add_undo_file_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="comment_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="engine_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="initial_size_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_wait", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="name_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="node_group_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="redo_buffer_size_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="undo_buffer_size_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT)
    })
    List<MySqlCreateAddLogFileGroupStatement> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_create_add_log_file_group_statement")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_create_add_log_file_group_statement")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, mySqlCreateAddLogFileGroupStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_create_add_log_file_group_statement")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, mySqlCreateAddLogFileGroupStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_create_add_log_file_group_statement")
    default int deleteByPrimaryKey(Long oid_) {
        return delete(c -> 
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_create_add_log_file_group_statement")
    default int insert(MySqlCreateAddLogFileGroupStatement record) {
        return MyBatis3Utils.insert(this::insert, record, mySqlCreateAddLogFileGroupStatement, c ->
            c.map(oid).toProperty("oid")
            .map(addUndoFileOid).toProperty("addUndoFileOid")
            .map(commentOid).toProperty("commentOid")
            .map(engineOid).toProperty("engineOid")
            .map(initialSizeOid).toProperty("initialSizeOid")
            .map(isWait).toProperty("isWait")
            .map(nameOid).toProperty("nameOid")
            .map(nodeGroupOid).toProperty("nodeGroupOid")
            .map(redoBufferSizeOid).toProperty("redoBufferSizeOid")
            .map(undoBufferSizeOid).toProperty("undoBufferSizeOid")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_create_add_log_file_group_statement")
    default int insertMultiple(Collection<MySqlCreateAddLogFileGroupStatement> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, mySqlCreateAddLogFileGroupStatement, c ->
            c.map(oid).toProperty("oid")
            .map(addUndoFileOid).toProperty("addUndoFileOid")
            .map(commentOid).toProperty("commentOid")
            .map(engineOid).toProperty("engineOid")
            .map(initialSizeOid).toProperty("initialSizeOid")
            .map(isWait).toProperty("isWait")
            .map(nameOid).toProperty("nameOid")
            .map(nodeGroupOid).toProperty("nodeGroupOid")
            .map(redoBufferSizeOid).toProperty("redoBufferSizeOid")
            .map(undoBufferSizeOid).toProperty("undoBufferSizeOid")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_create_add_log_file_group_statement")
    default int insertSelective(MySqlCreateAddLogFileGroupStatement record) {
        return MyBatis3Utils.insert(this::insert, record, mySqlCreateAddLogFileGroupStatement, c ->
            c.map(oid).toPropertyWhenPresent("oid", record::getOid)
            .map(addUndoFileOid).toPropertyWhenPresent("addUndoFileOid", record::getAddUndoFileOid)
            .map(commentOid).toPropertyWhenPresent("commentOid", record::getCommentOid)
            .map(engineOid).toPropertyWhenPresent("engineOid", record::getEngineOid)
            .map(initialSizeOid).toPropertyWhenPresent("initialSizeOid", record::getInitialSizeOid)
            .map(isWait).toPropertyWhenPresent("isWait", record::getIsWait)
            .map(nameOid).toPropertyWhenPresent("nameOid", record::getNameOid)
            .map(nodeGroupOid).toPropertyWhenPresent("nodeGroupOid", record::getNodeGroupOid)
            .map(redoBufferSizeOid).toPropertyWhenPresent("redoBufferSizeOid", record::getRedoBufferSizeOid)
            .map(undoBufferSizeOid).toPropertyWhenPresent("undoBufferSizeOid", record::getUndoBufferSizeOid)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_create_add_log_file_group_statement")
    default Optional<MySqlCreateAddLogFileGroupStatement> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, mySqlCreateAddLogFileGroupStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_create_add_log_file_group_statement")
    default List<MySqlCreateAddLogFileGroupStatement> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, mySqlCreateAddLogFileGroupStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_create_add_log_file_group_statement")
    default List<MySqlCreateAddLogFileGroupStatement> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, mySqlCreateAddLogFileGroupStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_create_add_log_file_group_statement")
    default Optional<MySqlCreateAddLogFileGroupStatement> selectByPrimaryKey(Long oid_) {
        return selectOne(c ->
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_create_add_log_file_group_statement")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, mySqlCreateAddLogFileGroupStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_create_add_log_file_group_statement")
    static UpdateDSL<UpdateModel> updateAllColumns(MySqlCreateAddLogFileGroupStatement record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalTo(record::getOid)
                .set(addUndoFileOid).equalTo(record::getAddUndoFileOid)
                .set(commentOid).equalTo(record::getCommentOid)
                .set(engineOid).equalTo(record::getEngineOid)
                .set(initialSizeOid).equalTo(record::getInitialSizeOid)
                .set(isWait).equalTo(record::getIsWait)
                .set(nameOid).equalTo(record::getNameOid)
                .set(nodeGroupOid).equalTo(record::getNodeGroupOid)
                .set(redoBufferSizeOid).equalTo(record::getRedoBufferSizeOid)
                .set(undoBufferSizeOid).equalTo(record::getUndoBufferSizeOid);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_create_add_log_file_group_statement")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(MySqlCreateAddLogFileGroupStatement record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalToWhenPresent(record::getOid)
                .set(addUndoFileOid).equalToWhenPresent(record::getAddUndoFileOid)
                .set(commentOid).equalToWhenPresent(record::getCommentOid)
                .set(engineOid).equalToWhenPresent(record::getEngineOid)
                .set(initialSizeOid).equalToWhenPresent(record::getInitialSizeOid)
                .set(isWait).equalToWhenPresent(record::getIsWait)
                .set(nameOid).equalToWhenPresent(record::getNameOid)
                .set(nodeGroupOid).equalToWhenPresent(record::getNodeGroupOid)
                .set(redoBufferSizeOid).equalToWhenPresent(record::getRedoBufferSizeOid)
                .set(undoBufferSizeOid).equalToWhenPresent(record::getUndoBufferSizeOid);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_create_add_log_file_group_statement")
    default int updateByPrimaryKey(MySqlCreateAddLogFileGroupStatement record) {
        return update(c ->
            c.set(addUndoFileOid).equalTo(record::getAddUndoFileOid)
            .set(commentOid).equalTo(record::getCommentOid)
            .set(engineOid).equalTo(record::getEngineOid)
            .set(initialSizeOid).equalTo(record::getInitialSizeOid)
            .set(isWait).equalTo(record::getIsWait)
            .set(nameOid).equalTo(record::getNameOid)
            .set(nodeGroupOid).equalTo(record::getNodeGroupOid)
            .set(redoBufferSizeOid).equalTo(record::getRedoBufferSizeOid)
            .set(undoBufferSizeOid).equalTo(record::getUndoBufferSizeOid)
            .where(oid, isEqualTo(record::getOid))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_create_add_log_file_group_statement")
    default int updateByPrimaryKeySelective(MySqlCreateAddLogFileGroupStatement record) {
        return update(c ->
            c.set(addUndoFileOid).equalToWhenPresent(record::getAddUndoFileOid)
            .set(commentOid).equalToWhenPresent(record::getCommentOid)
            .set(engineOid).equalToWhenPresent(record::getEngineOid)
            .set(initialSizeOid).equalToWhenPresent(record::getInitialSizeOid)
            .set(isWait).equalToWhenPresent(record::getIsWait)
            .set(nameOid).equalToWhenPresent(record::getNameOid)
            .set(nodeGroupOid).equalToWhenPresent(record::getNodeGroupOid)
            .set(redoBufferSizeOid).equalToWhenPresent(record::getRedoBufferSizeOid)
            .set(undoBufferSizeOid).equalToWhenPresent(record::getUndoBufferSizeOid)
            .where(oid, isEqualTo(record::getOid))
        );
    }
}